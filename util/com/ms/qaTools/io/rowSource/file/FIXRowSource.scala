package com.ms.qaTools.io.rowSource.file

import java.io.BufferedReader
import java.io.Reader

import scala.annotation.tailrec
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.JavaConversions.asScalaIterator

import org.w3c.dom.Document
import org.w3c.dom.Node

import com.ms.qaTools.conversions.XPathConversions.xPathToNodes
import com.ms.qaTools.fix.FIXDictionary
import com.ms.qaTools.io.rowSource.Utils.StringUtil
import com.ms.qaTools.xml.NamespaceContextImpl
import com.ms.qaTools.xml.xpath.XPath

import javax.xml.namespace.NamespaceContext
import quickfix.DataDictionary
import quickfix.Field
import quickfix.FieldMap
import quickfix.InvalidMessage
import quickfix.Message
import quickfix.MessageUtils
import quickfix.field.BodyLength
import quickfix.field.CheckSum

class FIXRowSource(
  val reader: Reader,
  override val dataDictionary: DataDictionary,
  val doValidation: Boolean = false,
  val separator: Option[Char] = Some('\001')) extends Iterator[Message] with FIXDictionary {
  private val _bufferedReader = new BufferedReader(reader)
  private val bufferSize = 4096
  private val fixTypeField = 8
  private val lookAhead: Int = 10485760
  private val EOMRegex = "10=[0-9]{3}".r
  private val SOH = '\001'

//  var currentMessage: Message = _next
    var currentMessage: Option[Message] = None

  override def next: Message = {
    val message = currentMessage
    currentMessage = None
    message.getOrElse(throw new Exception("Current message is empty"))
  }
  
  override def hasNext = currentMessage.orElse{
    currentMessage = _next;
    currentMessage
  }.isDefined
  
  def createMessage: Message = new Message

  protected def _next: Option[Message] = {
    val rawFIXMessageString = readNextFIXMessageString
    val fixMessageString = separator.map(s => rawFIXMessageString.replace(s, SOH)).getOrElse(rawFIXMessageString)
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

  protected def readNextFIXMessageString: String = {
    _bufferedReader.mark(lookAhead)
    @tailrec
    def readNextFIXMessageString0(accu: String = "", position: Int = 0): String = {
      val buffer = new Array[Char](bufferSize)
      val read = _bufferedReader.read(buffer)
      val data = if (read >= 0) Some(new String(buffer)) else None
      (accu, data) match {
        case ("", None) => ""
        case (_, None) => throw new InvalidMessage("The message '%s' is invalid.".format(accu))
        case (_, Some(d)) => {
          if (d.trim.isEmpty) readNextFIXMessageString0("", position + read)
          else {
            val eom = EOMRegex.findFirstMatchIn(d)
            if (eom.isDefined) {
              _bufferedReader.reset()
              _bufferedReader.skip(position + eom.get.end + 1)
              accu + d.take(eom.get.end + 1)
            } else readNextFIXMessageString0(d, position + read)
          }
        }
      }
    }
    val fixMsg = readNextFIXMessageString0().trim() // trim will remove SOH char and everything not greater than \020
    if (!fixMsg.isEmpty) fixMsg + separator.filter(c => c.toInt <= 20).getOrElse("")
    else fixMsg
  }

}

object FIXRowSource {
  def apply(reader: Reader, dataDictionary: DataDictionary, doValidation: Boolean = false, separator: Option[Char] = Some('\001')) =
    new FIXRowSource(reader, dataDictionary, doValidation, separator)
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
