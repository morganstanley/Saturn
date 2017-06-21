package com.ms.qaTools.tcpConnection

import java.io.ByteArrayOutputStream
import java.net.InetSocketAddress
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.channels.Channels
import java.nio.channels.SocketChannel
import java.nio.channels.UnresolvedAddressException

trait Connection {
  def connect(server: InetSocketAddress): SocketChannel
  def isConnected(socketChannel: SocketChannel): Boolean
  def send(data: Array[Byte], socketChannel: SocketChannel)
  def receive(socketChannel: SocketChannel): Array[Byte]
  def close(socketChannel: SocketChannel)
  def getBuffer(directBuffer: Boolean, bufferLength: Int): ByteBuffer
}

class NIOConnectionImpl(bufferLength: Int, directBuffer: Boolean, confBlock: Boolean, soTimeOut: Int) extends Connection {
  def getBuffer(directBuffer: Boolean, bufferLength: Int): ByteBuffer = {
    if (directBuffer) ByteBuffer.allocateDirect(bufferLength).order(ByteOrder.BIG_ENDIAN) else
      ByteBuffer.allocate(bufferLength).order(ByteOrder.BIG_ENDIAN)
  }

  def connect(server: InetSocketAddress): SocketChannel = {
    val socketChannel: SocketChannel = SocketChannel.open()
    socketChannel.configureBlocking(confBlock)

    try {
      socketChannel.connect(server)
      socketChannel.isConnected()
      socketChannel.socket().setSoTimeout(soTimeOut)
      socketChannel
    } catch {
      case uae: UnresolvedAddressException => throw new Error("Connection has not been made to host: " + server.getHostName() + ":" + server.getPort())
      case e: Exception => throw new Error("Connection has not been made.")
    }
  }

  def isConnected(socketChannel: SocketChannel) =
    socketChannel != null && socketChannel.isConnected

  def send(data: Array[Byte], socketChannel: SocketChannel) = {
    if (null == socketChannel) throw new Error("Connection has not been made.")
    val buffer = getBuffer(directBuffer, bufferLength)
    var pos = 0
    while (pos < data.length) {
      val bytesToWrite = if ((data.length - pos) > buffer.limit()) {
        buffer.limit()
      } else {
        val len = data.length - pos
        len
      }
      buffer.clear()
      buffer.put(data, pos, bytesToWrite)
      buffer.flip()

      while (buffer.hasRemaining()) {
        socketChannel.write(buffer)
      }
      pos = pos + bytesToWrite
    }
  }

  def receive(socketChannel: SocketChannel) = {
    if (null == socketChannel) throw new Error("Connection has not been made.")
    val buffer = getBuffer(directBuffer, bufferLength)
    buffer.clear()

    //SocketChannel will not timeout for its read operation but you can get this effect from reading from the channel in another way
    //val bytesRead = socketChannel.read(buffer)
    val inStream = socketChannel.socket().getInputStream();
    val wrappedChannel = Channels.newChannel(inStream);
    val bytesRead = try { wrappedChannel.read(buffer) } catch { case e: Exception => 0 }
    bytesRead match {
      case 0 | -1  => Array[Byte]()
      case _  =>
        val data = new Array[Byte](bytesRead)
        val byteStream = new ByteArrayOutputStream()
        buffer.rewind
        buffer.get(data, 0, data.length)
        byteStream.write(data)
        buffer.clear
        byteStream.toByteArray
    }
  }

  def close(socketChannel: SocketChannel) = socketChannel.close
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
