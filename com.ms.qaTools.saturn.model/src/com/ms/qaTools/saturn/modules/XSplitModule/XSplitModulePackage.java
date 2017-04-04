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
package com.ms.qaTools.saturn.modules.XSplitModule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see com.ms.qaTools.saturn.modules.XSplitModule.XSplitModuleFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface XSplitModulePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String              eNAME                                        = "XSplitModule";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String              eNS_URI                                      = "http://www.ms.com/2006/Saturn/Modules/XSplit";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String              eNS_PREFIX                                   = "xSplitModule";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  XSplitModulePackage eINSTANCE                                    = com.ms.qaTools.saturn.modules.XSplitModule.impl.XSplitModulePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.XSplitModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.XSplitModule.impl.DocumentRootImpl
   * @see com.ms.qaTools.saturn.modules.XSplitModule.impl.XSplitModulePackageImpl#getDocumentRoot()
   * @generated
   */
  int                 DOCUMENT_ROOT                                = 0;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DOCUMENT_ROOT__MIXED                         = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DOCUMENT_ROOT__XMLNS_PREFIX_MAP              = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DOCUMENT_ROOT__XSI_SCHEMA_LOCATION           = 2;

  /**
   * The feature id for the '<em><b>XSplit Configuration</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DOCUMENT_ROOT__XSPLIT_CONFIGURATION          = 3;

  /**
   * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 DOCUMENT_ROOT_FEATURE_COUNT                  = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.XSplitModule.impl.XPathImpl <em>XPath</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.XSplitModule.impl.XPathImpl
   * @see com.ms.qaTools.saturn.modules.XSplitModule.impl.XSplitModulePackageImpl#getXPath()
   * @generated
   */
  int                 XPATH                                        = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPATH__DESCRIPTION = ValuesPackage.COMPLEX_VALUE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XPATH__MIXED                                 = ValuesPackage.COMPLEX_VALUE__MIXED;

  /**
   * The feature id for the '<em><b>Null</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XPATH__NULL                                  = ValuesPackage.COMPLEX_VALUE__NULL;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XPATH__GROUP                                 = ValuesPackage.COMPLEX_VALUE__GROUP;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 XPATH__TEXT                                  = ValuesPackage.COMPLEX_VALUE__TEXT;

  /**
   * The feature id for the '<em><b>Env Var</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XPATH__ENV_VAR                               = ValuesPackage.COMPLEX_VALUE__ENV_VAR;

  /**
   * The feature id for the '<em><b>File</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 XPATH__FILE                                  = ValuesPackage.COMPLEX_VALUE__FILE;

  /**
   * The feature id for the '<em><b>XPath Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XPATH__XPATH_VALUE                           = ValuesPackage.COMPLEX_VALUE__XPATH_VALUE;

  /**
   * The feature id for the '<em><b>JSON Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPATH__JSON_VALUE = ValuesPackage.COMPLEX_VALUE__JSON_VALUE;

  /**
   * The feature id for the '<em><b>FIX Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPATH__FIX_VALUE = ValuesPackage.COMPLEX_VALUE__FIX_VALUE;

  /**
   * The feature id for the '<em><b>Cell Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XPATH__CELL_VALUE                            = ValuesPackage.COMPLEX_VALUE__CELL_VALUE;

  /**
   * The feature id for the '<em><b>Property Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XPATH__PROPERTY_VALUE                        = ValuesPackage.COMPLEX_VALUE__PROPERTY_VALUE;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 XPATH__CODE                                  = ValuesPackage.COMPLEX_VALUE__CODE;

  /**
   * The feature id for the '<em><b>Run Number</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XPATH__RUN_NUMBER                            = ValuesPackage.COMPLEX_VALUE__RUN_NUMBER;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XPATH__REFERENCE                             = ValuesPackage.COMPLEX_VALUE__REFERENCE;

  /**
   * The feature id for the '<em><b>Memoize</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XPATH__MEMOIZE                               = ValuesPackage.COMPLEX_VALUE__MEMOIZE;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XPATH__ENABLED                               = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Group By</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XPATH__GROUP_BY                              = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>XPath</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XPATH_FEATURE_COUNT                          = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.XSplitModule.impl.XSplitConfigurationImpl <em>XSplit Configuration</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.XSplitModule.impl.XSplitConfigurationImpl
   * @see com.ms.qaTools.saturn.modules.XSplitModule.impl.XSplitModulePackageImpl#getXSplitConfiguration()
   * @generated
   */
  int                 XSPLIT_CONFIGURATION                         = 2;

  /**
   * The feature id for the '<em><b>XML File</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 XSPLIT_CONFIGURATION__XML_FILE               = 0;

  /**
   * The feature id for the '<em><b>Output Directory</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XSPLIT_CONFIGURATION__OUTPUT_DIRECTORY       = 1;

  /**
   * The feature id for the '<em><b>XPaths</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XSPLIT_CONFIGURATION__XPATHS                 = 2;

  /**
   * The feature id for the '<em><b>Config File</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XSPLIT_CONFIGURATION__CONFIG_FILE            = 3;

  /**
   * The feature id for the '<em><b>Clear Output Directory</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XSPLIT_CONFIGURATION__CLEAR_OUTPUT_DIRECTORY = 4;

  /**
   * The feature id for the '<em><b>Gzip</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XSPLIT_CONFIGURATION__GZIP                   = 5;

  /**
   * The number of structural features of the '<em>XSplit Configuration</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XSPLIT_CONFIGURATION_FEATURE_COUNT           = 6;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.XSplitModule.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.ms.qaTools.saturn.modules.XSplitModule.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.ms.qaTools.saturn.modules.XSplitModule.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.ms.qaTools.saturn.modules.XSplitModule.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '
   * {@link com.ms.qaTools.saturn.modules.XSplitModule.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.ms.qaTools.saturn.modules.XSplitModule.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.XSplitModule.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.ms.qaTools.saturn.modules.XSplitModule.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.XSplitModule.DocumentRoot#getXSplitConfiguration <em>XSplit Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>XSplit Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.XSplitModule.DocumentRoot#getXSplitConfiguration()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSplitConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.XSplitModule.XPath <em>XPath</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>XPath</em>'.
   * @see com.ms.qaTools.saturn.modules.XSplitModule.XPath
   * @generated
   */
  EClass getXPath();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.XSplitModule.XPath#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.XSplitModule.XPath#isEnabled()
   * @see #getXPath()
   * @generated
   */
  EAttribute getXPath_Enabled();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.XSplitModule.XPath#isGroupBy <em>Group By</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group By</em>'.
   * @see com.ms.qaTools.saturn.modules.XSplitModule.XPath#isGroupBy()
   * @see #getXPath()
   * @generated
   */
  EAttribute getXPath_GroupBy();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration <em>XSplit Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>XSplit Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration
   * @generated
   */
  EClass getXSplitConfiguration();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration#getXMLFile <em>XML File</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>XML File</em>'.
   * @see com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration#getXMLFile()
   * @see #getXSplitConfiguration()
   * @generated
   */
  EReference getXSplitConfiguration_XMLFile();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration#getOutputDirectory <em>Output Directory</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output Directory</em>'.
   * @see com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration#getOutputDirectory()
   * @see #getXSplitConfiguration()
   * @generated
   */
  EReference getXSplitConfiguration_OutputDirectory();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration#getXPaths <em>XPaths</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>XPaths</em>'.
   * @see com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration#getXPaths()
   * @see #getXSplitConfiguration()
   * @generated
   */
  EReference getXSplitConfiguration_XPaths();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration#getConfigFile <em>Config File</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Config File</em>'.
   * @see com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration#getConfigFile()
   * @see #getXSplitConfiguration()
   * @generated
   */
  EReference getXSplitConfiguration_ConfigFile();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration#isClearOutputDirectory <em>Clear Output Directory</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Clear Output Directory</em>'.
   * @see com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration#isClearOutputDirectory()
   * @see #getXSplitConfiguration()
   * @generated
   */
  EAttribute getXSplitConfiguration_ClearOutputDirectory();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration#isGzip <em>Gzip</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gzip</em>'.
   * @see com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration#isGzip()
   * @see #getXSplitConfiguration()
   * @generated
   */
  EAttribute getXSplitConfiguration_Gzip();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  XSplitModuleFactory getXSplitModuleFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.XSplitModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.XSplitModule.impl.DocumentRootImpl
     * @see com.ms.qaTools.saturn.modules.XSplitModule.impl.XSplitModulePackageImpl#getDocumentRoot()
     * @generated
     */
    EClass     DOCUMENT_ROOT                                = eINSTANCE.getDocumentRoot();

    /**
     * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__MIXED                         = eINSTANCE.getDocumentRoot_Mixed();

    /**
     * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP              = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

    /**
     * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION           = eINSTANCE.getDocumentRoot_XSISchemaLocation();

    /**
     * The meta object literal for the '<em><b>XSplit Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DOCUMENT_ROOT__XSPLIT_CONFIGURATION          = eINSTANCE.getDocumentRoot_XSplitConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.XSplitModule.impl.XPathImpl <em>XPath</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.XSplitModule.impl.XPathImpl
     * @see com.ms.qaTools.saturn.modules.XSplitModule.impl.XSplitModulePackageImpl#getXPath()
     * @generated
     */
    EClass     XPATH                                        = eINSTANCE.getXPath();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute XPATH__ENABLED                               = eINSTANCE.getXPath_Enabled();

    /**
     * The meta object literal for the '<em><b>Group By</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute XPATH__GROUP_BY                              = eINSTANCE.getXPath_GroupBy();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.XSplitModule.impl.XSplitConfigurationImpl <em>XSplit Configuration</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.XSplitModule.impl.XSplitConfigurationImpl
     * @see com.ms.qaTools.saturn.modules.XSplitModule.impl.XSplitModulePackageImpl#getXSplitConfiguration()
     * @generated
     */
    EClass     XSPLIT_CONFIGURATION                         = eINSTANCE.getXSplitConfiguration();

    /**
     * The meta object literal for the '<em><b>XML File</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XSPLIT_CONFIGURATION__XML_FILE               = eINSTANCE.getXSplitConfiguration_XMLFile();

    /**
     * The meta object literal for the '<em><b>Output Directory</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference XSPLIT_CONFIGURATION__OUTPUT_DIRECTORY       = eINSTANCE.getXSplitConfiguration_OutputDirectory();

    /**
     * The meta object literal for the '<em><b>XPaths</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference XSPLIT_CONFIGURATION__XPATHS                 = eINSTANCE.getXSplitConfiguration_XPaths();

    /**
     * The meta object literal for the '<em><b>Config File</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference XSPLIT_CONFIGURATION__CONFIG_FILE            = eINSTANCE.getXSplitConfiguration_ConfigFile();

    /**
     * The meta object literal for the '<em><b>Clear Output Directory</b></em>' attribute feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EAttribute XSPLIT_CONFIGURATION__CLEAR_OUTPUT_DIRECTORY = eINSTANCE.getXSplitConfiguration_ClearOutputDirectory();

    /**
     * The meta object literal for the '<em><b>Gzip</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute XSPLIT_CONFIGURATION__GZIP                   = eINSTANCE.getXSplitConfiguration_Gzip();

  }

} // XSplitModulePackage
