package com.ms.qaTools.saturn.runbook

import java.io.PrintWriter
import java.io.StringReader
import java.math.BigInteger
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption
import java.util.regex.Matcher

import scala.collection.AbstractIterator
import scala.collection.JavaConverters._
import scala.collection.mutable
import scala.reflect.runtime.universe

import org.apache.commons.io.FileUtils
import org.apache.commons.lang.StringUtils
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.FeatureMapUtil
import org.eclipse.xtext.nodemodel.ICompositeNode
import org.yaml.snakeyaml.Yaml

import com.ms.qaTools.SeqUtil
import com.ms.qaTools.TryUtil
import com.ms.qaTools.io.ExcelIO
import com.ms.qaTools.io.definition.ExcelWsIO
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.io.rowWriter.CsvRowWriter
import com.ms.qaTools.kronus.repository.ExtractKronusSource
import com.ms.qaTools.saturn.KronusStandaloneSetup
import com.ms.qaTools.saturn.SaturnFactory
import com.ms.qaTools.saturn.kronus._
import com.ms.qaTools.saturn.kronus.backport.BackportFactory
import com.ms.qaTools.saturn.modules.procedureCallModule.ProcedureCallModuleFactory
import com.ms.qaTools.saturn.parser.antlr.KronusParser
import com.ms.qaTools.saturn.repetition.RepetitionFactory
import com.ms.qaTools.saturn.resources.fileResource.FileResourceFactory
import com.ms.qaTools.saturn.resources.referenceResource.ReferenceResourceFactory
import com.ms.qaTools.saturn.types.{TypesFactory, AlmId}
import com.ms.qaTools.saturn.util.SaturnResourceFactoryImpl
import com.ms.qaTools.saturn.util.Util.stringToComplexValue
import com.ms.qaTools.saturn.values.ComplexValue
import com.ms.qaTools.saturn.values.FailBehaviorsEnum
import com.ms.qaTools.saturn.values.ValuesFactory
import com.ms.qaTools.saturn.values.ValuesPackage
import com.ms.qaTools.kronus.repository.{Config => KRConfig}

import spray.json._

object SaturnRB {
  case class Scenario(enabled: Boolean, definition: ScenarioDef, group:String, description: String, testCases: Seq[String], ALMMapping: Option[AlmId])
  case class ScenarioDef(name: String, steps: Seq[Step])
  case class Step(enabled: Boolean, location: Int, name: String, generatedName: Boolean, operation: String,
                  preBounds: Seq[PreBound], arguments: Either[Map[String, Seq[String]], Seq[String]], children: Seq[Step] = Seq.empty) 
  case class PreBound(matcher: ParamMatcher, value: String, interpolate: Boolean = false)
  case class Store(name: String, data: Map[String, Seq[String]])

  object ParamMatcher {
    def fromString(s: String): ParamMatcher = try {
      val Array(fun, param) = s.split('.').map(s => s.replace("*", ".*").r.unapplySeq(_: String).isDefined)
      apply(fun, param)
    } catch {
      case e: Exception => throw new IllegalArgumentException(s, e)
    }
  }

  case class ParamMatcher(function: String => Boolean, parameter: String => Boolean) {
    def matches(param: ParameterDef): Boolean =
      parameter(param.getName) && function(param.eContainer.asInstanceOf[FunctionDef].getName)
  }

  type Table = Iterator[Seq[String]] with ColumnDefinitions

  object ScenarioDef {
    def fromTable(data: Table,
                  columnMappings: Map[String, String],
                  name: Option[String],
                  complex: Option[Table],
                  withData: Boolean): Iterable[ScenarioDef] = {
      import universe._
  
      val scenarioDefs = mutable.Map.empty[String, ScenarioDef]
      val indexOf = genIndexOf(data) 
      val complexIndexOf = complex.map(genIndexOf).getOrElse(Map.empty) 
      val complexStepsByName = complex.getOrElse(Iterator.empty).toArray.groupBy(complexIndexOf.mapValues(_)("Complex Name"))
      val preBoundCols = data.colDefs.map(_.name).filter(c => columnMappings.contains(c) || c.contains("."))
      val nonTCCols = Set("Enabled", "Scenario Name", "Step Name", "Description", "Operation", "Auto Assign")
      val tcCols = for ((name, cs) <- data.colDefs.groupBy(_.name) if !(nonTCCols(name) || preBoundCols.contains(name)))
                   yield name -> cs.map(_.index)
                   
      var autoAssigns = List.empty[PreBound]
      var genStepNameIdx = -1
      data.zipWithIndex.foreach { case(row,index) =>
        try {
          val valueOf = indexOf.mapValues(row)
          val operation = valueOf("Operation")
          val allComplexSteps = complexStepsByName.getOrElse(operation, Array.empty[Seq[String]]).map { complexRow =>
            val complexValueOf = complexIndexOf.mapValues(complexRow)
            val (stepName, generated, genIdx) = genName(complexValueOf.get("Step Name"), genStepNameIdx)
            genStepNameIdx = genIdx
            genStep(Right(Seq.empty), autoAssigns, columnMappings, index+2, preBoundCols, complexRow, stepName, generated, complexValueOf)
          }
          val args = genArgs(row, tcCols, withData) 
          val (stepName, generated, genIdx) = genName(valueOf.get("Step Name"), genStepNameIdx)
          genStepNameIdx = genIdx
          val step = genStep(args, autoAssigns, columnMappings, index+2, preBoundCols, row, stepName, generated, valueOf, allComplexSteps)
          for (aa <- valueOf.get("Auto Assign") if StringUtils.isNotBlank(aa))
            autoAssigns ::= PreBound(ParamMatcher.fromString(columnMappings.getOrElse(aa, aa)), step.name)
          val scenarioName = name.getOrElse(valueOf("Scenario Name"))
          val scenarioDef = scenarioDefs.getOrElse(scenarioName, apply(scenarioName, Vector.empty))
          scenarioDefs(scenarioName) = scenarioDef.copy(steps = scenarioDef.steps :+ step)
        } catch {
          case t: Throwable => throw new Exception(s"Error parsing Excel 'Test Cases' sheet at line ${index+2}", t)
        }
      }
      scenarioDefs.values
    }
    
    def genArgs(row: Seq[String], tcCols: Map[String, Seq[Int]], withData: Boolean):Either[Map[String, Seq[String]], Seq[String]] = {
      if (withData) Left {
        for {
            (tc, is) <- tcCols
            cells = is.map(row).filter(StringUtils.isNotBlank) if cells.nonEmpty
        } yield tc -> cells
      } else Right {
        for (i <- tcCols.values.flatten.toSeq.sorted; c = row(i) if StringUtils.isNotBlank(c)) yield c
      }
    }
    
    def genGlobals(data: Table): Seq[Step] = {
      val indexOf = genIndexOf(data)        
      data.zipWithIndex.map { case(row,index) =>
        try {
          val valueOf = indexOf.mapValues(row)
          Step(true, index + 2, valueOf("Key"), false, valueOf("Operation"), Seq.empty, Right(Seq.empty))
        } catch {
          case t: Throwable => throw new Exception(s"Error parsing Excel 'Global' sheet at line ${index+2}", t)
        }
      }.toSeq
    }
     
    def genIndexOf(data: Table): Map[String, Int] = data.colDefs.toMapBy(_.name).transform((_, c) => c.index) 
    
    def genName(name: Option[String], genStepNameIdx: Int): (String, Boolean, Int) = {
      var genIdx = genStepNameIdx
      val n = name.filter(StringUtils.isNotBlank)
      (n.getOrElse {
        genIdx += 1
        "GEN_STEP_NAME_" + (genIdx)
      }, n.isEmpty, genIdx)
    }
    
    def genStep(args: Either[Map[String, Seq[String]], Seq[String]],
                autoAssigns: List[PreBound],
                columnMappings: Map[String, String],
                index: Int,
                preBoundCols: Seq[String],
                row: Seq[String],
                stepName: String,
                generatedName: Boolean,
                valueOf: Map[String, String],
                children: Seq[Step] = Seq.empty): Step = {

      import universe._
      val preBounds = preBoundCols.flatMap { col =>
        for (v <- Option(valueOf(col)) if StringUtils.isNotBlank(v)) yield {
          val (m, value, inter) = columnMappings.getOrElse(col, col).split('=') match {
            case Array(m, s) => (m, s"$s(${Literal(Constant(v))})", true)
            case Array(m)    => (m, if (v.matches("(\\d+|^\".*)")) v else Literal(Constant(v)).toString, false)
            case _           => throw new IllegalArgumentException(col)
          }
          PreBound(ParamMatcher.fromString(m), value, inter)
        }
      } ++ autoAssigns
      Step(toBoolean(valueOf("Enabled")), index, stepName, generatedName, valueOf("Operation"), preBounds, args, children)
    }
  }

  object Scenario {
    object TestCasePatterns {
      val Range     = """(\w+)\[(\d+)-(\d+)\]""".r
      val Indices   = """(\w+)\[(\d+(?:,\s*\d+)*)\]""".r
      val Hierarchy = """(\w+)\..*""".r
    }

    def fromTable(data: Table, definitions: Iterable[ScenarioDef], testDatas: Set[String]): Iterator[Scenario] = {
      val indexOf = data.colDefs.toMapBy(_.name).transform((_, c) => c.index)
      val tcIndices = data.colDefs.collect { case c if c.name == "Test Cases" => c.index }
      val defs = definitions.map(d => d.name -> d).toMap
      data.zipWithIndex.map { case(row, index) =>
        try {
          val valueOf = indexOf.mapValues(row)
          val d = defs(valueOf("Scenario"))
          val descr = valueOf.getOrElse(("Description"), "")
          val group = valueOf.getOrElse(("Group"), "")
          val allTCs = testDatas ++ d.steps.flatMap(_.arguments.fold(_.keys, _ => Nil))
          val tcs = for {
            i <- tcIndices
            cell = row(i) if StringUtils.isNotBlank(cell)
            (name, tcs) = cell match {
              case TestCasePatterns.Range(name, beg, end) => (name, (beg.toInt to end.toInt).map(s"$name." + _))
              case TestCasePatterns.Indices(name, is)     => (name, is.split(',').map(s"$name." + _.trim).toSeq)
              case tc@TestCasePatterns.Hierarchy(name)    => (name, Seq(tc))
              case name                                   => (name, Seq(name))
            }
            _ = require(allTCs(name), s"unable to find test case or test data: $name")
            tc <- tcs
          } yield tc
          
          val alm = Option(valueOf.getOrElse("ALM", "")).filter(_.nonEmpty).map { alm => 
            val data = alm.split("/")
            require(data.length == 3, s"unable to find proper format for ALM(domain/project/testId) for: $d")
            TypesFactory.eINSTANCE.createAlmId().withSideEffect { id =>  
              id.setDomain(stringToComplexValue(data(0)))
              id.setProject(stringToComplexValue(data(1)))
              id.setId(stringToComplexValue(data(2)))
            }
          }
          
          apply(toBoolean(valueOf("Enabled")), d,group,descr, tcs, alm)
        } catch {
          case t: Throwable => throw new Exception(s"Error parsing Excel 'Scenario' sheet at line ${index+2}", t)
        }
      }
    }
  }

  object Store {
    def fromTable(name: String, data: Table): Store = {
      val colIndices = data.colDefs.groupBy(_.name).mapValues(_.map(_.index))
      val Seq(keyCol) = colIndices("Key")
      val valCols = colIndices("Value")
      val d = data.zipWithIndex.map { case(row,index) =>
        try {
          row(keyCol) -> valCols.map(row)
        } catch {
          case t: Throwable => throw new Exception(s"Error parsing Excel 'Store' sheet at line ${index+2}", t)
        }
      }.toMap
      apply(name, d)
    }
  }

  case class GenLogicConfig(modules: Seq[TopLevelKronus] = deserialize(ExtractKronusSource()),
                            extraKronusPaths: Seq[Path],
                            kronusRepoFile: Path,
                            sequentialExecution: Boolean = false, 
                            parallel: Int = 1) {
    def setExtraKronusUris(paths: Seq[java.net.URI]) = copy(modules = deserialize(ExtractKronusSource.withExtra(paths)))
  }

  def testDatafromTable(data: Table): Map[String, Map[String, String]] = {
    val (Seq(keyCol), valCols) = data.colDefs.splitAt(1)
    data.map { row =>
      val k = row(keyCol.index)
      val v = valCols.map(c => c.name -> row(c.index)).toMap
      k -> v
    }.toMap
  }

  protected object SheetExtractors {
    val TestCase            = """TC-(\w+)""".r
    val TestData            = """TD-(\w+)""".r
    val TestCaseWithData    = """TCD-(\w+)""".r
    val Store               = """S(?:tore)?-(\w+)""".r
  }

  def fromExcel(workbook: ExcelIO,
                storeExcel: Option[ExcelIO] = None,
                complexExcel: Option[ExcelIO] = None,
                scenariosSheet: String = "Scenarios",
                testCasesSheet: String = "Test Cases",
                columnMappingsSheet: String = "Column Mappings",
                complexStepSheet: String = "Complex",
                globalsSheet: String = "Global"): SaturnRB = {
    def open(sheet: String, wk: ExcelIO = workbook): Table = ExcelWsIO(wk, sheet).input.rethrow(s"Error while opening sheet $sheet"). get.removeEmptyRows
    def getAllSheetNames(wk: ExcelIO) = wk.worksheetNames. get.toSeq
    val allSheetNames = getAllSheetNames(workbook)
    val columnMappings = allSheetNames.find(_ == columnMappingsSheet).map {
      open(_).map { case Seq(k, v) => (k, v) }.toMap
    }.getOrElse(Map.empty)

    val complexTable = complexExcel.map{ wk =>
      Option(open(complexStepSheet, wk))
    }.getOrElse(if(allSheetNames.exists(_.equals(complexStepSheet))) Option(open(complexStepSheet)) else None)
    val globals = allSheetNames.find(_ == globalsSheet).map { page =>
      ScenarioDef.genGlobals(open(page))
    }.getOrElse(Seq.empty)
    val scenarioDefs = {
      allSheetNames.find(_ == testCasesSheet).map((_, None, true)) ++ allSheetNames.collect {
        case sheet@SheetExtractors.TestCase(name)         => (sheet, Some(name), false)
        case sheet@SheetExtractors.TestCaseWithData(name) => (sheet, Some(name), true)
      }
    }.flatMap { case (sheet, name, withData) =>  ScenarioDef.fromTable(open(sheet), columnMappings, name, complexTable, withData) }
    val testDatas = allSheetNames.collect {
      case sheet@SheetExtractors.TestData(name) => name -> testDatafromTable(open(sheet))
    }.toMap
    val scenarios = Scenario.fromTable(open(scenariosSheet), scenarioDefs, testDatas.keySet)
    val stores = storeExcel.map { wk =>
      val storeSheetNames = getAllSheetNames(wk)
      storeSheetNames.collect { case sheet@SheetExtractors.Store(name) => Store.fromTable(name, open(sheet, wk)) }
    }.getOrElse(allSheetNames.collect { case sheet@SheetExtractors.Store(name) => Store.fromTable(name, open(sheet)) })
    new SaturnRB(scenarioDefs, testDatas, scenarios.toSeq, stores, globals)
  }

  def toBoolean(s: String): Boolean = s.toUpperCase match {
    case "Y" | "YES" => true
    case "N" | "NO"  => false
    case _           => s.toBoolean
  }

  implicit class TableOps(val self: Table) extends AnyVal {
    def removeEmptyRows: Table = new AbstractIterator[Seq[String]] with ColumnDefinitions {
      val filtered = self.filter(_.exists(StringUtils.isNotBlank))
      def hasNext = filtered.hasNext
      def next() = filtered.next()
      def colDefs = self.colDefs
    }
  }

  case class TestData(scenario: Map[String, Map[String, Map[String, Seq[String]]]],
                      standalone: Map[String, Map[String, Map[String, String]]])

  object TestData {
    implicit val JsonFormat = {
      import DefaultJsonProtocol._
      jsonFormat2(apply)
    }
  }
}

class SaturnRB(scenarioDefs: Iterable[SaturnRB.ScenarioDef],
               testDatas: Map[String, Map[String, Map[String, String]]],
               scenarios: Seq[SaturnRB.Scenario],
               stores: Seq[SaturnRB.Store],
               globals: Seq[SaturnRB.Step],
               log: Any => Unit = println) {
  import SaturnRB._

  val scenarioParms = "SCENARIO_PARMS"
  val testCaseParm = "TEST_CASE"
  val scenariosColumns = Seq("ENABLED", "SCENARIO","GROUP", "DESCRIPTION", "TEST_CASE")
  val packageName = "com.ms.qaTools.saturn.kronus.generated.scenarios"

  class ScenarioLogicGenerator(config: GenLogicConfig) {
    val parser = injector.getInstance(classOf[KronusParser])
    val bindingsVal = "__BINDINGS"

    def replacePlaceholder(origin: String)(replacer: Int => String): String =
      """\$(\d+)""".r.replaceAllIn(origin, m => Matcher.quoteReplacement(replacer(m.subgroups.head.toInt)))

    def defs: Iterator[AbstractDef] = config.modules.iterator.flatMap(_.getKronus.getDefs.iterator.asScala.map(_.getDef))

    def genOperation(step: Step, soFar: collection.Set[String])(placeholderReplacer: Int => String): String = try {
      val expr = replacePlaceholder {
        val r = parser.parse(parser.getGrammarAccess.getFunctionCallAccess.getMethodFunctionDefQNParserRuleCall_0_0_1,
                             new StringReader(step.operation), 0)
        if (r.hasSyntaxErrors) step.operation else step.operation + "()"
      } (placeholderReplacer)
      val result = parser.parse(parser.getGrammarAccess.getFunctionCallRule, new StringReader(expr))
      if (result.hasSyntaxErrors) return expr
      val (name, keyArgs, posArgs) = {
        val name +: args = result.getRootNode.getChildren.asScala.toSeq
        val (key, pos) = args.collect { case a: ICompositeNode => a }.partition(_.isInstanceOf[KeywordParameterValue])
        (name.getText, key, pos.to[mutable.Queue])
      }
      
      if (soFar(name)) name else {
        val funDef = defs.collectFirst {
          case fd: FunctionDef if fd.getName == name => fd
        }.getOrElse(throw new NoSuchElementException(s"Function Def `$name'"))
        val suppliedKeyArgNames = keyArgs.map(_.getSemanticElement.asInstanceOf[KeywordParameterValue].getName).toSet
        val args = keyArgs.map(_.getText.trim).toBuffer
        var implicitPlaceholder = 0
        val maxPlaceholderNum = step.arguments.fold(_.headOption.fold(0)(_._2.length), _.length)
        funDef.getParameterDefs.asScala.foreach { pd =>
          if (!suppliedKeyArgNames(pd.getName)) step.preBounds.find(_.matcher.matches(pd)) match {
            case Some(pb) => args += s"${pd.getName} = ${if(pb.interpolate) interpolateData("InterpolateSeq",pb.value) else pb.value}"
            case None     => if (pd.getDefaultValue == null || !posArgs.isEmpty) {
              val value = if (posArgs.isEmpty) {
                if (expr != step.operation + "()" || implicitPlaceholder >= maxPlaceholderNum)
                  sys.error(s"unmatched parameter: ${funDef.getName}.${pd.getName}")
                implicitPlaceholder += 1
                placeholderReplacer(implicitPlaceholder - 1)
              } else posArgs.dequeue().getText.trim
              args += s"${pd.getName} = $value"
            }
          }
        }
        if (posArgs.nonEmpty) sys.error("Extra arguments: " + posArgs.map(_.getText).mkString(", "))
        args.mkString(name + "(", ", ", ")")
      }    
    } catch {
      case e: Exception => throw new IllegalArgumentException(step.operation, e)
    }
    
    def interpolateData(prefix: String, str: String): String = s"$prefix($str, $bindingsVal)"
    
    def gen(folder: Path): Seq[Path] = {
      val header = folder.resolve("globals.kronus")
      update(header)(withWriter(_)(genHeader(_, packageName + ".globals", true)))
      val globalNames = globals.map(_.name).toVector
      scenarioDefs.map { scenario =>
        val file = folder.resolve(s"${scenario.name}.kronus")
        update(file)(withWriter(_)(genScenarioFile(_, scenario, globalNames)))
        file
      }.toSeq :+ header
    }

    def genHeader(writer: PrintWriter, packName: String, isHeader: Boolean = false): Unit = {
      writer.printf("package %s%n%n", packName)
      config.modules.foreach(k => writer.printf("include %s%n", k.getPackage.getModule))
      writer.println()
      writer.println("type Result = Seq[scala.util.Try[Any]]")

      if(isHeader) {
        globals.foreach { global => 
          val rhs = genOperation(global, Set.empty)(_.toString())
          writer.println(s"val ${global.name} = $rhs")       
        }

        if (stores.nonEmpty) {
          writer.println()
          writer.println {
            s"""val STORES_DATA = generate("yield") {
               |  import spray.json._
               |  val source = scala.io.Source.fromFile(scala.sys.env("STORES"))
               |  try source.mkString.parseJson.convertTo[Map[String, Map[String, Seq[String]]]]
               |  finally source.close()
               |}""".stripMargin
          }
          for (Store(name, data) <- stores) {
            val (retTyp, retExpr) = data.head._2.length match {
              case 1 =>
                ("String", "Nth(0, VALUES)")
              case n =>
                ("Seq[String]", "VALUES")
            }
            writer.println {
              s"""def $name(KEY: String): $retTyp = {
                 |  val VALUES = GetValue(GetValue(STORES_DATA, "$name"), KEY)
                 |  return $retExpr
                 |}""".stripMargin
            }
          }
        }
      } 
      else writer.printf("include %s%n%n", packageName + ".globals")
    }

    def genScenarioFile(writer: PrintWriter, scenario: ScenarioDef, globalNames: Seq[String]): Unit = {
      genHeader(writer, s"$packageName.${scenario.name}")
      writer.printf("%n#Step()%ndef %s(%s: JsonIO, %s: String): Result = {%n",
                      scenario.name, scenarioParms, testCaseParm)
      writer.printf("  val %s = MakeBindings([%s])%n",
                    bindingsVal, globalNames.map(g => s"""MakeTuple("$g", $g)""").mkString(", "))
      val soFar = globalNames.to[mutable.Set]
      var last = Option.empty[Step]
      scenario.steps.foreach { step =>
        try { 
          if (step.enabled) {
            for (child <- if (step.children.isEmpty) step :: Nil else step.children) {
              last = genStepString(step, child, soFar, last, scenario.name, writer)
              last.foreach(l => if (!l.generatedName) soFar += l.name)
            }
          }
        } catch {
          case t: Throwable => throw new Exception(s"Error in Excel 'Test Cases' sheet at line ${step.location}", t)
        }
      }
      writer.println("}")
    }
    
    def genStepString(parent: Step, child: Step,
                      soFar: collection.Set[String], last: Option[Step],
                      scenarioName: String, writer: PrintWriter): Option[Step] = {
      val rhs = {
        val rhs = genOperation(child, soFar) { i =>
           val path = parent.arguments match {
             case Left(_)     => s""""scenario.${scenarioName}." + $testCaseParm + ".${parent.name}[$i]""""
             case Right(args) => s""""standalone." + $testCaseParm + ".${args(i)}""""
           }
           val str = s"JsonPath(InputOf($scenarioParms), $path, 0)"
           if (config.sequentialExecution) {
             interpolateData("Interpolate", str)
           } else str
         }
         last.fold(rhs) { last =>
           val name = last.name
           val dep = if (last.generatedName) name else s"When(OnPass($name), UpdateBindings($bindingsVal, '$name', $name))"
           s"When(OnPass($dep), $rhs)"
         }
       }
       writer.printf("  val %s = %s%n", child.name, rhs)
       if (config.sequentialExecution) Option(child)
       else None
    }
  }

  def genKronusYaml(writer: PrintWriter, scenarioLogicFiles: Seq[Path], dispatcherFile: Path, conf: GenLogicConfig): Unit = {
    val relativized = Option(conf.extraKronusPaths).getOrElse(Nil).map { p =>
      conf.kronusRepoFile.toAbsolutePath.getParent.normalize.relativize(p.toAbsolutePath.normalize)
    }
    val sources = (Seq(dispatcherFile) ++ scenarioLogicFiles ++ relativized).map(_.toString)
    writer.println(new Yaml().dump(Map("sources" -> sources.asJava).asJava))
  }

  def genScenarioLogic(folder: Path, conf: GenLogicConfig): Seq[Path] = new ScenarioLogicGenerator(conf).gen(folder)

  def genTestCases(writer: PrintWriter): Unit = {
    val tcds = scenarioDefs.map { scenarioDef =>
      val tcs = mutable.Map.empty[String, mutable.Builder[(String, Seq[String]), Map[String, Seq[String]]]]
      for (step <- scenarioDef.steps; args <- step.arguments.left.toSeq; (tc, args) <- args)
        tcs.getOrElseUpdate(tc, Map.newBuilder) += step.name -> args
      val builder = Map.newBuilder[String, Map[String, Seq[String]]]
      for ((k, v) <- tcs) builder += k -> v.result()
      scenarioDef.name -> builder.result()
    }.toMap
    writer.println(TestData(tcds, testDatas).toJson.prettyPrint)
    writer.flush()
  }

  def genScenarios(writer: PrintWriter): Unit = {
    val csv = CsvRowWriter(writer)
    val cols = for ((c, i) <- scenariosColumns.zipWithIndex) yield ColumnDefinition(c, index = i)
    val rows = for (s <- scenarios; tc <- if(s.testCases.isEmpty) List("") else s.testCases) yield Seq(s.enabled.toString, s.definition.name, s.group, s.description, tc)
    csv.write(rows.toIterator, Some(cols))
    writer.flush()   
  }

  def genStores(writer: PrintWriter): Unit = {
    import DefaultJsonProtocol._
    writer.println(stores.map(s => s.name -> s.data).toMap.toJson.prettyPrint)
    writer.flush()
  }

  protected def envVarCV(name: String): ComplexValue = {
    val text = ValuesFactory.eINSTANCE.createTextComplexValue
    text.setText(name)
    val env = ValuesFactory.eINSTANCE.createFallibleComplexValue
    env.setFailBehavior(FailBehaviorsEnum.ERROR)
    env.getMixed.add(ValuesPackage.eINSTANCE.getComplexValue_Text, text)
    val cv = ValuesFactory.eINSTANCE.createComplexValue
    cv.getMixed.add(ValuesPackage.eINSTANCE.getComplexValue_EnvVar, env)
    cv
  }

  def genDispatcher(uri: URI, config: GenLogicConfig): Unit = {
    import scala.reflect.runtime.universe._
    val saturn = SaturnFactory.eINSTANCE.createSaturn
    saturn.setName("RUN_BOOK_SATURN")
    val testCasesJson = FileResourceFactory.eINSTANCE.createJsonFile
    testCasesJson.setName("TEST_CASES")
    testCasesJson.setDeviceResource {
      val dev = FileResourceFactory.eINSTANCE.createDeviceFile
      dev.setFileName(envVarCV("TEST_CASES"))
      dev
    }
    saturn.getResources.add(testCasesJson)
    val runScenario = SaturnFactory.eINSTANCE.createRunGroup
    runScenario.setName("RUN_SCENARIO")
    runScenario.setRepetitionHandler {
      val rep = RepetitionFactory.eINSTANCE.createForEachRepetition
      rep.setDataSetResource {
        val dev = FileResourceFactory.eINSTANCE.createDeviceFile
        dev.setFileName(envVarCV("SCENARIOS"))
        val csv = FileResourceFactory.eINSTANCE.createCSVFile
        csv.setDeviceResource(dev)
        csv
      }
      scenariosColumns.foreach { c =>
        val colMap = RepetitionFactory.eINSTANCE.createColumnMapping
        colMap.setColumn(c)
        colMap.setAttribute(c)
        rep.getColumnMappings.add(colMap)
      }
      rep
    }
    val start = SaturnFactory.eINSTANCE.createNoopTerminal
    start.setName("START")
    runScenario.getRunGroups.add(start)
    scenarioDefs.foreach { scenarioDef =>   
      val call = SaturnFactory.eINSTANCE.createKronusStep
      call.setName("CALL_" + scenarioDef.name)
      val conf = BackportFactory.eINSTANCE.createKronusCallConfiguration
      conf.setDef(scenarioDef.name)
      conf.getArguments.add {
        val arg = ProcedureCallModuleFactory.eINSTANCE.createResourceArgument
        arg.setName(scenarioParms)
        val ref = ReferenceResourceFactory.eINSTANCE.createReferenceResource
        ref.setResource("TEST_CASES")
        arg.setResource(ref)
        arg
      }
      conf.getArguments.add {
        val arg = ProcedureCallModuleFactory.eINSTANCE.createAttributeArgument
        arg.setName(testCaseParm)
        val ref = ValuesFactory.eINSTANCE.createReferenceComplexValue
        ref.setUserAttribute(scenariosColumns(4))
        val cv = ValuesFactory.eINSTANCE.createComplexValue
        cv.getMixed.add(FeatureMapUtil.createEntry(ValuesPackage.eINSTANCE.getComplexValue_Reference, ref))
        arg.setValue(cv)
        arg
      }
      call.setKronusCallConfiguration(conf)
      scenarios.find(_.definition.name == scenarioDef.name).foreach(_.ALMMapping.foreach(call.setAlmId(_)))
      runScenario.getRunGroups.add(call)
      val link = SaturnFactory.eINSTANCE.createCustomLink
      link.setSource(start)
      link.setTarget(call)
      val code = ValuesFactory.eINSTANCE.createComplexValue
      ; {
        val scenarioRef = ValuesFactory.eINSTANCE.createReferenceComplexValue
        scenarioRef.setUserAttribute(scenariosColumns(1))
        code.getMixed.add(ValuesPackage.eINSTANCE.getComplexValue_Reference, scenarioRef)
        val text = ValuesFactory.eINSTANCE.createTextComplexValue
        text.setText(" == " + Literal(Constant(scenarioDef.name))+" && ")
        code.getMixed.add(ValuesPackage.eINSTANCE.getComplexValue_Text, text)

        val enabledRef = ValuesFactory.eINSTANCE.createReferenceComplexValue
        enabledRef.setUserAttribute(scenariosColumns(0))
        code.getMixed.add(ValuesPackage.eINSTANCE.getComplexValue_Reference, enabledRef)
        val text2 = ValuesFactory.eINSTANCE.createTextComplexValue
        text2.setText(".toBoolean")
        code.getMixed.add(ValuesPackage.eINSTANCE.getComplexValue_Text, text2)

      }
      link.setCode(code)
      saturn.getLinks.add(link)
    }

    if(config.parallel > 1){
      runScenario.setCanMultiplex(true)
      runScenario.setMaxSimultaneousIterations(BigInteger.valueOf(config.parallel.intValue()))
    }

    saturn.getRunGroups.add(runScenario)
    val doc = SaturnFactory.eINSTANCE.createDocumentRoot
    doc.setSaturn(saturn)
    val resourceSet = new ResourceSetImpl
    resourceSet.getResourceFactoryRegistry.getExtensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
                                                                        new SaturnResourceFactoryImpl)
    val resource = resourceSet.createResource(uri)
    resource.getContents.add(doc)
    resource.save(null)
  }

  protected def withWriter(file: Path)(f: PrintWriter => Unit): Unit = {
    Option(file.getParent).foreach(Files.createDirectories(_))
    val writer = new PrintWriter(file.toFile)
    try f(writer) finally writer.close()
  }

  protected def update(file: Path)(f: Path => Unit): Boolean = {
    Option(file.getParent).foreach(Files.createDirectories(_))
    val tmp = Files.createTempFile(null, null)
    f(tmp)
    val updated = !FileUtils.contentEquals(tmp.toFile, file.toFile)
    if (updated) Files.copy(tmp, file, StandardCopyOption.REPLACE_EXISTING)
    updated
  }

  def genLogic(scenarioLogic: Path, dispatcher: Path, conf: GenLogicConfig): Unit = {
    log(s"Generating scenario logic to file: $scenarioLogic")
    val paths = genScenarioLogic(scenarioLogic, conf)
    log(s"Generating dispatcher to file: $dispatcher")
    update(dispatcher)(f => genDispatcher(URI.createFileURI(f.toString), conf))
    log(s"Generating kronusRepo.yml to file: ${conf.kronusRepoFile}")
    update(conf.kronusRepoFile)(withWriter(_)(genKronusYaml(_, paths, dispatcher, conf)))
  }

  def genData(testCases: Path, scenarios: Path, storesFile: Path): Unit = {
    log(s"Generating test cases to file: $testCases")
    withWriter(testCases)(genTestCases)
    log(s"Generating scenarios to file: $scenarios")
    withWriter(scenarios)(genScenarios)
    log("Generating stores to file: " + storesFile)
    withWriter(storesFile)(genStores)
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
