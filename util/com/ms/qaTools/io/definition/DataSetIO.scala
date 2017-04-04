package com.ms.qaTools.io.definition
import com.fasterxml.jackson.databind.JsonNode
import com.google.protobuf.GeneratedMessage
import com.google.protobuf.Message
import com.ms.qaTools.generated.fixedWidth.FixedWidthConfig
import com.ms.qaTools.io.DeviceIO
import com.ms.qaTools.io.ExcelIO
import com.ms.qaTools.io.Input
import com.ms.qaTools.io.Output
import com.ms.qaTools.io.rowSource.AsTemplateOf
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.io.rowSource.ExtractRows
import com.ms.qaTools.io.rowSource.file.ByteArrayRowSource
import com.ms.qaTools.io.rowSource.file.CsvRowSource
import com.ms.qaTools.io.rowSource.file.CustomDelimitedRowSource
import com.ms.qaTools.io.rowSource.file.DataRowSource
import com.ms.qaTools.io.rowSource.file.ExcelRowSource
import com.ms.qaTools.io.rowSource.file.FixedWidthRowSource
import com.ms.qaTools.io.rowSource.file.FIXRowSource
import com.ms.qaTools.io.rowSource.file.LineRowSource
import com.ms.qaTools.io.rowSource.file.PropertiesRowSource
import com.ms.qaTools.io.rowSource.file.XmlRowSource
import com.ms.qaTools.io.rowSource.internal.FixedWidthDeserializer
import com.ms.qaTools.io.rowSource.DatabaseConnection
import com.ms.qaTools.io.rowSource.jdbc.ExecuteSupport
import com.ms.qaTools.io.rowSource.jdbc.FetchSupport
import com.ms.qaTools.io.rowSource.jdbc.ResultSetRowSource
import com.ms.qaTools.io.rowSource.json.JSONRowSource
import com.ms.qaTools.io.rowSource.LdapQueryRowSource
import com.ms.qaTools.io.rowSource.MultiRowSource
import com.ms.qaTools.io.rowSource.Named
import com.ms.qaTools.io.rowSource.NamespaceDefinitions
import com.ms.qaTools.io.rowSource.protobuf.ProtoBufRowSource
import com.ms.qaTools.io.rowSource.Utils._
import com.ms.qaTools.io.rowWriter.file.ByteArrayRowWriter
import com.ms.qaTools.io.rowWriter.file.CsvRowWriter
import com.ms.qaTools.io.rowWriter.file.CustomDelimitedRowWriter
import com.ms.qaTools.io.rowWriter.file.DataRowWriter
import com.ms.qaTools.io.rowWriter.file.ExcelRowWriter
import com.ms.qaTools.io.rowWriter.file.FIXRowWriter
import com.ms.qaTools.io.rowWriter.file.HtmlTableRowWriter
import com.ms.qaTools.io.rowWriter.file.StringRowWriter
import com.ms.qaTools.io.rowWriter.file.XmlRowWriter
import com.ms.qaTools.io.rowWriter.jdbc.JdbcRowWriter
import com.ms.qaTools.io.rowWriter.json.JSONRowWriter
import com.ms.qaTools.io.rowWriter.protobuf.ProtoBufRowWriter
import com.ms.qaTools.io.Writer
import com.ms.qaTools.ldap.Ldap
import com.ms.qaTools.xml.NamespaceContextImpl
import java.io.Closeable
import org.apache.commons.io.IOUtils
import org.w3c.dom.{Document => W3cDocument}
import quickfix.DataDictionary
import scala.util.Try

case class CsvIO(device:DeviceIO) extends Input[MultiRowSource] with Output[Writer[Iterator[Seq[String]]]] {
  def input  = device.readers.map { readers => MultiRowSource(readers.map { reader => CsvRowSource(reader) }) }
  def output = output(true, null)
  def output(writeHeader: Boolean, nullMarker: String) =
    device.writer.map { writer => CsvRowWriter(writer, outputColNames = writeHeader, nullMarker = nullMarker) }
}

case class DataIO(device:DeviceIO) extends Input[MultiRowSource] with Output[Writer[Iterator[Seq[String]]]] {
  def input  = device.readers.map{readers => MultiRowSource(readers.map{reader => DataRowSource(reader)})}
  def output = output(true, "NULL")
  def output(writeHeader: Boolean, nullMarker: String) =
    device.writer.map { writer => DataRowWriter(writer, outputColNames = writeHeader, nullMarker = nullMarker) }
}

case class JsonIO(device:DeviceIO) extends Input[JSONRowSource] with Output[JSONRowWriter] {
  def input  = device.reader.map{reader => JSONRowSource(reader)}
  def output = device.outputStream.map{os => JSONRowWriter(os)}
}

//TODO ExcelRowSource should take a sheet object which should be handed over by the wb created by ExcelIO.  This needs more refactoring --JMP 20140923
case class ExcelWsIO(device: ExcelIO, wsName: String) extends Input[ExcelRowSource] with Output[ExcelRowWriter]{
  def input  = device.file.map{wb => ExcelRowSource(wb,wsName)}
  def output = output(true, null)
  def output(writeHeader: Boolean, nullMarker: String) =
    Try { ExcelRowWriter(device.fileName, wsName, device.isXlsx, writeColNames = writeHeader, nullMarker = nullMarker) }
}

case class CustomIO(device:DeviceIO, cellSeparator:String, rowSeparator: String, quoteChar: Option[Char], escapeChar: Option[Char], nullMarker: String = "")
extends Input[MultiRowSource] with Output[Writer[Iterator[Seq[String]]]] {
  def input  = device.readers.map{readers => MultiRowSource(readers.map{reader => CustomDelimitedRowSource(reader, cellSeparator, rowSeparator, quoteChar, escapeChar)})}
  def output = output(true, nullMarker)
  def output(writeHeader: Boolean, nullMarker: String) =
    device.writer.map(writer => CustomDelimitedRowWriter(writer,
                                                         separator = cellSeparator,
                                                         lineEnd = rowSeparator,
                                                         quoteChar = quoteChar.getOrElse('\0'),
                                                         escapeChar = escapeChar.getOrElse('\0'),
                                                         outputColNames = writeHeader, 
                                                         nullMarker = nullMarker))
}

case class FixedWidthIO(device:DeviceIO, config: Try[FixedWidthConfig]) extends Input[MultiRowSource] {
  def input = for {
    readers <- device.readers
    c       <- config
  } yield MultiRowSource(readers.map(FixedWidthRowSource(_, c)))
}

object FixedWidthIO{
  def apply(device: DeviceIO, config: W3cDocument): FixedWidthIO =
    new FixedWidthIO(device, FixedWidthDeserializer.deserialize(config))
}

class FIXIO(device:DeviceIO, dataDictionary: DataDictionary, doValidation: Boolean, separator: Char) extends Input[FIXRowSource] with Output[FIXRowWriter] {
  def input = device.reader.map(reader => FIXRowSource(reader, dataDictionary, doValidation, Option(separator)))
  def output = device.writer.map(writer => FIXRowWriter(writer, Option(separator)))
}
object FIXIO {
  def apply(device:DeviceIO, dataDictionary: DataDictionary, doValidation: Boolean, separator: Char) = 
    new FIXIO(device, dataDictionary, doValidation, separator)
}

class HtmlTableIO(device: DeviceIO, outputConfig: HtmlTableRowWriter.Config) extends Output[HtmlTableRowWriter] {
  def output = device.writer.map(HtmlTableRowWriter(_, outputConfig))
}

object HtmlTableIO {
  def apply(device: DeviceIO, outputConfig: HtmlTableRowWriter.Config = HtmlTableRowWriter.Config()) =
    new HtmlTableIO(device, outputConfig)
}

case class LineIO(device:DeviceIO) extends Input[LineRowSource] with Output[StringRowWriter] {
  def input  = device.reader.map{reader => LineRowSource(reader)}
  def output = device.writer.map{writer => StringRowWriter(writer, sys.props("line.separator"))}
}

case class PropertiesIO(device:DeviceIO) extends Input[MultiRowSource] {
  def input = device.readers.map{readers => MultiRowSource(readers.map{reader => PropertiesRowSource(reader)})}
}

case class SlurpIO(device:DeviceIO) extends Input[Iterator[String]] with Output[StringRowWriter] {
  def input  = device.reader.map{reader => Iterator(IOUtils.toString(reader))}
  def output = device.writer.map{writer => StringRowWriter(writer)}
}

case class XmlIO(device:DeviceIO, namespaceContext: NamespaceContextImpl = NamespaceContextImpl())
extends Input[XmlRowSource] with Output[XmlRowWriter] with NamespaceDefinitions {
  def input  = device.reader.map{reader => XmlRowSource(reader, namespaceContext)}
  def output = device.writer.map{writer => XmlRowWriter(writer)}
}

case class GoogleProtoBufIO(device:DeviceIO, className: String, jarLocation: String, readDelimited: Boolean, readEncoded: Boolean)
extends Input[Iterator[GeneratedMessage]] with Output[ProtoBufRowWriter] {
  def input  = device.inputStream.map{i  => ProtoBufRowSource(i, className, jarLocation, readDelimited, readEncoded)}
  def output = device.outputStream.map{o => ProtoBufRowWriter(o)}
}

case class ByteArrayIO(device: DeviceIO) extends Input[ByteArrayRowSource] with Output[ByteArrayRowWriter] {
  def input  = device.inputStream. map{inputStream  => ByteArrayRowSource(inputStream)}
  def output = device.outputStream.map{outputStream => ByteArrayRowWriter(outputStream)}
}

case class QueryIO(connection: FetchSupport, query: String, parameters: Option[Iterator[Seq[String]]] = None, fetchSize: Int = 1024)
extends Input[Iterator[Seq[String]] with Named with ColumnDefinitions with Closeable] {
  def input = Try(parameters match {
    case None => connection.fetch(query, config = FetchSupport.Config(fetchSize = fetchSize))
    case Some(p) =>
      val rss = connection.fetchWithParameters(query, p, config = FetchSupport.Config(fetchSize = fetchSize))
      new ResultSetRowSource(rss.flatten.buffered, rss.connectionToClose)})
}

case class TableIO(connection: DatabaseConnection with FetchSupport with ExecuteSupport, tableName: String, fetchSize: Int = 1024)
extends Input[Iterator[Seq[String]] with Named with ColumnDefinitions with Closeable] with Output[JdbcRowWriter] {
  def input  = Try(connection.fetch(s"select * from $tableName", config = FetchSupport.Config(fetchSize = fetchSize)))
  def output = Try(JdbcRowWriter(connection, tableName))
}

object LdapQueryIO {
  import com.ms.qaTools.io.rowSource.Utils._

  def apply(ldap: Ldap, config: LdapQueryRowSource.Config) = new Input[Iterator[JsonNode]] {
    def input = Try(LdapQueryRowSource(ldap, config))
  }
}

case class GeneratorIO[T](template: AsTemplateOf[Iterator[T]], rows: Iterator[Seq[String]] with ColumnDefinitions) extends Input[Iterator[T]] {
  def input  = Try(template.asTemplateOf(rows))
}

case class ExtractorIO[A: ToExtractRows, B: ToStringPairs](inputResource: A, mappings: B)
    extends Input[Iterator[Seq[String]] with ColumnDefinitions] {
  val toExtractRows = implicitly[ToExtractRows[A]]
  val toStringPairs = implicitly[ToStringPairs[B]]
  def input  = Try(toExtractRows.convert(inputResource).extractRows(toStringPairs.convert(mappings): _*))
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
