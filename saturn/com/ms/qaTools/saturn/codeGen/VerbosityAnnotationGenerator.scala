package com.ms.qaTools.saturn.codeGen

import scala.util.Try

import com.ms.qaTools.codeGen.scala.TryExpr
import com.ms.qaTools.codeGen.scala.TryGen
import com.ms.qaTools.saturn.annotations.saturnVerbosity.SaturnVerbosityConfiguration
import com.ms.qaTools.saturn.annotations.saturnVerbosity.VerbosityEnum

object VerbosityAnnotationGenerator {
  def apply(annotation: SaturnVerbosityConfiguration): Try[TryGen] = {
    Try {
      Option(annotation) map { annotation =>
        val verbosity = annotation.getVerbosity() match {
          case VerbosityEnum.QUIET       => "QUIET()"
          case VerbosityEnum.NORMAL      => "NORMAL()"
          case VerbosityEnum.DEBUG       => "DEBUG()"
          case VerbosityEnum.DEBUGONPASS => "DEBUG_ON_PASS()"
          case VerbosityEnum.DEBUGONFAIL => "DEBUG_ON_FAIL()"
        }
        TryExpr(verbosity)
      } getOrElse (TryExpr(""))
    }
  }
}