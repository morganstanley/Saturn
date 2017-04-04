package com.ms.qaTools.io.rowSource

import java.io.Reader
import java.io.{File => JFile}
import com.ms.qaTools.io.rowSource.file.CsvRowSource
import java.io.StringReader
import java.io.FileReader
import file.TsvRowSource
import file.PsvRowSource
import file.ExcelRowSource
import file.DataRowSource
import com.ms.qaTools.io.SortedDelimitedIterator
import com.ms.qaTools.conversions.JavaIOConversions._
import com.ms.qaTools.io.rowSource.delimited.DelimitedParser
import com.ms.qaTools.conversions.JavaIOConversions._
import com.ms.qaTools.io.rowSource.file.ExcelWorkBook
import com.ms.qaTools.io.rowSource.file.ExcelCellRowSource
import com.ms.qaTools.io._
import com.ms.qaTools.io.rowSource.ExternalSort._
import com.ms.qaTools.io.rowSource.delimited.DelimitedParser



trait RowSourceCreator[RowSourceType] {
  def createRowSource(fmt: String): RowSourceType
}

case class DsRowSourceCreator(fileName: String,
                              wsName: Option[String] = None,
                              firstRow: Int = DelimitedParser.DEFAULT_SKIP_LINES,
                              separatorChar: Char = DelimitedParser.DEFAULT_SEPARATOR, 
                              quoteChar: Char = DelimitedParser.DEFAULT_QUOTE_CHARACTER, 
                              escapeChar: Char = DelimitedParser.DEFAULT_ESCAPE_CHARACTER,
                              multiPartColNameSeparator: String = ".",
                              colNameRows: Int = 1,
                              headerless: Boolean = false,
                              columns: Seq[ColumnDefinition] = Nil,
                              transformColDefs: (Seq[ColumnDefinition]) => Seq[ColumnDefinition] = identity[Seq[ColumnDefinition]])
extends RowSourceCreator[Iterator[DelimitedRow] with ColumnDefinitions] {
 
  def createRowSource(fmt: String): Iterator[DelimitedRow] with ColumnDefinitions = fmt match {
    case "CSV" => 
      CsvRowSource(reader = fileName, 
          			line = firstRow, 
          			separator = separatorChar, 
          			quotechar = Some(quoteChar), 
          			escape = Some(escapeChar), 
          			colNameRows = colNameRows, 
          			headerless = headerless,
          			columns = columns,
          			multiPartColNameSep = multiPartColNameSeparator,
          			transformColDefs = transformColDefs)
    case "EXCEL"|"XLS"|"XLSX" => 
      ExcelRowSource(fileName, 
    		  		wsName.getOrElse("Sheet1"), 
    		  		firstRow = firstRow, 
    		  		colNameRows = colNameRows, 
    		  		headerless = headerless,
    		  		columns = columns,
    		  		multiPartColNameSep = multiPartColNameSeparator,
    		  		transformColDefs = transformColDefs)
    case "DATA" => 
      DataRowSource(fileName, 
    		  		line = firstRow, 
    		  		separator = separatorChar, 
    		  		quotechar = Some(quoteChar), 
    		  		escape = Some(escapeChar), 
    		  		colNameRows = colNameRows, 
    		  		headerless = headerless,
    		  		columns = columns,
    		  		multiPartColNameSep = multiPartColNameSeparator,
    		  		transformColDefs = transformColDefs)
    case "TSV" => 
      TsvRowSource( fileName, 
    		  		line = firstRow, 
    		  		separator = '\t', 
    		  		quotechar = Some(quoteChar), 
    		  		escape = Some(escapeChar), 
    		  		colNameRows = colNameRows, 
    		  		headerless = headerless,
    		  		columns = columns,
    		  		multiPartColNameSep = multiPartColNameSeparator,
    		  		transformColDefs = transformColDefs)
    case "PSV" => 
      PsvRowSource(fileName, 
    		  		line = firstRow, 
    		  		separator = '|', 
    		  		quotechar = Some(quoteChar), 
    		  		escape = Some(escapeChar), 
    		  		colNameRows = colNameRows, 
    		  		headerless = headerless,
    		  		columns = columns,
    		  		multiPartColNameSep = multiPartColNameSeparator,
    		  		transformColDefs = transformColDefs) 
    case "CUSTOM" => 
      CsvRowSource(fileName,
    		  		line = firstRow,
    		  		separator = separatorChar, 
    		  		quotechar = Some(quoteChar), 
    		  		escape = Some(escapeChar), 
    		  		colNameRows = colNameRows,
    		  		columns = columns,
    		  		multiPartColNameSep = multiPartColNameSeparator,
    		  		transformColDefs = transformColDefs)
    case _ => throw new Exception("Could not create dataset row source for format: " + fmt)
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
