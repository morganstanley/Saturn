package com.ms.qaTools.saturn.lint

import scala.util.Try

import com.ms.qaTools.saturn.{Saturn => MSaturn}
import com.ms.qaTools.saturn.codeGen.SaturnCodeGenUtil
import com.ms.qaTools.saturn.lint.validators.DeprecatedValidator
import com.ms.qaTools.saturn.lint.validators.LintValidator
import com.ms.qaTools.saturn.lint.validators.NameValidator
import com.ms.qaTools.saturn.lint.validators.ProcedureCallValidator
import com.ms.qaTools.saturn.lint.validators.ReferenceValidator
import com.ms.qaTools.saturn.lint.validators.RepetitionValidator
import com.ms.qaTools.saturn.lint.validators.SaturnValidator
import com.ms.qaTools.toolkit.Failed
import com.ms.qaTools.toolkit.Passed
import com.ms.qaTools.toolkit.Runnable



/*
 * *** ERROR ***
 * Object names must be unique within a given scope
 * Object names must be well formed
 *  Attributes, Resources, RunGroups, ColumnMappings, ForIterators, ProcedureParameters
 *  
 * Deprecated features and deprecated classes
 * 
 * Device resources may only be used in the following places:
 *  AbstractRunGroup Resources
 *  Procedure Call Parameters
 *  Procedure Parameter default values
 *  DataSetResource deviceResource
 *  SQLModule
 *  MQModule
 *  CPSModule
 *  SoapIOModule
 * 
 * Procedures
 *   Non-mandatory arguments must have a default value
 * 
 * ProcedureCall
 *  The runGroup parameter of a procedure call, although a complexValue, must be non-empty and must contain only text elements
 *  Arguments must match the called procedure's parameters
 *  
 * Module specific resource type checking
 * 
 * Steps with no configuration objects should warn and be converted to NOOPS
 * 
 * Optimizations
 *   Non-reference resource duplication of resources should be referenced. 
 */

// SAT-{OBJECT}-{CATEGORY}-{NUMBER}

object SaturnLintDefaults {
  def defaultValidators = Seq(NameValidator,
                              DeprecatedValidator,
                              RepetitionValidator,
                              SaturnValidator,
                              ReferenceValidator,
                              ProcedureCallValidator)
}

class SaturnLintRunner(val saturn: MSaturn, val validators: Seq[LintValidator]) extends Runnable[SaturnLintResult] {
  override def run: Try[SaturnLintResult] = Try {
    val validationResults = validators.flatMap{validator => validator.validate(saturn)}
    val status = if(validationResults.exists{r => r.isError}) Failed() else Passed()
    SaturnLintResult(status, validationResults)
  }
}

object SaturnLintRunner {
  def apply(saturnCodeGenUtil: SaturnCodeGenUtil, validators: Seq[LintValidator]): SaturnLintRunner =
    apply(saturnCodeGenUtil.saturn, validators)

  def apply(saturnCodeGenUtil: SaturnCodeGenUtil): SaturnLintRunner =
    apply(saturnCodeGenUtil, SaturnLintDefaults.defaultValidators)

  def apply(saturn: MSaturn, validators: Seq[LintValidator]): SaturnLintRunner =
    new SaturnLintRunner(saturn, validators)

  def apply(saturn: MSaturn): SaturnLintRunner = apply(saturn, SaturnLintDefaults.defaultValidators)
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
