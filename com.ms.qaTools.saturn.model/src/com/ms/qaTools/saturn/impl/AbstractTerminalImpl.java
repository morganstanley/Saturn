package com.ms.qaTools.saturn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.AbstractTerminal;
import com.ms.qaTools.saturn.SaturnPackage;
import com.ms.qaTools.saturn.types.RepetitionActionsEnum;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Abstract Terminal</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.impl.AbstractTerminalImpl#getRepetitionAction <em>Repetition Action</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.impl.AbstractTerminalImpl#getTerminationStatus <em>Termination Status</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class AbstractTerminalImpl extends AbstractStepImpl implements AbstractTerminal
{
  /**
   * The default value of the '{@link #getRepetitionAction() <em>Repetition Action</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getRepetitionAction()
   * @generated
   * @ordered
   */
  protected static final RepetitionActionsEnum REPETITION_ACTION_EDEFAULT  = RepetitionActionsEnum.NONE;

  /**
   * The cached value of the '{@link #getRepetitionAction() <em>Repetition Action</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getRepetitionAction()
   * @generated
   * @ordered
   */
  protected RepetitionActionsEnum              repetitionAction            = REPETITION_ACTION_EDEFAULT;

  /**
   * This is true if the Repetition Action attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                            repetitionActionESet;

  /**
   * The default value of the '{@link #getTerminationStatus() <em>Termination Status</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getTerminationStatus()
   * @generated
   * @ordered
   */
  protected static final String                TERMINATION_STATUS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTerminationStatus() <em>Termination Status</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getTerminationStatus()
   * @generated
   * @ordered
   */
  protected String                             terminationStatus           = TERMINATION_STATUS_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected AbstractTerminalImpl()
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
    return SaturnPackage.Literals.ABSTRACT_TERMINAL;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public RepetitionActionsEnum getRepetitionAction()
  {
    return repetitionAction;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRepetitionAction(RepetitionActionsEnum newRepetitionAction)
  {
    RepetitionActionsEnum oldRepetitionAction = repetitionAction;
    repetitionAction = newRepetitionAction == null ? REPETITION_ACTION_EDEFAULT : newRepetitionAction;
    boolean oldRepetitionActionESet = repetitionActionESet;
    repetitionActionESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.ABSTRACT_TERMINAL__REPETITION_ACTION, oldRepetitionAction, repetitionAction, !oldRepetitionActionESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetRepetitionAction()
  {
    RepetitionActionsEnum oldRepetitionAction = repetitionAction;
    boolean oldRepetitionActionESet = repetitionActionESet;
    repetitionAction = REPETITION_ACTION_EDEFAULT;
    repetitionActionESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnPackage.ABSTRACT_TERMINAL__REPETITION_ACTION, oldRepetitionAction, REPETITION_ACTION_EDEFAULT, oldRepetitionActionESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetRepetitionAction()
  {
    return repetitionActionESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getTerminationStatus()
  {
    return terminationStatus;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTerminationStatus(String newTerminationStatus)
  {
    String oldTerminationStatus = terminationStatus;
    terminationStatus = newTerminationStatus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.ABSTRACT_TERMINAL__TERMINATION_STATUS, oldTerminationStatus, terminationStatus));
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
      case SaturnPackage.ABSTRACT_TERMINAL__REPETITION_ACTION:
        return getRepetitionAction();
      case SaturnPackage.ABSTRACT_TERMINAL__TERMINATION_STATUS:
        return getTerminationStatus();
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
      case SaturnPackage.ABSTRACT_TERMINAL__REPETITION_ACTION:
        setRepetitionAction((RepetitionActionsEnum)newValue);
        return;
      case SaturnPackage.ABSTRACT_TERMINAL__TERMINATION_STATUS:
        setTerminationStatus((String)newValue);
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
      case SaturnPackage.ABSTRACT_TERMINAL__REPETITION_ACTION:
        unsetRepetitionAction();
        return;
      case SaturnPackage.ABSTRACT_TERMINAL__TERMINATION_STATUS:
        setTerminationStatus(TERMINATION_STATUS_EDEFAULT);
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
      case SaturnPackage.ABSTRACT_TERMINAL__REPETITION_ACTION:
        return isSetRepetitionAction();
      case SaturnPackage.ABSTRACT_TERMINAL__TERMINATION_STATUS:
        return TERMINATION_STATUS_EDEFAULT == null ? terminationStatus != null : !TERMINATION_STATUS_EDEFAULT.equals(terminationStatus);
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
    result.append(" (repetitionAction: ");
    if (repetitionActionESet) result.append(repetitionAction); else result.append("<unset>");
    result.append(", terminationStatus: ");
    result.append(terminationStatus);
    result.append(')');
    return result.toString();
  }

} // AbstractTerminalImpl
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
