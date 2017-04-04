package com.ms.qaTools.saturn.modules.datacompareModule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Page</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.Page#getName <em>Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.Page#isOmit <em>Omit</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.Page#isSparse <em>Sparse</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getPage()
 * @model extendedMetaData="name='Page' kind='empty'"
 * @generated
 */
public interface Page extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getPage_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.Page#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Omit</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Omit</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Omit</em>' attribute.
   * @see #isSetOmit()
   * @see #unsetOmit()
   * @see #setOmit(boolean)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getPage_Omit()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='omit'"
   * @generated
   */
  boolean isOmit();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.Page#isOmit <em>Omit</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Omit</em>' attribute.
   * @see #isSetOmit()
   * @see #unsetOmit()
   * @see #isOmit()
   * @generated
   */
  void setOmit(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.Page#isOmit <em>Omit</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetOmit()
   * @see #isOmit()
   * @see #setOmit(boolean)
   * @generated
   */
  void unsetOmit();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.Page#isOmit <em>Omit</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Omit</em>' attribute is set.
   * @see #unsetOmit()
   * @see #isOmit()
   * @see #setOmit(boolean)
   * @generated
   */
  boolean isSetOmit();

  /**
   * Returns the value of the '<em><b>Sparse</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sparse</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Sparse</em>' attribute.
   * @see #isSetSparse()
   * @see #unsetSparse()
   * @see #setSparse(boolean)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getPage_Sparse()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='sparse'"
   * @generated
   */
  boolean isSparse();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.Page#isSparse <em>Sparse</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Sparse</em>' attribute.
   * @see #isSetSparse()
   * @see #unsetSparse()
   * @see #isSparse()
   * @generated
   */
  void setSparse(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.Page#isSparse <em>Sparse</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetSparse()
   * @see #isSparse()
   * @see #setSparse(boolean)
   * @generated
   */
  void unsetSparse();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.Page#isSparse <em>Sparse</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Sparse</em>' attribute is set.
   * @see #unsetSparse()
   * @see #isSparse()
   * @see #setSparse(boolean)
   * @generated
   */
  boolean isSetSparse();

} // Page
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
