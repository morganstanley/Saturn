package com.ms.qaTools.saturn.modules.soapIOModule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.modules.soapIOModule.SoapIOModulePackage;
import com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutOperation;
import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Soap IO Put Operation</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOPutOperationImpl#getAction <em>Action</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOPutOperationImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOPutOperationImpl#getInput <em>Input</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOPutOperationImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOPutOperationImpl#getMessageFile <em>Message File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoapIOPutOperationImpl extends AbstractSoapIOOperationImpl implements SoapIOPutOperation
{
  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected ComplexValue       action;

  /**
   * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespace()
   * @generated
   * @ordered
   */
  protected ComplexValue       namespace;

  /**
   * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected ResourceDefinition input;

  /**
   * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
  protected ComplexValue       message;

  /**
   * The cached value of the '{@link #getMessageFile() <em>Message File</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getMessageFile()
   * @generated
   * @ordered
   */
  protected ResourceDefinition messageFile;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected SoapIOPutOperationImpl()
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
    return SoapIOModulePackage.Literals.SOAP_IO_PUT_OPERATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAction(ComplexValue newAction, NotificationChain msgs)
  {
    ComplexValue oldAction = action;
    action = newAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOModulePackage.SOAP_IO_PUT_OPERATION__ACTION, oldAction, newAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setAction(ComplexValue newAction)
  {
    if (newAction != action)
    {
      NotificationChain msgs = null;
      if (action != null)
        msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOModulePackage.SOAP_IO_PUT_OPERATION__ACTION, null, msgs);
      if (newAction != null)
        msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOModulePackage.SOAP_IO_PUT_OPERATION__ACTION, null, msgs);
      msgs = basicSetAction(newAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOModulePackage.SOAP_IO_PUT_OPERATION__ACTION, newAction, newAction));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getNamespace()
  {
    return namespace;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamespace(ComplexValue newNamespace, NotificationChain msgs)
  {
    ComplexValue oldNamespace = namespace;
    namespace = newNamespace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOModulePackage.SOAP_IO_PUT_OPERATION__NAMESPACE, oldNamespace, newNamespace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setNamespace(ComplexValue newNamespace)
  {
    if (newNamespace != namespace)
    {
      NotificationChain msgs = null;
      if (namespace != null)
        msgs = ((InternalEObject)namespace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOModulePackage.SOAP_IO_PUT_OPERATION__NAMESPACE, null, msgs);
      if (newNamespace != null)
        msgs = ((InternalEObject)newNamespace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOModulePackage.SOAP_IO_PUT_OPERATION__NAMESPACE, null, msgs);
      msgs = basicSetNamespace(newNamespace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOModulePackage.SOAP_IO_PUT_OPERATION__NAMESPACE, newNamespace, newNamespace));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getInput()
  {
    return input;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInput(ResourceDefinition newInput, NotificationChain msgs)
  {
    ResourceDefinition oldInput = input;
    input = newInput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOModulePackage.SOAP_IO_PUT_OPERATION__INPUT, oldInput, newInput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setInput(ResourceDefinition newInput)
  {
    if (newInput != input)
    {
      NotificationChain msgs = null;
      if (input != null)
        msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOModulePackage.SOAP_IO_PUT_OPERATION__INPUT, null, msgs);
      if (newInput != null)
        msgs = ((InternalEObject)newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOModulePackage.SOAP_IO_PUT_OPERATION__INPUT, null, msgs);
      msgs = basicSetInput(newInput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOModulePackage.SOAP_IO_PUT_OPERATION__INPUT, newInput, newInput));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOModulePackage.SOAP_IO_PUT_OPERATION__MESSAGE, oldMessage, newMessage);
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
        msgs = ((InternalEObject)message).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOModulePackage.SOAP_IO_PUT_OPERATION__MESSAGE, null, msgs);
      if (newMessage != null)
        msgs = ((InternalEObject)newMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOModulePackage.SOAP_IO_PUT_OPERATION__MESSAGE, null, msgs);
      msgs = basicSetMessage(newMessage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOModulePackage.SOAP_IO_PUT_OPERATION__MESSAGE, newMessage, newMessage));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getMessageFile()
  {
    return messageFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMessageFile(ResourceDefinition newMessageFile, NotificationChain msgs)
  {
    ResourceDefinition oldMessageFile = messageFile;
    messageFile = newMessageFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOModulePackage.SOAP_IO_PUT_OPERATION__MESSAGE_FILE, oldMessageFile, newMessageFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setMessageFile(ResourceDefinition newMessageFile)
  {
    if (newMessageFile != messageFile)
    {
      NotificationChain msgs = null;
      if (messageFile != null)
        msgs = ((InternalEObject)messageFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOModulePackage.SOAP_IO_PUT_OPERATION__MESSAGE_FILE, null, msgs);
      if (newMessageFile != null)
        msgs = ((InternalEObject)newMessageFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOModulePackage.SOAP_IO_PUT_OPERATION__MESSAGE_FILE, null, msgs);
      msgs = basicSetMessageFile(newMessageFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOModulePackage.SOAP_IO_PUT_OPERATION__MESSAGE_FILE, newMessageFile, newMessageFile));
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
      case SoapIOModulePackage.SOAP_IO_PUT_OPERATION__ACTION:
        return basicSetAction(null, msgs);
      case SoapIOModulePackage.SOAP_IO_PUT_OPERATION__NAMESPACE:
        return basicSetNamespace(null, msgs);
      case SoapIOModulePackage.SOAP_IO_PUT_OPERATION__INPUT:
        return basicSetInput(null, msgs);
      case SoapIOModulePackage.SOAP_IO_PUT_OPERATION__MESSAGE:
        return basicSetMessage(null, msgs);
      case SoapIOModulePackage.SOAP_IO_PUT_OPERATION__MESSAGE_FILE:
        return basicSetMessageFile(null, msgs);
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
      case SoapIOModulePackage.SOAP_IO_PUT_OPERATION__ACTION:
        return getAction();
      case SoapIOModulePackage.SOAP_IO_PUT_OPERATION__NAMESPACE:
        return getNamespace();
      case SoapIOModulePackage.SOAP_IO_PUT_OPERATION__INPUT:
        return getInput();
      case SoapIOModulePackage.SOAP_IO_PUT_OPERATION__MESSAGE:
        return getMessage();
      case SoapIOModulePackage.SOAP_IO_PUT_OPERATION__MESSAGE_FILE:
        return getMessageFile();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SoapIOModulePackage.SOAP_IO_PUT_OPERATION__ACTION:
        setAction((ComplexValue)newValue);
        return;
      case SoapIOModulePackage.SOAP_IO_PUT_OPERATION__NAMESPACE:
        setNamespace((ComplexValue)newValue);
        return;
      case SoapIOModulePackage.SOAP_IO_PUT_OPERATION__INPUT:
        setInput((ResourceDefinition)newValue);
        return;
      case SoapIOModulePackage.SOAP_IO_PUT_OPERATION__MESSAGE:
        setMessage((ComplexValue)newValue);
        return;
      case SoapIOModulePackage.SOAP_IO_PUT_OPERATION__MESSAGE_FILE:
        setMessageFile((ResourceDefinition)newValue);
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
      case SoapIOModulePackage.SOAP_IO_PUT_OPERATION__ACTION:
        setAction((ComplexValue)null);
        return;
      case SoapIOModulePackage.SOAP_IO_PUT_OPERATION__NAMESPACE:
        setNamespace((ComplexValue)null);
        return;
      case SoapIOModulePackage.SOAP_IO_PUT_OPERATION__INPUT:
        setInput((ResourceDefinition)null);
        return;
      case SoapIOModulePackage.SOAP_IO_PUT_OPERATION__MESSAGE:
        setMessage((ComplexValue)null);
        return;
      case SoapIOModulePackage.SOAP_IO_PUT_OPERATION__MESSAGE_FILE:
        setMessageFile((ResourceDefinition)null);
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
      case SoapIOModulePackage.SOAP_IO_PUT_OPERATION__ACTION:
        return action != null;
      case SoapIOModulePackage.SOAP_IO_PUT_OPERATION__NAMESPACE:
        return namespace != null;
      case SoapIOModulePackage.SOAP_IO_PUT_OPERATION__INPUT:
        return input != null;
      case SoapIOModulePackage.SOAP_IO_PUT_OPERATION__MESSAGE:
        return message != null;
      case SoapIOModulePackage.SOAP_IO_PUT_OPERATION__MESSAGE_FILE:
        return messageFile != null;
    }
    return super.eIsSet(featureID);
  }

} // SoapIOPutOperationImpl
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
