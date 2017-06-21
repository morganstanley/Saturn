package com.ms.qaTools.io.transports

import com.ms.qaTools.io.TCPHandshake

// Canonical representation of various network transports so that we can easily construct and pass them around in Kronus
abstract class Transport

object TCP {
  sealed trait Protocol

  object Protocol {
    case object Plain extends Protocol
    case object String extends Protocol // message preceded by size
  }
}

case class TCP ( host: String, port: String, authentication: TCPHandshake, protocol: TCP.Protocol
               , gzipped: Boolean = false // for legacy saturn model only
               ) extends Transport

case class PTCP(host: String, port: String) extends Transport

object HTTP {
  sealed abstract class Method
  case object Get extends Method
  case object Post extends Method
  case object Put extends Method
  case object Delete extends Method

  object Method {
    def fromString(s: String): Method = s.toUpperCase match {
      case "GET"    => Get
      case "POST"   => Post
      case "PUT"    => Put
      case "DELETE" => Delete
    }
  }
}

case class HTTP(uri: java.net.URI, method: HTTP.Method, headers: Map[String, String] = Map.empty, disableChunkedEncoding: Boolean = false) extends Transport

case class MQ(manager: String, readQueueName: String, writeQueueName: String) extends Transport
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
