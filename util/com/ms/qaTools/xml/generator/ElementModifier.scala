package com.ms.qaTools.xml.generator

import java.io.File
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.JavaConversions.mapAsJavaMap
import org.slf4j.LoggerFactory
import org.w3c.dom.Document
import org.w3c.dom.Node
import com.ms.qaTools.interpreter.GroovyInterpreter
import com.ms.qaTools.io.DelimitedRow
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.io.rowSource.file.XmlFileRowSource
import com.ms.qaTools.io.sortedDelimitedIteratorToDelimitedIterator
import com.ms.qaTools.tree.generator.ColContext
import com.ms.qaTools.tree.generator.Lookupable
import com.ms.qaTools.xml.getLocalName
import groovy.lang.Binding
import com.ms.qaTools.tree.generator.ColMap
import com.ms.qaTools.tree.generator.EmptyMap
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.tree.generator.ColDef
import scala.annotation.tailrec
import com.ms.qaTools.io.rowSource.delimited.DelimitedParser
import com.ms.qaTools.io.rowSource.DsRowSourceCreator
import com.ms.qaTools.io.rowSource.ColumnDefinitionAdapter



trait ElementModifier extends Function4[Node, DelimitedRow, ColContext, Lookupable, Option[Node]]

class GroovyElementModifier(code: String) extends ElementModifier {
  private val logger = LoggerFactory.getLogger(this.getClass())

  def apply(n: Node, row: DelimitedRow, colContext: ColContext, colMap: Lookupable): Option[Node] = {
    val document = n.getOwnerDocument()
    val interpreter = GroovyInterpreter(new Binding(Map("node" -> n, "document" -> document, "row" -> row, "colContext" -> colContext, "colMap" -> colMap)))
    val result = interpreter.run(code)
    if (result.passed) {
      result.resultObj.map {
        case n: Node => n
        case nodes: java.util.List[_] => {
          val f = document.createDocumentFragment()
          for (node @ (n: Node) <- nodes) { f.appendChild(node) }
          f
        }
      }
    }
    else {
      result.exception.map { e => logger.error("Could not interpret Groovy code: %s".format(e)) }
      None
    }
  }
}

class XmlGenElementModifier(template: Document, rowSourceCreator: Function0[Iterator[DelimitedRow] with ColumnDefinitions], isLegacyMode: Boolean, useCurrentRow: Boolean) extends ElementModifier {
  private val logger = LoggerFactory.getLogger(this.getClass())

  def apply(n: Node, row: DelimitedRow, colContext: ColContext, lookupable: Lookupable): Option[Node] = {
    def createMergedRowSource(): Iterator[DelimitedRow] with ColumnDefinitions = {
      def getColDefs() = {
        def getColDefs0(colDefs: Seq[ColDef], parentStack: List[String] = Nil): Seq[ColumnDefinition] = {
          (for (c <- colDefs.filter { _.noIterations }) yield {
            c.children match {
              case EmptyMap()     => Seq(ColumnDefinition(name = (c.name :: parentStack).reverse.mkString("."), index = c.index))
              case ColMap(colMap) => getColDefs0(colMap.values.toSeq.sortBy(_.index), c.name :: parentStack)
            }
          }).flatten
        }
        lookupable match {
          case ColMap(colMap) => getColDefs0(colMap.values.toSeq.sortBy(_.index))
          case EmptyMap()     => Nil
        }
      }
      new Iterator[DelimitedRow] with ColumnDefinitions {
        val nested = rowSourceCreator()
        def next() = row ++ nested.next
        def colDefs = (getColDefs().sortBy(_.index) ++ nested.colDefs).zipWithIndex.map { c => ColumnDefinition(name = c._1.name, index = c._2) }
        def hasNext = nested.hasNext
      }
    }
    val document = n.getOwnerDocument()
    val xmlGenerator = XmlGenerator(template, if (!useCurrentRow) rowSourceCreator() else createMergedRowSource(), isLegacyMode)
    val fragment = xmlGenerator.foldLeft(n.getOwnerDocument().createDocumentFragment()) {
      (fragment, node) => { fragment.appendChild(document.adoptNode(node.getDocumentElement())); fragment }
    }
    n.appendChild(fragment)
    Option(n)
  }
}

object ElementModifier {
 
  private implicit class AttGetter(n: Node) {def apply(a: String) = Option(n.getAttributes().getNamedItem(a)).map {_.getNodeValue()}}

  def isExpandableRefs(n: Node) = n("expandableRefs").isDefined && n("expandableRefs").forall {_.toLowerCase() == "true"}

  def createNestedXmlGenRowSource(n: Node): Function0[Iterator[DelimitedRow] with ColumnDefinitions] = {
    new Function0[Iterator[DelimitedRow] with ColumnDefinitions] {
      def apply() = {
        val dsRowSourceCreator = DsRowSourceCreator(n("fileName").getOrElse(throw new Error("Must specify a filename")),
          n("wsName"),
          firstRow = n("firstRow").getOrElse("0").toInt,
          separatorChar = n("separatorChar").getOrElse(DelimitedParser.DEFAULT_SEPARATOR.toString).head,
          quoteChar = n("quoteChar").getOrElse(DelimitedParser.DEFAULT_QUOTE_CHARACTER.toString).head,
          escapeChar = n("escape").getOrElse(DelimitedParser.DEFAULT_ESCAPE_CHARACTER.toString).head,
          multiPartColNameSeparator = n("multiPartColNameSep").getOrElse("."),
          colNameRows = n("colNameRows").getOrElse("1").toInt,
          headerless = n("headerless").getOrElse("false").toBoolean,
          transformColDefs = identity[Seq[ColumnDefinition]]
        )
          
        try {
          dsRowSourceCreator.createRowSource(n("format").getOrElse("CSV").toUpperCase)
        }
        catch {
          case t => throw new Exception("Can't create a XmlGen row source for format: " + n("format").getOrElse("CSV").toUpperCase, t)
        }
      }
    }
  }

  def createXmlGenTemplate(n: Node): Document =
    XmlFileRowSource(new File(n("template").getOrElse({ throw new Error("Must specify a template file.") }))).next()

  def apply(n: Node): ElementModifier = {
    getLocalName(n) match {
      case "Groovy" => new GroovyElementModifier(n.getTextContent())
      case "DML" => Class.forName(
        "com.ms.qaTools.xml.generator.DMLElementModifier").getConstructor(classOf[String]).newInstance(n.getTextContent).asInstanceOf[ElementModifier]
      case "XmlGen" => new XmlGenElementModifier(
        createXmlGenTemplate(n),
        createNestedXmlGenRowSource(n),
        isLegacyMode = n("isLegacyMode").getOrElse("false").toBoolean,
        useCurrentRow = n("useCurrentRow").getOrElse("true").toBoolean)
    }
  }
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
