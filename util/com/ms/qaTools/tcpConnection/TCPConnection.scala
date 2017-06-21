package com.ms.qaTools.tcpConnection

import scala.util.Try
import com.ms.qaTools.TryUtil

import java.net.InetAddress
import java.net.InetSocketAddress
import java.nio.channels.SocketChannel

class TCPConnection(connection: NIOConnectionImpl, socketChannel: SocketChannel, isKerberos: Boolean, krb5Filter: Krb5Filter) {
  def send(sendByteArray: Array[Byte]): Unit =
    if (isKerberos) krb5Filter.filterOut(sendByteArray) else connection.send(sendByteArray, socketChannel)

  def receive(): Array[Byte] =
    if (isKerberos) krb5Filter.filterIn() else connection.receive(socketChannel)

  def close() = {
    if (isKerberos) krb5Filter.uninitialise()
    connection.close(socketChannel)
  }
}

object TCPConnection {
  def apply(host: String, port: Int, serviceName: String, isKerberos: Boolean, kOid: String, bufferLength: Int, soTimeOut: Int): TCPConnection = {
    def initializeKrbFilter(conn: NIOConnectionImpl, sChannel: SocketChannel): Krb5Filter = {
      val serverInstance = new InetSocketAddress(host, port)
      val krb5SvcName = serviceName + InetAddress.getByName((new InetSocketAddress(host, port)).getHostName()).getCanonicalHostName()
      Krb5Filter(conn, sChannel, krb5SvcName, kOid, true)
    }

    (for {
      connection <- Try { new NIOConnectionImpl(bufferLength, true, true, soTimeOut) }.rethrow("An exception occurred while creating connection factory.")
      socketChannel <- Try { connection.connect(new InetSocketAddress(host, port)) }.rethrow("An exception occurred while establishing socket connection.")
      krb5Filter <- Try { if (isKerberos) initializeKrbFilter(connection, socketChannel) else null }.rethrow("An exception occurred while initializing krb filter.")
    } yield new TCPConnection(connection, socketChannel, isKerberos, krb5Filter)). get
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
