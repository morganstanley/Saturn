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
package com.ms.qaTools.saturn.resources.fileResource;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see com.ms.qaTools.saturn.resources.fileResource.FileResourceFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface FileResourcePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String              eNAME                                       = "fileResource";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String              eNS_URI                                     = "http://www.ms.com/2006/Saturn/Resources/Files";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String              eNS_PREFIX                                  = "fileResource";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  FileResourcePackage eINSTANCE                                   = com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.DataSetFileImpl <em>Data Set File</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.DataSetFileImpl
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getDataSetFile()
   * @generated
   */
  int                 DATA_SET_FILE                               = 4;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DATA_SET_FILE__ENABLED                      = TypesPackage.DATA_SET_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DATA_SET_FILE__STATE                        = TypesPackage.DATA_SET_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 DATA_SET_FILE__CONNECTOR_PREFERENCE         = TypesPackage.DATA_SET_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DATA_SET_FILE__NAME                         = TypesPackage.DATA_SET_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Device Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DATA_SET_FILE__DEVICE_RESOURCE              = TypesPackage.DATA_SET_RESOURCE_DEFINITION__DEVICE_RESOURCE;

  /**
   * The feature id for the '<em><b>Data Set</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 DATA_SET_FILE__DATA_SET                     = TypesPackage.DATA_SET_RESOURCE_DEFINITION__DATA_SET;

  /**
   * The feature id for the '<em><b>Has Col Names</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DATA_SET_FILE__HAS_COL_NAMES                = TypesPackage.DATA_SET_RESOURCE_DEFINITION__HAS_COL_NAMES;

  /**
   * The feature id for the '<em><b>First Row</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DATA_SET_FILE__FIRST_ROW                    = TypesPackage.DATA_SET_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Set File</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 DATA_SET_FILE_FEATURE_COUNT                 = TypesPackage.DATA_SET_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.BinaryFileImpl <em>Binary File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.BinaryFileImpl
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getBinaryFile()
   * @generated
   */
  int BINARY_FILE = 0;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_FILE__ENABLED = DATA_SET_FILE__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_FILE__STATE = DATA_SET_FILE__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_FILE__CONNECTOR_PREFERENCE = DATA_SET_FILE__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_FILE__NAME = DATA_SET_FILE__NAME;

  /**
   * The feature id for the '<em><b>Device Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_FILE__DEVICE_RESOURCE = DATA_SET_FILE__DEVICE_RESOURCE;

  /**
   * The feature id for the '<em><b>Data Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_FILE__DATA_SET = DATA_SET_FILE__DATA_SET;

  /**
   * The feature id for the '<em><b>Has Col Names</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_FILE__HAS_COL_NAMES = DATA_SET_FILE__HAS_COL_NAMES;

  /**
   * The feature id for the '<em><b>First Row</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_FILE__FIRST_ROW = DATA_SET_FILE__FIRST_ROW;

  /**
   * The feature id for the '<em><b>Chunk Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_FILE__CHUNK_SIZE = DATA_SET_FILE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Binary File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_FILE_FEATURE_COUNT = DATA_SET_FILE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.CSVFileImpl <em>CSV File</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.CSVFileImpl
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getCSVFile()
   * @generated
   */
  int                 CSV_FILE                                    = 1;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 CSV_FILE__ENABLED                           = DATA_SET_FILE__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 CSV_FILE__STATE                             = DATA_SET_FILE__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 CSV_FILE__CONNECTOR_PREFERENCE              = DATA_SET_FILE__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 CSV_FILE__NAME                              = DATA_SET_FILE__NAME;

  /**
   * The feature id for the '<em><b>Device Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 CSV_FILE__DEVICE_RESOURCE                   = DATA_SET_FILE__DEVICE_RESOURCE;

  /**
   * The feature id for the '<em><b>Data Set</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 CSV_FILE__DATA_SET                          = DATA_SET_FILE__DATA_SET;

  /**
   * The feature id for the '<em><b>Has Col Names</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 CSV_FILE__HAS_COL_NAMES                     = DATA_SET_FILE__HAS_COL_NAMES;

  /**
   * The feature id for the '<em><b>First Row</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 CSV_FILE__FIRST_ROW                         = DATA_SET_FILE__FIRST_ROW;

  /**
   * The number of structural features of the '<em>CSV File</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 CSV_FILE_FEATURE_COUNT                      = DATA_SET_FILE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.CustomFileImpl <em>Custom File</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.CustomFileImpl
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getCustomFile()
   * @generated
   */
  int                 CUSTOM_FILE                                 = 2;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 CUSTOM_FILE__ENABLED                        = DATA_SET_FILE__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 CUSTOM_FILE__STATE                          = DATA_SET_FILE__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 CUSTOM_FILE__CONNECTOR_PREFERENCE           = DATA_SET_FILE__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 CUSTOM_FILE__NAME                           = DATA_SET_FILE__NAME;

  /**
   * The feature id for the '<em><b>Device Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 CUSTOM_FILE__DEVICE_RESOURCE                = DATA_SET_FILE__DEVICE_RESOURCE;

  /**
   * The feature id for the '<em><b>Data Set</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 CUSTOM_FILE__DATA_SET                       = DATA_SET_FILE__DATA_SET;

  /**
   * The feature id for the '<em><b>Has Col Names</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 CUSTOM_FILE__HAS_COL_NAMES                  = DATA_SET_FILE__HAS_COL_NAMES;

  /**
   * The feature id for the '<em><b>First Row</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 CUSTOM_FILE__FIRST_ROW                      = DATA_SET_FILE__FIRST_ROW;

  /**
   * The feature id for the '<em><b>Null Marker</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 CUSTOM_FILE__NULL_MARKER                    = DATA_SET_FILE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Row Separator</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 CUSTOM_FILE__ROW_SEPARATOR                  = DATA_SET_FILE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Cell Separator</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 CUSTOM_FILE__CELL_SEPARATOR                 = DATA_SET_FILE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Quote Character</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FILE__QUOTE_CHARACTER = DATA_SET_FILE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Escape Character</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FILE__ESCAPE_CHARACTER = DATA_SET_FILE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Has Nulls</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 CUSTOM_FILE__HAS_NULLS                      = DATA_SET_FILE_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Custom File</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 CUSTOM_FILE_FEATURE_COUNT                   = DATA_SET_FILE_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.DataFileImpl <em>Data File</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.DataFileImpl
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getDataFile()
   * @generated
   */
  int                 DATA_FILE                                   = 3;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DATA_FILE__ENABLED                          = DATA_SET_FILE__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DATA_FILE__STATE                            = DATA_SET_FILE__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 DATA_FILE__CONNECTOR_PREFERENCE             = DATA_SET_FILE__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DATA_FILE__NAME                             = DATA_SET_FILE__NAME;

  /**
   * The feature id for the '<em><b>Device Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DATA_FILE__DEVICE_RESOURCE                  = DATA_SET_FILE__DEVICE_RESOURCE;

  /**
   * The feature id for the '<em><b>Data Set</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 DATA_FILE__DATA_SET                         = DATA_SET_FILE__DATA_SET;

  /**
   * The feature id for the '<em><b>Has Col Names</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DATA_FILE__HAS_COL_NAMES                    = DATA_SET_FILE__HAS_COL_NAMES;

  /**
   * The feature id for the '<em><b>First Row</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DATA_FILE__FIRST_ROW                        = DATA_SET_FILE__FIRST_ROW;

  /**
   * The number of structural features of the '<em>Data File</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DATA_FILE_FEATURE_COUNT                     = DATA_SET_FILE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.DeviceFileImpl <em>Device File</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.DeviceFileImpl
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getDeviceFile()
   * @generated
   */
  int                 DEVICE_FILE                                 = 5;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DEVICE_FILE__ENABLED                        = TypesPackage.DEVICE_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DEVICE_FILE__STATE                          = TypesPackage.DEVICE_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 DEVICE_FILE__CONNECTOR_PREFERENCE           = TypesPackage.DEVICE_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DEVICE_FILE__NAME                           = TypesPackage.DEVICE_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Initialize</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DEVICE_FILE__INITIALIZE                     = TypesPackage.DEVICE_RESOURCE_DEFINITION__INITIALIZE;

  /**
   * The feature id for the '<em><b>Is Inline</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DEVICE_FILE__IS_INLINE                      = TypesPackage.DEVICE_RESOURCE_DEFINITION__IS_INLINE;

  /**
   * The feature id for the '<em><b>File Name</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 DEVICE_FILE__FILE_NAME                      = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Append</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DEVICE_FILE__APPEND                         = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Can Read</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DEVICE_FILE__CAN_READ                       = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Can Write</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DEVICE_FILE__CAN_WRITE                      = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Exists</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DEVICE_FILE__EXISTS                         = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Create</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DEVICE_FILE__CREATE                         = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DEVICE_FILE__FILTER                         = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Device File</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 DEVICE_FILE_FEATURE_COUNT                   = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.ExcelWorkBookImpl <em>Excel Work Book</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.ExcelWorkBookImpl
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getExcelWorkBook()
   * @generated
   */
  int                 EXCEL_WORK_BOOK                             = 6;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 EXCEL_WORK_BOOK__ENABLED                    = DEVICE_FILE__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 EXCEL_WORK_BOOK__STATE                      = DEVICE_FILE__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 EXCEL_WORK_BOOK__CONNECTOR_PREFERENCE       = DEVICE_FILE__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 EXCEL_WORK_BOOK__NAME                       = DEVICE_FILE__NAME;

  /**
   * The feature id for the '<em><b>Initialize</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 EXCEL_WORK_BOOK__INITIALIZE                 = DEVICE_FILE__INITIALIZE;

  /**
   * The feature id for the '<em><b>Is Inline</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 EXCEL_WORK_BOOK__IS_INLINE                  = DEVICE_FILE__IS_INLINE;

  /**
   * The feature id for the '<em><b>File Name</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 EXCEL_WORK_BOOK__FILE_NAME                  = DEVICE_FILE__FILE_NAME;

  /**
   * The feature id for the '<em><b>Append</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 EXCEL_WORK_BOOK__APPEND                     = DEVICE_FILE__APPEND;

  /**
   * The feature id for the '<em><b>Can Read</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 EXCEL_WORK_BOOK__CAN_READ                   = DEVICE_FILE__CAN_READ;

  /**
   * The feature id for the '<em><b>Can Write</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 EXCEL_WORK_BOOK__CAN_WRITE                  = DEVICE_FILE__CAN_WRITE;

  /**
   * The feature id for the '<em><b>Exists</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 EXCEL_WORK_BOOK__EXISTS                     = DEVICE_FILE__EXISTS;

  /**
   * The feature id for the '<em><b>Create</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 EXCEL_WORK_BOOK__CREATE                     = DEVICE_FILE__CREATE;

  /**
   * The feature id for the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 EXCEL_WORK_BOOK__FILTER                     = DEVICE_FILE__FILTER;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 EXCEL_WORK_BOOK__VERSION                    = DEVICE_FILE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Excel Work Book</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 EXCEL_WORK_BOOK_FEATURE_COUNT               = DEVICE_FILE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.ExcelWorkSheetImpl <em>Excel Work Sheet</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.ExcelWorkSheetImpl
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getExcelWorkSheet()
   * @generated
   */
  int                 EXCEL_WORK_SHEET                            = 7;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 EXCEL_WORK_SHEET__ENABLED                   = DATA_SET_FILE__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 EXCEL_WORK_SHEET__STATE                     = DATA_SET_FILE__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 EXCEL_WORK_SHEET__CONNECTOR_PREFERENCE      = DATA_SET_FILE__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 EXCEL_WORK_SHEET__NAME                      = DATA_SET_FILE__NAME;

  /**
   * The feature id for the '<em><b>Device Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 EXCEL_WORK_SHEET__DEVICE_RESOURCE           = DATA_SET_FILE__DEVICE_RESOURCE;

  /**
   * The feature id for the '<em><b>Data Set</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 EXCEL_WORK_SHEET__DATA_SET                  = DATA_SET_FILE__DATA_SET;

  /**
   * The feature id for the '<em><b>Has Col Names</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 EXCEL_WORK_SHEET__HAS_COL_NAMES             = DATA_SET_FILE__HAS_COL_NAMES;

  /**
   * The feature id for the '<em><b>First Row</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 EXCEL_WORK_SHEET__FIRST_ROW                 = DATA_SET_FILE__FIRST_ROW;

  /**
   * The feature id for the '<em><b>Work Sheet</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 EXCEL_WORK_SHEET__WORK_SHEET                = DATA_SET_FILE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Null Marker</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 EXCEL_WORK_SHEET__NULL_MARKER               = DATA_SET_FILE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Has Nulls</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 EXCEL_WORK_SHEET__HAS_NULLS                 = DATA_SET_FILE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Excel Work Sheet</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 EXCEL_WORK_SHEET_FEATURE_COUNT              = DATA_SET_FILE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.FixedWidthFileImpl <em>Fixed Width File</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.FixedWidthFileImpl
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getFixedWidthFile()
   * @generated
   */
  int                 FIXED_WIDTH_FILE                            = 8;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 FIXED_WIDTH_FILE__ENABLED                   = DATA_SET_FILE__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 FIXED_WIDTH_FILE__STATE                     = DATA_SET_FILE__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 FIXED_WIDTH_FILE__CONNECTOR_PREFERENCE      = DATA_SET_FILE__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 FIXED_WIDTH_FILE__NAME                      = DATA_SET_FILE__NAME;

  /**
   * The feature id for the '<em><b>Device Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 FIXED_WIDTH_FILE__DEVICE_RESOURCE           = DATA_SET_FILE__DEVICE_RESOURCE;

  /**
   * The feature id for the '<em><b>Data Set</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 FIXED_WIDTH_FILE__DATA_SET                  = DATA_SET_FILE__DATA_SET;

  /**
   * The feature id for the '<em><b>Has Col Names</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 FIXED_WIDTH_FILE__HAS_COL_NAMES             = DATA_SET_FILE__HAS_COL_NAMES;

  /**
   * The feature id for the '<em><b>First Row</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 FIXED_WIDTH_FILE__FIRST_ROW                 = DATA_SET_FILE__FIRST_ROW;

  /**
   * The feature id for the '<em><b>Config File</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 FIXED_WIDTH_FILE__CONFIG_FILE               = DATA_SET_FILE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Fixed Width File</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 FIXED_WIDTH_FILE_FEATURE_COUNT              = DATA_SET_FILE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.FIXFileImpl <em>FIX File</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.FIXFileImpl
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getFIXFile()
   * @generated
   */
  int                 FIX_FILE                                    = 9;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 FIX_FILE__ENABLED                           = DATA_SET_FILE__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 FIX_FILE__STATE                             = DATA_SET_FILE__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 FIX_FILE__CONNECTOR_PREFERENCE              = DATA_SET_FILE__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 FIX_FILE__NAME                              = DATA_SET_FILE__NAME;

  /**
   * The feature id for the '<em><b>Device Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 FIX_FILE__DEVICE_RESOURCE                   = DATA_SET_FILE__DEVICE_RESOURCE;

  /**
   * The feature id for the '<em><b>Data Set</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 FIX_FILE__DATA_SET                          = DATA_SET_FILE__DATA_SET;

  /**
   * The feature id for the '<em><b>Has Col Names</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 FIX_FILE__HAS_COL_NAMES                     = DATA_SET_FILE__HAS_COL_NAMES;

  /**
   * The feature id for the '<em><b>First Row</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 FIX_FILE__FIRST_ROW                         = DATA_SET_FILE__FIRST_ROW;

  /**
   * The feature id for the '<em><b>Separator</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 FIX_FILE__SEPARATOR                         = DATA_SET_FILE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dictionary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIX_FILE__DICTIONARY = DATA_SET_FILE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Do Validation</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 FIX_FILE__DO_VALIDATION                     = DATA_SET_FILE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>FIX File</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 FIX_FILE_FEATURE_COUNT                      = DATA_SET_FILE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.GoogleProtoBufFileImpl <em>Google Proto Buf File</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.GoogleProtoBufFileImpl
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getGoogleProtoBufFile()
   * @generated
   */
  int                 GOOGLE_PROTO_BUF_FILE                       = 10;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 GOOGLE_PROTO_BUF_FILE__ENABLED              = DATA_SET_FILE__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 GOOGLE_PROTO_BUF_FILE__STATE                = DATA_SET_FILE__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 GOOGLE_PROTO_BUF_FILE__CONNECTOR_PREFERENCE = DATA_SET_FILE__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 GOOGLE_PROTO_BUF_FILE__NAME                 = DATA_SET_FILE__NAME;

  /**
   * The feature id for the '<em><b>Device Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 GOOGLE_PROTO_BUF_FILE__DEVICE_RESOURCE      = DATA_SET_FILE__DEVICE_RESOURCE;

  /**
   * The feature id for the '<em><b>Data Set</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 GOOGLE_PROTO_BUF_FILE__DATA_SET             = DATA_SET_FILE__DATA_SET;

  /**
   * The feature id for the '<em><b>Has Col Names</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 GOOGLE_PROTO_BUF_FILE__HAS_COL_NAMES        = DATA_SET_FILE__HAS_COL_NAMES;

  /**
   * The feature id for the '<em><b>First Row</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 GOOGLE_PROTO_BUF_FILE__FIRST_ROW            = DATA_SET_FILE__FIRST_ROW;

  /**
   * The feature id for the '<em><b>Classname</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 GOOGLE_PROTO_BUF_FILE__CLASSNAME            = DATA_SET_FILE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Jar Location</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 GOOGLE_PROTO_BUF_FILE__JAR_LOCATION         = DATA_SET_FILE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Read Encoded</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 GOOGLE_PROTO_BUF_FILE__READ_ENCODED         = DATA_SET_FILE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Read Delimited</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 GOOGLE_PROTO_BUF_FILE__READ_DELIMITED       = DATA_SET_FILE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Google Proto Buf File</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 GOOGLE_PROTO_BUF_FILE_FEATURE_COUNT         = DATA_SET_FILE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.JsonFileImpl <em>Json File</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.JsonFileImpl
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getJsonFile()
   * @generated
   */
  int                 JSON_FILE                                   = 11;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 JSON_FILE__ENABLED                          = DATA_SET_FILE__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 JSON_FILE__STATE                            = DATA_SET_FILE__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 JSON_FILE__CONNECTOR_PREFERENCE             = DATA_SET_FILE__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 JSON_FILE__NAME                             = DATA_SET_FILE__NAME;

  /**
   * The feature id for the '<em><b>Device Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 JSON_FILE__DEVICE_RESOURCE                  = DATA_SET_FILE__DEVICE_RESOURCE;

  /**
   * The feature id for the '<em><b>Data Set</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 JSON_FILE__DATA_SET                         = DATA_SET_FILE__DATA_SET;

  /**
   * The feature id for the '<em><b>Has Col Names</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 JSON_FILE__HAS_COL_NAMES                    = DATA_SET_FILE__HAS_COL_NAMES;

  /**
   * The feature id for the '<em><b>First Row</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 JSON_FILE__FIRST_ROW                        = DATA_SET_FILE__FIRST_ROW;

  /**
   * The number of structural features of the '<em>Json File</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 JSON_FILE_FEATURE_COUNT                     = DATA_SET_FILE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.LineFileImpl <em>Line File</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.LineFileImpl
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getLineFile()
   * @generated
   */
  int                 LINE_FILE                                   = 12;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 LINE_FILE__ENABLED                          = DATA_SET_FILE__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 LINE_FILE__STATE                            = DATA_SET_FILE__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 LINE_FILE__CONNECTOR_PREFERENCE             = DATA_SET_FILE__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 LINE_FILE__NAME                             = DATA_SET_FILE__NAME;

  /**
   * The feature id for the '<em><b>Device Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 LINE_FILE__DEVICE_RESOURCE                  = DATA_SET_FILE__DEVICE_RESOURCE;

  /**
   * The feature id for the '<em><b>Data Set</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 LINE_FILE__DATA_SET                         = DATA_SET_FILE__DATA_SET;

  /**
   * The feature id for the '<em><b>Has Col Names</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 LINE_FILE__HAS_COL_NAMES                    = DATA_SET_FILE__HAS_COL_NAMES;

  /**
   * The feature id for the '<em><b>First Row</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 LINE_FILE__FIRST_ROW                        = DATA_SET_FILE__FIRST_ROW;

  /**
   * The feature id for the '<em><b>Trim</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 LINE_FILE__TRIM                             = DATA_SET_FILE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Line File</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 LINE_FILE_FEATURE_COUNT                     = DATA_SET_FILE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.OOCalcWorkBookImpl <em>OO Calc Work Book</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.OOCalcWorkBookImpl
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getOOCalcWorkBook()
   * @generated
   */
  int                 OO_CALC_WORK_BOOK                           = 13;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OO_CALC_WORK_BOOK__ENABLED                  = DEVICE_FILE__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OO_CALC_WORK_BOOK__STATE                    = DEVICE_FILE__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 OO_CALC_WORK_BOOK__CONNECTOR_PREFERENCE     = DEVICE_FILE__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OO_CALC_WORK_BOOK__NAME                     = DEVICE_FILE__NAME;

  /**
   * The feature id for the '<em><b>Initialize</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OO_CALC_WORK_BOOK__INITIALIZE               = DEVICE_FILE__INITIALIZE;

  /**
   * The feature id for the '<em><b>Is Inline</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OO_CALC_WORK_BOOK__IS_INLINE                = DEVICE_FILE__IS_INLINE;

  /**
   * The feature id for the '<em><b>File Name</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 OO_CALC_WORK_BOOK__FILE_NAME                = DEVICE_FILE__FILE_NAME;

  /**
   * The feature id for the '<em><b>Append</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OO_CALC_WORK_BOOK__APPEND                   = DEVICE_FILE__APPEND;

  /**
   * The feature id for the '<em><b>Can Read</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OO_CALC_WORK_BOOK__CAN_READ                 = DEVICE_FILE__CAN_READ;

  /**
   * The feature id for the '<em><b>Can Write</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OO_CALC_WORK_BOOK__CAN_WRITE                = DEVICE_FILE__CAN_WRITE;

  /**
   * The feature id for the '<em><b>Exists</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OO_CALC_WORK_BOOK__EXISTS                   = DEVICE_FILE__EXISTS;

  /**
   * The feature id for the '<em><b>Create</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OO_CALC_WORK_BOOK__CREATE                   = DEVICE_FILE__CREATE;

  /**
   * The feature id for the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OO_CALC_WORK_BOOK__FILTER                   = DEVICE_FILE__FILTER;

  /**
   * The number of structural features of the '<em>OO Calc Work Book</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OO_CALC_WORK_BOOK_FEATURE_COUNT             = DEVICE_FILE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.OOCalcWorkSheetImpl <em>OO Calc Work Sheet</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.OOCalcWorkSheetImpl
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getOOCalcWorkSheet()
   * @generated
   */
  int                 OO_CALC_WORK_SHEET                          = 14;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OO_CALC_WORK_SHEET__ENABLED                 = DATA_SET_FILE__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OO_CALC_WORK_SHEET__STATE                   = DATA_SET_FILE__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 OO_CALC_WORK_SHEET__CONNECTOR_PREFERENCE    = DATA_SET_FILE__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OO_CALC_WORK_SHEET__NAME                    = DATA_SET_FILE__NAME;

  /**
   * The feature id for the '<em><b>Device Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OO_CALC_WORK_SHEET__DEVICE_RESOURCE         = DATA_SET_FILE__DEVICE_RESOURCE;

  /**
   * The feature id for the '<em><b>Data Set</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 OO_CALC_WORK_SHEET__DATA_SET                = DATA_SET_FILE__DATA_SET;

  /**
   * The feature id for the '<em><b>Has Col Names</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OO_CALC_WORK_SHEET__HAS_COL_NAMES           = DATA_SET_FILE__HAS_COL_NAMES;

  /**
   * The feature id for the '<em><b>First Row</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OO_CALC_WORK_SHEET__FIRST_ROW               = DATA_SET_FILE__FIRST_ROW;

  /**
   * The feature id for the '<em><b>Work Sheet</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OO_CALC_WORK_SHEET__WORK_SHEET              = DATA_SET_FILE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Null Marker</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OO_CALC_WORK_SHEET__NULL_MARKER             = DATA_SET_FILE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Has Nulls</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OO_CALC_WORK_SHEET__HAS_NULLS               = DATA_SET_FILE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>OO Calc Work Sheet</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OO_CALC_WORK_SHEET_FEATURE_COUNT            = DATA_SET_FILE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.PropertiesFileImpl <em>Properties File</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.PropertiesFileImpl
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getPropertiesFile()
   * @generated
   */
  int                 PROPERTIES_FILE                             = 15;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 PROPERTIES_FILE__ENABLED                    = DATA_SET_FILE__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 PROPERTIES_FILE__STATE                      = DATA_SET_FILE__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 PROPERTIES_FILE__CONNECTOR_PREFERENCE       = DATA_SET_FILE__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 PROPERTIES_FILE__NAME                       = DATA_SET_FILE__NAME;

  /**
   * The feature id for the '<em><b>Device Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 PROPERTIES_FILE__DEVICE_RESOURCE            = DATA_SET_FILE__DEVICE_RESOURCE;

  /**
   * The feature id for the '<em><b>Data Set</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 PROPERTIES_FILE__DATA_SET                   = DATA_SET_FILE__DATA_SET;

  /**
   * The feature id for the '<em><b>Has Col Names</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 PROPERTIES_FILE__HAS_COL_NAMES              = DATA_SET_FILE__HAS_COL_NAMES;

  /**
   * The feature id for the '<em><b>First Row</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 PROPERTIES_FILE__FIRST_ROW                  = DATA_SET_FILE__FIRST_ROW;

  /**
   * The number of structural features of the '<em>Properties File</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 PROPERTIES_FILE_FEATURE_COUNT               = DATA_SET_FILE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.SlurpFileImpl <em>Slurp File</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.SlurpFileImpl
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getSlurpFile()
   * @generated
   */
  int                 SLURP_FILE                                  = 16;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SLURP_FILE__ENABLED                         = DATA_SET_FILE__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SLURP_FILE__STATE                           = DATA_SET_FILE__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 SLURP_FILE__CONNECTOR_PREFERENCE            = DATA_SET_FILE__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SLURP_FILE__NAME                            = DATA_SET_FILE__NAME;

  /**
   * The feature id for the '<em><b>Device Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SLURP_FILE__DEVICE_RESOURCE                 = DATA_SET_FILE__DEVICE_RESOURCE;

  /**
   * The feature id for the '<em><b>Data Set</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 SLURP_FILE__DATA_SET                        = DATA_SET_FILE__DATA_SET;

  /**
   * The feature id for the '<em><b>Has Col Names</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SLURP_FILE__HAS_COL_NAMES                   = DATA_SET_FILE__HAS_COL_NAMES;

  /**
   * The feature id for the '<em><b>First Row</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SLURP_FILE__FIRST_ROW                       = DATA_SET_FILE__FIRST_ROW;

  /**
   * The number of structural features of the '<em>Slurp File</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SLURP_FILE_FEATURE_COUNT                    = DATA_SET_FILE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.StandardIOImpl <em>Standard IO</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.StandardIOImpl
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getStandardIO()
   * @generated
   */
  int                 STANDARD_IO                                 = 17;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 STANDARD_IO__ENABLED                        = TypesPackage.DEVICE_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 STANDARD_IO__STATE                          = TypesPackage.DEVICE_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 STANDARD_IO__CONNECTOR_PREFERENCE           = TypesPackage.DEVICE_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 STANDARD_IO__NAME                           = TypesPackage.DEVICE_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Initialize</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 STANDARD_IO__INITIALIZE                     = TypesPackage.DEVICE_RESOURCE_DEFINITION__INITIALIZE;

  /**
   * The feature id for the '<em><b>Is Inline</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 STANDARD_IO__IS_INLINE                      = TypesPackage.DEVICE_RESOURCE_DEFINITION__IS_INLINE;

  /**
   * The feature id for the '<em><b>Use Std Err</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 STANDARD_IO__USE_STD_ERR                    = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Standard IO</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 STANDARD_IO_FEATURE_COUNT                   = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.XMLFileImpl <em>XML File</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.XMLFileImpl
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getXMLFile()
   * @generated
   */
  int                 XML_FILE                                    = 18;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XML_FILE__ENABLED                           = DATA_SET_FILE__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XML_FILE__STATE                             = DATA_SET_FILE__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 XML_FILE__CONNECTOR_PREFERENCE              = DATA_SET_FILE__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XML_FILE__NAME                              = DATA_SET_FILE__NAME;

  /**
   * The feature id for the '<em><b>Device Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XML_FILE__DEVICE_RESOURCE                   = DATA_SET_FILE__DEVICE_RESOURCE;

  /**
   * The feature id for the '<em><b>Data Set</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 XML_FILE__DATA_SET                          = DATA_SET_FILE__DATA_SET;

  /**
   * The feature id for the '<em><b>Has Col Names</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XML_FILE__HAS_COL_NAMES                     = DATA_SET_FILE__HAS_COL_NAMES;

  /**
   * The feature id for the '<em><b>First Row</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XML_FILE__FIRST_ROW                         = DATA_SET_FILE__FIRST_ROW;

  /**
   * The feature id for the '<em><b>Namespace Definitions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_FILE__NAMESPACE_DEFINITIONS = DATA_SET_FILE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>XPath</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XML_FILE__XPATH                             = DATA_SET_FILE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>XML File</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XML_FILE_FEATURE_COUNT                      = DATA_SET_FILE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.XMLNamespaceDefinitionImpl <em>XML Namespace Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.XMLNamespaceDefinitionImpl
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getXMLNamespaceDefinition()
   * @generated
   */
  int XML_NAMESPACE_DEFINITION = 19;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_NAMESPACE_DEFINITION__PREFIX = 0;

  /**
   * The feature id for the '<em><b>URI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_NAMESPACE_DEFINITION__URI = 1;

  /**
   * The number of structural features of the '<em>XML Namespace Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_NAMESPACE_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.XMLNamespaceDefinitionsImpl <em>XML Namespace Definitions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.XMLNamespaceDefinitionsImpl
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getXMLNamespaceDefinitions()
   * @generated
   */
  int XML_NAMESPACE_DEFINITIONS = 20;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_NAMESPACE_DEFINITIONS__ENABLED = TypesPackage.NAMED_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_NAMESPACE_DEFINITIONS__STATE = TypesPackage.NAMED_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_NAMESPACE_DEFINITIONS__CONNECTOR_PREFERENCE = TypesPackage.NAMED_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_NAMESPACE_DEFINITIONS__NAME = TypesPackage.NAMED_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Namespace Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_NAMESPACE_DEFINITIONS__NAMESPACE_DEFINITIONS = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XML Namespace Definitions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_NAMESPACE_DEFINITIONS_FEATURE_COUNT = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.fileResource.ExcelVersions <em>Excel Versions</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.fileResource.ExcelVersions
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getExcelVersions()
   * @generated
   */
  int                 EXCEL_VERSIONS                              = 21;

  /**
   * The meta object id for the '<em>Excel Versions Object</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see com.ms.qaTools.saturn.resources.fileResource.ExcelVersions
   * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getExcelVersionsObject()
   * @generated
   */
  int                 EXCEL_VERSIONS_OBJECT                       = 22;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.fileResource.BinaryFile <em>Binary File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary File</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.BinaryFile
   * @generated
   */
  EClass getBinaryFile();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.fileResource.BinaryFile#getChunkSize <em>Chunk Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Chunk Size</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.BinaryFile#getChunkSize()
   * @see #getBinaryFile()
   * @generated
   */
  EAttribute getBinaryFile_ChunkSize();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.fileResource.CSVFile <em>CSV File</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>CSV File</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.CSVFile
   * @generated
   */
  EClass getCSVFile();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.fileResource.CustomFile <em>Custom File</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom File</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.CustomFile
   * @generated
   */
  EClass getCustomFile();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.fileResource.CustomFile#getNullMarker <em>Null Marker</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Null Marker</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.CustomFile#getNullMarker()
   * @see #getCustomFile()
   * @generated
   */
  EReference getCustomFile_NullMarker();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.fileResource.CustomFile#getRowSeparator <em>Row Separator</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Row Separator</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.CustomFile#getRowSeparator()
   * @see #getCustomFile()
   * @generated
   */
  EReference getCustomFile_RowSeparator();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.fileResource.CustomFile#getCellSeparator <em>Cell Separator</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Cell Separator</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.CustomFile#getCellSeparator()
   * @see #getCustomFile()
   * @generated
   */
  EReference getCustomFile_CellSeparator();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.fileResource.CustomFile#getQuoteCharacter <em>Quote Character</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quote Character</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.CustomFile#getQuoteCharacter()
   * @see #getCustomFile()
   * @generated
   */
  EReference getCustomFile_QuoteCharacter();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.fileResource.CustomFile#getEscapeCharacter <em>Escape Character</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Escape Character</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.CustomFile#getEscapeCharacter()
   * @see #getCustomFile()
   * @generated
   */
  EReference getCustomFile_EscapeCharacter();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.fileResource.CustomFile#isHasNulls <em>Has Nulls</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Nulls</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.CustomFile#isHasNulls()
   * @see #getCustomFile()
   * @generated
   */
  EAttribute getCustomFile_HasNulls();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.fileResource.DataFile <em>Data File</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Data File</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.DataFile
   * @generated
   */
  EClass getDataFile();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.fileResource.DataSetFile <em>Data Set File</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Set File</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.DataSetFile
   * @generated
   */
  EClass getDataSetFile();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.fileResource.DataSetFile#getFirstRow <em>First Row</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>First Row</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.DataSetFile#getFirstRow()
   * @see #getDataSetFile()
   * @generated
   */
  EAttribute getDataSetFile_FirstRow();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile <em>Device File</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Device File</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.DeviceFile
   * @generated
   */
  EClass getDeviceFile();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#getFileName <em>File Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>File Name</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.DeviceFile#getFileName()
   * @see #getDeviceFile()
   * @generated
   */
  EReference getDeviceFile_FileName();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isAppend <em>Append</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Append</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isAppend()
   * @see #getDeviceFile()
   * @generated
   */
  EAttribute getDeviceFile_Append();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isCanRead <em>Can Read</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Can Read</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isCanRead()
   * @see #getDeviceFile()
   * @generated
   */
  EAttribute getDeviceFile_CanRead();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isCanWrite <em>Can Write</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Can Write</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isCanWrite()
   * @see #getDeviceFile()
   * @generated
   */
  EAttribute getDeviceFile_CanWrite();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isCreate <em>Create</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Create</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isCreate()
   * @see #getDeviceFile()
   * @generated
   */
  EAttribute getDeviceFile_Create();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isExists <em>Exists</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exists</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isExists()
   * @see #getDeviceFile()
   * @generated
   */
  EAttribute getDeviceFile_Exists();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filter</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.DeviceFile#getFilter()
   * @see #getDeviceFile()
   * @generated
   */
  EAttribute getDeviceFile_Filter();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.fileResource.ExcelWorkBook <em>Excel Work Book</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Excel Work Book</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.ExcelWorkBook
   * @generated
   */
  EClass getExcelWorkBook();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.fileResource.ExcelWorkBook#getVersion <em>Version</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.ExcelWorkBook#getVersion()
   * @see #getExcelWorkBook()
   * @generated
   */
  EAttribute getExcelWorkBook_Version();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.fileResource.ExcelWorkSheet <em>Excel Work Sheet</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Excel Work Sheet</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.ExcelWorkSheet
   * @generated
   */
  EClass getExcelWorkSheet();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.fileResource.ExcelWorkSheet#getWorkSheet <em>Work Sheet</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Work Sheet</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.ExcelWorkSheet#getWorkSheet()
   * @see #getExcelWorkSheet()
   * @generated
   */
  EReference getExcelWorkSheet_WorkSheet();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.fileResource.ExcelWorkSheet#getNullMarker <em>Null Marker</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Null Marker</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.ExcelWorkSheet#getNullMarker()
   * @see #getExcelWorkSheet()
   * @generated
   */
  EReference getExcelWorkSheet_NullMarker();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.fileResource.ExcelWorkSheet#isHasNulls <em>Has Nulls</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Has Nulls</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.ExcelWorkSheet#isHasNulls()
   * @see #getExcelWorkSheet()
   * @generated
   */
  EAttribute getExcelWorkSheet_HasNulls();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.fileResource.FixedWidthFile <em>Fixed Width File</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Fixed Width File</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.FixedWidthFile
   * @generated
   */
  EClass getFixedWidthFile();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.fileResource.FixedWidthFile#getConfigFile <em>Config File</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Config File</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.FixedWidthFile#getConfigFile()
   * @see #getFixedWidthFile()
   * @generated
   */
  EReference getFixedWidthFile_ConfigFile();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.fileResource.FIXFile <em>FIX File</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>FIX File</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.FIXFile
   * @generated
   */
  EClass getFIXFile();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.fileResource.FIXFile#getSeparator <em>Separator</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Separator</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.FIXFile#getSeparator()
   * @see #getFIXFile()
   * @generated
   */
  EReference getFIXFile_Separator();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.fileResource.FIXFile#getDictionary <em>Dictionary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dictionary</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.FIXFile#getDictionary()
   * @see #getFIXFile()
   * @generated
   */
  EReference getFIXFile_Dictionary();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.fileResource.FIXFile#isDoValidation <em>Do Validation</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Do Validation</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.FIXFile#isDoValidation()
   * @see #getFIXFile()
   * @generated
   */
  EAttribute getFIXFile_DoValidation();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile <em>Google Proto Buf File</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Google Proto Buf File</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile
   * @generated
   */
  EClass getGoogleProtoBufFile();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile#getClassname <em>Classname</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Classname</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile#getClassname()
   * @see #getGoogleProtoBufFile()
   * @generated
   */
  EReference getGoogleProtoBufFile_Classname();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile#getJarLocation <em>Jar Location</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Jar Location</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile#getJarLocation()
   * @see #getGoogleProtoBufFile()
   * @generated
   */
  EReference getGoogleProtoBufFile_JarLocation();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile#isReadDelimited <em>Read Delimited</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Read Delimited</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile#isReadDelimited()
   * @see #getGoogleProtoBufFile()
   * @generated
   */
  EAttribute getGoogleProtoBufFile_ReadDelimited();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile#isReadEncoded <em>Read Encoded</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Read Encoded</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile#isReadEncoded()
   * @see #getGoogleProtoBufFile()
   * @generated
   */
  EAttribute getGoogleProtoBufFile_ReadEncoded();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.fileResource.JsonFile <em>Json File</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Json File</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.JsonFile
   * @generated
   */
  EClass getJsonFile();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.fileResource.LineFile <em>Line File</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Line File</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.LineFile
   * @generated
   */
  EClass getLineFile();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.fileResource.LineFile#isTrim <em>Trim</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Trim</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.LineFile#isTrim()
   * @see #getLineFile()
   * @generated
   */
  EAttribute getLineFile_Trim();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkBook <em>OO Calc Work Book</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>OO Calc Work Book</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkBook
   * @generated
   */
  EClass getOOCalcWorkBook();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkSheet <em>OO Calc Work Sheet</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>OO Calc Work Sheet</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkSheet
   * @generated
   */
  EClass getOOCalcWorkSheet();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkSheet#getWorkSheet <em>Work Sheet</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Work Sheet</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkSheet#getWorkSheet()
   * @see #getOOCalcWorkSheet()
   * @generated
   */
  EReference getOOCalcWorkSheet_WorkSheet();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkSheet#getNullMarker <em>Null Marker</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Null Marker</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkSheet#getNullMarker()
   * @see #getOOCalcWorkSheet()
   * @generated
   */
  EReference getOOCalcWorkSheet_NullMarker();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkSheet#isHasNulls <em>Has Nulls</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Has Nulls</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkSheet#isHasNulls()
   * @see #getOOCalcWorkSheet()
   * @generated
   */
  EAttribute getOOCalcWorkSheet_HasNulls();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.fileResource.PropertiesFile <em>Properties File</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Properties File</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.PropertiesFile
   * @generated
   */
  EClass getPropertiesFile();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.fileResource.SlurpFile <em>Slurp File</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Slurp File</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.SlurpFile
   * @generated
   */
  EClass getSlurpFile();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.fileResource.StandardIO <em>Standard IO</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Standard IO</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.StandardIO
   * @generated
   */
  EClass getStandardIO();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.fileResource.StandardIO#isUseStdErr <em>Use Std Err</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Use Std Err</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.StandardIO#isUseStdErr()
   * @see #getStandardIO()
   * @generated
   */
  EAttribute getStandardIO_UseStdErr();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.fileResource.XMLFile <em>XML File</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>XML File</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.XMLFile
   * @generated
   */
  EClass getXMLFile();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.fileResource.XMLFile#getNamespaceDefinitions <em>Namespace Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Namespace Definitions</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.XMLFile#getNamespaceDefinitions()
   * @see #getXMLFile()
   * @generated
   */
  EReference getXMLFile_NamespaceDefinitions();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.fileResource.XMLFile#getXPath <em>XPath</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>XPath</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.XMLFile#getXPath()
   * @see #getXMLFile()
   * @generated
   */
  EReference getXMLFile_XPath();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.fileResource.XMLNamespaceDefinition <em>XML Namespace Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XML Namespace Definition</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.XMLNamespaceDefinition
   * @generated
   */
  EClass getXMLNamespaceDefinition();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.fileResource.XMLNamespaceDefinition#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Prefix</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.XMLNamespaceDefinition#getPrefix()
   * @see #getXMLNamespaceDefinition()
   * @generated
   */
  EReference getXMLNamespaceDefinition_Prefix();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.fileResource.XMLNamespaceDefinition#getURI <em>URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>URI</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.XMLNamespaceDefinition#getURI()
   * @see #getXMLNamespaceDefinition()
   * @generated
   */
  EReference getXMLNamespaceDefinition_URI();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.fileResource.XMLNamespaceDefinitions <em>XML Namespace Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XML Namespace Definitions</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.XMLNamespaceDefinitions
   * @generated
   */
  EClass getXMLNamespaceDefinitions();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.resources.fileResource.XMLNamespaceDefinitions#getNamespaceDefinitions <em>Namespace Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Namespace Definitions</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.XMLNamespaceDefinitions#getNamespaceDefinitions()
   * @see #getXMLNamespaceDefinitions()
   * @generated
   */
  EReference getXMLNamespaceDefinitions_NamespaceDefinitions();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.resources.fileResource.ExcelVersions <em>Excel Versions</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Excel Versions</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.ExcelVersions
   * @generated
   */
  EEnum getExcelVersions();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.resources.fileResource.ExcelVersions <em>Excel Versions Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Excel Versions Object</em>'.
   * @see com.ms.qaTools.saturn.resources.fileResource.ExcelVersions
   * @model instanceClass="com.ms.qaTools.saturn.resources.fileResource.ExcelVersions"
   *        extendedMetaData="name='ExcelVersions:Object' baseType='ExcelVersions'"
   * @generated
   */
  EDataType getExcelVersionsObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FileResourceFactory getFileResourceFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.BinaryFileImpl <em>Binary File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.BinaryFileImpl
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getBinaryFile()
     * @generated
     */
    EClass BINARY_FILE = eINSTANCE.getBinaryFile();

    /**
     * The meta object literal for the '<em><b>Chunk Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_FILE__CHUNK_SIZE = eINSTANCE.getBinaryFile_ChunkSize();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.CSVFileImpl <em>CSV File</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.CSVFileImpl
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getCSVFile()
     * @generated
     */
    EClass     CSV_FILE                              = eINSTANCE.getCSVFile();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.CustomFileImpl <em>Custom File</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.CustomFileImpl
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getCustomFile()
     * @generated
     */
    EClass     CUSTOM_FILE                           = eINSTANCE.getCustomFile();

    /**
     * The meta object literal for the '<em><b>Null Marker</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_FILE__NULL_MARKER              = eINSTANCE.getCustomFile_NullMarker();

    /**
     * The meta object literal for the '<em><b>Row Separator</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference CUSTOM_FILE__ROW_SEPARATOR            = eINSTANCE.getCustomFile_RowSeparator();

    /**
     * The meta object literal for the '<em><b>Cell Separator</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference CUSTOM_FILE__CELL_SEPARATOR           = eINSTANCE.getCustomFile_CellSeparator();

    /**
     * The meta object literal for the '<em><b>Quote Character</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_FILE__QUOTE_CHARACTER = eINSTANCE.getCustomFile_QuoteCharacter();

    /**
     * The meta object literal for the '<em><b>Escape Character</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_FILE__ESCAPE_CHARACTER = eINSTANCE.getCustomFile_EscapeCharacter();

    /**
     * The meta object literal for the '<em><b>Has Nulls</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_FILE__HAS_NULLS                = eINSTANCE.getCustomFile_HasNulls();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.DataFileImpl <em>Data File</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.DataFileImpl
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getDataFile()
     * @generated
     */
    EClass     DATA_FILE                             = eINSTANCE.getDataFile();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.DataSetFileImpl <em>Data Set File</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.DataSetFileImpl
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getDataSetFile()
     * @generated
     */
    EClass     DATA_SET_FILE                         = eINSTANCE.getDataSetFile();

    /**
     * The meta object literal for the '<em><b>First Row</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DATA_SET_FILE__FIRST_ROW              = eINSTANCE.getDataSetFile_FirstRow();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.DeviceFileImpl <em>Device File</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.DeviceFileImpl
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getDeviceFile()
     * @generated
     */
    EClass     DEVICE_FILE                           = eINSTANCE.getDeviceFile();

    /**
     * The meta object literal for the '<em><b>File Name</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE_FILE__FILE_NAME                = eINSTANCE.getDeviceFile_FileName();

    /**
     * The meta object literal for the '<em><b>Append</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DEVICE_FILE__APPEND                   = eINSTANCE.getDeviceFile_Append();

    /**
     * The meta object literal for the '<em><b>Can Read</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DEVICE_FILE__CAN_READ                 = eINSTANCE.getDeviceFile_CanRead();

    /**
     * The meta object literal for the '<em><b>Can Write</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DEVICE_FILE__CAN_WRITE                = eINSTANCE.getDeviceFile_CanWrite();

    /**
     * The meta object literal for the '<em><b>Create</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DEVICE_FILE__CREATE                   = eINSTANCE.getDeviceFile_Create();

    /**
     * The meta object literal for the '<em><b>Exists</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DEVICE_FILE__EXISTS                   = eINSTANCE.getDeviceFile_Exists();

    /**
     * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DEVICE_FILE__FILTER                   = eINSTANCE.getDeviceFile_Filter();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.ExcelWorkBookImpl <em>Excel Work Book</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.ExcelWorkBookImpl
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getExcelWorkBook()
     * @generated
     */
    EClass     EXCEL_WORK_BOOK                       = eINSTANCE.getExcelWorkBook();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute EXCEL_WORK_BOOK__VERSION              = eINSTANCE.getExcelWorkBook_Version();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.ExcelWorkSheetImpl <em>Excel Work Sheet</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.ExcelWorkSheetImpl
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getExcelWorkSheet()
     * @generated
     */
    EClass     EXCEL_WORK_SHEET                      = eINSTANCE.getExcelWorkSheet();

    /**
     * The meta object literal for the '<em><b>Work Sheet</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference EXCEL_WORK_SHEET__WORK_SHEET          = eINSTANCE.getExcelWorkSheet_WorkSheet();

    /**
     * The meta object literal for the '<em><b>Null Marker</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference EXCEL_WORK_SHEET__NULL_MARKER         = eINSTANCE.getExcelWorkSheet_NullMarker();

    /**
     * The meta object literal for the '<em><b>Has Nulls</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute EXCEL_WORK_SHEET__HAS_NULLS           = eINSTANCE.getExcelWorkSheet_HasNulls();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.FixedWidthFileImpl <em>Fixed Width File</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.FixedWidthFileImpl
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getFixedWidthFile()
     * @generated
     */
    EClass     FIXED_WIDTH_FILE                      = eINSTANCE.getFixedWidthFile();

    /**
     * The meta object literal for the '<em><b>Config File</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference FIXED_WIDTH_FILE__CONFIG_FILE         = eINSTANCE.getFixedWidthFile_ConfigFile();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.FIXFileImpl <em>FIX File</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.FIXFileImpl
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getFIXFile()
     * @generated
     */
    EClass     FIX_FILE                              = eINSTANCE.getFIXFile();

    /**
     * The meta object literal for the '<em><b>Separator</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference FIX_FILE__SEPARATOR                   = eINSTANCE.getFIXFile_Separator();

    /**
     * The meta object literal for the '<em><b>Dictionary</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIX_FILE__DICTIONARY = eINSTANCE.getFIXFile_Dictionary();

    /**
     * The meta object literal for the '<em><b>Do Validation</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute FIX_FILE__DO_VALIDATION               = eINSTANCE.getFIXFile_DoValidation();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.GoogleProtoBufFileImpl <em>Google Proto Buf File</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.GoogleProtoBufFileImpl
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getGoogleProtoBufFile()
     * @generated
     */
    EClass     GOOGLE_PROTO_BUF_FILE                 = eINSTANCE.getGoogleProtoBufFile();

    /**
     * The meta object literal for the '<em><b>Classname</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference GOOGLE_PROTO_BUF_FILE__CLASSNAME      = eINSTANCE.getGoogleProtoBufFile_Classname();

    /**
     * The meta object literal for the '<em><b>Jar Location</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference GOOGLE_PROTO_BUF_FILE__JAR_LOCATION   = eINSTANCE.getGoogleProtoBufFile_JarLocation();

    /**
     * The meta object literal for the '<em><b>Read Delimited</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute GOOGLE_PROTO_BUF_FILE__READ_DELIMITED = eINSTANCE.getGoogleProtoBufFile_ReadDelimited();

    /**
     * The meta object literal for the '<em><b>Read Encoded</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute GOOGLE_PROTO_BUF_FILE__READ_ENCODED   = eINSTANCE.getGoogleProtoBufFile_ReadEncoded();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.JsonFileImpl <em>Json File</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.JsonFileImpl
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getJsonFile()
     * @generated
     */
    EClass     JSON_FILE                             = eINSTANCE.getJsonFile();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.LineFileImpl <em>Line File</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.LineFileImpl
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getLineFile()
     * @generated
     */
    EClass     LINE_FILE                             = eINSTANCE.getLineFile();

    /**
     * The meta object literal for the '<em><b>Trim</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute LINE_FILE__TRIM                       = eINSTANCE.getLineFile_Trim();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.OOCalcWorkBookImpl <em>OO Calc Work Book</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.OOCalcWorkBookImpl
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getOOCalcWorkBook()
     * @generated
     */
    EClass     OO_CALC_WORK_BOOK                     = eINSTANCE.getOOCalcWorkBook();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.OOCalcWorkSheetImpl <em>OO Calc Work Sheet</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.OOCalcWorkSheetImpl
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getOOCalcWorkSheet()
     * @generated
     */
    EClass     OO_CALC_WORK_SHEET                    = eINSTANCE.getOOCalcWorkSheet();

    /**
     * The meta object literal for the '<em><b>Work Sheet</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference OO_CALC_WORK_SHEET__WORK_SHEET        = eINSTANCE.getOOCalcWorkSheet_WorkSheet();

    /**
     * The meta object literal for the '<em><b>Null Marker</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference OO_CALC_WORK_SHEET__NULL_MARKER       = eINSTANCE.getOOCalcWorkSheet_NullMarker();

    /**
     * The meta object literal for the '<em><b>Has Nulls</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute OO_CALC_WORK_SHEET__HAS_NULLS         = eINSTANCE.getOOCalcWorkSheet_HasNulls();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.PropertiesFileImpl <em>Properties File</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.PropertiesFileImpl
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getPropertiesFile()
     * @generated
     */
    EClass     PROPERTIES_FILE                       = eINSTANCE.getPropertiesFile();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.SlurpFileImpl <em>Slurp File</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.SlurpFileImpl
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getSlurpFile()
     * @generated
     */
    EClass     SLURP_FILE                            = eINSTANCE.getSlurpFile();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.StandardIOImpl <em>Standard IO</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.StandardIOImpl
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getStandardIO()
     * @generated
     */
    EClass     STANDARD_IO                           = eINSTANCE.getStandardIO();

    /**
     * The meta object literal for the '<em><b>Use Std Err</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute STANDARD_IO__USE_STD_ERR              = eINSTANCE.getStandardIO_UseStdErr();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.XMLFileImpl <em>XML File</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.XMLFileImpl
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getXMLFile()
     * @generated
     */
    EClass     XML_FILE                              = eINSTANCE.getXMLFile();

    /**
     * The meta object literal for the '<em><b>Namespace Definitions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML_FILE__NAMESPACE_DEFINITIONS = eINSTANCE.getXMLFile_NamespaceDefinitions();

    /**
     * The meta object literal for the '<em><b>XPath</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML_FILE__XPATH                       = eINSTANCE.getXMLFile_XPath();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.XMLNamespaceDefinitionImpl <em>XML Namespace Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.XMLNamespaceDefinitionImpl
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getXMLNamespaceDefinition()
     * @generated
     */
    EClass XML_NAMESPACE_DEFINITION = eINSTANCE.getXMLNamespaceDefinition();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML_NAMESPACE_DEFINITION__PREFIX = eINSTANCE.getXMLNamespaceDefinition_Prefix();

    /**
     * The meta object literal for the '<em><b>URI</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML_NAMESPACE_DEFINITION__URI = eINSTANCE.getXMLNamespaceDefinition_URI();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.fileResource.impl.XMLNamespaceDefinitionsImpl <em>XML Namespace Definitions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.XMLNamespaceDefinitionsImpl
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getXMLNamespaceDefinitions()
     * @generated
     */
    EClass XML_NAMESPACE_DEFINITIONS = eINSTANCE.getXMLNamespaceDefinitions();

    /**
     * The meta object literal for the '<em><b>Namespace Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML_NAMESPACE_DEFINITIONS__NAMESPACE_DEFINITIONS = eINSTANCE.getXMLNamespaceDefinitions_NamespaceDefinitions();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.fileResource.ExcelVersions <em>Excel Versions</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.fileResource.ExcelVersions
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getExcelVersions()
     * @generated
     */
    EEnum      EXCEL_VERSIONS                        = eINSTANCE.getExcelVersions();

    /**
     * The meta object literal for the '<em>Excel Versions Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.fileResource.ExcelVersions
     * @see com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl#getExcelVersionsObject()
     * @generated
     */
    EDataType  EXCEL_VERSIONS_OBJECT                 = eINSTANCE.getExcelVersionsObject();

  }

} // FileResourcePackage
