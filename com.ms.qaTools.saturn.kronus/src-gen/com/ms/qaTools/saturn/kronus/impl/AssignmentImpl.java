/**
 */
package com.ms.qaTools.saturn.kronus.impl;

import com.ms.qaTools.saturn.kronus.Assignment;
import com.ms.qaTools.saturn.kronus.KronusPackage;
import com.ms.qaTools.saturn.kronus.ValDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.kronus.impl.AssignmentImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.impl.AssignmentImpl#getLhsParameter <em>Lhs Parameter</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.impl.AssignmentImpl#getRhs <em>Rhs</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.impl.AssignmentImpl#getRhsParameter <em>Rhs Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentImpl extends AbstractDefImpl implements Assignment
{
  /**
   * The cached value of the '{@link #getLhs() <em>Lhs</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLhs()
   * @generated
   * @ordered
   */
  protected ValDef lhs;

  /**
   * The default value of the '{@link #getLhsParameter() <em>Lhs Parameter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLhsParameter()
   * @generated
   * @ordered
   */
  protected static final String LHS_PARAMETER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLhsParameter() <em>Lhs Parameter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLhsParameter()
   * @generated
   * @ordered
   */
  protected String lhsParameter = LHS_PARAMETER_EDEFAULT;

  /**
   * The cached value of the '{@link #getRhs() <em>Rhs</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRhs()
   * @generated
   * @ordered
   */
  protected ValDef rhs;

  /**
   * The default value of the '{@link #getRhsParameter() <em>Rhs Parameter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRhsParameter()
   * @generated
   * @ordered
   */
  protected static final String RHS_PARAMETER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRhsParameter() <em>Rhs Parameter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRhsParameter()
   * @generated
   * @ordered
   */
  protected String rhsParameter = RHS_PARAMETER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignmentImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return KronusPackage.Literals.ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValDef getLhs()
  {
    if (lhs != null && lhs.eIsProxy())
    {
      InternalEObject oldLhs = (InternalEObject)lhs;
      lhs = (ValDef)eResolveProxy(oldLhs);
      if (lhs != oldLhs)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KronusPackage.ASSIGNMENT__LHS, oldLhs, lhs));
      }
    }
    return lhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValDef basicGetLhs()
  {
    return lhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLhs(ValDef newLhs)
  {
    ValDef oldLhs = lhs;
    lhs = newLhs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KronusPackage.ASSIGNMENT__LHS, oldLhs, lhs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLhsParameter()
  {
    return lhsParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLhsParameter(String newLhsParameter)
  {
    String oldLhsParameter = lhsParameter;
    lhsParameter = newLhsParameter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KronusPackage.ASSIGNMENT__LHS_PARAMETER, oldLhsParameter, lhsParameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValDef getRhs()
  {
    if (rhs != null && rhs.eIsProxy())
    {
      InternalEObject oldRhs = (InternalEObject)rhs;
      rhs = (ValDef)eResolveProxy(oldRhs);
      if (rhs != oldRhs)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KronusPackage.ASSIGNMENT__RHS, oldRhs, rhs));
      }
    }
    return rhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValDef basicGetRhs()
  {
    return rhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRhs(ValDef newRhs)
  {
    ValDef oldRhs = rhs;
    rhs = newRhs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KronusPackage.ASSIGNMENT__RHS, oldRhs, rhs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRhsParameter()
  {
    return rhsParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRhsParameter(String newRhsParameter)
  {
    String oldRhsParameter = rhsParameter;
    rhsParameter = newRhsParameter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KronusPackage.ASSIGNMENT__RHS_PARAMETER, oldRhsParameter, rhsParameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case KronusPackage.ASSIGNMENT__LHS:
        if (resolve) return getLhs();
        return basicGetLhs();
      case KronusPackage.ASSIGNMENT__LHS_PARAMETER:
        return getLhsParameter();
      case KronusPackage.ASSIGNMENT__RHS:
        if (resolve) return getRhs();
        return basicGetRhs();
      case KronusPackage.ASSIGNMENT__RHS_PARAMETER:
        return getRhsParameter();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case KronusPackage.ASSIGNMENT__LHS:
        setLhs((ValDef)newValue);
        return;
      case KronusPackage.ASSIGNMENT__LHS_PARAMETER:
        setLhsParameter((String)newValue);
        return;
      case KronusPackage.ASSIGNMENT__RHS:
        setRhs((ValDef)newValue);
        return;
      case KronusPackage.ASSIGNMENT__RHS_PARAMETER:
        setRhsParameter((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case KronusPackage.ASSIGNMENT__LHS:
        setLhs((ValDef)null);
        return;
      case KronusPackage.ASSIGNMENT__LHS_PARAMETER:
        setLhsParameter(LHS_PARAMETER_EDEFAULT);
        return;
      case KronusPackage.ASSIGNMENT__RHS:
        setRhs((ValDef)null);
        return;
      case KronusPackage.ASSIGNMENT__RHS_PARAMETER:
        setRhsParameter(RHS_PARAMETER_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case KronusPackage.ASSIGNMENT__LHS:
        return lhs != null;
      case KronusPackage.ASSIGNMENT__LHS_PARAMETER:
        return LHS_PARAMETER_EDEFAULT == null ? lhsParameter != null : !LHS_PARAMETER_EDEFAULT.equals(lhsParameter);
      case KronusPackage.ASSIGNMENT__RHS:
        return rhs != null;
      case KronusPackage.ASSIGNMENT__RHS_PARAMETER:
        return RHS_PARAMETER_EDEFAULT == null ? rhsParameter != null : !RHS_PARAMETER_EDEFAULT.equals(rhsParameter);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (lhsParameter: ");
    result.append(lhsParameter);
    result.append(", rhsParameter: ");
    result.append(rhsParameter);
    result.append(')');
    return result.toString();
  }

} //AssignmentImpl
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
