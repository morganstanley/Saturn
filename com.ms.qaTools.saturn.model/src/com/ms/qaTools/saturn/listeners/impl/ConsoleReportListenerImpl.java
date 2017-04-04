package com.ms.qaTools.saturn.listeners.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.listeners.ConsoleReportListener;
import com.ms.qaTools.saturn.listeners.ListenersPackage;
import com.ms.qaTools.saturn.types.impl.AbstractListenerImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Console Report Listener</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.listeners.impl.ConsoleReportListenerImpl#getVerbosity <em>Verbosity</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.listeners.impl.ConsoleReportListenerImpl#isColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConsoleReportListenerImpl extends AbstractListenerImpl implements ConsoleReportListener
{
  /**
   * The default value of the '{@link #getVerbosity() <em>Verbosity</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getVerbosity()
   * @generated
   * @ordered
   */
  protected static final BigInteger VERBOSITY_EDEFAULT = new BigInteger("1");

  /**
   * The cached value of the '{@link #getVerbosity() <em>Verbosity</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getVerbosity()
   * @generated
   * @ordered
   */
  protected BigInteger              verbosity          = VERBOSITY_EDEFAULT;

  /**
   * This is true if the Verbosity attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 verbosityESet;

  /**
   * The default value of the '{@link #isColor() <em>Color</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isColor()
   * @generated
   * @ordered
   */
  protected static final boolean    COLOR_EDEFAULT     = true;

  /**
   * The cached value of the '{@link #isColor() <em>Color</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isColor()
   * @generated
   * @ordered
   */
  protected boolean                 color              = COLOR_EDEFAULT;

  /**
   * This is true if the Color attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 colorESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected ConsoleReportListenerImpl()
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
    return ListenersPackage.Literals.CONSOLE_REPORT_LISTENER;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isColor()
  {
    return color;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setColor(boolean newColor)
  {
    boolean oldColor = color;
    color = newColor;
    boolean oldColorESet = colorESet;
    colorESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ListenersPackage.CONSOLE_REPORT_LISTENER__COLOR, oldColor, color, !oldColorESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetColor()
  {
    boolean oldColor = color;
    boolean oldColorESet = colorESet;
    color = COLOR_EDEFAULT;
    colorESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ListenersPackage.CONSOLE_REPORT_LISTENER__COLOR, oldColor, COLOR_EDEFAULT, oldColorESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetColor()
  {
    return colorESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getVerbosity()
  {
    return verbosity;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setVerbosity(BigInteger newVerbosity)
  {
    BigInteger oldVerbosity = verbosity;
    verbosity = newVerbosity;
    boolean oldVerbosityESet = verbosityESet;
    verbosityESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ListenersPackage.CONSOLE_REPORT_LISTENER__VERBOSITY, oldVerbosity, verbosity, !oldVerbosityESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetVerbosity()
  {
    BigInteger oldVerbosity = verbosity;
    boolean oldVerbosityESet = verbosityESet;
    verbosity = VERBOSITY_EDEFAULT;
    verbosityESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ListenersPackage.CONSOLE_REPORT_LISTENER__VERBOSITY, oldVerbosity, VERBOSITY_EDEFAULT, oldVerbosityESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetVerbosity()
  {
    return verbosityESet;
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
      case ListenersPackage.CONSOLE_REPORT_LISTENER__VERBOSITY:
        return getVerbosity();
      case ListenersPackage.CONSOLE_REPORT_LISTENER__COLOR:
        return isColor();
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
      case ListenersPackage.CONSOLE_REPORT_LISTENER__VERBOSITY:
        setVerbosity((BigInteger)newValue);
        return;
      case ListenersPackage.CONSOLE_REPORT_LISTENER__COLOR:
        setColor((Boolean)newValue);
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
      case ListenersPackage.CONSOLE_REPORT_LISTENER__VERBOSITY:
        unsetVerbosity();
        return;
      case ListenersPackage.CONSOLE_REPORT_LISTENER__COLOR:
        unsetColor();
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
      case ListenersPackage.CONSOLE_REPORT_LISTENER__VERBOSITY:
        return isSetVerbosity();
      case ListenersPackage.CONSOLE_REPORT_LISTENER__COLOR:
        return isSetColor();
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
    result.append(" (verbosity: ");
    if (verbosityESet) result.append(verbosity); else result.append("<unset>");
    result.append(", color: ");
    if (colorESet) result.append(color); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // ConsoleReportListenerImpl
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
