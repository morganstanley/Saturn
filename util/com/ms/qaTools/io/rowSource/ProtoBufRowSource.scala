package com.ms.qaTools.io.rowSource

import java.io.BufferedInputStream
import java.io.ByteArrayInputStream
import java.io.File
import java.io.FileInputStream
import java.io.FileReader
import java.io.InputStream
import java.io.InputStreamReader
import java.io.PushbackReader
import java.io.Reader
import java.net.URLClassLoader

import scala.slick.util.CloseableIterator

import org.apache.commons.codec.binary.Base64

import com.google.protobuf.CodedInputStream
import com.google.protobuf.Descriptors.Descriptor
import com.google.protobuf.DynamicMessage
import com.google.protobuf.ExtensionRegistry
import com.google.protobuf.GeneratedMessage
import com.google.protobuf.Message
import com.google.protobuf.TextFormat

/**
 * Protobuf reader to DynamicMessage
 */

trait ProtoBufRowSource[M <: Message] extends CloseableIterator[M] {
  val descriptor: Descriptor
}

class CodedDynamicProtoBufRowSource(inputStream: ByteArrayInputStream, val descriptor: Descriptor)(implicit extensionRegistry: ExtensionRegistry) extends ProtoBufRowSource[DynamicMessage] {
  private val codedInputStream = CodedInputStream.newInstance(inputStream)

  def next: DynamicMessage = {
    val b = DynamicMessage.newBuilder(descriptor)
    codedInputStream.readMessage(b, extensionRegistry)
    b.build()
  }

  def hasNext = !codedInputStream.isAtEnd()

  def close() = inputStream.close()
}

class TextDynamicProtoBufRowSource(reader: Reader, val descriptor: Descriptor)(implicit extensionRegistry: ExtensionRegistry) extends ProtoBufRowSource[DynamicMessage] {
  private val pushbackReader: PushbackReader = new PushbackReader(reader)

  def next = {
    val b = DynamicMessage.newBuilder(descriptor)
    TextFormat.merge(pushbackReader, extensionRegistry, b)
    b.build()
  }

  def hasNext = {
    val n = pushbackReader.read()
    if (n == -1) false
    else {
      pushbackReader.unread(n)
      true
    }
  }

  def close() = reader.close()
}

class GeneratedProtoBufRowSource[M <: GeneratedMessage](stream: InputStream, generated: Class[M], val descriptor: Descriptor, readDelimited: Boolean = true) extends ProtoBufRowSource[M] {
  private val inputStream = stream
  private var cached: M = _next
  def next: M = {
    val message: M = cached
    if (readDelimited) cached = _next else cached = null.asInstanceOf[M]
    message
  }

  private def _next: M = {
    val m = generated.getMethod(if (readDelimited) "parseDelimitedFrom" else "parseFrom", classOf[InputStream])
    m.invoke(null, inputStream).asInstanceOf[M]
  }

  def hasNext = cached != null

  def close() = stream.close()
}

object ProtoBufRowSource {
  def apply(stream: InputStream, className: String, classLoader: URLClassLoader = this.getClass().getClassLoader().asInstanceOf[URLClassLoader], readDelimited: Boolean = true): ProtoBufRowSource[GeneratedMessage] = {
    val clazz = Class.forName(className, true, classLoader).asInstanceOf[Class[GeneratedMessage]]
    apply(stream, clazz, readDelimited)
  }

  def apply[M <: GeneratedMessage](stream: InputStream, clazz: Class[M], readDelimited: Boolean): ProtoBufRowSource[M] = {
    val d = clazz.getMethod("getDescriptor").invoke(null).asInstanceOf[Descriptor]
    new GeneratedProtoBufRowSource[M](stream, clazz, d, readDelimited)
  }

  def apply(fileName: String, className: String, classLoader: URLClassLoader, readDelimited: Boolean, readEncoded: Boolean): ProtoBufRowSource[GeneratedMessage] = {
    val inputStream = if (readEncoded) {
      val readData = scala.io.Source.fromFile(fileName, "utf-8").getLines.mkString
      new ByteArrayInputStream(Base64.decodeBase64(readData.getBytes()))
    }
    else new BufferedInputStream(new FileInputStream(fileName))
    apply(inputStream, Class.forName(className, true, classLoader).asInstanceOf[Class[GeneratedMessage]], readDelimited)
  }

  def apply(fileName: String, className: String, jarLocation: String, readDelimited: Boolean, readEncoded: Boolean): ProtoBufRowSource[GeneratedMessage] = {
    val inputStream = if (readEncoded) {
      val readData = scala.io.Source.fromFile(fileName, "utf-8").getLines.mkString
      new ByteArrayInputStream(Base64.decodeBase64(readData.getBytes()))
    }
    else new BufferedInputStream(new FileInputStream(fileName))
    apply(inputStream, className, jarLocation, readDelimited, readEncoded)
  }

  def apply(inputStream: InputStream, className: String, jarLocation: String, readDelimited: Boolean, readEncoded: Boolean): ProtoBufRowSource[GeneratedMessage] = {
    val classLoader = new URLClassLoader(Array((new File(jarLocation)).toURI.toURL), this.getClass().getClassLoader())
    apply(inputStream, Class.forName(className, true, classLoader).asInstanceOf[Class[GeneratedMessage]], readDelimited)
  }
}

object CodedDynamicProtoBufRowSource {
  def apply(pbFileName: String, descriptor: Descriptor)(implicit extensionRegistry: ExtensionRegistry): CodedDynamicProtoBufRowSource = {
    val readData = scala.io.Source.fromFile(pbFileName, "utf-8").getLines.mkString.getBytes()
    new CodedDynamicProtoBufRowSource(new ByteArrayInputStream(readData), descriptor)
  }

  def apply(inputStream: ByteArrayInputStream, descriptor: Descriptor)(implicit extensionRegistry: ExtensionRegistry): CodedDynamicProtoBufRowSource =
    new CodedDynamicProtoBufRowSource(inputStream, descriptor)
}

object TextDynamicProtoBufRowSource {
  def apply(pbFileName: String, descriptor: Descriptor)(implicit extensionRegistry: ExtensionRegistry): TextDynamicProtoBufRowSource =
    new TextDynamicProtoBufRowSource(new FileReader(pbFileName), descriptor)

  def apply(pbStream: InputStream, descriptor: Descriptor)(implicit extensionRegistry: ExtensionRegistry): TextDynamicProtoBufRowSource =
    new TextDynamicProtoBufRowSource(new InputStreamReader(pbStream), descriptor)

  def apply(pbReader: Reader, descriptor: Descriptor)(implicit extensionRegistry: ExtensionRegistry): TextDynamicProtoBufRowSource =
    new TextDynamicProtoBufRowSource(pbReader, descriptor)
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
