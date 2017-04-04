package com.ms.qaTools.saturn.modules.extractDDLModule;

import org.eclipse.emf.common.util.EList;

import com.ms.qaTools.saturn.exception.exception;
import com.ms.qaTools.saturn.types.ComplexValueMap;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Render Operation</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getException <em>Exception</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getOutputResource <em>Output Resource</em>}
 * </li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getDataBaseQualifier <em>Data Base
 * Qualifier</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getDataBaseOverride <em>Data Base Override
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getTableSpaceOverride <em>Table Space
 * Override</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getTableSpaceSuffix <em>Table Space Suffix
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getStorageGroupOverride <em>Storage Group
 * Override</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getQualifierMaps <em>Qualifier Maps</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getDataBaseMaps <em>Data Base Maps</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getStorageGroupMaps <em>Storage Group Maps
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isAddDataBaseName <em>Add Data Base Name
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isAddOwner <em>Add Owner</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isAddQualifier <em>Add Qualifier</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreateForeignKeys <em>Create Foreign Keys
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreateIndexes <em>Create Indexes</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreatePermissions <em>Create Permissions
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreatePrimaryKeys <em>Create Primary Keys
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreateTableSpaces <em>Create Table Spaces
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getDataBaseDriver <em>Data Base Driver
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDdlXml <em>Ddl Xml</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDeferViews <em>Defer Views</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDropProcedures <em>Drop Procedures</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDropSequences <em>Drop Sequences</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDropTables <em>Drop Tables</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDropTableSpaces <em>Drop Table Spaces
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isGenIDByDefault <em>Gen ID By Default
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isNoComments <em>No Comments</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isNoDDLInfo <em>No DDL Info</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isNoRestrictOnDrop <em>No Restrict On Drop
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isPublicPermissions <em>Public Permissions
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isRemoveRestrictOnDrop <em>Remove Restrict
 * On Drop</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isSeparateForeignKeys <em>Separate Foreign
 * Keys</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isShortFileNames <em>Short File Names</em>}
 * </li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getTableLockOverride <em>Table Lock
 * Override</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isTranslateProcedureDefs <em>Translate
 * Procedure Defs</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isTranslateViewDefs <em>Translate View Defs
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation()
 * @model annotation=
 *        "http://www.ms.com/2006/pdsttools/xsd2perl executable='Saturn::Module::ExtractDDL::RenderOperation::Executable'"
 *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib name='extractDDL_render'"
 *        extendedMetaData="name='RenderOperation' kind='elementOnly'"
 * @generated
 */
public interface RenderOperation extends AbstractOperation
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
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_Exception()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Exception' namespace='http://www.ms.com/2009/Saturn/Exception'"
   * @generated
   */
  exception getException();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getException <em>Exception</em>}' containment reference.
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
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_OutputResource()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='OutputResource' namespace='##targetNamespace'"
   * @generated
   */
  NamedResourceDefinition getOutputResource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getOutputResource <em>Output Resource</em>}' containment reference.
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
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_DataBaseQualifier()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='DataBaseQualifier' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getDataBaseQualifier();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getDataBaseQualifier <em>Data Base Qualifier</em>}' containment reference.
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
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_DataBaseOverride()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='DataBaseOverride' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getDataBaseOverride();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getDataBaseOverride <em>Data Base Override</em>}' containment reference.
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
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_TableSpaceOverride()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='TableSpaceOverride' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getTableSpaceOverride();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getTableSpaceOverride <em>Table Space Override</em>}' containment reference.
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
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_TableSpaceSuffix()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='TableSpaceSuffix' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getTableSpaceSuffix();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getTableSpaceSuffix <em>Table Space Suffix</em>}' containment reference.
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
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_StorageGroupOverride()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='StorageGroupOverride' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getStorageGroupOverride();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getStorageGroupOverride <em>Storage Group Override</em>}' containment reference.
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
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_QualifierMaps()
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
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_DataBaseMaps()
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
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_StorageGroupMaps()
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
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_AddDataBaseName()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='addDataBaseName'"
   * @generated
   */
  boolean isAddDataBaseName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isAddDataBaseName <em>Add Data Base Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Add Data Base Name</em>' attribute.
   * @see #isSetAddDataBaseName()
   * @see #unsetAddDataBaseName()
   * @see #isAddDataBaseName()
   * @generated
   */
  void setAddDataBaseName(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isAddDataBaseName <em>Add Data Base Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAddDataBaseName()
   * @see #isAddDataBaseName()
   * @see #setAddDataBaseName(boolean)
   * @generated
   */
  void unsetAddDataBaseName();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isAddDataBaseName <em>Add Data Base Name</em>}' attribute is set.
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
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_AddOwner()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='addOwner'"
   * @generated
   */
  boolean isAddOwner();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isAddOwner <em>Add Owner</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Add Owner</em>' attribute.
   * @see #isSetAddOwner()
   * @see #unsetAddOwner()
   * @see #isAddOwner()
   * @generated
   */
  void setAddOwner(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isAddOwner <em>Add Owner</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAddOwner()
   * @see #isAddOwner()
   * @see #setAddOwner(boolean)
   * @generated
   */
  void unsetAddOwner();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isAddOwner <em>Add Owner</em>}' attribute is set.
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
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_AddQualifier()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='addQualifier'"
   * @generated
   */
  boolean isAddQualifier();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isAddQualifier <em>Add Qualifier</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Add Qualifier</em>' attribute.
   * @see #isSetAddQualifier()
   * @see #unsetAddQualifier()
   * @see #isAddQualifier()
   * @generated
   */
  void setAddQualifier(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isAddQualifier <em>Add Qualifier</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAddQualifier()
   * @see #isAddQualifier()
   * @see #setAddQualifier(boolean)
   * @generated
   */
  void unsetAddQualifier();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isAddQualifier <em>Add Qualifier</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Add Qualifier</em>' attribute is set.
   * @see #unsetAddQualifier()
   * @see #isAddQualifier()
   * @see #setAddQualifier(boolean)
   * @generated
   */
  boolean isSetAddQualifier();

  /**
   * Returns the value of the '<em><b>Create Foreign Keys</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Foreign Keys</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create Foreign Keys</em>' attribute.
   * @see #isSetCreateForeignKeys()
   * @see #unsetCreateForeignKeys()
   * @see #setCreateForeignKeys(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_CreateForeignKeys()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='createForeignKeys'"
   * @generated
   */
  boolean isCreateForeignKeys();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreateForeignKeys <em>Create Foreign Keys</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Create Foreign Keys</em>' attribute.
   * @see #isSetCreateForeignKeys()
   * @see #unsetCreateForeignKeys()
   * @see #isCreateForeignKeys()
   * @generated
   */
  void setCreateForeignKeys(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreateForeignKeys <em>Create Foreign Keys</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetCreateForeignKeys()
   * @see #isCreateForeignKeys()
   * @see #setCreateForeignKeys(boolean)
   * @generated
   */
  void unsetCreateForeignKeys();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreateForeignKeys <em>Create Foreign Keys</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Create Foreign Keys</em>' attribute is set.
   * @see #unsetCreateForeignKeys()
   * @see #isCreateForeignKeys()
   * @see #setCreateForeignKeys(boolean)
   * @generated
   */
  boolean isSetCreateForeignKeys();

  /**
   * Returns the value of the '<em><b>Create Indexes</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Indexes</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create Indexes</em>' attribute.
   * @see #isSetCreateIndexes()
   * @see #unsetCreateIndexes()
   * @see #setCreateIndexes(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_CreateIndexes()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='createIndexes'"
   * @generated
   */
  boolean isCreateIndexes();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreateIndexes <em>Create Indexes</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Create Indexes</em>' attribute.
   * @see #isSetCreateIndexes()
   * @see #unsetCreateIndexes()
   * @see #isCreateIndexes()
   * @generated
   */
  void setCreateIndexes(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreateIndexes <em>Create Indexes</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetCreateIndexes()
   * @see #isCreateIndexes()
   * @see #setCreateIndexes(boolean)
   * @generated
   */
  void unsetCreateIndexes();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreateIndexes <em>Create Indexes</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Create Indexes</em>' attribute is set.
   * @see #unsetCreateIndexes()
   * @see #isCreateIndexes()
   * @see #setCreateIndexes(boolean)
   * @generated
   */
  boolean isSetCreateIndexes();

  /**
   * Returns the value of the '<em><b>Create Permissions</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Permissions</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create Permissions</em>' attribute.
   * @see #isSetCreatePermissions()
   * @see #unsetCreatePermissions()
   * @see #setCreatePermissions(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_CreatePermissions()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='createPermissions'"
   * @generated
   */
  boolean isCreatePermissions();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreatePermissions <em>Create Permissions</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Create Permissions</em>' attribute.
   * @see #isSetCreatePermissions()
   * @see #unsetCreatePermissions()
   * @see #isCreatePermissions()
   * @generated
   */
  void setCreatePermissions(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreatePermissions <em>Create Permissions</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetCreatePermissions()
   * @see #isCreatePermissions()
   * @see #setCreatePermissions(boolean)
   * @generated
   */
  void unsetCreatePermissions();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreatePermissions <em>Create Permissions</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Create Permissions</em>' attribute is set.
   * @see #unsetCreatePermissions()
   * @see #isCreatePermissions()
   * @see #setCreatePermissions(boolean)
   * @generated
   */
  boolean isSetCreatePermissions();

  /**
   * Returns the value of the '<em><b>Create Primary Keys</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Primary Keys</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create Primary Keys</em>' attribute.
   * @see #isSetCreatePrimaryKeys()
   * @see #unsetCreatePrimaryKeys()
   * @see #setCreatePrimaryKeys(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_CreatePrimaryKeys()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='createPrimaryKeys'"
   * @generated
   */
  boolean isCreatePrimaryKeys();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreatePrimaryKeys <em>Create Primary Keys</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Create Primary Keys</em>' attribute.
   * @see #isSetCreatePrimaryKeys()
   * @see #unsetCreatePrimaryKeys()
   * @see #isCreatePrimaryKeys()
   * @generated
   */
  void setCreatePrimaryKeys(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreatePrimaryKeys <em>Create Primary Keys</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetCreatePrimaryKeys()
   * @see #isCreatePrimaryKeys()
   * @see #setCreatePrimaryKeys(boolean)
   * @generated
   */
  void unsetCreatePrimaryKeys();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreatePrimaryKeys <em>Create Primary Keys</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Create Primary Keys</em>' attribute is set.
   * @see #unsetCreatePrimaryKeys()
   * @see #isCreatePrimaryKeys()
   * @see #setCreatePrimaryKeys(boolean)
   * @generated
   */
  boolean isSetCreatePrimaryKeys();

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
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_CreateTableSpaces()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='createTableSpaces'"
   * @generated
   */
  boolean isCreateTableSpaces();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreateTableSpaces <em>Create Table Spaces</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Create Table Spaces</em>' attribute.
   * @see #isSetCreateTableSpaces()
   * @see #unsetCreateTableSpaces()
   * @see #isCreateTableSpaces()
   * @generated
   */
  void setCreateTableSpaces(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreateTableSpaces <em>Create Table Spaces</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetCreateTableSpaces()
   * @see #isCreateTableSpaces()
   * @see #setCreateTableSpaces(boolean)
   * @generated
   */
  void unsetCreateTableSpaces();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreateTableSpaces <em>Create Table Spaces</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Create Table Spaces</em>' attribute is set.
   * @see #unsetCreateTableSpaces()
   * @see #isCreateTableSpaces()
   * @see #setCreateTableSpaces(boolean)
   * @generated
   */
  boolean isSetCreateTableSpaces();

  /**
   * Returns the value of the '<em><b>Data Base Driver</b></em>' attribute.
   * The literals are from the enumeration {@link com.ms.qaTools.saturn.modules.extractDDLModule.DataBaseDriverTypeEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Base Driver</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Base Driver</em>' attribute.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DataBaseDriverTypeEnum
   * @see #isSetDataBaseDriver()
   * @see #unsetDataBaseDriver()
   * @see #setDataBaseDriver(DataBaseDriverTypeEnum)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_DataBaseDriver()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='dataBaseDriver'"
   * @generated
   */
  DataBaseDriverTypeEnum getDataBaseDriver();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getDataBaseDriver <em>Data Base Driver</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Base Driver</em>' attribute.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DataBaseDriverTypeEnum
   * @see #isSetDataBaseDriver()
   * @see #unsetDataBaseDriver()
   * @see #getDataBaseDriver()
   * @generated
   */
  void setDataBaseDriver(DataBaseDriverTypeEnum value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getDataBaseDriver <em>Data Base Driver</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetDataBaseDriver()
   * @see #getDataBaseDriver()
   * @see #setDataBaseDriver(DataBaseDriverTypeEnum)
   * @generated
   */
  void unsetDataBaseDriver();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getDataBaseDriver <em>Data Base Driver</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Data Base Driver</em>' attribute is set.
   * @see #unsetDataBaseDriver()
   * @see #getDataBaseDriver()
   * @see #setDataBaseDriver(DataBaseDriverTypeEnum)
   * @generated
   */
  boolean isSetDataBaseDriver();

  /**
   * Returns the value of the '<em><b>Ddl Xml</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ddl Xml</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Ddl Xml</em>' attribute.
   * @see #isSetDdlXml()
   * @see #unsetDdlXml()
   * @see #setDdlXml(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_DdlXml()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='ddlXml'"
   * @generated
   */
  boolean isDdlXml();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDdlXml <em>Ddl Xml</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Ddl Xml</em>' attribute.
   * @see #isSetDdlXml()
   * @see #unsetDdlXml()
   * @see #isDdlXml()
   * @generated
   */
  void setDdlXml(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDdlXml <em>Ddl Xml</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetDdlXml()
   * @see #isDdlXml()
   * @see #setDdlXml(boolean)
   * @generated
   */
  void unsetDdlXml();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDdlXml <em>Ddl Xml</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Ddl Xml</em>' attribute is set.
   * @see #unsetDdlXml()
   * @see #isDdlXml()
   * @see #setDdlXml(boolean)
   * @generated
   */
  boolean isSetDdlXml();

  /**
   * Returns the value of the '<em><b>Defer Views</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Defer Views</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Defer Views</em>' attribute.
   * @see #isSetDeferViews()
   * @see #unsetDeferViews()
   * @see #setDeferViews(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_DeferViews()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='deferViews'"
   * @generated
   */
  boolean isDeferViews();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDeferViews <em>Defer Views</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Defer Views</em>' attribute.
   * @see #isSetDeferViews()
   * @see #unsetDeferViews()
   * @see #isDeferViews()
   * @generated
   */
  void setDeferViews(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDeferViews <em>Defer Views</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetDeferViews()
   * @see #isDeferViews()
   * @see #setDeferViews(boolean)
   * @generated
   */
  void unsetDeferViews();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDeferViews <em>Defer Views</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Defer Views</em>' attribute is set.
   * @see #unsetDeferViews()
   * @see #isDeferViews()
   * @see #setDeferViews(boolean)
   * @generated
   */
  boolean isSetDeferViews();

  /**
   * Returns the value of the '<em><b>Drop Procedures</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Drop Procedures</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Drop Procedures</em>' attribute.
   * @see #isSetDropProcedures()
   * @see #unsetDropProcedures()
   * @see #setDropProcedures(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_DropProcedures()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='dropProcedures'"
   * @generated
   */
  boolean isDropProcedures();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDropProcedures <em>Drop Procedures</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Drop Procedures</em>' attribute.
   * @see #isSetDropProcedures()
   * @see #unsetDropProcedures()
   * @see #isDropProcedures()
   * @generated
   */
  void setDropProcedures(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDropProcedures <em>Drop Procedures</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetDropProcedures()
   * @see #isDropProcedures()
   * @see #setDropProcedures(boolean)
   * @generated
   */
  void unsetDropProcedures();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDropProcedures <em>Drop Procedures</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Drop Procedures</em>' attribute is set.
   * @see #unsetDropProcedures()
   * @see #isDropProcedures()
   * @see #setDropProcedures(boolean)
   * @generated
   */
  boolean isSetDropProcedures();

  /**
   * Returns the value of the '<em><b>Drop Sequences</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Drop Sequences</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Drop Sequences</em>' attribute.
   * @see #isSetDropSequences()
   * @see #unsetDropSequences()
   * @see #setDropSequences(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_DropSequences()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='dropSequences'"
   * @generated
   */
  boolean isDropSequences();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDropSequences <em>Drop Sequences</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Drop Sequences</em>' attribute.
   * @see #isSetDropSequences()
   * @see #unsetDropSequences()
   * @see #isDropSequences()
   * @generated
   */
  void setDropSequences(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDropSequences <em>Drop Sequences</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetDropSequences()
   * @see #isDropSequences()
   * @see #setDropSequences(boolean)
   * @generated
   */
  void unsetDropSequences();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDropSequences <em>Drop Sequences</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Drop Sequences</em>' attribute is set.
   * @see #unsetDropSequences()
   * @see #isDropSequences()
   * @see #setDropSequences(boolean)
   * @generated
   */
  boolean isSetDropSequences();

  /**
   * Returns the value of the '<em><b>Drop Tables</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Drop Tables</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Drop Tables</em>' attribute.
   * @see #isSetDropTables()
   * @see #unsetDropTables()
   * @see #setDropTables(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_DropTables()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='dropTables'"
   * @generated
   */
  boolean isDropTables();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDropTables <em>Drop Tables</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Drop Tables</em>' attribute.
   * @see #isSetDropTables()
   * @see #unsetDropTables()
   * @see #isDropTables()
   * @generated
   */
  void setDropTables(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDropTables <em>Drop Tables</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetDropTables()
   * @see #isDropTables()
   * @see #setDropTables(boolean)
   * @generated
   */
  void unsetDropTables();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDropTables <em>Drop Tables</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Drop Tables</em>' attribute is set.
   * @see #unsetDropTables()
   * @see #isDropTables()
   * @see #setDropTables(boolean)
   * @generated
   */
  boolean isSetDropTables();

  /**
   * Returns the value of the '<em><b>Drop Table Spaces</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Drop Table Spaces</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Drop Table Spaces</em>' attribute.
   * @see #isSetDropTableSpaces()
   * @see #unsetDropTableSpaces()
   * @see #setDropTableSpaces(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_DropTableSpaces()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='dropTableSpaces'"
   * @generated
   */
  boolean isDropTableSpaces();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDropTableSpaces <em>Drop Table Spaces</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Drop Table Spaces</em>' attribute.
   * @see #isSetDropTableSpaces()
   * @see #unsetDropTableSpaces()
   * @see #isDropTableSpaces()
   * @generated
   */
  void setDropTableSpaces(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDropTableSpaces <em>Drop Table Spaces</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetDropTableSpaces()
   * @see #isDropTableSpaces()
   * @see #setDropTableSpaces(boolean)
   * @generated
   */
  void unsetDropTableSpaces();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDropTableSpaces <em>Drop Table Spaces</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Drop Table Spaces</em>' attribute is set.
   * @see #unsetDropTableSpaces()
   * @see #isDropTableSpaces()
   * @see #setDropTableSpaces(boolean)
   * @generated
   */
  boolean isSetDropTableSpaces();

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
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_GenIDByDefault()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='genIDByDefault'"
   * @generated
   */
  boolean isGenIDByDefault();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isGenIDByDefault <em>Gen ID By Default</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Gen ID By Default</em>' attribute.
   * @see #isSetGenIDByDefault()
   * @see #unsetGenIDByDefault()
   * @see #isGenIDByDefault()
   * @generated
   */
  void setGenIDByDefault(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isGenIDByDefault <em>Gen ID By Default</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetGenIDByDefault()
   * @see #isGenIDByDefault()
   * @see #setGenIDByDefault(boolean)
   * @generated
   */
  void unsetGenIDByDefault();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isGenIDByDefault <em>Gen ID By Default</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Gen ID By Default</em>' attribute is set.
   * @see #unsetGenIDByDefault()
   * @see #isGenIDByDefault()
   * @see #setGenIDByDefault(boolean)
   * @generated
   */
  boolean isSetGenIDByDefault();

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
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_NoComments()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='noComments'"
   * @generated
   */
  boolean isNoComments();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isNoComments <em>No Comments</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>No Comments</em>' attribute.
   * @see #isSetNoComments()
   * @see #unsetNoComments()
   * @see #isNoComments()
   * @generated
   */
  void setNoComments(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isNoComments <em>No Comments</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetNoComments()
   * @see #isNoComments()
   * @see #setNoComments(boolean)
   * @generated
   */
  void unsetNoComments();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isNoComments <em>No Comments</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>No Comments</em>' attribute is set.
   * @see #unsetNoComments()
   * @see #isNoComments()
   * @see #setNoComments(boolean)
   * @generated
   */
  boolean isSetNoComments();

  /**
   * Returns the value of the '<em><b>No DDL Info</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>No DDL Info</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>No DDL Info</em>' attribute.
   * @see #isSetNoDDLInfo()
   * @see #unsetNoDDLInfo()
   * @see #setNoDDLInfo(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_NoDDLInfo()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='noDDLInfo'"
   * @generated
   */
  boolean isNoDDLInfo();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isNoDDLInfo <em>No DDL Info</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>No DDL Info</em>' attribute.
   * @see #isSetNoDDLInfo()
   * @see #unsetNoDDLInfo()
   * @see #isNoDDLInfo()
   * @generated
   */
  void setNoDDLInfo(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isNoDDLInfo <em>No DDL Info</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetNoDDLInfo()
   * @see #isNoDDLInfo()
   * @see #setNoDDLInfo(boolean)
   * @generated
   */
  void unsetNoDDLInfo();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isNoDDLInfo <em>No DDL Info</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>No DDL Info</em>' attribute is set.
   * @see #unsetNoDDLInfo()
   * @see #isNoDDLInfo()
   * @see #setNoDDLInfo(boolean)
   * @generated
   */
  boolean isSetNoDDLInfo();

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
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_NoRestrictOnDrop()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='noRestrictOnDrop'"
   * @generated
   */
  boolean isNoRestrictOnDrop();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isNoRestrictOnDrop <em>No Restrict On Drop</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>No Restrict On Drop</em>' attribute.
   * @see #isSetNoRestrictOnDrop()
   * @see #unsetNoRestrictOnDrop()
   * @see #isNoRestrictOnDrop()
   * @generated
   */
  void setNoRestrictOnDrop(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isNoRestrictOnDrop <em>No Restrict On Drop</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetNoRestrictOnDrop()
   * @see #isNoRestrictOnDrop()
   * @see #setNoRestrictOnDrop(boolean)
   * @generated
   */
  void unsetNoRestrictOnDrop();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isNoRestrictOnDrop <em>No Restrict On Drop</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>No Restrict On Drop</em>' attribute is set.
   * @see #unsetNoRestrictOnDrop()
   * @see #isNoRestrictOnDrop()
   * @see #setNoRestrictOnDrop(boolean)
   * @generated
   */
  boolean isSetNoRestrictOnDrop();

  /**
   * Returns the value of the '<em><b>Public Permissions</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Public Permissions</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Public Permissions</em>' attribute.
   * @see #isSetPublicPermissions()
   * @see #unsetPublicPermissions()
   * @see #setPublicPermissions(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_PublicPermissions()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='publicPermissions'"
   * @generated
   */
  boolean isPublicPermissions();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isPublicPermissions <em>Public Permissions</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Public Permissions</em>' attribute.
   * @see #isSetPublicPermissions()
   * @see #unsetPublicPermissions()
   * @see #isPublicPermissions()
   * @generated
   */
  void setPublicPermissions(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isPublicPermissions <em>Public Permissions</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetPublicPermissions()
   * @see #isPublicPermissions()
   * @see #setPublicPermissions(boolean)
   * @generated
   */
  void unsetPublicPermissions();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isPublicPermissions <em>Public Permissions</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Public Permissions</em>' attribute is set.
   * @see #unsetPublicPermissions()
   * @see #isPublicPermissions()
   * @see #setPublicPermissions(boolean)
   * @generated
   */
  boolean isSetPublicPermissions();

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
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_RemoveRestrictOnDrop()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='removeRestrictOnDrop'"
   * @generated
   */
  boolean isRemoveRestrictOnDrop();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isRemoveRestrictOnDrop <em>Remove Restrict On Drop</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Remove Restrict On Drop</em>' attribute.
   * @see #isSetRemoveRestrictOnDrop()
   * @see #unsetRemoveRestrictOnDrop()
   * @see #isRemoveRestrictOnDrop()
   * @generated
   */
  void setRemoveRestrictOnDrop(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isRemoveRestrictOnDrop <em>Remove Restrict On Drop</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetRemoveRestrictOnDrop()
   * @see #isRemoveRestrictOnDrop()
   * @see #setRemoveRestrictOnDrop(boolean)
   * @generated
   */
  void unsetRemoveRestrictOnDrop();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isRemoveRestrictOnDrop <em>Remove Restrict On Drop</em>}' attribute is set.
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
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_SeparateForeignKeys()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='separateForeignKeys'"
   * @generated
   */
  boolean isSeparateForeignKeys();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isSeparateForeignKeys <em>Separate Foreign Keys</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Separate Foreign Keys</em>' attribute.
   * @see #isSetSeparateForeignKeys()
   * @see #unsetSeparateForeignKeys()
   * @see #isSeparateForeignKeys()
   * @generated
   */
  void setSeparateForeignKeys(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isSeparateForeignKeys <em>Separate Foreign Keys</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetSeparateForeignKeys()
   * @see #isSeparateForeignKeys()
   * @see #setSeparateForeignKeys(boolean)
   * @generated
   */
  void unsetSeparateForeignKeys();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isSeparateForeignKeys <em>Separate Foreign Keys</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Separate Foreign Keys</em>' attribute is set.
   * @see #unsetSeparateForeignKeys()
   * @see #isSeparateForeignKeys()
   * @see #setSeparateForeignKeys(boolean)
   * @generated
   */
  boolean isSetSeparateForeignKeys();

  /**
   * Returns the value of the '<em><b>Short File Names</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Short File Names</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Short File Names</em>' attribute.
   * @see #isSetShortFileNames()
   * @see #unsetShortFileNames()
   * @see #setShortFileNames(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_ShortFileNames()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='shortFileNames'"
   * @generated
   */
  boolean isShortFileNames();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isShortFileNames <em>Short File Names</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Short File Names</em>' attribute.
   * @see #isSetShortFileNames()
   * @see #unsetShortFileNames()
   * @see #isShortFileNames()
   * @generated
   */
  void setShortFileNames(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isShortFileNames <em>Short File Names</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetShortFileNames()
   * @see #isShortFileNames()
   * @see #setShortFileNames(boolean)
   * @generated
   */
  void unsetShortFileNames();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isShortFileNames <em>Short File Names</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Short File Names</em>' attribute is set.
   * @see #unsetShortFileNames()
   * @see #isShortFileNames()
   * @see #setShortFileNames(boolean)
   * @generated
   */
  boolean isSetShortFileNames();

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
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_TableLockOverride()
   * @model default="ANY" unsettable="true"
   *        extendedMetaData="kind='attribute' name='tableLockOverride'"
   * @generated
   */
  TableLockOverrideTypeEnum getTableLockOverride();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getTableLockOverride <em>Table Lock Override</em>}' attribute.
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
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getTableLockOverride <em>Table Lock Override</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetTableLockOverride()
   * @see #getTableLockOverride()
   * @see #setTableLockOverride(TableLockOverrideTypeEnum)
   * @generated
   */
  void unsetTableLockOverride();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getTableLockOverride <em>Table Lock Override</em>}' attribute is set.
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
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_TranslateProcedureDefs()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='translateProcedureDefs'"
   * @generated
   */
  boolean isTranslateProcedureDefs();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isTranslateProcedureDefs <em>Translate Procedure Defs</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Translate Procedure Defs</em>' attribute.
   * @see #isSetTranslateProcedureDefs()
   * @see #unsetTranslateProcedureDefs()
   * @see #isTranslateProcedureDefs()
   * @generated
   */
  void setTranslateProcedureDefs(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isTranslateProcedureDefs <em>Translate Procedure Defs</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetTranslateProcedureDefs()
   * @see #isTranslateProcedureDefs()
   * @see #setTranslateProcedureDefs(boolean)
   * @generated
   */
  void unsetTranslateProcedureDefs();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isTranslateProcedureDefs <em>Translate Procedure Defs</em>}' attribute is set.
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
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getRenderOperation_TranslateViewDefs()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='translateViewDefs'"
   * @generated
   */
  boolean isTranslateViewDefs();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isTranslateViewDefs <em>Translate View Defs</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Translate View Defs</em>' attribute.
   * @see #isSetTranslateViewDefs()
   * @see #unsetTranslateViewDefs()
   * @see #isTranslateViewDefs()
   * @generated
   */
  void setTranslateViewDefs(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isTranslateViewDefs <em>Translate View Defs</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetTranslateViewDefs()
   * @see #isTranslateViewDefs()
   * @see #setTranslateViewDefs(boolean)
   * @generated
   */
  void unsetTranslateViewDefs();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isTranslateViewDefs <em>Translate View Defs</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Translate View Defs</em>' attribute is set.
   * @see #unsetTranslateViewDefs()
   * @see #isTranslateViewDefs()
   * @see #setTranslateViewDefs(boolean)
   * @generated
   */
  boolean isSetTranslateViewDefs();

} // RenderOperation
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
