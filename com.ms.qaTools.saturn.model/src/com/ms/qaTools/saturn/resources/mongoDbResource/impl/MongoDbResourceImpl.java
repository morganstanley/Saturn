/**
 * COPYRIGHT NOTICE AND DISCLAIMER
 *  
 * Copyright © 2009, Contributor
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License, version 3 for more details.
 * You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
 * THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
 */
package com.ms.qaTools.saturn.resources.mongoDbResource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.resources.mongoDbResource.AuthentificationEnums;
import com.ms.qaTools.saturn.resources.mongoDbResource.MongoDbResource;
import com.ms.qaTools.saturn.resources.mongoDbResource.MongoDbResourcePackage;
import com.ms.qaTools.saturn.types.impl.DatabaseResourceDefinitionImpl;
import com.ms.qaTools.saturn.types.impl.NamedResourceDefinitionImpl;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Mongo Db Resource</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.resources.mongoDbResource.impl.MongoDbResourceImpl#getHost <em>Host</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.mongoDbResource.impl.MongoDbResourceImpl#getPort <em>Port</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.mongoDbResource.impl.MongoDbResourceImpl#getDatabase <em>Database</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.mongoDbResource.impl.MongoDbResourceImpl#getLogin <em>Login</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.mongoDbResource.impl.MongoDbResourceImpl#getPassword <em>Password</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.mongoDbResource.impl.MongoDbResourceImpl#getAuthentification <em>
 * Authentification</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.mongoDbResource.impl.MongoDbResourceImpl#getConnectTimeout <em>Connect
 * Timeout</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.mongoDbResource.impl.MongoDbResourceImpl#getSocketTimeout <em>Socket
 * Timeout</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MongoDbResourceImpl extends DatabaseResourceDefinitionImpl implements MongoDbResource
{
  /**
   * The cached value of the '{@link #getHost() <em>Host</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getHost()
   * @generated
   * @ordered
   */
  protected ComplexValue                       host;

  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected ComplexValue                       port;

  /**
   * The cached value of the '{@link #getDatabase() <em>Database</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatabase()
   * @generated
   * @ordered
   */
  protected ComplexValue                       database;

  /**
   * The cached value of the '{@link #getLogin() <em>Login</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getLogin()
   * @generated
   * @ordered
   */
  protected ComplexValue                       login;

  /**
   * The cached value of the '{@link #getPassword() <em>Password</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassword()
   * @generated
   * @ordered
   */
  protected ComplexValue                       password;

  /**
   * The default value of the '{@link #getAuthentification() <em>Authentification</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getAuthentification()
   * @generated
   * @ordered
   */
  protected static final AuthentificationEnums AUTHENTIFICATION_EDEFAULT = AuthentificationEnums.PASSWORD;

  /**
   * The cached value of the '{@link #getAuthentification() <em>Authentification</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getAuthentification()
   * @generated
   * @ordered
   */
  protected AuthentificationEnums              authentification          = AUTHENTIFICATION_EDEFAULT;

  /**
   * This is true if the Authentification attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                            authentificationESet;

  /**
   * The default value of the '{@link #getConnectTimeout() <em>Connect Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnectTimeout()
   * @generated
   * @ordered
   */
  protected static final int                   CONNECT_TIMEOUT_EDEFAULT  = 10000;

  /**
   * The cached value of the '{@link #getConnectTimeout() <em>Connect Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnectTimeout()
   * @generated
   * @ordered
   */
  protected int                                connectTimeout            = CONNECT_TIMEOUT_EDEFAULT;

  /**
   * This is true if the Connect Timeout attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                            connectTimeoutESet;

  /**
   * The default value of the '{@link #getSocketTimeout() <em>Socket Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSocketTimeout()
   * @generated
   * @ordered
   */
  protected static final int                   SOCKET_TIMEOUT_EDEFAULT   = 0;

  /**
   * The cached value of the '{@link #getSocketTimeout() <em>Socket Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSocketTimeout()
   * @generated
   * @ordered
   */
  protected int                                socketTimeout             = SOCKET_TIMEOUT_EDEFAULT;

  /**
   * This is true if the Socket Timeout attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                            socketTimeoutESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected MongoDbResourceImpl()
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
    return MongoDbResourcePackage.Literals.MONGO_DB_RESOURCE;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getHost()
  {
    return host;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHost(ComplexValue newHost, NotificationChain msgs)
  {
    ComplexValue oldHost = host;
    host = newHost;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MongoDbResourcePackage.MONGO_DB_RESOURCE__HOST, oldHost, newHost);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setHost(ComplexValue newHost)
  {
    if (newHost != host)
    {
      NotificationChain msgs = null;
      if (host != null)
        msgs = ((InternalEObject)host).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MongoDbResourcePackage.MONGO_DB_RESOURCE__HOST, null, msgs);
      if (newHost != null)
        msgs = ((InternalEObject)newHost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MongoDbResourcePackage.MONGO_DB_RESOURCE__HOST, null, msgs);
      msgs = basicSetHost(newHost, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MongoDbResourcePackage.MONGO_DB_RESOURCE__HOST, newHost, newHost));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getPort()
  {
    return port;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPort(ComplexValue newPort, NotificationChain msgs)
  {
    ComplexValue oldPort = port;
    port = newPort;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MongoDbResourcePackage.MONGO_DB_RESOURCE__PORT, oldPort, newPort);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setPort(ComplexValue newPort)
  {
    if (newPort != port)
    {
      NotificationChain msgs = null;
      if (port != null)
        msgs = ((InternalEObject)port).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MongoDbResourcePackage.MONGO_DB_RESOURCE__PORT, null, msgs);
      if (newPort != null)
        msgs = ((InternalEObject)newPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MongoDbResourcePackage.MONGO_DB_RESOURCE__PORT, null, msgs);
      msgs = basicSetPort(newPort, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MongoDbResourcePackage.MONGO_DB_RESOURCE__PORT, newPort, newPort));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getDatabase()
  {
    return database;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDatabase(ComplexValue newDatabase, NotificationChain msgs)
  {
    ComplexValue oldDatabase = database;
    database = newDatabase;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MongoDbResourcePackage.MONGO_DB_RESOURCE__DATABASE, oldDatabase, newDatabase);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDatabase(ComplexValue newDatabase)
  {
    if (newDatabase != database)
    {
      NotificationChain msgs = null;
      if (database != null)
        msgs = ((InternalEObject)database).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MongoDbResourcePackage.MONGO_DB_RESOURCE__DATABASE, null, msgs);
      if (newDatabase != null)
        msgs = ((InternalEObject)newDatabase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MongoDbResourcePackage.MONGO_DB_RESOURCE__DATABASE, null, msgs);
      msgs = basicSetDatabase(newDatabase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MongoDbResourcePackage.MONGO_DB_RESOURCE__DATABASE, newDatabase, newDatabase));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MongoDbResourcePackage.MONGO_DB_RESOURCE__LOGIN, oldLogin, newLogin);
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
        msgs = ((InternalEObject)login).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MongoDbResourcePackage.MONGO_DB_RESOURCE__LOGIN, null, msgs);
      if (newLogin != null)
        msgs = ((InternalEObject)newLogin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MongoDbResourcePackage.MONGO_DB_RESOURCE__LOGIN, null, msgs);
      msgs = basicSetLogin(newLogin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MongoDbResourcePackage.MONGO_DB_RESOURCE__LOGIN, newLogin, newLogin));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MongoDbResourcePackage.MONGO_DB_RESOURCE__PASSWORD, oldPassword, newPassword);
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
        msgs = ((InternalEObject)password).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MongoDbResourcePackage.MONGO_DB_RESOURCE__PASSWORD, null, msgs);
      if (newPassword != null)
        msgs = ((InternalEObject)newPassword).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MongoDbResourcePackage.MONGO_DB_RESOURCE__PASSWORD, null, msgs);
      msgs = basicSetPassword(newPassword, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MongoDbResourcePackage.MONGO_DB_RESOURCE__PASSWORD, newPassword, newPassword));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AuthentificationEnums getAuthentification()
  {
    return authentification;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setAuthentification(AuthentificationEnums newAuthentification)
  {
    AuthentificationEnums oldAuthentification = authentification;
    authentification = newAuthentification == null ? AUTHENTIFICATION_EDEFAULT : newAuthentification;
    boolean oldAuthentificationESet = authentificationESet;
    authentificationESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MongoDbResourcePackage.MONGO_DB_RESOURCE__AUTHENTIFICATION, oldAuthentification, authentification, !oldAuthentificationESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetAuthentification()
  {
    AuthentificationEnums oldAuthentification = authentification;
    boolean oldAuthentificationESet = authentificationESet;
    authentification = AUTHENTIFICATION_EDEFAULT;
    authentificationESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MongoDbResourcePackage.MONGO_DB_RESOURCE__AUTHENTIFICATION, oldAuthentification, AUTHENTIFICATION_EDEFAULT, oldAuthentificationESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetAuthentification()
  {
    return authentificationESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public int getConnectTimeout()
  {
    return connectTimeout;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setConnectTimeout(int newConnectTimeout)
  {
    int oldConnectTimeout = connectTimeout;
    connectTimeout = newConnectTimeout;
    boolean oldConnectTimeoutESet = connectTimeoutESet;
    connectTimeoutESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MongoDbResourcePackage.MONGO_DB_RESOURCE__CONNECT_TIMEOUT, oldConnectTimeout, connectTimeout, !oldConnectTimeoutESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetConnectTimeout()
  {
    int oldConnectTimeout = connectTimeout;
    boolean oldConnectTimeoutESet = connectTimeoutESet;
    connectTimeout = CONNECT_TIMEOUT_EDEFAULT;
    connectTimeoutESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MongoDbResourcePackage.MONGO_DB_RESOURCE__CONNECT_TIMEOUT, oldConnectTimeout, CONNECT_TIMEOUT_EDEFAULT, oldConnectTimeoutESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetConnectTimeout()
  {
    return connectTimeoutESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public int getSocketTimeout()
  {
    return socketTimeout;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSocketTimeout(int newSocketTimeout)
  {
    int oldSocketTimeout = socketTimeout;
    socketTimeout = newSocketTimeout;
    boolean oldSocketTimeoutESet = socketTimeoutESet;
    socketTimeoutESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MongoDbResourcePackage.MONGO_DB_RESOURCE__SOCKET_TIMEOUT, oldSocketTimeout, socketTimeout, !oldSocketTimeoutESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetSocketTimeout()
  {
    int oldSocketTimeout = socketTimeout;
    boolean oldSocketTimeoutESet = socketTimeoutESet;
    socketTimeout = SOCKET_TIMEOUT_EDEFAULT;
    socketTimeoutESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MongoDbResourcePackage.MONGO_DB_RESOURCE__SOCKET_TIMEOUT, oldSocketTimeout, SOCKET_TIMEOUT_EDEFAULT, oldSocketTimeoutESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetSocketTimeout()
  {
    return socketTimeoutESet;
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
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__HOST:
        return basicSetHost(null, msgs);
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__PORT:
        return basicSetPort(null, msgs);
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__DATABASE:
        return basicSetDatabase(null, msgs);
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__LOGIN:
        return basicSetLogin(null, msgs);
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__PASSWORD:
        return basicSetPassword(null, msgs);
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
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__HOST:
        return getHost();
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__PORT:
        return getPort();
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__DATABASE:
        return getDatabase();
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__LOGIN:
        return getLogin();
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__PASSWORD:
        return getPassword();
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__AUTHENTIFICATION:
        return getAuthentification();
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__CONNECT_TIMEOUT:
        return getConnectTimeout();
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__SOCKET_TIMEOUT:
        return getSocketTimeout();
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
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__HOST:
        setHost((ComplexValue)newValue);
        return;
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__PORT:
        setPort((ComplexValue)newValue);
        return;
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__DATABASE:
        setDatabase((ComplexValue)newValue);
        return;
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__LOGIN:
        setLogin((ComplexValue)newValue);
        return;
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__PASSWORD:
        setPassword((ComplexValue)newValue);
        return;
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__AUTHENTIFICATION:
        setAuthentification((AuthentificationEnums)newValue);
        return;
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__CONNECT_TIMEOUT:
        setConnectTimeout((Integer)newValue);
        return;
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__SOCKET_TIMEOUT:
        setSocketTimeout((Integer)newValue);
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
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__HOST:
        setHost((ComplexValue)null);
        return;
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__PORT:
        setPort((ComplexValue)null);
        return;
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__DATABASE:
        setDatabase((ComplexValue)null);
        return;
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__LOGIN:
        setLogin((ComplexValue)null);
        return;
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__PASSWORD:
        setPassword((ComplexValue)null);
        return;
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__AUTHENTIFICATION:
        unsetAuthentification();
        return;
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__CONNECT_TIMEOUT:
        unsetConnectTimeout();
        return;
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__SOCKET_TIMEOUT:
        unsetSocketTimeout();
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
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__HOST:
        return host != null;
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__PORT:
        return port != null;
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__DATABASE:
        return database != null;
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__LOGIN:
        return login != null;
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__PASSWORD:
        return password != null;
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__AUTHENTIFICATION:
        return isSetAuthentification();
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__CONNECT_TIMEOUT:
        return isSetConnectTimeout();
      case MongoDbResourcePackage.MONGO_DB_RESOURCE__SOCKET_TIMEOUT:
        return isSetSocketTimeout();
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
    result.append(" (authentification: ");
    if (authentificationESet) result.append(authentification); else result.append("<unset>");
    result.append(", connectTimeout: ");
    if (connectTimeoutESet) result.append(connectTimeout); else result.append("<unset>");
    result.append(", socketTimeout: ");
    if (socketTimeoutESet) result.append(socketTimeout); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // MongoDbResourceImpl
