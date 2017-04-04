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
package com.ms.qaTools.saturn.modules.extractDDLModule.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ms.qaTools.saturn.exception.exception;
import com.ms.qaTools.saturn.modules.extractDDLModule.DataBaseDriverTypeEnum;
import com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage;
import com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation;
import com.ms.qaTools.saturn.modules.extractDDLModule.TableLockOverrideTypeEnum;
import com.ms.qaTools.saturn.types.ComplexValueMap;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Render Operation</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#getException <em>Exception</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#getOutputResource <em>Output
 * Resource</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#getDataBaseQualifier <em>Data Base
 * Qualifier</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#getDataBaseOverride <em>Data Base
 * Override</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#getTableSpaceOverride <em>Table
 * Space Override</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#getTableSpaceSuffix <em>Table
 * Space Suffix</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#getStorageGroupOverride <em>
 * Storage Group Override</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#getQualifierMaps <em>Qualifier
 * Maps</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#getDataBaseMaps <em>Data Base Maps
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#getStorageGroupMaps <em>Storage
 * Group Maps</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#isAddDataBaseName <em>Add Data
 * Base Name</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#isAddOwner <em>Add Owner</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#isAddQualifier <em>Add Qualifier
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#isCreateForeignKeys <em>Create
 * Foreign Keys</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#isCreateIndexes <em>Create Indexes
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#isCreatePermissions <em>Create
 * Permissions</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#isCreatePrimaryKeys <em>Create
 * Primary Keys</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#isCreateTableSpaces <em>Create
 * Table Spaces</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#getDataBaseDriver <em>Data Base
 * Driver</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#isDdlXml <em>Ddl Xml</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#isDeferViews <em>Defer Views</em>}
 * </li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#isDropProcedures <em>Drop
 * Procedures</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#isDropSequences <em>Drop Sequences
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#isDropTables <em>Drop Tables</em>}
 * </li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#isDropTableSpaces <em>Drop Table
 * Spaces</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#isGenIDByDefault <em>Gen ID By
 * Default</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#isNoComments <em>No Comments</em>}
 * </li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#isNoDDLInfo <em>No DDL Info</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#isNoRestrictOnDrop <em>No Restrict
 * On Drop</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#isPublicPermissions <em>Public
 * Permissions</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#isRemoveRestrictOnDrop <em>Remove
 * Restrict On Drop</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#isSeparateForeignKeys <em>Separate
 * Foreign Keys</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#isShortFileNames <em>Short File
 * Names</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#getTableLockOverride <em>Table
 * Lock Override</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#isTranslateProcedureDefs <em>
 * Translate Procedure Defs</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl#isTranslateViewDefs <em>Translate
 * View Defs</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RenderOperationImpl extends AbstractOperationImpl implements RenderOperation
{
  /**
   * The cached value of the '{@link #getException() <em>Exception</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getException()
   * @generated
   * @ordered
   */
  protected exception                              exception;

  /**
   * The cached value of the '{@link #getOutputResource() <em>Output Resource</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getOutputResource()
   * @generated
   * @ordered
   */
  protected NamedResourceDefinition                outputResource;

  /**
   * The cached value of the '{@link #getDataBaseQualifier() <em>Data Base Qualifier</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDataBaseQualifier()
   * @generated
   * @ordered
   */
  protected ComplexValue                           dataBaseQualifier;

  /**
   * The cached value of the '{@link #getDataBaseOverride() <em>Data Base Override</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDataBaseOverride()
   * @generated
   * @ordered
   */
  protected ComplexValue                           dataBaseOverride;

  /**
   * The cached value of the '{@link #getTableSpaceOverride() <em>Table Space Override</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getTableSpaceOverride()
   * @generated
   * @ordered
   */
  protected ComplexValue                           tableSpaceOverride;

  /**
   * The cached value of the '{@link #getTableSpaceSuffix() <em>Table Space Suffix</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getTableSpaceSuffix()
   * @generated
   * @ordered
   */
  protected ComplexValue                           tableSpaceSuffix;

  /**
   * The cached value of the '{@link #getStorageGroupOverride() <em>Storage Group Override</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getStorageGroupOverride()
   * @generated
   * @ordered
   */
  protected ComplexValue                           storageGroupOverride;

  /**
   * The cached value of the '{@link #getQualifierMaps() <em>Qualifier Maps</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getQualifierMaps()
   * @generated
   * @ordered
   */
  protected EList<ComplexValueMap>                 qualifierMaps;

  /**
   * The cached value of the '{@link #getDataBaseMaps() <em>Data Base Maps</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDataBaseMaps()
   * @generated
   * @ordered
   */
  protected EList<ComplexValueMap>                 dataBaseMaps;

  /**
   * The cached value of the '{@link #getStorageGroupMaps() <em>Storage Group Maps</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getStorageGroupMaps()
   * @generated
   * @ordered
   */
  protected EList<ComplexValueMap>                 storageGroupMaps;

  /**
   * The default value of the '{@link #getTableLockOverride() <em>Table Lock Override</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getTableLockOverride()
   * @generated
   * @ordered
   */
  protected static final TableLockOverrideTypeEnum TABLE_LOCK_OVERRIDE_EDEFAULT      = TableLockOverrideTypeEnum.ANY;

  /**
   * The cached value of the '{@link #getTableLockOverride() <em>Table Lock Override</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getTableLockOverride()
   * @generated
   * @ordered
   */
  protected TableLockOverrideTypeEnum              tableLockOverride                 = TABLE_LOCK_OVERRIDE_EDEFAULT;

  /**
   * This is true if the Table Lock Override attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                tableLockOverrideESet;

  /**
   * The default value of the '{@link #getDataBaseDriver() <em>Data Base Driver</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getDataBaseDriver()
   * @generated
   * @ordered
   */
  protected static final DataBaseDriverTypeEnum    DATA_BASE_DRIVER_EDEFAULT         = DataBaseDriverTypeEnum.SYBASE;

  /**
   * The cached value of the '{@link #getDataBaseDriver() <em>Data Base Driver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataBaseDriver()
   * @generated
   * @ordered
   */
  protected DataBaseDriverTypeEnum                 dataBaseDriver                    = DATA_BASE_DRIVER_EDEFAULT;

  /**
   * This is true if the Data Base Driver attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                dataBaseDriverESet;

  /**
   * The default value of the '{@link #isAddDataBaseName() <em>Add Data Base Name</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isAddDataBaseName()
   * @generated
   * @ordered
   */
  protected static final boolean                   ADD_DATA_BASE_NAME_EDEFAULT       = false;

  /**
   * The cached value of the '{@link #isAddDataBaseName() <em>Add Data Base Name</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isAddDataBaseName()
   * @generated
   * @ordered
   */
  protected boolean                                addDataBaseName                   = ADD_DATA_BASE_NAME_EDEFAULT;

  /**
   * This is true if the Add Data Base Name attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                addDataBaseNameESet;

  /**
   * The default value of the '{@link #isAddOwner() <em>Add Owner</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isAddOwner()
   * @generated
   * @ordered
   */
  protected static final boolean                   ADD_OWNER_EDEFAULT                = false;

  /**
   * The cached value of the '{@link #isAddOwner() <em>Add Owner</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isAddOwner()
   * @generated
   * @ordered
   */
  protected boolean                                addOwner                          = ADD_OWNER_EDEFAULT;

  /**
   * This is true if the Add Owner attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                addOwnerESet;

  /**
   * The default value of the '{@link #isAddQualifier() <em>Add Qualifier</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isAddQualifier()
   * @generated
   * @ordered
   */
  protected static final boolean                   ADD_QUALIFIER_EDEFAULT            = false;

  /**
   * The cached value of the '{@link #isAddQualifier() <em>Add Qualifier</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isAddQualifier()
   * @generated
   * @ordered
   */
  protected boolean                                addQualifier                      = ADD_QUALIFIER_EDEFAULT;

  /**
   * This is true if the Add Qualifier attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                addQualifierESet;

  /**
   * The default value of the '{@link #isCreateForeignKeys() <em>Create Foreign Keys</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isCreateForeignKeys()
   * @generated
   * @ordered
   */
  protected static final boolean                   CREATE_FOREIGN_KEYS_EDEFAULT      = false;

  /**
   * The cached value of the '{@link #isCreateForeignKeys() <em>Create Foreign Keys</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isCreateForeignKeys()
   * @generated
   * @ordered
   */
  protected boolean                                createForeignKeys                 = CREATE_FOREIGN_KEYS_EDEFAULT;

  /**
   * This is true if the Create Foreign Keys attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                createForeignKeysESet;

  /**
   * The default value of the '{@link #isCreateIndexes() <em>Create Indexes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCreateIndexes()
   * @generated
   * @ordered
   */
  protected static final boolean                   CREATE_INDEXES_EDEFAULT           = false;

  /**
   * The cached value of the '{@link #isCreateIndexes() <em>Create Indexes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCreateIndexes()
   * @generated
   * @ordered
   */
  protected boolean                                createIndexes                     = CREATE_INDEXES_EDEFAULT;

  /**
   * This is true if the Create Indexes attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                createIndexesESet;

  /**
   * The default value of the '{@link #isCreatePermissions() <em>Create Permissions</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isCreatePermissions()
   * @generated
   * @ordered
   */
  protected static final boolean                   CREATE_PERMISSIONS_EDEFAULT       = false;

  /**
   * The cached value of the '{@link #isCreatePermissions() <em>Create Permissions</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isCreatePermissions()
   * @generated
   * @ordered
   */
  protected boolean                                createPermissions                 = CREATE_PERMISSIONS_EDEFAULT;

  /**
   * This is true if the Create Permissions attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                createPermissionsESet;

  /**
   * The default value of the '{@link #isCreatePrimaryKeys() <em>Create Primary Keys</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isCreatePrimaryKeys()
   * @generated
   * @ordered
   */
  protected static final boolean                   CREATE_PRIMARY_KEYS_EDEFAULT      = false;

  /**
   * The cached value of the '{@link #isCreatePrimaryKeys() <em>Create Primary Keys</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isCreatePrimaryKeys()
   * @generated
   * @ordered
   */
  protected boolean                                createPrimaryKeys                 = CREATE_PRIMARY_KEYS_EDEFAULT;

  /**
   * This is true if the Create Primary Keys attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                createPrimaryKeysESet;

  /**
   * The default value of the '{@link #isCreateTableSpaces() <em>Create Table Spaces</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isCreateTableSpaces()
   * @generated
   * @ordered
   */
  protected static final boolean                   CREATE_TABLE_SPACES_EDEFAULT      = false;

  /**
   * The cached value of the '{@link #isCreateTableSpaces() <em>Create Table Spaces</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isCreateTableSpaces()
   * @generated
   * @ordered
   */
  protected boolean                                createTableSpaces                 = CREATE_TABLE_SPACES_EDEFAULT;

  /**
   * This is true if the Create Table Spaces attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                createTableSpacesESet;

  /**
   * The default value of the '{@link #isDdlXml() <em>Ddl Xml</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isDdlXml()
   * @generated
   * @ordered
   */
  protected static final boolean                   DDL_XML_EDEFAULT                  = false;

  /**
   * The cached value of the '{@link #isDdlXml() <em>Ddl Xml</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isDdlXml()
   * @generated
   * @ordered
   */
  protected boolean                                ddlXml                            = DDL_XML_EDEFAULT;

  /**
   * This is true if the Ddl Xml attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                ddlXmlESet;

  /**
   * The default value of the '{@link #isDeferViews() <em>Defer Views</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isDeferViews()
   * @generated
   * @ordered
   */
  protected static final boolean                   DEFER_VIEWS_EDEFAULT              = false;

  /**
   * The cached value of the '{@link #isDeferViews() <em>Defer Views</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isDeferViews()
   * @generated
   * @ordered
   */
  protected boolean                                deferViews                        = DEFER_VIEWS_EDEFAULT;

  /**
   * This is true if the Defer Views attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                deferViewsESet;

  /**
   * The default value of the '{@link #isDropProcedures() <em>Drop Procedures</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDropProcedures()
   * @generated
   * @ordered
   */
  protected static final boolean                   DROP_PROCEDURES_EDEFAULT          = false;

  /**
   * The cached value of the '{@link #isDropProcedures() <em>Drop Procedures</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDropProcedures()
   * @generated
   * @ordered
   */
  protected boolean                                dropProcedures                    = DROP_PROCEDURES_EDEFAULT;

  /**
   * This is true if the Drop Procedures attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                dropProceduresESet;

  /**
   * The default value of the '{@link #isDropSequences() <em>Drop Sequences</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDropSequences()
   * @generated
   * @ordered
   */
  protected static final boolean                   DROP_SEQUENCES_EDEFAULT           = false;

  /**
   * The cached value of the '{@link #isDropSequences() <em>Drop Sequences</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDropSequences()
   * @generated
   * @ordered
   */
  protected boolean                                dropSequences                     = DROP_SEQUENCES_EDEFAULT;

  /**
   * This is true if the Drop Sequences attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                dropSequencesESet;

  /**
   * The default value of the '{@link #isDropTables() <em>Drop Tables</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isDropTables()
   * @generated
   * @ordered
   */
  protected static final boolean                   DROP_TABLES_EDEFAULT              = false;

  /**
   * The cached value of the '{@link #isDropTables() <em>Drop Tables</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isDropTables()
   * @generated
   * @ordered
   */
  protected boolean                                dropTables                        = DROP_TABLES_EDEFAULT;

  /**
   * This is true if the Drop Tables attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                dropTablesESet;

  /**
   * The default value of the '{@link #isDropTableSpaces() <em>Drop Table Spaces</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isDropTableSpaces()
   * @generated
   * @ordered
   */
  protected static final boolean                   DROP_TABLE_SPACES_EDEFAULT        = false;

  /**
   * The cached value of the '{@link #isDropTableSpaces() <em>Drop Table Spaces</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isDropTableSpaces()
   * @generated
   * @ordered
   */
  protected boolean                                dropTableSpaces                   = DROP_TABLE_SPACES_EDEFAULT;

  /**
   * This is true if the Drop Table Spaces attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                dropTableSpacesESet;

  /**
   * The default value of the '{@link #isGenIDByDefault() <em>Gen ID By Default</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isGenIDByDefault()
   * @generated
   * @ordered
   */
  protected static final boolean                   GEN_ID_BY_DEFAULT_EDEFAULT        = false;

  /**
   * The cached value of the '{@link #isGenIDByDefault() <em>Gen ID By Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGenIDByDefault()
   * @generated
   * @ordered
   */
  protected boolean                                genIDByDefault                    = GEN_ID_BY_DEFAULT_EDEFAULT;

  /**
   * This is true if the Gen ID By Default attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                genIDByDefaultESet;

  /**
   * The default value of the '{@link #isNoComments() <em>No Comments</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isNoComments()
   * @generated
   * @ordered
   */
  protected static final boolean                   NO_COMMENTS_EDEFAULT              = false;

  /**
   * The cached value of the '{@link #isNoComments() <em>No Comments</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isNoComments()
   * @generated
   * @ordered
   */
  protected boolean                                noComments                        = NO_COMMENTS_EDEFAULT;

  /**
   * This is true if the No Comments attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                noCommentsESet;

  /**
   * The default value of the '{@link #isNoDDLInfo() <em>No DDL Info</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isNoDDLInfo()
   * @generated
   * @ordered
   */
  protected static final boolean                   NO_DDL_INFO_EDEFAULT              = false;

  /**
   * The cached value of the '{@link #isNoDDLInfo() <em>No DDL Info</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isNoDDLInfo()
   * @generated
   * @ordered
   */
  protected boolean                                noDDLInfo                         = NO_DDL_INFO_EDEFAULT;

  /**
   * This is true if the No DDL Info attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                noDDLInfoESet;

  /**
   * The default value of the '{@link #isNoRestrictOnDrop() <em>No Restrict On Drop</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isNoRestrictOnDrop()
   * @generated
   * @ordered
   */
  protected static final boolean                   NO_RESTRICT_ON_DROP_EDEFAULT      = false;

  /**
   * The cached value of the '{@link #isNoRestrictOnDrop() <em>No Restrict On Drop</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isNoRestrictOnDrop()
   * @generated
   * @ordered
   */
  protected boolean                                noRestrictOnDrop                  = NO_RESTRICT_ON_DROP_EDEFAULT;

  /**
   * This is true if the No Restrict On Drop attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                noRestrictOnDropESet;

  /**
   * The default value of the '{@link #isPublicPermissions() <em>Public Permissions</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isPublicPermissions()
   * @generated
   * @ordered
   */
  protected static final boolean                   PUBLIC_PERMISSIONS_EDEFAULT       = false;

  /**
   * The cached value of the '{@link #isPublicPermissions() <em>Public Permissions</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isPublicPermissions()
   * @generated
   * @ordered
   */
  protected boolean                                publicPermissions                 = PUBLIC_PERMISSIONS_EDEFAULT;

  /**
   * This is true if the Public Permissions attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                publicPermissionsESet;

  /**
   * The default value of the '{@link #isRemoveRestrictOnDrop() <em>Remove Restrict On Drop</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isRemoveRestrictOnDrop()
   * @generated
   * @ordered
   */
  protected static final boolean                   REMOVE_RESTRICT_ON_DROP_EDEFAULT  = false;

  /**
   * The cached value of the '{@link #isRemoveRestrictOnDrop() <em>Remove Restrict On Drop</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isRemoveRestrictOnDrop()
   * @generated
   * @ordered
   */
  protected boolean                                removeRestrictOnDrop              = REMOVE_RESTRICT_ON_DROP_EDEFAULT;

  /**
   * This is true if the Remove Restrict On Drop attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                removeRestrictOnDropESet;

  /**
   * The default value of the '{@link #isSeparateForeignKeys() <em>Separate Foreign Keys</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSeparateForeignKeys()
   * @generated
   * @ordered
   */
  protected static final boolean                   SEPARATE_FOREIGN_KEYS_EDEFAULT    = false;

  /**
   * The cached value of the '{@link #isSeparateForeignKeys() <em>Separate Foreign Keys</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSeparateForeignKeys()
   * @generated
   * @ordered
   */
  protected boolean                                separateForeignKeys               = SEPARATE_FOREIGN_KEYS_EDEFAULT;

  /**
   * This is true if the Separate Foreign Keys attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                separateForeignKeysESet;

  /**
   * The default value of the '{@link #isShortFileNames() <em>Short File Names</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShortFileNames()
   * @generated
   * @ordered
   */
  protected static final boolean                   SHORT_FILE_NAMES_EDEFAULT         = false;

  /**
   * The cached value of the '{@link #isShortFileNames() <em>Short File Names</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShortFileNames()
   * @generated
   * @ordered
   */
  protected boolean                                shortFileNames                    = SHORT_FILE_NAMES_EDEFAULT;

  /**
   * This is true if the Short File Names attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                shortFileNamesESet;

  /**
   * The default value of the '{@link #isTranslateProcedureDefs() <em>Translate Procedure Defs</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isTranslateProcedureDefs()
   * @generated
   * @ordered
   */
  protected static final boolean                   TRANSLATE_PROCEDURE_DEFS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTranslateProcedureDefs() <em>Translate Procedure Defs</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isTranslateProcedureDefs()
   * @generated
   * @ordered
   */
  protected boolean                                translateProcedureDefs            = TRANSLATE_PROCEDURE_DEFS_EDEFAULT;

  /**
   * This is true if the Translate Procedure Defs attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                translateProcedureDefsESet;

  /**
   * The default value of the '{@link #isTranslateViewDefs() <em>Translate View Defs</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isTranslateViewDefs()
   * @generated
   * @ordered
   */
  protected static final boolean                   TRANSLATE_VIEW_DEFS_EDEFAULT      = false;

  /**
   * The cached value of the '{@link #isTranslateViewDefs() <em>Translate View Defs</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isTranslateViewDefs()
   * @generated
   * @ordered
   */
  protected boolean                                translateViewDefs                 = TRANSLATE_VIEW_DEFS_EDEFAULT;

  /**
   * This is true if the Translate View Defs attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                translateViewDefsESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected RenderOperationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ExtractDDLModulePackage.Literals.RENDER_OPERATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public exception getException()
  {
    return exception;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetException(exception newException, NotificationChain msgs)
  {
    exception oldException = exception;
    exception = newException;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__EXCEPTION, oldException, newException);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setException(exception newException)
  {
    if (newException != exception)
    {
      NotificationChain msgs = null;
      if (exception != null)
        msgs = ((InternalEObject)exception).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.RENDER_OPERATION__EXCEPTION, null, msgs);
      if (newException != null)
        msgs = ((InternalEObject)newException).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.RENDER_OPERATION__EXCEPTION, null, msgs);
      msgs = basicSetException(newException, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__EXCEPTION, newException, newException));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NamedResourceDefinition getOutputResource()
  {
    return outputResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutputResource(NamedResourceDefinition newOutputResource, NotificationChain msgs)
  {
    NamedResourceDefinition oldOutputResource = outputResource;
    outputResource = newOutputResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__OUTPUT_RESOURCE, oldOutputResource, newOutputResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOutputResource(NamedResourceDefinition newOutputResource)
  {
    if (newOutputResource != outputResource)
    {
      NotificationChain msgs = null;
      if (outputResource != null)
        msgs = ((InternalEObject)outputResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.RENDER_OPERATION__OUTPUT_RESOURCE, null, msgs);
      if (newOutputResource != null)
        msgs = ((InternalEObject)newOutputResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.RENDER_OPERATION__OUTPUT_RESOURCE, null, msgs);
      msgs = basicSetOutputResource(newOutputResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__OUTPUT_RESOURCE, newOutputResource, newOutputResource));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getDataBaseQualifier()
  {
    return dataBaseQualifier;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataBaseQualifier(ComplexValue newDataBaseQualifier, NotificationChain msgs)
  {
    ComplexValue oldDataBaseQualifier = dataBaseQualifier;
    dataBaseQualifier = newDataBaseQualifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_QUALIFIER, oldDataBaseQualifier, newDataBaseQualifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDataBaseQualifier(ComplexValue newDataBaseQualifier)
  {
    if (newDataBaseQualifier != dataBaseQualifier)
    {
      NotificationChain msgs = null;
      if (dataBaseQualifier != null)
        msgs = ((InternalEObject)dataBaseQualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_QUALIFIER, null, msgs);
      if (newDataBaseQualifier != null)
        msgs = ((InternalEObject)newDataBaseQualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_QUALIFIER, null, msgs);
      msgs = basicSetDataBaseQualifier(newDataBaseQualifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_QUALIFIER, newDataBaseQualifier, newDataBaseQualifier));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getDataBaseOverride()
  {
    return dataBaseOverride;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataBaseOverride(ComplexValue newDataBaseOverride, NotificationChain msgs)
  {
    ComplexValue oldDataBaseOverride = dataBaseOverride;
    dataBaseOverride = newDataBaseOverride;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_OVERRIDE, oldDataBaseOverride, newDataBaseOverride);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDataBaseOverride(ComplexValue newDataBaseOverride)
  {
    if (newDataBaseOverride != dataBaseOverride)
    {
      NotificationChain msgs = null;
      if (dataBaseOverride != null)
        msgs = ((InternalEObject)dataBaseOverride).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_OVERRIDE, null, msgs);
      if (newDataBaseOverride != null)
        msgs = ((InternalEObject)newDataBaseOverride).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_OVERRIDE, null, msgs);
      msgs = basicSetDataBaseOverride(newDataBaseOverride, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_OVERRIDE, newDataBaseOverride, newDataBaseOverride));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getTableSpaceOverride()
  {
    return tableSpaceOverride;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTableSpaceOverride(ComplexValue newTableSpaceOverride, NotificationChain msgs)
  {
    ComplexValue oldTableSpaceOverride = tableSpaceOverride;
    tableSpaceOverride = newTableSpaceOverride;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__TABLE_SPACE_OVERRIDE, oldTableSpaceOverride, newTableSpaceOverride);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTableSpaceOverride(ComplexValue newTableSpaceOverride)
  {
    if (newTableSpaceOverride != tableSpaceOverride)
    {
      NotificationChain msgs = null;
      if (tableSpaceOverride != null)
        msgs = ((InternalEObject)tableSpaceOverride).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.RENDER_OPERATION__TABLE_SPACE_OVERRIDE, null, msgs);
      if (newTableSpaceOverride != null)
        msgs = ((InternalEObject)newTableSpaceOverride).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.RENDER_OPERATION__TABLE_SPACE_OVERRIDE, null, msgs);
      msgs = basicSetTableSpaceOverride(newTableSpaceOverride, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__TABLE_SPACE_OVERRIDE, newTableSpaceOverride, newTableSpaceOverride));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getTableSpaceSuffix()
  {
    return tableSpaceSuffix;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTableSpaceSuffix(ComplexValue newTableSpaceSuffix, NotificationChain msgs)
  {
    ComplexValue oldTableSpaceSuffix = tableSpaceSuffix;
    tableSpaceSuffix = newTableSpaceSuffix;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__TABLE_SPACE_SUFFIX, oldTableSpaceSuffix, newTableSpaceSuffix);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTableSpaceSuffix(ComplexValue newTableSpaceSuffix)
  {
    if (newTableSpaceSuffix != tableSpaceSuffix)
    {
      NotificationChain msgs = null;
      if (tableSpaceSuffix != null)
        msgs = ((InternalEObject)tableSpaceSuffix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.RENDER_OPERATION__TABLE_SPACE_SUFFIX, null, msgs);
      if (newTableSpaceSuffix != null)
        msgs = ((InternalEObject)newTableSpaceSuffix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.RENDER_OPERATION__TABLE_SPACE_SUFFIX, null, msgs);
      msgs = basicSetTableSpaceSuffix(newTableSpaceSuffix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__TABLE_SPACE_SUFFIX, newTableSpaceSuffix, newTableSpaceSuffix));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getStorageGroupOverride()
  {
    return storageGroupOverride;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStorageGroupOverride(ComplexValue newStorageGroupOverride, NotificationChain msgs)
  {
    ComplexValue oldStorageGroupOverride = storageGroupOverride;
    storageGroupOverride = newStorageGroupOverride;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__STORAGE_GROUP_OVERRIDE, oldStorageGroupOverride, newStorageGroupOverride);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setStorageGroupOverride(ComplexValue newStorageGroupOverride)
  {
    if (newStorageGroupOverride != storageGroupOverride)
    {
      NotificationChain msgs = null;
      if (storageGroupOverride != null)
        msgs = ((InternalEObject)storageGroupOverride).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.RENDER_OPERATION__STORAGE_GROUP_OVERRIDE, null, msgs);
      if (newStorageGroupOverride != null)
        msgs = ((InternalEObject)newStorageGroupOverride).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.RENDER_OPERATION__STORAGE_GROUP_OVERRIDE, null, msgs);
      msgs = basicSetStorageGroupOverride(newStorageGroupOverride, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__STORAGE_GROUP_OVERRIDE, newStorageGroupOverride, newStorageGroupOverride));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<ComplexValueMap> getQualifierMaps()
  {
    if (qualifierMaps == null)
    {
      qualifierMaps = new EObjectContainmentEList<ComplexValueMap>(ComplexValueMap.class, this, ExtractDDLModulePackage.RENDER_OPERATION__QUALIFIER_MAPS);
    }
    return qualifierMaps;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<ComplexValueMap> getDataBaseMaps()
  {
    if (dataBaseMaps == null)
    {
      dataBaseMaps = new EObjectContainmentEList<ComplexValueMap>(ComplexValueMap.class, this, ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_MAPS);
    }
    return dataBaseMaps;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<ComplexValueMap> getStorageGroupMaps()
  {
    if (storageGroupMaps == null)
    {
      storageGroupMaps = new EObjectContainmentEList<ComplexValueMap>(ComplexValueMap.class, this, ExtractDDLModulePackage.RENDER_OPERATION__STORAGE_GROUP_MAPS);
    }
    return storageGroupMaps;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isAddDataBaseName()
  {
    return addDataBaseName;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setAddDataBaseName(boolean newAddDataBaseName)
  {
    boolean oldAddDataBaseName = addDataBaseName;
    addDataBaseName = newAddDataBaseName;
    boolean oldAddDataBaseNameESet = addDataBaseNameESet;
    addDataBaseNameESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__ADD_DATA_BASE_NAME, oldAddDataBaseName, addDataBaseName, !oldAddDataBaseNameESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetAddDataBaseName()
  {
    boolean oldAddDataBaseName = addDataBaseName;
    boolean oldAddDataBaseNameESet = addDataBaseNameESet;
    addDataBaseName = ADD_DATA_BASE_NAME_EDEFAULT;
    addDataBaseNameESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.RENDER_OPERATION__ADD_DATA_BASE_NAME, oldAddDataBaseName, ADD_DATA_BASE_NAME_EDEFAULT, oldAddDataBaseNameESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetAddDataBaseName()
  {
    return addDataBaseNameESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isAddOwner()
  {
    return addOwner;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setAddOwner(boolean newAddOwner)
  {
    boolean oldAddOwner = addOwner;
    addOwner = newAddOwner;
    boolean oldAddOwnerESet = addOwnerESet;
    addOwnerESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__ADD_OWNER, oldAddOwner, addOwner, !oldAddOwnerESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetAddOwner()
  {
    boolean oldAddOwner = addOwner;
    boolean oldAddOwnerESet = addOwnerESet;
    addOwner = ADD_OWNER_EDEFAULT;
    addOwnerESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.RENDER_OPERATION__ADD_OWNER, oldAddOwner, ADD_OWNER_EDEFAULT, oldAddOwnerESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetAddOwner()
  {
    return addOwnerESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isAddQualifier()
  {
    return addQualifier;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setAddQualifier(boolean newAddQualifier)
  {
    boolean oldAddQualifier = addQualifier;
    addQualifier = newAddQualifier;
    boolean oldAddQualifierESet = addQualifierESet;
    addQualifierESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__ADD_QUALIFIER, oldAddQualifier, addQualifier, !oldAddQualifierESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetAddQualifier()
  {
    boolean oldAddQualifier = addQualifier;
    boolean oldAddQualifierESet = addQualifierESet;
    addQualifier = ADD_QUALIFIER_EDEFAULT;
    addQualifierESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.RENDER_OPERATION__ADD_QUALIFIER, oldAddQualifier, ADD_QUALIFIER_EDEFAULT, oldAddQualifierESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetAddQualifier()
  {
    return addQualifierESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isCreateForeignKeys()
  {
    return createForeignKeys;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCreateForeignKeys(boolean newCreateForeignKeys)
  {
    boolean oldCreateForeignKeys = createForeignKeys;
    createForeignKeys = newCreateForeignKeys;
    boolean oldCreateForeignKeysESet = createForeignKeysESet;
    createForeignKeysESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__CREATE_FOREIGN_KEYS, oldCreateForeignKeys, createForeignKeys, !oldCreateForeignKeysESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetCreateForeignKeys()
  {
    boolean oldCreateForeignKeys = createForeignKeys;
    boolean oldCreateForeignKeysESet = createForeignKeysESet;
    createForeignKeys = CREATE_FOREIGN_KEYS_EDEFAULT;
    createForeignKeysESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.RENDER_OPERATION__CREATE_FOREIGN_KEYS, oldCreateForeignKeys, CREATE_FOREIGN_KEYS_EDEFAULT, oldCreateForeignKeysESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetCreateForeignKeys()
  {
    return createForeignKeysESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isCreateIndexes()
  {
    return createIndexes;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCreateIndexes(boolean newCreateIndexes)
  {
    boolean oldCreateIndexes = createIndexes;
    createIndexes = newCreateIndexes;
    boolean oldCreateIndexesESet = createIndexesESet;
    createIndexesESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__CREATE_INDEXES, oldCreateIndexes, createIndexes, !oldCreateIndexesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetCreateIndexes()
  {
    boolean oldCreateIndexes = createIndexes;
    boolean oldCreateIndexesESet = createIndexesESet;
    createIndexes = CREATE_INDEXES_EDEFAULT;
    createIndexesESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.RENDER_OPERATION__CREATE_INDEXES, oldCreateIndexes, CREATE_INDEXES_EDEFAULT, oldCreateIndexesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetCreateIndexes()
  {
    return createIndexesESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isCreatePermissions()
  {
    return createPermissions;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCreatePermissions(boolean newCreatePermissions)
  {
    boolean oldCreatePermissions = createPermissions;
    createPermissions = newCreatePermissions;
    boolean oldCreatePermissionsESet = createPermissionsESet;
    createPermissionsESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__CREATE_PERMISSIONS, oldCreatePermissions, createPermissions, !oldCreatePermissionsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetCreatePermissions()
  {
    boolean oldCreatePermissions = createPermissions;
    boolean oldCreatePermissionsESet = createPermissionsESet;
    createPermissions = CREATE_PERMISSIONS_EDEFAULT;
    createPermissionsESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.RENDER_OPERATION__CREATE_PERMISSIONS, oldCreatePermissions, CREATE_PERMISSIONS_EDEFAULT, oldCreatePermissionsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetCreatePermissions()
  {
    return createPermissionsESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isCreatePrimaryKeys()
  {
    return createPrimaryKeys;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCreatePrimaryKeys(boolean newCreatePrimaryKeys)
  {
    boolean oldCreatePrimaryKeys = createPrimaryKeys;
    createPrimaryKeys = newCreatePrimaryKeys;
    boolean oldCreatePrimaryKeysESet = createPrimaryKeysESet;
    createPrimaryKeysESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__CREATE_PRIMARY_KEYS, oldCreatePrimaryKeys, createPrimaryKeys, !oldCreatePrimaryKeysESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetCreatePrimaryKeys()
  {
    boolean oldCreatePrimaryKeys = createPrimaryKeys;
    boolean oldCreatePrimaryKeysESet = createPrimaryKeysESet;
    createPrimaryKeys = CREATE_PRIMARY_KEYS_EDEFAULT;
    createPrimaryKeysESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.RENDER_OPERATION__CREATE_PRIMARY_KEYS, oldCreatePrimaryKeys, CREATE_PRIMARY_KEYS_EDEFAULT, oldCreatePrimaryKeysESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetCreatePrimaryKeys()
  {
    return createPrimaryKeysESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isCreateTableSpaces()
  {
    return createTableSpaces;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCreateTableSpaces(boolean newCreateTableSpaces)
  {
    boolean oldCreateTableSpaces = createTableSpaces;
    createTableSpaces = newCreateTableSpaces;
    boolean oldCreateTableSpacesESet = createTableSpacesESet;
    createTableSpacesESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__CREATE_TABLE_SPACES, oldCreateTableSpaces, createTableSpaces, !oldCreateTableSpacesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetCreateTableSpaces()
  {
    boolean oldCreateTableSpaces = createTableSpaces;
    boolean oldCreateTableSpacesESet = createTableSpacesESet;
    createTableSpaces = CREATE_TABLE_SPACES_EDEFAULT;
    createTableSpacesESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.RENDER_OPERATION__CREATE_TABLE_SPACES, oldCreateTableSpaces, CREATE_TABLE_SPACES_EDEFAULT, oldCreateTableSpacesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetCreateTableSpaces()
  {
    return createTableSpacesESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DataBaseDriverTypeEnum getDataBaseDriver()
  {
    return dataBaseDriver;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDataBaseDriver(DataBaseDriverTypeEnum newDataBaseDriver)
  {
    DataBaseDriverTypeEnum oldDataBaseDriver = dataBaseDriver;
    dataBaseDriver = newDataBaseDriver == null ? DATA_BASE_DRIVER_EDEFAULT : newDataBaseDriver;
    boolean oldDataBaseDriverESet = dataBaseDriverESet;
    dataBaseDriverESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_DRIVER, oldDataBaseDriver, dataBaseDriver, !oldDataBaseDriverESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetDataBaseDriver()
  {
    DataBaseDriverTypeEnum oldDataBaseDriver = dataBaseDriver;
    boolean oldDataBaseDriverESet = dataBaseDriverESet;
    dataBaseDriver = DATA_BASE_DRIVER_EDEFAULT;
    dataBaseDriverESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_DRIVER, oldDataBaseDriver, DATA_BASE_DRIVER_EDEFAULT, oldDataBaseDriverESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetDataBaseDriver()
  {
    return dataBaseDriverESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isDdlXml()
  {
    return ddlXml;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDdlXml(boolean newDdlXml)
  {
    boolean oldDdlXml = ddlXml;
    ddlXml = newDdlXml;
    boolean oldDdlXmlESet = ddlXmlESet;
    ddlXmlESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__DDL_XML, oldDdlXml, ddlXml, !oldDdlXmlESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetDdlXml()
  {
    boolean oldDdlXml = ddlXml;
    boolean oldDdlXmlESet = ddlXmlESet;
    ddlXml = DDL_XML_EDEFAULT;
    ddlXmlESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.RENDER_OPERATION__DDL_XML, oldDdlXml, DDL_XML_EDEFAULT, oldDdlXmlESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetDdlXml()
  {
    return ddlXmlESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isDeferViews()
  {
    return deferViews;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDeferViews(boolean newDeferViews)
  {
    boolean oldDeferViews = deferViews;
    deferViews = newDeferViews;
    boolean oldDeferViewsESet = deferViewsESet;
    deferViewsESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__DEFER_VIEWS, oldDeferViews, deferViews, !oldDeferViewsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetDeferViews()
  {
    boolean oldDeferViews = deferViews;
    boolean oldDeferViewsESet = deferViewsESet;
    deferViews = DEFER_VIEWS_EDEFAULT;
    deferViewsESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.RENDER_OPERATION__DEFER_VIEWS, oldDeferViews, DEFER_VIEWS_EDEFAULT, oldDeferViewsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetDeferViews()
  {
    return deferViewsESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isDropProcedures()
  {
    return dropProcedures;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDropProcedures(boolean newDropProcedures)
  {
    boolean oldDropProcedures = dropProcedures;
    dropProcedures = newDropProcedures;
    boolean oldDropProceduresESet = dropProceduresESet;
    dropProceduresESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__DROP_PROCEDURES, oldDropProcedures, dropProcedures, !oldDropProceduresESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetDropProcedures()
  {
    boolean oldDropProcedures = dropProcedures;
    boolean oldDropProceduresESet = dropProceduresESet;
    dropProcedures = DROP_PROCEDURES_EDEFAULT;
    dropProceduresESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.RENDER_OPERATION__DROP_PROCEDURES, oldDropProcedures, DROP_PROCEDURES_EDEFAULT, oldDropProceduresESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetDropProcedures()
  {
    return dropProceduresESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isDropSequences()
  {
    return dropSequences;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDropSequences(boolean newDropSequences)
  {
    boolean oldDropSequences = dropSequences;
    dropSequences = newDropSequences;
    boolean oldDropSequencesESet = dropSequencesESet;
    dropSequencesESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__DROP_SEQUENCES, oldDropSequences, dropSequences, !oldDropSequencesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetDropSequences()
  {
    boolean oldDropSequences = dropSequences;
    boolean oldDropSequencesESet = dropSequencesESet;
    dropSequences = DROP_SEQUENCES_EDEFAULT;
    dropSequencesESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.RENDER_OPERATION__DROP_SEQUENCES, oldDropSequences, DROP_SEQUENCES_EDEFAULT, oldDropSequencesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetDropSequences()
  {
    return dropSequencesESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isDropTables()
  {
    return dropTables;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDropTables(boolean newDropTables)
  {
    boolean oldDropTables = dropTables;
    dropTables = newDropTables;
    boolean oldDropTablesESet = dropTablesESet;
    dropTablesESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__DROP_TABLES, oldDropTables, dropTables, !oldDropTablesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetDropTables()
  {
    boolean oldDropTables = dropTables;
    boolean oldDropTablesESet = dropTablesESet;
    dropTables = DROP_TABLES_EDEFAULT;
    dropTablesESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.RENDER_OPERATION__DROP_TABLES, oldDropTables, DROP_TABLES_EDEFAULT, oldDropTablesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetDropTables()
  {
    return dropTablesESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isDropTableSpaces()
  {
    return dropTableSpaces;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDropTableSpaces(boolean newDropTableSpaces)
  {
    boolean oldDropTableSpaces = dropTableSpaces;
    dropTableSpaces = newDropTableSpaces;
    boolean oldDropTableSpacesESet = dropTableSpacesESet;
    dropTableSpacesESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__DROP_TABLE_SPACES, oldDropTableSpaces, dropTableSpaces, !oldDropTableSpacesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetDropTableSpaces()
  {
    boolean oldDropTableSpaces = dropTableSpaces;
    boolean oldDropTableSpacesESet = dropTableSpacesESet;
    dropTableSpaces = DROP_TABLE_SPACES_EDEFAULT;
    dropTableSpacesESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.RENDER_OPERATION__DROP_TABLE_SPACES, oldDropTableSpaces, DROP_TABLE_SPACES_EDEFAULT, oldDropTableSpacesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetDropTableSpaces()
  {
    return dropTableSpacesESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isGenIDByDefault()
  {
    return genIDByDefault;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setGenIDByDefault(boolean newGenIDByDefault)
  {
    boolean oldGenIDByDefault = genIDByDefault;
    genIDByDefault = newGenIDByDefault;
    boolean oldGenIDByDefaultESet = genIDByDefaultESet;
    genIDByDefaultESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__GEN_ID_BY_DEFAULT, oldGenIDByDefault, genIDByDefault, !oldGenIDByDefaultESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetGenIDByDefault()
  {
    boolean oldGenIDByDefault = genIDByDefault;
    boolean oldGenIDByDefaultESet = genIDByDefaultESet;
    genIDByDefault = GEN_ID_BY_DEFAULT_EDEFAULT;
    genIDByDefaultESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.RENDER_OPERATION__GEN_ID_BY_DEFAULT, oldGenIDByDefault, GEN_ID_BY_DEFAULT_EDEFAULT, oldGenIDByDefaultESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetGenIDByDefault()
  {
    return genIDByDefaultESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isNoComments()
  {
    return noComments;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setNoComments(boolean newNoComments)
  {
    boolean oldNoComments = noComments;
    noComments = newNoComments;
    boolean oldNoCommentsESet = noCommentsESet;
    noCommentsESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__NO_COMMENTS, oldNoComments, noComments, !oldNoCommentsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetNoComments()
  {
    boolean oldNoComments = noComments;
    boolean oldNoCommentsESet = noCommentsESet;
    noComments = NO_COMMENTS_EDEFAULT;
    noCommentsESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.RENDER_OPERATION__NO_COMMENTS, oldNoComments, NO_COMMENTS_EDEFAULT, oldNoCommentsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetNoComments()
  {
    return noCommentsESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isNoDDLInfo()
  {
    return noDDLInfo;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setNoDDLInfo(boolean newNoDDLInfo)
  {
    boolean oldNoDDLInfo = noDDLInfo;
    noDDLInfo = newNoDDLInfo;
    boolean oldNoDDLInfoESet = noDDLInfoESet;
    noDDLInfoESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__NO_DDL_INFO, oldNoDDLInfo, noDDLInfo, !oldNoDDLInfoESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetNoDDLInfo()
  {
    boolean oldNoDDLInfo = noDDLInfo;
    boolean oldNoDDLInfoESet = noDDLInfoESet;
    noDDLInfo = NO_DDL_INFO_EDEFAULT;
    noDDLInfoESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.RENDER_OPERATION__NO_DDL_INFO, oldNoDDLInfo, NO_DDL_INFO_EDEFAULT, oldNoDDLInfoESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetNoDDLInfo()
  {
    return noDDLInfoESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isNoRestrictOnDrop()
  {
    return noRestrictOnDrop;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setNoRestrictOnDrop(boolean newNoRestrictOnDrop)
  {
    boolean oldNoRestrictOnDrop = noRestrictOnDrop;
    noRestrictOnDrop = newNoRestrictOnDrop;
    boolean oldNoRestrictOnDropESet = noRestrictOnDropESet;
    noRestrictOnDropESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__NO_RESTRICT_ON_DROP, oldNoRestrictOnDrop, noRestrictOnDrop, !oldNoRestrictOnDropESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetNoRestrictOnDrop()
  {
    boolean oldNoRestrictOnDrop = noRestrictOnDrop;
    boolean oldNoRestrictOnDropESet = noRestrictOnDropESet;
    noRestrictOnDrop = NO_RESTRICT_ON_DROP_EDEFAULT;
    noRestrictOnDropESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.RENDER_OPERATION__NO_RESTRICT_ON_DROP, oldNoRestrictOnDrop, NO_RESTRICT_ON_DROP_EDEFAULT, oldNoRestrictOnDropESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetNoRestrictOnDrop()
  {
    return noRestrictOnDropESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isPublicPermissions()
  {
    return publicPermissions;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setPublicPermissions(boolean newPublicPermissions)
  {
    boolean oldPublicPermissions = publicPermissions;
    publicPermissions = newPublicPermissions;
    boolean oldPublicPermissionsESet = publicPermissionsESet;
    publicPermissionsESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__PUBLIC_PERMISSIONS, oldPublicPermissions, publicPermissions, !oldPublicPermissionsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetPublicPermissions()
  {
    boolean oldPublicPermissions = publicPermissions;
    boolean oldPublicPermissionsESet = publicPermissionsESet;
    publicPermissions = PUBLIC_PERMISSIONS_EDEFAULT;
    publicPermissionsESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.RENDER_OPERATION__PUBLIC_PERMISSIONS, oldPublicPermissions, PUBLIC_PERMISSIONS_EDEFAULT, oldPublicPermissionsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetPublicPermissions()
  {
    return publicPermissionsESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isRemoveRestrictOnDrop()
  {
    return removeRestrictOnDrop;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRemoveRestrictOnDrop(boolean newRemoveRestrictOnDrop)
  {
    boolean oldRemoveRestrictOnDrop = removeRestrictOnDrop;
    removeRestrictOnDrop = newRemoveRestrictOnDrop;
    boolean oldRemoveRestrictOnDropESet = removeRestrictOnDropESet;
    removeRestrictOnDropESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__REMOVE_RESTRICT_ON_DROP, oldRemoveRestrictOnDrop, removeRestrictOnDrop, !oldRemoveRestrictOnDropESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetRemoveRestrictOnDrop()
  {
    boolean oldRemoveRestrictOnDrop = removeRestrictOnDrop;
    boolean oldRemoveRestrictOnDropESet = removeRestrictOnDropESet;
    removeRestrictOnDrop = REMOVE_RESTRICT_ON_DROP_EDEFAULT;
    removeRestrictOnDropESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.RENDER_OPERATION__REMOVE_RESTRICT_ON_DROP, oldRemoveRestrictOnDrop, REMOVE_RESTRICT_ON_DROP_EDEFAULT, oldRemoveRestrictOnDropESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetRemoveRestrictOnDrop()
  {
    return removeRestrictOnDropESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSeparateForeignKeys()
  {
    return separateForeignKeys;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSeparateForeignKeys(boolean newSeparateForeignKeys)
  {
    boolean oldSeparateForeignKeys = separateForeignKeys;
    separateForeignKeys = newSeparateForeignKeys;
    boolean oldSeparateForeignKeysESet = separateForeignKeysESet;
    separateForeignKeysESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__SEPARATE_FOREIGN_KEYS, oldSeparateForeignKeys, separateForeignKeys, !oldSeparateForeignKeysESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetSeparateForeignKeys()
  {
    boolean oldSeparateForeignKeys = separateForeignKeys;
    boolean oldSeparateForeignKeysESet = separateForeignKeysESet;
    separateForeignKeys = SEPARATE_FOREIGN_KEYS_EDEFAULT;
    separateForeignKeysESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.RENDER_OPERATION__SEPARATE_FOREIGN_KEYS, oldSeparateForeignKeys, SEPARATE_FOREIGN_KEYS_EDEFAULT, oldSeparateForeignKeysESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetSeparateForeignKeys()
  {
    return separateForeignKeysESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isShortFileNames()
  {
    return shortFileNames;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setShortFileNames(boolean newShortFileNames)
  {
    boolean oldShortFileNames = shortFileNames;
    shortFileNames = newShortFileNames;
    boolean oldShortFileNamesESet = shortFileNamesESet;
    shortFileNamesESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__SHORT_FILE_NAMES, oldShortFileNames, shortFileNames, !oldShortFileNamesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetShortFileNames()
  {
    boolean oldShortFileNames = shortFileNames;
    boolean oldShortFileNamesESet = shortFileNamesESet;
    shortFileNames = SHORT_FILE_NAMES_EDEFAULT;
    shortFileNamesESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.RENDER_OPERATION__SHORT_FILE_NAMES, oldShortFileNames, SHORT_FILE_NAMES_EDEFAULT, oldShortFileNamesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetShortFileNames()
  {
    return shortFileNamesESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TableLockOverrideTypeEnum getTableLockOverride()
  {
    return tableLockOverride;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTableLockOverride(TableLockOverrideTypeEnum newTableLockOverride)
  {
    TableLockOverrideTypeEnum oldTableLockOverride = tableLockOverride;
    tableLockOverride = newTableLockOverride == null ? TABLE_LOCK_OVERRIDE_EDEFAULT : newTableLockOverride;
    boolean oldTableLockOverrideESet = tableLockOverrideESet;
    tableLockOverrideESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__TABLE_LOCK_OVERRIDE, oldTableLockOverride, tableLockOverride, !oldTableLockOverrideESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetTableLockOverride()
  {
    TableLockOverrideTypeEnum oldTableLockOverride = tableLockOverride;
    boolean oldTableLockOverrideESet = tableLockOverrideESet;
    tableLockOverride = TABLE_LOCK_OVERRIDE_EDEFAULT;
    tableLockOverrideESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.RENDER_OPERATION__TABLE_LOCK_OVERRIDE, oldTableLockOverride, TABLE_LOCK_OVERRIDE_EDEFAULT, oldTableLockOverrideESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetTableLockOverride()
  {
    return tableLockOverrideESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isTranslateProcedureDefs()
  {
    return translateProcedureDefs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTranslateProcedureDefs(boolean newTranslateProcedureDefs)
  {
    boolean oldTranslateProcedureDefs = translateProcedureDefs;
    translateProcedureDefs = newTranslateProcedureDefs;
    boolean oldTranslateProcedureDefsESet = translateProcedureDefsESet;
    translateProcedureDefsESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__TRANSLATE_PROCEDURE_DEFS, oldTranslateProcedureDefs, translateProcedureDefs, !oldTranslateProcedureDefsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetTranslateProcedureDefs()
  {
    boolean oldTranslateProcedureDefs = translateProcedureDefs;
    boolean oldTranslateProcedureDefsESet = translateProcedureDefsESet;
    translateProcedureDefs = TRANSLATE_PROCEDURE_DEFS_EDEFAULT;
    translateProcedureDefsESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.RENDER_OPERATION__TRANSLATE_PROCEDURE_DEFS, oldTranslateProcedureDefs, TRANSLATE_PROCEDURE_DEFS_EDEFAULT, oldTranslateProcedureDefsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetTranslateProcedureDefs()
  {
    return translateProcedureDefsESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isTranslateViewDefs()
  {
    return translateViewDefs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTranslateViewDefs(boolean newTranslateViewDefs)
  {
    boolean oldTranslateViewDefs = translateViewDefs;
    translateViewDefs = newTranslateViewDefs;
    boolean oldTranslateViewDefsESet = translateViewDefsESet;
    translateViewDefsESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.RENDER_OPERATION__TRANSLATE_VIEW_DEFS, oldTranslateViewDefs, translateViewDefs, !oldTranslateViewDefsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetTranslateViewDefs()
  {
    boolean oldTranslateViewDefs = translateViewDefs;
    boolean oldTranslateViewDefsESet = translateViewDefsESet;
    translateViewDefs = TRANSLATE_VIEW_DEFS_EDEFAULT;
    translateViewDefsESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.RENDER_OPERATION__TRANSLATE_VIEW_DEFS, oldTranslateViewDefs, TRANSLATE_VIEW_DEFS_EDEFAULT, oldTranslateViewDefsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetTranslateViewDefs()
  {
    return translateViewDefsESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ExtractDDLModulePackage.RENDER_OPERATION__EXCEPTION:
        return basicSetException(null, msgs);
      case ExtractDDLModulePackage.RENDER_OPERATION__OUTPUT_RESOURCE:
        return basicSetOutputResource(null, msgs);
      case ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_QUALIFIER:
        return basicSetDataBaseQualifier(null, msgs);
      case ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_OVERRIDE:
        return basicSetDataBaseOverride(null, msgs);
      case ExtractDDLModulePackage.RENDER_OPERATION__TABLE_SPACE_OVERRIDE:
        return basicSetTableSpaceOverride(null, msgs);
      case ExtractDDLModulePackage.RENDER_OPERATION__TABLE_SPACE_SUFFIX:
        return basicSetTableSpaceSuffix(null, msgs);
      case ExtractDDLModulePackage.RENDER_OPERATION__STORAGE_GROUP_OVERRIDE:
        return basicSetStorageGroupOverride(null, msgs);
      case ExtractDDLModulePackage.RENDER_OPERATION__QUALIFIER_MAPS:
        return ((InternalEList<?>)getQualifierMaps()).basicRemove(otherEnd, msgs);
      case ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_MAPS:
        return ((InternalEList<?>)getDataBaseMaps()).basicRemove(otherEnd, msgs);
      case ExtractDDLModulePackage.RENDER_OPERATION__STORAGE_GROUP_MAPS:
        return ((InternalEList<?>)getStorageGroupMaps()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ExtractDDLModulePackage.RENDER_OPERATION__EXCEPTION:
        return getException();
      case ExtractDDLModulePackage.RENDER_OPERATION__OUTPUT_RESOURCE:
        return getOutputResource();
      case ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_QUALIFIER:
        return getDataBaseQualifier();
      case ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_OVERRIDE:
        return getDataBaseOverride();
      case ExtractDDLModulePackage.RENDER_OPERATION__TABLE_SPACE_OVERRIDE:
        return getTableSpaceOverride();
      case ExtractDDLModulePackage.RENDER_OPERATION__TABLE_SPACE_SUFFIX:
        return getTableSpaceSuffix();
      case ExtractDDLModulePackage.RENDER_OPERATION__STORAGE_GROUP_OVERRIDE:
        return getStorageGroupOverride();
      case ExtractDDLModulePackage.RENDER_OPERATION__QUALIFIER_MAPS:
        return getQualifierMaps();
      case ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_MAPS:
        return getDataBaseMaps();
      case ExtractDDLModulePackage.RENDER_OPERATION__STORAGE_GROUP_MAPS:
        return getStorageGroupMaps();
      case ExtractDDLModulePackage.RENDER_OPERATION__TABLE_LOCK_OVERRIDE:
        return getTableLockOverride();
      case ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_DRIVER:
        return getDataBaseDriver();
      case ExtractDDLModulePackage.RENDER_OPERATION__ADD_DATA_BASE_NAME:
        return isAddDataBaseName();
      case ExtractDDLModulePackage.RENDER_OPERATION__ADD_OWNER:
        return isAddOwner();
      case ExtractDDLModulePackage.RENDER_OPERATION__ADD_QUALIFIER:
        return isAddQualifier();
      case ExtractDDLModulePackage.RENDER_OPERATION__CREATE_FOREIGN_KEYS:
        return isCreateForeignKeys();
      case ExtractDDLModulePackage.RENDER_OPERATION__CREATE_INDEXES:
        return isCreateIndexes();
      case ExtractDDLModulePackage.RENDER_OPERATION__CREATE_PERMISSIONS:
        return isCreatePermissions();
      case ExtractDDLModulePackage.RENDER_OPERATION__CREATE_PRIMARY_KEYS:
        return isCreatePrimaryKeys();
      case ExtractDDLModulePackage.RENDER_OPERATION__CREATE_TABLE_SPACES:
        return isCreateTableSpaces();
      case ExtractDDLModulePackage.RENDER_OPERATION__DDL_XML:
        return isDdlXml();
      case ExtractDDLModulePackage.RENDER_OPERATION__DEFER_VIEWS:
        return isDeferViews();
      case ExtractDDLModulePackage.RENDER_OPERATION__DROP_PROCEDURES:
        return isDropProcedures();
      case ExtractDDLModulePackage.RENDER_OPERATION__DROP_SEQUENCES:
        return isDropSequences();
      case ExtractDDLModulePackage.RENDER_OPERATION__DROP_TABLES:
        return isDropTables();
      case ExtractDDLModulePackage.RENDER_OPERATION__DROP_TABLE_SPACES:
        return isDropTableSpaces();
      case ExtractDDLModulePackage.RENDER_OPERATION__GEN_ID_BY_DEFAULT:
        return isGenIDByDefault();
      case ExtractDDLModulePackage.RENDER_OPERATION__NO_COMMENTS:
        return isNoComments();
      case ExtractDDLModulePackage.RENDER_OPERATION__NO_DDL_INFO:
        return isNoDDLInfo();
      case ExtractDDLModulePackage.RENDER_OPERATION__NO_RESTRICT_ON_DROP:
        return isNoRestrictOnDrop();
      case ExtractDDLModulePackage.RENDER_OPERATION__PUBLIC_PERMISSIONS:
        return isPublicPermissions();
      case ExtractDDLModulePackage.RENDER_OPERATION__REMOVE_RESTRICT_ON_DROP:
        return isRemoveRestrictOnDrop();
      case ExtractDDLModulePackage.RENDER_OPERATION__SEPARATE_FOREIGN_KEYS:
        return isSeparateForeignKeys();
      case ExtractDDLModulePackage.RENDER_OPERATION__SHORT_FILE_NAMES:
        return isShortFileNames();
      case ExtractDDLModulePackage.RENDER_OPERATION__TRANSLATE_PROCEDURE_DEFS:
        return isTranslateProcedureDefs();
      case ExtractDDLModulePackage.RENDER_OPERATION__TRANSLATE_VIEW_DEFS:
        return isTranslateViewDefs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExtractDDLModulePackage.RENDER_OPERATION__EXCEPTION:
        setException((exception)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__OUTPUT_RESOURCE:
        setOutputResource((NamedResourceDefinition)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_QUALIFIER:
        setDataBaseQualifier((ComplexValue)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_OVERRIDE:
        setDataBaseOverride((ComplexValue)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__TABLE_SPACE_OVERRIDE:
        setTableSpaceOverride((ComplexValue)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__TABLE_SPACE_SUFFIX:
        setTableSpaceSuffix((ComplexValue)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__STORAGE_GROUP_OVERRIDE:
        setStorageGroupOverride((ComplexValue)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__QUALIFIER_MAPS:
        getQualifierMaps().clear();
        getQualifierMaps().addAll((Collection<? extends ComplexValueMap>)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_MAPS:
        getDataBaseMaps().clear();
        getDataBaseMaps().addAll((Collection<? extends ComplexValueMap>)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__STORAGE_GROUP_MAPS:
        getStorageGroupMaps().clear();
        getStorageGroupMaps().addAll((Collection<? extends ComplexValueMap>)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__TABLE_LOCK_OVERRIDE:
        setTableLockOverride((TableLockOverrideTypeEnum)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_DRIVER:
        setDataBaseDriver((DataBaseDriverTypeEnum)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__ADD_DATA_BASE_NAME:
        setAddDataBaseName((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__ADD_OWNER:
        setAddOwner((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__ADD_QUALIFIER:
        setAddQualifier((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__CREATE_FOREIGN_KEYS:
        setCreateForeignKeys((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__CREATE_INDEXES:
        setCreateIndexes((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__CREATE_PERMISSIONS:
        setCreatePermissions((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__CREATE_PRIMARY_KEYS:
        setCreatePrimaryKeys((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__CREATE_TABLE_SPACES:
        setCreateTableSpaces((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__DDL_XML:
        setDdlXml((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__DEFER_VIEWS:
        setDeferViews((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__DROP_PROCEDURES:
        setDropProcedures((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__DROP_SEQUENCES:
        setDropSequences((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__DROP_TABLES:
        setDropTables((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__DROP_TABLE_SPACES:
        setDropTableSpaces((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__GEN_ID_BY_DEFAULT:
        setGenIDByDefault((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__NO_COMMENTS:
        setNoComments((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__NO_DDL_INFO:
        setNoDDLInfo((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__NO_RESTRICT_ON_DROP:
        setNoRestrictOnDrop((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__PUBLIC_PERMISSIONS:
        setPublicPermissions((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__REMOVE_RESTRICT_ON_DROP:
        setRemoveRestrictOnDrop((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__SEPARATE_FOREIGN_KEYS:
        setSeparateForeignKeys((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__SHORT_FILE_NAMES:
        setShortFileNames((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__TRANSLATE_PROCEDURE_DEFS:
        setTranslateProcedureDefs((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__TRANSLATE_VIEW_DEFS:
        setTranslateViewDefs((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ExtractDDLModulePackage.RENDER_OPERATION__EXCEPTION:
        setException((exception)null);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__OUTPUT_RESOURCE:
        setOutputResource((NamedResourceDefinition)null);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_QUALIFIER:
        setDataBaseQualifier((ComplexValue)null);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_OVERRIDE:
        setDataBaseOverride((ComplexValue)null);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__TABLE_SPACE_OVERRIDE:
        setTableSpaceOverride((ComplexValue)null);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__TABLE_SPACE_SUFFIX:
        setTableSpaceSuffix((ComplexValue)null);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__STORAGE_GROUP_OVERRIDE:
        setStorageGroupOverride((ComplexValue)null);
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__QUALIFIER_MAPS:
        getQualifierMaps().clear();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_MAPS:
        getDataBaseMaps().clear();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__STORAGE_GROUP_MAPS:
        getStorageGroupMaps().clear();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__TABLE_LOCK_OVERRIDE:
        unsetTableLockOverride();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_DRIVER:
        unsetDataBaseDriver();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__ADD_DATA_BASE_NAME:
        unsetAddDataBaseName();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__ADD_OWNER:
        unsetAddOwner();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__ADD_QUALIFIER:
        unsetAddQualifier();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__CREATE_FOREIGN_KEYS:
        unsetCreateForeignKeys();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__CREATE_INDEXES:
        unsetCreateIndexes();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__CREATE_PERMISSIONS:
        unsetCreatePermissions();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__CREATE_PRIMARY_KEYS:
        unsetCreatePrimaryKeys();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__CREATE_TABLE_SPACES:
        unsetCreateTableSpaces();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__DDL_XML:
        unsetDdlXml();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__DEFER_VIEWS:
        unsetDeferViews();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__DROP_PROCEDURES:
        unsetDropProcedures();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__DROP_SEQUENCES:
        unsetDropSequences();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__DROP_TABLES:
        unsetDropTables();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__DROP_TABLE_SPACES:
        unsetDropTableSpaces();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__GEN_ID_BY_DEFAULT:
        unsetGenIDByDefault();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__NO_COMMENTS:
        unsetNoComments();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__NO_DDL_INFO:
        unsetNoDDLInfo();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__NO_RESTRICT_ON_DROP:
        unsetNoRestrictOnDrop();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__PUBLIC_PERMISSIONS:
        unsetPublicPermissions();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__REMOVE_RESTRICT_ON_DROP:
        unsetRemoveRestrictOnDrop();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__SEPARATE_FOREIGN_KEYS:
        unsetSeparateForeignKeys();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__SHORT_FILE_NAMES:
        unsetShortFileNames();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__TRANSLATE_PROCEDURE_DEFS:
        unsetTranslateProcedureDefs();
        return;
      case ExtractDDLModulePackage.RENDER_OPERATION__TRANSLATE_VIEW_DEFS:
        unsetTranslateViewDefs();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ExtractDDLModulePackage.RENDER_OPERATION__EXCEPTION:
        return exception != null;
      case ExtractDDLModulePackage.RENDER_OPERATION__OUTPUT_RESOURCE:
        return outputResource != null;
      case ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_QUALIFIER:
        return dataBaseQualifier != null;
      case ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_OVERRIDE:
        return dataBaseOverride != null;
      case ExtractDDLModulePackage.RENDER_OPERATION__TABLE_SPACE_OVERRIDE:
        return tableSpaceOverride != null;
      case ExtractDDLModulePackage.RENDER_OPERATION__TABLE_SPACE_SUFFIX:
        return tableSpaceSuffix != null;
      case ExtractDDLModulePackage.RENDER_OPERATION__STORAGE_GROUP_OVERRIDE:
        return storageGroupOverride != null;
      case ExtractDDLModulePackage.RENDER_OPERATION__QUALIFIER_MAPS:
        return qualifierMaps != null && !qualifierMaps.isEmpty();
      case ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_MAPS:
        return dataBaseMaps != null && !dataBaseMaps.isEmpty();
      case ExtractDDLModulePackage.RENDER_OPERATION__STORAGE_GROUP_MAPS:
        return storageGroupMaps != null && !storageGroupMaps.isEmpty();
      case ExtractDDLModulePackage.RENDER_OPERATION__TABLE_LOCK_OVERRIDE:
        return isSetTableLockOverride();
      case ExtractDDLModulePackage.RENDER_OPERATION__DATA_BASE_DRIVER:
        return isSetDataBaseDriver();
      case ExtractDDLModulePackage.RENDER_OPERATION__ADD_DATA_BASE_NAME:
        return isSetAddDataBaseName();
      case ExtractDDLModulePackage.RENDER_OPERATION__ADD_OWNER:
        return isSetAddOwner();
      case ExtractDDLModulePackage.RENDER_OPERATION__ADD_QUALIFIER:
        return isSetAddQualifier();
      case ExtractDDLModulePackage.RENDER_OPERATION__CREATE_FOREIGN_KEYS:
        return isSetCreateForeignKeys();
      case ExtractDDLModulePackage.RENDER_OPERATION__CREATE_INDEXES:
        return isSetCreateIndexes();
      case ExtractDDLModulePackage.RENDER_OPERATION__CREATE_PERMISSIONS:
        return isSetCreatePermissions();
      case ExtractDDLModulePackage.RENDER_OPERATION__CREATE_PRIMARY_KEYS:
        return isSetCreatePrimaryKeys();
      case ExtractDDLModulePackage.RENDER_OPERATION__CREATE_TABLE_SPACES:
        return isSetCreateTableSpaces();
      case ExtractDDLModulePackage.RENDER_OPERATION__DDL_XML:
        return isSetDdlXml();
      case ExtractDDLModulePackage.RENDER_OPERATION__DEFER_VIEWS:
        return isSetDeferViews();
      case ExtractDDLModulePackage.RENDER_OPERATION__DROP_PROCEDURES:
        return isSetDropProcedures();
      case ExtractDDLModulePackage.RENDER_OPERATION__DROP_SEQUENCES:
        return isSetDropSequences();
      case ExtractDDLModulePackage.RENDER_OPERATION__DROP_TABLES:
        return isSetDropTables();
      case ExtractDDLModulePackage.RENDER_OPERATION__DROP_TABLE_SPACES:
        return isSetDropTableSpaces();
      case ExtractDDLModulePackage.RENDER_OPERATION__GEN_ID_BY_DEFAULT:
        return isSetGenIDByDefault();
      case ExtractDDLModulePackage.RENDER_OPERATION__NO_COMMENTS:
        return isSetNoComments();
      case ExtractDDLModulePackage.RENDER_OPERATION__NO_DDL_INFO:
        return isSetNoDDLInfo();
      case ExtractDDLModulePackage.RENDER_OPERATION__NO_RESTRICT_ON_DROP:
        return isSetNoRestrictOnDrop();
      case ExtractDDLModulePackage.RENDER_OPERATION__PUBLIC_PERMISSIONS:
        return isSetPublicPermissions();
      case ExtractDDLModulePackage.RENDER_OPERATION__REMOVE_RESTRICT_ON_DROP:
        return isSetRemoveRestrictOnDrop();
      case ExtractDDLModulePackage.RENDER_OPERATION__SEPARATE_FOREIGN_KEYS:
        return isSetSeparateForeignKeys();
      case ExtractDDLModulePackage.RENDER_OPERATION__SHORT_FILE_NAMES:
        return isSetShortFileNames();
      case ExtractDDLModulePackage.RENDER_OPERATION__TRANSLATE_PROCEDURE_DEFS:
        return isSetTranslateProcedureDefs();
      case ExtractDDLModulePackage.RENDER_OPERATION__TRANSLATE_VIEW_DEFS:
        return isSetTranslateViewDefs();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (tableLockOverride: ");
    if (tableLockOverrideESet) result.append(tableLockOverride); else result.append("<unset>");
    result.append(", dataBaseDriver: ");
    if (dataBaseDriverESet) result.append(dataBaseDriver); else result.append("<unset>");
    result.append(", addDataBaseName: ");
    if (addDataBaseNameESet) result.append(addDataBaseName); else result.append("<unset>");
    result.append(", addOwner: ");
    if (addOwnerESet) result.append(addOwner); else result.append("<unset>");
    result.append(", addQualifier: ");
    if (addQualifierESet) result.append(addQualifier); else result.append("<unset>");
    result.append(", createForeignKeys: ");
    if (createForeignKeysESet) result.append(createForeignKeys); else result.append("<unset>");
    result.append(", createIndexes: ");
    if (createIndexesESet) result.append(createIndexes); else result.append("<unset>");
    result.append(", createPermissions: ");
    if (createPermissionsESet) result.append(createPermissions); else result.append("<unset>");
    result.append(", createPrimaryKeys: ");
    if (createPrimaryKeysESet) result.append(createPrimaryKeys); else result.append("<unset>");
    result.append(", createTableSpaces: ");
    if (createTableSpacesESet) result.append(createTableSpaces); else result.append("<unset>");
    result.append(", ddlXml: ");
    if (ddlXmlESet) result.append(ddlXml); else result.append("<unset>");
    result.append(", deferViews: ");
    if (deferViewsESet) result.append(deferViews); else result.append("<unset>");
    result.append(", dropProcedures: ");
    if (dropProceduresESet) result.append(dropProcedures); else result.append("<unset>");
    result.append(", dropSequences: ");
    if (dropSequencesESet) result.append(dropSequences); else result.append("<unset>");
    result.append(", dropTables: ");
    if (dropTablesESet) result.append(dropTables); else result.append("<unset>");
    result.append(", dropTableSpaces: ");
    if (dropTableSpacesESet) result.append(dropTableSpaces); else result.append("<unset>");
    result.append(", genIDByDefault: ");
    if (genIDByDefaultESet) result.append(genIDByDefault); else result.append("<unset>");
    result.append(", noComments: ");
    if (noCommentsESet) result.append(noComments); else result.append("<unset>");
    result.append(", noDDLInfo: ");
    if (noDDLInfoESet) result.append(noDDLInfo); else result.append("<unset>");
    result.append(", noRestrictOnDrop: ");
    if (noRestrictOnDropESet) result.append(noRestrictOnDrop); else result.append("<unset>");
    result.append(", publicPermissions: ");
    if (publicPermissionsESet) result.append(publicPermissions); else result.append("<unset>");
    result.append(", removeRestrictOnDrop: ");
    if (removeRestrictOnDropESet) result.append(removeRestrictOnDrop); else result.append("<unset>");
    result.append(", separateForeignKeys: ");
    if (separateForeignKeysESet) result.append(separateForeignKeys); else result.append("<unset>");
    result.append(", shortFileNames: ");
    if (shortFileNamesESet) result.append(shortFileNames); else result.append("<unset>");
    result.append(", translateProcedureDefs: ");
    if (translateProcedureDefsESet) result.append(translateProcedureDefs); else result.append("<unset>");
    result.append(", translateViewDefs: ");
    if (translateViewDefsESet) result.append(translateViewDefs); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // RenderOperationImpl
