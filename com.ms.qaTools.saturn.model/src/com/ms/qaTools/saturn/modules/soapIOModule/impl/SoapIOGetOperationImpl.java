package com.ms.qaTools.saturn.modules.soapIOModule.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.modules.soapIOModule.AbstractTerminationCondition;
import com.ms.qaTools.saturn.modules.soapIOModule.SoapIOGetOperation;
import com.ms.qaTools.saturn.modules.soapIOModule.SoapIOModulePackage;
import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Soap IO Get Operation</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOGetOperationImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOGetOperationImpl#getTerminationCondition <em>Termination Condition</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOGetOperationImpl#isExtractBody <em>Extract Body</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOGetOperationImpl#getMaxRetries <em>Max Retries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoapIOGetOperationImpl extends AbstractSoapIOOperationImpl implements SoapIOGetOperation
{
  /**
   * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getOutput()
   * @generated
   * @ordered
   */
  protected ResourceDefinition           output;

  /**
   * The cached value of the '{@link #getTerminationCondition() <em>Termination Condition</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getTerminationCondition()
   * @generated
   * @ordered
   */
  protected AbstractTerminationCondition terminationCondition;

  /**
   * The default value of the '{@link #isExtractBody() <em>Extract Body</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isExtractBody()
   * @generated
   * @ordered
   */
  protected static final boolean         EXTRACT_BODY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExtractBody() <em>Extract Body</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isExtractBody()
   * @generated
   * @ordered
   */
  protected boolean                      extractBody           = EXTRACT_BODY_EDEFAULT;

  /**
   * This is true if the Extract Body attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                      extractBodyESet;

  /**
   * The default value of the '{@link #getMaxRetries() <em>Max Retries</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getMaxRetries()
   * @generated
   * @ordered
   */
  protected static final BigInteger      MAX_RETRIES_EDEFAULT  = new BigInteger("1");

  /**
   * The cached value of the '{@link #getMaxRetries() <em>Max Retries</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getMaxRetries()
   * @generated
   * @ordered
   */
  protected BigInteger                   maxRetries            = MAX_RETRIES_EDEFAULT;

  /**
   * This is true if the Max Retries attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                      maxRetriesESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected SoapIOGetOperationImpl()
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
    return SoapIOModulePackage.Literals.SOAP_IO_GET_OPERATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getOutput()
  {
    return output;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutput(ResourceDefinition newOutput, NotificationChain msgs)
  {
    ResourceDefinition oldOutput = output;
    output = newOutput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOModulePackage.SOAP_IO_GET_OPERATION__OUTPUT, oldOutput, newOutput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOutput(ResourceDefinition newOutput)
  {
    if (newOutput != output)
    {
      NotificationChain msgs = null;
      if (output != null)
        msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOModulePackage.SOAP_IO_GET_OPERATION__OUTPUT, null, msgs);
      if (newOutput != null)
        msgs = ((InternalEObject)newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOModulePackage.SOAP_IO_GET_OPERATION__OUTPUT, null, msgs);
      msgs = basicSetOutput(newOutput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOModulePackage.SOAP_IO_GET_OPERATION__OUTPUT, newOutput, newOutput));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AbstractTerminationCondition getTerminationCondition()
  {
    return terminationCondition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTerminationCondition(AbstractTerminationCondition newTerminationCondition,
      NotificationChain msgs)
  {
    AbstractTerminationCondition oldTerminationCondition = terminationCondition;
    terminationCondition = newTerminationCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOModulePackage.SOAP_IO_GET_OPERATION__TERMINATION_CONDITION, oldTerminationCondition, newTerminationCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTerminationCondition(AbstractTerminationCondition newTerminationCondition)
  {
    if (newTerminationCondition != terminationCondition)
    {
      NotificationChain msgs = null;
      if (terminationCondition != null)
        msgs = ((InternalEObject)terminationCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOModulePackage.SOAP_IO_GET_OPERATION__TERMINATION_CONDITION, null, msgs);
      if (newTerminationCondition != null)
        msgs = ((InternalEObject)newTerminationCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOModulePackage.SOAP_IO_GET_OPERATION__TERMINATION_CONDITION, null, msgs);
      msgs = basicSetTerminationCondition(newTerminationCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOModulePackage.SOAP_IO_GET_OPERATION__TERMINATION_CONDITION, newTerminationCondition, newTerminationCondition));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isExtractBody()
  {
    return extractBody;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setExtractBody(boolean newExtractBody)
  {
    boolean oldExtractBody = extractBody;
    extractBody = newExtractBody;
    boolean oldExtractBodyESet = extractBodyESet;
    extractBodyESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOModulePackage.SOAP_IO_GET_OPERATION__EXTRACT_BODY, oldExtractBody, extractBody, !oldExtractBodyESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetExtractBody()
  {
    boolean oldExtractBody = extractBody;
    boolean oldExtractBodyESet = extractBodyESet;
    extractBody = EXTRACT_BODY_EDEFAULT;
    extractBodyESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SoapIOModulePackage.SOAP_IO_GET_OPERATION__EXTRACT_BODY, oldExtractBody, EXTRACT_BODY_EDEFAULT, oldExtractBodyESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetExtractBody()
  {
    return extractBodyESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getMaxRetries()
  {
    return maxRetries;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setMaxRetries(BigInteger newMaxRetries)
  {
    BigInteger oldMaxRetries = maxRetries;
    maxRetries = newMaxRetries;
    boolean oldMaxRetriesESet = maxRetriesESet;
    maxRetriesESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOModulePackage.SOAP_IO_GET_OPERATION__MAX_RETRIES, oldMaxRetries, maxRetries, !oldMaxRetriesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetMaxRetries()
  {
    BigInteger oldMaxRetries = maxRetries;
    boolean oldMaxRetriesESet = maxRetriesESet;
    maxRetries = MAX_RETRIES_EDEFAULT;
    maxRetriesESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SoapIOModulePackage.SOAP_IO_GET_OPERATION__MAX_RETRIES, oldMaxRetries, MAX_RETRIES_EDEFAULT, oldMaxRetriesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetMaxRetries()
  {
    return maxRetriesESet;
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
      case SoapIOModulePackage.SOAP_IO_GET_OPERATION__OUTPUT:
        return basicSetOutput(null, msgs);
      case SoapIOModulePackage.SOAP_IO_GET_OPERATION__TERMINATION_CONDITION:
        return basicSetTerminationCondition(null, msgs);
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
      case SoapIOModulePackage.SOAP_IO_GET_OPERATION__OUTPUT:
        return getOutput();
      case SoapIOModulePackage.SOAP_IO_GET_OPERATION__TERMINATION_CONDITION:
        return getTerminationCondition();
      case SoapIOModulePackage.SOAP_IO_GET_OPERATION__EXTRACT_BODY:
        return isExtractBody();
      case SoapIOModulePackage.SOAP_IO_GET_OPERATION__MAX_RETRIES:
        return getMaxRetries();
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
      case SoapIOModulePackage.SOAP_IO_GET_OPERATION__OUTPUT:
        setOutput((ResourceDefinition)newValue);
        return;
      case SoapIOModulePackage.SOAP_IO_GET_OPERATION__TERMINATION_CONDITION:
        setTerminationCondition((AbstractTerminationCondition)newValue);
        return;
      case SoapIOModulePackage.SOAP_IO_GET_OPERATION__EXTRACT_BODY:
        setExtractBody((Boolean)newValue);
        return;
      case SoapIOModulePackage.SOAP_IO_GET_OPERATION__MAX_RETRIES:
        setMaxRetries((BigInteger)newValue);
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
      case SoapIOModulePackage.SOAP_IO_GET_OPERATION__OUTPUT:
        setOutput((ResourceDefinition)null);
        return;
      case SoapIOModulePackage.SOAP_IO_GET_OPERATION__TERMINATION_CONDITION:
        setTerminationCondition((AbstractTerminationCondition)null);
        return;
      case SoapIOModulePackage.SOAP_IO_GET_OPERATION__EXTRACT_BODY:
        unsetExtractBody();
        return;
      case SoapIOModulePackage.SOAP_IO_GET_OPERATION__MAX_RETRIES:
        unsetMaxRetries();
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
      case SoapIOModulePackage.SOAP_IO_GET_OPERATION__OUTPUT:
        return output != null;
      case SoapIOModulePackage.SOAP_IO_GET_OPERATION__TERMINATION_CONDITION:
        return terminationCondition != null;
      case SoapIOModulePackage.SOAP_IO_GET_OPERATION__EXTRACT_BODY:
        return isSetExtractBody();
      case SoapIOModulePackage.SOAP_IO_GET_OPERATION__MAX_RETRIES:
        return isSetMaxRetries();
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
    result.append(" (extractBody: ");
    if (extractBodyESet) result.append(extractBody); else result.append("<unset>");
    result.append(", maxRetries: ");
    if (maxRetriesESet) result.append(maxRetries); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // SoapIOGetOperationImpl
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
