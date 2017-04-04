package com.ms.qaTools.saturn.codeGen

import scala.collection.JavaConversions.asScalaBuffer
import scala.util.Try

import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.codeGen.scala.ConcatGen
import com.ms.qaTools.codeGen.scala.ConnectTry
import com.ms.qaTools.codeGen.scala.ForAssignment
import com.ms.qaTools.codeGen.scala.ForTryExpr
import com.ms.qaTools.codeGen.scala.ScalaExpr
import com.ms.qaTools.codeGen.scala.ScalaGen
import com.ms.qaTools.codeGen.scala.TryFnExpr
import com.ms.qaTools.codeGen.scala.TryGen
import com.ms.qaTools.saturn.{IncludeFile => MIncludeFile}
import com.ms.qaTools.saturn.{Saturn => MSaturn}

object IncludeFileInstanceGenerator {
  def apply(includeFile:MIncludeFile)(implicit parentCodeGenUtil:SaturnCodeGenUtil):Try[ForAssignment] = {
    implicit val codeGenUtil:SaturnCodeGenUtil = parentCodeGenUtil.getIncludeFileCodeGenUtil(includeFile)
    import codeGenUtil.getWrapped
    val includeFileSaturn:MSaturn = codeGenUtil.saturn
    Try { ForAssignment(includeFile.getName(), ConnectTry(TryFnExpr(includeFileSaturn.getClassName + "()(context)"), includeFileSaturn.getName, false)) }
  }
}

object ProcedureMethodGenerator {
  
}

//procedure call logic...
//val after = P.P0("B")
//val procRes = after.map{result => Try{ IterationResult(Passed(), context, iterationMetaData, result.asInstanceOf[Try[IteratorResult[Result]]]) } }
//procRes 

object IncludeFileClassGenerator {
  def apply(includeFileSaturn:MSaturn)(implicit parentCodeGenUtil:SaturnCodeGenUtil):Try[ScalaGen] = {
    implicit val codeGenUtil:SaturnCodeGenUtil = parentCodeGenUtil.getIncludeFileCodeGenUtil(includeFileSaturn)
    import codeGenUtil.getWrapped
    val preIterationObjects = {includeFileSaturn.getIncludeFiles() ++ includeFileSaturn.getPreIterationObjects}.toSeq
    val preIterationObjectForAssignmentsTry = preIterationObjects.map{o => IterationObjectGenerator(o)(codeGenUtil) }.toTrySeq
    
    val procedures = includeFileSaturn.getRunGroups().filter{_.isProcedure()}

    val classGenTry = for {
      parametersGen  <- preIterationObjects.map{p => ValDefinitionGenerator(p)(codeGenUtil) }.toTrySeq.map{parameterGens => ConcatGen(parameterGens, ", ")}
      proceduresGen  <- procedures.map{procedure => ProcedureGenerator(procedure)(codeGenUtil) }.toTrySeq.map{procedureGens => ConcatGen(procedureGens, "\n\n")}
    } yield new ScalaGen() {
      def generate:Try[String] = for {
        parametersStr <- parametersGen.generate()
        proceduresStr <- proceduresGen.generate()
        classParmStr  <- Try{ (Seq("context: IterationContext") ++ Option(parametersStr).filter(_.nonEmpty)).mkString(", ") }
      } yield s"""class ${includeFileSaturn.getClassName}($classParmStr)(implicit sc: SaturnExecutionContext) extends java.io.Closeable {
          implicit val ec = sc.executionContext
          implicit val locale = java.util.Locale.US

          def close() = context.closeAll

          $proceduresStr
        }"""
    }    
    
    val objectGenTry = for {
      preIterationObjectForAssignments <- preIterationObjectForAssignmentsTry      
    } yield new ScalaGen() {
      val parms = preIterationObjectForAssignments.map{_.name}.mkString(", ")
      val iterContextString = s"""IterationContext("${includeFileSaturn.getName}", Some(context), None)"""      
      val classParms = (Seq(iterContextString) ++ Option(parms).filter(_.nonEmpty)).mkString(", ")
      val applyGen = ForTryExpr(preIterationObjectForAssignments, ScalaExpr(s"new ${includeFileSaturn.getClassName}($classParms)"))
      def generate:Try[String] = applyGen.generate().map{applyStr => s"""object ${includeFileSaturn.getClassName} {
        def apply()(context: IteratorContext)(implicit sc: SaturnExecutionContext):Try[${includeFileSaturn.getClassName}] = $applyStr
      }"""}
    }

    for {
      classGen  <- classGenTry
      objectGen <- objectGenTry
    } yield ConcatGen(Seq(classGen, objectGen), "\n")
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
