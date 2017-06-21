package com.ms.qaTools.io.rowSource

import com.fasterxml.jackson.databind
import com.ms.qaTools.json.JaywayJsonMapping
import com.ms.qaTools.json.JsonMappingNodeTree
import com.ms.qaTools.tree.AsTreeNode
import com.ms.qaTools.tree.JsonNode
import com.ms.qaTools.tree.TreeNode
import com.ms.qaTools.tree.extraction.DetachNever

case class JsonPathRowSource(rowSource: Iterator[databind.JsonNode], pathMappings: Seq[(String, String)])
extends PathRowSource[TreeNode[databind.JsonNode], databind.JsonNode] {
  val mappingNode = JsonMappingNodeTree(pathMappings)
  val detachNodes = DetachNever[TreeNode[databind.JsonNode]]()
  val nodeCreator = (n: databind.JsonNode) => JsonNode(n)
}

object JsonPathRowSource {
  implicit def jsonNodeAsTreeNode = new AsTreeNode[databind.JsonNode] {
    def value(x: databind.JsonNode): Option[Any] = x match {
      case x: databind.node.ValueNode => Some(x.asText)
      case _                          => None
    }
  }

  class Jayway(val rowSource: Iterator[databind.JsonNode], val pathMappings: Seq[(String, String)])
  extends PathRowSource[databind.JsonNode, databind.JsonNode] {
    val mappingNode = JaywayJsonMapping(pathMappings.iterator.map(_._1))
    val detachNodes = DetachNever[databind.JsonNode]()
    val nodeCreator = (x: databind.JsonNode) => x
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
