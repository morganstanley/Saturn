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

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>MQ Wait Operation</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQWaitOperation#getComparison <em>Comparison</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQWaitOperation#getQueues <em>Queues</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQWaitOperation#getWaitedTime <em>Waited Time</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQWaitOperation()
 * @model annotation=
 *        "http://www.ms.com/2006/pdsttools/xsd2perl executable='Saturn::Module::MQ::MQWait::Executable' package='Saturn::Module::MQ::MQWait'"
 *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib createUpdater='true' name='mqWait'"
 *        extendedMetaData="name='MQWaitOperation' kind='elementOnly'"
 * @generated
 */
public interface MQWaitOperation extends AbstractMQOperation
{
  /**
   * Returns the value of the '<em><b>Comparison</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comparison</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comparison</em>' containment reference.
   * @see #setComparison(WaitComparison)
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQWaitOperation_Comparison()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Comparison' namespace='##targetNamespace'"
   * @generated
   */
  WaitComparison getComparison();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQWaitOperation#getComparison <em>Comparison</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Comparison</em>' containment reference.
   * @see #getComparison()
   * @generated
   */
  void setComparison(WaitComparison value);

  /**
   * Returns the value of the '<em><b>Queues</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.modules.mqModule.MQWaitAction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Queues</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Queues</em>' containment reference list.
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQWaitOperation_Queues()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Queues' namespace='##targetNamespace'"
   * @generated
   */
  EList<MQWaitAction> getQueues();

} // MQWaitOperation