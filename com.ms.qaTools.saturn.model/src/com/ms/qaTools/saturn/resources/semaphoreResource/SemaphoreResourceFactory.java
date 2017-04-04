package com.ms.qaTools.saturn.resources.semaphoreResource;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreResourcePackage
 * @generated
 */
public interface SemaphoreResourceFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  SemaphoreResourceFactory eINSTANCE = com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreResourceFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Local Semaphore Provider</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Local Semaphore Provider</em>'.
   * @generated
   */
  LocalSemaphoreProvider createLocalSemaphoreProvider();

  /**
   * Returns a new object of class '<em>Obtain Semaphore Resource</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Obtain Semaphore Resource</em>'.
   * @generated
   */
  ObtainSemaphoreResource createObtainSemaphoreResource();

  /**
   * Returns a new object of class '<em>Release Semaphore Resource</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Release Semaphore Resource</em>'.
   * @generated
   */
  ReleaseSemaphoreResource createReleaseSemaphoreResource();

  /**
   * Returns a new object of class '<em>Remote Semaphore Provider</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Remote Semaphore Provider</em>'.
   * @generated
   */
  RemoteSemaphoreProvider createRemoteSemaphoreProvider();

  /**
   * Returns a new object of class '<em>Semaphore Definition</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Semaphore Definition</em>'.
   * @generated
   */
  SemaphoreDefinition createSemaphoreDefinition();

  /**
   * Returns a new object of class '<em>Semaphore Provider</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Semaphore Provider</em>'.
   * @generated
   */
  SemaphoreProvider createSemaphoreProvider();

  /**
   * Returns a new object of class '<em>Semaphore Resource</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Semaphore Resource</em>'.
   * @generated
   */
  SemaphoreResource createSemaphoreResource();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SemaphoreResourcePackage getSemaphoreResourcePackage();

} // SemaphoreResourceFactory
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
