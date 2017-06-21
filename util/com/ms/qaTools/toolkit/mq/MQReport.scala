package com.ms.qaTools.toolkit.mq

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.NullNode
import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.TryUtil
import com.ms.qaTools.exceptions.AggregateException
import com.ms.qaTools.io.rowSource.MQBrowsingRowSource
import com.ms.qaTools.io.rowSource.RestRowSource
import com.ms.qaTools.io.rowSource.RestRowSource.JsonMediaType
import com.ms.qaTools.io.transports.HTTP
import com.ms.qaTools.Logger
import com.ms.qaTools.{toolkit => tk}
import scala.collection.JavaConversions._
import scala.util.Try

case class MQReportResult(status: tk.Status, exception: Option[Throwable], details: TraversableOnce[MQReportActionResult]) extends tk.Result
case class MQReportActionResult(status: tk.Status, exception: Option[Throwable], manager: String, queue: String, depth: Int = -1) extends tk.Result

case class MQReportAction(manager: String, queue: String, baseUrl: String = MQReport.watchTowerURL) extends tk.Runnable[MQReportActionResult] {
  def run = Try {
    MQReportActionResult(tk.Passed, None, manager, queue, MQBrowsingRowSource(manager, queue).size)
  } recoverWith {
    case t: java.lang.UnsupportedOperationException =>
      Logger(getClass).warn(t.getMessage + ", falling back to Watchtower")
      val query = Map(
        "resourcename" -> "%s:%s".format(manager, queue),
        "facet"        -> "MQ",
        "itemkey"      -> "ms.mq.queue_depth",
        "n"            -> "1").map{case (k, v) => s"$k=$v"}.mkString("?", "&", "")
      val response = RestRowSource(HTTP(new java.net.URI(baseUrl + query), HTTP.Get), Iterator[JsonNode](NullNode.getInstance)).dropStatus.next
      Try{
        val depth = response.get("entities").elements.collect{case e if e.get("itemKey").asText == "ms.mq.queue_depth" => e.get("value").asDouble.toInt}.next
        MQReportActionResult(tk.Passed, None, manager, queue, depth)
      } recover {
        case tt => throw new AggregateException("MQ report failed", Seq(t,
          new Exception(s"Error retrieving depth for queue: $manager:$queue. Response: $response", tt)))
      }
  }
}

case class MQReport(actions: Seq[MQReportAction]) extends tk.Runnable[MQReportResult] {
  def run = actions.map(_.run.rethrow("An exception occurred while running MQReport.")).toTrySeq.map { results =>
    MQReportResult(
      if (results.forall(_.status == tk.Passed)) tk.Passed else tk.Failed,
      Option(new AggregateException("Not able to report for all queues.", results.filter(_.status == tk.Failed).flatMap(_.exception))).filter(_.exceptions.nonEmpty),
      results)}
}

object MQReport {
  val watchTowerURL = "http://invalid"

  def apply(manager: String, queuesTry: Seq[Try[String]]): Try[MQReport] = {
    for {
      queues  <- queuesTry.toTrySeq.rethrow("An exception occurred while generating queue names.")
      actions <- Try{queues.map(MQReportAction(manager, _, watchTowerURL))}.rethrow("An exception occurred while creating MQGet actions.")
    } yield MQReport(actions)
  }.rethrow("An exception occurred while setting up MQ report.")
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
