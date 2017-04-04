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
package com.ms.qaTools.saturn.resources.mapperResource;

import com.ms.qaTools.saturn.types.NamedResourceDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validator Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.mapperResource.ValidatorResource#getLeftResource <em>Left Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.mapperResource.ValidatorResource#getRightResource <em>Right Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.mapperResource.ValidatorResource#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.resources.mapperResource.MapperResourcePackage#getValidatorResource()
 * @model extendedMetaData="name='ValidatorResource' kind='elementOnly'"
 * @generated
 */
public interface ValidatorResource extends NamedResourceDefinition
{
  /**
   * Returns the value of the '<em><b>Left Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Resource</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Resource</em>' containment reference.
   * @see #setLeftResource(NamedResourceDefinition)
   * @see com.ms.qaTools.saturn.resources.mapperResource.MapperResourcePackage#getValidatorResource_LeftResource()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='LeftResource' namespace='##targetNamespace'"
   * @generated
   */
  NamedResourceDefinition getLeftResource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.mapperResource.ValidatorResource#getLeftResource <em>Left Resource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Resource</em>' containment reference.
   * @see #getLeftResource()
   * @generated
   */
  void setLeftResource(NamedResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Right Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Resource</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Resource</em>' containment reference.
   * @see #setRightResource(NamedResourceDefinition)
   * @see com.ms.qaTools.saturn.resources.mapperResource.MapperResourcePackage#getValidatorResource_RightResource()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='RightResource' namespace='##targetNamespace'"
   * @generated
   */
  NamedResourceDefinition getRightResource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.mapperResource.ValidatorResource#getRightResource <em>Right Resource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Resource</em>' containment reference.
   * @see #getRightResource()
   * @generated
   */
  void setRightResource(NamedResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Configuration</em>' containment reference.
   * @see #setConfiguration(NamedResourceDefinition)
   * @see com.ms.qaTools.saturn.resources.mapperResource.MapperResourcePackage#getValidatorResource_Configuration()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Configuration' namespace='##targetNamespace'"
   * @generated
   */
  NamedResourceDefinition getConfiguration();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.mapperResource.ValidatorResource#getConfiguration <em>Configuration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Configuration</em>' containment reference.
   * @see #getConfiguration()
   * @generated
   */
  void setConfiguration(NamedResourceDefinition value);

} // ValidatorResource
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
