package com.ms.qaTools.io.rowSource.file
import com.ms.qaTools.AnyUtil
import com.ms.qaTools.generated.fixedWidth.FixedWidthConfig
import com.ms.qaTools.io.rowSource.AdapterColumnDefinitions
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.io.rowSource.ColumnDefinitionAdapter
import com.ms.qaTools.io.rowSource.delimited.DelimitedParser
import com.ms.qaTools.io.rowSource.delimited.FixedWidthParser
import com.ms.qaTools.io.rowSource.delimited.Parser
import com.ms.qaTools.io.rowSource.internal.FixedWidthDeserializer
import com.ms.qaTools.io.rowSource.Resizable
import com.ms.qaTools.io.rowSource.SimpleColumnDefinitionAdapter
import com.ms.qaTools.io.rowSource.StreamingColumnDefinitionAdapter
import com.ms.qaTools.io.rowWriter.CsvRowWriter
import java.io.BufferedReader
import java.io.PushbackReader
import java.io.Reader
import java.io.StringWriter
import org.w3c.dom.Document
import scala.collection.AbstractIterator
import scala.slick.util.CloseableIterator
import scala.util.Try

class DelimitedIterator(csvReader: Parser) extends AbstractIterator[Seq[String]] with CloseableIterator[Seq[String]] {
  private def getRow: Option[Seq[String]] =
    Option(csvReader.readNext).map(_.map(_.orNull)) // TODO bury null's deeper, they're dangerous

  private[this] var currentRow = getRow
  def next = currentRow.getOrElse(Iterator.empty.next).withSideEffect(_ => currentRow = getRow)
  def hasNext = currentRow.nonEmpty
  def close() = csvReader.close()
}

class DelimitedRowSource(csvReader: Parser, val columnDefinitionAdapter: ColumnDefinitionAdapter)
extends DelimitedIterator(csvReader) with AdapterColumnDefinitions with Resizable[String] {
  columnDefinitionAdapter.extractColDefs(this)
  override def next = resize(super.next, colDefs)
}

class CsvRowSource(csvReader: DelimitedParser, columnDefinitionAdapter: ColumnDefinitionAdapter)
extends DelimitedRowSource(csvReader, columnDefinitionAdapter)

class TsvRowSource(csvReader: DelimitedParser, columnDefinitionAdapter: ColumnDefinitionAdapter)
extends DelimitedRowSource(csvReader, columnDefinitionAdapter)

class PsvRowSource(csvReader: DelimitedParser, columnDefinitionAdapter: ColumnDefinitionAdapter)
extends DelimitedRowSource(csvReader, columnDefinitionAdapter)

class FixedWidthRowSource(reader: FixedWidthParser, columnDefinitionAdapter: ColumnDefinitionAdapter)
extends DelimitedRowSource(reader, columnDefinitionAdapter) with AdapterColumnDefinitions

/*
 * DATA is the legacy file format for privateIdao
 * Nulls are marked with NULL (for databases) and no values means an empty string
 * The last column is the name of the data set
 */
class DataRowSource(csvReader: DelimitedParser, nullIdentifier: String, columnDefinitionAdapter: ColumnDefinitionAdapter)
  extends CsvRowSource(csvReader, columnDefinitionAdapter) {
  // col defs might be null if using a streaming col def adapter
  def name = Option(columnDefinitionAdapter.colDefs).map(_.last).getOrElse(null)
  override def colDefs = Option(columnDefinitionAdapter.colDefs).map(_.dropRight(1)).getOrElse(null)
  override def next = {
    val row = super.next
    row.map(c => {
      if (c == nullIdentifier) null
      else if (c == null) ""
      else c
    })
  }
}

object DelimitedIterator {
  def apply(reader: Reader,
            separator: Char = DelimitedParser.DEFAULT_SEPARATOR,
            quotechar: Option[Char] = Some(DelimitedParser.DEFAULT_QUOTE_CHARACTER),
            escape: Option[Char] = Some(DelimitedParser.DEFAULT_ESCAPE_CHARACTER),
            line: Int = DelimitedParser.DEFAULT_SKIP_LINES): DelimitedIterator = {
    val csvReader = DelimitedParser(reader, separator = separator.toString, quoteChar = quotechar, escapeChar = escape)
    new DelimitedIterator(csvReader)
  }
}

trait StreamingColumnDefinitionAdapterCreator {
  def createIndexColDefAdapter(reader: Reader, separator: String, quoteChar: Option[Char], escape: Option[Char], line: Int): (Reader, ColumnDefinitionAdapter) = {
    val parser = DelimitedParser(reader, separator = separator, quoteChar = quoteChar, escapeChar = escape, bufSize = 1)
    val firstRow = parser.readNext
    val w = new StringWriter()
    CsvRowWriter(w, separator = separator.head, quoteChar = quoteChar.getOrElse('\u0000'), escapeChar = escape.getOrElse('\u0000')).write(Iterator.single(firstRow.map {_.map {_.toString}.orNull}))
    val rewrittenFirstRowCharArray = w.toString.toCharArray
    val pb = new PushbackReader(reader, rewrittenFirstRowCharArray.size)
    pb.unread(rewrittenFirstRowCharArray)
    (pb, ColumnDefinitionAdapter(firstRow.flatten.size, line))
  }

  def createColDefAdapterFromColDefs(colDefs: Seq[ColumnDefinition], skipRows: Int) =
    new SimpleColumnDefinitionAdapter(colDefs, skipRows)

  def createStreamingColDefAdapter(multiPartColNameSep: String, colNameRows: Int, skipRows: Int, transformColDefs: Seq[ColumnDefinition] => Seq[ColumnDefinition]) =
    StreamingColumnDefinitionAdapter(colNameRows = colNameRows, multiPartColNameSep = multiPartColNameSep, skipRows = skipRows, transformColDefs = transformColDefs)
}

object CustomDelimitedRowSource extends StreamingColumnDefinitionAdapterCreator {
  def apply(reader: Reader,
            cellSeparator: String,
            rowSeparator: String,
            quotechar: Option[Char] = Some(DelimitedParser.DEFAULT_QUOTE_CHARACTER),
            escape: Option[Char] = Some(DelimitedParser.DEFAULT_ESCAPE_CHARACTER),
            line: Int = DelimitedParser.DEFAULT_SKIP_LINES,
            multiPartColNameSep: String = ".",
            colNameRows: Int = 1,
            headerless: Boolean = false,
            columns: Seq[ColumnDefinition] = Seq(),
            transformColDefs: Seq[ColumnDefinition] => Seq[ColumnDefinition] = identity[Seq[ColumnDefinition]]): DelimitedRowSource = {
    val (r, c) =
      if (headerless)
        createIndexColDefAdapter(reader, cellSeparator, quotechar, escape, line)
      else if (!columns.isEmpty)
        (reader, createColDefAdapterFromColDefs(columns, line))
      else
        (reader, createStreamingColDefAdapter(multiPartColNameSep, colNameRows, line, transformColDefs))
    val parser = DelimitedParser(r, separator = cellSeparator, newline = rowSeparator, quoteChar = quotechar, escapeChar = escape)
    new DelimitedRowSource(parser, c)
  }
}

object CsvRowSource extends StreamingColumnDefinitionAdapterCreator {
  def apply(reader: Reader,
            separator: Char = DelimitedParser.DEFAULT_SEPARATOR,
            quotechar: Option[Char] = Some(DelimitedParser.DEFAULT_QUOTE_CHARACTER),
            escape: Option[Char] = Some(DelimitedParser.DEFAULT_ESCAPE_CHARACTER),
            line: Int = DelimitedParser.DEFAULT_SKIP_LINES,
            multiPartColNameSep: String = ".",
            colNameRows: Int = 1,
            headerless: Boolean = false,
            columns: Seq[ColumnDefinition] = Seq(),
            transformColDefs: Seq[ColumnDefinition] => Seq[ColumnDefinition] = identity[Seq[ColumnDefinition]]): CsvRowSource = {
    val (r, c) =
      if (headerless)
        createIndexColDefAdapter(reader, separator.toString, quotechar, escape, line)
      else if (!columns.isEmpty)
        (reader, createColDefAdapterFromColDefs(columns, line))
      else
        (reader, createStreamingColDefAdapter(multiPartColNameSep, colNameRows, line, transformColDefs))
    val csvReader = DelimitedParser(r, separator = separator.toString, quoteChar = quotechar, escapeChar = escape)
    new CsvRowSource(csvReader, c)
  }
}

object TsvRowSource extends StreamingColumnDefinitionAdapterCreator {
  def apply(reader: Reader,
            separator: Char = '\t',
            quotechar: Option[Char] = Some(DelimitedParser.DEFAULT_QUOTE_CHARACTER),
            escape: Option[Char] = Some(DelimitedParser.DEFAULT_ESCAPE_CHARACTER),
            line: Int = DelimitedParser.DEFAULT_SKIP_LINES,
            multiPartColNameSep: String = ".",
            colNameRows: Int = 1,
            headerless: Boolean = false,
            columns: Seq[ColumnDefinition] = Seq(),
            transformColDefs: Seq[ColumnDefinition] => Seq[ColumnDefinition] = identity[Seq[ColumnDefinition]]): TsvRowSource = {
    val (r, c) =
      if (headerless)
        createIndexColDefAdapter(reader, separator.toString, quotechar, escape, line)
      else if (!columns.isEmpty)
        (reader, createColDefAdapterFromColDefs(columns, line))
      else
        (reader, createStreamingColDefAdapter(multiPartColNameSep, colNameRows, line, transformColDefs))
    val csvReader = DelimitedParser(r, separator = separator.toString, quoteChar = quotechar, escapeChar = escape)
    new TsvRowSource(csvReader, c)
  }
}

object PsvRowSource extends StreamingColumnDefinitionAdapterCreator {
  def apply(reader: Reader,
            separator: Char = '|',
            quotechar: Option[Char] = Some(DelimitedParser.DEFAULT_QUOTE_CHARACTER),
            escape: Option[Char] = Some(DelimitedParser.DEFAULT_ESCAPE_CHARACTER),
            line: Int = DelimitedParser.DEFAULT_SKIP_LINES,
            multiPartColNameSep: String = ".",
            colNameRows: Int = 1,
            headerless: Boolean = false,
            columns: Seq[ColumnDefinition] = Seq(),
            transformColDefs: Seq[ColumnDefinition] => Seq[ColumnDefinition] = identity[Seq[ColumnDefinition]]): PsvRowSource = {
    val (r, c) =
      if (headerless)
        createIndexColDefAdapter(reader, separator.toString, quotechar, escape, line)
      else if (!columns.isEmpty)
        (reader, createColDefAdapterFromColDefs(columns, line))
      else
        (reader, createStreamingColDefAdapter(multiPartColNameSep, colNameRows, line, transformColDefs))
    val csvReader = DelimitedParser(r, separator = separator.toString, quoteChar = quotechar, escapeChar = escape)
    new PsvRowSource(csvReader, c)
  }
}

object DataRowSource extends StreamingColumnDefinitionAdapterCreator {
  def apply(reader: Reader,
            separator: Char = DelimitedParser.DEFAULT_SEPARATOR,
            quotechar: Option[Char] = Some(DelimitedParser.DEFAULT_QUOTE_CHARACTER),
            escape: Option[Char] = Some(DelimitedParser.DEFAULT_ESCAPE_CHARACTER),
            line: Int = DelimitedParser.DEFAULT_SKIP_LINES,
            nullIdentifier: String = "NULL",
            multiPartColNameSep: String = ".",
            colNameRows: Int = 1,
            headerless: Boolean = false,
            columns: Seq[ColumnDefinition] = Seq(),
            transformColDefs: Seq[ColumnDefinition] => Seq[ColumnDefinition] = identity[Seq[ColumnDefinition]]): DataRowSource = {
    val (r, c) =
      if (headerless)
        createIndexColDefAdapter(reader, separator.toString, quotechar, escape, line)
      else if (!columns.isEmpty)
        (reader, createColDefAdapterFromColDefs(columns, line))
      else
        (reader, createStreamingColDefAdapter(multiPartColNameSep, colNameRows, line, transformColDefs))
    val csvReader = DelimitedParser(r, separator = separator.toString, quoteChar = quotechar, escapeChar = escape)
    new DataRowSource(csvReader, nullIdentifier, c)
  }
}

object FixedWidthRowSource {
  def apply(reader: Reader, config: FixedWidthConfig, line: Int = 0): FixedWidthRowSource = {
    val colDefs    = FixedWidthDeserializer.extractAllColDefs(config)
    val columnDefs = FixedWidthDeserializer.createColumnDefinitions(colDefs)
    val parser     = FixedWidthParser(reader, columnDefs, skipLine = line)
    new FixedWidthRowSource(parser, new ColumnDefinitionAdapter {
      def colDefs = columnDefs
      def extractColDefs[X <% Seq[String]](rowIterator: Iterator[X]) = colDefs
    })
  }

  def apply(reader: Reader, config: Document, line: Int): FixedWidthRowSource =
    FixedWidthRowSource(reader, FixedWidthDeserializer.deserialize(config), line)
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
