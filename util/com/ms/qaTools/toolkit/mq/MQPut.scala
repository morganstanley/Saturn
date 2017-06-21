package com.ms.qaTools.toolkit.mq

import com.ms.qaTools.exceptions.AggregateException
import com.ms.qaTools.io.QueueIO
import com.ms.qaTools.io.rowWriter.MQRowWriter
import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.{toolkit => tk}
import com.ms.qaTools.TryUtil
import com.ms.qaTools.withCloseable
import javax.jms.Message
import javax.jms.QueueSession
import scala.util.Try

case class MQPutResult(status: tk.Status, exception: Option[Throwable], details: Seq[MQPutActionResult]) extends tk.Result
case class MQPutActionResult(status: tk.Status, exception: Option[Throwable], queue: String, count: Int = -1) extends tk.Result

case class MQPutAction[X, T <: Message](val session: QueueSession,
                                        val queue: String,
                                        val rowSource: Iterator[X])(implicit conversion: Iterator[X] => Iterator[T]) extends tk.Runnable[MQPutActionResult] {
  def run = Try {
    withCloseable(MQRowWriter(session, queue)) { w =>
      MQPutActionResult(tk.Passed, None, queue, w.write(rowSource))}
  }
}

case class MQPut(actions: Seq[MQPutAction[_, _]]) extends tk.Runnable[MQPutResult] {
  def run = actions.map(_.run).toTrySeq.map { results =>
    MQPutResult(
      if (results.forall(_.status == tk.Passed)) tk.Passed else tk.Failed,
      Option(new AggregateException("Not able to write to all queues.", results.filter(_.status == tk.Failed).flatMap(_.exception))).filter(_.exceptions.nonEmpty),
      results.filter(_.status == tk.Passed))
  }
}

object MQPutAction {
  def apply[X, T <: Message](manager: String,
                             queue: String,
                             input: Iterator[X])(implicit conversion: Iterator[X] => Iterator[T]): MQPutAction[X, T] =
    MQPutAction(QueueIO.session(manager), queue, input)
  //apply method for Saturn Runtime
  def apply[X, T <: Message](session: QueueSession,
                             queueTry: Try[String],
                             inputTry: Try[Iterator[X]])(implicit conversion: Iterator[X] => Iterator[T]): Try[MQPutAction[X, T]] =
    {
      for {
        queue <- queueTry.rethrow("An exception occurred while generating queue name.")
        input <- inputTry.rethrow("An exception occurred while connecting input resource.")
      } yield MQPutAction(session, queue, input)
    }.rethrow("An exception occurred while setting up MQ put action.")
}

object MQPut {
  //apply method for Saturn Runtime
  def apply(actionsTry: Seq[Try[MQPutAction[_, _]]]): Try[MQPut] =
    actionsTry.toTrySeq.rethrow("An exception occurred while creating MQPut actions.").map(
      actions => MQPut(actions)).rethrow("An exception occurred while setting up MQ put.")
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
