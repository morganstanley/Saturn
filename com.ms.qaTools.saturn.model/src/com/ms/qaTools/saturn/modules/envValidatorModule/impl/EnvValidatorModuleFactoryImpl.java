/**
 * COPYRIGHT NOTICE AND DISCLAIMER
 *  
 * Copyright © 2009, Contributor
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License, version 3 for more details.
 * You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
 * THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
 */
package com.ms.qaTools.saturn.modules.envValidatorModule.impl;

import com.ms.qaTools.saturn.modules.envValidatorModule.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.ms.qaTools.saturn.modules.envValidatorModule.AbstractOperation;
import com.ms.qaTools.saturn.modules.envValidatorModule.DocumentRoot;
import com.ms.qaTools.saturn.modules.envValidatorModule.EnvValidatorConfiguration;
import com.ms.qaTools.saturn.modules.envValidatorModule.EnvValidatorModuleFactory;
import com.ms.qaTools.saturn.modules.envValidatorModule.EnvValidatorModulePackage;
import com.ms.qaTools.saturn.modules.envValidatorModule.EnvVar;
import com.ms.qaTools.saturn.modules.envValidatorModule.EnvVarValidationType;
import com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation;
import com.ms.qaTools.saturn.modules.envValidatorModule.FileSystemOperation;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class EnvValidatorModuleFactoryImpl extends EFactoryImpl implements EnvValidatorModuleFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static EnvValidatorModuleFactory init()
  {
    try
    {
      EnvValidatorModuleFactory theEnvValidatorModuleFactory = (EnvValidatorModuleFactory)EPackage.Registry.INSTANCE.getEFactory(EnvValidatorModulePackage.eNS_URI);
      if (theEnvValidatorModuleFactory != null)
      {
        return theEnvValidatorModuleFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EnvValidatorModuleFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EnvValidatorModuleFactoryImpl()
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
      case EnvValidatorModulePackage.ABSTRACT_OPERATION: return createAbstractOperation();
      case EnvValidatorModulePackage.DOCUMENT_ROOT: return createDocumentRoot();
      case EnvValidatorModulePackage.ENVIRONMENT_OPERATION: return createEnvironmentOperation();
      case EnvValidatorModulePackage.ENV_VALIDATOR_CONFIGURATION: return createEnvValidatorConfiguration();
      case EnvValidatorModulePackage.ENV_VAR: return createEnvVar();
      case EnvValidatorModulePackage.FILE_SYSTEM_OPERATION: return createFileSystemOperation();
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
      case EnvValidatorModulePackage.ENV_VAR_VALIDATION_TYPE:
        return createEnvVarValidationTypeFromString(eDataType, initialValue);
      case EnvValidatorModulePackage.ENV_VAR_VALIDATION_TYPE_OBJECT:
        return createEnvVarValidationTypeObjectFromString(eDataType, initialValue);
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
      case EnvValidatorModulePackage.ENV_VAR_VALIDATION_TYPE:
        return convertEnvVarValidationTypeToString(eDataType, instanceValue);
      case EnvValidatorModulePackage.ENV_VAR_VALIDATION_TYPE_OBJECT:
        return convertEnvVarValidationTypeObjectToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AbstractOperation createAbstractOperation()
  {
    AbstractOperationImpl abstractOperation = new AbstractOperationImpl();
    return abstractOperation;
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
  public EnvironmentOperation createEnvironmentOperation()
  {
    EnvironmentOperationImpl environmentOperation = new EnvironmentOperationImpl();
    return environmentOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EnvValidatorConfiguration createEnvValidatorConfiguration()
  {
    EnvValidatorConfigurationImpl envValidatorConfiguration = new EnvValidatorConfigurationImpl();
    return envValidatorConfiguration;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EnvVar createEnvVar()
  {
    EnvVarImpl envVar = new EnvVarImpl();
    return envVar;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public FileSystemOperation createFileSystemOperation()
  {
    FileSystemOperationImpl fileSystemOperation = new FileSystemOperationImpl();
    return fileSystemOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EnvVarValidationType createEnvVarValidationTypeFromString(EDataType eDataType, String initialValue)
  {
    EnvVarValidationType result = EnvVarValidationType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertEnvVarValidationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EnvVarValidationType createEnvVarValidationTypeObjectFromString(EDataType eDataType, String initialValue)
  {
    return createEnvVarValidationTypeFromString(EnvValidatorModulePackage.Literals.ENV_VAR_VALIDATION_TYPE, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertEnvVarValidationTypeObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertEnvVarValidationTypeToString(EnvValidatorModulePackage.Literals.ENV_VAR_VALIDATION_TYPE, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EnvValidatorModulePackage getEnvValidatorModulePackage()
  {
    return (EnvValidatorModulePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EnvValidatorModulePackage getPackage()
  {
    return EnvValidatorModulePackage.eINSTANCE;
  }

} // EnvValidatorModuleFactoryImpl
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
