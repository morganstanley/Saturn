package com.ms.qaTools.toolkit.mail

import scala.util.Try
import com.ms.qaTools.TryUtil
import com.ms.qaTools.io.rowWriter.smtp.SMTPRowWriter
import com.ms.qaTools.io.rowWriter.smtp.SMTPTransport
import com.ms.qaTools.mail.Message
import com.ms.qaTools.toolkit.Failed
import com.ms.qaTools.toolkit.Passed
import com.ms.qaTools.toolkit.Result
import com.ms.qaTools.toolkit.Runnable
import com.ms.qaTools.toolkit.Status
import com.ms.qaTools.io.rowWriter.smtp.SMTPTransport
import com.ms.qaTools.msResource.MSResource

case class MailResult(override val status: Status,
                      override val exception: Option[Throwable] = None,
                      val message: Message) extends Result

case class Mail(message: Message, smtpRowWriter: SMTPRowWriter) extends Runnable[MailResult] {
  def run = {
    Try { smtpRowWriter.write(Iterator.single(message)) }.rethrow("An exception occurred while running mail.").map(_ => MailResult(Passed(), None, message))
  }.recover { case t: Throwable => MailResult(Failed(), Option(t), message) }
}

object Mail {
  def apply(message: Try[Message]): Try[Mail] =
    for { m <- message.rethrow("An exception occurred while creating message.") } yield new Mail(m, new SMTPRowWriter(SMTPTransport(MSResource().getMSProperty("mail.smtp.host").getOrElse(throw new Error("Could not find the default SMTP host.")))))

  def apply(message: Try[Message], smtp: Try[SMTPTransport]): Try[Mail] =
    for {
      m <- message.rethrow("An exception occurred while creating message.")
      t <- smtp.rethrow("An exception occurrred while creating the smtp transport.")
    } yield new Mail(m, new SMTPRowWriter(t))
}/*
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
