package com.ms.qaTools.saturn.runtime.notifier.html
import com.ms.qaTools.toolkit.Result
import com.ms.qaTools.saturn.runtime.EObjectNotifier
import com.ms.qaTools.saturn.runtime.RunGroupIteratorResult
import org.eclipse.emf.ecore.EObject
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import com.ms.qaTools.saturn.runtime.RunGroupIterationResult
import com.ms.qaTools.saturn.runtime.RunGroupResult
import org.jsoup.nodes.Document
import org.jsoup.Jsoup
import org.jsoup.nodes.Element
import java.io.FileWriter
import java.io.File
import com.ms.qaTools.toolkit._
import com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportPackage
import com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration
import scala.collection.mutable.ListBuffer
import com.ms.qaTools.Logger
import com.ms.qaTools.saturn.dsl.annotation._
import com.ms.qaTools.saturn.AbstractRunGroup
import com.ms.qaTools.saturn.runtime.ScalarRunGroupIterator
import com.ms.qaTools.saturn.runtime.RowSourceRunGroupIterator
import com.ms.qaTools.saturn.runtime.RowSourceRunGroupIteratorResult
import com.ms.qaTools.saturn.SaturnPackage
import com.ms.qaTools.saturn.runtime.RunGroupIterator
import com.ms.qaTools.saturn.runtime.ScalarRunGroupIteratorResult
import com.ms.qaTools.saturn.runtime.RunGroupIteratorResult
import org.joda.time.format.DateTimeFormatter
import org.joda.time.format.DateTimeFormat
import com.ms.qaTools.saturn.listeners.ScenarioReportListener
import com.ms.qaTools.saturn.runtime.listeners.ScenarioReportWriter
import com.ms.qaTools.saturn.runtime.SaturnResult
import java.io.FileOutputStream
import com.ms.qaTools._
import java.io.OutputStream
import com.ms.qaTools.io.rowSource.file.DirectoryFilesRowSource
import org.jsoup.nodes.Document._
import org.jsoup.nodes.Entities

object BasicEObjectHTMLNotifier {
  val outputTempDir = createTempDir("scenarioReport")
}

abstract class BasicEObjectHTMLNotifier[IterationResultType <: Result, IteratorResultType <: RunGroupIteratorResult, IteratorType <: RunGroupIterator[IteratorResultType]](eObject: EObject)(implicit sc: SaturnExecutionContext)
  extends EObjectNotifier[IterationResultType, IteratorResultType, IteratorType](eObject) {

  protected def createHTMLDocument[T <: RunGroupIteratorResult](result: T): Document = {
    val doc = new Document("")
    doc.appendElement("body")
    doc
  }
}

case class ScalarRunGroupIteratorEObjectHTMLNotifier[IterationResultType <: Result](eObject: EObject)(implicit sc: SaturnExecutionContext)
  extends BasicEObjectHTMLNotifier[IterationResultType, ScalarRunGroupIteratorResult[IterationResultType], ScalarRunGroupIterator[IterationResultType]](eObject) {

  override def notifyBeforeIterator(iter: ScalarRunGroupIterator[IterationResultType]) = {}
  override def notifyAfterIterator(iter: ScalarRunGroupIterator[IterationResultType], result: ScalarRunGroupIteratorResult[IterationResultType]) = {
    if (result.finished) {
      val doc = createHTMLDocument(result)
      val htmlGenerator = iter.htmlGenerator(iter.rc)
      val annotations = iter.rc.iterationContexts.map(_.scenarioAnnotations).flatten
      val annotationApplied = htmlGenerator.getAnnotationByResult(annotations, result.status)
      val output = annotationApplied.map(a => !a.ignored && a.isScenario).getOrElse(false)

      if (output) {
       htmlGenerator.createPanel(doc.body(), result, htmlGenerator.isEObjectScenario(annotations))
        val fileOutputStream = new FileOutputStream(new File(BasicEObjectHTMLNotifier.outputTempDir.getAbsolutePath() + "/" + iter.fullName + ".html"))
        val report = ScenarioReportWriter(fileOutputStream)
        val children = doc.body().children
        for (i <- 0 until children.size) report.addElement(children.get(i))
        report.write
        fileOutputStream.close
      }
    }
  }

  def notifyBeforeIteration(iter: ScalarRunGroupIterator[IterationResultType], iterationNo: Int) = {}
  def notifyAfterIteration(iter: ScalarRunGroupIterator[IterationResultType], result: RunGroupIterationResult[IterationResultType], iterationNo: Int) = {}
}

case class RowSourceRunGroupIteratorEObjectHTMLNotifier[IterationResultType <: Result](eObject: EObject)(implicit sc: SaturnExecutionContext)
  extends BasicEObjectHTMLNotifier[IterationResultType, RowSourceRunGroupIteratorResult[IterationResultType], RowSourceRunGroupIterator[IterationResultType]](eObject) {

  override def notifyBeforeIterator(iter: RowSourceRunGroupIterator[IterationResultType]) = {}
  override def notifyAfterIterator(iter: RowSourceRunGroupIterator[IterationResultType], result: RowSourceRunGroupIteratorResult[IterationResultType]) = {
    if (result.finished) {
      val doc = createHTMLDocument(result)
      val htmlGenerator = iter.htmlGenerator(iter.rc)
      val annotations = iter.rc.iterationContexts.map(_.scenarioAnnotations).flatten
      val annotationApplied = htmlGenerator.getAnnotationByResult(annotations, result.status)
      val output = annotationApplied.map(a => !a.ignored && a.isScenario).getOrElse(false)

      if (output) {
        htmlGenerator.createPanel(parentElement = doc.body(), result = result, asScenario = htmlGenerator.isEObjectScenario(annotations))
        val fileOutputStream = new FileOutputStream(new File(BasicEObjectHTMLNotifier.outputTempDir.getAbsolutePath() + "/" + iter.fullName + ".html"))
        val report = ScenarioReportWriter(fileOutputStream)
        val children = doc.body().children
        for (i <- 0 until children.size) report.addElement(children.get(i))
        report.write
        fileOutputStream.close
      }
    }
  }

  def notifyBeforeIteration(iter: RowSourceRunGroupIterator[IterationResultType], iterationNo: Int) = {}
  def notifyAfterIteration(iter: RowSourceRunGroupIterator[IterationResultType], result: RunGroupIterationResult[IterationResultType], iterationNo: Int) = {}
}

/*
 * Saturn HTML notifier should write the saturn run info and merge the files
 * The Saturn HTML notifier is *always* run even though the user didn't create an annotation at the root level.
 * This is needed to merge all the nodes that were outputted to html as scenario as one file.
 */
case class ScalarSaturnIteratorEObjectHTMLNotifier(eObject: EObject, var outputStream: Option[OutputStream] = None)(implicit sc: SaturnExecutionContext)
  extends BasicEObjectHTMLNotifier[SaturnResult, ScalarRunGroupIteratorResult[SaturnResult], ScalarRunGroupIterator[SaturnResult]](eObject) {

  override def notifyBeforeIterator(iter: ScalarRunGroupIterator[SaturnResult]) = {}
  override def notifyAfterIterator(iter: ScalarRunGroupIterator[SaturnResult], result: ScalarRunGroupIteratorResult[SaturnResult]) = {
    if (result.finished) {
      val htmlGenerator = iter.htmlGenerator(iter.rc)
      val annotations = iter.rc.iterationContexts.map(_.scenarioAnnotations).flatten
      val annotationApplied = htmlGenerator.getAnnotationByResult(annotations, result.status)
      val output = annotationApplied.map(a => !a.ignored && a.isScenario).getOrElse(false)

      if (output) {
        val fileOutputStream = new FileOutputStream(new File(BasicEObjectHTMLNotifier.outputTempDir.getAbsolutePath() + "/" + iter.fullName + ".html"))
        val report = ScenarioReportWriter(fileOutputStream)
        val doc = createHTMLDocument(result)

        htmlGenerator.createPanel(doc.body(), result, htmlGenerator.isEObjectScenario(annotations))
        val children = doc.body().children
        for (i <- 0 until children.size) report.addElement(children.get(i))

        report.write
        fileOutputStream.close
      }

      //Merge
      for (o <- outputStream) {
        val report = ScenarioReportWriter(o)
        val files = DirectoryFilesRowSource(BasicEObjectHTMLNotifier.outputTempDir)

        files.foreach(f => {
          val doc = Jsoup.parse(f, "UTF-8")
          doc.outputSettings.escapeMode(Entities.EscapeMode.xhtml)
          val children = doc.body.children
          for (
            i <- 0 until children.size;
            if children.get(i).className != "reportBanner"
          ) report.addElement(children.get(i))
        })

        report.addRunInfo(sc.runInfo.copy(startTime = result.startTime.getOrElse(0L), endTime = result.endTime.getOrElse(0L)))
        report.write
        o.close
      }
    }
  }

  def notifyBeforeIteration(iter: ScalarRunGroupIterator[SaturnResult], iterationNo: Int) = {}
  def notifyAfterIteration(iter: ScalarRunGroupIterator[SaturnResult], result: RunGroupIterationResult[SaturnResult], iterationNo: Int) = {}
}

case class RowSourceSaturnIteratorEObjectHTMLNotifier(eObject: EObject, var outputStream: Option[OutputStream] = None)(implicit sc: SaturnExecutionContext)
  extends BasicEObjectHTMLNotifier[SaturnResult, RowSourceRunGroupIteratorResult[SaturnResult], RowSourceRunGroupIterator[SaturnResult]](eObject) {

  override def notifyBeforeIterator(iter: RowSourceRunGroupIterator[SaturnResult]) = {}
  override def notifyAfterIterator(iter: RowSourceRunGroupIterator[SaturnResult], result: RowSourceRunGroupIteratorResult[SaturnResult]) = {
    if (result.finished) {
      val htmlGenerator = iter.htmlGenerator(iter.rc)
      val annotations = iter.rc.iterationContexts.map(_.scenarioAnnotations).flatten
      val annotationApplied = htmlGenerator.getAnnotationByResult(annotations, result.status)
      val output = annotationApplied.map(a => !a.ignored && a.isScenario).getOrElse(false)

      if (output) {
        val fileOutputStream = new FileOutputStream(new File(BasicEObjectHTMLNotifier.outputTempDir.getAbsolutePath() + "/" + iter.fullName + ".html"))
        val report = ScenarioReportWriter(fileOutputStream)
        val doc = createHTMLDocument(result)

        htmlGenerator.createPanel(doc.body(), result, htmlGenerator.isEObjectScenario(annotations))
        val children = doc.body().children
        for (i <- 0 until children.size) report.addElement(children.get(i))

        report.write
        fileOutputStream.close
      }

      //Merge
      for (o <- outputStream) {
        val report = ScenarioReportWriter(o)
        val files = DirectoryFilesRowSource(BasicEObjectHTMLNotifier.outputTempDir)

        files.foreach(f => {
          val doc = Jsoup.parse(f, "UTF-8")
          val children = doc.body.children
          for (
            i <- 0 until children.size;
            if children.get(i).className != "reportBanner"
          ) report.addElement(children.get(i))
        })

        report.addRunInfo(sc.runInfo.copy(startTime = result.startTime.getOrElse(0L), endTime = result.endTime.getOrElse(0L)))
        report.write
        o.close
      }
    }
  }

  def notifyBeforeIteration(iter: RowSourceRunGroupIterator[SaturnResult], iterationNo: Int) = {}
  def notifyAfterIteration(iter: RowSourceRunGroupIterator[SaturnResult], result: RunGroupIterationResult[SaturnResult], iterationNo: Int) = {}
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
