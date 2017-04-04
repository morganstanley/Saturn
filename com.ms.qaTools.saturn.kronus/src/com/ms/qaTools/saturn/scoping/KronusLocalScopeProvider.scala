package com.ms.qaTools.saturn.scoping

import java.util.Collections

import org.eclipse.emf.ecore.{EObject, EReference}
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider

import com.ms.qaTools.saturn.kronus.IncludeDef

class KronusLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
  @com.google.inject.Inject protected var qualifiedNameConverter: IQualifiedNameConverter = _

  def qualifiedNameDelimiter = qualifiedNameConverter.asInstanceOf[IQualifiedNameConverter.DefaultImpl].getDelimiter
  def importAllFrom(namespace: String) = namespace + qualifiedNameDelimiter + getWildCard

  override protected def getImportedNamespace(obj: EObject) = obj match {
    case inc: IncludeDef if inc.getName == null => importAllFrom(inc.getModule)
    case _                                      => null
  }

  def namedIncludeScope(res: Resource, namespace: String, reference: EReference): IScope = {
    val ignoreCase = isIgnoreCase(reference)
    val normalizer = createImportedNamespaceResolver(importAllFrom(namespace), ignoreCase)
    createImportScope(getGlobalScope(res, reference),
                      Collections.singletonList(normalizer),
                      null,
                      reference.getEReferenceType,
                      ignoreCase)
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
