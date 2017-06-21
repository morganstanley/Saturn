package com.ms.qaTools.compare.writer

import scala.collection.mutable.{ Map => MMap }
import org.apache.poi.ss.usermodel.Sheet
import com.ms.qaTools.compare.Diff
import com.ms.qaTools.compare.CompareColDef
import com.ms.qaTools.compare.CompareColDefs
import com.ms.qaTools.compare.DelimitedComparatorCounter
import com.ms.qaTools.compare.DelimitedDifferent
import com.ms.qaTools.compare.DelimitedIdentical
import com.ms.qaTools.compare.DelimitedInLeftOnly
import com.ms.qaTools.compare.DelimitedInRightOnly
import com.ms.qaTools.compare.DifferenceCharacterization
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.io.rowSource.file.ExcelWorkBook
import scala.collection.immutable.ListMap

case class ExcelDiffSetWriter(workbook: ExcelWorkBook,
  colDefs: CompareColDefs,
  pageNames: Map[Page, String] = PageNames(),
  omittedPages: Seq[Page] = Nil,
  val createExtraSheets: Boolean = true,
  separateDiffs : Boolean = false)
extends AExcelDiffSetWriter[Diff[Seq[String]], DelimitedComparatorCounter](workbook, pageNames.filterKeys(!omittedPages.contains(_))) with DelimitedDiffSetWriter with SortedColumns {
  def writeSummary(counter: DelimitedComparatorCounter) =
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
      ListMap(explainedFieldCountMap.toList.sortBy { _._1 }(ExplainedFieldOrdering): _*).foreach {
        case colInfo =>
          writeTupleToCells(ws, 0, ws.getLastRowNum() + 1, List(colInfo._1.field, colInfo._1.characterization.goNoGo, colInfo._1.characterization.name, colInfo._1.explanation, colInfo._2.toString))
      }
      writeTupleToCells(ws, 0, ws.getLastRowNum() + 2, List("Differences"))
      writeTupleToCells(ws, 0, ws.getLastRowNum() + 1, List("Field", "Count"))
      diffCountMap.zipWithIndex.foreach {
        case (colInfo, index) =>
          writeTupleToCells(ws, 0, ws.getLastRowNum() + 1, List(colInfo._1, colInfo._2.toString))}})

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

  protected val diffCountMap = MMap[String, Int]()
  protected def addDiffCount(colDefName: String) =
    diffCountMap(colDefName) = diffCountMap.getOrElse(colDefName, 0) + 1
  protected val explainedRecordCountMap = MMap[String, Int]()
  protected def addExplainedRecordCount(isRedFlag: Boolean, explanation: String) =
    explainedRecordCountMap(explanation) = explainedRecordCountMap.getOrElse(explanation, 0) + 1
  protected val explainedFieldCountMap = MMap[ExplainedField, Int]()
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

  protected def addHeaderToPage(p: Page) =
    sheetsMap.get(p).foreach(sheets =>
      p match {
        case DifferencesPage => addHeaders(sheets.last, sortedCompareColumns.map(Left(_)), addReasonColumn = true, addDataSetColumn = true)
        case ExplainedPage   => addHeaders(sheets.last, sortedCompareColumns.map(Left(_)), addReasonColumn = true, addDataSetColumn = true)
        case IdenticalPage   => addHeaders(sheets.last, sortedCompareColumns.map(Left(_)), addDataSetColumn = true)
        case InLeftOnlyPage  => addHeaders(sheets.last, sortedLeftColumns .map(Right(_)))
        case InRightOnlyPage => addHeaders(sheets.last, sortedRightColumns.map(Right(_)))
        case LeftPage        => addHeaders(sheets.last, sortedLeftColumns .map(Right(_)))
        case RightPage       => addHeaders(sheets.last, sortedRightColumns.map(Right(_)))
        case _               => ()})

  def writeIdentical(d: DelimitedIdentical) = {
    def addCellToSheet(ws: Sheet) = {
      val rowIdx = ws.getLastRowNum + 1
      val (leftWs, leftWsIdx) = getSheetAndLastRowIdx(LeftPage)
      val (rightWs, rightWsIdx) = getSheetAndLastRowIdx(RightPage)

      addCellToWorksheet(ws, 0, rowIdx, "both")
      sortedCompareColumns.zipWithIndex.foldLeft((0, 0)){
        case ((leftOffset, rightOffset), ((l, r, ignored), index)) =>
          //if the ColumnDefinition is not an ignored key
          if(!ignored || l.filter(_.isKey).isEmpty) {
            l.foreach(l => addCellToWorksheet(ws, index + 1, rowIdx, d.left(l.index)))
            r.foreach(r => addCellToWorksheet(ws, index + 1, rowIdx, d.right(r.index)))
          }
          l.foreach(l => leftWs.foreach(addCellToWorksheet(_, index - leftOffset, leftWsIdx + 1, d.left(l.index))))
          r.foreach(r => rightWs.foreach(addCellToWorksheet(_, index - rightOffset, rightWsIdx + 1, d.right(r.index))))
          (leftOffset + (if (l.isEmpty) 1 else 0), rightOffset + (if (r.isEmpty) 1 else 0))
      }
    }

    getSheetAndLastRowIdx(IdenticalPage)._1.map(addCellToSheet)
  }

  def writeDifferent(d: DelimitedDifferent) = {
    def addCellToSheet(ws: Sheet) = {
      def getOrNull[A](s: Seq[A], i: Int): A =
        s.applyOrElse(i, (i: Int) => null.asInstanceOf[A])

      val rowIdx = ws.getLastRowNum + (if(separateDiffs) 2 else 1)
      val (leftWs, leftWsIdx) = getSheetAndLastRowIdx(LeftPage)
      val (rightWs, rightWsIdx) = getSheetAndLastRowIdx(RightPage)

      if(separateDiffs && canAddCell(ws)){
        ws.createRow(ws.getLastRowNum + 1)
      }

      // Row identifier for left/right
      addCellToWorksheet(ws, 0, rowIdx, pageNames(LeftPage))
      addCellToWorksheet(ws, 0, rowIdx + 1, pageNames(RightPage))

      val diffIdx = d.compareColDefs.map(_.left.index).toSet
      sortedCompareColumns.zipWithIndex.foldLeft((0, 0)) {
        case ((leftOffset, rightOffset), ((l, r, ignored), index)) =>
          if (!ignored && l.filter(l => diffIdx(l.index)).nonEmpty)
            d.explainedColumns.find { case (explainedColDef, _) => Some(explainedColDef.left.name) == l.map(_.name) } match {
              case Some((explainedColDef, explanation)) =>
                l.foreach(l => addCellToWorksheet(ws, index + 1, rowIdx, d.left(l.index), Option(explainedCellStyle)))
                r.foreach(r => addCellToWorksheet(ws, index + 1, rowIdx + 1, d.right(r.index), Option(explainedCellStyle)))
                addCellToWorksheet(ws, index + 1, rowIdx + 2, explanation, Option(explainedCellStyle))
                addExplainedFieldCount(false, new ExplainedField(explainedColDef.left.name, d.characterization(explainedColDef.left.index), explanation))
              case None =>
                l.foreach(l => addCellToWorksheet(ws, index + 1, rowIdx, getOrNull(d.left, l.index), Option(differenceCellStyle)))
                r.foreach(r => addCellToWorksheet(ws, index + 1, rowIdx + 1, getOrNull(d.right, r.index), Option(differenceCellStyle)))
                l.foreach(l => addDiffCount(l.name))
            }
          else {
            // Column value is not a diff -- No coloring
            l.foreach(l => addCellToWorksheet(ws, index + 1, rowIdx, getOrNull(d.left, l.index)))
            r.foreach(r => addCellToWorksheet(ws, index + 1, rowIdx + 1, getOrNull(d.right, r.index)))
          }

          //Adding column value to left/right worksheet
          l.foreach(l => leftWs.foreach(addCellToWorksheet(_, index - leftOffset, leftWsIdx + 1, getOrNull(d.left, l.index))))
          r.foreach(r => rightWs.foreach(addCellToWorksheet(_, index - rightOffset, rightWsIdx + 1, getOrNull(d.right, r.index))))

          // Explain whole row
          d.explanation.foreach(addCellToWorksheet(ws, sortedCompareColumns.size + 1, rowIdx, _, Option(explainedCellStyle)))
          (leftOffset + (if (l.isEmpty) 1 else 0), rightOffset + (if (r.isEmpty) 1 else 0))
      }
    }

    val page = d.explanation match {
      case Some(e) => {addExplainedRecordCount(false, e); ExplainedPage}
      case _ => DifferencesPage
    }

    getSheetAndLastRowIdx(page, 3)._1.map(addCellToSheet)
  }

  def writeInLeftOnly(d: DelimitedInLeftOnly) = {
    if (d.isExplained) {
      for (e <- d.explanation) addExplainedRecordCount(false, e)
      val (explainedWs, explainedWsIdx) = getSheetAndLastRowIdx(ExplainedPage)
      val (leftWs, leftWsIdx) = getSheetAndLastRowIdx(LeftPage)

      sortedLeftColumns.zipWithIndex.foreach {
        case ((colDef, _), index) => {
          for(ws <- explainedWs) {
            addCellToWorksheet(ws, 0,         explainedWsIdx + 1, pageNames(LeftPage)) //row identifier
            addCellToWorksheet(ws, index + 1, explainedWsIdx + 1, d.left(colDef.index))
            for(explanationStr <- d.explanation) addCellToWorksheet(ws, sortedLeftColumns.size + 1, explainedWsIdx + 1, explanationStr, Option(explainedCellStyle))
            ws.createRow(explainedWsIdx + 2)
          }
          leftWs.foreach(addCellToWorksheet(_, index, leftWsIdx + 1, d.left(colDef.index)))
        }
      }
    } else {
      val (inLeftOnlyWs, inLeftOnlyWsIdx) = getSheetAndLastRowIdx(InLeftOnlyPage)
      val (leftWs, leftWsIdx) = getSheetAndLastRowIdx(LeftPage)

      sortedLeftColumns.zipWithIndex.foreach {
        case ((colDef, _), index) =>
          val i = colDef.index
          inLeftOnlyWs.foreach(addCellToWorksheet(_, index, inLeftOnlyWsIdx + 1, d.left(i)))
          leftWs.foreach(addCellToWorksheet(_, index, leftWsIdx + 1, d.left(i)))
      }
    }
  }

  def writeInRightOnly(d: DelimitedInRightOnly) =
    if (d.isExplained) {
      for (e <- d.explanation) addExplainedRecordCount(false, e)
      val (explainedWs, explainedWsIdx) = getSheetAndLastRowIdx(ExplainedPage)
      val (rightWs, rightWsIdx) = getSheetAndLastRowIdx(RightPage)

      sortedRightColumns.zipWithIndex.foreach {
        case ((colDef, _), index) => {
          for (ws <- explainedWs) {
            addCellToWorksheet(ws, 0,         explainedWsIdx + 1, pageNames(RightPage)) //row identifier
            addCellToWorksheet(ws, index + 1, explainedWsIdx + 1, d.right(colDef.index))
            for (explanationStr <- d.explanation) addCellToWorksheet(ws, sortedRightColumns.size + 1, explainedWsIdx + 1, explanationStr, Option(explainedCellStyle))
            ws.createRow(explainedWsIdx + 2)
          }
          for (ws <- rightWs) addCellToWorksheet(ws, index, rightWsIdx + 1, d.right(colDef.index))
        }
      }
    } else {
      val (inRightOnlyWs, inRightOnlyWsIdx) = getSheetAndLastRowIdx(InRightOnlyPage)
      val (rightWs, rightWsIdx) = getSheetAndLastRowIdx(RightPage)

      sortedRightColumns.zipWithIndex.foreach {
        case ((colDef, _), index) =>
          for (ws <- inRightOnlyWs) addCellToWorksheet(ws, index, inRightOnlyWsIdx + 1, d.right(colDef.index))
          for (ws <- rightWs) addCellToWorksheet(ws, index, rightWsIdx + 1, d.right(colDef.index))
      }
    }

  protected def addHeaders(ws: Sheet, columns: Seq[Either[(Option[ColumnDefinition], Option[ColumnDefinition], Boolean), (ColumnDefinition, Boolean)]], addReasonColumn: Boolean = false, addDataSetColumn: Boolean = false) = {
    val startingIndex = if (addDataSetColumn) 1 else 0
    if (addDataSetColumn) {
      addCellToWorksheet(ws, 0, 0, pageNames(LeftPage))
      addCellToWorksheet(ws, 0, 1, pageNames(RightPage))
    }

    columns.zipWithIndex.foreach{
      case (Right((c, matched)), index) =>
        val style = (c.isKey, matched) match {
          case (true, _)     => Some(keyColCellStyle)
          case (false, true) => Some(matchedColCellStyle)
          case _             => None}
        addCellToWorksheet(ws, index + startingIndex, 0, c.name, style)
      case (Left((l, r, ignored)), index) =>
        val style = (l.filter(_.isKey).isDefined, ignored) match {
          case (true, false)  => Option(keyColCellStyle)
          case (false, false) => Option(matchedColCellStyle)
          case (_, true)      => None
        }
        l.foreach(l => addCellToWorksheet(ws, index + startingIndex, 0, l.name, style))
        r.foreach(r => addCellToWorksheet(ws, index + startingIndex, 1, r.name, style))
    }

    if (addReasonColumn) {
      val colCount = startingIndex + columns.size
      addCellToWorksheet(ws, colCount, 0, "Reason", Option(explainedColCellStyle))
      addCellToWorksheet(ws, colCount, 1, "Reason", Option(explainedColCellStyle))
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
