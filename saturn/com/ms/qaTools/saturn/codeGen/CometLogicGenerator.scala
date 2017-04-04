package com.ms.qaTools.saturn.codeGen

import scala.collection.JavaConversions.asScalaBuffer
import scala.util.Try

import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.TryUtil
import com.ms.qaTools.codeGen.scala.FutureGen
import com.ms.qaTools.codeGen.scala.OptionExpr
import com.ms.qaTools.codeGen.scala.ScalaExpr
import com.ms.qaTools.codeGen.scala.ScalaGen
import com.ms.qaTools.codeGen.scala.SeqTryExpr
import com.ms.qaTools.codeGen.scala.TryExpr
import com.ms.qaTools.saturn.{CometStep => MCometStep}
import com.ms.qaTools.saturn.{PerlRunGroupModifier => MPerlRunGroupModifier}

object CometLogicGenerator {
  def apply(cometWait: MCometStep)(implicit codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] = {
    implicit val appendOptions = ContextAppendOptions(true)
    for {
      cfg         <- Try { Option(cometWait.getCometConfiguration()).getOrElse(throw new Error(s"Configuration for Comet Step: $cometWait cannot be null.")) }      
      dbGen       <- ResourceGenerator(cfg.getDatabase()).rethrow("An exception occurred while generating code for database connection.")
      outputIOGen <- Option(cfg.getOutput()) match {
        case Some(o) => ResourceGenerator(cfg.getOutput()).map(OptionExpr(_)).rethrow("An exception occurred while generating code for output resource.")
        case None    => Try { ScalaExpr { "None" } }
      }
      timeoutGen  <- Option(cfg.getTimeOut()).map { ComplexValueStringGenerator(_) }.getOrElse(Try(TryExpr("\"60\""))).rethrow("An exception occurred while generating code for timeout.")
      tuple       <- cfg.getMessages().map { message =>
        for {
          checkpoint <- ComplexValueStringGenerator(message.getCheckpoint())
          nameValuePairs <- message.getDescriptors().map { descriptor =>
            ComplexValueStringGenerator(descriptor.getName()) flatMap { nameGen =>
              ComplexValueStringGenerator(descriptor.getValue()) map (valueGen => (nameGen, valueGen))
            }
          }.toTrySeq
          types <- Try { message.getDescriptors().map("\"" + _.eClass().getName() + "\"") }
        } yield (checkpoint, nameValuePairs, types)
      }.toTrySeq
      modifiers <- cometWait.getModifiers().collect { case m: MPerlRunGroupModifier => ComplexValueCodeGenerator(m.getPerlCode()) }.toTrySeq.map(SeqTryExpr(_, Some("")))
    } yield StepLogicGenerator.modifierGen(new ScalaGen {
      val (checkpointsGen, pairsGen, types) = tuple.unzip3
      override def generate(): Try[String] = for {
        dbConnection <- dbGen.generate
        outputIO <- outputIOGen.generate
        timeout <- timeoutGen.generate
        checkpoints <- checkpointsGen.map(_.generate).toTrySeq
        pairs <- pairsGen.map { descriptors =>
          descriptors.map {
            case (nameGen, valueGen) => nameGen.generate flatMap (name => valueGen.generate map (value => (name, value)))
          }.toTrySeq
        }.toTrySeq
      } yield {
        val messageDefs = (checkpoints, pairs, types).zipped.toSeq.map {
          case (checkpoint, pairs, dType) =>
            val pairStr = pairs.map { case (name, value) => s"($name, $value)" }
            s"""RunnerMessageDefinition(context, $checkpoint, Seq[(Try[String], Try[String])](${pairStr.mkString(",")}), Seq[String](${dType.mkString(",")}))"""
        }
        s"""CometWaitRunner(context,
                            $dbConnection, 
                            $outputIO, 
                            $timeout, 
                            Seq[Try[MessageDefinition]](${messageDefs.mkString(",")}))"""
      }
    }, cometWait, "CometWait")
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
