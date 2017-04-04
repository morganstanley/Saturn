package com.ms.qaTools.saturn.codeGen

import scala.collection.JavaConversions.asScalaBuffer
import scala.util.{Try, Success}
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.FeatureMap
import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.codeGen.scala.ConnectTry
import com.ms.qaTools.codeGen.scala.ForAssignment
import com.ms.qaTools.codeGen.scala.ForTryExpr
import com.ms.qaTools.codeGen.scala.ScalaExpr
import com.ms.qaTools.codeGen.scala.ScalaGen
import com.ms.qaTools.codeGen.scala.StringExpr
import com.ms.qaTools.codeGen.scala.TryExpr
import com.ms.qaTools.codeGen.scala.TryFnExpr
import com.ms.qaTools.codeGen.scala.TryGen
import com.ms.qaTools.codeGen.scala.TryMethodCallGen
import com.ms.qaTools.saturn.types.{InterpretersEnum => MInterpretersEnum}
import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.saturn.{AbstractRunGroup => MAbstractRunGroup}
import com.ms.qaTools.saturn.{Attribute => MAttribute}
import com.ms.qaTools.saturn.types.{NamedResourceDefinition => MNamedResourceDefinition}
import com.ms.qaTools.saturn.values.CellComplexValue
import com.ms.qaTools.saturn.values.CodeComplexValue
import com.ms.qaTools.saturn.values.{ComplexValue => MComplexValue}
import com.ms.qaTools.saturn.values.FailBehaviorsEnum.ERROR
import com.ms.qaTools.saturn.values.FailBehaviorsEnum.IGNORE
import com.ms.qaTools.saturn.values.FailBehaviorsEnum.WARN
import com.ms.qaTools.saturn.values.{Fallible => MFallible}
import com.ms.qaTools.saturn.values.JSONComplexValue
import com.ms.qaTools.saturn.values.PropertyComplexValue
import com.ms.qaTools.saturn.values.ReferenceComplexValue
import com.ms.qaTools.saturn.values.RunNumberComplexValue
import com.ms.qaTools.saturn.values.TextComplexValue
import com.ms.qaTools.saturn.values.XPathComplexValue
import com.ms.qaTools.saturn.values.{ValuesPackage, ValuesFactory}
import com.ms.qaTools.saturn.values.FIXComplexValue

object ComplexValueGenerator {
  val nullStr = ""
  val pureValueTypes = Set(classOf[TextComplexValue], classOf[ReferenceComplexValue])
  def isPure(x: Any): Boolean = pureValueTypes.exists(_.isInstance(x))
}

abstract class ComplexValueGenerator {
  import ComplexValueGenerator._

  def text:     String   => String
  def variable: String   => String
  def gen:      String   => ScalaGen
  def pureGuaranteedSuccess: Boolean

  def apply(complexValue: MComplexValue): Try[TryGen] = Option(complexValue).map { cv =>
    if (cv.getMixed.forall(e => isPure(e.getValue))) genPure(cv).map(TryExpr(_, guaranteedSuccess = pureGuaranteedSuccess))
    else genMonadic(cv)
  }.getOrElse(Try(TryExpr(gen(nullStr), guaranteedSuccess = true)))

  def genPure(complexValue: MComplexValue): Try[ScalaGen] = Try {
    val s = Option(complexValue).map { cv =>
      cv.getMixed.map { e =>
        render(e.getValue, (x => throw new Exception(s"$x is not a " + pureValueTypes.mkString(" or "))))
      }.mkString
    }.getOrElse(nullStr)
    gen(s)
  }

  def genMonadic(complexValue: MComplexValue): Try[TryGen] = Option(complexValue).map { cv =>
    cv.getMixed.zipWithIndex match {
      case Seq((entry, _)) =>
        doEntry(entry)
      case indexedEntries =>
        for {
          variableMap <- Try {
            new TryGen {
              override def generate(): Try[String] =
                for {
                  indexdEntryStrs <- indexedEntries.toSeq.collect {
                    case (entry, idx) if !isPure(entry.getValue) =>
                      doEntry(entry).flatMap { tryGen =>
                        tryGen.generate.map(str => (idx, str))
                      }
                  }.toTrySeq
                } yield s"ComplexValueMap(${indexdEntryStrs.map { case (idx, str) => s"($idx, $str)" }.mkString("Seq(", ",", ")")})"
            }
          }
          yieldStr <- Try {
            indexedEntries.map {
              case (entry, idx) => render(entry.getValue, Function.const(variable(s"cvMap($idx)")))
            }.mkString
          }
        } yield new TryGen {
          override def generate(): Try[String] =
            for {
              variableMapStr <- variableMap.generate
              yieldStr <- gen(yieldStr).generate
            } yield s"""{
                          val cvMapTry = $variableMapStr
                          cvMapTry.map{cvMap => $yieldStr}
                        }"""
        }
    }
  }.getOrElse(Try(TryExpr(gen(nullStr), guaranteedSuccess = true)))

  def render(x: Any, default: Any => String): String = x match {
    case text: TextComplexValue     => renderText(text)
    case ref: ReferenceComplexValue => renderReference(ref)
    case other                      => default(other)
  }

  def renderText(txt: TextComplexValue): String = text(txt.getText)

  def renderReference(ref: ReferenceComplexValue): String = {
    val prefix = Option(ref.getIncludeFile) match {
      case Some(fn) if fn.nonEmpty => fn + "."
      case _                       => ""
    }
    variable(prefix + ref.getUserAttribute)
  }

  def doEntry(entry: FeatureMap.Entry): Try[TryGen] = {
    implicit val appendOptions = ContextAppendOptions(true)
    val tryGenTry = Option(entry.getValue()) match {
      case Some(cell:CellComplexValue)  =>
        for {
          resource <- ResourceGenerator(cell.getResource())
          rowIdx <- ComplexValueStringGenerator(cell.getRow())
          columnName <- ComplexValueStringGenerator(cell.getColumn())
        } yield new TryGen {
          override def generate(): Try[String] = for {
            resourceStr <- resource.generate
            rowIdxStr <- rowIdx.generate
            columnNameStr <- columnName.generate
          } yield s"CellValueTry(context, $resourceStr, $rowIdxStr, $columnNameStr)"
        }
      case Some(code: CodeComplexValue) => Success {
        new TryGen {
          def generate() = {
            import MInterpretersEnum._
            code.getInterpreter match {
              case SCALA | PERL =>
                val eol = ValuesFactory.eINSTANCE.createTextComplexValue
                eol.setText(scala.util.Properties.lineSeparator)
                code.getMixed.add(ValuesPackage.Literals.COMPLEX_VALUE__TEXT, eol)
                for {
                  codeTry <- ComplexValueCodeGenerator(code)
                  codeTryStr <- codeTry.generate()
                } yield s"CodeScalaValueTry(context, $codeTryStr)"
              case t@(SHELL | GROOVY | DML) => for {
                codeStrTry <- ComplexValueStringGenerator(code)
                codeStrTryStr <- codeStrTry.generate()
              } yield s"CodeValueTry(context, $codeStrTryStr, ${t.getClass.getName}.$t)"
            }
          }
        }
      }
      case Some(prop:PropertyComplexValue)      =>
        for {
          resource <- ResourceGenerator(prop.getResource())
          property <- ComplexValueStringGenerator(prop.getProperty())
        } yield new TryGen {
          override def generate(): Try[String] = for {
            resourceStr <- resource.generate
            propertyStr <- property.generate
          } yield s"PropertyValueTry(context, $resourceStr, $propertyStr)"
        }
      case Some(ref:ReferenceComplexValue)      => Try{ TryExpr(ScalaExpr(renderReference(ref)), guaranteedSuccess = true) }
      case Some(runNo:RunNumberComplexValue)    => Try{ TryExpr(StringExpr("")) }
      case Some(text:TextComplexValue)          => Try{ TryExpr(StringExpr(renderText(text), noInterpolate = true), guaranteedSuccess = true) }
      case Some(xPath:XPathComplexValue)        =>
        for {
          resource <- ResourceGenerator(xPath.getResource())
          row <- ComplexValueStringGenerator(xPath.getRow())
          xPathVal <- ComplexValueStringGenerator(xPath.getXPath())
          namespace <- Option(xPath.getNamespaces()).map {
            ResourceGenerator(_) map { _.withFlatMap(TryFnExpr("_.input")) }
          }.getOrElse { Try { TryExpr(ScalaExpr("Iterator[Seq[String]]()"), guaranteedSuccess = true) } }
          fragment <- Try { xPath.isFragment }
          returnType <- Try { xPath.getReturnType }
        } yield new TryGen {
          override def generate(): Try[String] = for {
            resourceStr <- resource.generate
            rowStr <- row.generate
            xPathValStr <- xPathVal.generate
            namespaceStr <- namespace.generate
          } yield s"XPathValueTry(context, $resourceStr, $rowStr, $xPathValStr, $namespaceStr, ${fragment}, XPathConstants.${returnType})"
        }
      case Some(fixPath: FIXComplexValue) => 
        for {
          resource <- ResourceGenerator(fixPath.getResource())
          row <- ComplexValueStringGenerator(fixPath.getRow())
          fixPathVal <- ComplexValueStringGenerator(fixPath.getFIXPath())
          messageType <- ComplexValueStringGenerator(fixPath.getMessageType())
          returnType <- Try { fixPath.getReturnType }
        } yield new TryGen {
          override def generate(): Try[String] = for {
            resourceStr <- resource.generate
            rowStr <- row.generate
            fixPathValStr <- fixPathVal.generate
            messageTypeStr <- messageType.generate
          } yield s"FIXPathValueTry(context, $resourceStr, $rowStr, $fixPathValStr, $messageTypeStr, XPathConstants.${returnType})"
        }
      case Some(json: JSONComplexValue) => for {
        resource <- ResourceGenerator(json.getResource())
        row <- ComplexValueStringGenerator(json.getRow())
        jsonPath <- ComplexValueStringGenerator(json.getJSONPath())
      } yield new TryGen {
        override def generate(): Try[String] = for {
          resourceStr <- resource.generate
          rowStr <- row.generate
          jsonPathStr <- jsonPath.generate
        } yield s"JSONValueTry(context, $resourceStr, $rowStr, $jsonPathStr)"
      }
      case Some(envVar: MComplexValue) if entry.getEStructuralFeature().getName() == "envVar" => for {
        envVarGen <- ComplexValueStringGenerator(envVar)
      } yield new TryGen {
        override def generate(): Try[String] = for {
          envVarStr <- envVarGen.generate
        } yield s"EnvVarTry(context, $envVarStr)"
      }
      case Some(file: MComplexValue) if entry.getEStructuralFeature().getName() == "file" => for {
        fileGen <- ComplexValueStringGenerator(file)
      } yield new TryGen {
        override def generate(): Try[String] = for {
          filenameStr <- fileGen.generate
        } yield s"FileValueTry(context, $filenameStr)"
      }
      case None         => Try{ TryExpr(StringExpr(""), guaranteedSuccess = true) }
      case unknownEntry => Try{ throw new Exception(s"The complex value entry: $unknownEntry is not implemented.") }
    }

    entry.getValue match {
      case value: MFallible =>
        for {
          tryGen <- tryGenTry
          defVal <- ComplexValueStringGenerator(value.getDefaultValue)
        } yield value.getFailBehavior match {
          case IGNORE => TryMethodCallGen(tryGen, "orElse", Seq(defVal))
          case WARN   => TryMethodCallGen(tryGen, "warnWith",
                                          Seq(ScalaExpr("context"), StringExpr(containerPath(value), noInterpolate = true), defVal))
          case ERROR  => tryGen
        }
      case _ =>
        tryGenTry
    }
  }

  def containerPath(x: EObject): String = {
    val (xs, true) = Iterator.iterate(x)(_.eContainer).takeWhile(_ != null).foldLeft((List[String](), false)) {
      case ((xs, false), y: MAttribute)               => (y.getName :: xs, true)
      case ((xs, false), y: MNamedResourceDefinition) => (y.getName :: xs, true)
      case ((xs, false), _: MAbstractRunGroup)        => (xs, true)
      case ((xs, false), y)                           => (y.eContainingFeature.getName :: xs, false)
      case (res,         _)                           => res
    }
    xs.mkString(".")
  }
}

object ComplexValueCodeGenerator extends ComplexValueGenerator {
  def text     = identity
  def variable = identity
  def gen      = ScalaExpr(_)
  val pureGuaranteedSuccess = false
}

object ComplexValueStringGenerator extends ComplexValueGenerator {
  def text     = _.replaceAll("\\$", "\\$\\$")
  def variable = (v => s"$${$v}")
  def gen      = StringExpr(_)
  val pureGuaranteedSuccess = true
}
