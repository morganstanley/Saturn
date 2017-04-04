package com.ms.qaTools.saturn.codeGen.notifier.report.generators

import com.ms.qaTools.toolkit.Passed
import com.ms.qaTools.saturn.dsl.annotation.OnAnyResultStatus
import com.ms.qaTools.saturn.dsl.annotation.ScenarioAnnotation
import com.ms.qaTools.saturn.codeGen.IteratorResult
import com.ms.qaTools.saturn.codeGen.IterationResult
import com.ms.qaTools.saturn.dsl.annotation.OnResultStatus
import com.ms.qaTools.toolkit.NotRun
import com.ms.qaTools.saturn.dsl.annotation.OnPassResultStatus
import com.ms.qaTools.saturn.dsl.annotation.OnFailResultStatus
import org.jsoup.nodes.Element
import com.ms.qaTools.toolkit.Result
import org.jsoup.select.Elements
import com.ms.qaTools.toolkit.Failed
import com.ms.qaTools.toolkit.Status
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import scala.util.Try

trait HtmlContentGenerator[ResultType <: Result] {
  def createContent(r: ResultType)
}

trait HtmlGenerator {
  def generateIterationResult(name: String, fullName: String, result: IterationResult[Any], parentElement: Element, asScenario: Boolean = false, displayIterationNo: Boolean = true): Unit
  def generateIteratorResult(name: String, fullName: String, result: IteratorResult[Any], parentElement: Element, asScenario: Boolean = false): Unit

  def getAnnotationByResult(scenarioAnnotations: TraversableOnce[ScenarioAnnotation], status: Status): Option[ScenarioAnnotation] = getAnnotationByResult(scenarioAnnotations.map(a => a.onStatus -> a).toMap, status)
  def getAnnotationByResult(scenarioAnnotationMap: Map[OnResultStatus, ScenarioAnnotation], status: Status): Option[ScenarioAnnotation] = Option(status match {
    case Passed() => scenarioAnnotationMap.getOrElse(OnPassResultStatus, scenarioAnnotationMap.getOrElse(OnAnyResultStatus, null))
    case Failed() => scenarioAnnotationMap.getOrElse(OnFailResultStatus, scenarioAnnotationMap.getOrElse(OnAnyResultStatus, null))
    case NotRun() => scenarioAnnotationMap.getOrElse(OnAnyResultStatus, null)
  })

  /*
   * Display the name from the scenarioAnnotation if it exists, else take the iteration name
   * If the header is a wrapping header group for a repetition handler then display the title field
   * Else Display the title in the far right section
   */
  protected def getHeaderTitleAndDescription(name: String, result: Result, displayRepetitionTitle: Boolean = false, scenarioAnnotations: Seq[ScenarioAnnotation] = Nil) = {
    scenarioAnnotations match {
      case Nil => (name, "")
      case xs => {
        val scenarioAnnotationStatusMap: Map[OnResultStatus, ScenarioAnnotation] = xs.map(a => a.onStatus -> a).toMap
        getAnnotationByResult(scenarioAnnotationStatusMap, result.status).map(a => (a.name.getOrElse(name), a.title.getOrElse(""))).getOrElse((name, ""))
      }
    }
  }

  def isEObjectScenario(annotations: Seq[ScenarioAnnotation]) = annotations.exists(a => a.isScenario)

  protected def createHeaderPanel(
    parentElement: Element,
    fullName: String,
    runGroupType: String,
    result: Result,
    iconClass: String,
    title: String,
    description: String,
    tooltip: String,
    dialogTitle: String,
    dialogContent: String,
    asScenario: Boolean = false,
    scenarioAnnotations: Seq[ScenarioAnnotation] = Nil,
    hideHeader: Boolean = false) = {

    val headerType = if (asScenario && isEObjectScenario(scenarioAnnotations)) "scenario" else "step"
    val headerEnd = if (asScenario && isEObjectScenario(scenarioAnnotations)) "" else "Name"

    def classes(r: Status) = {
      r match {
        case Passed() => ("iconProp " + iconClass, headerType + "Pass" + headerEnd, headerType + "PassDescription")
        case Failed() => ("iconProp " + iconClass, headerType + "Fail" + headerEnd, headerType + "FailDescription")
        case NotRun() => throw new Error("Not run result should not be outputted as HTML.")
      }
    }

    val (configTypeIconClass, statusClass, descriptionClass) = classes(result.status)

    if (!hideHeader) {
      val header = parentElement.appendDiv.attr("class", "panelHeader")
      val table = header.appendElement("table").attr("class", headerType + "Table")
      val tbody = {
        val elements: Elements = table.getElementsByTag("tbody")
        if (elements.size > 0) elements.get(0)
        else table.appendElement("tbody")
      }
      val tr = tbody.appendElement("tr")

      val tdScenarioTitle = tr.appendElement("td").attr("class", statusClass)
      tdScenarioTitle.appendDiv.attr("class", configTypeIconClass).html("&zwnj;")

      val shortNameDiv = tdScenarioTitle.appendDiv.attr("class", "shortName")
      if (asScenario) shortNameDiv.append("<b>%s</b>".format(title)) else shortNameDiv.html(title)
      //The tooltip in shortName div is create at runtime with jQuery (based on the value in fullName div below here)

      tdScenarioTitle.appendDiv
        .attr("class", "fullName")
        .attr("style", "display:none")
        .text("%s: %s".format(runGroupType, fullName))

      tdScenarioTitle.appendDiv
        .attr("class", "dialog")
        .attr("style", "display: none")
        .attr("title", "More information")
        .text("%s\n%s".format(dialogTitle, dialogContent))
      tr.appendElement("td").attr("class", descriptionClass).text(description)
    }

  }

  def createIterationResultHeaderPanel(parentElement: Element,
    name: String,
    fullName: String,
    runGroupType: String,
    runGroupIconClassName: String,
    result: IterationResult[_],
    displayIterationNo: Boolean = false,
    asScenario: Boolean = false,
    scenarioAnnotations: Seq[ScenarioAnnotation] = Nil,
    hideHeader: Boolean = false) = {

    val (title, description) = getHeaderTitleAndDescription(name, result, displayRepetitionTitle = true, scenarioAnnotations = scenarioAnnotations)
    val scenarioAnnotationStatusMap: Map[OnResultStatus, ScenarioAnnotation] = scenarioAnnotations.map(a => a.onStatus -> a).toMap
    val showIterationNo = displayIterationNo && getAnnotationByResult(scenarioAnnotationStatusMap, result.status).map(a => a.showIterationNo).getOrElse(true)

    createHeaderPanel(
      parentElement = parentElement,
      fullName = fullName,
      runGroupType = runGroupType,
      result = result,
      iconClass = runGroupIconClassName,
      title = if (showIterationNo) s"$title[${result.iterationNo}]" else title,
      description = description,
      tooltip = "%s: %s".format(runGroupType, fullName),
      dialogTitle = "Configuration",
      dialogContent = "%s&nbsp;%s".format(fullName, "%s => %s".format(result.timings.startDate, result.timings.endDate)),
      asScenario = asScenario,
      scenarioAnnotations = scenarioAnnotations,
      hideHeader = hideHeader)
  }

  def createIteratorResultHeaderPanel(parentElement: Element,
    name: String,
    fullName: String,
    runGroupType: String,
    runGroupIconClassName: String,
    result: IteratorResult[_],
    displayIterationNo: Boolean = false,
    asScenario: Boolean = false,
    scenarioAnnotations: Seq[ScenarioAnnotation] = Nil,
    hideHeader: Boolean = false) = {
    val (title, description) = getHeaderTitleAndDescription(name, result, false, scenarioAnnotations)
    val scenarioAnnotationStatusMap: Map[OnResultStatus, ScenarioAnnotation] = scenarioAnnotations.map(a => a.onStatus -> a).toMap
    val showIterationNo = displayIterationNo && getAnnotationByResult(scenarioAnnotationStatusMap, result.status).map(a => a.showIterationNo).getOrElse(true)

    createHeaderPanel(
      parentElement = parentElement,
      fullName = fullName,
      runGroupType = runGroupType,
      result = result,
      iconClass = runGroupIconClassName,
      title = if (showIterationNo) "%s[0..%d]".format(title, result.iterationResults.size - 1) else title,
      description = description,
      tooltip = "%s: %s".format(runGroupType, fullName),
      dialogTitle = "Configuration",
      dialogContent = "%s\n%s".format(fullName, "XML EOBJECT SERIALIZATION"),
      asScenario = asScenario,
      scenarioAnnotations = scenarioAnnotations,
      hideHeader = hideHeader)
  }
}

object HtmlGenerator {
  protected val pack = "com.ms.qaTools.saturn.codeGen.notifier.report.generators"
  def getGeneratorIfImplemented(clazz: String)(implicit sc: SaturnExecutionContext) = Try{
    Class.forName(s"$pack.$clazz").getConstructor(classOf[SaturnExecutionContext]).newInstance(sc).asInstanceOf[BasicHtmlGenerator]}.getOrElse(???)

  def Basic_HtmlGenerator()(implicit sc: SaturnExecutionContext)             = BasicHtmlGenerator()
  def CometStep_HtmlGenerator(implicit sc: SaturnExecutionContext)           = getGeneratorIfImplemented("CometHtmlGenerator")
  def CpsStep_HtmlGenerator(implicit sc: SaturnExecutionContext)             = Basic_HtmlGenerator()
  def DSConvertStep_HtmlGenerator(implicit sc: SaturnExecutionContext)       = getGeneratorIfImplemented("DSConvertHtmlGenerator")
  def DataCompareStep_HtmlGenerator(implicit sc: SaturnExecutionContext)     = getGeneratorIfImplemented("DataCompareHtmlGenerator")
  def KronusStep_HtmlGenerator(implicit sc: SaturnExecutionContext)          = Basic_HtmlGenerator()
  def MQPutOperation_HtmlGenerator(implicit sc: SaturnExecutionContext)      = getGeneratorIfImplemented("MQPutHtmlGenerator")
  def MQGetOperation_HtmlGenerator(implicit sc: SaturnExecutionContext)      = getGeneratorIfImplemented("MQGetHtmlGenerator")
  def MQWaitOperation_HtmlGenerator(implicit sc: SaturnExecutionContext)     = getGeneratorIfImplemented("MQWaitHtmlGenerator")
  def MQReportOperation_HtmlGenerator(implicit sc: SaturnExecutionContext)   = getGeneratorIfImplemented("MQReportHtmlGenerator")
  def MQClearOperation_HtmlGenerator(implicit sc: SaturnExecutionContext)    = getGeneratorIfImplemented("MQClearHtmlGenerator")
  def MailStep_HtmlGenerator(implicit sc: SaturnExecutionContext)            = Basic_HtmlGenerator()
  def ProcedureCallStep_HtmlGenerator(implicit sc: SaturnExecutionContext)   = ProcedureCallHtmlGenerator()
  def RunCmdsScala_HtmlGenerator(implicit sc: SaturnExecutionContext)        = RunCmdsHtmlGenerator()
  def RunCmdsShell_HtmlGenerator(implicit sc: SaturnExecutionContext)        = RunCmdsHtmlGenerator()
  def RunCmdsGroovy_HtmlGenerator(implicit sc: SaturnExecutionContext)       = RunCmdsHtmlGenerator()
  def RunCmdsDml_HtmlGenerator(implicit sc: SaturnExecutionContext)          = RunCmdsHtmlGenerator()
  def RunCmdsPerl_HtmlGenerator(implicit sc: SaturnExecutionContext)         = RunCmdsHtmlGenerator()
  def RunGroup_HtmlGenerator(implicit sc: SaturnExecutionContext)            = RunGroupHtmlGenerator()
  def SQLFetchOperation_HtmlGenerator(implicit sc: SaturnExecutionContext)   = SQLFetchHtmlGenerator()
  def SQLExecuteOperation_HtmlGenerator(implicit sc: SaturnExecutionContext) = SQLExecuteHtmlGenerator()
  def SQLClearOperation_HtmlGenerator(implicit sc: SaturnExecutionContext)   = SQLClearHtmlGenerator()
  def SQLCallOperation_HtmlGenerator(implicit sc: SaturnExecutionContext)    = SQLCallHtmlGenerator()
  def SQLLoadOperation_HtmlGenerator(implicit sc: SaturnExecutionContext)    = SQLLoadHtmlGenerator()
  def Saturn_HtmlGenerator(implicit sc: SaturnExecutionContext)              = SaturnHtmlGenerator()
  def SoapIOStep_HtmlGenerator(implicit sc: SaturnExecutionContext)          = getGeneratorIfImplemented("SoapIOHtmlGenerator")
  def PassTerminal_HtmlGenerator(implicit sc: SaturnExecutionContext)        = Basic_HtmlGenerator()
  def FailTerminal_HtmlGenerator(implicit sc: SaturnExecutionContext)        = Basic_HtmlGenerator()
  def NoopTerminal_HtmlGenerator(implicit sc: SaturnExecutionContext)        = Basic_HtmlGenerator()
  def Xml2CsvStep_HtmlGenerator(implicit sc: SaturnExecutionContext)         = getGeneratorIfImplemented("Xml2CsvHtmlGenerator")
  def XmlGenStep_HtmlGenerator(implicit sc: SaturnExecutionContext)          = XmlGenHtmlGenerator()
  def XmlManipStep_HtmlGenerator(implicit sc: SaturnExecutionContext)        = Basic_HtmlGenerator()
  def XmlValidatorStep_HtmlGenerator(implicit sc: SaturnExecutionContext)    = Basic_HtmlGenerator()
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
