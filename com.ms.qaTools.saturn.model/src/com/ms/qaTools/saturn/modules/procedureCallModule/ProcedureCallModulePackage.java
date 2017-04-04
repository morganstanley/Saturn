package com.ms.qaTools.saturn.modules.procedureCallModule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see com.ms.qaTools.saturn.modules.procedureCallModule.ProcedureCallModuleFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface ProcedureCallModulePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                     eNAME                                         = "procedureCallModule";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                     eNS_URI                                       = "http://www.ms.com/2009/Saturn/Modules/ProcedureCall";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                     eNS_PREFIX                                    = "procedureCallModule";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  ProcedureCallModulePackage eINSTANCE                                     = com.ms.qaTools.saturn.modules.procedureCallModule.impl.ProcedureCallModulePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.procedureCallModule.impl.AbstractArgumentImpl <em>Abstract Argument</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.impl.AbstractArgumentImpl
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.impl.ProcedureCallModulePackageImpl#getAbstractArgument()
   * @generated
   */
  int                        ABSTRACT_ARGUMENT                             = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                        ABSTRACT_ARGUMENT__NAME                       = 0;

  /**
   * The number of structural features of the '<em>Abstract Argument</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                        ABSTRACT_ARGUMENT_FEATURE_COUNT               = 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.procedureCallModule.impl.AttributeArgumentImpl <em>Attribute Argument</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.impl.AttributeArgumentImpl
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.impl.ProcedureCallModulePackageImpl#getAttributeArgument()
   * @generated
   */
  int                        ATTRIBUTE_ARGUMENT                            = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                        ATTRIBUTE_ARGUMENT__NAME                      = ABSTRACT_ARGUMENT__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                        ATTRIBUTE_ARGUMENT__VALUE                     = ABSTRACT_ARGUMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Attribute Argument</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                        ATTRIBUTE_ARGUMENT_FEATURE_COUNT              = ABSTRACT_ARGUMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.procedureCallModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.impl.DocumentRootImpl
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.impl.ProcedureCallModulePackageImpl#getDocumentRoot()
   * @generated
   */
  int                        DOCUMENT_ROOT                                 = 2;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                        DOCUMENT_ROOT__MIXED                          = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                        DOCUMENT_ROOT__XMLNS_PREFIX_MAP               = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                        DOCUMENT_ROOT__XSI_SCHEMA_LOCATION            = 2;

  /**
   * The feature id for the '<em><b>Procedure Call Configuration</b></em>' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                        DOCUMENT_ROOT__PROCEDURE_CALL_CONFIGURATION   = 3;

  /**
   * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                        DOCUMENT_ROOT_FEATURE_COUNT                   = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.procedureCallModule.impl.ProcedureCallConfigurationImpl <em>Procedure Call Configuration</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.impl.ProcedureCallConfigurationImpl
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.impl.ProcedureCallModulePackageImpl#getProcedureCallConfiguration()
   * @generated
   */
  int                        PROCEDURE_CALL_CONFIGURATION                  = 3;

  /**
   * The feature id for the '<em><b>Run Group</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                        PROCEDURE_CALL_CONFIGURATION__RUN_GROUP       = 0;

  /**
   * The feature id for the '<em><b>Include</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                        PROCEDURE_CALL_CONFIGURATION__INCLUDE         = 1;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                        PROCEDURE_CALL_CONFIGURATION__ARGUMENTS       = 2;

  /**
   * The feature id for the '<em><b>Referent Result</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                        PROCEDURE_CALL_CONFIGURATION__REFERENT_RESULT = 3;

  /**
   * The number of structural features of the '<em>Procedure Call Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                        PROCEDURE_CALL_CONFIGURATION_FEATURE_COUNT    = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.procedureCallModule.impl.ResourceArgumentImpl <em>Resource Argument</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.impl.ResourceArgumentImpl
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.impl.ProcedureCallModulePackageImpl#getResourceArgument()
   * @generated
   */
  int                        RESOURCE_ARGUMENT                             = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                        RESOURCE_ARGUMENT__NAME                       = ABSTRACT_ARGUMENT__NAME;

  /**
   * The feature id for the '<em><b>Resource</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                        RESOURCE_ARGUMENT__RESOURCE                   = ABSTRACT_ARGUMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Resource Argument</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                        RESOURCE_ARGUMENT_FEATURE_COUNT               = ABSTRACT_ARGUMENT_FEATURE_COUNT + 1;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.procedureCallModule.AbstractArgument <em>Abstract Argument</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Argument</em>'.
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.AbstractArgument
   * @generated
   */
  EClass getAbstractArgument();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.procedureCallModule.AbstractArgument#getName <em>Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.AbstractArgument#getName()
   * @see #getAbstractArgument()
   * @generated
   */
  EAttribute getAbstractArgument_Name();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.procedureCallModule.AttributeArgument <em>Attribute Argument</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Argument</em>'.
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.AttributeArgument
   * @generated
   */
  EClass getAttributeArgument();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.procedureCallModule.AttributeArgument#getValue <em>Value</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.AttributeArgument#getValue()
   * @see #getAttributeArgument()
   * @generated
   */
  EReference getAttributeArgument_Value();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.procedureCallModule.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '
   * {@link com.ms.qaTools.saturn.modules.procedureCallModule.DocumentRoot#getMixed <em>Mixed</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.procedureCallModule.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.procedureCallModule.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.procedureCallModule.DocumentRoot#getProcedureCallConfiguration <em>Procedure Call Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Procedure Call Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.DocumentRoot#getProcedureCallConfiguration()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_ProcedureCallConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.procedureCallModule.ProcedureCallConfiguration <em>Procedure Call Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure Call Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.ProcedureCallConfiguration
   * @generated
   */
  EClass getProcedureCallConfiguration();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.procedureCallModule.ProcedureCallConfiguration#getRunGroup <em>Run Group</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Run Group</em>'.
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.ProcedureCallConfiguration#getRunGroup()
   * @see #getProcedureCallConfiguration()
   * @generated
   */
  EReference getProcedureCallConfiguration_RunGroup();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.procedureCallModule.ProcedureCallConfiguration#getInclude <em>Include</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Include</em>'.
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.ProcedureCallConfiguration#getInclude()
   * @see #getProcedureCallConfiguration()
   * @generated
   */
  EReference getProcedureCallConfiguration_Include();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.procedureCallModule.ProcedureCallConfiguration#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.ProcedureCallConfiguration#getArguments()
   * @see #getProcedureCallConfiguration()
   * @generated
   */
  EReference getProcedureCallConfiguration_Arguments();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.procedureCallModule.ProcedureCallConfiguration#getReferentResult <em>Referent Result</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Referent Result</em>'.
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.ProcedureCallConfiguration#getReferentResult()
   * @see #getProcedureCallConfiguration()
   * @generated
   */
  EReference getProcedureCallConfiguration_ReferentResult();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.procedureCallModule.ResourceArgument <em>Resource Argument</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Argument</em>'.
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.ResourceArgument
   * @generated
   */
  EClass getResourceArgument();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.procedureCallModule.ResourceArgument#getResource <em>Resource</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.procedureCallModule.ResourceArgument#getResource()
   * @see #getResourceArgument()
   * @generated
   */
  EReference getResourceArgument_Resource();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ProcedureCallModuleFactory getProcedureCallModuleFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.procedureCallModule.impl.AbstractArgumentImpl <em>Abstract Argument</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.procedureCallModule.impl.AbstractArgumentImpl
     * @see com.ms.qaTools.saturn.modules.procedureCallModule.impl.ProcedureCallModulePackageImpl#getAbstractArgument()
     * @generated
     */
    EClass     ABSTRACT_ARGUMENT                             = eINSTANCE.getAbstractArgument();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_ARGUMENT__NAME                       = eINSTANCE.getAbstractArgument_Name();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.procedureCallModule.impl.AttributeArgumentImpl <em>Attribute Argument</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.procedureCallModule.impl.AttributeArgumentImpl
     * @see com.ms.qaTools.saturn.modules.procedureCallModule.impl.ProcedureCallModulePackageImpl#getAttributeArgument()
     * @generated
     */
    EClass     ATTRIBUTE_ARGUMENT                            = eINSTANCE.getAttributeArgument();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_ARGUMENT__VALUE                     = eINSTANCE.getAttributeArgument_Value();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.procedureCallModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.procedureCallModule.impl.DocumentRootImpl
     * @see com.ms.qaTools.saturn.modules.procedureCallModule.impl.ProcedureCallModulePackageImpl#getDocumentRoot()
     * @generated
     */
    EClass     DOCUMENT_ROOT                                 = eINSTANCE.getDocumentRoot();

    /**
     * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__MIXED                          = eINSTANCE.getDocumentRoot_Mixed();

    /**
     * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP               = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

    /**
     * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION            = eINSTANCE.getDocumentRoot_XSISchemaLocation();

    /**
     * The meta object literal for the '<em><b>Procedure Call Configuration</b></em>' containment reference feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__PROCEDURE_CALL_CONFIGURATION   = eINSTANCE.getDocumentRoot_ProcedureCallConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.procedureCallModule.impl.ProcedureCallConfigurationImpl <em>Procedure Call Configuration</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.procedureCallModule.impl.ProcedureCallConfigurationImpl
     * @see com.ms.qaTools.saturn.modules.procedureCallModule.impl.ProcedureCallModulePackageImpl#getProcedureCallConfiguration()
     * @generated
     */
    EClass     PROCEDURE_CALL_CONFIGURATION                  = eINSTANCE.getProcedureCallConfiguration();

    /**
     * The meta object literal for the '<em><b>Run Group</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_CALL_CONFIGURATION__RUN_GROUP       = eINSTANCE.getProcedureCallConfiguration_RunGroup();

    /**
     * The meta object literal for the '<em><b>Include</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_CALL_CONFIGURATION__INCLUDE         = eINSTANCE.getProcedureCallConfiguration_Include();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference PROCEDURE_CALL_CONFIGURATION__ARGUMENTS       = eINSTANCE.getProcedureCallConfiguration_Arguments();

    /**
     * The meta object literal for the '<em><b>Referent Result</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference PROCEDURE_CALL_CONFIGURATION__REFERENT_RESULT = eINSTANCE.getProcedureCallConfiguration_ReferentResult();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.procedureCallModule.impl.ResourceArgumentImpl <em>Resource Argument</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.procedureCallModule.impl.ResourceArgumentImpl
     * @see com.ms.qaTools.saturn.modules.procedureCallModule.impl.ProcedureCallModulePackageImpl#getResourceArgument()
     * @generated
     */
    EClass     RESOURCE_ARGUMENT                             = eINSTANCE.getResourceArgument();

    /**
     * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE_ARGUMENT__RESOURCE                   = eINSTANCE.getResourceArgument_Resource();

  }

} // ProcedureCallModulePackage
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
