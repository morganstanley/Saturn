package com.ms.qaTools.saturn.resources.documentumResource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource;
import com.ms.qaTools.saturn.resources.documentumResource.DocumentumResourcePackage;
import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.types.impl.DeviceResourceDefinitionImpl;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Documentum Resource</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.documentumResource.impl.DocumentumResourceImpl#getBase <em>Base</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.documentumResource.impl.DocumentumResourceImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.documentumResource.impl.DocumentumResourceImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.documentumResource.impl.DocumentumResourceImpl#getFolder <em>Folder</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.documentumResource.impl.DocumentumResourceImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.documentumResource.impl.DocumentumResourceImpl#getFile <em>File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.documentumResource.impl.DocumentumResourceImpl#isDebug <em>Debug</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.documentumResource.impl.DocumentumResourceImpl#isTemporary <em>Temporary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentumResourceImpl extends DeviceResourceDefinitionImpl implements DocumentumResource
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
   * The cached value of the '{@link #getUserName() <em>User Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUserName()
   * @generated
   * @ordered
   */
  protected ComplexValue         userName;

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
  protected static final boolean DEBUG_EDEFAULT     = false;

  /**
   * The cached value of the '{@link #isDebug() <em>Debug</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isDebug()
   * @generated
   * @ordered
   */
  protected boolean              debug              = DEBUG_EDEFAULT;

  /**
   * This is true if the Debug attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              debugESet;

  /**
   * The default value of the '{@link #isTemporary() <em>Temporary</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isTemporary()
   * @generated
   * @ordered
   */
  protected static final boolean TEMPORARY_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isTemporary() <em>Temporary</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isTemporary()
   * @generated
   * @ordered
   */
  protected boolean              temporary          = TEMPORARY_EDEFAULT;

  /**
   * This is true if the Temporary attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              temporaryESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected DocumentumResourceImpl()
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
    return DocumentumResourcePackage.Literals.DOCUMENTUM_RESOURCE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentumResourcePackage.DOCUMENTUM_RESOURCE__BASE, oldBase, newBase);
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
        msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentumResourcePackage.DOCUMENTUM_RESOURCE__BASE, null, msgs);
      if (newBase != null)
        msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentumResourcePackage.DOCUMENTUM_RESOURCE__BASE, null, msgs);
      msgs = basicSetBase(newBase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DocumentumResourcePackage.DOCUMENTUM_RESOURCE__BASE, newBase, newBase));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getUserName()
  {
    return userName;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUserName(ComplexValue newUserName, NotificationChain msgs)
  {
    ComplexValue oldUserName = userName;
    userName = newUserName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentumResourcePackage.DOCUMENTUM_RESOURCE__USER_NAME, oldUserName, newUserName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setUserName(ComplexValue newUserName)
  {
    if (newUserName != userName)
    {
      NotificationChain msgs = null;
      if (userName != null)
        msgs = ((InternalEObject)userName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentumResourcePackage.DOCUMENTUM_RESOURCE__USER_NAME, null, msgs);
      if (newUserName != null)
        msgs = ((InternalEObject)newUserName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentumResourcePackage.DOCUMENTUM_RESOURCE__USER_NAME, null, msgs);
      msgs = basicSetUserName(newUserName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DocumentumResourcePackage.DOCUMENTUM_RESOURCE__USER_NAME, newUserName, newUserName));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentumResourcePackage.DOCUMENTUM_RESOURCE__PASSWORD, oldPassword, newPassword);
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
        msgs = ((InternalEObject)password).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentumResourcePackage.DOCUMENTUM_RESOURCE__PASSWORD, null, msgs);
      if (newPassword != null)
        msgs = ((InternalEObject)newPassword).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentumResourcePackage.DOCUMENTUM_RESOURCE__PASSWORD, null, msgs);
      msgs = basicSetPassword(newPassword, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DocumentumResourcePackage.DOCUMENTUM_RESOURCE__PASSWORD, newPassword, newPassword));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentumResourcePackage.DOCUMENTUM_RESOURCE__FOLDER, oldFolder, newFolder);
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
        msgs = ((InternalEObject)folder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentumResourcePackage.DOCUMENTUM_RESOURCE__FOLDER, null, msgs);
      if (newFolder != null)
        msgs = ((InternalEObject)newFolder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentumResourcePackage.DOCUMENTUM_RESOURCE__FOLDER, null, msgs);
      msgs = basicSetFolder(newFolder, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DocumentumResourcePackage.DOCUMENTUM_RESOURCE__FOLDER, newFolder, newFolder));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentumResourcePackage.DOCUMENTUM_RESOURCE__DOCUMENT, oldDocument, newDocument);
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
        msgs = ((InternalEObject)document).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentumResourcePackage.DOCUMENTUM_RESOURCE__DOCUMENT, null, msgs);
      if (newDocument != null)
        msgs = ((InternalEObject)newDocument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentumResourcePackage.DOCUMENTUM_RESOURCE__DOCUMENT, null, msgs);
      msgs = basicSetDocument(newDocument, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DocumentumResourcePackage.DOCUMENTUM_RESOURCE__DOCUMENT, newDocument, newDocument));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentumResourcePackage.DOCUMENTUM_RESOURCE__FILE, oldFile, newFile);
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
        msgs = ((InternalEObject)file).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentumResourcePackage.DOCUMENTUM_RESOURCE__FILE, null, msgs);
      if (newFile != null)
        msgs = ((InternalEObject)newFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentumResourcePackage.DOCUMENTUM_RESOURCE__FILE, null, msgs);
      msgs = basicSetFile(newFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DocumentumResourcePackage.DOCUMENTUM_RESOURCE__FILE, newFile, newFile));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DocumentumResourcePackage.DOCUMENTUM_RESOURCE__DEBUG, oldDebug, debug, !oldDebugESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, DocumentumResourcePackage.DOCUMENTUM_RESOURCE__DEBUG, oldDebug, DEBUG_EDEFAULT, oldDebugESet));
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
  public boolean isTemporary()
  {
    return temporary;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTemporary(boolean newTemporary)
  {
    boolean oldTemporary = temporary;
    temporary = newTemporary;
    boolean oldTemporaryESet = temporaryESet;
    temporaryESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DocumentumResourcePackage.DOCUMENTUM_RESOURCE__TEMPORARY, oldTemporary, temporary, !oldTemporaryESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetTemporary()
  {
    boolean oldTemporary = temporary;
    boolean oldTemporaryESet = temporaryESet;
    temporary = TEMPORARY_EDEFAULT;
    temporaryESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, DocumentumResourcePackage.DOCUMENTUM_RESOURCE__TEMPORARY, oldTemporary, TEMPORARY_EDEFAULT, oldTemporaryESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetTemporary()
  {
    return temporaryESet;
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
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__BASE:
        return basicSetBase(null, msgs);
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__USER_NAME:
        return basicSetUserName(null, msgs);
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__PASSWORD:
        return basicSetPassword(null, msgs);
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__FOLDER:
        return basicSetFolder(null, msgs);
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__DOCUMENT:
        return basicSetDocument(null, msgs);
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__FILE:
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
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__BASE:
        return getBase();
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__USER_NAME:
        return getUserName();
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__PASSWORD:
        return getPassword();
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__FOLDER:
        return getFolder();
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__DOCUMENT:
        return getDocument();
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__FILE:
        return getFile();
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__DEBUG:
        return isDebug();
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__TEMPORARY:
        return isTemporary();
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
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__BASE:
        setBase((ComplexValue)newValue);
        return;
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__USER_NAME:
        setUserName((ComplexValue)newValue);
        return;
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__PASSWORD:
        setPassword((ComplexValue)newValue);
        return;
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__FOLDER:
        setFolder((ComplexValue)newValue);
        return;
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__DOCUMENT:
        setDocument((ComplexValue)newValue);
        return;
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__FILE:
        setFile((ResourceDefinition)newValue);
        return;
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__DEBUG:
        setDebug((Boolean)newValue);
        return;
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__TEMPORARY:
        setTemporary((Boolean)newValue);
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
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__BASE:
        setBase((ComplexValue)null);
        return;
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__USER_NAME:
        setUserName((ComplexValue)null);
        return;
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__PASSWORD:
        setPassword((ComplexValue)null);
        return;
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__FOLDER:
        setFolder((ComplexValue)null);
        return;
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__DOCUMENT:
        setDocument((ComplexValue)null);
        return;
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__FILE:
        setFile((ResourceDefinition)null);
        return;
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__DEBUG:
        unsetDebug();
        return;
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__TEMPORARY:
        unsetTemporary();
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
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__BASE:
        return base != null;
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__USER_NAME:
        return userName != null;
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__PASSWORD:
        return password != null;
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__FOLDER:
        return folder != null;
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__DOCUMENT:
        return document != null;
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__FILE:
        return file != null;
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__DEBUG:
        return isSetDebug();
      case DocumentumResourcePackage.DOCUMENTUM_RESOURCE__TEMPORARY:
        return isSetTemporary();
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
    result.append(", temporary: ");
    if (temporaryESet) result.append(temporary); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // DocumentumResourceImpl
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
