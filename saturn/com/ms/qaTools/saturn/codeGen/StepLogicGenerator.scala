package com.ms.qaTools.saturn.codeGen

import scala.collection.JavaConversions.asScalaBuffer
import scala.util.Try

import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.codeGen.scala.ConcatGen
import com.ms.qaTools.codeGen.scala.FutureExpr
import com.ms.qaTools.codeGen.scala.FutureGen
import com.ms.qaTools.codeGen.scala.ScalaExpr
import com.ms.qaTools.codeGen.scala.ScalaGen
import com.ms.qaTools.codeGen.scala.TryExpr
import com.ms.qaTools.saturn.{ AbstractRunGroup => MAbstractRunGroup }
import com.ms.qaTools.saturn.{ AbstractStep => MAbstractStep }
import com.ms.qaTools.saturn.{ CometStep => MCometStep }
import com.ms.qaTools.saturn.{ CpsStep => MCpsStep }
import com.ms.qaTools.saturn.{ DSConvertStep => MDSConvertStep }
import com.ms.qaTools.saturn.{ DSValidatorStep => MDSValidatorStep }
import com.ms.qaTools.saturn.{ DataCompareStep => MDataCompareStep }
import com.ms.qaTools.saturn.{ DataCompareSummaryStep => MDataCompareSummaryStep }
import com.ms.qaTools.saturn.{ DocumentumStep => MDocumentumStep }
import com.ms.qaTools.saturn.{ ExtractDDLStep => MExtractDDLStep }
import com.ms.qaTools.saturn.{ FailTerminal => MFailTerminal }
import com.ms.qaTools.saturn.{ FixManipStep => MFixManipStep }
import com.ms.qaTools.saturn.{ JiraStep => MJiraStep }
import com.ms.qaTools.saturn.{ KronusStep => MKronusStep }
import com.ms.qaTools.saturn.{ MQStep => MMQStep }
import com.ms.qaTools.saturn.{ MailStep => MMailStep }
import com.ms.qaTools.saturn.{ NoopTerminal => MNoopTerminal }
import com.ms.qaTools.saturn.{ P4Step => MP4Step }
import com.ms.qaTools.saturn.{ PassTerminal => MPassTerminal }
import com.ms.qaTools.saturn.{ PerlRunGroupModifier => MPerlRunGroupModifier }
import com.ms.qaTools.saturn.{ ProcedureCallStep => MProcedureCallStep }
import com.ms.qaTools.saturn.{ PsManagerStep => MPsManagerStep }
import com.ms.qaTools.saturn.{ ReferenceStep => MReferenceStep }
import com.ms.qaTools.saturn.{ RunCmdsStep => MRunCmdsStep }
import com.ms.qaTools.saturn.{ RunGroup => MRunGroup }
import com.ms.qaTools.saturn.{ SQLStep => MSQLStep }
import com.ms.qaTools.saturn.{ Saturn => MSaturn }
import com.ms.qaTools.saturn.{ SaturnPackage => MSaturnPackage }
import com.ms.qaTools.saturn.{ SingularityStep => MSingularityStep }
import com.ms.qaTools.saturn.{ SoapIOStep => MSoapIOStep }
import com.ms.qaTools.saturn.{ VmsStep => MVmsStep }
import com.ms.qaTools.saturn.{ XSplitStep => MXSplitStep }
import com.ms.qaTools.saturn.{ Xml2CsvStep => MXml2CsvStep }
import com.ms.qaTools.saturn.{ XmlDiffStep => MXmlDiffStep }
import com.ms.qaTools.saturn.{ XmlGenStep => MXmlGenStep }
import com.ms.qaTools.saturn.{ XmlManipStep => MXmlManipStep }
import com.ms.qaTools.saturn.{ XmlValidatorStep => MXmlValidatorStep }
import com.ms.qaTools.saturn.kronus.Backport
import com.ms.qaTools.saturn.types.{ RepetitionActionsEnum => MRepetitionActionsEnum }

case class NotImplementedException(message: String) extends Exception(message)

object StepLogicGenerator {
  def modifierGen(runnerGen: ScalaGen, 
                  rg: MAbstractRunGroup, 
                  runnableType: String)(implicit codeGenUtil: SaturnCodeGenUtil) = new FutureGen {
    val iterationNo = codeGenUtil.getDefaultIterationNo(rg)
    def generate() = rg.getModifiers.collect {case m: MPerlRunGroupModifier if m.isEnabled => m}.toSeq match {
      case Seq() => runnerGen.generate.map { runnerStr =>
        s"Future(runnableToIterationResult($runnerStr, context, iterationMetaData, $iterationNo))"
      }
      case modifiers => for {
        runnerStr <- runnerGen.generate
        modifiers <- modifiers.map { m =>
          ComplexValueCodeGenerator(m.getPerlCode()).map(_.withMethod("getOrElse", ScalaExpr(s"""throw new Exception("Error in configurators for ${rg.getName}.")""")))
        }.toTrySeq.map(modifiers => if (modifiers.isEmpty) ScalaExpr("Seq()") else ConcatGen(modifiers, "++", "{", "}"))
        modifiersStr <- modifiers.generate
      } yield s"""Future {
                    val modifiers: Seq[$runnableType => $runnableType] = $modifiersStr
                    val runnableTry = $runnerStr.map { runnable =>
                      modifiers.foldLeft(runnable) { case (accu, modifier) =>
                        modifier(accu)
                      }
                    }
                    runnableToIterationResult(runnableTry, context, iterationMetaData, $iterationNo)
                  }"""
    }
  }

  def apply(runGroup: MAbstractRunGroup)(implicit codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] =
    runGroup match {
      case comet: MCometStep                           => CometLogicGenerator(comet)
      case cps: MCpsStep                               => CPSLogicGenerator(cps)
      case dataCompare: MDataCompareStep               => DataCompareLogicGenerator(dataCompare)
      case dataCompareSummary: MDataCompareSummaryStep => throw new NotImplementedException("Generator for dataCompareSummary not implemented")
      case documentum: MDocumentumStep                 => throw new NotImplementedException("Generator for documentum not implemented")
      case dsConvert: MDSConvertStep                   => DsConvertLogicGenerator(dsConvert)
      case dsValidator: MDSValidatorStep               => throw new NotImplementedException("Generator for dsValidator not implemented")
      case extractDDL: MExtractDDLStep                 => throw new NotImplementedException("Generator for extractDDL not implemented")
      case failTerminal: MFailTerminal                 => Try { FutureExpr(TryExpr(s"""IterationResult(Passed(), context,  iterationMetaData, TerminalResult(Some(Failed()), ${failTerminal.getRepetitionAction() == MRepetitionActionsEnum.BREAK}), ${codeGenUtil.getDefaultIterationNo(runGroup)})""")) }
      case fixManip: MFixManipStep                     => throw new NotImplementedException("Generator for fixManip not implemented")
      case jira: MJiraStep                             => throw new NotImplementedException("Generator for jira not implemented")
      case kronus: MKronusStep                         => KronusCodeGen(Backport()).genStep(kronus)
      case mail: MMailStep                             => MailLogicGenerator(mail)
      case mq: MMQStep                                 => MQLogicGenerator(mq)
      case noopTerminal: MNoopTerminal                 => Try { FutureExpr(TryExpr(s"""IterationResult(Passed(), context,  iterationMetaData, TerminalResult(None, ${noopTerminal.getRepetitionAction() == MRepetitionActionsEnum.BREAK}),${codeGenUtil.getDefaultIterationNo(runGroup)})""")) }
      case p4: MP4Step                                 => throw new NotImplementedException("Generator for p4 not implemented")
      case passTerminal: MPassTerminal                 => Try { FutureExpr(TryExpr(s"""IterationResult(Passed(), context,  iterationMetaData, TerminalResult(Some(Passed()), ${passTerminal.getRepetitionAction() == MRepetitionActionsEnum.BREAK}), ${codeGenUtil.getDefaultIterationNo(runGroup)})""")) }
      case procedureCall: MProcedureCallStep           => ProcedureCallLogicGenerator(procedureCall)
      case psManager: MPsManagerStep                   => throw new NotImplementedException("Generator for psManager not implemented")
      case reference: MReferenceStep                   => throw new NotImplementedException("Generator for reference not implemented")
      case runCmds: MRunCmdsStep                       => RunCmdsLogicGenerator(runCmds)
      case saturn: MSaturn                             => RunGroupLogicGenerator(saturn)
      case runGroup: MRunGroup                         => RunGroupLogicGenerator(runGroup)
      case singularity: MSingularityStep               => throw new NotImplementedException("Generator for singularity not implemented")
      case soapIO: MSoapIOStep                         => SoapIOLogicGenerator(soapIO)
      case sql: MSQLStep                               => SQLLogicGenerator(sql)
      case vms: MVmsStep                               => throw new NotImplementedException("Generator for vms not implemented")
      case xml2csv: MXml2CsvStep                       => Xml2CsvLogicGenerator(xml2csv)
      case xmlDiff: MXmlDiffStep                       => throw new NotImplementedException("Generator for xmlDiff not implemented")
      case xmlGen: MXmlGenStep                         => XmlGenLogicGenerator(xmlGen)
      case xmlManip: MXmlManipStep                     => XmlManipLogicGenerator(xmlManip)
      case xmlValidator: MXmlValidatorStep             => throw new NotImplementedException("Generator for xmlValidate not implemented")
      case xSplit: MXSplitStep                         => throw new NotImplementedException("Generator for xSplit not implemented")
      case invalid: MAbstractStep                      => throw new NotImplementedException(s"Unkown step $invalid is not implemented.")
    }
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
