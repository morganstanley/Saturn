package com.ms.qaTools.compare.writer

import scala.annotation.migration
import scala.collection.immutable.TreeMap
import scala.collection.mutable.{ Map => MMap }
import org.apache.poi.hssf.util.HSSFColor
import org.apache.poi.ss.usermodel.CellStyle
import org.apache.poi.ss.usermodel.Font
import org.apache.poi.ss.usermodel.Sheet
import com.ms.qaTools.compare.AbstractDiff
import com.ms.qaTools.compare.CompareColDef
import com.ms.qaTools.compare.DelimitedDifferent
import com.ms.qaTools.compare.DelimitedIdentical
import com.ms.qaTools.compare.DelimitedInLeftOnly
import com.ms.qaTools.compare.DelimitedInRightOnly
import com.ms.qaTools.compare.DiffCounter
import com.ms.qaTools.compare.DifferenceCharacterization
import com.ms.qaTools.io.rowSource.file.ExcelWorkBook
import com.ms.qaTools.io.rowSource.file.ExcelWorkBook.wtowb
import scala.collection.immutable.ListMap
import org.apache.poi.ss.SpreadsheetVersion

class ExcelDiffSetWriter(workbook: ExcelWorkBook,
  colDefs: Seq[CompareColDef],
  pageNames: Map[Page, String] = PageNames(),
  omittedPages: Seq[Page] = Nil,
  createExtraSheets: Boolean = true,
  separateDiffs : Boolean = false)
extends DiffSetWriter {
  val maxRowsPerSheet = (if(workbook.isXlsx) SpreadsheetVersion.EXCEL2007 else SpreadsheetVersion.EXCEL97).getLastRowIndex
  val canAddCell: (Sheet => Boolean) = (ws: Sheet) => ws.getLastRowNum < maxRowsPerSheet
  
  override def writeDiff(diff: AbstractDiff) = diff match {
    case d: DelimitedIdentical   => addCellToIdenticalPage(d)
    case d: DelimitedDifferent   => addCellToDifferencePage(d)
    case d: DelimitedInLeftOnly  => addCellToInLeftOnlyPage(d)
    case d: DelimitedInRightOnly => addCellToInRightOnlyPage(d)
  }

  override def writeNotes(notes: Seq[String] = Seq()) =
    for(sheets <- sheetsMap.get(NotesPage)){
      val ws = sheets.last
      notes.foreach(n => writeTupleToCells(ws, 0, ws.getLastRowNum() + 1, Seq(n)))
    }
  
  override def close = {
    workbook.write
    workbook.close
  }

  override def writeSummary(counter: DiffCounter) =
    sheetsMap.get(SummaryPage).foreach(sheets => {
      val ws = sheets.last
      writeTupleToCells(ws, 0, 0, List(pageNames(LeftPage), counter.left.toString))
      writeTupleToCells(ws, 0, 1, List(pageNames(RightPage), counter.right.toString))
      writeTupleToCells(ws, 0, 2, List(pageNames(DifferencesPage), counter.different.toString))
      writeTupleToCells(ws, 0, 3, List(pageNames(InLeftOnlyPage), counter.inLeftOnly.toString))
      writeTupleToCells(ws, 0, 4, List(pageNames(InRightOnlyPage), counter.inRightOnly.toString))
      writeTupleToCells(ws, 0, 5, List(pageNames(ExplainedPage), counter.explained.toString))
      writeTupleToCells(ws, 0, 6, List(pageNames(IdenticalPage), counter.identical.toString))
      writeTupleToCells(ws, 0, 9, List("Explained Records"))
      writeTupleToCells(ws, 0, 10, List("Explanation", "Count"))
      explainedRecordCountMap.zipWithIndex.foreach {
        case (colInfo, index) => writeTupleToCells(ws, 0, index + 11, List(colInfo._1, colInfo._2.toString))
      }

      writeTupleToCells(ws, 0, ws.getLastRowNum() + 2, List("Explained Fields"))
      writeTupleToCells(ws, 0, ws.getLastRowNum() + 1, List("Field", "Go No-Go", "Status", "Explanation", "Count"))
      ListMap(explainedFieldCountMap.toList.sortBy { _._1 }: _*).foreach {
        case colInfo =>
          writeTupleToCells(ws, 0, ws.getLastRowNum() + 1, List(colInfo._1.field, colInfo._1.characterization.goNoGo, colInfo._1.characterization.name, colInfo._1.explanation, colInfo._2.toString))
      }
      writeTupleToCells(ws, 0, ws.getLastRowNum() + 2, List("Differences"))
      writeTupleToCells(ws, 0, ws.getLastRowNum() + 1, List("Field", "Count"))
      diffCountMap.zipWithIndex.foreach {
        case (colInfo, index) =>
          writeTupleToCells(ws, 0, ws.getLastRowNum() + 1, List(colInfo._1, colInfo._2.toString))}})

  protected def createWorkSheetsMap =
    pageNames.filterNot(Function.tupled((k, v) => omittedPages.contains(k))).mapValues(v => Seq(workbook.createSheet(v)))

  protected val sheetsMap: MMap[Page, Seq[Sheet]] = {
    val map = MMap(createWorkSheetsMap.toSeq: _*)
    val pageNames = map.values.map(l => l.last.getSheetName())
    if (pageNames.isEmpty) throw new Error("DsCompare excel output file must have at least one page.")
    if (pageNames.size != pageNames.toList.distinct.size) throw new Error("DsCompare excel output file must have unique page names.")
    map
  }

  val orderedColDefs: Map[DataSet, List[CompareColDef]] = {
    val (unorderedKeys, rest) = colDefs.toList.partition(col => col.isKey && !col.isIgnored)
    val keys = unorderedKeys.sortBy(_.keyOrder)
    val (ignoredCols, matchedCols) = rest.partition(_.isIgnored)
    val ordered = keys ++ matchedCols ++ ignoredCols
    Map(LEFT  -> ordered.filter(_.indexOpt.isDefined),
        RIGHT -> ordered.filter(_.mappedIndex.isDefined),
        BOTH  -> ordered)
  }

  protected val keyColCellStyle = getColorCellFormat(HSSFColor.LIGHT_TURQUOISE.index, getCellFont(bold = true))
  protected val matchedColCellStyle = getColorCellFormat(HSSFColor.LIGHT_GREEN.index, getCellFont(bold = true))
  protected val explainedColCellStyle = getColorCellFormat(HSSFColor.LIGHT_YELLOW.index, getCellFont(bold = true))
  protected val explainedCellStyle = getColorCellFormat(HSSFColor.LIGHT_YELLOW.index)
  protected val differenceCellStyle = getColorCellFormat(HSSFColor.CORAL.index)

  class ExplainedField(val field: String, val characterization: DifferenceCharacterization, val explanation: String) {
    override def toString = List(field, characterization, explanation).toString

    override def equals(that: Any) = that match {
      case other: ExplainedField =>
        field.equals(other.field) && explanation.equals(other.explanation)
      case _ => false
    }
    override def hashCode(): Int =
      (field.hashCode() * 41) + explanation.hashCode
  }

  protected var diffCountMap: MMap[String, Int] = MMap[String, Int]()
  protected def addDiffCount(colDefName: String) =
    diffCountMap(colDefName) = diffCountMap.getOrElse(colDefName, 0) + 1
  protected var explainedRecordCountMap: MMap[String, Int] = MMap[String, Int]()
  protected def addExplainedRecordCount(isRedFlag: Boolean, explanation: String) =
    explainedRecordCountMap(explanation) = explainedRecordCountMap.getOrElse(explanation, 0) + 1
  protected var explainedFieldCountMap: MMap[ExplainedField, Int] = MMap[ExplainedField, Int]()
  protected def addExplainedFieldCount(isRedFlag: Boolean, field: ExplainedField) =
      explainedFieldCountMap(field) = explainedFieldCountMap.getOrElse(field, 0) + 1

  implicit object ExplainedFieldOrdering extends Ordering[ExplainedField] {
    def compare(t1: ExplainedField, t2: ExplainedField): Int = {
      if (t1.characterization.isAcceptable == t2.characterization.isAcceptable) {
        if (t1.characterization.order == t2.characterization.order)
          if (t1.field.compareTo(t2.field) == 0)
            t1.explanation.compareTo(t2.explanation)
          else
            t1.field.compareTo(t2.field)
        else if (t1.characterization.order < t2.characterization.order)
          -1
        else
          1
      } else {
        if (t1.characterization.isAcceptable)
          1
        else
          -1
      }
    }
  }

  PageNames().keys.foreach(addHeaderToPages)

  protected def getSheetAndLastRowIdx(page: Page, rowsNeeded: Int = 1) =
    sheetsMap.get(page) match {
      case Some(sheets) => {  /// FIXME?
        val nextRowIdx = sheets.last.getLastRowNum + rowsNeeded
        if(nextRowIdx < maxRowsPerSheet || !createExtraSheets)
          (Some(sheets.last), sheets.last.getLastRowNum)
        else {
          val pattern = "(.*)_(\\d+)".r
          val newSheetName = sheets.last.getSheetName match {
            case pattern(a, b) => a + "_" + (b.toInt + 1)
            case _             => sheets.last.getSheetName + "_" + 0
          }
          
          val newWs = workbook.createSheet(newSheetName)
          sheetsMap(page) = sheets :+ newWs
          addHeaderToPages(page)
          (Some(newWs), newWs.getLastRowNum)
        }
      }
      case _ => (None, -1)
    }

  protected def writeTupleToCells(ws: Sheet, colNum: Int, rowNum: Int, cells: Seq[String]) {
    val row = ws.createRow(rowNum)
    insertCell(colNum, cells)
    def insertCell(col: Int, cells: Seq[String]): Unit =
      if (!cells.isEmpty) {
        row.createCell(col).setCellValue(cells.head)
        insertCell(col + 1, cells.tail)
      }
  }
  
  protected def addHeaderToPages(p: Page) =
    sheetsMap.get(p).foreach(sheets =>
      p match {
        case DifferencesPage => addHeaders(ws = sheets.last, addReasonColumn = true, addDataSetColumn = true)
        case ExplainedPage   => addHeaders(ws = sheets.last, addReasonColumn = true, addDataSetColumn = true)
        case IdenticalPage   => addHeaders(ws = sheets.last, addDataSetColumn = true)
        case InLeftOnlyPage  => addHeaders(ws = sheets.last, dataSet = LEFT)
        case InRightOnlyPage => addHeaders(ws = sheets.last, dataSet = RIGHT)
        case LeftPage        => addHeaders(ws = sheets.last, dataSet = LEFT)
        case RightPage       => addHeaders(ws = sheets.last, dataSet = RIGHT)
        case _               => ()})
  
  protected def addCellToWorksheet(ws: Sheet, colIdx: Int, rowIdx: Int, cellValue: String, cellStyle: Option[CellStyle] = None) =
    if (ws != null && canAddCell(ws)) {
      val cell = Option(ws.getRow(rowIdx)).getOrElse(ws.createRow(rowIdx)).createCell(colIdx)
      cell.setCellValue(cellValue)
      cellStyle.foreach(cell.setCellStyle)
    }

  protected def addCellToIdenticalPage(d: DelimitedIdentical) = {
    def addCellToSheet(ws: Sheet) = {
      val rowIdx = ws.getLastRowNum + 1
      val (leftWs, leftWsIdx) = getSheetAndLastRowIdx(LeftPage)
      val (rightWs, rightWsIdx) = getSheetAndLastRowIdx(RightPage)

      addCellToWorksheet(ws, 0, rowIdx, "both")
      orderedColDefs(BOTH).zipWithIndex.foldLeft((0,0)){
        case ((leftOffset, rightOffset), (colDef, index)) =>
          //if the ColumnDefinition is not an ignored key
          if(!colDef.isIgnored || !colDef.isKey) {
            colDef.indexOpt.foreach(i => addCellToWorksheet(ws, index + 1, rowIdx, d.left(i)))
            colDef.mappedIndex.foreach(i => addCellToWorksheet(ws, index + 1, rowIdx, d.right(i)))
          }
          colDef.indexOpt.foreach(i => leftWs.foreach(addCellToWorksheet(_, index - leftOffset, leftWsIdx + 1, d.left(i))))
          colDef.mappedIndex.foreach(i => rightWs.foreach(addCellToWorksheet(_, index - rightOffset, rightWsIdx + 1, d.right(i))))
          (leftOffset + (if(colDef.indexOpt.isEmpty) 1 else 0), rightOffset + (if(colDef.mappedIndex.isEmpty) 1 else 0))
      }
    }

    val (identicalWs, identicalWsIdx) = getSheetAndLastRowIdx(IdenticalPage)
    identicalWs.map(addCellToSheet)
  }

  protected def addCellToDifferencePage(d: DelimitedDifferent) = {
    def addCellToSheet(ws: Sheet) = {
      val rowIdx = ws.getLastRowNum + (if(separateDiffs) 2 else 1)
      val (leftWs, leftWsIdx) = getSheetAndLastRowIdx(LeftPage)
      val (rightWs, rightWsIdx) = getSheetAndLastRowIdx(RightPage)

      if(separateDiffs && canAddCell(ws)){
        ws.createRow(ws.getLastRowNum + 1)
      }

      // Row identifier for left/right
      addCellToWorksheet(ws, 0, rowIdx, pageNames(LeftPage))
      addCellToWorksheet(ws, 0, rowIdx + 1, pageNames(RightPage))

      val diffIdx = d.compareColDefs.map(_.index).toSet
      orderedColDefs(BOTH).zipWithIndex.foldLeft((0, 0)) {
        case ((leftOffset, rightOffset), (colDef, index)) => {
          if (!colDef.isIgnored && diffIdx.contains(colDef.index))
            // Diff might be explained
            d.explainedColumns.find { case (explainedColDef, _) => explainedColDef.name == colDef.name } match {
              case Some((explainedColDef, explanation)) => {
                colDef.indexOpt.foreach(i => addCellToWorksheet(ws, index + 1, rowIdx, d.left(i), Option(explainedCellStyle)))
                colDef.mappedIndex.foreach(i => addCellToWorksheet(ws, index + 1, rowIdx + 1, d.right(i), Option(explainedCellStyle)))
                addCellToWorksheet(ws, index + 1, rowIdx + 2, explanation, Option(explainedCellStyle))
                addExplainedFieldCount(false, new ExplainedField(colDef.name, d.characterization(explainedColDef.index), explanation))
              }
              case None => {
                colDef.indexOpt.foreach(i => addCellToWorksheet(ws, index + 1, rowIdx, d.left(i), Option(differenceCellStyle)))
                colDef.mappedIndex.foreach(i => addCellToWorksheet(ws, index + 1, rowIdx + 1, d.right(i), Option(differenceCellStyle)))
                addDiffCount(colDef.name)
              }
            }
          else {
            // Column value is not a diff -- No coloring
            colDef.indexOpt.foreach(i => addCellToWorksheet(ws, index + 1, rowIdx, d.left(i)))
            colDef.mappedIndex.foreach(i => addCellToWorksheet(ws, index + 1, rowIdx + 1, d.right(i)))
            }
          }

          //Adding column value to left/right worksheet
          colDef.indexOpt.foreach(i => leftWs.foreach(addCellToWorksheet(_, index - leftOffset, leftWsIdx + 1, d.left(i))))
          colDef.mappedIndex.foreach(i => rightWs.foreach(addCellToWorksheet(_, index - rightOffset, rightWsIdx + 1, d.right(i))))

          // Explain whole row
          d.explanation.foreach(addCellToWorksheet(ws, orderedColDefs(BOTH).size + 1, rowIdx, _, Option(explainedCellStyle)))
          (leftOffset + (if(colDef.indexOpt.isEmpty) 1 else 0), rightOffset + (if(colDef.mappedIndex.isEmpty) 1 else 0))
        }
    }

    val page = if (d.isExplained) {
      addExplainedRecordCount(false, d.explanation.get)
      ExplainedPage
    } else DifferencesPage
    
    val (ws, wsIdx) = getSheetAndLastRowIdx(page, 3)
    for(wss <- ws) addCellToSheet(wss)
  }
  
  protected def addCellToInLeftOnlyPage(d: DelimitedInLeftOnly) = {
    if (d.isExplained) {
      for (e <- d.explanation) addExplainedRecordCount(false, e)
      val (explainedWs, explainedWsIdx) = getSheetAndLastRowIdx(ExplainedPage)
      val (leftWs, leftWsIdx) = getSheetAndLastRowIdx(LeftPage)

      // add row to explained and left sheet
      orderedColDefs(LEFT).zipWithIndex.foreach {
        case (colDef, index) => {
          for(ws <- explainedWs) {
            addCellToWorksheet(ws, 0,         explainedWsIdx + 1, pageNames(LeftPage)) //row identifier
            colDef.indexOpt.foreach(i => addCellToWorksheet(ws, index + 1, explainedWsIdx + 1, d.left(i)))
            for(explanationStr <- d.explanation) addCellToWorksheet(ws, orderedColDefs(LEFT).size + 1, explainedWsIdx + 1, explanationStr, Option(explainedCellStyle))
            if(true/*replace by boolean from allwyn*/) ws.createRow(explainedWsIdx + 2)
          }
          colDef.indexOpt.foreach(i => leftWs.foreach(addCellToWorksheet(_, index, leftWsIdx + 1, d.left(i))))
        }
      }          
    } else {
      val (inLeftOnlyWs, inLeftOnlyWsIdx) = getSheetAndLastRowIdx(InLeftOnlyPage)
      val (leftWs, leftWsIdx) = getSheetAndLastRowIdx(LeftPage)

      // add row to inLeftOnly and left sheet
      orderedColDefs(LEFT).zipWithIndex.foreach {
        case (colDef, index) =>
          colDef.indexOpt.foreach(i => {
            inLeftOnlyWs.foreach(addCellToWorksheet(_, index, inLeftOnlyWsIdx + 1, d.left(i)))
            leftWs.foreach(addCellToWorksheet(_, index, leftWsIdx + 1, d.left(i)))
          })
      }
    }
  }

  protected def addCellToInRightOnlyPage(d: DelimitedInRightOnly) =
    if (d.isExplained) {
      for (e <- d.explanation) addExplainedRecordCount(false, e)
      val (explainedWs, explainedWsIdx) = getSheetAndLastRowIdx(ExplainedPage)
      val (rightWs, rightWsIdx) = getSheetAndLastRowIdx(RightPage)

      // add row to explained and right sheet
      orderedColDefs(RIGHT).zipWithIndex.foreach {
        case (colDef, index) => {
          for (ws <- explainedWs) {
            addCellToWorksheet(ws, 0,         explainedWsIdx + 1, pageNames(RightPage)) //row identifier
            addCellToWorksheet(ws, index + 1, explainedWsIdx + 1, d.right(colDef.rightIndex))
            for (explanationStr <- d.explanation) addCellToWorksheet(ws, orderedColDefs(RIGHT).size + 1, explainedWsIdx + 1, explanationStr, Option(explainedCellStyle))
            if(true/*replace by boolean from allwyn*/) ws.createRow(explainedWsIdx + 2)
          }
          for (ws <- rightWs) addCellToWorksheet(ws, index, rightWsIdx + 1, d.right(colDef.rightIndex))
        }
      }
    } else {
      val (inRightOnlyWs, inRightOnlyWsIdx) = getSheetAndLastRowIdx(InRightOnlyPage)
      val (rightWs, rightWsIdx) = getSheetAndLastRowIdx(RightPage)

      // add row to inRightOnly and right sheet
      orderedColDefs(RIGHT).zipWithIndex.foreach {
        case (colDef, index) => {
          for (ws <- inRightOnlyWs) addCellToWorksheet(ws, index, inRightOnlyWsIdx + 1, d.right(colDef.rightIndex))
          for (ws <- rightWs) addCellToWorksheet(ws, index, rightWsIdx + 1, d.right(colDef.rightIndex))
        }
      }
    }

  protected def addHeaders(ws: Sheet, addReasonColumn: Boolean = false, dataSet: DataSet = BOTH, addDataSetColumn: Boolean = false) = {
    val startingIndex = if (addDataSetColumn) 1 else 0
    if (addDataSetColumn) {
      addCellToWorksheet(ws, 0, 0, pageNames(LeftPage))
      addCellToWorksheet(ws, 0, 1, pageNames(RightPage))
    }

    orderedColDefs(dataSet).zipWithIndex.foreach{case (colDef, index) =>
      if (colDef.isKey) {
        val cellStyle = if(colDef.isIgnored) None else Option(keyColCellStyle)
        dataSet match {
          case LEFT  => addCellToWorksheet(ws, index + startingIndex, 0, colDef.leftName, cellStyle)
          case RIGHT => addCellToWorksheet(ws, index + startingIndex, 0, colDef.rightName, cellStyle)
          case BOTH  => {
            addCellToWorksheet(ws, index + startingIndex, 0, colDef.leftName, cellStyle)
            addCellToWorksheet(ws, index + startingIndex, 1, colDef.rightName, cellStyle)
          }
        }
      }
      else if (!colDef.isIgnored)
        dataSet match {
          case LEFT  => addCellToWorksheet(ws, index + startingIndex, 0, colDef.leftName, Option(matchedColCellStyle))
          case RIGHT => addCellToWorksheet(ws, index + startingIndex, 0, colDef.rightName, Option(matchedColCellStyle))
          case BOTH  => {
            addCellToWorksheet(ws, index + startingIndex, 0, colDef.leftName, Option(matchedColCellStyle))
            addCellToWorksheet(ws, index + startingIndex, 1, colDef.rightName, Option(matchedColCellStyle))
          }
        }
      else
        dataSet match {
          case LEFT => colDef.nameOpt.foreach(addCellToWorksheet(ws, index + startingIndex, 0, _))
          case RIGHT => colDef.mappedName.foreach(addCellToWorksheet(ws, index + startingIndex, 0, _))
          case BOTH => {
            colDef.nameOpt.foreach(addCellToWorksheet(ws, index + startingIndex, 0, _))
            colDef.mappedName.foreach(addCellToWorksheet(ws, index + 1, startingIndex, _)) // FIXME are these indexes mixed up?
          }
        }
    }

    if (addReasonColumn) {
      val colCount = startingIndex + orderedColDefs(dataSet).size
      addCellToWorksheet(ws, colCount, 0, "Reason", Option(explainedColCellStyle))
      addCellToWorksheet(ws, colCount, 1, "Reason", Option(explainedColCellStyle))
    }
  }

  protected def getColorCellFormat(color: Short, cellFont: Font = getCellFont()) = {
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
}

object ExcelDiffSetWriter {
  def apply(workbook: ExcelWorkBook, colDefs: Seq[CompareColDef],
            pageNames: Map[Page, String] = PageNames(), ommittedPages: Seq[Page] = Nil) =
    new ExcelDiffSetWriter(workbook, colDefs, pageNames, ommittedPages)
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
