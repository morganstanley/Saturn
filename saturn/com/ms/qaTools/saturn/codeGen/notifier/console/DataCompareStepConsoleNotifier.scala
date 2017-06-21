package com.ms.qaTools.saturn.codeGen.notifier.console

import org.apache.commons.lang.exception.ExceptionUtils

import com.ms.qaTools.ThrowableUtil
import com.ms.qaTools.saturn.codeGen.IterationResult
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import com.ms.qaTools.saturn.runtime.notifier.console.spaces
import com.ms.qaTools.saturn.runtime.notifier.console.stringToAnsiColorString
import com.ms.qaTools.toolkit.dsCompare.DsCompareResult
import com.ms.qaTools.saturn.runtime.TRACE

case object DataCompareStepConsoleNotifier extends ConsoleNotifier[DsCompareResult] {
  override val runGroupType = "DsCompare"

  override def notifyAfterIteration(name: String, result: IterationResult[DsCompareResult])(implicit sc: SaturnExecutionContext) = sc.logger.synchronized {
    super.notifyAfterIteration(name, result)
    implicit val noColor: Boolean = sc.noOutputColor

    sc.logger.changeLogLevelDuringRuntime(result) {
      logPrintMetaDatas(result.context.metaDataContexts, Seq("Left", "Right", "Output"), 1)
      val counter = result.moduleResult.counter
      sc.logger.debug(spaces(1) + "Summary:")
      sc.logger.debug(spaces(2) + "Left: "          + counter.left)
      sc.logger.debug(spaces(2) + "Right: "         + counter.right)
      sc.logger.debug(spaces(2) + "Different: "     + counter.different)
      sc.logger.debug(spaces(2) + "In Left Only: "  + counter.inLeftOnly)
      sc.logger.debug(spaces(2) + "In Right Only: " + counter.inRightOnly)
      sc.logger.debug(spaces(2) + "Explained: "     + counter.explained)
      sc.logger.debug(spaces(2) + "Identical: "     + counter.identical)

      for (e <- result.moduleResult.exception) {
        sc.logger.trace("Stack Trace:".red.bold)
        sc.logger.trace(spaces(1) + ExceptionUtils.getStackTrace(e).red)
        sc.outputVerbosity match {
          case TRACE() =>
          case _       => sc.logger.debug(e.getCauseStackString.red)
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
