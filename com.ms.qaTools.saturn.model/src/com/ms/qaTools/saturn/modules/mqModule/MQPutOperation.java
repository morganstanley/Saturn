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
package com.ms.qaTools.saturn.modules.mqModule;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import com.ms.qaTools.saturn.exception.exception;
import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>MQ Put Operation</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQPutOperation#getException <em>Exception</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQPutOperation#getInputResource <em>Input Resource</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQPutOperation#getActions <em>Actions</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQPutOperation#getCpsHeader <em>Cps Header</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQPutOperation#getDelay <em>Delay</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQPutOperation#getDelimiter <em>Delimiter</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQPutOperation()
 * @model annotation=
 *        "http://www.ms.com/2006/pdsttools/xsd2perl executable='Saturn::Module::MQ::MQPut::Executable' package='Saturn::Module::MQ::MQPut'"
 *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib createUpdater='true' name='mqPut'"
 *        extendedMetaData="name='MQPutOperation' kind='elementOnly'"
 * @generated
 */
public interface MQPutOperation extends AbstractMQOperation
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
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQPutOperation_Exception()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Exception' namespace='http://www.ms.com/2009/Saturn/Exception'"
   * @generated
   */
  exception getException();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutOperation#getException <em>Exception</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Exception</em>' containment reference.
   * @see #getException()
   * @generated
   */
  void setException(exception value);

  /**
   * Returns the value of the '<em><b>Input Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Resource</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Resource</em>' containment reference.
   * @see #setInputResource(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQPutOperation_InputResource()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='InputResource' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getInputResource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutOperation#getInputResource <em>Input Resource</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Resource</em>' containment reference.
   * @see #getInputResource()
   * @generated
   */
  void setInputResource(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQPutOperation_Actions()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Actions' namespace='##targetNamespace'"
   * @generated
   */
  EList<MQPutAction> getActions();

  /**
   * Returns the value of the '<em><b>Cps Header</b></em>' attribute. The default value is <code>""</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cps Header</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Cps Header</em>' attribute.
   * @see #isSetCpsHeader()
   * @see #unsetCpsHeader()
   * @see #setCpsHeader(String)
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQPutOperation_CpsHeader()
   * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='cpsHeader'"
   * @generated
   */
  String getCpsHeader();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutOperation#getCpsHeader <em>Cps Header</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Cps Header</em>' attribute.
   * @see #isSetCpsHeader()
   * @see #unsetCpsHeader()
   * @see #getCpsHeader()
   * @generated
   */
  void setCpsHeader(String value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutOperation#getCpsHeader <em>Cps Header</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetCpsHeader()
   * @see #getCpsHeader()
   * @see #setCpsHeader(String)
   * @generated
   */
  void unsetCpsHeader();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutOperation#getCpsHeader <em>Cps Header</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Cps Header</em>' attribute is set.
   * @see #unsetCpsHeader()
   * @see #getCpsHeader()
   * @see #setCpsHeader(String)
   * @generated
   */
  boolean isSetCpsHeader();

  /**
   * Returns the value of the '<em><b>Delay</b></em>' attribute. The default value is <code>"0"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delay</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Delay</em>' attribute.
   * @see #isSetDelay()
   * @see #unsetDelay()
   * @see #setDelay(BigInteger)
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQPutOperation_Delay()
   * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='delay'"
   * @generated
   */
  BigInteger getDelay();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutOperation#getDelay <em>Delay</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Delay</em>' attribute.
   * @see #isSetDelay()
   * @see #unsetDelay()
   * @see #getDelay()
   * @generated
   */
  void setDelay(BigInteger value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutOperation#getDelay <em>Delay</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetDelay()
   * @see #getDelay()
   * @see #setDelay(BigInteger)
   * @generated
   */
  void unsetDelay();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutOperation#getDelay <em>Delay</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Delay</em>' attribute is set.
   * @see #unsetDelay()
   * @see #getDelay()
   * @see #setDelay(BigInteger)
   * @generated
   */
  boolean isSetDelay();

  /**
   * Returns the value of the '<em><b>Delimiter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delimiter</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delimiter</em>' attribute.
   * @see #setDelimiter(String)
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQPutOperation_Delimiter()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='delimiter'"
   * @generated
   */
  String getDelimiter();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutOperation#getDelimiter <em>Delimiter</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Delimiter</em>' attribute.
   * @see #getDelimiter()
   * @generated
   */
  void setDelimiter(String value);

} // MQPutOperation
