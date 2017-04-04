package com.ms.qaTools.saturn.modules.cometModule.impl;

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

import com.ms.qaTools.saturn.modules.cometModule.CometConfiguration;
import com.ms.qaTools.saturn.modules.cometModule.CometModulePackage;
import com.ms.qaTools.saturn.modules.cometModule.Message;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Comet Configuration</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.cometModule.impl.CometConfigurationImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.cometModule.impl.CometConfigurationImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.cometModule.impl.CometConfigurationImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.cometModule.impl.CometConfigurationImpl#getTimeOut <em>Time Out</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CometConfigurationImpl extends EObjectImpl implements CometConfiguration
{
  /**
   * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getMessages()
   * @generated
   * @ordered
   */
  protected EList<Message>          messages;

  /**
   * The cached value of the '{@link #getDatabase() <em>Database</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatabase()
   * @generated
   * @ordered
   */
  protected NamedResourceDefinition database;

  /**
   * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getOutput()
   * @generated
   * @ordered
   */
  protected NamedResourceDefinition output;

  /**
   * The cached value of the '{@link #getTimeOut() <em>Time Out</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeOut()
   * @generated
   * @ordered
   */
  protected ComplexValue            timeOut;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected CometConfigurationImpl()
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
    return CometModulePackage.Literals.COMET_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Message> getMessages()
  {
    if (messages == null)
    {
      messages = new EObjectContainmentEList<Message>(Message.class, this, CometModulePackage.COMET_CONFIGURATION__MESSAGES);
    }
    return messages;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NamedResourceDefinition getDatabase()
  {
    return database;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDatabase(NamedResourceDefinition newDatabase, NotificationChain msgs)
  {
    NamedResourceDefinition oldDatabase = database;
    database = newDatabase;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CometModulePackage.COMET_CONFIGURATION__DATABASE, oldDatabase, newDatabase);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDatabase(NamedResourceDefinition newDatabase)
  {
    if (newDatabase != database)
    {
      NotificationChain msgs = null;
      if (database != null)
        msgs = ((InternalEObject)database).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CometModulePackage.COMET_CONFIGURATION__DATABASE, null, msgs);
      if (newDatabase != null)
        msgs = ((InternalEObject)newDatabase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CometModulePackage.COMET_CONFIGURATION__DATABASE, null, msgs);
      msgs = basicSetDatabase(newDatabase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CometModulePackage.COMET_CONFIGURATION__DATABASE, newDatabase, newDatabase));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NamedResourceDefinition getOutput()
  {
    return output;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutput(NamedResourceDefinition newOutput, NotificationChain msgs)
  {
    NamedResourceDefinition oldOutput = output;
    output = newOutput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CometModulePackage.COMET_CONFIGURATION__OUTPUT, oldOutput, newOutput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOutput(NamedResourceDefinition newOutput)
  {
    if (newOutput != output)
    {
      NotificationChain msgs = null;
      if (output != null)
        msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CometModulePackage.COMET_CONFIGURATION__OUTPUT, null, msgs);
      if (newOutput != null)
        msgs = ((InternalEObject)newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CometModulePackage.COMET_CONFIGURATION__OUTPUT, null, msgs);
      msgs = basicSetOutput(newOutput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CometModulePackage.COMET_CONFIGURATION__OUTPUT, newOutput, newOutput));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getTimeOut()
  {
    return timeOut;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTimeOut(ComplexValue newTimeOut, NotificationChain msgs)
  {
    ComplexValue oldTimeOut = timeOut;
    timeOut = newTimeOut;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CometModulePackage.COMET_CONFIGURATION__TIME_OUT, oldTimeOut, newTimeOut);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTimeOut(ComplexValue newTimeOut)
  {
    if (newTimeOut != timeOut)
    {
      NotificationChain msgs = null;
      if (timeOut != null)
        msgs = ((InternalEObject)timeOut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CometModulePackage.COMET_CONFIGURATION__TIME_OUT, null, msgs);
      if (newTimeOut != null)
        msgs = ((InternalEObject)newTimeOut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CometModulePackage.COMET_CONFIGURATION__TIME_OUT, null, msgs);
      msgs = basicSetTimeOut(newTimeOut, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CometModulePackage.COMET_CONFIGURATION__TIME_OUT, newTimeOut, newTimeOut));
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
      case CometModulePackage.COMET_CONFIGURATION__MESSAGES:
        return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
      case CometModulePackage.COMET_CONFIGURATION__DATABASE:
        return basicSetDatabase(null, msgs);
      case CometModulePackage.COMET_CONFIGURATION__OUTPUT:
        return basicSetOutput(null, msgs);
      case CometModulePackage.COMET_CONFIGURATION__TIME_OUT:
        return basicSetTimeOut(null, msgs);
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
      case CometModulePackage.COMET_CONFIGURATION__MESSAGES:
        return getMessages();
      case CometModulePackage.COMET_CONFIGURATION__DATABASE:
        return getDatabase();
      case CometModulePackage.COMET_CONFIGURATION__OUTPUT:
        return getOutput();
      case CometModulePackage.COMET_CONFIGURATION__TIME_OUT:
        return getTimeOut();
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
      case CometModulePackage.COMET_CONFIGURATION__MESSAGES:
        getMessages().clear();
        getMessages().addAll((Collection<? extends Message>)newValue);
        return;
      case CometModulePackage.COMET_CONFIGURATION__DATABASE:
        setDatabase((NamedResourceDefinition)newValue);
        return;
      case CometModulePackage.COMET_CONFIGURATION__OUTPUT:
        setOutput((NamedResourceDefinition)newValue);
        return;
      case CometModulePackage.COMET_CONFIGURATION__TIME_OUT:
        setTimeOut((ComplexValue)newValue);
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
      case CometModulePackage.COMET_CONFIGURATION__MESSAGES:
        getMessages().clear();
        return;
      case CometModulePackage.COMET_CONFIGURATION__DATABASE:
        setDatabase((NamedResourceDefinition)null);
        return;
      case CometModulePackage.COMET_CONFIGURATION__OUTPUT:
        setOutput((NamedResourceDefinition)null);
        return;
      case CometModulePackage.COMET_CONFIGURATION__TIME_OUT:
        setTimeOut((ComplexValue)null);
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
      case CometModulePackage.COMET_CONFIGURATION__MESSAGES:
        return messages != null && !messages.isEmpty();
      case CometModulePackage.COMET_CONFIGURATION__DATABASE:
        return database != null;
      case CometModulePackage.COMET_CONFIGURATION__OUTPUT:
        return output != null;
      case CometModulePackage.COMET_CONFIGURATION__TIME_OUT:
        return timeOut != null;
    }
    return super.eIsSet(featureID);
  }

} // CometConfigurationImpl
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
