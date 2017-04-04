package com.ms.qaTools.saturn.modules.cpsModule;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.modules.cpsModule.CpsModulePackage
 * @generated
 */
public interface CpsModuleFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  CpsModuleFactory eINSTANCE = com.ms.qaTools.saturn.modules.cpsModule.impl.CpsModuleFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Cps Configuration</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Cps Configuration</em>'.
   * @generated
   */
  CpsConfiguration createCpsConfiguration();

  /**
   * Returns a new object of class '<em>Cps Get Operation</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Cps Get Operation</em>'.
   * @generated
   */
  CpsGetOperation createCpsGetOperation();

  /**
   * Returns a new object of class '<em>Cps Put Operation</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Cps Put Operation</em>'.
   * @generated
   */
  CpsPutOperation createCpsPutOperation();

  /**
   * Returns a new object of class '<em>Cps Sow Delete Operation</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Cps Sow Delete Operation</em>'.
   * @generated
   */
  CpsSowDeleteOperation createCpsSowDeleteOperation();

  /**
   * Returns a new object of class '<em>Cps Subscribe Operation</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Cps Subscribe Operation</em>'.
   * @generated
   */
  CpsSubscribeOperation createCpsSubscribeOperation();

  /**
   * Returns a new object of class '<em>Cps Unsubscribe Operation</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Cps Unsubscribe Operation</em>'.
   * @generated
   */
  CpsUnsubscribeOperation createCpsUnsubscribeOperation();

  /**
   * Returns a new object of class '<em>Document Root</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Document Root</em>'.
   * @generated
   */
  DocumentRoot createDocumentRoot();

  /**
   * Returns a new object of class '<em>Groovy Termination Condition</em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return a new object of class '<em>Groovy Termination Condition</em>'.
   * @generated
   */
  GroovyTerminationCondition createGroovyTerminationCondition();

  /**
   * Returns a new object of class '<em>Perl Termination Condition</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Perl Termination Condition</em>'.
   * @generated
   */
  PerlTerminationCondition createPerlTerminationCondition();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CpsModulePackage getCpsModulePackage();

} // CpsModuleFactory
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
