package com.ms.qaTools.io.rowWriter.file
import com.ms.qaTools.AnyUtil
import com.ms.qaTools.compare.CompareColDef
import com.ms.qaTools.io.DelimitedRow
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.io.Writer
import com.ms.qaTools.io.StrictCsvWriter
import com.ms.qaTools.io.ColDefAwareWriter
import com.ms.qaTools.io.rowSource.ColumnDefinition
import java.io.{ Writer => JWriter }

class CsvRowWriter(csvWriter: StrictCsvWriter, writeColNames: Boolean) extends ColDefAwareWriter[Iterator[Seq[String]]] {
  override def write(source: Iterator[Seq[String]], colDefs: Option[Seq[ColumnDefinition]]) = {
    (colDefs, source, writeColNames) match {
      case (_, c: ColumnDefinitions, true) =>
        csvWriter.writeNext(c.colNames.toArray, false)
      case (Some(colDefs), _, true) =>
        csvWriter.writeNext(colDefs.flatMap{
          case c: CompareColDef => if (c.isIgnored) None else Some(c.name)
          case c: ColumnDefinition => Some(c.name)
        }.toArray, false)
      case _ => ()
    }

    source.foldLeft(0)((count, row) => {
      csvWriter.writeNext(row.toArray, false)
      if (count % 1024 == 0) csvWriter.flush
      count + 1
    }).withSideEffect(_ => csvWriter.flush)
  }  

  def close() =  csvWriter.close
}

object CsvRowWriter {
  def apply(writer: JWriter,
            separator: Char = ',',
            quoteChar: Char = '"',
            escapeChar: Char = '"',
            lineEnd: String = "\n",
            outputColNames:Boolean = true,
            nullMarker: String = null): CsvRowWriter = {
    val csvWriter = StrictCsvWriter(writer, separator, quoteChar, escapeChar, lineEnd, nullMarker)
    new CsvRowWriter(csvWriter, outputColNames)
  }
}

object DataRowWriter {
  def apply(writer: JWriter,
            separator: Char = ',',
            quoteChar: Char = '"',
            escapeChar: Char = '"',
            lineEnd: String = "\n",
            outputColNames:Boolean = true,
            nullMarker: String = "NULL"): CsvRowWriter = {
    val csvWriter = StrictCsvWriter(writer, separator, quoteChar, escapeChar, lineEnd, nullMarker)
    new CsvRowWriter(csvWriter, outputColNames)
  }
}

object CustomDelimitedRowWriter {
  def apply(writer: JWriter,
            separator: String,
            quoteChar: Char = '"',
            escapeChar: Char = '"',
            lineEnd: String,
            outputColNames: Boolean = true,
            nullMarker: String = null): CsvRowWriter = {
    val csvWriter = StrictCsvWriter(writer, separator, quoteChar, escapeChar, lineEnd, nullMarker)
    new CsvRowWriter(csvWriter, outputColNames)    
  }
}

//class PsvRowWriter(csvWriter: StrictCsvWriter) extends CsvRowWriter(csvWriter)

object PsvRowWriter {
  def apply(writer: JWriter,
            separator: Char = '|',
            quoteChar: Char = '"',
            escapeChar: Char = '"',
            lineEnd: String = "\n",
            outputColNames: Boolean = true,
            nullMarker: String = null): CsvRowWriter =
    CsvRowWriter(writer, separator, quoteChar, escapeChar, lineEnd, outputColNames, nullMarker)
}
//class TsvRowWriter(csvWriter: StrictCsvWriter) extends CsvRowWriter(csvWriter)

object TsvRowWriter {
  def apply(writer: JWriter,
            separator: Char = '\t',
            quoteChar: Char = '"',
            escapeChar: Char = '"',
            lineEnd: String = "\n",
            outputColNames: Boolean = true,
            nullMarker: String = null): CsvRowWriter =
    CsvRowWriter(writer, separator, quoteChar, escapeChar, lineEnd, outputColNames, nullMarker)
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
