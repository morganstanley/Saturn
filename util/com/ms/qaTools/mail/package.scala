package com.ms.qaTools

import javax.mail.{ Message => JMessage }
import javax.mail.Part
import javax.mail.{ Session => JSession }
import javax.mail.{ Transport => JTransport }
import javax.mail.internet.{ InternetAddress => JInternetAddress }
import javax.mail.internet.{ MimeBodyPart => JMimeBodyPart }
import javax.mail.internet.{ MimeMessage => JMimeMessage }
import javax.mail.internet.{ MimeMultipart => JMimeMultipart }
import com.ms.qaTools.mail.Message

package object mail {
  implicit def toMimeMessage(message: Message)(implicit session: JSession) = {
    val m = new JMimeMessage(session)
    message.from.fold(m.setFrom())(from => m.setFrom(new JInternetAddress(from)))
    message.to.foreach(m.addRecipients(JMessage.RecipientType.TO, _))
    message.cc.foreach(m.addRecipients(JMessage.RecipientType.CC, _))
    message.bcc.foreach(m.addRecipients(JMessage.RecipientType.BCC, _))
    m.setSubject(message.subject)
    val content = new JMimeMultipart
    content.addBodyPart(message.message)
    message.attachments.foreach { content.addBodyPart(_) }
    m.setContent(content)
    m
  }
  
  implicit def toMailMessage(msg: javax.mail.Message): Message = {
    def getRecipients0(t: JMessage.RecipientType) = Option(msg.getRecipients(t)).fold(Seq[String]()) {_ map {_.toString}}
    val to = getRecipients0(JMessage.RecipientType.TO)
    val cc = getRecipients0(JMessage.RecipientType.CC)
    val bcc = getRecipients0(JMessage.RecipientType.BCC)
    val from = msg.getFrom().headOption.map {_.toString()}
    val (messageBodyPart, attachments) = msg.getContent() match {
        case m: JMimeMultipart => (m.getBodyPart(0), (1 until m.getCount()).map {m.getBodyPart(_)})
        case m: JMimeBodyPart => (m, Nil)
      }    
    new Message(to, msg.getSubject(), messageBodyPart, from, attachments, cc, bcc)
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
