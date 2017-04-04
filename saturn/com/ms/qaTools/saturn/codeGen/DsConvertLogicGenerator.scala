package com.ms.qaTools.saturn.codeGen

import scala.collection.JavaConversions.asScalaBuffer
import scala.util.Try

import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.TryUtil
import com.ms.qaTools.codeGen.scala.FutureGen
import com.ms.qaTools.codeGen.scala.ScalaGen
import com.ms.qaTools.codeGen.scala.SeqTryExpr
import com.ms.qaTools.codeGen.scala.TryGen
import com.ms.qaTools.saturn.DSConvertStep
import com.ms.qaTools.saturn.modules.dsConvertModule.AbstractOperation
import com.ms.qaTools.saturn.modules.dsConvertModule.SimpleOperation

object DsConvertLogicGenerator {
  def genOperationCode(operation: AbstractOperation, i: Int): Try[(TryGen, TryGen, Seq[TryGen])] = {
    operation match {
      case simple: SimpleOperation => for {
        sourceIOGen <- ResourceGenerator(simple.getSource)(appendOptions = ContextAppendOptions(true, (s) => s"Source_$i")).rethrow("An exception occurred generating resource code for the source.")
        targetIOGen <- ResourceGenerator(simple.getTarget)(appendOptions = ContextAppendOptions(true, (s) => s"Target_$i")).rethrow("An exception occurred generating resource code for the target.")
        ignoreCols <- Try(simple.getIgnoreCols.toList).getOrElse(Nil).map(ComplexValueStringGenerator(_)).toTrySeq
        // TODO consider value simple.isNumberDuplicateCols or disable from GUI
      } yield (sourceIOGen, targetIOGen, ignoreCols)
      case unknown => Try { throw new Exception(s"Unknown DsConvert operation: $unknown.") }
    }
  }

  def apply(dsConvert: DSConvertStep)(implicit codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] = for {
    cfg <- Try { dsConvert.getDSConvertConfiguration }
    operations <- Try { cfg.getOperations.filter { _.isEnabled } }
    resourcesGen <- operations.zipWithIndex.map { Function.tupled(genOperationCode) }.toTrySeq
  } yield StepLogicGenerator.modifierGen(new ScalaGen {
    val (sources, targets, ignoreColsSeq) = resourcesGen.unzip3
    override def generate(): Try[String] = for {
      sourceStr <- SeqTryExpr(sources).generate
      targetStr <- SeqTryExpr(targets).generate
      ignoreColsStr <- ignoreColsSeq.map(ignoreCols => SeqTryExpr(ignoreCols).generate).toTrySeq
    } yield s"""DsConvertRunner(context, 
                                $sourceStr,
                                $targetStr,
                                ${ignoreColsStr.mkString("Seq(", ",", ")")})"""
  }, dsConvert, "DsConvertAggregate")
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
