package com.ms.qaTools.saturn.modules.referenceModule;

import org.eclipse.emf.ecore.EObject;

import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Reference Configuration</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.referenceModule.ReferenceConfiguration#getIncludeFileAdv <em>Include File Adv</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.referenceModule.ReferenceConfiguration#getRunGroupAdv <em>Run Group Adv</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.referenceModule.ReferenceConfiguration#getIncludeFile <em>Include File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.referenceModule.ReferenceConfiguration#getRunGroup <em>Run Group</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.referenceModule.ReferenceConfiguration#isAdvanced <em>Advanced</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.referenceModule.ReferenceModulePackage#getReferenceConfiguration()
 * @model extendedMetaData="name='Configuration_._type' kind='elementOnly'"
 * @generated
 */
public interface ReferenceConfiguration extends EObject
{
  /**
   * Returns the value of the '<em><b>Include File Adv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Include File Adv</em>' containment reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Include File Adv</em>' containment reference.
   * @see #setIncludeFileAdv(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.referenceModule.ReferenceModulePackage#getReferenceConfiguration_IncludeFileAdv()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='IncludeFile' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getIncludeFileAdv();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.referenceModule.ReferenceConfiguration#getIncludeFileAdv <em>Include File Adv</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Include File Adv</em>' containment reference.
   * @see #getIncludeFileAdv()
   * @generated
   */
  void setIncludeFileAdv(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Run Group Adv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Run Group Adv</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Run Group Adv</em>' containment reference.
   * @see #setRunGroupAdv(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.referenceModule.ReferenceModulePackage#getReferenceConfiguration_RunGroupAdv()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='RunGroup' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getRunGroupAdv();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.referenceModule.ReferenceConfiguration#getRunGroupAdv <em>Run Group Adv</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Run Group Adv</em>' containment reference.
   * @see #getRunGroupAdv()
   * @generated
   */
  void setRunGroupAdv(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Advanced</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Advanced</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Advanced</em>' attribute.
   * @see #isSetAdvanced()
   * @see #unsetAdvanced()
   * @see #setAdvanced(boolean)
   * @see com.ms.qaTools.saturn.modules.referenceModule.ReferenceModulePackage#getReferenceConfiguration_Advanced()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='advanced'"
   * @generated
   */
  boolean isAdvanced();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.referenceModule.ReferenceConfiguration#isAdvanced <em>Advanced</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Advanced</em>' attribute.
   * @see #isSetAdvanced()
   * @see #unsetAdvanced()
   * @see #isAdvanced()
   * @generated
   */
  void setAdvanced(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.referenceModule.ReferenceConfiguration#isAdvanced <em>Advanced</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAdvanced()
   * @see #isAdvanced()
   * @see #setAdvanced(boolean)
   * @generated
   */
  void unsetAdvanced();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.referenceModule.ReferenceConfiguration#isAdvanced <em>Advanced</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Advanced</em>' attribute is set.
   * @see #unsetAdvanced()
   * @see #isAdvanced()
   * @see #setAdvanced(boolean)
   * @generated
   */
  boolean isSetAdvanced();

  /**
   * Returns the value of the '<em><b>Include File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Include File</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Include File</em>' attribute.
   * @see #setIncludeFile(String)
   * @see com.ms.qaTools.saturn.modules.referenceModule.ReferenceModulePackage#getReferenceConfiguration_IncludeFile()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
   *        extendedMetaData="kind='attribute' name='includeFile'"
   * @generated
   */
  String getIncludeFile();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.referenceModule.ReferenceConfiguration#getIncludeFile <em>Include File</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Include File</em>' attribute.
   * @see #getIncludeFile()
   * @generated
   */
  void setIncludeFile(String value);

  /**
   * Returns the value of the '<em><b>Run Group</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Run Group</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Run Group</em>' attribute.
   * @see #setRunGroup(String)
   * @see com.ms.qaTools.saturn.modules.referenceModule.ReferenceModulePackage#getReferenceConfiguration_RunGroup()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
   *        extendedMetaData="kind='attribute' name='runGroup'"
   * @generated
   */
  String getRunGroup();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.referenceModule.ReferenceConfiguration#getRunGroup <em>Run Group</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Run Group</em>' attribute.
   * @see #getRunGroup()
   * @generated
   */
  void setRunGroup(String value);

} // ReferenceConfiguration
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
