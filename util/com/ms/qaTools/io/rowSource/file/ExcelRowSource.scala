package com.ms.qaTools.io.rowSource.file

import java.io.Closeable
import java.io.File
import java.io.FileNotFoundException
import java.io.InputStream
import java.io.OutputStream

import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.openxml4j.opc.OPCPackage
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem
import org.apache.poi.poifs.filesystem.OfficeXmlFileException
import org.apache.poi.ss.usermodel.{ Workbook, Sheet, Cell }
import org.apache.poi.ss.usermodel.WorkbookFactory
import org.apache.poi.ss.util.CellRangeAddress
import org.apache.poi.xssf.streaming.SXSSFWorkbook

import com.ms.qaTools.io.DelimitedRow
import com.ms.qaTools.io.rowSource._
import com.ms.qaTools.io.rowSource.file.xlsx.XSSFXMLStreamRowSource



class HeaderlessExcelCellRowSource(val ws: Sheet) extends Iterator[Seq[Cell]] with ColumnDefinitions {
  require(ws != null)
  
  protected val mergedRegions = for (i <- 0 until ws.getNumMergedRegions()) yield ws.getMergedRegion(i)
  protected var currentRowIdx: Int = 0
  val fromCellRange = new Function2[Cell, CellRangeAddress, Seq[Cell]] {
    def apply(c: Cell, r: CellRangeAddress): Seq[Cell] = {
      if (c.getColumnIndex() == r.getFirstColumn()) {
        val refRangeCell = c.getSheet().getRow(r.getFirstRow()).getCell(r.getFirstColumn())
        for (i <- r.getFirstColumn() to r.getLastColumn()) yield refRangeCell
      }
      else Seq()
    }
  }
  override val colDefs = ColumnDefinitionAdapter(getRow(fromCellRange, 0).size, 0).colDefs

  private def getRow(f: (Cell, CellRangeAddress) => Seq[Cell], rowIdx: Int): Seq[Cell] = {
    val row = ws.getRow(rowIdx)
    Option(row).map { r =>
      val cells = (0 to (r.getLastCellNum - 1)).map(r.getCell(_))
      cells.flatMap {
        cell => Option(cell).flatMap {c => mergedRegions.find {m => m.isInRange(c.getRowIndex(), c.getColumnIndex()) }.map {f(c, _)} }.getOrElse(Seq(cell))
      }
    }.getOrElse(Seq())
  }

  def nextWithCellRangeStrategy(f: (Cell, CellRangeAddress) => Seq[Cell]): Seq[Cell] = {
    if (hasNext) {
      val row = getRow(f, currentRowIdx)
      currentRowIdx += 1
      row
    }
    else
      null
  }

  def next: Seq[Cell] = nextWithCellRangeStrategy(fromCellRange)
  def hasNext = currentRowIdx <= ws.getLastRowNum
}

class ExcelCellRowSource(ws: Sheet, val columnDefinitionAdapter: ColumnDefinitionAdapter)
  extends HeaderlessExcelCellRowSource(ws) with AdapterColumnDefinitions with Resizable[Cell] {

  private sealed class ProxyNullRowRangeIterator(i: HeaderlessExcelCellRowSource) extends Iterator[Seq[Cell]] with Proxy {
    def self = i
    val nullifyRowCellRange = new Function2[Cell, CellRangeAddress, Seq[Cell]] {
      def apply(c: Cell, r: CellRangeAddress): Seq[Cell] = {
        if (c.getColumnIndex() == r.getFirstColumn()) for (i <- r.getFirstColumn() to r.getLastColumn()) yield c
        else Seq()
      }
    }
    override def next: Seq[Cell] = { resize(self.nextWithCellRangeStrategy(nullifyRowCellRange), colDefs) }
    override def hasNext = self.hasNext
  }

  override val colDefs = columnDefinitionAdapter.extractColDefs(new ProxyNullRowRangeIterator(this))
}

class ExcelRowSource(excelIterator: Iterator[DelimitedRow] with ColumnDefinitions)
  extends Iterator[DelimitedRow] with ColumnDefinitions with Resizable[String] {
  def colDefs = excelIterator.colDefs
  def next: Seq[String] = resize(excelIterator.next, colDefs)
  def hasNext = excelIterator.hasNext
}

class ExcelWorkBook(val wb: Workbook, val os: OutputStream, val isXlsx: Boolean) extends Closeable {
  def write = wb.write(os)
  def close = os.close()
}

object ExcelWorkBook {
  def apply() = new HSSFWorkbook()
  def apply(file: File): Workbook = WorkbookFactory.create(file)
  def apply(inputStream: InputStream): Workbook = WorkbookFactory.create(inputStream)
  def apply(outputStream: OutputStream, isXlsx: Boolean = false): ExcelWorkBook =
    if (isXlsx) ExcelXmlWorkBook(outputStream)
    else new ExcelWorkBook(ExcelWorkBook(), outputStream, isXlsx)

  implicit def wtowb(w: ExcelWorkBook): Workbook = w.wb
}

object ExcelXmlWorkBook {
  def apply() = new SXSSFWorkbook()
  def apply(file: File): Workbook = ExcelWorkBook(file)
  def apply(inputStream: InputStream): Workbook = ExcelWorkBook(inputStream)
  def apply(outputStream: OutputStream): ExcelWorkBook = new ExcelWorkBook(ExcelXmlWorkBook(), outputStream, true) {
    override def close = {
      super.close()
      wb.asInstanceOf[SXSSFWorkbook].dispose()
    }
  }
}

object ExcelWorkSheet {
  def apply(wb: Workbook, wsName: String): Sheet = wb.getSheet(wsName)
  def apply(wb: Workbook): Sheet = wb.getSheetAt(0)
}

object ExcelCellRowSource {
  def apply(wb: Workbook, wsName: String, columnDefinitionAdapter: ColumnDefinitionAdapter = StreamingColumnDefinitionAdapter()): ExcelCellRowSource = {
    val ws = if (wsName == null) wb.getSheetAt(0) else wb.getSheet(wsName)
    if (ws == null) throw new Exception("Can't get worksheet")
    new ExcelCellRowSource(ws, columnDefinitionAdapter)
  }
}

object ExcelRowSource {

  def isXlsx(file: File) = {
    if (!file.exists) throw new FileNotFoundException(file.toString())
    try {
      val fs = new NPOIFSFileSystem(file)
      new HSSFWorkbook(fs.getRoot(), true)
      false
    }
    catch {
      case e: OfficeXmlFileException => {
        OPCPackage.open(file)
        true
      }
      case t: Throwable => throw new Exception("Can't check if file: '%s' is an XLSX file.".format(file.getAbsolutePath), t)
    }
  }

  /*
   * No support for InputStream as we would have to buffer the whole file.
   * Using file has less memory usage
   */
  def apply(file: File, wsName: String, colNameRows: Int = 1, firstRow: Int = 0, multiPartColNameSep: String = ".", headerless: Boolean = false, columns: Seq[ColumnDefinition] = Nil, transformColDefs: Seq[ColumnDefinition] => Seq[ColumnDefinition] = identity[Seq[ColumnDefinition]]): ExcelRowSource = {
    def createColDefAdapter = 
      if (! columns.isEmpty)
        new SimpleColumnDefinitionAdapter(columns, firstRow)
      else
        StreamingColumnDefinitionAdapter(colNameRows = colNameRows, multiPartColNameSep = multiPartColNameSep, skipRows = firstRow, transformColDefs = transformColDefs)

    val excelIterator: Iterator[DelimitedRow] with ColumnDefinitions =
      if (isXlsx(file)) XSSFXMLStreamRowSource(file, wsName, createColDefAdapter) else ExcelCellRowSource(ExcelWorkBook(file), wsName, createColDefAdapter)
    new ExcelRowSource(excelIterator)
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
