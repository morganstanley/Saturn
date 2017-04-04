package com.ms.qaTools.saturn.codeGen

import scala.util.Try

import com.ms.qaTools.codeGen.scala.ForAssignment
import com.ms.qaTools.codeGen.scala.ForTryExpr
import com.ms.qaTools.codeGen.scala.ScalaExpr
import com.ms.qaTools.codeGen.scala.TryExpr
import com.ms.qaTools.codeGen.scala.TryGen
import com.ms.qaTools.saturn.listeners.{ScenarioReportListener => MScenarioReportListener}

object ScenarioReportListenerGenerator {
  def apply(s: MScenarioReportListener): Try[TryGen] = {
    Option(s) match {
      case None => Try { TryExpr("") }
      case Some(r) => {
        for {
          deviceResourceTryGen <- ResourceGenerator(s.getOutput(), withConnectTry = false)
        } yield {
          ForTryExpr(
            Seq(ForAssignment("output", deviceResourceTryGen)), 
            ScalaExpr(s"""ScenarioReportListener(output, "${s.getTitle()}")"""))
        }
      }
    }

  }
}
