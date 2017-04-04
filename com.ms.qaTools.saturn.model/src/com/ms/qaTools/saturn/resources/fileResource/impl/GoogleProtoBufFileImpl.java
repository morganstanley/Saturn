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
package com.ms.qaTools.saturn.resources.fileResource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage;
import com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Google Proto Buf File</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.fileResource.impl.GoogleProtoBufFileImpl#getClassname <em>Classname</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.fileResource.impl.GoogleProtoBufFileImpl#getJarLocation <em>Jar Location</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.fileResource.impl.GoogleProtoBufFileImpl#isReadEncoded <em>Read Encoded</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.fileResource.impl.GoogleProtoBufFileImpl#isReadDelimited <em>Read Delimited</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GoogleProtoBufFileImpl extends DataSetFileImpl implements GoogleProtoBufFile
{
  /**
   * The cached value of the '{@link #getClassname() <em>Classname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassname()
   * @generated
   * @ordered
   */
  protected ComplexValue         classname;

  /**
   * The cached value of the '{@link #getJarLocation() <em>Jar Location</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getJarLocation()
   * @generated
   * @ordered
   */
  protected ComplexValue         jarLocation;

  /**
   * The default value of the '{@link #isReadEncoded() <em>Read Encoded</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isReadEncoded()
   * @generated
   * @ordered
   */
  protected static final boolean READ_ENCODED_EDEFAULT   = false;

  /**
   * The cached value of the '{@link #isReadEncoded() <em>Read Encoded</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isReadEncoded()
   * @generated
   * @ordered
   */
  protected boolean              readEncoded             = READ_ENCODED_EDEFAULT;

  /**
   * This is true if the Read Encoded attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              readEncodedESet;

  /**
   * The default value of the '{@link #isReadDelimited() <em>Read Delimited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReadDelimited()
   * @generated
   * @ordered
   */
  protected static final boolean READ_DELIMITED_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isReadDelimited() <em>Read Delimited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReadDelimited()
   * @generated
   * @ordered
   */
  protected boolean              readDelimited           = READ_DELIMITED_EDEFAULT;

  /**
   * This is true if the Read Delimited attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              readDelimitedESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected GoogleProtoBufFileImpl()
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
    return FileResourcePackage.Literals.GOOGLE_PROTO_BUF_FILE;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getClassname()
  {
    return classname;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassname(ComplexValue newClassname, NotificationChain msgs)
  {
    ComplexValue oldClassname = classname;
    classname = newClassname;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FileResourcePackage.GOOGLE_PROTO_BUF_FILE__CLASSNAME, oldClassname, newClassname);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setClassname(ComplexValue newClassname)
  {
    if (newClassname != classname)
    {
      NotificationChain msgs = null;
      if (classname != null)
        msgs = ((InternalEObject)classname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FileResourcePackage.GOOGLE_PROTO_BUF_FILE__CLASSNAME, null, msgs);
      if (newClassname != null)
        msgs = ((InternalEObject)newClassname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FileResourcePackage.GOOGLE_PROTO_BUF_FILE__CLASSNAME, null, msgs);
      msgs = basicSetClassname(newClassname, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FileResourcePackage.GOOGLE_PROTO_BUF_FILE__CLASSNAME, newClassname, newClassname));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getJarLocation()
  {
    return jarLocation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJarLocation(ComplexValue newJarLocation, NotificationChain msgs)
  {
    ComplexValue oldJarLocation = jarLocation;
    jarLocation = newJarLocation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FileResourcePackage.GOOGLE_PROTO_BUF_FILE__JAR_LOCATION, oldJarLocation, newJarLocation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setJarLocation(ComplexValue newJarLocation)
  {
    if (newJarLocation != jarLocation)
    {
      NotificationChain msgs = null;
      if (jarLocation != null)
        msgs = ((InternalEObject)jarLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FileResourcePackage.GOOGLE_PROTO_BUF_FILE__JAR_LOCATION, null, msgs);
      if (newJarLocation != null)
        msgs = ((InternalEObject)newJarLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FileResourcePackage.GOOGLE_PROTO_BUF_FILE__JAR_LOCATION, null, msgs);
      msgs = basicSetJarLocation(newJarLocation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FileResourcePackage.GOOGLE_PROTO_BUF_FILE__JAR_LOCATION, newJarLocation, newJarLocation));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isReadDelimited()
  {
    return readDelimited;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setReadDelimited(boolean newReadDelimited)
  {
    boolean oldReadDelimited = readDelimited;
    readDelimited = newReadDelimited;
    boolean oldReadDelimitedESet = readDelimitedESet;
    readDelimitedESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FileResourcePackage.GOOGLE_PROTO_BUF_FILE__READ_DELIMITED, oldReadDelimited, readDelimited, !oldReadDelimitedESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetReadDelimited()
  {
    boolean oldReadDelimited = readDelimited;
    boolean oldReadDelimitedESet = readDelimitedESet;
    readDelimited = READ_DELIMITED_EDEFAULT;
    readDelimitedESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, FileResourcePackage.GOOGLE_PROTO_BUF_FILE__READ_DELIMITED, oldReadDelimited, READ_DELIMITED_EDEFAULT, oldReadDelimitedESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetReadDelimited()
  {
    return readDelimitedESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isReadEncoded()
  {
    return readEncoded;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setReadEncoded(boolean newReadEncoded)
  {
    boolean oldReadEncoded = readEncoded;
    readEncoded = newReadEncoded;
    boolean oldReadEncodedESet = readEncodedESet;
    readEncodedESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FileResourcePackage.GOOGLE_PROTO_BUF_FILE__READ_ENCODED, oldReadEncoded, readEncoded, !oldReadEncodedESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetReadEncoded()
  {
    boolean oldReadEncoded = readEncoded;
    boolean oldReadEncodedESet = readEncodedESet;
    readEncoded = READ_ENCODED_EDEFAULT;
    readEncodedESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, FileResourcePackage.GOOGLE_PROTO_BUF_FILE__READ_ENCODED, oldReadEncoded, READ_ENCODED_EDEFAULT, oldReadEncodedESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetReadEncoded()
  {
    return readEncodedESet;
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
      case FileResourcePackage.GOOGLE_PROTO_BUF_FILE__CLASSNAME:
        return basicSetClassname(null, msgs);
      case FileResourcePackage.GOOGLE_PROTO_BUF_FILE__JAR_LOCATION:
        return basicSetJarLocation(null, msgs);
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
      case FileResourcePackage.GOOGLE_PROTO_BUF_FILE__CLASSNAME:
        return getClassname();
      case FileResourcePackage.GOOGLE_PROTO_BUF_FILE__JAR_LOCATION:
        return getJarLocation();
      case FileResourcePackage.GOOGLE_PROTO_BUF_FILE__READ_ENCODED:
        return isReadEncoded();
      case FileResourcePackage.GOOGLE_PROTO_BUF_FILE__READ_DELIMITED:
        return isReadDelimited();
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
      case FileResourcePackage.GOOGLE_PROTO_BUF_FILE__CLASSNAME:
        setClassname((ComplexValue)newValue);
        return;
      case FileResourcePackage.GOOGLE_PROTO_BUF_FILE__JAR_LOCATION:
        setJarLocation((ComplexValue)newValue);
        return;
      case FileResourcePackage.GOOGLE_PROTO_BUF_FILE__READ_ENCODED:
        setReadEncoded((Boolean)newValue);
        return;
      case FileResourcePackage.GOOGLE_PROTO_BUF_FILE__READ_DELIMITED:
        setReadDelimited((Boolean)newValue);
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
      case FileResourcePackage.GOOGLE_PROTO_BUF_FILE__CLASSNAME:
        setClassname((ComplexValue)null);
        return;
      case FileResourcePackage.GOOGLE_PROTO_BUF_FILE__JAR_LOCATION:
        setJarLocation((ComplexValue)null);
        return;
      case FileResourcePackage.GOOGLE_PROTO_BUF_FILE__READ_ENCODED:
        unsetReadEncoded();
        return;
      case FileResourcePackage.GOOGLE_PROTO_BUF_FILE__READ_DELIMITED:
        unsetReadDelimited();
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
      case FileResourcePackage.GOOGLE_PROTO_BUF_FILE__CLASSNAME:
        return classname != null;
      case FileResourcePackage.GOOGLE_PROTO_BUF_FILE__JAR_LOCATION:
        return jarLocation != null;
      case FileResourcePackage.GOOGLE_PROTO_BUF_FILE__READ_ENCODED:
        return isSetReadEncoded();
      case FileResourcePackage.GOOGLE_PROTO_BUF_FILE__READ_DELIMITED:
        return isSetReadDelimited();
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
    result.append(" (readEncoded: ");
    if (readEncodedESet) result.append(readEncoded); else result.append("<unset>");
    result.append(", readDelimited: ");
    if (readDelimitedESet) result.append(readDelimited); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // GoogleProtoBufFileImpl
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
