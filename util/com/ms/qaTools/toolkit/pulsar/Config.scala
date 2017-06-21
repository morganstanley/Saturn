package com.ms.qaTools.toolkit.pulsar
import akka.actor.Actor
import akka.actor.ActorContext
import akka.actor.ActorRef
import akka.actor.ActorSystem
import akka.actor.Props
import collection.JavaConversions._
import com.ms.qaTools.complexValues.Resolver
import com.ms.qaTools.ecore.utils.ECoreXmlDeserializer
import com.ms.qaTools.ecore.utils.ECoreStringUtils
import com.ms.qaTools.generated.complexValues.ComplexValue
import com.ms.qaTools.generated.{pulsar => generated}
import com.ms.qaTools.io.{ANONYMOUS,KERBEROS,NONE}
import java.net.URI

case class Config(servers: List[ActorRef], cache: ActorRef, strategy: Config.Strategy)

object Config {
  sealed trait Strategy
  case object Active  extends Strategy
  case object Passive extends Strategy

  implicit def resolve: ComplexValue => String = (new Resolver).resolve

  def config2Server(s: generated.AbstractServer, main: ActorRef, context: ActorContext) = s match {
    case s: generated.TcpServer => {
      val host = s.getListenHost
      val port = s.getListenPort
      val handShake = Map(generated.TcpHandShake.KERBEROS -> KERBEROS,
                          generated.TcpHandShake.NONE     -> NONE)(s.getTcpHandShake)
      val client = List(s.getTargetHost, s.getTargetPort).map(Option(_)) match {
        case List(Some(host), Some(port)) =>
          Some(context.actorOf(Props(classOf[ClientActor[TextMessage, TextMessage]], Client.tcp(s.getName, host, port, handShake))))
        case _ => None
      }
      val handlers = s.getMessages.toList.map(config2Handler)
      lazy val server = context.actorOf(Props(new ServerActor(main, transport, handlers, client)))
      lazy val transport: Listener[TextMessage, TextMessage] = Server.tcp(s.getName, host, port, server, handShake == KERBEROS)
      Some(server)
    }
    case s: generated.HttpServer => {
      val host = s.getListenHost
      val port = s.getListenPort
      val client = List(s.getTargetHost, s.getTargetPort).map(Option(_)) match {
        case List(Some(host), Some(port)) => ???
        case _ => None
      }
      val handlers = s.getMessages.toList.map(config2Handler)
      lazy val server = context.actorOf(Props(new ServerActor(main, transport, handlers, client)))
      lazy val transport: Listener[TextMessage, TextMessage] = Server.http(s.getName, host, port, server)
      Some(server)
    }
    case s: generated.MqServer => {
      def manager(q0: generated.Queue, q1: generated.Queue) = {
        val List(m0, m1) = List(q0, q1).map(_.getManager)
        m0.ensuring(_ == m1, s"m0 != m1: read & write queues must be on the same manager")}
      val client = List(s.getTargetReadQueue, s.getTargetWriteQueue).map(Option(_)) match {
        case List(Some(readQueue), Some(writeQueue)) =>
          Some(context.actorOf(Props(classOf[ClientActor[TextMessage, TextMessage]],
            Client.mq(s.getName, manager(readQueue, writeQueue), readQueue.getName, writeQueue.getName, readQueue.getTimeout))))
        case _ => None
      }
      val handlers = s.getMessages.toList.map(config2Handler)
      lazy val server = context.actorOf(Props(new ServerActor(main, transport, handlers, client)))
      lazy val transport: Listener[TextMessage, TextMessage] =
        Server.mq(s.getName, manager(s.getListenReadQueue, s.getListenWriteQueue),
          s.getListenReadQueue.getName, s.getListenWriteQueue.getName, s.getListenReadQueue.getTimeout, server)
      Some(server)
    }
    case s: generated.RestServer => {
      val client = Some(context.actorOf(Props(classOf[ClientActor[RestRequest, RestReply]], Client.rest(s.getName, new URI(s.getTargetUri)))))
      val handlers = s.getMessages.toList.map(config2Handler)
      lazy val server = context.actorOf(Props(new ServerActor(main, transport, handlers, client)))
      lazy val transport: Listener[RestRequest, RestReply] = Server.rest(s.getName, new URI(s.getListenUri), server, context, Option(s.getTimeout).filterNot(_ == -1))
      Some(server)
    }
    case s => sys.error(s"Pulsar server ${s.getClass.getSimpleName}: not implemented")
  }

  def config2Cache(cache: Option[generated.AbstractCache], context: ActorContext) = cache match {
    case Some(c: generated.JsonCache) =>
      context.actorOf(Props(new JsonCache(c.getFileName, c.isReadOnly, c.getFlushRate)))
    case Some(c: generated.MongoCache) =>
      context.actorOf(Props(new MongoCache(c.getHost, resolve(c.getPort).toInt, c.getDatabase, c.getCollection, Option(resolve(c.getUser)), Option(resolve(c.getPassword)))))
    case None =>
      context.actorOf(Props[NoCache])
    case _ => ???
  }

  def config2Handler(m: generated.Message) =
    new Handler(config2Rule(Option(m.getMatch)), config2Rule(Option(m.getKey)), m.getActions.toList.map(config2Action))

  def config2Rule(rule: Option[generated.AbstractRule]): Rule = rule match {
    case Some(r: generated.All)   => All(r.getRules.toList.map((r: generated.AbstractRule) => config2Rule(Some(r))))
    case Some(r: generated.Any)   => Any(r.getRules.toList.map((r: generated.AbstractRule) => config2Rule(Some(r))))
    case Some(r: generated.Not)   => Not(config2Rule(Option(r.getRule)))
    case Some(r: generated.Xpath) => new XmlRule(r.getXpath)
    case Some(_)                  => ???
    case None => Always
  }

  def config2Action(a: generated.Action) =
    Action(Map(generated.Event.CACHE   -> Event.CACHE,
               generated.Event.RECEIVE -> Event.RECEIVE,
               generated.Event.SEND    -> Event.SEND)(a.getEvent), config2Operation(a.getOperation))

  def config2Operation(o: generated.AbstractOperation) = o match { // AbstractOperation is defined in Saturn's eclipse/com.ms.qaTools.saturn.model/schema/modules/xmlManip.xsd
      case f: generated.Drop => DropOperation
      case e: generated.Replace =>  new XmlReplaceOperation(e.getSource, e.getTarget, e.getFrom, e.getTo)
//    case o: Delete => new XmlDeleteOperation(o.getXPaths.map(resolve))
  }

  def apply(config: generated.PulsarConfiguration, main: ActorRef, context: ActorContext): Config =
    Config(
      config.getServers.toList.map(config2Server(_, main, context)).flatten,
      config2Cache(Option(config.getCache), context),
      config.getStrategy match {
        case generated.Strategy.ACTIVE  => Active
        case generated.Strategy.PASSIVE => Passive})

  def apply(configFile: String) = Parser.deserialize(configFile.toUri)

  object Parser extends ECoreXmlDeserializer[generated.PulsarConfiguration] {
    val xmlProcessor = new generated.util.PulsarXMLProcessor
    val packageInstance = generated.PulsarPackage.eINSTANCE
    val rootFeature = generated.PulsarPackage.eINSTANCE.getDocumentRoot_Pulsar
    val resourceFactory = new generated.util.PulsarResourceFactoryImpl
  }
}/*
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
