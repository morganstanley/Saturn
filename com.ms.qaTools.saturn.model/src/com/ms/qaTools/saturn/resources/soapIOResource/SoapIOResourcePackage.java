package com.ms.qaTools.saturn.resources.soapIOResource;

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
 * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourceFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface SoapIOResourcePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                eNAME                                  = "soapIOResource";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                eNS_URI                                = "http://www.ms.com/2007/Saturn/Resources/SoapIO";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                eNS_PREFIX                             = "soapIOResource";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  SoapIOResourcePackage eINSTANCE                              = com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.AbstractTransportImpl <em>Abstract Transport</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.AbstractTransportImpl
   * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getAbstractTransport()
   * @generated
   */
  int                   ABSTRACT_TRANSPORT                     = 0;

  /**
   * The feature id for the '<em><b>Asynchronous</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   ABSTRACT_TRANSPORT__ASYNCHRONOUS       = 0;

  /**
   * The number of structural features of the '<em>Abstract Transport</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   ABSTRACT_TRANSPORT_FEATURE_COUNT       = 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.CpsResourceImpl <em>Cps Resource</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.CpsResourceImpl
   * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getCpsResource()
   * @generated
   */
  int                   CPS_RESOURCE                           = 1;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   CPS_RESOURCE__ENABLED                  = TypesPackage.DEVICE_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   CPS_RESOURCE__STATE                    = TypesPackage.DEVICE_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   CPS_RESOURCE__CONNECTOR_PREFERENCE     = TypesPackage.DEVICE_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   CPS_RESOURCE__NAME                     = TypesPackage.DEVICE_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Initialize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CPS_RESOURCE__INITIALIZE = TypesPackage.DEVICE_RESOURCE_DEFINITION__INITIALIZE;

  /**
   * The feature id for the '<em><b>Is Inline</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CPS_RESOURCE__IS_INLINE = TypesPackage.DEVICE_RESOURCE_DEFINITION__IS_INLINE;

  /**
   * The feature id for the '<em><b>Time Out</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   CPS_RESOURCE__TIME_OUT                 = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Transport</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   CPS_RESOURCE__TRANSPORT                = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Cps Resource</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   CPS_RESOURCE_FEATURE_COUNT             = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.CPSTransportImpl <em>CPS Transport</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.CPSTransportImpl
   * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getCPSTransport()
   * @generated
   */
  int                   CPS_TRANSPORT                          = 2;

  /**
   * The feature id for the '<em><b>Asynchronous</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   CPS_TRANSPORT__ASYNCHRONOUS            = ABSTRACT_TRANSPORT__ASYNCHRONOUS;

  /**
   * The feature id for the '<em><b>Transport</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   CPS_TRANSPORT__TRANSPORT               = ABSTRACT_TRANSPORT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Topic</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   CPS_TRANSPORT__TOPIC                   = ABSTRACT_TRANSPORT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   CPS_TRANSPORT__FILTER                  = ABSTRACT_TRANSPORT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Namespace Definition</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   CPS_TRANSPORT__NAMESPACE_DEFINITION    = ABSTRACT_TRANSPORT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Cps Message Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   CPS_TRANSPORT__CPS_MESSAGE_TYPE        = ABSTRACT_TRANSPORT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Jar Location</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   CPS_TRANSPORT__JAR_LOCATION            = ABSTRACT_TRANSPORT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   CPS_TRANSPORT__CLASS_NAME              = ABSTRACT_TRANSPORT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Subscribe</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   CPS_TRANSPORT__SUBSCRIBE               = ABSTRACT_TRANSPORT_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>CPS Transport</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   CPS_TRANSPORT_FEATURE_COUNT            = ABSTRACT_TRANSPORT_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.HTTPTransportImpl <em>HTTP Transport</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.HTTPTransportImpl
   * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getHTTPTransport()
   * @generated
   */
  int                   HTTP_TRANSPORT                         = 3;

  /**
   * The feature id for the '<em><b>Asynchronous</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   HTTP_TRANSPORT__ASYNCHRONOUS           = ABSTRACT_TRANSPORT__ASYNCHRONOUS;

  /**
   * The feature id for the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_TRANSPORT__URL = ABSTRACT_TRANSPORT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Proxy Url</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   HTTP_TRANSPORT__PROXY_URL              = ABSTRACT_TRANSPORT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>User Id</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   HTTP_TRANSPORT__USER_ID                = ABSTRACT_TRANSPORT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Password</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   HTTP_TRANSPORT__PASSWORD               = ABSTRACT_TRANSPORT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Forward SM Session</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_TRANSPORT__FORWARD_SM_SESSION = ABSTRACT_TRANSPORT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Disable Chunked Encoding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_TRANSPORT__DISABLE_CHUNKED_ENCODING = ABSTRACT_TRANSPORT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Authentication Method</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   HTTP_TRANSPORT__AUTHENTICATION_METHOD  = ABSTRACT_TRANSPORT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>HTTP Transport</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   HTTP_TRANSPORT_FEATURE_COUNT           = ABSTRACT_TRANSPORT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.MQTransportImpl <em>MQ Transport</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.MQTransportImpl
   * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getMQTransport()
   * @generated
   */
  int                   MQ_TRANSPORT                           = 4;

  /**
   * The feature id for the '<em><b>Asynchronous</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   MQ_TRANSPORT__ASYNCHRONOUS             = ABSTRACT_TRANSPORT__ASYNCHRONOUS;

  /**
   * The feature id for the '<em><b>MQ Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   MQ_TRANSPORT__MQ_RESOURCE              = ABSTRACT_TRANSPORT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Request Queue</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   MQ_TRANSPORT__REQUEST_QUEUE            = ABSTRACT_TRANSPORT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Response Queue</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   MQ_TRANSPORT__RESPONSE_QUEUE           = ABSTRACT_TRANSPORT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Model QName</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   MQ_TRANSPORT__MODEL_QNAME              = ABSTRACT_TRANSPORT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Dynamic QName</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   MQ_TRANSPORT__DYNAMIC_QNAME            = ABSTRACT_TRANSPORT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Persistent</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   MQ_TRANSPORT__PERSISTENT               = ABSTRACT_TRANSPORT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Use Correl Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   MQ_TRANSPORT__USE_CORREL_ID            = ABSTRACT_TRANSPORT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>MQ Transport</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   MQ_TRANSPORT_FEATURE_COUNT             = ABSTRACT_TRANSPORT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.PTCPTransportImpl <em>PTCP Transport</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.PTCPTransportImpl
   * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getPTCPTransport()
   * @generated
   */
  int PTCP_TRANSPORT = 5;

  /**
   * The feature id for the '<em><b>Asynchronous</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTCP_TRANSPORT__ASYNCHRONOUS = ABSTRACT_TRANSPORT__ASYNCHRONOUS;

  /**
   * The feature id for the '<em><b>Hostname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTCP_TRANSPORT__HOSTNAME = ABSTRACT_TRANSPORT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Port</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTCP_TRANSPORT__PORT = ABSTRACT_TRANSPORT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Max Retries</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTCP_TRANSPORT__MAX_RETRIES = ABSTRACT_TRANSPORT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>PTCP Transport</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTCP_TRANSPORT_FEATURE_COUNT = ABSTRACT_TRANSPORT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourceImpl <em>Soap IO Resource</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourceImpl
   * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getSoapIOResource()
   * @generated
   */
  int                   SOAP_IO_RESOURCE                       = 6;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SOAP_IO_RESOURCE__ENABLED              = TypesPackage.DEVICE_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SOAP_IO_RESOURCE__STATE                = TypesPackage.DEVICE_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   SOAP_IO_RESOURCE__CONNECTOR_PREFERENCE = TypesPackage.DEVICE_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SOAP_IO_RESOURCE__NAME                 = TypesPackage.DEVICE_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Initialize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOAP_IO_RESOURCE__INITIALIZE = TypesPackage.DEVICE_RESOURCE_DEFINITION__INITIALIZE;

  /**
   * The feature id for the '<em><b>Is Inline</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOAP_IO_RESOURCE__IS_INLINE = TypesPackage.DEVICE_RESOURCE_DEFINITION__IS_INLINE;

  /**
   * The feature id for the '<em><b>Time Out</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   SOAP_IO_RESOURCE__TIME_OUT             = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Transport</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   SOAP_IO_RESOURCE__TRANSPORT            = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Soap IO Resource</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SOAP_IO_RESOURCE_FEATURE_COUNT         = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.TCPTransportImpl <em>TCP Transport</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.TCPTransportImpl
   * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getTCPTransport()
   * @generated
   */
  int                   TCP_TRANSPORT                          = 7;

  /**
   * The feature id for the '<em><b>Asynchronous</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   TCP_TRANSPORT__ASYNCHRONOUS            = ABSTRACT_TRANSPORT__ASYNCHRONOUS;

  /**
   * The feature id for the '<em><b>Hostname</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   TCP_TRANSPORT__HOSTNAME                = ABSTRACT_TRANSPORT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Port</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   TCP_TRANSPORT__PORT                    = ABSTRACT_TRANSPORT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Handshake</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   TCP_TRANSPORT__HANDSHAKE               = ABSTRACT_TRANSPORT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Max Retries</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   TCP_TRANSPORT__MAX_RETRIES             = ABSTRACT_TRANSPORT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Authentication Method</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   TCP_TRANSPORT__AUTHENTICATION_METHOD   = ABSTRACT_TRANSPORT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Gzip Send</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   TCP_TRANSPORT__GZIP_SEND               = ABSTRACT_TRANSPORT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Nagle</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   TCP_TRANSPORT__NAGLE                   = ABSTRACT_TRANSPORT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>TCP Transport</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   TCP_TRANSPORT_FEATURE_COUNT            = ABSTRACT_TRANSPORT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.soapIOResource.AuthenticationMethod <em>Authentication Method</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.soapIOResource.AuthenticationMethod
   * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getAuthenticationMethod()
   * @generated
   */
  int                   AUTHENTICATION_METHOD                  = 8;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.soapIOResource.CpsMessageTypes <em>Cps Message Types</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.soapIOResource.CpsMessageTypes
   * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getCpsMessageTypes()
   * @generated
   */
  int                   CPS_MESSAGE_TYPES                      = 9;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.soapIOResource.HandshakeEnums <em>Handshake Enums</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.soapIOResource.HandshakeEnums
   * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getHandshakeEnums()
   * @generated
   */
  int                   HANDSHAKE_ENUMS                        = 10;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.soapIOResource.SubscribeEnums <em>Subscribe Enums</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SubscribeEnums
   * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getSubscribeEnums()
   * @generated
   */
  int                   SUBSCRIBE_ENUMS                        = 11;

  /**
   * The meta object id for the '<em>Authentication Method Object</em>' data type.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.soapIOResource.AuthenticationMethod
   * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getAuthenticationMethodObject()
   * @generated
   */
  int                   AUTHENTICATION_METHOD_OBJECT           = 12;

  /**
   * The meta object id for the '<em>Cps Message Types Object</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see com.ms.qaTools.saturn.resources.soapIOResource.CpsMessageTypes
   * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getCpsMessageTypesObject()
   * @generated
   */
  int                   CPS_MESSAGE_TYPES_OBJECT               = 13;

  /**
   * The meta object id for the '<em>Handshake Enums Object</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see com.ms.qaTools.saturn.resources.soapIOResource.HandshakeEnums
   * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getHandshakeEnumsObject()
   * @generated
   */
  int                   HANDSHAKE_ENUMS_OBJECT                 = 14;

  /**
   * The meta object id for the '<em>Subscribe Enums Object</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SubscribeEnums
   * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getSubscribeEnumsObject()
   * @generated
   */
  int                   SUBSCRIBE_ENUMS_OBJECT                 = 15;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.soapIOResource.AbstractTransport <em>Abstract Transport</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Transport</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.AbstractTransport
   * @generated
   */
  EClass getAbstractTransport();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.soapIOResource.AbstractTransport#isAsynchronous <em>Asynchronous</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Asynchronous</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.AbstractTransport#isAsynchronous()
   * @see #getAbstractTransport()
   * @generated
   */
  EAttribute getAbstractTransport_Asynchronous();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.soapIOResource.CpsResource <em>Cps Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Cps Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.CpsResource
   * @generated
   */
  EClass getCpsResource();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.soapIOResource.CpsResource#getTimeOut <em>Time Out</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Time Out</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.CpsResource#getTimeOut()
   * @see #getCpsResource()
   * @generated
   */
  EReference getCpsResource_TimeOut();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.soapIOResource.CpsResource#getTransport <em>Transport</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Transport</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.CpsResource#getTransport()
   * @see #getCpsResource()
   * @generated
   */
  EReference getCpsResource_Transport();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport <em>CPS Transport</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>CPS Transport</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport
   * @generated
   */
  EClass getCPSTransport();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getTransport <em>Transport</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Transport</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getTransport()
   * @see #getCPSTransport()
   * @generated
   */
  EReference getCPSTransport_Transport();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getTopic <em>Topic</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Topic</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getTopic()
   * @see #getCPSTransport()
   * @generated
   */
  EReference getCPSTransport_Topic();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getFilter()
   * @see #getCPSTransport()
   * @generated
   */
  EReference getCPSTransport_Filter();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getNamespaceDefinition <em>Namespace Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Namespace Definition</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getNamespaceDefinition()
   * @see #getCPSTransport()
   * @generated
   */
  EReference getCPSTransport_NamespaceDefinition();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getCpsMessageType <em>Cps Message Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cps Message Type</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getCpsMessageType()
   * @see #getCPSTransport()
   * @generated
   */
  EAttribute getCPSTransport_CpsMessageType();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getJarLocation <em>Jar Location</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Jar Location</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getJarLocation()
   * @see #getCPSTransport()
   * @generated
   */
  EReference getCPSTransport_JarLocation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getClassName <em>Class Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Class Name</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getClassName()
   * @see #getCPSTransport()
   * @generated
   */
  EReference getCPSTransport_ClassName();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getSubscribe <em>Subscribe</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Subscribe</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getSubscribe()
   * @see #getCPSTransport()
   * @generated
   */
  EAttribute getCPSTransport_Subscribe();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport <em>HTTP Transport</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>HTTP Transport</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport
   * @generated
   */
  EClass getHTTPTransport();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Url</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#getUrl()
   * @see #getHTTPTransport()
   * @generated
   */
  EReference getHTTPTransport_Url();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#getProxyUrl <em>Proxy Url</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Proxy Url</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#getProxyUrl()
   * @see #getHTTPTransport()
   * @generated
   */
  EReference getHTTPTransport_ProxyUrl();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#getUserId <em>User Id</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>User Id</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#getUserId()
   * @see #getHTTPTransport()
   * @generated
   */
  EReference getHTTPTransport_UserId();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#getPassword <em>Password</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Password</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#getPassword()
   * @see #getHTTPTransport()
   * @generated
   */
  EReference getHTTPTransport_Password();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#isForwardSMSession <em>Forward SM Session</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Forward SM Session</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#isForwardSMSession()
   * @see #getHTTPTransport()
   * @generated
   */
  EAttribute getHTTPTransport_ForwardSMSession();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#isDisableChunkedEncoding <em>Disable Chunked Encoding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Disable Chunked Encoding</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#isDisableChunkedEncoding()
   * @see #getHTTPTransport()
   * @generated
   */
  EAttribute getHTTPTransport_DisableChunkedEncoding();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#getAuthenticationMethod <em>Authentication Method</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Authentication Method</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#getAuthenticationMethod()
   * @see #getHTTPTransport()
   * @generated
   */
  EAttribute getHTTPTransport_AuthenticationMethod();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.soapIOResource.MQTransport <em>MQ Transport</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>MQ Transport</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.MQTransport
   * @generated
   */
  EClass getMQTransport();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#getMQResource <em>MQ Resource</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>MQ Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#getMQResource()
   * @see #getMQTransport()
   * @generated
   */
  EReference getMQTransport_MQResource();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#getRequestQueue <em>Request Queue</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Request Queue</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#getRequestQueue()
   * @see #getMQTransport()
   * @generated
   */
  EReference getMQTransport_RequestQueue();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#getResponseQueue <em>Response Queue</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Response Queue</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#getResponseQueue()
   * @see #getMQTransport()
   * @generated
   */
  EReference getMQTransport_ResponseQueue();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#getModelQName <em>Model QName</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Model QName</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#getModelQName()
   * @see #getMQTransport()
   * @generated
   */
  EReference getMQTransport_ModelQName();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#getDynamicQName <em>Dynamic QName</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Dynamic QName</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#getDynamicQName()
   * @see #getMQTransport()
   * @generated
   */
  EReference getMQTransport_DynamicQName();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#isPersistent <em>Persistent</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Persistent</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#isPersistent()
   * @see #getMQTransport()
   * @generated
   */
  EAttribute getMQTransport_Persistent();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#isUseCorrelId <em>Use Correl Id</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Use Correl Id</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#isUseCorrelId()
   * @see #getMQTransport()
   * @generated
   */
  EAttribute getMQTransport_UseCorrelId();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.soapIOResource.PTCPTransport <em>PTCP Transport</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PTCP Transport</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.PTCPTransport
   * @generated
   */
  EClass getPTCPTransport();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.soapIOResource.PTCPTransport#getHostname <em>Hostname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hostname</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.PTCPTransport#getHostname()
   * @see #getPTCPTransport()
   * @generated
   */
  EReference getPTCPTransport_Hostname();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.soapIOResource.PTCPTransport#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Port</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.PTCPTransport#getPort()
   * @see #getPTCPTransport()
   * @generated
   */
  EReference getPTCPTransport_Port();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.soapIOResource.PTCPTransport#getMaxRetries <em>Max Retries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Retries</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.PTCPTransport#getMaxRetries()
   * @see #getPTCPTransport()
   * @generated
   */
  EAttribute getPTCPTransport_MaxRetries();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResource <em>Soap IO Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Soap IO Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResource
   * @generated
   */
  EClass getSoapIOResource();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResource#getTimeOut <em>Time Out</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Time Out</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResource#getTimeOut()
   * @see #getSoapIOResource()
   * @generated
   */
  EReference getSoapIOResource_TimeOut();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResource#getTransport <em>Transport</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Transport</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResource#getTransport()
   * @see #getSoapIOResource()
   * @generated
   */
  EReference getSoapIOResource_Transport();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport <em>TCP Transport</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>TCP Transport</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport
   * @generated
   */
  EClass getTCPTransport();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#getHostname <em>Hostname</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Hostname</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#getHostname()
   * @see #getTCPTransport()
   * @generated
   */
  EReference getTCPTransport_Hostname();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Port</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#getPort()
   * @see #getTCPTransport()
   * @generated
   */
  EReference getTCPTransport_Port();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#getAuthenticationMethod <em>Authentication Method</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Authentication Method</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#getAuthenticationMethod()
   * @see #getTCPTransport()
   * @generated
   */
  EAttribute getTCPTransport_AuthenticationMethod();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#isGzipSend <em>Gzip Send</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Gzip Send</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#isGzipSend()
   * @see #getTCPTransport()
   * @generated
   */
  EAttribute getTCPTransport_GzipSend();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#getHandshake <em>Handshake</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Handshake</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#getHandshake()
   * @see #getTCPTransport()
   * @generated
   */
  EAttribute getTCPTransport_Handshake();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#getMaxRetries <em>Max Retries</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Max Retries</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#getMaxRetries()
   * @see #getTCPTransport()
   * @generated
   */
  EAttribute getTCPTransport_MaxRetries();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#isNagle <em>Nagle</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nagle</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#isNagle()
   * @see #getTCPTransport()
   * @generated
   */
  EAttribute getTCPTransport_Nagle();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.resources.soapIOResource.AuthenticationMethod <em>Authentication Method</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Authentication Method</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.AuthenticationMethod
   * @generated
   */
  EEnum getAuthenticationMethod();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.resources.soapIOResource.CpsMessageTypes <em>Cps Message Types</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Cps Message Types</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.CpsMessageTypes
   * @generated
   */
  EEnum getCpsMessageTypes();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.resources.soapIOResource.HandshakeEnums <em>Handshake Enums</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Handshake Enums</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.HandshakeEnums
   * @generated
   */
  EEnum getHandshakeEnums();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.resources.soapIOResource.SubscribeEnums <em>Subscribe Enums</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Subscribe Enums</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SubscribeEnums
   * @generated
   */
  EEnum getSubscribeEnums();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.resources.soapIOResource.AuthenticationMethod <em>Authentication Method Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Authentication Method Object</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.AuthenticationMethod
   * @model instanceClass="com.ms.qaTools.saturn.resources.soapIOResource.AuthenticationMethod"
   *        extendedMetaData="name='AuthenticationMethod:Object' baseType='AuthenticationMethod'"
   * @generated
   */
  EDataType getAuthenticationMethodObject();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.resources.soapIOResource.CpsMessageTypes <em>Cps Message Types Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Cps Message Types Object</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.CpsMessageTypes
   * @model instanceClass="com.ms.qaTools.saturn.resources.soapIOResource.CpsMessageTypes"
   *        extendedMetaData="name='CpsMessageTypes:Object' baseType='CpsMessageTypes'"
   * @generated
   */
  EDataType getCpsMessageTypesObject();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.resources.soapIOResource.HandshakeEnums <em>Handshake Enums Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Handshake Enums Object</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.HandshakeEnums
   * @model instanceClass="com.ms.qaTools.saturn.resources.soapIOResource.HandshakeEnums"
   *        extendedMetaData="name='HandshakeEnums:Object' baseType='HandshakeEnums'"
   * @generated
   */
  EDataType getHandshakeEnumsObject();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.resources.soapIOResource.SubscribeEnums <em>Subscribe Enums Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Subscribe Enums Object</em>'.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SubscribeEnums
   * @model instanceClass="com.ms.qaTools.saturn.resources.soapIOResource.SubscribeEnums"
   *        extendedMetaData="name='SubscribeEnums:Object' baseType='SubscribeEnums'"
   * @generated
   */
  EDataType getSubscribeEnumsObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SoapIOResourceFactory getSoapIOResourceFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.AbstractTransportImpl <em>Abstract Transport</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.AbstractTransportImpl
     * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getAbstractTransport()
     * @generated
     */
    EClass     ABSTRACT_TRANSPORT                    = eINSTANCE.getAbstractTransport();

    /**
     * The meta object literal for the '<em><b>Asynchronous</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_TRANSPORT__ASYNCHRONOUS      = eINSTANCE.getAbstractTransport_Asynchronous();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.CpsResourceImpl <em>Cps Resource</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.CpsResourceImpl
     * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getCpsResource()
     * @generated
     */
    EClass     CPS_RESOURCE                          = eINSTANCE.getCpsResource();

    /**
     * The meta object literal for the '<em><b>Time Out</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CPS_RESOURCE__TIME_OUT                = eINSTANCE.getCpsResource_TimeOut();

    /**
     * The meta object literal for the '<em><b>Transport</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference CPS_RESOURCE__TRANSPORT               = eINSTANCE.getCpsResource_Transport();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.CPSTransportImpl <em>CPS Transport</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.CPSTransportImpl
     * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getCPSTransport()
     * @generated
     */
    EClass     CPS_TRANSPORT                         = eINSTANCE.getCPSTransport();

    /**
     * The meta object literal for the '<em><b>Transport</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference CPS_TRANSPORT__TRANSPORT              = eINSTANCE.getCPSTransport_Transport();

    /**
     * The meta object literal for the '<em><b>Topic</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CPS_TRANSPORT__TOPIC                  = eINSTANCE.getCPSTransport_Topic();

    /**
     * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CPS_TRANSPORT__FILTER                 = eINSTANCE.getCPSTransport_Filter();

    /**
     * The meta object literal for the '<em><b>Namespace Definition</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference CPS_TRANSPORT__NAMESPACE_DEFINITION   = eINSTANCE.getCPSTransport_NamespaceDefinition();

    /**
     * The meta object literal for the '<em><b>Cps Message Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CPS_TRANSPORT__CPS_MESSAGE_TYPE       = eINSTANCE.getCPSTransport_CpsMessageType();

    /**
     * The meta object literal for the '<em><b>Jar Location</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference CPS_TRANSPORT__JAR_LOCATION           = eINSTANCE.getCPSTransport_JarLocation();

    /**
     * The meta object literal for the '<em><b>Class Name</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference CPS_TRANSPORT__CLASS_NAME             = eINSTANCE.getCPSTransport_ClassName();

    /**
     * The meta object literal for the '<em><b>Subscribe</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute CPS_TRANSPORT__SUBSCRIBE              = eINSTANCE.getCPSTransport_Subscribe();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.HTTPTransportImpl <em>HTTP Transport</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.HTTPTransportImpl
     * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getHTTPTransport()
     * @generated
     */
    EClass     HTTP_TRANSPORT                        = eINSTANCE.getHTTPTransport();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HTTP_TRANSPORT__URL = eINSTANCE.getHTTPTransport_Url();

    /**
     * The meta object literal for the '<em><b>Proxy Url</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference HTTP_TRANSPORT__PROXY_URL             = eINSTANCE.getHTTPTransport_ProxyUrl();

    /**
     * The meta object literal for the '<em><b>User Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HTTP_TRANSPORT__USER_ID               = eINSTANCE.getHTTPTransport_UserId();

    /**
     * The meta object literal for the '<em><b>Password</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HTTP_TRANSPORT__PASSWORD              = eINSTANCE.getHTTPTransport_Password();

    /**
     * The meta object literal for the '<em><b>Forward SM Session</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HTTP_TRANSPORT__FORWARD_SM_SESSION = eINSTANCE.getHTTPTransport_ForwardSMSession();

    /**
     * The meta object literal for the '<em><b>Disable Chunked Encoding</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HTTP_TRANSPORT__DISABLE_CHUNKED_ENCODING = eINSTANCE.getHTTPTransport_DisableChunkedEncoding();

    /**
     * The meta object literal for the '<em><b>Authentication Method</b></em>' attribute feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EAttribute HTTP_TRANSPORT__AUTHENTICATION_METHOD = eINSTANCE.getHTTPTransport_AuthenticationMethod();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.MQTransportImpl <em>MQ Transport</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.MQTransportImpl
     * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getMQTransport()
     * @generated
     */
    EClass     MQ_TRANSPORT                          = eINSTANCE.getMQTransport();

    /**
     * The meta object literal for the '<em><b>MQ Resource</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference MQ_TRANSPORT__MQ_RESOURCE             = eINSTANCE.getMQTransport_MQResource();

    /**
     * The meta object literal for the '<em><b>Request Queue</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference MQ_TRANSPORT__REQUEST_QUEUE           = eINSTANCE.getMQTransport_RequestQueue();

    /**
     * The meta object literal for the '<em><b>Response Queue</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference MQ_TRANSPORT__RESPONSE_QUEUE          = eINSTANCE.getMQTransport_ResponseQueue();

    /**
     * The meta object literal for the '<em><b>Model QName</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference MQ_TRANSPORT__MODEL_QNAME             = eINSTANCE.getMQTransport_ModelQName();

    /**
     * The meta object literal for the '<em><b>Dynamic QName</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference MQ_TRANSPORT__DYNAMIC_QNAME           = eINSTANCE.getMQTransport_DynamicQName();

    /**
     * The meta object literal for the '<em><b>Persistent</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MQ_TRANSPORT__PERSISTENT              = eINSTANCE.getMQTransport_Persistent();

    /**
     * The meta object literal for the '<em><b>Use Correl Id</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MQ_TRANSPORT__USE_CORREL_ID           = eINSTANCE.getMQTransport_UseCorrelId();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.PTCPTransportImpl <em>PTCP Transport</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.PTCPTransportImpl
     * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getPTCPTransport()
     * @generated
     */
    EClass PTCP_TRANSPORT = eINSTANCE.getPTCPTransport();

    /**
     * The meta object literal for the '<em><b>Hostname</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PTCP_TRANSPORT__HOSTNAME = eINSTANCE.getPTCPTransport_Hostname();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PTCP_TRANSPORT__PORT = eINSTANCE.getPTCPTransport_Port();

    /**
     * The meta object literal for the '<em><b>Max Retries</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PTCP_TRANSPORT__MAX_RETRIES = eINSTANCE.getPTCPTransport_MaxRetries();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourceImpl <em>Soap IO Resource</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourceImpl
     * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getSoapIOResource()
     * @generated
     */
    EClass     SOAP_IO_RESOURCE                      = eINSTANCE.getSoapIOResource();

    /**
     * The meta object literal for the '<em><b>Time Out</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOAP_IO_RESOURCE__TIME_OUT            = eINSTANCE.getSoapIOResource_TimeOut();

    /**
     * The meta object literal for the '<em><b>Transport</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference SOAP_IO_RESOURCE__TRANSPORT           = eINSTANCE.getSoapIOResource_Transport();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.TCPTransportImpl <em>TCP Transport</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.TCPTransportImpl
     * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getTCPTransport()
     * @generated
     */
    EClass     TCP_TRANSPORT                         = eINSTANCE.getTCPTransport();

    /**
     * The meta object literal for the '<em><b>Hostname</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TCP_TRANSPORT__HOSTNAME               = eINSTANCE.getTCPTransport_Hostname();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TCP_TRANSPORT__PORT                   = eINSTANCE.getTCPTransport_Port();

    /**
     * The meta object literal for the '<em><b>Authentication Method</b></em>' attribute feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EAttribute TCP_TRANSPORT__AUTHENTICATION_METHOD  = eINSTANCE.getTCPTransport_AuthenticationMethod();

    /**
     * The meta object literal for the '<em><b>Gzip Send</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute TCP_TRANSPORT__GZIP_SEND              = eINSTANCE.getTCPTransport_GzipSend();

    /**
     * The meta object literal for the '<em><b>Handshake</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute TCP_TRANSPORT__HANDSHAKE              = eINSTANCE.getTCPTransport_Handshake();

    /**
     * The meta object literal for the '<em><b>Max Retries</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute TCP_TRANSPORT__MAX_RETRIES            = eINSTANCE.getTCPTransport_MaxRetries();

    /**
     * The meta object literal for the '<em><b>Nagle</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute TCP_TRANSPORT__NAGLE                  = eINSTANCE.getTCPTransport_Nagle();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.soapIOResource.AuthenticationMethod <em>Authentication Method</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.soapIOResource.AuthenticationMethod
     * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getAuthenticationMethod()
     * @generated
     */
    EEnum      AUTHENTICATION_METHOD                 = eINSTANCE.getAuthenticationMethod();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.soapIOResource.CpsMessageTypes <em>Cps Message Types</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.soapIOResource.CpsMessageTypes
     * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getCpsMessageTypes()
     * @generated
     */
    EEnum      CPS_MESSAGE_TYPES                     = eINSTANCE.getCpsMessageTypes();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.soapIOResource.HandshakeEnums <em>Handshake Enums</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.soapIOResource.HandshakeEnums
     * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getHandshakeEnums()
     * @generated
     */
    EEnum      HANDSHAKE_ENUMS                       = eINSTANCE.getHandshakeEnums();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.soapIOResource.SubscribeEnums <em>Subscribe Enums</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.soapIOResource.SubscribeEnums
     * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getSubscribeEnums()
     * @generated
     */
    EEnum      SUBSCRIBE_ENUMS                       = eINSTANCE.getSubscribeEnums();

    /**
     * The meta object literal for the '<em>Authentication Method Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.soapIOResource.AuthenticationMethod
     * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getAuthenticationMethodObject()
     * @generated
     */
    EDataType  AUTHENTICATION_METHOD_OBJECT          = eINSTANCE.getAuthenticationMethodObject();

    /**
     * The meta object literal for the '<em>Cps Message Types Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.soapIOResource.CpsMessageTypes
     * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getCpsMessageTypesObject()
     * @generated
     */
    EDataType  CPS_MESSAGE_TYPES_OBJECT              = eINSTANCE.getCpsMessageTypesObject();

    /**
     * The meta object literal for the '<em>Handshake Enums Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.soapIOResource.HandshakeEnums
     * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getHandshakeEnumsObject()
     * @generated
     */
    EDataType  HANDSHAKE_ENUMS_OBJECT                = eINSTANCE.getHandshakeEnumsObject();

    /**
     * The meta object literal for the '<em>Subscribe Enums Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.soapIOResource.SubscribeEnums
     * @see com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl#getSubscribeEnumsObject()
     * @generated
     */
    EDataType  SUBSCRIBE_ENUMS_OBJECT                = eINSTANCE.getSubscribeEnumsObject();

  }

} // SoapIOResourcePackage
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
