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
package com.ms.qaTools.saturn.modules.sqlModule;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Proc Call Definition</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#getSQL <em>SQL</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#getOutput <em>Output</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#getParameterFile <em>Parameter File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#getIgnoreVal <em>Ignore Val</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#isHasOutput <em>Has Output</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#getCallCount <em>Call Count</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#isEnabled <em>Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage#getProcCallDefinition()
 * @model extendedMetaData="name='ProcedureCalls_._type' kind='elementOnly'"
 * @generated
 */
public interface ProcCallDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>SQL</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>SQL</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>SQL</em>' containment reference.
   * @see #setSQL(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage#getProcCallDefinition_SQL()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='SQL' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getSQL();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#getSQL <em>SQL</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>SQL</em>' containment reference.
   * @see #getSQL()
   * @generated
   */
  void setSQL(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Output</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output</em>' containment reference.
   * @see #setOutput(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage#getProcCallDefinition_Output()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Output' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getOutput();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#getOutput <em>Output</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Output</em>' containment reference.
   * @see #getOutput()
   * @generated
   */
  void setOutput(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Parameter File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter File</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter File</em>' containment reference.
   * @see #setParameterFile(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage#getProcCallDefinition_ParameterFile()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='ParameterFile' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getParameterFile();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#getParameterFile <em>Parameter File</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter File</em>' containment reference.
   * @see #getParameterFile()
   * @generated
   */
  void setParameterFile(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Ignore Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ignore Val</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ignore Val</em>' containment reference.
   * @see #setIgnoreVal(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage#getProcCallDefinition_IgnoreVal()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='IgnoreVal' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getIgnoreVal();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#getIgnoreVal <em>Ignore Val</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Ignore Val</em>' containment reference.
   * @see #getIgnoreVal()
   * @generated
   */
  void setIgnoreVal(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Call Count</b></em>' attribute. The default value is <code>"1"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Call Count</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Call Count</em>' attribute.
   * @see #isSetCallCount()
   * @see #unsetCallCount()
   * @see #setCallCount(BigInteger)
   * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage#getProcCallDefinition_CallCount()
   * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='callCount'"
   * @generated
   */
  BigInteger getCallCount();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#getCallCount <em>Call Count</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Call Count</em>' attribute.
   * @see #isSetCallCount()
   * @see #unsetCallCount()
   * @see #getCallCount()
   * @generated
   */
  void setCallCount(BigInteger value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#getCallCount <em>Call Count</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetCallCount()
   * @see #getCallCount()
   * @see #setCallCount(BigInteger)
   * @generated
   */
  void unsetCallCount();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#getCallCount <em>Call Count</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Call Count</em>' attribute is set.
   * @see #unsetCallCount()
   * @see #getCallCount()
   * @see #setCallCount(BigInteger)
   * @generated
   */
  boolean isSetCallCount();

  /**
   * Returns the value of the '<em><b>Enabled</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enabled</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Enabled</em>' attribute.
   * @see #isSetEnabled()
   * @see #unsetEnabled()
   * @see #setEnabled(boolean)
   * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage#getProcCallDefinition_Enabled()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='enabled'"
   * @generated
   */
  boolean isEnabled();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#isEnabled <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Enabled</em>' attribute.
   * @see #isSetEnabled()
   * @see #unsetEnabled()
   * @see #isEnabled()
   * @generated
   */
  void setEnabled(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#isEnabled <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetEnabled()
   * @see #isEnabled()
   * @see #setEnabled(boolean)
   * @generated
   */
  void unsetEnabled();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#isEnabled <em>Enabled</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Enabled</em>' attribute is set.
   * @see #unsetEnabled()
   * @see #isEnabled()
   * @see #setEnabled(boolean)
   * @generated
   */
  boolean isSetEnabled();

  /**
   * Returns the value of the '<em><b>Has Output</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Output</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Has Output</em>' attribute.
   * @see #isSetHasOutput()
   * @see #unsetHasOutput()
   * @see #setHasOutput(boolean)
   * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage#getProcCallDefinition_HasOutput()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='hasOutput'"
   * @generated
   */
  boolean isHasOutput();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#isHasOutput <em>Has Output</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Output</em>' attribute.
   * @see #isSetHasOutput()
   * @see #unsetHasOutput()
   * @see #isHasOutput()
   * @generated
   */
  void setHasOutput(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#isHasOutput <em>Has Output</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetHasOutput()
   * @see #isHasOutput()
   * @see #setHasOutput(boolean)
   * @generated
   */
  void unsetHasOutput();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#isHasOutput <em>Has Output</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Has Output</em>' attribute is set.
   * @see #unsetHasOutput()
   * @see #isHasOutput()
   * @see #setHasOutput(boolean)
   * @generated
   */
  boolean isSetHasOutput();

} // ProcCallDefinition
