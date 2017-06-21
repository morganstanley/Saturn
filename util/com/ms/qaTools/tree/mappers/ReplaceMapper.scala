package com.ms.qaTools.tree.mappers

import com.ms.qaTools.tree.TreeNode
import com.ms.qaTools.tree.validator.XPathNodeLookup
import com.ms.qaTools.tree.XmlNode
import com.ms.qaTools.xml.nodeList2List
import org.w3c.dom.Attr
import org.w3c.dom.{ Node, Element }

case class XmlNodeReplaceMapper(
  search: String,
  replace: String,
  isCDATA: Boolean = false)
extends XmlNodeMapper {
  def apply(optionNode: Option[XmlNode]): Option[XmlNode] = optionNode match {
    case None => optionNode
    case Some(node) =>
      val ownerDocument = node.node.getOwnerDocument
      val retrievedNodes = {
        val xPathLookup = XPathNodeLookup(search)(node.nsContext)
        xPathLookup.getNodes(node)
      }

      retrievedNodes.foreach{n =>
        val value = XPathNodeLookup(replace)(node.nsContext).getValue(n)
        n.node match {
          case a: Attr => a.setValue(value)
          case _ =>
            if (isCDATA) {
              // Remove text content or CDATA section
              n.node.getChildNodes.foldLeft(Seq[Node]())((nodesToRemove, child) =>
                if (child.getNodeType == Node.TEXT_NODE || child.getNodeType == Node.CDATA_SECTION_NODE)
                  nodesToRemove :+ child
                else nodesToRemove
              ).foreach(childNode => n.node.removeChild(childNode))
              n.node.appendChild(ownerDocument.createCDATASection(value))
            } else n.node.setTextContent(value)
        }
      }
      Option(node)
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
