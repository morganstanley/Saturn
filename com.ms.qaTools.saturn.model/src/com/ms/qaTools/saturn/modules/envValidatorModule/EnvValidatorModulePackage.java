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
package com.ms.qaTools.saturn.modules.envValidatorModule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvValidatorModuleFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface EnvValidatorModulePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                    eNAME                                        = "envValidatorModule";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                    eNS_URI                                      = "http://www.ms.com/2009/Saturn/Modules/EnvValidator";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                    eNS_PREFIX                                   = "eValidatorModule";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  EnvValidatorModulePackage eINSTANCE                                    = com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvValidatorModulePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.impl.AbstractOperationImpl <em>Abstract Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.AbstractOperationImpl
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvValidatorModulePackageImpl#getAbstractOperation()
   * @generated
   */
  int                       ABSTRACT_OPERATION                           = 0;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                       ABSTRACT_OPERATION__ENABLED                  = 0;

  /**
   * The number of structural features of the '<em>Abstract Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                       ABSTRACT_OPERATION_FEATURE_COUNT             = 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.DocumentRootImpl
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvValidatorModulePackageImpl#getDocumentRoot()
   * @generated
   */
  int                       DOCUMENT_ROOT                                = 1;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                       DOCUMENT_ROOT__MIXED                         = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                       DOCUMENT_ROOT__XMLNS_PREFIX_MAP              = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                       DOCUMENT_ROOT__XSI_SCHEMA_LOCATION           = 2;

  /**
   * The feature id for the '<em><b>Env Validator Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                       DOCUMENT_ROOT__ENV_VALIDATOR_CONFIGURATION   = 3;

  /**
   * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                       DOCUMENT_ROOT_FEATURE_COUNT                  = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvironmentOperationImpl <em>Environment Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvironmentOperationImpl
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvValidatorModulePackageImpl#getEnvironmentOperation()
   * @generated
   */
  int                       ENVIRONMENT_OPERATION                        = 2;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                       ENVIRONMENT_OPERATION__ENABLED               = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Current Dir</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                       ENVIRONMENT_OPERATION__CURRENT_DIR           = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Current User</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                       ENVIRONMENT_OPERATION__CURRENT_USER          = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Current Host</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                       ENVIRONMENT_OPERATION__CURRENT_HOST          = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Env Vars</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                       ENVIRONMENT_OPERATION__ENV_VARS              = ABSTRACT_OPERATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Validate Current User</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                       ENVIRONMENT_OPERATION__VALIDATE_CURRENT_USER = ABSTRACT_OPERATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Validate Current Dir</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                       ENVIRONMENT_OPERATION__VALIDATE_CURRENT_DIR  = ABSTRACT_OPERATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Validate Current Host</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                       ENVIRONMENT_OPERATION__VALIDATE_CURRENT_HOST = ABSTRACT_OPERATION_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Environment Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                       ENVIRONMENT_OPERATION_FEATURE_COUNT          = ABSTRACT_OPERATION_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvValidatorConfigurationImpl <em>Env Validator Configuration</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvValidatorConfigurationImpl
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvValidatorModulePackageImpl#getEnvValidatorConfiguration()
   * @generated
   */
  int                       ENV_VALIDATOR_CONFIGURATION                  = 3;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                       ENV_VALIDATOR_CONFIGURATION__OPERATIONS      = 0;

  /**
   * The number of structural features of the '<em>Env Validator Configuration</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                       ENV_VALIDATOR_CONFIGURATION_FEATURE_COUNT    = 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvVarImpl <em>Env Var</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvVarImpl
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvValidatorModulePackageImpl#getEnvVar()
   * @generated
   */
  int                       ENV_VAR                                      = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                       ENV_VAR__NAME                                = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                       ENV_VAR__VALUE                               = 1;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                       ENV_VAR__ENABLED                             = 2;

  /**
   * The feature id for the '<em><b>Validate</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                       ENV_VAR__VALIDATE                            = 3;

  /**
   * The number of structural features of the '<em>Env Var</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                       ENV_VAR_FEATURE_COUNT                        = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.impl.FileSystemOperationImpl <em>File System Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.FileSystemOperationImpl
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvValidatorModulePackageImpl#getFileSystemOperation()
   * @generated
   */
  int                       FILE_SYSTEM_OPERATION                        = 5;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                       FILE_SYSTEM_OPERATION__ENABLED               = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                       FILE_SYSTEM_OPERATION__RESOURCES             = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>File System Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                       FILE_SYSTEM_OPERATION_FEATURE_COUNT          = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvVarValidationType <em>Env Var Validation Type</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvVarValidationType
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvValidatorModulePackageImpl#getEnvVarValidationType()
   * @generated
   */
  int                       ENV_VAR_VALIDATION_TYPE                      = 6;

  /**
   * The meta object id for the '<em>Env Var Validation Type Object</em>' data type.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvVarValidationType
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvValidatorModulePackageImpl#getEnvVarValidationTypeObject()
   * @generated
   */
  int                       ENV_VAR_VALIDATION_TYPE_OBJECT               = 7;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.envValidatorModule.AbstractOperation <em>Abstract Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.AbstractOperation
   * @generated
   */
  EClass getAbstractOperation();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.envValidatorModule.AbstractOperation#isEnabled <em>Enabled</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.AbstractOperation#isEnabled()
   * @see #getAbstractOperation()
   * @generated
   */
  EAttribute getAbstractOperation_Enabled();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.envValidatorModule.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.ms.qaTools.saturn.modules.envValidatorModule.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.envValidatorModule.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.envValidatorModule.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.envValidatorModule.DocumentRoot#getEnvValidatorConfiguration <em>Env Validator Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Env Validator Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.DocumentRoot#getEnvValidatorConfiguration()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_EnvValidatorConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation <em>Environment Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Environment Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation
   * @generated
   */
  EClass getEnvironmentOperation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#getCurrentDir <em>Current Dir</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Current Dir</em>'.
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#getCurrentDir()
   * @see #getEnvironmentOperation()
   * @generated
   */
  EReference getEnvironmentOperation_CurrentDir();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#getCurrentUser <em>Current User</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Current User</em>'.
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#getCurrentUser()
   * @see #getEnvironmentOperation()
   * @generated
   */
  EReference getEnvironmentOperation_CurrentUser();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#getCurrentHost <em>Current Host</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Current Host</em>'.
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#getCurrentHost()
   * @see #getEnvironmentOperation()
   * @generated
   */
  EReference getEnvironmentOperation_CurrentHost();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#getEnvVars <em>Env Vars</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Env Vars</em>'.
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#getEnvVars()
   * @see #getEnvironmentOperation()
   * @generated
   */
  EReference getEnvironmentOperation_EnvVars();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#isValidateCurrentDir <em>Validate Current Dir</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Validate Current Dir</em>'.
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#isValidateCurrentDir()
   * @see #getEnvironmentOperation()
   * @generated
   */
  EAttribute getEnvironmentOperation_ValidateCurrentDir();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#isValidateCurrentHost <em>Validate Current Host</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Validate Current Host</em>'.
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#isValidateCurrentHost()
   * @see #getEnvironmentOperation()
   * @generated
   */
  EAttribute getEnvironmentOperation_ValidateCurrentHost();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#isValidateCurrentUser <em>Validate Current User</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Validate Current User</em>'.
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#isValidateCurrentUser()
   * @see #getEnvironmentOperation()
   * @generated
   */
  EAttribute getEnvironmentOperation_ValidateCurrentUser();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvValidatorConfiguration <em>Env Validator Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Env Validator Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvValidatorConfiguration
   * @generated
   */
  EClass getEnvValidatorConfiguration();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvValidatorConfiguration#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvValidatorConfiguration#getOperations()
   * @see #getEnvValidatorConfiguration()
   * @generated
   */
  EReference getEnvValidatorConfiguration_Operations();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvVar <em>Env Var</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Env Var</em>'.
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvVar
   * @generated
   */
  EClass getEnvVar();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvVar#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvVar#getName()
   * @see #getEnvVar()
   * @generated
   */
  EReference getEnvVar_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvVar#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvVar#getValue()
   * @see #getEnvVar()
   * @generated
   */
  EReference getEnvVar_Value();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvVar#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvVar#isEnabled()
   * @see #getEnvVar()
   * @generated
   */
  EAttribute getEnvVar_Enabled();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvVar#getValidate <em>Validate</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Validate</em>'.
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvVar#getValidate()
   * @see #getEnvVar()
   * @generated
   */
  EAttribute getEnvVar_Validate();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.envValidatorModule.FileSystemOperation <em>File System Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>File System Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.FileSystemOperation
   * @generated
   */
  EClass getFileSystemOperation();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.modules.envValidatorModule.FileSystemOperation#getResources <em>Resources</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Resources</em>'.
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.FileSystemOperation#getResources()
   * @see #getFileSystemOperation()
   * @generated
   */
  EReference getFileSystemOperation_Resources();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvVarValidationType <em>Env Var Validation Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Env Var Validation Type</em>'.
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvVarValidationType
   * @generated
   */
  EEnum getEnvVarValidationType();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvVarValidationType <em>Env Var Validation Type Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Env Var Validation Type Object</em>'.
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvVarValidationType
   * @model instanceClass="com.ms.qaTools.saturn.modules.envValidatorModule.EnvVarValidationType"
   *        extendedMetaData="name='EnvVarValidationType:Object' baseType='EnvVarValidationType'"
   * @generated
   */
  EDataType getEnvVarValidationTypeObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EnvValidatorModuleFactory getEnvValidatorModuleFactory();

  /**
   * <!-- begin-user-doc --> Defines literals for the meta objects that represent
   * <ul>
   * <li>each class,</li>
   * <li>each feature of each class,</li>
   * <li>each enum,</li>
   * <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.impl.AbstractOperationImpl <em>Abstract Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.AbstractOperationImpl
     * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvValidatorModulePackageImpl#getAbstractOperation()
     * @generated
     */
    EClass     ABSTRACT_OPERATION                           = eINSTANCE.getAbstractOperation();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_OPERATION__ENABLED                  = eINSTANCE.getAbstractOperation_Enabled();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.DocumentRootImpl
     * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvValidatorModulePackageImpl#getDocumentRoot()
     * @generated
     */
    EClass     DOCUMENT_ROOT                                = eINSTANCE.getDocumentRoot();

    /**
     * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__MIXED                         = eINSTANCE.getDocumentRoot_Mixed();

    /**
     * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP              = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

    /**
     * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION           = eINSTANCE.getDocumentRoot_XSISchemaLocation();

    /**
     * The meta object literal for the '<em><b>Env Validator Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DOCUMENT_ROOT__ENV_VALIDATOR_CONFIGURATION   = eINSTANCE.getDocumentRoot_EnvValidatorConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvironmentOperationImpl <em>Environment Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvironmentOperationImpl
     * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvValidatorModulePackageImpl#getEnvironmentOperation()
     * @generated
     */
    EClass     ENVIRONMENT_OPERATION                        = eINSTANCE.getEnvironmentOperation();

    /**
     * The meta object literal for the '<em><b>Current Dir</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference ENVIRONMENT_OPERATION__CURRENT_DIR           = eINSTANCE.getEnvironmentOperation_CurrentDir();

    /**
     * The meta object literal for the '<em><b>Current User</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference ENVIRONMENT_OPERATION__CURRENT_USER          = eINSTANCE.getEnvironmentOperation_CurrentUser();

    /**
     * The meta object literal for the '<em><b>Current Host</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference ENVIRONMENT_OPERATION__CURRENT_HOST          = eINSTANCE.getEnvironmentOperation_CurrentHost();

    /**
     * The meta object literal for the '<em><b>Env Vars</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference ENVIRONMENT_OPERATION__ENV_VARS              = eINSTANCE.getEnvironmentOperation_EnvVars();

    /**
     * The meta object literal for the '<em><b>Validate Current Dir</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENVIRONMENT_OPERATION__VALIDATE_CURRENT_DIR  = eINSTANCE.getEnvironmentOperation_ValidateCurrentDir();

    /**
     * The meta object literal for the '<em><b>Validate Current Host</b></em>' attribute feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENVIRONMENT_OPERATION__VALIDATE_CURRENT_HOST = eINSTANCE.getEnvironmentOperation_ValidateCurrentHost();

    /**
     * The meta object literal for the '<em><b>Validate Current User</b></em>' attribute feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENVIRONMENT_OPERATION__VALIDATE_CURRENT_USER = eINSTANCE.getEnvironmentOperation_ValidateCurrentUser();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvValidatorConfigurationImpl <em>Env Validator Configuration</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvValidatorConfigurationImpl
     * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvValidatorModulePackageImpl#getEnvValidatorConfiguration()
     * @generated
     */
    EClass     ENV_VALIDATOR_CONFIGURATION                  = eINSTANCE.getEnvValidatorConfiguration();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference ENV_VALIDATOR_CONFIGURATION__OPERATIONS      = eINSTANCE.getEnvValidatorConfiguration_Operations();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvVarImpl <em>Env Var</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvVarImpl
     * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvValidatorModulePackageImpl#getEnvVar()
     * @generated
     */
    EClass     ENV_VAR                                      = eINSTANCE.getEnvVar();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENV_VAR__NAME                                = eINSTANCE.getEnvVar_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENV_VAR__VALUE                               = eINSTANCE.getEnvVar_Value();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ENV_VAR__ENABLED                             = eINSTANCE.getEnvVar_Enabled();

    /**
     * The meta object literal for the '<em><b>Validate</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ENV_VAR__VALIDATE                            = eINSTANCE.getEnvVar_Validate();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.impl.FileSystemOperationImpl <em>File System Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.FileSystemOperationImpl
     * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvValidatorModulePackageImpl#getFileSystemOperation()
     * @generated
     */
    EClass     FILE_SYSTEM_OPERATION                        = eINSTANCE.getFileSystemOperation();

    /**
     * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference FILE_SYSTEM_OPERATION__RESOURCES             = eINSTANCE.getFileSystemOperation_Resources();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvVarValidationType <em>Env Var Validation Type</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvVarValidationType
     * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvValidatorModulePackageImpl#getEnvVarValidationType()
     * @generated
     */
    EEnum      ENV_VAR_VALIDATION_TYPE                      = eINSTANCE.getEnvVarValidationType();

    /**
     * The meta object literal for the '<em>Env Var Validation Type Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvVarValidationType
     * @see com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvValidatorModulePackageImpl#getEnvVarValidationTypeObject()
     * @generated
     */
    EDataType  ENV_VAR_VALIDATION_TYPE_OBJECT               = eINSTANCE.getEnvVarValidationTypeObject();

  }

} // EnvValidatorModulePackage
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
