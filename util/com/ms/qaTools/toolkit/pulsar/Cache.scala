package com.ms.qaTools.toolkit.pulsar
import akka.actor.{Actor, ActorSystem, Props}
import collection.JavaConverters._
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.JsonNodeFactory
import com.fasterxml.jackson.databind.node.ObjectNode
import com.ms.qaTools.conversions.MongoDB.mapToDBObject
import com.ms.qaTools.io.rowSource.JsonFileRowSource
import com.ms.qaTools.io.rowSource.mongodb.MongoDBConnection
import com.ms.qaTools.io.rowSource.mongodb.MongoDBRowSource
import com.ms.qaTools.io.rowWriter.JsonRowWriter
import com.ms.qaTools.io.rowWriter.MongoDBInsertRowWriter
import com.ms.qaTools.withCloseable
import scala.util.Try

trait Cache extends Actor {
  def get(key: String): Option[Message]
  def put(key: String, reply: Message, request: Message): Unit
  def receive: Receive = {
    case Get(key, request)        => sender ! CacheReply(get(key))
    case Put(key, reply, request) => put(key, reply, request)
  }
}

object FlushJson {
  def write(fileName: String, root: ObjectNode) = {
    val file = new java.io.File(fileName)
    val bw = new java.io.BufferedWriter(new java.io.FileWriter(file))
    bw.write(root.toString)
    bw.close
  }
}

class FlushJson(fileName: String) extends Actor {
  def receive = {
    case root: ObjectNode =>
      FlushJson.write(fileName, root)
  }
}

class NoCache extends Cache {
  def get(key: String) = None
  def put(key: String, request: Message, reply: Message) = ()
}

class JsonCache(fileName: String, readOnly: Boolean, flushRate: Int) extends Cache {
  val writer = context.actorOf(Props(classOf[FlushJson], fileName), "FlushJson")
  val root = Try(JsonFileRowSource(fileName).toList.head) match {
    case util.Success(node: ObjectNode) => node
    case _ => JsonNodeFactory.instance.objectNode // TODO warn that file couldn't be read/parsed/etc.
  }

  def get(key: String) = for {
    typ   <- Try(root.get(key).get("type").textValue).toOption
    value <- Try(root.get(key).get("value").textValue).toOption
  } yield Message(typ, value)

  def put(key: String, reply: Message, request: Message) = 
    if(!readOnly) {
      val f = JsonNodeFactory.instance
      val (typ, value) = reply.serialize
      root.set(key, f.objectNode.setAll(Map[String, JsonNode]("type" -> f.textNode(typ), "value" -> f.textNode(value)).asJava))
      if(root.size() % flushRate == 0) writer ! root 
    }

  override def postStop =
    if(readOnly)
      ()
    else {
      FlushJson.write(fileName, root)
    }
}

class MongoCache(host: String, port: Int, db: String, collection: String, user: Option[String] = None, password: Option[String] = None) extends Cache {
  val connection = (user, password) match {
    case (Some(u), Some(p)) => MongoDBConnection(host, port, db, u, p)
    case (None, None)       => MongoDBConnection(host, port, db)
    case _                  => throw new Error("user and password must both be defined when specifying Mongo credentials")}

  def get(key: String): Option[Message] =
    withCloseable(MongoDBRowSource(connection, collection, Option(mapToDBObject(Map("key" -> key))))){rs =>
      Try {
        val e = rs.next
        val List(typ, value) = List("type", "value").map(e.get(_).toString)
        Message(typ, value)
      }.toOption
    }

  def put(key: String, reply: Message, request: Message) = {
    val (typ, value) = reply.serialize
    val mongo = MongoDBInsertRowWriter(connection, collection)
    if (!mongo.exists) mongo.create(Map.empty)
    mongo.write(Iterator(Map("key" -> key, "type" -> typ, "value" -> value)))
    ()
  }

  override def postStop =
    connection.close
}

// class H2Cache extends Cache
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
