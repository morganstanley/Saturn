package com.ms.qaTools.xml
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.io.rowSource.file.XmlFileRowSource
import com.ms.qaTools.io.rowSource.file.XPathRowSource
import com.ms.qaTools.io.rowSource.IndexedRepresentation
import com.ms.qaTools.io.rowSource.Utils.StringUtil
import com.ms.qaTools.io.rowSource.Utils.W3CDocumentUtil
import com.ms.qaTools.toolkit.xmlValidate.XmlValidateComparator
import com.ms.qaTools.tree.TreeNode
import com.ms.qaTools.tree.validator.IndexedDiffSet
import com.ms.qaTools.tree.XmlNode
import com.ms.qaTools.Validator
import javax.xml.namespace.NamespaceContext
import org.w3c.dom.Document
import org.w3c.dom.Node

class XmlValidator(expected: Iterator[Document], actual: Iterator[Document], validateComparator: XmlValidateComparator)
extends Validator[Document, Node](expected, actual, validateComparator){
  def pathRowSourceBuilder(keys: Seq[(String, String)], rs: Iterator[Document]) =
    XPathRowSource.apply(keys, rs, false)(validateComparator.nsContext)

  def toSeqString(r: IndexedRepresentation[Document]) = r.representation.toXmlString :: r.indexed.toList

  def fromSeqString(r: Seq[String]) = new IndexedRepresentation[Document] {
    val representation: Document = r(0).toDocument
    def colDefs = ColumnDefinition.fromColumnNames(keys)
    val indexed = r.tail
  }

  def toNode(d: Document) = XmlNode(d.getDocumentElement)(validateComparator.nsContext)
}

object XmlValidator {
  def apply(configFileName: Option[String], expected: Iterator[Document], actual: Iterator[Document]) =
    new XmlValidator(expected, actual, configFileName.map(XmlValidateComparator(_)).getOrElse(XmlValidateComparator()))

  def apply(configFileName: Option[String], expectedFileName: String, actualFileName: String): XmlValidator =
    XmlValidator(configFileName, XmlFileRowSource(expectedFileName), XmlFileRowSource(actualFileName))
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
