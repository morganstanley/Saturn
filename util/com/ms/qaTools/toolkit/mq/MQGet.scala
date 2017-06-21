package com.ms.qaTools.toolkit.mq
import com.ms.qaTools.exceptions.AggregateException
import com.ms.qaTools.io.QueueIO
import com.ms.qaTools.io.rowSource.MQConsumingRowSource
import com.ms.qaTools.io.Writer
import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.{toolkit => tk}
import com.ms.qaTools.TryUtil
import com.ms.qaTools.withCloseable
import javax.jms.Message
import javax.jms.QueueSession
import scala.util.Try

case class MQGetResult(status: tk.Status, exception: Option[Throwable], details: Seq[MQGetActionResult]) extends tk.Result
case class MQGetActionResult(status: tk.Status, exception: Option[Throwable], queue: String, count: Int = -1) extends tk.Result

case class MQGetAction[X](session: QueueSession, queue: String, rowWriter: Writer[Iterator[X]], timeOut: Long)(implicit conversion: Iterator[Message] => Iterator[X])
extends tk.Runnable[MQGetActionResult] {
  def run = Try {
    withCloseable(MQConsumingRowSource(session.createReceiver(session.createQueue(queue)), session, timeOut)) { rs =>
      MQGetActionResult(tk.Passed, None, queue, rowWriter.write(rs))}}
}

case class MQGet(actions: Seq[MQGetAction[_]]) extends tk.Runnable[MQGetResult] {
  def run = actions.map{_.run.rethrow("An exception occurred while reading from queue.")}.toTrySeq.map { results =>
    MQGetResult(
      if (results.forall(_.status == tk.Passed)) tk.Passed else tk.Failed,
      Option(new AggregateException("Not able to read for all queues.", results.filter(_.status == tk.Failed).flatMap(_.exception))).filter(_.exceptions.nonEmpty),
      results)}
}

object MQGetAction {
  def apply[X](manager: String,
               queue: String,
               writer: Writer[Iterator[X]],
               timeOut: Long = QueueIO.Config().timeout)(implicit conversion: Iterator[Message] => Iterator[X]): MQGetAction[X] =
    MQGetAction(QueueIO.session(manager), queue, writer, timeOut)

  def apply[X](session: QueueSession, queue: String, writer: Writer[Iterator[X]])(implicit conversion: Iterator[Message] => Iterator[X]): MQGetAction[X] =
    MQGetAction(session, queue, writer, QueueIO.Config().timeout)

  //apply method for Saturn Runtime
  def apply[X](session: QueueSession,
               queueTry: Try[String],
               writerTry: Try[Writer[Iterator[X]]])(implicit conversion: Iterator[Message] => Iterator[X]): Try[MQGetAction[X]] =
    {
      for {
        queue <- queueTry.rethrow("An exception occurred while generating queue name.")
        writer <- writerTry.rethrow("An exception occurred while connecting output resource.")
      } yield MQGetAction[X](session, queue, writer, QueueIO.Config().timeout)
    }.rethrow("An exception occurred while setting up MQ get action.")
}

object MQGet {
  //apply method for Saturn Runtime
  def apply(actionsTry: Seq[Try[MQGetAction[_]]]): Try[MQGet] =
    actionsTry.toTrySeq.rethrow("An exception occurred when creating MQGet actions.").map(
      actions => MQGet(actions)).rethrow("An exception occurred while setting up MQ get.")
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
