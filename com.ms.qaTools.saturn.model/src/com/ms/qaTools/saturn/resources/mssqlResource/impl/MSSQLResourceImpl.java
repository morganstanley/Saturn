package com.ms.qaTools.saturn.resources.mssqlResource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.resources.mssqlResource.AuthentificationEnums;
import com.ms.qaTools.saturn.resources.mssqlResource.MSSQLResource;
import com.ms.qaTools.saturn.resources.mssqlResource.MssqlResourcePackage;
import com.ms.qaTools.saturn.types.impl.DatabaseResourceDefinitionImpl;
import com.ms.qaTools.saturn.types.impl.NamedResourceDefinitionImpl;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>MSSQL Resource</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.mssqlResource.impl.MSSQLResourceImpl#getLogin <em>Login</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.mssqlResource.impl.MSSQLResourceImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.mssqlResource.impl.MSSQLResourceImpl#getServer <em>Server</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.mssqlResource.impl.MSSQLResourceImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.mssqlResource.impl.MSSQLResourceImpl#getHost <em>Host</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.mssqlResource.impl.MSSQLResourceImpl#getPort <em>Port</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.mssqlResource.impl.MSSQLResourceImpl#getAuthentification <em>Authentification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MSSQLResourceImpl extends DatabaseResourceDefinitionImpl implements MSSQLResource
{
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
   * The cached value of the '{@link #getServer() <em>Server</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getServer()
   * @generated
   * @ordered
   */
  protected ComplexValue                       server;

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
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected MSSQLResourceImpl()
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
    return MssqlResourcePackage.Literals.MSSQL_RESOURCE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MssqlResourcePackage.MSSQL_RESOURCE__LOGIN, oldLogin, newLogin);
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
        msgs = ((InternalEObject)login).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MssqlResourcePackage.MSSQL_RESOURCE__LOGIN, null, msgs);
      if (newLogin != null)
        msgs = ((InternalEObject)newLogin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MssqlResourcePackage.MSSQL_RESOURCE__LOGIN, null, msgs);
      msgs = basicSetLogin(newLogin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MssqlResourcePackage.MSSQL_RESOURCE__LOGIN, newLogin, newLogin));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MssqlResourcePackage.MSSQL_RESOURCE__PASSWORD, oldPassword, newPassword);
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
        msgs = ((InternalEObject)password).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MssqlResourcePackage.MSSQL_RESOURCE__PASSWORD, null, msgs);
      if (newPassword != null)
        msgs = ((InternalEObject)newPassword).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MssqlResourcePackage.MSSQL_RESOURCE__PASSWORD, null, msgs);
      msgs = basicSetPassword(newPassword, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MssqlResourcePackage.MSSQL_RESOURCE__PASSWORD, newPassword, newPassword));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MssqlResourcePackage.MSSQL_RESOURCE__SERVER, oldServer, newServer);
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
        msgs = ((InternalEObject)server).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MssqlResourcePackage.MSSQL_RESOURCE__SERVER, null, msgs);
      if (newServer != null)
        msgs = ((InternalEObject)newServer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MssqlResourcePackage.MSSQL_RESOURCE__SERVER, null, msgs);
      msgs = basicSetServer(newServer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MssqlResourcePackage.MSSQL_RESOURCE__SERVER, newServer, newServer));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MssqlResourcePackage.MSSQL_RESOURCE__DATABASE, oldDatabase, newDatabase);
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
        msgs = ((InternalEObject)database).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MssqlResourcePackage.MSSQL_RESOURCE__DATABASE, null, msgs);
      if (newDatabase != null)
        msgs = ((InternalEObject)newDatabase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MssqlResourcePackage.MSSQL_RESOURCE__DATABASE, null, msgs);
      msgs = basicSetDatabase(newDatabase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MssqlResourcePackage.MSSQL_RESOURCE__DATABASE, newDatabase, newDatabase));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MssqlResourcePackage.MSSQL_RESOURCE__HOST, oldHost, newHost);
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
        msgs = ((InternalEObject)host).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MssqlResourcePackage.MSSQL_RESOURCE__HOST, null, msgs);
      if (newHost != null)
        msgs = ((InternalEObject)newHost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MssqlResourcePackage.MSSQL_RESOURCE__HOST, null, msgs);
      msgs = basicSetHost(newHost, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MssqlResourcePackage.MSSQL_RESOURCE__HOST, newHost, newHost));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MssqlResourcePackage.MSSQL_RESOURCE__PORT, oldPort, newPort);
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
        msgs = ((InternalEObject)port).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MssqlResourcePackage.MSSQL_RESOURCE__PORT, null, msgs);
      if (newPort != null)
        msgs = ((InternalEObject)newPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MssqlResourcePackage.MSSQL_RESOURCE__PORT, null, msgs);
      msgs = basicSetPort(newPort, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MssqlResourcePackage.MSSQL_RESOURCE__PORT, newPort, newPort));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MssqlResourcePackage.MSSQL_RESOURCE__AUTHENTIFICATION, oldAuthentification, authentification, !oldAuthentificationESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, MssqlResourcePackage.MSSQL_RESOURCE__AUTHENTIFICATION, oldAuthentification, AUTHENTIFICATION_EDEFAULT, oldAuthentificationESet));
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
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MssqlResourcePackage.MSSQL_RESOURCE__LOGIN:
        return basicSetLogin(null, msgs);
      case MssqlResourcePackage.MSSQL_RESOURCE__PASSWORD:
        return basicSetPassword(null, msgs);
      case MssqlResourcePackage.MSSQL_RESOURCE__SERVER:
        return basicSetServer(null, msgs);
      case MssqlResourcePackage.MSSQL_RESOURCE__DATABASE:
        return basicSetDatabase(null, msgs);
      case MssqlResourcePackage.MSSQL_RESOURCE__HOST:
        return basicSetHost(null, msgs);
      case MssqlResourcePackage.MSSQL_RESOURCE__PORT:
        return basicSetPort(null, msgs);
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
      case MssqlResourcePackage.MSSQL_RESOURCE__LOGIN:
        return getLogin();
      case MssqlResourcePackage.MSSQL_RESOURCE__PASSWORD:
        return getPassword();
      case MssqlResourcePackage.MSSQL_RESOURCE__SERVER:
        return getServer();
      case MssqlResourcePackage.MSSQL_RESOURCE__DATABASE:
        return getDatabase();
      case MssqlResourcePackage.MSSQL_RESOURCE__HOST:
        return getHost();
      case MssqlResourcePackage.MSSQL_RESOURCE__PORT:
        return getPort();
      case MssqlResourcePackage.MSSQL_RESOURCE__AUTHENTIFICATION:
        return getAuthentification();
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
      case MssqlResourcePackage.MSSQL_RESOURCE__LOGIN:
        setLogin((ComplexValue)newValue);
        return;
      case MssqlResourcePackage.MSSQL_RESOURCE__PASSWORD:
        setPassword((ComplexValue)newValue);
        return;
      case MssqlResourcePackage.MSSQL_RESOURCE__SERVER:
        setServer((ComplexValue)newValue);
        return;
      case MssqlResourcePackage.MSSQL_RESOURCE__DATABASE:
        setDatabase((ComplexValue)newValue);
        return;
      case MssqlResourcePackage.MSSQL_RESOURCE__HOST:
        setHost((ComplexValue)newValue);
        return;
      case MssqlResourcePackage.MSSQL_RESOURCE__PORT:
        setPort((ComplexValue)newValue);
        return;
      case MssqlResourcePackage.MSSQL_RESOURCE__AUTHENTIFICATION:
        setAuthentification((AuthentificationEnums)newValue);
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
      case MssqlResourcePackage.MSSQL_RESOURCE__LOGIN:
        setLogin((ComplexValue)null);
        return;
      case MssqlResourcePackage.MSSQL_RESOURCE__PASSWORD:
        setPassword((ComplexValue)null);
        return;
      case MssqlResourcePackage.MSSQL_RESOURCE__SERVER:
        setServer((ComplexValue)null);
        return;
      case MssqlResourcePackage.MSSQL_RESOURCE__DATABASE:
        setDatabase((ComplexValue)null);
        return;
      case MssqlResourcePackage.MSSQL_RESOURCE__HOST:
        setHost((ComplexValue)null);
        return;
      case MssqlResourcePackage.MSSQL_RESOURCE__PORT:
        setPort((ComplexValue)null);
        return;
      case MssqlResourcePackage.MSSQL_RESOURCE__AUTHENTIFICATION:
        unsetAuthentification();
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
      case MssqlResourcePackage.MSSQL_RESOURCE__LOGIN:
        return login != null;
      case MssqlResourcePackage.MSSQL_RESOURCE__PASSWORD:
        return password != null;
      case MssqlResourcePackage.MSSQL_RESOURCE__SERVER:
        return server != null;
      case MssqlResourcePackage.MSSQL_RESOURCE__DATABASE:
        return database != null;
      case MssqlResourcePackage.MSSQL_RESOURCE__HOST:
        return host != null;
      case MssqlResourcePackage.MSSQL_RESOURCE__PORT:
        return port != null;
      case MssqlResourcePackage.MSSQL_RESOURCE__AUTHENTIFICATION:
        return isSetAuthentification();
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
    result.append(')');
    return result.toString();
  }

} // MSSQLResourceImpl
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
