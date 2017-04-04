package com.ms.qaTools.saturn.lint

import com.ms.qaTools.ecore.utils.ECoreStringUtils
import com.ms.qaTools.saturn.dsl.SaturnDeserializer
import com.ms.qaTools.saturn.utils.SaturnEObjectUtils.SaturnEObjectHelper
import scala.util.Try
import com.ms.qaTools.saturn.codeGen.SaturnCodeGenUtil
import com.ms.qaTools.saturn.RunGroup
import scala.util.Success
import scala.util.Failure

object SaturnLintApp extends App {
  val saturnFileName = args(0)

  val saturnLintResultTry = for {
    codeGenUtil        <- SaturnCodeGenUtil.createFromFileName(saturnFileName)
    saturnLintResult   <- SaturnLintRunner(codeGenUtil).run
  } yield saturnLintResult

  saturnLintResultTry match {
    case Success(saturnLintResult) => for(r <- saturnLintResult.validationResults) {
                                        println(validationResultToString(r))
                                      }
    case Failure(e)                => println(e)
  }

  def validationResultToString(validationResult:SaturnLintRuleResult):String = {
    val eObjectsStr = (if(validationResult.eObjects.isEmpty) "" else "\n  ") + validationResult.eObjects.map{_.eObjectToPath}.mkString("\n  ")
    s"""${validationResult.status}, ${validationResult.rule}, ${validationResult.description}${eObjectsStr}"""
  }
}
