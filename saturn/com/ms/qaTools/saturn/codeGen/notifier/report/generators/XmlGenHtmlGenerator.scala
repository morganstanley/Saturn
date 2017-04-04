package com.ms.qaTools.saturn.codeGen.notifier.report.generators

import java.io.ByteArrayOutputStream
import java.io.PrintStream

import scala.Option.option2Iterable

import org.jsoup.nodes.Element

import com.ms.qaTools.saturn.codeGen.IterationResult
import com.ms.qaTools.saturn.codeGen.notifier.console.printMetaDatas
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import com.ms.qaTools.saturn.runtime.notifier.html.appendException
import com.ms.qaTools.saturn.runtime.notifier.html.string2Html
import com.ms.qaTools.toolkit.xmlGen.XmlGenResult

case class XmlGenHtmlGenerator(implicit sc: SaturnExecutionContext) extends BasicHtmlGenerator {
  override def runGroupIconClassName: String = "xmlGenIcon"
  override def runGroupType: String = "xmlGen"

  override def generateIterationResult(name: String, fullName: String, result: IterationResult[Any], parentElement: Element, asScenario: Boolean = false, displayIterationNo: Boolean = true): Unit = {
    result.moduleResult match {
      case _: XmlGenResult =>
        for (e <- result.exception) appendException(parentElement, e, 0)(sc.outputVerbosity)

        val outputStream = new ByteArrayOutputStream
        val metaDataContexts = result.context.metaDataContexts
        for (metaData <- Seq("File", "TemplateFile", "OutputResource", "IsLegacy")) {
          printMetaDatas(metaDataContexts, Some(metaData), 0, new PrintStream(outputStream))(true)
          parentElement.append(string2Html(new String(outputStream.toByteArray)) + "<br/>")
          outputStream.reset
        }
      case r => throw new Exception(s"XmlGenHtmlGenerator cannot handle this type of result: ${r.getClass.getName}")

    }
  }
}