package com.ms.qaTools.saturn.modules.singularityModule.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.ms.qaTools.saturn.modules.singularityModule.DocumentRoot;
import com.ms.qaTools.saturn.modules.singularityModule.ExtractOperation;
import com.ms.qaTools.saturn.modules.singularityModule.SearchExtractOperation;
import com.ms.qaTools.saturn.modules.singularityModule.SingularityConfiguration;
import com.ms.qaTools.saturn.modules.singularityModule.SingularityFactory;
import com.ms.qaTools.saturn.modules.singularityModule.SingularityPackage;
import com.ms.qaTools.saturn.modules.singularityModule.TestCaseExtractOperation;
import com.ms.qaTools.saturn.modules.singularityModule.TestSuiteExtractOperation;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class SingularityFactoryImpl extends EFactoryImpl implements SingularityFactory
{
  /**
   * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static SingularityFactory init()
  {
    try
    {
      SingularityFactory theSingularityFactory = (SingularityFactory) EPackage.Registry.INSTANCE
          .getEFactory("http://www.ms.com/2009/Saturn/Modules/Singularity");
      if (theSingularityFactory != null) { return theSingularityFactory; }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SingularityFactoryImpl();
  }

  /**
   * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public SingularityFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
    case SingularityPackage.DOCUMENT_ROOT:
      return createDocumentRoot();
    case SingularityPackage.EXTRACT_OPERATION:
      return createExtractOperation();
    case SingularityPackage.SEARCH_EXTRACT_OPERATION:
      return createSearchExtractOperation();
    case SingularityPackage.SINGULARITY_CONFIGURATION:
      return createSingularityConfiguration();
    case SingularityPackage.TEST_CASE_EXTRACT_OPERATION:
      return createTestCaseExtractOperation();
    case SingularityPackage.TEST_SUITE_EXTRACT_OPERATION:
      return createTestSuiteExtractOperation();
    default:
      throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public DocumentRoot createDocumentRoot()
  {
    DocumentRootImpl documentRoot = new DocumentRootImpl();
    return documentRoot;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public ExtractOperation createExtractOperation()
  {
    ExtractOperationImpl extractOperation = new ExtractOperationImpl();
    return extractOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public SearchExtractOperation createSearchExtractOperation()
  {
    SearchExtractOperationImpl searchExtractOperation = new SearchExtractOperationImpl();
    return searchExtractOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public SingularityConfiguration createSingularityConfiguration()
  {
    SingularityConfigurationImpl singularityConfiguration = new SingularityConfigurationImpl();
    return singularityConfiguration;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public TestCaseExtractOperation createTestCaseExtractOperation()
  {
    TestCaseExtractOperationImpl testCaseExtractOperation = new TestCaseExtractOperationImpl();
    return testCaseExtractOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public TestSuiteExtractOperation createTestSuiteExtractOperation()
  {
    TestSuiteExtractOperationImpl testSuiteExtractOperation = new TestSuiteExtractOperationImpl();
    return testSuiteExtractOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public SingularityPackage getSingularityPackage()
  {
    return (SingularityPackage) getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SingularityPackage getPackage()
  {
    return SingularityPackage.eINSTANCE;
  }

} // SingularityFactoryImpl
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
