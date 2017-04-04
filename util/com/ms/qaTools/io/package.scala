package com.ms.qaTools

import java.io.{File => JFile}
import java.io.{FileWriter => JFileWriter}
import java.io.{Writer => JWriter}
import java.util.{List => JList}

import scala.annotation.tailrec
import scala.collection.JavaConversions._
import scala.collection.mutable.ArrayBuffer
import scala.util.Try

import org.apache.http.NameValuePair

import com.ms.qaTools.io.BaseFileIO
import com.ms.qaTools.io.IO3
import com.ms.qaTools.io.Writer
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.io.rowSource.ExternalSort
import com.ms.qaTools.io.rowWriter.file.CsvRowWriter
import com.ms.qaTools.io.rowWriter.file.ExcelRowWriter
import com.ms.qaTools.io.rowWriter.file.PsvRowWriter
import com.ms.qaTools.io.rowWriter.file.TsvRowWriter

import au.com.bytecode.opencsv.CSVWriter
import javax.mail.internet.{MimeBodyPart => JMimeBodyPart}

package object io {
  @deprecated type DelimitedRow = Seq[String]
  type DelimitedIteratorNoColDefs = Iterator[DelimitedRow]
  type DelimitedIterator = Iterator[DelimitedRow] with ColumnDefinitions
  type SortedDelimitedIteratorNoColDefs = ExternalSort[DelimitedRow]
  type SortedDelimitedIterator = ExternalSort[DelimitedRow] with ColumnDefinitions

  implicit def sortedDelimitedIteratorNoColDefsToDelimitedIteratorNoColDefs(i: SortedDelimitedIteratorNoColDefs): DelimitedIteratorNoColDefs =
    if (i.isInstanceOf[DelimitedIteratorNoColDefs]) i.asInstanceOf[DelimitedIteratorNoColDefs]
    else throw new Error("Can't convert from sorted delimited iterator no col defs type to delimited iterator type no col defs.")

  implicit def sortedDelimitedIteratorToDelimitedIterator(i: SortedDelimitedIterator): DelimitedIterator =
    if (i.isInstanceOf[DelimitedIterator]) i.asInstanceOf[DelimitedIterator]
    else throw new Error("Can't convert from sorted delimited iterator type to delimited iterator type .")

  implicit def writerFromFileName(fileName: String): JWriter = new JFileWriter(fileName)
  implicit def writerFromFile(file: JFile): JWriter = new JFileWriter(file)

  implicit def io3ToI[I](i: IO3[I, _, _]): I = i.input
  implicit def io3ToO[O](i: IO3[_, O, _]): O = i.output
  implicit def io3ToD[D](i: IO3[_, _, D]): D = i.diffWriter

  def getFileWriter(
    fmt: String,
    fileName: String,
    wsName: String = null,
    separatorChar: Char = CSVWriter.DEFAULT_SEPARATOR,
    quoteChar: Char = CSVWriter.DEFAULT_QUOTE_CHARACTER,
    escapeChar: Char = CSVWriter.DEFAULT_ESCAPE_CHARACTER,
    lineEnd: String = CSVWriter.DEFAULT_LINE_END,
    overwrite: Boolean = false): Writer[Iterator[Seq[String]]] = {
    fmt.toUpperCase() match {
      case "CSV" => CsvRowWriter(writer = fileName)
      case "TSV" => TsvRowWriter(writer = fileName)
      case "PSV" => PsvRowWriter(writer = fileName)
      case "DATA" => CsvRowWriter(writer = fileName, separator = separatorChar, quoteChar = quoteChar, escapeChar = escapeChar, lineEnd = lineEnd)
      case "EXCEL" | "XLSX" => ExcelRowWriter(fileName, wsName, true, overwrite)
      case "XLS" => ExcelRowWriter(fileName, wsName, false, overwrite)
      case _ => throw new Exception("Unknown data set format: " + fmt)
    }
  }

  implicit def scalaListtoJavaList[T](l: List[T]): JList[T] = ArrayBuffer(l: _*)

  implicit def objectToNameValuePair(o: Seq[Object]): Seq[NameValuePair] = o.asInstanceOf[Seq[NameValuePair]]

  implicit class FileAttachmentUtil(fileIO: BaseFileIO) {
    def asAttachment: Try[Seq[JMimeBodyPart]] = {
      @tailrec
      def asAttachment0(files: List[JFile], accu: List[JMimeBodyPart] = Nil): Seq[JMimeBodyPart] = {
        files match {
          case Nil                                  => accu
          case head :: tail if (head.isDirectory()) => asAttachment0(head.listFiles().toList ::: tail, accu)
          case head :: tail =>
            val attachment = new JMimeBodyPart()
            attachment.attachFile(head)
            asAttachment0(tail, attachment :: accu)
        }
      }
      for {
        files <- fileIO.files
      } yield asAttachment0(files.toList).reverse
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
