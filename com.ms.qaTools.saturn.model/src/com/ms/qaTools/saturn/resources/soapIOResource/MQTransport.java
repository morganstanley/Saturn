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

import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>MQ Transport</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#getMQResource <em>MQ Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#getRequestQueue <em>Request Queue</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#getResponseQueue <em>Response Queue</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#getModelQName <em>Model QName</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#getDynamicQName <em>Dynamic QName</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#isUseCorrelId <em>Use Correl Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getMQTransport()
 * @model extendedMetaData="name='MQTransport' kind='elementOnly'"
 * @generated
 */
public interface MQTransport extends AbstractTransport
{
  /**
   * Returns the value of the '<em><b>MQ Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>MQ Resource</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>MQ Resource</em>' containment reference.
   * @see #setMQResource(ResourceDefinition)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getMQTransport_MQResource()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='MQResource' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getMQResource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#getMQResource <em>MQ Resource</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>MQ Resource</em>' containment reference.
   * @see #getMQResource()
   * @generated
   */
  void setMQResource(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Request Queue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Request Queue</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Request Queue</em>' containment reference.
   * @see #setRequestQueue(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getMQTransport_RequestQueue()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='RequestQueue' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getRequestQueue();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#getRequestQueue <em>Request Queue</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Request Queue</em>' containment reference.
   * @see #getRequestQueue()
   * @generated
   */
  void setRequestQueue(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Response Queue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Response Queue</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Response Queue</em>' containment reference.
   * @see #setResponseQueue(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getMQTransport_ResponseQueue()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='ResponseQueue' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getResponseQueue();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#getResponseQueue <em>Response Queue</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Response Queue</em>' containment reference.
   * @see #getResponseQueue()
   * @generated
   */
  void setResponseQueue(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Model QName</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model QName</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model QName</em>' containment reference.
   * @see #setModelQName(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getMQTransport_ModelQName()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='ModelQName' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getModelQName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#getModelQName <em>Model QName</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Model QName</em>' containment reference.
   * @see #getModelQName()
   * @generated
   */
  void setModelQName(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Dynamic QName</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dynamic QName</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dynamic QName</em>' containment reference.
   * @see #setDynamicQName(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getMQTransport_DynamicQName()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='DynamicQName' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getDynamicQName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#getDynamicQName <em>Dynamic QName</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Dynamic QName</em>' containment reference.
   * @see #getDynamicQName()
   * @generated
   */
  void setDynamicQName(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Persistent</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Persistent</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Persistent</em>' attribute.
   * @see #isSetPersistent()
   * @see #unsetPersistent()
   * @see #setPersistent(boolean)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getMQTransport_Persistent()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='persistent'"
   * @generated
   */
  boolean isPersistent();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#isPersistent <em>Persistent</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Persistent</em>' attribute.
   * @see #isSetPersistent()
   * @see #unsetPersistent()
   * @see #isPersistent()
   * @generated
   */
  void setPersistent(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#isPersistent <em>Persistent</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetPersistent()
   * @see #isPersistent()
   * @see #setPersistent(boolean)
   * @generated
   */
  void unsetPersistent();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#isPersistent <em>Persistent</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Persistent</em>' attribute is set.
   * @see #unsetPersistent()
   * @see #isPersistent()
   * @see #setPersistent(boolean)
   * @generated
   */
  boolean isSetPersistent();

  /**
   * Returns the value of the '<em><b>Use Correl Id</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Use Correl Id</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Use Correl Id</em>' attribute.
   * @see #isSetUseCorrelId()
   * @see #unsetUseCorrelId()
   * @see #setUseCorrelId(boolean)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getMQTransport_UseCorrelId()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='useCorrelId'"
   * @generated
   */
  boolean isUseCorrelId();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#isUseCorrelId <em>Use Correl Id</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Use Correl Id</em>' attribute.
   * @see #isSetUseCorrelId()
   * @see #unsetUseCorrelId()
   * @see #isUseCorrelId()
   * @generated
   */
  void setUseCorrelId(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#isUseCorrelId <em>Use Correl Id</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetUseCorrelId()
   * @see #isUseCorrelId()
   * @see #setUseCorrelId(boolean)
   * @generated
   */
  void unsetUseCorrelId();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.MQTransport#isUseCorrelId <em>Use Correl Id</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Use Correl Id</em>' attribute is set.
   * @see #unsetUseCorrelId()
   * @see #isUseCorrelId()
   * @see #setUseCorrelId(boolean)
   * @generated
   */
  boolean isSetUseCorrelId();

} // MQTransport
