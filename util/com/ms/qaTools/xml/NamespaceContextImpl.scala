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
