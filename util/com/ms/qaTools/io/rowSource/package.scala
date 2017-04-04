package com.ms.qaTools.io
import com.mongodb.DBObject
import com.mongodb.util.JSON.{parse => mongoJSONParse}
import com.ms.qaTools.io.rowSource.AdapterColumnDefinitions
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.io.rowSource.ExternalSort
import com.ms.qaTools.io.rowSource.jdbc.ResultSetRowSource
import com.ms.qaTools.io.rowSource.Utils._
import com.ms.qaTools.xml._
import java.io.ByteArrayInputStream
import java.io.Closeable
import java.io.StringReader
import java.io.StringWriter
import javax.jms.BytesMessage
import javax.jms.Message
import javax.jms.TextMessage
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.OutputKeys
import javax.xml.transform.stream.StreamResult
import javax.xml.transform.TransformerFactory
import org.apache.commons.io.IOUtils
import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.DataFormatter
import org.apache.xerces.parsers.DOMParser
import org.w3c.dom.Document
import org.xml.sax.EntityResolver
import org.xml.sax.InputSource
import scala.Array.canBuildFrom
import scala.xml.Node

package object rowSource {
  def ltToOrdering[T](lt: (T, T) => Boolean): Ordering[T] = new Ordering[T] {
    def compare(a: T, b: T): Int = {
      if (lt(a, b)) -1
      else if (lt(b, a)) 1
      else 0
    }
  }

  // scala.xml
  implicit def fromNodeToString(node: Node): String = node.toString
  implicit def fromNodeToDocument(node: Node): Document = node.toString.toDocument

  // Excel
  val formatter = new DataFormatter
  implicit def stringFromCell(cell: Cell): String = cell.getRichStringCellValue.getString
  implicit def tableRowFromCellArray(cells: Seq[Cell]): Seq[String] = {
    def fromType0(cellType: Int, cell: Cell) = cellType match {
      case Cell.CELL_TYPE_STRING => cell.getRichStringCellValue.getString
      case Cell.CELL_TYPE_NUMERIC => {
        val style = cell.getCellStyle()
        if(style == null) cell.getNumericCellValue().toString
        else formatter.formatRawCellContents(cell.getNumericCellValue(),style.getDataFormat(),style.getDataFormatString())
      }
      case Cell.CELL_TYPE_BOOLEAN => cell.getBooleanCellValue.toString
      case Cell.CELL_TYPE_BLANK => null
    }
    cells.map {
      x =>
        if (x == null) null
        else {
          x.getCellType() match {
            case Cell.CELL_TYPE_FORMULA => fromType0(x.getCachedFormulaResultType(),x)
            case _ => fromType0(x.getCellType(),x)
          }
        }
    }
  }

  implicit def excelCellIteratorToDelimitedRowIterator(i: Iterator[Seq[Cell]] with AdapterColumnDefinitions): Iterator[DelimitedRow] with ColumnDefinitions =
    new Iterator[DelimitedRow] with ColumnDefinitions {
      def colDefs = i.colDefs
      def next = tableRowFromCellArray(i.next)
      def hasNext = i.hasNext
    }

  // MongoDB
  implicit def DBObjectToJSON(dbobject: DBObject):String = dbobject.toString()
  implicit def JSONtoDBObject(json:String): DBObject = mongoJSONParse(json).asInstanceOf[DBObject]
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
