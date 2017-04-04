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
package com.ms.qaTools.saturn.resources.fileResource;

import com.ms.qaTools.saturn.types.DeviceResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Device File</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#getFileName <em>File Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isAppend <em>Append</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isCanRead <em>Can Read</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isCanWrite <em>Can Write</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isExists <em>Exists</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isCreate <em>Create</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage#getDeviceFile()
 * @model extendedMetaData="name='DeviceFile' kind='elementOnly'"
 * @generated
 */
public interface DeviceFile extends DeviceResourceDefinition
{
  /**
   * Returns the value of the '<em><b>File Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File Name</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File Name</em>' containment reference.
   * @see #setFileName(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage#getDeviceFile_FileName()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='FileName' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getFileName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#getFileName <em>File Name</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>File Name</em>' containment reference.
   * @see #getFileName()
   * @generated
   */
  void setFileName(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Append</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Append</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Append</em>' attribute.
   * @see #isSetAppend()
   * @see #unsetAppend()
   * @see #setAppend(boolean)
   * @see com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage#getDeviceFile_Append()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='append'"
   * @generated
   */
  boolean isAppend();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isAppend <em>Append</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Append</em>' attribute.
   * @see #isSetAppend()
   * @see #unsetAppend()
   * @see #isAppend()
   * @generated
   */
  void setAppend(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isAppend <em>Append</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAppend()
   * @see #isAppend()
   * @see #setAppend(boolean)
   * @generated
   */
  void unsetAppend();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isAppend <em>Append</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Append</em>' attribute is set.
   * @see #unsetAppend()
   * @see #isAppend()
   * @see #setAppend(boolean)
   * @generated
   */
  boolean isSetAppend();

  /**
   * Returns the value of the '<em><b>Can Read</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Can Read</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Can Read</em>' attribute.
   * @see #isSetCanRead()
   * @see #unsetCanRead()
   * @see #setCanRead(boolean)
   * @see com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage#getDeviceFile_CanRead()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='canRead'"
   * @generated
   */
  boolean isCanRead();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isCanRead <em>Can Read</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Can Read</em>' attribute.
   * @see #isSetCanRead()
   * @see #unsetCanRead()
   * @see #isCanRead()
   * @generated
   */
  void setCanRead(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isCanRead <em>Can Read</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetCanRead()
   * @see #isCanRead()
   * @see #setCanRead(boolean)
   * @generated
   */
  void unsetCanRead();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isCanRead <em>Can Read</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Can Read</em>' attribute is set.
   * @see #unsetCanRead()
   * @see #isCanRead()
   * @see #setCanRead(boolean)
   * @generated
   */
  boolean isSetCanRead();

  /**
   * Returns the value of the '<em><b>Can Write</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Can Write</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Can Write</em>' attribute.
   * @see #isSetCanWrite()
   * @see #unsetCanWrite()
   * @see #setCanWrite(boolean)
   * @see com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage#getDeviceFile_CanWrite()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='canWrite'"
   * @generated
   */
  boolean isCanWrite();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isCanWrite <em>Can Write</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Can Write</em>' attribute.
   * @see #isSetCanWrite()
   * @see #unsetCanWrite()
   * @see #isCanWrite()
   * @generated
   */
  void setCanWrite(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isCanWrite <em>Can Write</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetCanWrite()
   * @see #isCanWrite()
   * @see #setCanWrite(boolean)
   * @generated
   */
  void unsetCanWrite();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isCanWrite <em>Can Write</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Can Write</em>' attribute is set.
   * @see #unsetCanWrite()
   * @see #isCanWrite()
   * @see #setCanWrite(boolean)
   * @generated
   */
  boolean isSetCanWrite();

  /**
   * Returns the value of the '<em><b>Create</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Create</em>' attribute.
   * @see #isSetCreate()
   * @see #unsetCreate()
   * @see #setCreate(boolean)
   * @see com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage#getDeviceFile_Create()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='create'"
   * @generated
   */
  boolean isCreate();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isCreate <em>Create</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Create</em>' attribute.
   * @see #isSetCreate()
   * @see #unsetCreate()
   * @see #isCreate()
   * @generated
   */
  void setCreate(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isCreate <em>Create</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetCreate()
   * @see #isCreate()
   * @see #setCreate(boolean)
   * @generated
   */
  void unsetCreate();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isCreate <em>Create</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Create</em>' attribute is set.
   * @see #unsetCreate()
   * @see #isCreate()
   * @see #setCreate(boolean)
   * @generated
   */
  boolean isSetCreate();

  /**
   * Returns the value of the '<em><b>Exists</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exists</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Exists</em>' attribute.
   * @see #isSetExists()
   * @see #unsetExists()
   * @see #setExists(boolean)
   * @see com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage#getDeviceFile_Exists()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='exists'"
   * @generated
   */
  boolean isExists();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isExists <em>Exists</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Exists</em>' attribute.
   * @see #isSetExists()
   * @see #unsetExists()
   * @see #isExists()
   * @generated
   */
  void setExists(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isExists <em>Exists</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetExists()
   * @see #isExists()
   * @see #setExists(boolean)
   * @generated
   */
  void unsetExists();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#isExists <em>Exists</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Exists</em>' attribute is set.
   * @see #unsetExists()
   * @see #isExists()
   * @see #setExists(boolean)
   * @generated
   */
  boolean isSetExists();

  /**
   * Returns the value of the '<em><b>Filter</b></em>' attribute. The default value is <code>"*"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Filter</em>' attribute.
   * @see #isSetFilter()
   * @see #unsetFilter()
   * @see #setFilter(String)
   * @see com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage#getDeviceFile_Filter()
   * @model default="*" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Token"
   *        extendedMetaData="kind='attribute' name='filter'"
   * @generated
   */
  String getFilter();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#getFilter <em>Filter</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' attribute.
   * @see #isSetFilter()
   * @see #unsetFilter()
   * @see #getFilter()
   * @generated
   */
  void setFilter(String value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#getFilter <em>Filter</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetFilter()
   * @see #getFilter()
   * @see #setFilter(String)
   * @generated
   */
  void unsetFilter();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile#getFilter <em>Filter</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Filter</em>' attribute is set.
   * @see #unsetFilter()
   * @see #getFilter()
   * @see #setFilter(String)
   * @generated
   */
  boolean isSetFilter();

} // DeviceFile
