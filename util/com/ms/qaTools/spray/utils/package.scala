package com.ms.qaTools.spray

import spray.http.HttpHeaders.RawHeader
import spray.http.HttpHeaders.`Access-Control-Allow-Origin`
import spray.http.AllowedOrigins
import spray.http.SomeOrigins
import spray.http.HttpOrigin
import spray.http.HttpHeaders.Host
import spray.routing.directives.RespondWithDirectives.respondWithHeaders
import spray.json.RootJsonFormat
import spray.json.JsObject
import spray.json.JsString
import spray.json.JsNumber
import spray.json.JsValue
import spray.json._
import spray.json.DefaultJsonProtocol
import spray.json.DefaultJsonProtocol._

package object utils {
  def allowedOrigins(scheme: String, origins: Seq[Host]) = SomeOrigins(origins.map(HttpOrigin(scheme, _)))

  def allowedHeaders(allowedOrigins: AllowedOrigins) = respondWithHeaders(
    RawHeader("Access-Control-Allow-Headers", "Origin"),
    `Access-Control-Allow-Origin`(allowedOrigins)
  )

  def allAllowed = respondWithHeaders(RawHeader("Access-Control-Allow-Headers", "*"))

  implicit object AnyJsonFormat extends JsonFormat[Any] {
    def write(x: Any): JsValue = x match {
      case n: Int       => JsNumber(n)
      case l: Long      => JsNumber(l)
      case d: Double    => JsNumber(d)
      case f: Float     => JsNumber(f.toDouble)
      case s: String    => JsString(s)
      case x: Seq[_]    => seqFormat[Any].write(x)
      case m: Map[_, _] => mapFormat[String, Any].write(m.asInstanceOf[Map[String, Any]])
      case true         => JsTrue
      case false        => JsFalse
      case null         => JsNull
      case x            => JsString(x.toString)
    }
    def read(value: JsValue): Any =
      value match {
        case JsNull      => null
        case JsNumber(n) => n.intValue()
        case JsString(s) => s
        case a: JsArray  => listFormat[Any].read(value)
        case o: JsObject => mapFormat[String, Any].read(value)
        case JsTrue      => true
        case JsFalse     => false
        case x           => deserializationError(s"Can't deserialize this: '$x'")
      }
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
