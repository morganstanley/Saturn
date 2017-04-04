package com.ms.qaTools.saturn.codeGen.notifier.report.generators

import org.jsoup.nodes.Element

import com.ms.qaTools.interpreter.CommandExecutorResult
import com.ms.qaTools.interpreter.GroovyInterpreterResult
import com.ms.qaTools.interpreter.ScalaInterpreterResult
import com.ms.qaTools.interpreter.ShellInterpreterResult
import com.ms.qaTools.saturn.codeGen.IterationResult
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import com.ms.qaTools.saturn.runtime.notifier.html.stringToHtmlColorizedString
import com.ms.qaTools.toolkit.runCmds.RunCmdsResult

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