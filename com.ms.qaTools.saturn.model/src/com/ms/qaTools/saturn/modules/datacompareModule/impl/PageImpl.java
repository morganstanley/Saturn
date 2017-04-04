package com.ms.qaTools.saturn.modules.datacompareModule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage;
import com.ms.qaTools.saturn.modules.datacompareModule.Page;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Page</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.PageImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.PageImpl#isOmit <em>Omit</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.PageImpl#isSparse <em>Sparse</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageImpl extends EObjectImpl implements Page
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String  NAME_EDEFAULT   = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String               name            = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isOmit() <em>Omit</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isOmit()
   * @generated
   * @ordered
   */
  protected static final boolean OMIT_EDEFAULT   = false;

  /**
   * The cached value of the '{@link #isOmit() <em>Omit</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isOmit()
   * @generated
   * @ordered
   */
  protected boolean              omit            = OMIT_EDEFAULT;

  /**
   * This is true if the Omit attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              omitESet;

  /**
   * The default value of the '{@link #isSparse() <em>Sparse</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isSparse()
   * @generated
   * @ordered
   */
  protected static final boolean SPARSE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSparse() <em>Sparse</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isSparse()
   * @generated
   * @ordered
   */
  protected boolean              sparse          = SPARSE_EDEFAULT;

  /**
   * This is true if the Sparse attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              sparseESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected PageImpl()
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
    return DatacompareModulePackage.Literals.PAGE;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.PAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isOmit()
  {
    return omit;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOmit(boolean newOmit)
  {
    boolean oldOmit = omit;
    omit = newOmit;
    boolean oldOmitESet = omitESet;
    omitESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.PAGE__OMIT, oldOmit, omit, !oldOmitESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetOmit()
  {
    boolean oldOmit = omit;
    boolean oldOmitESet = omitESet;
    omit = OMIT_EDEFAULT;
    omitESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, DatacompareModulePackage.PAGE__OMIT, oldOmit, OMIT_EDEFAULT, oldOmitESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetOmit()
  {
    return omitESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSparse()
  {
    return sparse;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSparse(boolean newSparse)
  {
    boolean oldSparse = sparse;
    sparse = newSparse;
    boolean oldSparseESet = sparseESet;
    sparseESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.PAGE__SPARSE, oldSparse, sparse, !oldSparseESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetSparse()
  {
    boolean oldSparse = sparse;
    boolean oldSparseESet = sparseESet;
    sparse = SPARSE_EDEFAULT;
    sparseESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, DatacompareModulePackage.PAGE__SPARSE, oldSparse, SPARSE_EDEFAULT, oldSparseESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetSparse()
  {
    return sparseESet;
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
      case DatacompareModulePackage.PAGE__NAME:
        return getName();
      case DatacompareModulePackage.PAGE__OMIT:
        return isOmit();
      case DatacompareModulePackage.PAGE__SPARSE:
        return isSparse();
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
      case DatacompareModulePackage.PAGE__NAME:
        setName((String)newValue);
        return;
      case DatacompareModulePackage.PAGE__OMIT:
        setOmit((Boolean)newValue);
        return;
      case DatacompareModulePackage.PAGE__SPARSE:
        setSparse((Boolean)newValue);
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
      case DatacompareModulePackage.PAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DatacompareModulePackage.PAGE__OMIT:
        unsetOmit();
        return;
      case DatacompareModulePackage.PAGE__SPARSE:
        unsetSparse();
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
      case DatacompareModulePackage.PAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DatacompareModulePackage.PAGE__OMIT:
        return isSetOmit();
      case DatacompareModulePackage.PAGE__SPARSE:
        return isSetSparse();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", omit: ");
    if (omitESet) result.append(omit); else result.append("<unset>");
    result.append(", sparse: ");
    if (sparseESet) result.append(sparse); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // PageImpl
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
