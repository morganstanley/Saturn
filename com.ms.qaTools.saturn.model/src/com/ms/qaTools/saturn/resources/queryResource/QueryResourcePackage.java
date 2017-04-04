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
package com.ms.qaTools.saturn.resources.queryResource;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import com.ms.qaTools.saturn.types.TypesPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.resources.queryResource.QueryResourceFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface QueryResourcePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String               eNAME                                = "queryResource";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String               eNS_URI                              = "http://www.ms.com/2009/Saturn/Resources/Query";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String               eNS_PREFIX                           = "queryResource";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  QueryResourcePackage eINSTANCE                            = com.ms.qaTools.saturn.resources.queryResource.impl.QueryResourcePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.queryResource.impl.QueryResourceImpl <em>Query Resource</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.queryResource.impl.QueryResourceImpl
   * @see com.ms.qaTools.saturn.resources.queryResource.impl.QueryResourcePackageImpl#getQueryResource()
   * @generated
   */
  int                  QUERY_RESOURCE                       = 0;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  QUERY_RESOURCE__ENABLED              = TypesPackage.DATA_SET_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  QUERY_RESOURCE__STATE                = TypesPackage.DATA_SET_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                  QUERY_RESOURCE__CONNECTOR_PREFERENCE = TypesPackage.DATA_SET_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  QUERY_RESOURCE__NAME                 = TypesPackage.DATA_SET_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Device Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  QUERY_RESOURCE__DEVICE_RESOURCE      = TypesPackage.DATA_SET_RESOURCE_DEFINITION__DEVICE_RESOURCE;

  /**
   * The feature id for the '<em><b>Data Set</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                  QUERY_RESOURCE__DATA_SET             = TypesPackage.DATA_SET_RESOURCE_DEFINITION__DATA_SET;

  /**
   * The feature id for the '<em><b>Has Col Names</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  QUERY_RESOURCE__HAS_COL_NAMES        = TypesPackage.DATA_SET_RESOURCE_DEFINITION__HAS_COL_NAMES;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  QUERY_RESOURCE__QUERY                = TypesPackage.DATA_SET_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Output Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  QUERY_RESOURCE__OUTPUT_RESOURCE      = TypesPackage.DATA_SET_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Query Resource</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                  QUERY_RESOURCE_FEATURE_COUNT         = TypesPackage.DATA_SET_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.queryResource.impl.TableResourceImpl <em>Table Resource</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.queryResource.impl.TableResourceImpl
   * @see com.ms.qaTools.saturn.resources.queryResource.impl.QueryResourcePackageImpl#getTableResource()
   * @generated
   */
  int                  TABLE_RESOURCE                       = 1;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  TABLE_RESOURCE__ENABLED              = TypesPackage.DATA_SET_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  TABLE_RESOURCE__STATE                = TypesPackage.DATA_SET_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                  TABLE_RESOURCE__CONNECTOR_PREFERENCE = TypesPackage.DATA_SET_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  TABLE_RESOURCE__NAME                 = TypesPackage.DATA_SET_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Device Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  TABLE_RESOURCE__DEVICE_RESOURCE      = TypesPackage.DATA_SET_RESOURCE_DEFINITION__DEVICE_RESOURCE;

  /**
   * The feature id for the '<em><b>Data Set</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                  TABLE_RESOURCE__DATA_SET             = TypesPackage.DATA_SET_RESOURCE_DEFINITION__DATA_SET;

  /**
   * The feature id for the '<em><b>Has Col Names</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  TABLE_RESOURCE__HAS_COL_NAMES        = TypesPackage.DATA_SET_RESOURCE_DEFINITION__HAS_COL_NAMES;

  /**
   * The feature id for the '<em><b>Table</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  TABLE_RESOURCE__TABLE                = TypesPackage.DATA_SET_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Output Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  TABLE_RESOURCE__OUTPUT_RESOURCE      = TypesPackage.DATA_SET_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Table Resource</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                  TABLE_RESOURCE_FEATURE_COUNT         = TypesPackage.DATA_SET_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.queryResource.QueryResource <em>Query Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Query Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.queryResource.QueryResource
   * @generated
   */
  EClass getQueryResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.queryResource.QueryResource#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see com.ms.qaTools.saturn.resources.queryResource.QueryResource#getQuery()
   * @see #getQueryResource()
   * @generated
   */
  EReference getQueryResource_Query();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.queryResource.QueryResource#getOutputResource <em>Output Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.queryResource.QueryResource#getOutputResource()
   * @see #getQueryResource()
   * @generated
   */
  EReference getQueryResource_OutputResource();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.queryResource.TableResource <em>Table Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.queryResource.TableResource
   * @generated
   */
  EClass getTableResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.queryResource.TableResource#getTable <em>Table</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Table</em>'.
   * @see com.ms.qaTools.saturn.resources.queryResource.TableResource#getTable()
   * @see #getTableResource()
   * @generated
   */
  EReference getTableResource_Table();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.queryResource.TableResource#getOutputResource <em>Output Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.queryResource.TableResource#getOutputResource()
   * @see #getTableResource()
   * @generated
   */
  EReference getTableResource_OutputResource();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  QueryResourceFactory getQueryResourceFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.queryResource.impl.QueryResourceImpl <em>Query Resource</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.queryResource.impl.QueryResourceImpl
     * @see com.ms.qaTools.saturn.resources.queryResource.impl.QueryResourcePackageImpl#getQueryResource()
     * @generated
     */
    EClass     QUERY_RESOURCE                  = eINSTANCE.getQueryResource();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY_RESOURCE__QUERY           = eINSTANCE.getQueryResource_Query();

    /**
     * The meta object literal for the '<em><b>Output Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference QUERY_RESOURCE__OUTPUT_RESOURCE = eINSTANCE.getQueryResource_OutputResource();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.queryResource.impl.TableResourceImpl <em>Table Resource</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.queryResource.impl.TableResourceImpl
     * @see com.ms.qaTools.saturn.resources.queryResource.impl.QueryResourcePackageImpl#getTableResource()
     * @generated
     */
    EClass     TABLE_RESOURCE                  = eINSTANCE.getTableResource();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_RESOURCE__TABLE           = eINSTANCE.getTableResource_Table();

    /**
     * The meta object literal for the '<em><b>Output Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference TABLE_RESOURCE__OUTPUT_RESOURCE = eINSTANCE.getTableResource_OutputResource();

  }

} // QueryResourcePackage
