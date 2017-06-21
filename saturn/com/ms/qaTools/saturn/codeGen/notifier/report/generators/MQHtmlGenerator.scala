package com.ms.qaTools.saturn.codeGen.notifier.report.generators

import java.io.ByteArrayOutputStream
import java.io.PrintStream

import org.jsoup.nodes.Element

import com.ms.qaTools.saturn.codeGen.IterationResult
import com.ms.qaTools.saturn.codeGen.notifier.console.printMetaDatas
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import com.ms.qaTools.saturn.runtime.TRACE
import com.ms.qaTools.saturn.runtime.notifier.html.appendException
import com.ms.qaTools.saturn.runtime.notifier.html.htmlSpaces
import com.ms.qaTools.saturn.runtime.notifier.html.string2Html
import com.ms.qaTools.saturn.runtime.notifier.html.stringToHtmlColorizedString
import com.ms.qaTools.toolkit.{Failed, Passed, Result}
import com.ms.qaTools.toolkit.mq.MQClearActionResult
import com.ms.qaTools.toolkit.mq.MQClearResult
import com.ms.qaTools.toolkit.mq.MQGetActionResult
import com.ms.qaTools.toolkit.mq.MQGetResult
import com.ms.qaTools.toolkit.mq.MQPutActionResult
import com.ms.qaTools.toolkit.mq.MQPutResult
import com.ms.qaTools.toolkit.mq.MQReportActionResult
import com.ms.qaTools.toolkit.mq.MQReportResult
import com.ms.qaTools.toolkit.mq.MQWaitActionResult
import com.ms.qaTools.toolkit.mq.MQWaitComparisonActionResult
import com.ms.qaTools.toolkit.mq.MQWaitEqualActionResult
import com.ms.qaTools.toolkit.mq.MQWaitGreaterThanActionResult
import com.ms.qaTools.toolkit.mq.MQWaitGreaterThanEqualActionResult
import com.ms.qaTools.toolkit.mq.MQWaitLessThanActionResult
import com.ms.qaTools.toolkit.mq.MQWaitLessThanEqualActionResult
import com.ms.qaTools.toolkit.mq.MQWaitSimpleActionResult
import com.ms.qaTools.toolkit.mq.MQWaitResult

sealed trait MQHtmlGenerator extends BasicHtmlGenerator {
  override def runGroupIconClassName: String = "mqIcon"
  override def runGroupType: String = "MQ"

  override def generateIterationResult(name: String, fullName: String, result: IterationResult[Any], parentElement: Element, asScenario: Boolean = false, displayIterationNo: Boolean = true): Unit =
    result.moduleResult match {
      case r: Result =>
        val outputStream = new ByteArrayOutputStream
        val metaDataContexts = result.context.metaDataContexts

        printMetaDatas(metaDataContexts, Seq("MQResource"), 0, new PrintStream(outputStream))(true)
        parentElement.append(string2Html(new String(outputStream.toByteArray)) + "<br/>")
        outputStream.close()
      case r => throw new Exception(s"MQHtmlGenerator cannot handle this type of result: ${r.getClass.getName}")
    }
}

case class MQPutHtmlGenerator(implicit sc: SaturnExecutionContext) extends MQHtmlGenerator {
  override def runGroupType: String = "MQPut"

  override def generateIterationResult(name: String, fullName: String, result: IterationResult[Any], parentElement: Element, asScenario: Boolean = false, displayIterationNo: Boolean = true): Unit = {
    super.generateIterationResult(name, fullName, result, parentElement, asScenario, displayIterationNo)
    result.moduleResult match {
      case r: MQPutResult =>
        parentElement.append("<b><u>MQ Put Operation</u></b><br/>")
        for (e <- result.exception) appendException(parentElement, e, 0)(sc.outputVerbosity)

        val outputStream = new ByteArrayOutputStream
        val metaDataContexts = result.context.metaDataContexts

        r match {
          case MQPutResult(Passed, _, mqActionResults) =>
            mqActionResults.zipWithIndex.foreach {
              case (MQPutActionResult(Passed, _, queueName, count), i) =>
                parentElement.append(htmlSpaces(1) + "Queue: " + queueName + "<br/>")
                printMetaDatas(metaDataContexts, Seq(s"Input_$i"), 1, new PrintStream(outputStream))(true)
                parentElement.append(string2Html(new String(outputStream.toByteArray)))
                outputStream.reset
                parentElement.append(htmlSpaces(1) + "Count: " + count + "<br/>")
                parentElement.append("<br/>")
            }
          case MQPutResult(Failed, ex, _) =>
            for (e <- ex)
              sc.outputVerbosity match {
                case TRACE() => parentElement.append(htmlSpaces(2) + "Error: " + e.getStackTrace.mkString("", "\n", "\n").redHtml)
                case _       => parentElement.append(htmlSpaces(2) + "Error: " + e.getMessage.redHtml)
              }
        }
      case r => throw new Exception(s"MQPutHtmlGenerator cannot handle this type of result: ${r.getClass.getName}")
    }
  }
}

case class MQGetHtmlGenerator(implicit sc: SaturnExecutionContext) extends MQHtmlGenerator {
  override def runGroupType: String = "MQGet"

  override def generateIterationResult(name: String, fullName: String, result: IterationResult[Any], parentElement: Element, asScenario: Boolean = false, displayIterationNo: Boolean = true): Unit = {
    super.generateIterationResult(name, fullName, result, parentElement, asScenario, displayIterationNo)
    result.moduleResult match {
      case r: MQGetResult =>
        parentElement.append("<b><u>MQ Get Operation</u></b><br/>")
        for (e <- result.exception) appendException(parentElement, e, 0)(sc.outputVerbosity)

        val outputStream = new ByteArrayOutputStream
        val metaDataContexts = result.context.metaDataContexts

        r match {
          case MQGetResult(Passed, _, mqActionResults) =>
            mqActionResults.zipWithIndex.foreach {
              case (mqActionResult, i) =>
                mqActionResult match {
                  case MQGetActionResult(Passed, _, queueName, count) =>
                    parentElement.append(htmlSpaces(1) + "Queue: " + queueName + "<br/>")
                    printMetaDatas(metaDataContexts, Seq(s"Output_$i"), 2, new PrintStream(outputStream))(true)
                    parentElement.append(string2Html(new String(outputStream.toByteArray)))
                    outputStream.reset
                    parentElement.append(htmlSpaces(1) + "Count: " + count + "<br/>")
                  case MQGetActionResult(Failed, ex, queueName, _) =>
                    parentElement.append(htmlSpaces(1) + "Queue: " + queueName.redHtml)
                    for (e <- ex)
                      sc.outputVerbosity match {
                        case TRACE() => parentElement.append(htmlSpaces(2) + "Error: " + e.getStackTrace.mkString("", "\n", "\n").redHtml)
                        case _       => parentElement.append(htmlSpaces(2) + "Error: " + e.getMessage.redHtml)
                      }
                }
                parentElement.append("<br/>")
            }
          case MQGetResult(Failed, ex, _) =>
            for (e <- ex)
              sc.outputVerbosity match {
                case TRACE() => parentElement.append(htmlSpaces(2) + "Error: " + e.getStackTrace.mkString("", "\n", "\n").redHtml)
                case _       => parentElement.append(htmlSpaces(2) + "Error: " + e.getMessage.redHtml)
              }
        }
      case r => throw new Exception(s"MQGetHtmlGenerator cannot handle this type of result: ${r.getClass.getName}")
    }
  }
}

case class MQWaitHtmlGenerator(implicit sc: SaturnExecutionContext) extends MQHtmlGenerator {
  override def runGroupType: String = "MQWait"

  override def generateIterationResult(name: String, fullName: String, result: IterationResult[Any], parentElement: Element, asScenario: Boolean = false, displayIterationNo: Boolean = true): Unit = {
    super.generateIterationResult(name, fullName, result, parentElement, asScenario, displayIterationNo)
    result.moduleResult match {
      case r: MQWaitResult =>
        parentElement.append("<b><u>MQ Wait Operation</u></b><br/>")
        for (e <- result.exception) appendException(parentElement, e, 0)(sc.outputVerbosity)
        r match {
          case MQWaitResult(Passed, _, details) =>
            parentElement.append(htmlSpaces(1) + "Depth details:<br/>")
            if (details.collectFirst{case MQWaitSimpleActionResult(Passed, _, _, _, _) => ()}.nonEmpty) {
              val total = details.map{
                case MQWaitSimpleActionResult(Passed, _, _, q, d) => {parentElement.append(htmlSpaces(2) + s"$q has $d msg(s)<br/>"); d}
                case d => sys.error(s"MQWaitTotalQueueDepth returned MQWaitResult(Passed, _, details) with details containing instance(s) of ${d.getClass.getSimpleName}")
              }.sum
              parentElement.append(htmlSpaces(2) + "Total depth: " + total + "<br/>")
            } else
              for (d <- details) d match {
                case MQWaitLessThanActionResult(m, q, d, a)         => parentElement.append(htmlSpaces(2) + "%s has %s msg(s) and is < %s<br/>".format(q, a, d))
                case MQWaitLessThanEqualActionResult(m, q, d, a)    => parentElement.append(htmlSpaces(2) + "%s has %s msg(s) and is <= %s<br/>".format(q, a, d))
                case MQWaitGreaterThanActionResult(m, q, d, a)      => parentElement.append(htmlSpaces(2) + "%s has %s msg(s) and is > %s<br/>".format(q, a, d))
                case MQWaitGreaterThanEqualActionResult(m, q, d, a) => parentElement.append(htmlSpaces(2) + "%s has %s msg(s) and is >= %s<br/>".format(q, a, d))
                case MQWaitEqualActionResult(m, q, d, a)            => parentElement.append(htmlSpaces(2) + "%s has %s msg(s) and is == %s<br/>".format(q, a, d))
                case MQWaitSimpleActionResult(Passed, _, m, q, a)   => parentElement.append(htmlSpaces(2) + "%s has %s msg(s)<br/>".format(q, a))
                case d => sys.error(s"MQWaitIndividualQueueDepth returned MQWaitResult(Passed, _, details) with details containing instance(s) of ${d.getClass.getSimpleName}")
              }
          case MQWaitResult(Failed, t, details) =>
            parentElement.append(htmlSpaces(1) + "Depth details:<br/>")
            val totalQueueDepthDetails = details.collect{case r @ MQWaitSimpleActionResult(Passed, _, _, _, _) => r}
            if (totalQueueDepthDetails.size == details.size) {
              val total = totalQueueDepthDetails.map {
                case MQWaitSimpleActionResult(Passed, _, _, q, d) => {parentElement.append(htmlSpaces(2) + s"%q has $d msg(s)<br/>"); d}
              }.sum
              parentElement.append(htmlSpaces(2) + "Total depth: " + total + "<br/>")
            } else
              for (d <- details) {
                val msg = d match {
                  case MQWaitSimpleActionResult(Passed, _, _, _, _) => sys.error("MQWaitIndividualQueueDepth returned MQWaitResult(Failed, t, details) with details containing instance(s) of MQWaitSimpleActionResult(Passed, ...)")
                  case MQWaitSimpleActionResult(_, t, m, q, _)      => string2Html(q + ": " + t.getOrElse(new Exception("Couldn't wait for queue")).getMessage) + "<br/>"
                  case r: MQWaitComparisonActionResult              => "%s has %s msg(s) and expecting %s %s<br/>".format(r.queue, r.actualDepth, r.operator.operatorSign, r.depth)
                }
                parentElement.append(htmlSpaces(2) + (if (d.status == Passed) msg else msg.redHtml))
              }

            for (e <- t) sc.outputVerbosity match {
              case TRACE() => parentElement.append(htmlSpaces(1) + "Error: ".redHtml + string2Html(e.getStackTrace.mkString("", "\n", "\n")).redHtml)
              case _       => parentElement.append(htmlSpaces(1) + "Error: ".redHtml + string2Html(e.getMessage).redHtml)
            }
        }
      case r => throw new Exception(s"MQWaitHtmlGenerator cannot handle this type of result: ${r.getClass.getName}")
    }
  }
}

case class MQReportHtmlGenerator(implicit sc: SaturnExecutionContext) extends MQHtmlGenerator {
  override def runGroupType: String = "MQReport"

  override def generateIterationResult(name: String, fullName: String, result: IterationResult[Any], parentElement: Element, asScenario: Boolean = false, displayIterationNo: Boolean = true): Unit = {
    super.generateIterationResult(name, fullName, result, parentElement, asScenario, displayIterationNo)
    result.moduleResult match {
      case r: MQReportResult =>
        parentElement.append("<b><u>MQ Report Operation</u></b><br/>")
        for (e <- result.exception) appendException(parentElement, e, 0)(sc.outputVerbosity)

        r.details.foreach{
          case MQReportActionResult(Passed, _, m, q, c) => parentElement.append(htmlSpaces(2) + "Queue: " + "%s has %s msg(s)<br/>".format(q, c))
          case MQReportActionResult(Failed, exception, m, q, c) =>
            parentElement.append(htmlSpaces(2) + "Queue: " + q + "<br/>")
            for (e <- exception)
              sc.outputVerbosity match {
                case TRACE() => parentElement.append(htmlSpaces(3) + "Error: " + e.getStackTrace.mkString("", "\n", "\n").redHtml)
                case _       => parentElement.append(htmlSpaces(3) + "Error: " + e.getMessage.redHtml)
              }
        }
      case r => throw new Exception(s"MQReportHtmlGenerator cannot handle this type of result: ${r.getClass.getName}")
    }
  }
}

case class MQClearHtmlGenerator(implicit sc: SaturnExecutionContext) extends MQHtmlGenerator {
  override def runGroupType: String = "MQClear"

  override def generateIterationResult(name: String, fullName: String, result: IterationResult[Any], parentElement: Element, asScenario: Boolean = false, displayIterationNo: Boolean = true): Unit = {
    super.generateIterationResult(name, fullName, result, parentElement, asScenario, displayIterationNo)
    result.moduleResult match {
      case r: MQClearResult =>
        parentElement.append("<b><u>MQ Clear Operation</u></b><br/>")
        for (e <- result.exception) appendException(parentElement, e, 0)(sc.outputVerbosity)

        r match {
          case MQClearResult(Passed, _, mqActionResults) => {
            for (mqActionResult <- mqActionResults) {
              mqActionResult match {
                case MQClearActionResult(Passed, _, queueName, count) =>
                  parentElement.append(htmlSpaces(1) + "Queue: " + queueName + "<br/>")
                  parentElement.append(htmlSpaces(1) + "Count: " + count + "<br/>")
                case MQClearActionResult(Failed, ex, queueName, _) =>
                  parentElement.append(htmlSpaces(1) + "Queue: " + queueName.redHtml)
                  for (e <- ex)
                    sc.outputVerbosity match {
                      case TRACE() => parentElement.append(htmlSpaces(2) + "Error: " + e.getStackTrace.mkString("", "\n", "\n").redHtml)
                      case _       => parentElement.append(htmlSpaces(2) + "Error: " + e.getMessage.redHtml)
                    }
              }
              parentElement.append("<br/>")
            }
          }
          case MQClearResult(Failed, ex, _) =>
            for (e <- ex)
              sc.outputVerbosity match {
                case TRACE() => parentElement.append(htmlSpaces(2) + "Error: " + e.getStackTrace.mkString("", "\n", "\n").redHtml)
                case _       => parentElement.append(htmlSpaces(2) + "Error: " + e.getMessage.redHtml)
              }
        }
      case r => throw new Exception(s"MQClearHtmlGenerator cannot handle this type of result: ${r.getClass.getName}")
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
