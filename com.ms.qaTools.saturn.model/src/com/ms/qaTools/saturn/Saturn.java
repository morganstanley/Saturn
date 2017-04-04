package com.ms.qaTools.saturn;

import org.eclipse.emf.common.util.EList;

import com.ms.qaTools.saturn.types.AbstractListener;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Saturn</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.Saturn#getWorkDir <em>Work Dir</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.Saturn#getRunNumberFileName <em>Run Number File Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.Saturn#getDefaultRunNumber <em>Default Run Number</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.Saturn#getPreExecutionListeners <em>Pre Execution Listeners</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.Saturn#getListeners <em>Listeners</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.Saturn#getPostExecutionListeners <em>Post Execution Listeners</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.Saturn#getLinks <em>Links</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.Saturn#getResourceLinks <em>Resource Links</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.Saturn#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.SaturnPackage#getSaturn()
 * @model extendedMetaData="name='Saturn_._type' kind='elementOnly'"
 * @generated
 */
public interface Saturn extends RunGroup
{
  /**
   * Returns the value of the '<em><b>Work Dir</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Work Dir</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Work Dir</em>' containment reference.
   * @see #setWorkDir(ComplexValue)
   * @see com.ms.qaTools.saturn.SaturnPackage#getSaturn_WorkDir()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='WorkDir' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getWorkDir();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.Saturn#getWorkDir <em>Work Dir</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Work Dir</em>' containment reference.
   * @see #getWorkDir()
   * @generated
   */
  void setWorkDir(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Run Number File Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Run Number File Name</em>' containment reference isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Run Number File Name</em>' containment reference.
   * @see #setRunNumberFileName(ComplexValue)
   * @see com.ms.qaTools.saturn.SaturnPackage#getSaturn_RunNumberFileName()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='RunNumberFileName' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getRunNumberFileName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.Saturn#getRunNumberFileName <em>Run Number File Name</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Run Number File Name</em>' containment reference.
   * @see #getRunNumberFileName()
   * @generated
   */
  void setRunNumberFileName(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Default Run Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Run Number</em>' containment reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Run Number</em>' containment reference.
   * @see #setDefaultRunNumber(ComplexValue)
   * @see com.ms.qaTools.saturn.SaturnPackage#getSaturn_DefaultRunNumber()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='DefaultRunNumber' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getDefaultRunNumber();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.Saturn#getDefaultRunNumber <em>Default Run Number</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Run Number</em>' containment reference.
   * @see #getDefaultRunNumber()
   * @generated
   */
  void setDefaultRunNumber(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Pre Execution Listeners</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.types.AbstractListener}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pre Execution Listeners</em>' containment reference list isn't clear, there really
   * should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pre Execution Listeners</em>' containment reference list.
   * @see com.ms.qaTools.saturn.SaturnPackage#getSaturn_PreExecutionListeners()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='PreExecutionListeners' namespace='##targetNamespace'"
   * @generated
   */
  EList<AbstractListener> getPreExecutionListeners();

  /**
   * Returns the value of the '<em><b>Listeners</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.types.AbstractListener}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Listeners</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Listeners</em>' containment reference list.
   * @see com.ms.qaTools.saturn.SaturnPackage#getSaturn_Listeners()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Listeners' namespace='##targetNamespace'"
   * @generated
   */
  EList<AbstractListener> getListeners();

  /**
   * Returns the value of the '<em><b>Post Execution Listeners</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.types.AbstractListener}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Post Execution Listeners</em>' containment reference list isn't clear, there really
   * should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Post Execution Listeners</em>' containment reference list.
   * @see com.ms.qaTools.saturn.SaturnPackage#getSaturn_PostExecutionListeners()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='PostExecutionListeners' namespace='##targetNamespace'"
   * @generated
   */
  EList<AbstractListener> getPostExecutionListeners();

  /**
   * Returns the value of the '<em><b>Links</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.AbstractLink}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Links</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Links</em>' containment reference list.
   * @see com.ms.qaTools.saturn.SaturnPackage#getSaturn_Links()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Links' namespace='##targetNamespace'"
   * @generated
   */
  EList<AbstractLink> getLinks();

  /**
   * Returns the value of the '<em><b>Resource Links</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.AbstractResourceLink}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource Links</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource Links</em>' containment reference list.
   * @see com.ms.qaTools.saturn.SaturnPackage#getSaturn_ResourceLinks()
   * @model containment="true" transient="true"
   *        extendedMetaData="kind='element' name='ResourceLinks' namespace='##targetNamespace'"
   * @generated
   */
  EList<AbstractResourceLink> getResourceLinks();

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute. The default value is <code>"2.1.11"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Version</em>' attribute.
   * @see #isSetVersion()
   * @see #unsetVersion()
   * @see #setVersion(String)
   * @see com.ms.qaTools.saturn.SaturnPackage#getSaturn_Version()
   * @model default="2.1.11" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Token"
   *        extendedMetaData="kind='attribute' name='version'"
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.Saturn#getVersion <em>Version</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Version</em>' attribute.
   * @see #isSetVersion()
   * @see #unsetVersion()
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.Saturn#getVersion <em>Version</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSetVersion()
   * @see #getVersion()
   * @see #setVersion(String)
   * @generated
   */
  void unsetVersion();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.Saturn#getVersion <em>Version</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Version</em>' attribute is set.
   * @see #unsetVersion()
   * @see #getVersion()
   * @see #setVersion(String)
   * @generated
   */
  boolean isSetVersion();

} // Saturn
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
