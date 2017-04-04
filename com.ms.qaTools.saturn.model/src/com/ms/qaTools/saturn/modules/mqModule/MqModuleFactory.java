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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage
 * @generated
 */
public interface MqModuleFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  MqModuleFactory eINSTANCE = com.ms.qaTools.saturn.modules.mqModule.impl.MqModuleFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Cps Header Processor</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Cps Header Processor</em>'.
   * @generated
   */
  CpsHeaderProcessor createCpsHeaderProcessor();

  /**
   * Returns a new object of class '<em>Document Root</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Document Root</em>'.
   * @generated
   */
  DocumentRoot createDocumentRoot();

  /**
   * Returns a new object of class '<em>MQ Clear Action</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>MQ Clear Action</em>'.
   * @generated
   */
  MQClearAction createMQClearAction();

  /**
   * Returns a new object of class '<em>MQ Clear Operation</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>MQ Clear Operation</em>'.
   * @generated
   */
  MQClearOperation createMQClearOperation();

  /**
   * Returns a new object of class '<em>MQ Configuration</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>MQ Configuration</em>'.
   * @generated
   */
  MQConfiguration createMQConfiguration();

  /**
   * Returns a new object of class '<em>MQ Get Action</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>MQ Get Action</em>'.
   * @generated
   */
  MQGetAction createMQGetAction();

  /**
   * Returns a new object of class '<em>MQ Get Operation</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>MQ Get Operation</em>'.
   * @generated
   */
  MQGetOperation createMQGetOperation();

  /**
   * Returns a new object of class '<em>MQ Get Output Format</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>MQ Get Output Format</em>'.
   * @generated
   */
  MQGetOutputFormat createMQGetOutputFormat();

  /**
   * Returns a new object of class '<em>MQ Put Action</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>MQ Put Action</em>'.
   * @generated
   */
  MQPutAction createMQPutAction();

  /**
   * Returns a new object of class '<em>MQ Put Operation</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>MQ Put Operation</em>'.
   * @generated
   */
  MQPutOperation createMQPutOperation();

  /**
   * Returns a new object of class '<em>MQ Report Action</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>MQ Report Action</em>'.
   * @generated
   */
  MQReportAction createMQReportAction();

  /**
   * Returns a new object of class '<em>MQ Report Operation</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>MQ Report Operation</em>'.
   * @generated
   */
  MQReportOperation createMQReportOperation();

  /**
   * Returns a new object of class '<em>MQ Wait Action</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>MQ Wait Action</em>'.
   * @generated
   */
  MQWaitAction createMQWaitAction();

  /**
   * Returns a new object of class '<em>MQ Wait Operation</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>MQ Wait Operation</em>'.
   * @generated
   */
  MQWaitOperation createMQWaitOperation();

  /**
   * Returns a new object of class '<em>Simple Header Processor</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Header Processor</em>'.
   * @generated
   */
  SimpleHeaderProcessor createSimpleHeaderProcessor();

  /**
   * Returns a new object of class '<em>Wait Comparison</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Wait Comparison</em>'.
   * @generated
   */
  WaitComparison createWaitComparison();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MqModulePackage getMqModulePackage();

} // MqModuleFactory
