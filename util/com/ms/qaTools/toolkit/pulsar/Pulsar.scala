package com.ms.qaTools.toolkit.pulsar
import akka.actor.Actor
import akka.actor.ActorRef
import akka.actor.ActorSystem
import akka.actor.Props
import akka.pattern.ask
import akka.util.Timeout
import com.ms.qaTools.generated.pulsar.PulsarConfiguration
import com.ms.qaTools.PromiseUtil
import com.ms.qaTools.toolkit
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.concurrent.Promise
import scala.util.Try
import scala.util.Success
import scala.util.Failure
import org.kohsuke.args4j

class ServerActor[T <: Message, U <: Message](main: ActorRef, transport: Listener[T, U], handlers: List[Handler], client: Option[ActorRef]) extends Actor {
  implicit val timeout = Timeout(60.seconds)

  def receive: Receive = {
    case Request(request) => (main ? Forward(request, handlers, client)) onComplete {
      case Success(Reply(reply, request)) => transport send (reply.asInstanceOf[U], request.asInstanceOf[T])
      case Success(m) => sys.error("Expected message of type Reply, got: " + m)
      case Failure(t) => throw new Error(t.getMessage)
    }
  }
}

class ClientActor[T <: Message, U <: Message](transport: Client[T, U]) extends Actor {
  def receive: Receive = {
    case Request(request) => sender ! Reply(transport.send(request.asInstanceOf[T]), request)
  }
}

class MainActor extends Actor { // main Pulsar server
  val configuration = Promise[Config]
  def cache = configuration. get.cache
  def servers = configuration. get.servers
  def strategy = configuration. get.strategy
  implicit val timeout = Timeout(60.seconds)

  def forward(request: Message, handlers: List[Handler], clientOpt: Option[ActorRef], sender: ActorRef) = {
    val handler = handlers.find(_.matches(request)).getOrElse(new Handler(Always, Always, ???))
    def serverReply = (for(client <- clientOpt; request <- handler.modify(request, Event.RECEIVE)) yield (client ? Request(request))).getOrElse(Future.failed(new Error("No reply from far server")))
    def cacheReply = handler.key(request).map(cache ? Get(_, request)).getOrElse(Future.failed(new Error(s"No key for request: $request")))
    (strategy match {
      case Config.Passive => serverReply.recoverWith{case _ => cacheReply}
      case Config.Active  => cacheReply.recoverWith{case _ => serverReply}
    }).onComplete {
      case Success(Reply(reply: Message, request: Message)) => {
        for {
          key <- handler.key(reply)
          reply <- handler.modify(reply, Event.CACHE)
        } cache ! Put(key, reply, request) // TODO index by server's ActorRef
        for {
          reply <- handler.modify(request, reply, Event.SEND)
        } sender ! Reply(reply, request)
      }
      case Success(CacheReply(reply)) =>
        for {
          reply <-  handler.modify(request, reply.getOrElse(request), Event.SEND)
        } sender ! Reply(reply, request) // TODO make the default answer/error & cache/far server priority configurable

      case Success(m) => sys.error("Expected message of type Reply or CacheReply, got: " + m)
      case Failure(_) =>
        sender ! Reply(request, request) // TODO make the default answer/error & cache/far server priority configurable
    }
  }

  def receive: Receive = {
    case Configure(config: PulsarConfiguration) =>
      configuration.success(Config(config, self, context))
    case Forward(request: Message, handlers, client) => {
      assert(configuration.isCompleted, "Pulsar is not configured")
      forward(request, handlers, client, sender)}
  }
}

object Pulsar {
  def apply(config: PulsarConfiguration) = {
    val sys = System.getProperties()
    sys.setProperty("logback.configurationFile", "pulsarLogBack.xml")
    val system = ActorSystem("Pulsar")
    val main = system.actorOf(Props(classOf[MainActor]))
    main ! Configure(config)
    system
  }

  def apply(configFile: String): Try[ActorSystem] =
    Try(apply(Config(configFile)))
}

class PulsarCmdLine extends toolkit.cmdLine.BasicCmdLine {
  @args4j.Option(name = "--config", usage = "Configuration file", required = true)
  val config: String = null
}

object PulsarApp extends toolkit.ToolkitApp[toolkit.Result] {
  val APP_NAME = "Pulsar"
  val cmdLine = new PulsarCmdLine

  Try(parseArguments).flatMap(_ => Pulsar(cmdLine.config)) match {
    case Success(system) => sys.addShutdownHook{
      concurrent.Await.result(system.terminate, concurrent.duration.Duration.Inf)}
    case failure => exit(failure.asInstanceOf[Try[toolkit.Result]])
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
