package com.ms.qaTools.saturn.resources.fileResource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.resources.fileResource.CustomFile;
import com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Custom File</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.fileResource.impl.CustomFileImpl#getNullMarker <em>Null Marker</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.fileResource.impl.CustomFileImpl#getRowSeparator <em>Row Separator</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.fileResource.impl.CustomFileImpl#getCellSeparator <em>Cell Separator</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.fileResource.impl.CustomFileImpl#getQuoteCharacter <em>Quote Character</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.fileResource.impl.CustomFileImpl#getEscapeCharacter <em>Escape Character</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.fileResource.impl.CustomFileImpl#isHasNulls <em>Has Nulls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomFileImpl extends DataSetFileImpl implements CustomFile
{
  /**
   * The cached value of the '{@link #getNullMarker() <em>Null Marker</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getNullMarker()
   * @generated
   * @ordered
   */
  protected ComplexValue         nullMarker;

  /**
   * The cached value of the '{@link #getRowSeparator() <em>Row Separator</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getRowSeparator()
   * @generated
   * @ordered
   */
  protected ComplexValue         rowSeparator;

  /**
   * The cached value of the '{@link #getCellSeparator() <em>Cell Separator</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getCellSeparator()
   * @generated
   * @ordered
   */
  protected ComplexValue         cellSeparator;

  /**
   * The cached value of the '{@link #getQuoteCharacter() <em>Quote Character</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuoteCharacter()
   * @generated
   * @ordered
   */
  protected ComplexValue quoteCharacter;

  /**
   * The cached value of the '{@link #getEscapeCharacter() <em>Escape Character</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEscapeCharacter()
   * @generated
   * @ordered
   */
  protected ComplexValue escapeCharacter;

  /**
   * The default value of the '{@link #isHasNulls() <em>Has Nulls</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isHasNulls()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_NULLS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasNulls() <em>Has Nulls</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isHasNulls()
   * @generated
   * @ordered
   */
  protected boolean              hasNulls           = HAS_NULLS_EDEFAULT;

  /**
   * This is true if the Has Nulls attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              hasNullsESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected CustomFileImpl()
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
    return FileResourcePackage.Literals.CUSTOM_FILE;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getNullMarker()
  {
    return nullMarker;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNullMarker(ComplexValue newNullMarker, NotificationChain msgs)
  {
    ComplexValue oldNullMarker = nullMarker;
    nullMarker = newNullMarker;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FileResourcePackage.CUSTOM_FILE__NULL_MARKER, oldNullMarker, newNullMarker);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setNullMarker(ComplexValue newNullMarker)
  {
    if (newNullMarker != nullMarker)
    {
      NotificationChain msgs = null;
      if (nullMarker != null)
        msgs = ((InternalEObject)nullMarker).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FileResourcePackage.CUSTOM_FILE__NULL_MARKER, null, msgs);
      if (newNullMarker != null)
        msgs = ((InternalEObject)newNullMarker).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FileResourcePackage.CUSTOM_FILE__NULL_MARKER, null, msgs);
      msgs = basicSetNullMarker(newNullMarker, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FileResourcePackage.CUSTOM_FILE__NULL_MARKER, newNullMarker, newNullMarker));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getRowSeparator()
  {
    return rowSeparator;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRowSeparator(ComplexValue newRowSeparator, NotificationChain msgs)
  {
    ComplexValue oldRowSeparator = rowSeparator;
    rowSeparator = newRowSeparator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FileResourcePackage.CUSTOM_FILE__ROW_SEPARATOR, oldRowSeparator, newRowSeparator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRowSeparator(ComplexValue newRowSeparator)
  {
    if (newRowSeparator != rowSeparator)
    {
      NotificationChain msgs = null;
      if (rowSeparator != null)
        msgs = ((InternalEObject)rowSeparator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FileResourcePackage.CUSTOM_FILE__ROW_SEPARATOR, null, msgs);
      if (newRowSeparator != null)
        msgs = ((InternalEObject)newRowSeparator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FileResourcePackage.CUSTOM_FILE__ROW_SEPARATOR, null, msgs);
      msgs = basicSetRowSeparator(newRowSeparator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FileResourcePackage.CUSTOM_FILE__ROW_SEPARATOR, newRowSeparator, newRowSeparator));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getCellSeparator()
  {
    return cellSeparator;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCellSeparator(ComplexValue newCellSeparator, NotificationChain msgs)
  {
    ComplexValue oldCellSeparator = cellSeparator;
    cellSeparator = newCellSeparator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FileResourcePackage.CUSTOM_FILE__CELL_SEPARATOR, oldCellSeparator, newCellSeparator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCellSeparator(ComplexValue newCellSeparator)
  {
    if (newCellSeparator != cellSeparator)
    {
      NotificationChain msgs = null;
      if (cellSeparator != null)
        msgs = ((InternalEObject)cellSeparator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FileResourcePackage.CUSTOM_FILE__CELL_SEPARATOR, null, msgs);
      if (newCellSeparator != null)
        msgs = ((InternalEObject)newCellSeparator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FileResourcePackage.CUSTOM_FILE__CELL_SEPARATOR, null, msgs);
      msgs = basicSetCellSeparator(newCellSeparator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FileResourcePackage.CUSTOM_FILE__CELL_SEPARATOR, newCellSeparator, newCellSeparator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getQuoteCharacter()
  {
    return quoteCharacter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuoteCharacter(ComplexValue newQuoteCharacter, NotificationChain msgs)
  {
    ComplexValue oldQuoteCharacter = quoteCharacter;
    quoteCharacter = newQuoteCharacter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FileResourcePackage.CUSTOM_FILE__QUOTE_CHARACTER, oldQuoteCharacter, newQuoteCharacter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuoteCharacter(ComplexValue newQuoteCharacter)
  {
    if (newQuoteCharacter != quoteCharacter)
    {
      NotificationChain msgs = null;
      if (quoteCharacter != null)
        msgs = ((InternalEObject)quoteCharacter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FileResourcePackage.CUSTOM_FILE__QUOTE_CHARACTER, null, msgs);
      if (newQuoteCharacter != null)
        msgs = ((InternalEObject)newQuoteCharacter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FileResourcePackage.CUSTOM_FILE__QUOTE_CHARACTER, null, msgs);
      msgs = basicSetQuoteCharacter(newQuoteCharacter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FileResourcePackage.CUSTOM_FILE__QUOTE_CHARACTER, newQuoteCharacter, newQuoteCharacter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getEscapeCharacter()
  {
    return escapeCharacter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEscapeCharacter(ComplexValue newEscapeCharacter, NotificationChain msgs)
  {
    ComplexValue oldEscapeCharacter = escapeCharacter;
    escapeCharacter = newEscapeCharacter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FileResourcePackage.CUSTOM_FILE__ESCAPE_CHARACTER, oldEscapeCharacter, newEscapeCharacter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEscapeCharacter(ComplexValue newEscapeCharacter)
  {
    if (newEscapeCharacter != escapeCharacter)
    {
      NotificationChain msgs = null;
      if (escapeCharacter != null)
        msgs = ((InternalEObject)escapeCharacter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FileResourcePackage.CUSTOM_FILE__ESCAPE_CHARACTER, null, msgs);
      if (newEscapeCharacter != null)
        msgs = ((InternalEObject)newEscapeCharacter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FileResourcePackage.CUSTOM_FILE__ESCAPE_CHARACTER, null, msgs);
      msgs = basicSetEscapeCharacter(newEscapeCharacter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FileResourcePackage.CUSTOM_FILE__ESCAPE_CHARACTER, newEscapeCharacter, newEscapeCharacter));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasNulls()
  {
    return hasNulls;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setHasNulls(boolean newHasNulls)
  {
    boolean oldHasNulls = hasNulls;
    hasNulls = newHasNulls;
    boolean oldHasNullsESet = hasNullsESet;
    hasNullsESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FileResourcePackage.CUSTOM_FILE__HAS_NULLS, oldHasNulls, hasNulls, !oldHasNullsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetHasNulls()
  {
    boolean oldHasNulls = hasNulls;
    boolean oldHasNullsESet = hasNullsESet;
    hasNulls = HAS_NULLS_EDEFAULT;
    hasNullsESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, FileResourcePackage.CUSTOM_FILE__HAS_NULLS, oldHasNulls, HAS_NULLS_EDEFAULT, oldHasNullsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetHasNulls()
  {
    return hasNullsESet;
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
      case FileResourcePackage.CUSTOM_FILE__NULL_MARKER:
        return basicSetNullMarker(null, msgs);
      case FileResourcePackage.CUSTOM_FILE__ROW_SEPARATOR:
        return basicSetRowSeparator(null, msgs);
      case FileResourcePackage.CUSTOM_FILE__CELL_SEPARATOR:
        return basicSetCellSeparator(null, msgs);
      case FileResourcePackage.CUSTOM_FILE__QUOTE_CHARACTER:
        return basicSetQuoteCharacter(null, msgs);
      case FileResourcePackage.CUSTOM_FILE__ESCAPE_CHARACTER:
        return basicSetEscapeCharacter(null, msgs);
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
      case FileResourcePackage.CUSTOM_FILE__NULL_MARKER:
        return getNullMarker();
      case FileResourcePackage.CUSTOM_FILE__ROW_SEPARATOR:
        return getRowSeparator();
      case FileResourcePackage.CUSTOM_FILE__CELL_SEPARATOR:
        return getCellSeparator();
      case FileResourcePackage.CUSTOM_FILE__QUOTE_CHARACTER:
        return getQuoteCharacter();
      case FileResourcePackage.CUSTOM_FILE__ESCAPE_CHARACTER:
        return getEscapeCharacter();
      case FileResourcePackage.CUSTOM_FILE__HAS_NULLS:
        return isHasNulls();
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
      case FileResourcePackage.CUSTOM_FILE__NULL_MARKER:
        setNullMarker((ComplexValue)newValue);
        return;
      case FileResourcePackage.CUSTOM_FILE__ROW_SEPARATOR:
        setRowSeparator((ComplexValue)newValue);
        return;
      case FileResourcePackage.CUSTOM_FILE__CELL_SEPARATOR:
        setCellSeparator((ComplexValue)newValue);
        return;
      case FileResourcePackage.CUSTOM_FILE__QUOTE_CHARACTER:
        setQuoteCharacter((ComplexValue)newValue);
        return;
      case FileResourcePackage.CUSTOM_FILE__ESCAPE_CHARACTER:
        setEscapeCharacter((ComplexValue)newValue);
        return;
      case FileResourcePackage.CUSTOM_FILE__HAS_NULLS:
        setHasNulls((Boolean)newValue);
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
      case FileResourcePackage.CUSTOM_FILE__NULL_MARKER:
        setNullMarker((ComplexValue)null);
        return;
      case FileResourcePackage.CUSTOM_FILE__ROW_SEPARATOR:
        setRowSeparator((ComplexValue)null);
        return;
      case FileResourcePackage.CUSTOM_FILE__CELL_SEPARATOR:
        setCellSeparator((ComplexValue)null);
        return;
      case FileResourcePackage.CUSTOM_FILE__QUOTE_CHARACTER:
        setQuoteCharacter((ComplexValue)null);
        return;
      case FileResourcePackage.CUSTOM_FILE__ESCAPE_CHARACTER:
        setEscapeCharacter((ComplexValue)null);
        return;
      case FileResourcePackage.CUSTOM_FILE__HAS_NULLS:
        unsetHasNulls();
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
      case FileResourcePackage.CUSTOM_FILE__NULL_MARKER:
        return nullMarker != null;
      case FileResourcePackage.CUSTOM_FILE__ROW_SEPARATOR:
        return rowSeparator != null;
      case FileResourcePackage.CUSTOM_FILE__CELL_SEPARATOR:
        return cellSeparator != null;
      case FileResourcePackage.CUSTOM_FILE__QUOTE_CHARACTER:
        return quoteCharacter != null;
      case FileResourcePackage.CUSTOM_FILE__ESCAPE_CHARACTER:
        return escapeCharacter != null;
      case FileResourcePackage.CUSTOM_FILE__HAS_NULLS:
        return isSetHasNulls();
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
    result.append(" (hasNulls: ");
    if (hasNullsESet) result.append(hasNulls); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // CustomFileImpl
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
