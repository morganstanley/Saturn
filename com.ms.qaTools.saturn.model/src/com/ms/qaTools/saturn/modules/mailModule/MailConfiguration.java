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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Mail Configuration</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.mailModule.MailConfiguration#getSubject <em>Subject</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mailModule.MailConfiguration#getMessage <em>Message</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mailModule.MailConfiguration#getAttachments <em>Attachments</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mailModule.MailConfiguration#getRecipients <em>Recipients</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mailModule.MailConfiguration#isAttachAsLink <em>Attach As Link</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mailModule.MailConfiguration#getMessageType <em>Message Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.modules.mailModule.MailModulePackage#getMailConfiguration()
 * @model annotation="http://www.ms.com/2006/pdsttools/xsd2perl basePackage='true' isa='Saturn::Script::AbstractStep'"
 *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib name='mail'"
 *        extendedMetaData="name='Configuration_._type' kind='elementOnly'"
 * @generated
 */
public interface MailConfiguration extends EObject
{
  /**
   * Returns the value of the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subject</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subject</em>' containment reference.
   * @see #setSubject(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.mailModule.MailModulePackage#getMailConfiguration_Subject()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Subject' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getSubject();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mailModule.MailConfiguration#getSubject <em>Subject</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Subject</em>' containment reference.
   * @see #getSubject()
   * @generated
   */
  void setSubject(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Message</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' containment reference.
   * @see #setMessage(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.mailModule.MailModulePackage#getMailConfiguration_Message()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Message' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getMessage();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mailModule.MailConfiguration#getMessage <em>Message</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' containment reference.
   * @see #getMessage()
   * @generated
   */
  void setMessage(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Attachments</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.types.ResourceDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attachments</em>' containment reference list isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attachments</em>' containment reference list.
   * @see com.ms.qaTools.saturn.modules.mailModule.MailModulePackage#getMailConfiguration_Attachments()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attachments' namespace='##targetNamespace'"
   * @generated
   */
  EList<ResourceDefinition> getAttachments();

  /**
   * Returns the value of the '<em><b>Recipients</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.modules.mailModule.MailRecipient}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recipients</em>' containment reference list isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recipients</em>' containment reference list.
   * @see com.ms.qaTools.saturn.modules.mailModule.MailModulePackage#getMailConfiguration_Recipients()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Recipients' namespace='##targetNamespace'"
   * @generated
   */
  EList<MailRecipient> getRecipients();

  /**
   * Returns the value of the '<em><b>Attach As Link</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attach As Link</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attach As Link</em>' attribute.
   * @see #isSetAttachAsLink()
   * @see #unsetAttachAsLink()
   * @see #setAttachAsLink(boolean)
   * @see com.ms.qaTools.saturn.modules.mailModule.MailModulePackage#getMailConfiguration_AttachAsLink()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='attachAsLink'"
   * @generated
   */
  boolean isAttachAsLink();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mailModule.MailConfiguration#isAttachAsLink <em>Attach As Link</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Attach As Link</em>' attribute.
   * @see #isSetAttachAsLink()
   * @see #unsetAttachAsLink()
   * @see #isAttachAsLink()
   * @generated
   */
  void setAttachAsLink(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.mailModule.MailConfiguration#isAttachAsLink <em>Attach As Link</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAttachAsLink()
   * @see #isAttachAsLink()
   * @see #setAttachAsLink(boolean)
   * @generated
   */
  void unsetAttachAsLink();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.mailModule.MailConfiguration#isAttachAsLink <em>Attach As Link</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Attach As Link</em>' attribute is set.
   * @see #unsetAttachAsLink()
   * @see #isAttachAsLink()
   * @see #setAttachAsLink(boolean)
   * @generated
   */
  boolean isSetAttachAsLink();

  /**
   * Returns the value of the '<em><b>Message Type</b></em>' attribute. The default value is <code>"TEXT"</code>. The
   * literals are from the enumeration {@link com.ms.qaTools.saturn.modules.mailModule.MessageTypeEnum}. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message Type</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Message Type</em>' attribute.
   * @see com.ms.qaTools.saturn.modules.mailModule.MessageTypeEnum
   * @see #isSetMessageType()
   * @see #unsetMessageType()
   * @see #setMessageType(MessageTypeEnum)
   * @see com.ms.qaTools.saturn.modules.mailModule.MailModulePackage#getMailConfiguration_MessageType()
   * @model default="TEXT" unsettable="true" extendedMetaData="kind='attribute' name='messageType'"
   * @generated
   */
  MessageTypeEnum getMessageType();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mailModule.MailConfiguration#getMessageType <em>Message Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Message Type</em>' attribute.
   * @see com.ms.qaTools.saturn.modules.mailModule.MessageTypeEnum
   * @see #isSetMessageType()
   * @see #unsetMessageType()
   * @see #getMessageType()
   * @generated
   */
  void setMessageType(MessageTypeEnum value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.mailModule.MailConfiguration#getMessageType <em>Message Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetMessageType()
   * @see #getMessageType()
   * @see #setMessageType(MessageTypeEnum)
   * @generated
   */
  void unsetMessageType();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.mailModule.MailConfiguration#getMessageType <em>Message Type</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Message Type</em>' attribute is set.
   * @see #unsetMessageType()
   * @see #getMessageType()
   * @see #setMessageType(MessageTypeEnum)
   * @generated
   */
  boolean isSetMessageType();

} // MailConfiguration
