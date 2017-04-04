package com.ms.qaTools.saturn.modules.xmlManipModule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.modules.xmlManipModule.ValueReplaceOperation;
import com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Value Replace Operation</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.ValueReplaceOperationImpl#getRegExp <em>Reg Exp</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.ValueReplaceOperationImpl#getNewValue <em>New Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueReplaceOperationImpl extends AbstractOperationImpl implements ValueReplaceOperation
{
  /**
   * The cached value of the '{@link #getRegExp() <em>Reg Exp</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getRegExp()
   * @generated
   * @ordered
   */
  protected ComplexValue regExp;

  /**
   * The cached value of the '{@link #getNewValue() <em>New Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewValue()
   * @generated
   * @ordered
   */
  protected ComplexValue newValue;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected ValueReplaceOperationImpl()
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
    return XmlManipModulePackage.Literals.VALUE_REPLACE_OPERATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getRegExp()
  {
    return regExp;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRegExp(ComplexValue newRegExp, NotificationChain msgs)
  {
    ComplexValue oldRegExp = regExp;
    regExp = newRegExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.VALUE_REPLACE_OPERATION__REG_EXP, oldRegExp, newRegExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRegExp(ComplexValue newRegExp)
  {
    if (newRegExp != regExp)
    {
      NotificationChain msgs = null;
      if (regExp != null)
        msgs = ((InternalEObject)regExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.VALUE_REPLACE_OPERATION__REG_EXP, null, msgs);
      if (newRegExp != null)
        msgs = ((InternalEObject)newRegExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.VALUE_REPLACE_OPERATION__REG_EXP, null, msgs);
      msgs = basicSetRegExp(newRegExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.VALUE_REPLACE_OPERATION__REG_EXP, newRegExp, newRegExp));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getNewValue()
  {
    return newValue;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNewValue(ComplexValue newNewValue, NotificationChain msgs)
  {
    ComplexValue oldNewValue = newValue;
    newValue = newNewValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.VALUE_REPLACE_OPERATION__NEW_VALUE, oldNewValue, newNewValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setNewValue(ComplexValue newNewValue)
  {
    if (newNewValue != newValue)
    {
      NotificationChain msgs = null;
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.VALUE_REPLACE_OPERATION__NEW_VALUE, null, msgs);
      if (newNewValue != null)
        msgs = ((InternalEObject)newNewValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.VALUE_REPLACE_OPERATION__NEW_VALUE, null, msgs);
      msgs = basicSetNewValue(newNewValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.VALUE_REPLACE_OPERATION__NEW_VALUE, newNewValue, newNewValue));
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
      case XmlManipModulePackage.VALUE_REPLACE_OPERATION__REG_EXP:
        return basicSetRegExp(null, msgs);
      case XmlManipModulePackage.VALUE_REPLACE_OPERATION__NEW_VALUE:
        return basicSetNewValue(null, msgs);
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
      case XmlManipModulePackage.VALUE_REPLACE_OPERATION__REG_EXP:
        return getRegExp();
      case XmlManipModulePackage.VALUE_REPLACE_OPERATION__NEW_VALUE:
        return getNewValue();
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
      case XmlManipModulePackage.VALUE_REPLACE_OPERATION__REG_EXP:
        setRegExp((ComplexValue)newValue);
        return;
      case XmlManipModulePackage.VALUE_REPLACE_OPERATION__NEW_VALUE:
        setNewValue((ComplexValue)newValue);
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
      case XmlManipModulePackage.VALUE_REPLACE_OPERATION__REG_EXP:
        setRegExp((ComplexValue)null);
        return;
      case XmlManipModulePackage.VALUE_REPLACE_OPERATION__NEW_VALUE:
        setNewValue((ComplexValue)null);
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
      case XmlManipModulePackage.VALUE_REPLACE_OPERATION__REG_EXP:
        return regExp != null;
      case XmlManipModulePackage.VALUE_REPLACE_OPERATION__NEW_VALUE:
        return newValue != null;
    }
    return super.eIsSet(featureID);
  }

} // ValueReplaceOperationImpl
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
