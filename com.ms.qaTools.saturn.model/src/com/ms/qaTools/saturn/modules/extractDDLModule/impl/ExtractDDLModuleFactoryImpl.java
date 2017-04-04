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
package com.ms.qaTools.saturn.modules.extractDDLModule.impl;

import com.ms.qaTools.saturn.modules.extractDDLModule.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation;
import com.ms.qaTools.saturn.modules.extractDDLModule.DataBaseDriverTypeEnum;
import com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation;
import com.ms.qaTools.saturn.modules.extractDDLModule.DocumentRoot;
import com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLConfiguration;
import com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModuleFactory;
import com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage;
import com.ms.qaTools.saturn.modules.extractDDLModule.ExtractOperation;
import com.ms.qaTools.saturn.modules.extractDDLModule.ImpactOperation;
import com.ms.qaTools.saturn.modules.extractDDLModule.ReadOperation;
import com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation;
import com.ms.qaTools.saturn.modules.extractDDLModule.TableLockOverrideTypeEnum;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class ExtractDDLModuleFactoryImpl extends EFactoryImpl implements ExtractDDLModuleFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static ExtractDDLModuleFactory init()
  {
    try
    {
      ExtractDDLModuleFactory theExtractDDLModuleFactory = (ExtractDDLModuleFactory)EPackage.Registry.INSTANCE.getEFactory(ExtractDDLModulePackage.eNS_URI);
      if (theExtractDDLModuleFactory != null)
      {
        return theExtractDDLModuleFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ExtractDDLModuleFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ExtractDDLModuleFactoryImpl()
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
      case ExtractDDLModulePackage.ALTER_OPERATION: return createAlterOperation();
      case ExtractDDLModulePackage.DIFF_OPERATION: return createDiffOperation();
      case ExtractDDLModulePackage.DOCUMENT_ROOT: return createDocumentRoot();
      case ExtractDDLModulePackage.EXTRACT_DDL_CONFIGURATION: return createExtractDDLConfiguration();
      case ExtractDDLModulePackage.EXTRACT_OPERATION: return createExtractOperation();
      case ExtractDDLModulePackage.IMPACT_OPERATION: return createImpactOperation();
      case ExtractDDLModulePackage.READ_OPERATION: return createReadOperation();
      case ExtractDDLModulePackage.RENDER_OPERATION: return createRenderOperation();
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
      case ExtractDDLModulePackage.DATA_BASE_DRIVER_TYPE_ENUM:
        return createDataBaseDriverTypeEnumFromString(eDataType, initialValue);
      case ExtractDDLModulePackage.TABLE_LOCK_OVERRIDE_TYPE_ENUM:
        return createTableLockOverrideTypeEnumFromString(eDataType, initialValue);
      case ExtractDDLModulePackage.DATA_BASE_DRIVER_TYPE_ENUM_OBJECT:
        return createDataBaseDriverTypeEnumObjectFromString(eDataType, initialValue);
      case ExtractDDLModulePackage.TABLE_LOCK_OVERRIDE_TYPE_ENUM_OBJECT:
        return createTableLockOverrideTypeEnumObjectFromString(eDataType, initialValue);
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
      case ExtractDDLModulePackage.DATA_BASE_DRIVER_TYPE_ENUM:
        return convertDataBaseDriverTypeEnumToString(eDataType, instanceValue);
      case ExtractDDLModulePackage.TABLE_LOCK_OVERRIDE_TYPE_ENUM:
        return convertTableLockOverrideTypeEnumToString(eDataType, instanceValue);
      case ExtractDDLModulePackage.DATA_BASE_DRIVER_TYPE_ENUM_OBJECT:
        return convertDataBaseDriverTypeEnumObjectToString(eDataType, instanceValue);
      case ExtractDDLModulePackage.TABLE_LOCK_OVERRIDE_TYPE_ENUM_OBJECT:
        return convertTableLockOverrideTypeEnumObjectToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AlterOperation createAlterOperation()
  {
    AlterOperationImpl alterOperation = new AlterOperationImpl();
    return alterOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DiffOperation createDiffOperation()
  {
    DiffOperationImpl diffOperation = new DiffOperationImpl();
    return diffOperation;
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
  public ExtractDDLConfiguration createExtractDDLConfiguration()
  {
    ExtractDDLConfigurationImpl extractDDLConfiguration = new ExtractDDLConfigurationImpl();
    return extractDDLConfiguration;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ExtractOperation createExtractOperation()
  {
    ExtractOperationImpl extractOperation = new ExtractOperationImpl();
    return extractOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ImpactOperation createImpactOperation()
  {
    ImpactOperationImpl impactOperation = new ImpactOperationImpl();
    return impactOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ReadOperation createReadOperation()
  {
    ReadOperationImpl readOperation = new ReadOperationImpl();
    return readOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public RenderOperation createRenderOperation()
  {
    RenderOperationImpl renderOperation = new RenderOperationImpl();
    return renderOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DataBaseDriverTypeEnum createDataBaseDriverTypeEnumFromString(EDataType eDataType, String initialValue)
  {
    DataBaseDriverTypeEnum result = DataBaseDriverTypeEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertDataBaseDriverTypeEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TableLockOverrideTypeEnum createTableLockOverrideTypeEnumFromString(EDataType eDataType, String initialValue)
  {
    TableLockOverrideTypeEnum result = TableLockOverrideTypeEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertTableLockOverrideTypeEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DataBaseDriverTypeEnum createDataBaseDriverTypeEnumObjectFromString(EDataType eDataType, String initialValue)
  {
    return createDataBaseDriverTypeEnumFromString(ExtractDDLModulePackage.Literals.DATA_BASE_DRIVER_TYPE_ENUM, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertDataBaseDriverTypeEnumObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertDataBaseDriverTypeEnumToString(ExtractDDLModulePackage.Literals.DATA_BASE_DRIVER_TYPE_ENUM, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TableLockOverrideTypeEnum createTableLockOverrideTypeEnumObjectFromString(EDataType eDataType,
      String initialValue)
  {
    return createTableLockOverrideTypeEnumFromString(ExtractDDLModulePackage.Literals.TABLE_LOCK_OVERRIDE_TYPE_ENUM, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertTableLockOverrideTypeEnumObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertTableLockOverrideTypeEnumToString(ExtractDDLModulePackage.Literals.TABLE_LOCK_OVERRIDE_TYPE_ENUM, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ExtractDDLModulePackage getExtractDDLModulePackage()
  {
    return (ExtractDDLModulePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ExtractDDLModulePackage getPackage()
  {
    return ExtractDDLModulePackage.eINSTANCE;
  }

} // ExtractDDLModuleFactoryImpl
