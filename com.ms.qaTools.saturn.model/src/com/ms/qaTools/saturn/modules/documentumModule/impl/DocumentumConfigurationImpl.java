package com.ms.qaTools.saturn.modules.documentumModule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration;
import com.ms.qaTools.saturn.modules.documentumModule.DocumentumModulePackage;
import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Documentum Configuration</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.documentumModule.impl.DocumentumConfigurationImpl#getBase <em>Base</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.documentumModule.impl.DocumentumConfigurationImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.documentumModule.impl.DocumentumConfigurationImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.documentumModule.impl.DocumentumConfigurationImpl#getFolder <em>Folder</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.documentumModule.impl.DocumentumConfigurationImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.documentumModule.impl.DocumentumConfigurationImpl#getFile <em>File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.documentumModule.impl.DocumentumConfigurationImpl#isDebug <em>Debug</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentumConfigurationImpl extends EObjectImpl implements DocumentumConfiguration
{
  /**
   * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected ComplexValue         base;

  /**
   * The cached value of the '{@link #getUsername() <em>Username</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsername()
   * @generated
   * @ordered
   */
  protected ComplexValue         username;

  /**
   * The cached value of the '{@link #getPassword() <em>Password</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassword()
   * @generated
   * @ordered
   */
  protected ComplexValue         password;

  /**
   * The cached value of the '{@link #getFolder() <em>Folder</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getFolder()
   * @generated
   * @ordered
   */
  protected ComplexValue         folder;

  /**
   * The cached value of the '{@link #getDocument() <em>Document</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocument()
   * @generated
   * @ordered
   */
  protected ComplexValue         document;

  /**
   * The cached value of the '{@link #getFile() <em>File</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getFile()
   * @generated
   * @ordered
   */
  protected ResourceDefinition   file;

  /**
   * The default value of the '{@link #isDebug() <em>Debug</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isDebug()
   * @generated
   * @ordered
   */
  protected static final boolean DEBUG_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDebug() <em>Debug</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isDebug()
   * @generated
   * @ordered
   */
  protected boolean              debug          = DEBUG_EDEFAULT;

  /**
   * This is true if the Debug attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              debugESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected DocumentumConfigurationImpl()
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
    return DocumentumModulePackage.Literals.DOCUMENTUM_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getBase()
  {
    return base;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBase(ComplexValue newBase, NotificationChain msgs)
  {
    ComplexValue oldBase = base;
    base = newBase;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__BASE, oldBase, newBase);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setBase(ComplexValue newBase)
  {
    if (newBase != base)
    {
      NotificationChain msgs = null;
      if (base != null)
        msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__BASE, null, msgs);
      if (newBase != null)
        msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__BASE, null, msgs);
      msgs = basicSetBase(newBase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__BASE, newBase, newBase));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getUsername()
  {
    return username;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUsername(ComplexValue newUsername, NotificationChain msgs)
  {
    ComplexValue oldUsername = username;
    username = newUsername;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__USERNAME, oldUsername, newUsername);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setUsername(ComplexValue newUsername)
  {
    if (newUsername != username)
    {
      NotificationChain msgs = null;
      if (username != null)
        msgs = ((InternalEObject)username).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__USERNAME, null, msgs);
      if (newUsername != null)
        msgs = ((InternalEObject)newUsername).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__USERNAME, null, msgs);
      msgs = basicSetUsername(newUsername, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__USERNAME, newUsername, newUsername));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getPassword()
  {
    return password;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPassword(ComplexValue newPassword, NotificationChain msgs)
  {
    ComplexValue oldPassword = password;
    password = newPassword;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__PASSWORD, oldPassword, newPassword);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setPassword(ComplexValue newPassword)
  {
    if (newPassword != password)
    {
      NotificationChain msgs = null;
      if (password != null)
        msgs = ((InternalEObject)password).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__PASSWORD, null, msgs);
      if (newPassword != null)
        msgs = ((InternalEObject)newPassword).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__PASSWORD, null, msgs);
      msgs = basicSetPassword(newPassword, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__PASSWORD, newPassword, newPassword));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getFolder()
  {
    return folder;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFolder(ComplexValue newFolder, NotificationChain msgs)
  {
    ComplexValue oldFolder = folder;
    folder = newFolder;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__FOLDER, oldFolder, newFolder);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setFolder(ComplexValue newFolder)
  {
    if (newFolder != folder)
    {
      NotificationChain msgs = null;
      if (folder != null)
        msgs = ((InternalEObject)folder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__FOLDER, null, msgs);
      if (newFolder != null)
        msgs = ((InternalEObject)newFolder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__FOLDER, null, msgs);
      msgs = basicSetFolder(newFolder, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__FOLDER, newFolder, newFolder));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getDocument()
  {
    return document;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDocument(ComplexValue newDocument, NotificationChain msgs)
  {
    ComplexValue oldDocument = document;
    document = newDocument;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__DOCUMENT, oldDocument, newDocument);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDocument(ComplexValue newDocument)
  {
    if (newDocument != document)
    {
      NotificationChain msgs = null;
      if (document != null)
        msgs = ((InternalEObject)document).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__DOCUMENT, null, msgs);
      if (newDocument != null)
        msgs = ((InternalEObject)newDocument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__DOCUMENT, null, msgs);
      msgs = basicSetDocument(newDocument, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__DOCUMENT, newDocument, newDocument));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getFile()
  {
    return file;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFile(ResourceDefinition newFile, NotificationChain msgs)
  {
    ResourceDefinition oldFile = file;
    file = newFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__FILE, oldFile, newFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setFile(ResourceDefinition newFile)
  {
    if (newFile != file)
    {
      NotificationChain msgs = null;
      if (file != null)
        msgs = ((InternalEObject)file).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__FILE, null, msgs);
      if (newFile != null)
        msgs = ((InternalEObject)newFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__FILE, null, msgs);
      msgs = basicSetFile(newFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__FILE, newFile, newFile));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isDebug()
  {
    return debug;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDebug(boolean newDebug)
  {
    boolean oldDebug = debug;
    debug = newDebug;
    boolean oldDebugESet = debugESet;
    debugESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__DEBUG, oldDebug, debug, !oldDebugESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetDebug()
  {
    boolean oldDebug = debug;
    boolean oldDebugESet = debugESet;
    debug = DEBUG_EDEFAULT;
    debugESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__DEBUG, oldDebug, DEBUG_EDEFAULT, oldDebugESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetDebug()
  {
    return debugESet;
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
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__BASE:
        return basicSetBase(null, msgs);
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__USERNAME:
        return basicSetUsername(null, msgs);
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__PASSWORD:
        return basicSetPassword(null, msgs);
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__FOLDER:
        return basicSetFolder(null, msgs);
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__DOCUMENT:
        return basicSetDocument(null, msgs);
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__FILE:
        return basicSetFile(null, msgs);
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
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__BASE:
        return getBase();
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__USERNAME:
        return getUsername();
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__PASSWORD:
        return getPassword();
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__FOLDER:
        return getFolder();
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__DOCUMENT:
        return getDocument();
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__FILE:
        return getFile();
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__DEBUG:
        return isDebug();
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
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__BASE:
        setBase((ComplexValue)newValue);
        return;
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__USERNAME:
        setUsername((ComplexValue)newValue);
        return;
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__PASSWORD:
        setPassword((ComplexValue)newValue);
        return;
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__FOLDER:
        setFolder((ComplexValue)newValue);
        return;
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__DOCUMENT:
        setDocument((ComplexValue)newValue);
        return;
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__FILE:
        setFile((ResourceDefinition)newValue);
        return;
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__DEBUG:
        setDebug((Boolean)newValue);
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
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__BASE:
        setBase((ComplexValue)null);
        return;
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__USERNAME:
        setUsername((ComplexValue)null);
        return;
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__PASSWORD:
        setPassword((ComplexValue)null);
        return;
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__FOLDER:
        setFolder((ComplexValue)null);
        return;
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__DOCUMENT:
        setDocument((ComplexValue)null);
        return;
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__FILE:
        setFile((ResourceDefinition)null);
        return;
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__DEBUG:
        unsetDebug();
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
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__BASE:
        return base != null;
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__USERNAME:
        return username != null;
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__PASSWORD:
        return password != null;
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__FOLDER:
        return folder != null;
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__DOCUMENT:
        return document != null;
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__FILE:
        return file != null;
      case DocumentumModulePackage.DOCUMENTUM_CONFIGURATION__DEBUG:
        return isSetDebug();
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
    result.append(" (debug: ");
    if (debugESet) result.append(debug); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // DocumentumConfigurationImpl
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
