package com.ms.qaTools.json

import scala.annotation.tailrec

import com.fasterxml.jackson.databind
import com.ms.qaTools.tree.JsonArrayNode
import com.ms.qaTools.tree.JsonNode
import com.ms.qaTools.tree.JsonObjectNode
import com.ms.qaTools.tree.Repeated
import com.ms.qaTools.tree.TreeNode
import com.ms.qaTools.tree.extraction.ColumnIndex
import com.ms.qaTools.tree.extraction.ColumnMapping
import com.ms.qaTools.tree.extraction.Index
import com.ms.qaTools.tree.extraction.Step

sealed abstract class AbstractJsonNodeStep(val step: String) extends Step[TreeNode[databind.JsonNode]] {
  def getText(): String = step
}

sealed class JSONStep(step: String) extends AbstractJsonNodeStep(step) {
  val hasPredicates = false
  def resolve(context: TreeNode[databind.JsonNode]): Seq[TreeNode[databind.JsonNode]] = {
    context match {
      case o: JsonObjectNode => o.children().filter { n => n.name == step }.flatMap {
        case a: JsonArrayNode => a.children()
        case j: JsonNode      => Seq(j)
      }
      case a: JsonArrayNode => a.children()
      case _                => throw new Error("Cannot process a name step")
    }
  }
}

sealed class JSONRootStep() extends AbstractJsonNodeStep("$") {
  val hasPredicates = false
  def resolve(context: TreeNode[databind.JsonNode]): Seq[TreeNode[databind.JsonNode]] = {
    context match {
      case a: JsonArrayNode  => a.children()
      case o: JsonObjectNode => Seq(o)
    }
  }
}

sealed class JSONRepeatedStep(step: String, index: Int) extends AbstractJsonNodeStep(step) {
  override def getText(): String = step + "[" + index + "]"
  val hasPredicates = true
  def resolve(context: TreeNode[databind.JsonNode]): Seq[TreeNode[databind.JsonNode]] = {
    context match {
      case a: JsonArrayNode => a.children().filter { n => n.name == step && n.index == index }.flatMap {
        case a: JsonArrayNode => a.children()
        case j: JsonNode      => Seq(j)
      }
      case o: JsonObjectNode => o.children().filter { n => n.name == step }.map {
        case a: JsonArrayNode => a.children()(index)
        case j: JsonNode      => j
      }
      case j: JsonNode => Seq(j)
      case _           => throw new Error("Cannot process a name step")
    }
  }
}

sealed class JSONAnonymousRepeatedStep(index: Int) extends AbstractJsonNodeStep("") {
  override def getText(): String = "[" + index + "]"
  val hasPredicates = true
  def resolve(context: TreeNode[databind.JsonNode]): Seq[TreeNode[databind.JsonNode]] = {
    context match {
      case r: Repeated if (r.index == index) => {
        context match {
          case a: JsonArrayNode => a.children().filter { n => n.index == index }
          case j: JsonNode      => Seq(j)
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

object JSONMappingNode {
  @tailrec private def processSequenceOfIndexes(step: String, accu: Seq[String] = Nil): Seq[String] = {
    if (step.isEmpty()) accu
    else if (step.indexOf("[") >= 0) {
      val end = step.indexOf("]")
      processSequenceOfIndexes(step.substring(end + 1), accu ++ Seq(step.substring(0, end + 1)))
    }
    else Seq(step)
  }

  def apply(jsonPath: String, index: Index): ColumnMapping[TreeNode[databind.JsonNode]] = {
    val steps = jsonPath.split("\\.").flatMap { processSequenceOfIndexes(_) }
    require(steps.size > 0, "There are no steps.")
    def children(steps: Seq[String]): Seq[ColumnMapping[TreeNode[databind.JsonNode]]] = {
      if (!steps.isEmpty) {
        List(new ColumnMapping(JSONStep(steps.head), if (steps.size != 1) None else Option(index), children(steps.tail)))
      }
      else Nil
    }
    ColumnMapping.root(children(steps))
  }
}

@deprecated("Use JaywayJsonMapping", "2.1.86")
object JsonMappingNodeTree {
  def apply(jsonPath: Seq[(String, String)]): ColumnMapping[TreeNode[databind.JsonNode]] = {
    val root: ColumnMapping[TreeNode[databind.JsonNode]] = ColumnMapping.root(Nil)
    jsonPath.zipWithIndex.foldLeft(root) {
      case (ref, (path, i)) => ref + JSONMappingNode(path._1, new ColumnIndex(i))
    }
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
