package com.ms.qaTools.saturn.codeGen.notifier.console

import org.apache.commons.lang.exception.ExceptionUtils

import com.ms.qaTools.ThrowableUtil
import com.ms.qaTools.saturn.codeGen.IterationResult
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import com.ms.qaTools.saturn.runtime.TRACE
import com.ms.qaTools.saturn.runtime.notifier.console.spaces
import com.ms.qaTools.saturn.runtime.notifier.console.stringToAnsiColorString
import com.ms.qaTools.toolkit.Result

case object XmlManipStepConsoleNotifier extends ConsoleNotifier[Result] {
  override val runGroupType = "XmlManip"

  override def notifyAfterIteration(name: String, result: IterationResult[Result])(implicit sc: SaturnExecutionContext) = sc.logger.synchronized {
    super.notifyAfterIteration(name, result)
    implicit val noColor: Boolean = sc.noOutputColor

    sc.logger.changeLogLevelDuringRuntime(result) {
      logPrintMetaDatas(result.context.metaDataContexts, Seq("InputResource", "OutputResource", "Namespaces"), 1)

      val metaDataContexts = result.context.metaDataContexts
      sc.logger.debug(spaces(1) + "XML Manip Operations:".blue)
      for (mdc <- result.context.metaDataContexts) {
        mdc._1 match {
          case "AddOperation" =>
            sc.logger.debug(spaces(2) + "Add Operation:".blue)
            logPrintMetaDatas(mdc._2.metaDataContexts, Seq("Nodename", "Value", "Parent", "Uri"), 3)
          case "DeleteOperation" =>
            sc.logger.debug(spaces(2) + "Delete Operation:".blue)
            logPrintMetaDatas(mdc._2.metaDataContexts, Seq("XPaths"), 3)
          case "ReplaceOperation" =>
            sc.logger.debug(spaces(2) + "Replace Operation:".blue)
            logPrintMetaDatas(mdc._2.metaDataContexts, Seq("Search", "Replace"), 3)
          case "ExtractOperation" =>
            sc.logger.debug(spaces(2) + "Extract Operation:".blue)
            logPrintMetaDatas(mdc._2.metaDataContexts, Seq("XPath"), 3)
          case "SplitOperation" =>
            sc.logger.debug(spaces(2) + "Split Operation:".blue)
            logPrintMetaDatas(mdc._2.metaDataContexts, Seq("Keys", "Output"), 3)
          case "WhereOperation" =>
            sc.logger.debug(spaces(2) + "Where Operation:".blue)
            logPrintMetaDatas(mdc._2.metaDataContexts, Seq("XPath"), 3)
          case _ =>
        }
      }

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
