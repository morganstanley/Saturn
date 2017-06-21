package com.ms.qaTools.io.rowSource

import com.google.protobuf.Descriptors.FieldDescriptor
import com.google.protobuf.Message
import com.ms.qaTools.protobuf.PBMappingNode
import com.ms.qaTools.tree.PBNode
import com.ms.qaTools.tree.TreeNode
import com.ms.qaTools.tree.extraction.ColumnIndex
import com.ms.qaTools.tree.extraction.ColumnMapping
import com.ms.qaTools.tree.extraction.DetachNever

class ProtoBufPathRowSource[M <: Message](
  val mappingNode: ColumnMapping[TreeNode[FieldDescriptor]],
  val rowSource: Iterator[M],
  val pathMappings: Seq[(String, String)]) extends PathRowSource[TreeNode[FieldDescriptor], M] {
  val detachNodes = DetachNever[TreeNode[FieldDescriptor]]()
  val nodeCreator: M => TreeNode[FieldDescriptor] = m => PBNode(m)
}

object ProtoBufPathRowSource {
  def apply[M <: Message](pbMappings: Seq[(String, String)], pbRowSource: Iterator[M]): ProtoBufPathRowSource[M] = pbRowSource match {
    case rs: ProtoBufRowSource[M] => {
      def createPBMappingNode0(pbPath: String, column: String, columnIndex: Int): ColumnMapping[TreeNode[FieldDescriptor]] =
        PBMappingNode(pbPath, ColumnIndex(columnIndex), rs.descriptor)
      val root: ColumnMapping[TreeNode[FieldDescriptor]] = ColumnMapping.root(Nil)
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
