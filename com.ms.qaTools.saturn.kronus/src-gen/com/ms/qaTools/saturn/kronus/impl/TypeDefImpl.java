/**
 */
package com.ms.qaTools.saturn.kronus.impl;

import com.ms.qaTools.saturn.kronus.KronusPackage;
import com.ms.qaTools.saturn.kronus.TypeDef;
import com.ms.qaTools.saturn.kronus.TypeInstance;
import com.ms.qaTools.saturn.kronus.TypeValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.kronus.impl.TypeDefImpl#getVariance <em>Variance</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.impl.TypeDefImpl#getBoundsHi <em>Bounds Hi</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.impl.TypeDefImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.impl.TypeDefImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDefImpl extends NamedRuntimeDefImpl implements TypeDef
{
  /**
   * The default value of the '{@link #getVariance() <em>Variance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariance()
   * @generated
   * @ordered
   */
  protected static final String VARIANCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVariance() <em>Variance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariance()
   * @generated
   * @ordered
   */
  protected String variance = VARIANCE_EDEFAULT;

  /**
   * The cached value of the '{@link #getBoundsHi() <em>Bounds Hi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoundsHi()
   * @generated
   * @ordered
   */
  protected TypeInstance boundsHi;

  /**
   * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeParameters()
   * @generated
   * @ordered
   */
  protected EList<TypeDef> typeParameters;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected TypeValue value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeDefImpl()
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
    return KronusPackage.Literals.TYPE_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVariance()
  {
    return variance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariance(String newVariance)
  {
    String oldVariance = variance;
    variance = newVariance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KronusPackage.TYPE_DEF__VARIANCE, oldVariance, variance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeInstance getBoundsHi()
  {
    return boundsHi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBoundsHi(TypeInstance newBoundsHi, NotificationChain msgs)
  {
    TypeInstance oldBoundsHi = boundsHi;
    boundsHi = newBoundsHi;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KronusPackage.TYPE_DEF__BOUNDS_HI, oldBoundsHi, newBoundsHi);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBoundsHi(TypeInstance newBoundsHi)
  {
    if (newBoundsHi != boundsHi)
    {
      NotificationChain msgs = null;
      if (boundsHi != null)
        msgs = ((InternalEObject)boundsHi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KronusPackage.TYPE_DEF__BOUNDS_HI, null, msgs);
      if (newBoundsHi != null)
        msgs = ((InternalEObject)newBoundsHi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KronusPackage.TYPE_DEF__BOUNDS_HI, null, msgs);
      msgs = basicSetBoundsHi(newBoundsHi, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KronusPackage.TYPE_DEF__BOUNDS_HI, newBoundsHi, newBoundsHi));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeDef> getTypeParameters()
  {
    if (typeParameters == null)
    {
      typeParameters = new EObjectContainmentEList<TypeDef>(TypeDef.class, this, KronusPackage.TYPE_DEF__TYPE_PARAMETERS);
    }
    return typeParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeValue getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(TypeValue newValue, NotificationChain msgs)
  {
    TypeValue oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KronusPackage.TYPE_DEF__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(TypeValue newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KronusPackage.TYPE_DEF__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KronusPackage.TYPE_DEF__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KronusPackage.TYPE_DEF__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case KronusPackage.TYPE_DEF__BOUNDS_HI:
        return basicSetBoundsHi(null, msgs);
      case KronusPackage.TYPE_DEF__TYPE_PARAMETERS:
        return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
      case KronusPackage.TYPE_DEF__VALUE:
        return basicSetValue(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case KronusPackage.TYPE_DEF__VARIANCE:
        return getVariance();
      case KronusPackage.TYPE_DEF__BOUNDS_HI:
        return getBoundsHi();
      case KronusPackage.TYPE_DEF__TYPE_PARAMETERS:
        return getTypeParameters();
      case KronusPackage.TYPE_DEF__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case KronusPackage.TYPE_DEF__VARIANCE:
        setVariance((String)newValue);
        return;
      case KronusPackage.TYPE_DEF__BOUNDS_HI:
        setBoundsHi((TypeInstance)newValue);
        return;
      case KronusPackage.TYPE_DEF__TYPE_PARAMETERS:
        getTypeParameters().clear();
        getTypeParameters().addAll((Collection<? extends TypeDef>)newValue);
        return;
      case KronusPackage.TYPE_DEF__VALUE:
        setValue((TypeValue)newValue);
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
      case KronusPackage.TYPE_DEF__VARIANCE:
        setVariance(VARIANCE_EDEFAULT);
        return;
      case KronusPackage.TYPE_DEF__BOUNDS_HI:
        setBoundsHi((TypeInstance)null);
        return;
      case KronusPackage.TYPE_DEF__TYPE_PARAMETERS:
        getTypeParameters().clear();
        return;
      case KronusPackage.TYPE_DEF__VALUE:
        setValue((TypeValue)null);
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
      case KronusPackage.TYPE_DEF__VARIANCE:
        return VARIANCE_EDEFAULT == null ? variance != null : !VARIANCE_EDEFAULT.equals(variance);
      case KronusPackage.TYPE_DEF__BOUNDS_HI:
        return boundsHi != null;
      case KronusPackage.TYPE_DEF__TYPE_PARAMETERS:
        return typeParameters != null && !typeParameters.isEmpty();
      case KronusPackage.TYPE_DEF__VALUE:
        return value != null;
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
    result.append(" (variance: ");
    result.append(variance);
    result.append(')');
    return result.toString();
  }

} //TypeDefImpl
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
