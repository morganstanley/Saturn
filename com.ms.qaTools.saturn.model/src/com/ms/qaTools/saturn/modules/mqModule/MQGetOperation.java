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

import org.eclipse.emf.common.util.EList;

import com.ms.qaTools.saturn.exception.exception;
import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>MQ Get Operation</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getException <em>Exception</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getOutputResource <em>Output Resource</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getPattern <em>Pattern</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getPriority <em>Priority</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getDelimiter <em>Delimiter</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getOutputFormat <em>Output Format</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getActions <em>Actions</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getMessageProcessors <em>Message Processors</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#isRemoveFromQueue <em>Remove From Queue</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQGetOperation()
 * @model annotation=
 *        "http://www.ms.com/2006/pdsttools/xsd2perl executable='Saturn::Module::MQ::MQGet::Executable' package='Saturn::Module::MQ::MQGet'"
 *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib createUpdater='true' name='mqGet'"
 *        extendedMetaData="name='MQGetOperation' kind='elementOnly'"
 * @generated
 */
public interface MQGetOperation extends AbstractMQOperation
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
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQGetOperation_Exception()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Exception' namespace='http://www.ms.com/2009/Saturn/Exception'"
   * @generated
   */
  exception getException();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getException <em>Exception</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Exception</em>' containment reference.
   * @see #getException()
   * @generated
   */
  void setException(exception value);

  /**
   * Returns the value of the '<em><b>Output Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Resource</em>' containment reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Resource</em>' containment reference.
   * @see #setOutputResource(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQGetOperation_OutputResource()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='OutputResource' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getOutputResource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getOutputResource <em>Output Resource</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Output Resource</em>' containment reference.
   * @see #getOutputResource()
   * @generated
   */
  void setOutputResource(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' containment reference.
   * @see #setPattern(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQGetOperation_Pattern()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Pattern' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getPattern();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getPattern <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' containment reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Priority</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Priority</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Priority</em>' containment reference.
   * @see #setPriority(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQGetOperation_Priority()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Priority' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getPriority();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getPriority <em>Priority</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority</em>' containment reference.
   * @see #getPriority()
   * @generated
   */
  void setPriority(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Delimiter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delimiter</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delimiter</em>' containment reference.
   * @see #setDelimiter(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQGetOperation_Delimiter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Delimiter' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getDelimiter();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getDelimiter <em>Delimiter</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Delimiter</em>' containment reference.
   * @see #getDelimiter()
   * @generated
   */
  void setDelimiter(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Output Format</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Format</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Format</em>' containment reference.
   * @see #setOutputFormat(MQGetOutputFormat)
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQGetOperation_OutputFormat()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='OutputFormat' namespace='##targetNamespace'"
   * @generated
   */
  MQGetOutputFormat getOutputFormat();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getOutputFormat <em>Output Format</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Output Format</em>' containment reference.
   * @see #getOutputFormat()
   * @generated
   */
  void setOutputFormat(MQGetOutputFormat value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.modules.mqModule.MQGetAction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQGetOperation_Actions()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Actions' namespace='##targetNamespace'"
   * @generated
   */
  EList<MQGetAction> getActions();

  /**
   * Returns the value of the '<em><b>Message Processors</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.modules.mqModule.AbstractMessageProcessor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message Processors</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message Processors</em>' containment reference list.
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQGetOperation_MessageProcessors()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='MessageProcessors' namespace='##targetNamespace'"
   * @generated
   */
  EList<AbstractMessageProcessor> getMessageProcessors();

  /**
   * Returns the value of the '<em><b>Remove From Queue</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Remove From Queue</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Remove From Queue</em>' attribute.
   * @see #isSetRemoveFromQueue()
   * @see #unsetRemoveFromQueue()
   * @see #setRemoveFromQueue(boolean)
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQGetOperation_RemoveFromQueue()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='removeFromQueue'"
   * @generated
   */
  boolean isRemoveFromQueue();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#isRemoveFromQueue <em>Remove From Queue</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Remove From Queue</em>' attribute.
   * @see #isSetRemoveFromQueue()
   * @see #unsetRemoveFromQueue()
   * @see #isRemoveFromQueue()
   * @generated
   */
  void setRemoveFromQueue(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#isRemoveFromQueue <em>Remove From Queue</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetRemoveFromQueue()
   * @see #isRemoveFromQueue()
   * @see #setRemoveFromQueue(boolean)
   * @generated
   */
  void unsetRemoveFromQueue();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#isRemoveFromQueue <em>Remove From Queue</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Remove From Queue</em>' attribute is set.
   * @see #unsetRemoveFromQueue()
   * @see #isRemoveFromQueue()
   * @see #setRemoveFromQueue(boolean)
   * @generated
   */
  boolean isSetRemoveFromQueue();

} // MQGetOperation
