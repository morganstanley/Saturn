package com.ms.qaTools.protobuf.generator

import scala.collection.JavaConversions._
import com.google.protobuf.Message
import com.google.protobuf.ByteString
import com.google.protobuf.Message.Builder
import com.ms.qaTools.tree.generator.NodeCreator
import com.ms.qaTools.tree.generator.LeafNodeCreator
import com.ms.qaTools.tree.generator.InnerNodeCreator
import com.google.protobuf.Descriptors.Descriptor
import com.google.protobuf.Descriptors.FieldDescriptor
import com.google.protobuf.Descriptors.EnumDescriptor
import com.google.protobuf.Descriptors.EnumValueDescriptor
import com.google.protobuf.Descriptors.FieldDescriptor.JavaType
import org.apache.commons.codec.binary.Base64

trait PBNodeCreator extends NodeCreator[Builder, Builder]
trait PBLeafNodeCreator extends LeafNodeCreator[Builder, Builder]
trait PBInnerNodeCreator extends InnerNodeCreator[Builder, Builder] {
  val field: String
}

case class String2EnumFunction(e: EnumDescriptor) extends Function1[String, EnumValueDescriptor] {
  def apply(s: String): EnumValueDescriptor =
    e.findValueByName(s)
}

object PBNodeCreator {
  def apply(template: Message, descriptor: Descriptor) = {
    val tobool: Function1[String, Boolean] = new Function1[String, Boolean] { def apply(s: String) = { s == "true" } }
    val tobytestring: Function1[String, ByteString] = new Function1[String, ByteString] { def apply(s: String) = { ByteString.copyFrom(Base64.decodeBase64(s.getBytes())) } }
    val todouble: Function1[String, Double] = new Function1[String, Double] { def apply(s: String) = { s.toDouble } }
    val tofloat: Function1[String, Float] = new Function1[String, Float] { def apply(s: String) = { s.toFloat } }
    val toint: Function1[String, Int] = new Function1[String, Int] { def apply(s: String) = { s.toInt } }
    val tolong: Function1[String, Long] = new Function1[String, Long] { def apply(s: String) = { s.toLong } }
    val tostr: Function1[String, String] = new Function1[String, String] { def apply(s: String) = { s } }

    def createCreators(template: Message, source: Descriptor): List[NodeCreator[Builder, Builder]] = {
      def createCreator0(fd: FieldDescriptor, value: Any): NodeCreator[Builder, Builder] = {
        fd.getJavaType() match {
          case JavaType.MESSAGE => {
            val sourceMessageType = source.findFieldByName(fd.getName()).asInstanceOf[FieldDescriptor].getMessageType()
            new PBMessageCreator(fd.getName(), createCreators(value.asInstanceOf[Message], sourceMessageType))
          }
          case JavaType.BOOLEAN => new PBFieldCreator(fd.getName(), value.toString(), tobool)
          case JavaType.BYTE_STRING => new PBFieldCreator(fd.getName(), value.toString, tobytestring)
          case JavaType.DOUBLE => new PBFieldCreator(fd.getName(), value.toString, todouble)
          case JavaType.ENUM => new PBFieldCreator(fd.getName(), value.toString(), String2EnumFunction(fd.getEnumType()))
          case JavaType.FLOAT => new PBFieldCreator(fd.getName(), value.toString, tofloat)
          case JavaType.INT => new PBFieldCreator(fd.getName(), value.toString(), toint)
          case JavaType.LONG => new PBFieldCreator(fd.getName(), value.toString(), tolong)
          case JavaType.STRING => new PBFieldCreator(fd.getName(), value.toString(), tostr)
        }
      }
      val fields = template.getAllFields()
      fields.flatMap {
        f =>
          val (fd, value) = f
          if (fd.isRepeated()) {
            val list = value.asInstanceOf[java.util.List[_]]
            //println("Resolving Repeated Field: " + fd.getName())
            list.map { l => createCreator0(source.findFieldByName(fd.getName()), l) }
          } else { /*println("Resolving: " + fd.getName());*/ Seq(createCreator0(source.findFieldByName(fd.getName()), value)) }
      }.toList
    }

    val creators = createCreators(template, descriptor)
    new PBMessageCreator("", creators)
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
