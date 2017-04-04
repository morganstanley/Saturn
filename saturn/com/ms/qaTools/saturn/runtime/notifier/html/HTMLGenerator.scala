package com.ms.qaTools.saturn.runtime.notifier.html

import com.ms.qaTools.toolkit.Result
import com.ms.qaTools.saturn.runtime.RunGroupIteratorResult
import org.eclipse.emf.ecore.EObject
import com.ms.qaTools.saturn.runtime.RunGroupIterator
import com.ms.qaTools.saturn.runtime.ScalarRunGroupIteratorResult
import com.ms.qaTools.saturn.runtime.RowSourceRunGroupIteratorResult
import com.ms.qaTools.saturn.runtime.RunGroupResult
import org.jsoup.nodes.Element
import com.ms.qaTools.toolkit._
import com.ms.qaTools.saturn.dsl.annotation.ScenarioAnnotation
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import com.ms.qaTools.saturn.dsl.annotation.OnResultStatus
import com.ms.qaTools.saturn.runtime._
import com.ms.qaTools.saturn.dsl.annotation._
import org.jsoup.select.Elements
import com.ms.qaTools.saturn.dsl.SaturnDeserializer
import com.ms.qaTools.ecore._
import com.ms.qaTools.ecore.utils._
import scala.collection.JavaConversions._

object HTMLCSS {
  val PANEL_COLLAPSED = "panelCollapsed"
  val PANEL = "panel"
  val PANEL_CONTENT = "panelContent"
  def PANEL_CLASS(isExpanded: Boolean) = if(isExpanded) PANEL else PANEL_COLLAPSED
}

abstract class HTMLGenerator[IteratorResultType <: RunGroupIteratorResult, IterationResultType <: Result](eObject: EObject,
                                                                           iter: RunGroupIterator[IteratorResultType],
                                                                           resultContext: SaturnResultContext,
                                                                           verbosity: Option[VerbosityLevel] = None)(implicit sc: SaturnExecutionContext) {

  protected val verbosityLevel = verbosity.getOrElse(sc.outputVerbosity)

  def getAnnotationByResult(scenarioAnnotations: TraversableOnce[ScenarioAnnotation], status: Status): Option[ScenarioAnnotation] = getAnnotationByResult(scenarioAnnotations.map(a => a.onStatus -> a).toMap, status)
  def getAnnotationByResult(scenarioAnnotationMap: Map[OnResultStatus, ScenarioAnnotation], status: Status): Option[ScenarioAnnotation] = Option(status match {
    case Passed() => scenarioAnnotationMap.getOrElse(OnPassResultStatus, scenarioAnnotationMap.getOrElse(OnAnyResultStatus, null))
    case Failed() => scenarioAnnotationMap.getOrElse(OnFailResultStatus, scenarioAnnotationMap.getOrElse(OnAnyResultStatus, null))
    case NotRun() => scenarioAnnotationMap.getOrElse(OnAnyResultStatus, null)
  })

  def createPanel(parentElement: Element, result: IteratorResultType, asScenario: Boolean = false): Unit
  def createContent(parentElement: Element, result: IterationResultType, iterResult: RunGroupIterationResult[IterationResultType], iterationNo: Option[Int] = None): Unit
  def runGroupIconClassName: String
  def runGroupType: String

  def isEObjectScenario(annotations: Seq[ScenarioAnnotation]) = annotations.exists(a => a.isScenario)

  protected def createHeaderPanel(
    parentElement: Element,
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
          case NotRun() => throw new Error("Not executed scenario should not be outputted as HTML.")
        }
    }

    val (configTypeIconClass, statusClass, descriptionClass) = classes(result.status)

    if(!hideHeader) {
      val header = parentElement.appendElement("div").attr("class", "panelHeader")
      val table = header.appendElement("table").attr("class", headerType + "Table")
      val tbody = {
        val elements: Elements = table.getElementsByTag("tbody")
        if (elements.size > 0) elements.get(0)
        else table.appendElement("tbody")
      }
      val tr = tbody.appendElement("tr")

      val tdScenarioTitle = tr.appendElement("td").attr("class", statusClass)
      tdScenarioTitle.appendElement("div").attr("class", configTypeIconClass).html("&zwnj;")

      val shortNameDiv = tdScenarioTitle.appendElement("div").attr("class", "shortName")
      if (asScenario) shortNameDiv.append("<b>%s</b>".format(title)) else shortNameDiv.html(title)
      //The tooltip in shortName div is create at runtime with jQuery (based on the value in fullName div below here)

      tdScenarioTitle.appendElement("div")
        .attr("class", "fullName")
        .attr("style", "display:none")
        .text("%s: %s".format(eObject.eClass().getName(), iter.fullName))
      tdScenarioTitle.appendElement("div")
        .attr("class", "dialog")
        .attr("style", "display: none")
        .attr("title", "More information")
        .text("%s\n%s".format(dialogTitle, dialogContent))
      tr.appendElement("td").attr("class", descriptionClass).text(description)
    }



  }

  /*
   * Display the name from the scenarioAnnotation if it exists, else take the iteration name
   * If the header is a wrapping header group for a repetition handler then display the title field
   * Else Display the title in the far right section
   */
  protected def getHeaderTitleAndDescription(result: Result, displayRepetitionTitle: Boolean = false, scenarioAnnotations: Seq[ScenarioAnnotation] = Nil) = {
    scenarioAnnotations match {
      case Nil => (iter.name, "")
      case xs => {
        val scenarioAnnotationStatusMap: Map[OnResultStatus, ScenarioAnnotation] = xs.map(a => a.onStatus -> a).toMap
        getAnnotationByResult(scenarioAnnotationStatusMap, result.status).map(a =>
          (a.name.getOrElse(iter.name), a.title.getOrElse(""))
        ).getOrElse((iter.name, ""))
      }
    }
  }

  def createScalarResultHeaderPanel(parentElement: Element,
                                    result: Result,
                                    iterationNo: Option[Int] = None,
                                    asScenario: Boolean = false,
                                    scenarioAnnotations: Seq[ScenarioAnnotation] = Nil,
                                    hideHeader: Boolean = false) = {

    val (title, description) = getHeaderTitleAndDescription(result, displayRepetitionTitle = iterationNo.isDefined, scenarioAnnotations = scenarioAnnotations)
    val scenarioAnnotationStatusMap: Map[OnResultStatus, ScenarioAnnotation] = scenarioAnnotations.map(a => a.onStatus -> a).toMap
    val showIterationNo = getAnnotationByResult(scenarioAnnotationStatusMap, result.status).map(a => a.showIterationNo).getOrElse(true)

    createHeaderPanel(
        parentElement = parentElement,
        result = result,
        iconClass = runGroupIconClassName,
        title = if(showIterationNo) iterationNo match { case Some(i) => title + "[%d]".format(i); case None => title } else title,
        description = description,
        tooltip = "%s: %s".format(runGroupType, iter.fullName),
        dialogTitle = "Configuration",
        dialogContent = "%s&nbsp;%s".format(iter.fullName, "%s => %s".format(result.timings.startDate, result.timings.endDate)),
        asScenario = asScenario,
        scenarioAnnotations = scenarioAnnotations,
        hideHeader = hideHeader)
  }

  def createRowSourceResultHeaderPanel(parentElement: Element,
                                       result: RowSourceRunGroupIteratorResult[_],
                                       asScenario: Boolean = false,
                                       scenarioAnnotations: Seq[ScenarioAnnotation] = Nil,
                                       hideHeader: Boolean = false) = {
    val (title, description) = getHeaderTitleAndDescription(result, false, scenarioAnnotations)
    val scenarioAnnotationStatusMap: Map[OnResultStatus, ScenarioAnnotation] = scenarioAnnotations.map(a => a.onStatus -> a).toMap
    val showIterationNo = getAnnotationByResult(scenarioAnnotationStatusMap, result.status).map(a => a.showIterationNo).getOrElse(true)

    createHeaderPanel(
        parentElement = parentElement,
        result = result,
        iconClass = runGroupIconClassName,
        title = if(showIterationNo) "%s[0..%d]".format(title, result.iterationResults.size - 1) else title,
        description = description,
        tooltip = "%s: %s".format(runGroupType, iter.fullName),
        dialogTitle = "Configuration",
        dialogContent = "%s\n%s".format(iter.fullName, "XML EOBJECT SERIALIZATION"),
        asScenario = asScenario,
        scenarioAnnotations = scenarioAnnotations,
        hideHeader = hideHeader)
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
