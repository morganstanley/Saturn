package com.ms.qaTools

import scala.annotation.tailrec
import java.io.File
import java.io.InputStream
import java.io.FileInputStream
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import org.apache.commons.codec.binary.Base64
import com.google.protobuf.ByteString
import com.google.protobuf.Message
import com.google.protobuf.Message.Builder
import com.google.protobuf.Descriptors.Descriptor
import com.google.protobuf.Descriptors.EnumDescriptor
import com.google.protobuf.Descriptors.FileDescriptor
import com.google.protobuf.Descriptors.FieldDescriptor
import com.google.protobuf.Descriptors.FieldDescriptor.JavaType
import com.google.protobuf.DescriptorProtos
import com.google.protobuf.DescriptorProtos.FileDescriptorProto
import com.google.protobuf.DescriptorProtos.DescriptorProto
import com.google.protobuf.DescriptorProtos.FieldDescriptorProto



package object protobuf {

  private val repeatingFieldName = """(.*)\[([0-9]+)\]""".r
  private def parseFieldName(field: String): (String, Option[Int]) = {
    repeatingFieldName findFirstIn field match {
      case Some(fieldWithPosition) => {
        val repeatingFieldName(f, pos) = fieldWithPosition
        (f, Some(pos.toInt))
      }
      case None => (field, None)
    }
  }

  def findField(f: String, descriptor: Descriptor): FieldDescriptor = {
    @tailrec def findField0(f: Seq[String], descriptor: Descriptor): FieldDescriptor = {
      require(descriptor != null, "No descriptor given.")
      require((f != null && !f.isEmpty), "No field given.")
      if (f.size == 1) descriptor.findFieldByName(f.head)
      else findField0(f.tail, descriptor.findFieldByName(f.head).getMessageType())
    }
    findField0(f.split("\\."), descriptor)
  }

  def getField(f: String, builder: Builder): (Builder, FieldDescriptor, Any) = {
    @tailrec def getField0(f: Seq[String], b: Builder): (Builder, FieldDescriptor, Any) = {
      require(!f.isEmpty, "Field cannot be empty")
      val (fName, index) = parseFieldName(f.head)
      val field = findField(fName, b.getDescriptorForType())
      val fieldValue =
        if (field.isRepeated()) {
          val got = b.getField(field)
          b.getField(field) match {
            case l: java.util.List[_] => l.get(index.getOrElse(1) - 1)
            case m: Message => m
          }
        } else b.getField(field)
      if (f.size == 1) (b, field, fieldValue)
      else getField0(f.tail, fieldValue.asInstanceOf[Message].toBuilder())
    }
    getField0(f.split("\\."), builder)
  }

  def setField(f: String, v: Any, builder: Builder): Builder = {
    def setField0(f: Seq[String], b: Builder): Builder = {
      def value0(v: Any): Any = v match {
        case b: Builder => b.build()
        case a: Any => v
      }
      require(!f.isEmpty, "Field cannot be empty")
      val (fName, index) = parseFieldName(f.head)
      val field = getField(f.head, b)
      val newv = value0(if (f.size > 1) setField0(f.tail, field._3.asInstanceOf[Message].toBuilder()) else v)
      if (field._2.isRepeated()) {
        if (index.isDefined) b.setRepeatedField(field._2, index.get - 1, newv)
        else b.addRepeatedField(field._2, newv)
      } else {
        //if (field._2.isRequired() && newv == null) throw new Exception("Can't set to null on a required field " + field._2.getName())
        b.setField(field._2, newv)
      }
    }
    setField0(f.split("\\."), builder)
  }

  def string2FieldDescriptorType(s: String, fd: FieldDescriptor): Any = {
    fd.getJavaType() match {
      case JavaType.MESSAGE => s
      case JavaType.BOOLEAN => s == "true"
      case JavaType.BYTE_STRING => { ByteString.copyFrom(Base64.decodeBase64(s.getBytes())) }
      case JavaType.DOUBLE => try { s.toDouble } catch { case e => throw new NumberFormatException("Invalid Double Number Specified: " + s.toString()) }
      case JavaType.ENUM => {
        val e: EnumDescriptor = fd.getEnumType()
        e.findValueByName(s) match {
          case null => throw new NullPointerException("Invalid Enum Specified: " + s.toString())
          case _ => e.findValueByName(s)
        }
      }
      case JavaType.FLOAT => try { s.toFloat } catch { case e => throw new NumberFormatException("Invalid Float Number Specified: " + s.toString()) }
      case JavaType.INT => try { s.toInt } catch { case e => throw new NumberFormatException("Invalid Integer Number Specified: " + s.toString()) }
      case JavaType.LONG => try { s.toLong } catch { case e => throw new NumberFormatException("Invalid Long Number Specified: " + s.toString()) }
      case JavaType.STRING => s.toString()
    }
  }

  def generateGenDescriptor(d: Descriptor): DescriptorProto = {
    val newDescriptorBuilder = d.toProto().toBuilder()
    val (messages, primitive) = d.getFields().partition { _.getType() == FieldDescriptor.Type.MESSAGE }
    primitive.foreach {
      p =>
        newDescriptorBuilder.removeField(0)
        val newField = p.toProto().toBuilder().setType(FieldDescriptorProto.Type.TYPE_STRING).clearTypeName().build()
        newDescriptorBuilder.addField(newField)
    }
    messages.foreach {
      m =>
        val newMessageDescriptorType = generateGenDescriptor(m.getMessageType())
        if (newDescriptorBuilder.getNestedTypeList().size() != 0) {
          newDescriptorBuilder.removeNestedType(0)
          newDescriptorBuilder.addNestedType(newMessageDescriptorType)
        }
        val newField = m.toProto().toBuilder().setType(FieldDescriptorProto.Type.TYPE_MESSAGE).setTypeName(newMessageDescriptorType.getName()).build()
        newDescriptorBuilder.removeField(0)
        newDescriptorBuilder.addField(newField)
    }
    d.getNestedTypes().foreach {
      desc =>
        val subDesc = generateGenDescriptor(desc)
        newDescriptorBuilder.removeNestedType(0)
        newDescriptorBuilder.addNestedType(subDesc)
    }
    newDescriptorBuilder.build()
  }

  def getDependencyFileDescriptor(fdp: FileDescriptorProto, inputStream: InputStream, parentFolder: File): Array[FileDescriptor] = {
    val fileDescriptors = fdp.getDependencyList().toArray().foldLeft(Array[FileDescriptor]())((fileDescriptorArray, dependency) => {
      val l = dependency.toString.replaceAll(".proto", ".desc")
      val fds = DescriptorProtos.FileDescriptorSet.parseFrom(new FileInputStream(parentFolder.getAbsolutePath() + "/" + l.toString))
      val fdp = fds.getFile(0)
      val fd = FileDescriptor.buildFrom(fdp, getDependencyFileDescriptor(fdp, inputStream, parentFolder))
      fileDescriptorArray ++ Array(fd)
    })
    fileDescriptors
  }
}
/*
COPYRIGHT NOTICE AND DISCLAIMER
Copyright (c) 2009-2016, Contributor

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License, version 3 for more details.

You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
*/
