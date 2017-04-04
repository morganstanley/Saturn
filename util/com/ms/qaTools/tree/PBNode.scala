package com.ms.qaTools.tree

import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.JavaConversions.asScalaSet
import com.google.protobuf.Descriptors
import com.google.protobuf.Descriptors.FieldDescriptor.JavaType
import com.google.protobuf.Message
import com.google.protobuf.ByteString
import org.apache.commons.codec.binary.Base64



abstract class PBNode(val node: Descriptors.FieldDescriptor, val value: Option[Any], pathStack: Seq[String])
  extends TreeNode[Descriptors.FieldDescriptor] {
  val path: String = pathStack.reverse.mkString(".")
  val name = if (node != null) node.getName() else ""
}

class PBMessageNode(node: Descriptors.FieldDescriptor, data: Message, pathStack: Seq[String])
  extends PBNode(node, Option(data), pathStack) {
  private val message = value.get.asInstanceOf[Message]
  private val fields = message.getAllFields()
  def fieldToSeqOfValues(f: Descriptors.FieldDescriptor): Seq[TreeNode[Descriptors.FieldDescriptor]] = {
    def getSeqOfValues0[S](f: Descriptors.FieldDescriptor): Seq[TreeNode[Descriptors.FieldDescriptor]] = {
      val v: S = message.getField(f).asInstanceOf[S]
      if (f.isRepeated()) {
        val s: Seq[S] = v.asInstanceOf[java.util.List[S]]
        s.zipWithIndex.map { p => PBNode(f, p._1, p._2, (f.getName() + "[" + p._2 + "]") +: pathStack) }
      } else Seq(PBNode(f, v, f.getName() +: pathStack))
    }
    f.getJavaType() match {
      case JavaType.MESSAGE => getSeqOfValues0[Message](f)
      case _ => getSeqOfValues0[Any](f)
    }
  }

  def children(filterOut: (Descriptors.FieldDescriptor) => Boolean = Function.const(false)) = 
    fields.keySet().filterNot{filterOut}.toSeq.flatMap { f => fieldToSeqOfValues(f) }
    
  override def hasValue = false
}

class PBFieldNode(node: Descriptors.FieldDescriptor, data: Any, pathStack: Seq[String])
  extends PBNode(node, Option(data), pathStack) {
  require(node != null, "node cannot be null.")
  def children(filterOut: (Descriptors.FieldDescriptor) => Boolean) = Nil
  override val value = data match {
    case c: Comparable[Any] => Some(c)
    case e: Descriptors.EnumValueDescriptor => Some(e.getName())
    case b: ByteString => Some(new String(Base64.encodeBase64(b.toByteArray())))
    case _ => throw new Error("Value of the field must implement Comparable.")
  }
}

trait PBRepeated {
  val index: Int
}

class PBRepeatedMessageNode(node: Descriptors.FieldDescriptor, data: Message, val index: Int, pathStack: Seq[String])
  extends PBMessageNode(node, data, pathStack) with PBRepeated
class PBRepeatedFieldNode(node: Descriptors.FieldDescriptor, data: Any, val index: Int, pathStack: Seq[String])
  extends PBFieldNode(node, data, pathStack) with PBRepeated

object PBNode {
  def apply(m: Message): TreeNode[Descriptors.FieldDescriptor] = new PBMessageNode(null, m, Nil)
  def apply(f: Descriptors.FieldDescriptor, v: Any, pathStack: Seq[String]): TreeNode[Descriptors.FieldDescriptor] = {
    f.getJavaType() match {
      case JavaType.MESSAGE => new PBMessageNode(f, v.asInstanceOf[Message], pathStack)
      case _ => new PBFieldNode(f, v, pathStack)
    }
  }
  def apply(f: Descriptors.FieldDescriptor, v: Any, index: Int, pathStack: Seq[String]): TreeNode[Descriptors.FieldDescriptor] = {
    f.getJavaType() match {
      case JavaType.MESSAGE => new PBRepeatedMessageNode(f, v.asInstanceOf[Message], index, pathStack)
      case _ => new PBRepeatedFieldNode(f, v, index, pathStack)
    }
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
