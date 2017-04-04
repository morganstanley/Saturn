package com.ms.qaTools.saturn.modules.xmlDiffModule.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffColumn;
import com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffModulePackage;
import com.ms.qaTools.saturn.types.Column;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Xml Diff Column</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffColumnImpl#getColumnDesc <em>Column Desc</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffColumnImpl#getXPath <em>XPath</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffColumnImpl#isEnabled <em>Enabled</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffColumnImpl#getThreshold <em>Threshold</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class XmlDiffColumnImpl extends EObjectImpl implements XmlDiffColumn
{
  /**
   * The cached value of the '{@link #getColumnDesc() <em>Column Desc</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getColumnDesc()
   * @generated
   * @ordered
   */
  protected Column                  columnDesc;

  /**
   * The cached value of the '{@link #getXPath() <em>XPath</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getXPath()
   * @generated
   * @ordered
   */
  protected ComplexValue            xPath;

  /**
   * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected static final boolean    ENABLED_EDEFAULT   = true;

  /**
   * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected boolean                 enabled            = ENABLED_EDEFAULT;

  /**
   * This is true if the Enabled attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 enabledESet;

  /**
   * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getThreshold()
   * @generated
   * @ordered
   */
  protected static final BigInteger THRESHOLD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getThreshold()
   * @generated
   * @ordered
   */
  protected BigInteger              threshold          = THRESHOLD_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected XmlDiffColumnImpl()
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
    return XmlDiffModulePackage.Literals.XML_DIFF_COLUMN;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Column getColumnDesc()
  {
    return columnDesc;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColumnDesc(Column newColumnDesc, NotificationChain msgs)
  {
    Column oldColumnDesc = columnDesc;
    columnDesc = newColumnDesc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlDiffModulePackage.XML_DIFF_COLUMN__COLUMN_DESC, oldColumnDesc, newColumnDesc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setColumnDesc(Column newColumnDesc)
  {
    if (newColumnDesc != columnDesc)
    {
      NotificationChain msgs = null;
      if (columnDesc != null)
        msgs = ((InternalEObject)columnDesc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlDiffModulePackage.XML_DIFF_COLUMN__COLUMN_DESC, null, msgs);
      if (newColumnDesc != null)
        msgs = ((InternalEObject)newColumnDesc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlDiffModulePackage.XML_DIFF_COLUMN__COLUMN_DESC, null, msgs);
      msgs = basicSetColumnDesc(newColumnDesc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlDiffModulePackage.XML_DIFF_COLUMN__COLUMN_DESC, newColumnDesc, newColumnDesc));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getXPath()
  {
    return xPath;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetXPath(ComplexValue newXPath, NotificationChain msgs)
  {
    ComplexValue oldXPath = xPath;
    xPath = newXPath;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlDiffModulePackage.XML_DIFF_COLUMN__XPATH, oldXPath, newXPath);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setXPath(ComplexValue newXPath)
  {
    if (newXPath != xPath)
    {
      NotificationChain msgs = null;
      if (xPath != null)
        msgs = ((InternalEObject)xPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlDiffModulePackage.XML_DIFF_COLUMN__XPATH, null, msgs);
      if (newXPath != null)
        msgs = ((InternalEObject)newXPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlDiffModulePackage.XML_DIFF_COLUMN__XPATH, null, msgs);
      msgs = basicSetXPath(newXPath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlDiffModulePackage.XML_DIFF_COLUMN__XPATH, newXPath, newXPath));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isEnabled()
  {
    return enabled;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setEnabled(boolean newEnabled)
  {
    boolean oldEnabled = enabled;
    enabled = newEnabled;
    boolean oldEnabledESet = enabledESet;
    enabledESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlDiffModulePackage.XML_DIFF_COLUMN__ENABLED, oldEnabled, enabled, !oldEnabledESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetEnabled()
  {
    boolean oldEnabled = enabled;
    boolean oldEnabledESet = enabledESet;
    enabled = ENABLED_EDEFAULT;
    enabledESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, XmlDiffModulePackage.XML_DIFF_COLUMN__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetEnabled()
  {
    return enabledESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getThreshold()
  {
    return threshold;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setThreshold(BigInteger newThreshold)
  {
    BigInteger oldThreshold = threshold;
    threshold = newThreshold;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlDiffModulePackage.XML_DIFF_COLUMN__THRESHOLD, oldThreshold, threshold));
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
      case XmlDiffModulePackage.XML_DIFF_COLUMN__COLUMN_DESC:
        return basicSetColumnDesc(null, msgs);
      case XmlDiffModulePackage.XML_DIFF_COLUMN__XPATH:
        return basicSetXPath(null, msgs);
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
      case XmlDiffModulePackage.XML_DIFF_COLUMN__COLUMN_DESC:
        return getColumnDesc();
      case XmlDiffModulePackage.XML_DIFF_COLUMN__XPATH:
        return getXPath();
      case XmlDiffModulePackage.XML_DIFF_COLUMN__ENABLED:
        return isEnabled();
      case XmlDiffModulePackage.XML_DIFF_COLUMN__THRESHOLD:
        return getThreshold();
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
      case XmlDiffModulePackage.XML_DIFF_COLUMN__COLUMN_DESC:
        setColumnDesc((Column)newValue);
        return;
      case XmlDiffModulePackage.XML_DIFF_COLUMN__XPATH:
        setXPath((ComplexValue)newValue);
        return;
      case XmlDiffModulePackage.XML_DIFF_COLUMN__ENABLED:
        setEnabled((Boolean)newValue);
        return;
      case XmlDiffModulePackage.XML_DIFF_COLUMN__THRESHOLD:
        setThreshold((BigInteger)newValue);
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
      case XmlDiffModulePackage.XML_DIFF_COLUMN__COLUMN_DESC:
        setColumnDesc((Column)null);
        return;
      case XmlDiffModulePackage.XML_DIFF_COLUMN__XPATH:
        setXPath((ComplexValue)null);
        return;
      case XmlDiffModulePackage.XML_DIFF_COLUMN__ENABLED:
        unsetEnabled();
        return;
      case XmlDiffModulePackage.XML_DIFF_COLUMN__THRESHOLD:
        setThreshold(THRESHOLD_EDEFAULT);
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
      case XmlDiffModulePackage.XML_DIFF_COLUMN__COLUMN_DESC:
        return columnDesc != null;
      case XmlDiffModulePackage.XML_DIFF_COLUMN__XPATH:
        return xPath != null;
      case XmlDiffModulePackage.XML_DIFF_COLUMN__ENABLED:
        return isSetEnabled();
      case XmlDiffModulePackage.XML_DIFF_COLUMN__THRESHOLD:
        return THRESHOLD_EDEFAULT == null ? threshold != null : !THRESHOLD_EDEFAULT.equals(threshold);
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
    result.append(" (enabled: ");
    if (enabledESet) result.append(enabled); else result.append("<unset>");
    result.append(", threshold: ");
    result.append(threshold);
    result.append(')');
    return result.toString();
  }

} // XmlDiffColumnImpl
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
