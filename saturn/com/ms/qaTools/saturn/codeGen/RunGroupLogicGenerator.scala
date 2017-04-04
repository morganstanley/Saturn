package com.ms.qaTools.saturn.codeGen

import scala.collection.JavaConverters._
import scala.util.Properties
import scala.util.Try

import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.codeGen.scala.ConcatGen
import com.ms.qaTools.codeGen.scala.FutureFnExpr
import com.ms.qaTools.codeGen.scala.FutureGen
import com.ms.qaTools.codeGen.scala.ScalaExpr
import com.ms.qaTools.saturn.NoopTerminal
import com.ms.qaTools.saturn.{RunGroup => MRunGroup}
import com.ms.qaTools.saturn.{Saturn => MSaturn}
import com.ms.qaTools.saturn.listeners.{ScenarioReportListener => MScenarioReportListener}
import com.ms.qaTools.saturn.types.{SaturnStatusEnum, SaturnStatusConditionEnum}

object RunGroupLogicGenerator {
  def apply(runGroup: MRunGroup)(implicit codeGenUtil:SaturnCodeGenUtil): Try[FutureGen] = {
    import codeGenUtil.getWrapped
    val (procedures, runGroups) = runGroup.getRunGroups.asScala.partition(_.isProcedure)
    for {
      runGroups        <- codeGenUtil.sortRunGroups(runGroups)
      procedureCodeGen <- procedures.map{ProcedureGenerator(_)}.toTrySeq
      runGroupCodeGen  <- runGroups.map{NonProcedureGenerator(_)}.toTrySeq
    } yield {
      val runGroupFuturesMap = runGroups.map { x =>
        val affectStatus = x.isEnabled && !x.isInstanceOf[NoopTerminal]
        s"""("${x.getFullName()}", ${x.getName}Future, $affectStatus)"""
      }.mkString("Seq(", ", ", ")")
      val terminals = runGroup.getPassFailTerminals.map(_.getName + "Future").mkString("Seq(", ", ", ")")
      val defaultStatus = s"${classOf[SaturnStatusEnum].getName}.${runGroup.getDefaultStatus.getName}"
      val statusCondition = s"${classOf[SaturnStatusConditionEnum].getName}.${runGroup.getStatusCondition.getName}"
      val scenarioReportListener = runGroup match {
        case saturn: MSaturn if saturn.getListeners.asScala.exists(_.isInstanceOf[MScenarioReportListener]) =>
          "Option(scenarioReportListenerOutput)"
        case _ =>
          "None"
      }
      val resultCode =
        Seq(runGroupFuturesMap, terminals, defaultStatus, statusCondition,
            scenarioReportListener, "context", "iterationMetaData",
            codeGenUtil.getDefaultIterationNo(runGroup)).mkString("runGroupResultsToIterationResult(", ", ", ")")
      FutureFnExpr(ConcatGen(procedureCodeGen ++ runGroupCodeGen :+ ScalaExpr(resultCode), Properties.lineSeparator))
    }
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
