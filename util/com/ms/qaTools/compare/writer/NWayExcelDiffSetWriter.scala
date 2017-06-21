package com.ms.qaTools.compare.writer

import scala.collection.mutable.UnrolledBuffer

import org.apache.poi.ss.usermodel.Sheet

import com.ms.qaTools.compare._
import com.ms.qaTools.io.rowSource.file.ExcelWorkBook

class NWayExcelDiffSetWriter(workbook: ExcelWorkBook,
                             colDefs: Seq[NWayCompareColDef],
                             pageNames: Map[Page, String],
                             sourceNames: Seq[String])
extends AExcelDiffSetWriter[AbstractDiff, DiffCounter](workbook, pageNames) {
  lazy val sourceNamesWithIndex: IndexedSeq[(String, Int)] = sourceNames.zipWithIndex.toIndexedSeq
  val sourceCount = sourceNames.length
  require(colDefs.forall(_.count == sourceCount), colDefs)

  def writeSourceNames(sheet: Sheet, rowIdx: Int): Unit =
    for ((name, j) <- sourceNamesWithIndex) addCellToWorksheet(sheet, 0, rowIdx + j, name, Some(sourceNameCellStyle))

  def addHeaderToPage(page: Page) = page match {
    case IdenticalPage | DifferencesPage | ExplainedPage => withSheetAndLastRowIdx(page, sourceCount) { (sheet, rowIdx) =>
      writeSourceNames(sheet, rowIdx)
      colDefWithIndices.foreach {
        case (c: NWayCompareColDefMatching, i) =>
          val style = if (c.keyOrder.isEmpty) matchedColCellStyle else keyColCellStyle
          for (((name, _), j) <- c.nameAndIndices.zipWithIndex)
            addCellToWorksheet(sheet, i, rowIdx + j, name, Some(style))
        case (c: NWayCompareColDefIgnored, i) =>
          c.nameAndIndexOptions.zipWithIndex.foreach {
            case (Some((name, _)), j) => addCellToWorksheet(sheet, i, rowIdx + j, name)
            case _                    =>
          }
      }
    }
    case _ =>
  }

  lazy val colDefWithIndices: Seq[(NWayCompareColDef, Int)] = {
    val key     = UnrolledBuffer.empty[NWayCompareColDefMatching]
    val matched = UnrolledBuffer.empty[NWayCompareColDef]
    val ignored = UnrolledBuffer.empty[NWayCompareColDef]
    colDefs.seq.foreach {
      case c: NWayCompareColDefMatching => if (c.keyOrder.isEmpty) matched += c else key += c
      case c: NWayCompareColDefIgnored  => ignored += c
    }
    val sortedKey = key.sortBy(_.keyOrder).map(c => c: NWayCompareColDef)
    ((sortedKey concat matched concat ignored), Stream.from(1)).zipped.toSeq
  }

  lazy val sourceNameCellStyle = {
    val cs = workbook.createCellStyle
    cs.setFont(getCellFont(bold = true))
    cs
  }

  def createExtraSheets = true

  def writeSummary(counter: DiffCounter) = throw new UnsupportedOperationException

  def writeSummary(counter: NWayRowComparator.ICounter): Unit = {
    require(counter.sources.length == sourceCount)
    withSheetAndLastRowIdx(SummaryPage) { (sheet, rowIdx) =>
      ; {
        val pgNames = PageNames() ++ pageNames
        (sourceNames, counter.sources).zipped.map((k, v) => Seq(k, v.toString)) ++
        Seq(Seq(pgNames(DifferencesPage), counter.different.toString),
            Seq(pgNames(ExplainedPage), counter.explained.toString),
            Seq(pgNames(IdenticalPage), counter.identical.toString))
      }.zipWithIndex.foreach {
        case (cells, j) => writeTupleToCells(sheet, 0, rowIdx + j, cells)
      }
      if (counter.explainedRecords.nonEmpty) {
        addCellToWorksheet(sheet, 0, sheet.getLastRowNum + 2, "Explained Records")
        writeTupleToCells(sheet, 0, sheet.getLastRowNum + 1, Seq("Explanation", "Count"))
        for ((e, c) <- counter.explainedRecords)
          writeTupleToCells(sheet, 0, sheet.getLastRowNum + 1, Seq(e, c.toString))
      }
      if (counter.explainedFields.nonEmpty) {
        addCellToWorksheet(sheet, 0, sheet.getLastRowNum + 2, "Explained Fields")
        writeTupleToCells(sheet, 0, sheet.getLastRowNum + 1, Seq("Field", "Explanation", "Count"))
        for ((f, v) <- counter.explainedFields; (e, c) <- v)
          writeTupleToCells(sheet, 0, sheet.getLastRowNum + 1, Seq(f.nameAndIndices.head._1, e, c.toString))
      }
      if (counter.differentFields.nonEmpty) {
        addCellToWorksheet(sheet, 0, sheet.getLastRowNum + 2, "Differences")
        writeTupleToCells(sheet, 0, sheet.getLastRowNum + 1, Seq("Field", "Count"))
        for ((f, c) <- counter.differentFields)
          writeTupleToCells(sheet, 0, sheet.getLastRowNum + 1, Seq(f.nameAndIndices.head._1, c.toString))
      }
    }
  }

  def writeDelimitedNWayDiff(sheet: Sheet, rowIdx: Int, diff: DelimitedNWayDiff): Unit = {
    writeSourceNames(sheet, rowIdx)
    for ((c, i) <- colDefWithIndices; (j, ii) <- c.cellIndices) {
      val cell = diff.data(j)(ii)
      cell.contentOption.foreach { s =>
        val style = c match {
          case c: NWayCompareColDefMatching if cell.isDiff =>
            diff.explainedColumns.get(c) match {
              case Some(e) =>
                val style = Some(explainedCellStyle)
                addCellToWorksheet(sheet, i, rowIdx + sourceCount, e, style)
                style
              case None =>
                Some(differenceCellStyle)
            }
          case _ =>
            None
        }
        addCellToWorksheet(sheet, i, rowIdx + j, s, style)
      }
    }
    diff.explanation.foreach {
      addCellToWorksheet(sheet, colDefWithIndices.last._2 + 1, rowIdx, _, Some(explainedCellStyle))
    }
  }

  def writeDiff(diff: AbstractDiff) = diff match {
    case diff: DelimitedNWayDiff =>
      val page = if (diff.diffCols.isEmpty) IdenticalPage else if (diff.isExplained) ExplainedPage else DifferencesPage
      withSheetAndLastRowIdx(page, sourceCount + 2)((sheet, rowIdx) => writeDelimitedNWayDiff(sheet, rowIdx + 2, diff))
    case _ =>
      throw new IllegalArgumentException(diff.toString)
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
