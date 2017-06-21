package com.ms.qaTools.saturn.runtime.notifier.console

import org.eclipse.emf.ecore.EObject
import com.ms.qaTools.saturn.runtime.EObjectNotifier
import com.ms.qaTools.saturn.runtime.RunGroupIterationResult
import com.ms.qaTools.saturn.runtime.RunGroupIteratorResult
import com.ms.qaTools.saturn.runtime.ScalarRunGroupIterator
import com.ms.qaTools.saturn.runtime.RowSourceRunGroupIterator
import com.ms.qaTools.saturn.runtime.SaturnResult
import com.ms.qaTools.saturn.runtime.RunGroupResult
import com.ms.qaTools.saturn.runtime.RowSourceRunGroupIteratorResult
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import com.ms.qaTools.saturn.runtime.RunGroupIterator
import com.ms.qaTools.{toolkit => tk}
import com.ms.qaTools.saturn.runtime.ResourceResultContext
import com.ms.qaTools.exceptions.AggregateException
import org.apache.commons.lang.exception.ExceptionUtils
import com.ms.qaTools.saturn.runtime.VerbosityLevel
import com.ms.qaTools.saturn.runtime.DEBUG
import com.ms.qaTools.saturn.runtime.AttributeResult
import com.ms.qaTools.saturn.runtime.QUIET
import com.ms.qaTools.saturn.runtime.DEBUG_ON_PASS
import com.ms.qaTools.saturn.runtime.DEBUG_ON_FAIL
import com.ms.qaTools.saturn.runtime.TRACE
import com.ms.qaTools.saturn.runtime.DEBUG_ON_STATUS

class BasicEObjectConsoleNotifier[IterationResultType <: tk.Result, IteratorResultType <: RunGroupIteratorResult, IteratorType <: RunGroupIterator[IteratorResultType]](eObject: EObject, verbosity: Option[VerbosityLevel] = None)(implicit sc: SaturnExecutionContext)
  extends EObjectNotifier[IterationResultType, IteratorResultType, IteratorType](eObject) {
  protected val outputStream = sc.outputStream
  implicit protected val noOutputColor: Boolean = sc.noOutputColor
  protected val verbosityLevel = verbosity.getOrElse(sc.outputVerbosity)

  protected def printException(result: tk.Result, verbosityLevel: VerbosityLevel) = {
      def messageStack(e: Throwable, msg: String = "", indentLevel: Int = 0): String = {
        val newMsg = e match {
          case e: AggregateException => {
            val aggregateExceptionMsg = msg + spaces(indentLevel) + (e.getClass.getName + ": ").red.bold + e.getMessage.red
            e.exceptions.foldLeft(aggregateExceptionMsg)((currentMsg, e) => {
              val m = currentMsg + "\n" + spaces(indentLevel + 1) + (e.getClass.getName + ": ").red.bold + e.getMessage.red
              val innerAggregateExceptionMsg = verbosityLevel match {
                case TRACE() => m + "\n" + spaces(indentLevel + 2) + "Trace:".red.bold + "\n" + spaces(indentLevel + 3) + e.getStackTrace.mkString("", "\n" + spaces(indentLevel + 3), "\n").red
                case _       => m
              }
              if (e.getCause != null) messageStack(e.getCause, innerAggregateExceptionMsg + "\n", indentLevel + 2)
              else innerAggregateExceptionMsg
            })
          }
          case _ => msg + spaces(indentLevel) + (e.getClass.getName + ": ").red.bold + e.getMessage.red
        }

        e.getCause() match {
          case t: Throwable => messageStack(t, newMsg + "\n", indentLevel + 1)
          case _            => newMsg
        }
      }

    for (e <- result.exception) {
      sc.logger.debug(spaces(1) + "Exception:".red.bold)
      sc.logger.debug(messageStack(e, "", 2).red)
      verbosityLevel match {
        case TRACE() => {
          sc.logger.trace("Trace:".red.bold)
          sc.logger.trace(spaces(1) + ExceptionUtils.getStackTrace(e).replaceAll("\n", "\n" + spaces(1)).red)
        }
        case _ =>
      }
      sc.logger.debug(result.errorMessage.getOrElse("").red)
    }
  }

  protected def printResources(resultContexts: Map[String, ResourceResultContext]) = {
    if (resultContexts.size > 0) {
      sc.logger.debug(spaces(1) + "Resources:".blue)
      resultContexts.toSeq.sortBy(r => r._1).foreach(r => {
        printResourceContext(r._2, 2)
      })
    }
  }

  protected def printAttributes(attributeResults: Seq[AttributeResult]) = {
    if (!attributeResults.isEmpty) sc.logger.debug(spaces(1) + "Attributes:")
    attributeResults.toSeq.sortBy(ar => ar.name).foreach(ar => {
      ar.status match {
        case tk.Passed => sc.logger.debug(spaces(2) + "%s: %s".format(ar.name, ar.value.getOrElse("No value!".red)))
        case tk.Failed => {
          val ex = ar.exception match {
            case Some(e) => e.getMessage()
            case None    => "Attribute failed, but no exception set!"
          }
          sc.logger.debug(spaces(2) + "%s: %s".format(ar.name, ex.red))
        }
        case tk.NotRun => sc.logger.debug(spaces(2) + "%s: %s".format(ar.name, "Attribute not ran!".yellow))
      }
    })
  }

  def debugOutput(result: tk.Result) = verbosityLevel match {
    case TRACE() => true
    case DEBUG() => true
    case DEBUG_ON_STATUS() => verbosityLevel match {
      case DEBUG_ON_PASS() => result.status == tk.Passed
      case DEBUG_ON_FAIL() => result.status == tk.Failed
    }
    case _ => false
  }

  override def notifyBeforeIterator(iter: IteratorType) = {}
  override def notifyAfterIterator(iter: IteratorType, result: IteratorResultType) = {
    verbosityLevel match {
      case QUIET() => {}
      case _ => System.out.synchronized {
        iter match {
          case scalarIterator: ScalarRunGroupIterator[_] => {} // handled at the iteration level
          case rowSourceIterator: RowSourceRunGroupIterator[_] => {
            result match {
              case rsResult: RowSourceRunGroupIteratorResult[_] => {
                sc.logger.info("%s(%s) - %s".format(iter.name.blue.bold.reset, iter.configType.blue, statusToString(result.status)))

                if(debugOutput(result)) {
                  sc.logger.info(spaces(1) + "Iterations:".blue)
                  rsResult.iterationResults.zipWithIndex.foreach { case (r, i) => sc.logger.info(spaces(2) + "%s%s - %s".format(r.name.blue.bold.reset, ("[" + i + "]").blue, statusToString(r.status))) }
                  printException(rsResult, verbosityLevel)
                  printAttributes(result.resultContext.attributes)
                  printResources(rsResult.resultContext.resourceContexts)
                  sc.logger.info("")
                }
              }
              case _ => throw new Exception("Unknown result type: " + result)
            }
          }
          case _ => throw new Exception("Unknown iterator type: " + iter)
        }
      }
    }
  }

  override def notifyBeforeIteration(iter: IteratorType, iterationNo: Int) = {}
  override def notifyAfterIteration(iter: IteratorType, result: RunGroupIterationResult[IterationResultType], iterationNo: Int) = {
    verbosityLevel match {
      case QUIET() => {}
      case _ => System.out.synchronized {
        iter match {
          case scalarIterator: ScalarRunGroupIterator[_] => sc.logger.info("%s(%s) - Iteration: %s - %s".format(iter.name.bold.reset, iter.configType.blue, iterationNo, statusToString(result.status)).blue)
          case rowSourceIterator: RowSourceRunGroupIterator[_] => sc.logger.info("%s(%s) - Iteration: %s - %s".format(iter.name.bold.reset, iter.configType.blue, iterationNo, statusToString(result.status)).blue)
          case _ => sc.logger.info(("Unknown: " + iter).red)
        }

        if (debugOutput(result)) {
          printAttributes(result.resultContext.attributes)
          printResources(result.resultContext.resourceContexts)
          printException(result, verbosityLevel)
        }
      }
    }
  }
}

object BasicEObjectConsoleNotifier {
  def apply[IterationResultType <: tk.Result, IteratorResultType <: RunGroupIteratorResult, IteratorType <: RunGroupIterator[IteratorResultType]](eObject: EObject, verbosity: Option[VerbosityLevel] = None)(implicit sc: SaturnExecutionContext) =
    new BasicEObjectConsoleNotifier[IterationResultType, IteratorResultType, IteratorType](eObject, verbosity)
}

case class SaturnConsoleNotifier[IteratorResultType <: RunGroupIteratorResult, IteratorType <: RunGroupIterator[IteratorResultType]](eObject: EObject, verbosity: Option[VerbosityLevel] = None)(implicit sc: SaturnExecutionContext)
  extends BasicEObjectConsoleNotifier[SaturnResult, IteratorResultType, IteratorType](eObject, verbosity) {
  implicit override protected val noOutputColor: Boolean = sc.noOutputColor

  override def notifyAfterIteration(iter: IteratorType, result: RunGroupIterationResult[SaturnResult], iterationNo: Int) = {
    System.out.synchronized {
      super.notifyAfterIteration(iter, result, iterationNo)
      if (debugOutput(result)) {
        for (r <- result.result) {
          val childrens = r.runGroupByName
          if (childrens.size == 0) sc.logger.debug(spaces(1) + "Children: ".blue + "None")
          else {
            sc.logger.debug(spaces(1) + "Children:".blue)
            r.runGroupByName.foreach(r => {
              sc.logger.debug(spaces(2) + "%s - %s".format(r._1, statusToString(r._2.status)))
            })
            sc.logger.debug("")
          }
        }
      }
    }
  }
}

case class RunGroupConsoleNotifier[IteratorResultType <: RunGroupIteratorResult, IteratorType <: RunGroupIterator[IteratorResultType]](eObject: EObject, verbosity: Option[VerbosityLevel] = None)(implicit sc: SaturnExecutionContext)
  extends BasicEObjectConsoleNotifier[RunGroupResult, IteratorResultType, IteratorType](eObject, verbosity) {
  implicit override protected val noOutputColor: Boolean = sc.noOutputColor

  override def notifyAfterIteration(iter: IteratorType, result: RunGroupIterationResult[RunGroupResult], iterationNo: Int) = {
    System.out.synchronized {
      super.notifyAfterIteration(iter, result, iterationNo)
      if (debugOutput(result)) {
        for (r <- result.result) {
          val childrens = r.runGroupByName
          if (childrens.size == 0) sc.logger.debug(spaces(1) + "Children: ".blue + "None")
          else {
            sc.logger.debug(spaces(1) + "Children:".blue)
            r.runGroupByName.foreach(r => {
              sc.logger.debug(spaces(2) + "%s - %s".format(r._1, statusToString(r._2.status)))
            })
          }
        }
        sc.logger.debug("")
      }
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
