package com.ms.qaTools.saturn.codeGen

import scala.collection.JavaConversions.asScalaBuffer
import scala.util.Try

import org.apache.commons.lang.StringEscapeUtils.escapeJava
import org.eclipse.emf.ecore.EObject

import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.codeGen.scala.FutureGen
import com.ms.qaTools.codeGen.scala.ScalaGen
import com.ms.qaTools.codeGen.scala.SeqTryExpr
import com.ms.qaTools.codeGen.scala.TryGen
import com.ms.qaTools.saturn.{AbstractRunGroup => MAbstractRunGroup}
import com.ms.qaTools.saturn.{RunCmdsStep => MRunCmdsStep}
import com.ms.qaTools.saturn.types.InterpretersEnum

object RunCmdsLogicGenerator {
  def apply(runCmds: MRunCmdsStep)(implicit codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] =
    for {
      cfg         <- Try { val c = runCmds.getRunCmdsConfiguration; if (c == null) throw new NullPointerException(s"Configuration for RunCmds Step: $runCmds cannot be null.") else c }
      checkStrGen <- ComplexValueStringGenerator(cfg.getCheckStr)
      attributes = Iterator.iterate(runCmds: EObject)(_.eContainer).takeWhile(_ != null).collect {
        case x: MAbstractRunGroup => x
      }.foldLeft((Set.empty[String], Set.empty[String])) {
        case ((as0, rs0), x) =>
          val rs = rs0 ++ x.getResources.map(_.getName)
          (as0 ++ x.getAttributes.map(_.getName).filterNot(rs), rs)
      }._1
      (interpreter, resultType, commandType) <- Try {
        cfg.getInterpreter() match {
          case InterpretersEnum.DML    => ("DmlInterpreter()", "DmlInterpreterResult", "String")
          case InterpretersEnum.GROOVY =>
            val env = attributes.map(x => s"""("$x", $x)""").mkString("Map[String, String](", ", ", ")")
            (s"GroovyInterpreter(new groovy.lang.Binding($env))", "GroovyInterpreterResult", "String")
          case InterpretersEnum.PERL   => ("CommandExecutor", "CommandExecutorResult[_]", "Command[Any]")
          case InterpretersEnum.SCALA  => ("CommandExecutor", "CommandExecutorResult[_]", "Command[Any]")
          case InterpretersEnum.SHELL  =>
            val env = attributes.map(x => s"""("$x", $x)""").mkString("Seq(", ", ", ")")
            (s"ShellInterpreter(tee = true, extraEnv = $env)", "ShellInterpreterResult", "String")
        }
      }
      validator   <- Try {
        val action = cfg.getCheckStrAction.toString.toLowerCase.capitalize
        val interpreter = cfg.getInterpreter.toString.toLowerCase.capitalize
        action match {
          case "None" => s"(checkStr: String) => NullInterpreterResultValidator[$resultType]()"
          case _      => s"(checkStr: String) => ${interpreter}${action}Validator(checkStr)"
        }
      }
      enabledCommands <- Try { cfg.getCommands().filter { _.isEnabled() } }
      commandsGen     <- if (cfg.getInterpreter() == InterpretersEnum.SCALA || cfg.getInterpreter() == InterpretersEnum.PERL) {
                           enabledCommands.map { c =>
                             for {
                               cmd <- ComplexValueCodeGenerator(c)
                             } yield new TryGen {
                               override def generate(): Try[String] =
                                 for {
                                   cmdStr <- cmd.generate()
                                 } yield s"""Try{ 
                                               new Command[Any]{
                                                 override def toString = "${escapeJava(cmdStr)}"
                                                 def execute: Try[Any] = $cmdStr
                                               }
                                             }"""
                             }
                           }.toTrySeq
                         }
      else {
        enabledCommands.map { c => ComplexValueStringGenerator(c) }.toTrySeq
      }
    } yield StepLogicGenerator.modifierGen(new ScalaGen {
      override def generate(): Try[String] = for {
        commands <- SeqTryExpr(commandsGen).generate
        checkStr <- checkStrGen.generate
      } yield s"""RunCmdsRunner(context, 
                                $interpreter,
                                $commands,
                                $checkStr,
                                $validator)"""
    }, runCmds, s"RunCmds[$commandType, $resultType]")
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
