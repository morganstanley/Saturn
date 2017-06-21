package com.ms.qaTools.toolkit.pulsar2

import java.sql.Connection

import scala.concurrent.Future
import scala.concurrent.duration.DurationInt
import scala.language.reflectiveCalls
import scala.util.Failure
import scala.util.Success

import PulsarTypes.Handler
import akka.http.scaladsl.model.HttpHeader
import akka.http.scaladsl.model.HttpRequest
import akka.http.scaladsl.model.HttpResponse
import akka.http.scaladsl.unmarshalling.Unmarshal
import akka.stream.ActorMaterializer
import akka.stream.FlowShape
import akka.stream.scaladsl.Broadcast
import akka.stream.scaladsl.Flow
import akka.stream.scaladsl.Framing
import akka.stream.scaladsl.GraphDSL
import akka.stream.scaladsl.Sink
import akka.stream.scaladsl.Zip
import akka.util.ByteString
import spray.json.pimpAny
import spray.json.DefaultJsonProtocol
import akka.stream.Graph
import akka.stream.scaladsl.Broadcast
import akka.stream.scaladsl._
import akka.stream.stage._
import akka.stream.{Inlet, Outlet, Attributes}

case class PulsarFlow[I <: Handler, R, T, O, M](config: PulsarConfig)(implicit materializer: ActorMaterializer) {
  implicit val system = materializer.system
  implicit val execution = materializer.executionContext
  
  def getFlow(): Flow[R, T, akka.NotUsed] = config.mode match {
    case Proxy         => proxyFlow
    case CachingProxy  => getCachingFlow
  }
    
  def getCachingFlow: Flow[R, T, akka.NotUsed] = config.protocol match {
    case h: HttpTransport               => cachingFlow(Flow[R], inMemory, Flow[T])
    case t: TcpTransport if(t.kerberos) => cachingFlow(parseMate.via(tcpFrame), Flow[T], parseMate.via(parseMate))
    case t: TcpTransport                => cachingFlow(tcpFrame, Flow[T], tcpFrame)
  }

  def proxyFlow(): Flow[R, T, akka.NotUsed] = config.protocol.outgoing
    
  def cachingFlow(afterRequest: Flow[R, R, akka.NotUsed], beforeResponse: Flow[T, T, akka.NotUsed], 
                    afterResponse: Flow[T, T, akka.NotUsed]) = Flow.fromGraph(GraphDSL.create() { implicit b =>
    import GraphDSL.Implicits._

    val db = config.database.apply()
    val cache = b.add(Zip[R, T]())    
    val request = b.add(Broadcast[R](2))
    val response = b.add(Broadcast[T](2))
      
    request.out(0) ~> proxyFlow      ~> beforeResponse ~> response.in  
    request.out(1) ~> afterRequest   ~> cache.in0
                                                          response.out(1) ~> afterResponse ~> cache.in1
    cache.out      ~> toDatabase(db)
    
    FlowShape(request.in, response.out(0)) 
  })
  
  def inMemory = Flow[T].mapAsync(1){ response => (response match { 
    case r: HttpResponse => r.entity.toStrict(5.seconds).map{ strictEntity => r.withEntity(entity = strictEntity) }
    case default         => Future(default)  
  }).asInstanceOf[Future[T]]}
      
  def toMessage[A](message: A, body: String): Message = {
    import DefaultJsonProtocol._
    def headerToJSON(headers: Seq[HttpHeader]) = (headers.map { header => (header.name, header.value) }.toMap).toJson.prettyPrint
    
    message match {
      case r: HttpRequest  if(config.service == Rest) => RestMessage.requestRest(body, r.method.value, r.uri.toString(), headerToJSON(r.headers))
      case r: HttpResponse if(config.service == Rest) => RestMessage.responseRest(body, r.status.value, headerToJSON(r.headers), r.entity.contentType.value)
      case _                                          => messageSoap(body)
    }
  }
  
  def serialize[S](message: S): Future[String] = message match {
    case r: HttpRequest  => Unmarshal(r).to[String]
    case r: HttpResponse => Unmarshal(r).to[String]
    case b: ByteString   => 
      val message = b.drop(4)
      Future(message.utf8String)
    case default         => throw new Exception("Unsupported type of request entities: $default")
  }
  
  def toDatabase(db: Connection) = Sink.foreach[(R, T)]{ case(req, res) =>
    val reqFuture = serialize(req)
    val resFuture = serialize(res)
    reqFuture.zip(resFuture) onComplete {
      case Success((reqSerialized, resSerialized)) =>
        val reqMessage = toMessage(req, reqSerialized)
        val resMessage = toMessage(res, resSerialized)
        db.prepareStatement(s"INSERT INTO ${config.tableName} (request, response) VALUES ('${reqMessage.toString}', '${resMessage.toString()}')").execute()
      case Failure(t) => throw t
    }
  }
  
  def parseMate[A] = Flow[ByteString].dropWhile(_.take(4) == ByteString("MATE")).asInstanceOf[Flow[A, A, akka.NotUsed]]
  
  def tcpFrame[A]: Flow[A, A, akka.NotUsed] = Framing.lengthField(4, 0, Int.MaxValue, java.nio.ByteOrder.BIG_ENDIAN).asInstanceOf[Flow[A, A, akka.NotUsed]]
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
