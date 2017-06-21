package com.ms.qaTools.saturn.lint.validators

import scala.annotation.migration
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.JavaConversions.asScalaIterator

import org.eclipse.emf.ecore.EObject

import com.ms.qaTools.saturn.lint.ResultWarning
import com.ms.qaTools.saturn.lint.SaturnLintRuleResult
import com.ms.qaTools.saturn.modules.cometModule.{ CometConfiguration => MCometConfiguration }
import com.ms.qaTools.saturn.modules.cpsModule.{ AbstractCpsOperation => MAbstractCpsOperation }
import com.ms.qaTools.saturn.modules.soapIOModule.{ AbstractSoapIOOperation => MAbstractSoapIOOperation }
import com.ms.qaTools.saturn.utils.SaturnEObjectUtils.SaturnEObjectHelper
import com.ms.qaTools.saturn.values.{ ComplexValue => MComplexValue }
import com.ms.qaTools.saturn.values.{ TextComplexValue => MTextCV }

object NonNegativeIntegerTimeoutValidator extends LintValidator {
  val rule = "SAT-TIMEOUT-001"
  val description = "Timeout values should be integers greater than 0."

  def validate(eObject: EObject): Seq[SaturnLintRuleResult] = {
    val timeOutCVs = eObject.eAllContents().collect {
      case soap: MAbstractSoapIOOperation => soap.getTimeOut
      case com: MCometConfiguration       => com.getTimeOut
      case cps: MAbstractCpsOperation     => cps.getTimeOut
    }.filter(_ != null)
    val warns = timeOutCVs.flatMap { timeOutCV => getAppropriateRuleResult(timeOutCV) }.toSeq
    returnRuleResults(warns)
  }

  def getAppropriateRuleResult(timeOutCV: MComplexValue): Option[SaturnLintRuleResult] = {
    try {
      for {
        timeOutStr <- timeOutCV.getMixed.map { _.getValue }.collectFirst { case tcv: MTextCV => tcv }.map { _.getText }
        timeOut = timeOutStr.toInt
        if (timeOut < 1)
      } yield ResultWarning(rule, s"Timeout value '${timeOut}' from '${timeOutCV.getContainingRunGroupName}' should be positive.", Seq(timeOutCV))
    }
    catch {
      case ex: NumberFormatException => Some(ResultWarning(rule, s"Timeout value '${getTimeoutValueFromCV(timeOutCV)}' from '${timeOutCV.getContainingRunGroupName}' should be a positive integer.", Seq(timeOutCV)))
    }
  }

  def getTimeoutValueFromCV(timeOutCV: MComplexValue): String = {
    timeOutCV.getMixed.map { _.getValue }.collectFirst { case tcv: MTextCV => tcv }.map { _.getText }.getOrElse("[NO VALUE INPUT]")
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
