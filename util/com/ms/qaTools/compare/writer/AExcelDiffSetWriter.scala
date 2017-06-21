package com.ms.qaTools.compare.writer

import scala.collection.mutable.Buffer

import org.apache.commons.lang.StringUtils
import org.apache.poi.common.usermodel.Hyperlink
import org.apache.poi.hssf.util.HSSFColor
import org.apache.poi.ss.SpreadsheetVersion
import org.apache.poi.ss.usermodel.CellStyle
import org.apache.poi.ss.usermodel.Font
import org.apache.poi.ss.usermodel.Sheet

import com.ms.qaTools.compare.AbstractDiff
import com.ms.qaTools.compare.Counter
import com.ms.qaTools.io.rowSource.file.ExcelWorkBook

abstract class AExcelDiffSetWriter[A <: AbstractDiff, B <: Counter[A, B]](workbook: ExcelWorkBook, pageNames: Map[Page, String]) extends DiffSetWriter[A, B] {
  require(pageNames.nonEmpty, "DsCompare excel output file must have at least one page.")
  require(pageNames.values.toSet.size == pageNames.size, "DsCompare excel output file must have unique page names.")

  protected def addHeaderToPage(page: Page): Unit
  def createExtraSheets: Boolean

  val maxRowsPerSheet = (if (workbook.isXlsx) SpreadsheetVersion.EXCEL2007 else SpreadsheetVersion.EXCEL97).getLastRowIndex

  protected val keyColCellStyle = getColorCellFormat(HSSFColor.LIGHT_TURQUOISE.index, getCellFont(bold = true))
  protected val matchedColCellStyle = getColorCellFormat(HSSFColor.LIGHT_GREEN.index, getCellFont(bold = true))
  protected val explainedColCellStyle = getColorCellFormat(HSSFColor.LIGHT_YELLOW.index, getCellFont(bold = true))
  protected val explainedCellStyle = getColorCellFormat(HSSFColor.LIGHT_YELLOW.index)
  protected val differenceCellStyle = getColorCellFormat(HSSFColor.CORAL.index)

  protected val sheetsMap: Map[Page, Buffer[Sheet]] = pageNames.transform((_, s) => Buffer(workbook.createSheet(s)))

  pageNames.keys.foreach(addHeaderToPage)

  def canAddCell(ws: Sheet): Boolean = ws.getLastRowNum < maxRowsPerSheet

  protected def getSheetAndLastRowIdx(page: Page, rowsNeeded: Int = 1) =
    sheetsMap.get(page) match {
      case Some(sheets) =>
        val nextRowIdx = sheets.last.getLastRowNum + rowsNeeded
        if (nextRowIdx < maxRowsPerSheet || !createExtraSheets)
          (Some(sheets.last), sheets.last.getLastRowNum)
        else {
          val pattern = "(.*)_(\\d+)".r
          val newSheetName = sheets.last.getSheetName match {
            case pattern(a, b) => a + "_" + (b.toInt + 1)
            case _             => sheets.last.getSheetName + "_" + 0
          }
          val newWs = workbook.createSheet(newSheetName)
          sheetsMap(page) += newWs
          addHeaderToPage(page)
          (Some(newWs), newWs.getLastRowNum)
        }
      case _ => (None, -1)
    }

  def withSheetAndLastRowIdx(page: Page, rowsNeeded: Int = 1)(f: (Sheet, Int) => Unit) = {
    val (sheet, i) = getSheetAndLastRowIdx(page, rowsNeeded)
    sheet.foreach(f(_, i))
  }

  /**
   * Adds a cell to worksheet unless cellValue and cellStyle are empty
   */
  protected def addCellToWorksheet(ws: Sheet, colIdx: Int, rowIdx: Int,
                                   cellValue: String, cellStyle: Option[CellStyle] = None): Unit =
    if (StringUtils.isNotEmpty(cellValue) || cellStyle.isDefined) {
      val cell = Option(ws.getRow(rowIdx)).getOrElse(ws.createRow(rowIdx)).createCell(colIdx)
      val hyperlinkRe = "HYPERLINK: (.*)".r
      cellValue match {
        case hyperlinkRe(v) =>
          cell.setCellValue(v)
          val link = workbook.getCreationHelper.createHyperlink(Hyperlink.LINK_URL)
          link.setAddress(v)
          cell.setHyperlink(link)
        case v => cell.setCellValue(v)
      }
      cellStyle.foreach(cell.setCellStyle)
    }

  protected def writeTupleToCells(ws: Sheet, colNum: Int, rowNum: Int, cells: Seq[String]): Unit =
    for ((c, i) <- cells.zipWithIndex) addCellToWorksheet(ws, colNum + i, rowNum, c)

  protected def getColorCellFormat(color: Short, cellFont: Font = getCellFont()): CellStyle = {
    val cellStyle = workbook.createCellStyle
    cellStyle.setFillBackgroundColor(color)
    cellStyle.setFillForegroundColor(color)
    cellStyle.setFillPattern(CellStyle.SOLID_FOREGROUND)
    cellStyle.setFont(cellFont)
    cellStyle
  }

  protected def getCellFont(fontName: String = "Arial", size: Int = 10, bold: Boolean = false) = {
    val font = workbook.createFont
    font.setFontHeightInPoints(size.toShort)
    font.setFontName(fontName)
    if (bold) font.setBoldweight(Font.BOLDWEIGHT_BOLD)
    font
  }

  def writeNotes(notes: Seq[String] = Seq()) = for (sheets <- sheetsMap.get(NotesPage)) {
    val ws = sheets.last
    writeTupleToCells(ws, 0, ws.getLastRowNum + 1, notes)
  }

  def close = {
    workbook.write
    workbook.close()
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
