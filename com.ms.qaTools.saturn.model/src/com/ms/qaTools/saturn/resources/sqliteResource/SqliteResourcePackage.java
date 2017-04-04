package com.ms.qaTools.saturn.resources.sqliteResource;

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
 * @see com.ms.qaTools.saturn.resources.sqliteResource.SqliteResourceFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface SqliteResourcePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                eNAME                                  = "sqliteResource";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                eNS_URI                                = "http://www.ms.com/2011/Saturn/Resources/SQLite";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                eNS_PREFIX                             = "sqliteResource";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  SqliteResourcePackage eINSTANCE                              = com.ms.qaTools.saturn.resources.sqliteResource.impl.SqliteResourcePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.sqliteResource.impl.AbstractDatabaseImpl <em>Abstract Database</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.sqliteResource.impl.AbstractDatabaseImpl
   * @see com.ms.qaTools.saturn.resources.sqliteResource.impl.SqliteResourcePackageImpl#getAbstractDatabase()
   * @generated
   */
  int                   ABSTRACT_DATABASE                      = 0;

  /**
   * The number of structural features of the '<em>Abstract Database</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   ABSTRACT_DATABASE_FEATURE_COUNT        = 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.sqliteResource.impl.MemoryDatabaseImpl <em>Memory Database</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.sqliteResource.impl.MemoryDatabaseImpl
   * @see com.ms.qaTools.saturn.resources.sqliteResource.impl.SqliteResourcePackageImpl#getMemoryDatabase()
   * @generated
   */
  int                   MEMORY_DATABASE                        = 1;

  /**
   * The number of structural features of the '<em>Memory Database</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   MEMORY_DATABASE_FEATURE_COUNT          = ABSTRACT_DATABASE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.sqliteResource.impl.SQLiteDatabaseImpl <em>SQ Lite Database</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.sqliteResource.impl.SQLiteDatabaseImpl
   * @see com.ms.qaTools.saturn.resources.sqliteResource.impl.SqliteResourcePackageImpl#getSQLiteDatabase()
   * @generated
   */
  int                   SQ_LITE_DATABASE                       = 2;

  /**
   * The feature id for the '<em><b>DB Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SQ_LITE_DATABASE__DB_RESOURCE          = ABSTRACT_DATABASE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SQ Lite Database</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SQ_LITE_DATABASE_FEATURE_COUNT         = ABSTRACT_DATABASE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.sqliteResource.impl.SQLiteResourceImpl <em>SQ Lite Resource</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.sqliteResource.impl.SQLiteResourceImpl
   * @see com.ms.qaTools.saturn.resources.sqliteResource.impl.SqliteResourcePackageImpl#getSQLiteResource()
   * @generated
   */
  int                   SQ_LITE_RESOURCE                       = 3;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SQ_LITE_RESOURCE__ENABLED              = TypesPackage.DATABASE_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SQ_LITE_RESOURCE__STATE                = TypesPackage.DATABASE_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   SQ_LITE_RESOURCE__CONNECTOR_PREFERENCE = TypesPackage.DATABASE_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SQ_LITE_RESOURCE__NAME                 = TypesPackage.DATABASE_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Persistent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQ_LITE_RESOURCE__PERSISTENT = TypesPackage.DATABASE_RESOURCE_DEFINITION__PERSISTENT;

  /**
   * The feature id for the '<em><b>Database</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   SQ_LITE_RESOURCE__DATABASE             = TypesPackage.DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>DDL Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SQ_LITE_RESOURCE__DDL_RESOURCE         = TypesPackage.DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SQ Lite Resource</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SQ_LITE_RESOURCE_FEATURE_COUNT         = TypesPackage.DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.sqliteResource.AbstractDatabase <em>Abstract Database</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Database</em>'.
   * @see com.ms.qaTools.saturn.resources.sqliteResource.AbstractDatabase
   * @generated
   */
  EClass getAbstractDatabase();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.sqliteResource.MemoryDatabase <em>Memory Database</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Memory Database</em>'.
   * @see com.ms.qaTools.saturn.resources.sqliteResource.MemoryDatabase
   * @generated
   */
  EClass getMemoryDatabase();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.sqliteResource.SQLiteDatabase <em>SQ Lite Database</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>SQ Lite Database</em>'.
   * @see com.ms.qaTools.saturn.resources.sqliteResource.SQLiteDatabase
   * @generated
   */
  EClass getSQLiteDatabase();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.sqliteResource.SQLiteDatabase#getDBResource <em>DB Resource</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>DB Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.sqliteResource.SQLiteDatabase#getDBResource()
   * @see #getSQLiteDatabase()
   * @generated
   */
  EReference getSQLiteDatabase_DBResource();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.sqliteResource.SQLiteResource <em>SQ Lite Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>SQ Lite Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.sqliteResource.SQLiteResource
   * @generated
   */
  EClass getSQLiteResource();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.sqliteResource.SQLiteResource#getDatabase <em>Database</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Database</em>'.
   * @see com.ms.qaTools.saturn.resources.sqliteResource.SQLiteResource#getDatabase()
   * @see #getSQLiteResource()
   * @generated
   */
  EReference getSQLiteResource_Database();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.sqliteResource.SQLiteResource#getDDLResource <em>DDL Resource</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>DDL Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.sqliteResource.SQLiteResource#getDDLResource()
   * @see #getSQLiteResource()
   * @generated
   */
  EReference getSQLiteResource_DDLResource();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SqliteResourceFactory getSqliteResourceFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.sqliteResource.impl.AbstractDatabaseImpl <em>Abstract Database</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.sqliteResource.impl.AbstractDatabaseImpl
     * @see com.ms.qaTools.saturn.resources.sqliteResource.impl.SqliteResourcePackageImpl#getAbstractDatabase()
     * @generated
     */
    EClass     ABSTRACT_DATABASE              = eINSTANCE.getAbstractDatabase();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.sqliteResource.impl.MemoryDatabaseImpl <em>Memory Database</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.sqliteResource.impl.MemoryDatabaseImpl
     * @see com.ms.qaTools.saturn.resources.sqliteResource.impl.SqliteResourcePackageImpl#getMemoryDatabase()
     * @generated
     */
    EClass     MEMORY_DATABASE                = eINSTANCE.getMemoryDatabase();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.sqliteResource.impl.SQLiteDatabaseImpl <em>SQ Lite Database</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.sqliteResource.impl.SQLiteDatabaseImpl
     * @see com.ms.qaTools.saturn.resources.sqliteResource.impl.SqliteResourcePackageImpl#getSQLiteDatabase()
     * @generated
     */
    EClass     SQ_LITE_DATABASE               = eINSTANCE.getSQLiteDatabase();

    /**
     * The meta object literal for the '<em><b>DB Resource</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference SQ_LITE_DATABASE__DB_RESOURCE  = eINSTANCE.getSQLiteDatabase_DBResource();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.sqliteResource.impl.SQLiteResourceImpl <em>SQ Lite Resource</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.sqliteResource.impl.SQLiteResourceImpl
     * @see com.ms.qaTools.saturn.resources.sqliteResource.impl.SqliteResourcePackageImpl#getSQLiteResource()
     * @generated
     */
    EClass     SQ_LITE_RESOURCE               = eINSTANCE.getSQLiteResource();

    /**
     * The meta object literal for the '<em><b>Database</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SQ_LITE_RESOURCE__DATABASE     = eINSTANCE.getSQLiteResource_Database();

    /**
     * The meta object literal for the '<em><b>DDL Resource</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference SQ_LITE_RESOURCE__DDL_RESOURCE = eINSTANCE.getSQLiteResource_DDLResource();

  }

} // SqliteResourcePackage
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
