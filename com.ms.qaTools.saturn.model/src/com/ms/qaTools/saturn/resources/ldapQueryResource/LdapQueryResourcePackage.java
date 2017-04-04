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
package com.ms.qaTools.saturn.resources.ldapQueryResource;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import com.ms.qaTools.saturn.types.TypesPackage;
import com.ms.qaTools.saturn.values.ValuesPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.resources.ldapQueryResource.LdapQueryResourceFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface LdapQueryResourcePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                   eNAME                                     = "ldapQueryResource";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                   eNS_URI                                   = "http://www.ms.com/2011/Saturn/Resources/LDAPQuery";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                   eNS_PREFIX                                = "ldapQueryResource";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  LdapQueryResourcePackage eINSTANCE                                 = com.ms.qaTools.saturn.resources.ldapQueryResource.impl.LdapQueryResourcePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.ldapQueryResource.impl.LDAPQueryFilterImpl <em>LDAP Query Filter</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.ldapQueryResource.impl.LDAPQueryFilterImpl
   * @see com.ms.qaTools.saturn.resources.ldapQueryResource.impl.LdapQueryResourcePackageImpl#getLDAPQueryFilter()
   * @generated
   */
  int                      LDAP_QUERY_FILTER                         = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDAP_QUERY_FILTER__DESCRIPTION = ValuesPackage.COMPLEX_VALUE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      LDAP_QUERY_FILTER__MIXED                  = ValuesPackage.COMPLEX_VALUE__MIXED;

  /**
   * The feature id for the '<em><b>Null</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      LDAP_QUERY_FILTER__NULL                   = ValuesPackage.COMPLEX_VALUE__NULL;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      LDAP_QUERY_FILTER__GROUP                  = ValuesPackage.COMPLEX_VALUE__GROUP;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                      LDAP_QUERY_FILTER__TEXT                   = ValuesPackage.COMPLEX_VALUE__TEXT;

  /**
   * The feature id for the '<em><b>Env Var</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      LDAP_QUERY_FILTER__ENV_VAR                = ValuesPackage.COMPLEX_VALUE__ENV_VAR;

  /**
   * The feature id for the '<em><b>File</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                      LDAP_QUERY_FILTER__FILE                   = ValuesPackage.COMPLEX_VALUE__FILE;

  /**
   * The feature id for the '<em><b>XPath Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      LDAP_QUERY_FILTER__XPATH_VALUE            = ValuesPackage.COMPLEX_VALUE__XPATH_VALUE;

  /**
   * The feature id for the '<em><b>JSON Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDAP_QUERY_FILTER__JSON_VALUE = ValuesPackage.COMPLEX_VALUE__JSON_VALUE;

  /**
   * The feature id for the '<em><b>FIX Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDAP_QUERY_FILTER__FIX_VALUE = ValuesPackage.COMPLEX_VALUE__FIX_VALUE;

  /**
   * The feature id for the '<em><b>Cell Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      LDAP_QUERY_FILTER__CELL_VALUE             = ValuesPackage.COMPLEX_VALUE__CELL_VALUE;

  /**
   * The feature id for the '<em><b>Property Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      LDAP_QUERY_FILTER__PROPERTY_VALUE         = ValuesPackage.COMPLEX_VALUE__PROPERTY_VALUE;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                      LDAP_QUERY_FILTER__CODE                   = ValuesPackage.COMPLEX_VALUE__CODE;

  /**
   * The feature id for the '<em><b>Run Number</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      LDAP_QUERY_FILTER__RUN_NUMBER             = ValuesPackage.COMPLEX_VALUE__RUN_NUMBER;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      LDAP_QUERY_FILTER__REFERENCE              = ValuesPackage.COMPLEX_VALUE__REFERENCE;

  /**
   * The feature id for the '<em><b>Memoize</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      LDAP_QUERY_FILTER__MEMOIZE                = ValuesPackage.COMPLEX_VALUE__MEMOIZE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      LDAP_QUERY_FILTER__NAME                   = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>LDAP Query Filter</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      LDAP_QUERY_FILTER_FEATURE_COUNT           = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.ldapQueryResource.impl.LDAPQueryResourceImpl <em>LDAP Query Resource</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.ldapQueryResource.impl.LDAPQueryResourceImpl
   * @see com.ms.qaTools.saturn.resources.ldapQueryResource.impl.LdapQueryResourcePackageImpl#getLDAPQueryResource()
   * @generated
   */
  int                      LDAP_QUERY_RESOURCE                       = 1;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      LDAP_QUERY_RESOURCE__ENABLED              = TypesPackage.DATA_SET_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      LDAP_QUERY_RESOURCE__STATE                = TypesPackage.DATA_SET_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                      LDAP_QUERY_RESOURCE__CONNECTOR_PREFERENCE = TypesPackage.DATA_SET_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      LDAP_QUERY_RESOURCE__NAME                 = TypesPackage.DATA_SET_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Device Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      LDAP_QUERY_RESOURCE__DEVICE_RESOURCE      = TypesPackage.DATA_SET_RESOURCE_DEFINITION__DEVICE_RESOURCE;

  /**
   * The feature id for the '<em><b>Data Set</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                      LDAP_QUERY_RESOURCE__DATA_SET             = TypesPackage.DATA_SET_RESOURCE_DEFINITION__DATA_SET;

  /**
   * The feature id for the '<em><b>Has Col Names</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      LDAP_QUERY_RESOURCE__HAS_COL_NAMES        = TypesPackage.DATA_SET_RESOURCE_DEFINITION__HAS_COL_NAMES;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      LDAP_QUERY_RESOURCE__TYPE                 = TypesPackage.DATA_SET_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Filters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      LDAP_QUERY_RESOURCE__FILTERS              = TypesPackage.DATA_SET_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Selected Fields</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      LDAP_QUERY_RESOURCE__SELECTED_FIELDS      = TypesPackage.DATA_SET_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>LDAP Query Resource</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      LDAP_QUERY_RESOURCE_FEATURE_COUNT         = TypesPackage.DATA_SET_RESOURCE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.ldapQueryResource.LDAPQueryFilter <em>LDAP Query Filter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>LDAP Query Filter</em>'.
   * @see com.ms.qaTools.saturn.resources.ldapQueryResource.LDAPQueryFilter
   * @generated
   */
  EClass getLDAPQueryFilter();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.ldapQueryResource.LDAPQueryFilter#getName <em>Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ms.qaTools.saturn.resources.ldapQueryResource.LDAPQueryFilter#getName()
   * @see #getLDAPQueryFilter()
   * @generated
   */
  EAttribute getLDAPQueryFilter_Name();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.ldapQueryResource.LDAPQueryResource <em>LDAP Query Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>LDAP Query Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.ldapQueryResource.LDAPQueryResource
   * @generated
   */
  EClass getLDAPQueryResource();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.ldapQueryResource.LDAPQueryResource#getType <em>Type</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.ms.qaTools.saturn.resources.ldapQueryResource.LDAPQueryResource#getType()
   * @see #getLDAPQueryResource()
   * @generated
   */
  EReference getLDAPQueryResource_Type();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.resources.ldapQueryResource.LDAPQueryResource#getFilters <em>Filters</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Filters</em>'.
   * @see com.ms.qaTools.saturn.resources.ldapQueryResource.LDAPQueryResource#getFilters()
   * @see #getLDAPQueryResource()
   * @generated
   */
  EReference getLDAPQueryResource_Filters();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.resources.ldapQueryResource.LDAPQueryResource#getSelectedFields <em>Selected Fields</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Selected Fields</em>'.
   * @see com.ms.qaTools.saturn.resources.ldapQueryResource.LDAPQueryResource#getSelectedFields()
   * @see #getLDAPQueryResource()
   * @generated
   */
  EReference getLDAPQueryResource_SelectedFields();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LdapQueryResourceFactory getLdapQueryResourceFactory();

  /**
   * <!-- begin-user-doc --> Defines literals for the meta objects that represent
   * <ul>
   * <li>each class,</li>
   * <li>each feature of each class,</li>
   * <li>each enum,</li>
   * <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.ldapQueryResource.impl.LDAPQueryFilterImpl <em>LDAP Query Filter</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.ldapQueryResource.impl.LDAPQueryFilterImpl
     * @see com.ms.qaTools.saturn.resources.ldapQueryResource.impl.LdapQueryResourcePackageImpl#getLDAPQueryFilter()
     * @generated
     */
    EClass     LDAP_QUERY_FILTER                    = eINSTANCE.getLDAPQueryFilter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute LDAP_QUERY_FILTER__NAME              = eINSTANCE.getLDAPQueryFilter_Name();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.ldapQueryResource.impl.LDAPQueryResourceImpl <em>LDAP Query Resource</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.ldapQueryResource.impl.LDAPQueryResourceImpl
     * @see com.ms.qaTools.saturn.resources.ldapQueryResource.impl.LdapQueryResourcePackageImpl#getLDAPQueryResource()
     * @generated
     */
    EClass     LDAP_QUERY_RESOURCE                  = eINSTANCE.getLDAPQueryResource();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LDAP_QUERY_RESOURCE__TYPE            = eINSTANCE.getLDAPQueryResource_Type();

    /**
     * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference LDAP_QUERY_RESOURCE__FILTERS         = eINSTANCE.getLDAPQueryResource_Filters();

    /**
     * The meta object literal for the '<em><b>Selected Fields</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference LDAP_QUERY_RESOURCE__SELECTED_FIELDS = eINSTANCE.getLDAPQueryResource_SelectedFields();

  }

} // LdapQueryResourcePackage
