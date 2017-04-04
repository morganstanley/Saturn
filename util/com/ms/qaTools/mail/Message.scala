package com.ms.qaTools.mail

import java.io.{ File => JFile }

import scala.xml.Node
import scala.xml.XML

import com.ms.qaTools._
import com.ms.qaTools.io.BaseFileIO
import com.ms.qaTools.io.FileAttachmentUtil

import javax.activation.DataHandler
import javax.activation.FileDataSource
import javax.mail.{ BodyPart => JBodyPart }
import javax.mail.{ Part => JPart }
import javax.mail.internet.{ MimeBodyPart => JMimeBodyPart }

trait AttachmentSupport {
  this: Message =>
  def asFiles(attachments: Seq[BaseFileIO]) = attachments.map(_.file).toTrySeq.getOrElse(throw new Exception("Error creating attachment files."))
  def asAttachments(attachments: Seq[BaseFileIO]) = attachments.map(_.asAttachment).toTrySeq.map(_.flatten).rethrow("Error attaching files").get
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
  def apply(node: Node) = Xml(node)

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
    def apply(node: Node): JMimeBodyPart = MimeBodyPart(node, MessageType.Xml.mimeType)
    def apply(xmlString: String): JMimeBodyPart = apply(XML.loadString(xmlString))
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
COPYRIGHT NOTICE AND DISCLAIMER
Copyright (c) 2009-2016, Contributor

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License, version 3 for more details.

You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
*/
