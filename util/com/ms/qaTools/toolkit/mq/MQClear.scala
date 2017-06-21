package com.ms.qaTools.toolkit.mq

import scala.util.Try

import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.TryUtil
import com.ms.qaTools.exceptions.AggregateException
import com.ms.qaTools.io.rowSource.MQConsumingRowSource
import com.ms.qaTools.{toolkit => tk}
import com.ms.qaTools.withCloseable

case class MQClearResult(status: tk.Status, exception: Option[Throwable], details: Seq[MQClearActionResult]) extends tk.Result
case class MQClearActionResult(status: tk.Status, exception: Option[Throwable], queue: String, count: Int = -1) extends tk.Result

case class MQClear(session: javax.jms.QueueSession, queues: Seq[String]) extends tk.Runnable[MQClearResult] {
  def run = queues.map { queue =>
    Try {
      withCloseable(MQConsumingRowSource(session, queue)) { mqRowSource =>
        MQClearActionResult(tk.Passed, None, queue, mqRowSource.toSeq.size)}
    }.recover {case t => MQClearActionResult(tk.Failed, Option(t), queue)}
  }.toTrySeq.map { results =>
    MQClearResult(
      if (results.forall(_.status == tk.Passed)) tk.Passed else tk.Failed,
      Option(new AggregateException("Not able to read for all queues.", results.filter(_.status == tk.Failed).flatMap(_.exception))).filter(_.exceptions.nonEmpty),
      results)
  }
}

object MQClear {
  //apply method for Saturn Runtime
  def apply(session: javax.jms.QueueSession, queueTrys: Seq[Try[String]]): Try[MQClear] =
    queueTrys.toTrySeq.rethrow("An exception occurred while generating queue names.").map(queues =>
      MQClear(session, queues)).rethrow("An exception occurred while setting up MQ clear.")
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
