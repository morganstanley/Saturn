package com.ms.qaTools.toolkit.cmdLine

import java.io.FileWriter
import java.util.{List => JList}

import scala.collection.JavaConversions._

import org.kohsuke.args4j.{Option => Args4JOption}
import org.kohsuke.args4j.spi.StringArrayOptionHandler

import com.ms.qaTools.Injector
import com.ms.qaTools.io.Writer
import com.ms.qaTools.io.rowSource.DatabaseConnection
import com.ms.qaTools.io.rowWriter.DsRowWriterCreator
import com.ms.qaTools.io.rowWriter.HtmlTableRowWriter
import com.ms.qaTools.io.rowWriter.JdbcRowWriter
import com.ms.qaTools.toolkit.DbConnectionFactory

import au.com.bytecode.opencsv.CSVWriter

trait OutputDelimitedFile {
  @Args4JOption(name  = "--outFmt",
                usage = "specify output format: CSV (default) | EXCEL | XLS | XLSX | TSV | PSV | DATA | CUSTOM | HTML-TABLE")
  val outFmt: String = "CSV"

  @Args4JOption(name = "-o", aliases = Array("--outFileName", "--outDbTableName"),
                usage = "specify an output file name or DB table name. Defaults to standard output")
  val outFileName: String = null

  @Args4JOption(name = "--outWsName", usage = "specify the output worksheet name")
  val outWsName: String = "Sheet1"

  @Args4JOption(name = "--outSeparatorChar", usage = "specify the field separator character. (default: ',')")
  val outSeparatorChar: Char = CSVWriter.DEFAULT_SEPARATOR

  @Args4JOption(name = "--outQuoteChar", usage = "specify the quote character (default: '\"')")
  val outQuoteChar: Char = CSVWriter.DEFAULT_QUOTE_CHARACTER

  @Args4JOption(name = "--outEscapeChar", usage = "specify the escape character (default: '\"')")
  val outEscapeChar: Char = CSVWriter.DEFAULT_ESCAPE_CHARACTER

  @Args4JOption(name = "--outLineEndChar", usage = "specify the quote character (default: \"\\n\")")
  val outLineEndChar: String = CSVWriter.DEFAULT_LINE_END

  @Args4JOption(name = "--outAppend", usage = "Append to the file/table")
  val outAppend: Boolean = false

  @Args4JOption(name = "--outNoHeader", usage = "whether to prefix the output with a column header row")
  val outNoHeader: Boolean = false

  @Args4JOption(name = "--outNullMarker", usage = "map null value to the string specified")
  val outNullMarker: String = null

  @Args4JOption(name = "--outHtmlTableStyle", usage = "custom CSS style to be used in HTML table output")
  val outHtmlTableStyle: String = null

  @Args4JOption(name = "--outHtmlTableCaption", usage = "HTML table output caption")
  val outHtmlTableCaption: String = null

  @Args4JOption(name    = "--outHtmlTableHtmlColumns",
                usage   = "column indices (starting from 0) that contain raw HTML",
                handler = classOf[StringArrayOptionHandler])
  val outHtmlTableHtmlColumns: JList[String] = null

  @Args4JOption(name = "--outDbServer")
  val outDbServer: String = null

  @Args4JOption(name = "--outDbQualifier")
  val outDbQualifier: String = null

  @Args4JOption(name = "--outDbLogin")
  val outDbLogin: String = null

  @Args4JOption(name = "--outDbPasswd")
  val outDbPasswd: String = null

  def delimitedRowWriter: Writer[Iterator[Seq[String]]] = {
    dbConnection match {
      case Some(conn) => dbTableRowWriter(conn)
      case None => outFmt.toUpperCase match {
        case "HTML-TABLE" =>
          htmlTableRowWriter
        case _ =>
          val rowWriterCreator = DsRowWriterCreator(outFileName,
                                                    Option(outWsName),
                                                    outSeparatorChar,
                                                    outQuoteChar,
                                                    outEscapeChar,
                                                    outLineEndChar,
                                                    outAppend,
                                                    withColNames = !outNoHeader,
                                                    nullMarker = outNullMarker)
          rowWriterCreator.createRowWriter(outFmt)
      }
    }
  }

  def htmlTableRowWriter = {
    val default = HtmlTableRowWriter.Config()
    val style = Option(outHtmlTableStyle).getOrElse(default.style)
    val htmlCols = Option(outHtmlTableHtmlColumns).map(_.map(_.toInt).toSet).getOrElse(default.htmlColumns)
    val config = HtmlTableRowWriter.Config(caption = Option(outHtmlTableCaption), style = style, htmlColumns = htmlCols)
    HtmlTableRowWriter(new FileWriter(outFileName), config)
  }

  def dbTableRowWriter(conn: DatabaseConnection): Writer[Iterator[Seq[String]]] = {
    if (!outAppend && conn.hasTable(outFileName)) conn.clear(outFileName)
    new JdbcRowWriter(conn, outFileName, createTable = true) {
      override def close() = {
        super.close()
        conn.close()
      }
    }
  }

  def dbConnection: Option[DatabaseConnection] = {
    val dbType = outFmt.toUpperCase
    val factory = Injector.getInstance[DbConnectionFactory]
    if (factory.support(dbType)) Some(factory.create(dbType, outDbServer, outDbQualifier, outDbLogin, outDbPasswd)) else None
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
