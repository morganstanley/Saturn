package com.ms.qaTools.saturn.modules.soapIOModule.impl;

import com.ms.qaTools.saturn.modules.soapIOModule.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.ms.qaTools.saturn.modules.soapIOModule.DocumentRoot;
import com.ms.qaTools.saturn.modules.soapIOModule.PerlTerminationCondition;
import com.ms.qaTools.saturn.modules.soapIOModule.SoapIOConfiguration;
import com.ms.qaTools.saturn.modules.soapIOModule.SoapIOGetOperation;
import com.ms.qaTools.saturn.modules.soapIOModule.SoapIOModuleFactory;
import com.ms.qaTools.saturn.modules.soapIOModule.SoapIOModulePackage;
import com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutAndGetOperation;
import com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutOperation;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class SoapIOModuleFactoryImpl extends EFactoryImpl implements SoapIOModuleFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static SoapIOModuleFactory init()
  {
    try
    {
      SoapIOModuleFactory theSoapIOModuleFactory = (SoapIOModuleFactory)EPackage.Registry.INSTANCE.getEFactory(SoapIOModulePackage.eNS_URI);
      if (theSoapIOModuleFactory != null)
      {
        return theSoapIOModuleFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SoapIOModuleFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SoapIOModuleFactoryImpl()
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
      case SoapIOModulePackage.DOCUMENT_ROOT: return createDocumentRoot();
      case SoapIOModulePackage.PERL_TERMINATION_CONDITION: return createPerlTerminationCondition();
      case SoapIOModulePackage.SOAP_IO_CONFIGURATION: return createSoapIOConfiguration();
      case SoapIOModulePackage.SOAP_IO_GET_OPERATION: return createSoapIOGetOperation();
      case SoapIOModulePackage.SOAP_IO_PUT_AND_GET_OPERATION: return createSoapIOPutAndGetOperation();
      case SoapIOModulePackage.SOAP_IO_PUT_OPERATION: return createSoapIOPutOperation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DocumentRoot createDocumentRoot()
  {
    DocumentRootImpl documentRoot = new DocumentRootImpl();
    return documentRoot;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PerlTerminationCondition createPerlTerminationCondition()
  {
    PerlTerminationConditionImpl perlTerminationCondition = new PerlTerminationConditionImpl();
    return perlTerminationCondition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SoapIOConfiguration createSoapIOConfiguration()
  {
    SoapIOConfigurationImpl soapIOConfiguration = new SoapIOConfigurationImpl();
    return soapIOConfiguration;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SoapIOGetOperation createSoapIOGetOperation()
  {
    SoapIOGetOperationImpl soapIOGetOperation = new SoapIOGetOperationImpl();
    return soapIOGetOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SoapIOPutAndGetOperation createSoapIOPutAndGetOperation()
  {
    SoapIOPutAndGetOperationImpl soapIOPutAndGetOperation = new SoapIOPutAndGetOperationImpl();
    return soapIOPutAndGetOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SoapIOPutOperation createSoapIOPutOperation()
  {
    SoapIOPutOperationImpl soapIOPutOperation = new SoapIOPutOperationImpl();
    return soapIOPutOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SoapIOModulePackage getSoapIOModulePackage()
  {
    return (SoapIOModulePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SoapIOModulePackage getPackage()
  {
    return SoapIOModulePackage.eINSTANCE;
  }

} // SoapIOModuleFactoryImpl
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
