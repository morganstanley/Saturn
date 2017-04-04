package com.ms.qaTools.saturn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.SaturnPackage;
import com.ms.qaTools.saturn.Xml2CsvStep;
import com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Xml2 Csv Step</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.impl.Xml2CsvStepImpl#getXml2CsvConfiguration <em>Xml2 Csv Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Xml2CsvStepImpl extends AbstractStepImpl implements Xml2CsvStep
{
  /**
   * The cached value of the '{@link #getXml2CsvConfiguration() <em>Xml2 Csv Configuration</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getXml2CsvConfiguration()
   * @generated
   * @ordered
   */
  protected Xml2CsvConfiguration xml2CsvConfiguration;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected Xml2CsvStepImpl()
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
    return SaturnPackage.Literals.XML2_CSV_STEP;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Xml2CsvConfiguration getXml2CsvConfiguration()
  {
    return xml2CsvConfiguration;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetXml2CsvConfiguration(Xml2CsvConfiguration newXml2CsvConfiguration,
      NotificationChain msgs)
  {
    Xml2CsvConfiguration oldXml2CsvConfiguration = xml2CsvConfiguration;
    xml2CsvConfiguration = newXml2CsvConfiguration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SaturnPackage.XML2_CSV_STEP__XML2_CSV_CONFIGURATION, oldXml2CsvConfiguration, newXml2CsvConfiguration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setXml2CsvConfiguration(Xml2CsvConfiguration newXml2CsvConfiguration)
  {
    if (newXml2CsvConfiguration != xml2CsvConfiguration)
    {
      NotificationChain msgs = null;
      if (xml2CsvConfiguration != null)
        msgs = ((InternalEObject)xml2CsvConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SaturnPackage.XML2_CSV_STEP__XML2_CSV_CONFIGURATION, null, msgs);
      if (newXml2CsvConfiguration != null)
        msgs = ((InternalEObject)newXml2CsvConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SaturnPackage.XML2_CSV_STEP__XML2_CSV_CONFIGURATION, null, msgs);
      msgs = basicSetXml2CsvConfiguration(newXml2CsvConfiguration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.XML2_CSV_STEP__XML2_CSV_CONFIGURATION, newXml2CsvConfiguration, newXml2CsvConfiguration));
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
      case SaturnPackage.XML2_CSV_STEP__XML2_CSV_CONFIGURATION:
        return basicSetXml2CsvConfiguration(null, msgs);
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
      case SaturnPackage.XML2_CSV_STEP__XML2_CSV_CONFIGURATION:
        return getXml2CsvConfiguration();
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
      case SaturnPackage.XML2_CSV_STEP__XML2_CSV_CONFIGURATION:
        setXml2CsvConfiguration((Xml2CsvConfiguration)newValue);
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
      case SaturnPackage.XML2_CSV_STEP__XML2_CSV_CONFIGURATION:
        setXml2CsvConfiguration((Xml2CsvConfiguration)null);
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
      case SaturnPackage.XML2_CSV_STEP__XML2_CSV_CONFIGURATION:
        return xml2CsvConfiguration != null;
    }
    return super.eIsSet(featureID);
  }

} // Xml2CsvStepImpl
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
