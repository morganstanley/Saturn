package com.ms.qaTools.saturn.listeners;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.listeners.ListenersPackage
 * @generated
 */
public interface ListenersFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  ListenersFactory eINSTANCE = com.ms.qaTools.saturn.listeners.impl.ListenersFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Console Report Listener</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Console Report Listener</em>'.
   * @generated
   */
  ConsoleReportListener createConsoleReportListener();

  /**
   * Returns a new object of class '<em>Data Set Report Listener</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Data Set Report Listener</em>'.
   * @generated
   */
  DataSetReportListener createDataSetReportListener();

  /**
   * Returns a new object of class '<em>EMail Post Execution Listener</em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return a new object of class '<em>EMail Post Execution Listener</em>'.
   * @generated
   */
  EMailPostExecutionListener createEMailPostExecutionListener();

  /**
   * Returns a new object of class '<em>ID</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>ID</em>'.
   * @generated
   */
  ID createID();

  /**
   * Returns a new object of class '<em>Mail Configuration</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Mail Configuration</em>'.
   * @generated
   */
  MailConfiguration createMailConfiguration();

  /**
   * Returns a new object of class '<em>Mail Recipient</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Mail Recipient</em>'.
   * @generated
   */
  MailRecipient createMailRecipient();

  /**
   * Returns a new object of class '<em>Scenario Report Listener</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Scenario Report Listener</em>'.
   * @generated
   */
  ScenarioReportListener createScenarioReportListener();

  /**
   * Returns a new object of class '<em>TAP Report Listener</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>TAP Report Listener</em>'.
   * @generated
   */
  TAPReportListener createTAPReportListener();

  /**
   * Returns a new object of class '<em>Xml Directory</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Xml Directory</em>'.
   * @generated
   */
  XmlDirectory createXmlDirectory();

  /**
   * Returns a new object of class '<em>Xml File</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Xml File</em>'.
   * @generated
   */
  XmlFile createXmlFile();

  /**
   * Returns a new object of class '<em>Xml Hierarchical Report Listener</em>'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return a new object of class '<em>Xml Hierarchical Report Listener</em>'.
   * @generated
   */
  XmlHierarchicalReportListener createXmlHierarchicalReportListener();

  /**
   * Returns a new object of class '<em>Xml Report Listener</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Xml Report Listener</em>'.
   * @generated
   */
  XmlReportListener createXmlReportListener();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ListenersPackage getListenersPackage();

} // ListenersFactory
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
