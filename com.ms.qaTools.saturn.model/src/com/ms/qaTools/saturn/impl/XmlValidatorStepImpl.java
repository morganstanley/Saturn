package com.ms.qaTools.saturn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.SaturnPackage;
import com.ms.qaTools.saturn.XmlValidatorStep;
import com.ms.qaTools.saturn.modules.xmlValidatorModule.XmlValidatorConfiguration;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Xml Validator Step</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.impl.XmlValidatorStepImpl#getXmlValidatorConfiguration <em>Xml Validator
 * Configuration</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class XmlValidatorStepImpl extends AbstractStepImpl implements XmlValidatorStep
{
  /**
   * The cached value of the '{@link #getXmlValidatorConfiguration() <em>Xml Validator Configuration</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getXmlValidatorConfiguration()
   * @generated
   * @ordered
   */
  protected XmlValidatorConfiguration xmlValidatorConfiguration;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected XmlValidatorStepImpl()
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
    return SaturnPackage.Literals.XML_VALIDATOR_STEP;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlValidatorConfiguration getXmlValidatorConfiguration()
  {
    return xmlValidatorConfiguration;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetXmlValidatorConfiguration(XmlValidatorConfiguration newXmlValidatorConfiguration,
      NotificationChain msgs)
  {
    XmlValidatorConfiguration oldXmlValidatorConfiguration = xmlValidatorConfiguration;
    xmlValidatorConfiguration = newXmlValidatorConfiguration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SaturnPackage.XML_VALIDATOR_STEP__XML_VALIDATOR_CONFIGURATION, oldXmlValidatorConfiguration, newXmlValidatorConfiguration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setXmlValidatorConfiguration(XmlValidatorConfiguration newXmlValidatorConfiguration)
  {
    if (newXmlValidatorConfiguration != xmlValidatorConfiguration)
    {
      NotificationChain msgs = null;
      if (xmlValidatorConfiguration != null)
        msgs = ((InternalEObject)xmlValidatorConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SaturnPackage.XML_VALIDATOR_STEP__XML_VALIDATOR_CONFIGURATION, null, msgs);
      if (newXmlValidatorConfiguration != null)
        msgs = ((InternalEObject)newXmlValidatorConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SaturnPackage.XML_VALIDATOR_STEP__XML_VALIDATOR_CONFIGURATION, null, msgs);
      msgs = basicSetXmlValidatorConfiguration(newXmlValidatorConfiguration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.XML_VALIDATOR_STEP__XML_VALIDATOR_CONFIGURATION, newXmlValidatorConfiguration, newXmlValidatorConfiguration));
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
      case SaturnPackage.XML_VALIDATOR_STEP__XML_VALIDATOR_CONFIGURATION:
        return basicSetXmlValidatorConfiguration(null, msgs);
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
      case SaturnPackage.XML_VALIDATOR_STEP__XML_VALIDATOR_CONFIGURATION:
        return getXmlValidatorConfiguration();
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
      case SaturnPackage.XML_VALIDATOR_STEP__XML_VALIDATOR_CONFIGURATION:
        setXmlValidatorConfiguration((XmlValidatorConfiguration)newValue);
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
      case SaturnPackage.XML_VALIDATOR_STEP__XML_VALIDATOR_CONFIGURATION:
        setXmlValidatorConfiguration((XmlValidatorConfiguration)null);
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
      case SaturnPackage.XML_VALIDATOR_STEP__XML_VALIDATOR_CONFIGURATION:
        return xmlValidatorConfiguration != null;
    }
    return super.eIsSet(featureID);
  }

} // XmlValidatorStepImpl
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
