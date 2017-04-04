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
package com.ms.qaTools.saturn.modules.xml2csvModule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see com.ms.qaTools.saturn.modules.xml2csvModule.Xml2csvModuleFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface Xml2csvModulePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String               eNAME                                  = "xml2csvModule";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String               eNS_URI                                = "http://www.ms.com/2006/Saturn/Modules/Xml2Csv";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String               eNS_PREFIX                             = "x2csvModule";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  Xml2csvModulePackage eINSTANCE                              = com.ms.qaTools.saturn.modules.xml2csvModule.impl.Xml2csvModulePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xml2csvModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.impl.DocumentRootImpl
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.impl.Xml2csvModulePackageImpl#getDocumentRoot()
   * @generated
   */
  int                  DOCUMENT_ROOT                          = 0;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  DOCUMENT_ROOT__MIXED                   = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  DOCUMENT_ROOT__XMLNS_PREFIX_MAP        = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  DOCUMENT_ROOT__XSI_SCHEMA_LOCATION     = 2;

  /**
   * The feature id for the '<em><b>Xml2 Csv Configuration</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  DOCUMENT_ROOT__XML2_CSV_CONFIGURATION  = 3;

  /**
   * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                  DOCUMENT_ROOT_FEATURE_COUNT            = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xml2csvModule.impl.Xml2CsvConfigurationImpl <em>Xml2 Csv Configuration</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.impl.Xml2CsvConfigurationImpl
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.impl.Xml2csvModulePackageImpl#getXml2CsvConfiguration()
   * @generated
   */
  int                  XML2_CSV_CONFIGURATION                 = 1;

  /**
   * The feature id for the '<em><b>XML File</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                  XML2_CSV_CONFIGURATION__XML_FILE       = 0;

  /**
   * The feature id for the '<em><b>CSV File</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                  XML2_CSV_CONFIGURATION__CSV_FILE       = 1;

  /**
   * The feature id for the '<em><b>Config File</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XML2_CSV_CONFIGURATION__CONFIG_FILE    = 2;

  /**
   * The feature id for the '<em><b>Namespace File</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XML2_CSV_CONFIGURATION__NAMESPACE_FILE = 3;

  /**
   * The feature id for the '<em><b>XPath Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XML2_CSV_CONFIGURATION__XPATH_MAPPINGS = 4;

  /**
   * The feature id for the '<em><b>Remove Nulls</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XML2_CSV_CONFIGURATION__REMOVE_NULLS   = 5;

  /**
   * The feature id for the '<em><b>Add Header</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XML2_CSV_CONFIGURATION__ADD_HEADER     = 6;

  /**
   * The feature id for the '<em><b>Detach Nodes</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XML2_CSV_CONFIGURATION__DETACH_NODES   = 7;

  /**
   * The number of structural features of the '<em>Xml2 Csv Configuration</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XML2_CSV_CONFIGURATION_FEATURE_COUNT   = 8;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xml2csvModule.impl.XPathMappingImpl <em>XPath Mapping</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.impl.XPathMappingImpl
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.impl.Xml2csvModulePackageImpl#getXPathMapping()
   * @generated
   */
  int                  XPATH_MAPPING                          = 2;

  /**
   * The feature id for the '<em><b>XPath</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XPATH_MAPPING__XPATH                   = 0;

  /**
   * The feature id for the '<em><b>Column</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                  XPATH_MAPPING__COLUMN                  = 1;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XPATH_MAPPING__ENABLED                 = 2;

  /**
   * The number of structural features of the '<em>XPath Mapping</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                  XPATH_MAPPING_FEATURE_COUNT            = 3;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xml2csvModule.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.ms.qaTools.saturn.modules.xml2csvModule.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '
   * {@link com.ms.qaTools.saturn.modules.xml2csvModule.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.xml2csvModule.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xml2csvModule.DocumentRoot#getXml2CsvConfiguration <em>Xml2 Csv Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Xml2 Csv Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.DocumentRoot#getXml2CsvConfiguration()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Xml2CsvConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration <em>Xml2 Csv Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Xml2 Csv Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration
   * @generated
   */
  EClass getXml2CsvConfiguration();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#getXMLFile <em>XML File</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>XML File</em>'.
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#getXMLFile()
   * @see #getXml2CsvConfiguration()
   * @generated
   */
  EReference getXml2CsvConfiguration_XMLFile();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#getCSVFile <em>CSV File</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>CSV File</em>'.
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#getCSVFile()
   * @see #getXml2CsvConfiguration()
   * @generated
   */
  EReference getXml2CsvConfiguration_CSVFile();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#getConfigFile <em>Config File</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Config File</em>'.
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#getConfigFile()
   * @see #getXml2CsvConfiguration()
   * @generated
   */
  EReference getXml2CsvConfiguration_ConfigFile();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#getNamespaceFile <em>Namespace File</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Namespace File</em>'.
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#getNamespaceFile()
   * @see #getXml2CsvConfiguration()
   * @generated
   */
  EReference getXml2CsvConfiguration_NamespaceFile();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#getXPathMappings <em>XPath Mappings</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>XPath Mappings</em>'.
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#getXPathMappings()
   * @see #getXml2CsvConfiguration()
   * @generated
   */
  EReference getXml2CsvConfiguration_XPathMappings();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#isAddHeader <em>Add Header</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Add Header</em>'.
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#isAddHeader()
   * @see #getXml2CsvConfiguration()
   * @generated
   */
  EAttribute getXml2CsvConfiguration_AddHeader();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#isDetachNodes <em>Detach Nodes</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Detach Nodes</em>'.
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#isDetachNodes()
   * @see #getXml2CsvConfiguration()
   * @generated
   */
  EAttribute getXml2CsvConfiguration_DetachNodes();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#isRemoveNulls <em>Remove Nulls</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Remove Nulls</em>'.
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#isRemoveNulls()
   * @see #getXml2CsvConfiguration()
   * @generated
   */
  EAttribute getXml2CsvConfiguration_RemoveNulls();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xml2csvModule.XPathMapping <em>XPath Mapping</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>XPath Mapping</em>'.
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.XPathMapping
   * @generated
   */
  EClass getXPathMapping();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xml2csvModule.XPathMapping#getXPath <em>XPath</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>XPath</em>'.
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.XPathMapping#getXPath()
   * @see #getXPathMapping()
   * @generated
   */
  EReference getXPathMapping_XPath();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xml2csvModule.XPathMapping#getColumn <em>Column</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Column</em>'.
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.XPathMapping#getColumn()
   * @see #getXPathMapping()
   * @generated
   */
  EReference getXPathMapping_Column();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.xml2csvModule.XPathMapping#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.XPathMapping#isEnabled()
   * @see #getXPathMapping()
   * @generated
   */
  EAttribute getXPathMapping_Enabled();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Xml2csvModuleFactory getXml2csvModuleFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xml2csvModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xml2csvModule.impl.DocumentRootImpl
     * @see com.ms.qaTools.saturn.modules.xml2csvModule.impl.Xml2csvModulePackageImpl#getDocumentRoot()
     * @generated
     */
    EClass     DOCUMENT_ROOT                          = eINSTANCE.getDocumentRoot();

    /**
     * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__MIXED                   = eINSTANCE.getDocumentRoot_Mixed();

    /**
     * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP        = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

    /**
     * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION     = eINSTANCE.getDocumentRoot_XSISchemaLocation();

    /**
     * The meta object literal for the '<em><b>Xml2 Csv Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DOCUMENT_ROOT__XML2_CSV_CONFIGURATION  = eINSTANCE.getDocumentRoot_Xml2CsvConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xml2csvModule.impl.Xml2CsvConfigurationImpl <em>Xml2 Csv Configuration</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xml2csvModule.impl.Xml2CsvConfigurationImpl
     * @see com.ms.qaTools.saturn.modules.xml2csvModule.impl.Xml2csvModulePackageImpl#getXml2CsvConfiguration()
     * @generated
     */
    EClass     XML2_CSV_CONFIGURATION                 = eINSTANCE.getXml2CsvConfiguration();

    /**
     * The meta object literal for the '<em><b>XML File</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML2_CSV_CONFIGURATION__XML_FILE       = eINSTANCE.getXml2CsvConfiguration_XMLFile();

    /**
     * The meta object literal for the '<em><b>CSV File</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML2_CSV_CONFIGURATION__CSV_FILE       = eINSTANCE.getXml2CsvConfiguration_CSVFile();

    /**
     * The meta object literal for the '<em><b>Config File</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference XML2_CSV_CONFIGURATION__CONFIG_FILE    = eINSTANCE.getXml2CsvConfiguration_ConfigFile();

    /**
     * The meta object literal for the '<em><b>Namespace File</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference XML2_CSV_CONFIGURATION__NAMESPACE_FILE = eINSTANCE.getXml2CsvConfiguration_NamespaceFile();

    /**
     * The meta object literal for the '<em><b>XPath Mappings</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference XML2_CSV_CONFIGURATION__XPATH_MAPPINGS = eINSTANCE.getXml2CsvConfiguration_XPathMappings();

    /**
     * The meta object literal for the '<em><b>Add Header</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute XML2_CSV_CONFIGURATION__ADD_HEADER     = eINSTANCE.getXml2CsvConfiguration_AddHeader();

    /**
     * The meta object literal for the '<em><b>Detach Nodes</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute XML2_CSV_CONFIGURATION__DETACH_NODES   = eINSTANCE.getXml2CsvConfiguration_DetachNodes();

    /**
     * The meta object literal for the '<em><b>Remove Nulls</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute XML2_CSV_CONFIGURATION__REMOVE_NULLS   = eINSTANCE.getXml2CsvConfiguration_RemoveNulls();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xml2csvModule.impl.XPathMappingImpl <em>XPath Mapping</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xml2csvModule.impl.XPathMappingImpl
     * @see com.ms.qaTools.saturn.modules.xml2csvModule.impl.Xml2csvModulePackageImpl#getXPathMapping()
     * @generated
     */
    EClass     XPATH_MAPPING                          = eINSTANCE.getXPathMapping();

    /**
     * The meta object literal for the '<em><b>XPath</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPATH_MAPPING__XPATH                   = eINSTANCE.getXPathMapping_XPath();

    /**
     * The meta object literal for the '<em><b>Column</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPATH_MAPPING__COLUMN                  = eINSTANCE.getXPathMapping_Column();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute XPATH_MAPPING__ENABLED                 = eINSTANCE.getXPathMapping_Enabled();

  }

} // Xml2csvModulePackage
