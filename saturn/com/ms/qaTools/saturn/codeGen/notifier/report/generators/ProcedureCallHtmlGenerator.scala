package com.ms.qaTools.saturn.codeGen.notifier.report.generators

import java.io.ByteArrayOutputStream
import java.io.PrintStream

import org.jsoup.nodes.Element

import com.ms.qaTools.saturn.codeGen.IterationResult
import com.ms.qaTools.saturn.codeGen.notifier.console.printMetaDataContext
import com.ms.qaTools.saturn.codeGen.notifier.console.printMetaDatas
import com.ms.qaTools.saturn.result.PassedProcedureCallResult
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