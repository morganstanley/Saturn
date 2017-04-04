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
package com.ms.qaTools.saturn.modules.envValidatorModule;

import org.eclipse.emf.ecore.EObject;

import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Resource Qualification</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.envValidatorModule.ResourceQualification#getResource <em>Resource</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.envValidatorModule.ResourceQualification#isEnabled <em>Enabled</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.envValidatorModule.ResourceQualification#isExecute <em>Execute</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.envValidatorModule.ResourceQualification#isRead <em>Read</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.envValidatorModule.ResourceQualification#isWrite <em>Write</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvValidatorModulePackage#getResourceQualification()
 * @model extendedMetaData="name='ResourceQualification' kind='elementOnly'"
 * @generated
 */
public interface ResourceQualification extends EObject
{
  /**
   * Returns the value of the '<em><b>Resource</b></em>' containment reference. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Resource</em>' containment reference.
   * @see #setResource(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvValidatorModulePackage#getResourceQualification_Resource()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Resource' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getResource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.ResourceQualification#getResource
   * <em>Resource</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Resource</em>' containment reference.
   * @see #getResource()
   * @generated
   */
  void setResource(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Enabled</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enabled</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Enabled</em>' attribute.
   * @see #isSetEnabled()
   * @see #unsetEnabled()
   * @see #setEnabled(boolean)
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvValidatorModulePackage#getResourceQualification_Enabled()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='enabled'"
   * @generated
   */
  boolean isEnabled();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.ResourceQualification#isEnabled
   * <em>Enabled</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Enabled</em>' attribute.
   * @see #isSetEnabled()
   * @see #unsetEnabled()
   * @see #isEnabled()
   * @generated
   */
  void setEnabled(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.ResourceQualification#isEnabled
   * <em>Enabled</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSetEnabled()
   * @see #isEnabled()
   * @see #setEnabled(boolean)
   * @generated
   */
  void unsetEnabled();

  /**
   * Returns whether the value of the '
   * {@link com.ms.qaTools.saturn.modules.envValidatorModule.ResourceQualification#isEnabled <em>Enabled</em>}'
   * attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return whether the value of the '<em>Enabled</em>' attribute is set.
   * @see #unsetEnabled()
   * @see #isEnabled()
   * @see #setEnabled(boolean)
   * @generated
   */
  boolean isSetEnabled();

  /**
   * Returns the value of the '<em><b>Execute</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Execute</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Execute</em>' attribute.
   * @see #isSetExecute()
   * @see #unsetExecute()
   * @see #setExecute(boolean)
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvValidatorModulePackage#getResourceQualification_Execute()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='execute'"
   * @generated
   */
  boolean isExecute();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.ResourceQualification#isExecute
   * <em>Execute</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Execute</em>' attribute.
   * @see #isSetExecute()
   * @see #unsetExecute()
   * @see #isExecute()
   * @generated
   */
  void setExecute(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.ResourceQualification#isExecute
   * <em>Execute</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSetExecute()
   * @see #isExecute()
   * @see #setExecute(boolean)
   * @generated
   */
  void unsetExecute();

  /**
   * Returns whether the value of the '
   * {@link com.ms.qaTools.saturn.modules.envValidatorModule.ResourceQualification#isExecute <em>Execute</em>}'
   * attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return whether the value of the '<em>Execute</em>' attribute is set.
   * @see #unsetExecute()
   * @see #isExecute()
   * @see #setExecute(boolean)
   * @generated
   */
  boolean isSetExecute();

  /**
   * Returns the value of the '<em><b>Read</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Read</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Read</em>' attribute.
   * @see #isSetRead()
   * @see #unsetRead()
   * @see #setRead(boolean)
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvValidatorModulePackage#getResourceQualification_Read()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='read'"
   * @generated
   */
  boolean isRead();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.ResourceQualification#isRead
   * <em>Read</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Read</em>' attribute.
   * @see #isSetRead()
   * @see #unsetRead()
   * @see #isRead()
   * @generated
   */
  void setRead(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.ResourceQualification#isRead
   * <em>Read</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSetRead()
   * @see #isRead()
   * @see #setRead(boolean)
   * @generated
   */
  void unsetRead();

  /**
   * Returns whether the value of the '
   * {@link com.ms.qaTools.saturn.modules.envValidatorModule.ResourceQualification#isRead <em>Read</em>}' attribute is
   * set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return whether the value of the '<em>Read</em>' attribute is set.
   * @see #unsetRead()
   * @see #isRead()
   * @see #setRead(boolean)
   * @generated
   */
  boolean isSetRead();

  /**
   * Returns the value of the '<em><b>Write</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Write</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Write</em>' attribute.
   * @see #isSetWrite()
   * @see #unsetWrite()
   * @see #setWrite(boolean)
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvValidatorModulePackage#getResourceQualification_Write()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='write'"
   * @generated
   */
  boolean isWrite();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.ResourceQualification#isWrite
   * <em>Write</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Write</em>' attribute.
   * @see #isSetWrite()
   * @see #unsetWrite()
   * @see #isWrite()
   * @generated
   */
  void setWrite(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.ResourceQualification#isWrite
   * <em>Write</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSetWrite()
   * @see #isWrite()
   * @see #setWrite(boolean)
   * @generated
   */
  void unsetWrite();

  /**
   * Returns whether the value of the '
   * {@link com.ms.qaTools.saturn.modules.envValidatorModule.ResourceQualification#isWrite <em>Write</em>}' attribute is
   * set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return whether the value of the '<em>Write</em>' attribute is set.
   * @see #unsetWrite()
   * @see #isWrite()
   * @see #setWrite(boolean)
   * @generated
   */
  boolean isSetWrite();

} // ResourceQualification
