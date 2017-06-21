package com.ms.qaTools.saturn.scoping

import java.util.{List => JList, ArrayList}
import java.util.Collections

import scala.collection.JavaConverters._

import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.ISelectable
import org.eclipse.xtext.resource.impl.AliasedEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.ImportNormalizer
import org.eclipse.xtext.scoping.impl.ImportScope

import com.ms.qaTools.saturn.kronus.IncludeDef
import com.ms.qaTools.saturn.resource.DependencyTrackingEObjectDescription

object DependencyAwareImportScope {
  class Normalizer(val self: ImportNormalizer, val dependencies: Seq[IncludeDef])
  extends ImportNormalizer(self.getImportedNamespacePrefix, self.hasWildCard, self.isIgnoreCase)
  with Proxy.Typed[ImportNormalizer] {
    override def resolve(relativeName: QualifiedName) = self.resolve(relativeName)
    override def deresolve(fullyQualifiedName: QualifiedName) = self.deresolve(fullyQualifiedName)
  }

  protected val normalizersField = classOf[ImportScope].getDeclaredField("normalizers")
  normalizersField.setAccessible(true)
}

class DependencyAwareImportScope(namespaceResolvers: JList[ImportNormalizer], parent: IScope, importFrom: ISelectable,
                                 `type`: EClass, ignoreCase: Boolean)
extends ImportScope(namespaceResolvers, parent, importFrom, `type`, ignoreCase) {
  import DependencyAwareImportScope._

  // This is why you should never use `private`
  protected def normalizers: JList[ImportNormalizer] = normalizersField.get(this).asInstanceOf[JList[ImportNormalizer]]

  override protected def getLocalElementsByName(name: QualifiedName): java.lang.Iterable[IEObjectDescription] = {
    val result = new ArrayList[IEObjectDescription]
    var resolvedQualifiedName: QualifiedName = null
    for {
      normalizer <- normalizers.asScala
      resolvedName = normalizer.resolve(name) if resolvedName != null
      resolvedElement <- getImportFrom.getExportedObjects(`type`, resolvedName, isIgnoreCase).asScala
    } {
      if (resolvedQualifiedName == null) resolvedQualifiedName = resolvedName
      else if (resolvedQualifiedName != resolvedName &&
               result.get(0).getEObjectOrProxy.ne(resolvedElement.getEObjectOrProxy))
        return Collections.emptyList[IEObjectDescription]
      val alias = normalizer.deresolve(resolvedElement.getName)
      if (alias == null)
        throw new IllegalStateException(s"Couldn't deresolve ${resolvedElement.getName} with import $normalizer")
      val eObjDesc0 = new AliasedEObjectDescription(alias, resolvedElement)
      val eObjDesc = normalizer match {
        case normalizer: Normalizer => new DependencyTrackingEObjectDescription(eObjDesc0, normalizer.dependencies)
        case _                      => eObjDesc0
      }
      result.add(eObjDesc)
    }
    result
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
