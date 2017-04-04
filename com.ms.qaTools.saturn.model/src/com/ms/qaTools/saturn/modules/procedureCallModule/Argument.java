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
package com.ms.qaTools.saturn.modules.procedureCallModule;

import org.eclipse.emf.ecore.EObject;

import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Argument</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.procedureCallModule.Argument#getName <em>Name</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.procedureCallModule.Argument#getValue <em>Value</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.procedureCallModule.Argument#isIsResource <em>Is Resource</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.modules.procedureCallModule.ProcedureCallModulePackage#getArgument()
 * @model extendedMetaData="name='Argument' kind='elementOnly'"
 * @generated
 */
public interface Argument extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.ProcedureCallModulePackage#getArgument_Name()
   * @model containment="true" required="true" annotation="http://www.ms.com/2006/pdsttools/xsd2perl accessor='name'"
   *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.procedureCallModule.Argument#getName <em>Name</em>}'
   * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.ProcedureCallModulePackage#getArgument_Value()
   * @model containment="true" required="true" annotation="http://www.ms.com/2006/pdsttools/xsd2perl accessor='value'"
   *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getValue();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.procedureCallModule.Argument#getValue <em>Value</em>}'
   * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Is Resource</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Resource</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Is Resource</em>' attribute.
   * @see #isSetIsResource()
   * @see #unsetIsResource()
   * @see #setIsResource(boolean)
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.ProcedureCallModulePackage#getArgument_IsResource()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='isResource'"
   * @generated
   */
  boolean isIsResource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.procedureCallModule.Argument#isIsResource
   * <em>Is Resource</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Is Resource</em>' attribute.
   * @see #isSetIsResource()
   * @see #unsetIsResource()
   * @see #isIsResource()
   * @generated
   */
  void setIsResource(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.procedureCallModule.Argument#isIsResource
   * <em>Is Resource</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSetIsResource()
   * @see #isIsResource()
   * @see #setIsResource(boolean)
   * @generated
   */
  void unsetIsResource();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.procedureCallModule.Argument#isIsResource
   * <em>Is Resource</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return whether the value of the '<em>Is Resource</em>' attribute is set.
   * @see #unsetIsResource()
   * @see #isIsResource()
   * @see #setIsResource(boolean)
   * @generated
   */
  boolean isSetIsResource();

} // Argument
