package com.ms.qaTools.io.rowSource

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.node.JsonNodeFactory
import com.ms.qaTools._
import com.ms.qaTools.fix.IFixDictionary
import com.ms.qaTools.fix.FixMessage
import com.ms.qaTools.io.ByteArrayIteratorIO
import com.ms.qaTools.io.DeviceIO
import com.ms.qaTools.io.StringIO
import com.ms.qaTools.io.StringIteratorIO
import com.ms.qaTools.io.rowSource.file.SaxonXmlRowSource
import com.ms.qaTools.jdbc.SQLTypeParameter
import com.ms.qaTools.json.JsonExtractor
import com.ms.qaTools.json.JSONGenerator
import com.ms.qaTools.xml.generator.XmlGenerator
import com.ms.qaTools.xml.NamespaceContextImpl
import com.ms.qaTools.xml.TransformerFactory
import com.ms.qaTools.xml.XmlExtractor
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.Closeable
import java.io.StringBufferInputStream
import java.io.StringWriter
import java.sql.Blob
import java.sql.Clob
import java.sql.ResultSet
import java.sql.SQLXML
import java.util.zip.GZIPInputStream
import java.util.zip.GZIPOutputStream
import javax.jms.{ Message, BytesMessage, TextMessage }
import javax.jms.Session
import javax.naming.directory.{ SearchResult => LdapSearchResult }
import javax.xml.namespace.NamespaceContext
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.soap.{ MessageFactory, SOAPMessage, MimeHeaders }
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.OutputKeys
import javax.xml.transform.stream.StreamResult
import net.sf.saxon.dom.NodeOverNodeInfo
import net.sf.saxon.event.PipelineConfiguration
import net.sf.saxon.tree.tiny.TinyBuilder
import org.apache.commons.io.IOUtils
import org.w3c.dom.{ Document => W3cDocument }
import org.w3c.dom.{ Node => W3cNode }
import quickfix.DataDictionary
import scala.collection.JavaConversions._
import scala.language.{ implicitConversions, reflectiveCalls }
import scala.util.{Success, Failure}
import scala.util.control.NonFatal

trait Named {
  def name:String
}

trait ExtractRows {
  def extractRows(columnMappings: (String, String)*): Iterator[Seq[String]] with ColumnDefinitions
}

trait NamespaceDefinitions {
  val namespaceContext: NamespaceContextImpl
}

trait Resizable[S] {
  def resize(row: Seq[S], colDefs: Seq[ColumnDefinition]): Seq[S] =
    if (colDefs != null)
      row ++ Seq.fill(colDefs.size - row.size)(null.asInstanceOf[S])
    else row
}

trait AsTemplateOf[X] {
  def asTemplateOf(i: Iterator[Seq[String]] with ColumnDefinitions): X
}

object Utils {
  // Iterator implicit util classes
  implicit class IteratorRowSourceUtil[ITEM](i: Iterator[ITEM]) {
    def withName(n: String) = new IteratorProxy[ITEM] with Named {
      val self = i
      val name = n
    }

    def withColumnNames(newColNames: String*) = new IteratorProxy[ITEM] with ColumnDefinitions {
      val self = i
      val colDefs = ColumnDefinition.fromColumnNames(newColNames)
    }

    def withColumns(newCols: Seq[ColumnDefinition]) = new IteratorProxy[ITEM] with ColumnDefinitions {
      val self = i
      val colDefs = newCols
    }

    def withNamespaceDefinitions(newNsDefs: NamespaceContextImpl) = new IteratorProxy[ITEM] with NamespaceDefinitions {
      val self = i
      val namespaceContext = newNsDefs
    }
  }

  implicit class NamesIteratorRowSourceUtil[ITEM](i: Iterator[ITEM] with Named) {
    def withColumnNames(newColNames: String*) = new IteratorProxy[ITEM] with Named with ColumnDefinitions {
      val self = i
      val name = i.name
      val colDefs = ColumnDefinition.fromColumnNames(newColNames)
    }
  }

  implicit class ColumnedIteratorRowSourceUtil[ITEM](i: Iterator[ITEM] with ColumnDefinitions) {
    def withName(n: String) = new IteratorProxy[ITEM] with Named with ColumnDefinitions {
      val self = i
      val name = n
      val colDefs = i.colDefs
    }
  }

  implicit class ByteArrayIteratorUtil(iterator: Iterator[Array[Byte]]) {
    def toStringIterator: Iterator[String] = iterator.map { new String(_) }
    def toDocumentIterator: Iterator[W3cDocument] = iterator.map(_.toDocument)
    def toJsonIterator: Iterator[JsonNode] =
      this.toDeviceIO.reader.map{JsonRowSource(_)}.rethrow("An exception occurred converting an Iterator[String] to an Iterator[JsonNode]."). get
    def toDeviceIO: DeviceIO = ByteArrayIteratorIO(iterator)
    def gzip: Iterator[Array[Byte]] = iterator.map(_.gzip)
    def gunzip: Iterator[Array[Byte]] = iterator.map(_.gunzip)
  }

  implicit class ByteArrayWithContextIteratorUtil(iterator: Iterator[Array[Byte]] with NamespaceDefinitions) {
    def toStringIterator: Iterator[String] with NamespaceDefinitions =
      ByteArrayIteratorUtil(iterator).toStringIterator withNamespaceDefinitions (iterator.namespaceContext)
    def toDocumentIterator: Iterator[W3cDocument] with NamespaceDefinitions =
      ByteArrayIteratorUtil(iterator).toDocumentIterator withNamespaceDefinitions (iterator.namespaceContext)
  }

  implicit class FixIteratorUtil(iterator: Iterator[quickfix.Message]) {
    def toByteArrayIterator: Iterator[Array[Byte]] = iterator.map { _.toString.getBytes() }
    def toStringIterator: Iterator[String] = iterator.map { _.toString }
  }

  implicit class StringSeqIteratorWithColumnDefinitionsUtil(iterator:Iterator[Seq[String]] with ColumnDefinitions) {
    def toExtractorMappings: Seq[(String,String)] = iterator.map {case Seq(s1, s2) => (s1, s2)}.toSeq

    def generateDocumentIterator(templates: Iterator[W3cDocument]): Iterator[W3cDocument] = try Option(templates.next) match {
      case Some(template) => XmlGenerator(template, iterator)
      case None => Iterator.empty
    } finally closeAny(templates)

    def generateJsonIterator(templates: Iterator[JsonNode]): Iterator[JsonNode] = try Option(templates.next) match {
      case Some(template) => JSONGenerator(template, iterator)
      case None => Iterator.empty
    } finally closeAny(templates)

    def toRowMaps: Iterator[Map[String, Option[String]]] = {
      val cols = iterator.colDefs.sortBy(_.index).map(_.name)
      iterator.map((cols, _).zipped.toMap.mapValues(Option.apply))
    }
  }

  implicit class W3CDocumentIteratorUtil(iterator: Iterator[W3cDocument]) extends AsTemplateOf[Iterator[W3cDocument]] with ExtractRows {
    def toFixIterator(dictionary: DataDictionary) = new Iterator[quickfix.Message] with IFixDictionary {
      val dataDictionary = dictionary
      def hasNext = iterator.hasNext
      def next = FixMessage(iterator.next, dictionary)
    }

    def toByteArrayIterator: Iterator[Array[Byte]] = iterator.map { _.toByteArray }
    def toStringIterator: Iterator[String] = iterator.map { _.toXmlString }

    def asTemplateOf(rows: Iterator[Seq[String]] with ColumnDefinitions): Iterator[W3cDocument] = rows.generateDocumentIterator(iterator)
    def extractRows(columnMappings: (String, String)*): Iterator[Seq[String]] with ColumnDefinitions = XmlExtractor(iterator, columnMappings)
  }

  implicit class W3CDocumentIteratorWithNamespacesUtil(iterator: Iterator[W3cDocument] with NamespaceDefinitions)
      extends AsTemplateOf[Iterator[W3cDocument] with NamespaceDefinitions] with ExtractRows {
    def toByteArrayIterator: Iterator[Array[Byte]] with NamespaceDefinitions =
      W3CDocumentIteratorUtil(iterator).toByteArrayIterator withNamespaceDefinitions (iterator.namespaceContext)
    def toStringIterator: Iterator[String] with NamespaceDefinitions =
      W3CDocumentIteratorUtil(iterator).toStringIterator withNamespaceDefinitions (iterator.namespaceContext)
    def zipWithContext: Iterator[(W3cDocument, NamespaceContext)] with NamespaceDefinitions =
      iterator.map { doc => (doc, iterator.namespaceContext) } withNamespaceDefinitions (iterator.namespaceContext)

    def asTemplateOf(rows: Iterator[Seq[String]] with ColumnDefinitions): Iterator[W3cDocument] with NamespaceDefinitions =
      W3CDocumentIteratorUtil(iterator).asTemplateOf(rows) withNamespaceDefinitions (iterator.namespaceContext)
    def extractRows(columnMappings: (String, String)*): Iterator[Seq[String]] with ColumnDefinitions = iterator.namespaceContext match {
      case ns: com.ms.qaTools.xml.NamespaceContextImpl =>
        XmlExtractor(iterator, columnMappings, ns.namespaces)
      case _ => ???
    }
  }

  implicit class ZippedW3CDocumentIteratorWithNamespacesUtil(iterator: Iterator[(W3cDocument, NamespaceContext)] with NamespaceDefinitions) extends {
    def unzipContext: Iterator[W3cDocument] with NamespaceDefinitions = iterator.map { _._1 } withNamespaceDefinitions (iterator.namespaceContext)
  }

  implicit class JsonIteratorUtil(iterator: Iterator[JsonNode]) extends AsTemplateOf[Iterator[JsonNode]] with ExtractRows {
    def toByteArrayIterator: Iterator[Array[Byte]] = iterator.map { _.toString().getBytes() }
    def toStringIterator: Iterator[String] = iterator.map { _.toString() }

    def asTemplateOf(rows: Iterator[Seq[String]] with ColumnDefinitions): Iterator[JsonNode] = rows.generateJsonIterator(iterator)
    def extractRows(columnMappings: (String, String)*): Iterator[Seq[String]] with ColumnDefinitions = JsonExtractor(iterator, columnMappings)
  }

  implicit class StringIteratorUtil(iterator: Iterator[String]) {
    def toByteArrayIterator: Iterator[Array[Byte]] = iterator.map { _.getBytes }
    def toDocumentIterator: Iterator[W3cDocument] = iterator.map { _.toDocument }
    def toJsonIterator: Iterator[JsonNode] =
      this.toDeviceIO.reader.map{JsonRowSource(_)}.rethrow("An exception occurred converting an Iterator[String] to an Iterator[JsonNode].") match {
        case Success(v) => v
        case Failure(e) => throw e}
    def toDeviceIO: DeviceIO = StringIteratorIO(iterator)
  }

  implicit class StringWithNamespacesIteratorUtil(iterator: Iterator[String] with NamespaceDefinitions) {
    def toByteArrayIterator: Iterator[Array[Byte]] with NamespaceDefinitions =
      StringIteratorUtil(iterator).toByteArrayIterator withNamespaceDefinitions (iterator.namespaceContext)
    def toDocumentIterator: Iterator[W3cDocument] with NamespaceDefinitions =
      StringIteratorUtil(iterator).toDocumentIterator withNamespaceDefinitions (iterator.namespaceContext)
  }

  implicit class ResultSetIteratorUtil(i: Iterator[ResultSet] with Named with ColumnDefinitions with Closeable) {
    def toSeqStringIterator =
      new IteratorProxy[Seq[String]] with Named with ColumnDefinitions {
        def colDefs = i.colDefs
        override def close = i.close
        val name = i.name
        lazy val self = i.map(_.toSeqString)
      }
  }

  implicit class LdapSearchResultIteratorUtil(results: Iterator[LdapSearchResult] with Closeable) {
    def toJsonIterator = new IteratorProxy[JsonNode] with Closeable {
      protected val self = results.map(_.toJson)
    }.thenClose(results)
  }

  implicit class FixMessageUtil(protected val msg: quickfix.Message) extends AnyVal {
    def toDocument: W3cDocument = msg.toXML().toDocument
    def toXmlString: String = msg.toXML
    def toBytesMessage(session: Session): BytesMessage = msg.toString.toBytesMessage(session)
  }

  implicit class ResultSetUtil(protected val r: ResultSet) extends AnyVal {
    def toSeqString(start: Int, end: Int): Seq[String] = {
      val meta = r.getMetaData
      (start until end).map { i =>
        try SQLTypeParameter(meta.getColumnType(i)).get(i, r) match {
          case Some(b: Blob) => IOUtils.toString(b.getBinaryStream, java.nio.charset.Charset.defaultCharset)
          case Some(c: Clob) => IOUtils.toString(c.getCharacterStream)
          case Some(a: SQLXML) => a.getString
          case Some(a) => a.toString
          case None => null
        } catch {
          case NonFatal(t) => throw new RuntimeException("Error parsing column " + meta.getColumnName(i), t)
        }
      }
    }

    def toSeqString: Seq[String] = toSeqString(1, r.getMetaData.getColumnCount + 1)
  }

  // individual element implicit class
  implicit class W3CDocumentUtil(protected val doc: W3cDocument) extends AnyVal {
    def toByteArray: Array[Byte] = toXmlString.getBytes()
    def toXmlString: String = {
      val source = new DOMSource(doc)
      val transformer = TransformerFactory().newTransformer()
      transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes")
      transformer.setOutputProperty(OutputKeys.METHOD, "xml")
      transformer.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1")
      transformer.setOutputProperty(OutputKeys.INDENT, "no")
      val sw = new StringWriter
      val sr = new StreamResult(sw)
      transformer.transform(source, sr)
      sw.toString()
    }
    def toTextMessage(session: Session): TextMessage = doc.toByteArray.toTextMessage(session)
    def toBytesMessage(session: Session): BytesMessage = doc.toByteArray.toBytesMessage(session)

    def toSaxon: W3cDocument = {
      val outputTarget = new TinyBuilder(new PipelineConfiguration(com.ms.qaTools.xml.globals.saxon.configuration))
      val transformer = TransformerFactory().newTransformer()
      transformer.transform(new DOMSource(doc), outputTarget)
      val tinyNode = outputTarget.getTree().getNode(0)
      val nodeOverNodeInfo = NodeOverNodeInfo.wrap(tinyNode)
      nodeOverNodeInfo.asInstanceOf[W3cDocument]
    }
  }

  implicit class W3CNodeUtil(node: W3cNode) {
    def toDocument: W3cDocument = Option(node) match {
      case Some(document: W3cDocument) => document
      case Some(node: W3cNode) => {
        //val factory = DocumentBuilderFactory.newInstance()
        //val builder = factory.newDocumentBuilder
        val doc = com.ms.qaTools.xml.DocumentBuilderTL.get().newDocument
        doc.adoptNode(node)
        doc.appendChild(node)
        doc
      }
      case None => {
        val doc = com.ms.qaTools.xml.DocumentBuilderTL.get().newDocument
        doc
      }
    }
  }

  implicit class ByteArrayUtil(bs: Array[Byte]) {
    def toDocument: W3cDocument = com.ms.qaTools.xml.DocumentBuilderTL.get().parse(new ByteArrayInputStream(bs))
    def toJson: JsonNode = new ObjectMapper().readTree(bs)
    def toSoapMessage: SOAPMessage = MessageFactory.newInstance.createMessage(new MimeHeaders,
      new ByteArrayInputStream(bs))

    def gzip: Array[Byte] = {
      val bos = new ByteArrayOutputStream
      val gos = new GZIPOutputStream(bos)
      gos.write(bs)
      gos.close()
      bos.toByteArray
    }

    def gunzip: Array[Byte] = {
      val os = new ByteArrayOutputStream
      IOUtils.copy(new GZIPInputStream(new ByteArrayInputStream(bs)), os)
      os.toByteArray
    }
  }

  implicit class StringUtil(s: String) {
    def toDocument: W3cDocument = com.ms.qaTools.xml.DocumentBuilderTL.get().parse(new ByteArrayInputStream(s.getBytes()))

    def toJsonNode: JsonNode = {
      val xs = JsonRowSource(s)
      xs.next.ensuring(!xs.hasNext, s"$s contains multiple JSON nodes")}

    def toTextMessage(session: Session): TextMessage =
      Option(s).map(s => session.createTextMessage(s)).orNull

    def toBytesMessage(session: Session): BytesMessage = Option(s).map{s =>
      session.createBytesMessage.withSideEffect(_.writeBytes(s.getBytes))}.orNull
  }

  // Iterator to iterator implicit conversion
  implicit def w3cDocumentAsByteArray(doc: W3cDocument): Array[Byte] = doc.toByteArray
  implicit def w3cDocumentIteratorAsByteArrayIterator(docs: Iterator[W3cDocument]): Iterator[Array[Byte]] = docs.toByteArrayIterator
  implicit def w3cDocumentIteratorWithNamespacesAsByteArrayIterator(docs: Iterator[W3cDocument] with NamespaceDefinitions): Iterator[Array[Byte]] with NamespaceDefinitions = docs.toByteArrayIterator
  implicit def byteArrayAsW3cDocument(bs: Array[Byte]): W3cDocument = bs.toDocument
  implicit def byteArrayAsString(bs: Array[Byte]): String = new String(bs)
  implicit def byteArrayIteratorAsStringIterator(bss: Iterator[Array[Byte]]): Iterator[String] = bss.map(byteArrayAsString(_))
  implicit def byteArrayIteratorAsW3cDocumentIterator(bss: Iterator[Array[Byte]]): Iterator[W3cDocument] = bss.toDocumentIterator
  implicit def byteArrayIteratorWithNamespacesAsW3cDocumentIterator(bss: Iterator[Array[Byte]] with NamespaceDefinitions): Iterator[W3cDocument] with NamespaceDefinitions = bss.toDocumentIterator
  implicit def jsonNodeIteratorAsByteArrayIterator(nodes: Iterator[JsonNode]): Iterator[Array[Byte]] = nodes.toByteArrayIterator
  implicit def jsonNodeIteratorAsStringIterator(nodes: Iterator[JsonNode]): Iterator[String] = nodes.toStringIterator

  // Iterator implicit util classes
  implicit class JmsMessageIteratorUtil(msgs: Iterator[Message]) {
    def toByteArrayIterator: Iterator[Array[Byte]] = msgs.map(_.toByteArray)
    def toStringIterator: Iterator[String] = msgs.map(_.toMessageString)
    def toSeqStringIterator: Iterator[Seq[String]] = msgs.map(_.toDelimitedRow)
    def toDocumentIterator: Iterator[W3cDocument] = msgs.map(_.toDocument)
    def toJsonIterator: Iterator[JsonNode] = msgs.map(_.toJson)
  }

  // individual element implicit class
  implicit class JmsMessageUtil(msg: Message) {
    def toByteArray: Array[Byte] = msg match {
      case m: BytesMessage =>
        val bs = Array.ofDim[Byte](m.getBodyLength.toInt)
        m.readBytes(bs)
        bs
      case m: TextMessage =>
        m.getText.getBytes
      case m =>
        throw new Exception(s"Unknown Message type: ${m.getClass}")
    }

    def toMessageString: String = new String(msg.toByteArray)
    def toDelimitedRow: Seq[String] = Seq(msg.toMessageString)
    def toDocument: W3cDocument = msg.toByteArray.toDocument
    def toJson: JsonNode = msg.toByteArray.toJson
  }

  implicit class JmsByteArrayUtil(bs: Array[Byte]) {
    def toTextMessage(session: Session): TextMessage = new String(bs).toTextMessage(session)
    def toBytesMessage(session: Session): BytesMessage = {
      val m = session.createBytesMessage
      m.writeBytes(bs)
      m
    }
  }

  implicit class JmsJsonUtil(node: JsonNode) {
    def toTextMessage(session: Session): TextMessage = node.toString.toTextMessage(session)
    def toBytesMessage(session: Session): BytesMessage = node.toString.toBytesMessage(session)
  }

  implicit class JmsDelimitedRowUtil(row: Seq[String]) {
    def toTextMessage(session: Session): TextMessage = row(0).toTextMessage(session)
    def toBytesMessage(session: Session): BytesMessage = row(0).toBytesMessage(session)
  }

  implicit class LdapSearchResultUtil(result: LdapSearchResult) {
    import javax.naming.directory.Attribute

    def toJson = JsonNodeFactory.instance.objectNode withSideEffect { x =>
      x.put("dn", result.getNameInNamespace)
      result.getAttributes.getAll foreach { attr =>
        x.set(attr.getID, fromAttr(attr))
      }
    }

    protected def fromAttr(attr: Attribute): JsonNode = attr.getAll.toList match {
      case Nil => JsonNodeFactory.instance.nullNode
      case List(x) => toJson(x)
      case xs => JsonNodeFactory.instance.arrayNode.withSideEffect(arr => xs.foreach(x => arr.add(toJson(x))))
    }

    protected def toJson(x: Any): JsonNode = x match {
      case s: String => JsonNodeFactory.instance.textNode(s)
      case _ => throw new Exception(s"Conversion to JSON not implemented for $x")
    }
  }

  // Iterator to iterator implicit conversion
  implicit def jmsMessageToString(msg: Message): String = msg.toMessageString
  implicit def jmsMessageIteratorToStringIterator(msgs: Iterator[Message]): Iterator[String] = msgs.toStringIterator
  implicit def jmsMessageToDelimitedRow(msg: Message): Seq[String] = msg.toDelimitedRow
  implicit def jmsMessageIteratorToDelimitedRowIterator(msgs: Iterator[Message]): Iterator[Seq[String]] = msgs.toSeqStringIterator
  implicit def jmsMessageToDocument(msg: Message): W3cDocument = msg.toDocument
  implicit def jmsMessageIteratorToDocumentIterator(msgs: Iterator[Message]): Iterator[W3cDocument] = msgs.toDocumentIterator

  implicit def jmsMessageToJson(msg: Message): JsonNode = msg.toJson
  implicit def jmsMessageIteratorToJsonIterator(msgs: Iterator[Message]): Iterator[JsonNode] = msgs.toJsonIterator

  implicit def jmsMessageToByteArray(msg: Message): Array[Byte] = msg.toByteArray
  implicit def jmsMessageIteratorToByteArrayIterator(msgs: Iterator[Message]): Iterator[Array[Byte]] = msgs.toByteArrayIterator
  implicit def ldapSearchResultIteratorToJsonIterator(results: Iterator[LdapSearchResult] with Closeable) = results.toJsonIterator

  implicit def resultSetIteratorToSeqStringIterator(i: Iterator[ResultSet] with Named with ColumnDefinitions with Closeable) = i.toSeqStringIterator

  type ToW3cDocument[A] = Convert[A, W3cDocument]
  type ToStringPairs[A] = Convert[A, Seq[(String, String)]]
  type ToNamespaceContext[A] = Convert[A, NamespaceContextImpl]
  type ToExtractRows[A] = Convert[A, ExtractRows]

  trait ConvertWithSession[A, B] {
    def convert(session: Session)(x: A): B}

  implicit object FixMessageToBytesMessage extends ConvertWithSession[quickfix.Message, BytesMessage] {
    def convert(session: Session)(x: quickfix.Message) = x.toBytesMessage(session)}

  implicit object DocumentToBytesMessage extends ConvertWithSession[W3cDocument, BytesMessage] {
    def convert(session: Session)(x: W3cDocument) = x.toBytesMessage(session)}

  implicit object StringToBytesMessage extends ConvertWithSession[String, BytesMessage]{
    def convert(session: Session)(x: String) = x.toBytesMessage(session)}

  implicit object ByteArrayToBytesMessage extends ConvertWithSession[Array[Byte], BytesMessage]{
    def convert(session: Session)(x: Array[Byte]) = x.toBytesMessage(session)}

  implicit object JsonNodeToBytesMessage extends ConvertWithSession[JsonNode, BytesMessage]{
    def convert(session: Session)(x: JsonNode) = x.toBytesMessage(session)}

  implicit object SeqStringToBytesMessage extends ConvertWithSession[Seq[String], BytesMessage]{
    def convert(session: Session)(x: Seq[String]) = x.toBytesMessage(session)}

  implicit object DocumentToTextMessage extends ConvertWithSession[W3cDocument, TextMessage] {
    def convert(session: Session)(x: W3cDocument) = x.toTextMessage(session)}

  implicit object StringToTextMessage extends ConvertWithSession[String, TextMessage]{
    def convert(session: Session)(x: String) = x.toTextMessage(session)}

  implicit object ByteArrayToTextMessage extends ConvertWithSession[Array[Byte], TextMessage]{
    def convert(session: Session)(x: Array[Byte]) = x.toTextMessage(session)}

  implicit object JsonNodeToTextMessage extends ConvertWithSession[JsonNode, TextMessage]{
    def convert(session: Session)(x: JsonNode) = x.toTextMessage(session)}

  implicit object SeqStringToTextMessage extends ConvertWithSession[Seq[String], TextMessage]{
    def convert(session: Session)(x: Seq[String]) = x.toTextMessage(session)}
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
