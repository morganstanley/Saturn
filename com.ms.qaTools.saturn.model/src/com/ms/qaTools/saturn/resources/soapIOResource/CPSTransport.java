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

import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>CPS Transport</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getTransport <em>Transport</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getTopic <em>Topic</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getFilter <em>Filter</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getNamespaceDefinition <em>Namespace Definition</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getCpsMessageType <em>Cps Message Type</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getJarLocation <em>Jar Location</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getClassName <em>Class Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getSubscribe <em>Subscribe</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getCPSTransport()
 * @model extendedMetaData="name='CPSTransport' kind='elementOnly'"
 * @generated
 */
public interface CPSTransport extends AbstractTransport
{
  /**
   * Returns the value of the '<em><b>Transport</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transport</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transport</em>' containment reference.
   * @see #setTransport(AbstractTransport)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getCPSTransport_Transport()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Transport' namespace='##targetNamespace'"
   * @generated
   */
  AbstractTransport getTransport();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getTransport <em>Transport</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Transport</em>' containment reference.
   * @see #getTransport()
   * @generated
   */
  void setTransport(AbstractTransport value);

  /**
   * Returns the value of the '<em><b>Topic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Topic</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Topic</em>' containment reference.
   * @see #setTopic(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getCPSTransport_Topic()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Topic' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getTopic();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getTopic <em>Topic</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Topic</em>' containment reference.
   * @see #getTopic()
   * @generated
   */
  void setTopic(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter</em>' containment reference.
   * @see #setFilter(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getCPSTransport_Filter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Filter' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getFilter();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getFilter <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' containment reference.
   * @see #getFilter()
   * @generated
   */
  void setFilter(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Namespace Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namespace Definition</em>' containment reference isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespace Definition</em>' containment reference.
   * @see #setNamespaceDefinition(ResourceDefinition)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getCPSTransport_NamespaceDefinition()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='NamespaceDefinition' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getNamespaceDefinition();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getNamespaceDefinition <em>Namespace Definition</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Namespace Definition</em>' containment reference.
   * @see #getNamespaceDefinition()
   * @generated
   */
  void setNamespaceDefinition(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Cps Message Type</b></em>' attribute.
   * The literals are from the enumeration {@link com.ms.qaTools.saturn.resources.soapIOResource.CpsMessageTypes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cps Message Type</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cps Message Type</em>' attribute.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.CpsMessageTypes
   * @see #isSetCpsMessageType()
   * @see #unsetCpsMessageType()
   * @see #setCpsMessageType(CpsMessageTypes)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getCPSTransport_CpsMessageType()
   * @model unsettable="true"
   *        extendedMetaData="kind='element' name='CpsMessageType' namespace='##targetNamespace'"
   * @generated
   */
  CpsMessageTypes getCpsMessageType();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getCpsMessageType <em>Cps Message Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Cps Message Type</em>' attribute.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.CpsMessageTypes
   * @see #isSetCpsMessageType()
   * @see #unsetCpsMessageType()
   * @see #getCpsMessageType()
   * @generated
   */
  void setCpsMessageType(CpsMessageTypes value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getCpsMessageType <em>Cps Message Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetCpsMessageType()
   * @see #getCpsMessageType()
   * @see #setCpsMessageType(CpsMessageTypes)
   * @generated
   */
  void unsetCpsMessageType();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getCpsMessageType <em>Cps Message Type</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Cps Message Type</em>' attribute is set.
   * @see #unsetCpsMessageType()
   * @see #getCpsMessageType()
   * @see #setCpsMessageType(CpsMessageTypes)
   * @generated
   */
  boolean isSetCpsMessageType();

  /**
   * Returns the value of the '<em><b>Jar Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Jar Location</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Jar Location</em>' containment reference.
   * @see #setJarLocation(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getCPSTransport_JarLocation()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='jarLocation' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getJarLocation();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getJarLocation <em>Jar Location</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Jar Location</em>' containment reference.
   * @see #getJarLocation()
   * @generated
   */
  void setJarLocation(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Class Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Name</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Name</em>' containment reference.
   * @see #setClassName(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getCPSTransport_ClassName()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='className' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getClassName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getClassName <em>Class Name</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Name</em>' containment reference.
   * @see #getClassName()
   * @generated
   */
  void setClassName(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Subscribe</b></em>' attribute. The default value is <code>"NONE"</code>. The
   * literals are from the enumeration {@link com.ms.qaTools.saturn.resources.soapIOResource.SubscribeEnums}. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subscribe</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Subscribe</em>' attribute.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SubscribeEnums
   * @see #isSetSubscribe()
   * @see #unsetSubscribe()
   * @see #setSubscribe(SubscribeEnums)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getCPSTransport_Subscribe()
   * @model default="NONE" unsettable="true" extendedMetaData="kind='attribute' name='subscribe'"
   * @generated
   */
  SubscribeEnums getSubscribe();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getSubscribe <em>Subscribe</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Subscribe</em>' attribute.
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SubscribeEnums
   * @see #isSetSubscribe()
   * @see #unsetSubscribe()
   * @see #getSubscribe()
   * @generated
   */
  void setSubscribe(SubscribeEnums value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getSubscribe <em>Subscribe</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetSubscribe()
   * @see #getSubscribe()
   * @see #setSubscribe(SubscribeEnums)
   * @generated
   */
  void unsetSubscribe();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport#getSubscribe <em>Subscribe</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Subscribe</em>' attribute is set.
   * @see #unsetSubscribe()
   * @see #getSubscribe()
   * @see #setSubscribe(SubscribeEnums)
   * @generated
   */
  boolean isSetSubscribe();

} // CPSTransport
