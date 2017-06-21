package com.ms.qaTools.saturn.scoping

import java.util.{List => JList, ArrayList}
import java.util.Collections

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.resource.ISelectable
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.ImportNormalizer
import org.eclipse.xtext.scoping.impl.ImportScope
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider

import com.google.inject.Inject
import com.ms.qaTools.saturn.kronus._

class KronusLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
  @Inject val qualifiedNameConverter: IQualifiedNameConverter = null

  override protected def isRelativeImport = false

  def qualifiedNameDelimiter = qualifiedNameConverter.asInstanceOf[IQualifiedNameConverter.DefaultImpl].getDelimiter
  def importAllFrom(namespace: String) = namespace + qualifiedNameDelimiter + getWildCard

  override protected def internalGetImportedNamespaceResolvers(context: EObject, ignoreCase: Boolean) = context match {
    case context: TopLevelKronus => getImportedNamespaceResolvers(context.getKronus, ignoreCase)
    case context: Kronus         => importKronus(context, ignoreCase)
    case _                       => Collections.emptyList()
  }

  protected def importKronus(kronus: Kronus, ignoreCase: Boolean): JList[ImportNormalizer] = {
    val result = new ArrayList[ImportNormalizer]
    kronus.allInclusions.foreach { deps =>
      val modName = deps.head.getModule.getPackage.getModule
      val imp = deps.last.getName match {
        case null  => createImportedNamespaceResolver(importAllFrom(modName), ignoreCase)
        case alias => new AliasingImportNormalizer(qualifiedNameConverter.toQualifiedName(modName), alias, ignoreCase)
      }
      result.add(new DependencyAwareImportScope.Normalizer(imp, deps))
    }
    result
  }

  override def getScope(context: EObject, reference: EReference) =
    if (reference.getEContainingClass.getClassifierID == KronusPackage.INCLUDE_DEF &&
        reference.getFeatureID == KronusPackage.INCLUDE_DEF__MODULE)
      getGlobalScope(context.eResource, reference)
    else super.getScope(context, reference)

  override protected def createImportScope(parent: IScope, namespaceResolvers: JList[ImportNormalizer],
                                           importFrom: ISelectable, `type`: EClass, ignoreCase: Boolean): ImportScope = {
    val itr = namespaceResolvers.iterator
    while (itr.hasNext)
      if (itr.next().isInstanceOf[DependencyAwareImportScope.Normalizer])
        return new DependencyAwareImportScope(namespaceResolvers, parent, importFrom, `type`, ignoreCase)
    super.createImportScope(parent, namespaceResolvers, importFrom, `type`, ignoreCase)
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
