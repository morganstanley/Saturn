/**
 * COPYRIGHT NOTICE AND DISCLAIMER
 *  
 * Copyright © 2009, Contributor
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License, version 3 for more details.
 * You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
 * THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
 */
package com.ms.qaTools.saturn.values.impl;

import com.ms.qaTools.saturn.values.RunNumberComplexValue;
import com.ms.qaTools.saturn.values.ValuesPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Run Number Complex Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.RunNumberComplexValueImpl#getPadding <em>Padding</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.RunNumberComplexValueImpl#getPadCharacter <em>Pad Character</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RunNumberComplexValueImpl extends EObjectImpl implements RunNumberComplexValue
{
  /**
   * The default value of the '{@link #getPadding() <em>Padding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPadding()
   * @generated
   * @ordered
   */
  protected static final BigInteger PADDING_EDEFAULT = new BigInteger("3");

  /**
   * The cached value of the '{@link #getPadding() <em>Padding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPadding()
   * @generated
   * @ordered
   */
  protected BigInteger padding = PADDING_EDEFAULT;

  /**
   * This is true if the Padding attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean paddingESet;

  /**
   * The default value of the '{@link #getPadCharacter() <em>Pad Character</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPadCharacter()
   * @generated
   * @ordered
   */
  protected static final String PAD_CHARACTER_EDEFAULT = "0";

  /**
   * The cached value of the '{@link #getPadCharacter() <em>Pad Character</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPadCharacter()
   * @generated
   * @ordered
   */
  protected String padCharacter = PAD_CHARACTER_EDEFAULT;

  /**
   * This is true if the Pad Character attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean padCharacterESet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RunNumberComplexValueImpl()
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
    return ValuesPackage.Literals.RUN_NUMBER_COMPLEX_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getPadding()
  {
    return padding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPadding(BigInteger newPadding)
  {
    BigInteger oldPadding = padding;
    padding = newPadding;
    boolean oldPaddingESet = paddingESet;
    paddingESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.RUN_NUMBER_COMPLEX_VALUE__PADDING, oldPadding, padding, !oldPaddingESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetPadding()
  {
    BigInteger oldPadding = padding;
    boolean oldPaddingESet = paddingESet;
    padding = PADDING_EDEFAULT;
    paddingESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ValuesPackage.RUN_NUMBER_COMPLEX_VALUE__PADDING, oldPadding, PADDING_EDEFAULT, oldPaddingESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetPadding()
  {
    return paddingESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPadCharacter()
  {
    return padCharacter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPadCharacter(String newPadCharacter)
  {
    String oldPadCharacter = padCharacter;
    padCharacter = newPadCharacter;
    boolean oldPadCharacterESet = padCharacterESet;
    padCharacterESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.RUN_NUMBER_COMPLEX_VALUE__PAD_CHARACTER, oldPadCharacter, padCharacter, !oldPadCharacterESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetPadCharacter()
  {
    String oldPadCharacter = padCharacter;
    boolean oldPadCharacterESet = padCharacterESet;
    padCharacter = PAD_CHARACTER_EDEFAULT;
    padCharacterESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ValuesPackage.RUN_NUMBER_COMPLEX_VALUE__PAD_CHARACTER, oldPadCharacter, PAD_CHARACTER_EDEFAULT, oldPadCharacterESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetPadCharacter()
  {
    return padCharacterESet;
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
      case ValuesPackage.RUN_NUMBER_COMPLEX_VALUE__PADDING:
        return getPadding();
      case ValuesPackage.RUN_NUMBER_COMPLEX_VALUE__PAD_CHARACTER:
        return getPadCharacter();
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
      case ValuesPackage.RUN_NUMBER_COMPLEX_VALUE__PADDING:
        setPadding((BigInteger)newValue);
        return;
      case ValuesPackage.RUN_NUMBER_COMPLEX_VALUE__PAD_CHARACTER:
        setPadCharacter((String)newValue);
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
      case ValuesPackage.RUN_NUMBER_COMPLEX_VALUE__PADDING:
        unsetPadding();
        return;
      case ValuesPackage.RUN_NUMBER_COMPLEX_VALUE__PAD_CHARACTER:
        unsetPadCharacter();
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
      case ValuesPackage.RUN_NUMBER_COMPLEX_VALUE__PADDING:
        return isSetPadding();
      case ValuesPackage.RUN_NUMBER_COMPLEX_VALUE__PAD_CHARACTER:
        return isSetPadCharacter();
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
    result.append(" (padding: ");
    if (paddingESet) result.append(padding); else result.append("<unset>");
    result.append(", padCharacter: ");
    if (padCharacterESet) result.append(padCharacter); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //RunNumberComplexValueImpl
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
