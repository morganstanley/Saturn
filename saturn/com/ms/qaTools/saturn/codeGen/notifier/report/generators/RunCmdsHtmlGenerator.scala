package com.ms.qaTools.saturn.codeGen.notifier.report.generators

import org.jsoup.nodes.Element

import com.ms.qaTools.interpreter.CommandExecutorResult
import com.ms.qaTools.interpreter.GroovyInterpreterResult
import com.ms.qaTools.interpreter.ScalaInterpreterResult
import com.ms.qaTools.interpreter.ShellInterpreterResult
import com.ms.qaTools.saturn.codeGen.IterationResult
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import com.ms.qaTools.saturn.runtime.notifier.html.stringToHtmlColorizedString
import com.ms.qaTools.toolkit.RunCmdsResult

case class RunCmdsHtmlGenerator(implicit sc: SaturnExecutionContext) extends BasicHtmlGenerator {
  override def runGroupIconClassName: String = "runCmdIcon"
  override def runGroupType: String = "RunCmds"

  override def generateIterationResult(name: String, fullName: String, result: IterationResult[Any], parentElement: Element, asScenario: Boolean = false, displayIterationNo: Boolean = true): Unit = {

    result.moduleResult match {
      case RunCmdsResult(status, commandsResults, exception) => {
        val table = createTable(parentElement)
        for(commandResult <- commandsResults) {
          commandResult.interpreterResult match {
            case r: ShellInterpreterResult   => addRow(table, r.command, r.stdout, r.stderr, r.exception, r.exitCode)
            case r: ScalaInterpreterResult   => addRow(table, r.command, None, r.errorMessage, r.exception, None)
            case r: GroovyInterpreterResult  => addRow(table, r.command, None, r.errorMessage, r.exception, None)
            case r: CommandExecutorResult[_] => addRow(table, r.command, None, r.errorMessage, r.exception, None)
          }
        }
      }
      case r => throw new Exception(s"RunCmdsHtmlGenerator cannot handle this type of result: ${r.getClass.getName}")
    }
  }

  def createTable(parentElement: Element) = {
    val table = parentElement.appendElement("table").addClass("sampleTable")
    val thead = table.appendElement("thead")
    val headers = thead.appendElement("tr")
    headers.appendElement("th").text("Command")
    headers.appendElement("th").text("Message/Error Message")
    headers.appendElement("th").text("Return Code")
    table
  }

  def addRow(table: Element, command: String, stdout: Option[String], stderr: Option[String], exception: Option[Throwable], exitCode: Option[Int]) = {
    val row = table.appendElement("tr")
    row.appendElement("td").text(command)

    val msg = stdout.getOrElse("")
    val errorMsg = stderr.getOrElse("") + exception.map(_.getMessage).getOrElse("")

    row.appendElement("td").appendText(msg).append(errorMsg.redHtml)
    row.appendElement("td").text(exitCode.getOrElse("N/A!").toString)
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
