/**
 * COPYRIGHT NOTICE AND DISCLAIMER
 *  
 * Copyright © 2009, Contributor
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License, version 3 for more details.
 * You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
 * THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
 *
 * $Id$
 */
package com.ms.qaTools.saturn.resources.transactionResource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.resources.transactionResource.TerminationEvent;
import com.ms.qaTools.saturn.resources.transactionResource.TransactionResourcePackage;
import com.ms.qaTools.saturn.resources.transactionResource.TransactionTermination;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Termination Event</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.resources.transactionResource.impl.TerminationEventImpl#getOnFail <em>On Fail</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.transactionResource.impl.TerminationEventImpl#getOnPass <em>On Pass</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.transactionResource.impl.TerminationEventImpl#getOnWarn <em>On Warn</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TerminationEventImpl extends AbstractEventImpl implements TerminationEvent
{
  /**
   * The default value of the '{@link #getOnPass() <em>On Pass</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getOnPass()
   * @generated
   * @ordered
   */
  protected static final TransactionTermination ON_PASS_EDEFAULT = TransactionTermination.COMMIT;

  /**
   * The cached value of the '{@link #getOnPass() <em>On Pass</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getOnPass()
   * @generated
   * @ordered
   */
  protected TransactionTermination              onPass           = ON_PASS_EDEFAULT;

  /**
   * This is true if the On Pass attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                             onPassESet;

  /**
   * The default value of the '{@link #getOnFail() <em>On Fail</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getOnFail()
   * @generated
   * @ordered
   */
  protected static final TransactionTermination ON_FAIL_EDEFAULT = TransactionTermination.ROLLBACK;

  /**
   * The cached value of the '{@link #getOnFail() <em>On Fail</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getOnFail()
   * @generated
   * @ordered
   */
  protected TransactionTermination              onFail           = ON_FAIL_EDEFAULT;

  /**
   * This is true if the On Fail attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                             onFailESet;

  /**
   * The default value of the '{@link #getOnWarn() <em>On Warn</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getOnWarn()
   * @generated
   * @ordered
   */
  protected static final TransactionTermination ON_WARN_EDEFAULT = TransactionTermination.ROLLBACK;

  /**
   * The cached value of the '{@link #getOnWarn() <em>On Warn</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getOnWarn()
   * @generated
   * @ordered
   */
  protected TransactionTermination              onWarn           = ON_WARN_EDEFAULT;

  /**
   * This is true if the On Warn attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                             onWarnESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected TerminationEventImpl()
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
    return TransactionResourcePackage.Literals.TERMINATION_EVENT;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TransactionTermination getOnFail()
  {
    return onFail;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOnFail(TransactionTermination newOnFail)
  {
    TransactionTermination oldOnFail = onFail;
    onFail = newOnFail == null ? ON_FAIL_EDEFAULT : newOnFail;
    boolean oldOnFailESet = onFailESet;
    onFailESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransactionResourcePackage.TERMINATION_EVENT__ON_FAIL, oldOnFail, onFail, !oldOnFailESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetOnFail()
  {
    TransactionTermination oldOnFail = onFail;
    boolean oldOnFailESet = onFailESet;
    onFail = ON_FAIL_EDEFAULT;
    onFailESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, TransactionResourcePackage.TERMINATION_EVENT__ON_FAIL, oldOnFail, ON_FAIL_EDEFAULT, oldOnFailESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetOnFail()
  {
    return onFailESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TransactionTermination getOnPass()
  {
    return onPass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOnPass(TransactionTermination newOnPass)
  {
    TransactionTermination oldOnPass = onPass;
    onPass = newOnPass == null ? ON_PASS_EDEFAULT : newOnPass;
    boolean oldOnPassESet = onPassESet;
    onPassESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransactionResourcePackage.TERMINATION_EVENT__ON_PASS, oldOnPass, onPass, !oldOnPassESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetOnPass()
  {
    TransactionTermination oldOnPass = onPass;
    boolean oldOnPassESet = onPassESet;
    onPass = ON_PASS_EDEFAULT;
    onPassESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, TransactionResourcePackage.TERMINATION_EVENT__ON_PASS, oldOnPass, ON_PASS_EDEFAULT, oldOnPassESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetOnPass()
  {
    return onPassESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TransactionTermination getOnWarn()
  {
    return onWarn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOnWarn(TransactionTermination newOnWarn)
  {
    TransactionTermination oldOnWarn = onWarn;
    onWarn = newOnWarn == null ? ON_WARN_EDEFAULT : newOnWarn;
    boolean oldOnWarnESet = onWarnESet;
    onWarnESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransactionResourcePackage.TERMINATION_EVENT__ON_WARN, oldOnWarn, onWarn, !oldOnWarnESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetOnWarn()
  {
    TransactionTermination oldOnWarn = onWarn;
    boolean oldOnWarnESet = onWarnESet;
    onWarn = ON_WARN_EDEFAULT;
    onWarnESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, TransactionResourcePackage.TERMINATION_EVENT__ON_WARN, oldOnWarn, ON_WARN_EDEFAULT, oldOnWarnESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetOnWarn()
  {
    return onWarnESet;
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
      case TransactionResourcePackage.TERMINATION_EVENT__ON_PASS:
        return getOnPass();
      case TransactionResourcePackage.TERMINATION_EVENT__ON_FAIL:
        return getOnFail();
      case TransactionResourcePackage.TERMINATION_EVENT__ON_WARN:
        return getOnWarn();
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
      case TransactionResourcePackage.TERMINATION_EVENT__ON_PASS:
        setOnPass((TransactionTermination)newValue);
        return;
      case TransactionResourcePackage.TERMINATION_EVENT__ON_FAIL:
        setOnFail((TransactionTermination)newValue);
        return;
      case TransactionResourcePackage.TERMINATION_EVENT__ON_WARN:
        setOnWarn((TransactionTermination)newValue);
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
      case TransactionResourcePackage.TERMINATION_EVENT__ON_PASS:
        unsetOnPass();
        return;
      case TransactionResourcePackage.TERMINATION_EVENT__ON_FAIL:
        unsetOnFail();
        return;
      case TransactionResourcePackage.TERMINATION_EVENT__ON_WARN:
        unsetOnWarn();
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
      case TransactionResourcePackage.TERMINATION_EVENT__ON_PASS:
        return isSetOnPass();
      case TransactionResourcePackage.TERMINATION_EVENT__ON_FAIL:
        return isSetOnFail();
      case TransactionResourcePackage.TERMINATION_EVENT__ON_WARN:
        return isSetOnWarn();
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
    result.append(" (onPass: ");
    if (onPassESet) result.append(onPass); else result.append("<unset>");
    result.append(", onFail: ");
    if (onFailESet) result.append(onFail); else result.append("<unset>");
    result.append(", onWarn: ");
    if (onWarnESet) result.append(onWarn); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // TerminationEventImpl
