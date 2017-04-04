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
package com.ms.qaTools.saturn.modules.soapIOModule;

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
 * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOModuleFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface SoapIOModulePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String              eNAME                                        = "soapIOModule";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String              eNS_URI                                      = "http://www.ms.com/2007/Saturn/Modules/SoapIO";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String              eNS_PREFIX                                   = "soapIOModule";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  SoapIOModulePackage eINSTANCE                                    = com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOModulePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.AbstractSoapIOOperationImpl <em>Abstract Soap IO Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.AbstractSoapIOOperationImpl
   * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOModulePackageImpl#getAbstractSoapIOOperation()
   * @generated
   */
  int                 ABSTRACT_SOAP_IO_OPERATION                   = 0;

  /**
   * The feature id for the '<em><b>Request Id</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 ABSTRACT_SOAP_IO_OPERATION__REQUEST_ID       = 0;

  /**
   * The feature id for the '<em><b>Time Out</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 ABSTRACT_SOAP_IO_OPERATION__TIME_OUT         = 1;

  /**
   * The number of structural features of the '<em>Abstract Soap IO Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 ABSTRACT_SOAP_IO_OPERATION_FEATURE_COUNT     = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.AbstractTerminationConditionImpl <em>Abstract Termination Condition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.AbstractTerminationConditionImpl
   * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOModulePackageImpl#getAbstractTerminationCondition()
   * @generated
   */
  int                 ABSTRACT_TERMINATION_CONDITION               = 1;

  /**
   * The number of structural features of the '<em>Abstract Termination Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 ABSTRACT_TERMINATION_CONDITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.DocumentRootImpl
   * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOModulePackageImpl#getDocumentRoot()
   * @generated
   */
  int                 DOCUMENT_ROOT                                = 2;

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
   * The feature id for the '<em><b>Soap IO Configuration</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DOCUMENT_ROOT__SOAP_IO_CONFIGURATION         = 3;

  /**
   * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 DOCUMENT_ROOT_FEATURE_COUNT                  = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.PerlTerminationConditionImpl <em>Perl Termination Condition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.PerlTerminationConditionImpl
   * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOModulePackageImpl#getPerlTerminationCondition()
   * @generated
   */
  int                 PERL_TERMINATION_CONDITION                   = 3;

  /**
   * The feature id for the '<em><b>Perl Code</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 PERL_TERMINATION_CONDITION__PERL_CODE        = ABSTRACT_TERMINATION_CONDITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Perl Termination Condition</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 PERL_TERMINATION_CONDITION_FEATURE_COUNT     = ABSTRACT_TERMINATION_CONDITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOConfigurationImpl <em>Soap IO Configuration</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOConfigurationImpl
   * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOModulePackageImpl#getSoapIOConfiguration()
   * @generated
   */
  int                 SOAP_IO_CONFIGURATION                        = 4;

  /**
   * The feature id for the '<em><b>Soap IO Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SOAP_IO_CONFIGURATION__SOAP_IO_RESOURCE      = 0;

  /**
   * The feature id for the '<em><b>Operation</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 SOAP_IO_CONFIGURATION__OPERATION             = 1;

  /**
   * The number of structural features of the '<em>Soap IO Configuration</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SOAP_IO_CONFIGURATION_FEATURE_COUNT          = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOGetOperationImpl <em>Soap IO Get Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOGetOperationImpl
   * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOModulePackageImpl#getSoapIOGetOperation()
   * @generated
   */
  int                 SOAP_IO_GET_OPERATION                        = 5;

  /**
   * The feature id for the '<em><b>Request Id</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SOAP_IO_GET_OPERATION__REQUEST_ID            = ABSTRACT_SOAP_IO_OPERATION__REQUEST_ID;

  /**
   * The feature id for the '<em><b>Time Out</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 SOAP_IO_GET_OPERATION__TIME_OUT              = ABSTRACT_SOAP_IO_OPERATION__TIME_OUT;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 SOAP_IO_GET_OPERATION__OUTPUT                = ABSTRACT_SOAP_IO_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Termination Condition</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SOAP_IO_GET_OPERATION__TERMINATION_CONDITION = ABSTRACT_SOAP_IO_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Extract Body</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SOAP_IO_GET_OPERATION__EXTRACT_BODY          = ABSTRACT_SOAP_IO_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Max Retries</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SOAP_IO_GET_OPERATION__MAX_RETRIES           = ABSTRACT_SOAP_IO_OPERATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Soap IO Get Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SOAP_IO_GET_OPERATION_FEATURE_COUNT          = ABSTRACT_SOAP_IO_OPERATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOPutAndGetOperationImpl <em>Soap IO Put And Get Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOPutAndGetOperationImpl
   * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOModulePackageImpl#getSoapIOPutAndGetOperation()
   * @generated
   */
  int                 SOAP_IO_PUT_AND_GET_OPERATION                = 6;

  /**
   * The feature id for the '<em><b>Request Id</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SOAP_IO_PUT_AND_GET_OPERATION__REQUEST_ID    = ABSTRACT_SOAP_IO_OPERATION__REQUEST_ID;

  /**
   * The feature id for the '<em><b>Time Out</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 SOAP_IO_PUT_AND_GET_OPERATION__TIME_OUT      = ABSTRACT_SOAP_IO_OPERATION__TIME_OUT;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 SOAP_IO_PUT_AND_GET_OPERATION__ACTION        = ABSTRACT_SOAP_IO_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 SOAP_IO_PUT_AND_GET_OPERATION__NAMESPACE     = ABSTRACT_SOAP_IO_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SOAP_IO_PUT_AND_GET_OPERATION__INPUT         = ABSTRACT_SOAP_IO_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 SOAP_IO_PUT_AND_GET_OPERATION__OUTPUT        = ABSTRACT_SOAP_IO_OPERATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Message</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 SOAP_IO_PUT_AND_GET_OPERATION__MESSAGE       = ABSTRACT_SOAP_IO_OPERATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Message File</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SOAP_IO_PUT_AND_GET_OPERATION__MESSAGE_FILE  = ABSTRACT_SOAP_IO_OPERATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Out Dir</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 SOAP_IO_PUT_AND_GET_OPERATION__OUT_DIR       = ABSTRACT_SOAP_IO_OPERATION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Out File</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 SOAP_IO_PUT_AND_GET_OPERATION__OUT_FILE      = ABSTRACT_SOAP_IO_OPERATION_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Soap IO Put And Get Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SOAP_IO_PUT_AND_GET_OPERATION_FEATURE_COUNT  = ABSTRACT_SOAP_IO_OPERATION_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOPutOperationImpl <em>Soap IO Put Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOPutOperationImpl
   * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOModulePackageImpl#getSoapIOPutOperation()
   * @generated
   */
  int                 SOAP_IO_PUT_OPERATION                        = 7;

  /**
   * The feature id for the '<em><b>Request Id</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SOAP_IO_PUT_OPERATION__REQUEST_ID            = ABSTRACT_SOAP_IO_OPERATION__REQUEST_ID;

  /**
   * The feature id for the '<em><b>Time Out</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 SOAP_IO_PUT_OPERATION__TIME_OUT              = ABSTRACT_SOAP_IO_OPERATION__TIME_OUT;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 SOAP_IO_PUT_OPERATION__ACTION                = ABSTRACT_SOAP_IO_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 SOAP_IO_PUT_OPERATION__NAMESPACE             = ABSTRACT_SOAP_IO_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SOAP_IO_PUT_OPERATION__INPUT                 = ABSTRACT_SOAP_IO_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Message</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 SOAP_IO_PUT_OPERATION__MESSAGE               = ABSTRACT_SOAP_IO_OPERATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Message File</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SOAP_IO_PUT_OPERATION__MESSAGE_FILE          = ABSTRACT_SOAP_IO_OPERATION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Soap IO Put Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SOAP_IO_PUT_OPERATION_FEATURE_COUNT          = ABSTRACT_SOAP_IO_OPERATION_FEATURE_COUNT + 5;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.soapIOModule.AbstractSoapIOOperation <em>Abstract Soap IO Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Soap IO Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.AbstractSoapIOOperation
   * @generated
   */
  EClass getAbstractSoapIOOperation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.soapIOModule.AbstractSoapIOOperation#getRequestId <em>Request Id</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Request Id</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.AbstractSoapIOOperation#getRequestId()
   * @see #getAbstractSoapIOOperation()
   * @generated
   */
  EReference getAbstractSoapIOOperation_RequestId();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.soapIOModule.AbstractSoapIOOperation#getTimeOut <em>Time Out</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Time Out</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.AbstractSoapIOOperation#getTimeOut()
   * @see #getAbstractSoapIOOperation()
   * @generated
   */
  EReference getAbstractSoapIOOperation_TimeOut();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.soapIOModule.AbstractTerminationCondition <em>Abstract Termination Condition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Termination Condition</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.AbstractTerminationCondition
   * @generated
   */
  EClass getAbstractTerminationCondition();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.soapIOModule.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.ms.qaTools.saturn.modules.soapIOModule.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '
   * {@link com.ms.qaTools.saturn.modules.soapIOModule.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.soapIOModule.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.soapIOModule.DocumentRoot#getSoapIOConfiguration <em>Soap IO Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Soap IO Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.DocumentRoot#getSoapIOConfiguration()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_SoapIOConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.soapIOModule.PerlTerminationCondition <em>Perl Termination Condition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Perl Termination Condition</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.PerlTerminationCondition
   * @generated
   */
  EClass getPerlTerminationCondition();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.soapIOModule.PerlTerminationCondition#getPerlCode <em>Perl Code</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Perl Code</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.PerlTerminationCondition#getPerlCode()
   * @see #getPerlTerminationCondition()
   * @generated
   */
  EReference getPerlTerminationCondition_PerlCode();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOConfiguration <em>Soap IO Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Soap IO Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOConfiguration
   * @generated
   */
  EClass getSoapIOConfiguration();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOConfiguration#getSoapIOResource <em>Soap IO Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Soap IO Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOConfiguration#getSoapIOResource()
   * @see #getSoapIOConfiguration()
   * @generated
   */
  EReference getSoapIOConfiguration_SoapIOResource();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOConfiguration#getOperation <em>Operation</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOConfiguration#getOperation()
   * @see #getSoapIOConfiguration()
   * @generated
   */
  EReference getSoapIOConfiguration_Operation();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOGetOperation <em>Soap IO Get Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Soap IO Get Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOGetOperation
   * @generated
   */
  EClass getSoapIOGetOperation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOGetOperation#getOutput <em>Output</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Output</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOGetOperation#getOutput()
   * @see #getSoapIOGetOperation()
   * @generated
   */
  EReference getSoapIOGetOperation_Output();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOGetOperation#getTerminationCondition <em>Termination Condition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Termination Condition</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOGetOperation#getTerminationCondition()
   * @see #getSoapIOGetOperation()
   * @generated
   */
  EReference getSoapIOGetOperation_TerminationCondition();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOGetOperation#isExtractBody <em>Extract Body</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Extract Body</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOGetOperation#isExtractBody()
   * @see #getSoapIOGetOperation()
   * @generated
   */
  EAttribute getSoapIOGetOperation_ExtractBody();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOGetOperation#getMaxRetries <em>Max Retries</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Max Retries</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOGetOperation#getMaxRetries()
   * @see #getSoapIOGetOperation()
   * @generated
   */
  EAttribute getSoapIOGetOperation_MaxRetries();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutAndGetOperation <em>Soap IO Put And Get Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Soap IO Put And Get Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutAndGetOperation
   * @generated
   */
  EClass getSoapIOPutAndGetOperation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutAndGetOperation#getAction <em>Action</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutAndGetOperation#getAction()
   * @see #getSoapIOPutAndGetOperation()
   * @generated
   */
  EReference getSoapIOPutAndGetOperation_Action();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutAndGetOperation#getNamespace <em>Namespace</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Namespace</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutAndGetOperation#getNamespace()
   * @see #getSoapIOPutAndGetOperation()
   * @generated
   */
  EReference getSoapIOPutAndGetOperation_Namespace();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutAndGetOperation#getInput <em>Input</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Input</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutAndGetOperation#getInput()
   * @see #getSoapIOPutAndGetOperation()
   * @generated
   */
  EReference getSoapIOPutAndGetOperation_Input();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutAndGetOperation#getOutput <em>Output</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Output</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutAndGetOperation#getOutput()
   * @see #getSoapIOPutAndGetOperation()
   * @generated
   */
  EReference getSoapIOPutAndGetOperation_Output();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutAndGetOperation#getMessage <em>Message</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Message</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutAndGetOperation#getMessage()
   * @see #getSoapIOPutAndGetOperation()
   * @generated
   */
  EReference getSoapIOPutAndGetOperation_Message();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutAndGetOperation#getMessageFile <em>Message File</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Message File</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutAndGetOperation#getMessageFile()
   * @see #getSoapIOPutAndGetOperation()
   * @generated
   */
  EReference getSoapIOPutAndGetOperation_MessageFile();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutAndGetOperation#getOutDir <em>Out Dir</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Out Dir</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutAndGetOperation#getOutDir()
   * @see #getSoapIOPutAndGetOperation()
   * @generated
   */
  EReference getSoapIOPutAndGetOperation_OutDir();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutAndGetOperation#getOutFile <em>Out File</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Out File</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutAndGetOperation#getOutFile()
   * @see #getSoapIOPutAndGetOperation()
   * @generated
   */
  EReference getSoapIOPutAndGetOperation_OutFile();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutOperation <em>Soap IO Put Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Soap IO Put Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutOperation
   * @generated
   */
  EClass getSoapIOPutOperation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutOperation#getAction <em>Action</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutOperation#getAction()
   * @see #getSoapIOPutOperation()
   * @generated
   */
  EReference getSoapIOPutOperation_Action();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutOperation#getNamespace <em>Namespace</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Namespace</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutOperation#getNamespace()
   * @see #getSoapIOPutOperation()
   * @generated
   */
  EReference getSoapIOPutOperation_Namespace();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutOperation#getInput <em>Input</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutOperation#getInput()
   * @see #getSoapIOPutOperation()
   * @generated
   */
  EReference getSoapIOPutOperation_Input();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutOperation#getMessage <em>Message</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Message</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutOperation#getMessage()
   * @see #getSoapIOPutOperation()
   * @generated
   */
  EReference getSoapIOPutOperation_Message();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutOperation#getMessageFile <em>Message File</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Message File</em>'.
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutOperation#getMessageFile()
   * @see #getSoapIOPutOperation()
   * @generated
   */
  EReference getSoapIOPutOperation_MessageFile();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SoapIOModuleFactory getSoapIOModuleFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.AbstractSoapIOOperationImpl <em>Abstract Soap IO Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.AbstractSoapIOOperationImpl
     * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOModulePackageImpl#getAbstractSoapIOOperation()
     * @generated
     */
    EClass     ABSTRACT_SOAP_IO_OPERATION                   = eINSTANCE.getAbstractSoapIOOperation();

    /**
     * The meta object literal for the '<em><b>Request Id</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_SOAP_IO_OPERATION__REQUEST_ID       = eINSTANCE.getAbstractSoapIOOperation_RequestId();

    /**
     * The meta object literal for the '<em><b>Time Out</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_SOAP_IO_OPERATION__TIME_OUT         = eINSTANCE.getAbstractSoapIOOperation_TimeOut();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.AbstractTerminationConditionImpl <em>Abstract Termination Condition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.AbstractTerminationConditionImpl
     * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOModulePackageImpl#getAbstractTerminationCondition()
     * @generated
     */
    EClass     ABSTRACT_TERMINATION_CONDITION               = eINSTANCE.getAbstractTerminationCondition();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.DocumentRootImpl
     * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOModulePackageImpl#getDocumentRoot()
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
     * The meta object literal for the '<em><b>Soap IO Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DOCUMENT_ROOT__SOAP_IO_CONFIGURATION         = eINSTANCE.getDocumentRoot_SoapIOConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.PerlTerminationConditionImpl <em>Perl Termination Condition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.PerlTerminationConditionImpl
     * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOModulePackageImpl#getPerlTerminationCondition()
     * @generated
     */
    EClass     PERL_TERMINATION_CONDITION                   = eINSTANCE.getPerlTerminationCondition();

    /**
     * The meta object literal for the '<em><b>Perl Code</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference PERL_TERMINATION_CONDITION__PERL_CODE        = eINSTANCE.getPerlTerminationCondition_PerlCode();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOConfigurationImpl <em>Soap IO Configuration</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOConfigurationImpl
     * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOModulePackageImpl#getSoapIOConfiguration()
     * @generated
     */
    EClass     SOAP_IO_CONFIGURATION                        = eINSTANCE.getSoapIOConfiguration();

    /**
     * The meta object literal for the '<em><b>Soap IO Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference SOAP_IO_CONFIGURATION__SOAP_IO_RESOURCE      = eINSTANCE.getSoapIOConfiguration_SoapIOResource();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference SOAP_IO_CONFIGURATION__OPERATION             = eINSTANCE.getSoapIOConfiguration_Operation();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOGetOperationImpl <em>Soap IO Get Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOGetOperationImpl
     * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOModulePackageImpl#getSoapIOGetOperation()
     * @generated
     */
    EClass     SOAP_IO_GET_OPERATION                        = eINSTANCE.getSoapIOGetOperation();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOAP_IO_GET_OPERATION__OUTPUT                = eINSTANCE.getSoapIOGetOperation_Output();

    /**
     * The meta object literal for the '<em><b>Termination Condition</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference SOAP_IO_GET_OPERATION__TERMINATION_CONDITION = eINSTANCE.getSoapIOGetOperation_TerminationCondition();

    /**
     * The meta object literal for the '<em><b>Extract Body</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SOAP_IO_GET_OPERATION__EXTRACT_BODY          = eINSTANCE.getSoapIOGetOperation_ExtractBody();

    /**
     * The meta object literal for the '<em><b>Max Retries</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SOAP_IO_GET_OPERATION__MAX_RETRIES           = eINSTANCE.getSoapIOGetOperation_MaxRetries();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOPutAndGetOperationImpl <em>Soap IO Put And Get Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOPutAndGetOperationImpl
     * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOModulePackageImpl#getSoapIOPutAndGetOperation()
     * @generated
     */
    EClass     SOAP_IO_PUT_AND_GET_OPERATION                = eINSTANCE.getSoapIOPutAndGetOperation();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOAP_IO_PUT_AND_GET_OPERATION__ACTION        = eINSTANCE.getSoapIOPutAndGetOperation_Action();

    /**
     * The meta object literal for the '<em><b>Namespace</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference SOAP_IO_PUT_AND_GET_OPERATION__NAMESPACE     = eINSTANCE.getSoapIOPutAndGetOperation_Namespace();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOAP_IO_PUT_AND_GET_OPERATION__INPUT         = eINSTANCE.getSoapIOPutAndGetOperation_Input();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOAP_IO_PUT_AND_GET_OPERATION__OUTPUT        = eINSTANCE.getSoapIOPutAndGetOperation_Output();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOAP_IO_PUT_AND_GET_OPERATION__MESSAGE       = eINSTANCE.getSoapIOPutAndGetOperation_Message();

    /**
     * The meta object literal for the '<em><b>Message File</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference SOAP_IO_PUT_AND_GET_OPERATION__MESSAGE_FILE  = eINSTANCE.getSoapIOPutAndGetOperation_MessageFile();

    /**
     * The meta object literal for the '<em><b>Out Dir</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOAP_IO_PUT_AND_GET_OPERATION__OUT_DIR       = eINSTANCE.getSoapIOPutAndGetOperation_OutDir();

    /**
     * The meta object literal for the '<em><b>Out File</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOAP_IO_PUT_AND_GET_OPERATION__OUT_FILE      = eINSTANCE.getSoapIOPutAndGetOperation_OutFile();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOPutOperationImpl <em>Soap IO Put Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOPutOperationImpl
     * @see com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOModulePackageImpl#getSoapIOPutOperation()
     * @generated
     */
    EClass     SOAP_IO_PUT_OPERATION                        = eINSTANCE.getSoapIOPutOperation();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOAP_IO_PUT_OPERATION__ACTION                = eINSTANCE.getSoapIOPutOperation_Action();

    /**
     * The meta object literal for the '<em><b>Namespace</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference SOAP_IO_PUT_OPERATION__NAMESPACE             = eINSTANCE.getSoapIOPutOperation_Namespace();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOAP_IO_PUT_OPERATION__INPUT                 = eINSTANCE.getSoapIOPutOperation_Input();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOAP_IO_PUT_OPERATION__MESSAGE               = eINSTANCE.getSoapIOPutOperation_Message();

    /**
     * The meta object literal for the '<em><b>Message File</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference SOAP_IO_PUT_OPERATION__MESSAGE_FILE          = eINSTANCE.getSoapIOPutOperation_MessageFile();

  }

} // SoapIOModulePackage
