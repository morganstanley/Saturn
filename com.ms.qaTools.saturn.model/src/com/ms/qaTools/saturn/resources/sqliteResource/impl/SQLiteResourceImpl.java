package com.ms.qaTools.saturn.resources.sqliteResource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.resources.sqliteResource.AbstractDatabase;
import com.ms.qaTools.saturn.resources.sqliteResource.SQLiteResource;
import com.ms.qaTools.saturn.resources.sqliteResource.SqliteResourcePackage;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.types.impl.DatabaseResourceDefinitionImpl;
import com.ms.qaTools.saturn.types.impl.DeviceResourceDefinitionImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>SQ Lite Resource</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.resources.sqliteResource.impl.SQLiteResourceImpl#getDatabase <em>Database</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.sqliteResource.impl.SQLiteResourceImpl#getDDLResource <em>DDL Resource
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class SQLiteResourceImpl extends DatabaseResourceDefinitionImpl implements SQLiteResource
{
  /**
   * The cached value of the '{@link #getDatabase() <em>Database</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatabase()
   * @generated
   * @ordered
   */
  protected AbstractDatabase        database;

  /**
   * The cached value of the '{@link #getDDLResource() <em>DDL Resource</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDDLResource()
   * @generated
   * @ordered
   */
  protected NamedResourceDefinition dDLResource;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected SQLiteResourceImpl()
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
    return SqliteResourcePackage.Literals.SQ_LITE_RESOURCE;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AbstractDatabase getDatabase()
  {
    return database;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDatabase(AbstractDatabase newDatabase, NotificationChain msgs)
  {
    AbstractDatabase oldDatabase = database;
    database = newDatabase;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteResourcePackage.SQ_LITE_RESOURCE__DATABASE, oldDatabase, newDatabase);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDatabase(AbstractDatabase newDatabase)
  {
    if (newDatabase != database)
    {
      NotificationChain msgs = null;
      if (database != null)
        msgs = ((InternalEObject)database).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteResourcePackage.SQ_LITE_RESOURCE__DATABASE, null, msgs);
      if (newDatabase != null)
        msgs = ((InternalEObject)newDatabase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteResourcePackage.SQ_LITE_RESOURCE__DATABASE, null, msgs);
      msgs = basicSetDatabase(newDatabase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteResourcePackage.SQ_LITE_RESOURCE__DATABASE, newDatabase, newDatabase));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NamedResourceDefinition getDDLResource()
  {
    return dDLResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDDLResource(NamedResourceDefinition newDDLResource, NotificationChain msgs)
  {
    NamedResourceDefinition oldDDLResource = dDLResource;
    dDLResource = newDDLResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqliteResourcePackage.SQ_LITE_RESOURCE__DDL_RESOURCE, oldDDLResource, newDDLResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDDLResource(NamedResourceDefinition newDDLResource)
  {
    if (newDDLResource != dDLResource)
    {
      NotificationChain msgs = null;
      if (dDLResource != null)
        msgs = ((InternalEObject)dDLResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqliteResourcePackage.SQ_LITE_RESOURCE__DDL_RESOURCE, null, msgs);
      if (newDDLResource != null)
        msgs = ((InternalEObject)newDDLResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqliteResourcePackage.SQ_LITE_RESOURCE__DDL_RESOURCE, null, msgs);
      msgs = basicSetDDLResource(newDDLResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqliteResourcePackage.SQ_LITE_RESOURCE__DDL_RESOURCE, newDDLResource, newDDLResource));
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
      case SqliteResourcePackage.SQ_LITE_RESOURCE__DATABASE:
        return basicSetDatabase(null, msgs);
      case SqliteResourcePackage.SQ_LITE_RESOURCE__DDL_RESOURCE:
        return basicSetDDLResource(null, msgs);
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
      case SqliteResourcePackage.SQ_LITE_RESOURCE__DATABASE:
        return getDatabase();
      case SqliteResourcePackage.SQ_LITE_RESOURCE__DDL_RESOURCE:
        return getDDLResource();
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
      case SqliteResourcePackage.SQ_LITE_RESOURCE__DATABASE:
        setDatabase((AbstractDatabase)newValue);
        return;
      case SqliteResourcePackage.SQ_LITE_RESOURCE__DDL_RESOURCE:
        setDDLResource((NamedResourceDefinition)newValue);
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
      case SqliteResourcePackage.SQ_LITE_RESOURCE__DATABASE:
        setDatabase((AbstractDatabase)null);
        return;
      case SqliteResourcePackage.SQ_LITE_RESOURCE__DDL_RESOURCE:
        setDDLResource((NamedResourceDefinition)null);
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
      case SqliteResourcePackage.SQ_LITE_RESOURCE__DATABASE:
        return database != null;
      case SqliteResourcePackage.SQ_LITE_RESOURCE__DDL_RESOURCE:
        return dDLResource != null;
    }
    return super.eIsSet(featureID);
  }

} // SQLiteResourceImpl
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
