package com.ms.qaTools.toolkit.pulsar2

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.stream.scaladsl.Flow
import akka.stream.scaladsl.Source

import java.net.URI
import java.sql.Connection
import java.sql.DriverManager

import scala.util.Success
import scala.util.Try

import org.kohsuke.args4j

import com.ms.qaTools.Logger
import com.ms.qaTools.toolkit

import PulsarTypes.Handler

case class Pulsar[I <: Handler, O, R, T, M](config: PulsarConfig)(implicit materializer: ActorMaterializer) {
  implicit val system = materializer.system
  implicit val execution = materializer.executionContext
  val logger = Logger(getClass)

  def run(source: Source[I, O], flow: Flow[R, T, M]) = Try {
    logger.info(s"Pulsar started with --mode ${config.mode} on host ${config.nearPoint.getHost}:${config.nearPoint.getPort}")
    source.runForeach(_.handleWith(flow))
    toolkit.Result(toolkit.Passed)
  }
}

case class PulsarConfig(mode: Mode, service: Service, protocol: Transport, endPoint: URI, nearPoint: URI, database: () => Connection, tableName: String)

class PulsarCmdLine(implicit materializer: ActorMaterializer) extends toolkit.cmdLine.BasicCmdLine {
  implicit val system = materializer.system

  @args4j.Option(name = "--mode", usage = "Pulsar mode of server, one of {proxy | caching-proxy}", required = true)
  protected val mode0: String = null
  def mode = mode0 match {
    case "proxy"         => Proxy
    case "caching-proxy" => CachingProxy
    case _               => sys.error(s"Pulsar mode $mode0: not implemented")
  }

  @args4j.Option(name = "--end-point", usage = "End-point of far-server", required = true)
  val endPoint0: String = null
  def endPoint = new URI(endPoint0)

  @args4j.Option(name = "--near-point", usage = "Near-point for Pulsar server to run", required = true)
  val nearPoint0: String = null
  def nearPoint = new URI(nearPoint0)

  def protocol = {
    val hosts = TransportHosts(nearPoint.getHost, nearPoint.getPort, endPoint.getHost, endPoint.getPort)
    endPoint.getScheme match {
      case "http" => HttpTransport(TcpTransport(hosts))
      case "tcp"  => TcpTransport(hosts)
      case "ktcp" => TcpTransport(hosts, true)
      case t      => sys.error(s"Unsupported transport protocol: $t")
    }
  }

  @args4j.Option(name = "--service", usage = "Protocol of near-point and end-point", required = true)
  protected val service0: String = null
  def service = service0 match {
    case "rest" => Rest
    case "soap" => Soap
    case _      => sys.error(s"Invalid protocol entered: $service0")
  }

  @args4j.Option(name = "--name", usage = "Name of cache [default: PulsarCache]")
  protected val cacheName0: String = null
  def cacheName = Option(cacheName0).getOrElse("PulsarCache")

  @args4j.Option(name = "--cache", usage = "Cache DB for Pulsar to write to")
  protected val cache: String = null
  lazy val database = {
    val db = DriverManager.getConnection(cache)
    Try { db.prepareStatement(s"create table $cacheName (id int identity(1,1) primary key, request varchar, response varchar)").execute() }
    db
  }

  def getConfig = PulsarConfig(mode, service, protocol, endPoint, nearPoint, () => database, cacheName)
}

object PulsarApp extends toolkit.ToolkitApp[toolkit.Result] {
  implicit val system = ActorSystem()
  implicit val materializer = ActorMaterializer()
  val APP_NAME = "Pulsar2"
  val cmdLine = new PulsarCmdLine

  Try {
    parseArguments
    val config = cmdLine.getConfig
    val source = PulsarSource(config).getSource()
    val flow = PulsarFlow(config).getFlow()
    Pulsar(config).run(source, flow)
  } match {
    case Success(pulsar) => sys.addShutdownHook{
      concurrent.Await.result(system.terminate(), concurrent.duration.Duration.Inf)}
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
