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
package com.ms.qaTools.saturn.annotations.saturnWeb;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import com.ms.qaTools.saturn.types.TypesPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2006/pdsttools/xsd2perl nsPrefix='saturnWeb' package='Saturn::Web::XML'"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface SaturnWebPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String           eNAME                                                = "saturnWeb";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String           eNS_URI                                              = "http://www.ms.com/2008/Saturn/SaturnWeb";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String           eNS_PREFIX                                           = "saturnWeb";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  SaturnWebPackage eINSTANCE                                            = com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.AbstractSourceDefinitionImpl <em>Abstract Source Definition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.AbstractSourceDefinitionImpl
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl#getAbstractSourceDefinition()
   * @generated
   */
  int              ABSTRACT_SOURCE_DEFINITION                           = 0;

  /**
   * The feature id for the '<em><b>Caption</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              ABSTRACT_SOURCE_DEFINITION__CAPTION                  = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              ABSTRACT_SOURCE_DEFINITION__DESCRIPTION              = 1;

  /**
   * The number of structural features of the '<em>Abstract Source Definition</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              ABSTRACT_SOURCE_DEFINITION_FEATURE_COUNT             = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.AbstractTargetDefinitionImpl <em>Abstract Target Definition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.AbstractTargetDefinitionImpl
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl#getAbstractTargetDefinition()
   * @generated
   */
  int              ABSTRACT_TARGET_DEFINITION                           = 1;

  /**
   * The number of structural features of the '<em>Abstract Target Definition</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              ABSTRACT_TARGET_DEFINITION_FEATURE_COUNT             = 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.DropDownOptionImpl <em>Drop Down Option</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.DropDownOptionImpl
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl#getDropDownOption()
   * @generated
   */
  int              DROP_DOWN_OPTION                                     = 2;

  /**
   * The feature id for the '<em><b>Selected</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              DROP_DOWN_OPTION__SELECTED                           = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              DROP_DOWN_OPTION__TEXT                               = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              DROP_DOWN_OPTION__VALUE                              = 2;

  /**
   * The number of structural features of the '<em>Drop Down Option</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              DROP_DOWN_OPTION_FEATURE_COUNT                       = 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.DropDownSourceDefinitionImpl <em>Drop Down Source Definition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.DropDownSourceDefinitionImpl
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl#getDropDownSourceDefinition()
   * @generated
   */
  int              DROP_DOWN_SOURCE_DEFINITION                          = 3;

  /**
   * The feature id for the '<em><b>Caption</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              DROP_DOWN_SOURCE_DEFINITION__CAPTION                 = ABSTRACT_SOURCE_DEFINITION__CAPTION;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              DROP_DOWN_SOURCE_DEFINITION__DESCRIPTION             = ABSTRACT_SOURCE_DEFINITION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              DROP_DOWN_SOURCE_DEFINITION__OPTIONS                 = ABSTRACT_SOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Multi Select</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              DROP_DOWN_SOURCE_DEFINITION__MULTI_SELECT            = ABSTRACT_SOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Drop Down Source Definition</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              DROP_DOWN_SOURCE_DEFINITION_FEATURE_COUNT            = ABSTRACT_SOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.FileSelectorSourceDefinitionImpl <em>File Selector Source Definition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.FileSelectorSourceDefinitionImpl
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl#getFileSelectorSourceDefinition()
   * @generated
   */
  int              FILE_SELECTOR_SOURCE_DEFINITION                      = 4;

  /**
   * The feature id for the '<em><b>Caption</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              FILE_SELECTOR_SOURCE_DEFINITION__CAPTION             = ABSTRACT_SOURCE_DEFINITION__CAPTION;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              FILE_SELECTOR_SOURCE_DEFINITION__DESCRIPTION         = ABSTRACT_SOURCE_DEFINITION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Directory</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              FILE_SELECTOR_SOURCE_DEFINITION__DIRECTORY           = ABSTRACT_SOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>File Pattern</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              FILE_SELECTOR_SOURCE_DEFINITION__FILE_PATTERN        = ABSTRACT_SOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              FILE_SELECTOR_SOURCE_DEFINITION__DEFAULT_VALUE       = ABSTRACT_SOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Selector Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              FILE_SELECTOR_SOURCE_DEFINITION__SELECTOR_TYPE       = ABSTRACT_SOURCE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>File Selector Source Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              FILE_SELECTOR_SOURCE_DEFINITION_FEATURE_COUNT        = ABSTRACT_SOURCE_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebConfigurationImpl <em>Configuration</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebConfigurationImpl
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl#getSaturnWebConfiguration()
   * @generated
   */
  int              SATURN_WEB_CONFIGURATION                             = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              SATURN_WEB_CONFIGURATION__NAME                       = TypesPackage.ABSTRACT_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              SATURN_WEB_CONFIGURATION__DESCRIPTION                = TypesPackage.ABSTRACT_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              SATURN_WEB_CONFIGURATION__VALUES                     = TypesPackage.ABSTRACT_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              SATURN_WEB_CONFIGURATION__ENABLED                    = TypesPackage.ABSTRACT_ANNOTATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Configuration</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              SATURN_WEB_CONFIGURATION_FEATURE_COUNT               = TypesPackage.ABSTRACT_ANNOTATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.SingleValueTargetDefinitionImpl <em>Single Value Target Definition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SingleValueTargetDefinitionImpl
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl#getSingleValueTargetDefinition()
   * @generated
   */
  int              SINGLE_VALUE_TARGET_DEFINITION                       = 7;

  /**
   * The number of structural features of the '<em>Single Value Target Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              SINGLE_VALUE_TARGET_DEFINITION_FEATURE_COUNT         = ABSTRACT_TARGET_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.SingleValueEnvVarTargetDefinitionImpl <em>Single Value Env Var Target Definition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SingleValueEnvVarTargetDefinitionImpl
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl#getSingleValueEnvVarTargetDefinition()
   * @generated
   */
  int              SINGLE_VALUE_ENV_VAR_TARGET_DEFINITION               = 6;

  /**
   * The feature id for the '<em><b>Env Var</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              SINGLE_VALUE_ENV_VAR_TARGET_DEFINITION__ENV_VAR      = SINGLE_VALUE_TARGET_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Single Value Env Var Target Definition</em>' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int              SINGLE_VALUE_ENV_VAR_TARGET_DEFINITION_FEATURE_COUNT = SINGLE_VALUE_TARGET_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.TextSourceDefinitionImpl <em>Text Source Definition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.TextSourceDefinitionImpl
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl#getTextSourceDefinition()
   * @generated
   */
  int              TEXT_SOURCE_DEFINITION                               = 8;

  /**
   * The feature id for the '<em><b>Caption</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              TEXT_SOURCE_DEFINITION__CAPTION                      = ABSTRACT_SOURCE_DEFINITION__CAPTION;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              TEXT_SOURCE_DEFINITION__DESCRIPTION                  = ABSTRACT_SOURCE_DEFINITION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              TEXT_SOURCE_DEFINITION__DEFAULT_VALUE                = ABSTRACT_SOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Multi Line</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              TEXT_SOURCE_DEFINITION__MULTI_LINE                   = ABSTRACT_SOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Password</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              TEXT_SOURCE_DEFINITION__PASSWORD                     = ABSTRACT_SOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Text Source Definition</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              TEXT_SOURCE_DEFINITION_FEATURE_COUNT                 = ABSTRACT_SOURCE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.ValueDefinitionImpl <em>Value Definition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.ValueDefinitionImpl
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl#getValueDefinition()
   * @generated
   */
  int              VALUE_DEFINITION                                     = 9;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              VALUE_DEFINITION__SOURCE                             = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              VALUE_DEFINITION__TARGET                             = 1;

  /**
   * The number of structural features of the '<em>Value Definition</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              VALUE_DEFINITION_FEATURE_COUNT                       = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.SelectorTypeEnum <em>Selector Type Enum</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SelectorTypeEnum
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl#getSelectorTypeEnum()
   * @generated
   */
  int              SELECTOR_TYPE_ENUM                                   = 10;

  /**
   * The meta object id for the '<em>Selector Type Enum Object</em>' data type.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SelectorTypeEnum
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl#getSelectorTypeEnumObject()
   * @generated
   */
  int              SELECTOR_TYPE_ENUM_OBJECT                            = 11;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.annotations.saturnWeb.AbstractSourceDefinition <em>Abstract Source Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Source Definition</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.AbstractSourceDefinition
   * @generated
   */
  EClass getAbstractSourceDefinition();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.annotations.saturnWeb.AbstractSourceDefinition#getCaption <em>Caption</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Caption</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.AbstractSourceDefinition#getCaption()
   * @see #getAbstractSourceDefinition()
   * @generated
   */
  EAttribute getAbstractSourceDefinition_Caption();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.annotations.saturnWeb.AbstractSourceDefinition#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.AbstractSourceDefinition#getDescription()
   * @see #getAbstractSourceDefinition()
   * @generated
   */
  EAttribute getAbstractSourceDefinition_Description();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.annotations.saturnWeb.AbstractTargetDefinition <em>Abstract Target Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Target Definition</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.AbstractTargetDefinition
   * @generated
   */
  EClass getAbstractTargetDefinition();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.annotations.saturnWeb.DropDownOption <em>Drop Down Option</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Drop Down Option</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.DropDownOption
   * @generated
   */
  EClass getDropDownOption();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.annotations.saturnWeb.DropDownOption#isSelected <em>Selected</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Selected</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.DropDownOption#isSelected()
   * @see #getDropDownOption()
   * @generated
   */
  EAttribute getDropDownOption_Selected();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.annotations.saturnWeb.DropDownOption#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.DropDownOption#getText()
   * @see #getDropDownOption()
   * @generated
   */
  EAttribute getDropDownOption_Text();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.annotations.saturnWeb.DropDownOption#getValue <em>Value</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.DropDownOption#getValue()
   * @see #getDropDownOption()
   * @generated
   */
  EAttribute getDropDownOption_Value();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.annotations.saturnWeb.DropDownSourceDefinition <em>Drop Down Source Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Drop Down Source Definition</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.DropDownSourceDefinition
   * @generated
   */
  EClass getDropDownSourceDefinition();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.annotations.saturnWeb.DropDownSourceDefinition#getOptions <em>Options</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.DropDownSourceDefinition#getOptions()
   * @see #getDropDownSourceDefinition()
   * @generated
   */
  EReference getDropDownSourceDefinition_Options();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.annotations.saturnWeb.DropDownSourceDefinition#isMultiSelect <em>Multi Select</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multi Select</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.DropDownSourceDefinition#isMultiSelect()
   * @see #getDropDownSourceDefinition()
   * @generated
   */
  EAttribute getDropDownSourceDefinition_MultiSelect();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.annotations.saturnWeb.FileSelectorSourceDefinition <em>File Selector Source Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>File Selector Source Definition</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.FileSelectorSourceDefinition
   * @generated
   */
  EClass getFileSelectorSourceDefinition();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.annotations.saturnWeb.FileSelectorSourceDefinition#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.FileSelectorSourceDefinition#getDefaultValue()
   * @see #getFileSelectorSourceDefinition()
   * @generated
   */
  EAttribute getFileSelectorSourceDefinition_DefaultValue();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.annotations.saturnWeb.FileSelectorSourceDefinition#getDirectory <em>Directory</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Directory</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.FileSelectorSourceDefinition#getDirectory()
   * @see #getFileSelectorSourceDefinition()
   * @generated
   */
  EAttribute getFileSelectorSourceDefinition_Directory();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.annotations.saturnWeb.FileSelectorSourceDefinition#getFilePattern <em>File Pattern</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File Pattern</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.FileSelectorSourceDefinition#getFilePattern()
   * @see #getFileSelectorSourceDefinition()
   * @generated
   */
  EAttribute getFileSelectorSourceDefinition_FilePattern();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.annotations.saturnWeb.FileSelectorSourceDefinition#getSelectorType <em>Selector Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Selector Type</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.FileSelectorSourceDefinition#getSelectorType()
   * @see #getFileSelectorSourceDefinition()
   * @generated
   */
  EAttribute getFileSelectorSourceDefinition_SelectorType();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebConfiguration <em>Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Configuration</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebConfiguration
   * @generated
   */
  EClass getSaturnWebConfiguration();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebConfiguration#getName <em>Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebConfiguration#getName()
   * @see #getSaturnWebConfiguration()
   * @generated
   */
  EAttribute getSaturnWebConfiguration_Name();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebConfiguration#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebConfiguration#getDescription()
   * @see #getSaturnWebConfiguration()
   * @generated
   */
  EAttribute getSaturnWebConfiguration_Description();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebConfiguration#getValues <em>Values</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebConfiguration#getValues()
   * @see #getSaturnWebConfiguration()
   * @generated
   */
  EReference getSaturnWebConfiguration_Values();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebConfiguration#isEnabled <em>Enabled</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebConfiguration#isEnabled()
   * @see #getSaturnWebConfiguration()
   * @generated
   */
  EAttribute getSaturnWebConfiguration_Enabled();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.annotations.saturnWeb.SingleValueEnvVarTargetDefinition <em>Single Value Env Var Target Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Value Env Var Target Definition</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SingleValueEnvVarTargetDefinition
   * @generated
   */
  EClass getSingleValueEnvVarTargetDefinition();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.annotations.saturnWeb.SingleValueEnvVarTargetDefinition#getEnvVar <em>Env Var</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Env Var</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SingleValueEnvVarTargetDefinition#getEnvVar()
   * @see #getSingleValueEnvVarTargetDefinition()
   * @generated
   */
  EAttribute getSingleValueEnvVarTargetDefinition_EnvVar();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.annotations.saturnWeb.SingleValueTargetDefinition <em>Single Value Target Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Value Target Definition</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SingleValueTargetDefinition
   * @generated
   */
  EClass getSingleValueTargetDefinition();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.annotations.saturnWeb.TextSourceDefinition <em>Text Source Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Source Definition</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.TextSourceDefinition
   * @generated
   */
  EClass getTextSourceDefinition();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.annotations.saturnWeb.TextSourceDefinition#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.TextSourceDefinition#getDefaultValue()
   * @see #getTextSourceDefinition()
   * @generated
   */
  EAttribute getTextSourceDefinition_DefaultValue();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.annotations.saturnWeb.TextSourceDefinition#isMultiLine <em>Multi Line</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Multi Line</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.TextSourceDefinition#isMultiLine()
   * @see #getTextSourceDefinition()
   * @generated
   */
  EAttribute getTextSourceDefinition_MultiLine();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.annotations.saturnWeb.TextSourceDefinition#isPassword <em>Password</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Password</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.TextSourceDefinition#isPassword()
   * @see #getTextSourceDefinition()
   * @generated
   */
  EAttribute getTextSourceDefinition_Password();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.annotations.saturnWeb.ValueDefinition <em>Value Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Definition</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.ValueDefinition
   * @generated
   */
  EClass getValueDefinition();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.annotations.saturnWeb.ValueDefinition#getSource <em>Source</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.ValueDefinition#getSource()
   * @see #getValueDefinition()
   * @generated
   */
  EReference getValueDefinition_Source();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.annotations.saturnWeb.ValueDefinition#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.ValueDefinition#getTarget()
   * @see #getValueDefinition()
   * @generated
   */
  EReference getValueDefinition_Target();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.annotations.saturnWeb.SelectorTypeEnum <em>Selector Type Enum</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Selector Type Enum</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SelectorTypeEnum
   * @generated
   */
  EEnum getSelectorTypeEnum();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.annotations.saturnWeb.SelectorTypeEnum <em>Selector Type Enum Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Selector Type Enum Object</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SelectorTypeEnum
   * @model instanceClass="com.ms.qaTools.saturn.annotations.saturnWeb.SelectorTypeEnum"
   *        extendedMetaData="name='SelectorTypeEnum:Object' baseType='SelectorTypeEnum'"
   * @generated
   */
  EDataType getSelectorTypeEnumObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SaturnWebFactory getSaturnWebFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.AbstractSourceDefinitionImpl <em>Abstract Source Definition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.AbstractSourceDefinitionImpl
     * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl#getAbstractSourceDefinition()
     * @generated
     */
    EClass     ABSTRACT_SOURCE_DEFINITION                      = eINSTANCE.getAbstractSourceDefinition();

    /**
     * The meta object literal for the '<em><b>Caption</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_SOURCE_DEFINITION__CAPTION             = eINSTANCE.getAbstractSourceDefinition_Caption();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_SOURCE_DEFINITION__DESCRIPTION         = eINSTANCE.getAbstractSourceDefinition_Description();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.AbstractTargetDefinitionImpl <em>Abstract Target Definition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.AbstractTargetDefinitionImpl
     * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl#getAbstractTargetDefinition()
     * @generated
     */
    EClass     ABSTRACT_TARGET_DEFINITION                      = eINSTANCE.getAbstractTargetDefinition();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.DropDownOptionImpl <em>Drop Down Option</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.DropDownOptionImpl
     * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl#getDropDownOption()
     * @generated
     */
    EClass     DROP_DOWN_OPTION                                = eINSTANCE.getDropDownOption();

    /**
     * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DROP_DOWN_OPTION__SELECTED                      = eINSTANCE.getDropDownOption_Selected();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DROP_DOWN_OPTION__TEXT                          = eINSTANCE.getDropDownOption_Text();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DROP_DOWN_OPTION__VALUE                         = eINSTANCE.getDropDownOption_Value();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.DropDownSourceDefinitionImpl <em>Drop Down Source Definition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.DropDownSourceDefinitionImpl
     * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl#getDropDownSourceDefinition()
     * @generated
     */
    EClass     DROP_DOWN_SOURCE_DEFINITION                     = eINSTANCE.getDropDownSourceDefinition();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference DROP_DOWN_SOURCE_DEFINITION__OPTIONS            = eINSTANCE.getDropDownSourceDefinition_Options();

    /**
     * The meta object literal for the '<em><b>Multi Select</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DROP_DOWN_SOURCE_DEFINITION__MULTI_SELECT       = eINSTANCE.getDropDownSourceDefinition_MultiSelect();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.FileSelectorSourceDefinitionImpl <em>File Selector Source Definition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.FileSelectorSourceDefinitionImpl
     * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl#getFileSelectorSourceDefinition()
     * @generated
     */
    EClass     FILE_SELECTOR_SOURCE_DEFINITION                 = eINSTANCE.getFileSelectorSourceDefinition();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute FILE_SELECTOR_SOURCE_DEFINITION__DEFAULT_VALUE  = eINSTANCE.getFileSelectorSourceDefinition_DefaultValue();

    /**
     * The meta object literal for the '<em><b>Directory</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute FILE_SELECTOR_SOURCE_DEFINITION__DIRECTORY      = eINSTANCE.getFileSelectorSourceDefinition_Directory();

    /**
     * The meta object literal for the '<em><b>File Pattern</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute FILE_SELECTOR_SOURCE_DEFINITION__FILE_PATTERN   = eINSTANCE.getFileSelectorSourceDefinition_FilePattern();

    /**
     * The meta object literal for the '<em><b>Selector Type</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute FILE_SELECTOR_SOURCE_DEFINITION__SELECTOR_TYPE  = eINSTANCE.getFileSelectorSourceDefinition_SelectorType();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebConfigurationImpl <em>Configuration</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebConfigurationImpl
     * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl#getSaturnWebConfiguration()
     * @generated
     */
    EClass     SATURN_WEB_CONFIGURATION                        = eINSTANCE.getSaturnWebConfiguration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SATURN_WEB_CONFIGURATION__NAME                  = eINSTANCE.getSaturnWebConfiguration_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SATURN_WEB_CONFIGURATION__DESCRIPTION           = eINSTANCE.getSaturnWebConfiguration_Description();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference SATURN_WEB_CONFIGURATION__VALUES                = eINSTANCE.getSaturnWebConfiguration_Values();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SATURN_WEB_CONFIGURATION__ENABLED               = eINSTANCE.getSaturnWebConfiguration_Enabled();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.SingleValueEnvVarTargetDefinitionImpl <em>Single Value Env Var Target Definition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SingleValueEnvVarTargetDefinitionImpl
     * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl#getSingleValueEnvVarTargetDefinition()
     * @generated
     */
    EClass     SINGLE_VALUE_ENV_VAR_TARGET_DEFINITION          = eINSTANCE.getSingleValueEnvVarTargetDefinition();

    /**
     * The meta object literal for the '<em><b>Env Var</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SINGLE_VALUE_ENV_VAR_TARGET_DEFINITION__ENV_VAR = eINSTANCE.getSingleValueEnvVarTargetDefinition_EnvVar();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.SingleValueTargetDefinitionImpl <em>Single Value Target Definition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SingleValueTargetDefinitionImpl
     * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl#getSingleValueTargetDefinition()
     * @generated
     */
    EClass     SINGLE_VALUE_TARGET_DEFINITION                  = eINSTANCE.getSingleValueTargetDefinition();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.TextSourceDefinitionImpl <em>Text Source Definition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.TextSourceDefinitionImpl
     * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl#getTextSourceDefinition()
     * @generated
     */
    EClass     TEXT_SOURCE_DEFINITION                          = eINSTANCE.getTextSourceDefinition();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute TEXT_SOURCE_DEFINITION__DEFAULT_VALUE           = eINSTANCE.getTextSourceDefinition_DefaultValue();

    /**
     * The meta object literal for the '<em><b>Multi Line</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute TEXT_SOURCE_DEFINITION__MULTI_LINE              = eINSTANCE.getTextSourceDefinition_MultiLine();

    /**
     * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute TEXT_SOURCE_DEFINITION__PASSWORD                = eINSTANCE.getTextSourceDefinition_Password();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.ValueDefinitionImpl <em>Value Definition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.ValueDefinitionImpl
     * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl#getValueDefinition()
     * @generated
     */
    EClass     VALUE_DEFINITION                                = eINSTANCE.getValueDefinition();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_DEFINITION__SOURCE                        = eINSTANCE.getValueDefinition_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_DEFINITION__TARGET                        = eINSTANCE.getValueDefinition_Target();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.SelectorTypeEnum <em>Selector Type Enum</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.annotations.saturnWeb.SelectorTypeEnum
     * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl#getSelectorTypeEnum()
     * @generated
     */
    EEnum      SELECTOR_TYPE_ENUM                              = eINSTANCE.getSelectorTypeEnum();

    /**
     * The meta object literal for the '<em>Selector Type Enum Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.annotations.saturnWeb.SelectorTypeEnum
     * @see com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl#getSelectorTypeEnumObject()
     * @generated
     */
    EDataType  SELECTOR_TYPE_ENUM_OBJECT                       = eINSTANCE.getSelectorTypeEnumObject();

  }

} // SaturnWebPackage
