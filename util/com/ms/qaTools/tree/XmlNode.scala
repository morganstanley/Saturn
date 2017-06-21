package com.ms.qaTools.tree

import org.w3c.dom.Attr
import org.w3c.dom.Node
import org.w3c.dom.Text
import com.ms.qaTools.xml._
import javax.xml.XMLConstants
import javax.xml.namespace.NamespaceContext
import org.w3c.dom.Comment
import scala.annotation.tailrec

class XmlNode(val node: Node)(implicit val nsContext: NamespaceContext) extends TreeNode[Node] {
  def namespaceURI = node.getNamespaceURI()
  def prefix = Option(namespaceURI).map(nsContext.getPrefix(_))
  def name: String = prefix.map(p => s"$p:").getOrElse("") + getLocalName(node)

  protected lazy val canonicalPath = PathCache(node, true)
  protected lazy val nonCanonicalPath = PathCache(node, false)
  def path(canonical: Boolean): String = if (canonical) canonicalPath else nonCanonicalPath
  
  private lazy val attributes: Iterable[Attr] = 
    node.getAttributes().filterNot { a => 
      getLocalName(a) == XMLConstants.XMLNS_ATTRIBUTE || (Option(a.getNamespaceURI()).exists(_ == XMLConstants.XMLNS_ATTRIBUTE_NS_URI)) 
    }.asInstanceOf[Iterable[Attr]]
  private lazy val (childrenTextNodes, childrenNonTextNodes) = node.getChildNodes().partition(_.isInstanceOf[Text])
  
  def children(filterOut: (Node) => Boolean = (n: Node) => n.isInstanceOf[Comment]): Seq[XmlNode] =
    (attributes.iterator.filterNot{filterOut}.map(new XmlAttr(_)) ++
     childrenNonTextNodes.iterator.filterNot{filterOut}.map(new XmlNode(_))).toBuffer

  lazy val value = {
    val textValue = childrenTextNodes.iterator.map { _.getTextContent() }.mkString.trim
    if (textValue.isEmpty()) None else Some(textValue)
  }
  override def toString: String = path(true)
  override def detach: TreeNode[Node] = {
    val pn = node.getParentNode()
    if (pn != null) pn.synchronized {XmlNode(pn.removeChild(node))} else this
  }
}

class XmlAttr(override val node: Attr)(implicit nsContext: NamespaceContext) extends XmlNode(node) {
  override lazy val value = {
    val textValue = node.getValue()
    if (textValue.isEmpty()) None else Some(textValue)
  }
  override def children(filterOut: (Node) => Boolean = (n: Node) => n.isInstanceOf[Comment]) = Nil    
}

class XmlText(override val node: Text)(implicit nsContext: NamespaceContext) extends XmlNode(node) {
  override lazy val value = {
    val textValue = node.getWholeText()
    if (textValue.isEmpty()) None else Some(textValue)
  }
  override def children(filterOut: (Node) => Boolean = (n: Node) => n.isInstanceOf[Comment]) = Nil
}

object XmlNode {
  def apply(node: Node)(implicit nsContext: NamespaceContext): XmlNode = node match {
    case a: Attr => new XmlAttr(a)
    case t: Text => new XmlText(t)
    case n: Node => new XmlNode(n)
  }
}

object XmlAttr {
  def apply(node: Attr)(implicit nsContext: NamespaceContext): XmlAttr = new XmlAttr(node)
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
