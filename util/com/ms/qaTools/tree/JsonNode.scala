package com.ms.qaTools.tree

import scala.collection.JavaConversions.asScalaIterator
import scala.collection.JavaConversions.mutableSeqAsJavaList
import com.fasterxml.jackson.databind

trait Repeated {val index: Int}
trait HasNoValue {val value: Option[Any] = None}
trait HasNoChildren {def children(f: (databind.JsonNode) => Boolean): Seq[TreeNode[databind.JsonNode]] = Nil}

@deprecated("No need for TreeNode wrapper with JaywayJsonMapping and AsTreeNode", "2.1.86")
abstract class JsonNode(val node: databind.JsonNode, val name: String, val pathStack: Seq[PathNode]) extends TreeNode[databind.JsonNode] {
  def path(canonical: Boolean) = 
    if (canonical)
      pathStack.reverse.foldLeft(new StringBuilder("$")) {
        case (sb,PathNode(_,Some(i))) => sb append s"[$i]"
        case (sb,PathNode(n, None)) => sb append s".$n"
      }.toString
    else
      pathStack.reverse.flatMap {case PathNode(n, None) => Seq(n); case _ => Nil}.mkString("$", ".", "")
      
}

class JsonArrayNode(node: databind.node.ArrayNode, name: String, pathStack: Seq[PathNode]) extends JsonNode(node, name, pathStack) with HasNoValue {
  def children(filterOut: (databind.JsonNode) => Boolean = Function.const(false)): Seq[TreeNode[databind.JsonNode] with Repeated] =
    (0 to node.size()-1).map{i => (i,node.get(i))}.filterNot{case (i,n) => filterOut(n)}.map {case (i,n) => JsonRepeatedNode(n, name, i, PathNode(name, Some(i)) +: pathStack)}
}

class JsonValueNode(node: databind.node.ValueNode, name: String, pathStack: Seq[PathNode]) extends JsonNode(node, name, pathStack) with HasNoChildren {
  val value: Option[Any] = Some(node.asText())
}

class JsonObjectNode(node: databind.node.ObjectNode, name: String, pathStack: Seq[PathNode]) extends JsonNode(node, name, pathStack) with HasNoValue {
  def children(filterOut: (databind.JsonNode) => Boolean = Function.const(false)): Seq[TreeNode[databind.JsonNode]] =
    node.fields().filterNot {f => filterOut(f.getValue())}.map { f => JsonNode(f.getValue(), f.getKey(), PathNode(f.getKey()) +: pathStack) }.toSeq
}

object JsonNode {
  def apply(node: databind.JsonNode, name: String = "$", path: Seq[PathNode] = Seq()): JsonNode =
    node match {
      case a: databind.node.ArrayNode  => new JsonArrayNode(a, name, path)
      case o: databind.node.ObjectNode => new JsonObjectNode(o, name, path)
      case v: databind.node.ValueNode  => new JsonValueNode(v, name, path)
    }
}

object JsonRepeatedNode {
  def apply(node: databind.JsonNode, name: String = "$", i: Int, path: Seq[PathNode] = Seq()): JsonNode with Repeated =
    node match {
      case a: databind.node.ArrayNode  => new JsonArrayNode(a, name, path) with Repeated { val index: Int = i }
      case o: databind.node.ObjectNode => new JsonObjectNode(o, name, path) with Repeated { val index: Int = i }
      case v: databind.node.ValueNode  => new JsonValueNode(v, name, path) with Repeated { val index: Int = i }
    }
}/*
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
