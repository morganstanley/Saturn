package com.ms.qaTools.saturn.resources.ldapQueryResource.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ms.qaTools.saturn.resources.ldapQueryResource.LDAPQueryFilter;
import com.ms.qaTools.saturn.resources.ldapQueryResource.LDAPQueryResource;
import com.ms.qaTools.saturn.resources.ldapQueryResource.LdapQueryResourcePackage;
import com.ms.qaTools.saturn.types.impl.DataSetResourceDefinitionImpl;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>LDAP Query Resource</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.ldapQueryResource.impl.LDAPQueryResourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.ldapQueryResource.impl.LDAPQueryResourceImpl#getFilters <em>Filters</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.ldapQueryResource.impl.LDAPQueryResourceImpl#getSelectedFields <em>Selected Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LDAPQueryResourceImpl extends DataSetResourceDefinitionImpl implements LDAPQueryResource
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ComplexValue           type;

  /**
   * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getFilters()
   * @generated
   * @ordered
   */
  protected EList<LDAPQueryFilter> filters;

  /**
   * The cached value of the '{@link #getSelectedFields() <em>Selected Fields</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getSelectedFields()
   * @generated
   * @ordered
   */
  protected EList<ComplexValue>    selectedFields;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected LDAPQueryResourceImpl()
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
    return LdapQueryResourcePackage.Literals.LDAP_QUERY_RESOURCE;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(ComplexValue newType, NotificationChain msgs)
  {
    ComplexValue oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LdapQueryResourcePackage.LDAP_QUERY_RESOURCE__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setType(ComplexValue newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LdapQueryResourcePackage.LDAP_QUERY_RESOURCE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LdapQueryResourcePackage.LDAP_QUERY_RESOURCE__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LdapQueryResourcePackage.LDAP_QUERY_RESOURCE__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<LDAPQueryFilter> getFilters()
  {
    if (filters == null)
    {
      filters = new EObjectContainmentEList<LDAPQueryFilter>(LDAPQueryFilter.class, this, LdapQueryResourcePackage.LDAP_QUERY_RESOURCE__FILTERS);
    }
    return filters;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<ComplexValue> getSelectedFields()
  {
    if (selectedFields == null)
    {
      selectedFields = new EObjectContainmentEList<ComplexValue>(ComplexValue.class, this, LdapQueryResourcePackage.LDAP_QUERY_RESOURCE__SELECTED_FIELDS);
    }
    return selectedFields;
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
      case LdapQueryResourcePackage.LDAP_QUERY_RESOURCE__TYPE:
        return basicSetType(null, msgs);
      case LdapQueryResourcePackage.LDAP_QUERY_RESOURCE__FILTERS:
        return ((InternalEList<?>)getFilters()).basicRemove(otherEnd, msgs);
      case LdapQueryResourcePackage.LDAP_QUERY_RESOURCE__SELECTED_FIELDS:
        return ((InternalEList<?>)getSelectedFields()).basicRemove(otherEnd, msgs);
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
      case LdapQueryResourcePackage.LDAP_QUERY_RESOURCE__TYPE:
        return getType();
      case LdapQueryResourcePackage.LDAP_QUERY_RESOURCE__FILTERS:
        return getFilters();
      case LdapQueryResourcePackage.LDAP_QUERY_RESOURCE__SELECTED_FIELDS:
        return getSelectedFields();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LdapQueryResourcePackage.LDAP_QUERY_RESOURCE__TYPE:
        setType((ComplexValue)newValue);
        return;
      case LdapQueryResourcePackage.LDAP_QUERY_RESOURCE__FILTERS:
        getFilters().clear();
        getFilters().addAll((Collection<? extends LDAPQueryFilter>)newValue);
        return;
      case LdapQueryResourcePackage.LDAP_QUERY_RESOURCE__SELECTED_FIELDS:
        getSelectedFields().clear();
        getSelectedFields().addAll((Collection<? extends ComplexValue>)newValue);
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
      case LdapQueryResourcePackage.LDAP_QUERY_RESOURCE__TYPE:
        setType((ComplexValue)null);
        return;
      case LdapQueryResourcePackage.LDAP_QUERY_RESOURCE__FILTERS:
        getFilters().clear();
        return;
      case LdapQueryResourcePackage.LDAP_QUERY_RESOURCE__SELECTED_FIELDS:
        getSelectedFields().clear();
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
      case LdapQueryResourcePackage.LDAP_QUERY_RESOURCE__TYPE:
        return type != null;
      case LdapQueryResourcePackage.LDAP_QUERY_RESOURCE__FILTERS:
        return filters != null && !filters.isEmpty();
      case LdapQueryResourcePackage.LDAP_QUERY_RESOURCE__SELECTED_FIELDS:
        return selectedFields != null && !selectedFields.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} // LDAPQueryResourceImpl
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
