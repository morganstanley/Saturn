package com.ms.qaTools.saturn.resources.documentumResource;

import com.ms.qaTools.saturn.types.DeviceResourceDefinition;
import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Documentum Resource</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#getBase <em>Base</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#getUserName <em>User Name</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#getPassword <em>Password</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#getFolder <em>Folder</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#getDocument <em>Document</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#getFile <em>File</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#isDebug <em>Debug</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#isTemporary <em>Temporary</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.resources.documentumResource.DocumentumResourcePackage#getDocumentumResource()
 * @model annotation="http://www.ms.com/2006/pdsttools/xsd2perl package='Saturn::Resource::Documentum'"
 *        extendedMetaData="name='DocumentumResource' kind='elementOnly'"
 * @generated
 */
public interface DocumentumResource extends DeviceResourceDefinition
{
  /**
   * Returns the value of the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base</em>' containment reference.
   * @see #setBase(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.documentumResource.DocumentumResourcePackage#getDocumentumResource_Base()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Base' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getBase();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#getBase <em>Base</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' containment reference.
   * @see #getBase()
   * @generated
   */
  void setBase(ComplexValue value);

  /**
   * Returns the value of the '<em><b>User Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>User Name</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>User Name</em>' containment reference.
   * @see #setUserName(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.documentumResource.DocumentumResourcePackage#getDocumentumResource_UserName()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='UserName' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getUserName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#getUserName <em>User Name</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>User Name</em>' containment reference.
   * @see #getUserName()
   * @generated
   */
  void setUserName(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Password</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Password</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Password</em>' containment reference.
   * @see #setPassword(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.documentumResource.DocumentumResourcePackage#getDocumentumResource_Password()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Password' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getPassword();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#getPassword <em>Password</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Password</em>' containment reference.
   * @see #getPassword()
   * @generated
   */
  void setPassword(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Folder</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Folder</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Folder</em>' containment reference.
   * @see #setFolder(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.documentumResource.DocumentumResourcePackage#getDocumentumResource_Folder()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Folder' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getFolder();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#getFolder <em>Folder</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Folder</em>' containment reference.
   * @see #getFolder()
   * @generated
   */
  void setFolder(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Document</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Document</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Document</em>' containment reference.
   * @see #setDocument(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.documentumResource.DocumentumResourcePackage#getDocumentumResource_Document()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Document' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getDocument();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#getDocument <em>Document</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Document</em>' containment reference.
   * @see #getDocument()
   * @generated
   */
  void setDocument(ComplexValue value);

  /**
   * Returns the value of the '<em><b>File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File</em>' containment reference.
   * @see #setFile(ResourceDefinition)
   * @see com.ms.qaTools.saturn.resources.documentumResource.DocumentumResourcePackage#getDocumentumResource_File()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='File' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getFile();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#getFile <em>File</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>File</em>' containment reference.
   * @see #getFile()
   * @generated
   */
  void setFile(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Debug</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Debug</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Debug</em>' attribute.
   * @see #isSetDebug()
   * @see #unsetDebug()
   * @see #setDebug(boolean)
   * @see com.ms.qaTools.saturn.resources.documentumResource.DocumentumResourcePackage#getDocumentumResource_Debug()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='debug'"
   * @generated
   */
  boolean isDebug();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#isDebug <em>Debug</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Debug</em>' attribute.
   * @see #isSetDebug()
   * @see #unsetDebug()
   * @see #isDebug()
   * @generated
   */
  void setDebug(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#isDebug <em>Debug</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetDebug()
   * @see #isDebug()
   * @see #setDebug(boolean)
   * @generated
   */
  void unsetDebug();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#isDebug <em>Debug</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Debug</em>' attribute is set.
   * @see #unsetDebug()
   * @see #isDebug()
   * @see #setDebug(boolean)
   * @generated
   */
  boolean isSetDebug();

  /**
   * Returns the value of the '<em><b>Temporary</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Temporary</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Temporary</em>' attribute.
   * @see #isSetTemporary()
   * @see #unsetTemporary()
   * @see #setTemporary(boolean)
   * @see com.ms.qaTools.saturn.resources.documentumResource.DocumentumResourcePackage#getDocumentumResource_Temporary()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='temporary'"
   * @generated
   */
  boolean isTemporary();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#isTemporary <em>Temporary</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Temporary</em>' attribute.
   * @see #isSetTemporary()
   * @see #unsetTemporary()
   * @see #isTemporary()
   * @generated
   */
  void setTemporary(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#isTemporary <em>Temporary</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetTemporary()
   * @see #isTemporary()
   * @see #setTemporary(boolean)
   * @generated
   */
  void unsetTemporary();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#isTemporary <em>Temporary</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Temporary</em>' attribute is set.
   * @see #unsetTemporary()
   * @see #isTemporary()
   * @see #setTemporary(boolean)
   * @generated
   */
  boolean isSetTemporary();

} // DocumentumResource
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
