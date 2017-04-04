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
package com.ms.qaTools.saturn.resources.dataSetResource;

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
 * @see com.ms.qaTools.saturn.resources.dataSetResource.DataSetResourceFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface DataSetResourcePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                 eNAME                                            = "dataSetResource";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                 eNS_URI                                          = "http://www.ms.com/2006/Saturn/Resources/DataSet";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                 eNS_PREFIX                                       = "dataSetResource";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  DataSetResourcePackage eINSTANCE                                        = com.ms.qaTools.saturn.resources.dataSetResource.impl.DataSetResourcePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.dataSetResource.impl.DataSetInstanceResourceImpl <em>Data Set Instance Resource</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.dataSetResource.impl.DataSetInstanceResourceImpl
   * @see com.ms.qaTools.saturn.resources.dataSetResource.impl.DataSetResourcePackageImpl#getDataSetInstanceResource()
   * @generated
   */
  int                    DATA_SET_INSTANCE_RESOURCE                       = 0;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    DATA_SET_INSTANCE_RESOURCE__ENABLED              = TypesPackage.DATA_SET_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    DATA_SET_INSTANCE_RESOURCE__STATE                = TypesPackage.DATA_SET_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                    DATA_SET_INSTANCE_RESOURCE__CONNECTOR_PREFERENCE = TypesPackage.DATA_SET_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    DATA_SET_INSTANCE_RESOURCE__NAME                 = TypesPackage.DATA_SET_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Device Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    DATA_SET_INSTANCE_RESOURCE__DEVICE_RESOURCE      = TypesPackage.DATA_SET_RESOURCE_DEFINITION__DEVICE_RESOURCE;

  /**
   * The feature id for the '<em><b>Data Set</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                    DATA_SET_INSTANCE_RESOURCE__DATA_SET             = TypesPackage.DATA_SET_RESOURCE_DEFINITION__DATA_SET;

  /**
   * The feature id for the '<em><b>Has Col Names</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    DATA_SET_INSTANCE_RESOURCE__HAS_COL_NAMES        = TypesPackage.DATA_SET_RESOURCE_DEFINITION__HAS_COL_NAMES;

  /**
   * The feature id for the '<em><b>Data Set Instance</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    DATA_SET_INSTANCE_RESOURCE__DATA_SET_INSTANCE    = TypesPackage.DATA_SET_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Set Instance Resource</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    DATA_SET_INSTANCE_RESOURCE_FEATURE_COUNT         = TypesPackage.DATA_SET_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.dataSetResource.DataSetInstanceResource <em>Data Set Instance Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Set Instance Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.dataSetResource.DataSetInstanceResource
   * @generated
   */
  EClass getDataSetInstanceResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.dataSetResource.DataSetInstanceResource#getDataSetInstance <em>Data Set Instance</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Set Instance</em>'.
   * @see com.ms.qaTools.saturn.resources.dataSetResource.DataSetInstanceResource#getDataSetInstance()
   * @see #getDataSetInstanceResource()
   * @generated
   */
  EReference getDataSetInstanceResource_DataSetInstance();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DataSetResourceFactory getDataSetResourceFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.dataSetResource.impl.DataSetInstanceResourceImpl <em>Data Set Instance Resource</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.dataSetResource.impl.DataSetInstanceResourceImpl
     * @see com.ms.qaTools.saturn.resources.dataSetResource.impl.DataSetResourcePackageImpl#getDataSetInstanceResource()
     * @generated
     */
    EClass     DATA_SET_INSTANCE_RESOURCE                    = eINSTANCE.getDataSetInstanceResource();

    /**
     * The meta object literal for the '<em><b>Data Set Instance</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DATA_SET_INSTANCE_RESOURCE__DATA_SET_INSTANCE = eINSTANCE.getDataSetInstanceResource_DataSetInstance();

  }

} // DataSetResourcePackage
