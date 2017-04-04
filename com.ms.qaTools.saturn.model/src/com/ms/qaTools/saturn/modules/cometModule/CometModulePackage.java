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
package com.ms.qaTools.saturn.modules.cometModule;

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
 * @see com.ms.qaTools.saturn.modules.cometModule.CometModuleFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface CometModulePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String             eNAME                              = "cometModule";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String             eNS_URI                            = "http://www.ms.com/2011/Saturn/Modules/Comet";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String             eNS_PREFIX                         = "comet";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  CometModulePackage eINSTANCE                          = com.ms.qaTools.saturn.modules.cometModule.impl.CometModulePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.cometModule.impl.AbstractDescriptorImpl <em>Abstract Descriptor</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.cometModule.impl.AbstractDescriptorImpl
   * @see com.ms.qaTools.saturn.modules.cometModule.impl.CometModulePackageImpl#getAbstractDescriptor()
   * @generated
   */
  int                ABSTRACT_DESCRIPTOR                = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                ABSTRACT_DESCRIPTOR__NAME          = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                ABSTRACT_DESCRIPTOR__VALUE         = 1;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                ABSTRACT_DESCRIPTOR__ENABLED       = 2;

  /**
   * The number of structural features of the '<em>Abstract Descriptor</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                ABSTRACT_DESCRIPTOR_FEATURE_COUNT  = 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.cometModule.impl.CometConfigurationImpl <em>Comet Configuration</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.cometModule.impl.CometConfigurationImpl
   * @see com.ms.qaTools.saturn.modules.cometModule.impl.CometModulePackageImpl#getCometConfiguration()
   * @generated
   */
  int                COMET_CONFIGURATION                = 1;

  /**
   * The feature id for the '<em><b>Messages</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                COMET_CONFIGURATION__MESSAGES      = 0;

  /**
   * The feature id for the '<em><b>Database</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                COMET_CONFIGURATION__DATABASE      = 1;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                COMET_CONFIGURATION__OUTPUT        = 2;

  /**
   * The feature id for the '<em><b>Time Out</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                COMET_CONFIGURATION__TIME_OUT      = 3;

  /**
   * The number of structural features of the '<em>Comet Configuration</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                COMET_CONFIGURATION_FEATURE_COUNT  = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.cometModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.cometModule.impl.DocumentRootImpl
   * @see com.ms.qaTools.saturn.modules.cometModule.impl.CometModulePackageImpl#getDocumentRoot()
   * @generated
   */
  int                DOCUMENT_ROOT                      = 2;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                DOCUMENT_ROOT__MIXED               = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                DOCUMENT_ROOT__XMLNS_PREFIX_MAP    = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

  /**
   * The feature id for the '<em><b>Comet Configuration</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                DOCUMENT_ROOT__COMET_CONFIGURATION = 3;

  /**
   * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                DOCUMENT_ROOT_FEATURE_COUNT        = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.cometModule.impl.MessageImpl <em>Message</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.cometModule.impl.MessageImpl
   * @see com.ms.qaTools.saturn.modules.cometModule.impl.CometModulePackageImpl#getMessage()
   * @generated
   */
  int                MESSAGE                            = 3;

  /**
   * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                MESSAGE__DESCRIPTORS               = 0;

  /**
   * The feature id for the '<em><b>Checkpoint</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                MESSAGE__CHECKPOINT                = 1;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                MESSAGE__ENABLED                   = 2;

  /**
   * The number of structural features of the '<em>Message</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                MESSAGE_FEATURE_COUNT              = 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.cometModule.impl.MessageDescriptorImpl <em>Message Descriptor</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.cometModule.impl.MessageDescriptorImpl
   * @see com.ms.qaTools.saturn.modules.cometModule.impl.CometModulePackageImpl#getMessageDescriptor()
   * @generated
   */
  int                MESSAGE_DESCRIPTOR                 = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                MESSAGE_DESCRIPTOR__NAME           = ABSTRACT_DESCRIPTOR__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                MESSAGE_DESCRIPTOR__VALUE          = ABSTRACT_DESCRIPTOR__VALUE;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                MESSAGE_DESCRIPTOR__ENABLED        = ABSTRACT_DESCRIPTOR__ENABLED;

  /**
   * The number of structural features of the '<em>Message Descriptor</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                MESSAGE_DESCRIPTOR_FEATURE_COUNT   = ABSTRACT_DESCRIPTOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.cometModule.impl.RegexDescriptorImpl <em>Regex Descriptor</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.cometModule.impl.RegexDescriptorImpl
   * @see com.ms.qaTools.saturn.modules.cometModule.impl.CometModulePackageImpl#getRegexDescriptor()
   * @generated
   */
  int                REGEX_DESCRIPTOR                   = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                REGEX_DESCRIPTOR__NAME             = ABSTRACT_DESCRIPTOR__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                REGEX_DESCRIPTOR__VALUE            = ABSTRACT_DESCRIPTOR__VALUE;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                REGEX_DESCRIPTOR__ENABLED          = ABSTRACT_DESCRIPTOR__ENABLED;

  /**
   * The number of structural features of the '<em>Regex Descriptor</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                REGEX_DESCRIPTOR_FEATURE_COUNT     = ABSTRACT_DESCRIPTOR_FEATURE_COUNT + 0;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.cometModule.AbstractDescriptor <em>Abstract Descriptor</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Descriptor</em>'.
   * @see com.ms.qaTools.saturn.modules.cometModule.AbstractDescriptor
   * @generated
   */
  EClass getAbstractDescriptor();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.cometModule.AbstractDescriptor#getName <em>Name</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see com.ms.qaTools.saturn.modules.cometModule.AbstractDescriptor#getName()
   * @see #getAbstractDescriptor()
   * @generated
   */
  EReference getAbstractDescriptor_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.cometModule.AbstractDescriptor#getValue <em>Value</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.ms.qaTools.saturn.modules.cometModule.AbstractDescriptor#getValue()
   * @see #getAbstractDescriptor()
   * @generated
   */
  EReference getAbstractDescriptor_Value();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.cometModule.AbstractDescriptor#isEnabled <em>Enabled</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.cometModule.AbstractDescriptor#isEnabled()
   * @see #getAbstractDescriptor()
   * @generated
   */
  EAttribute getAbstractDescriptor_Enabled();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.cometModule.CometConfiguration <em>Comet Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Comet Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.cometModule.CometConfiguration
   * @generated
   */
  EClass getCometConfiguration();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.modules.cometModule.CometConfiguration#getMessages <em>Messages</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Messages</em>'.
   * @see com.ms.qaTools.saturn.modules.cometModule.CometConfiguration#getMessages()
   * @see #getCometConfiguration()
   * @generated
   */
  EReference getCometConfiguration_Messages();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.cometModule.CometConfiguration#getDatabase <em>Database</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Database</em>'.
   * @see com.ms.qaTools.saturn.modules.cometModule.CometConfiguration#getDatabase()
   * @see #getCometConfiguration()
   * @generated
   */
  EReference getCometConfiguration_Database();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.cometModule.CometConfiguration#getOutput <em>Output</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Output</em>'.
   * @see com.ms.qaTools.saturn.modules.cometModule.CometConfiguration#getOutput()
   * @see #getCometConfiguration()
   * @generated
   */
  EReference getCometConfiguration_Output();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.cometModule.CometConfiguration#getTimeOut <em>Time Out</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Time Out</em>'.
   * @see com.ms.qaTools.saturn.modules.cometModule.CometConfiguration#getTimeOut()
   * @see #getCometConfiguration()
   * @generated
   */
  EReference getCometConfiguration_TimeOut();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.cometModule.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.ms.qaTools.saturn.modules.cometModule.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.ms.qaTools.saturn.modules.cometModule.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.ms.qaTools.saturn.modules.cometModule.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '
   * {@link com.ms.qaTools.saturn.modules.cometModule.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.ms.qaTools.saturn.modules.cometModule.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.cometModule.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.ms.qaTools.saturn.modules.cometModule.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.cometModule.DocumentRoot#getCometConfiguration <em>Comet Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Comet Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.cometModule.DocumentRoot#getCometConfiguration()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_CometConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.cometModule.Message <em>Message</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Message</em>'.
   * @see com.ms.qaTools.saturn.modules.cometModule.Message
   * @generated
   */
  EClass getMessage();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.cometModule.Message#getDescriptors <em>Descriptors</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Descriptors</em>'.
   * @see com.ms.qaTools.saturn.modules.cometModule.Message#getDescriptors()
   * @see #getMessage()
   * @generated
   */
  EReference getMessage_Descriptors();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.cometModule.Message#getCheckpoint <em>Checkpoint</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Checkpoint</em>'.
   * @see com.ms.qaTools.saturn.modules.cometModule.Message#getCheckpoint()
   * @see #getMessage()
   * @generated
   */
  EReference getMessage_Checkpoint();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.cometModule.Message#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.cometModule.Message#isEnabled()
   * @see #getMessage()
   * @generated
   */
  EAttribute getMessage_Enabled();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.cometModule.MessageDescriptor <em>Message Descriptor</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Descriptor</em>'.
   * @see com.ms.qaTools.saturn.modules.cometModule.MessageDescriptor
   * @generated
   */
  EClass getMessageDescriptor();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.cometModule.RegexDescriptor <em>Regex Descriptor</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Regex Descriptor</em>'.
   * @see com.ms.qaTools.saturn.modules.cometModule.RegexDescriptor
   * @generated
   */
  EClass getRegexDescriptor();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CometModuleFactory getCometModuleFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.cometModule.impl.AbstractDescriptorImpl <em>Abstract Descriptor</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.cometModule.impl.AbstractDescriptorImpl
     * @see com.ms.qaTools.saturn.modules.cometModule.impl.CometModulePackageImpl#getAbstractDescriptor()
     * @generated
     */
    EClass     ABSTRACT_DESCRIPTOR                = eINSTANCE.getAbstractDescriptor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_DESCRIPTOR__NAME          = eINSTANCE.getAbstractDescriptor_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_DESCRIPTOR__VALUE         = eINSTANCE.getAbstractDescriptor_Value();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_DESCRIPTOR__ENABLED       = eINSTANCE.getAbstractDescriptor_Enabled();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.cometModule.impl.CometConfigurationImpl <em>Comet Configuration</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.cometModule.impl.CometConfigurationImpl
     * @see com.ms.qaTools.saturn.modules.cometModule.impl.CometModulePackageImpl#getCometConfiguration()
     * @generated
     */
    EClass     COMET_CONFIGURATION                = eINSTANCE.getCometConfiguration();

    /**
     * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference COMET_CONFIGURATION__MESSAGES      = eINSTANCE.getCometConfiguration_Messages();

    /**
     * The meta object literal for the '<em><b>Database</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMET_CONFIGURATION__DATABASE      = eINSTANCE.getCometConfiguration_Database();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMET_CONFIGURATION__OUTPUT        = eINSTANCE.getCometConfiguration_Output();

    /**
     * The meta object literal for the '<em><b>Time Out</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMET_CONFIGURATION__TIME_OUT      = eINSTANCE.getCometConfiguration_TimeOut();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.cometModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.cometModule.impl.DocumentRootImpl
     * @see com.ms.qaTools.saturn.modules.cometModule.impl.CometModulePackageImpl#getDocumentRoot()
     * @generated
     */
    EClass     DOCUMENT_ROOT                      = eINSTANCE.getDocumentRoot();

    /**
     * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__MIXED               = eINSTANCE.getDocumentRoot_Mixed();

    /**
     * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP    = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

    /**
     * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

    /**
     * The meta object literal for the '<em><b>Comet Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DOCUMENT_ROOT__COMET_CONFIGURATION = eINSTANCE.getDocumentRoot_CometConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.cometModule.impl.MessageImpl <em>Message</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.cometModule.impl.MessageImpl
     * @see com.ms.qaTools.saturn.modules.cometModule.impl.CometModulePackageImpl#getMessage()
     * @generated
     */
    EClass     MESSAGE                            = eINSTANCE.getMessage();

    /**
     * The meta object literal for the '<em><b>Descriptors</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference MESSAGE__DESCRIPTORS               = eINSTANCE.getMessage_Descriptors();

    /**
     * The meta object literal for the '<em><b>Checkpoint</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE__CHECKPOINT                = eINSTANCE.getMessage_Checkpoint();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE__ENABLED                   = eINSTANCE.getMessage_Enabled();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.cometModule.impl.MessageDescriptorImpl <em>Message Descriptor</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.cometModule.impl.MessageDescriptorImpl
     * @see com.ms.qaTools.saturn.modules.cometModule.impl.CometModulePackageImpl#getMessageDescriptor()
     * @generated
     */
    EClass     MESSAGE_DESCRIPTOR                 = eINSTANCE.getMessageDescriptor();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.cometModule.impl.RegexDescriptorImpl <em>Regex Descriptor</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.cometModule.impl.RegexDescriptorImpl
     * @see com.ms.qaTools.saturn.modules.cometModule.impl.CometModulePackageImpl#getRegexDescriptor()
     * @generated
     */
    EClass     REGEX_DESCRIPTOR                   = eINSTANCE.getRegexDescriptor();

  }

} // CometModulePackage
