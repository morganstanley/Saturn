package com.ms.qaTools.saturn.lint.validators

import scala.annotation.migration
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.JavaConversions.asScalaIterator
import scala.collection.JavaConversions.seqAsJavaList

import org.eclipse.emf.ecore.EObject

import com.ms.qaTools.saturn.{ AbstractRunGroup => MAbstractRunGroup }
import com.ms.qaTools.saturn.lint.ResultOK
import com.ms.qaTools.saturn.lint.ResultWarning
import com.ms.qaTools.saturn.lint.SaturnLintRuleResult
import com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResource
import com.ms.qaTools.saturn.resources.soapIOResource.{ TCPTransport => MTCPTransport }
import com.ms.qaTools.saturn.utils.SaturnEObjectUtils.AbstractRunGroupHelper
import com.ms.qaTools.saturn.utils.SaturnEObjectUtils.SaturnEObjectHelper
import com.ms.qaTools.saturn.values.{ ReferenceComplexValue => MReferenceCV }

object SoapTCPConnectionDuplicateValidator extends LintValidator {
  val rule = "SAT-CONNECTION-001"
  val description = "Soap over TCP connection should not be created under an iterating step unless it depends on postIteration attributes/resources."

  def validate(eObject: EObject): Seq[SaturnLintRuleResult] = {
    val warns = eObject.eAllContents.collect{case stcp: MTCPTransport => stcp}.flatMap(getAppropriateWarnings).toSeq
    if (warns.isEmpty) Seq(ResultOK(rule, description)) else warns
  }

  def getAppropriateWarnings(transport: MTCPTransport): List[SaturnLintRuleResult] = {
    val transportGroup = transport.containingRunGroup
    val name = transportGroup.map(_.getName).getOrElse("Unknown container")
    val parentRepeatingGroups = transportGroup.toList.flatMap(_.containingRunGroups.filter(_.getRepetitionHandler != null).toList)
    val containingSoapResourceName = Option(transport.eContainer) match {
      case Some(r: SoapIOResource) => r.getName
      case _                       => ""
    }

    def error(destination: String) =
      s"TCP transport resource $containingSoapResourceName from '$name' should be moved $destination to avoid unnecessary resource creation."

    if (parentRepeatingGroups.nonEmpty) {
      val refCVs = List(transport.getHostname, transport.getPort).flatMap{_.getMixed.map{_.getValue}.collect{case r: MReferenceCV => r}}
      if (refCVs.isEmpty)
        List(ResultWarning(rule, error(s"outside of '${parentRepeatingGroups.last.getName}'"), Seq(transport)))
      else refCVs.flatMap { rcv =>
        val depAttr = rcv.getUserAttribute
        for {
          tg <- transportGroup
          g  <- tg.containingRunGroupWithPostIterationDependencyNamed(depAttr).orElse(tg.containingRunGroupWithMappedAttributeNamed(depAttr))
          if (parentRepeatingGroups.get(0) != g)
        } yield ResultWarning(rule, error(s"into '${g.getName}'"), Seq(transport))
      }
    } else Nil
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
