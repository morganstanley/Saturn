package com.ms.qaTools.toolkit.pulsar2

import scala.language.reflectiveCalls

import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import akka.stream.Materializer
import akka.stream.scaladsl.Flow
import akka.stream.scaladsl.Source
import akka.stream.scaladsl.Tcp
import spray.json.DefaultJsonProtocol
import spray.json.pimpAny

object PulsarTypes {
  type Handler = { def handleWith[F, G, M](handler: Flow[F, G, M])(implicit materializer: Materializer): M }
}
  
sealed trait Transport {
  def bindings[I, O]: Source[I,O]
  def outgoing[R, T, O]: Flow[R, T, O]
}

sealed trait Service
case object Rest extends Service
case object Soap extends Service

sealed trait Mode
case object Proxy extends Mode
case object CachingProxy extends Mode

case class PulsarSource[I, O, R, T](config: PulsarConfig)(implicit materializer: ActorMaterializer) {
  implicit val system = materializer.system
  def getSource(): Source[I, O] = config.protocol.bindings
}

case class TransportHosts(nearHost: String, nearPort: Int, endHost: String, endPort: Int)

case class HttpTransport(tcp: TcpTransport)(implicit materializer: ActorMaterializer) extends Transport {
  implicit val system = materializer.system
  def bindings[I, O] = Http().bind(tcp.hosts.nearHost, tcp.hosts.nearPort).asInstanceOf[Source[I, O]]
  def outgoing[R, T, O] = Http().outgoingConnection(tcp.hosts.endHost, tcp.hosts.endPort).asInstanceOf[Flow[R, T, O]]
}

case class TcpTransport(hosts: TransportHosts, kerberos: Boolean = false)(implicit materializer: ActorMaterializer) extends Transport {
  implicit val system = materializer.system
  def bindings[I, O] = Tcp().bind(hosts.nearHost, hosts.nearPort).asInstanceOf[Source[I, O]]
  def outgoing[R, T, O] = Tcp().outgoingConnection(hosts.endHost, hosts.endPort).asInstanceOf[Flow[R, T, O]]
}

trait Message { def entity: String }

case class messageSoap(entity: String) extends Message {
  override def toString() = entity
}

object RestMessage extends DefaultJsonProtocol {
  implicit val httpRequestProtocol = jsonFormat4(requestRest)
  implicit val httpResponseProtocol = jsonFormat4(responseRest)
  
  case class requestRest(entity: String, method: String, request: String, header: String) extends Message {
    override def toString() = this.toJson.prettyPrint
  }

  case class responseRest(entity: String, status: String, header: String, contentType: String) extends Message {
    override def toString() = this.toJson.prettyPrint
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
