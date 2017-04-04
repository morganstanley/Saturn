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

import com.ms.qaTools.saturn.modules.sqlModule.ClearTable;
import com.ms.qaTools.saturn.modules.sqlModule.SQLClearOperation;
import com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage;
import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>SQL Clear Operation</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLClearOperationImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLClearOperationImpl#getTableGroupDefinition <em>Table Group Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SQLClearOperationImpl extends AbstractSQLOperationImpl implements SQLClearOperation
{
  /**
   * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTables()
   * @generated
   * @ordered
   */
  protected EList<ClearTable>  tables;

  /**
   * The cached value of the '{@link #getTableGroupDefinition() <em>Table Group Definition</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getTableGroupDefinition()
   * @generated
   * @ordered
   */
  protected ResourceDefinition tableGroupDefinition;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected SQLClearOperationImpl()
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
    return SqlModulePackage.Literals.SQL_CLEAR_OPERATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<ClearTable> getTables()
  {
    if (tables == null)
    {
      tables = new EObjectContainmentEList<ClearTable>(ClearTable.class, this, SqlModulePackage.SQL_CLEAR_OPERATION__TABLES);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlModulePackage.SQL_CLEAR_OPERATION__TABLE_GROUP_DEFINITION, oldTableGroupDefinition, newTableGroupDefinition);
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
        msgs = ((InternalEObject)tableGroupDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.SQL_CLEAR_OPERATION__TABLE_GROUP_DEFINITION, null, msgs);
      if (newTableGroupDefinition != null)
        msgs = ((InternalEObject)newTableGroupDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.SQL_CLEAR_OPERATION__TABLE_GROUP_DEFINITION, null, msgs);
      msgs = basicSetTableGroupDefinition(newTableGroupDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlModulePackage.SQL_CLEAR_OPERATION__TABLE_GROUP_DEFINITION, newTableGroupDefinition, newTableGroupDefinition));
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
      case SqlModulePackage.SQL_CLEAR_OPERATION__TABLES:
        return ((InternalEList<?>)getTables()).basicRemove(otherEnd, msgs);
      case SqlModulePackage.SQL_CLEAR_OPERATION__TABLE_GROUP_DEFINITION:
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
      case SqlModulePackage.SQL_CLEAR_OPERATION__TABLES:
        return getTables();
      case SqlModulePackage.SQL_CLEAR_OPERATION__TABLE_GROUP_DEFINITION:
        return getTableGroupDefinition();
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
      case SqlModulePackage.SQL_CLEAR_OPERATION__TABLES:
        getTables().clear();
        getTables().addAll((Collection<? extends ClearTable>)newValue);
        return;
      case SqlModulePackage.SQL_CLEAR_OPERATION__TABLE_GROUP_DEFINITION:
        setTableGroupDefinition((ResourceDefinition)newValue);
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
      case SqlModulePackage.SQL_CLEAR_OPERATION__TABLES:
        getTables().clear();
        return;
      case SqlModulePackage.SQL_CLEAR_OPERATION__TABLE_GROUP_DEFINITION:
        setTableGroupDefinition((ResourceDefinition)null);
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
      case SqlModulePackage.SQL_CLEAR_OPERATION__TABLES:
        return tables != null && !tables.isEmpty();
      case SqlModulePackage.SQL_CLEAR_OPERATION__TABLE_GROUP_DEFINITION:
        return tableGroupDefinition != null;
    }
    return super.eIsSet(featureID);
  }

} // SQLClearOperationImpl
