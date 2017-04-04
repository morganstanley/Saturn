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
