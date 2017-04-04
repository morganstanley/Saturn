package com.ms.qaTools.saturn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.ProcedureCallStep;
import com.ms.qaTools.saturn.SaturnPackage;
import com.ms.qaTools.saturn.modules.procedureCallModule.ProcedureCallConfiguration;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Procedure Call Step</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.impl.ProcedureCallStepImpl#getProcedureCallConfiguration <em>Procedure Call Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureCallStepImpl extends AbstractStepImpl implements ProcedureCallStep
{
  /**
   * The cached value of the '{@link #getProcedureCallConfiguration() <em>Procedure Call Configuration</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getProcedureCallConfiguration()
   * @generated
   * @ordered
   */
  protected ProcedureCallConfiguration procedureCallConfiguration;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected ProcedureCallStepImpl()
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
    return SaturnPackage.Literals.PROCEDURE_CALL_STEP;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ProcedureCallConfiguration getProcedureCallConfiguration()
  {
    return procedureCallConfiguration;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProcedureCallConfiguration(ProcedureCallConfiguration newProcedureCallConfiguration,
      NotificationChain msgs)
  {
    ProcedureCallConfiguration oldProcedureCallConfiguration = procedureCallConfiguration;
    procedureCallConfiguration = newProcedureCallConfiguration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SaturnPackage.PROCEDURE_CALL_STEP__PROCEDURE_CALL_CONFIGURATION, oldProcedureCallConfiguration, newProcedureCallConfiguration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setProcedureCallConfiguration(ProcedureCallConfiguration newProcedureCallConfiguration)
  {
    if (newProcedureCallConfiguration != procedureCallConfiguration)
    {
      NotificationChain msgs = null;
      if (procedureCallConfiguration != null)
        msgs = ((InternalEObject)procedureCallConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SaturnPackage.PROCEDURE_CALL_STEP__PROCEDURE_CALL_CONFIGURATION, null, msgs);
      if (newProcedureCallConfiguration != null)
        msgs = ((InternalEObject)newProcedureCallConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SaturnPackage.PROCEDURE_CALL_STEP__PROCEDURE_CALL_CONFIGURATION, null, msgs);
      msgs = basicSetProcedureCallConfiguration(newProcedureCallConfiguration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.PROCEDURE_CALL_STEP__PROCEDURE_CALL_CONFIGURATION, newProcedureCallConfiguration, newProcedureCallConfiguration));
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
      case SaturnPackage.PROCEDURE_CALL_STEP__PROCEDURE_CALL_CONFIGURATION:
        return basicSetProcedureCallConfiguration(null, msgs);
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
      case SaturnPackage.PROCEDURE_CALL_STEP__PROCEDURE_CALL_CONFIGURATION:
        return getProcedureCallConfiguration();
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
      case SaturnPackage.PROCEDURE_CALL_STEP__PROCEDURE_CALL_CONFIGURATION:
        setProcedureCallConfiguration((ProcedureCallConfiguration)newValue);
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
      case SaturnPackage.PROCEDURE_CALL_STEP__PROCEDURE_CALL_CONFIGURATION:
        setProcedureCallConfiguration((ProcedureCallConfiguration)null);
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
      case SaturnPackage.PROCEDURE_CALL_STEP__PROCEDURE_CALL_CONFIGURATION:
        return procedureCallConfiguration != null;
    }
    return super.eIsSet(featureID);
  }

} // ProcedureCallStepImpl
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
