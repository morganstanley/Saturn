package com.ms.qaTools.saturn.resources.soapIOResource.impl;

import com.ms.qaTools.saturn.resources.soapIOResource.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.ms.qaTools.saturn.resources.soapIOResource.AuthenticationMethod;
import com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport;
import com.ms.qaTools.saturn.resources.soapIOResource.CpsMessageTypes;
import com.ms.qaTools.saturn.resources.soapIOResource.CpsResource;
import com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport;
import com.ms.qaTools.saturn.resources.soapIOResource.HandshakeEnums;
import com.ms.qaTools.saturn.resources.soapIOResource.MQTransport;
import com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResource;
import com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourceFactory;
import com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage;
import com.ms.qaTools.saturn.resources.soapIOResource.SubscribeEnums;
import com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class SoapIOResourceFactoryImpl extends EFactoryImpl implements SoapIOResourceFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static SoapIOResourceFactory init()
  {
    try
    {
      SoapIOResourceFactory theSoapIOResourceFactory = (SoapIOResourceFactory)EPackage.Registry.INSTANCE.getEFactory(SoapIOResourcePackage.eNS_URI);
      if (theSoapIOResourceFactory != null)
      {
        return theSoapIOResourceFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SoapIOResourceFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SoapIOResourceFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SoapIOResourcePackage.CPS_RESOURCE: return createCpsResource();
      case SoapIOResourcePackage.CPS_TRANSPORT: return createCPSTransport();
      case SoapIOResourcePackage.HTTP_TRANSPORT: return createHTTPTransport();
      case SoapIOResourcePackage.MQ_TRANSPORT: return createMQTransport();
      case SoapIOResourcePackage.PTCP_TRANSPORT: return createPTCPTransport();
      case SoapIOResourcePackage.SOAP_IO_RESOURCE: return createSoapIOResource();
      case SoapIOResourcePackage.TCP_TRANSPORT: return createTCPTransport();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SoapIOResourcePackage.AUTHENTICATION_METHOD:
        return createAuthenticationMethodFromString(eDataType, initialValue);
      case SoapIOResourcePackage.CPS_MESSAGE_TYPES:
        return createCpsMessageTypesFromString(eDataType, initialValue);
      case SoapIOResourcePackage.HANDSHAKE_ENUMS:
        return createHandshakeEnumsFromString(eDataType, initialValue);
      case SoapIOResourcePackage.SUBSCRIBE_ENUMS:
        return createSubscribeEnumsFromString(eDataType, initialValue);
      case SoapIOResourcePackage.AUTHENTICATION_METHOD_OBJECT:
        return createAuthenticationMethodObjectFromString(eDataType, initialValue);
      case SoapIOResourcePackage.CPS_MESSAGE_TYPES_OBJECT:
        return createCpsMessageTypesObjectFromString(eDataType, initialValue);
      case SoapIOResourcePackage.HANDSHAKE_ENUMS_OBJECT:
        return createHandshakeEnumsObjectFromString(eDataType, initialValue);
      case SoapIOResourcePackage.SUBSCRIBE_ENUMS_OBJECT:
        return createSubscribeEnumsObjectFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SoapIOResourcePackage.AUTHENTICATION_METHOD:
        return convertAuthenticationMethodToString(eDataType, instanceValue);
      case SoapIOResourcePackage.CPS_MESSAGE_TYPES:
        return convertCpsMessageTypesToString(eDataType, instanceValue);
      case SoapIOResourcePackage.HANDSHAKE_ENUMS:
        return convertHandshakeEnumsToString(eDataType, instanceValue);
      case SoapIOResourcePackage.SUBSCRIBE_ENUMS:
        return convertSubscribeEnumsToString(eDataType, instanceValue);
      case SoapIOResourcePackage.AUTHENTICATION_METHOD_OBJECT:
        return convertAuthenticationMethodObjectToString(eDataType, instanceValue);
      case SoapIOResourcePackage.CPS_MESSAGE_TYPES_OBJECT:
        return convertCpsMessageTypesObjectToString(eDataType, instanceValue);
      case SoapIOResourcePackage.HANDSHAKE_ENUMS_OBJECT:
        return convertHandshakeEnumsObjectToString(eDataType, instanceValue);
      case SoapIOResourcePackage.SUBSCRIBE_ENUMS_OBJECT:
        return convertSubscribeEnumsObjectToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CpsResource createCpsResource()
  {
    CpsResourceImpl cpsResource = new CpsResourceImpl();
    return cpsResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CPSTransport createCPSTransport()
  {
    CPSTransportImpl cpsTransport = new CPSTransportImpl();
    return cpsTransport;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public HTTPTransport createHTTPTransport()
  {
    HTTPTransportImpl httpTransport = new HTTPTransportImpl();
    return httpTransport;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MQTransport createMQTransport()
  {
    MQTransportImpl mqTransport = new MQTransportImpl();
    return mqTransport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PTCPTransport createPTCPTransport()
  {
    PTCPTransportImpl ptcpTransport = new PTCPTransportImpl();
    return ptcpTransport;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SoapIOResource createSoapIOResource()
  {
    SoapIOResourceImpl soapIOResource = new SoapIOResourceImpl();
    return soapIOResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TCPTransport createTCPTransport()
  {
    TCPTransportImpl tcpTransport = new TCPTransportImpl();
    return tcpTransport;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AuthenticationMethod createAuthenticationMethodFromString(EDataType eDataType, String initialValue)
  {
    AuthenticationMethod result = AuthenticationMethod.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertAuthenticationMethodToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CpsMessageTypes createCpsMessageTypesFromString(EDataType eDataType, String initialValue)
  {
    CpsMessageTypes result = CpsMessageTypes.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertCpsMessageTypesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public HandshakeEnums createHandshakeEnumsFromString(EDataType eDataType, String initialValue)
  {
    HandshakeEnums result = HandshakeEnums.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertHandshakeEnumsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SubscribeEnums createSubscribeEnumsFromString(EDataType eDataType, String initialValue)
  {
    SubscribeEnums result = SubscribeEnums.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertSubscribeEnumsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AuthenticationMethod createAuthenticationMethodObjectFromString(EDataType eDataType, String initialValue)
  {
    return createAuthenticationMethodFromString(SoapIOResourcePackage.Literals.AUTHENTICATION_METHOD, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertAuthenticationMethodObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertAuthenticationMethodToString(SoapIOResourcePackage.Literals.AUTHENTICATION_METHOD, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CpsMessageTypes createCpsMessageTypesObjectFromString(EDataType eDataType, String initialValue)
  {
    return createCpsMessageTypesFromString(SoapIOResourcePackage.Literals.CPS_MESSAGE_TYPES, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertCpsMessageTypesObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertCpsMessageTypesToString(SoapIOResourcePackage.Literals.CPS_MESSAGE_TYPES, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public HandshakeEnums createHandshakeEnumsObjectFromString(EDataType eDataType, String initialValue)
  {
    return createHandshakeEnumsFromString(SoapIOResourcePackage.Literals.HANDSHAKE_ENUMS, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertHandshakeEnumsObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertHandshakeEnumsToString(SoapIOResourcePackage.Literals.HANDSHAKE_ENUMS, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SubscribeEnums createSubscribeEnumsObjectFromString(EDataType eDataType, String initialValue)
  {
    return createSubscribeEnumsFromString(SoapIOResourcePackage.Literals.SUBSCRIBE_ENUMS, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertSubscribeEnumsObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertSubscribeEnumsToString(SoapIOResourcePackage.Literals.SUBSCRIBE_ENUMS, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SoapIOResourcePackage getSoapIOResourcePackage()
  {
    return (SoapIOResourcePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SoapIOResourcePackage getPackage()
  {
    return SoapIOResourcePackage.eINSTANCE;
  }

} // SoapIOResourceFactoryImpl
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
