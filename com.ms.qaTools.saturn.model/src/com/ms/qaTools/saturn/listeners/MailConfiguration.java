package com.ms.qaTools.saturn.listeners;

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
 * <li>{@link com.ms.qaTools.saturn.listeners.MailConfiguration#getSubject <em>Subject</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.listeners.MailConfiguration#getMessage <em>Message</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.listeners.MailConfiguration#getAttachments <em>Attachments</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.listeners.MailConfiguration#getRecipients <em>Recipients</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.listeners.MailConfiguration#isAttachAsLink <em>Attach As Link</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.listeners.ListenersPackage#getMailConfiguration()
 * @model extendedMetaData="name='MailConfiguration' kind='elementOnly'"
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
   * @see com.ms.qaTools.saturn.listeners.ListenersPackage#getMailConfiguration_Subject()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Subject' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getSubject();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.listeners.MailConfiguration#getSubject <em>Subject</em>}' containment reference.
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
   * @see com.ms.qaTools.saturn.listeners.ListenersPackage#getMailConfiguration_Message()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Message' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getMessage();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.listeners.MailConfiguration#getMessage <em>Message</em>}' containment reference.
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
   * @see com.ms.qaTools.saturn.listeners.ListenersPackage#getMailConfiguration_Attachments()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attachments' namespace='##targetNamespace'"
   * @generated
   */
  EList<ResourceDefinition> getAttachments();

  /**
   * Returns the value of the '<em><b>Recipients</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.listeners.MailRecipient}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recipients</em>' containment reference list isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recipients</em>' containment reference list.
   * @see com.ms.qaTools.saturn.listeners.ListenersPackage#getMailConfiguration_Recipients()
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
   * @see com.ms.qaTools.saturn.listeners.ListenersPackage#getMailConfiguration_AttachAsLink()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='attachAsLink'"
   * @generated
   */
  boolean isAttachAsLink();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.listeners.MailConfiguration#isAttachAsLink <em>Attach As Link</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Attach As Link</em>' attribute.
   * @see #isSetAttachAsLink()
   * @see #unsetAttachAsLink()
   * @see #isAttachAsLink()
   * @generated
   */
  void setAttachAsLink(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.listeners.MailConfiguration#isAttachAsLink <em>Attach As Link</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAttachAsLink()
   * @see #isAttachAsLink()
   * @see #setAttachAsLink(boolean)
   * @generated
   */
  void unsetAttachAsLink();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.listeners.MailConfiguration#isAttachAsLink <em>Attach As Link</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Attach As Link</em>' attribute is set.
   * @see #unsetAttachAsLink()
   * @see #isAttachAsLink()
   * @see #setAttachAsLink(boolean)
   * @generated
   */
  boolean isSetAttachAsLink();

} // MailConfiguration
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
