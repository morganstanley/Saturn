package com.ms.qaTools.toolkit.pulsar
import akka.actor.ActorRef
import com.ms.qaTools.generated.pulsar.PulsarConfiguration
import com.ms.qaTools.io.rowSource.Utils.{StringUtil,W3CDocumentUtil}
import com.ms.qaTools.io.transports.HTTP
import org.w3c.dom.Document

sealed trait Message {
  def m: String
  def serialize: (String, String)
}

object Message {
  val separator = "" // FIXME manual serialization/parsing is starting to get silly

  def apply(typ: String, message: String) = typ match {
    case "TextMessage" => TextMessage(message)
    case "RestReply"   => {
      val Array(statusCode, statusLine, payload) = message.split("")
      RestReply(statusCode.toInt, statusLine, Option(payload).filter(_.nonEmpty))}
    case "RestRequest" => {
      val Array(method, path, payload) = message.split("")
      RestRequest(HTTP.Method.fromString(method), path, Option(payload).filter(_.nonEmpty))}
  }

  def abbrev(m: Message) = {
    val s = m.toString
    if (s.size > 80) s.take(80) + " ...)" else s}
}

case class TextMessage(m: String) extends Message {
  def serialize = ("TextMessage", m)
}

case class RestRequest(method: HTTP.Method, path: String, payload: Option[String] = None) extends Message {
  def serialize = ("RestRequest", Seq(method.toString, path, payload.getOrElse("")).mkString(Message.separator))
  def m = payload.getOrElse("")
}

case class RestReply(statusCode: Int, statusLine: String, payload: Option[String]) extends Message {
  def serialize = ("RestReply", Seq(statusCode.toString, statusLine, payload.getOrElse("")).mkString(Message.separator))
  def m = payload.getOrElse("")
}

case class Request(request: Message)
case class Forward(request: Message, handlers: List[Handler], client: Option[ActorRef])
case class Reply(reply: Message, request: Message)
case class Configure(config: PulsarConfiguration)
case class CacheReply(reply: Option[Message])
case class Get(key: String, request: Message) // FIXME make key a combination of message key + client/server ID
case class Put(key: String, request: Message, reply: Message)
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
