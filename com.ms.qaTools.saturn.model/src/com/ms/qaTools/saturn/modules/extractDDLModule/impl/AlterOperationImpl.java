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
import com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation;
import com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage;
import com.ms.qaTools.saturn.modules.extractDDLModule.TableLockOverrideTypeEnum;
import com.ms.qaTools.saturn.types.ComplexValueMap;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Alter Operation</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl#getException <em>Exception</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl#getOutputResource <em>Output
 * Resource</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl#getDataBaseQualifier <em>Data Base
 * Qualifier</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl#getDataBaseOverride <em>Data Base
 * Override</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl#getTableSpaceOverride <em>Table
 * Space Override</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl#getTableSpaceSuffix <em>Table Space
 * Suffix</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl#getStorageGroupOverride <em>Storage
 * Group Override</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl#getQualifierMaps <em>Qualifier Maps
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl#getDataBaseMaps <em>Data Base Maps
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl#getStorageGroupMaps <em>Storage
 * Group Maps</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl#isAddDataBaseName <em>Add Data Base
 * Name</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl#isAddOwner <em>Add Owner</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl#isAddQualifier <em>Add Qualifier
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl#isCreateTableSpaces <em>Create
 * Table Spaces</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl#isForceAlter <em>Force Alter</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl#isGenIDByDefault <em>Gen ID By
 * Default</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl#isIgnoreMissing <em>Ignore Missing
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl#isNoComments <em>No Comments</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl#isNoRestrictOnDrop <em>No Restrict
 * On Drop</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl#isRemoveRestrictOnDrop <em>Remove
 * Restrict On Drop</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl#isSeparateForeignKeys <em>Separate
 * Foreign Keys</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl#getTableLockOverride <em>Table Lock
 * Override</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl#isTranslateProcedureDefs <em>
 * Translate Procedure Defs</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl#isTranslateViewDefs <em>Translate
 * View Defs</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AlterOperationImpl extends AbstractOperationImpl implements AlterOperation
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
   * The default value of the '{@link #isForceAlter() <em>Force Alter</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isForceAlter()
   * @generated
   * @ordered
   */
  protected static final boolean                   FORCE_ALTER_EDEFAULT              = false;

  /**
   * The cached value of the '{@link #isForceAlter() <em>Force Alter</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isForceAlter()
   * @generated
   * @ordered
   */
  protected boolean                                forceAlter                        = FORCE_ALTER_EDEFAULT;

  /**
   * This is true if the Force Alter attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                forceAlterESet;

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
   * The default value of the '{@link #isIgnoreMissing() <em>Ignore Missing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIgnoreMissing()
   * @generated
   * @ordered
   */
  protected static final boolean                   IGNORE_MISSING_EDEFAULT           = false;

  /**
   * The cached value of the '{@link #isIgnoreMissing() <em>Ignore Missing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIgnoreMissing()
   * @generated
   * @ordered
   */
  protected boolean                                ignoreMissing                     = IGNORE_MISSING_EDEFAULT;

  /**
   * This is true if the Ignore Missing attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                ignoreMissingESet;

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
  protected AlterOperationImpl()
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
    return ExtractDDLModulePackage.Literals.ALTER_OPERATION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__EXCEPTION, oldException, newException);
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
        msgs = ((InternalEObject)exception).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.ALTER_OPERATION__EXCEPTION, null, msgs);
      if (newException != null)
        msgs = ((InternalEObject)newException).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.ALTER_OPERATION__EXCEPTION, null, msgs);
      msgs = basicSetException(newException, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__EXCEPTION, newException, newException));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__OUTPUT_RESOURCE, oldOutputResource, newOutputResource);
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
        msgs = ((InternalEObject)outputResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.ALTER_OPERATION__OUTPUT_RESOURCE, null, msgs);
      if (newOutputResource != null)
        msgs = ((InternalEObject)newOutputResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.ALTER_OPERATION__OUTPUT_RESOURCE, null, msgs);
      msgs = basicSetOutputResource(newOutputResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__OUTPUT_RESOURCE, newOutputResource, newOutputResource));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__DATA_BASE_QUALIFIER, oldDataBaseQualifier, newDataBaseQualifier);
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
        msgs = ((InternalEObject)dataBaseQualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.ALTER_OPERATION__DATA_BASE_QUALIFIER, null, msgs);
      if (newDataBaseQualifier != null)
        msgs = ((InternalEObject)newDataBaseQualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.ALTER_OPERATION__DATA_BASE_QUALIFIER, null, msgs);
      msgs = basicSetDataBaseQualifier(newDataBaseQualifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__DATA_BASE_QUALIFIER, newDataBaseQualifier, newDataBaseQualifier));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__DATA_BASE_OVERRIDE, oldDataBaseOverride, newDataBaseOverride);
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
        msgs = ((InternalEObject)dataBaseOverride).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.ALTER_OPERATION__DATA_BASE_OVERRIDE, null, msgs);
      if (newDataBaseOverride != null)
        msgs = ((InternalEObject)newDataBaseOverride).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.ALTER_OPERATION__DATA_BASE_OVERRIDE, null, msgs);
      msgs = basicSetDataBaseOverride(newDataBaseOverride, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__DATA_BASE_OVERRIDE, newDataBaseOverride, newDataBaseOverride));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__TABLE_SPACE_OVERRIDE, oldTableSpaceOverride, newTableSpaceOverride);
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
        msgs = ((InternalEObject)tableSpaceOverride).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.ALTER_OPERATION__TABLE_SPACE_OVERRIDE, null, msgs);
      if (newTableSpaceOverride != null)
        msgs = ((InternalEObject)newTableSpaceOverride).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.ALTER_OPERATION__TABLE_SPACE_OVERRIDE, null, msgs);
      msgs = basicSetTableSpaceOverride(newTableSpaceOverride, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__TABLE_SPACE_OVERRIDE, newTableSpaceOverride, newTableSpaceOverride));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__TABLE_SPACE_SUFFIX, oldTableSpaceSuffix, newTableSpaceSuffix);
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
        msgs = ((InternalEObject)tableSpaceSuffix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.ALTER_OPERATION__TABLE_SPACE_SUFFIX, null, msgs);
      if (newTableSpaceSuffix != null)
        msgs = ((InternalEObject)newTableSpaceSuffix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.ALTER_OPERATION__TABLE_SPACE_SUFFIX, null, msgs);
      msgs = basicSetTableSpaceSuffix(newTableSpaceSuffix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__TABLE_SPACE_SUFFIX, newTableSpaceSuffix, newTableSpaceSuffix));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__STORAGE_GROUP_OVERRIDE, oldStorageGroupOverride, newStorageGroupOverride);
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
        msgs = ((InternalEObject)storageGroupOverride).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.ALTER_OPERATION__STORAGE_GROUP_OVERRIDE, null, msgs);
      if (newStorageGroupOverride != null)
        msgs = ((InternalEObject)newStorageGroupOverride).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.ALTER_OPERATION__STORAGE_GROUP_OVERRIDE, null, msgs);
      msgs = basicSetStorageGroupOverride(newStorageGroupOverride, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__STORAGE_GROUP_OVERRIDE, newStorageGroupOverride, newStorageGroupOverride));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<ComplexValueMap> getQualifierMaps()
  {
    if (qualifierMaps == null)
    {
      qualifierMaps = new EObjectContainmentEList<ComplexValueMap>(ComplexValueMap.class, this, ExtractDDLModulePackage.ALTER_OPERATION__QUALIFIER_MAPS);
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
      dataBaseMaps = new EObjectContainmentEList<ComplexValueMap>(ComplexValueMap.class, this, ExtractDDLModulePackage.ALTER_OPERATION__DATA_BASE_MAPS);
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
      storageGroupMaps = new EObjectContainmentEList<ComplexValueMap>(ComplexValueMap.class, this, ExtractDDLModulePackage.ALTER_OPERATION__STORAGE_GROUP_MAPS);
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
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__ADD_DATA_BASE_NAME, oldAddDataBaseName, addDataBaseName, !oldAddDataBaseNameESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.ALTER_OPERATION__ADD_DATA_BASE_NAME, oldAddDataBaseName, ADD_DATA_BASE_NAME_EDEFAULT, oldAddDataBaseNameESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__ADD_OWNER, oldAddOwner, addOwner, !oldAddOwnerESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.ALTER_OPERATION__ADD_OWNER, oldAddOwner, ADD_OWNER_EDEFAULT, oldAddOwnerESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__ADD_QUALIFIER, oldAddQualifier, addQualifier, !oldAddQualifierESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.ALTER_OPERATION__ADD_QUALIFIER, oldAddQualifier, ADD_QUALIFIER_EDEFAULT, oldAddQualifierESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__CREATE_TABLE_SPACES, oldCreateTableSpaces, createTableSpaces, !oldCreateTableSpacesESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.ALTER_OPERATION__CREATE_TABLE_SPACES, oldCreateTableSpaces, CREATE_TABLE_SPACES_EDEFAULT, oldCreateTableSpacesESet));
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
  public boolean isForceAlter()
  {
    return forceAlter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setForceAlter(boolean newForceAlter)
  {
    boolean oldForceAlter = forceAlter;
    forceAlter = newForceAlter;
    boolean oldForceAlterESet = forceAlterESet;
    forceAlterESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__FORCE_ALTER, oldForceAlter, forceAlter, !oldForceAlterESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetForceAlter()
  {
    boolean oldForceAlter = forceAlter;
    boolean oldForceAlterESet = forceAlterESet;
    forceAlter = FORCE_ALTER_EDEFAULT;
    forceAlterESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.ALTER_OPERATION__FORCE_ALTER, oldForceAlter, FORCE_ALTER_EDEFAULT, oldForceAlterESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetForceAlter()
  {
    return forceAlterESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__GEN_ID_BY_DEFAULT, oldGenIDByDefault, genIDByDefault, !oldGenIDByDefaultESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.ALTER_OPERATION__GEN_ID_BY_DEFAULT, oldGenIDByDefault, GEN_ID_BY_DEFAULT_EDEFAULT, oldGenIDByDefaultESet));
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
  public boolean isIgnoreMissing()
  {
    return ignoreMissing;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setIgnoreMissing(boolean newIgnoreMissing)
  {
    boolean oldIgnoreMissing = ignoreMissing;
    ignoreMissing = newIgnoreMissing;
    boolean oldIgnoreMissingESet = ignoreMissingESet;
    ignoreMissingESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__IGNORE_MISSING, oldIgnoreMissing, ignoreMissing, !oldIgnoreMissingESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetIgnoreMissing()
  {
    boolean oldIgnoreMissing = ignoreMissing;
    boolean oldIgnoreMissingESet = ignoreMissingESet;
    ignoreMissing = IGNORE_MISSING_EDEFAULT;
    ignoreMissingESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.ALTER_OPERATION__IGNORE_MISSING, oldIgnoreMissing, IGNORE_MISSING_EDEFAULT, oldIgnoreMissingESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetIgnoreMissing()
  {
    return ignoreMissingESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__NO_COMMENTS, oldNoComments, noComments, !oldNoCommentsESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.ALTER_OPERATION__NO_COMMENTS, oldNoComments, NO_COMMENTS_EDEFAULT, oldNoCommentsESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__NO_RESTRICT_ON_DROP, oldNoRestrictOnDrop, noRestrictOnDrop, !oldNoRestrictOnDropESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.ALTER_OPERATION__NO_RESTRICT_ON_DROP, oldNoRestrictOnDrop, NO_RESTRICT_ON_DROP_EDEFAULT, oldNoRestrictOnDropESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__REMOVE_RESTRICT_ON_DROP, oldRemoveRestrictOnDrop, removeRestrictOnDrop, !oldRemoveRestrictOnDropESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.ALTER_OPERATION__REMOVE_RESTRICT_ON_DROP, oldRemoveRestrictOnDrop, REMOVE_RESTRICT_ON_DROP_EDEFAULT, oldRemoveRestrictOnDropESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__SEPARATE_FOREIGN_KEYS, oldSeparateForeignKeys, separateForeignKeys, !oldSeparateForeignKeysESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.ALTER_OPERATION__SEPARATE_FOREIGN_KEYS, oldSeparateForeignKeys, SEPARATE_FOREIGN_KEYS_EDEFAULT, oldSeparateForeignKeysESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__TABLE_LOCK_OVERRIDE, oldTableLockOverride, tableLockOverride, !oldTableLockOverrideESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.ALTER_OPERATION__TABLE_LOCK_OVERRIDE, oldTableLockOverride, TABLE_LOCK_OVERRIDE_EDEFAULT, oldTableLockOverrideESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__TRANSLATE_PROCEDURE_DEFS, oldTranslateProcedureDefs, translateProcedureDefs, !oldTranslateProcedureDefsESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.ALTER_OPERATION__TRANSLATE_PROCEDURE_DEFS, oldTranslateProcedureDefs, TRANSLATE_PROCEDURE_DEFS_EDEFAULT, oldTranslateProcedureDefsESet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.ALTER_OPERATION__TRANSLATE_VIEW_DEFS, oldTranslateViewDefs, translateViewDefs, !oldTranslateViewDefsESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.ALTER_OPERATION__TRANSLATE_VIEW_DEFS, oldTranslateViewDefs, TRANSLATE_VIEW_DEFS_EDEFAULT, oldTranslateViewDefsESet));
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
      case ExtractDDLModulePackage.ALTER_OPERATION__EXCEPTION:
        return basicSetException(null, msgs);
      case ExtractDDLModulePackage.ALTER_OPERATION__OUTPUT_RESOURCE:
        return basicSetOutputResource(null, msgs);
      case ExtractDDLModulePackage.ALTER_OPERATION__DATA_BASE_QUALIFIER:
        return basicSetDataBaseQualifier(null, msgs);
      case ExtractDDLModulePackage.ALTER_OPERATION__DATA_BASE_OVERRIDE:
        return basicSetDataBaseOverride(null, msgs);
      case ExtractDDLModulePackage.ALTER_OPERATION__TABLE_SPACE_OVERRIDE:
        return basicSetTableSpaceOverride(null, msgs);
      case ExtractDDLModulePackage.ALTER_OPERATION__TABLE_SPACE_SUFFIX:
        return basicSetTableSpaceSuffix(null, msgs);
      case ExtractDDLModulePackage.ALTER_OPERATION__STORAGE_GROUP_OVERRIDE:
        return basicSetStorageGroupOverride(null, msgs);
      case ExtractDDLModulePackage.ALTER_OPERATION__QUALIFIER_MAPS:
        return ((InternalEList<?>)getQualifierMaps()).basicRemove(otherEnd, msgs);
      case ExtractDDLModulePackage.ALTER_OPERATION__DATA_BASE_MAPS:
        return ((InternalEList<?>)getDataBaseMaps()).basicRemove(otherEnd, msgs);
      case ExtractDDLModulePackage.ALTER_OPERATION__STORAGE_GROUP_MAPS:
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
      case ExtractDDLModulePackage.ALTER_OPERATION__EXCEPTION:
        return getException();
      case ExtractDDLModulePackage.ALTER_OPERATION__OUTPUT_RESOURCE:
        return getOutputResource();
      case ExtractDDLModulePackage.ALTER_OPERATION__DATA_BASE_QUALIFIER:
        return getDataBaseQualifier();
      case ExtractDDLModulePackage.ALTER_OPERATION__DATA_BASE_OVERRIDE:
        return getDataBaseOverride();
      case ExtractDDLModulePackage.ALTER_OPERATION__TABLE_SPACE_OVERRIDE:
        return getTableSpaceOverride();
      case ExtractDDLModulePackage.ALTER_OPERATION__TABLE_SPACE_SUFFIX:
        return getTableSpaceSuffix();
      case ExtractDDLModulePackage.ALTER_OPERATION__STORAGE_GROUP_OVERRIDE:
        return getStorageGroupOverride();
      case ExtractDDLModulePackage.ALTER_OPERATION__QUALIFIER_MAPS:
        return getQualifierMaps();
      case ExtractDDLModulePackage.ALTER_OPERATION__DATA_BASE_MAPS:
        return getDataBaseMaps();
      case ExtractDDLModulePackage.ALTER_OPERATION__STORAGE_GROUP_MAPS:
        return getStorageGroupMaps();
      case ExtractDDLModulePackage.ALTER_OPERATION__TABLE_LOCK_OVERRIDE:
        return getTableLockOverride();
      case ExtractDDLModulePackage.ALTER_OPERATION__ADD_DATA_BASE_NAME:
        return isAddDataBaseName();
      case ExtractDDLModulePackage.ALTER_OPERATION__ADD_OWNER:
        return isAddOwner();
      case ExtractDDLModulePackage.ALTER_OPERATION__ADD_QUALIFIER:
        return isAddQualifier();
      case ExtractDDLModulePackage.ALTER_OPERATION__CREATE_TABLE_SPACES:
        return isCreateTableSpaces();
      case ExtractDDLModulePackage.ALTER_OPERATION__FORCE_ALTER:
        return isForceAlter();
      case ExtractDDLModulePackage.ALTER_OPERATION__GEN_ID_BY_DEFAULT:
        return isGenIDByDefault();
      case ExtractDDLModulePackage.ALTER_OPERATION__IGNORE_MISSING:
        return isIgnoreMissing();
      case ExtractDDLModulePackage.ALTER_OPERATION__NO_COMMENTS:
        return isNoComments();
      case ExtractDDLModulePackage.ALTER_OPERATION__NO_RESTRICT_ON_DROP:
        return isNoRestrictOnDrop();
      case ExtractDDLModulePackage.ALTER_OPERATION__REMOVE_RESTRICT_ON_DROP:
        return isRemoveRestrictOnDrop();
      case ExtractDDLModulePackage.ALTER_OPERATION__SEPARATE_FOREIGN_KEYS:
        return isSeparateForeignKeys();
      case ExtractDDLModulePackage.ALTER_OPERATION__TRANSLATE_PROCEDURE_DEFS:
        return isTranslateProcedureDefs();
      case ExtractDDLModulePackage.ALTER_OPERATION__TRANSLATE_VIEW_DEFS:
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
      case ExtractDDLModulePackage.ALTER_OPERATION__EXCEPTION:
        setException((exception)newValue);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__OUTPUT_RESOURCE:
        setOutputResource((NamedResourceDefinition)newValue);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__DATA_BASE_QUALIFIER:
        setDataBaseQualifier((ComplexValue)newValue);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__DATA_BASE_OVERRIDE:
        setDataBaseOverride((ComplexValue)newValue);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__TABLE_SPACE_OVERRIDE:
        setTableSpaceOverride((ComplexValue)newValue);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__TABLE_SPACE_SUFFIX:
        setTableSpaceSuffix((ComplexValue)newValue);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__STORAGE_GROUP_OVERRIDE:
        setStorageGroupOverride((ComplexValue)newValue);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__QUALIFIER_MAPS:
        getQualifierMaps().clear();
        getQualifierMaps().addAll((Collection<? extends ComplexValueMap>)newValue);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__DATA_BASE_MAPS:
        getDataBaseMaps().clear();
        getDataBaseMaps().addAll((Collection<? extends ComplexValueMap>)newValue);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__STORAGE_GROUP_MAPS:
        getStorageGroupMaps().clear();
        getStorageGroupMaps().addAll((Collection<? extends ComplexValueMap>)newValue);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__TABLE_LOCK_OVERRIDE:
        setTableLockOverride((TableLockOverrideTypeEnum)newValue);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__ADD_DATA_BASE_NAME:
        setAddDataBaseName((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__ADD_OWNER:
        setAddOwner((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__ADD_QUALIFIER:
        setAddQualifier((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__CREATE_TABLE_SPACES:
        setCreateTableSpaces((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__FORCE_ALTER:
        setForceAlter((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__GEN_ID_BY_DEFAULT:
        setGenIDByDefault((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__IGNORE_MISSING:
        setIgnoreMissing((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__NO_COMMENTS:
        setNoComments((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__NO_RESTRICT_ON_DROP:
        setNoRestrictOnDrop((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__REMOVE_RESTRICT_ON_DROP:
        setRemoveRestrictOnDrop((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__SEPARATE_FOREIGN_KEYS:
        setSeparateForeignKeys((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__TRANSLATE_PROCEDURE_DEFS:
        setTranslateProcedureDefs((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__TRANSLATE_VIEW_DEFS:
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
      case ExtractDDLModulePackage.ALTER_OPERATION__EXCEPTION:
        setException((exception)null);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__OUTPUT_RESOURCE:
        setOutputResource((NamedResourceDefinition)null);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__DATA_BASE_QUALIFIER:
        setDataBaseQualifier((ComplexValue)null);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__DATA_BASE_OVERRIDE:
        setDataBaseOverride((ComplexValue)null);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__TABLE_SPACE_OVERRIDE:
        setTableSpaceOverride((ComplexValue)null);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__TABLE_SPACE_SUFFIX:
        setTableSpaceSuffix((ComplexValue)null);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__STORAGE_GROUP_OVERRIDE:
        setStorageGroupOverride((ComplexValue)null);
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__QUALIFIER_MAPS:
        getQualifierMaps().clear();
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__DATA_BASE_MAPS:
        getDataBaseMaps().clear();
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__STORAGE_GROUP_MAPS:
        getStorageGroupMaps().clear();
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__TABLE_LOCK_OVERRIDE:
        unsetTableLockOverride();
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__ADD_DATA_BASE_NAME:
        unsetAddDataBaseName();
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__ADD_OWNER:
        unsetAddOwner();
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__ADD_QUALIFIER:
        unsetAddQualifier();
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__CREATE_TABLE_SPACES:
        unsetCreateTableSpaces();
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__FORCE_ALTER:
        unsetForceAlter();
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__GEN_ID_BY_DEFAULT:
        unsetGenIDByDefault();
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__IGNORE_MISSING:
        unsetIgnoreMissing();
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__NO_COMMENTS:
        unsetNoComments();
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__NO_RESTRICT_ON_DROP:
        unsetNoRestrictOnDrop();
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__REMOVE_RESTRICT_ON_DROP:
        unsetRemoveRestrictOnDrop();
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__SEPARATE_FOREIGN_KEYS:
        unsetSeparateForeignKeys();
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__TRANSLATE_PROCEDURE_DEFS:
        unsetTranslateProcedureDefs();
        return;
      case ExtractDDLModulePackage.ALTER_OPERATION__TRANSLATE_VIEW_DEFS:
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
      case ExtractDDLModulePackage.ALTER_OPERATION__EXCEPTION:
        return exception != null;
      case ExtractDDLModulePackage.ALTER_OPERATION__OUTPUT_RESOURCE:
        return outputResource != null;
      case ExtractDDLModulePackage.ALTER_OPERATION__DATA_BASE_QUALIFIER:
        return dataBaseQualifier != null;
      case ExtractDDLModulePackage.ALTER_OPERATION__DATA_BASE_OVERRIDE:
        return dataBaseOverride != null;
      case ExtractDDLModulePackage.ALTER_OPERATION__TABLE_SPACE_OVERRIDE:
        return tableSpaceOverride != null;
      case ExtractDDLModulePackage.ALTER_OPERATION__TABLE_SPACE_SUFFIX:
        return tableSpaceSuffix != null;
      case ExtractDDLModulePackage.ALTER_OPERATION__STORAGE_GROUP_OVERRIDE:
        return storageGroupOverride != null;
      case ExtractDDLModulePackage.ALTER_OPERATION__QUALIFIER_MAPS:
        return qualifierMaps != null && !qualifierMaps.isEmpty();
      case ExtractDDLModulePackage.ALTER_OPERATION__DATA_BASE_MAPS:
        return dataBaseMaps != null && !dataBaseMaps.isEmpty();
      case ExtractDDLModulePackage.ALTER_OPERATION__STORAGE_GROUP_MAPS:
        return storageGroupMaps != null && !storageGroupMaps.isEmpty();
      case ExtractDDLModulePackage.ALTER_OPERATION__TABLE_LOCK_OVERRIDE:
        return isSetTableLockOverride();
      case ExtractDDLModulePackage.ALTER_OPERATION__ADD_DATA_BASE_NAME:
        return isSetAddDataBaseName();
      case ExtractDDLModulePackage.ALTER_OPERATION__ADD_OWNER:
        return isSetAddOwner();
      case ExtractDDLModulePackage.ALTER_OPERATION__ADD_QUALIFIER:
        return isSetAddQualifier();
      case ExtractDDLModulePackage.ALTER_OPERATION__CREATE_TABLE_SPACES:
        return isSetCreateTableSpaces();
      case ExtractDDLModulePackage.ALTER_OPERATION__FORCE_ALTER:
        return isSetForceAlter();
      case ExtractDDLModulePackage.ALTER_OPERATION__GEN_ID_BY_DEFAULT:
        return isSetGenIDByDefault();
      case ExtractDDLModulePackage.ALTER_OPERATION__IGNORE_MISSING:
        return isSetIgnoreMissing();
      case ExtractDDLModulePackage.ALTER_OPERATION__NO_COMMENTS:
        return isSetNoComments();
      case ExtractDDLModulePackage.ALTER_OPERATION__NO_RESTRICT_ON_DROP:
        return isSetNoRestrictOnDrop();
      case ExtractDDLModulePackage.ALTER_OPERATION__REMOVE_RESTRICT_ON_DROP:
        return isSetRemoveRestrictOnDrop();
      case ExtractDDLModulePackage.ALTER_OPERATION__SEPARATE_FOREIGN_KEYS:
        return isSetSeparateForeignKeys();
      case ExtractDDLModulePackage.ALTER_OPERATION__TRANSLATE_PROCEDURE_DEFS:
        return isSetTranslateProcedureDefs();
      case ExtractDDLModulePackage.ALTER_OPERATION__TRANSLATE_VIEW_DEFS:
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
    result.append(", addDataBaseName: ");
    if (addDataBaseNameESet) result.append(addDataBaseName); else result.append("<unset>");
    result.append(", addOwner: ");
    if (addOwnerESet) result.append(addOwner); else result.append("<unset>");
    result.append(", addQualifier: ");
    if (addQualifierESet) result.append(addQualifier); else result.append("<unset>");
    result.append(", createTableSpaces: ");
    if (createTableSpacesESet) result.append(createTableSpaces); else result.append("<unset>");
    result.append(", forceAlter: ");
    if (forceAlterESet) result.append(forceAlter); else result.append("<unset>");
    result.append(", genIDByDefault: ");
    if (genIDByDefaultESet) result.append(genIDByDefault); else result.append("<unset>");
    result.append(", ignoreMissing: ");
    if (ignoreMissingESet) result.append(ignoreMissing); else result.append("<unset>");
    result.append(", noComments: ");
    if (noCommentsESet) result.append(noComments); else result.append("<unset>");
    result.append(", noRestrictOnDrop: ");
    if (noRestrictOnDropESet) result.append(noRestrictOnDrop); else result.append("<unset>");
    result.append(", removeRestrictOnDrop: ");
    if (removeRestrictOnDropESet) result.append(removeRestrictOnDrop); else result.append("<unset>");
    result.append(", separateForeignKeys: ");
    if (separateForeignKeysESet) result.append(separateForeignKeys); else result.append("<unset>");
    result.append(", translateProcedureDefs: ");
    if (translateProcedureDefsESet) result.append(translateProcedureDefs); else result.append("<unset>");
    result.append(", translateViewDefs: ");
    if (translateViewDefsESet) result.append(translateViewDefs); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // AlterOperationImpl
