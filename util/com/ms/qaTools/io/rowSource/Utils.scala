package com.ms.qaTools.io.rowSource

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.node.JsonNodeFactory
import com.ms.qaTools._
import com.ms.qaTools.io.ByteArrayIteratorIO
import com.ms.qaTools.io.DeviceIO
import com.ms.qaTools.io.rowSource.json.JSONRowSource
import com.ms.qaTools.io.StringIO
import com.ms.qaTools.io.StringIteratorIO
import com.ms.qaTools.jdbc.SQLTypeParameter
import com.ms.qaTools.json.JSONExtractor
import com.ms.qaTools.json.JSONGenerator
import com.ms.qaTools.xml.generator.XmlGenerator
import com.ms.qaTools.xml.NamespaceContextImpl
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
import javax.xml.transform.TransformerFactory
import org.apache.commons.io.IOUtils
import org.w3c.dom.{ Document => W3cDocument }
import org.w3c.dom.{ Node => W3cNode }
import scala.collection.JavaConversions._
import scala.language.{ implicitConversions, reflectiveCalls }

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
    def toJsonIterator: Iterator[JsonNode] = this.toDeviceIO.reader.map { reader => new JSONRowSource(reader) }.rethrow("An exception occurred converting an Iterator[String] to an Iterator[JsonNode].").get

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

  implicit class StringSeqIteratorWithColumnDefinitionsUtil(iterator:Iterator[Seq[String]] with ColumnDefinitions) {
    def toExtractorMappings: Seq[(String,String)] = iterator.map {case Seq(s1, s2) => (s1, s2)}.toSeq

    def generateDocumentIterator(templates: Iterator[W3cDocument]): Iterator[W3cDocument] = Option(templates.next) match {
      case Some(template) => XmlGenerator(template, iterator)
      case None => Iterator.empty
    }
    def generateJsonIterator(templates: Iterator[JsonNode]): Iterator[JsonNode] = Option(templates.next) match {
      case Some(template) => JSONGenerator(template, iterator)
      case None => Iterator.empty
    }

    def toRowMaps: Iterator[Map[String, Option[String]]] = {
      val cols = iterator.colDefs.sortBy(_.index).map(_.name)
      iterator.map((cols, _).zipped.toMap.mapValues(Option.apply))
    }
  }

  implicit class W3CDocumentIteratorUtil(iterator: Iterator[W3cDocument]) extends AsTemplateOf[Iterator[W3cDocument]] with ExtractRows {
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
    def extractRows(columnMappings: (String, String)*): Iterator[Seq[String]] with ColumnDefinitions = JSONExtractor(iterator, columnMappings)
  }

  implicit class StringIteratorUtil(iterator: Iterator[String]) {
    def toByteArrayIterator: Iterator[Array[Byte]] = iterator.map { _.getBytes }
    def toDocumentIterator: Iterator[W3cDocument] = iterator.map { _.toDocument }
    def toJsonIterator: Iterator[JsonNode] = this.toDeviceIO.reader.map { reader => new JSONRowSource(reader) }.rethrow("An exception occurred converting an Iterator[String] to an Iterator[JsonNode].").get
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
      new IteratorProxy[Seq[String]] with Named with ColumnDefinitions with Closeable {
        def colDefs = i.colDefs
        def close = i.close
        val name = i.name
        lazy val self = i.map(_.toSeqString)
      }
  }

  implicit class LdapSearchResultIteratorUtil(results: Iterator[LdapSearchResult] with Closeable) {
    def toJsonIterator = new IteratorProxy[JsonNode] with Closeable {
      protected val self = results.map(_.toJson)
      def close() = results.close()
    }
  }

  implicit class ResultSetUtil(r: ResultSet) {
    def toSeqString: Seq[String] =
      (1 to r.getMetaData.getColumnCount).map(i =>
        Option(r.getAsSQLType(i)) match {
          case Some(b: Blob) => IOUtils.toString(b.getBinaryStream)
          case Some(c: Clob) => IOUtils.toString(c.getCharacterStream)
          case Some(a: SQLXML) => a.getString
          case Some(a) => a.toString
          case None => null
        })

    def getAsSQLType(i: Int) = SQLTypeParameter(r.getMetaData.getColumnType(i)).get(i, r).orNull
  }

  // individual element implicit class
  implicit class W3CDocumentUtil(doc: W3cDocument) {
    def toByteArray: Array[Byte] = toXmlString.getBytes()
    def toXmlString: String = {
      val source = new DOMSource(doc)
      val transformer = TransformerFactory.newInstance().newTransformer()
      transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes")
      transformer.setOutputProperty(OutputKeys.METHOD, "xml")
      transformer.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1")
      transformer.setOutputProperty(OutputKeys.INDENT, "no")
      val sw = new StringWriter
      val sr = new StreamResult(sw)
      transformer.transform(source, sr)
      sw.toString()
    }
  }

  implicit class W3CNodeUtil(node: W3cNode) {
    def toDocument: W3cDocument = Option(node) match {
      case Some(document: W3cDocument) => document
      case Some(node: W3cNode) => {
        //val factory = DocumentBuilderFactory.newInstance()
        //val builder = factory.newDocumentBuilder
        val doc = com.ms.qaTools.xml.DocumentBuilderTL().newDocument()
        doc.adoptNode(node)
        doc.appendChild(node)
        doc
      }
      case None => {
        val doc = com.ms.qaTools.xml.DocumentBuilderTL().newDocument()
        doc
      }
    }
  }

  implicit class ByteArrayUtil(bs: Array[Byte]) {
    def toDocument: W3cDocument = com.ms.qaTools.xml.DocumentBuilderTL() parse new ByteArrayInputStream(bs)
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
    def toDocument: W3cDocument = com.ms.qaTools.xml.DocumentBuilderTL() parse new ByteArrayInputStream(s.getBytes())

    def toJsonNode: JsonNode = {
      val xs = JSONRowSource(s)
      val x = xs.next
      assert(!xs.hasNext, s"$s contains multiple JSON nodes")
      x
    }
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

  implicit class JmsByteArrayIteratorUtil(bss: Iterator[Array[Byte]]) {
    def toTextMessageIterator(implicit session: Session): Iterator[TextMessage] = bss.map(_.toTextMessage)
    def toBytesMessageIterator(implicit session: Session): Iterator[BytesMessage] = bss.map(_.toBytesMessage)
  }

  implicit class JmsW3CDocumentIteratorUtil(docs: Iterator[W3cDocument]) {
    def toTextMessageIterator(implicit session: Session): Iterator[TextMessage] = docs.map(_.toTextMessage)
    def toBytesMessageIterator(implicit session: Session): Iterator[BytesMessage] = docs.map(_.toBytesMessage)
  }

  implicit class JmsJsonIteratorUtil(nodes: Iterator[JsonNode]) {
    def toTextMessageIterator(implicit session: Session): Iterator[TextMessage] = nodes.map(_.toTextMessage)
    def toBytesMessageIterator(implicit session: Session): Iterator[BytesMessage] = nodes.map(_.toBytesMessage)
  }

  implicit class JmsDelimitedRowIteratorUtil(rows: Iterator[Seq[String]]) {
    def toTextMessageIterator(implicit session: Session): Iterator[TextMessage] = rows.map(_.toTextMessage)
    def toBytesMessageIterator(implicit session: Session): Iterator[BytesMessage] = rows.map(_.toBytesMessage)
  }

  implicit class JmsStringIteratorUtil(ss: Iterator[String]) {
    def toTextMessageIterator(implicit session: Session): Iterator[TextMessage] = ss.map(_.toTextMessage)
    def toBytesMessageIterator(implicit session: Session): Iterator[BytesMessage] = ss.map(_.toBytesMessage)
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
    def toTextMessage(implicit session: Session): TextMessage = new String(bs).toTextMessage
    def toBytesMessage(implicit session: Session): BytesMessage = {
      val m = session.createBytesMessage
      m.writeBytes(bs)
      m
    }
  }

  implicit class JmsW3CDocumentUtil(doc: W3cDocument) {
    def toTextMessage(implicit session: Session): TextMessage = doc.toByteArray.toTextMessage
    def toBytesMessage(implicit session: Session): BytesMessage = doc.toByteArray.toBytesMessage
  }

  implicit class JmsJsonUtil(node: JsonNode) {
    def toTextMessage(implicit session: Session): TextMessage = node.toString.toTextMessage
    def toBytesMessage(implicit session: Session): BytesMessage = node.toString.toBytesMessage
  }

  implicit class JmsDelimitedRowUtil(row: Seq[String]) {
    def toTextMessage(implicit session: Session): TextMessage = row(0).toTextMessage
    def toBytesMessage(implicit session: Session): BytesMessage = row(0).toBytesMessage
  }

  implicit class JmsStringUtil(s: String) {
    def toTextMessage(implicit session: Session): TextMessage = Option(s).map(s => session.createTextMessage(s)).orNull
    def toBytesMessage(implicit session: Session): BytesMessage = Option(s).map{s =>
      val bytesMessage = session.createBytesMessage()
      bytesMessage.writeBytes(s.getBytes)
      bytesMessage
    }.orNull
  }

  implicit class LdapSearchResultUtil(result: LdapSearchResult) {
    import javax.naming.directory.Attribute

    def toJson = JsonNodeFactory.instance.objectNode withSideEffect { x =>
      x.put("dn", result.getNameInNamespace)
      result.getAttributes.getAll foreach { attr =>
        x.put(attr.getID, fromAttr(attr))
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

  implicit def stringToJmsTextMessage(msg: String)(implicit session: Session): TextMessage = msg.toTextMessage
  implicit def stringToJmsBytesMessage(msg: String)(implicit session: Session): BytesMessage = msg.toBytesMessage
  implicit def stringIteratorToTextMessageIterator(msgs: Iterator[String])(implicit session: Session): Iterator[TextMessage] = msgs.toTextMessageIterator
  implicit def stringIteratorToBytesMessageIterator(msgs: Iterator[String])(implicit session: Session): Iterator[BytesMessage] = msgs.toBytesMessageIterator
  implicit def delimitedRowToJmsTextMessage(msg: Seq[String])(implicit session: Session): TextMessage = msg.toTextMessage
  implicit def delimitedRowToJmsBytesMessage(msg: Seq[String])(implicit session: Session): BytesMessage = msg.toBytesMessage
  implicit def delimitedRowIteratorToTextMessageIterator(msgs: Iterator[Seq[String]])(implicit session: Session): Iterator[TextMessage] = msgs.toTextMessageIterator
  implicit def delimitedRowIteratorToBytesMessageIterator(msgs: Iterator[Seq[String]])(implicit session: Session): Iterator[BytesMessage] = msgs.toBytesMessageIterator
  implicit def documentToJmsTextMessage(msg: W3cDocument)(implicit session: Session): TextMessage = msg.toTextMessage
  implicit def documentToJmsBytesMessage(msg: W3cDocument)(implicit session: Session): BytesMessage = msg.toBytesMessage
  implicit def documentIteratorToTextMessageIterator(msgs: Iterator[W3cDocument])(implicit session: Session): Iterator[TextMessage] = msgs.toTextMessageIterator
  implicit def documentIteratorToBytesMessageIterator(msgs: Iterator[W3cDocument])(implicit session: Session): Iterator[BytesMessage] = msgs.toByteArrayIterator
  implicit def jsonToJmsTextMessage(node: JsonNode)(implicit session: Session): TextMessage = node.toTextMessage
  implicit def jsonToJmsBytesMessage(node: JsonNode)(implicit session: Session): BytesMessage = node.toBytesMessage
  implicit def jsonIteratorToTextMessageIterator(nodes: Iterator[JsonNode])(implicit session: Session): Iterator[TextMessage] = nodes.toTextMessageIterator
  implicit def jsonIteratorToBytesMessageIterator(nodes: Iterator[JsonNode])(implicit session: Session): Iterator[BytesMessage] = nodes.toByteArrayIterator
  implicit def byteArrayToJmsTextMessage(msg: Array[Byte])(implicit session: Session): TextMessage = msg.toTextMessage
  implicit def byteArrayToJmsBytesMessage(msg: Array[Byte])(implicit session: Session): BytesMessage = msg.toBytesMessage
  implicit def byteArrayIteratorToTextMessageIterator(msgs: Iterator[Array[Byte]])(implicit session: Session): Iterator[TextMessage] = msgs.toTextMessageIterator
  implicit def byteArrayIteratorToBytesMessageIterator(msgs: Iterator[Array[Byte]])(implicit session: Session): Iterator[BytesMessage] = msgs.toBytesMessageIterator
  implicit def resultSetIteratorToSeqStringIterator(i: Iterator[ResultSet] with Named with ColumnDefinitions with Closeable) = i.toSeqStringIterator

  type ToW3cDocument[A] = Convert[A, W3cDocument]
  type ToStringPairs[A] = Convert[A, Seq[(String, String)]]
  type ToNamespaceContext[A] = Convert[A, NamespaceContextImpl]
  type ToExtractRows[A] = Convert[A, ExtractRows]
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
