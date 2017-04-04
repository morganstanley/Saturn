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
package com.ms.qaTools.saturn.listeners.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ms.qaTools.saturn.listeners.ListenersPackage;
import com.ms.qaTools.saturn.listeners.MailConfiguration;
import com.ms.qaTools.saturn.listeners.MailRecipient;
import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Mail Configuration</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.listeners.impl.MailConfigurationImpl#getSubject <em>Subject</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.listeners.impl.MailConfigurationImpl#getMessage <em>Message</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.listeners.impl.MailConfigurationImpl#getAttachments <em>Attachments</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.listeners.impl.MailConfigurationImpl#getRecipients <em>Recipients</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.listeners.impl.MailConfigurationImpl#isAttachAsLink <em>Attach As Link</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MailConfigurationImpl extends EObjectImpl implements MailConfiguration
{
  /**
   * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubject()
   * @generated
   * @ordered
   */
  protected ComplexValue              subject;

  /**
   * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
  protected ComplexValue              message;

  /**
   * The cached value of the '{@link #getAttachments() <em>Attachments</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getAttachments()
   * @generated
   * @ordered
   */
  protected EList<ResourceDefinition> attachments;

  /**
   * The cached value of the '{@link #getRecipients() <em>Recipients</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getRecipients()
   * @generated
   * @ordered
   */
  protected EList<MailRecipient>      recipients;

  /**
   * The default value of the '{@link #isAttachAsLink() <em>Attach As Link</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAttachAsLink()
   * @generated
   * @ordered
   */
  protected static final boolean      ATTACH_AS_LINK_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAttachAsLink() <em>Attach As Link</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isAttachAsLink()
   * @generated
   * @ordered
   */
  protected boolean                   attachAsLink            = ATTACH_AS_LINK_EDEFAULT;

  /**
   * This is true if the Attach As Link attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                   attachAsLinkESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected MailConfigurationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ListenersPackage.Literals.MAIL_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getSubject()
  {
    return subject;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubject(ComplexValue newSubject, NotificationChain msgs)
  {
    ComplexValue oldSubject = subject;
    subject = newSubject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ListenersPackage.MAIL_CONFIGURATION__SUBJECT, oldSubject, newSubject);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSubject(ComplexValue newSubject)
  {
    if (newSubject != subject)
    {
      NotificationChain msgs = null;
      if (subject != null)
        msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ListenersPackage.MAIL_CONFIGURATION__SUBJECT, null, msgs);
      if (newSubject != null)
        msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ListenersPackage.MAIL_CONFIGURATION__SUBJECT, null, msgs);
      msgs = basicSetSubject(newSubject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ListenersPackage.MAIL_CONFIGURATION__SUBJECT, newSubject, newSubject));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getMessage()
  {
    return message;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMessage(ComplexValue newMessage, NotificationChain msgs)
  {
    ComplexValue oldMessage = message;
    message = newMessage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ListenersPackage.MAIL_CONFIGURATION__MESSAGE, oldMessage, newMessage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setMessage(ComplexValue newMessage)
  {
    if (newMessage != message)
    {
      NotificationChain msgs = null;
      if (message != null)
        msgs = ((InternalEObject)message).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ListenersPackage.MAIL_CONFIGURATION__MESSAGE, null, msgs);
      if (newMessage != null)
        msgs = ((InternalEObject)newMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ListenersPackage.MAIL_CONFIGURATION__MESSAGE, null, msgs);
      msgs = basicSetMessage(newMessage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ListenersPackage.MAIL_CONFIGURATION__MESSAGE, newMessage, newMessage));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<ResourceDefinition> getAttachments()
  {
    if (attachments == null)
    {
      attachments = new EObjectContainmentEList<ResourceDefinition>(ResourceDefinition.class, this, ListenersPackage.MAIL_CONFIGURATION__ATTACHMENTS);
    }
    return attachments;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<MailRecipient> getRecipients()
  {
    if (recipients == null)
    {
      recipients = new EObjectContainmentEList<MailRecipient>(MailRecipient.class, this, ListenersPackage.MAIL_CONFIGURATION__RECIPIENTS);
    }
    return recipients;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isAttachAsLink()
  {
    return attachAsLink;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setAttachAsLink(boolean newAttachAsLink)
  {
    boolean oldAttachAsLink = attachAsLink;
    attachAsLink = newAttachAsLink;
    boolean oldAttachAsLinkESet = attachAsLinkESet;
    attachAsLinkESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ListenersPackage.MAIL_CONFIGURATION__ATTACH_AS_LINK, oldAttachAsLink, attachAsLink, !oldAttachAsLinkESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetAttachAsLink()
  {
    boolean oldAttachAsLink = attachAsLink;
    boolean oldAttachAsLinkESet = attachAsLinkESet;
    attachAsLink = ATTACH_AS_LINK_EDEFAULT;
    attachAsLinkESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ListenersPackage.MAIL_CONFIGURATION__ATTACH_AS_LINK, oldAttachAsLink, ATTACH_AS_LINK_EDEFAULT, oldAttachAsLinkESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetAttachAsLink()
  {
    return attachAsLinkESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ListenersPackage.MAIL_CONFIGURATION__SUBJECT:
        return basicSetSubject(null, msgs);
      case ListenersPackage.MAIL_CONFIGURATION__MESSAGE:
        return basicSetMessage(null, msgs);
      case ListenersPackage.MAIL_CONFIGURATION__ATTACHMENTS:
        return ((InternalEList<?>)getAttachments()).basicRemove(otherEnd, msgs);
      case ListenersPackage.MAIL_CONFIGURATION__RECIPIENTS:
        return ((InternalEList<?>)getRecipients()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ListenersPackage.MAIL_CONFIGURATION__SUBJECT:
        return getSubject();
      case ListenersPackage.MAIL_CONFIGURATION__MESSAGE:
        return getMessage();
      case ListenersPackage.MAIL_CONFIGURATION__ATTACHMENTS:
        return getAttachments();
      case ListenersPackage.MAIL_CONFIGURATION__RECIPIENTS:
        return getRecipients();
      case ListenersPackage.MAIL_CONFIGURATION__ATTACH_AS_LINK:
        return isAttachAsLink();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ListenersPackage.MAIL_CONFIGURATION__SUBJECT:
        setSubject((ComplexValue)newValue);
        return;
      case ListenersPackage.MAIL_CONFIGURATION__MESSAGE:
        setMessage((ComplexValue)newValue);
        return;
      case ListenersPackage.MAIL_CONFIGURATION__ATTACHMENTS:
        getAttachments().clear();
        getAttachments().addAll((Collection<? extends ResourceDefinition>)newValue);
        return;
      case ListenersPackage.MAIL_CONFIGURATION__RECIPIENTS:
        getRecipients().clear();
        getRecipients().addAll((Collection<? extends MailRecipient>)newValue);
        return;
      case ListenersPackage.MAIL_CONFIGURATION__ATTACH_AS_LINK:
        setAttachAsLink((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ListenersPackage.MAIL_CONFIGURATION__SUBJECT:
        setSubject((ComplexValue)null);
        return;
      case ListenersPackage.MAIL_CONFIGURATION__MESSAGE:
        setMessage((ComplexValue)null);
        return;
      case ListenersPackage.MAIL_CONFIGURATION__ATTACHMENTS:
        getAttachments().clear();
        return;
      case ListenersPackage.MAIL_CONFIGURATION__RECIPIENTS:
        getRecipients().clear();
        return;
      case ListenersPackage.MAIL_CONFIGURATION__ATTACH_AS_LINK:
        unsetAttachAsLink();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ListenersPackage.MAIL_CONFIGURATION__SUBJECT:
        return subject != null;
      case ListenersPackage.MAIL_CONFIGURATION__MESSAGE:
        return message != null;
      case ListenersPackage.MAIL_CONFIGURATION__ATTACHMENTS:
        return attachments != null && !attachments.isEmpty();
      case ListenersPackage.MAIL_CONFIGURATION__RECIPIENTS:
        return recipients != null && !recipients.isEmpty();
      case ListenersPackage.MAIL_CONFIGURATION__ATTACH_AS_LINK:
        return isSetAttachAsLink();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (attachAsLink: ");
    if (attachAsLinkESet) result.append(attachAsLink); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // MailConfigurationImpl
