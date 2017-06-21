package com.ms.qaTools.toolkit
import com.ms.qaTools.exceptions.AggregateException
import com.ms.qaTools.interpreter.Interpreter
import com.ms.qaTools.interpreter.InterpreterResult
import com.ms.qaTools.interpreter.InterpreterResultValidator
import com.ms.qaTools.interpreter.NullInterpreterResultValidator
import com.ms.qaTools.interpreter.ValidationResult
import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.TryUtil
import scala.util.Try

case class RunCmdsResult[T <: InterpreterResult](status: Status, commands: Seq[ValidationResult[T]], exception: Option[Throwable] = None) extends Result

case class RunCmds[U, T <: InterpreterResult](commands: Seq[U], interpreter: Interpreter[U, T], resultValidator: InterpreterResultValidator[T] = NullInterpreterResultValidator[T]())
extends Runnable[RunCmdsResult[T]] {
  def run = Try {
    val results = commands.map(c => resultValidator.validate(interpreter.run(c)))
    val failures = results.filter(_.status == Failed)
    RunCmdsResult(if (failures.nonEmpty) Failed else Passed,
      results,
      Option(failures).filter(_.nonEmpty).map(f => new AggregateException("Not all runCmds commands passed.", f.flatMap(_.exception))))
  }
}

object RunCmds {
  def apply[U, T <: InterpreterResult](interpreter: Interpreter[U, T], commandsTry: Seq[Try[U]], checkStrTry: Try[String], validatorFactory: String => InterpreterResultValidator[T]): Try[RunCmds[U, T]] = {
    for {
      commands  <- commandsTry.toTrySeq.rethrow("An exception occurred while creating commands.")
      checkStr  <- checkStrTry.rethrow("An exception occurred while generating checkStr.")
      validator <- Try { validatorFactory(checkStr) }.rethrow("An exception occurred while creating validator.")
    } yield RunCmds(commands, interpreter, validator)
  }.rethrow("An exception occurred while setting up runCmds.")
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
