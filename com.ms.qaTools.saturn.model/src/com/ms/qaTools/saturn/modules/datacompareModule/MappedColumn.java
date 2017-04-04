package com.ms.qaTools.saturn.modules.datacompareModule;

import com.ms.qaTools.saturn.types.Column;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Mapped Column</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.MappedColumn#getMappingColumn <em>Mapping Column</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.MappedColumn#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.MappedColumn#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.MappedColumn#isIgnoreNull <em>Ignore Null</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getMappedColumn()
 * @model extendedMetaData="name='Columns_._type' kind='empty'"
 * @generated
 */
public interface MappedColumn extends Column
{
  /**
   * Returns the value of the '<em><b>Enabled</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enabled</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Enabled</em>' attribute.
   * @see #isSetEnabled()
   * @see #unsetEnabled()
   * @see #setEnabled(boolean)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getMappedColumn_Enabled()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2report colNum='6'"
   *        extendedMetaData="kind='attribute' name='enabled'"
   * @generated
   */
  boolean isEnabled();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.MappedColumn#isEnabled <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Enabled</em>' attribute.
   * @see #isSetEnabled()
   * @see #unsetEnabled()
   * @see #isEnabled()
   * @generated
   */
  void setEnabled(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.MappedColumn#isEnabled <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetEnabled()
   * @see #isEnabled()
   * @see #setEnabled(boolean)
   * @generated
   */
  void unsetEnabled();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.MappedColumn#isEnabled <em>Enabled</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Enabled</em>' attribute is set.
   * @see #unsetEnabled()
   * @see #isEnabled()
   * @see #setEnabled(boolean)
   * @generated
   */
  boolean isSetEnabled();

  /**
   * Returns the value of the '<em><b>Ignore Null</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ignore Null</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Ignore Null</em>' attribute.
   * @see #isSetIgnoreNull()
   * @see #unsetIgnoreNull()
   * @see #setIgnoreNull(boolean)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getMappedColumn_IgnoreNull()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='ignoreNull'"
   * @generated
   */
  boolean isIgnoreNull();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.MappedColumn#isIgnoreNull <em>Ignore Null</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Ignore Null</em>' attribute.
   * @see #isSetIgnoreNull()
   * @see #unsetIgnoreNull()
   * @see #isIgnoreNull()
   * @generated
   */
  void setIgnoreNull(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.MappedColumn#isIgnoreNull <em>Ignore Null</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetIgnoreNull()
   * @see #isIgnoreNull()
   * @see #setIgnoreNull(boolean)
   * @generated
   */
  void unsetIgnoreNull();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.MappedColumn#isIgnoreNull <em>Ignore Null</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Ignore Null</em>' attribute is set.
   * @see #unsetIgnoreNull()
   * @see #isIgnoreNull()
   * @see #setIgnoreNull(boolean)
   * @generated
   */
  boolean isSetIgnoreNull();

  /**
   * Returns the value of the '<em><b>Mapping Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapping Column</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapping Column</em>' attribute.
   * @see #setMappingColumn(String)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getMappedColumn_MappingColumn()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
   *        extendedMetaData="kind='attribute' name='mappingColumn'"
   * @generated
   */
  String getMappingColumn();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.MappedColumn#getMappingColumn <em>Mapping Column</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapping Column</em>' attribute.
   * @see #getMappingColumn()
   * @generated
   */
  void setMappingColumn(String value);

  /**
   * Returns the value of the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Threshold</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Threshold</em>' attribute.
   * @see #setThreshold(String)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getMappedColumn_Threshold()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
   *        extendedMetaData="kind='attribute' name='threshold'"
   * @generated
   */
  String getThreshold();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.MappedColumn#getThreshold <em>Threshold</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Threshold</em>' attribute.
   * @see #getThreshold()
   * @generated
   */
  void setThreshold(String value);

} // MappedColumn
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
