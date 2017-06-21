package com.ms.qaTools.xml
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.io.rowSource.file.XmlFileRowSource
import com.ms.qaTools.io.rowSource.file.XmlRowSource
import com.ms.qaTools.io.rowSource.file.XPathRowSource
import com.ms.qaTools.io.rowSource.IndexedRepresentation
import com.ms.qaTools.io.rowSource.Utils.StringUtil
import com.ms.qaTools.io.rowSource.Utils.W3CDocumentUtil
import com.ms.qaTools.toolkit.xmlValidate.XmlValidateComparator
import com.ms.qaTools.tree.extraction.DetachStrategy
import com.ms.qaTools.tree.TreeNode
import com.ms.qaTools.tree.validator.IndexedDiffSet
import com.ms.qaTools.tree.XmlNode
import com.ms.qaTools.Validator
import javax.xml.namespace.NamespaceContext
import org.w3c.dom.Document
import org.w3c.dom.Node
import com.ms.qaTools.IteratorProxy

class XmlValidator(expected: Iterator[Document], actual: Iterator[Document], validateComparator: XmlValidateComparator)
  extends Validator[Document, Node](expected, actual, validateComparator) {

  protected val fromSeqString = (s: Seq[String]) =>
    new IndexedRepresentation[Document] {
      val indexed = s.tail
      val colDefs = ColumnDefinition.fromColumnNames(keys)
      lazy val representation = {
        val doc = s(0).toDocument
        if (com.ms.qaTools.xml.isSaxon) doc.toSaxon else doc
      }
      def prettyPrint = representation.toXmlString
    }
  protected val toSeqString: IndexedRepresentation[Document] => Seq[String] = (r: IndexedRepresentation[Document]) => r.representation.toXmlString :: r.indexed.toList
  protected def asPathRowSource(i: Iterator[Document]) =
    XPathRowSource(keysAsCols, i, DetachStrategy.fromBool[TreeNode[Node]](false))(validateComparator.nsContext).asIndexedRepresentationIterator()

  protected class DocumentIndexedDiffSet extends IndexedDiffSet[Document, Node] {
    val Seq(left, right) = for (i <- Seq(expected, actual)) yield sort(asPathRowSource(i), fromSeqString, toSeqString)
    implicit def nsContext = validateComparator.nsContext
    def inflate(r: Document) = Some(XmlNode(r.getDocumentElement))
    def inflateLeft(r: Document) = inflate(r)
    def inflateRight(r: Document) = inflate(r)
    def comparator = validator.comparator
  }

  lazy val self = new DocumentIndexedDiffSet
}

object XmlValidator {
  def apply(configFileName: Option[String], expected: Iterator[Document], actual: Iterator[Document]) =
    new XmlValidator(expected, actual, configFileName.map(XmlValidateComparator(_)).getOrElse(XmlValidateComparator()))

  def apply(configFileName: Option[String], expectedFileName: String, actualFileName: String): XmlValidator =
    XmlValidator(configFileName, XmlFileRowSource(expectedFileName), XmlFileRowSource(actualFileName))
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
