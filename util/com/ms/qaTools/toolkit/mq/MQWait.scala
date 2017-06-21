package com.ms.qaTools.toolkit.mq

import scala.annotation.tailrec
import scala.util.Try
import com.ms.qaTools.Logger
import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.TryUtil
import com.ms.qaTools.exceptions.AggregateException
import com.ms.qaTools.{toolkit => tk}

case class MQWaitResult(status: tk.Status, exception: Option[Throwable], details: Seq[MQWaitActionResult]) extends tk.Result
sealed trait MQWaitActionResult extends tk.Result {val manager: String; val queue: String}

sealed abstract class MQWaitComparisonActionResult(val operator: Operator) extends MQWaitActionResult {
  val depth: Int
  val actualDepth: Int
  def status = if (operator(actualDepth)) tk.Passed else tk.Failed
  val exception = None
}

case class MQWaitSimpleActionResult(status: tk.Status, exception: Option[Throwable], manager: String, queue: String, depth: Int = -1) extends MQWaitActionResult

case class MQWaitLessThanActionResult         (manager: String, queue: String, depth: Int, actualDepth: Int) extends MQWaitComparisonActionResult(Operator(depth, "<",  (a: Int) => a < depth))
case class MQWaitLessThanEqualActionResult    (manager: String, queue: String, depth: Int, actualDepth: Int) extends MQWaitComparisonActionResult(Operator(depth, "<=", (a: Int) => a <= depth))
case class MQWaitGreaterThanActionResult      (manager: String, queue: String, depth: Int, actualDepth: Int) extends MQWaitComparisonActionResult(Operator(depth, ">",  (a: Int) => a > depth))
case class MQWaitGreaterThanEqualActionResult (manager: String, queue: String, depth: Int, actualDepth: Int) extends MQWaitComparisonActionResult(Operator(depth, ">=", (a: Int) => a >= depth))
case class MQWaitEqualActionResult            (manager: String, queue: String, depth: Int, actualDepth: Int) extends MQWaitComparisonActionResult(Operator(depth, "==", (a: Int) => a == depth))

case class Operator(expected: Int, operatorSign: String, operator: (Int) => Boolean) extends Function1[Int, Boolean]{
  override def toString = operatorSign
  def apply(a: Int) = operator(a)
}

case class MQWaitAction(manager: String, queue: String, count: Int, evaluateCondition: (Int) => MQWaitComparisonActionResult)

case class MQWaitIndividualQueueDepth(actions: Seq[MQWaitAction], timeout: Long, retryPeriod: Long = 1000) extends tk.Runnable[MQWaitResult] {
  @tailrec
  private def wait(actions: Seq[MQWaitAction], oldResults: Map[MQWaitAction, MQWaitActionResult], startTime: Long): (Seq[MQWaitAction], Map[MQWaitAction, MQWaitActionResult]) =
    if (actions.isEmpty || (System.currentTimeMillis - startTime) > timeout) (actions, oldResults)
    else {
      val (missingActions, results) = actions.map{case a @ MQWaitAction(m, q, _, cond) =>
        MQReportAction(m, q).run match {
          case util.Success(MQReportActionResult(tk.Passed, _, _, _, depth)) => (if (cond(depth).status == tk.Passed) None else Some(a), cond(depth))
          case util.Success(result) => sys.error(s"Unexpected result for MQReportAction: `$result`")
          case util.Failure(e) => (Some(a), MQWaitSimpleActionResult(tk.Failed, Some(e), m, q))
        }
      }.unzip
      Thread.sleep(retryPeriod)
      wait(missingActions.flatten, oldResults ++ actions.zip(results).toMap, startTime)
    }

  def run = Try {
    val (missingActions, mapResults) = wait(actions, Map(), System.currentTimeMillis)
    if (missingActions.isEmpty) MQWaitResult(tk.Passed, None, mapResults.values.toSeq)
    else throw new AggregateException("Not all queues reached depth conditions within the timeout.",
      missingActions.map{case a @ MQWaitAction(m, q, count, cond) =>
        mapResults(a) match {
          case MQWaitSimpleActionResult(tk.Failed, Some(e), _, _, _) => e
          case r: MQWaitComparisonActionResult => new Exception(s"Queue $m:$q has a depth: ${r.actualDepth} and expecting ${r.operator} $count")
          case _ => sys.error("unexpected")
        }})
  }
}

case class MQWaitTotalQueueDepth(actions: Seq[MQReportAction], operator: String, depth: Int, timeout: Long = 1000, retryPeriod: Long = 1000) extends tk.Runnable[MQWaitResult] {
  @tailrec
  private def waitTotal(startTime: Long): Seq[MQWaitSimpleActionResult] = {
    val results = actions.flatMap(_.run.map{
      case MQReportActionResult(tk.Passed, _, m, q, d) => Some(MQWaitSimpleActionResult(tk.Passed, None, m, q, d))
      case MQReportActionResult(tk.Failed, Some(t), m, q, _) => Logger(getClass).debug(s"Couldn't get a report for queue $m:$q. Error: ${t.toString}."); None
    }.toOption).flatten
    if (check(results.map(_.depth).sum) || (System.currentTimeMillis - startTime) > timeout) results
    else {Thread.sleep(retryPeriod); waitTotal(startTime)}
  }

  val check = (a: Int) => operator match {
    case "<"  => a <  depth
    case "<=" => a <= depth
    case ">"  => a >  depth
    case ">=" => a >= depth
    case "==" => a == depth
    case _    => throw new IllegalArgumentException(s"ActionType of MQWait '$operator' is not valid.")
  }

  def run = Try {
    val results = waitTotal(System.currentTimeMillis)
    val totalDepth = results.map(_.depth).sum
    if(check(totalDepth)) MQWaitResult(tk.Passed, None, results)
    else sys.error(s"Total depth $totalDepth is not $operator $depth msg(s).")
  }
}

object MQWait {
  def apply(manager: String, queuesTry: Seq[Try[String]], actionType: String, checkTotalDepth: Boolean, depth: Int, timeout: Int) = {
    for {
      queues <- queuesTry.toTrySeq.rethrow("An exception occurred while generating queue names.")
      mqWait <- Try {
        if (checkTotalDepth)
          MQWaitTotalQueueDepth(queues.map(MQReportAction(manager, _)), actionType, depth, timeout = timeout * 1000)
        else {
          val action = actionType match {
            case "<"  => ((q: String) => MQWaitAction(manager, q, depth, (a: Int) => MQWaitLessThanActionResult(manager, q, depth, a)))
            case "<=" => ((q: String) => MQWaitAction(manager, q, depth, (a: Int) => MQWaitLessThanEqualActionResult(manager, q, depth, a)))
            case ">"  => ((q: String) => MQWaitAction(manager, q, depth, (a: Int) => MQWaitGreaterThanActionResult(manager, q, depth, a)))
            case ">=" => ((q: String) => MQWaitAction(manager, q, depth, (a: Int) => MQWaitGreaterThanEqualActionResult(manager, q, depth, a)))
            case "==" => ((q: String) => MQWaitAction(manager, q, depth, (a: Int) => MQWaitEqualActionResult(manager, q, depth, a)))
            case _    => throw new IllegalArgumentException(s"ActionType of MQWait '$actionType' is not valid.")
          }
          MQWaitIndividualQueueDepth(queues.map(action), timeout * 1000)
        }
      }.rethrow("An exception occurred while generating MQWait actions.")
    } yield mqWait
  }.rethrow("An exception occurred while setting up MQ wait.")
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
