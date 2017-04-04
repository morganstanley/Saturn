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
package com.ms.qaTools.saturn.types;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Device Resource Definition</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.types.DeviceResourceDefinition#isInitialize <em>Initialize</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.types.DeviceResourceDefinition#isIsInline <em>Is Inline</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.types.TypesPackage#getDeviceResourceDefinition()
 * @model abstract="true"
 *        extendedMetaData="name='DeviceResourceDefinition' kind='empty'"
 * @generated
 */
public interface DeviceResourceDefinition extends NamedResourceDefinition
{
  /**
   * Returns the value of the '<em><b>Initialize</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initialize</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Initialize</em>' attribute.
   * @see #isSetInitialize()
   * @see #unsetInitialize()
   * @see #setInitialize(boolean)
   * @see com.ms.qaTools.saturn.types.TypesPackage#getDeviceResourceDefinition_Initialize()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='initialize'"
   * @generated
   */
  boolean isInitialize();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.types.DeviceResourceDefinition#isInitialize <em>Initialize</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Initialize</em>' attribute.
   * @see #isSetInitialize()
   * @see #unsetInitialize()
   * @see #isInitialize()
   * @generated
   */
  void setInitialize(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.types.DeviceResourceDefinition#isInitialize <em>Initialize</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetInitialize()
   * @see #isInitialize()
   * @see #setInitialize(boolean)
   * @generated
   */
  void unsetInitialize();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.types.DeviceResourceDefinition#isInitialize <em>Initialize</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Initialize</em>' attribute is set.
   * @see #unsetInitialize()
   * @see #isInitialize()
   * @see #setInitialize(boolean)
   * @generated
   */
  boolean isSetInitialize();

  /**
   * Returns the value of the '<em><b>Is Inline</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Inline</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Is Inline</em>' attribute.
   * @see #isSetIsInline()
   * @see #unsetIsInline()
   * @see #setIsInline(boolean)
   * @see com.ms.qaTools.saturn.types.TypesPackage#getDeviceResourceDefinition_IsInline()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='isInline'"
   * @generated
   */
  boolean isIsInline();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.types.DeviceResourceDefinition#isIsInline <em>Is Inline</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Inline</em>' attribute.
   * @see #isSetIsInline()
   * @see #unsetIsInline()
   * @see #isIsInline()
   * @generated
   */
  void setIsInline(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.types.DeviceResourceDefinition#isIsInline <em>Is Inline</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetIsInline()
   * @see #isIsInline()
   * @see #setIsInline(boolean)
   * @generated
   */
  void unsetIsInline();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.types.DeviceResourceDefinition#isIsInline <em>Is Inline</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Is Inline</em>' attribute is set.
   * @see #unsetIsInline()
   * @see #isIsInline()
   * @see #setIsInline(boolean)
   * @generated
   */
  boolean isSetIsInline();

} // DeviceResourceDefinition
