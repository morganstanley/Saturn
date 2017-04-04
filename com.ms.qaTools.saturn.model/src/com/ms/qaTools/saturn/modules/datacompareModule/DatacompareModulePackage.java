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
package com.ms.qaTools.saturn.modules.datacompareModule;

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
 * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModuleFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface DatacompareModulePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                   eNAME                                                    = "datacompareModule";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                   eNS_URI                                                  = "http://www.ms.com/2006/Saturn/Modules/DataCompare";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                   eNS_PREFIX                                               = "dataCompareModule";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  DatacompareModulePackage eINSTANCE                                                = com.ms.qaTools.saturn.modules.datacompareModule.impl.DatacompareModulePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.AbstractDiffSetExplainerImpl <em>Abstract Diff Set Explainer</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.AbstractDiffSetExplainerImpl
   * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DatacompareModulePackageImpl#getAbstractDiffSetExplainer()
   * @generated
   */
  int                      ABSTRACT_DIFF_SET_EXPLAINER                              = 0;

  /**
   * The number of structural features of the '<em>Abstract Diff Set Explainer</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      ABSTRACT_DIFF_SET_EXPLAINER_FEATURE_COUNT                = 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.DataCompareConfigurationImpl <em>Data Compare Configuration</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DataCompareConfigurationImpl
   * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DatacompareModulePackageImpl#getDataCompareConfiguration()
   * @generated
   */
  int                      DATA_COMPARE_CONFIGURATION                               = 1;

  /**
   * The feature id for the '<em><b>Data Sources</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DATA_COMPARE_CONFIGURATION__DATA_SOURCES                 = 0;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                      DATA_COMPARE_CONFIGURATION__OUTPUT                       = 1;

  /**
   * The feature id for the '<em><b>Diff Set Explainer</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DATA_COMPARE_CONFIGURATION__DIFF_SET_EXPLAINER           = 2;

  /**
   * The feature id for the '<em><b>Ignore In Left Only Columns</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DATA_COMPARE_CONFIGURATION__IGNORE_IN_LEFT_ONLY_COLUMNS  = 3;

  /**
   * The feature id for the '<em><b>Ignore In Right Only Columns</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DATA_COMPARE_CONFIGURATION__IGNORE_IN_RIGHT_ONLY_COLUMNS = 4;

  /**
   * The feature id for the '<em><b>Fail On Validation</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                      DATA_COMPARE_CONFIGURATION__FAIL_ON_VALIDATION           = 5;

  /**
   * The number of structural features of the '<em>Data Compare Configuration</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DATA_COMPARE_CONFIGURATION_FEATURE_COUNT                 = 6;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.DataSourceDefinitionImpl <em>Data Source Definition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DataSourceDefinitionImpl
   * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DatacompareModulePackageImpl#getDataSourceDefinition()
   * @generated
   */
  int                      DATA_SOURCE_DEFINITION                                   = 2;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DATA_SOURCE_DEFINITION__LEFT                             = 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DATA_SOURCE_DEFINITION__RIGHT                            = 1;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DATA_SOURCE_DEFINITION__COLUMNS                          = 2;

  /**
   * The feature id for the '<em><b>Sort Datasets</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DATA_SOURCE_DEFINITION__SORT_DATASETS                    = 3;

  /**
   * The feature id for the '<em><b>Partial Compare</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DATA_SOURCE_DEFINITION__PARTIAL_COMPARE                  = 4;

  /**
   * The feature id for the '<em><b>Max Rows</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DATA_SOURCE_DEFINITION__MAX_ROWS                         = 5;

  /**
   * The number of structural features of the '<em>Data Source Definition</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DATA_SOURCE_DEFINITION_FEATURE_COUNT                     = 6;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DocumentRootImpl
   * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DatacompareModulePackageImpl#getDocumentRoot()
   * @generated
   */
  int                      DOCUMENT_ROOT                                            = 3;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DOCUMENT_ROOT__MIXED                                     = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DOCUMENT_ROOT__XMLNS_PREFIX_MAP                          = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DOCUMENT_ROOT__XSI_SCHEMA_LOCATION                       = 2;

  /**
   * The feature id for the '<em><b>Data Compare Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DOCUMENT_ROOT__DATA_COMPARE_CONFIGURATION                = 3;

  /**
   * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                      DOCUMENT_ROOT_FEATURE_COUNT                              = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.MappedColumnImpl <em>Mapped Column</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.MappedColumnImpl
   * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DatacompareModulePackageImpl#getMappedColumn()
   * @generated
   */
  int                      MAPPED_COLUMN                                            = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      MAPPED_COLUMN__NAME                                      = TypesPackage.COLUMN__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      MAPPED_COLUMN__TYPE                                      = TypesPackage.COLUMN__TYPE;

  /**
   * The feature id for the '<em><b>Key Order</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      MAPPED_COLUMN__KEY_ORDER                                 = TypesPackage.COLUMN__KEY_ORDER;

  /**
   * The feature id for the '<em><b>Ignored</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      MAPPED_COLUMN__IGNORED                                   = TypesPackage.COLUMN__IGNORED;

  /**
   * The feature id for the '<em><b>Trim</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      MAPPED_COLUMN__TRIM                                      = TypesPackage.COLUMN__TRIM;

  /**
   * The feature id for the '<em><b>Mapping Column</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      MAPPED_COLUMN__MAPPING_COLUMN                            = TypesPackage.COLUMN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      MAPPED_COLUMN__THRESHOLD                                 = TypesPackage.COLUMN_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      MAPPED_COLUMN__ENABLED                                   = TypesPackage.COLUMN_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Ignore Null</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      MAPPED_COLUMN__IGNORE_NULL                               = TypesPackage.COLUMN_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Mapped Column</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                      MAPPED_COLUMN_FEATURE_COUNT                              = TypesPackage.COLUMN_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.OutputImpl <em>Output</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.OutputImpl
   * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DatacompareModulePackageImpl#getOutput()
   * @generated
   */
  int                      OUTPUT                                                   = 5;

  /**
   * The feature id for the '<em><b>Resource</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                      OUTPUT__RESOURCE                                         = 0;

  /**
   * The feature id for the '<em><b>Pages</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      OUTPUT__PAGES                                            = 1;

  /**
   * The number of structural features of the '<em>Output</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      OUTPUT_FEATURE_COUNT                                     = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.PageImpl <em>Page</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.PageImpl
   * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DatacompareModulePackageImpl#getPage()
   * @generated
   */
  int                      PAGE                                                     = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      PAGE__NAME                                               = 0;

  /**
   * The feature id for the '<em><b>Omit</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      PAGE__OMIT                                               = 1;

  /**
   * The feature id for the '<em><b>Sparse</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      PAGE__SPARSE                                             = 2;

  /**
   * The number of structural features of the '<em>Page</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      PAGE_FEATURE_COUNT                                       = 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.PagesImpl <em>Pages</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.PagesImpl
   * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DatacompareModulePackageImpl#getPages()
   * @generated
   */
  int                      PAGES                                                    = 7;

  /**
   * The feature id for the '<em><b>Summary</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                      PAGES__SUMMARY                                           = 0;

  /**
   * The feature id for the '<em><b>Different</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                      PAGES__DIFFERENT                                         = 1;

  /**
   * The feature id for the '<em><b>Explained</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                      PAGES__EXPLAINED                                         = 2;

  /**
   * The feature id for the '<em><b>In Left Only</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      PAGES__IN_LEFT_ONLY                                      = 3;

  /**
   * The feature id for the '<em><b>In Right Only</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      PAGES__IN_RIGHT_ONLY                                     = 4;

  /**
   * The feature id for the '<em><b>Identical</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                      PAGES__IDENTICAL                                         = 5;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      PAGES__LEFT                                              = 6;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      PAGES__RIGHT                                             = 7;

  /**
   * The number of structural features of the '<em>Pages</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      PAGES_FEATURE_COUNT                                      = 8;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.PerlDiffSetExplainerImpl <em>Perl Diff Set Explainer</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.PerlDiffSetExplainerImpl
   * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DatacompareModulePackageImpl#getPerlDiffSetExplainer()
   * @generated
   */
  int                      PERL_DIFF_SET_EXPLAINER                                  = 8;

  /**
   * The feature id for the '<em><b>Init Code</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                      PERL_DIFF_SET_EXPLAINER__INIT_CODE                       = ABSTRACT_DIFF_SET_EXPLAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Diff Code</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                      PERL_DIFF_SET_EXPLAINER__DIFF_CODE                       = ABSTRACT_DIFF_SET_EXPLAINER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Destroy Code</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      PERL_DIFF_SET_EXPLAINER__DESTROY_CODE                    = ABSTRACT_DIFF_SET_EXPLAINER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Perl Diff Set Explainer</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      PERL_DIFF_SET_EXPLAINER_FEATURE_COUNT                    = ABSTRACT_DIFF_SET_EXPLAINER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.datacompareModule.SortType <em>Sort Type</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.datacompareModule.SortType
   * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DatacompareModulePackageImpl#getSortType()
   * @generated
   */
  int                      SORT_TYPE                                                = 9;

  /**
   * The meta object id for the '<em>Sort Type Object</em>' data type.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.datacompareModule.SortType
   * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DatacompareModulePackageImpl#getSortTypeObject()
   * @generated
   */
  int                      SORT_TYPE_OBJECT                                         = 10;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.datacompareModule.AbstractDiffSetExplainer <em>Abstract Diff Set Explainer</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Diff Set Explainer</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.AbstractDiffSetExplainer
   * @generated
   */
  EClass getAbstractDiffSetExplainer();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration <em>Data Compare Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Compare Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration
   * @generated
   */
  EClass getDataCompareConfiguration();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#getDataSources <em>Data Sources</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Sources</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#getDataSources()
   * @see #getDataCompareConfiguration()
   * @generated
   */
  EReference getDataCompareConfiguration_DataSources();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#getOutput <em>Output</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Output</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#getOutput()
   * @see #getDataCompareConfiguration()
   * @generated
   */
  EReference getDataCompareConfiguration_Output();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#getDiffSetExplainer <em>Diff Set Explainer</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Diff Set Explainer</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#getDiffSetExplainer()
   * @see #getDataCompareConfiguration()
   * @generated
   */
  EReference getDataCompareConfiguration_DiffSetExplainer();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#isFailOnValidation <em>Fail On Validation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fail On Validation</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#isFailOnValidation()
   * @see #getDataCompareConfiguration()
   * @generated
   */
  EAttribute getDataCompareConfiguration_FailOnValidation();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#isIgnoreInLeftOnlyColumns <em>Ignore In Left Only Columns</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ignore In Left Only Columns</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#isIgnoreInLeftOnlyColumns()
   * @see #getDataCompareConfiguration()
   * @generated
   */
  EAttribute getDataCompareConfiguration_IgnoreInLeftOnlyColumns();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#isIgnoreInRightOnlyColumns <em>Ignore In Right Only Columns</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ignore In Right Only Columns</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#isIgnoreInRightOnlyColumns()
   * @see #getDataCompareConfiguration()
   * @generated
   */
  EAttribute getDataCompareConfiguration_IgnoreInRightOnlyColumns();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition <em>Data Source Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Source Definition</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition
   * @generated
   */
  EClass getDataSourceDefinition();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#getLeft <em>Left</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#getLeft()
   * @see #getDataSourceDefinition()
   * @generated
   */
  EReference getDataSourceDefinition_Left();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#getRight <em>Right</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#getRight()
   * @see #getDataSourceDefinition()
   * @generated
   */
  EReference getDataSourceDefinition_Right();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#getColumns <em>Columns</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Columns</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#getColumns()
   * @see #getDataSourceDefinition()
   * @generated
   */
  EReference getDataSourceDefinition_Columns();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#getMaxRows <em>Max Rows</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Max Rows</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#getMaxRows()
   * @see #getDataSourceDefinition()
   * @generated
   */
  EAttribute getDataSourceDefinition_MaxRows();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#isPartialCompare <em>Partial Compare</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Partial Compare</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#isPartialCompare()
   * @see #getDataSourceDefinition()
   * @generated
   */
  EAttribute getDataSourceDefinition_PartialCompare();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#getSortDatasets <em>Sort Datasets</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sort Datasets</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#getSortDatasets()
   * @see #getDataSourceDefinition()
   * @generated
   */
  EAttribute getDataSourceDefinition_SortDatasets();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.datacompareModule.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.ms.qaTools.saturn.modules.datacompareModule.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.datacompareModule.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.datacompareModule.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.datacompareModule.DocumentRoot#getDataCompareConfiguration <em>Data Compare Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Compare Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DocumentRoot#getDataCompareConfiguration()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_DataCompareConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.datacompareModule.MappedColumn <em>Mapped Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapped Column</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.MappedColumn
   * @generated
   */
  EClass getMappedColumn();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.datacompareModule.MappedColumn#isEnabled <em>Enabled</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.MappedColumn#isEnabled()
   * @see #getMappedColumn()
   * @generated
   */
  EAttribute getMappedColumn_Enabled();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.datacompareModule.MappedColumn#isIgnoreNull <em>Ignore Null</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Ignore Null</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.MappedColumn#isIgnoreNull()
   * @see #getMappedColumn()
   * @generated
   */
  EAttribute getMappedColumn_IgnoreNull();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.datacompareModule.MappedColumn#getMappingColumn <em>Mapping Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mapping Column</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.MappedColumn#getMappingColumn()
   * @see #getMappedColumn()
   * @generated
   */
  EAttribute getMappedColumn_MappingColumn();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.datacompareModule.MappedColumn#getThreshold <em>Threshold</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Threshold</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.MappedColumn#getThreshold()
   * @see #getMappedColumn()
   * @generated
   */
  EAttribute getMappedColumn_Threshold();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.datacompareModule.Output <em>Output</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Output</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.Output
   * @generated
   */
  EClass getOutput();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.datacompareModule.Output#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.Output#getResource()
   * @see #getOutput()
   * @generated
   */
  EReference getOutput_Resource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.datacompareModule.Output#getPages <em>Pages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pages</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.Output#getPages()
   * @see #getOutput()
   * @generated
   */
  EReference getOutput_Pages();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.datacompareModule.Page <em>Page</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Page</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.Page
   * @generated
   */
  EClass getPage();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.datacompareModule.Page#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.Page#getName()
   * @see #getPage()
   * @generated
   */
  EAttribute getPage_Name();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.datacompareModule.Page#isOmit <em>Omit</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Omit</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.Page#isOmit()
   * @see #getPage()
   * @generated
   */
  EAttribute getPage_Omit();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.datacompareModule.Page#isSparse <em>Sparse</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sparse</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.Page#isSparse()
   * @see #getPage()
   * @generated
   */
  EAttribute getPage_Sparse();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.datacompareModule.Pages <em>Pages</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Pages</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.Pages
   * @generated
   */
  EClass getPages();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.datacompareModule.Pages#getSummary <em>Summary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Summary</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.Pages#getSummary()
   * @see #getPages()
   * @generated
   */
  EReference getPages_Summary();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.datacompareModule.Pages#getDifferent <em>Different</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Different</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.Pages#getDifferent()
   * @see #getPages()
   * @generated
   */
  EReference getPages_Different();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.datacompareModule.Pages#getExplained <em>Explained</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Explained</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.Pages#getExplained()
   * @see #getPages()
   * @generated
   */
  EReference getPages_Explained();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.datacompareModule.Pages#getInLeftOnly <em>In Left Only</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>In Left Only</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.Pages#getInLeftOnly()
   * @see #getPages()
   * @generated
   */
  EReference getPages_InLeftOnly();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.datacompareModule.Pages#getInRightOnly <em>In Right Only</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>In Right Only</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.Pages#getInRightOnly()
   * @see #getPages()
   * @generated
   */
  EReference getPages_InRightOnly();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.datacompareModule.Pages#getIdentical <em>Identical</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Identical</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.Pages#getIdentical()
   * @see #getPages()
   * @generated
   */
  EReference getPages_Identical();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.datacompareModule.Pages#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.Pages#getLeft()
   * @see #getPages()
   * @generated
   */
  EReference getPages_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.datacompareModule.Pages#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.Pages#getRight()
   * @see #getPages()
   * @generated
   */
  EReference getPages_Right();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.datacompareModule.PerlDiffSetExplainer <em>Perl Diff Set Explainer</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Perl Diff Set Explainer</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.PerlDiffSetExplainer
   * @generated
   */
  EClass getPerlDiffSetExplainer();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.datacompareModule.PerlDiffSetExplainer#getInitCode <em>Init Code</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Init Code</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.PerlDiffSetExplainer#getInitCode()
   * @see #getPerlDiffSetExplainer()
   * @generated
   */
  EReference getPerlDiffSetExplainer_InitCode();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.datacompareModule.PerlDiffSetExplainer#getDiffCode <em>Diff Code</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Diff Code</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.PerlDiffSetExplainer#getDiffCode()
   * @see #getPerlDiffSetExplainer()
   * @generated
   */
  EReference getPerlDiffSetExplainer_DiffCode();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.datacompareModule.PerlDiffSetExplainer#getDestroyCode <em>Destroy Code</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Destroy Code</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.PerlDiffSetExplainer#getDestroyCode()
   * @see #getPerlDiffSetExplainer()
   * @generated
   */
  EReference getPerlDiffSetExplainer_DestroyCode();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.modules.datacompareModule.SortType <em>Sort Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Sort Type</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.SortType
   * @generated
   */
  EEnum getSortType();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.modules.datacompareModule.SortType <em>Sort Type Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Sort Type Object</em>'.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.SortType
   * @model instanceClass="com.ms.qaTools.saturn.modules.datacompareModule.SortType"
   *        extendedMetaData="name='SortType:Object' baseType='SortType'"
   * @generated
   */
  EDataType getSortTypeObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DatacompareModuleFactory getDatacompareModuleFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.AbstractDiffSetExplainerImpl <em>Abstract Diff Set Explainer</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.AbstractDiffSetExplainerImpl
     * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DatacompareModulePackageImpl#getAbstractDiffSetExplainer()
     * @generated
     */
    EClass     ABSTRACT_DIFF_SET_EXPLAINER                              = eINSTANCE.getAbstractDiffSetExplainer();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.DataCompareConfigurationImpl <em>Data Compare Configuration</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DataCompareConfigurationImpl
     * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DatacompareModulePackageImpl#getDataCompareConfiguration()
     * @generated
     */
    EClass     DATA_COMPARE_CONFIGURATION                               = eINSTANCE.getDataCompareConfiguration();

    /**
     * The meta object literal for the '<em><b>Data Sources</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_COMPARE_CONFIGURATION__DATA_SOURCES                 = eINSTANCE.getDataCompareConfiguration_DataSources();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_COMPARE_CONFIGURATION__OUTPUT                       = eINSTANCE.getDataCompareConfiguration_Output();

    /**
     * The meta object literal for the '<em><b>Diff Set Explainer</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DATA_COMPARE_CONFIGURATION__DIFF_SET_EXPLAINER           = eINSTANCE.getDataCompareConfiguration_DiffSetExplainer();

    /**
     * The meta object literal for the '<em><b>Fail On Validation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_COMPARE_CONFIGURATION__FAIL_ON_VALIDATION           = eINSTANCE.getDataCompareConfiguration_FailOnValidation();

    /**
     * The meta object literal for the '<em><b>Ignore In Left Only Columns</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EAttribute DATA_COMPARE_CONFIGURATION__IGNORE_IN_LEFT_ONLY_COLUMNS  = eINSTANCE.getDataCompareConfiguration_IgnoreInLeftOnlyColumns();

    /**
     * The meta object literal for the '<em><b>Ignore In Right Only Columns</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EAttribute DATA_COMPARE_CONFIGURATION__IGNORE_IN_RIGHT_ONLY_COLUMNS = eINSTANCE.getDataCompareConfiguration_IgnoreInRightOnlyColumns();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.DataSourceDefinitionImpl <em>Data Source Definition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DataSourceDefinitionImpl
     * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DatacompareModulePackageImpl#getDataSourceDefinition()
     * @generated
     */
    EClass     DATA_SOURCE_DEFINITION                                   = eINSTANCE.getDataSourceDefinition();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_SOURCE_DEFINITION__LEFT                             = eINSTANCE.getDataSourceDefinition_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_SOURCE_DEFINITION__RIGHT                            = eINSTANCE.getDataSourceDefinition_Right();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_SOURCE_DEFINITION__COLUMNS                          = eINSTANCE.getDataSourceDefinition_Columns();

    /**
     * The meta object literal for the '<em><b>Max Rows</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DATA_SOURCE_DEFINITION__MAX_ROWS                         = eINSTANCE.getDataSourceDefinition_MaxRows();

    /**
     * The meta object literal for the '<em><b>Partial Compare</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DATA_SOURCE_DEFINITION__PARTIAL_COMPARE                  = eINSTANCE.getDataSourceDefinition_PartialCompare();

    /**
     * The meta object literal for the '<em><b>Sort Datasets</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DATA_SOURCE_DEFINITION__SORT_DATASETS                    = eINSTANCE.getDataSourceDefinition_SortDatasets();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DocumentRootImpl
     * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DatacompareModulePackageImpl#getDocumentRoot()
     * @generated
     */
    EClass     DOCUMENT_ROOT                                            = eINSTANCE.getDocumentRoot();

    /**
     * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__MIXED                                     = eINSTANCE.getDocumentRoot_Mixed();

    /**
     * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP                          = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

    /**
     * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION                       = eINSTANCE.getDocumentRoot_XSISchemaLocation();

    /**
     * The meta object literal for the '<em><b>Data Compare Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DOCUMENT_ROOT__DATA_COMPARE_CONFIGURATION                = eINSTANCE.getDocumentRoot_DataCompareConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.MappedColumnImpl <em>Mapped Column</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.MappedColumnImpl
     * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DatacompareModulePackageImpl#getMappedColumn()
     * @generated
     */
    EClass     MAPPED_COLUMN                                            = eINSTANCE.getMappedColumn();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MAPPED_COLUMN__ENABLED                                   = eINSTANCE.getMappedColumn_Enabled();

    /**
     * The meta object literal for the '<em><b>Ignore Null</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MAPPED_COLUMN__IGNORE_NULL                               = eINSTANCE.getMappedColumn_IgnoreNull();

    /**
     * The meta object literal for the '<em><b>Mapping Column</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MAPPED_COLUMN__MAPPING_COLUMN                            = eINSTANCE.getMappedColumn_MappingColumn();

    /**
     * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MAPPED_COLUMN__THRESHOLD                                 = eINSTANCE.getMappedColumn_Threshold();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.OutputImpl <em>Output</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.OutputImpl
     * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DatacompareModulePackageImpl#getOutput()
     * @generated
     */
    EClass     OUTPUT                                                   = eINSTANCE.getOutput();

    /**
     * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT__RESOURCE                                         = eINSTANCE.getOutput_Resource();

    /**
     * The meta object literal for the '<em><b>Pages</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT__PAGES                                            = eINSTANCE.getOutput_Pages();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.PageImpl <em>Page</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.PageImpl
     * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DatacompareModulePackageImpl#getPage()
     * @generated
     */
    EClass     PAGE                                                     = eINSTANCE.getPage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute PAGE__NAME                                               = eINSTANCE.getPage_Name();

    /**
     * The meta object literal for the '<em><b>Omit</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute PAGE__OMIT                                               = eINSTANCE.getPage_Omit();

    /**
     * The meta object literal for the '<em><b>Sparse</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute PAGE__SPARSE                                             = eINSTANCE.getPage_Sparse();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.PagesImpl <em>Pages</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.PagesImpl
     * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DatacompareModulePackageImpl#getPages()
     * @generated
     */
    EClass     PAGES                                                    = eINSTANCE.getPages();

    /**
     * The meta object literal for the '<em><b>Summary</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGES__SUMMARY                                           = eINSTANCE.getPages_Summary();

    /**
     * The meta object literal for the '<em><b>Different</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference PAGES__DIFFERENT                                         = eINSTANCE.getPages_Different();

    /**
     * The meta object literal for the '<em><b>Explained</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference PAGES__EXPLAINED                                         = eINSTANCE.getPages_Explained();

    /**
     * The meta object literal for the '<em><b>In Left Only</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference PAGES__IN_LEFT_ONLY                                      = eINSTANCE.getPages_InLeftOnly();

    /**
     * The meta object literal for the '<em><b>In Right Only</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference PAGES__IN_RIGHT_ONLY                                     = eINSTANCE.getPages_InRightOnly();

    /**
     * The meta object literal for the '<em><b>Identical</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference PAGES__IDENTICAL                                         = eINSTANCE.getPages_Identical();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGES__LEFT                                              = eINSTANCE.getPages_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGES__RIGHT                                             = eINSTANCE.getPages_Right();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.PerlDiffSetExplainerImpl <em>Perl Diff Set Explainer</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.PerlDiffSetExplainerImpl
     * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DatacompareModulePackageImpl#getPerlDiffSetExplainer()
     * @generated
     */
    EClass     PERL_DIFF_SET_EXPLAINER                                  = eINSTANCE.getPerlDiffSetExplainer();

    /**
     * The meta object literal for the '<em><b>Init Code</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference PERL_DIFF_SET_EXPLAINER__INIT_CODE                       = eINSTANCE.getPerlDiffSetExplainer_InitCode();

    /**
     * The meta object literal for the '<em><b>Diff Code</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference PERL_DIFF_SET_EXPLAINER__DIFF_CODE                       = eINSTANCE.getPerlDiffSetExplainer_DiffCode();

    /**
     * The meta object literal for the '<em><b>Destroy Code</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference PERL_DIFF_SET_EXPLAINER__DESTROY_CODE                    = eINSTANCE.getPerlDiffSetExplainer_DestroyCode();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.datacompareModule.SortType <em>Sort Type</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.datacompareModule.SortType
     * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DatacompareModulePackageImpl#getSortType()
     * @generated
     */
    EEnum      SORT_TYPE                                                = eINSTANCE.getSortType();

    /**
     * The meta object literal for the '<em>Sort Type Object</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see com.ms.qaTools.saturn.modules.datacompareModule.SortType
     * @see com.ms.qaTools.saturn.modules.datacompareModule.impl.DatacompareModulePackageImpl#getSortTypeObject()
     * @generated
     */
    EDataType  SORT_TYPE_OBJECT                                         = eINSTANCE.getSortTypeObject();

  }

} // DatacompareModulePackage
