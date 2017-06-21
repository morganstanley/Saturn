package com.ms.qaTools.saturn.lint.validators

import scala.annotation.migration
import scala.collection.JavaConversions.asScalaIterator

import org.eclipse.emf.ecore.EObject

import com.ms.qaTools.saturn.CpsStep
import com.ms.qaTools.saturn.MQStep
import com.ms.qaTools.saturn.SQLStep
import com.ms.qaTools.saturn.SoapIOStep
import com.ms.qaTools.saturn.lint.ResultError
import com.ms.qaTools.saturn.lint.SaturnLintRuleResult
import com.ms.qaTools.saturn.utils.SaturnEObjectUtils.SaturnEObjectHelper

object ConfigurationValidator extends LintValidator {
  val rule = "SAT-COMMANDSTEP-001"
  val description = "Command-based steps (SQL, MQ, CPS, SoapIO) should have its configuration set up."

  def validate(eObject: EObject): Seq[SaturnLintRuleResult] = {
    val warns = eObject.eAllContents().collect {
      case sioStep: SoapIOStep => sioStep
      case cpsStep: CpsStep    => cpsStep
      case sqlStep: SQLStep    => sqlStep
      case mqStep: MQStep      => mqStep
    }.flatMap { step =>

      val configError = step match {
        case sioStep: SoapIOStep if sioStep.getSoapIOConfiguration == null => Some(ResultError(rule, s"SoapIO step '${sioStep.getContainingRunGroupName}' needs to be configured.", Seq(sioStep)))
        case cpsStep: CpsStep if cpsStep.getCpsConfiguration == null => Some(ResultError(rule, s"Cps step '${cpsStep.getContainingRunGroupName}' needs to be configured.", Seq(cpsStep)))
        case sqlStep: SQLStep if sqlStep.getSQLConfiguration == null => Some(ResultError(rule, s"SQL step '${sqlStep.getContainingRunGroupName}' needs to be configured.", Seq(sqlStep)))
        case mqStep: MQStep if mqStep.getMQConfiguration == null => Some(ResultError(rule, s"MQ step '${mqStep.getContainingRunGroupName}' needs to be configured.", Seq(mqStep)))
        case _ => None
      }

      val resourceError = step match {
        case sioStep: SoapIOStep if (sioStep.getSoapIOConfiguration != null && sioStep.getSoapIOConfiguration.getSoapIOResource == null) =>
          Some(ResultError(rule, s"SoapIO step '${sioStep.getContainingRunGroupName}' needs to have its resource(s) configured.", Seq(sioStep)))
        case cpsStep: CpsStep if (cpsStep.getCpsConfiguration != null && cpsStep.getCpsConfiguration.getCpsResource == null) =>
          Some(ResultError(rule, s"Cps step '${cpsStep.getContainingRunGroupName}' needs to have its resource(s) configured.", Seq(cpsStep)))
        case sqlStep: SQLStep if (sqlStep.getSQLConfiguration != null && sqlStep.getSQLConfiguration.getDatabaseResource == null) =>
          Some(ResultError(rule, s"SQL step '${sqlStep.getContainingRunGroupName}' needs to have its resource(s) configured.", Seq(sqlStep)))
        case mqStep: MQStep if (mqStep.getMQConfiguration != null && mqStep.getMQConfiguration.getMQResource == null) =>
          Some(ResultError(rule, s"MQ step '${mqStep.getContainingRunGroupName}' needs to have its resource(s) configured.", Seq(mqStep)))
        case _ => None
      }

      val operationError = step match {
        case sioStep: SoapIOStep if (sioStep.getSoapIOConfiguration != null && sioStep.getSoapIOConfiguration.getOperation == null) =>
          Some(ResultError(rule, s"SoapIO step '${sioStep.getContainingRunGroupName}' needs to have an operation configured.", Seq(sioStep)))
        case cpsStep: CpsStep if (cpsStep.getCpsConfiguration != null && (cpsStep.getCpsConfiguration.getOperations == null || cpsStep.getCpsConfiguration.getOperations.isEmpty)) =>
          Some(ResultError(rule, s"Cps step '${cpsStep.getContainingRunGroupName}' needs to have at least one operation configured.", Seq(cpsStep)))
        case sqlStep: SQLStep if (sqlStep.getSQLConfiguration != null && sqlStep.getSQLConfiguration.getOperation == null) =>
          Some(ResultError(rule, s"SQL step '${sqlStep.getContainingRunGroupName}' needs to have an operation configured.", Seq(sqlStep)))
        case mqStep: MQStep if (mqStep.getMQConfiguration != null && mqStep.getMQConfiguration.getOperation == null) =>
          Some(ResultError(rule, s"MQ step '${mqStep.getContainingRunGroupName}' needs to have an operation configured.", Seq(mqStep)))
        case _ => None
      }
      Seq(configError, resourceError, operationError).flatten
    }.toSeq
    returnRuleResults(warns)
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
