package com.ms.qaTools.saturn.modules.psManagerModule;

import com.ms.qaTools.saturn.exception.exception;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Terminate Session Operation</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#getException <em>Exception</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#getSessionName <em>Session Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#getPollInterval <em>Poll Interval</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#getKillAfter <em>Kill After</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#isWait <em>Wait</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#isIgnoreIfNotExists <em>Ignore If Not Exists</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModulePackage#getTerminateSessionOperation()
 * @model extendedMetaData="name='TerminateSessionOperation' kind='elementOnly'"
 * @generated
 */
public interface TerminateSessionOperation extends AbstractOperation
{
  /**
   * Returns the value of the '<em><b>Exception</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exception</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception</em>' containment reference.
   * @see #setException(exception)
   * @see com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModulePackage#getTerminateSessionOperation_Exception()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Exception' namespace='http://www.ms.com/2009/Saturn/Exception'"
   * @generated
   */
  exception getException();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#getException <em>Exception</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Exception</em>' containment reference.
   * @see #getException()
   * @generated
   */
  void setException(exception value);

  /**
   * Returns the value of the '<em><b>Session Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Session Name</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Session Name</em>' containment reference.
   * @see #setSessionName(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModulePackage#getTerminateSessionOperation_SessionName()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='SessionName' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getSessionName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#getSessionName <em>Session Name</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Session Name</em>' containment reference.
   * @see #getSessionName()
   * @generated
   */
  void setSessionName(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Timeout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timeout</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timeout</em>' containment reference.
   * @see #setTimeout(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModulePackage#getTerminateSessionOperation_Timeout()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Timeout' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getTimeout();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#getTimeout <em>Timeout</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Timeout</em>' containment reference.
   * @see #getTimeout()
   * @generated
   */
  void setTimeout(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Poll Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Poll Interval</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Poll Interval</em>' containment reference.
   * @see #setPollInterval(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModulePackage#getTerminateSessionOperation_PollInterval()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='PollInterval' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getPollInterval();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#getPollInterval <em>Poll Interval</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Poll Interval</em>' containment reference.
   * @see #getPollInterval()
   * @generated
   */
  void setPollInterval(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Kill After</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kill After</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kill After</em>' containment reference.
   * @see #setKillAfter(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModulePackage#getTerminateSessionOperation_KillAfter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='KillAfter' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getKillAfter();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#getKillAfter <em>Kill After</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Kill After</em>' containment reference.
   * @see #getKillAfter()
   * @generated
   */
  void setKillAfter(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Ignore If Not Exists</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ignore If Not Exists</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ignore If Not Exists</em>' attribute.
   * @see #isSetIgnoreIfNotExists()
   * @see #unsetIgnoreIfNotExists()
   * @see #setIgnoreIfNotExists(boolean)
   * @see com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModulePackage#getTerminateSessionOperation_IgnoreIfNotExists()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='ignoreIfNotExists'"
   * @generated
   */
  boolean isIgnoreIfNotExists();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#isIgnoreIfNotExists <em>Ignore If Not Exists</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Ignore If Not Exists</em>' attribute.
   * @see #isSetIgnoreIfNotExists()
   * @see #unsetIgnoreIfNotExists()
   * @see #isIgnoreIfNotExists()
   * @generated
   */
  void setIgnoreIfNotExists(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#isIgnoreIfNotExists <em>Ignore If Not Exists</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetIgnoreIfNotExists()
   * @see #isIgnoreIfNotExists()
   * @see #setIgnoreIfNotExists(boolean)
   * @generated
   */
  void unsetIgnoreIfNotExists();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#isIgnoreIfNotExists <em>Ignore If Not Exists</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Ignore If Not Exists</em>' attribute is set.
   * @see #unsetIgnoreIfNotExists()
   * @see #isIgnoreIfNotExists()
   * @see #setIgnoreIfNotExists(boolean)
   * @generated
   */
  boolean isSetIgnoreIfNotExists();

  /**
   * Returns the value of the '<em><b>Wait</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wait</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Wait</em>' attribute.
   * @see #isSetWait()
   * @see #unsetWait()
   * @see #setWait(boolean)
   * @see com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModulePackage#getTerminateSessionOperation_Wait()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='wait'"
   * @generated
   */
  boolean isWait();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#isWait <em>Wait</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Wait</em>' attribute.
   * @see #isSetWait()
   * @see #unsetWait()
   * @see #isWait()
   * @generated
   */
  void setWait(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#isWait <em>Wait</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetWait()
   * @see #isWait()
   * @see #setWait(boolean)
   * @generated
   */
  void unsetWait();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#isWait <em>Wait</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Wait</em>' attribute is set.
   * @see #unsetWait()
   * @see #isWait()
   * @see #setWait(boolean)
   * @generated
   */
  boolean isSetWait();

} // TerminateSessionOperation
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
