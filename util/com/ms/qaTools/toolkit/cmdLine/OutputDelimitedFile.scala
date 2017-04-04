package com.ms.qaTools.toolkit.cmdLine

import java.io.FileWriter
import java.util.{List => JList}
import scala.collection.JavaConversions._
import org.kohsuke.args4j.{Option => Args4JOption}
import org.kohsuke.args4j.spi.StringArrayOptionHandler
import au.com.bytecode.opencsv.CSVWriter
import com.ms.qaTools.io.rowWriter.DsRowWriterCreator
import com.ms.qaTools.io.rowWriter.file.HtmlTableRowWriter



trait OutputDelimitedFile {
  @Args4JOption(name  = "--outFmt",
                usage = "specify output format: CSV (default) | EXCEL | XLS | XLSX | TSV | PSV | DATA | CUSTOM | HTML-TABLE")
  val outFmt: String = "CSV"

  @Args4JOption(name = "-o", aliases = Array("--outFileName"), usage = "specify an output fileName", required = true)
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
  
  @Args4JOption(name = "--outAppend", usage = "Append to the file")
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

  def delimitedRowWriter = outFmt.toUpperCase match {
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

  def htmlTableRowWriter = {
    val default = HtmlTableRowWriter.Config()
    val style = Option(outHtmlTableStyle).getOrElse(default.style)
    val htmlCols = Option(outHtmlTableHtmlColumns).map(_.map(_.toInt).toSet).getOrElse(default.htmlColumns)
    val config = HtmlTableRowWriter.Config(caption = Option(outHtmlTableCaption), style = style, htmlColumns = htmlCols)
    HtmlTableRowWriter(new FileWriter(outFileName), config)
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
