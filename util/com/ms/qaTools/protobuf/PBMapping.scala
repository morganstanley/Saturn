package com.ms.qaTools.protobuf

import com.google.protobuf.Descriptors
import com.ms.qaTools.tree.PBMessageNode
import com.ms.qaTools.tree.PBRepeated
import com.ms.qaTools.tree.TreeNode
import com.ms.qaTools.tree.extraction.ColumnMapping
import com.ms.qaTools.tree.extraction.Index
import com.ms.qaTools.tree.extraction.Step

sealed class PBEmptyStep extends Step[TreeNode[Descriptors.FieldDescriptor]] {
  def getText(): String = ""
  val hasPredicates = false
  def resolve(context: TreeNode[Descriptors.FieldDescriptor]): Seq[TreeNode[Descriptors.FieldDescriptor]] =
    throw new Error("Can't resolve from an empty step.")
}

sealed abstract class AbstractFieldStep(val step: String, val field: Descriptors.FieldDescriptor) extends Step[TreeNode[Descriptors.FieldDescriptor]] {
  def getText(): String = step
}

sealed class PBFieldStep(step: String, field: Descriptors.FieldDescriptor) extends AbstractFieldStep(step, field) {
  val hasPredicates = false
  def resolve(context: TreeNode[Descriptors.FieldDescriptor]): Seq[TreeNode[Descriptors.FieldDescriptor]] = {
    context match {
      case m: PBMessageNode => m.children().filter { n => n.name == step }
      case _ => throw new Error("Cannot process a name step")
    }
  }
}

sealed class PBRepeatedFieldStep(step: String, field: Descriptors.FieldDescriptor, index: Int) extends AbstractFieldStep(step, field) {
  require(field.isRepeated(), "Field must be of a repeated type.")
  val hasPredicates = true
  def resolve(context: TreeNode[Descriptors.FieldDescriptor]): Seq[TreeNode[Descriptors.FieldDescriptor]] = {
    context match {
      case m: PBMessageNode => m.children().filter { n => n.name == step && n.asInstanceOf[PBRepeated].index == index }
      case _ => throw new Error("Cannot process a name step")
    }
  }
}

object PBFieldStep {
  private val hasPosition = """(.*)(\[[0-9]+\])""".r
  def apply(step: String, descriptor: Descriptors.Descriptor): AbstractFieldStep = {
    hasPosition findFirstIn step match {
      case Some(fieldWithPosition) => {
        val hasPosition(stepName, pos) = fieldWithPosition
        new PBRepeatedFieldStep(stepName, findField(stepName, descriptor), pos.dropRight(1).drop(1).toInt)
      }
      case None => new PBFieldStep(step, findField(step, descriptor))
    }
  }
}

object PBMappingNode {
  def apply(pbPath: String, index: Index, descriptor: Descriptors.Descriptor): ColumnMapping[TreeNode[Descriptors.FieldDescriptor]] = {
    val steps = pbPath.split("\\.")
    require(steps.size > 0, "There are no steps.")
    def children0(steps: Seq[String], field: Descriptors.FieldDescriptor): Seq[ColumnMapping[TreeNode[Descriptors.FieldDescriptor]]] = {
      if (!steps.isEmpty) {
        val children = if (!steps.tail.isEmpty) children0(steps.tail, findField(steps.tail.head, field.getMessageType())) else Nil
        List(new ColumnMapping(PBFieldStep(steps.head, descriptor), if (steps.size != 1) None else Option(index), children))
      } else Nil
    }
    val head = PBFieldStep(steps.head, descriptor)
    ColumnMapping.root(ColumnMapping(head, if (steps.size != 1) None else Option(index), children0(steps.tail, head.field)) :: Nil)
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
