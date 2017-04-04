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
package com.ms.qaTools.saturn.modules.psManagerModule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.exception.exception;
import com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModulePackage;
import com.ms.qaTools.saturn.modules.psManagerModule.RemoveSessionOperation;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Remove Session Operation</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.RemoveSessionOperationImpl#getException <em>Exception</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.RemoveSessionOperationImpl#getSessionName <em>Session Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.RemoveSessionOperationImpl#isIgnoreIfNotExists <em>Ignore If Not Exists</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.RemoveSessionOperationImpl#isForce <em>Force</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoveSessionOperationImpl extends AbstractOperationImpl implements RemoveSessionOperation
{
  /**
   * The cached value of the '{@link #getException() <em>Exception</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getException()
   * @generated
   * @ordered
   */
  protected exception            exception;

  /**
   * The cached value of the '{@link #getSessionName() <em>Session Name</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getSessionName()
   * @generated
   * @ordered
   */
  protected ComplexValue         sessionName;

  /**
   * The default value of the '{@link #isIgnoreIfNotExists() <em>Ignore If Not Exists</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isIgnoreIfNotExists()
   * @generated
   * @ordered
   */
  protected static final boolean IGNORE_IF_NOT_EXISTS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIgnoreIfNotExists() <em>Ignore If Not Exists</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isIgnoreIfNotExists()
   * @generated
   * @ordered
   */
  protected boolean              ignoreIfNotExists             = IGNORE_IF_NOT_EXISTS_EDEFAULT;

  /**
   * This is true if the Ignore If Not Exists attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              ignoreIfNotExistsESet;

  /**
   * The default value of the '{@link #isForce() <em>Force</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isForce()
   * @generated
   * @ordered
   */
  protected static final boolean FORCE_EDEFAULT                = false;

  /**
   * The cached value of the '{@link #isForce() <em>Force</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isForce()
   * @generated
   * @ordered
   */
  protected boolean              force                         = FORCE_EDEFAULT;

  /**
   * This is true if the Force attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              forceESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected RemoveSessionOperationImpl()
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
    return PsManagerModulePackage.Literals.REMOVE_SESSION_OPERATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public exception getException()
  {
    return exception;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetException(exception newException, NotificationChain msgs)
  {
    exception oldException = exception;
    exception = newException;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsManagerModulePackage.REMOVE_SESSION_OPERATION__EXCEPTION, oldException, newException);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setException(exception newException)
  {
    if (newException != exception)
    {
      NotificationChain msgs = null;
      if (exception != null)
        msgs = ((InternalEObject)exception).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PsManagerModulePackage.REMOVE_SESSION_OPERATION__EXCEPTION, null, msgs);
      if (newException != null)
        msgs = ((InternalEObject)newException).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PsManagerModulePackage.REMOVE_SESSION_OPERATION__EXCEPTION, null, msgs);
      msgs = basicSetException(newException, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsManagerModulePackage.REMOVE_SESSION_OPERATION__EXCEPTION, newException, newException));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getSessionName()
  {
    return sessionName;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSessionName(ComplexValue newSessionName, NotificationChain msgs)
  {
    ComplexValue oldSessionName = sessionName;
    sessionName = newSessionName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsManagerModulePackage.REMOVE_SESSION_OPERATION__SESSION_NAME, oldSessionName, newSessionName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSessionName(ComplexValue newSessionName)
  {
    if (newSessionName != sessionName)
    {
      NotificationChain msgs = null;
      if (sessionName != null)
        msgs = ((InternalEObject)sessionName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PsManagerModulePackage.REMOVE_SESSION_OPERATION__SESSION_NAME, null, msgs);
      if (newSessionName != null)
        msgs = ((InternalEObject)newSessionName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PsManagerModulePackage.REMOVE_SESSION_OPERATION__SESSION_NAME, null, msgs);
      msgs = basicSetSessionName(newSessionName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsManagerModulePackage.REMOVE_SESSION_OPERATION__SESSION_NAME, newSessionName, newSessionName));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isForce()
  {
    return force;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setForce(boolean newForce)
  {
    boolean oldForce = force;
    force = newForce;
    boolean oldForceESet = forceESet;
    forceESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsManagerModulePackage.REMOVE_SESSION_OPERATION__FORCE, oldForce, force, !oldForceESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetForce()
  {
    boolean oldForce = force;
    boolean oldForceESet = forceESet;
    force = FORCE_EDEFAULT;
    forceESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, PsManagerModulePackage.REMOVE_SESSION_OPERATION__FORCE, oldForce, FORCE_EDEFAULT, oldForceESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetForce()
  {
    return forceESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isIgnoreIfNotExists()
  {
    return ignoreIfNotExists;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setIgnoreIfNotExists(boolean newIgnoreIfNotExists)
  {
    boolean oldIgnoreIfNotExists = ignoreIfNotExists;
    ignoreIfNotExists = newIgnoreIfNotExists;
    boolean oldIgnoreIfNotExistsESet = ignoreIfNotExistsESet;
    ignoreIfNotExistsESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsManagerModulePackage.REMOVE_SESSION_OPERATION__IGNORE_IF_NOT_EXISTS, oldIgnoreIfNotExists, ignoreIfNotExists, !oldIgnoreIfNotExistsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetIgnoreIfNotExists()
  {
    boolean oldIgnoreIfNotExists = ignoreIfNotExists;
    boolean oldIgnoreIfNotExistsESet = ignoreIfNotExistsESet;
    ignoreIfNotExists = IGNORE_IF_NOT_EXISTS_EDEFAULT;
    ignoreIfNotExistsESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, PsManagerModulePackage.REMOVE_SESSION_OPERATION__IGNORE_IF_NOT_EXISTS, oldIgnoreIfNotExists, IGNORE_IF_NOT_EXISTS_EDEFAULT, oldIgnoreIfNotExistsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetIgnoreIfNotExists()
  {
    return ignoreIfNotExistsESet;
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
      case PsManagerModulePackage.REMOVE_SESSION_OPERATION__EXCEPTION:
        return basicSetException(null, msgs);
      case PsManagerModulePackage.REMOVE_SESSION_OPERATION__SESSION_NAME:
        return basicSetSessionName(null, msgs);
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
      case PsManagerModulePackage.REMOVE_SESSION_OPERATION__EXCEPTION:
        return getException();
      case PsManagerModulePackage.REMOVE_SESSION_OPERATION__SESSION_NAME:
        return getSessionName();
      case PsManagerModulePackage.REMOVE_SESSION_OPERATION__IGNORE_IF_NOT_EXISTS:
        return isIgnoreIfNotExists();
      case PsManagerModulePackage.REMOVE_SESSION_OPERATION__FORCE:
        return isForce();
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
      case PsManagerModulePackage.REMOVE_SESSION_OPERATION__EXCEPTION:
        setException((exception)newValue);
        return;
      case PsManagerModulePackage.REMOVE_SESSION_OPERATION__SESSION_NAME:
        setSessionName((ComplexValue)newValue);
        return;
      case PsManagerModulePackage.REMOVE_SESSION_OPERATION__IGNORE_IF_NOT_EXISTS:
        setIgnoreIfNotExists((Boolean)newValue);
        return;
      case PsManagerModulePackage.REMOVE_SESSION_OPERATION__FORCE:
        setForce((Boolean)newValue);
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
      case PsManagerModulePackage.REMOVE_SESSION_OPERATION__EXCEPTION:
        setException((exception)null);
        return;
      case PsManagerModulePackage.REMOVE_SESSION_OPERATION__SESSION_NAME:
        setSessionName((ComplexValue)null);
        return;
      case PsManagerModulePackage.REMOVE_SESSION_OPERATION__IGNORE_IF_NOT_EXISTS:
        unsetIgnoreIfNotExists();
        return;
      case PsManagerModulePackage.REMOVE_SESSION_OPERATION__FORCE:
        unsetForce();
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
      case PsManagerModulePackage.REMOVE_SESSION_OPERATION__EXCEPTION:
        return exception != null;
      case PsManagerModulePackage.REMOVE_SESSION_OPERATION__SESSION_NAME:
        return sessionName != null;
      case PsManagerModulePackage.REMOVE_SESSION_OPERATION__IGNORE_IF_NOT_EXISTS:
        return isSetIgnoreIfNotExists();
      case PsManagerModulePackage.REMOVE_SESSION_OPERATION__FORCE:
        return isSetForce();
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
    result.append(" (ignoreIfNotExists: ");
    if (ignoreIfNotExistsESet) result.append(ignoreIfNotExists); else result.append("<unset>");
    result.append(", force: ");
    if (forceESet) result.append(force); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // RemoveSessionOperationImpl
