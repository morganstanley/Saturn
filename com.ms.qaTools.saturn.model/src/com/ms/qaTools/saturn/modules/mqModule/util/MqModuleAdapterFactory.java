package com.ms.qaTools.saturn.modules.mqModule.util;

import com.ms.qaTools.saturn.modules.mqModule.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

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
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage
 * @generated
 */
public class MqModuleAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static MqModulePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MqModuleAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MqModulePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc --> This implementation
   * returns <code>true</code> if the object is either the model's package or is an instance object of the model. <!--
   * end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected MqModuleSwitch<Adapter> modelSwitch = new MqModuleSwitch<Adapter>()
    {
      @Override
      public Adapter caseAbstractMessageProcessor(AbstractMessageProcessor object)
      {
        return createAbstractMessageProcessorAdapter();
      }
      @Override
      public Adapter caseAbstractMQOperation(AbstractMQOperation object)
      {
        return createAbstractMQOperationAdapter();
      }
      @Override
      public Adapter caseCpsHeaderProcessor(CpsHeaderProcessor object)
      {
        return createCpsHeaderProcessorAdapter();
      }
      @Override
      public Adapter caseDocumentRoot(DocumentRoot object)
      {
        return createDocumentRootAdapter();
      }
      @Override
      public Adapter caseMQClearAction(MQClearAction object)
      {
        return createMQClearActionAdapter();
      }
      @Override
      public Adapter caseMQClearOperation(MQClearOperation object)
      {
        return createMQClearOperationAdapter();
      }
      @Override
      public Adapter caseMQConfiguration(MQConfiguration object)
      {
        return createMQConfigurationAdapter();
      }
      @Override
      public Adapter caseMQGetAction(MQGetAction object)
      {
        return createMQGetActionAdapter();
      }
      @Override
      public Adapter caseMQGetOperation(MQGetOperation object)
      {
        return createMQGetOperationAdapter();
      }
      @Override
      public Adapter caseMQGetOutputFormat(MQGetOutputFormat object)
      {
        return createMQGetOutputFormatAdapter();
      }
      @Override
      public Adapter caseMQPutAction(MQPutAction object)
      {
        return createMQPutActionAdapter();
      }
      @Override
      public Adapter caseMQPutOperation(MQPutOperation object)
      {
        return createMQPutOperationAdapter();
      }
      @Override
      public Adapter caseMQReportAction(MQReportAction object)
      {
        return createMQReportActionAdapter();
      }
      @Override
      public Adapter caseMQReportOperation(MQReportOperation object)
      {
        return createMQReportOperationAdapter();
      }
      @Override
      public Adapter caseMQWaitAction(MQWaitAction object)
      {
        return createMQWaitActionAdapter();
      }
      @Override
      public Adapter caseMQWaitOperation(MQWaitOperation object)
      {
        return createMQWaitOperationAdapter();
      }
      @Override
      public Adapter caseSimpleHeaderProcessor(SimpleHeaderProcessor object)
      {
        return createSimpleHeaderProcessorAdapter();
      }
      @Override
      public Adapter caseWaitComparison(WaitComparison object)
      {
        return createWaitComparisonAdapter();
      }
      @Override
      public Adapter caseDescribable(Describable object)
      {
        return createDescribableAdapter();
      }
      @Override
      public Adapter caseComplexValue(ComplexValue object)
      {
        return createComplexValueAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }

  /**
   * Creates a new adapter for an object of class '
   * {@link com.ms.qaTools.saturn.modules.mqModule.AbstractMessageProcessor <em>Abstract Message Processor</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.mqModule.AbstractMessageProcessor
   * @generated
   */
  public Adapter createAbstractMessageProcessorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.mqModule.AbstractMQOperation <em>Abstract MQ Operation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.mqModule.AbstractMQOperation
   * @generated
   */
  public Adapter createAbstractMQOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.mqModule.CpsHeaderProcessor <em>Cps Header Processor</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.mqModule.CpsHeaderProcessor
   * @generated
   */
  public Adapter createCpsHeaderProcessorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.mqModule.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.mqModule.DocumentRoot
   * @generated
   */
  public Adapter createDocumentRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.mqModule.MQClearAction <em>MQ Clear Action</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQClearAction
   * @generated
   */
  public Adapter createMQClearActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.mqModule.MQClearOperation <em>MQ Clear Operation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQClearOperation
   * @generated
   */
  public Adapter createMQClearOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.mqModule.MQConfiguration <em>MQ Configuration</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQConfiguration
   * @generated
   */
  public Adapter createMQConfigurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetAction <em>MQ Get Action</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQGetAction
   * @generated
   */
  public Adapter createMQGetActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation <em>MQ Get Operation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQGetOperation
   * @generated
   */
  public Adapter createMQGetOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOutputFormat <em>MQ Get Output Format</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQGetOutputFormat
   * @generated
   */
  public Adapter createMQGetOutputFormatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction <em>MQ Put Action</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQPutAction
   * @generated
   */
  public Adapter createMQPutActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutOperation <em>MQ Put Operation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQPutOperation
   * @generated
   */
  public Adapter createMQPutOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.mqModule.MQReportAction <em>MQ Report Action</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQReportAction
   * @generated
   */
  public Adapter createMQReportActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.mqModule.MQReportOperation <em>MQ Report Operation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQReportOperation
   * @generated
   */
  public Adapter createMQReportOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.mqModule.MQWaitAction <em>MQ Wait Action</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQWaitAction
   * @generated
   */
  public Adapter createMQWaitActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.mqModule.MQWaitOperation <em>MQ Wait Operation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQWaitOperation
   * @generated
   */
  public Adapter createMQWaitOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.mqModule.SimpleHeaderProcessor <em>Simple Header Processor</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.mqModule.SimpleHeaderProcessor
   * @generated
   */
  public Adapter createSimpleHeaderProcessorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.mqModule.WaitComparison <em>Wait Comparison</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.mqModule.WaitComparison
   * @generated
   */
  public Adapter createWaitComparisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.values.Describable <em>Describable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.values.Describable
   * @generated
   */
  public Adapter createDescribableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.values.ComplexValue <em>Complex Value</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.values.ComplexValue
   * @generated
   */
  public Adapter createComplexValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc --> This default implementation returns null. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} // MqModuleAdapterFactory
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
