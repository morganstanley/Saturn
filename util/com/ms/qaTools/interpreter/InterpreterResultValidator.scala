package com.ms.qaTools.interpreter

import com.ms.qaTools._
import com.ms.qaTools.toolkit.Result
import com.ms.qaTools.toolkit.Pass
import com.ms.qaTools.toolkit.Fail
import com.ms.qaTools.toolkit.Status
import com.ms.qaTools.toolkit.NotRun
import com.ms.qaTools.toolkit.Passed
import com.ms.qaTools.toolkit.Failed



case class ValidationResult[InterpreterResultType <: InterpreterResult](override val status: Status = NotRun(),
  interpreterResult: InterpreterResultType = NullInterpreterResult,
  override val exception: Option[Throwable] = None,
  override val errorMessage: Option[String] = None,
  message: Option[String] = None) extends Result
abstract class InterpreterResultValidator[InterpreterResultType <: InterpreterResult] {
  def validate(result: InterpreterResultType): ValidationResult[InterpreterResultType]
}

trait ShellResultValidator extends InterpreterResultValidator[ShellInterpreterResult] {
  require(checkStr != null, "Check string in shell result validator is null.")
  val checkStr: String

  object CheckStrFound {
    def unapply(message: Option[String]): Boolean = message match {
      case Some(messageStr) => checkStr.r.findFirstIn(messageStr).isDefined
      case None => false
    }
  }
  override def validate(shellResult: ShellInterpreterResult): ValidationResult[ShellInterpreterResult] = {
    if(shellResult.failed) ValidationResult(Failed(), shellResult, exception = Option(new Exception("Validation failed.")))
    else shellResult.stdout match {
      case CheckStrFound() => ValidationResult(Passed(), shellResult, message = Option("String found: '" + checkStr + "'. Setting status to PASS."))
      case _               => ValidationResult(Failed(), shellResult, exception = Option(new Exception("String not found: '" + checkStr + "'. Setting status to FAIL.")))
    }
  }
}

case class ShellPassValidator(override val checkStr: String) extends ShellResultValidator
case class ShellFailValidator(override val checkStr: String) extends ShellResultValidator {
  override def validate(shellResult: ShellInterpreterResult): ValidationResult[ShellInterpreterResult] = {
    if(shellResult.failed) ValidationResult(Failed(), shellResult, exception = Option(new Exception("Validation failed.")))
    else shellResult.stdout match {
      case CheckStrFound() => ValidationResult(Failed(), shellResult, message = Option("String found: '" + checkStr + "'. Setting status to FAIL."))
      case _               => ValidationResult(Passed(), shellResult, exception = Option(new Exception("Validation failed: String not found: '" + checkStr + "'. Setting status to PASS.")))
    }
  }
}

case class NullInterpreterResultValidator[InterpreterResultType <: InterpreterResult]()extends InterpreterResultValidator[InterpreterResultType] {
  def validate(result: InterpreterResultType): ValidationResult[InterpreterResultType] = result.status match {
    case Passed() => ValidationResult(Passed(), result)
    case Failed() => ValidationResult(Failed(), result, result.exception)
    case NotRun() => ValidationResult(NotRun(), result)
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
