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
package com.ms.qaTools.saturn.resources.soapIOResource;

import java.math.BigInteger;

import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>TCP Transport</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#getHostname <em>Hostname</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#getPort <em>Port</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#getHandshake <em>Handshake</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#getMaxRetries <em>Max Retries</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#getAuthenticationMethod <em>Authentication Method</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#isGzipSend <em>Gzip Send</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#isNagle <em>Nagle</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getTCPTransport()
 * @model extendedMetaData="name='TCPTransport' kind='elementOnly'"
 * @generated
 */
public interface TCPTransport extends AbstractTransport
{
  /**
   * Returns the value of the '<em><b>Hostname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hostname</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hostname</em>' containment reference.
   * @see #setHostname(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getTCPTransport_Hostname()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Hostname' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getHostname();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#getHostname <em>Hostname</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Hostname</em>' containment reference.
   * @see #getHostname()
   * @generated
   */
  void setHostname(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Port</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' containment reference.
   * @see #setPort(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getTCPTransport_Port()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Port' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getPort();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#getPort <em>Port</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' containment reference.
   * @see #getPort()
   * @generated
   */
  void setPort(ComplexValue value);

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
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getTCPTransport_AuthenticationMethod()
   * @model default="NONE" unsettable="true"
   *        extendedMetaData="kind='attribute' name='authenticationMethod'"
   * @generated
   */
  AuthenticationMethod getAuthenticationMethod();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#getAuthenticationMethod <em>Authentication Method</em>}' attribute.
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
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#getAuthenticationMethod <em>Authentication Method</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAuthenticationMethod()
   * @see #getAuthenticationMethod()
   * @see #setAuthenticationMethod(AuthenticationMethod)
   * @generated
   */
  void unsetAuthenticationMethod();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#getAuthenticationMethod <em>Authentication Method</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Authentication Method</em>' attribute is set.
   * @see #unsetAuthenticationMethod()
   * @see #getAuthenticationMethod()
   * @see #setAuthenticationMethod(AuthenticationMethod)
   * @generated
   */
  boolean isSetAuthenticationMethod();

  /**
   * Returns the value of the '<em><b>Gzip Send</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gzip Send</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Gzip Send</em>' attribute.
   * @see #isSetGzipSend()
   * @see #unsetGzipSend()
   * @see #setGzipSend(boolean)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getTCPTransport_GzipSend()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='gzipSend'"
   * @generated
   */
  boolean isGzipSend();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#isGzipSend <em>Gzip Send</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Gzip Send</em>' attribute.
   * @see #isSetGzipSend()
   * @see #unsetGzipSend()
   * @see #isGzipSend()
   * @generated
   */
  void setGzipSend(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#isGzipSend <em>Gzip Send</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetGzipSend()
   * @see #isGzipSend()
   * @see #setGzipSend(boolean)
   * @generated
   */
  void unsetGzipSend();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#isGzipSend <em>Gzip Send</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Gzip Send</em>' attribute is set.
   * @see #unsetGzipSend()
   * @see #isGzipSend()
   * @see #setGzipSend(boolean)
   * @generated
   */
  boolean isSetGzipSend();

  /**
   * Returns the value of the '<em><b>Handshake</b></em>' attribute. The default value is <code>"NONE"</code>. The
   * literals are from the enumeration {@link com.ms.qaTools.saturn.resources.soapIOResource.HandshakeEnums}. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Handshake</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Handshake</em>' attribute.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.HandshakeEnums
   * @see #isSetHandshake()
   * @see #unsetHandshake()
   * @see #setHandshake(HandshakeEnums)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getTCPTransport_Handshake()
   * @model default="NONE" unsettable="true" extendedMetaData="kind='attribute' name='handshake'"
   * @generated
   */
  HandshakeEnums getHandshake();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#getHandshake <em>Handshake</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Handshake</em>' attribute.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.HandshakeEnums
   * @see #isSetHandshake()
   * @see #unsetHandshake()
   * @see #getHandshake()
   * @generated
   */
  void setHandshake(HandshakeEnums value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#getHandshake <em>Handshake</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetHandshake()
   * @see #getHandshake()
   * @see #setHandshake(HandshakeEnums)
   * @generated
   */
  void unsetHandshake();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#getHandshake <em>Handshake</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Handshake</em>' attribute is set.
   * @see #unsetHandshake()
   * @see #getHandshake()
   * @see #setHandshake(HandshakeEnums)
   * @generated
   */
  boolean isSetHandshake();

  /**
   * Returns the value of the '<em><b>Max Retries</b></em>' attribute. The default value is <code>"0"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Retries</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Max Retries</em>' attribute.
   * @see #isSetMaxRetries()
   * @see #unsetMaxRetries()
   * @see #setMaxRetries(BigInteger)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getTCPTransport_MaxRetries()
   * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='maxRetries'"
   * @generated
   */
  BigInteger getMaxRetries();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#getMaxRetries <em>Max Retries</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Retries</em>' attribute.
   * @see #isSetMaxRetries()
   * @see #unsetMaxRetries()
   * @see #getMaxRetries()
   * @generated
   */
  void setMaxRetries(BigInteger value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#getMaxRetries <em>Max Retries</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetMaxRetries()
   * @see #getMaxRetries()
   * @see #setMaxRetries(BigInteger)
   * @generated
   */
  void unsetMaxRetries();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#getMaxRetries <em>Max Retries</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Max Retries</em>' attribute is set.
   * @see #unsetMaxRetries()
   * @see #getMaxRetries()
   * @see #setMaxRetries(BigInteger)
   * @generated
   */
  boolean isSetMaxRetries();

  /**
   * Returns the value of the '<em><b>Nagle</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nagle</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Nagle</em>' attribute.
   * @see #isSetNagle()
   * @see #unsetNagle()
   * @see #setNagle(boolean)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getTCPTransport_Nagle()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='nagle'"
   * @generated
   */
  boolean isNagle();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#isNagle <em>Nagle</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Nagle</em>' attribute.
   * @see #isSetNagle()
   * @see #unsetNagle()
   * @see #isNagle()
   * @generated
   */
  void setNagle(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#isNagle <em>Nagle</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetNagle()
   * @see #isNagle()
   * @see #setNagle(boolean)
   * @generated
   */
  void unsetNagle();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport#isNagle <em>Nagle</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Nagle</em>' attribute is set.
   * @see #unsetNagle()
   * @see #isNagle()
   * @see #setNagle(boolean)
   * @generated
   */
  boolean isSetNagle();

} // TCPTransport
