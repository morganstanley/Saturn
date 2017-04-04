package com.ms.qaTools.saturn.modules.mqModule.util;

import com.ms.qaTools.saturn.modules.mqModule.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import com.ms.qaTools.saturn.modules.mqModule.AbstractMQOperation;
import com.ms.qaTools.saturn.modules.mqModule.AbstractMessageProcessor;
import com.ms.qaTools.saturn.modules.mqModule.CpsHeaderProcessor;
import com.ms.qaTools.saturn.modules.mqModule.DocumentRoot;
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
import com.ms.qaTools.saturn.values.ComplexValue;
import com.ms.qaTools.saturn.values.Describable;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage
 * @generated
 */
public class MqModuleSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static MqModulePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MqModuleSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MqModulePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MqModulePackage.ABSTRACT_MESSAGE_PROCESSOR:
      {
        AbstractMessageProcessor abstractMessageProcessor = (AbstractMessageProcessor)theEObject;
        T result = caseAbstractMessageProcessor(abstractMessageProcessor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqModulePackage.ABSTRACT_MQ_OPERATION:
      {
        AbstractMQOperation abstractMQOperation = (AbstractMQOperation)theEObject;
        T result = caseAbstractMQOperation(abstractMQOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqModulePackage.CPS_HEADER_PROCESSOR:
      {
        CpsHeaderProcessor cpsHeaderProcessor = (CpsHeaderProcessor)theEObject;
        T result = caseCpsHeaderProcessor(cpsHeaderProcessor);
        if (result == null) result = caseAbstractMessageProcessor(cpsHeaderProcessor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqModulePackage.DOCUMENT_ROOT:
      {
        DocumentRoot documentRoot = (DocumentRoot)theEObject;
        T result = caseDocumentRoot(documentRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqModulePackage.MQ_CLEAR_ACTION:
      {
        MQClearAction mqClearAction = (MQClearAction)theEObject;
        T result = caseMQClearAction(mqClearAction);
        if (result == null) result = caseComplexValue(mqClearAction);
        if (result == null) result = caseDescribable(mqClearAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqModulePackage.MQ_CLEAR_OPERATION:
      {
        MQClearOperation mqClearOperation = (MQClearOperation)theEObject;
        T result = caseMQClearOperation(mqClearOperation);
        if (result == null) result = caseAbstractMQOperation(mqClearOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqModulePackage.MQ_CONFIGURATION:
      {
        MQConfiguration mqConfiguration = (MQConfiguration)theEObject;
        T result = caseMQConfiguration(mqConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqModulePackage.MQ_GET_ACTION:
      {
        MQGetAction mqGetAction = (MQGetAction)theEObject;
        T result = caseMQGetAction(mqGetAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqModulePackage.MQ_GET_OPERATION:
      {
        MQGetOperation mqGetOperation = (MQGetOperation)theEObject;
        T result = caseMQGetOperation(mqGetOperation);
        if (result == null) result = caseAbstractMQOperation(mqGetOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqModulePackage.MQ_GET_OUTPUT_FORMAT:
      {
        MQGetOutputFormat mqGetOutputFormat = (MQGetOutputFormat)theEObject;
        T result = caseMQGetOutputFormat(mqGetOutputFormat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqModulePackage.MQ_PUT_ACTION:
      {
        MQPutAction mqPutAction = (MQPutAction)theEObject;
        T result = caseMQPutAction(mqPutAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqModulePackage.MQ_PUT_OPERATION:
      {
        MQPutOperation mqPutOperation = (MQPutOperation)theEObject;
        T result = caseMQPutOperation(mqPutOperation);
        if (result == null) result = caseAbstractMQOperation(mqPutOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqModulePackage.MQ_REPORT_ACTION:
      {
        MQReportAction mqReportAction = (MQReportAction)theEObject;
        T result = caseMQReportAction(mqReportAction);
        if (result == null) result = caseComplexValue(mqReportAction);
        if (result == null) result = caseDescribable(mqReportAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqModulePackage.MQ_REPORT_OPERATION:
      {
        MQReportOperation mqReportOperation = (MQReportOperation)theEObject;
        T result = caseMQReportOperation(mqReportOperation);
        if (result == null) result = caseAbstractMQOperation(mqReportOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqModulePackage.MQ_WAIT_ACTION:
      {
        MQWaitAction mqWaitAction = (MQWaitAction)theEObject;
        T result = caseMQWaitAction(mqWaitAction);
        if (result == null) result = caseComplexValue(mqWaitAction);
        if (result == null) result = caseDescribable(mqWaitAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqModulePackage.MQ_WAIT_OPERATION:
      {
        MQWaitOperation mqWaitOperation = (MQWaitOperation)theEObject;
        T result = caseMQWaitOperation(mqWaitOperation);
        if (result == null) result = caseAbstractMQOperation(mqWaitOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqModulePackage.SIMPLE_HEADER_PROCESSOR:
      {
        SimpleHeaderProcessor simpleHeaderProcessor = (SimpleHeaderProcessor)theEObject;
        T result = caseSimpleHeaderProcessor(simpleHeaderProcessor);
        if (result == null) result = caseAbstractMessageProcessor(simpleHeaderProcessor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MqModulePackage.WAIT_COMPARISON:
      {
        WaitComparison waitComparison = (WaitComparison)theEObject;
        T result = caseWaitComparison(waitComparison);
        if (result == null) result = caseComplexValue(waitComparison);
        if (result == null) result = caseDescribable(waitComparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Message Processor</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Message Processor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractMessageProcessor(AbstractMessageProcessor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract MQ Operation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract MQ Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractMQOperation(AbstractMQOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cps Header Processor</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cps Header Processor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCpsHeaderProcessor(CpsHeaderProcessor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocumentRoot(DocumentRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MQ Clear Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MQ Clear Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMQClearAction(MQClearAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MQ Clear Operation</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MQ Clear Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMQClearOperation(MQClearOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MQ Configuration</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MQ Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMQConfiguration(MQConfiguration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MQ Get Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MQ Get Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMQGetAction(MQGetAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MQ Get Operation</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MQ Get Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMQGetOperation(MQGetOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MQ Get Output Format</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MQ Get Output Format</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMQGetOutputFormat(MQGetOutputFormat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MQ Put Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MQ Put Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMQPutAction(MQPutAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MQ Put Operation</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MQ Put Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMQPutOperation(MQPutOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MQ Report Action</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MQ Report Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMQReportAction(MQReportAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MQ Report Operation</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MQ Report Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMQReportOperation(MQReportOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MQ Wait Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MQ Wait Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMQWaitAction(MQWaitAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MQ Wait Operation</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MQ Wait Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMQWaitOperation(MQWaitOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Header Processor</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Header Processor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleHeaderProcessor(SimpleHeaderProcessor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wait Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wait Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWaitComparison(WaitComparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Describable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Describable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDescribable(Describable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexValue(ComplexValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch, but this is the last case
   * anyway. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} // MqModuleSwitch
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
