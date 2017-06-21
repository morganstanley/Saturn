package com.ms.qaTools.io

import com.ms.qaTools.Injector
import com.ms.qaTools.io.rowSource.MQConsumingRowSource
import com.ms.qaTools.io.rowWriter.MQRowWriter
import javax.jms.Message
import javax.jms.QueueConnectionFactory
import javax.jms.QueueReceiver
import javax.jms.QueueSender
import javax.jms.QueueSession
import javax.jms.Session
import scala.util.Try

case class QueueIO(i: MQConsumingRowSource, o: MQRowWriter) extends NetworkIO[Message] {
  def input  = Try(i)
  def output = Try(o)

  def syncSendMessage(m: Message): Message = {
    o.o.send(m)
    Option(i.consumer.receive(i.readTimeout)).getOrElse(throw new java.util.concurrent.TimeoutException("reading from queue: " + i.consumer.getQueue.getQueueName))
  }

  def close() = {
    i.close()
    i.session.close()
    o.close()
    o.session.close()
  }
}

object QueueIO {
  case class Config(poolSize: Int        = Int.MaxValue,
                    transacted: Boolean  = false,
                    acknowledgeMode: Int = Session.AUTO_ACKNOWLEDGE,
                    timeout: Long        = 10L)

  def apply(manager: String, queueName: String): QueueIO =
    apply(manager, queueName, queueName)

  def apply(manager: String, queueName: String, config: Config): QueueIO =
    apply(manager, queueName, queueName, config)

  def apply(manager: String, readQueueName: String, writeQueueName: String, config: Config = Config()): QueueIO = {
    val (si, so) = (session(manager, config), session(manager, config))
    QueueIO(
      MQConsumingRowSource(si.createReceiver(createQueue(si, readQueueName)), si, config.timeout),
      MQRowWriter(so.createSender(createQueue(so, writeQueueName)), so))
  }

  def createQueue(session: QueueSession, name: String) =
    session.createQueue(name) ensuring (_.getQueueName == name.split(":").last)

  def session(manager: String, config: Config = Config()): QueueSession = {
    val factory = Injector.getInstance[ConnectionFactory].create(manager, config.poolSize)
    factory.createQueueConnection.createQueueSession(config.transacted, config.acknowledgeMode)
  }

  trait ConnectionFactory {
    def create(manager: String, poolSize: Int): QueueConnectionFactory
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
