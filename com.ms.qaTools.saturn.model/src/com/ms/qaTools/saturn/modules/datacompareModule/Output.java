package com.ms.qaTools.saturn.modules.datacompareModule;

import org.eclipse.emf.ecore.EObject;

import com.ms.qaTools.saturn.types.NamedResourceDefinition;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Output</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.Output#getResource <em>Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.Output#getPages <em>Pages</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getOutput()
 * @model extendedMetaData="name='Output_._type' kind='elementOnly'"
 * @generated
 */
public interface Output extends EObject
{
  /**
   * Returns the value of the '<em><b>Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource</em>' containment reference.
   * @see #setResource(NamedResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getOutput_Resource()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Resource' namespace='##targetNamespace'"
   * @generated
   */
  NamedResourceDefinition getResource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.Output#getResource <em>Resource</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource</em>' containment reference.
   * @see #getResource()
   * @generated
   */
  void setResource(NamedResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Pages</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pages</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pages</em>' containment reference.
   * @see #setPages(Pages)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getOutput_Pages()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Pages' namespace='##targetNamespace'"
   * @generated
   */
  Pages getPages();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.Output#getPages <em>Pages</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Pages</em>' containment reference.
   * @see #getPages()
   * @generated
   */
  void setPages(Pages value);

} // Output
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
