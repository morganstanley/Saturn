package com.ms.qaTools.saturn.modules.xmlManipModule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.modules.xmlManipModule.ReplaceOperation;
import com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Replace Operation</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.ReplaceOperationImpl#getSearch <em>Search</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.ReplaceOperationImpl#getWith <em>With</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ReplaceOperationImpl extends AbstractOperationImpl implements ReplaceOperation
{
  /**
   * The cached value of the '{@link #getSearch() <em>Search</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getSearch()
   * @generated
   * @ordered
   */
  protected ComplexValue search;

  /**
   * The cached value of the '{@link #getWith() <em>With</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getWith()
   * @generated
   * @ordered
   */
  protected ComplexValue with;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected ReplaceOperationImpl()
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
    return XmlManipModulePackage.Literals.REPLACE_OPERATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getSearch()
  {
    return search;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSearch(ComplexValue newSearch, NotificationChain msgs)
  {
    ComplexValue oldSearch = search;
    search = newSearch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.REPLACE_OPERATION__SEARCH, oldSearch, newSearch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSearch(ComplexValue newSearch)
  {
    if (newSearch != search)
    {
      NotificationChain msgs = null;
      if (search != null)
        msgs = ((InternalEObject)search).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.REPLACE_OPERATION__SEARCH, null, msgs);
      if (newSearch != null)
        msgs = ((InternalEObject)newSearch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.REPLACE_OPERATION__SEARCH, null, msgs);
      msgs = basicSetSearch(newSearch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.REPLACE_OPERATION__SEARCH, newSearch, newSearch));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getWith()
  {
    return with;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWith(ComplexValue newWith, NotificationChain msgs)
  {
    ComplexValue oldWith = with;
    with = newWith;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.REPLACE_OPERATION__WITH, oldWith, newWith);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setWith(ComplexValue newWith)
  {
    if (newWith != with)
    {
      NotificationChain msgs = null;
      if (with != null)
        msgs = ((InternalEObject)with).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.REPLACE_OPERATION__WITH, null, msgs);
      if (newWith != null)
        msgs = ((InternalEObject)newWith).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.REPLACE_OPERATION__WITH, null, msgs);
      msgs = basicSetWith(newWith, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.REPLACE_OPERATION__WITH, newWith, newWith));
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
      case XmlManipModulePackage.REPLACE_OPERATION__SEARCH:
        return basicSetSearch(null, msgs);
      case XmlManipModulePackage.REPLACE_OPERATION__WITH:
        return basicSetWith(null, msgs);
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
      case XmlManipModulePackage.REPLACE_OPERATION__SEARCH:
        return getSearch();
      case XmlManipModulePackage.REPLACE_OPERATION__WITH:
        return getWith();
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
      case XmlManipModulePackage.REPLACE_OPERATION__SEARCH:
        setSearch((ComplexValue)newValue);
        return;
      case XmlManipModulePackage.REPLACE_OPERATION__WITH:
        setWith((ComplexValue)newValue);
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
      case XmlManipModulePackage.REPLACE_OPERATION__SEARCH:
        setSearch((ComplexValue)null);
        return;
      case XmlManipModulePackage.REPLACE_OPERATION__WITH:
        setWith((ComplexValue)null);
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
      case XmlManipModulePackage.REPLACE_OPERATION__SEARCH:
        return search != null;
      case XmlManipModulePackage.REPLACE_OPERATION__WITH:
        return with != null;
    }
    return super.eIsSet(featureID);
  }

} // ReplaceOperationImpl
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
