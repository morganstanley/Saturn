package com.ms.qaTools.json.generator

import scala.util.parsing.json.JSONObject
import com.ms.qaTools.io.DelimitedRow
import com.ms.qaTools.tree.generator.ColContext
import com.ms.qaTools.tree.generator.Lookupable
import com.ms.qaTools.tree.generator.ParameterizedText
import com.ms.qaTools.tree.generator.NodeCreator
import com.fasterxml.jackson.databind.node.ObjectNode
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.JsonNodeFactory
import com.fasterxml.jackson.databind.node.ArrayNode
import scala.collection.JavaConversions._



case class JSONObjectCreator(children: List[NodeCreator[JsonNode, JsonNode] with HasName]) extends JSONInnerNodeCreator {
  override val isLocal: Boolean = false
  override def creators = children
  override def create(data: DelimitedRow)(implicit colMap: Lookupable, context: ColContext, doc: JsonNode = null): JsonNode = {
    val clocalIterators = this.adjustedIterators
    if (clocalIterators.isEmpty) {
      val obj = JsonNodeFactory.instance.objectNode()
      children.foreach { c => obj.put(c.name, c.create(data)(colMap, context, doc)) }
      obj
    }
    else {
      val arr = JsonNodeFactory.instance.arrayNode()
      for (iterator <- clocalIterators) context.nextIndex(iterator)
      while (clocalIterators.forall(!context.iteratorIsFinished(_, data))) {
        val obj = JsonNodeFactory.instance.objectNode()
        children.foreach { c => obj.put(c.name, c.create(data)(colMap, context, doc)) }
        arr.add(obj)
        for (iterator <- clocalIterators) context.nextIndex(iterator)
      }
      arr
    }
  }
  override def toString = "JSONObjectCreator"
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
