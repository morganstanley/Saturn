package com.ms.qaTools.saturn.modules.psManagerModule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.exception.exception;
import com.ms.qaTools.saturn.modules.psManagerModule.CheckSessionUpOperation;
import com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModulePackage;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Check Session Up Operation</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.CheckSessionUpOperationImpl#getException <em>Exception</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.CheckSessionUpOperationImpl#getSessionName <em>Session Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckSessionUpOperationImpl extends AbstractOperationImpl implements CheckSessionUpOperation
{
  /**
   * The cached value of the '{@link #getException() <em>Exception</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getException()
   * @generated
   * @ordered
   */
  protected exception    exception;

  /**
   * The cached value of the '{@link #getSessionName() <em>Session Name</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getSessionName()
   * @generated
   * @ordered
   */
  protected ComplexValue sessionName;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected CheckSessionUpOperationImpl()
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
    return PsManagerModulePackage.Literals.CHECK_SESSION_UP_OPERATION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsManagerModulePackage.CHECK_SESSION_UP_OPERATION__EXCEPTION, oldException, newException);
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
        msgs = ((InternalEObject)exception).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PsManagerModulePackage.CHECK_SESSION_UP_OPERATION__EXCEPTION, null, msgs);
      if (newException != null)
        msgs = ((InternalEObject)newException).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PsManagerModulePackage.CHECK_SESSION_UP_OPERATION__EXCEPTION, null, msgs);
      msgs = basicSetException(newException, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsManagerModulePackage.CHECK_SESSION_UP_OPERATION__EXCEPTION, newException, newException));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsManagerModulePackage.CHECK_SESSION_UP_OPERATION__SESSION_NAME, oldSessionName, newSessionName);
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
        msgs = ((InternalEObject)sessionName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PsManagerModulePackage.CHECK_SESSION_UP_OPERATION__SESSION_NAME, null, msgs);
      if (newSessionName != null)
        msgs = ((InternalEObject)newSessionName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PsManagerModulePackage.CHECK_SESSION_UP_OPERATION__SESSION_NAME, null, msgs);
      msgs = basicSetSessionName(newSessionName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsManagerModulePackage.CHECK_SESSION_UP_OPERATION__SESSION_NAME, newSessionName, newSessionName));
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
      case PsManagerModulePackage.CHECK_SESSION_UP_OPERATION__EXCEPTION:
        return basicSetException(null, msgs);
      case PsManagerModulePackage.CHECK_SESSION_UP_OPERATION__SESSION_NAME:
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
      case PsManagerModulePackage.CHECK_SESSION_UP_OPERATION__EXCEPTION:
        return getException();
      case PsManagerModulePackage.CHECK_SESSION_UP_OPERATION__SESSION_NAME:
        return getSessionName();
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
      case PsManagerModulePackage.CHECK_SESSION_UP_OPERATION__EXCEPTION:
        setException((exception)newValue);
        return;
      case PsManagerModulePackage.CHECK_SESSION_UP_OPERATION__SESSION_NAME:
        setSessionName((ComplexValue)newValue);
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
      case PsManagerModulePackage.CHECK_SESSION_UP_OPERATION__EXCEPTION:
        setException((exception)null);
        return;
      case PsManagerModulePackage.CHECK_SESSION_UP_OPERATION__SESSION_NAME:
        setSessionName((ComplexValue)null);
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
      case PsManagerModulePackage.CHECK_SESSION_UP_OPERATION__EXCEPTION:
        return exception != null;
      case PsManagerModulePackage.CHECK_SESSION_UP_OPERATION__SESSION_NAME:
        return sessionName != null;
    }
    return super.eIsSet(featureID);
  }

} // CheckSessionUpOperationImpl
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
