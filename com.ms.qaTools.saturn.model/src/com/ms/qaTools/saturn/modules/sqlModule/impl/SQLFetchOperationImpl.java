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

import com.ms.qaTools.saturn.modules.sqlModule.FetchQuery;
import com.ms.qaTools.saturn.modules.sqlModule.IOFileTypesEnum;
import com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation;
import com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage;
import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>SQL Fetch Operation</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLFetchOperationImpl#getOutputResource <em>Output Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLFetchOperationImpl#getParameterResource <em>Parameter Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLFetchOperationImpl#getQueries <em>Queries</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLFetchOperationImpl#getTableGroupDefinition <em>Table Group Definition</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLFetchOperationImpl#getDefaultOutputResourceType <em>Default Output Resource Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SQLFetchOperationImpl extends AbstractSQLOperationImpl implements SQLFetchOperation
{
  /**
   * The cached value of the '{@link #getOutputResource() <em>Output Resource</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getOutputResource()
   * @generated
   * @ordered
   */
  protected ResourceDefinition           outputResource;

  /**
   * The cached value of the '{@link #getParameterResource() <em>Parameter Resource</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getParameterResource()
   * @generated
   * @ordered
   */
  protected ResourceDefinition           parameterResource;

  /**
   * The cached value of the '{@link #getQueries() <em>Queries</em>}' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getQueries()
   * @generated
   * @ordered
   */
  protected EList<FetchQuery>            queries;

  /**
   * The cached value of the '{@link #getTableGroupDefinition() <em>Table Group Definition</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getTableGroupDefinition()
   * @generated
   * @ordered
   */
  protected ResourceDefinition           tableGroupDefinition;

  /**
   * The default value of the '{@link #getDefaultOutputResourceType() <em>Default Output Resource Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getDefaultOutputResourceType()
   * @generated
   * @ordered
   */
  protected static final IOFileTypesEnum DEFAULT_OUTPUT_RESOURCE_TYPE_EDEFAULT = IOFileTypesEnum.CSV;

  /**
   * The cached value of the '{@link #getDefaultOutputResourceType() <em>Default Output Resource Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getDefaultOutputResourceType()
   * @generated
   * @ordered
   */
  protected IOFileTypesEnum              defaultOutputResourceType             = DEFAULT_OUTPUT_RESOURCE_TYPE_EDEFAULT;

  /**
   * This is true if the Default Output Resource Type attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  protected boolean                      defaultOutputResourceTypeESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected SQLFetchOperationImpl()
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
    return SqlModulePackage.Literals.SQL_FETCH_OPERATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getOutputResource()
  {
    return outputResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutputResource(ResourceDefinition newOutputResource, NotificationChain msgs)
  {
    ResourceDefinition oldOutputResource = outputResource;
    outputResource = newOutputResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlModulePackage.SQL_FETCH_OPERATION__OUTPUT_RESOURCE, oldOutputResource, newOutputResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOutputResource(ResourceDefinition newOutputResource)
  {
    if (newOutputResource != outputResource)
    {
      NotificationChain msgs = null;
      if (outputResource != null)
        msgs = ((InternalEObject)outputResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.SQL_FETCH_OPERATION__OUTPUT_RESOURCE, null, msgs);
      if (newOutputResource != null)
        msgs = ((InternalEObject)newOutputResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.SQL_FETCH_OPERATION__OUTPUT_RESOURCE, null, msgs);
      msgs = basicSetOutputResource(newOutputResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlModulePackage.SQL_FETCH_OPERATION__OUTPUT_RESOURCE, newOutputResource, newOutputResource));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getParameterResource()
  {
    return parameterResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameterResource(ResourceDefinition newParameterResource, NotificationChain msgs)
  {
    ResourceDefinition oldParameterResource = parameterResource;
    parameterResource = newParameterResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlModulePackage.SQL_FETCH_OPERATION__PARAMETER_RESOURCE, oldParameterResource, newParameterResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setParameterResource(ResourceDefinition newParameterResource)
  {
    if (newParameterResource != parameterResource)
    {
      NotificationChain msgs = null;
      if (parameterResource != null)
        msgs = ((InternalEObject)parameterResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.SQL_FETCH_OPERATION__PARAMETER_RESOURCE, null, msgs);
      if (newParameterResource != null)
        msgs = ((InternalEObject)newParameterResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.SQL_FETCH_OPERATION__PARAMETER_RESOURCE, null, msgs);
      msgs = basicSetParameterResource(newParameterResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlModulePackage.SQL_FETCH_OPERATION__PARAMETER_RESOURCE, newParameterResource, newParameterResource));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<FetchQuery> getQueries()
  {
    if (queries == null)
    {
      queries = new EObjectContainmentEList<FetchQuery>(FetchQuery.class, this, SqlModulePackage.SQL_FETCH_OPERATION__QUERIES);
    }
    return queries;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlModulePackage.SQL_FETCH_OPERATION__TABLE_GROUP_DEFINITION, oldTableGroupDefinition, newTableGroupDefinition);
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
        msgs = ((InternalEObject)tableGroupDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.SQL_FETCH_OPERATION__TABLE_GROUP_DEFINITION, null, msgs);
      if (newTableGroupDefinition != null)
        msgs = ((InternalEObject)newTableGroupDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.SQL_FETCH_OPERATION__TABLE_GROUP_DEFINITION, null, msgs);
      msgs = basicSetTableGroupDefinition(newTableGroupDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlModulePackage.SQL_FETCH_OPERATION__TABLE_GROUP_DEFINITION, newTableGroupDefinition, newTableGroupDefinition));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public IOFileTypesEnum getDefaultOutputResourceType()
  {
    return defaultOutputResourceType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultOutputResourceType(IOFileTypesEnum newDefaultOutputResourceType)
  {
    IOFileTypesEnum oldDefaultOutputResourceType = defaultOutputResourceType;
    defaultOutputResourceType = newDefaultOutputResourceType == null ? DEFAULT_OUTPUT_RESOURCE_TYPE_EDEFAULT : newDefaultOutputResourceType;
    boolean oldDefaultOutputResourceTypeESet = defaultOutputResourceTypeESet;
    defaultOutputResourceTypeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlModulePackage.SQL_FETCH_OPERATION__DEFAULT_OUTPUT_RESOURCE_TYPE, oldDefaultOutputResourceType, defaultOutputResourceType, !oldDefaultOutputResourceTypeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetDefaultOutputResourceType()
  {
    IOFileTypesEnum oldDefaultOutputResourceType = defaultOutputResourceType;
    boolean oldDefaultOutputResourceTypeESet = defaultOutputResourceTypeESet;
    defaultOutputResourceType = DEFAULT_OUTPUT_RESOURCE_TYPE_EDEFAULT;
    defaultOutputResourceTypeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SqlModulePackage.SQL_FETCH_OPERATION__DEFAULT_OUTPUT_RESOURCE_TYPE, oldDefaultOutputResourceType, DEFAULT_OUTPUT_RESOURCE_TYPE_EDEFAULT, oldDefaultOutputResourceTypeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetDefaultOutputResourceType()
  {
    return defaultOutputResourceTypeESet;
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
      case SqlModulePackage.SQL_FETCH_OPERATION__OUTPUT_RESOURCE:
        return basicSetOutputResource(null, msgs);
      case SqlModulePackage.SQL_FETCH_OPERATION__PARAMETER_RESOURCE:
        return basicSetParameterResource(null, msgs);
      case SqlModulePackage.SQL_FETCH_OPERATION__QUERIES:
        return ((InternalEList<?>)getQueries()).basicRemove(otherEnd, msgs);
      case SqlModulePackage.SQL_FETCH_OPERATION__TABLE_GROUP_DEFINITION:
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
      case SqlModulePackage.SQL_FETCH_OPERATION__OUTPUT_RESOURCE:
        return getOutputResource();
      case SqlModulePackage.SQL_FETCH_OPERATION__PARAMETER_RESOURCE:
        return getParameterResource();
      case SqlModulePackage.SQL_FETCH_OPERATION__QUERIES:
        return getQueries();
      case SqlModulePackage.SQL_FETCH_OPERATION__TABLE_GROUP_DEFINITION:
        return getTableGroupDefinition();
      case SqlModulePackage.SQL_FETCH_OPERATION__DEFAULT_OUTPUT_RESOURCE_TYPE:
        return getDefaultOutputResourceType();
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
      case SqlModulePackage.SQL_FETCH_OPERATION__OUTPUT_RESOURCE:
        setOutputResource((ResourceDefinition)newValue);
        return;
      case SqlModulePackage.SQL_FETCH_OPERATION__PARAMETER_RESOURCE:
        setParameterResource((ResourceDefinition)newValue);
        return;
      case SqlModulePackage.SQL_FETCH_OPERATION__QUERIES:
        getQueries().clear();
        getQueries().addAll((Collection<? extends FetchQuery>)newValue);
        return;
      case SqlModulePackage.SQL_FETCH_OPERATION__TABLE_GROUP_DEFINITION:
        setTableGroupDefinition((ResourceDefinition)newValue);
        return;
      case SqlModulePackage.SQL_FETCH_OPERATION__DEFAULT_OUTPUT_RESOURCE_TYPE:
        setDefaultOutputResourceType((IOFileTypesEnum)newValue);
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
      case SqlModulePackage.SQL_FETCH_OPERATION__OUTPUT_RESOURCE:
        setOutputResource((ResourceDefinition)null);
        return;
      case SqlModulePackage.SQL_FETCH_OPERATION__PARAMETER_RESOURCE:
        setParameterResource((ResourceDefinition)null);
        return;
      case SqlModulePackage.SQL_FETCH_OPERATION__QUERIES:
        getQueries().clear();
        return;
      case SqlModulePackage.SQL_FETCH_OPERATION__TABLE_GROUP_DEFINITION:
        setTableGroupDefinition((ResourceDefinition)null);
        return;
      case SqlModulePackage.SQL_FETCH_OPERATION__DEFAULT_OUTPUT_RESOURCE_TYPE:
        unsetDefaultOutputResourceType();
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
      case SqlModulePackage.SQL_FETCH_OPERATION__OUTPUT_RESOURCE:
        return outputResource != null;
      case SqlModulePackage.SQL_FETCH_OPERATION__PARAMETER_RESOURCE:
        return parameterResource != null;
      case SqlModulePackage.SQL_FETCH_OPERATION__QUERIES:
        return queries != null && !queries.isEmpty();
      case SqlModulePackage.SQL_FETCH_OPERATION__TABLE_GROUP_DEFINITION:
        return tableGroupDefinition != null;
      case SqlModulePackage.SQL_FETCH_OPERATION__DEFAULT_OUTPUT_RESOURCE_TYPE:
        return isSetDefaultOutputResourceType();
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
    result.append(" (defaultOutputResourceType: ");
    if (defaultOutputResourceTypeESet) result.append(defaultOutputResourceType); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // SQLFetchOperationImpl
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
