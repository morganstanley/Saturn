package com.ms.qaTools.saturn.modules.psManagerModule.impl;

import com.ms.qaTools.saturn.modules.psManagerModule.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.ms.qaTools.saturn.modules.psManagerModule.CheckSessionDownOperation;
import com.ms.qaTools.saturn.modules.psManagerModule.CheckSessionUpOperation;
import com.ms.qaTools.saturn.modules.psManagerModule.DocumentRoot;
import com.ms.qaTools.saturn.modules.psManagerModule.LaunchProcessOperation;
import com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation;
import com.ms.qaTools.saturn.modules.psManagerModule.PsManagerConfiguration;
import com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModuleFactory;
import com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModulePackage;
import com.ms.qaTools.saturn.modules.psManagerModule.RemoveSessionOperation;
import com.ms.qaTools.saturn.modules.psManagerModule.TerminateProcessOperation;
import com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class PsManagerModuleFactoryImpl extends EFactoryImpl implements PsManagerModuleFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static PsManagerModuleFactory init()
  {
    try
    {
      PsManagerModuleFactory thePsManagerModuleFactory = (PsManagerModuleFactory)EPackage.Registry.INSTANCE.getEFactory(PsManagerModulePackage.eNS_URI);
      if (thePsManagerModuleFactory != null)
      {
        return thePsManagerModuleFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PsManagerModuleFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PsManagerModuleFactoryImpl()
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
      case PsManagerModulePackage.CHECK_SESSION_DOWN_OPERATION: return createCheckSessionDownOperation();
      case PsManagerModulePackage.CHECK_SESSION_UP_OPERATION: return createCheckSessionUpOperation();
      case PsManagerModulePackage.DOCUMENT_ROOT: return createDocumentRoot();
      case PsManagerModulePackage.LAUNCH_PROCESS_OPERATION: return createLaunchProcessOperation();
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION: return createLaunchSessionOperation();
      case PsManagerModulePackage.PS_MANAGER_CONFIGURATION: return createPsManagerConfiguration();
      case PsManagerModulePackage.REMOVE_SESSION_OPERATION: return createRemoveSessionOperation();
      case PsManagerModulePackage.TERMINATE_PROCESS_OPERATION: return createTerminateProcessOperation();
      case PsManagerModulePackage.TERMINATE_SESSION_OPERATION: return createTerminateSessionOperation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CheckSessionDownOperation createCheckSessionDownOperation()
  {
    CheckSessionDownOperationImpl checkSessionDownOperation = new CheckSessionDownOperationImpl();
    return checkSessionDownOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CheckSessionUpOperation createCheckSessionUpOperation()
  {
    CheckSessionUpOperationImpl checkSessionUpOperation = new CheckSessionUpOperationImpl();
    return checkSessionUpOperation;
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
  public LaunchProcessOperation createLaunchProcessOperation()
  {
    LaunchProcessOperationImpl launchProcessOperation = new LaunchProcessOperationImpl();
    return launchProcessOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public LaunchSessionOperation createLaunchSessionOperation()
  {
    LaunchSessionOperationImpl launchSessionOperation = new LaunchSessionOperationImpl();
    return launchSessionOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PsManagerConfiguration createPsManagerConfiguration()
  {
    PsManagerConfigurationImpl psManagerConfiguration = new PsManagerConfigurationImpl();
    return psManagerConfiguration;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public RemoveSessionOperation createRemoveSessionOperation()
  {
    RemoveSessionOperationImpl removeSessionOperation = new RemoveSessionOperationImpl();
    return removeSessionOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TerminateProcessOperation createTerminateProcessOperation()
  {
    TerminateProcessOperationImpl terminateProcessOperation = new TerminateProcessOperationImpl();
    return terminateProcessOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TerminateSessionOperation createTerminateSessionOperation()
  {
    TerminateSessionOperationImpl terminateSessionOperation = new TerminateSessionOperationImpl();
    return terminateSessionOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PsManagerModulePackage getPsManagerModulePackage()
  {
    return (PsManagerModulePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PsManagerModulePackage getPackage()
  {
    return PsManagerModulePackage.eINSTANCE;
  }

} // PsManagerModuleFactoryImpl
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
