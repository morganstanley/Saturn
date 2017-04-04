package com.ms.qaTools.saturn.modules.cpsModule.impl;

import com.ms.qaTools.saturn.modules.cpsModule.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.ms.qaTools.saturn.modules.cpsModule.CpsConfiguration;
import com.ms.qaTools.saturn.modules.cpsModule.CpsGetOperation;
import com.ms.qaTools.saturn.modules.cpsModule.CpsModuleFactory;
import com.ms.qaTools.saturn.modules.cpsModule.CpsModulePackage;
import com.ms.qaTools.saturn.modules.cpsModule.CpsPutOperation;
import com.ms.qaTools.saturn.modules.cpsModule.CpsSowDeleteOperation;
import com.ms.qaTools.saturn.modules.cpsModule.CpsSubscribeOperation;
import com.ms.qaTools.saturn.modules.cpsModule.CpsUnsubscribeOperation;
import com.ms.qaTools.saturn.modules.cpsModule.DocumentRoot;
import com.ms.qaTools.saturn.modules.cpsModule.GroovyTerminationCondition;
import com.ms.qaTools.saturn.modules.cpsModule.PerlTerminationCondition;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class CpsModuleFactoryImpl extends EFactoryImpl implements CpsModuleFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static CpsModuleFactory init()
  {
    try
    {
      CpsModuleFactory theCpsModuleFactory = (CpsModuleFactory)EPackage.Registry.INSTANCE.getEFactory(CpsModulePackage.eNS_URI);
      if (theCpsModuleFactory != null)
      {
        return theCpsModuleFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CpsModuleFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CpsModuleFactoryImpl()
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
      case CpsModulePackage.CPS_CONFIGURATION: return createCpsConfiguration();
      case CpsModulePackage.CPS_GET_OPERATION: return createCpsGetOperation();
      case CpsModulePackage.CPS_PUT_OPERATION: return createCpsPutOperation();
      case CpsModulePackage.CPS_SOW_DELETE_OPERATION: return createCpsSowDeleteOperation();
      case CpsModulePackage.CPS_SUBSCRIBE_OPERATION: return createCpsSubscribeOperation();
      case CpsModulePackage.CPS_UNSUBSCRIBE_OPERATION: return createCpsUnsubscribeOperation();
      case CpsModulePackage.DOCUMENT_ROOT: return createDocumentRoot();
      case CpsModulePackage.GROOVY_TERMINATION_CONDITION: return createGroovyTerminationCondition();
      case CpsModulePackage.PERL_TERMINATION_CONDITION: return createPerlTerminationCondition();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CpsConfiguration createCpsConfiguration()
  {
    CpsConfigurationImpl cpsConfiguration = new CpsConfigurationImpl();
    return cpsConfiguration;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CpsGetOperation createCpsGetOperation()
  {
    CpsGetOperationImpl cpsGetOperation = new CpsGetOperationImpl();
    return cpsGetOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CpsPutOperation createCpsPutOperation()
  {
    CpsPutOperationImpl cpsPutOperation = new CpsPutOperationImpl();
    return cpsPutOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CpsSowDeleteOperation createCpsSowDeleteOperation()
  {
    CpsSowDeleteOperationImpl cpsSowDeleteOperation = new CpsSowDeleteOperationImpl();
    return cpsSowDeleteOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CpsSubscribeOperation createCpsSubscribeOperation()
  {
    CpsSubscribeOperationImpl cpsSubscribeOperation = new CpsSubscribeOperationImpl();
    return cpsSubscribeOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CpsUnsubscribeOperation createCpsUnsubscribeOperation()
  {
    CpsUnsubscribeOperationImpl cpsUnsubscribeOperation = new CpsUnsubscribeOperationImpl();
    return cpsUnsubscribeOperation;
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
  public GroovyTerminationCondition createGroovyTerminationCondition()
  {
    GroovyTerminationConditionImpl groovyTerminationCondition = new GroovyTerminationConditionImpl();
    return groovyTerminationCondition;
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
  public CpsModulePackage getCpsModulePackage()
  {
    return (CpsModulePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CpsModulePackage getPackage()
  {
    return CpsModulePackage.eINSTANCE;
  }

} // CpsModuleFactoryImpl
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
