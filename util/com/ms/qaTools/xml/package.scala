package com.ms.qaTools

import java.io.StringReader
import java.io.StringWriter
import java.util.WeakHashMap
import java.util.concurrent.locks.ReentrantReadWriteLock

import scala.collection.JavaConverters._
import scala.language.implicitConversions

import org.jaxen.SimpleNamespaceContext
import org.w3c.dom.Attr
import org.w3c.dom.CDATASection
import org.w3c.dom.Comment
import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.NamedNodeMap
import org.w3c.dom.Node
import org.w3c.dom.NodeList
import org.w3c.dom.Text
import org.xml.sax.EntityResolver
import org.xml.sax.InputSource

import com.ms.qaTools.xml.NamespaceContextImpl

import javax.xml.namespace.NamespaceContext
import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.parsers.ParserConfigurationException
import javax.xml.transform.OutputKeys
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult
import javax.xml.xpath.XPathFactory
import net.sf.saxon.Configuration
import net.sf.saxon.TransformerFactoryImpl

package object xml {
  implicit def nodeList2List(l: NodeList): Seq[Node] = if (l == null) Nil else {
    (0 until l.getLength).toIterator.map(l.item).toBuffer
  }

  implicit def nodeMap2List(l: NamedNodeMap): Iterable[Node] = if (l == null) Nil else {
    (0 until l.getLength).toIterator.map(l.item).toBuffer
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

  object globals {
    object saxon {
      val configuration = new Configuration
    }
  }

  val DocumentBuilderTL = new ThreadLocal[DocumentBuilder] {
    override def initialValue() = try {
      val builder = DocumentBuilderFactoryInstance.newDocumentBuilder
      builder.setEntityResolver(NoopEntityResolver)
      builder
    } catch {
      case e: ParserConfigurationException => throw new Error(e)
    }
  }

  // node.getLocalName on a DOM Level 1 element returns null... I can't believe this is necessary.
  def getLocalName(n: Node): String = n.getLocalName match {
    case null =>
      val name = n.getNodeName
      name.substring(name.lastIndexOf(':') + 1)
    case name => name
  }

  def nodeToString(node: Node, indent: Boolean = false, indentAmount: Int = 2, omitXmlDeclaration: Boolean = true): String = {
    val writer = new StringWriter
    val transformer = TransformerFactory().newTransformer()
    transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, if (omitXmlDeclaration) "yes" else "no")
    transformer.setOutputProperty(OutputKeys.METHOD, "xml")
    transformer.setOutputProperty(OutputKeys.INDENT, if (indent) "yes" else "no")
    transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8")
    transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", indentAmount.toString)
    transformer.transform(new DOMSource(node), new StreamResult(writer))

    writer.toString
  }

  def nodeListToString(nodeList: NodeList): String =
    nodeList.map(a => nodeToString(a)).mkString.trim

  implicit def namespaceContextToJaxenImpl(ctx: NamespaceContextImpl): org.jaxen.NamespaceContext =
    new SimpleNamespaceContext(ctx.namespaces.asJava)

  def isSaxon: Boolean =
    sys.props.get(s"${XPathFactory.DEFAULT_PROPERTY_NAME}:${XPathFactory.DEFAULT_OBJECT_MODEL_URI}").contains("net.sf.saxon.xpath.XPathFactoryImpl")

  object TransformerFactory {
    private [this] val default = javax.xml.transform.TransformerFactory.newInstance
    private [this] val saxon = new TransformerFactoryImpl(globals.saxon.configuration)
    def apply(): javax.xml.transform.TransformerFactory = if (isSaxon) saxon else default
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
