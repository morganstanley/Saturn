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
package com.ms.qaTools.saturn.resources.fileResource;

import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>FIX File</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.fileResource.FIXFile#getSeparator <em>Separator</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.fileResource.FIXFile#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.fileResource.FIXFile#isDoValidation <em>Do Validation</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage#getFIXFile()
 * @model extendedMetaData="name='FIXFile' kind='elementOnly'"
 * @generated
 */
public interface FIXFile extends DataSetFile
{
  /**
   * Returns the value of the '<em><b>Separator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Separator</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Separator</em>' containment reference.
   * @see #setSeparator(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage#getFIXFile_Separator()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Separator' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getSeparator();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.FIXFile#getSeparator <em>Separator</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Separator</em>' containment reference.
   * @see #getSeparator()
   * @generated
   */
  void setSeparator(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Dictionary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dictionary</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dictionary</em>' containment reference.
   * @see #setDictionary(ResourceDefinition)
   * @see com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage#getFIXFile_Dictionary()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Dictionary' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getDictionary();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.FIXFile#getDictionary <em>Dictionary</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dictionary</em>' containment reference.
   * @see #getDictionary()
   * @generated
   */
  void setDictionary(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Do Validation</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Do Validation</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Do Validation</em>' attribute.
   * @see #isSetDoValidation()
   * @see #unsetDoValidation()
   * @see #setDoValidation(boolean)
   * @see com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage#getFIXFile_DoValidation()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='doValidation'"
   * @generated
   */
  boolean isDoValidation();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.FIXFile#isDoValidation <em>Do Validation</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Do Validation</em>' attribute.
   * @see #isSetDoValidation()
   * @see #unsetDoValidation()
   * @see #isDoValidation()
   * @generated
   */
  void setDoValidation(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.FIXFile#isDoValidation <em>Do Validation</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetDoValidation()
   * @see #isDoValidation()
   * @see #setDoValidation(boolean)
   * @generated
   */
  void unsetDoValidation();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.FIXFile#isDoValidation <em>Do Validation</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Do Validation</em>' attribute is set.
   * @see #unsetDoValidation()
   * @see #isDoValidation()
   * @see #setDoValidation(boolean)
   * @generated
   */
  boolean isSetDoValidation();

} // FIXFile
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
