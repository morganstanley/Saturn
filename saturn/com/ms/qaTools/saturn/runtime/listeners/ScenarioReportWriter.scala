package com.ms.qaTools.saturn.runtime.listeners

import org.jsoup.nodes.Element
import com.ms.qaTools.io.Writer
import java.io.OutputStream
import org.jsoup.Jsoup
import org.joda.time.format.DateTimeFormat
import org.apache.commons.io.output.NullOutputStream
import java.io.File
import com.ms.qaTools.saturn.runtime.SaturnRunInfo

class ScenarioReportWriter(out: OutputStream = new NullOutputStream(), title: String = "Scenario report") {
  val htmlDocument = {
    val doc = Jsoup.parse("""<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">  
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Report Demo</title>
<link href="invalid/scenarioReport.css" rel="stylesheet" type="text/css" />
<script src="http://toolkits.ms.com/webaurora/core.js"></script>
 <script>
        Module = new WebAuroraEnvironment("prod", false /*debug*/ );
        Module.load("ria","jquery","1.6.1"); 
        Module.load("ria","jquery-ui","1.8.6"); 
 </script>
<script type="text/javascript" src="invalid/control.js"></script>
<script type="text/javascript" src="invalid/jquery.simpletip-1.3.1.js"></script>
<script type="text/javascript" src="invalid/jquery.hoverIntent.js"></script>
</head>

<body>
<div class="reportBanner">
  <div id="saturnReportTitle" class="bannerLeft">
    <font size="5"><b>Saturn Scenario Execution Report</b></font>
    <br/>    
  </div>
  <div id="saturnReportRunInfo" class="bannerRight">
  </div>
  <div style="clear:both;"></div>
</div>
</body>
</html>""")

    doc
  }

  def addRunInfo(runInfo: SaturnRunInfo) = {
    htmlDocument.title(title)
    val titleElement = htmlDocument.getElementById("saturnReportTitle")
    titleElement.append("<font size=\"4\">%s</font>".format(title))

    val runInfoElement = htmlDocument.getElementById("saturnReportRunInfo")
    val dateTimeFormatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")
    val (start, duration) = (dateTimeFormatter.print(runInfo.startTime), (runInfo.endTime - runInfo.startTime) / 1000)
    runInfoElement.append("Run on: %s<br/>Duration: %ss<br/>".format(start, duration))
    runInfoElement.append("""<a id="runInfoLink" href="#" style="color: white;">Run info</a>""")
    val runInfoDiv = runInfoElement.appendElement("div")
    runInfoDiv.attr("id", "runInfoDiv").attr("class", "dialog").attr("style", "display: none").attr("title", "Run information")
    val table = runInfoDiv.appendElement("table")
    val tbody = table.appendElement("tbody")
    val rows: Seq[(String, String)] = Seq(
      ("Command", runInfo.command),
      ("Saturn version", runInfo.saturnVersion),
      ("Util version", runInfo.utilVersion),
      ("Path", runInfo.path),
      ("User", runInfo.user),
      ("Working directory", runInfo.workingDirectory),
      ("Host", runInfo.host)
    )
    rows.foreach { case (param, value) => tbody.append("<tr><td><b>%s</b></td><td>%s</td></tr>".format(param, value)) }
    runInfoElement.append("<br/>")
  }

  def addElement(element: Element) = {
    this.synchronized { htmlDocument.body().appendChild(element) }
  }

  def write = out.write(htmlDocument.toString().getBytes())
}

object ScenarioReportWriter {
  def apply(out: OutputStream, title: String = "Scenario report") = new ScenarioReportWriter(out, title)
  def apply() = new ScenarioReportWriter()
}