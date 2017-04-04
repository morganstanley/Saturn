package com.ms.qaTools.json.generator

import com.fasterxml.jackson.databind.node.ArrayNode
import com.fasterxml.jackson.databind.node.ObjectNode
import com.ms.qaTools.json.arrayNodeToList
import com.ms.qaTools.json.objectNodeToMap
import com.ms.qaTools.tree.generator.InnerNodeCreator
import com.ms.qaTools.tree.generator.LeafNodeCreator
import com.ms.qaTools.tree.generator.NodeCreator
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.NumericNode
import com.fasterxml.jackson.databind.node.TextNode
import com.fasterxml.jackson.databind.node.BooleanNode



trait HasName { val name: String }
trait JSONNodeCreator extends NodeCreator[JsonNode, JsonNode]
trait JSONInnerNodeCreator extends InnerNodeCreator[JsonNode, JsonNode]
trait JSONLeafNodeCreator extends LeafNodeCreator[JsonNode, JsonNode]

object JSONNodeCreator {
  def apply(o: JsonNode): NodeCreator[JsonNode, JsonNode] = {
    o match {
      case o: ObjectNode  => JSONObjectCreator(o.map { p => JSONNamedNodeCreator(p._1, p._2) }.toList)
      case a: ArrayNode   => JSONArrayCreator(a.map { JSONNodeCreator(_) }.toList)
      case s: NumericNode => JSONNumericValueCreator(o.textValue())
      case s: TextNode    => JSONTextValueCreator(o.textValue())
      case s: BooleanNode => JSONBooleanValueCreator(o.textValue())
      case e              => throw new Exception("JSONNodeCreator: Can't handle input: " + e)
    }
  }
}

object JSONNamedNodeCreator {
  def apply(name_ : String, o: JsonNode): NodeCreator[JsonNode, JsonNode] with HasName = {
    o match {
      case o: ObjectNode  => new JSONObjectCreator(o.map { p => JSONNamedNodeCreator(p._1, p._2) }.toList) with HasName { val name: String = name_ }
      case a: ArrayNode   => new JSONArrayCreator(a.map { JSONNodeCreator(_) }.toList) with HasName { val name: String = name_ }
      case s: NumericNode => new JSONNumericValueCreator(o.textValue()) with HasName { val name: String = name_ }
      case s: TextNode    => new JSONTextValueCreator(o.textValue()) with HasName { val name: String = name_ }
      case s: BooleanNode => new JSONBooleanValueCreator(o.textValue()) with HasName { val name: String = name_ }
      case e              => throw new Exception("JSONNodeCreator: Can't handle input: " + e)
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
