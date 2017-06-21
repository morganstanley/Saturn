package com.ms.qaTools.saturn.lint.validators

import scala.annotation.migration

import org.eclipse.emf.ecore.EObject

import com.ms.qaTools.saturn.SaturnPackage
import com.ms.qaTools.saturn.lint.ResultError
import com.ms.qaTools.saturn.lint.ResultOK
import com.ms.qaTools.saturn.lint.SaturnLintRuleResult
import com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage
import com.ms.qaTools.saturn.modules.mqModule.MqModulePackage
import com.ms.qaTools.saturn.modules.procedureCallModule.ProcedureCallModulePackage
import com.ms.qaTools.saturn.modules.soapIOModule.SoapIOModulePackage
import com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage
import com.ms.qaTools.saturn.types.{ DeviceResourceDefinition => MDeviceResourceDefinition }
import com.ms.qaTools.saturn.types.{ NamedResourceDefinition => MNamedResourceDefinition }
import com.ms.qaTools.saturn.types.TypesPackage
import com.ms.qaTools.saturn.utils.SaturnEObjectUtils.SaturnEObjectHelper

object ResourceValidator extends LintValidator {
  val rule = "SAT-RESOURCE-DEVICE-000"
  val description = "Resource validation."
  def validate(eObject: EObject): Seq[SaturnLintRuleResult] = DataSetResourceValidator.validate(eObject)

}

object DataSetResourceValidator extends LintValidator {
  val rule = "SAT-RESOURCE-DEVICE-001"
  val description = "Device resources used in place of reference or dataSet resources."

  val deviceFeatures = Seq(
    SaturnPackage.eINSTANCE.getAbstractRunGroup_Resources(),
    SaturnPackage.eINSTANCE.getResourceParameter_DefaultResource(),
    ProcedureCallModulePackage.eINSTANCE.getResourceArgument_Resource(),
    DatacompareModulePackage.eINSTANCE.getOutput_Resource(),
    MqModulePackage.eINSTANCE.getMQConfiguration_MQResource(),
    SqlModulePackage.eINSTANCE.getSQLConfiguration_DatabaseResource(),
    SoapIOModulePackage.eINSTANCE.getSoapIOConfiguration_SoapIOResource(),
    TypesPackage.eINSTANCE.getDataSetResourceDefinition_DeviceResource()
  )

  def validate(eObject: EObject): Seq[SaturnLintRuleResult] = {
    val resources = eObject.eAllContentsByType[MNamedResourceDefinition]()
    val invalidDeviceResources = resources.filter { resource => !deviceFeatures.contains(resource.eContainingFeature()) }.collect { case d: MDeviceResourceDefinition => d }.toSeq
    if (invalidDeviceResources.isEmpty) Seq(ResultOK(rule, description))
    else invalidDeviceResources.map { eObject => ResultError(rule, description, Seq(eObject)) }
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
