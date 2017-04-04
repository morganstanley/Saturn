package com.ms.qaTools.saturn.modules.extractDDLModule;

import com.ms.qaTools.saturn.exception.exception;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Extract Operation</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.ExtractOperation#getException <em>Exception</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.ExtractOperation#getDatabaseResource <em>Database Resource
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.ExtractOperation#getDataBaseQualifier <em>Data Base
 * Qualifier</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.ExtractOperation#isIgnoreMissing <em>Ignore Missing</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getExtractOperation()
 * @model annotation=
 *        "http://www.ms.com/2006/pdsttools/xsd2perl executable='Saturn::Module::ExtractDDL::ExtractOperation::Executable'"
 *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib name='extractDDL_extract'"
 *        extendedMetaData="name='ExtractOperation' kind='elementOnly'"
 * @generated
 */
public interface ExtractOperation extends AbstractOperation
{
  /**
   * Returns the value of the '<em><b>Exception</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exception</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception</em>' containment reference.
   * @see #setException(exception)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getExtractOperation_Exception()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Exception' namespace='http://www.ms.com/2009/Saturn/Exception'"
   * @generated
   */
  exception getException();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.ExtractOperation#getException <em>Exception</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Exception</em>' containment reference.
   * @see #getException()
   * @generated
   */
  void setException(exception value);

  /**
   * Returns the value of the '<em><b>Database Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Database Resource</em>' containment reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Database Resource</em>' containment reference.
   * @see #setDatabaseResource(NamedResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getExtractOperation_DatabaseResource()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='DatabaseResource' namespace='##targetNamespace'"
   * @generated
   */
  NamedResourceDefinition getDatabaseResource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.ExtractOperation#getDatabaseResource <em>Database Resource</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Database Resource</em>' containment reference.
   * @see #getDatabaseResource()
   * @generated
   */
  void setDatabaseResource(NamedResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Data Base Qualifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Base Qualifier</em>' containment reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Base Qualifier</em>' containment reference.
   * @see #setDataBaseQualifier(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getExtractOperation_DataBaseQualifier()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='DataBaseQualifier' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getDataBaseQualifier();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.ExtractOperation#getDataBaseQualifier <em>Data Base Qualifier</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Base Qualifier</em>' containment reference.
   * @see #getDataBaseQualifier()
   * @generated
   */
  void setDataBaseQualifier(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Ignore Missing</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ignore Missing</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ignore Missing</em>' attribute.
   * @see #isSetIgnoreMissing()
   * @see #unsetIgnoreMissing()
   * @see #setIgnoreMissing(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getExtractOperation_IgnoreMissing()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='ignoreMissing'"
   * @generated
   */
  boolean isIgnoreMissing();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.ExtractOperation#isIgnoreMissing <em>Ignore Missing</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Ignore Missing</em>' attribute.
   * @see #isSetIgnoreMissing()
   * @see #unsetIgnoreMissing()
   * @see #isIgnoreMissing()
   * @generated
   */
  void setIgnoreMissing(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.ExtractOperation#isIgnoreMissing <em>Ignore Missing</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetIgnoreMissing()
   * @see #isIgnoreMissing()
   * @see #setIgnoreMissing(boolean)
   * @generated
   */
  void unsetIgnoreMissing();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.ExtractOperation#isIgnoreMissing <em>Ignore Missing</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Ignore Missing</em>' attribute is set.
   * @see #unsetIgnoreMissing()
   * @see #isIgnoreMissing()
   * @see #setIgnoreMissing(boolean)
   * @generated
   */
  boolean isSetIgnoreMissing();

} // ExtractOperation
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
