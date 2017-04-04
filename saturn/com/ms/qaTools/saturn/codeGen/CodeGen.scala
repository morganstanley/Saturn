package com.ms.qaTools.saturn.codeGen

import scala.collection.JavaConversions._
import scala.util.Failure
import scala.util.Success
import scala.util.Try
import scala.util.matching.Regex.Match

import org.apache.commons.io.IOUtils
import org.apache.commons.io.FileUtils
import org.apache.commons.lang.StringEscapeUtils.escapeJava
import org.eclipse.emf.ecore.EObject
import org.kohsuke.args4j.{Option => AOption}

import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.TryUtil
import com.ms.qaTools.codeGen.scala._
import com.ms.qaTools.exceptions.AggregateException
import com.ms.qaTools.io.BaseFileIO
import com.ms.qaTools.io.DirIO
import com.ms.qaTools.io.FileIO
import com.ms.qaTools.io.StandardIO
import com.ms.qaTools.saturn.AbstractParameter
import com.ms.qaTools.saturn.{AbstractRunGroup => MAbstractRunGroup}
import com.ms.qaTools.saturn.{AbstractStep => MAbstractStep}
import com.ms.qaTools.saturn.AttributeParameter
import com.ms.qaTools.saturn.{CustomLink => MCustomLink}
import com.ms.qaTools.saturn.KronusStep
import com.ms.qaTools.saturn.ResourceParameter
import com.ms.qaTools.saturn.{RunGroup => MRunGroup}
import com.ms.qaTools.saturn.{Saturn => MSaturn}
import com.ms.qaTools.saturn.annotations.saturnReport.{SaturnReportConfiguration => MReportAnnotation}
import com.ms.qaTools.saturn.annotations.saturnReport.{SaturnReportConfiguration => MSaturnReportConfiguration}
import com.ms.qaTools.saturn.annotations.saturnVerbosity.{SaturnVerbosityConfiguration => MVerbosityAnnotation}
import com.ms.qaTools.saturn.annotations.saturnWeb.{AbstractSourceDefinition => MAbstractSourceDefinition}
import com.ms.qaTools.saturn.annotations.saturnWeb.{TextSourceDefinition => MTextSourceDefinition}
import com.ms.qaTools.saturn.annotations.saturnWeb.{FileSelectorSourceDefinition => MFileSelectorSourceDefinition}
import com.ms.qaTools.saturn.annotations.saturnWeb.{SaturnWebConfiguration => MSaturnWebConfiguration}
import com.ms.qaTools.saturn.annotations.saturnWeb.{SingleValueEnvVarTargetDefinition => MSingleValueEnvVarTargetDefinition}
import com.ms.qaTools.saturn.cmdLine.SaturnFile
import com.ms.qaTools.saturn.kronus.Backport
import com.ms.qaTools.saturn.kronus.Implicit
import com.ms.qaTools.saturn.lint.SaturnLintResult
import com.ms.qaTools.saturn.lint.SaturnLintRunner
import com.ms.qaTools.saturn.listeners.{ScenarioReportListener => MScenarioReportListener}
import com.ms.qaTools.saturn.repetition.{ForEachRepetition => MForEachRepetition}
import com.ms.qaTools.saturn.repetition.{ForEachXPathRepetition => MForEachXPathRepetition}
import com.ms.qaTools.saturn.repetition.{ForRepetition => MForRepetition}
import com.ms.qaTools.saturn.types.{AbstractRepetitionHandler => MAbstractRepetitionHandler}
import com.ms.qaTools.saturn.utils.SaturnEObjectUtils.SaturnEObjectHelper
import com.ms.qaTools.toolkit.Result
import com.ms.qaTools.toolkit.NotRun
import com.ms.qaTools.toolkit.ToolkitApp
import com.ms.qaTools.toolkit.cmdLine.BasicCmdLine
import com.ms.qaTools.codeGen.scala.ForCondition
import com.ms.qaTools.codeGen.scala.FutureExpr
import com.ms.qaTools.codeGen.scala._
import com.ms.qaTools.saturn.Saturn
import com.ms.qaTools.saturn.dsl.annotation.ALMMapping
import com.ms.qaTools.saturn.listeners.{ScenarioReportListener => MScenarioReportListener}
import com.ms.qaTools.saturn.repetition.{ForRepetition => MForRepetition}
import com.ms.qaTools.saturn.repetition.{ForEachRepetition => MForEachRepetition}
import com.ms.qaTools.saturn.repetition.{ForEachXPathRepetition => MForEachXPathRepetition}
import com.ms.qaTools.saturn.annotations.saturnReport.{SaturnReportConfiguration => MSaturnReportConfiguration}
import com.ms.qaTools.saturn.SaturnPackage

import java.io.File

case class AbstractStepLogicGenerator(step: MAbstractStep)(implicit codeGenUtil: SaturnCodeGenUtil) extends FutureGen {
  override def generate = Try { s"""Future{println(s"${step.getName}"); "${step.getName}"}.map{result => Try{IterationResult(Passed(), context, Nil, result.toString)}}""" }
}

object NonProcedureGenerator {
  def apply(nonProcedure:MAbstractRunGroup)(implicit codeGenUtil:SaturnCodeGenUtil):Try[ScalaGen] = {
    import codeGenUtil.getWrapped
    for {  
      nonProcedureLogicGen <- AbstractRunGroupGenerator(nonProcedure)
    } yield new ScalaGen() {
      def generate:Try[String] = for {
        procedureLogicStr <- nonProcedureLogicGen.generate()
      } yield s"val ${nonProcedure.getName}Future:Future[Try[IteratorResult[${nonProcedure.getResultClassName()}]]] = $procedureLogicStr"
    }
  }  
}

class ProcedureGenerator(procedure: MAbstractRunGroup)(implicit codeGenUtil: SaturnCodeGenUtil) extends ScalaGen {
  import ParameterTypeInferencer._

  require(procedure.isProcedure)

  val wrappedProc = codeGenUtil.getWrapped(procedure)
  val kronusCodeGen = KronusCodeGen(Backport())

  val valueParams: Seq[(String, TypeTree, Option[TryGen])] = procedure.getParameters.map { p =>
    val name = p.getName
    val typ = wrappedProc.typeInferencer.getParameterType(p)
    val default = if (p.isIsMandatory) None else {
      val tryGen = p match {
        case attr: AttributeParameter => ComplexValueStringGenerator(attr.getDefaultValue)
        case res: ResourceParameter   => ResourceGenerator(res.getDefaultResource)
      }
      Some {
        tryGen.map {
          _.withRethrow(s"An exception occurred while evaluating procedure '${procedure.getName}' default argument:'$name'.")
        }.getOrElse {
          throw new Exception(s"An exception occurred while creating Scala generator for a parameter's ($name) default value.")
        }
      }
    }
    (name, typ, default)
  }

  val typeParamRename: Map[TypeParameter, TypeParameter] = {
    valueParams.flatMap(_._2.collect {case x: TypeParameter => x}).toSet[TypeParameter].iterator.zipWithIndex.map {
      case (from, i) => from -> from.copy(name = s"__A$i")
    }.toMap
  }

  def generate() = {
    val tparams = {
      val tps = typeParamRename.values.map(_.name)
      if (tps.isEmpty) "" else tps.mkString("[", ", ", "]")
    }
    val implicits = genImplicits.zipWithIndex.map {case (x, i) => s"__implicitParam$i: $x"} match {
      case Seq() => ""
      case xs    => xs.mkString("(implicit ", ", ", ")")
    }
    val retType = s"Future[Try[IteratorResult[${wrappedProc.getResultClassName}]]]"
    for {
      vparams <- valueParams.map {
        case (name, typ, None) =>
          Success(s"$name: ${typ.mapTypeParams(typeParamRename)}")
        case (name, typ, Some(default)) =>
          default.generate().map(d => s"$name: ${typ.mapTypeParams(typeParamRename)} = $d.get")
      }.toTrySeq.map(_.mkString("(", ", ", ")"))
      procedureLogicGen <- AbstractRunGroupGenerator(procedure)
      procedureLogicStr <- procedureLogicGen.generate()
    } yield s"def ${procedure.getName}$tparams$vparams$implicits: $retType = $procedureLogicStr"
  }

  def genImplicits: Seq[TypeTree] = {
    val implicits = for {
      k <- procedure.eAllContents.collect {case k: KronusStep => k}
      call = k.getKronusCallConfiguration
      fdef = Backport().stepDefs(call.getDef)
      implicits = fdef.hashtags.collect {case i: Implicit => i} if implicits.nonEmpty
      tparams = fdef.getTypeParameters.map(_.getName)
      argTyps = call.getArguments.map(arg => arg.getName -> getArgumentType(arg)).toMap
      paramTyps = fdef.getParameterDefs.map(pdef => pdef.getName -> kronusCodeGen.genTypeInstance(pdef.getType, fdef, k))
      reifiedTparams = tparams.flatMap { tparam =>
        def hasTparam(typ: TypeTree) = typ.exists {
          case TypeParameter(name, _) if name == tparam => true
          case _                                        => false
        }
        paramTyps.collect {
          case (name, paramT) if hasTparam(paramT) && !hasTparam(argTyps(name)) =>
            tparam-> paramT.reifyTypeParam(tparam, argTyps(name))
        }
      }.toMap
      i <- implicits.map { i =>
        TypeTree(i.paramType, tparams.toSet, Some(TypeParameterOwner(k))).mapTypeParams {
          case tp if reifiedTparams.contains(tp.name) => reifiedTparams(tp.name)
          case tp                                     => typeParamRename(tp)
        }
      }
    } yield i
    implicits.toSeq
  }
}

object ProcedureGenerator {
  def apply(procedure:MAbstractRunGroup)(implicit codeGenUtil:SaturnCodeGenUtil):Try[ScalaGen] =
    Try(new ProcedureGenerator(procedure))
}

object AbstractRunGroupGenerator {
  def apply(runGroup: MAbstractRunGroup)(implicit codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] = {
    import codeGenUtil.getWrapped
    val resultClass = runGroup.getResultClassName()    
    val (repetitionHandler, postIterationObjects) =
      if (runGroup.isEnabled)
        (Option(runGroup.getRepetitionHandler), runGroup.getPostIterationObjects.toSeq)
      else
        (None, Nil)
    for {
      logicGen <- if (runGroup.isEnabled())
       StepLogicGenerator(runGroup)
      else
        Try { FutureExpr(TryExpr(ScalaExpr(s"""IterationResult(Passed(), context,  iterationMetaData, TerminalResult(None, false),0)"""))) }
      iterationGen <- generateRepetitionHandler(runGroup, resultClass, repetitionHandler, postIterationObjects, logicGen)
      iteratorGen <- generatePreIterationObjects(runGroup, iterationGen)
      runGroupDependencyGen <- generateRunGroupDependencies(runGroup, iteratorGen)
      notifiersGen <- generateRunGroupNotifiers(runGroup)
      parentContext <- Try{if (runGroup.getParentRunGroup(Option(runGroup.eContainer())) == None) "None" else "Some(context)" }
    } yield new FutureGen() {
      override def generate: Try[String] = {
        for {
          notifiersStr <- notifiersGen.generate
          runGroupDependencyStr <- runGroupDependencyGen.generate
        } yield {
          s"""{
  val name = "${runGroup.getName}" //"${runGroup.getFullName()}"
  $notifiersStr
  val __tmpContext = IteratorContext(name, $parentContext)
  val __iterationResult = {
    val context = __tmpContext
    val ffti:Future[Future[Try[IteratorResult[$resultClass]]]] = $runGroupDependencyStr
    handleRunGroupIteratorAndAnnotations[${runGroup.getResultClassName}](context, ffti) // ${runGroup.getRunGroupName} Iterator    
  }
  __iterationResult
  
}"""
        }
      }
    }
  }
 
  def generateRunGroupNotifiers(runGroup: MAbstractRunGroup)(implicit codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] = {
    import codeGenUtil.getWrapped
    Success {
      new FutureGen {
        override def generate: Try[String] = {
          for {
            scenarioListenerNotifier <- Try {
              runGroup match {
                case saturn: MSaturn => saturn.getListeners() collectFirst { case l: MScenarioReportListener => l } map (_ => "ScenarioReportListenerNotifier") getOrElse ("")
                case _               => ""
              }
            }
            scenarioReportNotifier <- Try {
              if (runGroup.getAnnotations().collect { case a: MReportAnnotation => a }.exists(s => s.isEnabled && s.isIsScenario && !s.isIgnored))
                s"ScenarioReportNotifier[${runGroup.getResultClassName}]()"
              else
                ""
            }
            consoleNotifier <- Try { s"${runGroup.getNotifierBaseClassName}ConsoleNotifier" }
          } yield {
            val notifiers = Seq(consoleNotifier, scenarioReportNotifier, scenarioListenerNotifier,
                                s"ConstellationNotifier[${runGroup.getResultClassName}]()").filterNot(_.isEmpty).mkString(",")
            s"""implicit val notifiers: Seq[Notifier[${runGroup.getResultClassName}]] = Seq($notifiers)"""
          }

        }
      }
    }
  }
  
  def generateSaturnListeners(saturn: MSaturn) = {
    for{
      scenarioReportListener <- saturn.getListeners.collect{case r: MScenarioReportListener => r}
    }
    saturn.getListeners.collect{case r: MScenarioReportListener => r}.headOption.map(_.getOutput())
  }

  def generateCanRun(runGroup: MAbstractRunGroup)(implicit codeGenUtil: SaturnCodeGenUtil): Try[ScalaGen] = {
    import codeGenUtil.getWrapped

    def genCustomLink(link: MCustomLink) = {
      ComplexValueCodeGenerator(link.getCode) map { codeGen =>
        val linkName = runGroup.getLinkSatisfied(link)
        val sourceLC = CanRunExpressionGenerator.getLinkName(link)
        val source = link.getSource.getName
        new ScalaGen {
          override def generate(): Try[String] = for {
            code <- codeGen.generate
          } yield {
            s"""val $linkName = (for {
                  $source <- $sourceLC filter (!_.status.notRun)
                  result <- {$code}
                } yield {
                  BoolDepth(result, $source.depth)
                }).getOrElse(FalseDepth())"""
          }
        }
      }
    }

    val customLinks = (runGroup.dependencies collect { case l: MCustomLink if (l.getTarget == runGroup) => l } map genCustomLink).toTrySeq
    customLinks map { customLinksGen =>
      new ScalaGen {
        def generate(): Try[String] = {
          customLinksGen.map(_.generate).toTrySeq map { customLinkStrs =>
            s"""{${customLinkStrs mkString ("\n")}
                 ${runGroup.canRunYieldExpression}}"""
          }
        }
      }
    }
  }
  
  def generateRunGroupDependencies(runGroup: MAbstractRunGroup, yieldExpr:ScalaGen)(implicit codeGenUtil: SaturnCodeGenUtil):Try[FutureGen] = {
    import codeGenUtil.getWrapped

    for {  
      dependencyAssignments <- Try{runGroup.getDependencyRunGroups.toSeq.map { runGroup =>
        ForAssignment(CanRunExpressionGenerator.getLinkName(runGroup), FutureFnExpr(s"${runGroup.getName}Future"))
      }}
      canRun                <- generateCanRun(runGroup)
      canRunExpr            <- Try{if(dependencyAssignments.isEmpty) Nil else Seq(
          ForAssignmentEq("canRunAndDepth", canRun),
          ForCondition(ScalaExpr("canRunAndDepth.value")))}
    } yield ForFutureExpr(dependencyAssignments ++ canRunExpr, yieldExpr)
  }

  def generateIteratorMetaData(runGroup: MAbstractRunGroup)(implicit codeGenUtil: SaturnCodeGenUtil): Try[ForAssignment] = {
    import codeGenUtil.getWrapped
    for {
      annotations <- Try { runGroup.getAnnotations.collect { case a: MReportAnnotation => a }.toSeq}
      scenarioAnnotations <- annotations.map{ScenarioAnnotationGenerator(_, false)}.toTrySeq
      almMappings = ALMMapping.fromRunGroupID(runGroup.getId).map(x => TryExpr(x.toCode))
      verbosityConfigs <- Try { runGroup.getAnnotations.collect { case a:MVerbosityAnnotation if a.isEnabled => a }.toSeq }
      verbosityAnnotations <- verbosityConfigs.map { VerbosityAnnotationGenerator(_) }.toTrySeq
      htmlGenerator <- Try { TryExpr(s"HtmlGenerator.${runGroup.getNotifierBaseClassName}_HtmlGenerator") }
      hasRepetitionHandlerForAssignment <- Try {
									        runGroup.getRepetitionHandler match {
									          case s: MForRepetition => Seq(TryExpr("ForRepetitionHandler"))
									          case s: MForEachRepetition => Seq(TryExpr("ForEachRepetitionHandler"))
									          case s: MForEachXPathRepetition => Seq(TryExpr("ForEachXPathRepetitionHandler"))
									          case _ => Nil
									        }
									      }
										  
    } yield ForAssignment("iteratorMetaData", SeqTryExpr(Seq(htmlGenerator) ++ hasRepetitionHandlerForAssignment ++
                                                         scenarioAnnotations ++ almMappings ++
                                                         verbosityAnnotations, Some("Any")).toTryGen)
    
  }

  def generateIterationMetaData(runGroup: MAbstractRunGroup)(implicit codeGenUtil: SaturnCodeGenUtil): Try[ForAssignment] = {
    import codeGenUtil.getWrapped
    for {
      scenarioReportConfigs <- Try { runGroup.getAnnotations.collect { case a:MReportAnnotation if a.isEnabled => a }.toSeq }.rethrow("scenario configs")
      scenarioAnnotations <- scenarioReportConfigs.map { ScenarioAnnotationGenerator(_, true) }.toTrySeq.rethrow("scenario annotations")
      verbosityConfigs <- Try { runGroup.getAnnotations.collect { case a:MVerbosityAnnotation if a.isEnabled => a }.toSeq }.rethrow("verbsoity configs")
      verbosityAnnotations <- verbosityConfigs.map { VerbosityAnnotationGenerator(_) }.toTrySeq.rethrow("verbosity annotations")

      hasRepetitionHandlerForAssignment <- Try {
									        runGroup.getRepetitionHandler match {
									          case s: MForRepetition => Seq(TryExpr("ForRepetitionHandler"))
									          case s: MForEachRepetition => Seq(TryExpr("ForEachRepetitionHandler"))
									          case s: MForEachXPathRepetition => Seq(TryExpr("ForEachXPathRepetitionHandler"))
									          case _ => Nil
									        }
									      }.rethrow("repetitionhandler")
										  
    } yield ForAssignment("iterationMetaData", SeqTryExpr(hasRepetitionHandlerForAssignment ++ 
                                                          scenarioAnnotations ++ 
                                                          verbosityAnnotations, Some("Any")).toTryGen)
  }
  
  def generatePreIterationObjects(runGroup: MAbstractRunGroup, yieldExpr:ScalaGen)(implicit codeGenUtil: SaturnCodeGenUtil):Try[TryGen] = {
    import codeGenUtil.getWrapped
    for {
      preIterObjects     <- Try {
        val scenarioReportListener = Option(runGroup) collect { case saturn: MSaturn => saturn } flatMap { _.getListeners() collectFirst { case l: MScenarioReportListener => l } }
        if (runGroup.isEnabled())
          runGroup.getIncludeFiles() ++ runGroup.getPreIterationObjectsWithRepetitionHandler ++ scenarioReportListener
        else
          Nil
      }
      preIterAssignments <- preIterObjects.map{eObject => IterationObjectGenerator(eObject)}.toTrySeq
      metaDataAssignment <- generateIteratorMetaData(runGroup) 
    } 
    yield new TryGen() {
       val iteratorResultGen = ForTryExpr(preIterAssignments ++ Seq(metaDataAssignment), yieldExpr)
       override def generate:Try[String] = iteratorResultGen.generate().map{ iteratorResultStr => s"""{
         |  val iteratorResult = $iteratorResultStr
         |  tf2ft[IteratorResult[${runGroup.getResultClassName}]](rethrow(iteratorResult, s"An exception occurred while running pre iteration objects for runGroup: ${runGroup.getFullName()}."))
         |}""".stripMargin
       }
    }
  }
  
  def generateRepetitionHandlerRows(repetitionHandler: MAbstractRepetitionHandler)(implicit codeGenUtil: SaturnCodeGenUtil): ForAssignment = Option(repetitionHandler) match {
    case Some(forRepetition: MForRepetition)                   => ForAssignment("rows", TryExpr("List[Seq[String]]()"))
    case Some(forEachRepetition: MForEachRepetition)           => ForAssignment("rows", TryExpr("List[Seq[String]]()"))
    case Some(forEachXPathRepetition: MForEachXPathRepetition) => ForAssignment("rows", TryExpr("List[Seq[String]]()"))
    case Some(somethingElse)                                   => throw new Exception(s"RepetitionHandler: $somethingElse is not supported.")
    case None                                                  => throw new Exception(s"")
  }

  def generateRepetitionHandler(runGroup:MAbstractRunGroup, resultClassStr:String, repetitionHandler: Option[MAbstractRepetitionHandler], postIterationObjects: Seq[EObject], repetitionBodyGen: ScalaGen)(implicit codeGenUtil: SaturnCodeGenUtil):Try[FutureGen] = {
    val resultFuturesGenTry = repetitionHandler match {  
      case Some(forRepetition: MForRepetition)                   => generateWithRepetition(runGroup, postIterationObjects, forRepetition.getIterators().toSeq.zipWithIndex.map { pair => val (iter, idx) = pair; ForAssignment(iter.getAttribute(), AttributeTry(TryExpr(s"row($idx)"), iter.getAttribute)) }, repetitionBodyGen)
      case Some(forEachRepetition: MForEachRepetition)           => generateWithRepetition(runGroup, postIterationObjects, forEachRepetition.getColumnMappings().map { mapping => ForAssignment(mapping.getAttribute(), AttributeTry(TryExpr(s"""row(rows.getColDefByName("${mapping.getColumn()}").get.index)"""), mapping.getAttribute)) }, repetitionBodyGen) //generateForEachRepetition(runGroup, forEachRepetition, postIterationObjects, repetitionBodyGen)
      case Some(forEachXPathRepetition: MForEachXPathRepetition) => generateWithRepetition(runGroup, postIterationObjects, forEachXPathRepetition.getXPathMappings().map{ mapping => ForAssignment(mapping.getAttribute(), AttributeTry(TryExpr(s"""row(rows.getColDefByName("${mapping.getAttribute()}").get.index)"""), mapping.getAttribute)) }, repetitionBodyGen) //generateForEachXPathRepetition(runGroup, forEachXPathRepetition, postIterationObjects, repetitionBodyGen)
      case Some(somethingElse)                                   => Failure { new Exception(s"RepetitionHandler: $somethingElse is not supported.") }
      case None                                                  => generateNoRepetition(runGroup, postIterationObjects, repetitionBodyGen)
    }
    import codeGenUtil.getWrapped

    val qq: Try[FutureGen] = resultFuturesGenTry.map { resultFuturesGen =>
      new FutureGen {
        override def generate: Try[String] =
          for {
            resultFuturesStr <- resultFuturesGen.generate
            waitBefore <- Try { runGroup.getWaitBefore().intValue() }
            waitAfter <- Try { runGroup.getWaitAfter().intValue() }
          } yield s"""{
              val resultFutures:Future[Seq[Try[IterationResult[$resultClassStr]]]] = 
              ${if (waitBefore > 0) s"akka.pattern.after(${waitBefore}.seconds, sc.actorSystem.scheduler)(" else ""}
                $resultFuturesStr
              ${if (waitBefore > 0) ")" else ""}
              ${if (waitAfter > 0) 
                s""".flatMap(result =>
                  for {
                    delay <- akka.pattern.after(${waitAfter}.seconds, sc.actorSystem.scheduler)(Promise.successful().future)
                  } yield result)""" else ""}
              resultFutures.map{results => IteratorResult(passIfAllPassItn(results), context, iteratorMetaData, results, ${if (runGroup.getDependencyRunGroups.isEmpty) "0" else "canRunAndDepth.depth + 1"})}
            }"""
      }
    }
    qq
  }
  
  def generateNoRepetition(runGroup:MAbstractRunGroup, postIterationObjects: Seq[EObject], runGroupLogicGen: ScalaGen)(implicit codeGenUtil: SaturnCodeGenUtil):Try[FutureGen] = {
    import codeGenUtil.getWrapped
    val iterationResultGen = for {
      postIterationAssignments <- postIterationObjects.map{ eObject => IterationObjectGenerator(eObject)}.toTrySeq
      metaDataAssignment       <- generateIterationMetaData(runGroup)      
    } yield ForTryExpr(postIterationAssignments ++ Seq(metaDataAssignment), runGroupLogicGen)

    iterationResultGen.map{iterationResultGen => new FutureGen() {      
      override def generate = iterationResultGen.generate().map{iterationResultStr => s"""{
        val __tmpContext = IterationContext(name, Some(context), None)
        val __iterationResult = {
          val context = __tmpContext
          val iterationResult = $iterationResultStr
          handleSingleRunGroupIterationAndAnnotations[${runGroup.getResultClassName}](context, iterationResult)
        }
        __iterationResult
      }
      """}
    }} 
  }

  def generateWithRepetition(runGroup: MAbstractRunGroup, postIterationObjects: Seq[EObject], repetitionAssignments: Seq[ForAssignment], runGroupLogicGen: ScalaGen)(implicit codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] = {
    import codeGenUtil.getWrapped
    val iterationResultGen = for {
      postIterationAssignments <- postIterationObjects.map { eObject => IterationObjectGenerator(eObject) }.toTrySeq
      metaDataAssignment <- generateIterationMetaData(runGroup)
    } yield ForTryExpr(repetitionAssignments ++ postIterationAssignments ++ Seq(metaDataAssignment), runGroupLogicGen)

    iterationResultGen.map { iterationResultGen => new FutureGen() {
        override def generate =
          for {
            iterationResultStr <- iterationResultGen.generate
            maxSimultaneous    <- Try { if(runGroup.isCanMultiplex()) runGroup.getMaxSimultaneousIterations().intValue() else 1 }
            breakTerminalCheck <- Try{ runGroup match {
              case runGroup:MRunGroup => ", RunGroupInstanceContainsActiveBreakTerminal"
              case _                 => ""
            }}
          } yield s"""futureMapN[Seq[String], Try[IterationResult[${runGroup.getResultClassName}]]](rows, { (row:Seq[String], iterationNo:Int) =>
            val __tmpContext = IterationContext(name, Some(context), Some(iterationNo))
            val __iterationResult = {
              val context = __tmpContext
              val iterationResult = $iterationResultStr
              handleRunGroupIterationAndAnnotations[${runGroup.getResultClassName}](context, iterationResult)
            }
            __iterationResult
          },$maxSimultaneous$breakTerminalCheck)"""
      }
    } 
  }  
}

case class SaturnAppObjectGenerator(saturn:MSaturn)(implicit codeGenUtil: SaturnCodeGenUtil) extends ScalaGen {
  import codeGenUtil.getWrapped

  def generate() = Try {
    s"""object ${saturn.getAppClassName} extends App {
  val cmdLine = $getOpts
  cmdLine.parseArguments(args)

  val (result, exitCode) = if (cmdLine.showSourceFile) {
    $printSaturnFile
    (null, 0)
  } else if (cmdLine.version) {
    System.out.println("saturn 2017.4.5 20170405.175420")
    System.out.println("Bin path: " + getClass.getProtectionDomain.getCodeSource.getLocation.getPath)
    (null, 0)
  } else {
    implicit val sc = SaturnExecutionContext("COMMAND", cmdLine)
    val result = try Await.result(new ${saturn.getClassName}().runFuture, Duration.Inf) finally sc.close()
    Option(cmdLine.junitOutputDir).foreach { outDir =>
      sys.props("specs2.junit.outDir") = outDir
      specs2.junitxml(new ${saturn.getJUnitReportClassName}(result))
    }
    val exitCode = if(runGroupPassed(result).value) 0 else 1
    if(!cmdLine.noExitCode) System.exit(exitCode)
    (result, exitCode)
  }
}"""}

  val getOpts = s"""new SaturnCmdLine() {
  override def resolveEnvVars = Seq(${saturn.getWebAnnotationEnvVars.mkString(", ")})
  ${saturn.getWebAnnotations flatMap cfgToOpts mkString "\n"}
}"""

  def cfgToOpts(cfg: MSaturnWebConfiguration): Traversable[String] = for {
    valDef       <- cfg.getValues
    source       = valDef.getSource
    target       = valDef.getTarget.asInstanceOf[MSingleValueEnvVarTargetDefinition]
    captionEsc   = escapeJava(source.getCaption)
    envVar       = target.getEnvVar
    usageMessage = Option(escapeJava(source.getDescription)).filter(_.nonEmpty).getOrElse(s"$captionEsc populates envVar: $envVar")
    defaultStr = getOptDefault(source).map(s => s""""${escapeJava(s)}"""").orNull
  } yield s"""@Args4jOption(name="--$captionEsc", usage="$usageMessage")
val $envVar: String = sys.env.getOrElse("$envVar", $defaultStr)"""

  def getOptDefault(source: MAbstractSourceDefinition): Option[String] = {
    source match {
      case s: MTextSourceDefinition         => Option(s.getDefaultValue)
      case s: MFileSelectorSourceDefinition => Option(s.getDefaultValue)
      case _                                => None
    }
  }

  val printSaturnFile: String = {
    val source = if (codeGenUtil.saturnAsJarResource) {
      val saturnResourceEsc = escapeJava(codeGenUtil.generateResourceAlias(saturn))
      s"""scala.io.Source.fromInputStream(getClass.getClassLoader.getResourceAsStream("$saturnResourceEsc"))"""
    } else {
      codeGenUtil.saturnFileName map { fn =>
        s"""scala.io.Source.fromFile("${escapeJava(fn)}")"""
      } getOrElse """scala.io.Source.fromString("No source file available")"""
    }
    s"$source.getLines foreach println"
  }
}

object JUnitReportClassGenerator {
  def apply(saturn: Saturn, runGroups: Seq[MAbstractRunGroup])(implicit codeGenUtil: SaturnCodeGenUtil) = new ScalaGen {
    import codeGenUtil.getWrapped
    def generate() = Try {
      val SaturnName = saturn.getName
      val tests = runGroups.flatMap { rg =>
        val fn = rg.getFullName()
        fn.split('.').toSeq match {
          case SaturnName +: fnTail =>
            Some(s"  iterationsPass(${fnTail.map(s => s""""$s"""").mkString("Seq(", ", ", ")")})")
          case _ =>
            None
        }
      }
      s"""class ${saturn.getJUnitReportClassName}(saturnResult: Try[IteratorResult[RunGroupResult]])
         |    extends com.ms.qaTools.saturn.runtime.JUnitReportSpecification(saturnResult, "$SaturnName") {
         |${tests.mkString(scala.util.Properties.lineSeparator)}
         |}""".stripMargin
    }
  }
}

case class SaturnJUnitGenerator(saturn:MSaturn, exitCode: Int = 0, stdOut: Option[String], saturnOpts: Option[Seq[String]])(implicit codeGenUtil: SaturnCodeGenUtil) extends ScalaGen {
  import codeGenUtil.getWrapped

  val stdOutTest = for {
    stdOutStr <- stdOut
  } yield """"output to STDOUT" in {
        val output = outStr.replaceAll("\r\n", "\n")
        output must beEqualTo(""""" + s""""$stdOutStr"""" + """"".replaceAll("\r\n","\n"))
      }"""
  val options = (if (saturnOpts.isDefined) saturnOpts.get
                    else if(stdOut.isDefined) Seq("--verbosity","QUIET")
                    else Seq()) :+ "--noExitCode"
  def generate() = Try {
    s"""@RunWith(classOf[JUnitRunner])
class ${saturn.getSpecsClassName} extends Specification {
  "${saturn.getAppClassName}" should {
    ${if(stdOut.isDefined) "val outStr = stdOutDuring " else ""}
    {
      ${saturn.getAppClassName}.main(Array[String](${options.map("\"" + escapeJava(_) + "\"").mkString(",")}))
    }
    val result = ${saturn.getAppClassName}.result
    "have exitCode" in {
      ${saturn.getAppClassName}.exitCode must be_==($exitCode)
    }

    ${stdOutTest.getOrElse("")}
  }
}"""
  }
}

case class SaturnMainClassGenerator(saturn:MSaturn)(implicit codeGenUtil: SaturnCodeGenUtil) extends ScalaGen {
  import codeGenUtil.getWrapped
  def generate() = for {
    runGroupLogicGen <- AbstractRunGroupGenerator(saturn)
    runGroupLogicStr <- runGroupLogicGen.generate().rethrow(s"An exception occurred while generating the runGroup logic for saturn object: '${saturn.getName()}'.")
  } 
  yield {
    s"""case class ${saturn.getClassName}(implicit sc: SaturnExecutionContext) {
  ${saturn.getClassName} =>
  implicit val ec = sc.executionContext
  implicit val locale = java.util.Locale.US

  def runFuture: Future[Try[IteratorResult[${saturn.getResultClassName()}]]] = $runGroupLogicStr
}"""}
}

trait ScalaFileGenerator {
  def generate():Seq[(FileIO,Try[String])]
}

class SaturnMonolithicFileGenerator(codeGenUtil: SaturnCodeGenUtil,
                                    fileIO: FileIO,
                                    packageName: String,
                                    jUnitOverride: Option[String] = None,
                                    stdOut: Option[String] = None,
                                    saturnOpts: Option[Seq[String]] = None,
                                    exitCode: Int) extends ScalaFileGenerator {
  import codeGenUtil.getWrapped
  def includeFileSaturns = codeGenUtil.includeFiles.toSeq
  
  override def generate:Seq[(FileIO,Try[String])] = Seq((fileIO, {
    val saturn = codeGenUtil.saturn
    val runGroupsWithJunitAnnotations = codeGenUtil.saturnEObjects.flatMap(codeGenUtil.getRunGroupsWithJUnitAnnotations(_)).toSeq
    for {
      saturnImports            <- SaturnImports()
      saturnIncludeClassesGen  <- includeFileSaturns.map{i => {
        IncludeFileClassGenerator(i)(codeGenUtil)
      } }.toTrySeq
      saturnIncludeClassesStrs <- saturnIncludeClassesGen.map{_.generate()}.toTrySeq
      saturnIncludeClassesStr  = saturnIncludeClassesStrs.mkString("\n\n") 
      saturnMainClassStr       <- SaturnMainClassGenerator(saturn)(codeGenUtil).generate.rethrow(s"An exception occurred while generating the main class for saturn object: '${saturn.getName()}'.")
      saturnAppObjectStr       <- SaturnAppObjectGenerator(saturn)(codeGenUtil).generate.rethrow(s"An exception occurred while generating the App object for saturn object: '${saturn.getName()}'.")
      saturnJUnitStr           <- jUnitOverride match {
        case Some(jUnitOverrideStr) => Success(jUnitOverrideStr)
        case None                   => SaturnJUnitGenerator(saturn, exitCode, stdOut, saturnOpts)(codeGenUtil).generate.rethrow(s"An exception occurred while generating the JUnit class for saturn object: '${saturn.getName()}'.")
      }
      specificationStr         <- JUnitReportClassGenerator(saturn, runGroupsWithJunitAnnotations)(codeGenUtil).generate()
    }
    yield {
    s"""package $packageName
      
$saturnImports

$saturnIncludeClassesStr

$saturnMainClassStr
  
$saturnAppObjectStr
  
$saturnJUnitStr

$specificationStr
"""
  }}))
}

object SaturnMonolithicFileGenerator {

  def apply(codeGenUtil: SaturnCodeGenUtil,
            baseFileIO: BaseFileIO,
            packageName: String = "default",
            jUnitOverride: Option[String] = None,
            stdOut: Option[String] = None,
            saturnOpts: Option[Seq[String]] = None,
            exitCode: Int = 0): SaturnMonolithicFileGenerator =
    baseFileIO match {
      case fileIO: FileIO => new SaturnMonolithicFileGenerator(codeGenUtil, fileIO, packageName, jUnitOverride, stdOut, saturnOpts, exitCode)
      case dirIO:  DirIO  =>
        val packageDirName = packageName.replace(".", "/")
        val fileIO = dirIO + DirIO(packageDirName) + FileIO(codeGenUtil.saturn.getName() + ".scala")       
        codeGenUtil.copySaturnFiles(dirIO + DirIO("resources/saturn"))
        new SaturnMonolithicFileGenerator(codeGenUtil, fileIO, packageName, jUnitOverride, stdOut, saturnOpts, exitCode)
      case _ => throw new Exception(s"Invalid BaseFileIO type:${baseFileIO.getClass.getName}")
    }

}

class SaturnMultiFileGenerator(codeGenUtil: SaturnCodeGenUtil,
                               dirIO: DirIO,
                               packageName: String,
                               jUnitOverride: Option[String] = None,
                               stdOut: Option[String] = None,
                               saturnOpts: Option[Seq[String]] = None,
                               exitCode: Int) extends ScalaFileGenerator {
  import codeGenUtil.getWrapped

  def includeFilesSaturn = codeGenUtil.includeFiles.toSeq

  val packageDirName = packageName.replace(".", "/")
  val packageDirIO = dirIO + DirIO(packageDirName)
  codeGenUtil.copySaturnFiles(dirIO + DirIO("resources/saturn"))

  override def generate: Seq[(FileIO, Try[String])] = {
    val saturn = codeGenUtil.saturn
    val runGroupsWithJunitAnnotations = codeGenUtil.getRunGroupsWithJUnitAnnotations(saturn)
    (packageDirIO + FileIO(saturn.getName + ".scala"),
      {
        for {
          saturnImports      <- SaturnImports()
          saturnMainClassStr <- SaturnMainClassGenerator(saturn)(codeGenUtil).generate.rethrow(s"An exception occurred while generating the main class for saturn object: '${saturn.getName()}'.")
          saturnAppObjectStr <- SaturnAppObjectGenerator(saturn)(codeGenUtil).generate.rethrow(s"An exception occurred while generating the App object for saturn object: '${saturn.getName()}'.")
          saturnJUnitStr     <- jUnitOverride match {
            case Some(jUnitOverrideStr) => Success(jUnitOverrideStr)
            case None                   => SaturnJUnitGenerator(saturn, exitCode, stdOut, saturnOpts)(codeGenUtil).generate.rethrow(s"An exception occurred while generating the JUnit class for saturn object: '${saturn.getName()}'.")
          }
          specificationStr   <- JUnitReportClassGenerator(saturn, runGroupsWithJunitAnnotations)(codeGenUtil).generate()
        } yield {
          s"""package $packageName
      
$saturnImports

$saturnMainClassStr
  
$saturnAppObjectStr
  
$saturnJUnitStr

$specificationStr
"""
        }
      }) +: includeFilesSaturn.map { saturn =>
        val runGroupsWithJunitAnnotations = codeGenUtil.getRunGroupsWithJUnitAnnotations(saturn)
        (packageDirIO + FileIO(saturn.getName + ".scala"),
          for {
            saturnImports           <- SaturnImports()
            saturnIncludeClassGen   <- IncludeFileClassGenerator(saturn)(codeGenUtil)
            specificationsStr       <- JUnitReportClassGenerator(saturn, runGroupsWithJunitAnnotations)(codeGenUtil).generate()
            saturnIncludeClassStr   <- saturnIncludeClassGen.generate()
          } yield s"""package $packageName

$saturnImports

$saturnIncludeClassStr

$specificationsStr""")
      }.toSeq
  }
}

object SaturnMultiFileGenerator {
  def apply(codeGenUtil:SaturnCodeGenUtil,
            dirIO:DirIO, packageName:String = "default",
            jUnitOverride:Option[String] = None,
            stdOut:Option[String] = None,
            saturnOpts:Option[Seq[String]] = None,
            exitCode: Int = 0):SaturnMultiFileGenerator = new SaturnMultiFileGenerator(codeGenUtil, dirIO, packageName, jUnitOverride, stdOut, saturnOpts, exitCode)
}

class SaturnCodeGenApp extends ToolkitApp[Result] {
  override val APP_NAME = "SaturnCodeGenApp"
  override val cmdLine = CmdLine
  object CmdLine extends BasicCmdLine with SaturnFile { // Create object to avoid reflective call warnings
    @AOption(name = "--toConsole", usage = "Optional console output", required = false)
    val toConsole: Boolean = false
    
    @AOption(name = "--codeFormat", usage = "JAR-DIR|JAR-FILE|SINGLE-FILE, default: (JAR-DIR)", required = false)
    val codeFormat: String = "JAR-DIR"
      
    @AOption(name = "--packageName", usage = "Scala package name used in generated code, default: (default)", required = false)
    val packageName: String = "default"      
    
    @AOption(name = "--output", aliases = Array("-o"), usage = "Output file or directory", required = false)
    val output: String = null     
    
    @AOption(name = "--saturnLint", usage = "WARN|ERROR|IGNORE, default= (ERROR)", required = false)
    val saturnLint: String = "ERROR"
    
    @AOption(name = "--saturnLintFileName", usage = "Optional SaturnLint output fileName, default: (stderr)", required = false)
    val saturnLintFileName: Boolean = false
    
    @AOption(name = "--dryRun", usage = "Do not write generate any files, simply generate.", required = false)
    val dryRun: Boolean = false

    @AOption(name = "--jUnitFileName", usage = "Optional JUnit file", required = false)
    val jUnitFileName: String = null

    @AOption(name = "--stdOutFileName", usage = "Optional STDOUT file for JUnit tests", required = false)
    val stdOutFileName: String = null

    @AOption(name = "--saturnOptsFileName", usage = "Optional saturn opts for JUnit tests", required = false)
    val saturnOptsFileName: String = null

    @AOption(name = "--exitCode", usage = "Optional JUnit file", required = false)
    val exitCode: Int = 0
    def saturnFileGenerator(codeGenUtil:SaturnCodeGenUtil) = Try{
      val saturnOpts = for{
        fileName <- Option(saturnOptsFileName)
      } yield {
        val r = """([^"]\S*|".+?")\s*""".r
        val matches: Iterator[Match] = r findAllMatchIn IOUtils.toString(new java.io.FileReader(fileName)).trim
        matches.map{_.group(1)}.toSeq
      }
      val jUnitOverrideStr = for {
        fileName <- Option(jUnitFileName)
      } yield IOUtils.toString(new java.io.FileReader(fileName))
      val stdOutStr = for {
        fileName <- Option(stdOutFileName)
      } yield IOUtils.toString(new java.io.FileReader(fileName))
      codeFormat match {    
        case "SINGLE-FILE" => SaturnMonolithicFileGenerator(codeGenUtil.copy(saturnAsJarResource = false), FileIO(output), packageName, jUnitOverrideStr, stdOutStr, saturnOpts, exitCode)
        case "JAR-FILE"    => SaturnMonolithicFileGenerator(codeGenUtil, DirIO(output), packageName, jUnitOverrideStr, stdOutStr, saturnOpts, exitCode)
        case "JAR-DIR"     => SaturnMultiFileGenerator(codeGenUtil, DirIO(output), packageName, jUnitOverrideStr, stdOutStr, saturnOpts, exitCode)
        case somethingElse => throw new IllegalArgumentException(s"codeFormat: '$somethingElse' is invalid.  Value must be one of: JAR-DIR|JAR-FILE|SINGLE-FILE, default: (JAR-DIR).")
      }
    }
  }
  parseArguments

  val saturnFileName = cmdLine.saturnFileName
  val toConsole = cmdLine.toConsole
  
  val scriptFiles = for {
    codeGenUtil         <- SaturnCodeGenUtil.createFromFileName(saturnFileName)
    saturnLintResult    <- cmdLine.saturnLint match {
      case "WARN" | "ERROR" => SaturnLintRunner(codeGenUtil).run
      case "IGNORE"         => Try { SaturnLintResult(NotRun(), Nil) }
      case invalid          => throw new Error(s"'$invalid' is not a valid value for saturnLint. Options are WARN|ERROR|IGNORE, default= (ERROR)")
    }
    checkResults        <- Try{
      val (fails, rest) = saturnLintResult.validationResults partition (_.isError)
      val warnings = rest filter (_.isWarning)
      warnings foreach { r => println(s"Saturn Lint Warning: '${r.description}'\n") }
      if(cmdLine.saturnLint == "ERROR" && !fails.isEmpty)
        throw new AggregateException("There are failed SaturnLint rules.",
                                     fails.map { r => new Exception(s"Rule: '${r.rule}' Description: ${r.description} Objects: ${r.eObjects.map(_.eObjectToPath).mkString(",")}") })
      else
        fails foreach { r => println(s"Saturn Lint Error: '${r.description}'\n") }
    }
    saturnFileGenerator <- cmdLine.saturnFileGenerator(codeGenUtil)
  } yield saturnFileGenerator.generate()


  if(!cmdLine.dryRun) {  
    scriptFiles match {
      case Success(fileMaps) => {
        for(fileMap <- fileMaps) yield {
          fileMap match {
            case (fileIO, Success(f)) => {
              if(cmdLine.debug) println(s"Writing: ${fileIO.file.get.getPath()}")
              fileIO.mkParentDirs
              val writer = fileIO.writer
              writer.map{w => w.write(f); w.close; true}
            }
            case (fileIO, Failure(e)) => e.printStackTrace()
          }
        }
      }
      case Failure(e) => e.printStackTrace()
    }
  }
  
  if(cmdLine.toConsole) {  
    scriptFiles match {
      case Success(fileMaps) => {
        for(fileMap <- fileMaps) yield {
          fileMap match {
            case (fileIO, Success(f)) => {
              val writer = StandardIO().writer              
              writer.map{w => w.write(s"\n\n<${fileIO.file.get.getPath()}>\n"); w.write(f); true}
            }
            case (fileIO, Failure(e)) => e.printStackTrace()
          }
        }
      }
      case Failure(e) => e.printStackTrace()
    }
  }  
}
/*
Copyright 2017 Morgan Stanley

Licensed under the GNU Lesser General Public License Version 3 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

https://www.gnu.org/licenses/lgpl-3.0.en.html

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

IN ADDITION, THE FOLLOWING DISCLAIMER APPLIES IN CONNECTION WITH THIS PROGRAM:

THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY
WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT
OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING
IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY
OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY
USING THIS OR ANOTHER EQUIVALENT DISCLAIMER IN ADDITION TO ANY OTHER REQUIRED
LICENSE TERMS.
*/
