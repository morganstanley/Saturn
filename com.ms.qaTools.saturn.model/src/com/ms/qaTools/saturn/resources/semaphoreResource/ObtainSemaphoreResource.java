package com.ms.qaTools.saturn.resources.semaphoreResource;

import java.math.BigInteger;

import com.ms.qaTools.saturn.types.NamedResourceDefinition;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Obtain Semaphore Resource</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.semaphoreResource.ObtainSemaphoreResource#getSemaphoreResource <em>Semaphore Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.semaphoreResource.ObtainSemaphoreResource#getSemaphoreName <em>Semaphore Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.semaphoreResource.ObtainSemaphoreResource#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.semaphoreResource.ObtainSemaphoreResource#isReleaseAtEndOfScope <em>Release At End Of Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreResourcePackage#getObtainSemaphoreResource()
 * @model extendedMetaData="name='ObtainSemaphoreResource' kind='elementOnly'"
 * @generated
 */
public interface ObtainSemaphoreResource extends NamedResourceDefinition
{
  /**
   * Returns the value of the '<em><b>Semaphore Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Semaphore Resource</em>' containment reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Semaphore Resource</em>' containment reference.
   * @see #setSemaphoreResource(NamedResourceDefinition)
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreResourcePackage#getObtainSemaphoreResource_SemaphoreResource()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='SemaphoreResource' namespace='##targetNamespace'"
   * @generated
   */
  NamedResourceDefinition getSemaphoreResource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.semaphoreResource.ObtainSemaphoreResource#getSemaphoreResource <em>Semaphore Resource</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Semaphore Resource</em>' containment reference.
   * @see #getSemaphoreResource()
   * @generated
   */
  void setSemaphoreResource(NamedResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Semaphore Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Semaphore Name</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Semaphore Name</em>' attribute.
   * @see #setSemaphoreName(String)
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreResourcePackage#getObtainSemaphoreResource_SemaphoreName()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='SemaphoreName' namespace='##targetNamespace'"
   * @generated
   */
  String getSemaphoreName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.semaphoreResource.ObtainSemaphoreResource#getSemaphoreName <em>Semaphore Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Semaphore Name</em>' attribute.
   * @see #getSemaphoreName()
   * @generated
   */
  void setSemaphoreName(String value);

  /**
   * Returns the value of the '<em><b>Release At End Of Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Release At End Of Scope</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Release At End Of Scope</em>' attribute.
   * @see #isSetReleaseAtEndOfScope()
   * @see #unsetReleaseAtEndOfScope()
   * @see #setReleaseAtEndOfScope(boolean)
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreResourcePackage#getObtainSemaphoreResource_ReleaseAtEndOfScope()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='releaseAtEndOfScope'"
   * @generated
   */
  boolean isReleaseAtEndOfScope();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.semaphoreResource.ObtainSemaphoreResource#isReleaseAtEndOfScope <em>Release At End Of Scope</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Release At End Of Scope</em>' attribute.
   * @see #isSetReleaseAtEndOfScope()
   * @see #unsetReleaseAtEndOfScope()
   * @see #isReleaseAtEndOfScope()
   * @generated
   */
  void setReleaseAtEndOfScope(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.semaphoreResource.ObtainSemaphoreResource#isReleaseAtEndOfScope <em>Release At End Of Scope</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetReleaseAtEndOfScope()
   * @see #isReleaseAtEndOfScope()
   * @see #setReleaseAtEndOfScope(boolean)
   * @generated
   */
  void unsetReleaseAtEndOfScope();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.semaphoreResource.ObtainSemaphoreResource#isReleaseAtEndOfScope <em>Release At End Of Scope</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Release At End Of Scope</em>' attribute is set.
   * @see #unsetReleaseAtEndOfScope()
   * @see #isReleaseAtEndOfScope()
   * @see #setReleaseAtEndOfScope(boolean)
   * @generated
   */
  boolean isSetReleaseAtEndOfScope();

  /**
   * Returns the value of the '<em><b>Timeout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timeout</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timeout</em>' attribute.
   * @see #setTimeout(BigInteger)
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreResourcePackage#getObtainSemaphoreResource_Timeout()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='timeout'"
   * @generated
   */
  BigInteger getTimeout();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.semaphoreResource.ObtainSemaphoreResource#getTimeout <em>Timeout</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Timeout</em>' attribute.
   * @see #getTimeout()
   * @generated
   */
  void setTimeout(BigInteger value);

} // ObtainSemaphoreResource
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
