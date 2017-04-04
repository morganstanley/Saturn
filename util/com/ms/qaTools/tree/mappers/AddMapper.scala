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

  private def insertNewNode(node: Node, newNode: Node, nsContext: NamespaceContext) = {
    if (before != null && !before.isEmpty) {
      val childNode = XPath(before)(nsContext).asNodes(node).headOption
      if (childNode.isDefined) {
        logger.debug("Before path: " + before)
        logger.debug(nodeToString(childNode.get))
        logger.debug(nodeToString(newNode))

      }

      if (childNode.isDefined) childNode.get.getParentNode.insertBefore(newNode, childNode.get)
      else node.appendChild(newNode)
    } else if (after != null && !after.isEmpty) {
      val childNode = XPath(after)(nsContext).asNodes(node).headOption
      if (childNode.isDefined) {
        logger.debug("After path: " + after)
        logger.debug(nodeToString(childNode.get))
        logger.debug(nodeToString(newNode))
      }

      if (childNode.isDefined && childNode.get.getNextSibling != null) childNode.get.getParentNode().insertBefore(newNode, childNode.get.getNextSibling())
      else node.appendChild(newNode)
    } else node.appendChild(newNode)
  }

  override def apply(optionNode: Option[XmlNode]): Option[XmlNode] = {
    optionNode match {
      case None => optionNode
      case Some(node) => {
        val ownerDocument = node.node.getOwnerDocument
        val retrievedNodes = {
          if (parent == null) Seq(node) // by default add new node to the root
          else {
            val xPathLookup = XPathNodeLookup(parent)(node.nsContext)
            xPathLookup.getNodes(node)
          }
        }
        logger.debug("Adding: name = %s, value = %s, parent = %s, before = %s, after = %s".format(name, value, parent, before, after))

        retrievedNodes.map(n => {
          val parentNode = n.node
          if (isAttribute) {
            parentNode match {
              case e: Element => {
                if (uri == null) e.setAttribute(name, value)
                else {
                  val prefix = node.nsContext.getPrefix(uri)
                  e.setAttributeNS(uri, prefix + ":" + name, value)
                }
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
            val newNode = {
              if (uri == null) ownerDocument.createElement(name) //parentNode.createElement(name)//
              else {
                val prefix = node.nsContext.getPrefix(uri)
                ownerDocument.createElementNS(uri, prefix + ":" + name)
              }
            }
            newNode.appendChild(ownerDocument.createTextNode(value))
            insertNewNode(parentNode, newNode, node.nsContext)
          }
        })
        Option(node)
      }
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
