package com.ms.qaTools.saturn.annotations.saturnWeb.util;

import com.ms.qaTools.saturn.annotations.saturnWeb.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import com.ms.qaTools.saturn.annotations.saturnWeb.AbstractSourceDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.AbstractTargetDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.DropDownOption;
import com.ms.qaTools.saturn.annotations.saturnWeb.DropDownSourceDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.FileSelectorSourceDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebConfiguration;
import com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage;
import com.ms.qaTools.saturn.annotations.saturnWeb.SingleValueEnvVarTargetDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.SingleValueTargetDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.TextSourceDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.ValueDefinition;
import com.ms.qaTools.saturn.types.AbstractAnnotation;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage
 * @generated
 */
public class SaturnWebAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static SaturnWebPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SaturnWebAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SaturnWebPackage.eINSTANCE;
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
  protected SaturnWebSwitch<Adapter> modelSwitch = new SaturnWebSwitch<Adapter>()
    {
      @Override
      public Adapter caseAbstractSourceDefinition(AbstractSourceDefinition object)
      {
        return createAbstractSourceDefinitionAdapter();
      }
      @Override
      public Adapter caseAbstractTargetDefinition(AbstractTargetDefinition object)
      {
        return createAbstractTargetDefinitionAdapter();
      }
      @Override
      public Adapter caseDropDownOption(DropDownOption object)
      {
        return createDropDownOptionAdapter();
      }
      @Override
      public Adapter caseDropDownSourceDefinition(DropDownSourceDefinition object)
      {
        return createDropDownSourceDefinitionAdapter();
      }
      @Override
      public Adapter caseFileSelectorSourceDefinition(FileSelectorSourceDefinition object)
      {
        return createFileSelectorSourceDefinitionAdapter();
      }
      @Override
      public Adapter caseSaturnWebConfiguration(SaturnWebConfiguration object)
      {
        return createSaturnWebConfigurationAdapter();
      }
      @Override
      public Adapter caseSingleValueEnvVarTargetDefinition(SingleValueEnvVarTargetDefinition object)
      {
        return createSingleValueEnvVarTargetDefinitionAdapter();
      }
      @Override
      public Adapter caseSingleValueTargetDefinition(SingleValueTargetDefinition object)
      {
        return createSingleValueTargetDefinitionAdapter();
      }
      @Override
      public Adapter caseTextSourceDefinition(TextSourceDefinition object)
      {
        return createTextSourceDefinitionAdapter();
      }
      @Override
      public Adapter caseValueDefinition(ValueDefinition object)
      {
        return createValueDefinitionAdapter();
      }
      @Override
      public Adapter caseAbstractAnnotation(AbstractAnnotation object)
      {
        return createAbstractAnnotationAdapter();
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
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.annotations.saturnWeb.AbstractSourceDefinition <em>Abstract Source Definition</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.AbstractSourceDefinition
   * @generated
   */
  public Adapter createAbstractSourceDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.annotations.saturnWeb.AbstractTargetDefinition <em>Abstract Target Definition</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.AbstractTargetDefinition
   * @generated
   */
  public Adapter createAbstractTargetDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.annotations.saturnWeb.DropDownOption <em>Drop Down Option</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.DropDownOption
   * @generated
   */
  public Adapter createDropDownOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.annotations.saturnWeb.DropDownSourceDefinition <em>Drop Down Source Definition</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.DropDownSourceDefinition
   * @generated
   */
  public Adapter createDropDownSourceDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.annotations.saturnWeb.FileSelectorSourceDefinition <em>File Selector Source Definition</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so
   * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.FileSelectorSourceDefinition
   * @generated
   */
  public Adapter createFileSelectorSourceDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '
   * {@link com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebConfiguration <em>Configuration</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebConfiguration
   * @generated
   */
  public Adapter createSaturnWebConfigurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.annotations.saturnWeb.SingleValueEnvVarTargetDefinition <em>Single Value Env Var Target Definition</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null
   * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SingleValueEnvVarTargetDefinition
   * @generated
   */
  public Adapter createSingleValueEnvVarTargetDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.annotations.saturnWeb.SingleValueTargetDefinition <em>Single Value Target Definition</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that
   * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SingleValueTargetDefinition
   * @generated
   */
  public Adapter createSingleValueTargetDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '
   * {@link com.ms.qaTools.saturn.annotations.saturnWeb.TextSourceDefinition <em>Text Source Definition</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.TextSourceDefinition
   * @generated
   */
  public Adapter createTextSourceDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.annotations.saturnWeb.ValueDefinition <em>Value Definition</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.ValueDefinition
   * @generated
   */
  public Adapter createValueDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.types.AbstractAnnotation <em>Abstract Annotation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.types.AbstractAnnotation
   * @generated
   */
  public Adapter createAbstractAnnotationAdapter()
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

} // SaturnWebAdapterFactory
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
