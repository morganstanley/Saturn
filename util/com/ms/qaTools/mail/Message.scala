package com.ms.qaTools.mail
import com.ms.qaTools.AnyUtil
import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.TryUtil
import com.ms.qaTools.io.BaseFileIO
import java.io.{ File => JFile }
import javax.activation.DataHandler
import javax.activation.FileDataSource
import javax.mail.{ BodyPart => JBodyPart }
import javax.mail.internet.{ MimeBodyPart => JMimeBodyPart }
import javax.mail.{ Part => JPart }
import scala.util.{Success, Failure}
import scala.xml.XML

trait AttachmentSupport {
  this: Message =>
  def asFiles(attachments: Seq[BaseFileIO]) = attachments.map(_.file).toTrySeq.getOrElse(throw new Exception("Error creating attachment files."))
  def asAttachments(attachments: Seq[BaseFileIO]) =
    attachments.map(_.asAttachment).toTrySeq.map(_.flatten).rethrow("Error attaching files") match {
      case Success(v) => v
      case Failure(e) => throw e
    }
  def withAttachments(attachments: Seq[BaseFileIO]): Message =
    new Message(to, subject, message, from, this.attachments ++ asAttachments(attachments), cc, bcc)
}

object MessageType extends Enumeration {
  class Val(val mimeType: String) extends super.Val
  val Text = new Val("text/plain")
  val Html = new Val("text/html")
  val Xml = new Val("text/xml")

  def fromBodyPart(part: JBodyPart): Value = values.collectFirst {
    case x: Val if part.isMimeType(x.mimeType) => x
  }.getOrElse(throw new IllegalArgumentException(s"Unsupported MIME type ${part.getContentType}"))
}

class Message(val to: Seq[String],
              val subject: String,
              val message: JBodyPart,
              val from: Option[String] = None,
              val attachments: Seq[JBodyPart] = Nil,
              val cc: Seq[String] = Nil,
              val bcc: Seq[String] = Nil) extends AttachmentSupport {
  def contentAsString = message.getContent().toString()
  def messageType = MessageType.fromBodyPart(message)
}

object MimeBodyPart {
  def apply(text: String) = Text(text)

  def apply(content: Any, mimeType: String): JMimeBodyPart = {
    val mbp = new JMimeBodyPart
    mbp.setContent(content, mimeType)
    mbp.setHeader("Content-Type", mbp.getDataHandler.getContentType)
    mbp
  }

  object Text {
    def apply[Text <% String](text: String): JMimeBodyPart = MimeBodyPart(text, MessageType.Text.mimeType)
  }

  object Xml {
    def apply(xmlString: String): JMimeBodyPart = {
      XML.loadString(xmlString)
      MimeBodyPart(xmlString, MessageType.Xml.mimeType)
    }
  }

  object Html {
    def apply(content: Any): JMimeBodyPart = MimeBodyPart(content, MessageType.Html.mimeType)
  }

  object File {
    def apply(fileName: String): JMimeBodyPart =
      apply(new JFile(fileName)).withSideEffect { _.setFileName(fileName) }

    def apply(file: JFile): JMimeBodyPart =
      (new JMimeBodyPart).withSideEffect { p => p.setDataHandler(new DataHandler(new FileDataSource(file))); p.setDisposition(JPart.ATTACHMENT) }
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
