package com.ms.qaTools.saturn.codeGen.notifier.console

import org.apache.commons.lang.exception.ExceptionUtils

import com.ms.qaTools.ThrowableUtil
import com.ms.qaTools.saturn.codeGen.IterationResult
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import com.ms.qaTools.saturn.runtime.TRACE
import com.ms.qaTools.saturn.runtime.notifier.console.spaces
import com.ms.qaTools.saturn.runtime.notifier.console.stringToAnsiColorString
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

sealed class MQConsoleNotifier[ResultType <: Result]() extends ConsoleNotifier[ResultType] {
  override def notifyAfterIteration(name: String, result: IterationResult[ResultType])(implicit sc: SaturnExecutionContext) = sc.logger.synchronized {
    super.notifyAfterIteration(name, result)
    implicit val noColor = sc.noOutputColor

    sc.logger.changeLogLevelDuringRuntime(result) {
      logPrintMetaDatas(result.context.metaDataContexts, Seq("MQResource"), 1)
    }
  }
}

case object MQPutOperationConsoleNotifier extends MQConsoleNotifier[MQPutResult] {
  override val runGroupType = "MQPut"

  override def notifyAfterIteration(name: String, result: IterationResult[MQPutResult])(implicit sc: SaturnExecutionContext) = sc.logger.synchronized {
    super.notifyAfterIteration(name, result)
    implicit val noColor = sc.noOutputColor

    sc.logger.changeLogLevelDuringRuntime(result) {
      sc.logger.debug(spaces(1) + "MQPut Operations:")
      result.moduleResult match {
        case MQPutResult(Passed, _, mqActionResults) => {
          mqActionResults.zipWithIndex.foreach {
            case (MQPutActionResult(Passed, _, queueName, count), i) =>
              sc.logger.debug(spaces(2) + s"Operation $i:".blue)
              sc.logger.debug(spaces(3) + "Queue: ".blue + queueName)
              logPrintMetaDatas(result.context.metaDataContexts, Seq(s"Input_$i"), 3)
              sc.logger.debug(spaces(3) + "Count: ".blue + count)
          }
        }
        case MQPutResult(Failed, ex, _) => {
          for (e <- ex) {
            sc.logger.trace("Stack Trace:".red.bold)
            sc.logger.trace(spaces(1) + ExceptionUtils.getStackTrace(e).red)
            sc.outputVerbosity match {
              case TRACE() =>
              case _       => sc.logger.debug(e.getCauseStackString.red)
            }
          }
        }
      }
      sc.logger.debug("")
    }
  }
}

case object MQGetOperationConsoleNotifier extends MQConsoleNotifier[MQGetResult] {
  override val runGroupType = "MQGet"

  override def notifyAfterIteration(name: String, result: IterationResult[MQGetResult])(implicit sc: SaturnExecutionContext) = sc.logger.synchronized {
    super.notifyAfterIteration(name, result)
    implicit val noColor = sc.noOutputColor

    sc.logger.changeLogLevelDuringRuntime(result) {
      sc.logger.debug(spaces(1) + "MQGet Operations:".blue)
      result.moduleResult match {
        case MQGetResult(Passed, _, mqActionResults) => {
          mqActionResults.zipWithIndex.foreach {
            case (mqActionResult, i) =>
              sc.logger.debug(spaces(2) + s"Operation $i:".blue)
              mqActionResult match {
                case MQGetActionResult(Passed, _, queueName, count) => {
                  sc.logger.debug(spaces(3) + "Queue: ".blue + queueName)
                  logPrintMetaDatas(result.context.metaDataContexts, Seq(s"Output_$i"), 3)
                  sc.logger.debug(spaces(3) + "Count: ".blue + count)
                }
                case MQGetActionResult(Failed, ex, queueName, _) => {
                  sc.logger.debug(spaces(3) + "Queue: ".blue + queueName.red)
                  for (e <- ex) {
                    sc.logger.trace("Stack Trace:".red.bold)
                    sc.logger.trace(spaces(1) + ExceptionUtils.getStackTrace(e).red)
                    sc.outputVerbosity match {
                      case TRACE() =>
                      case _       => sc.logger.debug(e.getCauseStackString.red)
                    }
                  }
                }
              }
          }
        }
        case MQGetResult(Failed, ex, _) => {
          for (e <- ex) {
            sc.logger.trace("Stack Trace:".red.bold)
            sc.logger.trace(spaces(1) + ExceptionUtils.getStackTrace(e).red)
            sc.outputVerbosity match {
              case TRACE() =>
              case _       => sc.logger.debug(e.getCauseStackString.red)
            }
          }
        }
      }
      sc.logger.debug("")
    }
  }
}

case object MQWaitOperationConsoleNotifier extends MQConsoleNotifier[MQWaitResult] {
  override val runGroupType = "MQWait"

  override def notifyAfterIteration(name: String, result: IterationResult[MQWaitResult])(implicit sc: SaturnExecutionContext) = sc.logger.synchronized {
    super.notifyAfterIteration(name, result)
    implicit val noColor = sc.noOutputColor

    sc.logger.changeLogLevelDuringRuntime(result) {
      sc.logger.debug(spaces(1) + "MQWait Operation:".blue)
      result.moduleResult match {
        case MQWaitResult(Passed, _, details) =>
          sc.logger.debug(spaces(2) + "Depth details:")
          if (details.collectFirst{case MQWaitSimpleActionResult(Passed, _, _, _, _) => ()}.nonEmpty) {
            val total = details.map {
              case MQWaitSimpleActionResult(Passed, _, _, q, d) => {sc.logger.debug(spaces(3) + s"$q has $d msg(s)"); d}
              case d => sys.error(s"MQWaitTotalQueueDepth returned PassMQWaitResult(details) with details containing instance(s) of ${d.getClass.getSimpleName}")
            }.sum
            sc.logger.debug(spaces(3) + "Total depth: " + total)
          } else
            details.foreach {
              case MQWaitLessThanActionResult(m, q, d, a)         => sc.logger.debug(spaces(3) + "%s has %s msg(s) and is < %s".format(q, a, d))
              case MQWaitLessThanEqualActionResult(m, q, d, a)    => sc.logger.debug(spaces(3) + "%s has %s msg(s) and is <= %s".format(q, a, d))
              case MQWaitGreaterThanActionResult(m, q, d, a)      => sc.logger.debug(spaces(3) + "%s has %s msg(s) and is > %s".format(q, a, d))
              case MQWaitGreaterThanEqualActionResult(m, q, d, a) => sc.logger.debug(spaces(3) + "%s has %s msg(s) and is >= %s".format(q, a, d))
              case MQWaitEqualActionResult(m, q, d, a)            => sc.logger.debug(spaces(3) + "%s has %s msg(s) and is == %s".format(q, a, d))
              case MQWaitSimpleActionResult(Passed, _, m, q, a)   => sc.logger.debug(spaces(3) + "%s has %s msg(s)".format(q, a))
              case d => sys.error(s"MQWaitIndividualQueueDepth returned MQWaitResult(Passed, _, details) with details containing instance(s) of MQWaitSimpleActionResult(status, ...) where status != Passed")
            }
        case MQWaitResult(Failed, t, details) =>
          sc.logger.debug(spaces(2) + "Depth details:")
          val totalQueueDepthDetails = details.collect{case r: MQWaitActionResult if r.status == Passed => r}
          if (totalQueueDepthDetails.size == details.size) { // Failed despite all substeps Passed => MQWaitTotalQueueDepth
            val total = totalQueueDepthDetails.map {
              case MQWaitSimpleActionResult(Passed, _, _, q, d) => {sc.logger.debug(spaces(3) + s"$q has $d msg(s)"); d}
              case r => sys.error(s"internal: MQWaitTotalQueueDepth returned unexpected result: $r")
            }.sum
            sc.logger.debug(spaces(3) + "Total depth: " + total)
          } else
            for (d <- details) {
              val msg = d match {
                case MQWaitSimpleActionResult(Passed, _, _, _, _) => sys.error("MQWaitIndividualQueueDepth returned MQWaitResult(Failed, t, details) with details containing instance(s) of MQWaitSimpleActionResult(Passed, ...)")
                case MQWaitSimpleActionResult(_, t, m, q, _)      => q + ": " + t.getOrElse(new Exception("Couldn't wait for queue")).getMessage
                case r: MQWaitComparisonActionResult              => "%s has %s msg(s) and expecting %s %s".format(r.queue, r.actualDepth, r.operator.operatorSign, r.depth)
              }
              sc.logger.debug(spaces(3) + (if(d.status == Passed) msg else msg.red))
            }

          for (e <- t) {
            sc.logger.trace("Stack Trace:".red.bold)
            sc.logger.trace(spaces(1) + ExceptionUtils.getStackTrace(e).red)
            sc.outputVerbosity match {
              case TRACE() =>
              case _       => sc.logger.debug(e.getCauseStackString.red)
            }
          }
      }
      sc.logger.debug("")
    }
  }
}

case object MQReportOperationConsoleNotifier extends MQConsoleNotifier[MQReportResult] {
  override val runGroupType = "MQReport"

  override def notifyAfterIteration(name: String, result: IterationResult[MQReportResult])(implicit sc: SaturnExecutionContext) = sc.logger.synchronized {
    super.notifyAfterIteration(name, result)
    implicit val noColor = sc.noOutputColor

    sc.logger.changeLogLevelDuringRuntime(result) {
      sc.logger.debug(spaces(1) + "MQReport Operation:".blue)
      result.moduleResult.details.foreach(d => d match {
        case MQReportActionResult(Passed, _, m, q, c) => println(spaces(2) + "Queue: ".blue + "%s has %s msg(s)".format(q, c))
        case MQReportActionResult(Failed, ex, m, q, c) => {
          sc.logger.debug(spaces(2) + "Queue: ".blue + q)
          for (e <- ex) {
            sc.logger.trace("Stack Trace:".red.bold)
            sc.logger.trace(spaces(1) + ExceptionUtils.getStackTrace(e).red)
            sc.outputVerbosity match {
              case TRACE() =>
              case _       => sc.logger.debug(e.getCauseStackString.red)
            }
          }
        }
      })
      sc.logger.debug("")
    }
  }
}

case object MQClearOperationConsoleNotifier extends MQConsoleNotifier[MQClearResult] {
  override val runGroupType = "MQClear"

  override def notifyAfterIteration(name: String, result: IterationResult[MQClearResult])(implicit sc: SaturnExecutionContext) = sc.logger.synchronized {
    super.notifyAfterIteration(name, result)
    implicit val noColor = sc.noOutputColor

    sc.logger.changeLogLevelDuringRuntime(result) {
      sc.logger.debug(spaces(1) + "MQClear Operations:".blue)
      result.moduleResult match {
        case MQClearResult(Passed, _, mqActionResults) => {
          for ((mqActionResult, i) <- mqActionResults.zipWithIndex) {
            sc.logger.debug(spaces(2) + s"Operation $i:".blue)
            mqActionResult match {
              case MQClearActionResult(Passed, _, queueName, count) => {
                sc.logger.debug(spaces(3) + "Queue: ".blue + queueName)
                sc.logger.debug(spaces(3) + "Count: ".blue + count)
              }
              case MQClearActionResult(Failed, ex, queueName, _) => {
                sc.logger.debug(spaces(3) + "Queue: ".blue + queueName.red)
                for (e <- ex) {
                  sc.logger.trace("Stack Trace:".red.bold)
                  sc.logger.trace(spaces(1) + ExceptionUtils.getStackTrace(e).red)
                  sc.outputVerbosity match {
                    case TRACE() =>
                    case _       => sc.logger.debug(e.getCauseStackString.red)
                  }
                }
              }
            }
          }
        }
        case MQClearResult(Failed, ex, _) => {
          for (e <- ex) {
            sc.logger.trace("Stack Trace:".red.bold)
            sc.logger.trace(spaces(1) + ExceptionUtils.getStackTrace(e).red)
            sc.outputVerbosity match {
              case TRACE() =>
              case _       => sc.logger.debug(e.getCauseStackString.red)
            }
          }
        }
      }
      sc.logger.debug("")
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
