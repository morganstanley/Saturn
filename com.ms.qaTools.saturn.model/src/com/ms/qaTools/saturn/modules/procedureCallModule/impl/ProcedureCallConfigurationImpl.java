package com.ms.qaTools.saturn.modules.procedureCallModule.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ms.qaTools.saturn.modules.procedureCallModule.AbstractArgument;
import com.ms.qaTools.saturn.modules.procedureCallModule.ProcedureCallConfiguration;
import com.ms.qaTools.saturn.modules.procedureCallModule.ProcedureCallModulePackage;
import com.ms.qaTools.saturn.result.SaturnResult;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Procedure Call Configuration</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.procedureCallModule.impl.ProcedureCallConfigurationImpl#getRunGroup <em>Run Group</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.procedureCallModule.impl.ProcedureCallConfigurationImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.procedureCallModule.impl.ProcedureCallConfigurationImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.procedureCallModule.impl.ProcedureCallConfigurationImpl#getReferentResult <em>Referent Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureCallConfigurationImpl extends EObjectImpl implements ProcedureCallConfiguration
{
  /**
   * The cached value of the '{@link #getRunGroup() <em>Run Group</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRunGroup()
   * @generated
   * @ordered
   */
  protected ComplexValue            runGroup;

  /**
   * The cached value of the '{@link #getInclude() <em>Include</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInclude()
   * @generated
   * @ordered
   */
  protected ComplexValue            include;

  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected EList<AbstractArgument> arguments;

  /**
   * The cached value of the '{@link #getReferentResult() <em>Referent Result</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getReferentResult()
   * @generated
   * @ordered
   */
  protected SaturnResult            referentResult;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected ProcedureCallConfigurationImpl()
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
    return ProcedureCallModulePackage.Literals.PROCEDURE_CALL_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getRunGroup()
  {
    return runGroup;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRunGroup(ComplexValue newRunGroup, NotificationChain msgs)
  {
    ComplexValue oldRunGroup = runGroup;
    runGroup = newRunGroup;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__RUN_GROUP, oldRunGroup, newRunGroup);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRunGroup(ComplexValue newRunGroup)
  {
    if (newRunGroup != runGroup)
    {
      NotificationChain msgs = null;
      if (runGroup != null)
        msgs = ((InternalEObject)runGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__RUN_GROUP, null, msgs);
      if (newRunGroup != null)
        msgs = ((InternalEObject)newRunGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__RUN_GROUP, null, msgs);
      msgs = basicSetRunGroup(newRunGroup, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__RUN_GROUP, newRunGroup, newRunGroup));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getInclude()
  {
    return include;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInclude(ComplexValue newInclude, NotificationChain msgs)
  {
    ComplexValue oldInclude = include;
    include = newInclude;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__INCLUDE, oldInclude, newInclude);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setInclude(ComplexValue newInclude)
  {
    if (newInclude != include)
    {
      NotificationChain msgs = null;
      if (include != null)
        msgs = ((InternalEObject)include).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__INCLUDE, null, msgs);
      if (newInclude != null)
        msgs = ((InternalEObject)newInclude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__INCLUDE, null, msgs);
      msgs = basicSetInclude(newInclude, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__INCLUDE, newInclude, newInclude));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractArgument> getArguments()
  {
    if (arguments == null)
    {
      arguments = new EObjectContainmentEList<AbstractArgument>(AbstractArgument.class, this, ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__ARGUMENTS);
    }
    return arguments;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SaturnResult getReferentResult()
  {
    return referentResult;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReferentResult(SaturnResult newReferentResult, NotificationChain msgs)
  {
    SaturnResult oldReferentResult = referentResult;
    referentResult = newReferentResult;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__REFERENT_RESULT, oldReferentResult, newReferentResult);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setReferentResult(SaturnResult newReferentResult)
  {
    if (newReferentResult != referentResult)
    {
      NotificationChain msgs = null;
      if (referentResult != null)
        msgs = ((InternalEObject)referentResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__REFERENT_RESULT, null, msgs);
      if (newReferentResult != null)
        msgs = ((InternalEObject)newReferentResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__REFERENT_RESULT, null, msgs);
      msgs = basicSetReferentResult(newReferentResult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__REFERENT_RESULT, newReferentResult, newReferentResult));
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
      case ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__RUN_GROUP:
        return basicSetRunGroup(null, msgs);
      case ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__INCLUDE:
        return basicSetInclude(null, msgs);
      case ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__ARGUMENTS:
        return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
      case ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__REFERENT_RESULT:
        return basicSetReferentResult(null, msgs);
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
      case ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__RUN_GROUP:
        return getRunGroup();
      case ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__INCLUDE:
        return getInclude();
      case ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__ARGUMENTS:
        return getArguments();
      case ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__REFERENT_RESULT:
        return getReferentResult();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__RUN_GROUP:
        setRunGroup((ComplexValue)newValue);
        return;
      case ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__INCLUDE:
        setInclude((ComplexValue)newValue);
        return;
      case ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__ARGUMENTS:
        getArguments().clear();
        getArguments().addAll((Collection<? extends AbstractArgument>)newValue);
        return;
      case ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__REFERENT_RESULT:
        setReferentResult((SaturnResult)newValue);
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
      case ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__RUN_GROUP:
        setRunGroup((ComplexValue)null);
        return;
      case ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__INCLUDE:
        setInclude((ComplexValue)null);
        return;
      case ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__ARGUMENTS:
        getArguments().clear();
        return;
      case ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__REFERENT_RESULT:
        setReferentResult((SaturnResult)null);
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
      case ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__RUN_GROUP:
        return runGroup != null;
      case ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__INCLUDE:
        return include != null;
      case ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__ARGUMENTS:
        return arguments != null && !arguments.isEmpty();
      case ProcedureCallModulePackage.PROCEDURE_CALL_CONFIGURATION__REFERENT_RESULT:
        return referentResult != null;
    }
    return super.eIsSet(featureID);
  }

} // ProcedureCallConfigurationImpl
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
