package com.ms.qaTools.saturn.resources.semaphoreResource;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Semaphore Definition</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreDefinition#getName <em>Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreDefinition#getCount <em>Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreResourcePackage#getSemaphoreDefinition()
 * @model extendedMetaData="name='SemaphoreDefinition' kind='elementOnly'"
 * @generated
 */
public interface SemaphoreDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreResourcePackage#getSemaphoreDefinition_Name()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreDefinition#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Count</b></em>' attribute. The default value is <code>"1"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Count</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Count</em>' attribute.
   * @see #isSetCount()
   * @see #unsetCount()
   * @see #setCount(BigInteger)
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreResourcePackage#getSemaphoreDefinition_Count()
   * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='count'"
   * @generated
   */
  BigInteger getCount();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreDefinition#getCount <em>Count</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Count</em>' attribute.
   * @see #isSetCount()
   * @see #unsetCount()
   * @see #getCount()
   * @generated
   */
  void setCount(BigInteger value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreDefinition#getCount <em>Count</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetCount()
   * @see #getCount()
   * @see #setCount(BigInteger)
   * @generated
   */
  void unsetCount();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreDefinition#getCount <em>Count</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Count</em>' attribute is set.
   * @see #unsetCount()
   * @see #getCount()
   * @see #setCount(BigInteger)
   * @generated
   */
  boolean isSetCount();

} // SemaphoreDefinition
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
