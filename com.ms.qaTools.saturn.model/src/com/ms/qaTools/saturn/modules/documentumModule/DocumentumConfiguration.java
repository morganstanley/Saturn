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
package com.ms.qaTools.saturn.modules.documentumModule;

import org.eclipse.emf.ecore.EObject;

import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Documentum Configuration</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#getBase <em>Base</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#getUsername <em>Username</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#getPassword <em>Password</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#getFolder <em>Folder</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#getDocument <em>Document</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#getFile <em>File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#isDebug <em>Debug</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.documentumModule.DocumentumModulePackage#getDocumentumConfiguration()
 * @model extendedMetaData="name='Configuration_._type' kind='elementOnly'"
 * @generated
 */
public interface DocumentumConfiguration extends EObject
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
   * @see com.ms.qaTools.saturn.modules.documentumModule.DocumentumModulePackage#getDocumentumConfiguration_Base()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Base' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getBase();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#getBase <em>Base</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' containment reference.
   * @see #getBase()
   * @generated
   */
  void setBase(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Username</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Username</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Username</em>' containment reference.
   * @see #setUsername(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.documentumModule.DocumentumModulePackage#getDocumentumConfiguration_Username()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Username' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getUsername();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#getUsername <em>Username</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Username</em>' containment reference.
   * @see #getUsername()
   * @generated
   */
  void setUsername(ComplexValue value);

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
   * @see com.ms.qaTools.saturn.modules.documentumModule.DocumentumModulePackage#getDocumentumConfiguration_Password()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Password' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getPassword();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#getPassword <em>Password</em>}' containment reference.
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
   * @see com.ms.qaTools.saturn.modules.documentumModule.DocumentumModulePackage#getDocumentumConfiguration_Folder()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Folder' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getFolder();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#getFolder <em>Folder</em>}' containment reference.
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
   * @see com.ms.qaTools.saturn.modules.documentumModule.DocumentumModulePackage#getDocumentumConfiguration_Document()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Document' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getDocument();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#getDocument <em>Document</em>}' containment reference.
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
   * @see com.ms.qaTools.saturn.modules.documentumModule.DocumentumModulePackage#getDocumentumConfiguration_File()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='File' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getFile();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#getFile <em>File</em>}' containment reference.
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
   * @see com.ms.qaTools.saturn.modules.documentumModule.DocumentumModulePackage#getDocumentumConfiguration_Debug()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='debug'"
   * @generated
   */
  boolean isDebug();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#isDebug <em>Debug</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Debug</em>' attribute.
   * @see #isSetDebug()
   * @see #unsetDebug()
   * @see #isDebug()
   * @generated
   */
  void setDebug(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#isDebug <em>Debug</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetDebug()
   * @see #isDebug()
   * @see #setDebug(boolean)
   * @generated
   */
  void unsetDebug();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#isDebug <em>Debug</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Debug</em>' attribute is set.
   * @see #unsetDebug()
   * @see #isDebug()
   * @see #setDebug(boolean)
   * @generated
   */
  boolean isSetDebug();

} // DocumentumConfiguration
