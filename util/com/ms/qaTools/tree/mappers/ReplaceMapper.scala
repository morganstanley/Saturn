package com.ms.qaTools.tree.mappers

import com.ms.qaTools.tree.TreeNode
import com.ms.qaTools.tree.XmlNode
import com.ms.qaTools.tree.validator.XPathNodeLookup
import org.w3c.dom.{ Node, Element }
import com.ms.qaTools.conversions.XmlToTreeNodeConversions._
import org.w3c.dom.Attr



case class XmlNodeReplaceMapper(
  search: String,
  replace: String,
  isCDATA: Boolean = false)
  extends XmlNodeMapper {
  override def apply(optionNode: Option[XmlNode]): Option[XmlNode] = {
    optionNode match {
      case None => optionNode
      case Some(node) => {
        val ownerDocument = node.node.getOwnerDocument
        val retrievedNodes = {
          val xPathLookup = XPathNodeLookup(search)(node.nsContext)
          xPathLookup.getNodes(node)
        }

        retrievedNodes.foreach(n => {
          val value = {
            val xPathLookup = XPathNodeLookup(replace)(node.nsContext)
            xPathLookup.getValue(n)
          }

          n.node match {
            case a: Attr => a.setValue(value)
            case _ => {
              if (isCDATA) {
                // Remove text content or CDATA section
                val childNodeList = n.node.getChildNodes()

                (0 until childNodeList.getLength).foldLeft(Seq[Node]())((nodesToRemove, index) => {
                  val child = childNodeList.item(index)
                  if (child.getNodeType() == Node.TEXT_NODE ||
                    child.getNodeType() == Node.CDATA_SECTION_NODE) nodesToRemove :+ child
                  else nodesToRemove
                }).foreach(childNode => n.node.removeChild(childNode))

                val cdata = ownerDocument.createCDATASection(value)
                n.node.appendChild(cdata)
              } else n.node.setTextContent(value)
            }
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
