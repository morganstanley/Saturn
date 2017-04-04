package com.ms.qaTools.tcpConnection

import scala.util.Try
import com.ms.qaTools.TryUtil

import java.net.InetAddress
import java.net.InetSocketAddress
import java.nio.channels.SocketChannel

class TCPConnection(connection: NIOConnectionImpl, socketChannel: SocketChannel, isKerberos: Boolean, krb5Filter: Krb5Filter) {

  def send(sendByteArray: Array[Byte]): Unit = {
    val responseData = if (isKerberos) krb5Filter.filterOut(sendByteArray) else connection.send(sendByteArray, socketChannel)
  }

  def receive(): Array[Byte] = {
    val responseData: Array[Byte] = if (isKerberos) krb5Filter.filterIn() else connection.receive(socketChannel)
    responseData
  }

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
      val filter: Krb5Filter = Krb5Filter(conn, sChannel, krb5SvcName, kOid, true)
      filter
    }

    (for {
      connection <- Try { ConnectionFactory.apply(bufferLength, true, true, soTimeOut) }.rethrow("An exception occurred while creating connection factory.")
      socketChannel <- Try { connection.connect(new InetSocketAddress(host, port)) }.rethrow("An exception occurred while establishing socket connection.")
      krb5Filter <- Try { if (isKerberos) initializeKrbFilter(connection, socketChannel) else null }.rethrow("An exception occurred while initializing krb filter.")
    } yield new TCPConnection(connection, socketChannel, isKerberos, krb5Filter)).get
  }
}/*
COPYRIGHT NOTICE AND DISCLAIMER
Copyright (c) 2009-2016, Contributor

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License, version 3 for more details.

You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
*/
