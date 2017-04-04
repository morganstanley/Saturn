package com.ms.qaTools.tree.mappers

import java.io.File
import org.w3c.dom.Attr
import org.w3c.dom.Element
import org.w3c.dom.Node
import com.ms.qaTools.conversions.XmlToTreeNodeConversions.xmlNodeToDocument
import com.ms.qaTools.io.rowSource.file.XmlFileRowSource
import com.ms.qaTools.tree.XmlNode
import com.ms.qaTools.io.rowSource.file.XmlFileRowSource



case class XmlNodeIntersectMapper(
  fileName: String)
  extends XmlNodeManyToManyMapper {
  override def apply(optionNodes: Seq[Option[XmlNode]]): Seq[Option[XmlNode]] = {

    val intersectRowSource = XmlFileRowSource(fileName)
    val zipDocs = optionNodes.filter(_ != None).map(_.get).zip(intersectRowSource.toIterable)

    zipDocs.map {
      case (received, expected) => {
        val (re, ee) = (received.getDocumentElement, expected.getDocumentElement)
        intersect(re, ee)
        received.getDocumentElement.normalize
        Option(received)
      }
    }
  }

  def intersect(receivedElem: Element, expectedElem: Element): Unit = {
    intersectAttributes(receivedElem, expectedElem)
    val sameTextNodes = compareTextNodes(receivedElem, expectedElem)
    if (!sameTextNodes) receivedElem.getParentNode.removeChild(receivedElem) // not same element if not same text nodes
    else intersectChildNodes(receivedElem, expectedElem)
  }

  def intersectChildNodes(receivedElem: Element, expectedElem: Element) = {
    val childNodeMap = receivedElem.getChildNodes
    val expectedChildNodeMap = expectedElem.getChildNodes

    val nodeLocalNames = (0 until childNodeMap.getLength).foldLeft(Seq[Node]())(
      (elementNodes, childIdx) =>
        if (childNodeMap.item(childIdx).getNodeType == Node.ELEMENT_NODE) elementNodes :+ childNodeMap.item(childIdx)
        else elementNodes).map(_.getLocalName).toSet

    nodeLocalNames.foreach(nodeLocalName => {
      val childNodes = (0 until childNodeMap.getLength).foldLeft(Seq[Node]())(
        (elementNodes, childIdx) =>
          if (childNodeMap.item(childIdx).getNodeType == Node.ELEMENT_NODE && childNodeMap.item(childIdx).getLocalName().equals(nodeLocalName)) elementNodes :+ childNodeMap.item(childIdx)
          else elementNodes)

      val expectedChildNodes = (0 until expectedChildNodeMap.getLength).foldLeft(Seq[Node]())(
        (elementNodes, childIdx) =>
          if (expectedChildNodeMap.item(childIdx).getNodeType == Node.ELEMENT_NODE && expectedChildNodeMap.item(childIdx).getLocalName.equals(nodeLocalName)) elementNodes :+ expectedChildNodeMap.item(childIdx)
          else elementNodes)

      childNodes.zipAll(expectedChildNodes, None, None).foreach {
        case (r: Node, None) => {
          r.getParentNode.removeChild(r)
        }
        case (r: Node, e: Node) => {
          val (rLocalName, rNamespaceURI) = (r.getLocalName, r.getNamespaceURI)
          val (eLocalName, eNamespaceURI) = (e.getLocalName, e.getNamespaceURI)

          if (!rLocalName.equals(eLocalName) ||
            (rNamespaceURI != null && !rNamespaceURI.equals(eNamespaceURI)))
            r.getParentNode.removeChild(r)
          else intersect(r.asInstanceOf[Element], e.asInstanceOf[Element])
        }
        case _ =>
      }
    })
  }

  // Keep only the element if both element have same text nodes
  def compareTextNodes(receivedElem: Element, expectedElem: Element) = {
    val receivedNodeList = receivedElem.getChildNodes
    val receivedTextNodes = (0 until receivedNodeList.getLength).foldLeft(Seq[Node]())(
      (textNodes, childIdx) =>
        if (receivedNodeList.item(childIdx).getNodeType == Node.TEXT_NODE) textNodes :+ receivedNodeList.item(childIdx)
        else textNodes)

    val receivedText = receivedTextNodes.map(_.getTextContent()).mkString("").replaceAll("^\\s*", "").replaceAll("\\s*$", "")

    val expectedNodeList = expectedElem.getChildNodes
    val expectedTextNodes = (0 until expectedNodeList.getLength).foldLeft(Seq[Node]())(
      (textNodes, childIdx) =>
        if (expectedNodeList.item(childIdx).getNodeType == Node.TEXT_NODE) textNodes :+ expectedNodeList.item(childIdx)
        else textNodes)
    val expectedText = expectedTextNodes.map(_.getTextContent()).mkString("").replaceAll("^\\s*", "").replaceAll("\\s*$", "")

    expectedText.equals(receivedText)
  }

  // Keep only attributes that are in both documents
  def intersectAttributes(receivedElem: Element, expectedElem: Element) {

    if (receivedElem.hasAttributes) {
      val attrNodeMap = receivedElem.getAttributes
      val receivedAttributes = (0 until attrNodeMap.getLength).foldLeft(Seq[Attr]())(
        (attributes, attrIdx) =>
          if (attrNodeMap.item(attrIdx).getNodeName != "xmlns") attributes :+ attrNodeMap.item(attrIdx).asInstanceOf[Attr]
          else attributes)

      val expectedAttrNodeMap = expectedElem.getAttributes
      val expectedAttributes = (0 until expectedAttrNodeMap.getLength).foldLeft(Seq[Attr]())(
        (attributes, attrIdx) =>
          if (expectedAttrNodeMap.item(attrIdx).getNodeName != "xmlns") attributes :+ expectedAttrNodeMap.item(attrIdx).asInstanceOf[Attr]
          else attributes)

      receivedAttributes.foreach(ra => {
        val sameAttribute = expectedAttributes.find(ea => {
          val equivalent = (ra.getLocalName == null || ra.getLocalName.equals(ea.getLocalName)) &&
            (ra.getNamespaceURI == null || ra.getNamespaceURI.equals(ea.getNamespaceURI)) &&
            (ra.getValue == null || ra.getValue.equals(ea.getValue))
          equivalent
        })

        // Attribute not found in other document, remove it from intersection
        if (sameAttribute == None) receivedElem.removeAttributeNode(ra)
      })
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
