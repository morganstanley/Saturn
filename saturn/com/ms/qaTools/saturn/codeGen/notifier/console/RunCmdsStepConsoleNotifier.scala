package com.ms.qaTools.saturn.codeGen.notifier.console

import org.apache.commons.lang.exception.ExceptionUtils
import scalaz._
import Scalaz._

import com.ms.qaTools.interpreter.CommandExecutorResult
import com.ms.qaTools.interpreter.GroovyInterpreterResult
import com.ms.qaTools.interpreter.InterpreterResult
import com.ms.qaTools.interpreter.NullInterpreterResult
import com.ms.qaTools.interpreter.ShellInterpreterResult
import com.ms.qaTools.saturn.codeGen.IterationResult
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import com.ms.qaTools.saturn.runtime.TRACE
import com.ms.qaTools.saturn.runtime.notifier.console.spaces
import com.ms.qaTools.saturn.runtime.notifier.console.stringToAnsiColorString
import com.ms.qaTools.toolkit.runCmds.RunCmdsResult

sealed class RunCmdsConsoleNotifier[ResultType <: InterpreterResult]() extends ConsoleNotifier[RunCmdsResult[ResultType]] {

  def print(command: String, message: Option[String], exception: Option[Throwable],
            exitCode: Option[Int])(implicit sc: SaturnExecutionContext) = sc.logger.synchronized {
    implicit val noColor = sc.noOutputColor

    sc.logger.debug(spaces(1) + "Command: ".blue + command)
    sc.logger.debug(spaces(2) + "Message: ".blue + message.getOrElse("N/A!"))
    exception match {
      case Some(e) => {
        sc.logger.trace(spaces(2) + "Stack Trace: ".red.bold)
        sc.logger.trace(spaces(2) + ExceptionUtils.getStackTrace(e).red)
        sc.outputVerbosity match {
          case TRACE() =>
          case _       => sc.logger.debug(spaces(2) + "Error Message: ".blue + { Option(e.getMessage).getOrElse(e.getCause.getMessage) }.red)
        }
      }
      case None => sc.logger.debug(spaces(2) + "ErrorMessage: ".blue + "N/A!")
    }
    sc.logger.debug(spaces(2) + "ReturnCode: ".blue + exitCode.getOrElse("N/A!"))
  }

  def firstException(ts: Option[Throwable]*): Option[Throwable] = ts map (Tags.First) reduceLeft (_ |+| _)
}

case object RunCmdsScalaConsoleNotifier extends RunCmdsConsoleNotifier[CommandExecutorResult[_]] {
  override val runGroupType = "RunCmds[Scala]"

  override def notifyAfterIteration(name: String, result: IterationResult[RunCmdsResult[CommandExecutorResult[_]]])(implicit sc: SaturnExecutionContext) = sc.logger.synchronized {
    super.notifyAfterIteration(name, result)
    sc.logger.changeLogLevelDuringRuntime(result) {
      for {
        c <- result.moduleResult.commands
        r = c.interpreterResult
        e = firstException(r.exception, r.errorMessage.map(new Exception(_)), c.exception)
      } print(r.command, c.message, e, None)
      sc.logger.debug("")
    }
  }
}

case object RunCmdsShellConsoleNotifier extends RunCmdsConsoleNotifier[ShellInterpreterResult] {
  override val runGroupType = "RunCmds[Shell]"

  override def notifyAfterIteration(name: String, result: IterationResult[RunCmdsResult[ShellInterpreterResult]])(implicit sc: SaturnExecutionContext) = sc.logger.synchronized {
    super.notifyAfterIteration(name, result)
    sc.logger.changeLogLevelDuringRuntime(result) {
      for {
        c <- result.moduleResult.commands
        r = c.interpreterResult
        e = firstException(r.exception, r.errorMessage.map(new Exception(_)), c.exception)
      } print(r.command, c.message, e, r.exitCode)
      sc.logger.debug("")
    }
  }
}

case object RunCmdsGroovyConsoleNotifier extends RunCmdsConsoleNotifier[GroovyInterpreterResult] {
  override val runGroupType = "RunCmds[Groovy]"

  override def notifyAfterIteration(name: String, result: IterationResult[RunCmdsResult[GroovyInterpreterResult]])(implicit sc: SaturnExecutionContext) = sc.logger.synchronized {
    super.notifyAfterIteration(name, result)
    sc.logger.changeLogLevelDuringRuntime(result) {
      for {
        c <- result.moduleResult.commands
        r = c.interpreterResult
        e = firstException(r.exception, r.errorMessage.map(new Exception(_)), c.exception)
      } print(r.command, c.message, e, None)
      sc.logger.debug("")
    }
  }
}

case object RunCmdsDmlConsoleNotifier extends RunCmdsConsoleNotifier[NullInterpreterResult.type] {
  override val runGroupType = "RunCmds[Dml]"
}

case object RunCmdsPerlConsoleNotifier extends RunCmdsConsoleNotifier[CommandExecutorResult[_]] {
  override val runGroupType = "RunCmds[Scala]"
}
