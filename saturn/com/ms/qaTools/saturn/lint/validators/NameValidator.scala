package com.ms.qaTools.saturn.lint.validators

import org.eclipse.emf.ecore.EObject

import com.ms.qaTools.saturn.kronus.backport.KronusCallConfiguration
import com.ms.qaTools.saturn.lint.{SaturnLintRuleResult, ResultOK, ResultWarning, ResultError}
import com.ms.qaTools.saturn.types.KronusResource
import com.ms.qaTools.saturn.utils.SaturnEObjectUtils.SaturnEObjectHelper

object NameValidator extends LintValidator {
  def validate(eObject:EObject):Seq[SaturnLintRuleResult] = ObjectNamePatternValidator.validate(eObject) ++ ObjectNameUniqueValidator.validate(eObject)
}

object ObjectNamePatternValidator extends LintValidator {
  val rule:String = "SAT-OBJECT-NAME-001"
  val description:String = "Objects(attributes, resources and runGroups) within a given runGroup must have names matching the pattern: '^[A-Za-z0-9_]+$'."
  
  def validate(eObjects:Iterator[(EObject, String)]):Seq[SaturnLintRuleResult] = {
    val validationResults = eObjects.collect{
      case (eObject, name) if(name == null || !name.matches("^[A-Za-z0-9_]+$")) => ResultError(rule, description, Seq(eObject))
      case (eObject, name) if(!name.matches("^[A-Z][A-Za-z0-9_]*$")) => ResultWarning(rule, s"Object(attribute, resource or runGroup) '${name}' should have a capitalized name.", Seq(eObject))
    }
    if(validationResults.isEmpty)
      Seq(ResultOK(rule, description))
    else
      validationResults.toSeq
  }
    
  def validate(eObject:EObject):Seq[SaturnLintRuleResult] = validate(eObject.eAllNamedObjects(excludeInlineResources = true))
}

object ObjectNameUniqueValidator extends LintValidator {
  val rule:String = "SAT-OBJECT-NAME-002"
  val description:String = "Objects(attributes, resources and runGroups) within a given runGroup must have unique names."
  def validate(eObjects:Iterator[(EObject,String)]):Seq[SaturnLintRuleResult] = {
    val eObjectsByParent = eObjects.toSeq groupBy {
      case (x, _) if isKronusResource(x) => x.eContainer.eContainer
      case (x, _)                        => x.eContainer.containingRunGroup
    }
    val failedResultGroups = for((_, childrenPairs) <- eObjectsByParent) yield {
      val groupedChildren = childrenPairs.groupBy(_._2)
      val failedResultGroups = for((name,children) <- groupedChildren) yield if(children.size > 1) Some(ResultError(rule, description,children.map{_._1})) else None
      failedResultGroups.toSeq.flatten
    }
    val failedResults = failedResultGroups.toSeq.flatten
    if(failedResults.isEmpty) Seq(ResultOK(rule, description)) else failedResults
  } 
    
  def validate(eObject:EObject):Seq[SaturnLintRuleResult] = validate(eObject.eAllNamedObjects(excludeInlineResources = true))

  def isKronusResource(x: EObject) = {
    val p = x.eContainer
    p.isInstanceOf[KronusCallConfiguration] && p.eContainer.isInstanceOf[KronusResource]
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
