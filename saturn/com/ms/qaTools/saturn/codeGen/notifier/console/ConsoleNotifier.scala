package com.ms.qaTools.saturn.codeGen.notifier.console

import org.apache.commons.lang.exception.ExceptionUtils

import com.ms.qaTools.ThrowableUtil
import com.ms.qaTools.saturn.codeGen.IterationFutureException
import com.ms.qaTools.saturn.codeGen.IterationResult
import com.ms.qaTools.saturn.codeGen.IteratorFutureException
import com.ms.qaTools.saturn.codeGen.IteratorResult
import com.ms.qaTools.saturn.codeGen.PreIterationResult
import com.ms.qaTools.saturn.codeGen.PreIteratorResult
import com.ms.qaTools.saturn.codeGen.notifier.Notifier
import com.ms.qaTools.saturn.runtime.DEBUG
import com.ms.qaTools.saturn.runtime.DEBUG_ON_FAIL
import com.ms.qaTools.saturn.runtime.DEBUG_ON_PASS
import com.ms.qaTools.saturn.runtime.DEBUG_ON_STATUS
import com.ms.qaTools.saturn.runtime.QUIET
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import com.ms.qaTools.saturn.runtime.TRACE
import com.ms.qaTools.saturn.runtime.VerbosityLevel
import com.ms.qaTools.saturn.runtime.notifier.console.spaces
import com.ms.qaTools.saturn.runtime.notifier.console.stringToAnsiColorString
import com.ms.qaTools.toolkit.Result

abstract class ConsoleNotifier[ResultType] extends Notifier[ResultType] {
  def notifyBeforeIterator(name: String, result: PreIteratorResult[ResultType])(implicit sc: SaturnExecutionContext) = {}
  def notifyAfterIterator(name: String, result: IteratorResult[ResultType])(implicit sc: SaturnExecutionContext) = sc.logger.synchronized {
    implicit val noColor: Boolean = sc.noOutputColor
    result.writeToStdout(name, runGroupType)
  }

  def notifyBeforeIteration(name: String, result: PreIterationResult[ResultType])(implicit sc: SaturnExecutionContext) = {}

  def notifyAfterIteration(name: String, result: IterationResult[ResultType])(implicit sc: SaturnExecutionContext) = sc.logger.synchronized {
    implicit val noColor: Boolean = sc.noOutputColor
    result.writeToStdout(name, runGroupType)
  }
  def notifyException(name: String, t: Throwable)(implicit sc: SaturnExecutionContext) = sc.logger.synchronized {
    implicit val noColor: Boolean = sc.noOutputColor
    t match {
      case IteratorFutureException(cause) => {
        sc.logger.info("%s(%s) - %s".format(name.blue.bold.reset, runGroupType.blue, "FAIL".red))
        sc.logger.trace("Trace:".red.bold)
        sc.logger.trace(spaces(1) + ExceptionUtils.getStackTrace(cause).replaceAll("\n", "\n" + spaces(1)).red)
        sc.outputVerbosity match {
          case TRACE() =>
          case _       => sc.logger.info(cause.getCauseStackString.red)
        }
      }
      case IterationFutureException(cause) => {
        sc.logger.info("%s(%s) - %s".format(name.blue.bold.reset, runGroupType.blue, "FAIL".red))
        sc.logger.trace("Trace:".red.bold)
        sc.logger.trace(spaces(1) + ExceptionUtils.getStackTrace(cause).replaceAll("\n", "\n" + spaces(1)).red)
        sc.outputVerbosity match {
          case TRACE() =>
          case _       => sc.logger.info(cause.getCauseStackString.red)
        }
      }
    }
    sc.logger.info("")
  }

  def resultShouldShowDetails(result: Result, metaData: Seq[Any])(implicit sc: SaturnExecutionContext) = {
    implicit val noColor: Boolean = sc.noOutputColor
    def _resultShouldShowDetails(result: Result, verbosityLevel: VerbosityLevel) = verbosityLevel match {
      case TRACE() => true
      case DEBUG() => true
      case DEBUG_ON_STATUS() => verbosityLevel match {
        case DEBUG_ON_PASS() => result.passed
        case DEBUG_ON_FAIL() => result.failed
      }
      case _ => false
    }
    _resultShouldShowDetails(result, sc.outputVerbosity) || metaData.collect { case v: VerbosityLevel => v }
      .map(_resultShouldShowDetails(result, _)).headOption.getOrElse(false)
  }
}
