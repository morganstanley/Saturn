package com.ms.qaTools.saturn.codeGen.notifier.report

import java.io.File
import java.io.FileOutputStream

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Entities

import com.ms.qaTools.TryUtil
import com.ms.qaTools.createTempDir
import com.ms.qaTools.io.rowSource.file.DirectoryFilesRowSource
import com.ms.qaTools.saturn.codeGen.IterationResult
import com.ms.qaTools.saturn.codeGen.IteratorResult
import com.ms.qaTools.saturn.codeGen.PreIterationResult
import com.ms.qaTools.saturn.codeGen.PreIteratorResult
import com.ms.qaTools.saturn.codeGen.RunGroupResult
import com.ms.qaTools.saturn.codeGen.notifier.Notifier
import com.ms.qaTools.saturn.codeGen.notifier.report.generators.HtmlGenerator
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import com.ms.qaTools.saturn.runtime.listeners.ScenarioReportWriter
import com.ms.qaTools.toolkit.Result

//This should be generated if the RunGroup has an annotation with IsScenario == true
//Once the runGroup finishes, the notifier will create a HTML file containing the result of itself and its children
//To choose the correct Html outputter, we should have a  Map[ResultTypeClass, HtmlOutputter]
class ScenarioReportNotifier[ResultType <: Result] extends Notifier[ResultType] {

  protected def createHTMLDocument = {
    val doc = new Document("")
    doc.appendElement("body")
    doc
  }

  override def notifyBeforeIterator(name: String, result: PreIteratorResult[ResultType])(implicit sc: SaturnExecutionContext) = ()
  override def notifyAfterIterator(name: String, result: IteratorResult[ResultType])(implicit sc: SaturnExecutionContext) = {
    if (result.finished) {
      val doc = createHTMLDocument
      val htmlGeneratorOption = result.metaData.collect { case h: HtmlGenerator => h }.headOption
      val htmlGenerator = htmlGeneratorOption.map(_.generateIteratorResult(name, name, result, doc.body, asScenario = true))
      val fileOutputStream = new FileOutputStream(new File(ScenarioReportNotifier.outputTempDir.getAbsolutePath() + "/" + name + ".iterator.html"))
      val report = ScenarioReportWriter(fileOutputStream)
      val children = doc.body().children
      for (i <- 0 until children.size) report.addElement(children.get(i))
      report.write
      fileOutputStream.close
    }

  }

  override def notifyBeforeIteration(name: String, result: PreIterationResult[ResultType])(implicit sc: SaturnExecutionContext) = ()
  override def notifyAfterIteration(name: String, result: IterationResult[ResultType])(implicit sc: SaturnExecutionContext) = ()

  override def notifyException(name: String, t: Throwable)(implicit sc: SaturnExecutionContext) = ???
}

object ScenarioReportNotifier {
  val outputTempDir = createTempDir("scenarioReport")

  def apply[R <: Result]() = new ScenarioReportNotifier[R]()
}

case object ScenarioReportListenerNotifier extends Notifier[RunGroupResult] {
  override def notifyBeforeIterator(name: String, result: PreIteratorResult[RunGroupResult])(implicit sc: SaturnExecutionContext) = ()

  override def notifyAfterIterator(name: String, result: IteratorResult[RunGroupResult])(implicit sc: SaturnExecutionContext) = {
    /*
	 * SaturnScenarioReportNotifier should write the saturn run info and merge the files
	 * The Saturn HTML notifier is *always* run even though the user didn't create an annotation at the root level.
	 * This is needed to merge all the nodes that were outputted to html as scenario as one file.
	 */
    if (result.finished) {
      //Merge
      (for {
        iterationResult <- result.iterationResults(0)
      } yield {
        val listenerOption = iterationResult.moduleResult.scenarioReportListener
        listenerOption map { listener =>
          val outStream = listener.output.outputStream.rethrow("Error when connecting output for scenario report.").get
          val report = ScenarioReportWriter(outStream, listener.title)
          val files = DirectoryFilesRowSource(ScenarioReportNotifier.outputTempDir)

          files.foreach(f => {
            val doc = Jsoup.parse(f, "UTF-8")
            doc.outputSettings.escapeMode(Entities.EscapeMode.xhtml)
            val children = doc.body.children
            for (
              i <- 0 until children.size;
              if children.get(i).className != "reportBanner"
            ) report.addElement(children.get(i))
          })

          report.addRunInfo(sc.runInfo.copy(endTime = System.currentTimeMillis()))
          report.write
          outStream.close
        }

      }).rethrow("Error when getting result of saturn when creating scenario report.").get
    }
  }

  override def notifyBeforeIteration(name: String, result: PreIterationResult[RunGroupResult])(implicit sc: SaturnExecutionContext) = ()
  override def notifyAfterIteration(name: String, result: IterationResult[RunGroupResult])(implicit sc: SaturnExecutionContext) = ()

  override def notifyException(name: String, t: Throwable)(implicit sc: SaturnExecutionContext) = ???
}/*
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
