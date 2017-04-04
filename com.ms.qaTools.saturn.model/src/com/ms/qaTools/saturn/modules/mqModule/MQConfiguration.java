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

import org.eclipse.emf.ecore.EObject;

import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>MQ Configuration</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQConfiguration#getMQResource <em>MQ Resource</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQConfiguration#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQConfiguration()
 * @model annotation=
 *        "http://www.ms.com/2006/pdsttools/xsd2perl basePackage='true' executable='Saturn::Module::MQ::Executable' isa='Saturn::Script::AbstractStep'"
 *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib name='mq'"
 *        extendedMetaData="name='Configuration_._type' kind='elementOnly'"
 * @generated
 */
public interface MQConfiguration extends EObject
{
  /**
   * Returns the value of the '<em><b>MQ Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>MQ Resource</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>MQ Resource</em>' containment reference.
   * @see #setMQResource(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQConfiguration_MQResource()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='MQResource' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getMQResource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQConfiguration#getMQResource <em>MQ Resource</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>MQ Resource</em>' containment reference.
   * @see #getMQResource()
   * @generated
   */
  void setMQResource(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' containment reference.
   * @see #setOperation(AbstractMQOperation)
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQConfiguration_Operation()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Operation' namespace='##targetNamespace'"
   * @generated
   */
  AbstractMQOperation getOperation();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQConfiguration#getOperation <em>Operation</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' containment reference.
   * @see #getOperation()
   * @generated
   */
  void setOperation(AbstractMQOperation value);

} // MQConfiguration
