package com.ms.qaTools.saturn.modules.mqModule.util;

import com.ms.qaTools.saturn.modules.mqModule.*;
import java.math.BigInteger;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import com.ms.qaTools.saturn.modules.mqModule.AbstractMQOperation;
import com.ms.qaTools.saturn.modules.mqModule.AbstractMessageProcessor;
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
import com.ms.qaTools.saturn.modules.mqModule.MqModulePackage;
import com.ms.qaTools.saturn.modules.mqModule.SimpleHeaderProcessor;
import com.ms.qaTools.saturn.modules.mqModule.WaitComparison;
import com.ms.qaTools.saturn.modules.mqModule.WaitOperator;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage
 * @generated
 */
public class MqModuleValidator extends EObjectValidator
{
  /**
   * The cached model package
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final MqModuleValidator INSTANCE                        = new MqModuleValidator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String            DIAGNOSTIC_SOURCE               = "com.ms.qaTools.saturn.modules.mqModule";

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final int              GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static final int            DIAGNOSTIC_CODE_COUNT           = GENERATED_DIAGNOSTIC_CODE_COUNT;

  /**
   * The cached base package validator.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected XMLTypeValidator            xmlTypeValidator;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MqModuleValidator()
  {
    super();
    xmlTypeValidator = XMLTypeValidator.INSTANCE;
  }

  /**
   * Returns the package of this validator switch.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EPackage getEPackage()
  {
    return MqModulePackage.eINSTANCE;
  }

  /**
   * Calls <code>validateXXX</code> for the corresponding classifier of the model.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    switch (classifierID)
    {
      case MqModulePackage.ABSTRACT_MESSAGE_PROCESSOR:
        return validateAbstractMessageProcessor((AbstractMessageProcessor)value, diagnostics, context);
      case MqModulePackage.ABSTRACT_MQ_OPERATION:
        return validateAbstractMQOperation((AbstractMQOperation)value, diagnostics, context);
      case MqModulePackage.CPS_HEADER_PROCESSOR:
        return validateCpsHeaderProcessor((CpsHeaderProcessor)value, diagnostics, context);
      case MqModulePackage.DOCUMENT_ROOT:
        return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
      case MqModulePackage.MQ_CLEAR_ACTION:
        return validateMQClearAction((MQClearAction)value, diagnostics, context);
      case MqModulePackage.MQ_CLEAR_OPERATION:
        return validateMQClearOperation((MQClearOperation)value, diagnostics, context);
      case MqModulePackage.MQ_CONFIGURATION:
        return validateMQConfiguration((MQConfiguration)value, diagnostics, context);
      case MqModulePackage.MQ_GET_ACTION:
        return validateMQGetAction((MQGetAction)value, diagnostics, context);
      case MqModulePackage.MQ_GET_OPERATION:
        return validateMQGetOperation((MQGetOperation)value, diagnostics, context);
      case MqModulePackage.MQ_GET_OUTPUT_FORMAT:
        return validateMQGetOutputFormat((MQGetOutputFormat)value, diagnostics, context);
      case MqModulePackage.MQ_PUT_ACTION:
        return validateMQPutAction((MQPutAction)value, diagnostics, context);
      case MqModulePackage.MQ_PUT_OPERATION:
        return validateMQPutOperation((MQPutOperation)value, diagnostics, context);
      case MqModulePackage.MQ_REPORT_ACTION:
        return validateMQReportAction((MQReportAction)value, diagnostics, context);
      case MqModulePackage.MQ_REPORT_OPERATION:
        return validateMQReportOperation((MQReportOperation)value, diagnostics, context);
      case MqModulePackage.MQ_WAIT_ACTION:
        return validateMQWaitAction((MQWaitAction)value, diagnostics, context);
      case MqModulePackage.MQ_WAIT_OPERATION:
        return validateMQWaitOperation((MQWaitOperation)value, diagnostics, context);
      case MqModulePackage.SIMPLE_HEADER_PROCESSOR:
        return validateSimpleHeaderProcessor((SimpleHeaderProcessor)value, diagnostics, context);
      case MqModulePackage.WAIT_COMPARISON:
        return validateWaitComparison((WaitComparison)value, diagnostics, context);
      case MqModulePackage.INPUT_MESSAGE_TYPE:
        return validateInputMessageType((InputMessageType)value, diagnostics, context);
      case MqModulePackage.WAIT_OPERATOR:
        return validateWaitOperator((WaitOperator)value, diagnostics, context);
      case MqModulePackage.INPUT_MESSAGE_TYPE_OBJECT:
        return validateInputMessageTypeObject((InputMessageType)value, diagnostics, context);
      case MqModulePackage.WAIT_DEPTH:
        return validateWaitDepth((BigInteger)value, diagnostics, context);
      case MqModulePackage.WAIT_OPERATOR_OBJECT:
        return validateWaitOperatorObject((WaitOperator)value, diagnostics, context);
      default:
        return true;
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAbstractMessageProcessor(AbstractMessageProcessor abstractMessageProcessor,
      DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(abstractMessageProcessor, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAbstractMQOperation(AbstractMQOperation abstractMQOperation, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(abstractMQOperation, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCpsHeaderProcessor(CpsHeaderProcessor cpsHeaderProcessor, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(cpsHeaderProcessor, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMQClearAction(MQClearAction mqClearAction, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(mqClearAction, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMQClearOperation(MQClearOperation mqClearOperation, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(mqClearOperation, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMQConfiguration(MQConfiguration mqConfiguration, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(mqConfiguration, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMQGetAction(MQGetAction mqGetAction, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(mqGetAction, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMQGetOperation(MQGetOperation mqGetOperation, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(mqGetOperation, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMQGetOutputFormat(MQGetOutputFormat mqGetOutputFormat, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(mqGetOutputFormat, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMQPutAction(MQPutAction mqPutAction, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(mqPutAction, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMQPutOperation(MQPutOperation mqPutOperation, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(mqPutOperation, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMQReportAction(MQReportAction mqReportAction, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(mqReportAction, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMQReportOperation(MQReportOperation mqReportOperation, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(mqReportOperation, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMQWaitAction(MQWaitAction mqWaitAction, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(mqWaitAction, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMQWaitOperation(MQWaitOperation mqWaitOperation, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(mqWaitOperation, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSimpleHeaderProcessor(SimpleHeaderProcessor simpleHeaderProcessor,
      DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(simpleHeaderProcessor, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWaitComparison(WaitComparison waitComparison, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(waitComparison, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInputMessageType(InputMessageType inputMessageType, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWaitOperator(WaitOperator waitOperator, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInputMessageTypeObject(InputMessageType inputMessageTypeObject, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWaitDepth(BigInteger waitDepth, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateWaitDepth_Min(waitDepth, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @see #validateWaitDepth_Min
   */
  public static final BigInteger WAIT_DEPTH__MIN__VALUE = new BigInteger("0");

  /**
   * Validates the Min constraint of '<em>Wait Depth</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWaitDepth_Min(BigInteger waitDepth, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = waitDepth.compareTo(WAIT_DEPTH__MIN__VALUE) >= 0;
    if (!result && diagnostics != null)
      reportMinViolation(MqModulePackage.Literals.WAIT_DEPTH, waitDepth, WAIT_DEPTH__MIN__VALUE, true, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWaitOperatorObject(WaitOperator waitOperatorObject, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return true;
  }

  /**
   * Returns the resource locator that will be used to fetch messages for this validator's diagnostics. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    // TODO
    // Specialize this to return a resource locator for messages specific to this validator.
    // Ensure that you remove @generated or mark it @generated NOT
    return super.getResourceLocator();
  }

} // MqModuleValidator
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
