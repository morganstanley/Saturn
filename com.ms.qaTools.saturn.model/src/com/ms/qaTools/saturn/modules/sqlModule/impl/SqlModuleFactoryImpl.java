package com.ms.qaTools.saturn.modules.sqlModule.impl;

import com.ms.qaTools.saturn.modules.sqlModule.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.ms.qaTools.saturn.modules.sqlModule.ClearTable;
import com.ms.qaTools.saturn.modules.sqlModule.DocumentRoot;
import com.ms.qaTools.saturn.modules.sqlModule.ExecuteCommand;
import com.ms.qaTools.saturn.modules.sqlModule.FetchQuery;
import com.ms.qaTools.saturn.modules.sqlModule.IOFileTypesEnum;
import com.ms.qaTools.saturn.modules.sqlModule.LoadTable;
import com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition;
import com.ms.qaTools.saturn.modules.sqlModule.SQLCallOperation;
import com.ms.qaTools.saturn.modules.sqlModule.SQLClearOperation;
import com.ms.qaTools.saturn.modules.sqlModule.SQLConfiguration;
import com.ms.qaTools.saturn.modules.sqlModule.SQLExecuteOperation;
import com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation;
import com.ms.qaTools.saturn.modules.sqlModule.SQLLoadOperation;
import com.ms.qaTools.saturn.modules.sqlModule.SqlModuleFactory;
import com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class SqlModuleFactoryImpl extends EFactoryImpl implements SqlModuleFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static SqlModuleFactory init()
  {
    try
    {
      SqlModuleFactory theSqlModuleFactory = (SqlModuleFactory)EPackage.Registry.INSTANCE.getEFactory(SqlModulePackage.eNS_URI);
      if (theSqlModuleFactory != null)
      {
        return theSqlModuleFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SqlModuleFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SqlModuleFactoryImpl()
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
      case SqlModulePackage.CLEAR_TABLE: return createClearTable();
      case SqlModulePackage.DOCUMENT_ROOT: return createDocumentRoot();
      case SqlModulePackage.EXECUTE_COMMAND: return createExecuteCommand();
      case SqlModulePackage.FETCH_QUERY: return createFetchQuery();
      case SqlModulePackage.LOAD_TABLE: return createLoadTable();
      case SqlModulePackage.PROC_CALL_DEFINITION: return createProcCallDefinition();
      case SqlModulePackage.SQL_CALL_OPERATION: return createSQLCallOperation();
      case SqlModulePackage.SQL_CLEAR_OPERATION: return createSQLClearOperation();
      case SqlModulePackage.SQL_CONFIGURATION: return createSQLConfiguration();
      case SqlModulePackage.SQL_EXECUTE_OPERATION: return createSQLExecuteOperation();
      case SqlModulePackage.SQL_FETCH_OPERATION: return createSQLFetchOperation();
      case SqlModulePackage.SQL_LOAD_OPERATION: return createSQLLoadOperation();
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
      case SqlModulePackage.IO_FILE_TYPES_ENUM:
        return createIOFileTypesEnumFromString(eDataType, initialValue);
      case SqlModulePackage.IO_FILE_TYPES_ENUM_OBJECT:
        return createIOFileTypesEnumObjectFromString(eDataType, initialValue);
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
      case SqlModulePackage.IO_FILE_TYPES_ENUM:
        return convertIOFileTypesEnumToString(eDataType, instanceValue);
      case SqlModulePackage.IO_FILE_TYPES_ENUM_OBJECT:
        return convertIOFileTypesEnumObjectToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ClearTable createClearTable()
  {
    ClearTableImpl clearTable = new ClearTableImpl();
    return clearTable;
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
  public ExecuteCommand createExecuteCommand()
  {
    ExecuteCommandImpl executeCommand = new ExecuteCommandImpl();
    return executeCommand;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public FetchQuery createFetchQuery()
  {
    FetchQueryImpl fetchQuery = new FetchQueryImpl();
    return fetchQuery;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public LoadTable createLoadTable()
  {
    LoadTableImpl loadTable = new LoadTableImpl();
    return loadTable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ProcCallDefinition createProcCallDefinition()
  {
    ProcCallDefinitionImpl procCallDefinition = new ProcCallDefinitionImpl();
    return procCallDefinition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SQLCallOperation createSQLCallOperation()
  {
    SQLCallOperationImpl sqlCallOperation = new SQLCallOperationImpl();
    return sqlCallOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SQLClearOperation createSQLClearOperation()
  {
    SQLClearOperationImpl sqlClearOperation = new SQLClearOperationImpl();
    return sqlClearOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SQLConfiguration createSQLConfiguration()
  {
    SQLConfigurationImpl sqlConfiguration = new SQLConfigurationImpl();
    return sqlConfiguration;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SQLExecuteOperation createSQLExecuteOperation()
  {
    SQLExecuteOperationImpl sqlExecuteOperation = new SQLExecuteOperationImpl();
    return sqlExecuteOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SQLFetchOperation createSQLFetchOperation()
  {
    SQLFetchOperationImpl sqlFetchOperation = new SQLFetchOperationImpl();
    return sqlFetchOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SQLLoadOperation createSQLLoadOperation()
  {
    SQLLoadOperationImpl sqlLoadOperation = new SQLLoadOperationImpl();
    return sqlLoadOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public IOFileTypesEnum createIOFileTypesEnumFromString(EDataType eDataType, String initialValue)
  {
    IOFileTypesEnum result = IOFileTypesEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertIOFileTypesEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public IOFileTypesEnum createIOFileTypesEnumObjectFromString(EDataType eDataType, String initialValue)
  {
    return createIOFileTypesEnumFromString(SqlModulePackage.Literals.IO_FILE_TYPES_ENUM, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertIOFileTypesEnumObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertIOFileTypesEnumToString(SqlModulePackage.Literals.IO_FILE_TYPES_ENUM, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SqlModulePackage getSqlModulePackage()
  {
    return (SqlModulePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SqlModulePackage getPackage()
  {
    return SqlModulePackage.eINSTANCE;
  }

} // SqlModuleFactoryImpl
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
