package com.ms.qaTools.io.rowWriter

import java.io.File
import java.io.FileWriter
import java.io.RandomAccessFile

import com.ms.qaTools.io.Writer
import com.ms.qaTools.io.rowWriter.file.CsvRowWriter
import com.ms.qaTools.io.rowWriter.file.ExcelRowWriter
import com.ms.qaTools.io.rowWriter.file.PsvRowWriter
import com.ms.qaTools.io.rowWriter.file.TsvRowWriter

import au.com.bytecode.opencsv.CSVWriter

trait RowWriterCreator[T] {
  def createRowWriter(fmt: String): T
}

case class DsRowWriterCreator(fileName: String,
  wsName: Option[String] = None,
  separatorChar: Char = CSVWriter.DEFAULT_SEPARATOR,
  quoteChar: Char = CSVWriter.DEFAULT_QUOTE_CHARACTER,
  escapeChar: Char = CSVWriter.DEFAULT_ESCAPE_CHARACTER,
  lineEnd: String = CSVWriter.DEFAULT_LINE_END,
  append: Boolean = false,
  withColNames: Boolean = true,
  nullMarker: String = null)
extends RowWriterCreator[Writer[Iterator[Seq[String]]]] {
  def createFileWriter(fileName: String, append: Boolean) = {
    if (append) {
      val f = new RandomAccessFile(fileName, "rw")
      try {
        val flen = f.length
        val bs = lineEnd.getBytes
        val pos = flen - bs.length
        if (pos >= 0) {
          val buf = Array.ofDim[Byte](bs.length)
          f.seek(pos)
          f.readFully(buf)
          if (buf.toSeq != bs.toSeq) f.write(bs)
        } else if (flen > 0) {
          f.seek(flen)
          f.write(bs)
        }
      } finally f.close()
    }
    new FileWriter(fileName, append)
  }

  def createRowWriter(fmt: String) = fmt.toUpperCase match {
    case "CSV" =>
      CsvRowWriter(writer = createFileWriter(fileName, append), lineEnd = lineEnd, outputColNames = withColNames, nullMarker = nullMarker)
    case ("EXCEL"|"XLSX") =>
      ExcelRowWriter(fileName, wsName.getOrElse("Sheet1"), true, !append, append, withColNames, nullMarker)
    case "XLS" =>
      ExcelRowWriter(fileName, wsName.getOrElse("Sheet1"), false, !append, append, withColNames, nullMarker)
    case "TSV" =>
      TsvRowWriter(writer = createFileWriter(fileName, append), outputColNames = withColNames, nullMarker = nullMarker)
    case "PSV" =>
      PsvRowWriter(writer = createFileWriter(fileName, append), outputColNames = withColNames, nullMarker = nullMarker)
    case "CUSTOM" =>
      CsvRowWriter(writer = createFileWriter(fileName, append), separator = separatorChar, quoteChar = quoteChar, escapeChar = escapeChar, outputColNames = withColNames, nullMarker = nullMarker)
    case _ =>
      throw new Exception("Could not create dataset row source for format: " + fmt)
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
