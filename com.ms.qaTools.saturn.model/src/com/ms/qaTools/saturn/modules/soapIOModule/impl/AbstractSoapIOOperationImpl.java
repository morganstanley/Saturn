package com.ms.qaTools.saturn.modules.soapIOModule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.ms.qaTools.saturn.modules.soapIOModule.AbstractSoapIOOperation;
import com.ms.qaTools.saturn.modules.soapIOModule.SoapIOModulePackage;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Abstract Soap IO Operation</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.AbstractSoapIOOperationImpl#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.AbstractSoapIOOperationImpl#getTimeOut <em>Time Out</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractSoapIOOperationImpl extends EObjectImpl implements AbstractSoapIOOperation
{
  /**
   * The cached value of the '{@link #getRequestId() <em>Request Id</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getRequestId()
   * @generated
   * @ordered
   */
  protected ComplexValue requestId;

  /**
   * The cached value of the '{@link #getTimeOut() <em>Time Out</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeOut()
   * @generated
   * @ordered
   */
  protected ComplexValue timeOut;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected AbstractSoapIOOperationImpl()
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
    return SoapIOModulePackage.Literals.ABSTRACT_SOAP_IO_OPERATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getRequestId()
  {
    return requestId;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRequestId(ComplexValue newRequestId, NotificationChain msgs)
  {
    ComplexValue oldRequestId = requestId;
    requestId = newRequestId;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOModulePackage.ABSTRACT_SOAP_IO_OPERATION__REQUEST_ID, oldRequestId, newRequestId);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRequestId(ComplexValue newRequestId)
  {
    if (newRequestId != requestId)
    {
      NotificationChain msgs = null;
      if (requestId != null)
        msgs = ((InternalEObject)requestId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOModulePackage.ABSTRACT_SOAP_IO_OPERATION__REQUEST_ID, null, msgs);
      if (newRequestId != null)
        msgs = ((InternalEObject)newRequestId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOModulePackage.ABSTRACT_SOAP_IO_OPERATION__REQUEST_ID, null, msgs);
      msgs = basicSetRequestId(newRequestId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOModulePackage.ABSTRACT_SOAP_IO_OPERATION__REQUEST_ID, newRequestId, newRequestId));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getTimeOut()
  {
    return timeOut;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTimeOut(ComplexValue newTimeOut, NotificationChain msgs)
  {
    ComplexValue oldTimeOut = timeOut;
    timeOut = newTimeOut;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOModulePackage.ABSTRACT_SOAP_IO_OPERATION__TIME_OUT, oldTimeOut, newTimeOut);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTimeOut(ComplexValue newTimeOut)
  {
    if (newTimeOut != timeOut)
    {
      NotificationChain msgs = null;
      if (timeOut != null)
        msgs = ((InternalEObject)timeOut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOModulePackage.ABSTRACT_SOAP_IO_OPERATION__TIME_OUT, null, msgs);
      if (newTimeOut != null)
        msgs = ((InternalEObject)newTimeOut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOModulePackage.ABSTRACT_SOAP_IO_OPERATION__TIME_OUT, null, msgs);
      msgs = basicSetTimeOut(newTimeOut, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOModulePackage.ABSTRACT_SOAP_IO_OPERATION__TIME_OUT, newTimeOut, newTimeOut));
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
      case SoapIOModulePackage.ABSTRACT_SOAP_IO_OPERATION__REQUEST_ID:
        return basicSetRequestId(null, msgs);
      case SoapIOModulePackage.ABSTRACT_SOAP_IO_OPERATION__TIME_OUT:
        return basicSetTimeOut(null, msgs);
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
      case SoapIOModulePackage.ABSTRACT_SOAP_IO_OPERATION__REQUEST_ID:
        return getRequestId();
      case SoapIOModulePackage.ABSTRACT_SOAP_IO_OPERATION__TIME_OUT:
        return getTimeOut();
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
      case SoapIOModulePackage.ABSTRACT_SOAP_IO_OPERATION__REQUEST_ID:
        setRequestId((ComplexValue)newValue);
        return;
      case SoapIOModulePackage.ABSTRACT_SOAP_IO_OPERATION__TIME_OUT:
        setTimeOut((ComplexValue)newValue);
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
      case SoapIOModulePackage.ABSTRACT_SOAP_IO_OPERATION__REQUEST_ID:
        setRequestId((ComplexValue)null);
        return;
      case SoapIOModulePackage.ABSTRACT_SOAP_IO_OPERATION__TIME_OUT:
        setTimeOut((ComplexValue)null);
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
      case SoapIOModulePackage.ABSTRACT_SOAP_IO_OPERATION__REQUEST_ID:
        return requestId != null;
      case SoapIOModulePackage.ABSTRACT_SOAP_IO_OPERATION__TIME_OUT:
        return timeOut != null;
    }
    return super.eIsSet(featureID);
  }

} // AbstractSoapIOOperationImpl
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
