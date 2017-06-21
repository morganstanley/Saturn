package com.ms.qaTools.toolkit.dsConvert

import java.io.File
import java.io.FileInputStream

import scala.collection.JavaConversions._
import scala.util.Try

import org.apache.poi.ss.usermodel.WorkbookFactory

import com.ms.qaTools._
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.io.rowSource.DsRowSourceCreator
import com.ms.qaTools.io.rowSource.SortedSeqRowSource
import com.ms.qaTools.io.rowWriter.JdbcRowWriter
import com.ms.qaTools.toolkit.ToolkitApp

/*
 *
 *     FORMATs:
 *
 *      CSV(default)  Comma separated values, nulls represented as '', empty string represented as '""'
 *      DATA          Comma separated values, first row contains dataset name, nulls represented as 'NULL'
 *      FIXED         Fixed width fields, no nulls
 *      PSV           Pipe separated values, nulls represented as 'null'
 *      TSV           Tab separated values, nulls represented as 'null'
 *      EXCEL         Microsoft Excel file
 *      OOCALC        OpenOffice Spreadsheet file
 *      JSON          Javascript object notation
 *      DB2           Data from a DB2 database
 *      UDB           Data from a UDB database
 *      SYBASE        Data from a Sybase database
 *      SQLITE        Data from a SQLite database
 *      ORACLE        Data from a Oracle database
 *
 *      TODO:
 *      Validation of command line arguments
 *      --colNameRow=ROW_NUM    Numbers of the rows to be used as column names (default firstRow-1)
 *      --fixedConfig           Fixed width column definition file name *see Fixed Width Configuration File
 *      --inDBLogin             Database login
 *      --inDBServer            Database server
 *      --inDBQualifier         Database qualifier
 *      --inDBName              Database name (Sybase)
 *      --inDBSchema            Database schema (Oracle)
 *      --inDBQuery             Database query executed to get input data set
 *      --inKerberized          Set Kerberos connection
 *      --outDBLogin             Database login
 *      --outDBServer            Database server
 *      --outDBQualifier         Database qualifier
 *      --outDBName              Database name (Sybase)
 *      --outDBSchema            Database schema (Oracle)
 *      --outDBTable             Database table to output data

 *      --outKerberized          Set Kerberos connection
 */

object DsConvertApp extends ToolkitApp[DsConvertResult] {
  val APP_NAME = "DsConvert"

  val cmdLine = new DsConvertCmdLine

  exit(Try {
    parseArguments
    val ignoredCols: Seq[String] = if (cmdLine.ignoreCols == null) Seq() else cmdLine.ignoreCols

    if(cmdLine.inFileNames != null) {
      require(cmdLine.outWsNames != null)
      require(cmdLine.inFileNames.size == cmdLine.outWsNames.size)
      val inputs = cmdLine.inFileNames.map{DsRowSourceCreator(_).createRowSource(cmdLine.inFmt)}.zip(cmdLine.outWsNames)
      DsConvert(inputs, cmdLine.outFileName)
    } else if (Set("EXCEL", "XLS", "XLSX").contains(cmdLine.inFmt.toUpperCase) && cmdLine.inWsName == null) {
      val conn = cmdLine.dbConnection.getOrElse(throw new RuntimeException("cannot create DB connection for " + cmdLine.outFmt))
      Try {
        try {
          DsConvert(new File(cmdLine.inFileName), conn, cmdLine.outAppend)
        } finally conn.close()
      }
    } else {
      val source =
        if (cmdLine.listWsNames) {
          val excelWorkBook = WorkbookFactory.create(Option(new FileInputStream(cmdLine.inFileName)).getOrElse(System.in))
          val sheetNames = (0 until excelWorkBook.getNumberOfSheets).map(excelWorkBook.getSheetAt(_).getSheetName)
          new SortedSeqRowSource(sheetNames.map(ws => Seq(ws)).toIterator, ColumnDefinition.fromColumnNames(Seq("WS_NAME")))
        } else
          cmdLine.inFmt.toUpperCase match {
            case "CSV" | "PSV" | "DATA" | "TSV" | "EXCEL" | "XLS" | "XLSX" | "CUSTOM" => cmdLine.inRowSource
            case "UDB" | "DB2" => cmdLine.inDatabaseRowSource(cmdLine.inFmt)
          }
      val result = withCloseable(cmdLine.delimitedRowWriter) { writer =>
        DsConvert(source, writer, ignoredCols, !cmdLine.outAppend && !writer.isInstanceOf[JdbcRowWriter]).run
      }
      closeAny(source)
      result
    }
  }.flatten)
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
