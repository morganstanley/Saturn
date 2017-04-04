package com.ms.qaTools.saturn.lint.validators

import org.eclipse.emf.ecore.EObject

import com.ms.qaTools.saturn.lint.ResultError
import com.ms.qaTools.saturn.lint.ResultOK
import com.ms.qaTools.saturn.lint.ResultWarning
import com.ms.qaTools.saturn.lint.SaturnLintRuleResult
import com.ms.qaTools.saturn.resources.referenceResource.{ReferenceResource => MReferenceResource}
import com.ms.qaTools.saturn.utils.SaturnEObjectUtils.ReferenceComplexValueResourceHelper
import com.ms.qaTools.saturn.utils.SaturnEObjectUtils.ReferenceResourceHelper
import com.ms.qaTools.saturn.utils.SaturnEObjectUtils.SaturnEObjectHelper
import com.ms.qaTools.saturn.values.{ReferenceComplexValue => MReferenceComplexValue}

object ReferenceValidator extends LintValidator {
  val rule:String = "SAT-REFERENCE-VALID-001"
  val description:String = "Attribute and Reference resources must refer to valid Attributes, Resources or Procedure Parameters."
    
  def validate(eObject:EObject):Seq[SaturnLintRuleResult] = {
    val resourceReferences = eObject.eAllContentsByType[MReferenceResource]().toSeq.filter{ r => !r.isValidReference && r.isEnabledDeep }
    val attributeReferences = eObject.eAllContentsByType[MReferenceComplexValue]().toSeq.filter{ r => !r.isValidReference && r.isEnabledDeep }

    if (!resourceReferences.isEmpty || !attributeReferences.isEmpty) (resourceReferences ++ attributeReferences).map {
      //TODO references with include files need to be validated
      case ref: MReferenceResource if (ref.getIncludeFile != null)     => ResultWarning(rule, s"Resource reference '${ref.getName}' with include file is not being validated.", Seq(ref))
      case ref: MReferenceComplexValue if (ref.getIncludeFile != null) => ResultWarning(rule, s"Attribute reference '${ref.getUserAttribute()}' with include file is not being validated.", Seq(ref))
      case eObject                                                     => ResultError(rule, description, Seq(eObject))
    }
    else                                                            Seq(ResultOK(rule, description)) 
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
