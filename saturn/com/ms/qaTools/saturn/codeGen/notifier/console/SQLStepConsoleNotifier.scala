package com.ms.qaTools.saturn.codeGen.notifier.console

import org.apache.commons.lang.exception.ExceptionUtils

import com.ms.qaTools.ThrowableUtil
import com.ms.qaTools.saturn.codeGen.IterationResult
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import com.ms.qaTools.saturn.runtime.TRACE
import com.ms.qaTools.saturn.runtime.notifier.console.spaces
import com.ms.qaTools.saturn.runtime.notifier.console.stringToAnsiColorString
import com.ms.qaTools.toolkit.sql.SQLCallResult
import com.ms.qaTools.toolkit.sql.SQLClearResult
import com.ms.qaTools.toolkit.sql.SQLExecuteResult
import com.ms.qaTools.toolkit.sql.SQLFetchResult
import com.ms.qaTools.toolkit.sql.SQLLoadResult

sealed class SQLStepConsoleNotifier[ResultType] extends ConsoleNotifier[ResultType] {
  override def notifyAfterIteration(name: String, result: IterationResult[ResultType])(implicit sc: SaturnExecutionContext) = sc.logger.synchronized {
    super.notifyAfterIteration(name, result)
    implicit val noColor = sc.noOutputColor

    sc.logger.changeLogLevelDuringRuntime(result) {
      logPrintMetaDatas(result.context.metaDataContexts, Seq("DatabaseResource"), 1)    
    }
  }

}

case object SQLFetchOperationConsoleNotifier extends SQLStepConsoleNotifier[SQLFetchResult] {
  override val runGroupType = "SQLFetch"

  override def notifyAfterIteration(name: String, result: IterationResult[SQLFetchResult])(implicit sc: SaturnExecutionContext) = sc.logger.synchronized {
    super.notifyAfterIteration(name, result)
    implicit val noColor = sc.noOutputColor

    sc.logger.changeLogLevelDuringRuntime(result) {
      sc.logger.debug(spaces(1) + "Fetch Operations:".blue)
      for { (query, i) <- result.moduleResult.queries.zipWithIndex } {
        sc.logger.debug(spaces(2) + s"Query #$i".blue)
        sc.logger.debug(spaces(3) + "Sql: ".blue + query.query)
        logPrintMetaDatas(result.context.metaDataContexts, Seq(s"ParameterFile_$i", s"Output_$i"), 3)

        for { e <- query.exception } {
          sc.logger.trace("Stack Trace:".red.bold)
          sc.logger.trace(spaces(1) + ExceptionUtils.getStackTrace(e).red)
          sc.outputVerbosity match {
            case TRACE() =>
            case _       => sc.logger.debug(e.getCauseStackString.red)
          }
        }
      }
      sc.logger.debug("")
    }
  }

}

case object SQLExecuteOperationConsoleNotifier extends SQLStepConsoleNotifier[SQLExecuteResult] {
  override val runGroupType = "SQLExecute"

  override def notifyAfterIteration(name: String, result: IterationResult[SQLExecuteResult])(implicit sc: SaturnExecutionContext) = sc.logger.synchronized {
    super.notifyAfterIteration(name, result)
    implicit val noColor = sc.noOutputColor

    sc.logger.changeLogLevelDuringRuntime(result) {
      sc.logger.debug(spaces(1) + "Execute Operations:".blue)
      for {
        (statement, i) <- result.moduleResult.statements.zipWithIndex
      } {
        sc.logger.debug(spaces(2) + s"Execute Operation #$i".blue)
        sc.logger.debug(spaces(3) + "Sql: ".blue + statement.statement)
        for { e <- statement.exception } {
          sc.logger.trace("Stack Trace:".red.bold)
          sc.logger.trace(spaces(1) + ExceptionUtils.getStackTrace(e).red)
          sc.outputVerbosity match {
            case TRACE() =>
            case _       => sc.logger.debug(e.getCauseStackString.red)
          }
        }
      }
      sc.logger.debug("")
    }
  }
}

case object SQLClearOperationConsoleNotifier extends SQLStepConsoleNotifier[SQLClearResult] {
  override val runGroupType = "SQLClear"

  override def notifyAfterIteration(name: String, result: IterationResult[SQLClearResult])(implicit sc: SaturnExecutionContext) = sc.logger.synchronized {
    super.notifyAfterIteration(name, result)
    implicit val noColor = sc.noOutputColor

    sc.logger.changeLogLevelDuringRuntime(result) {
      sc.logger.debug(spaces(1) + "Clear Operations:".blue)
      for {
        (action, i) <- result.moduleResult.actions.zipWithIndex
      } {
        sc.logger.debug(spaces(2) + s"Clear Operation #$i".blue)
        sc.logger.debug(spaces(3) + "Table: ".blue + action.table)
        for { e <- action.exception } {
          sc.logger.trace("Stack Trace:".red.bold)
          sc.logger.trace(spaces(1) + ExceptionUtils.getStackTrace(e).red)
          sc.outputVerbosity match {
            case TRACE() =>
            case _       => sc.logger.debug(e.getCauseStackString.red)
          }
        }
      }
      sc.logger.debug("")
    }
  }
}

case object SQLCallOperationConsoleNotifier extends SQLStepConsoleNotifier[SQLCallResult] {
  override val runGroupType = "SQLCall"

  override def notifyAfterIteration(name: String, result: IterationResult[SQLCallResult])(implicit sc: SaturnExecutionContext) = sc.logger.synchronized {
    super.notifyAfterIteration(name, result)
    implicit val noColor = sc.noOutputColor

    sc.logger.changeLogLevelDuringRuntime(result) {
      sc.logger.debug(spaces(1) + "Call Operations:".blue)
      for { (call, i) <- result.moduleResult.calls.zipWithIndex } {
        sc.logger.debug(spaces(2) + s"Call Operation #$i".blue)
        sc.logger.debug(spaces(3) + "Procedure: ".blue + call.procedure)

        logPrintMetaDatas(result.context.metaDataContexts, Seq(s"ParameterFile_$i", s"Output_$i"), 3)

        for { e <- call.exception } {
          sc.logger.trace("Stack Trace:".red.bold)
          sc.logger.trace(spaces(1) + ExceptionUtils.getStackTrace(e).red)
          sc.outputVerbosity match {
            case TRACE() =>
            case _       => sc.logger.debug(e.getCauseStackString.red)
          }
        }
      }
      sc.logger.debug("")
    }
  }
}

case object SQLLoadOperationConsoleNotifier extends SQLStepConsoleNotifier[SQLLoadResult] {
  override val runGroupType = "SQLLoad"

  override def notifyAfterIteration(name: String, result: IterationResult[SQLLoadResult])(implicit sc: SaturnExecutionContext) = sc.logger.synchronized {
    super.notifyAfterIteration(name, result)
    implicit val noColor = sc.noOutputColor

    sc.logger.changeLogLevelDuringRuntime(result) {
      sc.logger.debug(spaces(1) + "Load Operations:".blue)
      for {
        (action, i) <- result.moduleResult.actions.zipWithIndex
      } {
        sc.logger.debug(spaces(2) + s"Load Operation #$i".blue)
        sc.logger.debug(spaces(3) + "Table: ".blue + action.table)

        logPrintMetaDatas(result.context.metaDataContexts, Seq(s"Input_$i"), 3)

        for { e <- action.exception } {
          sc.logger.trace("Stack Trace:".red.bold)
          sc.logger.trace(spaces(1) + ExceptionUtils.getStackTrace(e).red)
          sc.outputVerbosity match {
            case TRACE() =>
            case _       => sc.logger.debug(e.getCauseStackString.red)
          }
        }
      }
      sc.logger.debug("")
    }
  }
}
