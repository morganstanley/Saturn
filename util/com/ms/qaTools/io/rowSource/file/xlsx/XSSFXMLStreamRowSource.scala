package com.ms.qaTools.io.rowSource.file.xlsx

import java.io.File
import java.io.InputStream

import scala.annotation.tailrec
import scala.collection.JavaConverters.asScalaIteratorConverter
import scala.collection.mutable.{Buffer => MBuffer}
import scala.collection.mutable.{Map => MMap}

import org.apache.poi.openxml4j.opc.OPCPackage
import org.apache.poi.xssf.eventusermodel.XSSFReader
import org.apache.poi.xssf.model.SharedStringsTable
import org.apache.poi.xssf.model.StylesTable

import com.ms.qaTools.io.rowSource.AdapterColumnDefinitions
import com.ms.qaTools.io.rowSource.ColumnDefinitionAdapter
import com.ms.qaTools.io.rowSource.StreamingColumnDefinitionAdapter

import javax.xml.stream.XMLInputFactory
import javax.xml.stream.XMLStreamConstants
import javax.xml.stream.XMLStreamReader




/*
 * Using StAX to parse the XSSF XML file
 * Schema: http://www.schemacentral.com/sc/ooxml/s-sml-sheet.xsd.html
 */
class XSSFXMLStreamRowSource(
  rowsInputStream: InputStream,
  stylesTable: StylesTable,
  sharedStringsTable: SharedStringsTable,
  ranges: Seq[CellRange] = Nil,
  val columnDefinitionAdapter: ColumnDefinitionAdapter) extends Iterator[Seq[String]] with AdapterColumnDefinitions {

  protected val reader = XMLInputFactory.newInstance().createXMLStreamReader(rowsInputStream)

  protected[this] var row: MBuffer[String] = MBuffer()
  protected[this] var currentCell: Cell = null
  protected[this] val rangeRefCell: MMap[CellRange,Cell] = MMap.empty
  
  private sealed class ProxyNullRowRangeIterator(i: XSSFXMLStreamRowSource) extends Iterator[Seq[String]] with Proxy {
    def self = i
    val nullifyRowCellRange = new Function2[Cell,CellRange,Unit] {
      def apply(c: Cell, r: CellRange): Unit = {
        if (c.columnIndex == r.startColumn) for (i <- 0 until r.columnLength) row.append(c.value(sharedStringsTable))        
      }
    }
    override def next: Seq[String] = {self.nextWithCellRangeStrategy(nullifyRowCellRange)}
    override def hasNext = {self.hasNextWithCellRangeStrategy(nullifyRowCellRange)}
  }  
  
  columnDefinitionAdapter.extractColDefs(new ProxyNullRowRangeIterator(this))
  
  val repeatCellRange = new Function2[Cell,CellRange,Unit] {
    def apply(c: Cell, r: CellRange): Unit = {
      if (! rangeRefCell.isDefinedAt(r)) rangeRefCell.put(r, c)
      if (c.columnIndex == r.startColumn) {
        val refRangeCell = rangeRefCell.get(r)
        for (i <- 0 until r.columnLength) yield row.append(refRangeCell.get.value(sharedStringsTable))
      }
    }
  }

  protected def getAttributes(reader: XMLStreamReader) = {
    val count = reader.getAttributeCount()
    Seq.range(0, count).map(i => {
      reader.getAttributeLocalName(i) -> reader.getAttributeValue(i)
    }).toMap
  }

  protected def onStartCellContent(): Unit = {
    require(currentCell != null, "No current cell.")
    currentCell.reset
  }

  protected def splitColumn(columnIndex: String): (String, Int) = {
    val digitIndex = columnIndex.indexWhere(c => Character.isDigit(c))
    (columnIndex.substring(0, digitIndex), columnIndex.substring(digitIndex).toInt)
  }

  protected def onStartCellDefinition(noAttributes: Boolean = false): Unit = {
    val cell = Cell(if (noAttributes) Map[String,String]("r" -> "A1") else getAttributes(reader), currentCell, stylesTable)
    val gap = cell.columnIndex - (if (currentCell != null) currentCell.columnIndex else -1) - 1
    if (gap > 0) {
      for (i <- 0 until gap) row.append(null)
    }
    currentCell = cell
  }

  protected def onStartRow(): Unit = {
    row.clear
    currentCell = null
  }

  protected def onEndCellContent(f: Function2[Cell,CellRange,Unit]): Unit = {
    val value = currentCell.value(sharedStringsTable)
    ranges.find(_.isInRange(currentCell)) match {
      case Some(r) => f(currentCell,r)
      case None => row.append(value)
    }
  }

  protected def onEndRow() = Some(Seq(row: _*))

  protected def onCharacters() = {
    val text = new String(reader.getTextCharacters(), reader.getTextStart, reader.getTextLength)
    if (currentCell != null || !text.trim().isEmpty()) {      
      currentCell.appendToValue(text)
    }
  }

  /* Read the stream until we get a full row */
  @tailrec
  private def getRow(f: Function2[Cell,CellRange,Unit]): Option[Seq[String]] = {
    if (reader.hasNext) {
      reader.getEventType() match {
        case XMLStreamConstants.START_ELEMENT => {
          reader.getLocalName() match {
            case "v" | "f" | "t" => onStartCellContent()
            case "c"             => onStartCellDefinition()
            case "row"           => onStartRow()
            case _               =>
          }
          reader.next
          getRow(f)
        }
        case XMLStreamConstants.END_ELEMENT => {
          reader.getLocalName() match {
            case "c"   => { onEndCellContent(f); reader.next; getRow(f) }
            case "row" => onEndRow()
            case _     => { reader.next; getRow(f) }
          }
        }
        case XMLStreamConstants.CHARACTERS => {
          onCharacters()
          reader.next
          getRow(f)
        }
        case _ => {
          reader.next
          getRow(f)
        }
      }
    }
    else None
  }

  var didNext = false
  var nextRow: Option[Seq[String]] = None

  def hasNextWithCellRangeStrategy(f: Function2[Cell,CellRange,Unit]) = {
    if (!didNext) {
      nextRow = getRow(f)
      if (nextRow != None) reader.next
      didNext = true
    }
    nextRow.isDefined
  }  

  def nextWithCellRangeStrategy(f: Function2[Cell,CellRange,Unit]) = {
    if (!didNext) {
      nextRow = getRow(f)
      reader.next
    }
    didNext = false
    nextRow match {
      case Some(x) => x
      case None    => throw new Exception("There is no next row!")
    }
  }  
  
  override def next = nextWithCellRangeStrategy(repeatCellRange)
  override def hasNext = hasNextWithCellRangeStrategy(repeatCellRange)
}

object XSSFXMLStreamRowSource {
  //Don't support inputstream as it has to buffer the whole file...
  def createSheetInputStream(file: File, sheetName: String): InputStream = {
    val pkg = OPCPackage.open(file)
    val r = new XSSFReader(pkg)
    val iter = r.getSheetsData match {
      case s: XSSFReader.SheetIterator => s
      case _                           => throw new Exception("Can't get sheet iterator for workbook: '%s'.".format(file.getPath))
    }
    iter.asScala.find(stream => {
      iter.getSheetName() == sheetName
    }) match {
      case Some(i) => i
      case _       => throw new Exception("Can't find sheet '%s' in workbook: '%s'.".format(sheetName, file.getPath))
    }
  }

  def apply(file: File, sheetName: String, columnDefinitionAdapter: ColumnDefinitionAdapter = StreamingColumnDefinitionAdapter()) = {
    val rowSheetInputStream = createSheetInputStream(file, sheetName)
    val rangesSheetInputStream = createSheetInputStream(file, sheetName)
    val pkg = OPCPackage.open(file)
    val r = new XSSFReader(pkg)
    new XSSFXMLStreamRowSource(rowSheetInputStream, r.getStylesTable, r.getSharedStringsTable, CellRanges(rangesSheetInputStream), columnDefinitionAdapter)
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
