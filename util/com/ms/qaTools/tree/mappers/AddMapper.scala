package com.ms.qaTools.tree.mappers

import org.slf4j.LoggerFactory
import org.w3c.dom.Element
import org.w3c.dom.Node

import com.ms.qaTools.conversions.XmlToTreeNodeConversions.xmlNodeToNode
import com.ms.qaTools.io.rowSource.Utils.StringUtil
import com.ms.qaTools.tree.XmlNode
import com.ms.qaTools.tree.validator.XPathNodeLookup
import com.ms.qaTools.xml.nodeToString
import com.ms.qaTools.xml.xpath.XPath

import javax.xml.namespace.NamespaceContext

case class XmlNodeAddMapper(
  name: String = "",
  value: String = "",
  parent: String = null,
  before: String = null,
  after: String = null,
  isAttribute: Boolean = false,
  uri: String = null,
  isCDATA: Boolean = false,
  isXml:Boolean = false)
extends XmlNodeMapper {
  val logger = LoggerFactory.getLogger(getClass)

  private def insertNewNode(node: Node, newNode: Node, nsContext: NamespaceContext) =
    if (before != null && !before.isEmpty)
      XPath(before)(nsContext).asNodes(node).headOption match {
        case Some(childNode) => {
          logger.debug("Before path: " + before)
          logger.debug(nodeToString(childNode))
          logger.debug(nodeToString(newNode))
          childNode.getParentNode.insertBefore(newNode, childNode)
        }
        case _ => node.appendChild(newNode)
      }
    else if (after != null && !after.isEmpty)
      XPath(after)(nsContext).asNodes(node).headOption match {
        case Some(childNode) if childNode.getNextSibling != null => {
          logger.debug("After path: " + after)
          logger.debug(nodeToString(childNode))
          logger.debug(nodeToString(newNode))
          childNode.getParentNode().insertBefore(newNode, childNode.getNextSibling())
        }
        case _ => node.appendChild(newNode)
      }
    else node.appendChild(newNode)

  def apply(optionNode: Option[XmlNode]): Option[XmlNode] = optionNode match {
    case None => optionNode
    case Some(node) =>
      val ownerDocument = node.node.getOwnerDocument
      val retrievedNodes = {
        if (parent == null) Seq(node) // by default add new node to the root
        else {
          val xPathLookup = XPathNodeLookup(parent)(node.nsContext)
          xPathLookup.getNodes(node)
        }
      }
      logger.debug("Adding: name = %s, value = %s, parent = %s, before = %s, after = %s".format(name, value, parent, before, after))

      retrievedNodes.map{n =>
        val parentNode = n.node
        if (isAttribute) {
          parentNode match {
            case e: Element =>
              if (uri == null) e.setAttribute(name, value)
              else {
                val prefix = node.nsContext.getPrefix(uri)
                e.setAttributeNS(uri, prefix + ":" + name, value)
              }
          }
        }
        else if (isCDATA) {
          val cdata = ownerDocument.createCDATASection(value)
          insertNewNode(parentNode, cdata, node.nsContext)
        }
        else if (isXml) {
          val newElem = value.toDocument.getDocumentElement()
          // if we do not traverse the document once prior to re-parenting it, it throws an NPE when nodeToString is called post add
          nodeToString(newElem)
          val parentDoc = node.getOwnerDocument()
          parentDoc.adoptNode(newElem)

          insertNewNode(parentNode, newElem, node.nsContext)
        }
        else {
          val newNode =
            if (uri == null) ownerDocument.createElement(name) //parentNode.createElement(name)//
            else {
              val prefix = node.nsContext.getPrefix(uri)
              ownerDocument.createElementNS(uri, prefix + ":" + name)
            }
          newNode.appendChild(ownerDocument.createTextNode(value))
          insertNewNode(parentNode, newNode, node.nsContext)
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
