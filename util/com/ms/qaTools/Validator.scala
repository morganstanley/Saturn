package com.ms.qaTools
import com.fasterxml.jackson.databind.JsonNode
import com.google.protobuf.Descriptors.Descriptor
import com.google.protobuf.DynamicMessage
import com.google.protobuf.Message
import com.ms.qaTools.compare.AbstractDiff
import com.ms.qaTools.fix.FixValidator
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.io.rowSource.ExternalSortableViaCsv
import com.ms.qaTools.io.rowSource.IndexedRepresentation
import com.ms.qaTools.io.rowSource.PathRowSource
import com.ms.qaTools.json.JsonValidator
import com.ms.qaTools.protobuf.PbValidator
import com.ms.qaTools.tree.TreeNode
import com.ms.qaTools.tree.validator.Comparator
import com.ms.qaTools.tree.validator.ComparatorWithKeys
import com.ms.qaTools.tree.validator.IndexedDiffSet
import com.ms.qaTools.xml.XmlValidator
import org.w3c.dom.Document
import quickfix.DataDictionary
import scala.concurrent.ExecutionContext

abstract class Validator[A, B](expected: Iterator[A], actual: Iterator[A], val validator: ComparatorWithKeys[B]) extends IteratorProxy[AbstractDiff] {v =>
  private val logger = Logger(getClass)
  val keys = validator.keys
  if (!keys.isEmpty) logger.debug("Using document keys: " + keys.mkString("[", ",", "]"))

  require(expected != null, "Null expected row source in Validator")
  require(actual != null, "Null actual row source in Validator")

  implicit val ordering = IndexedRepresentation.ordering[A]
  def keysAsCols = keys.zipWithIndex.map {z => (z._1,"COL" + z._2)}

  def sort(rowSource: Iterator[IndexedRepresentation[A]], fromSeqString: Seq[String] => IndexedRepresentation[A], toSeqString: IndexedRepresentation[A] => Seq[String]): Iterator[IndexedRepresentation[A]] =
    (new IteratorProxy[IndexedRepresentation[A]] with ExternalSortableViaCsv[IndexedRepresentation[A]] {
      def self = rowSource
      def colDefs = ColumnDefinition.fromColumnNames(keys)
      def toSeqStringIterator(xs: Iterator[IndexedRepresentation[A]]) = xs.map(toSeqString)
      def fromSeqStringIterator(yss: Iterator[Seq[String]]) = yss.map(fromSeqString)
    }).sortExternal
}

object Validator {

  trait Config[A, B] {
    def createValidator(expected: Iterator[A], actual: Iterator[A]): Validator[A, B]
  }

  case class FixConfig(dataDictionary: DataDictionary, separator: Option[String] = None) extends Config[Document, org.w3c.dom.Node] {
    def createValidator(expected: Iterator[Document], actual: Iterator[Document]) =
      FixValidator(expected, actual, dataDictionary)
  }

  case class XmlConfig(configFileName: Option[String]) extends Config[Document, org.w3c.dom.Node] {
    def createValidator(expected: Iterator[Document], actual: Iterator[Document]) =
      XmlValidator(configFileName, expected, actual)
  }

  case class PbConfig(configTemplate: Option[DynamicMessage], descriptor: Descriptor)
  extends Config[Message, com.google.protobuf.Descriptors.FieldDescriptor]{
    def createValidator(expected: Iterator[Message], actual: Iterator[Message]) =
      PbValidator(configTemplate, expected, actual, descriptor)
  }

  case object JsonConfig extends Config[JsonNode, JsonNode] {
    def createValidator(expected: Iterator[JsonNode], actual: Iterator[JsonNode]) =
      JsonValidator(expected, actual)
  }

  def apply[A, B](config: Config[A, B], expected: Iterator[A], actual: Iterator[A]) =
    config.createValidator(expected, actual)
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
