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
package com.ms.qaTools.saturn.modules.xmlDiffModule;

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
 * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffModuleFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface XmlDiffModulePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String               eNAME                                        = "xmlDiffModule";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String               eNS_URI                                      = "http://www.ms.com/2007/Saturn/Modules/XmlDiff";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String               eNS_PREFIX                                   = "xDiffModule";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  XmlDiffModulePackage eINSTANCE                                    = com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffModulePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.impl.DocumentRootImpl
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffModulePackageImpl#getDocumentRoot()
   * @generated
   */
  int                  DOCUMENT_ROOT                                = 0;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  DOCUMENT_ROOT__MIXED                         = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  DOCUMENT_ROOT__XMLNS_PREFIX_MAP              = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  DOCUMENT_ROOT__XSI_SCHEMA_LOCATION           = 2;

  /**
   * The feature id for the '<em><b>Xml Diff Configuration</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  DOCUMENT_ROOT__XML_DIFF_CONFIGURATION        = 3;

  /**
   * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                  DOCUMENT_ROOT_FEATURE_COUNT                  = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffColumnImpl <em>Xml Diff Column</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffColumnImpl
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffModulePackageImpl#getXmlDiffColumn()
   * @generated
   */
  int                  XML_DIFF_COLUMN                              = 1;

  /**
   * The feature id for the '<em><b>Column Desc</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XML_DIFF_COLUMN__COLUMN_DESC                 = 0;

  /**
   * The feature id for the '<em><b>XPath</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XML_DIFF_COLUMN__XPATH                       = 1;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XML_DIFF_COLUMN__ENABLED                     = 2;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XML_DIFF_COLUMN__THRESHOLD                   = 3;

  /**
   * The number of structural features of the '<em>Xml Diff Column</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XML_DIFF_COLUMN_FEATURE_COUNT                = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffConfigurationImpl <em>Xml Diff Configuration</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffConfigurationImpl
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffModulePackageImpl#getXmlDiffConfiguration()
   * @generated
   */
  int                  XML_DIFF_CONFIGURATION                       = 2;

  /**
   * The feature id for the '<em><b>Objects</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XML_DIFF_CONFIGURATION__OBJECTS              = 0;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XML_DIFF_CONFIGURATION__COLUMNS              = 1;

  /**
   * The feature id for the '<em><b>Document Keys</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XML_DIFF_CONFIGURATION__DOCUMENT_KEYS        = 2;

  /**
   * The feature id for the '<em><b>Namespaces</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XML_DIFF_CONFIGURATION__NAMESPACES           = 3;

  /**
   * The feature id for the '<em><b>Left File</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                  XML_DIFF_CONFIGURATION__LEFT_FILE            = 4;

  /**
   * The feature id for the '<em><b>Right File</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XML_DIFF_CONFIGURATION__RIGHT_FILE           = 5;

  /**
   * The feature id for the '<em><b>Out Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XML_DIFF_CONFIGURATION__OUT_RESOURCE         = 6;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XML_DIFF_CONFIGURATION__DESCRIPTION          = 7;

  /**
   * The feature id for the '<em><b>Fail On Validation</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                  XML_DIFF_CONFIGURATION__FAIL_ON_VALIDATION   = 8;

  /**
   * The feature id for the '<em><b>Ignore In Left Only</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                  XML_DIFF_CONFIGURATION__IGNORE_IN_LEFT_ONLY  = 9;

  /**
   * The feature id for the '<em><b>Ignore In Right Only</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                  XML_DIFF_CONFIGURATION__IGNORE_IN_RIGHT_ONLY = 10;

  /**
   * The number of structural features of the '<em>Xml Diff Configuration</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XML_DIFF_CONFIGURATION_FEATURE_COUNT         = 11;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffNamespaceImpl <em>Xml Diff Namespace</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffNamespaceImpl
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffModulePackageImpl#getXmlDiffNamespace()
   * @generated
   */
  int                  XML_DIFF_NAMESPACE                           = 3;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                  XML_DIFF_NAMESPACE__PREFIX                   = 0;

  /**
   * The feature id for the '<em><b>Uri</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XML_DIFF_NAMESPACE__URI                      = 1;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XML_DIFF_NAMESPACE__ENABLED                  = 2;

  /**
   * The number of structural features of the '<em>Xml Diff Namespace</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XML_DIFF_NAMESPACE_FEATURE_COUNT             = 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffObjectImpl <em>Xml Diff Object</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffObjectImpl
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffModulePackageImpl#getXmlDiffObject()
   * @generated
   */
  int                  XML_DIFF_OBJECT                              = 4;

  /**
   * The feature id for the '<em><b>Keys</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                  XML_DIFF_OBJECT__KEYS                        = 0;

  /**
   * The feature id for the '<em><b>XPath</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XML_DIFF_OBJECT__XPATH                       = 1;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XML_DIFF_OBJECT__ENABLED                     = 2;

  /**
   * The number of structural features of the '<em>Xml Diff Object</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  XML_DIFF_OBJECT_FEATURE_COUNT                = 3;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '
   * {@link com.ms.qaTools.saturn.modules.xmlDiffModule.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.DocumentRoot#getXmlDiffConfiguration <em>Xml Diff Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Xml Diff Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.DocumentRoot#getXmlDiffConfiguration()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XmlDiffConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffColumn <em>Xml Diff Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Xml Diff Column</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffColumn
   * @generated
   */
  EClass getXmlDiffColumn();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffColumn#getColumnDesc <em>Column Desc</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Column Desc</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffColumn#getColumnDesc()
   * @see #getXmlDiffColumn()
   * @generated
   */
  EReference getXmlDiffColumn_ColumnDesc();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffColumn#getXPath <em>XPath</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>XPath</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffColumn#getXPath()
   * @see #getXmlDiffColumn()
   * @generated
   */
  EReference getXmlDiffColumn_XPath();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffColumn#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffColumn#isEnabled()
   * @see #getXmlDiffColumn()
   * @generated
   */
  EAttribute getXmlDiffColumn_Enabled();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffColumn#getThreshold <em>Threshold</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Threshold</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffColumn#getThreshold()
   * @see #getXmlDiffColumn()
   * @generated
   */
  EAttribute getXmlDiffColumn_Threshold();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration <em>Xml Diff Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Xml Diff Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration
   * @generated
   */
  EClass getXmlDiffConfiguration();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getObjects <em>Objects</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Objects</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getObjects()
   * @see #getXmlDiffConfiguration()
   * @generated
   */
  EReference getXmlDiffConfiguration_Objects();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getColumns <em>Columns</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Columns</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getColumns()
   * @see #getXmlDiffConfiguration()
   * @generated
   */
  EReference getXmlDiffConfiguration_Columns();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getDocumentKeys <em>Document Keys</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Document Keys</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getDocumentKeys()
   * @see #getXmlDiffConfiguration()
   * @generated
   */
  EReference getXmlDiffConfiguration_DocumentKeys();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getNamespaces <em>Namespaces</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Namespaces</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getNamespaces()
   * @see #getXmlDiffConfiguration()
   * @generated
   */
  EReference getXmlDiffConfiguration_Namespaces();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getLeftFile <em>Left File</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Left File</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getLeftFile()
   * @see #getXmlDiffConfiguration()
   * @generated
   */
  EReference getXmlDiffConfiguration_LeftFile();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getRightFile <em>Right File</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Right File</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getRightFile()
   * @see #getXmlDiffConfiguration()
   * @generated
   */
  EReference getXmlDiffConfiguration_RightFile();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getOutResource <em>Out Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Out Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getOutResource()
   * @see #getXmlDiffConfiguration()
   * @generated
   */
  EReference getXmlDiffConfiguration_OutResource();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getDescription <em>Description</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getDescription()
   * @see #getXmlDiffConfiguration()
   * @generated
   */
  EReference getXmlDiffConfiguration_Description();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#isFailOnValidation <em>Fail On Validation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fail On Validation</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#isFailOnValidation()
   * @see #getXmlDiffConfiguration()
   * @generated
   */
  EAttribute getXmlDiffConfiguration_FailOnValidation();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#isIgnoreInLeftOnly <em>Ignore In Left Only</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ignore In Left Only</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#isIgnoreInLeftOnly()
   * @see #getXmlDiffConfiguration()
   * @generated
   */
  EAttribute getXmlDiffConfiguration_IgnoreInLeftOnly();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#isIgnoreInRightOnly <em>Ignore In Right Only</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ignore In Right Only</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#isIgnoreInRightOnly()
   * @see #getXmlDiffConfiguration()
   * @generated
   */
  EAttribute getXmlDiffConfiguration_IgnoreInRightOnly();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffNamespace <em>Xml Diff Namespace</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Xml Diff Namespace</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffNamespace
   * @generated
   */
  EClass getXmlDiffNamespace();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffNamespace#getPrefix <em>Prefix</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Prefix</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffNamespace#getPrefix()
   * @see #getXmlDiffNamespace()
   * @generated
   */
  EReference getXmlDiffNamespace_Prefix();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffNamespace#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Uri</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffNamespace#getUri()
   * @see #getXmlDiffNamespace()
   * @generated
   */
  EReference getXmlDiffNamespace_Uri();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffNamespace#isEnabled <em>Enabled</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffNamespace#isEnabled()
   * @see #getXmlDiffNamespace()
   * @generated
   */
  EAttribute getXmlDiffNamespace_Enabled();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffObject <em>Xml Diff Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Xml Diff Object</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffObject
   * @generated
   */
  EClass getXmlDiffObject();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffObject#getKeys <em>Keys</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Keys</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffObject#getKeys()
   * @see #getXmlDiffObject()
   * @generated
   */
  EReference getXmlDiffObject_Keys();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffObject#getXPath <em>XPath</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>XPath</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffObject#getXPath()
   * @see #getXmlDiffObject()
   * @generated
   */
  EReference getXmlDiffObject_XPath();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffObject#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffObject#isEnabled()
   * @see #getXmlDiffObject()
   * @generated
   */
  EAttribute getXmlDiffObject_Enabled();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  XmlDiffModuleFactory getXmlDiffModuleFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlDiffModule.impl.DocumentRootImpl
     * @see com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffModulePackageImpl#getDocumentRoot()
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
     * The meta object literal for the '<em><b>Xml Diff Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DOCUMENT_ROOT__XML_DIFF_CONFIGURATION        = eINSTANCE.getDocumentRoot_XmlDiffConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffColumnImpl <em>Xml Diff Column</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffColumnImpl
     * @see com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffModulePackageImpl#getXmlDiffColumn()
     * @generated
     */
    EClass     XML_DIFF_COLUMN                              = eINSTANCE.getXmlDiffColumn();

    /**
     * The meta object literal for the '<em><b>Column Desc</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference XML_DIFF_COLUMN__COLUMN_DESC                 = eINSTANCE.getXmlDiffColumn_ColumnDesc();

    /**
     * The meta object literal for the '<em><b>XPath</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML_DIFF_COLUMN__XPATH                       = eINSTANCE.getXmlDiffColumn_XPath();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute XML_DIFF_COLUMN__ENABLED                     = eINSTANCE.getXmlDiffColumn_Enabled();

    /**
     * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute XML_DIFF_COLUMN__THRESHOLD                   = eINSTANCE.getXmlDiffColumn_Threshold();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffConfigurationImpl <em>Xml Diff Configuration</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffConfigurationImpl
     * @see com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffModulePackageImpl#getXmlDiffConfiguration()
     * @generated
     */
    EClass     XML_DIFF_CONFIGURATION                       = eINSTANCE.getXmlDiffConfiguration();

    /**
     * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference XML_DIFF_CONFIGURATION__OBJECTS              = eINSTANCE.getXmlDiffConfiguration_Objects();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference XML_DIFF_CONFIGURATION__COLUMNS              = eINSTANCE.getXmlDiffConfiguration_Columns();

    /**
     * The meta object literal for the '<em><b>Document Keys</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference XML_DIFF_CONFIGURATION__DOCUMENT_KEYS        = eINSTANCE.getXmlDiffConfiguration_DocumentKeys();

    /**
     * The meta object literal for the '<em><b>Namespaces</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference XML_DIFF_CONFIGURATION__NAMESPACES           = eINSTANCE.getXmlDiffConfiguration_Namespaces();

    /**
     * The meta object literal for the '<em><b>Left File</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference XML_DIFF_CONFIGURATION__LEFT_FILE            = eINSTANCE.getXmlDiffConfiguration_LeftFile();

    /**
     * The meta object literal for the '<em><b>Right File</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference XML_DIFF_CONFIGURATION__RIGHT_FILE           = eINSTANCE.getXmlDiffConfiguration_RightFile();

    /**
     * The meta object literal for the '<em><b>Out Resource</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference XML_DIFF_CONFIGURATION__OUT_RESOURCE         = eINSTANCE.getXmlDiffConfiguration_OutResource();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference XML_DIFF_CONFIGURATION__DESCRIPTION          = eINSTANCE.getXmlDiffConfiguration_Description();

    /**
     * The meta object literal for the '<em><b>Fail On Validation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XML_DIFF_CONFIGURATION__FAIL_ON_VALIDATION   = eINSTANCE.getXmlDiffConfiguration_FailOnValidation();

    /**
     * The meta object literal for the '<em><b>Ignore In Left Only</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XML_DIFF_CONFIGURATION__IGNORE_IN_LEFT_ONLY  = eINSTANCE.getXmlDiffConfiguration_IgnoreInLeftOnly();

    /**
     * The meta object literal for the '<em><b>Ignore In Right Only</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XML_DIFF_CONFIGURATION__IGNORE_IN_RIGHT_ONLY = eINSTANCE.getXmlDiffConfiguration_IgnoreInRightOnly();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffNamespaceImpl <em>Xml Diff Namespace</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffNamespaceImpl
     * @see com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffModulePackageImpl#getXmlDiffNamespace()
     * @generated
     */
    EClass     XML_DIFF_NAMESPACE                           = eINSTANCE.getXmlDiffNamespace();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML_DIFF_NAMESPACE__PREFIX                   = eINSTANCE.getXmlDiffNamespace_Prefix();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' containment reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference XML_DIFF_NAMESPACE__URI                      = eINSTANCE.getXmlDiffNamespace_Uri();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute XML_DIFF_NAMESPACE__ENABLED                  = eINSTANCE.getXmlDiffNamespace_Enabled();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffObjectImpl <em>Xml Diff Object</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffObjectImpl
     * @see com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffModulePackageImpl#getXmlDiffObject()
     * @generated
     */
    EClass     XML_DIFF_OBJECT                              = eINSTANCE.getXmlDiffObject();

    /**
     * The meta object literal for the '<em><b>Keys</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference XML_DIFF_OBJECT__KEYS                        = eINSTANCE.getXmlDiffObject_Keys();

    /**
     * The meta object literal for the '<em><b>XPath</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML_DIFF_OBJECT__XPATH                       = eINSTANCE.getXmlDiffObject_XPath();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute XML_DIFF_OBJECT__ENABLED                     = eINSTANCE.getXmlDiffObject_Enabled();

  }

} // XmlDiffModulePackage
