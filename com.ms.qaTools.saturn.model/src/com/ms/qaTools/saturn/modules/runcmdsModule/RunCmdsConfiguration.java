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
package com.ms.qaTools.saturn.modules.runcmdsModule;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.ms.qaTools.saturn.types.InterpretersEnum;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Run Cmds Configuration</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.runcmdsModule.RunCmdsConfiguration#getCheckStr <em>Check Str</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.runcmdsModule.RunCmdsConfiguration#getCommands <em>Commands</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.runcmdsModule.RunCmdsConfiguration#getInterpreter <em>Interpreter</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.runcmdsModule.RunCmdsConfiguration#getCheckStrAction <em>Check Str Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.runcmdsModule.RuncmdsModulePackage#getRunCmdsConfiguration()
 * @model extendedMetaData="name='Configuration_._type' kind='elementOnly'"
 * @generated
 */
public interface RunCmdsConfiguration extends EObject
{
  /**
   * Returns the value of the '<em><b>Check Str</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Check Str</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Check Str</em>' containment reference.
   * @see #setCheckStr(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.RuncmdsModulePackage#getRunCmdsConfiguration_CheckStr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='CheckStr' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getCheckStr();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.runcmdsModule.RunCmdsConfiguration#getCheckStr <em>Check Str</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Check Str</em>' containment reference.
   * @see #getCheckStr()
   * @generated
   */
  void setCheckStr(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.modules.runcmdsModule.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.RuncmdsModulePackage#getRunCmdsConfiguration_Commands()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Commands' namespace='##targetNamespace'"
   * @generated
   */
  EList<Command> getCommands();

  /**
   * Returns the value of the '<em><b>Check Str Action</b></em>' attribute. The default value is <code>"NONE"</code>.
   * The literals are from the enumeration {@link com.ms.qaTools.saturn.modules.runcmdsModule.CheckStrActionEnum}. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Check Str Action</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Check Str Action</em>' attribute.
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.CheckStrActionEnum
   * @see #isSetCheckStrAction()
   * @see #unsetCheckStrAction()
   * @see #setCheckStrAction(CheckStrActionEnum)
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.RuncmdsModulePackage#getRunCmdsConfiguration_CheckStrAction()
   * @model default="NONE" unsettable="true"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib accessor='checkAction'"
   *        extendedMetaData="kind='attribute' name='checkStrAction'"
   * @generated
   */
  CheckStrActionEnum getCheckStrAction();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.runcmdsModule.RunCmdsConfiguration#getCheckStrAction <em>Check Str Action</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Check Str Action</em>' attribute.
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.CheckStrActionEnum
   * @see #isSetCheckStrAction()
   * @see #unsetCheckStrAction()
   * @see #getCheckStrAction()
   * @generated
   */
  void setCheckStrAction(CheckStrActionEnum value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.runcmdsModule.RunCmdsConfiguration#getCheckStrAction <em>Check Str Action</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetCheckStrAction()
   * @see #getCheckStrAction()
   * @see #setCheckStrAction(CheckStrActionEnum)
   * @generated
   */
  void unsetCheckStrAction();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.runcmdsModule.RunCmdsConfiguration#getCheckStrAction <em>Check Str Action</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Check Str Action</em>' attribute is set.
   * @see #unsetCheckStrAction()
   * @see #getCheckStrAction()
   * @see #setCheckStrAction(CheckStrActionEnum)
   * @generated
   */
  boolean isSetCheckStrAction();

  /**
   * Returns the value of the '<em><b>Interpreter</b></em>' attribute.
   * The default value is <code>"SHELL"</code>.
   * The literals are from the enumeration {@link com.ms.qaTools.saturn.types.InterpretersEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interpreter</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interpreter</em>' attribute.
   * @see com.ms.qaTools.saturn.types.InterpretersEnum
   * @see #isSetInterpreter()
   * @see #unsetInterpreter()
   * @see #setInterpreter(InterpretersEnum)
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.RuncmdsModulePackage#getRunCmdsConfiguration_Interpreter()
   * @model default="SHELL" unsettable="true"
   *        extendedMetaData="kind='attribute' name='interpreter'"
   * @generated
   */
  InterpretersEnum getInterpreter();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.runcmdsModule.RunCmdsConfiguration#getInterpreter <em>Interpreter</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Interpreter</em>' attribute.
   * @see com.ms.qaTools.saturn.types.InterpretersEnum
   * @see #isSetInterpreter()
   * @see #unsetInterpreter()
   * @see #getInterpreter()
   * @generated
   */
  void setInterpreter(InterpretersEnum value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.runcmdsModule.RunCmdsConfiguration#getInterpreter <em>Interpreter</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetInterpreter()
   * @see #getInterpreter()
   * @see #setInterpreter(InterpretersEnum)
   * @generated
   */
  void unsetInterpreter();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.runcmdsModule.RunCmdsConfiguration#getInterpreter <em>Interpreter</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Interpreter</em>' attribute is set.
   * @see #unsetInterpreter()
   * @see #getInterpreter()
   * @see #setInterpreter(InterpretersEnum)
   * @generated
   */
  boolean isSetInterpreter();

} // RunCmdsConfiguration
