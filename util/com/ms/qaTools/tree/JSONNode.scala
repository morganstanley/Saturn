package com.ms.qaTools.tree

import scala.collection.JavaConversions.asScalaIterator
import scala.collection.JavaConversions.mutableSeqAsJavaList

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.ArrayNode
import com.fasterxml.jackson.databind.node.ObjectNode
import com.fasterxml.jackson.databind.node.ValueNode

trait Repeated {val index: Int}
trait HasNoValue {val value: Option[Any] = None}
trait HasNoChildren {def children(f: (JsonNode) => Boolean): Seq[TreeNode[JsonNode]] = Nil}

abstract class JSONNode(val node: JsonNode, val name: String, val pathStack: Seq[String]) extends TreeNode[JsonNode] {
  val path: String = {
    pathStack.reverse.foldLeft(new StringBuilder) { (sb, s) =>
      if (sb.isEmpty() || s.startsWith("[")) sb append s
      else sb append "." + s
    }.toString
  }
}

class JSONArrayNode(node: ArrayNode, name: String, pathStack: Seq[String]) extends JSONNode(node, name, pathStack) with HasNoValue {
  def children(filterOut: (JsonNode) => Boolean = Function.const(false)): Seq[TreeNode[JsonNode] with Repeated] =
    (0 to node.size()-1).map{i => (i,node.get(i))}.filterNot{case (i,n) => filterOut(n)}.map {case (i,n) => JSONRepeatedNode(n, name, i, ("[" + i + "]") +: pathStack)}
}

class JSONValueNode(node: ValueNode, name: String, pathStack: Seq[String]) extends JSONNode(node, name, pathStack) with HasNoChildren {
  val value: Option[Any] = Some(node.asText())
}

class JSONObjectNode(node: ObjectNode, name: String, pathStack: Seq[String]) extends JSONNode(node, name, pathStack) with HasNoValue {
  def children(filterOut: (JsonNode) => Boolean = Function.const(false)): Seq[TreeNode[JsonNode]] =
    node.fields().filterNot {f => filterOut(f.getValue())}.map { f => JSONNode(f.getValue(), f.getKey(), f.getKey() +: pathStack) }.toSeq
}

object JSONNode {
  def apply(node: JsonNode, name: String = "$", path: Seq[String] = Seq("$")): JSONNode =
    node match {
      case a: ArrayNode  => new JSONArrayNode(a, name, path)
      case o: ObjectNode => new JSONObjectNode(o, name, path)
      case v: ValueNode  => new JSONValueNode(v, name, path)
    }
}

object JSONRepeatedNode {
  def apply(node: JsonNode, name: String = "$", i: Int, path: Seq[String] = Seq("$")): JSONNode with Repeated =
    node match {
      case a: ArrayNode  => new JSONArrayNode(a, name, path) with Repeated { val index: Int = i }
      case o: ObjectNode => new JSONObjectNode(o, name, path) with Repeated { val index: Int = i }
      case v: ValueNode  => new JSONValueNode(v, name, path) with Repeated { val index: Int = i }
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
