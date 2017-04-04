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
package com.ms.qaTools.saturn.result.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.ms.qaTools.saturn.result.ResultPackage;
import com.ms.qaTools.saturn.result.SaturnResult;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Saturn Result</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.result.impl.SaturnResultImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.result.impl.SaturnResultImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.result.impl.SaturnResultImpl#getIterationNo <em>Iteration No</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.result.impl.SaturnResultImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.result.impl.SaturnResultImpl#getStopTime <em>Stop Time</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.result.impl.SaturnResultImpl#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SaturnResultImpl extends EObjectImpl implements SaturnResult
{
  /**
   * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected static final String STATUS_EDEFAULT       = null;

  /**
   * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected String              status                = STATUS_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT         = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String              name                  = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getIterationNo() <em>Iteration No</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getIterationNo()
   * @generated
   * @ordered
   */
  protected static final String ITERATION_NO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIterationNo() <em>Iteration No</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getIterationNo()
   * @generated
   * @ordered
   */
  protected String              iterationNo           = ITERATION_NO_EDEFAULT;

  /**
   * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getStartTime()
   * @generated
   * @ordered
   */
  protected static final String START_TIME_EDEFAULT   = null;

  /**
   * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getStartTime()
   * @generated
   * @ordered
   */
  protected String              startTime             = START_TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getStopTime() <em>Stop Time</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getStopTime()
   * @generated
   * @ordered
   */
  protected static final String STOP_TIME_EDEFAULT    = null;

  /**
   * The cached value of the '{@link #getStopTime() <em>Stop Time</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getStopTime()
   * @generated
   * @ordered
   */
  protected String              stopTime              = STOP_TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
  protected static final String MESSAGE_EDEFAULT      = null;

  /**
   * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
  protected String              message               = MESSAGE_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected SaturnResultImpl()
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
    return ResultPackage.Literals.SATURN_RESULT;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getIterationNo()
  {
    return iterationNo;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setIterationNo(String newIterationNo)
  {
    String oldIterationNo = iterationNo;
    iterationNo = newIterationNo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SATURN_RESULT__ITERATION_NO, oldIterationNo, iterationNo));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getMessage()
  {
    return message;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setMessage(String newMessage)
  {
    String oldMessage = message;
    message = newMessage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SATURN_RESULT__MESSAGE, oldMessage, message));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SATURN_RESULT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getStartTime()
  {
    return startTime;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setStartTime(String newStartTime)
  {
    String oldStartTime = startTime;
    startTime = newStartTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SATURN_RESULT__START_TIME, oldStartTime, startTime));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getStatus()
  {
    return status;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setStatus(String newStatus)
  {
    String oldStatus = status;
    status = newStatus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SATURN_RESULT__STATUS, oldStatus, status));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getStopTime()
  {
    return stopTime;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setStopTime(String newStopTime)
  {
    String oldStopTime = stopTime;
    stopTime = newStopTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SATURN_RESULT__STOP_TIME, oldStopTime, stopTime));
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
      case ResultPackage.SATURN_RESULT__STATUS:
        return getStatus();
      case ResultPackage.SATURN_RESULT__NAME:
        return getName();
      case ResultPackage.SATURN_RESULT__ITERATION_NO:
        return getIterationNo();
      case ResultPackage.SATURN_RESULT__START_TIME:
        return getStartTime();
      case ResultPackage.SATURN_RESULT__STOP_TIME:
        return getStopTime();
      case ResultPackage.SATURN_RESULT__MESSAGE:
        return getMessage();
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
      case ResultPackage.SATURN_RESULT__STATUS:
        setStatus((String)newValue);
        return;
      case ResultPackage.SATURN_RESULT__NAME:
        setName((String)newValue);
        return;
      case ResultPackage.SATURN_RESULT__ITERATION_NO:
        setIterationNo((String)newValue);
        return;
      case ResultPackage.SATURN_RESULT__START_TIME:
        setStartTime((String)newValue);
        return;
      case ResultPackage.SATURN_RESULT__STOP_TIME:
        setStopTime((String)newValue);
        return;
      case ResultPackage.SATURN_RESULT__MESSAGE:
        setMessage((String)newValue);
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
      case ResultPackage.SATURN_RESULT__STATUS:
        setStatus(STATUS_EDEFAULT);
        return;
      case ResultPackage.SATURN_RESULT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ResultPackage.SATURN_RESULT__ITERATION_NO:
        setIterationNo(ITERATION_NO_EDEFAULT);
        return;
      case ResultPackage.SATURN_RESULT__START_TIME:
        setStartTime(START_TIME_EDEFAULT);
        return;
      case ResultPackage.SATURN_RESULT__STOP_TIME:
        setStopTime(STOP_TIME_EDEFAULT);
        return;
      case ResultPackage.SATURN_RESULT__MESSAGE:
        setMessage(MESSAGE_EDEFAULT);
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
      case ResultPackage.SATURN_RESULT__STATUS:
        return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
      case ResultPackage.SATURN_RESULT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ResultPackage.SATURN_RESULT__ITERATION_NO:
        return ITERATION_NO_EDEFAULT == null ? iterationNo != null : !ITERATION_NO_EDEFAULT.equals(iterationNo);
      case ResultPackage.SATURN_RESULT__START_TIME:
        return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
      case ResultPackage.SATURN_RESULT__STOP_TIME:
        return STOP_TIME_EDEFAULT == null ? stopTime != null : !STOP_TIME_EDEFAULT.equals(stopTime);
      case ResultPackage.SATURN_RESULT__MESSAGE:
        return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
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
    result.append(" (status: ");
    result.append(status);
    result.append(", name: ");
    result.append(name);
    result.append(", iterationNo: ");
    result.append(iterationNo);
    result.append(", startTime: ");
    result.append(startTime);
    result.append(", stopTime: ");
    result.append(stopTime);
    result.append(", message: ");
    result.append(message);
    result.append(')');
    return result.toString();
  }

} // SaturnResultImpl
