package com.ms.qaTools.saturn.resources.directoryResource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource;
import com.ms.qaTools.saturn.resources.directoryResource.DirectoryResourcePackage;
import com.ms.qaTools.saturn.types.impl.DeviceResourceDefinitionImpl;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Directory Resource</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.resources.directoryResource.impl.DirectoryResourceImpl#getDirectory <em>Directory
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.directoryResource.impl.DirectoryResourceImpl#getAvailableSize <em>
 * Available Size</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.directoryResource.impl.DirectoryResourceImpl#isCanRead <em>Can Read</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.directoryResource.impl.DirectoryResourceImpl#isCanWrite <em>Can Write
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.directoryResource.impl.DirectoryResourceImpl#isCheckAvailableSize <em>
 * Check Available Size</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.directoryResource.impl.DirectoryResourceImpl#isCreate <em>Create</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.directoryResource.impl.DirectoryResourceImpl#isExists <em>Exists</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.directoryResource.impl.DirectoryResourceImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DirectoryResourceImpl extends DeviceResourceDefinitionImpl implements DirectoryResource
{
  /**
   * The cached value of the '{@link #getDirectory() <em>Directory</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirectory()
   * @generated
   * @ordered
   */
  protected ComplexValue         directory;

  /**
   * The cached value of the '{@link #getAvailableSize() <em>Available Size</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getAvailableSize()
   * @generated
   * @ordered
   */
  protected ComplexValue         availableSize;

  /**
   * The default value of the '{@link #isCanRead() <em>Can Read</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isCanRead()
   * @generated
   * @ordered
   */
  protected static final boolean CAN_READ_EDEFAULT             = true;

  /**
   * The cached value of the '{@link #isCanRead() <em>Can Read</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isCanRead()
   * @generated
   * @ordered
   */
  protected boolean              canRead                       = CAN_READ_EDEFAULT;

  /**
   * This is true if the Can Read attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              canReadESet;

  /**
   * The default value of the '{@link #isCanWrite() <em>Can Write</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isCanWrite()
   * @generated
   * @ordered
   */
  protected static final boolean CAN_WRITE_EDEFAULT            = false;

  /**
   * The cached value of the '{@link #isCanWrite() <em>Can Write</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isCanWrite()
   * @generated
   * @ordered
   */
  protected boolean              canWrite                      = CAN_WRITE_EDEFAULT;

  /**
   * This is true if the Can Write attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              canWriteESet;

  /**
   * The default value of the '{@link #isExists() <em>Exists</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isExists()
   * @generated
   * @ordered
   */
  protected static final boolean EXISTS_EDEFAULT               = false;

  /**
   * The cached value of the '{@link #isExists() <em>Exists</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isExists()
   * @generated
   * @ordered
   */
  protected boolean              exists                        = EXISTS_EDEFAULT;

  /**
   * This is true if the Exists attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              existsESet;

  /**
   * The default value of the '{@link #isCreate() <em>Create</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isCreate()
   * @generated
   * @ordered
   */
  protected static final boolean CREATE_EDEFAULT               = true;

  /**
   * The cached value of the '{@link #isCreate() <em>Create</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isCreate()
   * @generated
   * @ordered
   */
  protected boolean              create                        = CREATE_EDEFAULT;

  /**
   * This is true if the Create attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              createESet;

  /**
   * The default value of the '{@link #isCheckAvailableSize() <em>Check Available Size</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isCheckAvailableSize()
   * @generated
   * @ordered
   */
  protected static final boolean CHECK_AVAILABLE_SIZE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCheckAvailableSize() <em>Check Available Size</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isCheckAvailableSize()
   * @generated
   * @ordered
   */
  protected boolean              checkAvailableSize            = CHECK_AVAILABLE_SIZE_EDEFAULT;

  /**
   * This is true if the Check Available Size attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              checkAvailableSizeESet;

  /**
   * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getFilter()
   * @generated
   * @ordered
   */
  protected static final String  FILTER_EDEFAULT               = ".*";

  /**
   * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getFilter()
   * @generated
   * @ordered
   */
  protected String               filter                        = FILTER_EDEFAULT;

  /**
   * This is true if the Filter attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              filterESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected DirectoryResourceImpl()
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
    return DirectoryResourcePackage.Literals.DIRECTORY_RESOURCE;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getDirectory()
  {
    return directory;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDirectory(ComplexValue newDirectory, NotificationChain msgs)
  {
    ComplexValue oldDirectory = directory;
    directory = newDirectory;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DirectoryResourcePackage.DIRECTORY_RESOURCE__DIRECTORY, oldDirectory, newDirectory);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDirectory(ComplexValue newDirectory)
  {
    if (newDirectory != directory)
    {
      NotificationChain msgs = null;
      if (directory != null)
        msgs = ((InternalEObject)directory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DirectoryResourcePackage.DIRECTORY_RESOURCE__DIRECTORY, null, msgs);
      if (newDirectory != null)
        msgs = ((InternalEObject)newDirectory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DirectoryResourcePackage.DIRECTORY_RESOURCE__DIRECTORY, null, msgs);
      msgs = basicSetDirectory(newDirectory, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DirectoryResourcePackage.DIRECTORY_RESOURCE__DIRECTORY, newDirectory, newDirectory));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getAvailableSize()
  {
    return availableSize;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAvailableSize(ComplexValue newAvailableSize, NotificationChain msgs)
  {
    ComplexValue oldAvailableSize = availableSize;
    availableSize = newAvailableSize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DirectoryResourcePackage.DIRECTORY_RESOURCE__AVAILABLE_SIZE, oldAvailableSize, newAvailableSize);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setAvailableSize(ComplexValue newAvailableSize)
  {
    if (newAvailableSize != availableSize)
    {
      NotificationChain msgs = null;
      if (availableSize != null)
        msgs = ((InternalEObject)availableSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DirectoryResourcePackage.DIRECTORY_RESOURCE__AVAILABLE_SIZE, null, msgs);
      if (newAvailableSize != null)
        msgs = ((InternalEObject)newAvailableSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DirectoryResourcePackage.DIRECTORY_RESOURCE__AVAILABLE_SIZE, null, msgs);
      msgs = basicSetAvailableSize(newAvailableSize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DirectoryResourcePackage.DIRECTORY_RESOURCE__AVAILABLE_SIZE, newAvailableSize, newAvailableSize));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isCanRead()
  {
    return canRead;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCanRead(boolean newCanRead)
  {
    boolean oldCanRead = canRead;
    canRead = newCanRead;
    boolean oldCanReadESet = canReadESet;
    canReadESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DirectoryResourcePackage.DIRECTORY_RESOURCE__CAN_READ, oldCanRead, canRead, !oldCanReadESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetCanRead()
  {
    boolean oldCanRead = canRead;
    boolean oldCanReadESet = canReadESet;
    canRead = CAN_READ_EDEFAULT;
    canReadESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, DirectoryResourcePackage.DIRECTORY_RESOURCE__CAN_READ, oldCanRead, CAN_READ_EDEFAULT, oldCanReadESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetCanRead()
  {
    return canReadESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isCanWrite()
  {
    return canWrite;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCanWrite(boolean newCanWrite)
  {
    boolean oldCanWrite = canWrite;
    canWrite = newCanWrite;
    boolean oldCanWriteESet = canWriteESet;
    canWriteESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DirectoryResourcePackage.DIRECTORY_RESOURCE__CAN_WRITE, oldCanWrite, canWrite, !oldCanWriteESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetCanWrite()
  {
    boolean oldCanWrite = canWrite;
    boolean oldCanWriteESet = canWriteESet;
    canWrite = CAN_WRITE_EDEFAULT;
    canWriteESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, DirectoryResourcePackage.DIRECTORY_RESOURCE__CAN_WRITE, oldCanWrite, CAN_WRITE_EDEFAULT, oldCanWriteESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetCanWrite()
  {
    return canWriteESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isCheckAvailableSize()
  {
    return checkAvailableSize;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCheckAvailableSize(boolean newCheckAvailableSize)
  {
    boolean oldCheckAvailableSize = checkAvailableSize;
    checkAvailableSize = newCheckAvailableSize;
    boolean oldCheckAvailableSizeESet = checkAvailableSizeESet;
    checkAvailableSizeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DirectoryResourcePackage.DIRECTORY_RESOURCE__CHECK_AVAILABLE_SIZE, oldCheckAvailableSize, checkAvailableSize, !oldCheckAvailableSizeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetCheckAvailableSize()
  {
    boolean oldCheckAvailableSize = checkAvailableSize;
    boolean oldCheckAvailableSizeESet = checkAvailableSizeESet;
    checkAvailableSize = CHECK_AVAILABLE_SIZE_EDEFAULT;
    checkAvailableSizeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, DirectoryResourcePackage.DIRECTORY_RESOURCE__CHECK_AVAILABLE_SIZE, oldCheckAvailableSize, CHECK_AVAILABLE_SIZE_EDEFAULT, oldCheckAvailableSizeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetCheckAvailableSize()
  {
    return checkAvailableSizeESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isCreate()
  {
    return create;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCreate(boolean newCreate)
  {
    boolean oldCreate = create;
    create = newCreate;
    boolean oldCreateESet = createESet;
    createESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DirectoryResourcePackage.DIRECTORY_RESOURCE__CREATE, oldCreate, create, !oldCreateESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetCreate()
  {
    boolean oldCreate = create;
    boolean oldCreateESet = createESet;
    create = CREATE_EDEFAULT;
    createESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, DirectoryResourcePackage.DIRECTORY_RESOURCE__CREATE, oldCreate, CREATE_EDEFAULT, oldCreateESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetCreate()
  {
    return createESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isExists()
  {
    return exists;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setExists(boolean newExists)
  {
    boolean oldExists = exists;
    exists = newExists;
    boolean oldExistsESet = existsESet;
    existsESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DirectoryResourcePackage.DIRECTORY_RESOURCE__EXISTS, oldExists, exists, !oldExistsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetExists()
  {
    boolean oldExists = exists;
    boolean oldExistsESet = existsESet;
    exists = EXISTS_EDEFAULT;
    existsESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, DirectoryResourcePackage.DIRECTORY_RESOURCE__EXISTS, oldExists, EXISTS_EDEFAULT, oldExistsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetExists()
  {
    return existsESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getFilter()
  {
    return filter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setFilter(String newFilter)
  {
    String oldFilter = filter;
    filter = newFilter;
    boolean oldFilterESet = filterESet;
    filterESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DirectoryResourcePackage.DIRECTORY_RESOURCE__FILTER, oldFilter, filter, !oldFilterESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetFilter()
  {
    String oldFilter = filter;
    boolean oldFilterESet = filterESet;
    filter = FILTER_EDEFAULT;
    filterESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, DirectoryResourcePackage.DIRECTORY_RESOURCE__FILTER, oldFilter, FILTER_EDEFAULT, oldFilterESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetFilter()
  {
    return filterESet;
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
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__DIRECTORY:
        return basicSetDirectory(null, msgs);
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__AVAILABLE_SIZE:
        return basicSetAvailableSize(null, msgs);
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
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__DIRECTORY:
        return getDirectory();
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__AVAILABLE_SIZE:
        return getAvailableSize();
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__CAN_READ:
        return isCanRead();
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__CAN_WRITE:
        return isCanWrite();
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__EXISTS:
        return isExists();
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__CREATE:
        return isCreate();
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__CHECK_AVAILABLE_SIZE:
        return isCheckAvailableSize();
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__FILTER:
        return getFilter();
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
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__DIRECTORY:
        setDirectory((ComplexValue)newValue);
        return;
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__AVAILABLE_SIZE:
        setAvailableSize((ComplexValue)newValue);
        return;
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__CAN_READ:
        setCanRead((Boolean)newValue);
        return;
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__CAN_WRITE:
        setCanWrite((Boolean)newValue);
        return;
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__EXISTS:
        setExists((Boolean)newValue);
        return;
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__CREATE:
        setCreate((Boolean)newValue);
        return;
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__CHECK_AVAILABLE_SIZE:
        setCheckAvailableSize((Boolean)newValue);
        return;
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__FILTER:
        setFilter((String)newValue);
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
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__DIRECTORY:
        setDirectory((ComplexValue)null);
        return;
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__AVAILABLE_SIZE:
        setAvailableSize((ComplexValue)null);
        return;
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__CAN_READ:
        unsetCanRead();
        return;
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__CAN_WRITE:
        unsetCanWrite();
        return;
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__EXISTS:
        unsetExists();
        return;
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__CREATE:
        unsetCreate();
        return;
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__CHECK_AVAILABLE_SIZE:
        unsetCheckAvailableSize();
        return;
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__FILTER:
        unsetFilter();
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
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__DIRECTORY:
        return directory != null;
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__AVAILABLE_SIZE:
        return availableSize != null;
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__CAN_READ:
        return isSetCanRead();
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__CAN_WRITE:
        return isSetCanWrite();
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__EXISTS:
        return isSetExists();
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__CREATE:
        return isSetCreate();
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__CHECK_AVAILABLE_SIZE:
        return isSetCheckAvailableSize();
      case DirectoryResourcePackage.DIRECTORY_RESOURCE__FILTER:
        return isSetFilter();
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
    result.append(" (canRead: ");
    if (canReadESet) result.append(canRead); else result.append("<unset>");
    result.append(", canWrite: ");
    if (canWriteESet) result.append(canWrite); else result.append("<unset>");
    result.append(", exists: ");
    if (existsESet) result.append(exists); else result.append("<unset>");
    result.append(", create: ");
    if (createESet) result.append(create); else result.append("<unset>");
    result.append(", checkAvailableSize: ");
    if (checkAvailableSizeESet) result.append(checkAvailableSize); else result.append("<unset>");
    result.append(", filter: ");
    if (filterESet) result.append(filter); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // DirectoryResourceImpl
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
