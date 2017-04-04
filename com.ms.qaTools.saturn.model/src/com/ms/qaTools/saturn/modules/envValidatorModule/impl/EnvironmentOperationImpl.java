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
package com.ms.qaTools.saturn.modules.envValidatorModule.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ms.qaTools.saturn.modules.envValidatorModule.EnvValidatorModulePackage;
import com.ms.qaTools.saturn.modules.envValidatorModule.EnvVar;
import com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Environment Operation</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvironmentOperationImpl#getCurrentDir <em>Current Dir</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvironmentOperationImpl#getCurrentUser <em>Current User</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvironmentOperationImpl#getCurrentHost <em>Current Host</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvironmentOperationImpl#getEnvVars <em>Env Vars</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvironmentOperationImpl#isValidateCurrentUser <em>Validate Current User</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvironmentOperationImpl#isValidateCurrentDir <em>Validate Current Dir</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvironmentOperationImpl#isValidateCurrentHost <em>Validate Current Host</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnvironmentOperationImpl extends AbstractOperationImpl implements EnvironmentOperation
{
  /**
   * The cached value of the '{@link #getCurrentDir() <em>Current Dir</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getCurrentDir()
   * @generated
   * @ordered
   */
  protected ComplexValue         currentDir;

  /**
   * The cached value of the '{@link #getCurrentUser() <em>Current User</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getCurrentUser()
   * @generated
   * @ordered
   */
  protected ComplexValue         currentUser;

  /**
   * The cached value of the '{@link #getCurrentHost() <em>Current Host</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getCurrentHost()
   * @generated
   * @ordered
   */
  protected ComplexValue         currentHost;

  /**
   * The cached value of the '{@link #getEnvVars() <em>Env Vars</em>}' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getEnvVars()
   * @generated
   * @ordered
   */
  protected EList<EnvVar>        envVars;

  /**
   * The default value of the '{@link #isValidateCurrentUser() <em>Validate Current User</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isValidateCurrentUser()
   * @generated
   * @ordered
   */
  protected static final boolean VALIDATE_CURRENT_USER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isValidateCurrentUser() <em>Validate Current User</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isValidateCurrentUser()
   * @generated
   * @ordered
   */
  protected boolean              validateCurrentUser            = VALIDATE_CURRENT_USER_EDEFAULT;

  /**
   * This is true if the Validate Current User attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              validateCurrentUserESet;

  /**
   * The default value of the '{@link #isValidateCurrentDir() <em>Validate Current Dir</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isValidateCurrentDir()
   * @generated
   * @ordered
   */
  protected static final boolean VALIDATE_CURRENT_DIR_EDEFAULT  = false;

  /**
   * The cached value of the '{@link #isValidateCurrentDir() <em>Validate Current Dir</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isValidateCurrentDir()
   * @generated
   * @ordered
   */
  protected boolean              validateCurrentDir             = VALIDATE_CURRENT_DIR_EDEFAULT;

  /**
   * This is true if the Validate Current Dir attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              validateCurrentDirESet;

  /**
   * The default value of the '{@link #isValidateCurrentHost() <em>Validate Current Host</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isValidateCurrentHost()
   * @generated
   * @ordered
   */
  protected static final boolean VALIDATE_CURRENT_HOST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isValidateCurrentHost() <em>Validate Current Host</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isValidateCurrentHost()
   * @generated
   * @ordered
   */
  protected boolean              validateCurrentHost            = VALIDATE_CURRENT_HOST_EDEFAULT;

  /**
   * This is true if the Validate Current Host attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              validateCurrentHostESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected EnvironmentOperationImpl()
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
    return EnvValidatorModulePackage.Literals.ENVIRONMENT_OPERATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getCurrentDir()
  {
    return currentDir;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCurrentDir(ComplexValue newCurrentDir, NotificationChain msgs)
  {
    ComplexValue oldCurrentDir = currentDir;
    currentDir = newCurrentDir;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnvValidatorModulePackage.ENVIRONMENT_OPERATION__CURRENT_DIR, oldCurrentDir, newCurrentDir);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCurrentDir(ComplexValue newCurrentDir)
  {
    if (newCurrentDir != currentDir)
    {
      NotificationChain msgs = null;
      if (currentDir != null)
        msgs = ((InternalEObject)currentDir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EnvValidatorModulePackage.ENVIRONMENT_OPERATION__CURRENT_DIR, null, msgs);
      if (newCurrentDir != null)
        msgs = ((InternalEObject)newCurrentDir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EnvValidatorModulePackage.ENVIRONMENT_OPERATION__CURRENT_DIR, null, msgs);
      msgs = basicSetCurrentDir(newCurrentDir, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EnvValidatorModulePackage.ENVIRONMENT_OPERATION__CURRENT_DIR, newCurrentDir, newCurrentDir));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getCurrentUser()
  {
    return currentUser;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCurrentUser(ComplexValue newCurrentUser, NotificationChain msgs)
  {
    ComplexValue oldCurrentUser = currentUser;
    currentUser = newCurrentUser;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnvValidatorModulePackage.ENVIRONMENT_OPERATION__CURRENT_USER, oldCurrentUser, newCurrentUser);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCurrentUser(ComplexValue newCurrentUser)
  {
    if (newCurrentUser != currentUser)
    {
      NotificationChain msgs = null;
      if (currentUser != null)
        msgs = ((InternalEObject)currentUser).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EnvValidatorModulePackage.ENVIRONMENT_OPERATION__CURRENT_USER, null, msgs);
      if (newCurrentUser != null)
        msgs = ((InternalEObject)newCurrentUser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EnvValidatorModulePackage.ENVIRONMENT_OPERATION__CURRENT_USER, null, msgs);
      msgs = basicSetCurrentUser(newCurrentUser, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EnvValidatorModulePackage.ENVIRONMENT_OPERATION__CURRENT_USER, newCurrentUser, newCurrentUser));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getCurrentHost()
  {
    return currentHost;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCurrentHost(ComplexValue newCurrentHost, NotificationChain msgs)
  {
    ComplexValue oldCurrentHost = currentHost;
    currentHost = newCurrentHost;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnvValidatorModulePackage.ENVIRONMENT_OPERATION__CURRENT_HOST, oldCurrentHost, newCurrentHost);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCurrentHost(ComplexValue newCurrentHost)
  {
    if (newCurrentHost != currentHost)
    {
      NotificationChain msgs = null;
      if (currentHost != null)
        msgs = ((InternalEObject)currentHost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EnvValidatorModulePackage.ENVIRONMENT_OPERATION__CURRENT_HOST, null, msgs);
      if (newCurrentHost != null)
        msgs = ((InternalEObject)newCurrentHost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EnvValidatorModulePackage.ENVIRONMENT_OPERATION__CURRENT_HOST, null, msgs);
      msgs = basicSetCurrentHost(newCurrentHost, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EnvValidatorModulePackage.ENVIRONMENT_OPERATION__CURRENT_HOST, newCurrentHost, newCurrentHost));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<EnvVar> getEnvVars()
  {
    if (envVars == null)
    {
      envVars = new EObjectContainmentEList<EnvVar>(EnvVar.class, this, EnvValidatorModulePackage.ENVIRONMENT_OPERATION__ENV_VARS);
    }
    return envVars;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isValidateCurrentDir()
  {
    return validateCurrentDir;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setValidateCurrentDir(boolean newValidateCurrentDir)
  {
    boolean oldValidateCurrentDir = validateCurrentDir;
    validateCurrentDir = newValidateCurrentDir;
    boolean oldValidateCurrentDirESet = validateCurrentDirESet;
    validateCurrentDirESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EnvValidatorModulePackage.ENVIRONMENT_OPERATION__VALIDATE_CURRENT_DIR, oldValidateCurrentDir, validateCurrentDir, !oldValidateCurrentDirESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetValidateCurrentDir()
  {
    boolean oldValidateCurrentDir = validateCurrentDir;
    boolean oldValidateCurrentDirESet = validateCurrentDirESet;
    validateCurrentDir = VALIDATE_CURRENT_DIR_EDEFAULT;
    validateCurrentDirESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, EnvValidatorModulePackage.ENVIRONMENT_OPERATION__VALIDATE_CURRENT_DIR, oldValidateCurrentDir, VALIDATE_CURRENT_DIR_EDEFAULT, oldValidateCurrentDirESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetValidateCurrentDir()
  {
    return validateCurrentDirESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isValidateCurrentHost()
  {
    return validateCurrentHost;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setValidateCurrentHost(boolean newValidateCurrentHost)
  {
    boolean oldValidateCurrentHost = validateCurrentHost;
    validateCurrentHost = newValidateCurrentHost;
    boolean oldValidateCurrentHostESet = validateCurrentHostESet;
    validateCurrentHostESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EnvValidatorModulePackage.ENVIRONMENT_OPERATION__VALIDATE_CURRENT_HOST, oldValidateCurrentHost, validateCurrentHost, !oldValidateCurrentHostESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetValidateCurrentHost()
  {
    boolean oldValidateCurrentHost = validateCurrentHost;
    boolean oldValidateCurrentHostESet = validateCurrentHostESet;
    validateCurrentHost = VALIDATE_CURRENT_HOST_EDEFAULT;
    validateCurrentHostESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, EnvValidatorModulePackage.ENVIRONMENT_OPERATION__VALIDATE_CURRENT_HOST, oldValidateCurrentHost, VALIDATE_CURRENT_HOST_EDEFAULT, oldValidateCurrentHostESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetValidateCurrentHost()
  {
    return validateCurrentHostESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isValidateCurrentUser()
  {
    return validateCurrentUser;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setValidateCurrentUser(boolean newValidateCurrentUser)
  {
    boolean oldValidateCurrentUser = validateCurrentUser;
    validateCurrentUser = newValidateCurrentUser;
    boolean oldValidateCurrentUserESet = validateCurrentUserESet;
    validateCurrentUserESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EnvValidatorModulePackage.ENVIRONMENT_OPERATION__VALIDATE_CURRENT_USER, oldValidateCurrentUser, validateCurrentUser, !oldValidateCurrentUserESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetValidateCurrentUser()
  {
    boolean oldValidateCurrentUser = validateCurrentUser;
    boolean oldValidateCurrentUserESet = validateCurrentUserESet;
    validateCurrentUser = VALIDATE_CURRENT_USER_EDEFAULT;
    validateCurrentUserESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, EnvValidatorModulePackage.ENVIRONMENT_OPERATION__VALIDATE_CURRENT_USER, oldValidateCurrentUser, VALIDATE_CURRENT_USER_EDEFAULT, oldValidateCurrentUserESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetValidateCurrentUser()
  {
    return validateCurrentUserESet;
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
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__CURRENT_DIR:
        return basicSetCurrentDir(null, msgs);
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__CURRENT_USER:
        return basicSetCurrentUser(null, msgs);
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__CURRENT_HOST:
        return basicSetCurrentHost(null, msgs);
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__ENV_VARS:
        return ((InternalEList<?>)getEnvVars()).basicRemove(otherEnd, msgs);
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
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__CURRENT_DIR:
        return getCurrentDir();
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__CURRENT_USER:
        return getCurrentUser();
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__CURRENT_HOST:
        return getCurrentHost();
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__ENV_VARS:
        return getEnvVars();
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__VALIDATE_CURRENT_USER:
        return isValidateCurrentUser();
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__VALIDATE_CURRENT_DIR:
        return isValidateCurrentDir();
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__VALIDATE_CURRENT_HOST:
        return isValidateCurrentHost();
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
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__CURRENT_DIR:
        setCurrentDir((ComplexValue)newValue);
        return;
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__CURRENT_USER:
        setCurrentUser((ComplexValue)newValue);
        return;
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__CURRENT_HOST:
        setCurrentHost((ComplexValue)newValue);
        return;
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__ENV_VARS:
        getEnvVars().clear();
        getEnvVars().addAll((Collection<? extends EnvVar>)newValue);
        return;
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__VALIDATE_CURRENT_USER:
        setValidateCurrentUser((Boolean)newValue);
        return;
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__VALIDATE_CURRENT_DIR:
        setValidateCurrentDir((Boolean)newValue);
        return;
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__VALIDATE_CURRENT_HOST:
        setValidateCurrentHost((Boolean)newValue);
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
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__CURRENT_DIR:
        setCurrentDir((ComplexValue)null);
        return;
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__CURRENT_USER:
        setCurrentUser((ComplexValue)null);
        return;
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__CURRENT_HOST:
        setCurrentHost((ComplexValue)null);
        return;
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__ENV_VARS:
        getEnvVars().clear();
        return;
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__VALIDATE_CURRENT_USER:
        unsetValidateCurrentUser();
        return;
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__VALIDATE_CURRENT_DIR:
        unsetValidateCurrentDir();
        return;
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__VALIDATE_CURRENT_HOST:
        unsetValidateCurrentHost();
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
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__CURRENT_DIR:
        return currentDir != null;
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__CURRENT_USER:
        return currentUser != null;
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__CURRENT_HOST:
        return currentHost != null;
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__ENV_VARS:
        return envVars != null && !envVars.isEmpty();
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__VALIDATE_CURRENT_USER:
        return isSetValidateCurrentUser();
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__VALIDATE_CURRENT_DIR:
        return isSetValidateCurrentDir();
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION__VALIDATE_CURRENT_HOST:
        return isSetValidateCurrentHost();
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
    result.append(" (validateCurrentUser: ");
    if (validateCurrentUserESet) result.append(validateCurrentUser); else result.append("<unset>");
    result.append(", validateCurrentDir: ");
    if (validateCurrentDirESet) result.append(validateCurrentDir); else result.append("<unset>");
    result.append(", validateCurrentHost: ");
    if (validateCurrentHostESet) result.append(validateCurrentHost); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // EnvironmentOperationImpl
