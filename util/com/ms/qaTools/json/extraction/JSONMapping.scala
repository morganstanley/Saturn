package com.ms.qaTools.json.extraction

import com.ms.qaTools.tree.TreeNode
import com.ms.qaTools.collections.zipWithCondition
import com.ms.qaTools.tree.extraction.ColumnMapping
import com.ms.qaTools.tree.extraction.Index
import com.ms.qaTools.tree.extraction.Step
import com.fasterxml.jackson.databind.JsonNode
import com.ms.qaTools.tree.JSONObjectNode
import com.ms.qaTools.tree.JSONArrayNode
import com.ms.qaTools.tree.Repeated
import com.ms.qaTools.tree.JSONNode
import com.ms.qaTools.tree.extraction.ColumnIndex
import scala.annotation.tailrec

sealed abstract class AbstractJsonNodeStep(val step: String) extends Step[JsonNode] {
  def getText(): String = step
}

sealed class JSONStep(step: String) extends AbstractJsonNodeStep(step) {
  val hasPredicates = false
  def resolve(context: TreeNode[JsonNode]): Seq[TreeNode[JsonNode]] = {
    context match {
      case o: JSONObjectNode => o.children().filter { n => n.name == step }.flatMap {
        case a: JSONArrayNode => a.children()
        case j: JSONNode      => Seq(j)
      }
      case a: JSONArrayNode => a.children()
      case _                => throw new Error("Cannot process a name step")
    }
  }
}

sealed class JSONRootStep() extends AbstractJsonNodeStep("$") {
  val hasPredicates = false
  def resolve(context: TreeNode[JsonNode]): Seq[TreeNode[JsonNode]] = {
    context match {
      case a: JSONArrayNode  => a.children()
      case o: JSONObjectNode => Seq(o)
    }
  }
}

sealed class JSONRepeatedStep(step: String, index: Int) extends AbstractJsonNodeStep(step) {
  override def getText(): String = step + "[" + index + "]"
  val hasPredicates = true
  def resolve(context: TreeNode[JsonNode]): Seq[TreeNode[JsonNode]] = {
    context match {
      case a: JSONArrayNode => a.children().filter { n => n.name == step && n.index == index }.flatMap {
        case a: JSONArrayNode => a.children()
        case j: JSONNode      => Seq(j)
      }
      case o: JSONObjectNode => o.children().filter { n => n.name == step }.map {
        case a: JSONArrayNode => a.children()(index)
        case j: JSONNode      => j
      }
      case j: JSONNode => Seq(j)
      case _           => throw new Error("Cannot process a name step")
    }
  }
}

sealed class JSONAnonymousRepeatedStep(index: Int) extends AbstractJsonNodeStep("") {
  override def getText(): String = "[" + index + "]"
  val hasPredicates = true
  def resolve(context: TreeNode[JsonNode]): Seq[TreeNode[JsonNode]] = {
    context match {
      case r: Repeated if (r.index == index) => {
        context match {
          case a: JSONArrayNode => a.children().filter { n => n.index == index }
          case j: JSONNode      => Seq(j)
          case _                => throw new Error("Cannot process a name step")
        }
      }
      case _ => Seq()
    }
  }
}

object JSONStep {
  private val hasPosition = """(.*)(\[[0-9]+\])""".r
  def apply(step: String): AbstractJsonNodeStep = {
    hasPosition findFirstIn step match {
      case Some(fieldWithPosition) => {
        val hasPosition(stepName, pos) = fieldWithPosition
        val index = pos.dropRight(1).drop(1)
        if (stepName.isEmpty()) new JSONAnonymousRepeatedStep(index.toInt)
        else new JSONRepeatedStep(stepName, index.toInt)
      }
      case None => if (step == "$") new JSONRootStep() else new JSONStep(step)
    }
  }
}

case class JSONSimpleMappingNode(step: Step[JsonNode], children: Seq[ColumnMapping[JsonNode]], mapping: Option[Index]) extends ColumnMapping[JsonNode] {
  def +(that: ColumnMapping[JsonNode]): ColumnMapping[JsonNode] = {
    val thatstep = that.step
    if (step.getText == thatstep.getText) {
      val zipped = zipWithCondition(children.sortWith(sf), that.children.sortWith(sf))(cf)
      JSONSimpleMappingNode(step, zipped.map(mf), mapping.orElse(that.mapping))
    }
    else throw new Error("Unknown error")
  }
  override def toString() = step.getText() + (if (!children.isEmpty) children.mkString("[", ",", "]"))
}

case class JSONRootMappingNode(children: Seq[ColumnMapping[JsonNode]] = Nil) extends ColumnMapping[JsonNode] {
  lazy val step = ???
  val mapping: Option[Index] = None
  override def +(that: ColumnMapping[JsonNode]): ColumnMapping[JsonNode] = {
    that match {
      case JSONRootMappingNode(c) => {
        val zipped = zipWithCondition(children.sortWith(sf), c.sortWith(sf))(cf)
        JSONRootMappingNode(zipped.map(mf))
      }
      case _ => throw new Error("Can't add a non-root mapping with a root mapping")
    }
  }
}

object JSONMappingNode {
  @tailrec private def processSequenceOfIndexes(step: String, accu: Seq[String] = Nil): Seq[String] = {
    if (step.isEmpty()) accu
    else if (step.indexOf("[") >= 0) {
      val end = step.indexOf("]")
      processSequenceOfIndexes(step.substring(end + 1), accu ++ Seq(step.substring(0, end + 1)))
    }
    else Seq(step)
  }

  def apply(jsonPath: String, index: Index): ColumnMapping[JsonNode] = {
    val children: Seq[ColumnMapping[JsonNode]] = {
      val steps = jsonPath.split("\\.").flatMap { processSequenceOfIndexes(_) }
      require(steps.size > 0, "There are no steps.")
      def children0(steps: Seq[String]): Seq[ColumnMapping[JsonNode]] = {
        if (!steps.isEmpty) {
          List(JSONSimpleMappingNode(JSONStep(steps.head), children0(steps.tail), if (steps.size != 1) None else Option(index)))
        }
        else Nil
      }
      children0(steps)
    }
    JSONRootMappingNode(children)
  }
}

object JSONMappingNodeTree {
  def apply(jsonPath: Seq[(String, String)]): ColumnMapping[JsonNode] = {
    def createJSONPathMappingNode0(jsonPath: String, column: String, columnIndex: Int): ColumnMapping[JsonNode] = {
      val index: Index = new ColumnIndex(columnIndex)
      JSONMappingNode(jsonPath, index)
    }
    val root: ColumnMapping[JsonNode] = JSONRootMappingNode()
    jsonPath.zipWithIndex.foldLeft(root) {
      case (ref, (path, i)) => ref + JSONMappingNode(path._1, new ColumnIndex(i))
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
