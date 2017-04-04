/**
 * COPYRIGHT NOTICE AND DISCLAIMER
 *  
 * Copyright © 2009, Contributor
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License, version 3 for more details.
 * You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
 * THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
 */
package com.ms.qaTools.saturn.resources.soapIOResource;

import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>HTTP Transport</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#getUrl <em>Url</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#getProxyUrl <em>Proxy Url</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#getUserId <em>User Id</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#getPassword <em>Password</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#isForwardSMSession <em>Forward SM Session</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#isDisableChunkedEncoding <em>Disable Chunked Encoding</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#getAuthenticationMethod <em>Authentication Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getHTTPTransport()
 * @model extendedMetaData="name='HTTPTransport' kind='elementOnly'"
 * @generated
 */
public interface HTTPTransport extends AbstractTransport
{
  /**
   * Returns the value of the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' containment reference.
   * @see #setUrl(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getHTTPTransport_Url()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Url' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getUrl();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#getUrl <em>Url</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' containment reference.
   * @see #getUrl()
   * @generated
   */
  void setUrl(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Proxy Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Proxy Url</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proxy Url</em>' containment reference.
   * @see #setProxyUrl(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getHTTPTransport_ProxyUrl()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='ProxyUrl' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getProxyUrl();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#getProxyUrl <em>Proxy Url</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Proxy Url</em>' containment reference.
   * @see #getProxyUrl()
   * @generated
   */
  void setProxyUrl(ComplexValue value);

  /**
   * Returns the value of the '<em><b>User Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>User Id</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>User Id</em>' containment reference.
   * @see #setUserId(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getHTTPTransport_UserId()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='UserId' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getUserId();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#getUserId <em>User Id</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>User Id</em>' containment reference.
   * @see #getUserId()
   * @generated
   */
  void setUserId(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Password</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Password</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Password</em>' containment reference.
   * @see #setPassword(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getHTTPTransport_Password()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Password' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getPassword();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#getPassword <em>Password</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Password</em>' containment reference.
   * @see #getPassword()
   * @generated
   */
  void setPassword(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Forward SM Session</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forward SM Session</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forward SM Session</em>' attribute.
   * @see #isSetForwardSMSession()
   * @see #unsetForwardSMSession()
   * @see #setForwardSMSession(boolean)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getHTTPTransport_ForwardSMSession()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='forwardSMSession'"
   * @generated
   */
  boolean isForwardSMSession();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#isForwardSMSession <em>Forward SM Session</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forward SM Session</em>' attribute.
   * @see #isSetForwardSMSession()
   * @see #unsetForwardSMSession()
   * @see #isForwardSMSession()
   * @generated
   */
  void setForwardSMSession(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#isForwardSMSession <em>Forward SM Session</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetForwardSMSession()
   * @see #isForwardSMSession()
   * @see #setForwardSMSession(boolean)
   * @generated
   */
  void unsetForwardSMSession();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#isForwardSMSession <em>Forward SM Session</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Forward SM Session</em>' attribute is set.
   * @see #unsetForwardSMSession()
   * @see #isForwardSMSession()
   * @see #setForwardSMSession(boolean)
   * @generated
   */
  boolean isSetForwardSMSession();

  /**
   * Returns the value of the '<em><b>Disable Chunked Encoding</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Disable Chunked Encoding</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Disable Chunked Encoding</em>' attribute.
   * @see #isSetDisableChunkedEncoding()
   * @see #unsetDisableChunkedEncoding()
   * @see #setDisableChunkedEncoding(boolean)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getHTTPTransport_DisableChunkedEncoding()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='disableChunkedEncoding'"
   * @generated
   */
  boolean isDisableChunkedEncoding();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#isDisableChunkedEncoding <em>Disable Chunked Encoding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Disable Chunked Encoding</em>' attribute.
   * @see #isSetDisableChunkedEncoding()
   * @see #unsetDisableChunkedEncoding()
   * @see #isDisableChunkedEncoding()
   * @generated
   */
  void setDisableChunkedEncoding(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#isDisableChunkedEncoding <em>Disable Chunked Encoding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetDisableChunkedEncoding()
   * @see #isDisableChunkedEncoding()
   * @see #setDisableChunkedEncoding(boolean)
   * @generated
   */
  void unsetDisableChunkedEncoding();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#isDisableChunkedEncoding <em>Disable Chunked Encoding</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Disable Chunked Encoding</em>' attribute is set.
   * @see #unsetDisableChunkedEncoding()
   * @see #isDisableChunkedEncoding()
   * @see #setDisableChunkedEncoding(boolean)
   * @generated
   */
  boolean isSetDisableChunkedEncoding();

  /**
   * Returns the value of the '<em><b>Authentication Method</b></em>' attribute.
   * The default value is <code>"NONE"</code>.
   * The literals are from the enumeration {@link com.ms.qaTools.saturn.resources.soapIOResource.AuthenticationMethod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Authentication Method</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Authentication Method</em>' attribute.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.AuthenticationMethod
   * @see #isSetAuthenticationMethod()
   * @see #unsetAuthenticationMethod()
   * @see #setAuthenticationMethod(AuthenticationMethod)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getHTTPTransport_AuthenticationMethod()
   * @model default="NONE" unsettable="true"
   *        extendedMetaData="kind='attribute' name='authenticationMethod'"
   * @generated
   */
  AuthenticationMethod getAuthenticationMethod();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#getAuthenticationMethod <em>Authentication Method</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Authentication Method</em>' attribute.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.AuthenticationMethod
   * @see #isSetAuthenticationMethod()
   * @see #unsetAuthenticationMethod()
   * @see #getAuthenticationMethod()
   * @generated
   */
  void setAuthenticationMethod(AuthenticationMethod value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#getAuthenticationMethod <em>Authentication Method</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAuthenticationMethod()
   * @see #getAuthenticationMethod()
   * @see #setAuthenticationMethod(AuthenticationMethod)
   * @generated
   */
  void unsetAuthenticationMethod();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport#getAuthenticationMethod <em>Authentication Method</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Authentication Method</em>' attribute is set.
   * @see #unsetAuthenticationMethod()
   * @see #getAuthenticationMethod()
   * @see #setAuthenticationMethod(AuthenticationMethod)
   * @generated
   */
  boolean isSetAuthenticationMethod();

} // HTTPTransport
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
