package com.ms.qaTools
import com.fasterxml.jackson.databind.JsonNode
import com.google.protobuf.Descriptors.Descriptor
import com.google.protobuf.DynamicMessage
import com.google.protobuf.Message
import com.ms.qaTools.compare.AbstractDiff
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.io.rowSource.ExternalSortable
import com.ms.qaTools.io.rowSource.ExternalSortableViaCsv
import com.ms.qaTools.io.rowSource.IndexedRepresentation
import com.ms.qaTools.io.rowSource.PathRowSource
import com.ms.qaTools.json.JsonValidator
import com.ms.qaTools.protobuf.PbValidator
import com.ms.qaTools.tree.TreeNode
import com.ms.qaTools.tree.validator.Comparator
import com.ms.qaTools.tree.validator.ComparatorWithKeys
import com.ms.qaTools.tree.validator.HasIndexedDiffSet
import com.ms.qaTools.tree.validator.IndexedDiffSet
import com.ms.qaTools.xml.XmlValidator
import org.w3c.dom.Document

abstract class Validator[A, B](expected: Iterator[A], actual: Iterator[A], val validator: ComparatorWithKeys[B])
extends IteratorProxy[AbstractDiff] with HasIndexedDiffSet[A, B]{v =>
  private val logger = Logger(getClass)
  val keys = validator.keys
  if (!keys.isEmpty) logger.debug("Using document keys: " + keys.mkString("[", ",", "]"))

  require(expected != null, "Null expected row source in Validator")
  require(actual != null, "Null actual row source in Validator")

  def self = diffSet

  def pathRowSourceBuilder(x: Seq[(String, String)], y: Iterator[A]): PathRowSource[B, A]
  def toSeqString(r: IndexedRepresentation[A]): Seq[String]
  def fromSeqString(r: Seq[String]): IndexedRepresentation[A]

  implicit val ordering = IndexedRepresentation.ordering[A]
  def sort(rowSource: Iterator[A]) =
    (new IteratorProxy[IndexedRepresentation[A]] with ExternalSortableViaCsv[IndexedRepresentation[A]] {
      def self = pathRowSourceBuilder(keys.zipWithIndex.map {z => (z._1,"COL" + z._2)}, rowSource).asIndexedRepresentationIterator
      def colDefs = ColumnDefinition.fromColumnNames(keys)
      def toSeqStringIterator(xs: Iterator[IndexedRepresentation[A]]) = xs.map(toSeqString)
      def fromSeqStringIterator(yss: Iterator[Seq[String]]) = yss.map(fromSeqString)
    }).sortExternal

  def toNode(x: A): TreeNode[B]

  val diffSet = new IndexedDiffSet[A, B] {
    val toNode = (x: A) => v.toNode(x)
    val left = sort(expected)
    val right = sort(actual)
    val comparator = validator.comparator
  }
 }

object Validator {
  trait Config[A, B] {
    def createValidator(expected: Iterator[A], actual: Iterator[A]): Validator[A, B]
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
COPYRIGHT NOTICE AND DISCLAIMER
Copyright (c) 2009-2016, Contributor

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License, version 3 for more details.

You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
*/
