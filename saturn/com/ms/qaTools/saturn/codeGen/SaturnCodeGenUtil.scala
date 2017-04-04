package com.ms.qaTools.saturn.codeGen

import java.io.File
import java.util.{List => JList}

import scala.annotation.tailrec
import scala.collection.JavaConversions._
import scala.reflect.internal.util.BatchSourceFile
import scala.tools.nsc.Global
import scala.tools.nsc.Settings
import scala.tools.nsc.reporters.ConsoleReporter
import scala.util.Try

import org.apache.commons.io.FileUtils
import org.eclipse.emf.ecore.EObject

import com.ms.qaTools.CompilerClassLoader
import com.ms.qaTools.ecore.utils.ECoreStringUtils
import com.ms.qaTools.io.DirIO
import com.ms.qaTools.io.FileIO
import com.ms.qaTools.saturn.{AbstractLink => MAbstractLink}
import com.ms.qaTools.saturn.{AbstractRunGroup => MAbstractRunGroup}
import com.ms.qaTools.saturn.{AbstractStep => MStep}
import com.ms.qaTools.saturn.DocumentRoot
import com.ms.qaTools.saturn.{IncludeFile => MIncludeFile}
import com.ms.qaTools.saturn.ResourceParameter
import com.ms.qaTools.saturn.{RunGroup => MRunGroup}
import com.ms.qaTools.saturn.{Saturn => MSaturn}
import com.ms.qaTools.saturn.annotations.saturnVerbosity.SaturnVerbosityConfiguration
import com.ms.qaTools.saturn.annotations.saturnWeb.{SaturnWebConfiguration => MSaturnWebConfiguration}
import com.ms.qaTools.saturn.dsl.SaturnDeserializer
import com.ms.qaTools.saturn.modules.procedureCallModule.ResourceArgument
import com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration
import com.ms.qaTools.saturn.runtime.SaturnResultContext
import com.ms.qaTools.saturn.types.{AbstractAnnotation => MAbstractAnnotation}
import com.ms.qaTools.saturn.types.AbstractRepetitionHandler
import com.ms.qaTools.saturn.types.NamedResourceDefinition
import com.ms.qaTools.saturn.types.ResourceDefinition
import com.ms.qaTools.saturn.utils.SaturnEObjectUtils.SaturnEObjectHelper

object SaturnCodeGenUtil {
  def createFromFileName(saturnFileName:String):Try[SaturnCodeGenUtil] = for {
    saturn             <- SaturnDeserializer.deserialize(saturnFileName.toUri).recoverWith { case t => Try { throw new Error(s"As error occurred while parsing saturn file: '$saturnFileName'.", t) } }
    includeFiles       <- Try { SaturnDeserializer.extractAllIncludeFiles(saturn) }
    saturnFullFileName <- Try { new java.io.File(saturnFileName).getAbsolutePath }
    includeFileMap     <- Try { SaturnDeserializer.genIncludeFileMap(includeFiles, SaturnDeserializer.extractPath(saturnFullFileName)) }
  } yield SaturnCodeGenUtil(saturn, includeFileMap, saturnFileName = Option(saturnFullFileName))

  def setUpClassPath(s: Settings, cl: ClassLoader = Thread.currentThread.getContextClassLoader): Unit = cl match {
    case cl: org.apache.tools.ant.AntClassLoader => s.bootclasspath.append(cl.getClasspath)
    case _                                       =>
      s.usejavacp.value = true
      s.embeddedDefaults(new CompilerClassLoader(cl))
  }
}

case class SaturnCodeGenUtil(saturn:MSaturn,
                             includeFileMap:Map[MIncludeFile, (MSaturn, String)] = Map.empty,
                             isImported: Boolean = false,
                             saturnFileName: Option[String] = None,
                             saturnAsJarResource: Boolean = true) {
  val includeFiles:Set[MSaturn] = includeFileMap.values.map(_._1).toSet
  val saturnEObjects = includeFiles + saturn
  lazy val allLinks:Seq[MAbstractLink] = saturnEObjects.flatMap{_.getLinks}.toSeq

  lazy val wrappedRunGroups: Map[MAbstractRunGroup, WrappedAbstractRunGroup] = saturnEObjects.flatMap { saturn =>
    val canRunExpressionGenerator = CanRunExpressionGenerator(saturn)
    (saturn :: saturn.eAllContents().toList).collect {
      case group: MRunGroup => (group, WrappedRunGroup(group, canRunExpressionGenerator.getCanRunExpression(group), allLinks, includeFileMap))
      case step: MStep      => (step, WrappedStep(step, canRunExpressionGenerator.getCanRunExpression(step), allLinks, includeFileMap))
    }
  }.toMap

  def getIncludeFileFullFileName(includeFile: MSaturn) = {
    includeFileMap.find{case (i,s) => s._1 == includeFile} match {
      case Some(x) => x._2._2
      case None => throw new Exception("Include file not found: " + includeFile)
    }
  }
  
  def copySaturnFiles(outDir: DirIO) = {
    saturnFileName.foreach(f => 
      FileUtils.copyFile(new File(f), new File((outDir + FileIO(wrappedRunGroups(saturn).getClassName + ".saturn")).fileName))
    )
    includeFileMap.foreach{case (_, (saturn, fileName)) => 
      FileUtils.copyFile(new File(fileName), new File((outDir + FileIO(wrappedRunGroups(saturn).getClassName + ".saturn")).fileName))
    }
  }

  def getIncludeFiles:Set[MSaturn] = includeFiles
  def getIncludeFileSaturn(includeFile:MIncludeFile):MSaturn = includeFileMap(includeFile)._1
//  def getLinks(g:MAbstractRunGroup) = allLinks.filter{_.getTarget() == g}
  def getIncludeFileCodeGenUtil(includeFile:MIncludeFile):SaturnCodeGenUtil = SaturnCodeGenUtil(getIncludeFileSaturn(includeFile), includeFileMap, true)
  def getIncludeFileCodeGenUtil(includeFileSaturn:MSaturn):SaturnCodeGenUtil = SaturnCodeGenUtil(includeFileSaturn, includeFileMap, true)

  implicit def getWrapped(runGroup:MAbstractRunGroup):WrappedAbstractRunGroup= wrappedRunGroups(runGroup)

  def getRunGroupByName(fullName:String):MAbstractRunGroup = {
    val fullNameParts = fullName.split("\\.")
    fullNameParts.foldLeft[MAbstractRunGroup](saturn){(o,n) =>
        o match {
          case rg:MRunGroup => {
            val runGroups:Seq[MAbstractRunGroup] = rg.getRunGroups()
            val runGroup:MAbstractRunGroup = runGroups.find(_.getName() == n) match {
              case Some(f) => f
              case _       => throw new Exception("Could not find runGroup: '" + fullName + "'")
            }
            runGroup
          }
          case _           => throw new Exception("Could not find runGroup: '" + fullName + "'")
        }
      }
  }

  def getLinkSatisfied(l:MAbstractLink) = l.getSource().getName() + "2" + l.getTarget().getName() + "Satisfied"
  def getLinkName(l:MAbstractLink) = l.getSource().getName()
  def getLinkResultName(l:MAbstractLink) = getLinkName(l) + "Result"

  def getAnnotations():JList[MAbstractAnnotation] = (for(annotation @(a:MAbstractAnnotation) <- (saturn :: saturn.eAllContents.toList)) yield annotation).toList
  def getWebAnnotations():JList[MSaturnWebConfiguration] = (for(annotation @(a:MSaturnWebConfiguration) <- (saturn :: saturn.eAllContents.toList)) yield annotation).toList
  def getRunGroupsWithJUnitAnnotations(saturn: MSaturn):Seq[MAbstractRunGroup] = (Iterator(saturn) ++ saturn.eAllContents()).collect{case rg: MAbstractRunGroup => rg}.filter{rg => !rg.getJUnitAnnotations.isEmpty}.toSeq

  def sortRunGroups(runGroups:Seq[MAbstractRunGroup]):Try[List[MAbstractRunGroup]] = Try {
    val dependencies = allLinks.filter{link => runGroups.contains(link.getSource()) && runGroups.contains(link.getTarget())}.map{link => (link.getSource, link.getTarget)}.toSet

    @tailrec
    def _sortRunGroups(rr:List[MAbstractRunGroup], dd:Set[(MAbstractRunGroup, MAbstractRunGroup)], soFar:List[MAbstractRunGroup]=Nil):List[MAbstractRunGroup] = {
      if(rr.isEmpty) soFar
      else {
        val(in,out) = rr.partition{r => !dd.exists{d => d._1 == r} }
        if(in.isEmpty) throw new Exception("RunGroups contain circular dependency(ies).")
        _sortRunGroups(out, dd.filter{d => !in.contains(d._2)}, in:::soFar)
      }
    }
    _sortRunGroups(runGroups.toList, dependencies)
  }

  def getXmlGenInputResource(cfg:XmlGenConfiguration):ResourceDefinition = {
    val dataSets = cfg.getDataSets()
    if(!dataSets.isEmpty()) dataSets.get(0).getFile()
    else null
  }

  def getParentResultContextName(eObject: EObject): String = eObject.eContainer() match {
    case null => throw new Exception("Could not get parent context for:" + eObject)
    case r:NamedResourceDefinition => r.getResultContextName
    case r:MAbstractRunGroup        => {
      val wrapped = getWrapped(r)
      val preIterationObjects = wrapped.getPreIterationObjects
      //To review for included files
      //all pre-iteration object (attributes + resources) that are not include files
      /*
       * PRE? RH? INCL? OR/ON
       * T    T   T     OR
       * T    T   F     OR
       * T    F   T     OR
       * T    F   F     ON **
       * F    T   T     OR
       * F    T   F     ON **
       * F    F   T     OR
       * F    F   F     ON **
       */
      if(includeFiles.toSet[MAbstractRunGroup](r)) wrapped.getClassName
      else if(preIterationObjects.contains(eObject) &&  r.getRepetitionHandler() != null) wrapped.getClassName
      else wrapped.getIterationClassName
    }
    case rph: AbstractRepetitionHandler => {
      rph.eContainer() match {
        case r: MAbstractRunGroup => getWrapped(r).getClassName
        case _ => throw new Exception("Parent of a repetition handler is not an abstractRunGroup??")
      }
    }
    case resParm: ResourceParameter => {
      //Not ideal, context name should be the one from the caller
      getParentResultContextName(resParm.eContainer)
    }
    case resParm: ResourceArgument => {
      //Not ideal, context name should be the one from the caller
      getParentResultContextName(resParm.eContainer)
    }
    case documentRoot: DocumentRoot => {
      // for resources defined in a forEach/forEachXPath root level
      getWrapped(documentRoot.getSaturn).getClassName
    }

    case e: EObject => e.eContainer match {
      case s: MSaturn => getParentResultContextName(e)
      // correct rc name for a resource defined inlined e.g. config file for xml2csv
      case r: NamedResourceDefinition => getParentResultContextName(r)
      case r         => getParentResultContextName(e)
    }
  }

  def getHexHashCode(o:Any) = Integer.toHexString(o.hashCode)
  def generateResourceAlias(rg: MAbstractRunGroup): String = generateResourceAlias(wrappedRunGroups(rg))
  def generateResourceAlias(rg: WrappedAbstractRunGroup): String = "resources/saturn/" + rg.getClassName + ".saturn"
  def getConsoleOutputAnnotation(rg: MAbstractRunGroup): String = {
    val verbosity = for {
      a <- rg.getAnnotations()
      if a.eClass.getName == "SaturnVerbosityConfiguration"
    } yield {
      val b = a.asInstanceOf[SaturnVerbosityConfiguration]
      b.getVerbosity.getName
    }
    if(verbosity.isEmpty) "" else verbosity.head
  }

  def getDefaultIterationNo(runGroup: MAbstractRunGroup) = if(runGroup.getRepetitionHandler == null) "0" else "iterationNo"

  protected[codeGen] lazy val compiler: Global = {
    val settings = new Settings
    SaturnCodeGenUtil.setUpClassPath(settings)
    Global(settings, new ConsoleReporter(settings))
  }

  def parseScala(code: String): (compiler.Tree, compiler.analyzer.Context) = compiler.synchronized {
    import compiler._
    val wrappedCode = s"${SaturnImports().get}\nobject wrapper {\n$code\n}"
    val unit = new CompilationUnit(new BatchSourceFile("<SaturnCodeGenUtil-parseScala>", wrappedCode))
    val run = new Run
    phase = run.parserPhase
    val parsedTree = new syntaxAnalyzer.UnitParser(unit).parse()
    phase = run.namerPhase
    val context = analyzer.newNamer(analyzer.rootContext(unit)).enterSym(parsedTree)
    phase = run.typerPhase
    analyzer.resetTyper()
    undoLog.clear()
    val typedTree = analyzer.newTyper(context).typed(parsedTree)
    if (reporter.hasErrors) {
      reporter.reset()
      throw new IllegalArgumentException(code)
    }
    val PackageDef(_, imports :+ ModuleDef(_, _, Template(_, _, _ :: parsed))) = typedTree
    val tree = parsed match {
      case expr :: Nil   => expr
      case stats :+ expr => Block(stats, expr)
    }
    //(tree, (context /: imports)((c, i) => c.makeNewImport(i.asInstanceOf[Import])))
    (tree, (context /: imports)((c, i) => c.make(i.asInstanceOf[Import])))
  }
}

class SaturnResultContextWrapper(val rc: SaturnResultContext)
object SaturnResultContextWrapper {
  def apply(rc: SaturnResultContext) = new SaturnResultContextWrapper(rc)
}
