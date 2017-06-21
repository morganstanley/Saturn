package com.ms.qaTools.saturn.codeGen

import scala.collection.JavaConversions.asScalaBuffer
import scala.util.Try

import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.codeGen.scala.ConcatGen
import com.ms.qaTools.codeGen.scala.ForAssignment
import com.ms.qaTools.codeGen.scala.ForTryExpr
import com.ms.qaTools.codeGen.scala.FutureGen
import com.ms.qaTools.codeGen.scala.ScalaExpr
import com.ms.qaTools.codeGen.scala.ScalaGen
import com.ms.qaTools.codeGen.scala.TryExpr
import com.ms.qaTools.codeGen.scala.TryGen
import com.ms.qaTools.saturn.{ProcedureCallStep => MProcedureCallStep}
import com.ms.qaTools.saturn.modules.procedureCallModule.AbstractArgument
import com.ms.qaTools.saturn.modules.procedureCallModule.AttributeArgument
import com.ms.qaTools.saturn.modules.procedureCallModule.ResourceArgument
import com.ms.qaTools.saturn.utils.SaturnEObjectUtils.SaturnEObjectHelper

object ProcedureArgumentGenerator {
  def apply(parameter:AbstractArgument)(implicit codeGenUtil:SaturnCodeGenUtil):Try[ForAssignment] = {
    import codeGenUtil.getWrapped
    val procedure = parameter.containingRunGroup.getOrElse(throw new Exception(s"Parameter: $parameter has no containing runGroup."))
    parameter match {
      case a:AttributeArgument => {
        ComplexValueStringGenerator(a.getValue()).map{valueGen => ForAssignment(a.getName(),
                                                                                valueGen.withRethrow(s"An exception occurred while evaluating procedure call '${procedure.getName}' complex value argument:'${a.getName}'."))}
      }
      case r:ResourceArgument  => {
        ResourceGenerator(r.getResource()).map{valueGen => ForAssignment(r.getName(),
                                                                         valueGen.withRethrow(s"An exception occurred while evaluating procedure call '${procedure.getName}' resource argument:'${r.getName}'."))}
      }
    }
  }
}

object ProcedureCallLogicGenerator {
  def apply(procedureCall:MProcedureCallStep)(implicit codeGenUtil:SaturnCodeGenUtil):Try[FutureGen] = for {
    procedureCallConfiguration <- Try{procedureCall.getProcedureCallConfiguration()}
    procNameGen                <- ComplexValueCodeGenerator.genPure(procedureCallConfiguration.getRunGroup()).rethrow("An exception occurred while generating referent name, referent name must be only text.")
    argumentsAssignmentGen     <- procedureCallConfiguration.getArguments().map{argument => ProcedureArgumentGenerator(argument)}.toTrySeq
    argumentsGen               <- Try{ConcatGen(procedureCallConfiguration.getArguments().map{argument => ScalaExpr(s"${argument.getName()} = ${argument.getName()}")}, ", ")}
    metaDataGen                <- Try{ConcatGen(procedureCallConfiguration.getArguments().map{argument => ScalaExpr(s"""argsMetaContext.appendMetaDataContext("${argument.getName}", ${argument.getName})""")}, "\n")}
    procCallGen                <- Try {
      new ScalaGen() {
        def generate: Try[String] = for {
          procNameStr  <- procNameGen.generate()
          argumentsStr <- argumentsGen.generate()
          metaDataStr  <- metaDataGen.generate()
        } yield s"""context.appendMetaDataContext("ProcName", "$procNameStr")
                    val argsMetaContext = context.appendMetaDataContext("Arguments", "ProcedureCall Arguments")
                    $metaDataStr
                    ProcedureCallResult.fromIteratorResult("$procNameStr", $procNameStr(context)($argumentsStr), context, iterationMetaData, ${codeGenUtil.getDefaultIterationNo(procedureCall)})"""

      }
    }
    procCallForGen             <- Try { if(argumentsAssignmentGen.isEmpty) TryExpr(procCallGen) else ForTryExpr(argumentsAssignmentGen, procCallGen) }
  } yield new FutureGen() {
    def generate:Try[String] = for {
      procCallForStr      <- procCallForGen.generate()
    } yield  s""" {
    val procFuture = $procCallForStr
    tf2ft(procFuture)
  }"""
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
