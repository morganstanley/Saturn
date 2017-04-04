/**
 * COPYRIGHT NOTICE AND DISCLAIMER
 *  
 * Copyright © 2009, Contributor
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License, version 3 for more details.
 * You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
 * THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
 *
 * $Id$
 */
package com.ms.qaTools.saturn.modules.psManagerModule;

import com.ms.qaTools.saturn.exception.exception;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Launch Session Operation</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#getException <em>Exception</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#getSessionName <em>Session Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#getPollInterval <em>Poll Interval</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#getPause <em>Pause</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#isWait <em>Wait</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#isForce <em>Force</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModulePackage#getLaunchSessionOperation()
 * @model extendedMetaData="name='LaunchSessionOperation' kind='elementOnly'"
 * @generated
 */
public interface LaunchSessionOperation extends AbstractOperation
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
   * @see com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModulePackage#getLaunchSessionOperation_Exception()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Exception' namespace='http://www.ms.com/2009/Saturn/Exception'"
   * @generated
   */
  exception getException();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#getException <em>Exception</em>}' containment reference.
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
   * @see com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModulePackage#getLaunchSessionOperation_SessionName()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='SessionName' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getSessionName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#getSessionName <em>Session Name</em>}' containment reference.
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
   * @see com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModulePackage#getLaunchSessionOperation_Timeout()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Timeout' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getTimeout();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#getTimeout <em>Timeout</em>}' containment reference.
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
   * @see com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModulePackage#getLaunchSessionOperation_PollInterval()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='PollInterval' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getPollInterval();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#getPollInterval <em>Poll Interval</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Poll Interval</em>' containment reference.
   * @see #getPollInterval()
   * @generated
   */
  void setPollInterval(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Pause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pause</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pause</em>' containment reference.
   * @see #setPause(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModulePackage#getLaunchSessionOperation_Pause()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Pause' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getPause();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#getPause <em>Pause</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Pause</em>' containment reference.
   * @see #getPause()
   * @generated
   */
  void setPause(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Force</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Force</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Force</em>' attribute.
   * @see #isSetForce()
   * @see #unsetForce()
   * @see #setForce(boolean)
   * @see com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModulePackage#getLaunchSessionOperation_Force()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='force'"
   * @generated
   */
  boolean isForce();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#isForce <em>Force</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Force</em>' attribute.
   * @see #isSetForce()
   * @see #unsetForce()
   * @see #isForce()
   * @generated
   */
  void setForce(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#isForce <em>Force</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetForce()
   * @see #isForce()
   * @see #setForce(boolean)
   * @generated
   */
  void unsetForce();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#isForce <em>Force</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Force</em>' attribute is set.
   * @see #unsetForce()
   * @see #isForce()
   * @see #setForce(boolean)
   * @generated
   */
  boolean isSetForce();

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
   * @see com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModulePackage#getLaunchSessionOperation_Wait()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='wait'"
   * @generated
   */
  boolean isWait();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#isWait <em>Wait</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Wait</em>' attribute.
   * @see #isSetWait()
   * @see #unsetWait()
   * @see #isWait()
   * @generated
   */
  void setWait(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#isWait <em>Wait</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetWait()
   * @see #isWait()
   * @see #setWait(boolean)
   * @generated
   */
  void unsetWait();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#isWait <em>Wait</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Wait</em>' attribute is set.
   * @see #unsetWait()
   * @see #isWait()
   * @see #setWait(boolean)
   * @generated
   */
  boolean isSetWait();

} // LaunchSessionOperation
