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
import com.ms.qaTools.{toolkit => tk}

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
      case IteratorFutureException(cause, _) => {
        sc.logger.info("%s(%s) - %s".format(name.blue.bold.reset, runGroupType.blue, "FAIL".red))
        sc.logger.trace("Trace:".red.bold)
        sc.logger.trace(spaces(1) + ExceptionUtils.getStackTrace(cause).replaceAll("\n", "\n" + spaces(1)).red)
        sc.outputVerbosity match {
          case TRACE() =>
          case _       => sc.logger.info(cause.getCauseStackString.red)
        }
      }
      case IterationFutureException(cause, _) => {
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

  def resultShouldShowDetails(result: tk.Result, metaData: Seq[Any])(implicit sc: SaturnExecutionContext) = {
    implicit val noColor: Boolean = sc.noOutputColor
    def _resultShouldShowDetails(result: tk.Result, verbosityLevel: VerbosityLevel) = verbosityLevel match {
      case TRACE() => true
      case DEBUG() => true
      case DEBUG_ON_STATUS() => verbosityLevel match {
        case DEBUG_ON_PASS() => result.status == tk.Passed
        case DEBUG_ON_FAIL() => result.status == tk.Failed
      }
      case _ => false
    }
    _resultShouldShowDetails(result, sc.outputVerbosity) || metaData.collect { case v: VerbosityLevel => v }
      .map(_resultShouldShowDetails(result, _)).headOption.getOrElse(false)
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
