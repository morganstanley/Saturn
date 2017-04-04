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
package com.ms.qaTools.saturn.modules.extractDDLModule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModuleFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface ExtractDDLModulePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                  eNAME                                      = "extractDDLModule";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                  eNS_URI                                    = "http://www.ms.com/2009/Saturn/Modules/ExtractDDL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                  eNS_PREFIX                                 = "extractDDLModule";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  ExtractDDLModulePackage eINSTANCE                                  = com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AbstractOperationImpl <em>Abstract Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.AbstractOperationImpl
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl#getAbstractOperation()
   * @generated
   */
  int                     ABSTRACT_OPERATION                         = 0;

  /**
   * The feature id for the '<em><b>Objects</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     ABSTRACT_OPERATION__OBJECTS                = 0;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     ABSTRACT_OPERATION__ENABLED                = 1;

  /**
   * The number of structural features of the '<em>Abstract Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     ABSTRACT_OPERATION_FEATURE_COUNT           = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl <em>Alter Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl#getAlterOperation()
   * @generated
   */
  int                     ALTER_OPERATION                            = 1;

  /**
   * The feature id for the '<em><b>Objects</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     ALTER_OPERATION__OBJECTS                   = ABSTRACT_OPERATION__OBJECTS;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     ALTER_OPERATION__ENABLED                   = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     ALTER_OPERATION__EXCEPTION                 = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Output Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     ALTER_OPERATION__OUTPUT_RESOURCE           = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Data Base Qualifier</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     ALTER_OPERATION__DATA_BASE_QUALIFIER       = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Data Base Override</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     ALTER_OPERATION__DATA_BASE_OVERRIDE        = ABSTRACT_OPERATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Table Space Override</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     ALTER_OPERATION__TABLE_SPACE_OVERRIDE      = ABSTRACT_OPERATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Table Space Suffix</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     ALTER_OPERATION__TABLE_SPACE_SUFFIX        = ABSTRACT_OPERATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Storage Group Override</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     ALTER_OPERATION__STORAGE_GROUP_OVERRIDE    = ABSTRACT_OPERATION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Qualifier Maps</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     ALTER_OPERATION__QUALIFIER_MAPS            = ABSTRACT_OPERATION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Data Base Maps</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     ALTER_OPERATION__DATA_BASE_MAPS            = ABSTRACT_OPERATION_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Storage Group Maps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     ALTER_OPERATION__STORAGE_GROUP_MAPS        = ABSTRACT_OPERATION_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Table Lock Override</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     ALTER_OPERATION__TABLE_LOCK_OVERRIDE       = ABSTRACT_OPERATION_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Add Data Base Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     ALTER_OPERATION__ADD_DATA_BASE_NAME        = ABSTRACT_OPERATION_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Add Owner</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     ALTER_OPERATION__ADD_OWNER                 = ABSTRACT_OPERATION_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Add Qualifier</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     ALTER_OPERATION__ADD_QUALIFIER             = ABSTRACT_OPERATION_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Create Table Spaces</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     ALTER_OPERATION__CREATE_TABLE_SPACES       = ABSTRACT_OPERATION_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Force Alter</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     ALTER_OPERATION__FORCE_ALTER               = ABSTRACT_OPERATION_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Gen ID By Default</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     ALTER_OPERATION__GEN_ID_BY_DEFAULT         = ABSTRACT_OPERATION_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Ignore Missing</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     ALTER_OPERATION__IGNORE_MISSING            = ABSTRACT_OPERATION_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>No Comments</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     ALTER_OPERATION__NO_COMMENTS               = ABSTRACT_OPERATION_FEATURE_COUNT + 18;

  /**
   * The feature id for the '<em><b>No Restrict On Drop</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     ALTER_OPERATION__NO_RESTRICT_ON_DROP       = ABSTRACT_OPERATION_FEATURE_COUNT + 19;

  /**
   * The feature id for the '<em><b>Remove Restrict On Drop</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     ALTER_OPERATION__REMOVE_RESTRICT_ON_DROP   = ABSTRACT_OPERATION_FEATURE_COUNT + 20;

  /**
   * The feature id for the '<em><b>Separate Foreign Keys</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     ALTER_OPERATION__SEPARATE_FOREIGN_KEYS     = ABSTRACT_OPERATION_FEATURE_COUNT + 21;

  /**
   * The feature id for the '<em><b>Translate Procedure Defs</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     ALTER_OPERATION__TRANSLATE_PROCEDURE_DEFS  = ABSTRACT_OPERATION_FEATURE_COUNT + 22;

  /**
   * The feature id for the '<em><b>Translate View Defs</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     ALTER_OPERATION__TRANSLATE_VIEW_DEFS       = ABSTRACT_OPERATION_FEATURE_COUNT + 23;

  /**
   * The number of structural features of the '<em>Alter Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     ALTER_OPERATION_FEATURE_COUNT              = ABSTRACT_OPERATION_FEATURE_COUNT + 24;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.DiffOperationImpl <em>Diff Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.DiffOperationImpl
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl#getDiffOperation()
   * @generated
   */
  int                     DIFF_OPERATION                             = 2;

  /**
   * The feature id for the '<em><b>Objects</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DIFF_OPERATION__OBJECTS                    = ABSTRACT_OPERATION__OBJECTS;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DIFF_OPERATION__ENABLED                    = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     DIFF_OPERATION__EXCEPTION                  = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Output Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DIFF_OPERATION__OUTPUT_RESOURCE            = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Data Base Qualifier</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DIFF_OPERATION__DATA_BASE_QUALIFIER        = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Column Length</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DIFF_OPERATION__COLUMN_LENGTH              = ABSTRACT_OPERATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Object Maps</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DIFF_OPERATION__OBJECT_MAPS                = ABSTRACT_OPERATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Ignore Missing</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DIFF_OPERATION__IGNORE_MISSING             = ABSTRACT_OPERATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Show Identicals</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DIFF_OPERATION__SHOW_IDENTICALS            = ABSTRACT_OPERATION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Omit Newly Added</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DIFF_OPERATION__OMIT_NEWLY_ADDED           = ABSTRACT_OPERATION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Omit Tables</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DIFF_OPERATION__OMIT_TABLES                = ABSTRACT_OPERATION_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Omit Views</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DIFF_OPERATION__OMIT_VIEWS                 = ABSTRACT_OPERATION_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Omit Sequences</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DIFF_OPERATION__OMIT_SEQUENCES             = ABSTRACT_OPERATION_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Omit Procedures</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DIFF_OPERATION__OMIT_PROCEDURES            = ABSTRACT_OPERATION_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Omit Permissions</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DIFF_OPERATION__OMIT_PERMISSIONS           = ABSTRACT_OPERATION_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Omit Indexes</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DIFF_OPERATION__OMIT_INDEXES               = ABSTRACT_OPERATION_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Omit Table Spaces</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DIFF_OPERATION__OMIT_TABLE_SPACES          = ABSTRACT_OPERATION_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Omit Storage</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DIFF_OPERATION__OMIT_STORAGE               = ABSTRACT_OPERATION_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Preserve Column Sequence</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DIFF_OPERATION__PRESERVE_COLUMN_SEQUENCE   = ABSTRACT_OPERATION_FEATURE_COUNT + 16;

  /**
   * The number of structural features of the '<em>Diff Operation</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     DIFF_OPERATION_FEATURE_COUNT               = ABSTRACT_OPERATION_FEATURE_COUNT + 17;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.DocumentRootImpl
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl#getDocumentRoot()
   * @generated
   */
  int                     DOCUMENT_ROOT                              = 3;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DOCUMENT_ROOT__MIXED                       = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DOCUMENT_ROOT__XMLNS_PREFIX_MAP            = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DOCUMENT_ROOT__XSI_SCHEMA_LOCATION         = 2;

  /**
   * The feature id for the '<em><b>Extract DDL Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DOCUMENT_ROOT__EXTRACT_DDL_CONFIGURATION   = 3;

  /**
   * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     DOCUMENT_ROOT_FEATURE_COUNT                = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLConfigurationImpl <em>Extract DDL Configuration</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLConfigurationImpl
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl#getExtractDDLConfiguration()
   * @generated
   */
  int                     EXTRACT_DDL_CONFIGURATION                  = 4;

  /**
   * The feature id for the '<em><b>Env File</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     EXTRACT_DDL_CONFIGURATION__ENV_FILE        = 0;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     EXTRACT_DDL_CONFIGURATION__OPERATIONS      = 1;

  /**
   * The number of structural features of the '<em>Extract DDL Configuration</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     EXTRACT_DDL_CONFIGURATION_FEATURE_COUNT    = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractOperationImpl <em>Extract Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractOperationImpl
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl#getExtractOperation()
   * @generated
   */
  int                     EXTRACT_OPERATION                          = 5;

  /**
   * The feature id for the '<em><b>Objects</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     EXTRACT_OPERATION__OBJECTS                 = ABSTRACT_OPERATION__OBJECTS;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     EXTRACT_OPERATION__ENABLED                 = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     EXTRACT_OPERATION__EXCEPTION               = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Database Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     EXTRACT_OPERATION__DATABASE_RESOURCE       = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Data Base Qualifier</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     EXTRACT_OPERATION__DATA_BASE_QUALIFIER     = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Ignore Missing</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     EXTRACT_OPERATION__IGNORE_MISSING          = ABSTRACT_OPERATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Extract Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     EXTRACT_OPERATION_FEATURE_COUNT            = ABSTRACT_OPERATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.ImpactOperationImpl <em>Impact Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ImpactOperationImpl
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl#getImpactOperation()
   * @generated
   */
  int                     IMPACT_OPERATION                           = 6;

  /**
   * The feature id for the '<em><b>Objects</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     IMPACT_OPERATION__OBJECTS                  = ABSTRACT_OPERATION__OBJECTS;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     IMPACT_OPERATION__ENABLED                  = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     IMPACT_OPERATION__EXCEPTION                = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Output Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     IMPACT_OPERATION__OUTPUT_RESOURCE          = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Impact Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     IMPACT_OPERATION_FEATURE_COUNT             = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.ReadOperationImpl <em>Read Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ReadOperationImpl
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl#getReadOperation()
   * @generated
   */
  int                     READ_OPERATION                             = 7;

  /**
   * The feature id for the '<em><b>Objects</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     READ_OPERATION__OBJECTS                    = ABSTRACT_OPERATION__OBJECTS;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     READ_OPERATION__ENABLED                    = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     READ_OPERATION__EXCEPTION                  = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     READ_OPERATION__INPUT                      = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Data Base Qualifier</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     READ_OPERATION__DATA_BASE_QUALIFIER        = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Ignore Missing</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     READ_OPERATION__IGNORE_MISSING             = ABSTRACT_OPERATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Read Operation</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     READ_OPERATION_FEATURE_COUNT               = ABSTRACT_OPERATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl <em>Render Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl#getRenderOperation()
   * @generated
   */
  int                     RENDER_OPERATION                           = 8;

  /**
   * The feature id for the '<em><b>Objects</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__OBJECTS                  = ABSTRACT_OPERATION__OBJECTS;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__ENABLED                  = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__EXCEPTION                = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Output Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__OUTPUT_RESOURCE          = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Data Base Qualifier</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__DATA_BASE_QUALIFIER      = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Data Base Override</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__DATA_BASE_OVERRIDE       = ABSTRACT_OPERATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Table Space Override</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__TABLE_SPACE_OVERRIDE     = ABSTRACT_OPERATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Table Space Suffix</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__TABLE_SPACE_SUFFIX       = ABSTRACT_OPERATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Storage Group Override</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__STORAGE_GROUP_OVERRIDE   = ABSTRACT_OPERATION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Qualifier Maps</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__QUALIFIER_MAPS           = ABSTRACT_OPERATION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Data Base Maps</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__DATA_BASE_MAPS           = ABSTRACT_OPERATION_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Storage Group Maps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__STORAGE_GROUP_MAPS       = ABSTRACT_OPERATION_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Table Lock Override</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__TABLE_LOCK_OVERRIDE      = ABSTRACT_OPERATION_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Data Base Driver</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__DATA_BASE_DRIVER         = ABSTRACT_OPERATION_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Add Data Base Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__ADD_DATA_BASE_NAME       = ABSTRACT_OPERATION_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Add Owner</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__ADD_OWNER                = ABSTRACT_OPERATION_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Add Qualifier</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__ADD_QUALIFIER            = ABSTRACT_OPERATION_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Create Foreign Keys</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__CREATE_FOREIGN_KEYS      = ABSTRACT_OPERATION_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Create Indexes</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__CREATE_INDEXES           = ABSTRACT_OPERATION_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Create Permissions</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__CREATE_PERMISSIONS       = ABSTRACT_OPERATION_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Create Primary Keys</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__CREATE_PRIMARY_KEYS      = ABSTRACT_OPERATION_FEATURE_COUNT + 18;

  /**
   * The feature id for the '<em><b>Create Table Spaces</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__CREATE_TABLE_SPACES      = ABSTRACT_OPERATION_FEATURE_COUNT + 19;

  /**
   * The feature id for the '<em><b>Ddl Xml</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__DDL_XML                  = ABSTRACT_OPERATION_FEATURE_COUNT + 20;

  /**
   * The feature id for the '<em><b>Defer Views</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__DEFER_VIEWS              = ABSTRACT_OPERATION_FEATURE_COUNT + 21;

  /**
   * The feature id for the '<em><b>Drop Procedures</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__DROP_PROCEDURES          = ABSTRACT_OPERATION_FEATURE_COUNT + 22;

  /**
   * The feature id for the '<em><b>Drop Sequences</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__DROP_SEQUENCES           = ABSTRACT_OPERATION_FEATURE_COUNT + 23;

  /**
   * The feature id for the '<em><b>Drop Tables</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__DROP_TABLES              = ABSTRACT_OPERATION_FEATURE_COUNT + 24;

  /**
   * The feature id for the '<em><b>Drop Table Spaces</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__DROP_TABLE_SPACES        = ABSTRACT_OPERATION_FEATURE_COUNT + 25;

  /**
   * The feature id for the '<em><b>Gen ID By Default</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__GEN_ID_BY_DEFAULT        = ABSTRACT_OPERATION_FEATURE_COUNT + 26;

  /**
   * The feature id for the '<em><b>No Comments</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__NO_COMMENTS              = ABSTRACT_OPERATION_FEATURE_COUNT + 27;

  /**
   * The feature id for the '<em><b>No DDL Info</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__NO_DDL_INFO              = ABSTRACT_OPERATION_FEATURE_COUNT + 28;

  /**
   * The feature id for the '<em><b>No Restrict On Drop</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__NO_RESTRICT_ON_DROP      = ABSTRACT_OPERATION_FEATURE_COUNT + 29;

  /**
   * The feature id for the '<em><b>Public Permissions</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__PUBLIC_PERMISSIONS       = ABSTRACT_OPERATION_FEATURE_COUNT + 30;

  /**
   * The feature id for the '<em><b>Remove Restrict On Drop</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__REMOVE_RESTRICT_ON_DROP  = ABSTRACT_OPERATION_FEATURE_COUNT + 31;

  /**
   * The feature id for the '<em><b>Separate Foreign Keys</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__SEPARATE_FOREIGN_KEYS    = ABSTRACT_OPERATION_FEATURE_COUNT + 32;

  /**
   * The feature id for the '<em><b>Short File Names</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__SHORT_FILE_NAMES         = ABSTRACT_OPERATION_FEATURE_COUNT + 33;

  /**
   * The feature id for the '<em><b>Translate Procedure Defs</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__TRANSLATE_PROCEDURE_DEFS = ABSTRACT_OPERATION_FEATURE_COUNT + 34;

  /**
   * The feature id for the '<em><b>Translate View Defs</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION__TRANSLATE_VIEW_DEFS      = ABSTRACT_OPERATION_FEATURE_COUNT + 35;

  /**
   * The number of structural features of the '<em>Render Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     RENDER_OPERATION_FEATURE_COUNT             = ABSTRACT_OPERATION_FEATURE_COUNT + 36;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DataBaseDriverTypeEnum <em>Data Base Driver Type Enum</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DataBaseDriverTypeEnum
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl#getDataBaseDriverTypeEnum()
   * @generated
   */
  int                     DATA_BASE_DRIVER_TYPE_ENUM                 = 9;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.TableLockOverrideTypeEnum <em>Table Lock Override Type Enum</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.TableLockOverrideTypeEnum
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl#getTableLockOverrideTypeEnum()
   * @generated
   */
  int                     TABLE_LOCK_OVERRIDE_TYPE_ENUM              = 10;

  /**
   * The meta object id for the '<em>Data Base Driver Type Enum Object</em>' data type.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DataBaseDriverTypeEnum
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl#getDataBaseDriverTypeEnumObject()
   * @generated
   */
  int                     DATA_BASE_DRIVER_TYPE_ENUM_OBJECT          = 11;

  /**
   * The meta object id for the '<em>Table Lock Override Type Enum Object</em>' data type.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.TableLockOverrideTypeEnum
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl#getTableLockOverrideTypeEnumObject()
   * @generated
   */
  int                     TABLE_LOCK_OVERRIDE_TYPE_ENUM_OBJECT       = 12;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AbstractOperation <em>Abstract Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AbstractOperation
   * @generated
   */
  EClass getAbstractOperation();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.AbstractOperation#getObjects <em>Objects</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Objects</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AbstractOperation#getObjects()
   * @see #getAbstractOperation()
   * @generated
   */
  EReference getAbstractOperation_Objects();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.AbstractOperation#isEnabled <em>Enabled</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AbstractOperation#isEnabled()
   * @see #getAbstractOperation()
   * @generated
   */
  EAttribute getAbstractOperation_Enabled();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation <em>Alter Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Alter Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation
   * @generated
   */
  EClass getAlterOperation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getException <em>Exception</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Exception</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getException()
   * @see #getAlterOperation()
   * @generated
   */
  EReference getAlterOperation_Exception();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getOutputResource <em>Output Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getOutputResource()
   * @see #getAlterOperation()
   * @generated
   */
  EReference getAlterOperation_OutputResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getDataBaseQualifier <em>Data Base Qualifier</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Base Qualifier</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getDataBaseQualifier()
   * @see #getAlterOperation()
   * @generated
   */
  EReference getAlterOperation_DataBaseQualifier();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getDataBaseOverride <em>Data Base Override</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Base Override</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getDataBaseOverride()
   * @see #getAlterOperation()
   * @generated
   */
  EReference getAlterOperation_DataBaseOverride();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getTableSpaceOverride <em>Table Space Override</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Table Space Override</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getTableSpaceOverride()
   * @see #getAlterOperation()
   * @generated
   */
  EReference getAlterOperation_TableSpaceOverride();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getTableSpaceSuffix <em>Table Space Suffix</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Table Space Suffix</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getTableSpaceSuffix()
   * @see #getAlterOperation()
   * @generated
   */
  EReference getAlterOperation_TableSpaceSuffix();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getStorageGroupOverride <em>Storage Group Override</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Storage Group Override</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getStorageGroupOverride()
   * @see #getAlterOperation()
   * @generated
   */
  EReference getAlterOperation_StorageGroupOverride();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getQualifierMaps <em>Qualifier Maps</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Qualifier Maps</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getQualifierMaps()
   * @see #getAlterOperation()
   * @generated
   */
  EReference getAlterOperation_QualifierMaps();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getDataBaseMaps <em>Data Base Maps</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Base Maps</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getDataBaseMaps()
   * @see #getAlterOperation()
   * @generated
   */
  EReference getAlterOperation_DataBaseMaps();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getStorageGroupMaps <em>Storage Group Maps</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Storage Group Maps</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getStorageGroupMaps()
   * @see #getAlterOperation()
   * @generated
   */
  EReference getAlterOperation_StorageGroupMaps();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isAddDataBaseName <em>Add Data Base Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Add Data Base Name</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isAddDataBaseName()
   * @see #getAlterOperation()
   * @generated
   */
  EAttribute getAlterOperation_AddDataBaseName();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isAddOwner <em>Add Owner</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Add Owner</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isAddOwner()
   * @see #getAlterOperation()
   * @generated
   */
  EAttribute getAlterOperation_AddOwner();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isAddQualifier <em>Add Qualifier</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Add Qualifier</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isAddQualifier()
   * @see #getAlterOperation()
   * @generated
   */
  EAttribute getAlterOperation_AddQualifier();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isCreateTableSpaces <em>Create Table Spaces</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Create Table Spaces</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isCreateTableSpaces()
   * @see #getAlterOperation()
   * @generated
   */
  EAttribute getAlterOperation_CreateTableSpaces();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isForceAlter <em>Force Alter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Force Alter</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isForceAlter()
   * @see #getAlterOperation()
   * @generated
   */
  EAttribute getAlterOperation_ForceAlter();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isGenIDByDefault <em>Gen ID By Default</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gen ID By Default</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isGenIDByDefault()
   * @see #getAlterOperation()
   * @generated
   */
  EAttribute getAlterOperation_GenIDByDefault();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isIgnoreMissing <em>Ignore Missing</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ignore Missing</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isIgnoreMissing()
   * @see #getAlterOperation()
   * @generated
   */
  EAttribute getAlterOperation_IgnoreMissing();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isNoComments <em>No Comments</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>No Comments</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isNoComments()
   * @see #getAlterOperation()
   * @generated
   */
  EAttribute getAlterOperation_NoComments();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isNoRestrictOnDrop <em>No Restrict On Drop</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>No Restrict On Drop</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isNoRestrictOnDrop()
   * @see #getAlterOperation()
   * @generated
   */
  EAttribute getAlterOperation_NoRestrictOnDrop();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isRemoveRestrictOnDrop <em>Remove Restrict On Drop</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Remove Restrict On Drop</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isRemoveRestrictOnDrop()
   * @see #getAlterOperation()
   * @generated
   */
  EAttribute getAlterOperation_RemoveRestrictOnDrop();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isSeparateForeignKeys <em>Separate Foreign Keys</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Separate Foreign Keys</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isSeparateForeignKeys()
   * @see #getAlterOperation()
   * @generated
   */
  EAttribute getAlterOperation_SeparateForeignKeys();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getTableLockOverride <em>Table Lock Override</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Table Lock Override</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#getTableLockOverride()
   * @see #getAlterOperation()
   * @generated
   */
  EAttribute getAlterOperation_TableLockOverride();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isTranslateProcedureDefs <em>Translate Procedure Defs</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Translate Procedure Defs</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isTranslateProcedureDefs()
   * @see #getAlterOperation()
   * @generated
   */
  EAttribute getAlterOperation_TranslateProcedureDefs();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isTranslateViewDefs <em>Translate View Defs</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Translate View Defs</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation#isTranslateViewDefs()
   * @see #getAlterOperation()
   * @generated
   */
  EAttribute getAlterOperation_TranslateViewDefs();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation <em>Diff Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Diff Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation
   * @generated
   */
  EClass getDiffOperation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#getException <em>Exception</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Exception</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#getException()
   * @see #getDiffOperation()
   * @generated
   */
  EReference getDiffOperation_Exception();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#getOutputResource <em>Output Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#getOutputResource()
   * @see #getDiffOperation()
   * @generated
   */
  EReference getDiffOperation_OutputResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#getDataBaseQualifier <em>Data Base Qualifier</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Base Qualifier</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#getDataBaseQualifier()
   * @see #getDiffOperation()
   * @generated
   */
  EReference getDiffOperation_DataBaseQualifier();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#getColumnLength <em>Column Length</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Column Length</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#getColumnLength()
   * @see #getDiffOperation()
   * @generated
   */
  EReference getDiffOperation_ColumnLength();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#getObjectMaps <em>Object Maps</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Object Maps</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#getObjectMaps()
   * @see #getDiffOperation()
   * @generated
   */
  EReference getDiffOperation_ObjectMaps();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isIgnoreMissing <em>Ignore Missing</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Ignore Missing</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isIgnoreMissing()
   * @see #getDiffOperation()
   * @generated
   */
  EAttribute getDiffOperation_IgnoreMissing();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitIndexes <em>Omit Indexes</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Omit Indexes</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitIndexes()
   * @see #getDiffOperation()
   * @generated
   */
  EAttribute getDiffOperation_OmitIndexes();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitNewlyAdded <em>Omit Newly Added</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Omit Newly Added</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitNewlyAdded()
   * @see #getDiffOperation()
   * @generated
   */
  EAttribute getDiffOperation_OmitNewlyAdded();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitPermissions <em>Omit Permissions</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Omit Permissions</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitPermissions()
   * @see #getDiffOperation()
   * @generated
   */
  EAttribute getDiffOperation_OmitPermissions();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitProcedures <em>Omit Procedures</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Omit Procedures</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitProcedures()
   * @see #getDiffOperation()
   * @generated
   */
  EAttribute getDiffOperation_OmitProcedures();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitSequences <em>Omit Sequences</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Omit Sequences</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitSequences()
   * @see #getDiffOperation()
   * @generated
   */
  EAttribute getDiffOperation_OmitSequences();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitStorage <em>Omit Storage</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Omit Storage</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitStorage()
   * @see #getDiffOperation()
   * @generated
   */
  EAttribute getDiffOperation_OmitStorage();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitTables <em>Omit Tables</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Omit Tables</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitTables()
   * @see #getDiffOperation()
   * @generated
   */
  EAttribute getDiffOperation_OmitTables();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitTableSpaces <em>Omit Table Spaces</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Omit Table Spaces</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitTableSpaces()
   * @see #getDiffOperation()
   * @generated
   */
  EAttribute getDiffOperation_OmitTableSpaces();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitViews <em>Omit Views</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Omit Views</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitViews()
   * @see #getDiffOperation()
   * @generated
   */
  EAttribute getDiffOperation_OmitViews();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isPreserveColumnSequence <em>Preserve Column Sequence</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Preserve Column Sequence</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isPreserveColumnSequence()
   * @see #getDiffOperation()
   * @generated
   */
  EAttribute getDiffOperation_PreserveColumnSequence();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isShowIdenticals <em>Show Identicals</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Show Identicals</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isShowIdenticals()
   * @see #getDiffOperation()
   * @generated
   */
  EAttribute getDiffOperation_ShowIdenticals();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DocumentRoot#getExtractDDLConfiguration <em>Extract DDL Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Extract DDL Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DocumentRoot#getExtractDDLConfiguration()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_ExtractDDLConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLConfiguration <em>Extract DDL Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Extract DDL Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLConfiguration
   * @generated
   */
  EClass getExtractDDLConfiguration();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLConfiguration#getEnvFile <em>Env File</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Env File</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLConfiguration#getEnvFile()
   * @see #getExtractDDLConfiguration()
   * @generated
   */
  EReference getExtractDDLConfiguration_EnvFile();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLConfiguration#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLConfiguration#getOperations()
   * @see #getExtractDDLConfiguration()
   * @generated
   */
  EReference getExtractDDLConfiguration_Operations();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.extractDDLModule.ExtractOperation <em>Extract Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Extract Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractOperation
   * @generated
   */
  EClass getExtractOperation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.ExtractOperation#getException <em>Exception</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Exception</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractOperation#getException()
   * @see #getExtractOperation()
   * @generated
   */
  EReference getExtractOperation_Exception();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.extractDDLModule.ExtractOperation#getDatabaseResource <em>Database Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Database Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractOperation#getDatabaseResource()
   * @see #getExtractOperation()
   * @generated
   */
  EReference getExtractOperation_DatabaseResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.extractDDLModule.ExtractOperation#getDataBaseQualifier <em>Data Base Qualifier</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Base Qualifier</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractOperation#getDataBaseQualifier()
   * @see #getExtractOperation()
   * @generated
   */
  EReference getExtractOperation_DataBaseQualifier();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.ExtractOperation#isIgnoreMissing <em>Ignore Missing</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ignore Missing</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractOperation#isIgnoreMissing()
   * @see #getExtractOperation()
   * @generated
   */
  EAttribute getExtractOperation_IgnoreMissing();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.extractDDLModule.ImpactOperation <em>Impact Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Impact Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ImpactOperation
   * @generated
   */
  EClass getImpactOperation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.ImpactOperation#getException <em>Exception</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Exception</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ImpactOperation#getException()
   * @see #getImpactOperation()
   * @generated
   */
  EReference getImpactOperation_Exception();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.extractDDLModule.ImpactOperation#getOutputResource <em>Output Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ImpactOperation#getOutputResource()
   * @see #getImpactOperation()
   * @generated
   */
  EReference getImpactOperation_OutputResource();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.extractDDLModule.ReadOperation <em>Read Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Read Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ReadOperation
   * @generated
   */
  EClass getReadOperation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.ReadOperation#getException <em>Exception</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Exception</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ReadOperation#getException()
   * @see #getReadOperation()
   * @generated
   */
  EReference getReadOperation_Exception();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.extractDDLModule.ReadOperation#getInput <em>Input</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ReadOperation#getInput()
   * @see #getReadOperation()
   * @generated
   */
  EReference getReadOperation_Input();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.extractDDLModule.ReadOperation#getDataBaseQualifier <em>Data Base Qualifier</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Base Qualifier</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ReadOperation#getDataBaseQualifier()
   * @see #getReadOperation()
   * @generated
   */
  EReference getReadOperation_DataBaseQualifier();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.ReadOperation#isIgnoreMissing <em>Ignore Missing</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Ignore Missing</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ReadOperation#isIgnoreMissing()
   * @see #getReadOperation()
   * @generated
   */
  EAttribute getReadOperation_IgnoreMissing();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation <em>Render Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Render Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation
   * @generated
   */
  EClass getRenderOperation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getException <em>Exception</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Exception</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getException()
   * @see #getRenderOperation()
   * @generated
   */
  EReference getRenderOperation_Exception();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getOutputResource <em>Output Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getOutputResource()
   * @see #getRenderOperation()
   * @generated
   */
  EReference getRenderOperation_OutputResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getDataBaseQualifier <em>Data Base Qualifier</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Base Qualifier</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getDataBaseQualifier()
   * @see #getRenderOperation()
   * @generated
   */
  EReference getRenderOperation_DataBaseQualifier();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getDataBaseOverride <em>Data Base Override</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Base Override</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getDataBaseOverride()
   * @see #getRenderOperation()
   * @generated
   */
  EReference getRenderOperation_DataBaseOverride();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getTableSpaceOverride <em>Table Space Override</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Table Space Override</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getTableSpaceOverride()
   * @see #getRenderOperation()
   * @generated
   */
  EReference getRenderOperation_TableSpaceOverride();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getTableSpaceSuffix <em>Table Space Suffix</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Table Space Suffix</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getTableSpaceSuffix()
   * @see #getRenderOperation()
   * @generated
   */
  EReference getRenderOperation_TableSpaceSuffix();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getStorageGroupOverride <em>Storage Group Override</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Storage Group Override</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getStorageGroupOverride()
   * @see #getRenderOperation()
   * @generated
   */
  EReference getRenderOperation_StorageGroupOverride();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getQualifierMaps <em>Qualifier Maps</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Qualifier Maps</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getQualifierMaps()
   * @see #getRenderOperation()
   * @generated
   */
  EReference getRenderOperation_QualifierMaps();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getDataBaseMaps <em>Data Base Maps</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Base Maps</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getDataBaseMaps()
   * @see #getRenderOperation()
   * @generated
   */
  EReference getRenderOperation_DataBaseMaps();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getStorageGroupMaps <em>Storage Group Maps</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Storage Group Maps</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getStorageGroupMaps()
   * @see #getRenderOperation()
   * @generated
   */
  EReference getRenderOperation_StorageGroupMaps();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isAddDataBaseName <em>Add Data Base Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Add Data Base Name</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isAddDataBaseName()
   * @see #getRenderOperation()
   * @generated
   */
  EAttribute getRenderOperation_AddDataBaseName();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isAddOwner <em>Add Owner</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Add Owner</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isAddOwner()
   * @see #getRenderOperation()
   * @generated
   */
  EAttribute getRenderOperation_AddOwner();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isAddQualifier <em>Add Qualifier</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Add Qualifier</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isAddQualifier()
   * @see #getRenderOperation()
   * @generated
   */
  EAttribute getRenderOperation_AddQualifier();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreateForeignKeys <em>Create Foreign Keys</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Create Foreign Keys</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreateForeignKeys()
   * @see #getRenderOperation()
   * @generated
   */
  EAttribute getRenderOperation_CreateForeignKeys();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreateIndexes <em>Create Indexes</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Create Indexes</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreateIndexes()
   * @see #getRenderOperation()
   * @generated
   */
  EAttribute getRenderOperation_CreateIndexes();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreatePermissions <em>Create Permissions</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Create Permissions</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreatePermissions()
   * @see #getRenderOperation()
   * @generated
   */
  EAttribute getRenderOperation_CreatePermissions();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreatePrimaryKeys <em>Create Primary Keys</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Create Primary Keys</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreatePrimaryKeys()
   * @see #getRenderOperation()
   * @generated
   */
  EAttribute getRenderOperation_CreatePrimaryKeys();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreateTableSpaces <em>Create Table Spaces</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Create Table Spaces</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isCreateTableSpaces()
   * @see #getRenderOperation()
   * @generated
   */
  EAttribute getRenderOperation_CreateTableSpaces();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getDataBaseDriver <em>Data Base Driver</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Data Base Driver</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getDataBaseDriver()
   * @see #getRenderOperation()
   * @generated
   */
  EAttribute getRenderOperation_DataBaseDriver();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDdlXml <em>Ddl Xml</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Ddl Xml</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDdlXml()
   * @see #getRenderOperation()
   * @generated
   */
  EAttribute getRenderOperation_DdlXml();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDeferViews <em>Defer Views</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Defer Views</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDeferViews()
   * @see #getRenderOperation()
   * @generated
   */
  EAttribute getRenderOperation_DeferViews();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDropProcedures <em>Drop Procedures</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Drop Procedures</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDropProcedures()
   * @see #getRenderOperation()
   * @generated
   */
  EAttribute getRenderOperation_DropProcedures();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDropSequences <em>Drop Sequences</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Drop Sequences</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDropSequences()
   * @see #getRenderOperation()
   * @generated
   */
  EAttribute getRenderOperation_DropSequences();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDropTables <em>Drop Tables</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Drop Tables</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDropTables()
   * @see #getRenderOperation()
   * @generated
   */
  EAttribute getRenderOperation_DropTables();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDropTableSpaces <em>Drop Table Spaces</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Drop Table Spaces</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isDropTableSpaces()
   * @see #getRenderOperation()
   * @generated
   */
  EAttribute getRenderOperation_DropTableSpaces();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isGenIDByDefault <em>Gen ID By Default</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gen ID By Default</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isGenIDByDefault()
   * @see #getRenderOperation()
   * @generated
   */
  EAttribute getRenderOperation_GenIDByDefault();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isNoComments <em>No Comments</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>No Comments</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isNoComments()
   * @see #getRenderOperation()
   * @generated
   */
  EAttribute getRenderOperation_NoComments();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isNoDDLInfo <em>No DDL Info</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>No DDL Info</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isNoDDLInfo()
   * @see #getRenderOperation()
   * @generated
   */
  EAttribute getRenderOperation_NoDDLInfo();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isNoRestrictOnDrop <em>No Restrict On Drop</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>No Restrict On Drop</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isNoRestrictOnDrop()
   * @see #getRenderOperation()
   * @generated
   */
  EAttribute getRenderOperation_NoRestrictOnDrop();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isPublicPermissions <em>Public Permissions</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Public Permissions</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isPublicPermissions()
   * @see #getRenderOperation()
   * @generated
   */
  EAttribute getRenderOperation_PublicPermissions();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isRemoveRestrictOnDrop <em>Remove Restrict On Drop</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Remove Restrict On Drop</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isRemoveRestrictOnDrop()
   * @see #getRenderOperation()
   * @generated
   */
  EAttribute getRenderOperation_RemoveRestrictOnDrop();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isSeparateForeignKeys <em>Separate Foreign Keys</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Separate Foreign Keys</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isSeparateForeignKeys()
   * @see #getRenderOperation()
   * @generated
   */
  EAttribute getRenderOperation_SeparateForeignKeys();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isShortFileNames <em>Short File Names</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Short File Names</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isShortFileNames()
   * @see #getRenderOperation()
   * @generated
   */
  EAttribute getRenderOperation_ShortFileNames();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getTableLockOverride <em>Table Lock Override</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Table Lock Override</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#getTableLockOverride()
   * @see #getRenderOperation()
   * @generated
   */
  EAttribute getRenderOperation_TableLockOverride();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isTranslateProcedureDefs <em>Translate Procedure Defs</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Translate Procedure Defs</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isTranslateProcedureDefs()
   * @see #getRenderOperation()
   * @generated
   */
  EAttribute getRenderOperation_TranslateProcedureDefs();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isTranslateViewDefs <em>Translate View Defs</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Translate View Defs</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation#isTranslateViewDefs()
   * @see #getRenderOperation()
   * @generated
   */
  EAttribute getRenderOperation_TranslateViewDefs();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DataBaseDriverTypeEnum <em>Data Base Driver Type Enum</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Data Base Driver Type Enum</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DataBaseDriverTypeEnum
   * @generated
   */
  EEnum getDataBaseDriverTypeEnum();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.modules.extractDDLModule.TableLockOverrideTypeEnum <em>Table Lock Override Type Enum</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Table Lock Override Type Enum</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.TableLockOverrideTypeEnum
   * @generated
   */
  EEnum getTableLockOverrideTypeEnum();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DataBaseDriverTypeEnum <em>Data Base Driver Type Enum Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Data Base Driver Type Enum Object</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.DataBaseDriverTypeEnum
   * @model instanceClass="com.ms.qaTools.saturn.modules.extractDDLModule.DataBaseDriverTypeEnum"
   *        extendedMetaData="name='DataBaseDriverTypeEnum:Object' baseType='DataBaseDriverTypeEnum'"
   * @generated
   */
  EDataType getDataBaseDriverTypeEnumObject();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.modules.extractDDLModule.TableLockOverrideTypeEnum <em>Table Lock Override Type Enum Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Table Lock Override Type Enum Object</em>'.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.TableLockOverrideTypeEnum
   * @model instanceClass="com.ms.qaTools.saturn.modules.extractDDLModule.TableLockOverrideTypeEnum"
   *        extendedMetaData="name='TableLockOverrideTypeEnum:Object' baseType='TableLockOverrideTypeEnum'"
   * @generated
   */
  EDataType getTableLockOverrideTypeEnumObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ExtractDDLModuleFactory getExtractDDLModuleFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AbstractOperationImpl <em>Abstract Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.AbstractOperationImpl
     * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl#getAbstractOperation()
     * @generated
     */
    EClass     ABSTRACT_OPERATION                         = eINSTANCE.getAbstractOperation();

    /**
     * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_OPERATION__OBJECTS                = eINSTANCE.getAbstractOperation_Objects();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_OPERATION__ENABLED                = eINSTANCE.getAbstractOperation_Enabled();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl <em>Alter Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.AlterOperationImpl
     * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl#getAlterOperation()
     * @generated
     */
    EClass     ALTER_OPERATION                            = eINSTANCE.getAlterOperation();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference ALTER_OPERATION__EXCEPTION                 = eINSTANCE.getAlterOperation_Exception();

    /**
     * The meta object literal for the '<em><b>Output Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference ALTER_OPERATION__OUTPUT_RESOURCE           = eINSTANCE.getAlterOperation_OutputResource();

    /**
     * The meta object literal for the '<em><b>Data Base Qualifier</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference ALTER_OPERATION__DATA_BASE_QUALIFIER       = eINSTANCE.getAlterOperation_DataBaseQualifier();

    /**
     * The meta object literal for the '<em><b>Data Base Override</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference ALTER_OPERATION__DATA_BASE_OVERRIDE        = eINSTANCE.getAlterOperation_DataBaseOverride();

    /**
     * The meta object literal for the '<em><b>Table Space Override</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference ALTER_OPERATION__TABLE_SPACE_OVERRIDE      = eINSTANCE.getAlterOperation_TableSpaceOverride();

    /**
     * The meta object literal for the '<em><b>Table Space Suffix</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference ALTER_OPERATION__TABLE_SPACE_SUFFIX        = eINSTANCE.getAlterOperation_TableSpaceSuffix();

    /**
     * The meta object literal for the '<em><b>Storage Group Override</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference ALTER_OPERATION__STORAGE_GROUP_OVERRIDE    = eINSTANCE.getAlterOperation_StorageGroupOverride();

    /**
     * The meta object literal for the '<em><b>Qualifier Maps</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference ALTER_OPERATION__QUALIFIER_MAPS            = eINSTANCE.getAlterOperation_QualifierMaps();

    /**
     * The meta object literal for the '<em><b>Data Base Maps</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference ALTER_OPERATION__DATA_BASE_MAPS            = eINSTANCE.getAlterOperation_DataBaseMaps();

    /**
     * The meta object literal for the '<em><b>Storage Group Maps</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference ALTER_OPERATION__STORAGE_GROUP_MAPS        = eINSTANCE.getAlterOperation_StorageGroupMaps();

    /**
     * The meta object literal for the '<em><b>Add Data Base Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALTER_OPERATION__ADD_DATA_BASE_NAME        = eINSTANCE.getAlterOperation_AddDataBaseName();

    /**
     * The meta object literal for the '<em><b>Add Owner</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ALTER_OPERATION__ADD_OWNER                 = eINSTANCE.getAlterOperation_AddOwner();

    /**
     * The meta object literal for the '<em><b>Add Qualifier</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ALTER_OPERATION__ADD_QUALIFIER             = eINSTANCE.getAlterOperation_AddQualifier();

    /**
     * The meta object literal for the '<em><b>Create Table Spaces</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALTER_OPERATION__CREATE_TABLE_SPACES       = eINSTANCE.getAlterOperation_CreateTableSpaces();

    /**
     * The meta object literal for the '<em><b>Force Alter</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ALTER_OPERATION__FORCE_ALTER               = eINSTANCE.getAlterOperation_ForceAlter();

    /**
     * The meta object literal for the '<em><b>Gen ID By Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALTER_OPERATION__GEN_ID_BY_DEFAULT         = eINSTANCE.getAlterOperation_GenIDByDefault();

    /**
     * The meta object literal for the '<em><b>Ignore Missing</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ALTER_OPERATION__IGNORE_MISSING            = eINSTANCE.getAlterOperation_IgnoreMissing();

    /**
     * The meta object literal for the '<em><b>No Comments</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ALTER_OPERATION__NO_COMMENTS               = eINSTANCE.getAlterOperation_NoComments();

    /**
     * The meta object literal for the '<em><b>No Restrict On Drop</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALTER_OPERATION__NO_RESTRICT_ON_DROP       = eINSTANCE.getAlterOperation_NoRestrictOnDrop();

    /**
     * The meta object literal for the '<em><b>Remove Restrict On Drop</b></em>' attribute feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALTER_OPERATION__REMOVE_RESTRICT_ON_DROP   = eINSTANCE.getAlterOperation_RemoveRestrictOnDrop();

    /**
     * The meta object literal for the '<em><b>Separate Foreign Keys</b></em>' attribute feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALTER_OPERATION__SEPARATE_FOREIGN_KEYS     = eINSTANCE.getAlterOperation_SeparateForeignKeys();

    /**
     * The meta object literal for the '<em><b>Table Lock Override</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALTER_OPERATION__TABLE_LOCK_OVERRIDE       = eINSTANCE.getAlterOperation_TableLockOverride();

    /**
     * The meta object literal for the '<em><b>Translate Procedure Defs</b></em>' attribute feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALTER_OPERATION__TRANSLATE_PROCEDURE_DEFS  = eINSTANCE.getAlterOperation_TranslateProcedureDefs();

    /**
     * The meta object literal for the '<em><b>Translate View Defs</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALTER_OPERATION__TRANSLATE_VIEW_DEFS       = eINSTANCE.getAlterOperation_TranslateViewDefs();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.DiffOperationImpl <em>Diff Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.DiffOperationImpl
     * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl#getDiffOperation()
     * @generated
     */
    EClass     DIFF_OPERATION                             = eINSTANCE.getDiffOperation();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference DIFF_OPERATION__EXCEPTION                  = eINSTANCE.getDiffOperation_Exception();

    /**
     * The meta object literal for the '<em><b>Output Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DIFF_OPERATION__OUTPUT_RESOURCE            = eINSTANCE.getDiffOperation_OutputResource();

    /**
     * The meta object literal for the '<em><b>Data Base Qualifier</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DIFF_OPERATION__DATA_BASE_QUALIFIER        = eINSTANCE.getDiffOperation_DataBaseQualifier();

    /**
     * The meta object literal for the '<em><b>Column Length</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DIFF_OPERATION__COLUMN_LENGTH              = eINSTANCE.getDiffOperation_ColumnLength();

    /**
     * The meta object literal for the '<em><b>Object Maps</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DIFF_OPERATION__OBJECT_MAPS                = eINSTANCE.getDiffOperation_ObjectMaps();

    /**
     * The meta object literal for the '<em><b>Ignore Missing</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DIFF_OPERATION__IGNORE_MISSING             = eINSTANCE.getDiffOperation_IgnoreMissing();

    /**
     * The meta object literal for the '<em><b>Omit Indexes</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DIFF_OPERATION__OMIT_INDEXES               = eINSTANCE.getDiffOperation_OmitIndexes();

    /**
     * The meta object literal for the '<em><b>Omit Newly Added</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIFF_OPERATION__OMIT_NEWLY_ADDED           = eINSTANCE.getDiffOperation_OmitNewlyAdded();

    /**
     * The meta object literal for the '<em><b>Omit Permissions</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIFF_OPERATION__OMIT_PERMISSIONS           = eINSTANCE.getDiffOperation_OmitPermissions();

    /**
     * The meta object literal for the '<em><b>Omit Procedures</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DIFF_OPERATION__OMIT_PROCEDURES            = eINSTANCE.getDiffOperation_OmitProcedures();

    /**
     * The meta object literal for the '<em><b>Omit Sequences</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DIFF_OPERATION__OMIT_SEQUENCES             = eINSTANCE.getDiffOperation_OmitSequences();

    /**
     * The meta object literal for the '<em><b>Omit Storage</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DIFF_OPERATION__OMIT_STORAGE               = eINSTANCE.getDiffOperation_OmitStorage();

    /**
     * The meta object literal for the '<em><b>Omit Tables</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DIFF_OPERATION__OMIT_TABLES                = eINSTANCE.getDiffOperation_OmitTables();

    /**
     * The meta object literal for the '<em><b>Omit Table Spaces</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIFF_OPERATION__OMIT_TABLE_SPACES          = eINSTANCE.getDiffOperation_OmitTableSpaces();

    /**
     * The meta object literal for the '<em><b>Omit Views</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DIFF_OPERATION__OMIT_VIEWS                 = eINSTANCE.getDiffOperation_OmitViews();

    /**
     * The meta object literal for the '<em><b>Preserve Column Sequence</b></em>' attribute feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIFF_OPERATION__PRESERVE_COLUMN_SEQUENCE   = eINSTANCE.getDiffOperation_PreserveColumnSequence();

    /**
     * The meta object literal for the '<em><b>Show Identicals</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DIFF_OPERATION__SHOW_IDENTICALS            = eINSTANCE.getDiffOperation_ShowIdenticals();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.DocumentRootImpl
     * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl#getDocumentRoot()
     * @generated
     */
    EClass     DOCUMENT_ROOT                              = eINSTANCE.getDocumentRoot();

    /**
     * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__MIXED                       = eINSTANCE.getDocumentRoot_Mixed();

    /**
     * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP            = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

    /**
     * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION         = eINSTANCE.getDocumentRoot_XSISchemaLocation();

    /**
     * The meta object literal for the '<em><b>Extract DDL Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DOCUMENT_ROOT__EXTRACT_DDL_CONFIGURATION   = eINSTANCE.getDocumentRoot_ExtractDDLConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLConfigurationImpl <em>Extract DDL Configuration</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLConfigurationImpl
     * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl#getExtractDDLConfiguration()
     * @generated
     */
    EClass     EXTRACT_DDL_CONFIGURATION                  = eINSTANCE.getExtractDDLConfiguration();

    /**
     * The meta object literal for the '<em><b>Env File</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTRACT_DDL_CONFIGURATION__ENV_FILE        = eINSTANCE.getExtractDDLConfiguration_EnvFile();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference EXTRACT_DDL_CONFIGURATION__OPERATIONS      = eINSTANCE.getExtractDDLConfiguration_Operations();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractOperationImpl <em>Extract Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractOperationImpl
     * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl#getExtractOperation()
     * @generated
     */
    EClass     EXTRACT_OPERATION                          = eINSTANCE.getExtractOperation();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference EXTRACT_OPERATION__EXCEPTION               = eINSTANCE.getExtractOperation_Exception();

    /**
     * The meta object literal for the '<em><b>Database Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference EXTRACT_OPERATION__DATABASE_RESOURCE       = eINSTANCE.getExtractOperation_DatabaseResource();

    /**
     * The meta object literal for the '<em><b>Data Base Qualifier</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference EXTRACT_OPERATION__DATA_BASE_QUALIFIER     = eINSTANCE.getExtractOperation_DataBaseQualifier();

    /**
     * The meta object literal for the '<em><b>Ignore Missing</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute EXTRACT_OPERATION__IGNORE_MISSING          = eINSTANCE.getExtractOperation_IgnoreMissing();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.ImpactOperationImpl <em>Impact Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ImpactOperationImpl
     * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl#getImpactOperation()
     * @generated
     */
    EClass     IMPACT_OPERATION                           = eINSTANCE.getImpactOperation();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference IMPACT_OPERATION__EXCEPTION                = eINSTANCE.getImpactOperation_Exception();

    /**
     * The meta object literal for the '<em><b>Output Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference IMPACT_OPERATION__OUTPUT_RESOURCE          = eINSTANCE.getImpactOperation_OutputResource();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.ReadOperationImpl <em>Read Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ReadOperationImpl
     * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl#getReadOperation()
     * @generated
     */
    EClass     READ_OPERATION                             = eINSTANCE.getReadOperation();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference READ_OPERATION__EXCEPTION                  = eINSTANCE.getReadOperation_Exception();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference READ_OPERATION__INPUT                      = eINSTANCE.getReadOperation_Input();

    /**
     * The meta object literal for the '<em><b>Data Base Qualifier</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference READ_OPERATION__DATA_BASE_QUALIFIER        = eINSTANCE.getReadOperation_DataBaseQualifier();

    /**
     * The meta object literal for the '<em><b>Ignore Missing</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute READ_OPERATION__IGNORE_MISSING             = eINSTANCE.getReadOperation_IgnoreMissing();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl <em>Render Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.RenderOperationImpl
     * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl#getRenderOperation()
     * @generated
     */
    EClass     RENDER_OPERATION                           = eINSTANCE.getRenderOperation();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference RENDER_OPERATION__EXCEPTION                = eINSTANCE.getRenderOperation_Exception();

    /**
     * The meta object literal for the '<em><b>Output Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference RENDER_OPERATION__OUTPUT_RESOURCE          = eINSTANCE.getRenderOperation_OutputResource();

    /**
     * The meta object literal for the '<em><b>Data Base Qualifier</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference RENDER_OPERATION__DATA_BASE_QUALIFIER      = eINSTANCE.getRenderOperation_DataBaseQualifier();

    /**
     * The meta object literal for the '<em><b>Data Base Override</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference RENDER_OPERATION__DATA_BASE_OVERRIDE       = eINSTANCE.getRenderOperation_DataBaseOverride();

    /**
     * The meta object literal for the '<em><b>Table Space Override</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference RENDER_OPERATION__TABLE_SPACE_OVERRIDE     = eINSTANCE.getRenderOperation_TableSpaceOverride();

    /**
     * The meta object literal for the '<em><b>Table Space Suffix</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference RENDER_OPERATION__TABLE_SPACE_SUFFIX       = eINSTANCE.getRenderOperation_TableSpaceSuffix();

    /**
     * The meta object literal for the '<em><b>Storage Group Override</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference RENDER_OPERATION__STORAGE_GROUP_OVERRIDE   = eINSTANCE.getRenderOperation_StorageGroupOverride();

    /**
     * The meta object literal for the '<em><b>Qualifier Maps</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference RENDER_OPERATION__QUALIFIER_MAPS           = eINSTANCE.getRenderOperation_QualifierMaps();

    /**
     * The meta object literal for the '<em><b>Data Base Maps</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference RENDER_OPERATION__DATA_BASE_MAPS           = eINSTANCE.getRenderOperation_DataBaseMaps();

    /**
     * The meta object literal for the '<em><b>Storage Group Maps</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference RENDER_OPERATION__STORAGE_GROUP_MAPS       = eINSTANCE.getRenderOperation_StorageGroupMaps();

    /**
     * The meta object literal for the '<em><b>Add Data Base Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENDER_OPERATION__ADD_DATA_BASE_NAME       = eINSTANCE.getRenderOperation_AddDataBaseName();

    /**
     * The meta object literal for the '<em><b>Add Owner</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute RENDER_OPERATION__ADD_OWNER                = eINSTANCE.getRenderOperation_AddOwner();

    /**
     * The meta object literal for the '<em><b>Add Qualifier</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute RENDER_OPERATION__ADD_QUALIFIER            = eINSTANCE.getRenderOperation_AddQualifier();

    /**
     * The meta object literal for the '<em><b>Create Foreign Keys</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENDER_OPERATION__CREATE_FOREIGN_KEYS      = eINSTANCE.getRenderOperation_CreateForeignKeys();

    /**
     * The meta object literal for the '<em><b>Create Indexes</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute RENDER_OPERATION__CREATE_INDEXES           = eINSTANCE.getRenderOperation_CreateIndexes();

    /**
     * The meta object literal for the '<em><b>Create Permissions</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENDER_OPERATION__CREATE_PERMISSIONS       = eINSTANCE.getRenderOperation_CreatePermissions();

    /**
     * The meta object literal for the '<em><b>Create Primary Keys</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENDER_OPERATION__CREATE_PRIMARY_KEYS      = eINSTANCE.getRenderOperation_CreatePrimaryKeys();

    /**
     * The meta object literal for the '<em><b>Create Table Spaces</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENDER_OPERATION__CREATE_TABLE_SPACES      = eINSTANCE.getRenderOperation_CreateTableSpaces();

    /**
     * The meta object literal for the '<em><b>Data Base Driver</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENDER_OPERATION__DATA_BASE_DRIVER         = eINSTANCE.getRenderOperation_DataBaseDriver();

    /**
     * The meta object literal for the '<em><b>Ddl Xml</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute RENDER_OPERATION__DDL_XML                  = eINSTANCE.getRenderOperation_DdlXml();

    /**
     * The meta object literal for the '<em><b>Defer Views</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute RENDER_OPERATION__DEFER_VIEWS              = eINSTANCE.getRenderOperation_DeferViews();

    /**
     * The meta object literal for the '<em><b>Drop Procedures</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute RENDER_OPERATION__DROP_PROCEDURES          = eINSTANCE.getRenderOperation_DropProcedures();

    /**
     * The meta object literal for the '<em><b>Drop Sequences</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute RENDER_OPERATION__DROP_SEQUENCES           = eINSTANCE.getRenderOperation_DropSequences();

    /**
     * The meta object literal for the '<em><b>Drop Tables</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute RENDER_OPERATION__DROP_TABLES              = eINSTANCE.getRenderOperation_DropTables();

    /**
     * The meta object literal for the '<em><b>Drop Table Spaces</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENDER_OPERATION__DROP_TABLE_SPACES        = eINSTANCE.getRenderOperation_DropTableSpaces();

    /**
     * The meta object literal for the '<em><b>Gen ID By Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENDER_OPERATION__GEN_ID_BY_DEFAULT        = eINSTANCE.getRenderOperation_GenIDByDefault();

    /**
     * The meta object literal for the '<em><b>No Comments</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute RENDER_OPERATION__NO_COMMENTS              = eINSTANCE.getRenderOperation_NoComments();

    /**
     * The meta object literal for the '<em><b>No DDL Info</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute RENDER_OPERATION__NO_DDL_INFO              = eINSTANCE.getRenderOperation_NoDDLInfo();

    /**
     * The meta object literal for the '<em><b>No Restrict On Drop</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENDER_OPERATION__NO_RESTRICT_ON_DROP      = eINSTANCE.getRenderOperation_NoRestrictOnDrop();

    /**
     * The meta object literal for the '<em><b>Public Permissions</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENDER_OPERATION__PUBLIC_PERMISSIONS       = eINSTANCE.getRenderOperation_PublicPermissions();

    /**
     * The meta object literal for the '<em><b>Remove Restrict On Drop</b></em>' attribute feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENDER_OPERATION__REMOVE_RESTRICT_ON_DROP  = eINSTANCE.getRenderOperation_RemoveRestrictOnDrop();

    /**
     * The meta object literal for the '<em><b>Separate Foreign Keys</b></em>' attribute feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENDER_OPERATION__SEPARATE_FOREIGN_KEYS    = eINSTANCE.getRenderOperation_SeparateForeignKeys();

    /**
     * The meta object literal for the '<em><b>Short File Names</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENDER_OPERATION__SHORT_FILE_NAMES         = eINSTANCE.getRenderOperation_ShortFileNames();

    /**
     * The meta object literal for the '<em><b>Table Lock Override</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENDER_OPERATION__TABLE_LOCK_OVERRIDE      = eINSTANCE.getRenderOperation_TableLockOverride();

    /**
     * The meta object literal for the '<em><b>Translate Procedure Defs</b></em>' attribute feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENDER_OPERATION__TRANSLATE_PROCEDURE_DEFS = eINSTANCE.getRenderOperation_TranslateProcedureDefs();

    /**
     * The meta object literal for the '<em><b>Translate View Defs</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENDER_OPERATION__TRANSLATE_VIEW_DEFS      = eINSTANCE.getRenderOperation_TranslateViewDefs();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DataBaseDriverTypeEnum <em>Data Base Driver Type Enum</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.extractDDLModule.DataBaseDriverTypeEnum
     * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl#getDataBaseDriverTypeEnum()
     * @generated
     */
    EEnum      DATA_BASE_DRIVER_TYPE_ENUM                 = eINSTANCE.getDataBaseDriverTypeEnum();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.TableLockOverrideTypeEnum <em>Table Lock Override Type Enum</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.extractDDLModule.TableLockOverrideTypeEnum
     * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl#getTableLockOverrideTypeEnum()
     * @generated
     */
    EEnum      TABLE_LOCK_OVERRIDE_TYPE_ENUM              = eINSTANCE.getTableLockOverrideTypeEnum();

    /**
     * The meta object literal for the '<em>Data Base Driver Type Enum Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.extractDDLModule.DataBaseDriverTypeEnum
     * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl#getDataBaseDriverTypeEnumObject()
     * @generated
     */
    EDataType  DATA_BASE_DRIVER_TYPE_ENUM_OBJECT          = eINSTANCE.getDataBaseDriverTypeEnumObject();

    /**
     * The meta object literal for the '<em>Table Lock Override Type Enum Object</em>' data type.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.extractDDLModule.TableLockOverrideTypeEnum
     * @see com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl#getTableLockOverrideTypeEnumObject()
     * @generated
     */
    EDataType  TABLE_LOCK_OVERRIDE_TYPE_ENUM_OBJECT       = eINSTANCE.getTableLockOverrideTypeEnumObject();

  }

} // ExtractDDLModulePackage
