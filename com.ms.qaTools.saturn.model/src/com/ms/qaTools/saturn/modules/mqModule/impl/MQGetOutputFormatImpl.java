package com.ms.qaTools.saturn.modules.mqModule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.ms.qaTools.saturn.modules.mqModule.MQGetOutputFormat;
import com.ms.qaTools.saturn.modules.mqModule.MqModulePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>MQ Get Output Format</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQGetOutputFormatImpl#isNoCps <em>No Cps</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQGetOutputFormatImpl#isNoCrLf <em>No Cr Lf</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQGetOutputFormatImpl#isOneLine <em>One Line</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MQGetOutputFormatImpl extends EObjectImpl implements MQGetOutputFormat
{
  /**
   * The default value of the '{@link #isNoCps() <em>No Cps</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isNoCps()
   * @generated
   * @ordered
   */
  protected static final boolean NO_CPS_EDEFAULT   = false;

  /**
   * The cached value of the '{@link #isNoCps() <em>No Cps</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isNoCps()
   * @generated
   * @ordered
   */
  protected boolean              noCps             = NO_CPS_EDEFAULT;

  /**
   * This is true if the No Cps attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              noCpsESet;

  /**
   * The default value of the '{@link #isNoCrLf() <em>No Cr Lf</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isNoCrLf()
   * @generated
   * @ordered
   */
  protected static final boolean NO_CR_LF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNoCrLf() <em>No Cr Lf</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isNoCrLf()
   * @generated
   * @ordered
   */
  protected boolean              noCrLf            = NO_CR_LF_EDEFAULT;

  /**
   * This is true if the No Cr Lf attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              noCrLfESet;

  /**
   * The default value of the '{@link #isOneLine() <em>One Line</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isOneLine()
   * @generated
   * @ordered
   */
  protected static final boolean ONE_LINE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOneLine() <em>One Line</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isOneLine()
   * @generated
   * @ordered
   */
  protected boolean              oneLine           = ONE_LINE_EDEFAULT;

  /**
   * This is true if the One Line attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              oneLineESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected MQGetOutputFormatImpl()
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
    return MqModulePackage.Literals.MQ_GET_OUTPUT_FORMAT;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isNoCps()
  {
    return noCps;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setNoCps(boolean newNoCps)
  {
    boolean oldNoCps = noCps;
    noCps = newNoCps;
    boolean oldNoCpsESet = noCpsESet;
    noCpsESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_GET_OUTPUT_FORMAT__NO_CPS, oldNoCps, noCps, !oldNoCpsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetNoCps()
  {
    boolean oldNoCps = noCps;
    boolean oldNoCpsESet = noCpsESet;
    noCps = NO_CPS_EDEFAULT;
    noCpsESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MqModulePackage.MQ_GET_OUTPUT_FORMAT__NO_CPS, oldNoCps, NO_CPS_EDEFAULT, oldNoCpsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetNoCps()
  {
    return noCpsESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isNoCrLf()
  {
    return noCrLf;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setNoCrLf(boolean newNoCrLf)
  {
    boolean oldNoCrLf = noCrLf;
    noCrLf = newNoCrLf;
    boolean oldNoCrLfESet = noCrLfESet;
    noCrLfESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_GET_OUTPUT_FORMAT__NO_CR_LF, oldNoCrLf, noCrLf, !oldNoCrLfESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetNoCrLf()
  {
    boolean oldNoCrLf = noCrLf;
    boolean oldNoCrLfESet = noCrLfESet;
    noCrLf = NO_CR_LF_EDEFAULT;
    noCrLfESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MqModulePackage.MQ_GET_OUTPUT_FORMAT__NO_CR_LF, oldNoCrLf, NO_CR_LF_EDEFAULT, oldNoCrLfESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetNoCrLf()
  {
    return noCrLfESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isOneLine()
  {
    return oneLine;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOneLine(boolean newOneLine)
  {
    boolean oldOneLine = oneLine;
    oneLine = newOneLine;
    boolean oldOneLineESet = oneLineESet;
    oneLineESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_GET_OUTPUT_FORMAT__ONE_LINE, oldOneLine, oneLine, !oldOneLineESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetOneLine()
  {
    boolean oldOneLine = oneLine;
    boolean oldOneLineESet = oneLineESet;
    oneLine = ONE_LINE_EDEFAULT;
    oneLineESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MqModulePackage.MQ_GET_OUTPUT_FORMAT__ONE_LINE, oldOneLine, ONE_LINE_EDEFAULT, oldOneLineESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetOneLine()
  {
    return oneLineESet;
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
      case MqModulePackage.MQ_GET_OUTPUT_FORMAT__NO_CPS:
        return isNoCps();
      case MqModulePackage.MQ_GET_OUTPUT_FORMAT__NO_CR_LF:
        return isNoCrLf();
      case MqModulePackage.MQ_GET_OUTPUT_FORMAT__ONE_LINE:
        return isOneLine();
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
      case MqModulePackage.MQ_GET_OUTPUT_FORMAT__NO_CPS:
        setNoCps((Boolean)newValue);
        return;
      case MqModulePackage.MQ_GET_OUTPUT_FORMAT__NO_CR_LF:
        setNoCrLf((Boolean)newValue);
        return;
      case MqModulePackage.MQ_GET_OUTPUT_FORMAT__ONE_LINE:
        setOneLine((Boolean)newValue);
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
      case MqModulePackage.MQ_GET_OUTPUT_FORMAT__NO_CPS:
        unsetNoCps();
        return;
      case MqModulePackage.MQ_GET_OUTPUT_FORMAT__NO_CR_LF:
        unsetNoCrLf();
        return;
      case MqModulePackage.MQ_GET_OUTPUT_FORMAT__ONE_LINE:
        unsetOneLine();
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
      case MqModulePackage.MQ_GET_OUTPUT_FORMAT__NO_CPS:
        return isSetNoCps();
      case MqModulePackage.MQ_GET_OUTPUT_FORMAT__NO_CR_LF:
        return isSetNoCrLf();
      case MqModulePackage.MQ_GET_OUTPUT_FORMAT__ONE_LINE:
        return isSetOneLine();
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
    result.append(" (noCps: ");
    if (noCpsESet) result.append(noCps); else result.append("<unset>");
    result.append(", noCrLf: ");
    if (noCrLfESet) result.append(noCrLf); else result.append("<unset>");
    result.append(", oneLine: ");
    if (oneLineESet) result.append(oneLine); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // MQGetOutputFormatImpl
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
