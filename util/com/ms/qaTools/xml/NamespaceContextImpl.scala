package com.ms.qaTools.xml
import collection.JavaConversions._
import java.util.Iterator
import javax.xml.namespace.NamespaceContext
import javax.xml.XMLConstants
import javax.xml.xpath.XPathConstants
import javax.xml.xpath.XPathFactory
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

case class NamespaceContextImpl(userDefined: Map[String, String] = Map()) extends NamespaceContext {
  private val preDefined = Map(
    XMLConstants.XML_NS_PREFIX -> XMLConstants.XML_NS_URI,
    XMLConstants.XMLNS_ATTRIBUTE -> XMLConstants.XMLNS_ATTRIBUTE_NS_URI)

  val namespaces = preDefined ++ userDefined

  val uris: Map[String, Iterable[String]] = namespaces groupBy { _._2 } map { case (key, value) => (key, value.unzip._1) }

  def getNamespaceURI(prefix: String): String = namespaces(prefix)

  def getPrefix(namespaceURI: String): String = uris.get(namespaceURI).map(_.head).orNull

  def getPrefixes(namespaceURI: String): Iterator[String] = uris(namespaceURI).toIterator

  def +(that: NamespaceContextImpl) = NamespaceContextImpl(namespaces ++ that.namespaces)
  def +(that: (String, String)) = NamespaceContextImpl(namespaces + that)
  def +(that: Map[String, String]) = NamespaceContextImpl(namespaces ++ that)
}

object NamespaceContextImpl {
  def apply(doc: Document, namespaces: Map[String, String]): NamespaceContextImpl = {
    val e = doc.getDocumentElement
    val ns = XPathFactory.newInstance.newXPath.compile("//*/namespace::*").evaluate(e, XPathConstants.NODESET).asInstanceOf[NodeList]
    val documentNs = ns.filter { _.getLocalName != "xmlns" }.map { n => (n.getLocalName -> n.getNodeValue) }.toMap
    NamespaceContextImpl(documentNs ++ namespaces)
  }

  def apply(doc: Document): NamespaceContextImpl = apply(doc, Map[String, String]())

  def apply(rowSource: Iterator[Seq[String]]): NamespaceContextImpl =
    apply(rowSource.toList.map { r => r(0) -> r(1) }.toMap)
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
