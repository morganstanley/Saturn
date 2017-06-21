package com.ms.qaTools.fix
import com.ms.qaTools.AnyUtil
import com.ms.qaTools.conversions.XPathConversions.xPathToNodes
import com.ms.qaTools.io.rowSource.Utils.StringUtil
import com.ms.qaTools.xml.NamespaceContextImpl
import com.ms.qaTools.xml.xpath.XPath
import javax.xml.namespace.NamespaceContext
import org.w3c.dom.Document
import org.w3c.dom.Node
import quickfix.DataDictionary
import quickfix.FieldMap
import quickfix.Message

class FixMessage[T <: Message](val inner: T)(implicit val nsContext: NamespaceContext) {
  protected val getTag: (Node => Int) = {
    n: Node => n.getAttributes.getNamedItem("tag").getTextContent.toInt
  }

  protected def setStringFields(nodes: Iterable[Node], fm: FieldMap): Unit =
    nodes.groupBy(_.getAttributes.getNamedItem("tag").getTextContent.toInt).foreach{case (tag, nodes) =>
      if (nodes.size == 1)
        fm.setString(tag, nodes.head.getTextContent)
    }

  protected def processHeader(header: Node) =
    setStringFields(XPath("field", header), inner.getHeader)

  protected def processFieldMap(fieldMap: FieldMap, fmNode: Node, messageType: String, dictionary: DataDictionary): Unit =
    setStringFields(XPath("field", fmNode).filterNot(n => dictionary.isGroup(messageType, n.getAttributes.getNamedItem("tag").getTextContent.toInt)), fieldMap)

  protected def processTrailer(trailer: Node) =
    setStringFields(XPath("field", trailer), inner.getTrailer)
}

object FixMessage {
  implicit val nsContext: NamespaceContext = NamespaceContextImpl()

  def apply(xmlDoc: String, dictionary: DataDictionary): Message = apply(xmlDoc.toDocument, dictionary)

  def apply(doc: Document, dictionary: DataDictionary): Message = {
    def getMessageSection(section: String) =
      XPath("/message/" + section, doc.getDocumentElement).ensuring(_.size == 1, "Section size must be == 1")(0)

    (new FixMessage(new Message)).withSideEffect{m =>
      m.processHeader(getMessageSection("header"))
      m.processFieldMap(m.inner, getMessageSection("body"), m.inner.getHeader.getString(35), dictionary)
      m.processTrailer(getMessageSection("trailer"))}.inner
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
