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
import com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition;
import com.ms.qaTools.saturn.modules.sqlModule.SQLCallOperation;
import com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage;
import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>SQL Call Operation</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLCallOperationImpl#getOutputResource <em>Output Resource
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLCallOperationImpl#getParameterResource <em>Parameter
 * Resource</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLCallOperationImpl#getProcedureCalls <em>Procedure Calls
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLCallOperationImpl#getDefaultOutputResourceType <em>Default
 * Output Resource Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class SQLCallOperationImpl extends AbstractSQLOperationImpl implements SQLCallOperation
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
   * The cached value of the '{@link #getProcedureCalls() <em>Procedure Calls</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getProcedureCalls()
   * @generated
   * @ordered
   */
  protected EList<ProcCallDefinition>    procedureCalls;

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
  protected SQLCallOperationImpl()
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
    return SqlModulePackage.Literals.SQL_CALL_OPERATION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlModulePackage.SQL_CALL_OPERATION__OUTPUT_RESOURCE, oldOutputResource, newOutputResource);
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
        msgs = ((InternalEObject)outputResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.SQL_CALL_OPERATION__OUTPUT_RESOURCE, null, msgs);
      if (newOutputResource != null)
        msgs = ((InternalEObject)newOutputResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.SQL_CALL_OPERATION__OUTPUT_RESOURCE, null, msgs);
      msgs = basicSetOutputResource(newOutputResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlModulePackage.SQL_CALL_OPERATION__OUTPUT_RESOURCE, newOutputResource, newOutputResource));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlModulePackage.SQL_CALL_OPERATION__PARAMETER_RESOURCE, oldParameterResource, newParameterResource);
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
        msgs = ((InternalEObject)parameterResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.SQL_CALL_OPERATION__PARAMETER_RESOURCE, null, msgs);
      if (newParameterResource != null)
        msgs = ((InternalEObject)newParameterResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.SQL_CALL_OPERATION__PARAMETER_RESOURCE, null, msgs);
      msgs = basicSetParameterResource(newParameterResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlModulePackage.SQL_CALL_OPERATION__PARAMETER_RESOURCE, newParameterResource, newParameterResource));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<ProcCallDefinition> getProcedureCalls()
  {
    if (procedureCalls == null)
    {
      procedureCalls = new EObjectContainmentEList<ProcCallDefinition>(ProcCallDefinition.class, this, SqlModulePackage.SQL_CALL_OPERATION__PROCEDURE_CALLS);
    }
    return procedureCalls;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SqlModulePackage.SQL_CALL_OPERATION__DEFAULT_OUTPUT_RESOURCE_TYPE, oldDefaultOutputResourceType, defaultOutputResourceType, !oldDefaultOutputResourceTypeESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, SqlModulePackage.SQL_CALL_OPERATION__DEFAULT_OUTPUT_RESOURCE_TYPE, oldDefaultOutputResourceType, DEFAULT_OUTPUT_RESOURCE_TYPE_EDEFAULT, oldDefaultOutputResourceTypeESet));
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
      case SqlModulePackage.SQL_CALL_OPERATION__OUTPUT_RESOURCE:
        return basicSetOutputResource(null, msgs);
      case SqlModulePackage.SQL_CALL_OPERATION__PARAMETER_RESOURCE:
        return basicSetParameterResource(null, msgs);
      case SqlModulePackage.SQL_CALL_OPERATION__PROCEDURE_CALLS:
        return ((InternalEList<?>)getProcedureCalls()).basicRemove(otherEnd, msgs);
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
      case SqlModulePackage.SQL_CALL_OPERATION__OUTPUT_RESOURCE:
        return getOutputResource();
      case SqlModulePackage.SQL_CALL_OPERATION__PARAMETER_RESOURCE:
        return getParameterResource();
      case SqlModulePackage.SQL_CALL_OPERATION__PROCEDURE_CALLS:
        return getProcedureCalls();
      case SqlModulePackage.SQL_CALL_OPERATION__DEFAULT_OUTPUT_RESOURCE_TYPE:
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
      case SqlModulePackage.SQL_CALL_OPERATION__OUTPUT_RESOURCE:
        setOutputResource((ResourceDefinition)newValue);
        return;
      case SqlModulePackage.SQL_CALL_OPERATION__PARAMETER_RESOURCE:
        setParameterResource((ResourceDefinition)newValue);
        return;
      case SqlModulePackage.SQL_CALL_OPERATION__PROCEDURE_CALLS:
        getProcedureCalls().clear();
        getProcedureCalls().addAll((Collection<? extends ProcCallDefinition>)newValue);
        return;
      case SqlModulePackage.SQL_CALL_OPERATION__DEFAULT_OUTPUT_RESOURCE_TYPE:
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
      case SqlModulePackage.SQL_CALL_OPERATION__OUTPUT_RESOURCE:
        setOutputResource((ResourceDefinition)null);
        return;
      case SqlModulePackage.SQL_CALL_OPERATION__PARAMETER_RESOURCE:
        setParameterResource((ResourceDefinition)null);
        return;
      case SqlModulePackage.SQL_CALL_OPERATION__PROCEDURE_CALLS:
        getProcedureCalls().clear();
        return;
      case SqlModulePackage.SQL_CALL_OPERATION__DEFAULT_OUTPUT_RESOURCE_TYPE:
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
      case SqlModulePackage.SQL_CALL_OPERATION__OUTPUT_RESOURCE:
        return outputResource != null;
      case SqlModulePackage.SQL_CALL_OPERATION__PARAMETER_RESOURCE:
        return parameterResource != null;
      case SqlModulePackage.SQL_CALL_OPERATION__PROCEDURE_CALLS:
        return procedureCalls != null && !procedureCalls.isEmpty();
      case SqlModulePackage.SQL_CALL_OPERATION__DEFAULT_OUTPUT_RESOURCE_TYPE:
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

} // SQLCallOperationImpl
