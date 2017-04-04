package com.ms.qaTools

import java.io.StringReader
import java.io.StringWriter
import scala.collection.JavaConversions.mapAsJavaMap
import org.jaxen.SimpleNamespaceContext
import org.w3c.dom.Attr
import org.w3c.dom.CDATASection
import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.NamedNodeMap
import org.w3c.dom.Node
import org.w3c.dom.NodeList
import org.w3c.dom.Text
import org.xml.sax.EntityResolver
import org.xml.sax.InputSource
import com.ms.qaTools.io.rowSource.Utils.StringUtil
import com.ms.qaTools.xml.NamespaceContextImpl
import javax.xml.namespace.NamespaceContext
import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.parsers.ParserConfigurationException
import javax.xml.transform.OutputKeys
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult
import org.w3c.dom.Comment



package object xml {

  implicit def nodeList2List(l: NodeList): Seq[Node] = Option(l) match {
    case Some(nodes) => for (i <- 0 to (nodes.getLength - 1)) yield nodes.item(i)
    case _           => Nil
  }

  implicit def nodeMap2List(l: NamedNodeMap): Iterable[Node] = Option(l) match {
    case Some(atts) => for (i <- 0 to (atts.getLength - 1)) yield atts.item(i)
    case _          => Nil
  }

  lazy val DocumentBuilderFactoryInstance = {
    val instance = DocumentBuilderFactory.newInstance
    instance.setExpandEntityReferences(false)
    instance.setNamespaceAware(true)
    instance.setValidating(false)
    instance.setFeature("http://xml.org/sax/features/validation", false)
    instance.setFeature("http://apache.org/xml/features/nonvalidating/load-dtd-grammar", false)
    instance.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false)
    instance
  }
  
  lazy val NoopEntityResolver = new EntityResolver {
    def resolveEntity(publicId: String, systemId: String) = new InputSource(new StringReader(""))
  }

  val DocumentBuilderTL = new ThreadLocal[DocumentBuilder] {
    override def initialValue() = {
      try {
        val builder = DocumentBuilderFactoryInstance.newDocumentBuilder
        builder.setEntityResolver(NoopEntityResolver)
        builder
      }
      catch {
        case e: ParserConfigurationException => throw new Error(e)
      }
    }
    
    def apply() = get()
  }

  // node.getLocalName on a DOM Level 1 element returns null... I can't believe this is necessary.
  def getLocalName(n: Node): String =
    if (n.getLocalName() == null) n.getNodeName().split(":").last else n.getLocalName()

  // get canonical xpath
  def nodePath(node: Node)(implicit nsContext: NamespaceContext): String = {
    def getPrefix(node: Node): Option[String] = {
      val prefix = if (node.getNamespaceURI() != null) nsContext.getPrefix(node.getNamespaceURI()) else null
      if (prefix != null) Some(prefix + ":") else None
    }

    def sameName(f: Node => Node)(n: Node): List[Node] =
      Stream.iterate(n)(f).tail.takeWhile(_ != null).filter(
        _.getNodeName == n.getNodeName).toList

    "/" + Stream.iterate[Node](node) { n => n match { case a: Attr => a.getOwnerElement() case _ => n.getParentNode() } }.map {
      case null        => None
      case _: Comment  => None
      case _: Document => None
      case e: Element => {
        val prefix = getPrefix(e)
        val preceding = sameName(_.getPreviousSibling) _
        val following = sameName(_.getNextSibling) _
        val tag = prefix.getOrElse("") + getLocalName(e)
        Some { (preceding(e), following(e)) match { case (Nil, Nil) => tag case (els, _) => tag + "[" + (els.size + 1) + "]" } }
      }
      case a: Attr => {
        val prefix = getPrefix(a)
        Some { "@" + prefix.getOrElse("") + a.getName() }
      }
      case c: CDATASection => {
        Some { "#cdata:" + c.getNodeValue }
      }
      case t: Text => {
        Some { "#text:" + t.getWholeText }
      }

    }.takeWhile(_.isDefined).map(_.get).reverse.mkString("/")
  }

  def nodeToString(node: Node, indent: Boolean = false, indentAmount: Int = 2, omitXmlDeclaration: Boolean = true): String = {
    val writer = new StringWriter
    val transformer = TransformerFactory.newInstance().newTransformer()
    transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, if (omitXmlDeclaration) "yes" else "no")
    transformer.setOutputProperty(OutputKeys.METHOD, "xml")
    transformer.setOutputProperty(OutputKeys.INDENT, if (indent) "yes" else "no")
    transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8")
    transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", indentAmount.toString)
    transformer.transform(new DOMSource(node), new StreamResult(writer))

    writer.toString
  }

  def nodeListToString(nodeList: NodeList): String = {
    val nodes = nodeList2List(nodeList)
    nodes.map(a => nodeToString(a)).mkString.trim
  }

  implicit def namespaceContextToJaxenImpl(ctx: NamespaceContextImpl): org.jaxen.NamespaceContext =
    new SimpleNamespaceContext(ctx.namespaces)
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
