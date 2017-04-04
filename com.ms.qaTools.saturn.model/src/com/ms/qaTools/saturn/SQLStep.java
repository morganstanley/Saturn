package com.ms.qaTools.saturn;

import com.ms.qaTools.saturn.modules.sqlModule.SQLConfiguration;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>SQL Step</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.SQLStep#getSQLConfiguration <em>SQL Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.SaturnPackage#getSQLStep()
 * @model extendedMetaData="name='SQLStep' kind='elementOnly'"
 * @generated
 */
public interface SQLStep extends AbstractStep
{
  /**
   * Returns the value of the '<em><b>SQL Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>SQL Configuration</em>' containment reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>SQL Configuration</em>' containment reference.
   * @see #setSQLConfiguration(SQLConfiguration)
   * @see com.ms.qaTools.saturn.SaturnPackage#getSQLStep_SQLConfiguration()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Configuration' namespace='http://www.ms.com/2006/Saturn/Modules/SQL'"
   * @generated
   */
  SQLConfiguration getSQLConfiguration();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.SQLStep#getSQLConfiguration <em>SQL Configuration</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>SQL Configuration</em>' containment reference.
   * @see #getSQLConfiguration()
   * @generated
   */
  void setSQLConfiguration(SQLConfiguration value);

} // SQLStep
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
