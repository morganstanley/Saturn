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
package com.ms.qaTools.saturn.modules.mailModule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see com.ms.qaTools.saturn.modules.mailModule.MailModuleFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface MailModulePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String            eNAME                              = "mailModule";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String            eNS_URI                            = "http://www.ms.com/2006/Saturn/Modules/Mail";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String            eNS_PREFIX                         = "mailModule";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  MailModulePackage eINSTANCE                          = com.ms.qaTools.saturn.modules.mailModule.impl.MailModulePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.mailModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mailModule.impl.DocumentRootImpl
   * @see com.ms.qaTools.saturn.modules.mailModule.impl.MailModulePackageImpl#getDocumentRoot()
   * @generated
   */
  int               DOCUMENT_ROOT                      = 0;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               DOCUMENT_ROOT__MIXED               = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               DOCUMENT_ROOT__XMLNS_PREFIX_MAP    = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

  /**
   * The feature id for the '<em><b>Mail Configuration</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int               DOCUMENT_ROOT__MAIL_CONFIGURATION  = 3;

  /**
   * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int               DOCUMENT_ROOT_FEATURE_COUNT        = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.mailModule.impl.MailConfigurationImpl <em>Mail Configuration</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mailModule.impl.MailConfigurationImpl
   * @see com.ms.qaTools.saturn.modules.mailModule.impl.MailModulePackageImpl#getMailConfiguration()
   * @generated
   */
  int               MAIL_CONFIGURATION                 = 1;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int               MAIL_CONFIGURATION__SUBJECT        = 0;

  /**
   * The feature id for the '<em><b>Message</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int               MAIL_CONFIGURATION__MESSAGE        = 1;

  /**
   * The feature id for the '<em><b>Attachments</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int               MAIL_CONFIGURATION__ATTACHMENTS    = 2;

  /**
   * The feature id for the '<em><b>Recipients</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int               MAIL_CONFIGURATION__RECIPIENTS     = 3;

  /**
   * The feature id for the '<em><b>Attach As Link</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               MAIL_CONFIGURATION__ATTACH_AS_LINK = 4;

  /**
   * The feature id for the '<em><b>Message Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               MAIL_CONFIGURATION__MESSAGE_TYPE   = 5;

  /**
   * The number of structural features of the '<em>Mail Configuration</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int               MAIL_CONFIGURATION_FEATURE_COUNT   = 6;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.mailModule.impl.MailRecipientImpl <em>Mail Recipient</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mailModule.impl.MailRecipientImpl
   * @see com.ms.qaTools.saturn.modules.mailModule.impl.MailModulePackageImpl#getMailRecipient()
   * @generated
   */
  int               MAIL_RECIPIENT                     = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIL_RECIPIENT__DESCRIPTION = ValuesPackage.COMPLEX_VALUE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               MAIL_RECIPIENT__MIXED              = ValuesPackage.COMPLEX_VALUE__MIXED;

  /**
   * The feature id for the '<em><b>Null</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               MAIL_RECIPIENT__NULL               = ValuesPackage.COMPLEX_VALUE__NULL;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               MAIL_RECIPIENT__GROUP              = ValuesPackage.COMPLEX_VALUE__GROUP;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int               MAIL_RECIPIENT__TEXT               = ValuesPackage.COMPLEX_VALUE__TEXT;

  /**
   * The feature id for the '<em><b>Env Var</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int               MAIL_RECIPIENT__ENV_VAR            = ValuesPackage.COMPLEX_VALUE__ENV_VAR;

  /**
   * The feature id for the '<em><b>File</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int               MAIL_RECIPIENT__FILE               = ValuesPackage.COMPLEX_VALUE__FILE;

  /**
   * The feature id for the '<em><b>XPath Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int               MAIL_RECIPIENT__XPATH_VALUE        = ValuesPackage.COMPLEX_VALUE__XPATH_VALUE;

  /**
   * The feature id for the '<em><b>JSON Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIL_RECIPIENT__JSON_VALUE = ValuesPackage.COMPLEX_VALUE__JSON_VALUE;

  /**
   * The feature id for the '<em><b>FIX Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIL_RECIPIENT__FIX_VALUE = ValuesPackage.COMPLEX_VALUE__FIX_VALUE;

  /**
   * The feature id for the '<em><b>Cell Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int               MAIL_RECIPIENT__CELL_VALUE         = ValuesPackage.COMPLEX_VALUE__CELL_VALUE;

  /**
   * The feature id for the '<em><b>Property Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int               MAIL_RECIPIENT__PROPERTY_VALUE     = ValuesPackage.COMPLEX_VALUE__PROPERTY_VALUE;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int               MAIL_RECIPIENT__CODE               = ValuesPackage.COMPLEX_VALUE__CODE;

  /**
   * The feature id for the '<em><b>Run Number</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int               MAIL_RECIPIENT__RUN_NUMBER         = ValuesPackage.COMPLEX_VALUE__RUN_NUMBER;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int               MAIL_RECIPIENT__REFERENCE          = ValuesPackage.COMPLEX_VALUE__REFERENCE;

  /**
   * The feature id for the '<em><b>Memoize</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               MAIL_RECIPIENT__MEMOIZE            = ValuesPackage.COMPLEX_VALUE__MEMOIZE;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               MAIL_RECIPIENT__TYPE               = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mail Recipient</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int               MAIL_RECIPIENT_FEATURE_COUNT       = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.mailModule.MessageTypeEnum <em>Message Type Enum</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mailModule.MessageTypeEnum
   * @see com.ms.qaTools.saturn.modules.mailModule.impl.MailModulePackageImpl#getMessageTypeEnum()
   * @generated
   */
  int               MESSAGE_TYPE_ENUM                  = 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.mailModule.RecipientTypeEnum <em>Recipient Type Enum</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mailModule.RecipientTypeEnum
   * @see com.ms.qaTools.saturn.modules.mailModule.impl.MailModulePackageImpl#getRecipientTypeEnum()
   * @generated
   */
  int               RECIPIENT_TYPE_ENUM                = 4;

  /**
   * The meta object id for the '<em>Message Type Enum Object</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see com.ms.qaTools.saturn.modules.mailModule.MessageTypeEnum
   * @see com.ms.qaTools.saturn.modules.mailModule.impl.MailModulePackageImpl#getMessageTypeEnumObject()
   * @generated
   */
  int               MESSAGE_TYPE_ENUM_OBJECT           = 5;

  /**
   * The meta object id for the '<em>Recipient Type Enum Object</em>' data type.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mailModule.RecipientTypeEnum
   * @see com.ms.qaTools.saturn.modules.mailModule.impl.MailModulePackageImpl#getRecipientTypeEnumObject()
   * @generated
   */
  int               RECIPIENT_TYPE_ENUM_OBJECT         = 6;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.mailModule.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.ms.qaTools.saturn.modules.mailModule.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.ms.qaTools.saturn.modules.mailModule.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.ms.qaTools.saturn.modules.mailModule.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '
   * {@link com.ms.qaTools.saturn.modules.mailModule.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.ms.qaTools.saturn.modules.mailModule.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.mailModule.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.ms.qaTools.saturn.modules.mailModule.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.mailModule.DocumentRoot#getMailConfiguration <em>Mail Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mail Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.mailModule.DocumentRoot#getMailConfiguration()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_MailConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.mailModule.MailConfiguration <em>Mail Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Mail Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.mailModule.MailConfiguration
   * @generated
   */
  EClass getMailConfiguration();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.mailModule.MailConfiguration#getSubject <em>Subject</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Subject</em>'.
   * @see com.ms.qaTools.saturn.modules.mailModule.MailConfiguration#getSubject()
   * @see #getMailConfiguration()
   * @generated
   */
  EReference getMailConfiguration_Subject();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.mailModule.MailConfiguration#getMessage <em>Message</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Message</em>'.
   * @see com.ms.qaTools.saturn.modules.mailModule.MailConfiguration#getMessage()
   * @see #getMailConfiguration()
   * @generated
   */
  EReference getMailConfiguration_Message();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.modules.mailModule.MailConfiguration#getAttachments <em>Attachments</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Attachments</em>'.
   * @see com.ms.qaTools.saturn.modules.mailModule.MailConfiguration#getAttachments()
   * @see #getMailConfiguration()
   * @generated
   */
  EReference getMailConfiguration_Attachments();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.modules.mailModule.MailConfiguration#getRecipients <em>Recipients</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Recipients</em>'.
   * @see com.ms.qaTools.saturn.modules.mailModule.MailConfiguration#getRecipients()
   * @see #getMailConfiguration()
   * @generated
   */
  EReference getMailConfiguration_Recipients();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.mailModule.MailConfiguration#isAttachAsLink <em>Attach As Link</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Attach As Link</em>'.
   * @see com.ms.qaTools.saturn.modules.mailModule.MailConfiguration#isAttachAsLink()
   * @see #getMailConfiguration()
   * @generated
   */
  EAttribute getMailConfiguration_AttachAsLink();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.mailModule.MailConfiguration#getMessageType <em>Message Type</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Message Type</em>'.
   * @see com.ms.qaTools.saturn.modules.mailModule.MailConfiguration#getMessageType()
   * @see #getMailConfiguration()
   * @generated
   */
  EAttribute getMailConfiguration_MessageType();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.mailModule.MailRecipient <em>Mail Recipient</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Mail Recipient</em>'.
   * @see com.ms.qaTools.saturn.modules.mailModule.MailRecipient
   * @generated
   */
  EClass getMailRecipient();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.mailModule.MailRecipient#getType <em>Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.ms.qaTools.saturn.modules.mailModule.MailRecipient#getType()
   * @see #getMailRecipient()
   * @generated
   */
  EAttribute getMailRecipient_Type();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.modules.mailModule.MessageTypeEnum <em>Message Type Enum</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Message Type Enum</em>'.
   * @see com.ms.qaTools.saturn.modules.mailModule.MessageTypeEnum
   * @generated
   */
  EEnum getMessageTypeEnum();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.modules.mailModule.RecipientTypeEnum <em>Recipient Type Enum</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Recipient Type Enum</em>'.
   * @see com.ms.qaTools.saturn.modules.mailModule.RecipientTypeEnum
   * @generated
   */
  EEnum getRecipientTypeEnum();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.modules.mailModule.MessageTypeEnum <em>Message Type Enum Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Message Type Enum Object</em>'.
   * @see com.ms.qaTools.saturn.modules.mailModule.MessageTypeEnum
   * @model instanceClass="com.ms.qaTools.saturn.modules.mailModule.MessageTypeEnum"
   *        extendedMetaData="name='MessageTypeEnum:Object' baseType='MessageTypeEnum'"
   * @generated
   */
  EDataType getMessageTypeEnumObject();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.modules.mailModule.RecipientTypeEnum <em>Recipient Type Enum Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Recipient Type Enum Object</em>'.
   * @see com.ms.qaTools.saturn.modules.mailModule.RecipientTypeEnum
   * @model instanceClass="com.ms.qaTools.saturn.modules.mailModule.RecipientTypeEnum"
   *        extendedMetaData="name='RecipientTypeEnum:Object' baseType='RecipientTypeEnum'"
   * @generated
   */
  EDataType getRecipientTypeEnumObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MailModuleFactory getMailModuleFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.mailModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mailModule.impl.DocumentRootImpl
     * @see com.ms.qaTools.saturn.modules.mailModule.impl.MailModulePackageImpl#getDocumentRoot()
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
     * The meta object literal for the '<em><b>Mail Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DOCUMENT_ROOT__MAIL_CONFIGURATION  = eINSTANCE.getDocumentRoot_MailConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.mailModule.impl.MailConfigurationImpl <em>Mail Configuration</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mailModule.impl.MailConfigurationImpl
     * @see com.ms.qaTools.saturn.modules.mailModule.impl.MailModulePackageImpl#getMailConfiguration()
     * @generated
     */
    EClass     MAIL_CONFIGURATION                 = eINSTANCE.getMailConfiguration();

    /**
     * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIL_CONFIGURATION__SUBJECT        = eINSTANCE.getMailConfiguration_Subject();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIL_CONFIGURATION__MESSAGE        = eINSTANCE.getMailConfiguration_Message();

    /**
     * The meta object literal for the '<em><b>Attachments</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference MAIL_CONFIGURATION__ATTACHMENTS    = eINSTANCE.getMailConfiguration_Attachments();

    /**
     * The meta object literal for the '<em><b>Recipients</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference MAIL_CONFIGURATION__RECIPIENTS     = eINSTANCE.getMailConfiguration_Recipients();

    /**
     * The meta object literal for the '<em><b>Attach As Link</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MAIL_CONFIGURATION__ATTACH_AS_LINK = eINSTANCE.getMailConfiguration_AttachAsLink();

    /**
     * The meta object literal for the '<em><b>Message Type</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MAIL_CONFIGURATION__MESSAGE_TYPE   = eINSTANCE.getMailConfiguration_MessageType();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.mailModule.impl.MailRecipientImpl <em>Mail Recipient</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mailModule.impl.MailRecipientImpl
     * @see com.ms.qaTools.saturn.modules.mailModule.impl.MailModulePackageImpl#getMailRecipient()
     * @generated
     */
    EClass     MAIL_RECIPIENT                     = eINSTANCE.getMailRecipient();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MAIL_RECIPIENT__TYPE               = eINSTANCE.getMailRecipient_Type();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.mailModule.MessageTypeEnum <em>Message Type Enum</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mailModule.MessageTypeEnum
     * @see com.ms.qaTools.saturn.modules.mailModule.impl.MailModulePackageImpl#getMessageTypeEnum()
     * @generated
     */
    EEnum      MESSAGE_TYPE_ENUM                  = eINSTANCE.getMessageTypeEnum();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.mailModule.RecipientTypeEnum <em>Recipient Type Enum</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mailModule.RecipientTypeEnum
     * @see com.ms.qaTools.saturn.modules.mailModule.impl.MailModulePackageImpl#getRecipientTypeEnum()
     * @generated
     */
    EEnum      RECIPIENT_TYPE_ENUM                = eINSTANCE.getRecipientTypeEnum();

    /**
     * The meta object literal for the '<em>Message Type Enum Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mailModule.MessageTypeEnum
     * @see com.ms.qaTools.saturn.modules.mailModule.impl.MailModulePackageImpl#getMessageTypeEnumObject()
     * @generated
     */
    EDataType  MESSAGE_TYPE_ENUM_OBJECT           = eINSTANCE.getMessageTypeEnumObject();

    /**
     * The meta object literal for the '<em>Recipient Type Enum Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mailModule.RecipientTypeEnum
     * @see com.ms.qaTools.saturn.modules.mailModule.impl.MailModulePackageImpl#getRecipientTypeEnumObject()
     * @generated
     */
    EDataType  RECIPIENT_TYPE_ENUM_OBJECT         = eINSTANCE.getRecipientTypeEnumObject();

  }

} // MailModulePackage
