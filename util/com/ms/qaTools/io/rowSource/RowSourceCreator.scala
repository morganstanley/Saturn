package com.ms.qaTools.io.rowSource

import java.io.Reader
import java.io.{File => JFile}
import com.ms.qaTools.io.rowSource.file.CsvRowSource
import java.io.BufferedReader
import java.io.StringReader
import java.io.FileReader
import file.TsvRowSource
import file.PsvRowSource
import file.ExcelRowSource
import file.DataRowSource
import com.ms.qaTools.conversions.JavaIOConversions._
import com.ms.qaTools.io.rowSource.delimited.DelimitedParser
import com.ms.qaTools.conversions.JavaIOConversions._
import com.ms.qaTools.io.rowSource.file.ExcelWorkBook
import com.ms.qaTools.io.rowSource.file.ExcelCellRowSource
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
extends RowSourceCreator[Iterator[Seq[String]] with ColumnDefinitions] {
  def createRowSource(fmt: String): Iterator[Seq[String]] with ColumnDefinitions = {
    val input = Option(fileName).map { new FileReader(_) }.getOrElse(Console.in)
    fmt match {
      case "CSV" =>
        CsvRowSource(reader = input,
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
        ExcelRowSource(Option(fileName).getOrElse(throw new Exception("No file name provided for format: " + fmt)),
                wsName.getOrElse("Sheet1"),
                firstRow = firstRow,
                colNameRows = colNameRows,
                headerless = headerless,
                columns = columns,
                multiPartColNameSep = multiPartColNameSeparator,
                transformColDefs = transformColDefs)
      case "DATA" =>
        DataRowSource(input,
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
        TsvRowSource(input,
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
        PsvRowSource(input,
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
        CsvRowSource(input,
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
