package com.ms.qaTools.io.rowSource.file

import java.io.BufferedReader
import java.io.Reader

import scala.annotation.tailrec
import scala.collection.AbstractIterator
import scala.collection.JavaConversions._
import scala.slick.util.CloseableIterator

import org.w3c.dom.Document
import org.w3c.dom.Node

import com.ms.qaTools.conversions.XPathConversions.xPathToNodes
import com.ms.qaTools.fix.IFixDictionary
import com.ms.qaTools.io.rowSource.Utils.StringUtil
import com.ms.qaTools.xml.NamespaceContextImpl
import com.ms.qaTools.xml.xpath.XPath

import javax.xml.namespace.NamespaceContext
import quickfix.DataDictionary
import quickfix.FieldMap
import quickfix.InvalidMessage
import quickfix.Message
import quickfix.MessageUtils
import quickfix.field.BodyLength
import java.io.FileReader
class FixRowSource(val reader: Reader, val dataDictionary: DataDictionary, val doValidation: Boolean = false, val separator: Option[Char] = Some('\u0001'))
extends AbstractIterator[Message] with IFixDictionary with CloseableIterator[Message] {
  private val _bufferedReader = new BufferedReader(reader)
  private val bufferSize = 4096
  private val fixTypeField = 8
  private val lookAhead: Int = 10485760
  private val EOMRegex = "10=[0-9]{3}".r
  private val SOH = '\u0001'

  var currentMessage: Option[Message] = None

  def next = {
    val message = currentMessage
    currentMessage = None
    message.getOrElse(throw new Exception("Current message is empty"))
  }

  def hasNext = currentMessage.orElse{
    currentMessage = _next;
    currentMessage
  }.isDefined

  def createMessage: Message = new Message

  protected def _next: Option[Message] = {
    val rawFixMessageString = readNextFixMessageString
    val fixMessageString = separator.map(s => rawFixMessageString.replace(s, SOH)).getOrElse(rawFixMessageString)
    if (!fixMessageString.isEmpty()) {
      val fixHeader = MessageUtils.getStringField(fixMessageString, fixTypeField)
      val m = createMessage
      m.fromString(fixMessageString, dataDictionary, doValidation)
      if (m.getException() != null)
        throw new Error("Could not parse this FIX message: " + m.getException().getMessage())
      else
        Option(m)
    } else None
  }

  protected def readNextFixMessageString: String = {
    _bufferedReader.mark(lookAhead)
    @tailrec
    def readNextFixMessageString0(accu: String = "", position: Int = 0): String = {
      val buffer = new Array[Char](bufferSize)
      val read = _bufferedReader.read(buffer)
      val data = if (read >= 0) Some(new String(buffer)) else None
      (accu, data) match {
        case ("", None) => ""
        case (_, None) => throw new InvalidMessage("The message '%s' is invalid.".format(accu))
        case (_, Some(d)) =>
          if (d.trim.isEmpty) readNextFixMessageString0("", position + read)
          else EOMRegex.findFirstMatchIn(d) match {
            case Some(eom) => {
              _bufferedReader.reset()
              _bufferedReader.skip(position + eom.end + 1)
              accu + d.take(eom.end + 1)
            }
            case _ => readNextFixMessageString0(d, position + read)
          }
      }
    }
    val fixMsg = readNextFixMessageString0().trim() // trim will remove SOH char and everything not greater than \020
    if (!fixMsg.isEmpty) fixMsg + separator.filter(c => c.toInt <= 20).getOrElse("")
    else fixMsg
  }

  def toDocumentIterator: Iterator[Document] = FixXmlRowSource(this)

  def close() = reader.close()
}

object FixRowSource {
  def apply(reader: Reader, dataDictionary: DataDictionary, doValidation: Boolean = false, separator: Option[Char] = Some('\u0001')) =
    new FixRowSource(reader, dataDictionary, doValidation, separator)
}

class FixXmlRowSource(fixRowSource: Iterator[Message]) extends AbstractIterator[Document] with CloseableIterator[Document] {
  protected implicit val nsContext: NamespaceContext = NamespaceContextImpl()

  def hasNext = fixRowSource.hasNext
  def next = {
    val message = fixRowSource.next()
    message.getHeader.setField(new BodyLength(message.bodyLength))

    val document: Document = message.toXML().replace("&#1;", ";").toDocument

    val headerElem = document.getDocumentElement().getElementsByTagName("header").item(0)
    val bodyElem = document.getDocumentElement().getElementsByTagName("body").item(0)
    val trailerElem = document.getDocumentElement().getElementsByTagName("trailer").item(0)
    postProcessing(message.getHeader(), headerElem)
    postProcessing(message, bodyElem)
    postProcessing(message.getTrailer(), trailerElem)
    document
  }

  protected def postProcessing(fieldMap: FieldMap, node: Node): Unit = {
    fieldMap.groupKeyIterator.foreach {
      groupKey =>
        val groupCount = fieldMap.getGroupCount(groupKey)
        val groups = for (c <- 1 to groupCount) yield {
          val groupXPathString = """groups[@tag = "%s"]/group[%s]""".format(groupKey, c)
          val groupNodes = XPath(groupXPathString, node).ensuring(_.size == 1, "Must have only one group matching '%s'".format(groupXPathString))
          (fieldMap.getGroup(c, groupKey), groupNodes(0))
        }
        groups.foreach {
          group => postProcessing(group._1, group._2)
        }
    }
  }

  def close() = com.ms.qaTools.closeAny(fixRowSource)
}

object FixXmlRowSource {
  def apply(fixRowSource: Iterator[Message]): FixXmlRowSource = new FixXmlRowSource(fixRowSource)
  def apply(reader: Reader, dataDictionary: DataDictionary, doValidation: Boolean = false, separator: Option[Char] = Some('\u0001')): FixXmlRowSource =
    apply(new FixRowSource(reader, dataDictionary, doValidation, separator))
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
