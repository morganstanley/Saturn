package com.ms.qaTools.saturn.util

import java.util.Collection

import scala.collection.JavaConversions._

import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IMarker
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EValidator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.util.FeatureMapUtil

import com.ms.qaTools.saturn.SaturnPackage
import com.ms.qaTools.saturn.values.ComplexValue
import com.ms.qaTools.saturn.values.TextComplexValue
import com.ms.qaTools.saturn.values.ValuesFactory
import com.ms.qaTools.saturn.values.ValuesPackage

object Util {
  /** "splitCamelCase" -> "Split Camel Case" */
  def splitCamelCase(s: String): String =
    s.replaceAll(String.format("%s|%s|%s",
                               "(?<=[A-Z])(?=[A-Z][a-z])", "(?<=[^A-Z])(?=[A-Z])", "(?<=[A-Za-z])(?=[^A-Za-z])"),
                 " ").capitalize

  def stringToComplexValue(s: String): ComplexValue = {
    val v = ValuesFactory.eINSTANCE.createComplexValue
    val t = ValuesFactory.eINSTANCE.createTextComplexValue
    t.setText(s)
    v.getMixed.add(FeatureMapUtil.createEntry(ValuesPackage.eINSTANCE.getComplexValue_Text, t))
    v
  }

  def isEmpty(cv: ComplexValue): Boolean = cv.getMixed.isEmpty || cv.getMixed.forall {
    case v: TextComplexValue => v.getText.isEmpty
    case _                   => false
  }

  def descriptionOf(x: ENamedElement): String = Option(x.getEAnnotation(SaturnPackage.eNS_URI)).map {
    _.getDetails.get("description")
  }.getOrElse(splitCamelCase(x.getName))

  def subClasses(cls: EClass): Collection[EClass] = EPackage.Registry.INSTANCE.values flatMap {
    case pkg: EPackage => pkg.getEClassifiers collect {
      case c: EClass if c.getESuperTypes.contains(cls) => c
    }
    case _ => Nil
  }

  def toIFile(resource: Resource): Option[IFile] = {
    val uri = resource.getResourceSet.getURIConverter.normalize(resource.getURI)
    if (uri.scheme == "platform" && uri.segments.headOption == Some("resource"))
      Option(ResourcesPlugin.getWorkspace.getRoot.getFile(new Path(uri.segments.tail.mkString("/", "/", ""))))
    else
      None
  }

  def createMarkers(file: IFile, diagnostic: Diagnostic) {
    def createMarker(diag: Diagnostic, parentMsg: String = "") {
      val s = diag.getSeverity match {
        case s if s < Diagnostic.WARNING => IMarker.SEVERITY_INFO
        case s if s < Diagnostic.ERROR   => IMarker.SEVERITY_WARNING
        case _                           => IMarker.SEVERITY_ERROR
      }
      if (s >= IMarker.SEVERITY_WARNING) {
        val m = file.createMarker(EValidator.MARKER)
        m.setAttribute(IMarker.SEVERITY, s)
        m.setAttribute(IMarker.MESSAGE, parentMsg + diag.getMessage)
        diagnostic.getData.headOption match {
          case Some(e: EObject) => m.setAttribute(EValidator.URI_ATTRIBUTE, EcoreUtil.getURI(e).toString)
          case _                =>
        }
      }
    }
    diagnostic.getChildren match {
      case ds if ds.nonEmpty => ds.foreach(createMarker(_, diagnostic.getMessage + ". "))
      case _                 => createMarker(diagnostic)
    }
  }

  def updateMarkers(file: IFile, diagnostics: Collection[Diagnostic]) {
    file.deleteMarkers(EValidator.MARKER, true, IResource.DEPTH_ZERO)
    diagnostics.foreach(createMarkers(file, _))
  }
}

class Util protected
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
