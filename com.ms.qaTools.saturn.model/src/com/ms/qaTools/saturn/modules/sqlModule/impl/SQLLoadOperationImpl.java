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
package com.ms.qaTools.saturn.modules.sqlModule.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ms.qaTools.saturn.modules.sqlModule.IOFileTypesEnum;
import com.ms.qaTools.saturn.modules.sqlModule.LoadTable;
import com.ms.qaTools.saturn.modules.sqlModule.SQLLoadOperation;
import com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage;
import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>SQL Load Operation</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLLoadOperationImpl#getInputResource <em>Input Resource
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLLoadOperationImpl#getTables <em>Tables</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLLoadOperationImpl#getTableGroupDefinition <em>Table Group
 * Definition</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLLoadOperationImpl#getDefaultInputResourceType <em>Default
 * Input Resource Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class SQLLoadOperationImpl extends AbstractSQLOperationImpl implements SQLLoadOperation
{
  /**
   * The cached value of the '{@link #getInputResource() <em>Input Resource</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getInputResource()
   * @generated
   * @ordered
   */
  protected ResourceDefinition           inputResource;

  /**
   * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTables()
   * @generated
   * @ordered
   */
  protected EList<LoadTable>             tables;

  /**
   * The cached value of the '{@link #getTableGroupDefinition() <em>Table Group Definition</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getTableGroupDefinition()
   * @generated
   * @ordered
   */
  protected ResourceDefinition           tableGroupDefinition;

  /**
   * The default value of the '{@link #getDefaultInputResourceType() <em>Default Input Resource Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getDefaultInputResourceType()
   * @generated
   * @ordered
   */
  protected static final IOFileTypesEnum DEFAULT_INPUT_RESOURCE_TYPE_EDEFAULT = IOFileTypesEnum.CSV;

  /**
   * The cached value of the '{@link #getDefaultInputResourceType() <em>Default Input Resource Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getDefaultInputResourceType()
   * @generated
   * @ordered
   */
  protected IOFileTypesEnum              defaultInputResourceType             = DEFAULT_INPUT_RESOURCE_TYPE_EDEFAULT;

  /**
   * This is true if the Default Input Resource Type attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  protected boolean                      defaultInputResourceTypeESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected SQLLoadOperationImpl()
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
    return SqlModulePackage.Literals.SQL_LOAD_OPERATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getInputResource()
  {
    return inputResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInputResource(ResourceDefinition newInputResource, NotificationChain msgs)
  {
    ResourceDefinition oldInputResource = inputResource;
    inputResource = newInputResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlModulePackage.SQL_LOAD_OPERATION__INPUT_RESOURCE, oldInputResource, newInputResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setInputResource(ResourceDefinition newInputResource)
  {
    if (newInputResource != inputResource)
    {
      NotificationChain msgs = null;
      if (inputResource != null)
        msgs = ((InternalEObject)inputResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.SQL_LOAD_OPERATION__INPUT_RESOURCE, null, msgs);
      if (newInputResource != null)
        msgs = ((InternalEObject)newInputResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.SQL_LOAD_OPERATION__INPUT_RESOURCE, null, msgs);
      msgs = basicSetInputResource(newInputResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlModulePackage.SQL_LOAD_OPERATION__INPUT_RESOURCE, newInputResource, newInputResource));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<LoadTable> getTables()
  {
    if (tables == null)
    {
      tables = new EObjectContainmentEList<LoadTable>(LoadTable.class, this, SqlModulePackage.SQL_LOAD_OPERATION__TABLES);
    }
    return tables;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getTableGroupDefinition()
  {
    return tableGroupDefinition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTableGroupDefinition(ResourceDefinition newTableGroupDefinition,
      NotificationChain msgs)
  {
    ResourceDefinition oldTableGroupDefinition = tableGroupDefinition;
    tableGroupDefinition = newTableGroupDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlModulePackage.SQL_LOAD_OPERATION__TABLE_GROUP_DEFINITION, oldTableGroupDefinition, newTableGroupDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTableGroupDefinition(ResourceDefinition newTableGroupDefinition)
  {
    if (newTableGroupDefinition != tableGroupDefinition)
    {
      NotificationChain msgs = null;
      if (tableGroupDefinition != null)
        msgs = ((InternalEObject)tableGroupDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.SQL_LOAD_OPERATION__TABLE_GROUP_DEFINITION, null, msgs);
      if (newTableGroupDefinition != null)
        msgs = ((InternalEObject)newTableGroupDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.SQL_LOAD_OPERATION__TABLE_GROUP_DEFINITION, null, msgs);
      msgs = basicSetTableGroupDefinition(newTableGroupDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlModulePackage.SQL_LOAD_OPERATION__TABLE_GROUP_DEFINITION, newTableGroupDefinition, newTableGroupDefinition));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public IOFileTypesEnum getDefaultInputResourceType()
  {
    return defaultInputResourceType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultInputResourceType(IOFileTypesEnum newDefaultInputResourceType)
  {
    IOFileTypesEnum oldDefaultInputResourceType = defaultInputResourceType;
    defaultInputResourceType = newDefaultInputResourceType == null ? DEFAULT_INPUT_RESOURCE_TYPE_EDEFAULT : newDefaultInputResourceType;
    boolean oldDefaultInputResourceTypeESet = defaultInputResourceTypeESet;
    defaultInputResourceTypeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlModulePackage.SQL_LOAD_OPERATION__DEFAULT_INPUT_RESOURCE_TYPE, oldDefaultInputResourceType, defaultInputResourceType, !oldDefaultInputResourceTypeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetDefaultInputResourceType()
  {
    IOFileTypesEnum oldDefaultInputResourceType = defaultInputResourceType;
    boolean oldDefaultInputResourceTypeESet = defaultInputResourceTypeESet;
    defaultInputResourceType = DEFAULT_INPUT_RESOURCE_TYPE_EDEFAULT;
    defaultInputResourceTypeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SqlModulePackage.SQL_LOAD_OPERATION__DEFAULT_INPUT_RESOURCE_TYPE, oldDefaultInputResourceType, DEFAULT_INPUT_RESOURCE_TYPE_EDEFAULT, oldDefaultInputResourceTypeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetDefaultInputResourceType()
  {
    return defaultInputResourceTypeESet;
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
      case SqlModulePackage.SQL_LOAD_OPERATION__INPUT_RESOURCE:
        return basicSetInputResource(null, msgs);
      case SqlModulePackage.SQL_LOAD_OPERATION__TABLES:
        return ((InternalEList<?>)getTables()).basicRemove(otherEnd, msgs);
      case SqlModulePackage.SQL_LOAD_OPERATION__TABLE_GROUP_DEFINITION:
        return basicSetTableGroupDefinition(null, msgs);
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
      case SqlModulePackage.SQL_LOAD_OPERATION__INPUT_RESOURCE:
        return getInputResource();
      case SqlModulePackage.SQL_LOAD_OPERATION__TABLES:
        return getTables();
      case SqlModulePackage.SQL_LOAD_OPERATION__TABLE_GROUP_DEFINITION:
        return getTableGroupDefinition();
      case SqlModulePackage.SQL_LOAD_OPERATION__DEFAULT_INPUT_RESOURCE_TYPE:
        return getDefaultInputResourceType();
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
      case SqlModulePackage.SQL_LOAD_OPERATION__INPUT_RESOURCE:
        setInputResource((ResourceDefinition)newValue);
        return;
      case SqlModulePackage.SQL_LOAD_OPERATION__TABLES:
        getTables().clear();
        getTables().addAll((Collection<? extends LoadTable>)newValue);
        return;
      case SqlModulePackage.SQL_LOAD_OPERATION__TABLE_GROUP_DEFINITION:
        setTableGroupDefinition((ResourceDefinition)newValue);
        return;
      case SqlModulePackage.SQL_LOAD_OPERATION__DEFAULT_INPUT_RESOURCE_TYPE:
        setDefaultInputResourceType((IOFileTypesEnum)newValue);
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
      case SqlModulePackage.SQL_LOAD_OPERATION__INPUT_RESOURCE:
        setInputResource((ResourceDefinition)null);
        return;
      case SqlModulePackage.SQL_LOAD_OPERATION__TABLES:
        getTables().clear();
        return;
      case SqlModulePackage.SQL_LOAD_OPERATION__TABLE_GROUP_DEFINITION:
        setTableGroupDefinition((ResourceDefinition)null);
        return;
      case SqlModulePackage.SQL_LOAD_OPERATION__DEFAULT_INPUT_RESOURCE_TYPE:
        unsetDefaultInputResourceType();
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
      case SqlModulePackage.SQL_LOAD_OPERATION__INPUT_RESOURCE:
        return inputResource != null;
      case SqlModulePackage.SQL_LOAD_OPERATION__TABLES:
        return tables != null && !tables.isEmpty();
      case SqlModulePackage.SQL_LOAD_OPERATION__TABLE_GROUP_DEFINITION:
        return tableGroupDefinition != null;
      case SqlModulePackage.SQL_LOAD_OPERATION__DEFAULT_INPUT_RESOURCE_TYPE:
        return isSetDefaultInputResourceType();
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
    result.append(" (defaultInputResourceType: ");
    if (defaultInputResourceTypeESet) result.append(defaultInputResourceType); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // SQLLoadOperationImpl
