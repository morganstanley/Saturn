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
package com.ms.qaTools.saturn.resources.h2Resource;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import com.ms.qaTools.saturn.types.TypesPackage;
import org.eclipse.emf.ecore.EAttribute;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.resources.h2Resource.H2ResourceFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface H2ResourcePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String            eNAME                             = "h2Resource";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String            eNS_URI                           = "http://www.ms.com/2013/Saturn/Resources/H2";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String            eNS_PREFIX                        = "h2Resource";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  H2ResourcePackage eINSTANCE                         = com.ms.qaTools.saturn.resources.h2Resource.impl.H2ResourcePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.h2Resource.impl.AbstractDatabaseImpl <em>Abstract Database</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.h2Resource.impl.AbstractDatabaseImpl
   * @see com.ms.qaTools.saturn.resources.h2Resource.impl.H2ResourcePackageImpl#getAbstractDatabase()
   * @generated
   */
  int               ABSTRACT_DATABASE                 = 0;

  /**
   * The number of structural features of the '<em>Abstract Database</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int               ABSTRACT_DATABASE_FEATURE_COUNT   = 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.h2Resource.impl.FileDatabaseImpl <em>File Database</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.h2Resource.impl.FileDatabaseImpl
   * @see com.ms.qaTools.saturn.resources.h2Resource.impl.H2ResourcePackageImpl#getFileDatabase()
   * @generated
   */
  int               FILE_DATABASE                     = 1;

  /**
   * The feature id for the '<em><b>DB Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int               FILE_DATABASE__DB_RESOURCE        = ABSTRACT_DATABASE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>File Database</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int               FILE_DATABASE_FEATURE_COUNT       = ABSTRACT_DATABASE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.h2Resource.impl.H2ResourceImpl <em>H2 Resource</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.h2Resource.impl.H2ResourceImpl
   * @see com.ms.qaTools.saturn.resources.h2Resource.impl.H2ResourcePackageImpl#getH2Resource()
   * @generated
   */
  int               H2_RESOURCE                       = 2;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               H2_RESOURCE__ENABLED              = TypesPackage.DATABASE_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               H2_RESOURCE__STATE                = TypesPackage.DATABASE_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int               H2_RESOURCE__CONNECTOR_PREFERENCE = TypesPackage.DATABASE_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               H2_RESOURCE__NAME                 = TypesPackage.DATABASE_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Persistent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int H2_RESOURCE__PERSISTENT = TypesPackage.DATABASE_RESOURCE_DEFINITION__PERSISTENT;

  /**
   * The feature id for the '<em><b>Database</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int               H2_RESOURCE__DATABASE             = TypesPackage.DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>DDL Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int               H2_RESOURCE__DDL_RESOURCE         = TypesPackage.DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>H2 Resource</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int               H2_RESOURCE_FEATURE_COUNT         = TypesPackage.DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.h2Resource.impl.MemoryDatabaseImpl <em>Memory Database</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.h2Resource.impl.MemoryDatabaseImpl
   * @see com.ms.qaTools.saturn.resources.h2Resource.impl.H2ResourcePackageImpl#getMemoryDatabase()
   * @generated
   */
  int               MEMORY_DATABASE                   = 3;

  /**
   * The number of structural features of the '<em>Memory Database</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int               MEMORY_DATABASE_FEATURE_COUNT     = ABSTRACT_DATABASE_FEATURE_COUNT + 0;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.h2Resource.AbstractDatabase <em>Abstract Database</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Database</em>'.
   * @see com.ms.qaTools.saturn.resources.h2Resource.AbstractDatabase
   * @generated
   */
  EClass getAbstractDatabase();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.h2Resource.FileDatabase <em>File Database</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>File Database</em>'.
   * @see com.ms.qaTools.saturn.resources.h2Resource.FileDatabase
   * @generated
   */
  EClass getFileDatabase();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.h2Resource.FileDatabase#getDBResource <em>DB Resource</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>DB Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.h2Resource.FileDatabase#getDBResource()
   * @see #getFileDatabase()
   * @generated
   */
  EReference getFileDatabase_DBResource();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.h2Resource.H2Resource <em>H2 Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>H2 Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.h2Resource.H2Resource
   * @generated
   */
  EClass getH2Resource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.h2Resource.H2Resource#getDatabase <em>Database</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Database</em>'.
   * @see com.ms.qaTools.saturn.resources.h2Resource.H2Resource#getDatabase()
   * @see #getH2Resource()
   * @generated
   */
  EReference getH2Resource_Database();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.h2Resource.H2Resource#getDDLResource <em>DDL Resource</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>DDL Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.h2Resource.H2Resource#getDDLResource()
   * @see #getH2Resource()
   * @generated
   */
  EReference getH2Resource_DDLResource();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.h2Resource.MemoryDatabase <em>Memory Database</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Memory Database</em>'.
   * @see com.ms.qaTools.saturn.resources.h2Resource.MemoryDatabase
   * @generated
   */
  EClass getMemoryDatabase();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  H2ResourceFactory getH2ResourceFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.h2Resource.impl.AbstractDatabaseImpl <em>Abstract Database</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.h2Resource.impl.AbstractDatabaseImpl
     * @see com.ms.qaTools.saturn.resources.h2Resource.impl.H2ResourcePackageImpl#getAbstractDatabase()
     * @generated
     */
    EClass     ABSTRACT_DATABASE          = eINSTANCE.getAbstractDatabase();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.h2Resource.impl.FileDatabaseImpl <em>File Database</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.h2Resource.impl.FileDatabaseImpl
     * @see com.ms.qaTools.saturn.resources.h2Resource.impl.H2ResourcePackageImpl#getFileDatabase()
     * @generated
     */
    EClass     FILE_DATABASE              = eINSTANCE.getFileDatabase();

    /**
     * The meta object literal for the '<em><b>DB Resource</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference FILE_DATABASE__DB_RESOURCE = eINSTANCE.getFileDatabase_DBResource();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.h2Resource.impl.H2ResourceImpl <em>H2 Resource</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.h2Resource.impl.H2ResourceImpl
     * @see com.ms.qaTools.saturn.resources.h2Resource.impl.H2ResourcePackageImpl#getH2Resource()
     * @generated
     */
    EClass     H2_RESOURCE                = eINSTANCE.getH2Resource();

    /**
     * The meta object literal for the '<em><b>Database</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference H2_RESOURCE__DATABASE      = eINSTANCE.getH2Resource_Database();

    /**
     * The meta object literal for the '<em><b>DDL Resource</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference H2_RESOURCE__DDL_RESOURCE  = eINSTANCE.getH2Resource_DDLResource();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.h2Resource.impl.MemoryDatabaseImpl <em>Memory Database</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.h2Resource.impl.MemoryDatabaseImpl
     * @see com.ms.qaTools.saturn.resources.h2Resource.impl.H2ResourcePackageImpl#getMemoryDatabase()
     * @generated
     */
    EClass     MEMORY_DATABASE            = eINSTANCE.getMemoryDatabase();

  }

} // H2ResourcePackage
