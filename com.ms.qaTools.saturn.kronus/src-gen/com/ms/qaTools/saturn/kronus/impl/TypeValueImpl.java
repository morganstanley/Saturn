/**
 */
package com.ms.qaTools.saturn.kronus.impl;

import com.ms.qaTools.saturn.kronus.KronusPackage;
import com.ms.qaTools.saturn.kronus.TypeId;
import com.ms.qaTools.saturn.kronus.TypeValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.kronus.impl.TypeValueImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.impl.TypeValueImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.impl.TypeValueImpl#getParms <em>Parms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeValueImpl extends MinimalEObjectImpl.Container implements TypeValue
{
  /**
   * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtensions()
   * @generated
   * @ordered
   */
  protected EList<TypeValue> extensions;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TypeId type;

  /**
   * The cached value of the '{@link #getParms() <em>Parms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParms()
   * @generated
   * @ordered
   */
  protected EList<TypeValue> parms;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeValueImpl()
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
    return KronusPackage.Literals.TYPE_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeValue> getExtensions()
  {
    if (extensions == null)
    {
      extensions = new EObjectContainmentEList<TypeValue>(TypeValue.class, this, KronusPackage.TYPE_VALUE__EXTENSIONS);
    }
    return extensions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeId getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(TypeId newType, NotificationChain msgs)
  {
    TypeId oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KronusPackage.TYPE_VALUE__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(TypeId newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KronusPackage.TYPE_VALUE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KronusPackage.TYPE_VALUE__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KronusPackage.TYPE_VALUE__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeValue> getParms()
  {
    if (parms == null)
    {
      parms = new EObjectContainmentEList<TypeValue>(TypeValue.class, this, KronusPackage.TYPE_VALUE__PARMS);
    }
    return parms;
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
      case KronusPackage.TYPE_VALUE__EXTENSIONS:
        return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
      case KronusPackage.TYPE_VALUE__TYPE:
        return basicSetType(null, msgs);
      case KronusPackage.TYPE_VALUE__PARMS:
        return ((InternalEList<?>)getParms()).basicRemove(otherEnd, msgs);
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
      case KronusPackage.TYPE_VALUE__EXTENSIONS:
        return getExtensions();
      case KronusPackage.TYPE_VALUE__TYPE:
        return getType();
      case KronusPackage.TYPE_VALUE__PARMS:
        return getParms();
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
      case KronusPackage.TYPE_VALUE__EXTENSIONS:
        getExtensions().clear();
        getExtensions().addAll((Collection<? extends TypeValue>)newValue);
        return;
      case KronusPackage.TYPE_VALUE__TYPE:
        setType((TypeId)newValue);
        return;
      case KronusPackage.TYPE_VALUE__PARMS:
        getParms().clear();
        getParms().addAll((Collection<? extends TypeValue>)newValue);
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
      case KronusPackage.TYPE_VALUE__EXTENSIONS:
        getExtensions().clear();
        return;
      case KronusPackage.TYPE_VALUE__TYPE:
        setType((TypeId)null);
        return;
      case KronusPackage.TYPE_VALUE__PARMS:
        getParms().clear();
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
      case KronusPackage.TYPE_VALUE__EXTENSIONS:
        return extensions != null && !extensions.isEmpty();
      case KronusPackage.TYPE_VALUE__TYPE:
        return type != null;
      case KronusPackage.TYPE_VALUE__PARMS:
        return parms != null && !parms.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TypeValueImpl
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
