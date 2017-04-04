package com.ms.qaTools.saturn.resources.transactionResource;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import com.ms.qaTools.saturn.types.TypesPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.resources.transactionResource.TransactionResourceFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface TransactionResourcePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                     eNAME                                      = "transactionResource";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                     eNS_URI                                    = "http://www.ms.com/2011/Saturn/Resources/Transaction";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                     eNS_PREFIX                                 = "transactionResource";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  TransactionResourcePackage eINSTANCE                                  = com.ms.qaTools.saturn.resources.transactionResource.impl.TransactionResourcePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.transactionResource.impl.AbstractEventImpl <em>Abstract Event</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.transactionResource.impl.AbstractEventImpl
   * @see com.ms.qaTools.saturn.resources.transactionResource.impl.TransactionResourcePackageImpl#getAbstractEvent()
   * @generated
   */
  int                        ABSTRACT_EVENT                             = 0;

  /**
   * The number of structural features of the '<em>Abstract Event</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                        ABSTRACT_EVENT_FEATURE_COUNT               = 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.transactionResource.impl.CustomTerminationEventImpl <em>Custom Termination Event</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.transactionResource.impl.CustomTerminationEventImpl
   * @see com.ms.qaTools.saturn.resources.transactionResource.impl.TransactionResourcePackageImpl#getCustomTerminationEvent()
   * @generated
   */
  int                        CUSTOM_TERMINATION_EVENT                   = 1;

  /**
   * The feature id for the '<em><b>Perl Code</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                        CUSTOM_TERMINATION_EVENT__PERL_CODE        = ABSTRACT_EVENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Custom Termination Event</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                        CUSTOM_TERMINATION_EVENT_FEATURE_COUNT     = ABSTRACT_EVENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.transactionResource.impl.TerminationEventImpl <em>Termination Event</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.transactionResource.impl.TerminationEventImpl
   * @see com.ms.qaTools.saturn.resources.transactionResource.impl.TransactionResourcePackageImpl#getTerminationEvent()
   * @generated
   */
  int                        TERMINATION_EVENT                          = 2;

  /**
   * The feature id for the '<em><b>On Pass</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                        TERMINATION_EVENT__ON_PASS                 = ABSTRACT_EVENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>On Fail</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                        TERMINATION_EVENT__ON_FAIL                 = ABSTRACT_EVENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>On Warn</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                        TERMINATION_EVENT__ON_WARN                 = ABSTRACT_EVENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Termination Event</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                        TERMINATION_EVENT_FEATURE_COUNT            = ABSTRACT_EVENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.transactionResource.impl.TransactionResourceImpl <em>Transaction Resource</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.transactionResource.impl.TransactionResourceImpl
   * @see com.ms.qaTools.saturn.resources.transactionResource.impl.TransactionResourcePackageImpl#getTransactionResource()
   * @generated
   */
  int                        TRANSACTION_RESOURCE                       = 3;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                        TRANSACTION_RESOURCE__ENABLED              = TypesPackage.NAMED_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                        TRANSACTION_RESOURCE__STATE                = TypesPackage.NAMED_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                        TRANSACTION_RESOURCE__CONNECTOR_PREFERENCE = TypesPackage.NAMED_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                        TRANSACTION_RESOURCE__NAME                 = TypesPackage.NAMED_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Managed Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                        TRANSACTION_RESOURCE__MANAGED_RESOURCE     = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Termination</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                        TRANSACTION_RESOURCE__TERMINATION          = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Transaction Resource</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                        TRANSACTION_RESOURCE_FEATURE_COUNT         = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.transactionResource.TransactionTermination <em>Transaction Termination</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.transactionResource.TransactionTermination
   * @see com.ms.qaTools.saturn.resources.transactionResource.impl.TransactionResourcePackageImpl#getTransactionTermination()
   * @generated
   */
  int                        TRANSACTION_TERMINATION                    = 4;

  /**
   * The meta object id for the '<em>Transaction Termination Object</em>' data type.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.transactionResource.TransactionTermination
   * @see com.ms.qaTools.saturn.resources.transactionResource.impl.TransactionResourcePackageImpl#getTransactionTerminationObject()
   * @generated
   */
  int                        TRANSACTION_TERMINATION_OBJECT             = 5;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.transactionResource.AbstractEvent <em>Abstract Event</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Event</em>'.
   * @see com.ms.qaTools.saturn.resources.transactionResource.AbstractEvent
   * @generated
   */
  EClass getAbstractEvent();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.transactionResource.CustomTerminationEvent <em>Custom Termination Event</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Termination Event</em>'.
   * @see com.ms.qaTools.saturn.resources.transactionResource.CustomTerminationEvent
   * @generated
   */
  EClass getCustomTerminationEvent();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.transactionResource.CustomTerminationEvent#getPerlCode <em>Perl Code</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Perl Code</em>'.
   * @see com.ms.qaTools.saturn.resources.transactionResource.CustomTerminationEvent#getPerlCode()
   * @see #getCustomTerminationEvent()
   * @generated
   */
  EReference getCustomTerminationEvent_PerlCode();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.transactionResource.TerminationEvent <em>Termination Event</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Termination Event</em>'.
   * @see com.ms.qaTools.saturn.resources.transactionResource.TerminationEvent
   * @generated
   */
  EClass getTerminationEvent();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.transactionResource.TerminationEvent#getOnFail <em>On Fail</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>On Fail</em>'.
   * @see com.ms.qaTools.saturn.resources.transactionResource.TerminationEvent#getOnFail()
   * @see #getTerminationEvent()
   * @generated
   */
  EAttribute getTerminationEvent_OnFail();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.transactionResource.TerminationEvent#getOnPass <em>On Pass</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>On Pass</em>'.
   * @see com.ms.qaTools.saturn.resources.transactionResource.TerminationEvent#getOnPass()
   * @see #getTerminationEvent()
   * @generated
   */
  EAttribute getTerminationEvent_OnPass();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.transactionResource.TerminationEvent#getOnWarn <em>On Warn</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>On Warn</em>'.
   * @see com.ms.qaTools.saturn.resources.transactionResource.TerminationEvent#getOnWarn()
   * @see #getTerminationEvent()
   * @generated
   */
  EAttribute getTerminationEvent_OnWarn();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.transactionResource.TransactionResource <em>Transaction Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Transaction Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.transactionResource.TransactionResource
   * @generated
   */
  EClass getTransactionResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.transactionResource.TransactionResource#getManagedResource <em>Managed Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Managed Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.transactionResource.TransactionResource#getManagedResource()
   * @see #getTransactionResource()
   * @generated
   */
  EReference getTransactionResource_ManagedResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.transactionResource.TransactionResource#getTermination <em>Termination</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Termination</em>'.
   * @see com.ms.qaTools.saturn.resources.transactionResource.TransactionResource#getTermination()
   * @see #getTransactionResource()
   * @generated
   */
  EReference getTransactionResource_Termination();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.resources.transactionResource.TransactionTermination <em>Transaction Termination</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Transaction Termination</em>'.
   * @see com.ms.qaTools.saturn.resources.transactionResource.TransactionTermination
   * @generated
   */
  EEnum getTransactionTermination();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.resources.transactionResource.TransactionTermination <em>Transaction Termination Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Transaction Termination Object</em>'.
   * @see com.ms.qaTools.saturn.resources.transactionResource.TransactionTermination
   * @model instanceClass="com.ms.qaTools.saturn.resources.transactionResource.TransactionTermination"
   *        extendedMetaData="name='TransactionTermination:Object' baseType='TransactionTermination'"
   * @generated
   */
  EDataType getTransactionTerminationObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TransactionResourceFactory getTransactionResourceFactory();

  /**
   * <!-- begin-user-doc --> Defines literals for the meta objects that represent
   * <ul>
   * <li>each class,</li>
   * <li>each feature of each class,</li>
   * <li>each enum,</li>
   * <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.transactionResource.impl.AbstractEventImpl <em>Abstract Event</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.transactionResource.impl.AbstractEventImpl
     * @see com.ms.qaTools.saturn.resources.transactionResource.impl.TransactionResourcePackageImpl#getAbstractEvent()
     * @generated
     */
    EClass     ABSTRACT_EVENT                         = eINSTANCE.getAbstractEvent();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.transactionResource.impl.CustomTerminationEventImpl <em>Custom Termination Event</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.transactionResource.impl.CustomTerminationEventImpl
     * @see com.ms.qaTools.saturn.resources.transactionResource.impl.TransactionResourcePackageImpl#getCustomTerminationEvent()
     * @generated
     */
    EClass     CUSTOM_TERMINATION_EVENT               = eINSTANCE.getCustomTerminationEvent();

    /**
     * The meta object literal for the '<em><b>Perl Code</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_TERMINATION_EVENT__PERL_CODE    = eINSTANCE.getCustomTerminationEvent_PerlCode();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.transactionResource.impl.TerminationEventImpl <em>Termination Event</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.transactionResource.impl.TerminationEventImpl
     * @see com.ms.qaTools.saturn.resources.transactionResource.impl.TransactionResourcePackageImpl#getTerminationEvent()
     * @generated
     */
    EClass     TERMINATION_EVENT                      = eINSTANCE.getTerminationEvent();

    /**
     * The meta object literal for the '<em><b>On Fail</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute TERMINATION_EVENT__ON_FAIL             = eINSTANCE.getTerminationEvent_OnFail();

    /**
     * The meta object literal for the '<em><b>On Pass</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute TERMINATION_EVENT__ON_PASS             = eINSTANCE.getTerminationEvent_OnPass();

    /**
     * The meta object literal for the '<em><b>On Warn</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute TERMINATION_EVENT__ON_WARN             = eINSTANCE.getTerminationEvent_OnWarn();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.transactionResource.impl.TransactionResourceImpl <em>Transaction Resource</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.transactionResource.impl.TransactionResourceImpl
     * @see com.ms.qaTools.saturn.resources.transactionResource.impl.TransactionResourcePackageImpl#getTransactionResource()
     * @generated
     */
    EClass     TRANSACTION_RESOURCE                   = eINSTANCE.getTransactionResource();

    /**
     * The meta object literal for the '<em><b>Managed Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference TRANSACTION_RESOURCE__MANAGED_RESOURCE = eINSTANCE.getTransactionResource_ManagedResource();

    /**
     * The meta object literal for the '<em><b>Termination</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSACTION_RESOURCE__TERMINATION      = eINSTANCE.getTransactionResource_Termination();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.transactionResource.TransactionTermination <em>Transaction Termination</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.transactionResource.TransactionTermination
     * @see com.ms.qaTools.saturn.resources.transactionResource.impl.TransactionResourcePackageImpl#getTransactionTermination()
     * @generated
     */
    EEnum      TRANSACTION_TERMINATION                = eINSTANCE.getTransactionTermination();

    /**
     * The meta object literal for the '<em>Transaction Termination Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.transactionResource.TransactionTermination
     * @see com.ms.qaTools.saturn.resources.transactionResource.impl.TransactionResourcePackageImpl#getTransactionTerminationObject()
     * @generated
     */
    EDataType  TRANSACTION_TERMINATION_OBJECT         = eINSTANCE.getTransactionTerminationObject();

  }

} // TransactionResourcePackage
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
