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
import com.ms.qaTools.toolkit.RunCmdsResult

sealed class RunCmdsConsoleNotifier[ResultType <: InterpreterResult]() extends ConsoleNotifier[RunCmdsResult[ResultType]] {
  def print(command: String, message: Option[String], exception: Option[Throwable],
            exitCode: Option[Int])(implicit sc: SaturnExecutionContext) = sc.logger.synchronized {
    implicit val noColor = sc.noOutputColor

    sc.logger.debug(spaces(1) + "Command: ".blue + command)
    sc.logger.debug(spaces(2) + "Message: ".blue + message.getOrElse("N/A!"))
    exception match {
      case Some(e) => {
        sc.logger.trace(spaces(2) + "Stack Trace:".red.bold)
        sc.logger.trace(spaces(2) + ExceptionUtils.getStackTrace(e).red)
        sc.outputVerbosity match {
          case TRACE() =>
          case _       => sc.logger.debug(spaces(2) + "Error Message: ".blue + { Option(e.getMessage).getOrElse(e.getCause.getMessage).trim }.red)
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
        e = firstException(r.exception, r.stderr.map(new Exception(_)), c.exception)
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
