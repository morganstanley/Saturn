/**
 * COPYRIGHT NOTICE AND DISCLAIMER
 *  
 * Copyright © 2009, Contributor
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License, version 3 for more details.
 * You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
 * THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
 *
 * $Id$
 */
package com.ms.qaTools.saturn.modules.extractDDLModule;

import org.eclipse.emf.common.util.EList;

import com.ms.qaTools.saturn.exception.exception;
import com.ms.qaTools.saturn.types.ComplexValueMap;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Alter Operation</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getException <em>Exception</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getOutputResource <em>Output Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getDataBaseQualifier <em>Data Base Qualifier</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getDataBaseOverride <em>Data Base Override</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getTableSpaceOverride <em>Table Space Override</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getTableSpaceSuffix <em>Table Space Suffix</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getStorageGroupOverride <em>Storage Group Override</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getQualifierMaps <em>Qualifier Maps</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getDataBaseMaps <em>Data Base Maps</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getStorageGroupMaps <em>Storage Group Maps</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getTableLockOverride <em>Table Lock Override</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isAddDataBaseName <em>Add Data Base Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isAddOwner <em>Add Owner</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isAddQualifier <em>Add Qualifier</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isCreateTableSpaces <em>Create Table Spaces</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isForceAlter <em>Force Alter</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isGenIDByDefault <em>Gen ID By Default</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isIgnoreMissing <em>Ignore Missing</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isNoComments <em>No Comments</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isNoRestrictOnDrop <em>No Restrict On Drop</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isRemoveRestrictOnDrop <em>Remove Restrict On Drop</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isSeparateForeignKeys <em>Separate Foreign Keys</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isTranslateProcedureDefs <em>Translate Procedure Defs</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isTranslateViewDefs <em>Translate View Defs</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getAlterOperation()
 * @model extendedMetaData="name='AlterOperation' kind='elementOnly'"
 * @generated
 */
public interface AlterOperation extends AbstractOperation
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
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getAlterOperation_Exception()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Exception' namespace='http://www.ms.com/2009/Saturn/Exception'"
   * @generated
   */
  exception getException();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getException <em>Exception</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Exception</em>' containment reference.
   * @see #getException()
   * @generated
   */
  void setException(exception value);

  /**
   * Returns the value of the '<em><b>Output Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Resource</em>' containment reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Resource</em>' containment reference.
   * @see #setOutputResource(NamedResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getAlterOperation_OutputResource()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='OutputResource' namespace='##targetNamespace'"
   * @generated
   */
  NamedResourceDefinition getOutputResource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getOutputResource <em>Output Resource</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Output Resource</em>' containment reference.
   * @see #getOutputResource()
   * @generated
   */
  void setOutputResource(NamedResourceDefinition value);

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
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getAlterOperation_DataBaseQualifier()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='DataBaseQualifier' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getDataBaseQualifier();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getDataBaseQualifier <em>Data Base Qualifier</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Base Qualifier</em>' containment reference.
   * @see #getDataBaseQualifier()
   * @generated
   */
  void setDataBaseQualifier(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Data Base Override</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Base Override</em>' containment reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Base Override</em>' containment reference.
   * @see #setDataBaseOverride(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getAlterOperation_DataBaseOverride()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='DataBaseOverride' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getDataBaseOverride();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getDataBaseOverride <em>Data Base Override</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Base Override</em>' containment reference.
   * @see #getDataBaseOverride()
   * @generated
   */
  void setDataBaseOverride(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Table Space Override</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table Space Override</em>' containment reference isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table Space Override</em>' containment reference.
   * @see #setTableSpaceOverride(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getAlterOperation_TableSpaceOverride()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='TableSpaceOverride' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getTableSpaceOverride();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getTableSpaceOverride <em>Table Space Override</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Table Space Override</em>' containment reference.
   * @see #getTableSpaceOverride()
   * @generated
   */
  void setTableSpaceOverride(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Table Space Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table Space Suffix</em>' containment reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table Space Suffix</em>' containment reference.
   * @see #setTableSpaceSuffix(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getAlterOperation_TableSpaceSuffix()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='TableSpaceSuffix' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getTableSpaceSuffix();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getTableSpaceSuffix <em>Table Space Suffix</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Table Space Suffix</em>' containment reference.
   * @see #getTableSpaceSuffix()
   * @generated
   */
  void setTableSpaceSuffix(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Storage Group Override</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Storage Group Override</em>' containment reference isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Storage Group Override</em>' containment reference.
   * @see #setStorageGroupOverride(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getAlterOperation_StorageGroupOverride()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='StorageGroupOverride' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getStorageGroupOverride();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getStorageGroupOverride <em>Storage Group Override</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Storage Group Override</em>' containment reference.
   * @see #getStorageGroupOverride()
   * @generated
   */
  void setStorageGroupOverride(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Qualifier Maps</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.types.ComplexValueMap}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualifier Maps</em>' containment reference list isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualifier Maps</em>' containment reference list.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getAlterOperation_QualifierMaps()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='QualifierMaps' namespace='##targetNamespace'"
   * @generated
   */
  EList<ComplexValueMap> getQualifierMaps();

  /**
   * Returns the value of the '<em><b>Data Base Maps</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.types.ComplexValueMap}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Base Maps</em>' containment reference list isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Base Maps</em>' containment reference list.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getAlterOperation_DataBaseMaps()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='DataBaseMaps' namespace='##targetNamespace'"
   * @generated
   */
  EList<ComplexValueMap> getDataBaseMaps();

  /**
   * Returns the value of the '<em><b>Storage Group Maps</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.types.ComplexValueMap}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Storage Group Maps</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Storage Group Maps</em>' containment reference list.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getAlterOperation_StorageGroupMaps()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='StorageGroupMaps' namespace='##targetNamespace'"
   * @generated
   */
  EList<ComplexValueMap> getStorageGroupMaps();

  /**
   * Returns the value of the '<em><b>Add Data Base Name</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Add Data Base Name</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Add Data Base Name</em>' attribute.
   * @see #isSetAddDataBaseName()
   * @see #unsetAddDataBaseName()
   * @see #setAddDataBaseName(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getAlterOperation_AddDataBaseName()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='addDataBaseName'"
   * @generated
   */
  boolean isAddDataBaseName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isAddDataBaseName <em>Add Data Base Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Add Data Base Name</em>' attribute.
   * @see #isSetAddDataBaseName()
   * @see #unsetAddDataBaseName()
   * @see #isAddDataBaseName()
   * @generated
   */
  void setAddDataBaseName(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isAddDataBaseName <em>Add Data Base Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAddDataBaseName()
   * @see #isAddDataBaseName()
   * @see #setAddDataBaseName(boolean)
   * @generated
   */
  void unsetAddDataBaseName();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isAddDataBaseName <em>Add Data Base Name</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Add Data Base Name</em>' attribute is set.
   * @see #unsetAddDataBaseName()
   * @see #isAddDataBaseName()
   * @see #setAddDataBaseName(boolean)
   * @generated
   */
  boolean isSetAddDataBaseName();

  /**
   * Returns the value of the '<em><b>Add Owner</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Add Owner</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Add Owner</em>' attribute.
   * @see #isSetAddOwner()
   * @see #unsetAddOwner()
   * @see #setAddOwner(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getAlterOperation_AddOwner()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='addOwner'"
   * @generated
   */
  boolean isAddOwner();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isAddOwner <em>Add Owner</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Add Owner</em>' attribute.
   * @see #isSetAddOwner()
   * @see #unsetAddOwner()
   * @see #isAddOwner()
   * @generated
   */
  void setAddOwner(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isAddOwner <em>Add Owner</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAddOwner()
   * @see #isAddOwner()
   * @see #setAddOwner(boolean)
   * @generated
   */
  void unsetAddOwner();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isAddOwner <em>Add Owner</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Add Owner</em>' attribute is set.
   * @see #unsetAddOwner()
   * @see #isAddOwner()
   * @see #setAddOwner(boolean)
   * @generated
   */
  boolean isSetAddOwner();

  /**
   * Returns the value of the '<em><b>Add Qualifier</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Add Qualifier</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Add Qualifier</em>' attribute.
   * @see #isSetAddQualifier()
   * @see #unsetAddQualifier()
   * @see #setAddQualifier(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getAlterOperation_AddQualifier()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='addQualifier'"
   * @generated
   */
  boolean isAddQualifier();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isAddQualifier <em>Add Qualifier</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Add Qualifier</em>' attribute.
   * @see #isSetAddQualifier()
   * @see #unsetAddQualifier()
   * @see #isAddQualifier()
   * @generated
   */
  void setAddQualifier(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isAddQualifier <em>Add Qualifier</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAddQualifier()
   * @see #isAddQualifier()
   * @see #setAddQualifier(boolean)
   * @generated
   */
  void unsetAddQualifier();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isAddQualifier <em>Add Qualifier</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Add Qualifier</em>' attribute is set.
   * @see #unsetAddQualifier()
   * @see #isAddQualifier()
   * @see #setAddQualifier(boolean)
   * @generated
   */
  boolean isSetAddQualifier();

  /**
   * Returns the value of the '<em><b>Create Table Spaces</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Table Spaces</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create Table Spaces</em>' attribute.
   * @see #isSetCreateTableSpaces()
   * @see #unsetCreateTableSpaces()
   * @see #setCreateTableSpaces(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getAlterOperation_CreateTableSpaces()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='createTableSpaces'"
   * @generated
   */
  boolean isCreateTableSpaces();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isCreateTableSpaces <em>Create Table Spaces</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Create Table Spaces</em>' attribute.
   * @see #isSetCreateTableSpaces()
   * @see #unsetCreateTableSpaces()
   * @see #isCreateTableSpaces()
   * @generated
   */
  void setCreateTableSpaces(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isCreateTableSpaces <em>Create Table Spaces</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetCreateTableSpaces()
   * @see #isCreateTableSpaces()
   * @see #setCreateTableSpaces(boolean)
   * @generated
   */
  void unsetCreateTableSpaces();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isCreateTableSpaces <em>Create Table Spaces</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Create Table Spaces</em>' attribute is set.
   * @see #unsetCreateTableSpaces()
   * @see #isCreateTableSpaces()
   * @see #setCreateTableSpaces(boolean)
   * @generated
   */
  boolean isSetCreateTableSpaces();

  /**
   * Returns the value of the '<em><b>Force Alter</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Force Alter</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Force Alter</em>' attribute.
   * @see #isSetForceAlter()
   * @see #unsetForceAlter()
   * @see #setForceAlter(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getAlterOperation_ForceAlter()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='forceAlter'"
   * @generated
   */
  boolean isForceAlter();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isForceAlter <em>Force Alter</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Force Alter</em>' attribute.
   * @see #isSetForceAlter()
   * @see #unsetForceAlter()
   * @see #isForceAlter()
   * @generated
   */
  void setForceAlter(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isForceAlter <em>Force Alter</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetForceAlter()
   * @see #isForceAlter()
   * @see #setForceAlter(boolean)
   * @generated
   */
  void unsetForceAlter();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isForceAlter <em>Force Alter</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Force Alter</em>' attribute is set.
   * @see #unsetForceAlter()
   * @see #isForceAlter()
   * @see #setForceAlter(boolean)
   * @generated
   */
  boolean isSetForceAlter();

  /**
   * Returns the value of the '<em><b>Gen ID By Default</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gen ID By Default</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gen ID By Default</em>' attribute.
   * @see #isSetGenIDByDefault()
   * @see #unsetGenIDByDefault()
   * @see #setGenIDByDefault(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getAlterOperation_GenIDByDefault()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='genIDByDefault'"
   * @generated
   */
  boolean isGenIDByDefault();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isGenIDByDefault <em>Gen ID By Default</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Gen ID By Default</em>' attribute.
   * @see #isSetGenIDByDefault()
   * @see #unsetGenIDByDefault()
   * @see #isGenIDByDefault()
   * @generated
   */
  void setGenIDByDefault(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isGenIDByDefault <em>Gen ID By Default</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetGenIDByDefault()
   * @see #isGenIDByDefault()
   * @see #setGenIDByDefault(boolean)
   * @generated
   */
  void unsetGenIDByDefault();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isGenIDByDefault <em>Gen ID By Default</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Gen ID By Default</em>' attribute is set.
   * @see #unsetGenIDByDefault()
   * @see #isGenIDByDefault()
   * @see #setGenIDByDefault(boolean)
   * @generated
   */
  boolean isSetGenIDByDefault();

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
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getAlterOperation_IgnoreMissing()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='ignoreMissing'"
   * @generated
   */
  boolean isIgnoreMissing();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isIgnoreMissing <em>Ignore Missing</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Ignore Missing</em>' attribute.
   * @see #isSetIgnoreMissing()
   * @see #unsetIgnoreMissing()
   * @see #isIgnoreMissing()
   * @generated
   */
  void setIgnoreMissing(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isIgnoreMissing <em>Ignore Missing</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetIgnoreMissing()
   * @see #isIgnoreMissing()
   * @see #setIgnoreMissing(boolean)
   * @generated
   */
  void unsetIgnoreMissing();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isIgnoreMissing <em>Ignore Missing</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Ignore Missing</em>' attribute is set.
   * @see #unsetIgnoreMissing()
   * @see #isIgnoreMissing()
   * @see #setIgnoreMissing(boolean)
   * @generated
   */
  boolean isSetIgnoreMissing();

  /**
   * Returns the value of the '<em><b>No Comments</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>No Comments</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>No Comments</em>' attribute.
   * @see #isSetNoComments()
   * @see #unsetNoComments()
   * @see #setNoComments(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getAlterOperation_NoComments()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='noComments'"
   * @generated
   */
  boolean isNoComments();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isNoComments <em>No Comments</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>No Comments</em>' attribute.
   * @see #isSetNoComments()
   * @see #unsetNoComments()
   * @see #isNoComments()
   * @generated
   */
  void setNoComments(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isNoComments <em>No Comments</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetNoComments()
   * @see #isNoComments()
   * @see #setNoComments(boolean)
   * @generated
   */
  void unsetNoComments();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isNoComments <em>No Comments</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>No Comments</em>' attribute is set.
   * @see #unsetNoComments()
   * @see #isNoComments()
   * @see #setNoComments(boolean)
   * @generated
   */
  boolean isSetNoComments();

  /**
   * Returns the value of the '<em><b>No Restrict On Drop</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>No Restrict On Drop</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>No Restrict On Drop</em>' attribute.
   * @see #isSetNoRestrictOnDrop()
   * @see #unsetNoRestrictOnDrop()
   * @see #setNoRestrictOnDrop(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getAlterOperation_NoRestrictOnDrop()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='noRestrictOnDrop'"
   * @generated
   */
  boolean isNoRestrictOnDrop();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isNoRestrictOnDrop <em>No Restrict On Drop</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>No Restrict On Drop</em>' attribute.
   * @see #isSetNoRestrictOnDrop()
   * @see #unsetNoRestrictOnDrop()
   * @see #isNoRestrictOnDrop()
   * @generated
   */
  void setNoRestrictOnDrop(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isNoRestrictOnDrop <em>No Restrict On Drop</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetNoRestrictOnDrop()
   * @see #isNoRestrictOnDrop()
   * @see #setNoRestrictOnDrop(boolean)
   * @generated
   */
  void unsetNoRestrictOnDrop();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isNoRestrictOnDrop <em>No Restrict On Drop</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>No Restrict On Drop</em>' attribute is set.
   * @see #unsetNoRestrictOnDrop()
   * @see #isNoRestrictOnDrop()
   * @see #setNoRestrictOnDrop(boolean)
   * @generated
   */
  boolean isSetNoRestrictOnDrop();

  /**
   * Returns the value of the '<em><b>Remove Restrict On Drop</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Remove Restrict On Drop</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Remove Restrict On Drop</em>' attribute.
   * @see #isSetRemoveRestrictOnDrop()
   * @see #unsetRemoveRestrictOnDrop()
   * @see #setRemoveRestrictOnDrop(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getAlterOperation_RemoveRestrictOnDrop()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='removeRestrictOnDrop'"
   * @generated
   */
  boolean isRemoveRestrictOnDrop();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isRemoveRestrictOnDrop <em>Remove Restrict On Drop</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Remove Restrict On Drop</em>' attribute.
   * @see #isSetRemoveRestrictOnDrop()
   * @see #unsetRemoveRestrictOnDrop()
   * @see #isRemoveRestrictOnDrop()
   * @generated
   */
  void setRemoveRestrictOnDrop(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isRemoveRestrictOnDrop <em>Remove Restrict On Drop</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetRemoveRestrictOnDrop()
   * @see #isRemoveRestrictOnDrop()
   * @see #setRemoveRestrictOnDrop(boolean)
   * @generated
   */
  void unsetRemoveRestrictOnDrop();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isRemoveRestrictOnDrop <em>Remove Restrict On Drop</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Remove Restrict On Drop</em>' attribute is set.
   * @see #unsetRemoveRestrictOnDrop()
   * @see #isRemoveRestrictOnDrop()
   * @see #setRemoveRestrictOnDrop(boolean)
   * @generated
   */
  boolean isSetRemoveRestrictOnDrop();

  /**
   * Returns the value of the '<em><b>Separate Foreign Keys</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Separate Foreign Keys</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Separate Foreign Keys</em>' attribute.
   * @see #isSetSeparateForeignKeys()
   * @see #unsetSeparateForeignKeys()
   * @see #setSeparateForeignKeys(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getAlterOperation_SeparateForeignKeys()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='separateForeignKeys'"
   * @generated
   */
  boolean isSeparateForeignKeys();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isSeparateForeignKeys <em>Separate Foreign Keys</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Separate Foreign Keys</em>' attribute.
   * @see #isSetSeparateForeignKeys()
   * @see #unsetSeparateForeignKeys()
   * @see #isSeparateForeignKeys()
   * @generated
   */
  void setSeparateForeignKeys(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isSeparateForeignKeys <em>Separate Foreign Keys</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetSeparateForeignKeys()
   * @see #isSeparateForeignKeys()
   * @see #setSeparateForeignKeys(boolean)
   * @generated
   */
  void unsetSeparateForeignKeys();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isSeparateForeignKeys <em>Separate Foreign Keys</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Separate Foreign Keys</em>' attribute is set.
   * @see #unsetSeparateForeignKeys()
   * @see #isSeparateForeignKeys()
   * @see #setSeparateForeignKeys(boolean)
   * @generated
   */
  boolean isSetSeparateForeignKeys();

  /**
   * Returns the value of the '<em><b>Table Lock Override</b></em>' attribute.
   * The default value is <code>"ANY"</code>.
   * The literals are from the enumeration {@link com.ms.qaTools.saturn.modules.extractDDLModule.TableLockOverrideTypeEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table Lock Override</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table Lock Override</em>' attribute.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.TableLockOverrideTypeEnum
   * @see #isSetTableLockOverride()
   * @see #unsetTableLockOverride()
   * @see #setTableLockOverride(TableLockOverrideTypeEnum)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getAlterOperation_TableLockOverride()
   * @model default="ANY" unsettable="true"
   *        extendedMetaData="kind='attribute' name='tableLockOverride'"
   * @generated
   */
  TableLockOverrideTypeEnum getTableLockOverride();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getTableLockOverride <em>Table Lock Override</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Table Lock Override</em>' attribute.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.TableLockOverrideTypeEnum
   * @see #isSetTableLockOverride()
   * @see #unsetTableLockOverride()
   * @see #getTableLockOverride()
   * @generated
   */
  void setTableLockOverride(TableLockOverrideTypeEnum value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getTableLockOverride <em>Table Lock Override</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetTableLockOverride()
   * @see #getTableLockOverride()
   * @see #setTableLockOverride(TableLockOverrideTypeEnum)
   * @generated
   */
  void unsetTableLockOverride();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getTableLockOverride <em>Table Lock Override</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Table Lock Override</em>' attribute is set.
   * @see #unsetTableLockOverride()
   * @see #getTableLockOverride()
   * @see #setTableLockOverride(TableLockOverrideTypeEnum)
   * @generated
   */
  boolean isSetTableLockOverride();

  /**
   * Returns the value of the '<em><b>Translate Procedure Defs</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Translate Procedure Defs</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Translate Procedure Defs</em>' attribute.
   * @see #isSetTranslateProcedureDefs()
   * @see #unsetTranslateProcedureDefs()
   * @see #setTranslateProcedureDefs(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getAlterOperation_TranslateProcedureDefs()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='translateProcedureDefs'"
   * @generated
   */
  boolean isTranslateProcedureDefs();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isTranslateProcedureDefs <em>Translate Procedure Defs</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Translate Procedure Defs</em>' attribute.
   * @see #isSetTranslateProcedureDefs()
   * @see #unsetTranslateProcedureDefs()
   * @see #isTranslateProcedureDefs()
   * @generated
   */
  void setTranslateProcedureDefs(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isTranslateProcedureDefs <em>Translate Procedure Defs</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetTranslateProcedureDefs()
   * @see #isTranslateProcedureDefs()
   * @see #setTranslateProcedureDefs(boolean)
   * @generated
   */
  void unsetTranslateProcedureDefs();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isTranslateProcedureDefs <em>Translate Procedure Defs</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Translate Procedure Defs</em>' attribute is set.
   * @see #unsetTranslateProcedureDefs()
   * @see #isTranslateProcedureDefs()
   * @see #setTranslateProcedureDefs(boolean)
   * @generated
   */
  boolean isSetTranslateProcedureDefs();

  /**
   * Returns the value of the '<em><b>Translate View Defs</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Translate View Defs</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Translate View Defs</em>' attribute.
   * @see #isSetTranslateViewDefs()
   * @see #unsetTranslateViewDefs()
   * @see #setTranslateViewDefs(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getAlterOperation_TranslateViewDefs()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='translateViewDefs'"
   * @generated
   */
  boolean isTranslateViewDefs();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isTranslateViewDefs <em>Translate View Defs</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Translate View Defs</em>' attribute.
   * @see #isSetTranslateViewDefs()
   * @see #unsetTranslateViewDefs()
   * @see #isTranslateViewDefs()
   * @generated
   */
  void setTranslateViewDefs(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isTranslateViewDefs <em>Translate View Defs</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetTranslateViewDefs()
   * @see #isTranslateViewDefs()
   * @see #setTranslateViewDefs(boolean)
   * @generated
   */
  void unsetTranslateViewDefs();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isTranslateViewDefs <em>Translate View Defs</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Translate View Defs</em>' attribute is set.
   * @see #unsetTranslateViewDefs()
   * @see #isTranslateViewDefs()
   * @see #setTranslateViewDefs(boolean)
   * @generated
   */
  boolean isSetTranslateViewDefs();

} // AlterOperation
