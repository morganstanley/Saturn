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
package com.ms.qaTools.saturn.resources.dsSQLResource;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see com.ms.qaTools.saturn.resources.dsSQLResource.DsSQLResourceFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface DsSQLResourcePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String               eNAME                                 = "dsSQLResource";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String               eNS_URI                               = "http://www.ms.com/2010/Saturn/Resources/DsSQL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String               eNS_PREFIX                            = "dsSQLResource";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  DsSQLResourcePackage eINSTANCE                             = com.ms.qaTools.saturn.resources.dsSQLResource.impl.DsSQLResourcePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.dsSQLResource.impl.AbstractTableImpl <em>Abstract Table</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.dsSQLResource.impl.AbstractTableImpl
   * @see com.ms.qaTools.saturn.resources.dsSQLResource.impl.DsSQLResourcePackageImpl#getAbstractTable()
   * @generated
   */
  int                  ABSTRACT_TABLE                        = 0;

  /**
   * The number of structural features of the '<em>Abstract Table</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                  ABSTRACT_TABLE_FEATURE_COUNT          = 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.dsSQLResource.impl.DsSQLResourceImpl <em>Ds SQL Resource</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.dsSQLResource.impl.DsSQLResourceImpl
   * @see com.ms.qaTools.saturn.resources.dsSQLResource.impl.DsSQLResourcePackageImpl#getDsSQLResource()
   * @generated
   */
  int                  DS_SQL_RESOURCE                       = 1;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  DS_SQL_RESOURCE__ENABLED              = TypesPackage.NAMED_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  DS_SQL_RESOURCE__STATE                = TypesPackage.NAMED_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                  DS_SQL_RESOURCE__CONNECTOR_PREFERENCE = TypesPackage.NAMED_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  DS_SQL_RESOURCE__NAME                 = TypesPackage.NAMED_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>SQL</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  DS_SQL_RESOURCE__SQL                  = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  DS_SQL_RESOURCE__LIBRARIES            = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Databases</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  DS_SQL_RESOURCE__DATABASES            = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Tables</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  DS_SQL_RESOURCE__TABLES               = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Ds SQL Resource</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  DS_SQL_RESOURCE_FEATURE_COUNT         = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.dsSQLResource.impl.TableImpl <em>Table</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.dsSQLResource.impl.TableImpl
   * @see com.ms.qaTools.saturn.resources.dsSQLResource.impl.DsSQLResourcePackageImpl#getTable()
   * @generated
   */
  int                  TABLE                                 = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  TABLE__NAME                           = ABSTRACT_TABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  TABLE__INPUT                          = ABSTRACT_TABLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  TABLE__ENABLED                        = ABSTRACT_TABLE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Table</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  TABLE_FEATURE_COUNT                   = ABSTRACT_TABLE_FEATURE_COUNT + 3;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.dsSQLResource.AbstractTable <em>Abstract Table</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Table</em>'.
   * @see com.ms.qaTools.saturn.resources.dsSQLResource.AbstractTable
   * @generated
   */
  EClass getAbstractTable();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.dsSQLResource.DsSQLResource <em>Ds SQL Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Ds SQL Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.dsSQLResource.DsSQLResource
   * @generated
   */
  EClass getDsSQLResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.dsSQLResource.DsSQLResource#getSQL <em>SQL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>SQL</em>'.
   * @see com.ms.qaTools.saturn.resources.dsSQLResource.DsSQLResource#getSQL()
   * @see #getDsSQLResource()
   * @generated
   */
  EReference getDsSQLResource_SQL();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.resources.dsSQLResource.DsSQLResource#getLibraries <em>Libraries</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Libraries</em>'.
   * @see com.ms.qaTools.saturn.resources.dsSQLResource.DsSQLResource#getLibraries()
   * @see #getDsSQLResource()
   * @generated
   */
  EReference getDsSQLResource_Libraries();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.resources.dsSQLResource.DsSQLResource#getDatabases <em>Databases</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Databases</em>'.
   * @see com.ms.qaTools.saturn.resources.dsSQLResource.DsSQLResource#getDatabases()
   * @see #getDsSQLResource()
   * @generated
   */
  EReference getDsSQLResource_Databases();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.resources.dsSQLResource.DsSQLResource#getTables <em>Tables</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tables</em>'.
   * @see com.ms.qaTools.saturn.resources.dsSQLResource.DsSQLResource#getTables()
   * @see #getDsSQLResource()
   * @generated
   */
  EReference getDsSQLResource_Tables();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.dsSQLResource.Table <em>Table</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Table</em>'.
   * @see com.ms.qaTools.saturn.resources.dsSQLResource.Table
   * @generated
   */
  EClass getTable();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.dsSQLResource.Table#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see com.ms.qaTools.saturn.resources.dsSQLResource.Table#getName()
   * @see #getTable()
   * @generated
   */
  EReference getTable_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.dsSQLResource.Table#getInput <em>Input</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>Input</em>'.
   * @see com.ms.qaTools.saturn.resources.dsSQLResource.Table#getInput()
   * @see #getTable()
   * @generated
   */
  EReference getTable_Input();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.dsSQLResource.Table#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.resources.dsSQLResource.Table#isEnabled()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_Enabled();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DsSQLResourceFactory getDsSQLResourceFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.dsSQLResource.impl.AbstractTableImpl <em>Abstract Table</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.dsSQLResource.impl.AbstractTableImpl
     * @see com.ms.qaTools.saturn.resources.dsSQLResource.impl.DsSQLResourcePackageImpl#getAbstractTable()
     * @generated
     */
    EClass     ABSTRACT_TABLE             = eINSTANCE.getAbstractTable();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.dsSQLResource.impl.DsSQLResourceImpl <em>Ds SQL Resource</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.dsSQLResource.impl.DsSQLResourceImpl
     * @see com.ms.qaTools.saturn.resources.dsSQLResource.impl.DsSQLResourcePackageImpl#getDsSQLResource()
     * @generated
     */
    EClass     DS_SQL_RESOURCE            = eINSTANCE.getDsSQLResource();

    /**
     * The meta object literal for the '<em><b>SQL</b></em>' containment reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DS_SQL_RESOURCE__SQL       = eINSTANCE.getDsSQLResource_SQL();

    /**
     * The meta object literal for the '<em><b>Libraries</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DS_SQL_RESOURCE__LIBRARIES = eINSTANCE.getDsSQLResource_Libraries();

    /**
     * The meta object literal for the '<em><b>Databases</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DS_SQL_RESOURCE__DATABASES = eINSTANCE.getDsSQLResource_Databases();

    /**
     * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference DS_SQL_RESOURCE__TABLES    = eINSTANCE.getDsSQLResource_Tables();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.dsSQLResource.impl.TableImpl <em>Table</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.dsSQLResource.impl.TableImpl
     * @see com.ms.qaTools.saturn.resources.dsSQLResource.impl.DsSQLResourcePackageImpl#getTable()
     * @generated
     */
    EClass     TABLE                      = eINSTANCE.getTable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE__NAME                = eINSTANCE.getTable_Name();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE__INPUT               = eINSTANCE.getTable_Input();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute TABLE__ENABLED             = eINSTANCE.getTable_Enabled();

  }

} // DsSQLResourcePackage
