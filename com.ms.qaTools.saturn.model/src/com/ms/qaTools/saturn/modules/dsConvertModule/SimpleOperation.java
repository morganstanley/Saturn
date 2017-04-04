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
package com.ms.qaTools.saturn.modules.dsConvertModule;

import org.eclipse.emf.common.util.EList;

import com.ms.qaTools.saturn.exception.exception;
import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Simple Operation</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.dsConvertModule.SimpleOperation#getSource <em>Source</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.dsConvertModule.SimpleOperation#getTarget <em>Target</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.dsConvertModule.SimpleOperation#getIgnoreCols <em>Ignore Cols</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.dsConvertModule.SimpleOperation#getException <em>Exception</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.dsConvertModule.SimpleOperation#isNumberDuplicateCols <em>Number Duplicate
 * Cols</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.modules.dsConvertModule.DsConvertModulePackage#getSimpleOperation()
 * @model annotation=
 *        "http://www.ms.com/2006/pdsttools/xsd2perl executable='Saturn::Module::DSConvert::SimpleOperation::Executable'"
 *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib name='dsConvert_convert'"
 *        extendedMetaData="name='SimpleOperation' kind='elementOnly'"
 * @generated
 */
public interface SimpleOperation extends AbstractOperation
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.DsConvertModulePackage#getSimpleOperation_Source()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Source' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getSource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.dsConvertModule.SimpleOperation#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.DsConvertModulePackage#getSimpleOperation_Target()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Target' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getTarget();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.dsConvertModule.SimpleOperation#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Ignore Cols</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.values.ComplexValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ignore Cols</em>' containment reference list isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ignore Cols</em>' containment reference list.
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.DsConvertModulePackage#getSimpleOperation_IgnoreCols()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='IgnoreCols' namespace='##targetNamespace'"
   * @generated
   */
  EList<ComplexValue> getIgnoreCols();

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
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.DsConvertModulePackage#getSimpleOperation_Exception()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Exception' namespace='http://www.ms.com/2009/Saturn/Exception'"
   * @generated
   */
  exception getException();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.dsConvertModule.SimpleOperation#getException <em>Exception</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Exception</em>' containment reference.
   * @see #getException()
   * @generated
   */
  void setException(exception value);

  /**
   * Returns the value of the '<em><b>Number Duplicate Cols</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number Duplicate Cols</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number Duplicate Cols</em>' attribute.
   * @see #isSetNumberDuplicateCols()
   * @see #unsetNumberDuplicateCols()
   * @see #setNumberDuplicateCols(boolean)
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.DsConvertModulePackage#getSimpleOperation_NumberDuplicateCols()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='numberDuplicateCols'"
   * @generated
   */
  boolean isNumberDuplicateCols();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.dsConvertModule.SimpleOperation#isNumberDuplicateCols <em>Number Duplicate Cols</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Number Duplicate Cols</em>' attribute.
   * @see #isSetNumberDuplicateCols()
   * @see #unsetNumberDuplicateCols()
   * @see #isNumberDuplicateCols()
   * @generated
   */
  void setNumberDuplicateCols(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.dsConvertModule.SimpleOperation#isNumberDuplicateCols <em>Number Duplicate Cols</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetNumberDuplicateCols()
   * @see #isNumberDuplicateCols()
   * @see #setNumberDuplicateCols(boolean)
   * @generated
   */
  void unsetNumberDuplicateCols();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.dsConvertModule.SimpleOperation#isNumberDuplicateCols <em>Number Duplicate Cols</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Number Duplicate Cols</em>' attribute is set.
   * @see #unsetNumberDuplicateCols()
   * @see #isNumberDuplicateCols()
   * @see #setNumberDuplicateCols(boolean)
   * @generated
   */
  boolean isSetNumberDuplicateCols();

} // SimpleOperation
