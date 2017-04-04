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

import com.ms.qaTools.saturn.exception.exception;
import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Load Table</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.LoadTable#getException <em>Exception</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.LoadTable#getInput <em>Input</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.LoadTable#getSQL <em>SQL</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.LoadTable#isCleanLoad <em>Clean Load</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.LoadTable#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.LoadTable#getBatchSize <em>Batch Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage#getLoadTable()
 * @model extendedMetaData="name='Tables_._type' kind='elementOnly'"
 * @generated
 */
public interface LoadTable extends EObject
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
   * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage#getLoadTable_Exception()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Exception' namespace='http://www.ms.com/2009/Saturn/Exception'"
   * @generated
   */
  exception getException();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.LoadTable#getException <em>Exception</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Exception</em>' containment reference.
   * @see #getException()
   * @generated
   */
  void setException(exception value);

  /**
   * Returns the value of the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' containment reference.
   * @see #setInput(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage#getLoadTable_Input()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Input' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getInput();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.LoadTable#getInput <em>Input</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' containment reference.
   * @see #getInput()
   * @generated
   */
  void setInput(ResourceDefinition value);

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
   * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage#getLoadTable_SQL()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='SQL' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getSQL();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.LoadTable#getSQL <em>SQL</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>SQL</em>' containment reference.
   * @see #getSQL()
   * @generated
   */
  void setSQL(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Batch Size</b></em>' attribute. The default value is <code>"0"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Batch Size</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Batch Size</em>' attribute.
   * @see #isSetBatchSize()
   * @see #unsetBatchSize()
   * @see #setBatchSize(BigInteger)
   * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage#getLoadTable_BatchSize()
   * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='batchSize'"
   * @generated
   */
  BigInteger getBatchSize();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.LoadTable#getBatchSize <em>Batch Size</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Batch Size</em>' attribute.
   * @see #isSetBatchSize()
   * @see #unsetBatchSize()
   * @see #getBatchSize()
   * @generated
   */
  void setBatchSize(BigInteger value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.LoadTable#getBatchSize <em>Batch Size</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetBatchSize()
   * @see #getBatchSize()
   * @see #setBatchSize(BigInteger)
   * @generated
   */
  void unsetBatchSize();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.LoadTable#getBatchSize <em>Batch Size</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Batch Size</em>' attribute is set.
   * @see #unsetBatchSize()
   * @see #getBatchSize()
   * @see #setBatchSize(BigInteger)
   * @generated
   */
  boolean isSetBatchSize();

  /**
   * Returns the value of the '<em><b>Clean Load</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clean Load</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Clean Load</em>' attribute.
   * @see #isSetCleanLoad()
   * @see #unsetCleanLoad()
   * @see #setCleanLoad(boolean)
   * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage#getLoadTable_CleanLoad()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='cleanLoad'"
   * @generated
   */
  boolean isCleanLoad();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.LoadTable#isCleanLoad <em>Clean Load</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Clean Load</em>' attribute.
   * @see #isSetCleanLoad()
   * @see #unsetCleanLoad()
   * @see #isCleanLoad()
   * @generated
   */
  void setCleanLoad(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.LoadTable#isCleanLoad <em>Clean Load</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetCleanLoad()
   * @see #isCleanLoad()
   * @see #setCleanLoad(boolean)
   * @generated
   */
  void unsetCleanLoad();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.LoadTable#isCleanLoad <em>Clean Load</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Clean Load</em>' attribute is set.
   * @see #unsetCleanLoad()
   * @see #isCleanLoad()
   * @see #setCleanLoad(boolean)
   * @generated
   */
  boolean isSetCleanLoad();

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
   * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage#getLoadTable_Enabled()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='enabled'"
   * @generated
   */
  boolean isEnabled();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.LoadTable#isEnabled <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Enabled</em>' attribute.
   * @see #isSetEnabled()
   * @see #unsetEnabled()
   * @see #isEnabled()
   * @generated
   */
  void setEnabled(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.LoadTable#isEnabled <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetEnabled()
   * @see #isEnabled()
   * @see #setEnabled(boolean)
   * @generated
   */
  void unsetEnabled();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.LoadTable#isEnabled <em>Enabled</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Enabled</em>' attribute is set.
   * @see #unsetEnabled()
   * @see #isEnabled()
   * @see #setEnabled(boolean)
   * @generated
   */
  boolean isSetEnabled();

} // LoadTable
