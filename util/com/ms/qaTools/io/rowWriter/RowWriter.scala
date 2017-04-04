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
COPYRIGHT NOTICE AND DISCLAIMER
Copyright (c) 2009-2016, Contributor

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License, version 3 for more details.

You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
*/
