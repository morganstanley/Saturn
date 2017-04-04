package com.ms.qaTools.saturn.modules.sqlModule.util;

import com.ms.qaTools.saturn.modules.sqlModule.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import com.ms.qaTools.saturn.modules.sqlModule.AbstractSQLOperation;
import com.ms.qaTools.saturn.modules.sqlModule.ClearTable;
import com.ms.qaTools.saturn.modules.sqlModule.DocumentRoot;
import com.ms.qaTools.saturn.modules.sqlModule.ExecuteCommand;
import com.ms.qaTools.saturn.modules.sqlModule.FetchQuery;
import com.ms.qaTools.saturn.modules.sqlModule.LoadTable;
import com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition;
import com.ms.qaTools.saturn.modules.sqlModule.SQLCallOperation;
import com.ms.qaTools.saturn.modules.sqlModule.SQLClearOperation;
import com.ms.qaTools.saturn.modules.sqlModule.SQLConfiguration;
import com.ms.qaTools.saturn.modules.sqlModule.SQLExecuteOperation;
import com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation;
import com.ms.qaTools.saturn.modules.sqlModule.SQLLoadOperation;
import com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage;
import com.ms.qaTools.saturn.values.ComplexValue;
import com.ms.qaTools.saturn.values.Describable;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage
 * @generated
 */
public class SqlModuleAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static SqlModulePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SqlModuleAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SqlModulePackage.eINSTANCE;
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
  protected SqlModuleSwitch<Adapter> modelSwitch = new SqlModuleSwitch<Adapter>()
    {
      @Override
      public Adapter caseAbstractSQLOperation(AbstractSQLOperation object)
      {
        return createAbstractSQLOperationAdapter();
      }
      @Override
      public Adapter caseClearTable(ClearTable object)
      {
        return createClearTableAdapter();
      }
      @Override
      public Adapter caseDocumentRoot(DocumentRoot object)
      {
        return createDocumentRootAdapter();
      }
      @Override
      public Adapter caseExecuteCommand(ExecuteCommand object)
      {
        return createExecuteCommandAdapter();
      }
      @Override
      public Adapter caseFetchQuery(FetchQuery object)
      {
        return createFetchQueryAdapter();
      }
      @Override
      public Adapter caseLoadTable(LoadTable object)
      {
        return createLoadTableAdapter();
      }
      @Override
      public Adapter caseProcCallDefinition(ProcCallDefinition object)
      {
        return createProcCallDefinitionAdapter();
      }
      @Override
      public Adapter caseSQLCallOperation(SQLCallOperation object)
      {
        return createSQLCallOperationAdapter();
      }
      @Override
      public Adapter caseSQLClearOperation(SQLClearOperation object)
      {
        return createSQLClearOperationAdapter();
      }
      @Override
      public Adapter caseSQLConfiguration(SQLConfiguration object)
      {
        return createSQLConfigurationAdapter();
      }
      @Override
      public Adapter caseSQLExecuteOperation(SQLExecuteOperation object)
      {
        return createSQLExecuteOperationAdapter();
      }
      @Override
      public Adapter caseSQLFetchOperation(SQLFetchOperation object)
      {
        return createSQLFetchOperationAdapter();
      }
      @Override
      public Adapter caseSQLLoadOperation(SQLLoadOperation object)
      {
        return createSQLLoadOperationAdapter();
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
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.sqlModule.AbstractSQLOperation <em>Abstract SQL Operation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.sqlModule.AbstractSQLOperation
   * @generated
   */
  public Adapter createAbstractSQLOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.sqlModule.ClearTable <em>Clear Table</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.sqlModule.ClearTable
   * @generated
   */
  public Adapter createClearTableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.sqlModule.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.sqlModule.DocumentRoot
   * @generated
   */
  public Adapter createDocumentRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.sqlModule.ExecuteCommand <em>Execute Command</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.sqlModule.ExecuteCommand
   * @generated
   */
  public Adapter createExecuteCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.sqlModule.FetchQuery <em>Fetch Query</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.sqlModule.FetchQuery
   * @generated
   */
  public Adapter createFetchQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.sqlModule.LoadTable <em>Load Table</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.sqlModule.LoadTable
   * @generated
   */
  public Adapter createLoadTableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition <em>Proc Call Definition</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition
   * @generated
   */
  public Adapter createProcCallDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLCallOperation <em>SQL Call Operation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLCallOperation
   * @generated
   */
  public Adapter createSQLCallOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLClearOperation <em>SQL Clear Operation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLClearOperation
   * @generated
   */
  public Adapter createSQLClearOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLConfiguration <em>SQL Configuration</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLConfiguration
   * @generated
   */
  public Adapter createSQLConfigurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLExecuteOperation <em>SQL Execute Operation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLExecuteOperation
   * @generated
   */
  public Adapter createSQLExecuteOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation <em>SQL Fetch Operation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation
   * @generated
   */
  public Adapter createSQLFetchOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLLoadOperation <em>SQL Load Operation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLLoadOperation
   * @generated
   */
  public Adapter createSQLLoadOperationAdapter()
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

} // SqlModuleAdapterFactory
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
