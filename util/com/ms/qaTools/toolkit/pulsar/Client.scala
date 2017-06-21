package com.ms.qaTools.toolkit.pulsar
import com.google.inject.Key
import com.google.inject.TypeLiteral
import com.ms.qaTools.Injector
import com.ms.qaTools.io.NetworkIO
import com.ms.qaTools.io.QueueIO
import com.ms.qaTools.io.rowSource.RestRowSource
import com.ms.qaTools.io.rowSource.RestRowSource.TextMediaType
import com.ms.qaTools.io.rowSource.Utils.{JmsMessageUtil,StringUtil}
import com.ms.qaTools.io.TCPHandshake
import com.ms.qaTools.io.transports.{HTTP, TCP}
import com.ms.qaTools.Logger
import java.net.URI
import javax.jms.Session
import scala.util.Success

trait Client[T <: Message, U <: Message] {
  val name: String
  def send(request: T): U
}

class MqClient(val name: String, val inner: QueueIO) extends Client[TextMessage, TextMessage] {
  def send(request: TextMessage) = {
    Logger(getClass).info(name + " requests " + Message.abbrev(request))
    inner.syncInput(Iterator(request.m.toTextMessage(inner.o.session))).map(_.toList) match {
      case Success(List(reply)) => TextMessage(reply.toMessageString)}}
}

class RestClient(val name: String, uri: URI) extends Client[RestRequest, RestReply] {
  def send(m: RestRequest) = {
    Logger(getClass).info(name + " requests " + Message.abbrev(m))
    RestRowSource(HTTP(new URI(uri.toString + "/" + m.path), m.method), Iterator(m.payload.getOrElse(""))).toSeq match {
      case Seq((statusCode, statusLine, reply)) => RestReply(statusCode, statusLine, reply.toOption)
      case _ => sys.error("request:reply didn't match 1:1 in REST server")}}
}

class TcpClient(val name: String, inner: NetworkIO[Array[Byte]]) extends Client[TextMessage, TextMessage] {
  def send(request: TextMessage) = {
    Logger(getClass).info(name + " requests " + Message.abbrev(request))
    TextMessage(new String(inner.syncSendMessage(request.m.getBytes)))}
}

object Client {
  def mq(name: String, manager: String, readQueue: String, writeQueue: String, timeout: Long) =
    new MqClient(name, QueueIO(manager, readQueue, writeQueue, QueueIO.Config(timeout = timeout)))

  def rest(name: String, uri: URI) = new RestClient(name, uri)

  def tcp(name: String, host: String, port: String, handShake: TCPHandshake) = {
    val factory = Injector().getInstance(Key.get(new TypeLiteral[NetworkIO.Factory[Array[Byte]]] {}))
    new TcpClient(name, factory.create(TCP(host, port, handShake, TCP.Protocol.String))(NetworkIO.Config()))
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
