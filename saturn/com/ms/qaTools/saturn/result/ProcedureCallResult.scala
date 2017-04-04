package com.ms.qaTools.saturn.result

import scala.util.Failure
import scala.util.Success
import scala.util.Try

import com.ms.qaTools.saturn.codeGen.IteratorResult
import com.ms.qaTools.toolkit.Failed
import com.ms.qaTools.toolkit.Passed
import com.ms.qaTools.toolkit.Result

sealed trait ProcedureCallResult extends Result {
  val referentName: String
  val iteratorResult: Try[IteratorResult[Result]]
}

case class PassedProcedureCallResult(val referentName: String, val iteratorResult: Try[IteratorResult[Result]]) extends ProcedureCallResult { override val status = Passed() }
case class FailedProcedureCallResult(val referentName: String, val iteratorResult: Try[IteratorResult[Result]], override val exception: Option[Throwable]) extends ProcedureCallResult { override val status = Failed() }

object ProcedureCallResult {
  def apply(referentName: String, result: Try[IteratorResult[Result]]): ProcedureCallResult = {
    (result map { iteratorResult =>
      if (iteratorResult.status.passed) PassedProcedureCallResult(referentName, result)
      else FailedProcedureCallResult(referentName, result, iteratorResult.exception)
    }) match {
      case Success(r) => r
      case Failure(t) => FailedProcedureCallResult(referentName, result, Option(t))
    }
  }
}
