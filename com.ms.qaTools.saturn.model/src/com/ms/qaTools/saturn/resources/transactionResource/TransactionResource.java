package com.ms.qaTools.saturn.resources.transactionResource;

import com.ms.qaTools.saturn.types.NamedResourceDefinition;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Transaction Resource</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.transactionResource.TransactionResource#getManagedResource <em>Managed Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.transactionResource.TransactionResource#getTermination <em>Termination</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.resources.transactionResource.TransactionResourcePackage#getTransactionResource()
 * @model extendedMetaData="name='TransactionResource' kind='elementOnly'"
 * @generated
 */
public interface TransactionResource extends NamedResourceDefinition
{
  /**
   * Returns the value of the '<em><b>Managed Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Managed Resource</em>' containment reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Managed Resource</em>' containment reference.
   * @see #setManagedResource(NamedResourceDefinition)
   * @see com.ms.qaTools.saturn.resources.transactionResource.TransactionResourcePackage#getTransactionResource_ManagedResource()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='ManagedResource' namespace='##targetNamespace'"
   * @generated
   */
  NamedResourceDefinition getManagedResource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.transactionResource.TransactionResource#getManagedResource <em>Managed Resource</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Managed Resource</em>' containment reference.
   * @see #getManagedResource()
   * @generated
   */
  void setManagedResource(NamedResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Termination</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Termination</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Termination</em>' containment reference.
   * @see #setTermination(AbstractEvent)
   * @see com.ms.qaTools.saturn.resources.transactionResource.TransactionResourcePackage#getTransactionResource_Termination()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Termination' namespace='##targetNamespace'"
   * @generated
   */
  AbstractEvent getTermination();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.transactionResource.TransactionResource#getTermination <em>Termination</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Termination</em>' containment reference.
   * @see #getTermination()
   * @generated
   */
  void setTermination(AbstractEvent value);

} // TransactionResource
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
