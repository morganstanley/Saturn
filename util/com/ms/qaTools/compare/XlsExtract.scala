package com.ms.qaTools.compare

import scala.collection.JavaConverters._

import org.apache.poi.hssf.usermodel.HSSFFont
import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.hssf.util.HSSFColor
import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.CellStyle
import org.apache.poi.ss.usermodel.Color
import org.apache.poi.ss.usermodel.DataFormatter
import org.apache.poi.ss.usermodel.ExtendedColor
import org.apache.poi.ss.usermodel.Font
import org.apache.poi.ss.usermodel.FormulaEvaluator
import org.apache.poi.ss.usermodel.Name
import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.util.CellRangeAddress
import org.apache.poi.ss.util.CellReference
import org.apache.poi.xssf.usermodel.XSSFFont

import com.github.davidmoten.rtree.RTree
import com.github.davidmoten.rtree.geometry.Rectangle

object XlsExtract {
  sealed trait Attribute

  case object Value extends Attribute {
    private[this] val formatter = new DataFormatter

    private[this] val evaluator = new FormulaEvaluator {
      def clearAllCachedResultValues() = ()
      def notifySetFormula(cell: Cell) = ()
      def notifyDeleteCell(cell: Cell) = ()
      def notifyUpdateCell(cell: Cell) = ()
      def evaluate(cell: Cell) = null
      def evaluateInCell(cell: Cell) = null
      def setDebugEvaluationOutputForNextEval(value: Boolean) = ()
      def evaluateAll() = ()
      def evaluateFormulaCell(cell: Cell) = cell.getCachedFormulaResultType
      def setIgnoreMissingWorkbooks(b: Boolean): Unit = ()
      def setupReferencedWorkbooks(m: java.util.Map[String,FormulaEvaluator]): Unit = ()
    }

    def get(cell: Cell): Option[String] =
      if (cell.getCellType == Cell.CELL_TYPE_BLANK) None else Option(formatter.formatCellValue(cell, evaluator))
  }

  case object Formula extends Attribute {
    def get(cell: Cell): Option[String] =
      if (cell.getCellType == Cell.CELL_TYPE_FORMULA) Option(cell.getCellFormula) else None
  }

  case object FirstName extends Attribute
  case object FontName extends Attribute
  case object FontColor extends Attribute
  case object FontSize extends Attribute
  case object BackgroundColor extends Attribute
}

class XlsExtract(sheet: Sheet) {
  import XlsExtract._

  protected val workbook = sheet.getWorkbook
  protected val sheetName = workbook.getSheetName(workbook.getSheetIndex(sheet))

  protected lazy val names: RTree[Name, Rectangle] = {
    val names = (0 until workbook.getNumberOfNames).toIterator.map(workbook.getNameAt).filter(_.getSheetName == sheetName)
    (RTree.star.create[Name, Rectangle] /: names) { (tree, name) =>
      val range = CellRangeAddress.valueOf(name.getRefersToFormula)
      if (range.isFullColumnRange) {
        range.setFirstRow(0)
        range.setLastRow(Integer.MAX_VALUE)
      }
      if (range.isFullRowRange) {
        range.setFirstColumn(0)
        range.setLastColumn(Integer.MAX_VALUE)
      }
      tree.add(name, Rectangle.create(range.getFirstColumn, range.getFirstRow, range.getLastColumn, range.getLastRow))
    }
  }

  protected[compare] def findCellNames(cell: CellReference): Seq[Name] = {
    val rect = Rectangle.create(cell.getCol, cell.getRow, cell.getCol, cell.getRow)
    names.search(rect).toBlocking().getIterator.asScala.map(_.value).toSeq
  }

  protected def getFont(cell: Cell): Font = workbook.getFontAt(cell.getCellStyle.getFontIndex)

  protected def formatColor(c: Color): String = {
    val rgb: Seq[Short] = c match {
      case c: ExtendedColor => c.getRGB.map(b => if (b < 0) (b + 0x100).toShort else b)
      case c: HSSFColor     => c.getTriplet
    }
    rgb.map("%02X".format(_)).mkString("#", "", "")
  }

  protected def getColor(font: Font): Color = font match {
    case font: XSSFFont => font.getXSSFColor
    case font: HSSFFont => font.getHSSFColor(workbook.asInstanceOf[HSSFWorkbook])
  }

  protected def getBackgroundColor(style: CellStyle): Option[Color] = style.getFillPattern match {
    case CellStyle.NO_FILL          => None
    case CellStyle.SOLID_FOREGROUND => Option(style.getFillForegroundColorColor)
    case other                      => throw new IllegalArgumentException(s"fill pattern $other is not supported")
  }

  def get(reference: CellReference, attribute: Attribute): Option[String] = {
    if (reference.getSheetName != null) require(reference.getSheetName == sheetName)
    Option(sheet.getRow(reference.getRow)).flatMap { row =>
      Option(row.getCell(reference.getCol)).flatMap { cell =>
        attribute match {
          case Value           => Value.get(cell)
          case Formula         => Formula.get(cell)
          case FirstName       => findCellNames(reference).headOption.map(_.getNameName)
          case FontName        => Option(getFont(cell).getFontName)
          case FontColor       => Option(formatColor(getColor(getFont(cell))))
          case FontSize        => Option(getFont(cell).getFontHeightInPoints.toString)
          case BackgroundColor => getBackgroundColor(cell.getCellStyle).map(formatColor)
        }
      }
    }
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
