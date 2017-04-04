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
package com.ms.qaTools.saturn.modules.runcmdsModule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import com.ms.qaTools.saturn.values.ValuesPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.modules.runcmdsModule.RuncmdsModuleFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface RuncmdsModulePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String               eNAME                                    = "runcmdsModule";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String               eNS_URI                                  = "http://www.ms.com/2006/Saturn/Modules/RunCmds";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String               eNS_PREFIX                               = "runCmdsModule";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  RuncmdsModulePackage eINSTANCE                                = com.ms.qaTools.saturn.modules.runcmdsModule.impl.RuncmdsModulePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.runcmdsModule.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.impl.CommandImpl
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.impl.RuncmdsModulePackageImpl#getCommand()
   * @generated
   */
  int                  COMMAND                                  = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__DESCRIPTION = ValuesPackage.COMPLEX_VALUE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  COMMAND__MIXED                           = ValuesPackage.COMPLEX_VALUE__MIXED;

  /**
   * The feature id for the '<em><b>Null</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  COMMAND__NULL                            = ValuesPackage.COMPLEX_VALUE__NULL;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  COMMAND__GROUP                           = ValuesPackage.COMPLEX_VALUE__GROUP;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                  COMMAND__TEXT                            = ValuesPackage.COMPLEX_VALUE__TEXT;

  /**
   * The feature id for the '<em><b>Env Var</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  COMMAND__ENV_VAR                         = ValuesPackage.COMPLEX_VALUE__ENV_VAR;

  /**
   * The feature id for the '<em><b>File</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                  COMMAND__FILE                            = ValuesPackage.COMPLEX_VALUE__FILE;

  /**
   * The feature id for the '<em><b>XPath Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  COMMAND__XPATH_VALUE                     = ValuesPackage.COMPLEX_VALUE__XPATH_VALUE;

  /**
   * The feature id for the '<em><b>JSON Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__JSON_VALUE = ValuesPackage.COMPLEX_VALUE__JSON_VALUE;

  /**
   * The feature id for the '<em><b>FIX Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__FIX_VALUE = ValuesPackage.COMPLEX_VALUE__FIX_VALUE;

  /**
   * The feature id for the '<em><b>Cell Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  COMMAND__CELL_VALUE                      = ValuesPackage.COMPLEX_VALUE__CELL_VALUE;

  /**
   * The feature id for the '<em><b>Property Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  COMMAND__PROPERTY_VALUE                  = ValuesPackage.COMPLEX_VALUE__PROPERTY_VALUE;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                  COMMAND__CODE                            = ValuesPackage.COMPLEX_VALUE__CODE;

  /**
   * The feature id for the '<em><b>Run Number</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  COMMAND__RUN_NUMBER                      = ValuesPackage.COMPLEX_VALUE__RUN_NUMBER;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  COMMAND__REFERENCE                       = ValuesPackage.COMPLEX_VALUE__REFERENCE;

  /**
   * The feature id for the '<em><b>Memoize</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  COMMAND__MEMOIZE                         = ValuesPackage.COMPLEX_VALUE__MEMOIZE;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  COMMAND__ENABLED                         = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tee</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  COMMAND__TEE                             = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  COMMAND_FEATURE_COUNT                    = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.runcmdsModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.impl.DocumentRootImpl
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.impl.RuncmdsModulePackageImpl#getDocumentRoot()
   * @generated
   */
  int                  DOCUMENT_ROOT                            = 1;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  DOCUMENT_ROOT__MIXED                     = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  DOCUMENT_ROOT__XMLNS_PREFIX_MAP          = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  DOCUMENT_ROOT__XSI_SCHEMA_LOCATION       = 2;

  /**
   * The feature id for the '<em><b>Run Cmds Configuration</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  DOCUMENT_ROOT__RUN_CMDS_CONFIGURATION    = 3;

  /**
   * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                  DOCUMENT_ROOT_FEATURE_COUNT              = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.runcmdsModule.impl.RunCmdsConfigurationImpl <em>Run Cmds Configuration</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.impl.RunCmdsConfigurationImpl
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.impl.RuncmdsModulePackageImpl#getRunCmdsConfiguration()
   * @generated
   */
  int                  RUN_CMDS_CONFIGURATION                   = 2;

  /**
   * The feature id for the '<em><b>Check Str</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                  RUN_CMDS_CONFIGURATION__CHECK_STR        = 0;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  RUN_CMDS_CONFIGURATION__COMMANDS         = 1;

  /**
   * The feature id for the '<em><b>Interpreter</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  RUN_CMDS_CONFIGURATION__INTERPRETER      = 2;

  /**
   * The feature id for the '<em><b>Check Str Action</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                  RUN_CMDS_CONFIGURATION__CHECK_STR_ACTION = 3;

  /**
   * The number of structural features of the '<em>Run Cmds Configuration</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                  RUN_CMDS_CONFIGURATION_FEATURE_COUNT     = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.runcmdsModule.CheckStrActionEnum <em>Check Str Action Enum</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.CheckStrActionEnum
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.impl.RuncmdsModulePackageImpl#getCheckStrActionEnum()
   * @generated
   */
  int                  CHECK_STR_ACTION_ENUM                    = 3;

  /**
   * The meta object id for the '<em>Check Str Action Enum Object</em>' data type.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.CheckStrActionEnum
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.impl.RuncmdsModulePackageImpl#getCheckStrActionEnumObject()
   * @generated
   */
  int                  CHECK_STR_ACTION_ENUM_OBJECT             = 4;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.runcmdsModule.Command <em>Command</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.runcmdsModule.Command#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.Command#isEnabled()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Enabled();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.runcmdsModule.Command#isTee <em>Tee</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tee</em>'.
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.Command#isTee()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Tee();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.runcmdsModule.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.ms.qaTools.saturn.modules.runcmdsModule.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '
   * {@link com.ms.qaTools.saturn.modules.runcmdsModule.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.runcmdsModule.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.runcmdsModule.DocumentRoot#getRunCmdsConfiguration <em>Run Cmds Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Run Cmds Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.DocumentRoot#getRunCmdsConfiguration()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_RunCmdsConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.runcmdsModule.RunCmdsConfiguration <em>Run Cmds Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Run Cmds Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.RunCmdsConfiguration
   * @generated
   */
  EClass getRunCmdsConfiguration();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.runcmdsModule.RunCmdsConfiguration#getCheckStr <em>Check Str</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Check Str</em>'.
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.RunCmdsConfiguration#getCheckStr()
   * @see #getRunCmdsConfiguration()
   * @generated
   */
  EReference getRunCmdsConfiguration_CheckStr();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.modules.runcmdsModule.RunCmdsConfiguration#getCommands <em>Commands</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.RunCmdsConfiguration#getCommands()
   * @see #getRunCmdsConfiguration()
   * @generated
   */
  EReference getRunCmdsConfiguration_Commands();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.runcmdsModule.RunCmdsConfiguration#getCheckStrAction <em>Check Str Action</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Check Str Action</em>'.
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.RunCmdsConfiguration#getCheckStrAction()
   * @see #getRunCmdsConfiguration()
   * @generated
   */
  EAttribute getRunCmdsConfiguration_CheckStrAction();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.runcmdsModule.RunCmdsConfiguration#getInterpreter <em>Interpreter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Interpreter</em>'.
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.RunCmdsConfiguration#getInterpreter()
   * @see #getRunCmdsConfiguration()
   * @generated
   */
  EAttribute getRunCmdsConfiguration_Interpreter();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.modules.runcmdsModule.CheckStrActionEnum <em>Check Str Action Enum</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Check Str Action Enum</em>'.
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.CheckStrActionEnum
   * @generated
   */
  EEnum getCheckStrActionEnum();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.modules.runcmdsModule.CheckStrActionEnum <em>Check Str Action Enum Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Check Str Action Enum Object</em>'.
   * @see com.ms.qaTools.saturn.modules.runcmdsModule.CheckStrActionEnum
   * @model instanceClass="com.ms.qaTools.saturn.modules.runcmdsModule.CheckStrActionEnum"
   *        extendedMetaData="name='CheckStrActionEnum:Object' baseType='CheckStrActionEnum'"
   * @generated
   */
  EDataType getCheckStrActionEnumObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RuncmdsModuleFactory getRuncmdsModuleFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.runcmdsModule.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.runcmdsModule.impl.CommandImpl
     * @see com.ms.qaTools.saturn.modules.runcmdsModule.impl.RuncmdsModulePackageImpl#getCommand()
     * @generated
     */
    EClass     COMMAND                                  = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__ENABLED                         = eINSTANCE.getCommand_Enabled();

    /**
     * The meta object literal for the '<em><b>Tee</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__TEE                             = eINSTANCE.getCommand_Tee();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.runcmdsModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.runcmdsModule.impl.DocumentRootImpl
     * @see com.ms.qaTools.saturn.modules.runcmdsModule.impl.RuncmdsModulePackageImpl#getDocumentRoot()
     * @generated
     */
    EClass     DOCUMENT_ROOT                            = eINSTANCE.getDocumentRoot();

    /**
     * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__MIXED                     = eINSTANCE.getDocumentRoot_Mixed();

    /**
     * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP          = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

    /**
     * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION       = eINSTANCE.getDocumentRoot_XSISchemaLocation();

    /**
     * The meta object literal for the '<em><b>Run Cmds Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DOCUMENT_ROOT__RUN_CMDS_CONFIGURATION    = eINSTANCE.getDocumentRoot_RunCmdsConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.runcmdsModule.impl.RunCmdsConfigurationImpl <em>Run Cmds Configuration</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.runcmdsModule.impl.RunCmdsConfigurationImpl
     * @see com.ms.qaTools.saturn.modules.runcmdsModule.impl.RuncmdsModulePackageImpl#getRunCmdsConfiguration()
     * @generated
     */
    EClass     RUN_CMDS_CONFIGURATION                   = eINSTANCE.getRunCmdsConfiguration();

    /**
     * The meta object literal for the '<em><b>Check Str</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference RUN_CMDS_CONFIGURATION__CHECK_STR        = eINSTANCE.getRunCmdsConfiguration_CheckStr();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference RUN_CMDS_CONFIGURATION__COMMANDS         = eINSTANCE.getRunCmdsConfiguration_Commands();

    /**
     * The meta object literal for the '<em><b>Check Str Action</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RUN_CMDS_CONFIGURATION__CHECK_STR_ACTION = eINSTANCE.getRunCmdsConfiguration_CheckStrAction();

    /**
     * The meta object literal for the '<em><b>Interpreter</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute RUN_CMDS_CONFIGURATION__INTERPRETER      = eINSTANCE.getRunCmdsConfiguration_Interpreter();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.runcmdsModule.CheckStrActionEnum <em>Check Str Action Enum</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.runcmdsModule.CheckStrActionEnum
     * @see com.ms.qaTools.saturn.modules.runcmdsModule.impl.RuncmdsModulePackageImpl#getCheckStrActionEnum()
     * @generated
     */
    EEnum      CHECK_STR_ACTION_ENUM                    = eINSTANCE.getCheckStrActionEnum();

    /**
     * The meta object literal for the '<em>Check Str Action Enum Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.runcmdsModule.CheckStrActionEnum
     * @see com.ms.qaTools.saturn.modules.runcmdsModule.impl.RuncmdsModulePackageImpl#getCheckStrActionEnumObject()
     * @generated
     */
    EDataType  CHECK_STR_ACTION_ENUM_OBJECT             = eINSTANCE.getCheckStrActionEnumObject();

  }

} // RuncmdsModulePackage
