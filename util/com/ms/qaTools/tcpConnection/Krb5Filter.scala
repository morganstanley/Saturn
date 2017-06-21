package com.ms.qaTools.tcpConnection

import java.io.ByteArrayOutputStream
import java.nio.channels.SocketChannel

import org.ietf.jgss.GSSContext
import org.ietf.jgss.GSSManager
import org.ietf.jgss.GSSName
import org.ietf.jgss.MessageProp
import org.ietf.jgss.Oid

trait Filter {
  def initialise(): GSSContext
  def uninitialise()
  def filterIn(): Array[Byte]
  def filterOut(data: Array[Byte])
}

object Krb5Filter {
  def apply(connection: Connection, socketChannel: SocketChannel, serviceName: String, kOid: String, mutualAuthn: Boolean, debug: Boolean = false): Krb5Filter = {
    def initializeKrb5Configuration() = {
      val krb = new Krb5Configuration
      krb.setClientConfiguration(debug)
    }
    initializeKrb5Configuration()
    new Krb5Filter(connection, socketChannel, serviceName, mutualAuthn, kOid)
  }
}

class Krb5Filter(connection: Connection, socketChannel: SocketChannel, serviceName: String, mutualAuthn: Boolean, kOid: String) extends Filter {
  private val MESSAGE_SIZE_LENGTH = 4
  private val manager: GSSManager = GSSManager.getInstance()
  private val serverName: GSSName = manager.createName(serviceName, GSSName.NT_HOSTBASED_SERVICE)
  private val messageProperties: MessageProp = new MessageProp(0, true)
  private val context: GSSContext = initialise()
  private def createKerberosOid(): Oid = new Oid(kOid)

  def initialise(): GSSContext = {
    def establishSecurityContext(ctx: GSSContext) = {
      var token: Array[Byte] = null
      var offset = 0
      var size = 0
      while (false == ctx.isEstablished()) {
        token = ctx.initSecContext(token, offset, size)
        if (token != null) {
          connection.send(addMessageSizeToMessage(token), socketChannel)
          token = null
        }
        if (false == ctx.isEstablished()) {
          token = connection.receive(socketChannel)
          if (token.length >= MESSAGE_SIZE_LENGTH) {
            size = readSizeFromMessage(token)
            offset = MESSAGE_SIZE_LENGTH
          }
        }
      }
    }

    def setUpSecurityContext(): GSSContext = {
      val ctx: GSSContext = manager.createContext(serverName, createKerberosOid(), null, GSSContext.DEFAULT_LIFETIME)
      ctx.requestMutualAuth(mutualAuthn)
      ctx.requestConf(true)
      ctx.requestInteg(true)
      ctx.requestCredDeleg(false)
      establishSecurityContext(ctx)
      ctx
    }

    if (null != connection) { setUpSecurityContext() } else { null }
  }

  def uninitialise() = try {
    if (null != context) context.dispose()
  } catch {
    case e: Exception => println("Unable to initialize the Krb5Filter.")
  }

  private def addMessageSizeToMessage(message: Array[Byte]): Array[Byte] = {
    val dataToSend = new ByteArrayOutputStream(MESSAGE_SIZE_LENGTH + message.length)
    dataToSend.write((message.length >> 24) & 0xFF)
    dataToSend.write((message.length >> 16) & 0xFF)
    dataToSend.write((message.length >> 8) & 0xFF)
    dataToSend.write(message.length & 0xFF)
    dataToSend.write(message)
    dataToSend.toByteArray()
  }

  private def readSizeFromMessage(message: Array[Byte]): Int = {
    if (message.length < MESSAGE_SIZE_LENGTH) {
      0
    } else {
      var size = 0
      for (i <- 0 until MESSAGE_SIZE_LENGTH) {
        size <<= 8
        size |= message.indexOf(i) & 0xFF
      }
      size
    }
  }

  def filterIn() = {
    if (null == connection) throw new Error("Krb5Filter.filterOut(): Connection object was null")
    if (false == connection.isConnected(socketChannel)) throw new Error("Krb5Filter.filterOut(): The provided connection is no longer connected")
    if (null == context || false == context.isEstablished()) throw new Error("Krb5Filter.filterOut(): KRB5 context not initialised")

    try {
      val data: Array[Byte] = connection.receive(socketChannel)
      val messageSize: Int = readSizeFromMessage(data)
      if (messageSize >= MESSAGE_SIZE_LENGTH) {
        val unwrappedData: Array[Byte] = context.unwrap(data, MESSAGE_SIZE_LENGTH, data.length - MESSAGE_SIZE_LENGTH, messageProperties)
        if (null == unwrappedData)
          Array[Byte]()
        else
          unwrappedData
      } else Array[Byte]()
    } catch {
      case e: Exception => Array[Byte]()
    }
  }

  def filterOut(data: Array[Byte]) = {
    if (null == connection) throw new Error("Krb5Filter.filterOut(): Connection object was null")
    if (null == data) throw new Error("Krb5Filter.filterOut(): Data was null")
    if (false == connection.isConnected(socketChannel)) throw new Error("Krb5Filter.filterOut(): The provided connection is no longer connected")
    if (null == context || false == context.isEstablished()) throw new Error("Krb5Filter.filterOut(): KRB5 context not initialised")

    try {
      val messageData = addMessageSizeToMessage(context.wrap(data, 0, data.length, messageProperties))
      connection.send(messageData, socketChannel)
    } catch {
      case e: Exception => throw new Error("Krb5Filter.filterOut(): unable to wrap outgoing data")
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
