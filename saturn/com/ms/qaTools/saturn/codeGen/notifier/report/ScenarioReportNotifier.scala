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
}