package com.ms.qaTools.saturn.modules.mqModule.impl;

import com.ms.qaTools.saturn.modules.mqModule.*;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import com.ms.qaTools.saturn.modules.mqModule.CpsHeaderProcessor;
import com.ms.qaTools.saturn.modules.mqModule.DocumentRoot;
import com.ms.qaTools.saturn.modules.mqModule.InputMessageType;
import com.ms.qaTools.saturn.modules.mqModule.MQClearAction;
import com.ms.qaTools.saturn.modules.mqModule.MQClearOperation;
import com.ms.qaTools.saturn.modules.mqModule.MQConfiguration;
import com.ms.qaTools.saturn.modules.mqModule.MQGetAction;
import com.ms.qaTools.saturn.modules.mqModule.MQGetOperation;
import com.ms.qaTools.saturn.modules.mqModule.MQGetOutputFormat;
import com.ms.qaTools.saturn.modules.mqModule.MQPutAction;
import com.ms.qaTools.saturn.modules.mqModule.MQPutOperation;
import com.ms.qaTools.saturn.modules.mqModule.MQReportAction;
import com.ms.qaTools.saturn.modules.mqModule.MQReportOperation;
import com.ms.qaTools.saturn.modules.mqModule.MQWaitAction;
import com.ms.qaTools.saturn.modules.mqModule.MQWaitOperation;
import com.ms.qaTools.saturn.modules.mqModule.MqModuleFactory;
import com.ms.qaTools.saturn.modules.mqModule.MqModulePackage;
import com.ms.qaTools.saturn.modules.mqModule.SimpleHeaderProcessor;
import com.ms.qaTools.saturn.modules.mqModule.WaitComparison;
import com.ms.qaTools.saturn.modules.mqModule.WaitOperator;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class MqModuleFactoryImpl extends EFactoryImpl implements MqModuleFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static MqModuleFactory init()
  {
    try
    {
      MqModuleFactory theMqModuleFactory = (MqModuleFactory)EPackage.Registry.INSTANCE.getEFactory(MqModulePackage.eNS_URI);
      if (theMqModuleFactory != null)
      {
        return theMqModuleFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MqModuleFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MqModuleFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MqModulePackage.CPS_HEADER_PROCESSOR: return createCpsHeaderProcessor();
      case MqModulePackage.DOCUMENT_ROOT: return createDocumentRoot();
      case MqModulePackage.MQ_CLEAR_ACTION: return createMQClearAction();
      case MqModulePackage.MQ_CLEAR_OPERATION: return createMQClearOperation();
      case MqModulePackage.MQ_CONFIGURATION: return createMQConfiguration();
      case MqModulePackage.MQ_GET_ACTION: return createMQGetAction();
      case MqModulePackage.MQ_GET_OPERATION: return createMQGetOperation();
      case MqModulePackage.MQ_GET_OUTPUT_FORMAT: return createMQGetOutputFormat();
      case MqModulePackage.MQ_PUT_ACTION: return createMQPutAction();
      case MqModulePackage.MQ_PUT_OPERATION: return createMQPutOperation();
      case MqModulePackage.MQ_REPORT_ACTION: return createMQReportAction();
      case MqModulePackage.MQ_REPORT_OPERATION: return createMQReportOperation();
      case MqModulePackage.MQ_WAIT_ACTION: return createMQWaitAction();
      case MqModulePackage.MQ_WAIT_OPERATION: return createMQWaitOperation();
      case MqModulePackage.SIMPLE_HEADER_PROCESSOR: return createSimpleHeaderProcessor();
      case MqModulePackage.WAIT_COMPARISON: return createWaitComparison();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MqModulePackage.INPUT_MESSAGE_TYPE:
        return createInputMessageTypeFromString(eDataType, initialValue);
      case MqModulePackage.WAIT_OPERATOR:
        return createWaitOperatorFromString(eDataType, initialValue);
      case MqModulePackage.INPUT_MESSAGE_TYPE_OBJECT:
        return createInputMessageTypeObjectFromString(eDataType, initialValue);
      case MqModulePackage.WAIT_DEPTH:
        return createWaitDepthFromString(eDataType, initialValue);
      case MqModulePackage.WAIT_OPERATOR_OBJECT:
        return createWaitOperatorObjectFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MqModulePackage.INPUT_MESSAGE_TYPE:
        return convertInputMessageTypeToString(eDataType, instanceValue);
      case MqModulePackage.WAIT_OPERATOR:
        return convertWaitOperatorToString(eDataType, instanceValue);
      case MqModulePackage.INPUT_MESSAGE_TYPE_OBJECT:
        return convertInputMessageTypeObjectToString(eDataType, instanceValue);
      case MqModulePackage.WAIT_DEPTH:
        return convertWaitDepthToString(eDataType, instanceValue);
      case MqModulePackage.WAIT_OPERATOR_OBJECT:
        return convertWaitOperatorObjectToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CpsHeaderProcessor createCpsHeaderProcessor()
  {
    CpsHeaderProcessorImpl cpsHeaderProcessor = new CpsHeaderProcessorImpl();
    return cpsHeaderProcessor;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DocumentRoot createDocumentRoot()
  {
    DocumentRootImpl documentRoot = new DocumentRootImpl();
    return documentRoot;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MQClearAction createMQClearAction()
  {
    MQClearActionImpl mqClearAction = new MQClearActionImpl();
    return mqClearAction;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MQClearOperation createMQClearOperation()
  {
    MQClearOperationImpl mqClearOperation = new MQClearOperationImpl();
    return mqClearOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MQConfiguration createMQConfiguration()
  {
    MQConfigurationImpl mqConfiguration = new MQConfigurationImpl();
    return mqConfiguration;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MQGetAction createMQGetAction()
  {
    MQGetActionImpl mqGetAction = new MQGetActionImpl();
    return mqGetAction;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MQGetOperation createMQGetOperation()
  {
    MQGetOperationImpl mqGetOperation = new MQGetOperationImpl();
    return mqGetOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MQGetOutputFormat createMQGetOutputFormat()
  {
    MQGetOutputFormatImpl mqGetOutputFormat = new MQGetOutputFormatImpl();
    return mqGetOutputFormat;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MQPutAction createMQPutAction()
  {
    MQPutActionImpl mqPutAction = new MQPutActionImpl();
    return mqPutAction;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MQPutOperation createMQPutOperation()
  {
    MQPutOperationImpl mqPutOperation = new MQPutOperationImpl();
    return mqPutOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MQReportAction createMQReportAction()
  {
    MQReportActionImpl mqReportAction = new MQReportActionImpl();
    return mqReportAction;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MQReportOperation createMQReportOperation()
  {
    MQReportOperationImpl mqReportOperation = new MQReportOperationImpl();
    return mqReportOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MQWaitAction createMQWaitAction()
  {
    MQWaitActionImpl mqWaitAction = new MQWaitActionImpl();
    return mqWaitAction;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MQWaitOperation createMQWaitOperation()
  {
    MQWaitOperationImpl mqWaitOperation = new MQWaitOperationImpl();
    return mqWaitOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SimpleHeaderProcessor createSimpleHeaderProcessor()
  {
    SimpleHeaderProcessorImpl simpleHeaderProcessor = new SimpleHeaderProcessorImpl();
    return simpleHeaderProcessor;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public WaitComparison createWaitComparison()
  {
    WaitComparisonImpl waitComparison = new WaitComparisonImpl();
    return waitComparison;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public InputMessageType createInputMessageTypeFromString(EDataType eDataType, String initialValue)
  {
    InputMessageType result = InputMessageType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertInputMessageTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public WaitOperator createWaitOperatorFromString(EDataType eDataType, String initialValue)
  {
    WaitOperator result = WaitOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertWaitOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public InputMessageType createInputMessageTypeObjectFromString(EDataType eDataType, String initialValue)
  {
    return createInputMessageTypeFromString(MqModulePackage.Literals.INPUT_MESSAGE_TYPE, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertInputMessageTypeObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertInputMessageTypeToString(MqModulePackage.Literals.INPUT_MESSAGE_TYPE, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BigInteger createWaitDepthFromString(EDataType eDataType, String initialValue)
  {
    return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertWaitDepthToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public WaitOperator createWaitOperatorObjectFromString(EDataType eDataType, String initialValue)
  {
    return createWaitOperatorFromString(MqModulePackage.Literals.WAIT_OPERATOR, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertWaitOperatorObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertWaitOperatorToString(MqModulePackage.Literals.WAIT_OPERATOR, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MqModulePackage getMqModulePackage()
  {
    return (MqModulePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MqModulePackage getPackage()
  {
    return MqModulePackage.eINSTANCE;
  }

} // MqModuleFactoryImpl
/*
Copyright 2017 Morgan Stanley

Licensed under the GNU Lesser General Public License Version 3 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

https://www.gnu.org/licenses/lgpl-3.0.en.html

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

IN ADDITION, THE FOLLOWING DISCLAIMER APPLIES IN CONNECTION WITH THIS PROGRAM:

THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY
WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT
OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING
IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY
OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY
USING THIS OR ANOTHER EQUIVALENT DISCLAIMER IN ADDITION TO ANY OTHER REQUIRED
LICENSE TERMS.
*/
