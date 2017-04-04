package com.ms.qaTools.saturn.codeGen

import scala.collection.JavaConversions.asScalaBuffer
import scala.util.Try
import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.codeGen.scala.FutureGen
import com.ms.qaTools.codeGen.scala.SeqTryExpr
import com.ms.qaTools.codeGen.scala.TryGen
import com.ms.qaTools.saturn.{MailStep => MMailStep}
import com.ms.qaTools.saturn.modules.mailModule.MailRecipient
import com.ms.qaTools.saturn.modules.mailModule.MessageTypeEnum
import com.ms.qaTools.saturn.modules.mailModule.RecipientTypeEnum
import com.ms.qaTools.codeGen.scala.ScalaGen

object MailLogicGenerator {

  def genRecipientTryExpr(recipient: MailRecipient): Try[TryGen] = ComplexValueStringGenerator(recipient)
  def genRecipientsTryExpr(recipients: Seq[MailRecipient], recipientType: RecipientTypeEnum): Try[SeqTryExpr] = {
    val typedRecipients = recipients.filter(_.getType() == recipientType)
    if (typedRecipients.isEmpty)
      Try { SeqTryExpr(Seq()) }
    else
      typedRecipients.map(genRecipientTryExpr(_)).toTrySeq.map(SeqTryExpr(_))
  }
  def apply(mail: MMailStep)(implicit codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] = {
    for {
      cfg              <- Try { val c = mail.getMailConfiguration; if (c == null) throw new NullPointerException(s"Configuration for Mail Step: $mail cannot be null.") else c }
      subjectGen       <- ComplexValueStringGenerator(cfg.getSubject())
      messageGen       <- ComplexValueStringGenerator(cfg.getMessage())
      messageType      <- Try { cfg.getMessageType() }
      recipients       <- Try { cfg.getRecipients() }
      toRecipientsGen  <- genRecipientsTryExpr(recipients, RecipientTypeEnum.TO)
      ccRecipientsGen  <- genRecipientsTryExpr(recipients, RecipientTypeEnum.CC)
      bccRecipientsGen <- genRecipientsTryExpr(recipients, RecipientTypeEnum.BCC)
      attachmentsGen   <- cfg.getAttachments().map { ResourceGenerator(_) }.toTrySeq.map(SeqTryExpr(_))
    } yield StepLogicGenerator.modifierGen(new ScalaGen {
      override def generate(): Try[String] = for {
        subjectStr       <- subjectGen.generate
        messageStr       <- messageGen.generate
        toRecipientsStr  <- toRecipientsGen.generate
        ccRecipientsStr  <- ccRecipientsGen.generate
        bccRecipientsStr <- bccRecipientsGen.generate
        attachmentsStr   <- attachmentsGen.generate
        messageTypeStr   <- Try {
          messageType match {
            case MessageTypeEnum.TEXT => "com.ms.qaTools.saturn.modules.mailModule.MessageTypeEnum.TEXT"
            case MessageTypeEnum.HTML => "com.ms.qaTools.saturn.modules.mailModule.MessageTypeEnum.HTML"
            case MessageTypeEnum.XML  => "com.ms.qaTools.saturn.modules.mailModule.MessageTypeEnum.XML"
            case _                    => throw new IllegalArgumentException(s"No such message type: $messageType")
          }
        }
      } yield s"""MailRunner(context, 
                             $subjectStr,
                             $messageStr,
                             $toRecipientsStr,
                             $ccRecipientsStr,
                             $bccRecipientsStr,
                             $attachmentsStr,
                             ${cfg.isAttachAsLink()},
                             $messageTypeStr)"""
    }, mail, "Mail")
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
