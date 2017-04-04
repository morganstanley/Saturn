package com.ms.qaTools.saturn.annotations.saturnWeb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage;
import com.ms.qaTools.saturn.annotations.saturnWeb.TextSourceDefinition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Text Source Definition</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.TextSourceDefinitionImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.TextSourceDefinitionImpl#isMultiLine <em>Multi Line</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.TextSourceDefinitionImpl#isPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextSourceDefinitionImpl extends AbstractSourceDefinitionImpl implements TextSourceDefinition
{
  /**
   * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected static final String  DEFAULT_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected String               defaultValue           = DEFAULT_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isMultiLine() <em>Multi Line</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isMultiLine()
   * @generated
   * @ordered
   */
  protected static final boolean MULTI_LINE_EDEFAULT    = false;

  /**
   * The cached value of the '{@link #isMultiLine() <em>Multi Line</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isMultiLine()
   * @generated
   * @ordered
   */
  protected boolean              multiLine              = MULTI_LINE_EDEFAULT;

  /**
   * This is true if the Multi Line attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              multiLineESet;

  /**
   * The default value of the '{@link #isPassword() <em>Password</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isPassword()
   * @generated
   * @ordered
   */
  protected static final boolean PASSWORD_EDEFAULT      = false;

  /**
   * The cached value of the '{@link #isPassword() <em>Password</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isPassword()
   * @generated
   * @ordered
   */
  protected boolean              password               = PASSWORD_EDEFAULT;

  /**
   * This is true if the Password attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              passwordESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected TextSourceDefinitionImpl()
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
    return SaturnWebPackage.Literals.TEXT_SOURCE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getDefaultValue()
  {
    return defaultValue;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultValue(String newDefaultValue)
  {
    String oldDefaultValue = defaultValue;
    defaultValue = newDefaultValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnWebPackage.TEXT_SOURCE_DEFINITION__DEFAULT_VALUE, oldDefaultValue, defaultValue));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isMultiLine()
  {
    return multiLine;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setMultiLine(boolean newMultiLine)
  {
    boolean oldMultiLine = multiLine;
    multiLine = newMultiLine;
    boolean oldMultiLineESet = multiLineESet;
    multiLineESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnWebPackage.TEXT_SOURCE_DEFINITION__MULTI_LINE, oldMultiLine, multiLine, !oldMultiLineESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetMultiLine()
  {
    boolean oldMultiLine = multiLine;
    boolean oldMultiLineESet = multiLineESet;
    multiLine = MULTI_LINE_EDEFAULT;
    multiLineESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnWebPackage.TEXT_SOURCE_DEFINITION__MULTI_LINE, oldMultiLine, MULTI_LINE_EDEFAULT, oldMultiLineESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetMultiLine()
  {
    return multiLineESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isPassword()
  {
    return password;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setPassword(boolean newPassword)
  {
    boolean oldPassword = password;
    password = newPassword;
    boolean oldPasswordESet = passwordESet;
    passwordESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnWebPackage.TEXT_SOURCE_DEFINITION__PASSWORD, oldPassword, password, !oldPasswordESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetPassword()
  {
    boolean oldPassword = password;
    boolean oldPasswordESet = passwordESet;
    password = PASSWORD_EDEFAULT;
    passwordESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnWebPackage.TEXT_SOURCE_DEFINITION__PASSWORD, oldPassword, PASSWORD_EDEFAULT, oldPasswordESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetPassword()
  {
    return passwordESet;
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
      case SaturnWebPackage.TEXT_SOURCE_DEFINITION__DEFAULT_VALUE:
        return getDefaultValue();
      case SaturnWebPackage.TEXT_SOURCE_DEFINITION__MULTI_LINE:
        return isMultiLine();
      case SaturnWebPackage.TEXT_SOURCE_DEFINITION__PASSWORD:
        return isPassword();
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
      case SaturnWebPackage.TEXT_SOURCE_DEFINITION__DEFAULT_VALUE:
        setDefaultValue((String)newValue);
        return;
      case SaturnWebPackage.TEXT_SOURCE_DEFINITION__MULTI_LINE:
        setMultiLine((Boolean)newValue);
        return;
      case SaturnWebPackage.TEXT_SOURCE_DEFINITION__PASSWORD:
        setPassword((Boolean)newValue);
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
      case SaturnWebPackage.TEXT_SOURCE_DEFINITION__DEFAULT_VALUE:
        setDefaultValue(DEFAULT_VALUE_EDEFAULT);
        return;
      case SaturnWebPackage.TEXT_SOURCE_DEFINITION__MULTI_LINE:
        unsetMultiLine();
        return;
      case SaturnWebPackage.TEXT_SOURCE_DEFINITION__PASSWORD:
        unsetPassword();
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
      case SaturnWebPackage.TEXT_SOURCE_DEFINITION__DEFAULT_VALUE:
        return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
      case SaturnWebPackage.TEXT_SOURCE_DEFINITION__MULTI_LINE:
        return isSetMultiLine();
      case SaturnWebPackage.TEXT_SOURCE_DEFINITION__PASSWORD:
        return isSetPassword();
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
    result.append(" (defaultValue: ");
    result.append(defaultValue);
    result.append(", multiLine: ");
    if (multiLineESet) result.append(multiLine); else result.append("<unset>");
    result.append(", password: ");
    if (passwordESet) result.append(password); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // TextSourceDefinitionImpl
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
