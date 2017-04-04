package com.ms.qaTools.saturn.resources.fileResource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.resources.fileResource.ExcelWorkSheet;
import com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Excel Work Sheet</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.resources.fileResource.impl.ExcelWorkSheetImpl#getWorkSheet <em>Work Sheet</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.fileResource.impl.ExcelWorkSheetImpl#getNullMarker <em>Null Marker</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.fileResource.impl.ExcelWorkSheetImpl#isHasNulls <em>Has Nulls</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ExcelWorkSheetImpl extends DataSetFileImpl implements ExcelWorkSheet
{
  /**
   * The cached value of the '{@link #getWorkSheet() <em>Work Sheet</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getWorkSheet()
   * @generated
   * @ordered
   */
  protected ComplexValue         workSheet;

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
  protected ExcelWorkSheetImpl()
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
    return FileResourcePackage.Literals.EXCEL_WORK_SHEET;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getWorkSheet()
  {
    return workSheet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWorkSheet(ComplexValue newWorkSheet, NotificationChain msgs)
  {
    ComplexValue oldWorkSheet = workSheet;
    workSheet = newWorkSheet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FileResourcePackage.EXCEL_WORK_SHEET__WORK_SHEET, oldWorkSheet, newWorkSheet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setWorkSheet(ComplexValue newWorkSheet)
  {
    if (newWorkSheet != workSheet)
    {
      NotificationChain msgs = null;
      if (workSheet != null)
        msgs = ((InternalEObject)workSheet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FileResourcePackage.EXCEL_WORK_SHEET__WORK_SHEET, null, msgs);
      if (newWorkSheet != null)
        msgs = ((InternalEObject)newWorkSheet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FileResourcePackage.EXCEL_WORK_SHEET__WORK_SHEET, null, msgs);
      msgs = basicSetWorkSheet(newWorkSheet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FileResourcePackage.EXCEL_WORK_SHEET__WORK_SHEET, newWorkSheet, newWorkSheet));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FileResourcePackage.EXCEL_WORK_SHEET__NULL_MARKER, oldNullMarker, newNullMarker);
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
        msgs = ((InternalEObject)nullMarker).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FileResourcePackage.EXCEL_WORK_SHEET__NULL_MARKER, null, msgs);
      if (newNullMarker != null)
        msgs = ((InternalEObject)newNullMarker).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FileResourcePackage.EXCEL_WORK_SHEET__NULL_MARKER, null, msgs);
      msgs = basicSetNullMarker(newNullMarker, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FileResourcePackage.EXCEL_WORK_SHEET__NULL_MARKER, newNullMarker, newNullMarker));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FileResourcePackage.EXCEL_WORK_SHEET__HAS_NULLS, oldHasNulls, hasNulls, !oldHasNullsESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, FileResourcePackage.EXCEL_WORK_SHEET__HAS_NULLS, oldHasNulls, HAS_NULLS_EDEFAULT, oldHasNullsESet));
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
      case FileResourcePackage.EXCEL_WORK_SHEET__WORK_SHEET:
        return basicSetWorkSheet(null, msgs);
      case FileResourcePackage.EXCEL_WORK_SHEET__NULL_MARKER:
        return basicSetNullMarker(null, msgs);
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
      case FileResourcePackage.EXCEL_WORK_SHEET__WORK_SHEET:
        return getWorkSheet();
      case FileResourcePackage.EXCEL_WORK_SHEET__NULL_MARKER:
        return getNullMarker();
      case FileResourcePackage.EXCEL_WORK_SHEET__HAS_NULLS:
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
      case FileResourcePackage.EXCEL_WORK_SHEET__WORK_SHEET:
        setWorkSheet((ComplexValue)newValue);
        return;
      case FileResourcePackage.EXCEL_WORK_SHEET__NULL_MARKER:
        setNullMarker((ComplexValue)newValue);
        return;
      case FileResourcePackage.EXCEL_WORK_SHEET__HAS_NULLS:
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
      case FileResourcePackage.EXCEL_WORK_SHEET__WORK_SHEET:
        setWorkSheet((ComplexValue)null);
        return;
      case FileResourcePackage.EXCEL_WORK_SHEET__NULL_MARKER:
        setNullMarker((ComplexValue)null);
        return;
      case FileResourcePackage.EXCEL_WORK_SHEET__HAS_NULLS:
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
      case FileResourcePackage.EXCEL_WORK_SHEET__WORK_SHEET:
        return workSheet != null;
      case FileResourcePackage.EXCEL_WORK_SHEET__NULL_MARKER:
        return nullMarker != null;
      case FileResourcePackage.EXCEL_WORK_SHEET__HAS_NULLS:
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

} // ExcelWorkSheetImpl
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
