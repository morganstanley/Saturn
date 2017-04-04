package com.ms.qaTools.saturn.codeGen
import scala.util.Try
import com.ms.qaTools.codeGen.scala.StringExpr
import com.ms.qaTools.codeGen.scala.TryExpr
import com.ms.qaTools.saturn.annotations.saturnReport.{ SaturnReportConfiguration => MSaturnReportConfiguration }
import com.ms.qaTools.codeGen.scala.ForTryExpr
import com.ms.qaTools.codeGen.scala.ForAssignment
import com.ms.qaTools.codeGen.scala.ScalaExpr
import com.ms.qaTools.saturn.annotations.saturnReport.ResultStatus

object ScenarioAnnotationGenerator {
  val statusGen: ResultStatus => String = {
    case ResultStatus.PASS => "OnPassResultStatus"
    case ResultStatus.FAIL => "OnFailResultStatus"
    case ResultStatus.ANY  => "OnAnyResultStatus"
    case _                 => "OnAnyResultStatus"
  }

  def apply(annotation: MSaturnReportConfiguration,
            isInIteration: Boolean) = {
    Option(annotation) match {
      case Some(a) => for {
        nameTryGen <- {
          Option(if (isInIteration) a.getRepetitionName else a.getName).map(ComplexValueStringGenerator(_))
        }.getOrElse(Try{TryExpr("null")})
        titleTryGen <- {
          Option(if (isInIteration) a.getRepetitionTitle else a.getTitle).map(ComplexValueStringGenerator(_))
        }.getOrElse(Try{TryExpr("null")})
      } yield
        ForTryExpr(Seq(ForAssignment("name", nameTryGen),
                       ForAssignment("title", titleTryGen)),
                   ScalaExpr(s"""ScenarioAnnotation(Option(name),
                                                    Option(title),
                                                    ${statusGen(a.getOnStatus)},
                                                    ${a.isIsScenario},
                                                    ${a.isExpandOnPass},
                                                    Option(${statusGen(a.getExpandOnStatus)}),
                                                    ${a.isHideHeader},
                                                    ${a.isHideRepeatingHeader},
                                                    ${a.isHideContent},
                                                    ${a.isHideRepeatingContent},
                                                    ${a.isShowIterationNo},
                                                    ${a.isIgnored})"""))
      case None => Try(TryExpr(StringExpr("")))
    }
  }
}