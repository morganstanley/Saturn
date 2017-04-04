package com.ms.qaTools.io.rowSource.protobuf

import com.google.protobuf.Descriptors.FieldDescriptor
import com.google.protobuf.Message
import com.ms.qaTools.io.rowSource.PathRowSource
import com.ms.qaTools.protobuf.extraction.PBMappingNode
import com.ms.qaTools.protobuf.extraction.RootMappingNode
import com.ms.qaTools.tree.PBNode
import com.ms.qaTools.tree.TreeNode
import com.ms.qaTools.tree.extraction.ColumnIndex
import com.ms.qaTools.tree.extraction.ColumnMapping
import com.ms.qaTools.tree.extraction.DetachNever

class ProtoBufPathRowSource[M <: Message](
  val mappingNode: ColumnMapping[FieldDescriptor],
  val rowSource: Iterator[M],
  val pathMappings: Seq[(String, String)]) extends PathRowSource[FieldDescriptor,M] {  
  val detachNodes = DetachNever[FieldDescriptor]()
  val nodeCreator: M => TreeNode[FieldDescriptor] = {case m: M => PBNode(m)}
}

object ProtoBufPathRowSource {
  def apply[M <: Message](pbMappings: Seq[(String, String)], pbRowSource: Iterator[M]): ProtoBufPathRowSource[M] = pbRowSource match {
    case rs: ProtoBufRowSource[M] => {
      def createPBMappingNode0(pbPath: String, column: String, columnIndex: Int): ColumnMapping[FieldDescriptor] =
        PBMappingNode(pbPath, ColumnIndex(columnIndex), rs.descriptor)
      val root: ColumnMapping[FieldDescriptor] = new RootMappingNode()
      val pbTreeNode = pbMappings.zipWithIndex.foldLeft(root) {
        case (ref, (xpath, i)) =>
          ref + createPBMappingNode0(xpath._1, xpath._2, i)
      }
      new ProtoBufPathRowSource[M](pbTreeNode, rs, pbMappings)
    }
    case _ => sys.error("ProtoBufPathRowSource requires ProtoBufRowSource")
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
