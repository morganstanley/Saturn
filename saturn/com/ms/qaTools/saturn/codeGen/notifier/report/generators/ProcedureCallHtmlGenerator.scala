package com.ms.qaTools.saturn.codeGen.notifier.report.generators

import java.io.ByteArrayOutputStream
import java.io.PrintStream

import org.jsoup.nodes.Element

import com.ms.qaTools.saturn.codeGen.IterationResult
import com.ms.qaTools.saturn.codeGen.notifier.console.printMetaDataContext
import com.ms.qaTools.saturn.codeGen.notifier.console.printMetaDatas
import com.ms.qaTools.saturn.result.ProcedureCallResult
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import com.ms.qaTools.saturn.runtime.notifier.html.appendException
import com.ms.qaTools.saturn.runtime.notifier.html.htmlSpaces
import com.ms.qaTools.saturn.runtime.notifier.html.string2Html

case class ProcedureCallHtmlGenerator(implicit sc: SaturnExecutionContext) extends BasicHtmlGenerator {
  override def runGroupIconClassName: String = "procCallIcon"
  override def runGroupType: String = "ProcedureCall"

  override def generateIterationResult(name: String, fullName: String, result: IterationResult[Any], parentElement: Element, asScenario: Boolean = false, displayIterationNo: Boolean = true): Unit = {
    result.moduleResult match {
      case r: ProcedureCallResult =>
        for (e <- result.exception) appendException(parentElement, e, 0)(sc.outputVerbosity)

        val outputStream = new ByteArrayOutputStream
        val metaDataContexts = result.context.metaDataContexts
        printMetaDatas(metaDataContexts, Seq("ProcName"), 0, new PrintStream(outputStream))(true)
        parentElement.append(string2Html(new String(outputStream.toByteArray)))
        outputStream.reset

        for (argsMetaData <- metaDataContexts.get("Arguments")) {
          val argsMetaDataContext = argsMetaData.metaDataContexts
          if (!argsMetaDataContext.isEmpty) {
            parentElement.append(htmlSpaces(0) + "Arguments: <br/>")
            argsMetaData.metaDataContexts.foreach {
              case (s, md) => {
                printMetaDataContext(md, 1, new PrintStream(outputStream))(true)
                parentElement.append(string2Html(new String(outputStream.toByteArray)))
                outputStream.reset
              }
            }
          }
          else parentElement.append(htmlSpaces(0) + "Arguments: " + "None<br/>")
        }

        for {
          iteratorResult <- r.iteratorResult
          metaData <- iteratorResult.metaData
        } metaData match {
          case gen: HtmlGenerator =>
            val name = iteratorResult.context.name
            gen.generateIteratorResult(name, name, iteratorResult, parentElement)
          case _ =>
        }

        outputStream.close
      case r => throw new Exception(s"ProcedureCallHtmlGenerator cannot handle this type of result: ${r.getClass.getName}")
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
