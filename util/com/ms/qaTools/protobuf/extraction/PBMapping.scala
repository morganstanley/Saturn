package com.ms.qaTools.protobuf.extraction

import com.google.protobuf.Descriptors
import com.ms.qaTools.protobuf.findField
import com.ms.qaTools.tree.PBMessageNode
import com.ms.qaTools.tree.TreeNode
import com.ms.qaTools.tree.extraction.ColumnMapping
import com.ms.qaTools.tree.extraction.Index
import com.ms.qaTools.tree.extraction.Step
import com.ms.qaTools.tree.PBRepeatedFieldNode
import com.ms.qaTools.tree.PBRepeated



sealed class PBEmptyStep extends Step[Descriptors.FieldDescriptor] {
  def getText(): String = ""
  val hasPredicates = false
  def resolve(context: TreeNode[Descriptors.FieldDescriptor]): Seq[TreeNode[Descriptors.FieldDescriptor]] =
    throw new Error("Can't resolve from an empty step.")
}

sealed abstract class AbstractFieldStep(val step: String, val field: Descriptors.FieldDescriptor) extends Step[Descriptors.FieldDescriptor] {
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

class PBMappingNode(val step: Step[Descriptors.FieldDescriptor], val children: Seq[ColumnMapping[Descriptors.FieldDescriptor]] = Nil, val mapping: Option[Index] = None) extends ColumnMapping[Descriptors.FieldDescriptor] {
  def +(that: ColumnMapping[Descriptors.FieldDescriptor]): PBMappingNode = {
    val thatstep = that.step
    if (step.getText != thatstep.getText) new RootMappingNode(Seq(this, that))
    else throw new Error("Unknown error")
  }
  override def toString() = step.getText() + (if (!children.isEmpty) children.mkString("[", ",", "]"))
}

class RootMappingNode(children: Seq[ColumnMapping[Descriptors.FieldDescriptor]] = Nil) extends PBMappingNode(new PBEmptyStep(), children, None) {
  override def +(that: ColumnMapping[Descriptors.FieldDescriptor]): PBMappingNode = {
    val thatstep = that.step
    if (step.getText != thatstep.getText) 
      new RootMappingNode(this.children ++ Seq(that))
    else 
      throw new Error("Unknown error")
  }
}

object PBMappingNode {
  def apply(pbPath: String, index: Index, descriptor: Descriptors.Descriptor): PBMappingNode = {
    val steps = pbPath.split("\\.")
    require(steps.size > 0, "There are no steps.")
    def children0(steps: Seq[String], field: Descriptors.FieldDescriptor): Seq[PBMappingNode] = {
      if (!steps.isEmpty) {
        val children = if (!steps.tail.isEmpty) children0(steps.tail, findField(steps.tail.head, field.getMessageType())) else Nil
        List(new PBMappingNode(PBFieldStep(steps.head, descriptor), children, if (steps.size != 1) None else Option(index)))
      } else Nil
    }
    val head = PBFieldStep(steps.head, descriptor)
    new PBMappingNode(head, children0(steps.tail, head.field), if (steps.size != 1) None else Option(index))
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
