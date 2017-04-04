package com.ms.qaTools.saturn.modules.sqlModule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.ms.qaTools.saturn.modules.sqlModule.AbstractSQLOperation;
import com.ms.qaTools.saturn.modules.sqlModule.SQLConfiguration;
import com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage;
import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>SQL Configuration</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLConfigurationImpl#getDatabaseResource <em>Database
 * Resource</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLConfigurationImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class SQLConfigurationImpl extends EObjectImpl implements SQLConfiguration
{
  /**
   * The cached value of the '{@link #getDatabaseResource() <em>Database Resource</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDatabaseResource()
   * @generated
   * @ordered
   */
  protected ResourceDefinition   databaseResource;

  /**
   * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected AbstractSQLOperation operation;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected SQLConfigurationImpl()
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
    return SqlModulePackage.Literals.SQL_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getDatabaseResource()
  {
    return databaseResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDatabaseResource(ResourceDefinition newDatabaseResource, NotificationChain msgs)
  {
    ResourceDefinition oldDatabaseResource = databaseResource;
    databaseResource = newDatabaseResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlModulePackage.SQL_CONFIGURATION__DATABASE_RESOURCE, oldDatabaseResource, newDatabaseResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDatabaseResource(ResourceDefinition newDatabaseResource)
  {
    if (newDatabaseResource != databaseResource)
    {
      NotificationChain msgs = null;
      if (databaseResource != null)
        msgs = ((InternalEObject)databaseResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.SQL_CONFIGURATION__DATABASE_RESOURCE, null, msgs);
      if (newDatabaseResource != null)
        msgs = ((InternalEObject)newDatabaseResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.SQL_CONFIGURATION__DATABASE_RESOURCE, null, msgs);
      msgs = basicSetDatabaseResource(newDatabaseResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlModulePackage.SQL_CONFIGURATION__DATABASE_RESOURCE, newDatabaseResource, newDatabaseResource));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AbstractSQLOperation getOperation()
  {
    return operation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperation(AbstractSQLOperation newOperation, NotificationChain msgs)
  {
    AbstractSQLOperation oldOperation = operation;
    operation = newOperation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlModulePackage.SQL_CONFIGURATION__OPERATION, oldOperation, newOperation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOperation(AbstractSQLOperation newOperation)
  {
    if (newOperation != operation)
    {
      NotificationChain msgs = null;
      if (operation != null)
        msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.SQL_CONFIGURATION__OPERATION, null, msgs);
      if (newOperation != null)
        msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.SQL_CONFIGURATION__OPERATION, null, msgs);
      msgs = basicSetOperation(newOperation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlModulePackage.SQL_CONFIGURATION__OPERATION, newOperation, newOperation));
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
      case SqlModulePackage.SQL_CONFIGURATION__DATABASE_RESOURCE:
        return basicSetDatabaseResource(null, msgs);
      case SqlModulePackage.SQL_CONFIGURATION__OPERATION:
        return basicSetOperation(null, msgs);
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
      case SqlModulePackage.SQL_CONFIGURATION__DATABASE_RESOURCE:
        return getDatabaseResource();
      case SqlModulePackage.SQL_CONFIGURATION__OPERATION:
        return getOperation();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SqlModulePackage.SQL_CONFIGURATION__DATABASE_RESOURCE:
        setDatabaseResource((ResourceDefinition)newValue);
        return;
      case SqlModulePackage.SQL_CONFIGURATION__OPERATION:
        setOperation((AbstractSQLOperation)newValue);
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
      case SqlModulePackage.SQL_CONFIGURATION__DATABASE_RESOURCE:
        setDatabaseResource((ResourceDefinition)null);
        return;
      case SqlModulePackage.SQL_CONFIGURATION__OPERATION:
        setOperation((AbstractSQLOperation)null);
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
      case SqlModulePackage.SQL_CONFIGURATION__DATABASE_RESOURCE:
        return databaseResource != null;
      case SqlModulePackage.SQL_CONFIGURATION__OPERATION:
        return operation != null;
    }
    return super.eIsSet(featureID);
  }

} // SQLConfigurationImpl
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
