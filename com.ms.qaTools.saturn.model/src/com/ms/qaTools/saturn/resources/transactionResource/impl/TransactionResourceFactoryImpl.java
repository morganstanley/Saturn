package com.ms.qaTools.saturn.resources.transactionResource.impl;

import com.ms.qaTools.saturn.resources.transactionResource.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.ms.qaTools.saturn.resources.transactionResource.CustomTerminationEvent;
import com.ms.qaTools.saturn.resources.transactionResource.TerminationEvent;
import com.ms.qaTools.saturn.resources.transactionResource.TransactionResource;
import com.ms.qaTools.saturn.resources.transactionResource.TransactionResourceFactory;
import com.ms.qaTools.saturn.resources.transactionResource.TransactionResourcePackage;
import com.ms.qaTools.saturn.resources.transactionResource.TransactionTermination;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class TransactionResourceFactoryImpl extends EFactoryImpl implements TransactionResourceFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static TransactionResourceFactory init()
  {
    try
    {
      TransactionResourceFactory theTransactionResourceFactory = (TransactionResourceFactory)EPackage.Registry.INSTANCE.getEFactory(TransactionResourcePackage.eNS_URI);
      if (theTransactionResourceFactory != null)
      {
        return theTransactionResourceFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TransactionResourceFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TransactionResourceFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TransactionResourcePackage.CUSTOM_TERMINATION_EVENT: return createCustomTerminationEvent();
      case TransactionResourcePackage.TERMINATION_EVENT: return createTerminationEvent();
      case TransactionResourcePackage.TRANSACTION_RESOURCE: return createTransactionResource();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TransactionResourcePackage.TRANSACTION_TERMINATION:
        return createTransactionTerminationFromString(eDataType, initialValue);
      case TransactionResourcePackage.TRANSACTION_TERMINATION_OBJECT:
        return createTransactionTerminationObjectFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TransactionResourcePackage.TRANSACTION_TERMINATION:
        return convertTransactionTerminationToString(eDataType, instanceValue);
      case TransactionResourcePackage.TRANSACTION_TERMINATION_OBJECT:
        return convertTransactionTerminationObjectToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CustomTerminationEvent createCustomTerminationEvent()
  {
    CustomTerminationEventImpl customTerminationEvent = new CustomTerminationEventImpl();
    return customTerminationEvent;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TerminationEvent createTerminationEvent()
  {
    TerminationEventImpl terminationEvent = new TerminationEventImpl();
    return terminationEvent;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TransactionResource createTransactionResource()
  {
    TransactionResourceImpl transactionResource = new TransactionResourceImpl();
    return transactionResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TransactionTermination createTransactionTerminationFromString(EDataType eDataType, String initialValue)
  {
    TransactionTermination result = TransactionTermination.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertTransactionTerminationToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TransactionTermination createTransactionTerminationObjectFromString(EDataType eDataType, String initialValue)
  {
    return createTransactionTerminationFromString(TransactionResourcePackage.Literals.TRANSACTION_TERMINATION, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertTransactionTerminationObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertTransactionTerminationToString(TransactionResourcePackage.Literals.TRANSACTION_TERMINATION, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TransactionResourcePackage getTransactionResourcePackage()
  {
    return (TransactionResourcePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TransactionResourcePackage getPackage()
  {
    return TransactionResourcePackage.eINSTANCE;
  }

} // TransactionResourceFactoryImpl
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
