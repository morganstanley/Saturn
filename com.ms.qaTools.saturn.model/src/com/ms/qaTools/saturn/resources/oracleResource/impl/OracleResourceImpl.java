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
package com.ms.qaTools.saturn.resources.oracleResource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.resources.oracleResource.OracleResource;
import com.ms.qaTools.saturn.resources.oracleResource.OracleResourcePackage;
import com.ms.qaTools.saturn.types.impl.DatabaseResourceDefinitionImpl;
import com.ms.qaTools.saturn.types.impl.NamedResourceDefinitionImpl;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Oracle Resource</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.resources.oracleResource.impl.OracleResourceImpl#getLogin <em>Login</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.oracleResource.impl.OracleResourceImpl#getPassword <em>Password</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.oracleResource.impl.OracleResourceImpl#getServer <em>Server</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.oracleResource.impl.OracleResourceImpl#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class OracleResourceImpl extends DatabaseResourceDefinitionImpl implements OracleResource
{
  /**
   * The cached value of the '{@link #getLogin() <em>Login</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getLogin()
   * @generated
   * @ordered
   */
  protected ComplexValue login;

  /**
   * The cached value of the '{@link #getPassword() <em>Password</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassword()
   * @generated
   * @ordered
   */
  protected ComplexValue password;

  /**
   * The cached value of the '{@link #getServer() <em>Server</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getServer()
   * @generated
   * @ordered
   */
  protected ComplexValue server;

  /**
   * The cached value of the '{@link #getSchema() <em>Schema</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getSchema()
   * @generated
   * @ordered
   */
  protected ComplexValue schema;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected OracleResourceImpl()
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
    return OracleResourcePackage.Literals.ORACLE_RESOURCE;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getLogin()
  {
    return login;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLogin(ComplexValue newLogin, NotificationChain msgs)
  {
    ComplexValue oldLogin = login;
    login = newLogin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OracleResourcePackage.ORACLE_RESOURCE__LOGIN, oldLogin, newLogin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setLogin(ComplexValue newLogin)
  {
    if (newLogin != login)
    {
      NotificationChain msgs = null;
      if (login != null)
        msgs = ((InternalEObject)login).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OracleResourcePackage.ORACLE_RESOURCE__LOGIN, null, msgs);
      if (newLogin != null)
        msgs = ((InternalEObject)newLogin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OracleResourcePackage.ORACLE_RESOURCE__LOGIN, null, msgs);
      msgs = basicSetLogin(newLogin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OracleResourcePackage.ORACLE_RESOURCE__LOGIN, newLogin, newLogin));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getPassword()
  {
    return password;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPassword(ComplexValue newPassword, NotificationChain msgs)
  {
    ComplexValue oldPassword = password;
    password = newPassword;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OracleResourcePackage.ORACLE_RESOURCE__PASSWORD, oldPassword, newPassword);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setPassword(ComplexValue newPassword)
  {
    if (newPassword != password)
    {
      NotificationChain msgs = null;
      if (password != null)
        msgs = ((InternalEObject)password).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OracleResourcePackage.ORACLE_RESOURCE__PASSWORD, null, msgs);
      if (newPassword != null)
        msgs = ((InternalEObject)newPassword).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OracleResourcePackage.ORACLE_RESOURCE__PASSWORD, null, msgs);
      msgs = basicSetPassword(newPassword, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OracleResourcePackage.ORACLE_RESOURCE__PASSWORD, newPassword, newPassword));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getServer()
  {
    return server;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetServer(ComplexValue newServer, NotificationChain msgs)
  {
    ComplexValue oldServer = server;
    server = newServer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OracleResourcePackage.ORACLE_RESOURCE__SERVER, oldServer, newServer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setServer(ComplexValue newServer)
  {
    if (newServer != server)
    {
      NotificationChain msgs = null;
      if (server != null)
        msgs = ((InternalEObject)server).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OracleResourcePackage.ORACLE_RESOURCE__SERVER, null, msgs);
      if (newServer != null)
        msgs = ((InternalEObject)newServer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OracleResourcePackage.ORACLE_RESOURCE__SERVER, null, msgs);
      msgs = basicSetServer(newServer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OracleResourcePackage.ORACLE_RESOURCE__SERVER, newServer, newServer));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getSchema()
  {
    return schema;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSchema(ComplexValue newSchema, NotificationChain msgs)
  {
    ComplexValue oldSchema = schema;
    schema = newSchema;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OracleResourcePackage.ORACLE_RESOURCE__SCHEMA, oldSchema, newSchema);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSchema(ComplexValue newSchema)
  {
    if (newSchema != schema)
    {
      NotificationChain msgs = null;
      if (schema != null)
        msgs = ((InternalEObject)schema).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OracleResourcePackage.ORACLE_RESOURCE__SCHEMA, null, msgs);
      if (newSchema != null)
        msgs = ((InternalEObject)newSchema).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OracleResourcePackage.ORACLE_RESOURCE__SCHEMA, null, msgs);
      msgs = basicSetSchema(newSchema, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OracleResourcePackage.ORACLE_RESOURCE__SCHEMA, newSchema, newSchema));
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
      case OracleResourcePackage.ORACLE_RESOURCE__LOGIN:
        return basicSetLogin(null, msgs);
      case OracleResourcePackage.ORACLE_RESOURCE__PASSWORD:
        return basicSetPassword(null, msgs);
      case OracleResourcePackage.ORACLE_RESOURCE__SERVER:
        return basicSetServer(null, msgs);
      case OracleResourcePackage.ORACLE_RESOURCE__SCHEMA:
        return basicSetSchema(null, msgs);
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
      case OracleResourcePackage.ORACLE_RESOURCE__LOGIN:
        return getLogin();
      case OracleResourcePackage.ORACLE_RESOURCE__PASSWORD:
        return getPassword();
      case OracleResourcePackage.ORACLE_RESOURCE__SERVER:
        return getServer();
      case OracleResourcePackage.ORACLE_RESOURCE__SCHEMA:
        return getSchema();
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
      case OracleResourcePackage.ORACLE_RESOURCE__LOGIN:
        setLogin((ComplexValue)newValue);
        return;
      case OracleResourcePackage.ORACLE_RESOURCE__PASSWORD:
        setPassword((ComplexValue)newValue);
        return;
      case OracleResourcePackage.ORACLE_RESOURCE__SERVER:
        setServer((ComplexValue)newValue);
        return;
      case OracleResourcePackage.ORACLE_RESOURCE__SCHEMA:
        setSchema((ComplexValue)newValue);
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
      case OracleResourcePackage.ORACLE_RESOURCE__LOGIN:
        setLogin((ComplexValue)null);
        return;
      case OracleResourcePackage.ORACLE_RESOURCE__PASSWORD:
        setPassword((ComplexValue)null);
        return;
      case OracleResourcePackage.ORACLE_RESOURCE__SERVER:
        setServer((ComplexValue)null);
        return;
      case OracleResourcePackage.ORACLE_RESOURCE__SCHEMA:
        setSchema((ComplexValue)null);
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
      case OracleResourcePackage.ORACLE_RESOURCE__LOGIN:
        return login != null;
      case OracleResourcePackage.ORACLE_RESOURCE__PASSWORD:
        return password != null;
      case OracleResourcePackage.ORACLE_RESOURCE__SERVER:
        return server != null;
      case OracleResourcePackage.ORACLE_RESOURCE__SCHEMA:
        return schema != null;
    }
    return super.eIsSet(featureID);
  }

} // OracleResourceImpl
