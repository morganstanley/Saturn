package com.ms.qaTools.saturn.resources.directoryResource;

import com.ms.qaTools.saturn.types.DeviceResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Directory Resource</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#getDirectory <em>Directory</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#getAvailableSize <em>Available Size
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isCanRead <em>Can Read</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isCanWrite <em>Can Write</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isCheckAvailableSize <em>Check
 * Available Size</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isCreate <em>Create</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isExists <em>Exists</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.resources.directoryResource.DirectoryResourcePackage#getDirectoryResource()
 * @model annotation="http://www.ms.com/2006/pdsttools/xsd2perl package='Saturn::Resource::Directory'"
 *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib name='dir'"
 *        extendedMetaData="name='DirectoryResource' kind='elementOnly'"
 * @generated
 */
public interface DirectoryResource extends DeviceResourceDefinition
{
  /**
   * Returns the value of the '<em><b>Directory</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Directory</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Directory</em>' containment reference.
   * @see #setDirectory(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.directoryResource.DirectoryResourcePackage#getDirectoryResource_Directory()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Directory' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getDirectory();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#getDirectory <em>Directory</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Directory</em>' containment reference.
   * @see #getDirectory()
   * @generated
   */
  void setDirectory(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Available Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Available Size</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Available Size</em>' containment reference.
   * @see #setAvailableSize(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.directoryResource.DirectoryResourcePackage#getDirectoryResource_AvailableSize()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='AvailableSize' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getAvailableSize();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#getAvailableSize <em>Available Size</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Available Size</em>' containment reference.
   * @see #getAvailableSize()
   * @generated
   */
  void setAvailableSize(ComplexValue value);

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
   * @see com.ms.qaTools.saturn.resources.directoryResource.DirectoryResourcePackage#getDirectoryResource_CanRead()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2report displayType='none'"
   *        extendedMetaData="kind='attribute' name='canRead'"
   * @generated
   */
  boolean isCanRead();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isCanRead <em>Can Read</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Can Read</em>' attribute.
   * @see #isSetCanRead()
   * @see #unsetCanRead()
   * @see #isCanRead()
   * @generated
   */
  void setCanRead(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isCanRead <em>Can Read</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetCanRead()
   * @see #isCanRead()
   * @see #setCanRead(boolean)
   * @generated
   */
  void unsetCanRead();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isCanRead <em>Can Read</em>}' attribute is set.
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
   * @see com.ms.qaTools.saturn.resources.directoryResource.DirectoryResourcePackage#getDirectoryResource_CanWrite()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2report displayType='none'"
   *        extendedMetaData="kind='attribute' name='canWrite'"
   * @generated
   */
  boolean isCanWrite();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isCanWrite <em>Can Write</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Can Write</em>' attribute.
   * @see #isSetCanWrite()
   * @see #unsetCanWrite()
   * @see #isCanWrite()
   * @generated
   */
  void setCanWrite(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isCanWrite <em>Can Write</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetCanWrite()
   * @see #isCanWrite()
   * @see #setCanWrite(boolean)
   * @generated
   */
  void unsetCanWrite();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isCanWrite <em>Can Write</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Can Write</em>' attribute is set.
   * @see #unsetCanWrite()
   * @see #isCanWrite()
   * @see #setCanWrite(boolean)
   * @generated
   */
  boolean isSetCanWrite();

  /**
   * Returns the value of the '<em><b>Check Available Size</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Check Available Size</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Check Available Size</em>' attribute.
   * @see #isSetCheckAvailableSize()
   * @see #unsetCheckAvailableSize()
   * @see #setCheckAvailableSize(boolean)
   * @see com.ms.qaTools.saturn.resources.directoryResource.DirectoryResourcePackage#getDirectoryResource_CheckAvailableSize()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='checkAvailableSize'"
   * @generated
   */
  boolean isCheckAvailableSize();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isCheckAvailableSize <em>Check Available Size</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Check Available Size</em>' attribute.
   * @see #isSetCheckAvailableSize()
   * @see #unsetCheckAvailableSize()
   * @see #isCheckAvailableSize()
   * @generated
   */
  void setCheckAvailableSize(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isCheckAvailableSize <em>Check Available Size</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetCheckAvailableSize()
   * @see #isCheckAvailableSize()
   * @see #setCheckAvailableSize(boolean)
   * @generated
   */
  void unsetCheckAvailableSize();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isCheckAvailableSize <em>Check Available Size</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Check Available Size</em>' attribute is set.
   * @see #unsetCheckAvailableSize()
   * @see #isCheckAvailableSize()
   * @see #setCheckAvailableSize(boolean)
   * @generated
   */
  boolean isSetCheckAvailableSize();

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
   * @see com.ms.qaTools.saturn.resources.directoryResource.DirectoryResourcePackage#getDirectoryResource_Create()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2report displayType='none'"
   *        extendedMetaData="kind='attribute' name='create'"
   * @generated
   */
  boolean isCreate();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isCreate <em>Create</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Create</em>' attribute.
   * @see #isSetCreate()
   * @see #unsetCreate()
   * @see #isCreate()
   * @generated
   */
  void setCreate(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isCreate <em>Create</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetCreate()
   * @see #isCreate()
   * @see #setCreate(boolean)
   * @generated
   */
  void unsetCreate();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isCreate <em>Create</em>}' attribute is set.
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
   * @see com.ms.qaTools.saturn.resources.directoryResource.DirectoryResourcePackage#getDirectoryResource_Exists()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2report displayType='none'"
   *        extendedMetaData="kind='attribute' name='exists'"
   * @generated
   */
  boolean isExists();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isExists <em>Exists</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Exists</em>' attribute.
   * @see #isSetExists()
   * @see #unsetExists()
   * @see #isExists()
   * @generated
   */
  void setExists(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isExists <em>Exists</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetExists()
   * @see #isExists()
   * @see #setExists(boolean)
   * @generated
   */
  void unsetExists();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isExists <em>Exists</em>}' attribute is set.
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
   * @see com.ms.qaTools.saturn.resources.directoryResource.DirectoryResourcePackage#getDirectoryResource_Filter()
   * @model default="*" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Token"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2report displayType='none'"
   *        extendedMetaData="kind='attribute' name='filter'"
   * @generated
   */
  String getFilter();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#getFilter <em>Filter</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' attribute.
   * @see #isSetFilter()
   * @see #unsetFilter()
   * @see #getFilter()
   * @generated
   */
  void setFilter(String value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#getFilter <em>Filter</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetFilter()
   * @see #getFilter()
   * @see #setFilter(String)
   * @generated
   */
  void unsetFilter();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#getFilter <em>Filter</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Filter</em>' attribute is set.
   * @see #unsetFilter()
   * @see #getFilter()
   * @see #setFilter(String)
   * @generated
   */
  boolean isSetFilter();

} // DirectoryResource
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
