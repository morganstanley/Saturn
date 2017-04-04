package com.ms.qaTools.protobuf
import com.google.protobuf.Descriptors.Descriptor
import com.google.protobuf.Descriptors.FieldDescriptor
import com.google.protobuf.DynamicMessage
import com.google.protobuf.Message
import com.google.protobuf.TextFormat
import com.ms.qaTools.AnyUtil
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.io.rowSource.IndexedRepresentation
import com.ms.qaTools.io.rowSource.protobuf.ProtoBufPathRowSource
import com.ms.qaTools.toolkit.pbValidate.PBValidateComparator
import com.ms.qaTools.tree.PBNode
import com.ms.qaTools.tree.TreeNode
import com.ms.qaTools.tree.validator.Comparator
import com.ms.qaTools.tree.validator.IndexedDiffSet
import com.ms.qaTools.Validator
import org.apache.commons.codec.binary.Base64

case class PbValidator(configTemplate: Option[DynamicMessage], expected: Iterator[Message], actual: Iterator[Message], descriptor: Descriptor)
extends Validator[Message, FieldDescriptor](expected, actual, configTemplate.map{PBValidateComparator(_, descriptor)}.getOrElse(PBValidateComparator())) {
  def pathRowSourceBuilder(a: Seq[(String, String)], b: Iterator[Message]) =
    ProtoBufPathRowSource.apply(a, b)

  def toSeqString(r: IndexedRepresentation[Message]) =
    Base64.encodeBase64(r.representation.toString.getBytes).map(_.toChar).mkString :: r.indexed.toList

  def fromSeqString(r: Seq[String]) = new IndexedRepresentation[Message] {
    val indexed = r.tail
    val colDefs = ColumnDefinition.fromColumnNames(keys)
    val representation = {
      val b = DynamicMessage.newBuilder(descriptor)
      TextFormat.merge(Base64.decodeBase64(r.head.getBytes).map(_.toChar).mkString, b)
      b.build
    }
  }

  def toNode(m: Message) = PBNode(m)
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
