package com.ms.qaTools.saturn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.SaturnPackage;
import com.ms.qaTools.saturn.SoapIOStep;
import com.ms.qaTools.saturn.modules.soapIOModule.SoapIOConfiguration;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Soap IO Step</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.impl.SoapIOStepImpl#getSoapIOConfiguration <em>Soap IO Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoapIOStepImpl extends AbstractStepImpl implements SoapIOStep
{
  /**
   * The cached value of the '{@link #getSoapIOConfiguration() <em>Soap IO Configuration</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getSoapIOConfiguration()
   * @generated
   * @ordered
   */
  protected SoapIOConfiguration soapIOConfiguration;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected SoapIOStepImpl()
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
    return SaturnPackage.Literals.SOAP_IO_STEP;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SoapIOConfiguration getSoapIOConfiguration()
  {
    return soapIOConfiguration;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSoapIOConfiguration(SoapIOConfiguration newSoapIOConfiguration,
      NotificationChain msgs)
  {
    SoapIOConfiguration oldSoapIOConfiguration = soapIOConfiguration;
    soapIOConfiguration = newSoapIOConfiguration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SaturnPackage.SOAP_IO_STEP__SOAP_IO_CONFIGURATION, oldSoapIOConfiguration, newSoapIOConfiguration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSoapIOConfiguration(SoapIOConfiguration newSoapIOConfiguration)
  {
    if (newSoapIOConfiguration != soapIOConfiguration)
    {
      NotificationChain msgs = null;
      if (soapIOConfiguration != null)
        msgs = ((InternalEObject)soapIOConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SaturnPackage.SOAP_IO_STEP__SOAP_IO_CONFIGURATION, null, msgs);
      if (newSoapIOConfiguration != null)
        msgs = ((InternalEObject)newSoapIOConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SaturnPackage.SOAP_IO_STEP__SOAP_IO_CONFIGURATION, null, msgs);
      msgs = basicSetSoapIOConfiguration(newSoapIOConfiguration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.SOAP_IO_STEP__SOAP_IO_CONFIGURATION, newSoapIOConfiguration, newSoapIOConfiguration));
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
      case SaturnPackage.SOAP_IO_STEP__SOAP_IO_CONFIGURATION:
        return basicSetSoapIOConfiguration(null, msgs);
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
      case SaturnPackage.SOAP_IO_STEP__SOAP_IO_CONFIGURATION:
        return getSoapIOConfiguration();
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
      case SaturnPackage.SOAP_IO_STEP__SOAP_IO_CONFIGURATION:
        setSoapIOConfiguration((SoapIOConfiguration)newValue);
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
      case SaturnPackage.SOAP_IO_STEP__SOAP_IO_CONFIGURATION:
        setSoapIOConfiguration((SoapIOConfiguration)null);
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
      case SaturnPackage.SOAP_IO_STEP__SOAP_IO_CONFIGURATION:
        return soapIOConfiguration != null;
    }
    return super.eIsSet(featureID);
  }

} // SoapIOStepImpl
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
