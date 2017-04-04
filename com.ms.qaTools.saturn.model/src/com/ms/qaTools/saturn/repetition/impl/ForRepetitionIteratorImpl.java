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
package com.ms.qaTools.saturn.repetition.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.ms.qaTools.saturn.repetition.ForRepetitionIterator;
import com.ms.qaTools.saturn.repetition.RepetitionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>For Repetition Iterator</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.repetition.impl.ForRepetitionIteratorImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.repetition.impl.ForRepetitionIteratorImpl#getStartIndex <em>Start Index</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.repetition.impl.ForRepetitionIteratorImpl#getEndIndex <em>End Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForRepetitionIteratorImpl extends EObjectImpl implements ForRepetitionIterator
{
  /**
   * The default value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected static final String     ATTRIBUTE_EDEFAULT   = null;

  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected String                  attribute            = ATTRIBUTE_EDEFAULT;

  /**
   * The default value of the '{@link #getStartIndex() <em>Start Index</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getStartIndex()
   * @generated
   * @ordered
   */
  protected static final BigInteger START_INDEX_EDEFAULT = new BigInteger("0");

  /**
   * The cached value of the '{@link #getStartIndex() <em>Start Index</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getStartIndex()
   * @generated
   * @ordered
   */
  protected BigInteger              startIndex           = START_INDEX_EDEFAULT;

  /**
   * This is true if the Start Index attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 startIndexESet;

  /**
   * The default value of the '{@link #getEndIndex() <em>End Index</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getEndIndex()
   * @generated
   * @ordered
   */
  protected static final BigInteger END_INDEX_EDEFAULT   = null;

  /**
   * The cached value of the '{@link #getEndIndex() <em>End Index</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getEndIndex()
   * @generated
   * @ordered
   */
  protected BigInteger              endIndex             = END_INDEX_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected ForRepetitionIteratorImpl()
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
    return RepetitionPackage.Literals.FOR_REPETITION_ITERATOR;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getAttribute()
  {
    return attribute;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setAttribute(String newAttribute)
  {
    String oldAttribute = attribute;
    attribute = newAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepetitionPackage.FOR_REPETITION_ITERATOR__ATTRIBUTE, oldAttribute, attribute));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getEndIndex()
  {
    return endIndex;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setEndIndex(BigInteger newEndIndex)
  {
    BigInteger oldEndIndex = endIndex;
    endIndex = newEndIndex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepetitionPackage.FOR_REPETITION_ITERATOR__END_INDEX, oldEndIndex, endIndex));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getStartIndex()
  {
    return startIndex;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setStartIndex(BigInteger newStartIndex)
  {
    BigInteger oldStartIndex = startIndex;
    startIndex = newStartIndex;
    boolean oldStartIndexESet = startIndexESet;
    startIndexESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepetitionPackage.FOR_REPETITION_ITERATOR__START_INDEX, oldStartIndex, startIndex, !oldStartIndexESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetStartIndex()
  {
    BigInteger oldStartIndex = startIndex;
    boolean oldStartIndexESet = startIndexESet;
    startIndex = START_INDEX_EDEFAULT;
    startIndexESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, RepetitionPackage.FOR_REPETITION_ITERATOR__START_INDEX, oldStartIndex, START_INDEX_EDEFAULT, oldStartIndexESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetStartIndex()
  {
    return startIndexESet;
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
      case RepetitionPackage.FOR_REPETITION_ITERATOR__ATTRIBUTE:
        return getAttribute();
      case RepetitionPackage.FOR_REPETITION_ITERATOR__START_INDEX:
        return getStartIndex();
      case RepetitionPackage.FOR_REPETITION_ITERATOR__END_INDEX:
        return getEndIndex();
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
      case RepetitionPackage.FOR_REPETITION_ITERATOR__ATTRIBUTE:
        setAttribute((String)newValue);
        return;
      case RepetitionPackage.FOR_REPETITION_ITERATOR__START_INDEX:
        setStartIndex((BigInteger)newValue);
        return;
      case RepetitionPackage.FOR_REPETITION_ITERATOR__END_INDEX:
        setEndIndex((BigInteger)newValue);
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
      case RepetitionPackage.FOR_REPETITION_ITERATOR__ATTRIBUTE:
        setAttribute(ATTRIBUTE_EDEFAULT);
        return;
      case RepetitionPackage.FOR_REPETITION_ITERATOR__START_INDEX:
        unsetStartIndex();
        return;
      case RepetitionPackage.FOR_REPETITION_ITERATOR__END_INDEX:
        setEndIndex(END_INDEX_EDEFAULT);
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
      case RepetitionPackage.FOR_REPETITION_ITERATOR__ATTRIBUTE:
        return ATTRIBUTE_EDEFAULT == null ? attribute != null : !ATTRIBUTE_EDEFAULT.equals(attribute);
      case RepetitionPackage.FOR_REPETITION_ITERATOR__START_INDEX:
        return isSetStartIndex();
      case RepetitionPackage.FOR_REPETITION_ITERATOR__END_INDEX:
        return END_INDEX_EDEFAULT == null ? endIndex != null : !END_INDEX_EDEFAULT.equals(endIndex);
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
    result.append(" (attribute: ");
    result.append(attribute);
    result.append(", startIndex: ");
    if (startIndexESet) result.append(startIndex); else result.append("<unset>");
    result.append(", endIndex: ");
    result.append(endIndex);
    result.append(')');
    return result.toString();
  }

} // ForRepetitionIteratorImpl
