package com.ms.qaTools.toolkit.pulsar
import akka.actor.Actor
import akka.actor.ActorContext
import akka.actor.ActorRef
import akka.actor.Props
import akka.io.IO
import com.ms.qaTools.Injector
import com.ms.qaTools.io.QueueIO
import com.ms.qaTools.io.rowSource.Utils.{JmsMessageUtil,StringUtil,W3CDocumentUtil}
import com.ms.qaTools.io.transports.HTTP
import com.ms.qaTools.Logger
import concurrent.ExecutionContext.Implicits.global
import java.net.URI
import javax.jms.Session
import scala.concurrent.Promise
import scala.concurrent.Await
import scala.concurrent.duration.Duration
import spray.can.Http
import spray.routing.HttpService
import spray.routing.HttpServiceActor
import spray.routing.Route

object Listener {
  trait Factory {
    def tcp(name: String, host: String, port: String, serverActor: ActorRef, kerberized: Boolean): Listener[TextMessage, TextMessage]
    def http(name: String, host: String, port: String, serverActor: ActorRef): Listener[TextMessage, TextMessage]
  }
}

trait Listener[T <: Message, U <: Message] {
  val name: String
  def send(reply: U, request: T)
}

class MqServer(val name: String, queueIO: QueueIO, serverActor: ActorRef) extends Listener[TextMessage, TextMessage] {
  def send (reply: TextMessage, request: TextMessage) = {
    Logger(getClass).info(name + " replies " + Message.abbrev(reply))
    queueIO.output.foreach(_.write(Iterator(reply.m.toTextMessage(queueIO.o.session))))}

  val listener = concurrent.Future(
    for(i <- queueIO.input; m <- i)
      serverActor ! Request(TextMessage(m.toMessageString)))
}

object Server {
  def tcp(name: String, host: String, port: String, serverActor: ActorRef, kerberized: Boolean = false) =
    Injector.getInstance[Listener.Factory].tcp(name, host, port, serverActor, kerberized)

  def http(name: String, host: String, port: String, serverActor: ActorRef) =
    Injector.getInstance[Listener.Factory].http(name, host, port, serverActor)

  def mq(name: String, manager: String, readQueue: String, writeQueue: String, timeout: Long, serverActor: ActorRef) =
    new MqServer(name, QueueIO(manager, readQueue, writeQueue, QueueIO.Config(timeout = timeout)), serverActor)

  def rest(name: String, uri: URI, serverActor: ActorRef, context: ActorContext, timeout: Option[Long]) =
    new RestServer(name, uri, serverActor, timeout.map(n => Duration(n, "milliseconds")).getOrElse(Duration.Inf))(context)
}

class RestServer(val name: String, uri: URI, serverActor: ActorRef, timeout: Duration)(implicit context: ActorContext) extends Listener[RestRequest, RestReply] with HttpService {
  val exchange = new java.util.concurrent.ConcurrentHashMap[String, Promise[(Int, String)]]
  def actorRefFactory = context

  def send(reply: RestReply, request: RestRequest) = {
    Logger(getClass).info(name + " replies " + Message.abbrev(reply))
    Option(exchange.get(request.hashCode.toString)).foreach(_.success((reply.statusCode, reply.payload.getOrElse(""))))}

  def stop() = IO(Http)(context.system) ! Http.Unbind

  def syncSendReceive(m: RestRequest) = {
    val key = m.hashCode.toString
    exchange.put(key, Promise[(Int, String)])
    serverActor ! Request(m)
    val (statusCode, reply) = Await.result(exchange.get(key).future, timeout)
    exchange.remove(key)
    respondWithStatus(statusCode){complete(reply)}}

  val routes =
    put {
      path(Rest) {
        case path =>
          entity(as[String]) {
            payload => syncSendReceive(RestRequest(HTTP.Put, path, Option(payload)))}}} ~
    post {
      path(Rest) {
        case path =>
          entity(as[String]) {
            payload => syncSendReceive(RestRequest(HTTP.Post, path, Option(payload)))}}} ~
    get {
      path(Rest) {
        case path => syncSendReceive(RestRequest(HTTP.Get, path))}} ~
    delete {
      path(Rest) {
        case path => syncSendReceive(RestRequest(HTTP.Delete, path))}}

  IO(Http)(context.system) ! Http.Bind(context.actorOf(Props(new HttpServiceActor {def receive = runRoute(routes)})), uri.getHost, uri.getPort)
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
