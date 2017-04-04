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
package com.ms.qaTools.saturn.resources.mapperResource;

import com.ms.qaTools.saturn.types.TypesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.resources.mapperResource.MapperResourceFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface MapperResourcePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mapperResource";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ms.com/2013/Saturn/Resources/Mapper";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mapperResource";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MapperResourcePackage eINSTANCE = com.ms.qaTools.saturn.resources.mapperResource.impl.MapperResourcePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.mapperResource.impl.AbstractManipulatorOperationImpl <em>Abstract Manipulator Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.mapperResource.impl.AbstractManipulatorOperationImpl
   * @see com.ms.qaTools.saturn.resources.mapperResource.impl.MapperResourcePackageImpl#getAbstractManipulatorOperation()
   * @generated
   */
  int ABSTRACT_MANIPULATOR_OPERATION = 0;

  /**
   * The number of structural features of the '<em>Abstract Manipulator Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_MANIPULATOR_OPERATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.mapperResource.impl.ConverterResourceImpl <em>Converter Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.mapperResource.impl.ConverterResourceImpl
   * @see com.ms.qaTools.saturn.resources.mapperResource.impl.MapperResourcePackageImpl#getConverterResource()
   * @generated
   */
  int CONVERTER_RESOURCE = 1;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONVERTER_RESOURCE__ENABLED = TypesPackage.NAMED_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONVERTER_RESOURCE__STATE = TypesPackage.NAMED_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONVERTER_RESOURCE__CONNECTOR_PREFERENCE = TypesPackage.NAMED_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONVERTER_RESOURCE__NAME = TypesPackage.NAMED_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Input Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONVERTER_RESOURCE__INPUT_RESOURCE = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONVERTER_RESOURCE__METHOD = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Converter Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONVERTER_RESOURCE_FEATURE_COUNT = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.mapperResource.impl.CustomResourceImpl <em>Custom Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.mapperResource.impl.CustomResourceImpl
   * @see com.ms.qaTools.saturn.resources.mapperResource.impl.MapperResourcePackageImpl#getCustomResource()
   * @generated
   */
  int CUSTOM_RESOURCE = 2;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_RESOURCE__ENABLED = TypesPackage.NAMED_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_RESOURCE__STATE = TypesPackage.NAMED_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_RESOURCE__CONNECTOR_PREFERENCE = TypesPackage.NAMED_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_RESOURCE__NAME = TypesPackage.NAMED_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_RESOURCE__CODE = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Custom Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_RESOURCE_FEATURE_COUNT = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.mapperResource.impl.ExtractorResourceImpl <em>Extractor Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.mapperResource.impl.ExtractorResourceImpl
   * @see com.ms.qaTools.saturn.resources.mapperResource.impl.MapperResourcePackageImpl#getExtractorResource()
   * @generated
   */
  int EXTRACTOR_RESOURCE = 3;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTRACTOR_RESOURCE__ENABLED = TypesPackage.NAMED_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTRACTOR_RESOURCE__STATE = TypesPackage.NAMED_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTRACTOR_RESOURCE__CONNECTOR_PREFERENCE = TypesPackage.NAMED_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTRACTOR_RESOURCE__NAME = TypesPackage.NAMED_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Input Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTRACTOR_RESOURCE__INPUT_RESOURCE = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTRACTOR_RESOURCE__CONFIGURATION = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Extractor Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTRACTOR_RESOURCE_FEATURE_COUNT = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.mapperResource.impl.GeneratorResourceImpl <em>Generator Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.mapperResource.impl.GeneratorResourceImpl
   * @see com.ms.qaTools.saturn.resources.mapperResource.impl.MapperResourcePackageImpl#getGeneratorResource()
   * @generated
   */
  int GENERATOR_RESOURCE = 4;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR_RESOURCE__ENABLED = TypesPackage.NAMED_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR_RESOURCE__STATE = TypesPackage.NAMED_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR_RESOURCE__CONNECTOR_PREFERENCE = TypesPackage.NAMED_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR_RESOURCE__NAME = TypesPackage.NAMED_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Input Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR_RESOURCE__INPUT_RESOURCE = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Template Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR_RESOURCE__TEMPLATE_RESOURCE = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Generator Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR_RESOURCE_FEATURE_COUNT = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.mapperResource.impl.ManipulatorResourceImpl <em>Manipulator Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.mapperResource.impl.ManipulatorResourceImpl
   * @see com.ms.qaTools.saturn.resources.mapperResource.impl.MapperResourcePackageImpl#getManipulatorResource()
   * @generated
   */
  int MANIPULATOR_RESOURCE = 5;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANIPULATOR_RESOURCE__ENABLED = TypesPackage.NAMED_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANIPULATOR_RESOURCE__STATE = TypesPackage.NAMED_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANIPULATOR_RESOURCE__CONNECTOR_PREFERENCE = TypesPackage.NAMED_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANIPULATOR_RESOURCE__NAME = TypesPackage.NAMED_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Input Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANIPULATOR_RESOURCE__INPUT_RESOURCE = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANIPULATOR_RESOURCE__OPERATIONS = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Manipulator Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANIPULATOR_RESOURCE_FEATURE_COUNT = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.mapperResource.impl.MappedResourceImpl <em>Mapped Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.mapperResource.impl.MappedResourceImpl
   * @see com.ms.qaTools.saturn.resources.mapperResource.impl.MapperResourcePackageImpl#getMappedResource()
   * @generated
   */
  int MAPPED_RESOURCE = 6;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_RESOURCE__ENABLED = TypesPackage.NAMED_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_RESOURCE__STATE = TypesPackage.NAMED_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_RESOURCE__CONNECTOR_PREFERENCE = TypesPackage.NAMED_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_RESOURCE__NAME = TypesPackage.NAMED_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Input Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_RESOURCE__INPUT_RESOURCES = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_RESOURCE__ARGUMENTS = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_RESOURCE__METHOD = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Mapped Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_RESOURCE_FEATURE_COUNT = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.mapperResource.impl.ValidatorResourceImpl <em>Validator Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.mapperResource.impl.ValidatorResourceImpl
   * @see com.ms.qaTools.saturn.resources.mapperResource.impl.MapperResourcePackageImpl#getValidatorResource()
   * @generated
   */
  int VALIDATOR_RESOURCE = 7;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR_RESOURCE__ENABLED = TypesPackage.NAMED_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR_RESOURCE__STATE = TypesPackage.NAMED_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR_RESOURCE__CONNECTOR_PREFERENCE = TypesPackage.NAMED_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR_RESOURCE__NAME = TypesPackage.NAMED_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Left Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR_RESOURCE__LEFT_RESOURCE = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR_RESOURCE__RIGHT_RESOURCE = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR_RESOURCE__CONFIGURATION = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Validator Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATOR_RESOURCE_FEATURE_COUNT = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 3;


  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.mapperResource.AbstractManipulatorOperation <em>Abstract Manipulator Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Manipulator Operation</em>'.
   * @see com.ms.qaTools.saturn.resources.mapperResource.AbstractManipulatorOperation
   * @generated
   */
  EClass getAbstractManipulatorOperation();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.mapperResource.ConverterResource <em>Converter Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Converter Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.mapperResource.ConverterResource
   * @generated
   */
  EClass getConverterResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.mapperResource.ConverterResource#getInputResource <em>Input Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.mapperResource.ConverterResource#getInputResource()
   * @see #getConverterResource()
   * @generated
   */
  EReference getConverterResource_InputResource();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.mapperResource.ConverterResource#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see com.ms.qaTools.saturn.resources.mapperResource.ConverterResource#getMethod()
   * @see #getConverterResource()
   * @generated
   */
  EAttribute getConverterResource_Method();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.mapperResource.CustomResource <em>Custom Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.mapperResource.CustomResource
   * @generated
   */
  EClass getCustomResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.mapperResource.CustomResource#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Code</em>'.
   * @see com.ms.qaTools.saturn.resources.mapperResource.CustomResource#getCode()
   * @see #getCustomResource()
   * @generated
   */
  EReference getCustomResource_Code();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.mapperResource.ExtractorResource <em>Extractor Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extractor Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.mapperResource.ExtractorResource
   * @generated
   */
  EClass getExtractorResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.mapperResource.ExtractorResource#getInputResource <em>Input Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.mapperResource.ExtractorResource#getInputResource()
   * @see #getExtractorResource()
   * @generated
   */
  EReference getExtractorResource_InputResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.mapperResource.ExtractorResource#getConfiguration <em>Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Configuration</em>'.
   * @see com.ms.qaTools.saturn.resources.mapperResource.ExtractorResource#getConfiguration()
   * @see #getExtractorResource()
   * @generated
   */
  EReference getExtractorResource_Configuration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.mapperResource.GeneratorResource <em>Generator Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generator Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.mapperResource.GeneratorResource
   * @generated
   */
  EClass getGeneratorResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.mapperResource.GeneratorResource#getInputResource <em>Input Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.mapperResource.GeneratorResource#getInputResource()
   * @see #getGeneratorResource()
   * @generated
   */
  EReference getGeneratorResource_InputResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.mapperResource.GeneratorResource#getTemplateResource <em>Template Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Template Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.mapperResource.GeneratorResource#getTemplateResource()
   * @see #getGeneratorResource()
   * @generated
   */
  EReference getGeneratorResource_TemplateResource();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.mapperResource.ManipulatorResource <em>Manipulator Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Manipulator Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.mapperResource.ManipulatorResource
   * @generated
   */
  EClass getManipulatorResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.mapperResource.ManipulatorResource#getInputResource <em>Input Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.mapperResource.ManipulatorResource#getInputResource()
   * @see #getManipulatorResource()
   * @generated
   */
  EReference getManipulatorResource_InputResource();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.resources.mapperResource.ManipulatorResource#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see com.ms.qaTools.saturn.resources.mapperResource.ManipulatorResource#getOperations()
   * @see #getManipulatorResource()
   * @generated
   */
  EReference getManipulatorResource_Operations();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.mapperResource.MappedResource <em>Mapped Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapped Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.mapperResource.MappedResource
   * @generated
   */
  EClass getMappedResource();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.resources.mapperResource.MappedResource#getInputResources <em>Input Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Input Resources</em>'.
   * @see com.ms.qaTools.saturn.resources.mapperResource.MappedResource#getInputResources()
   * @see #getMappedResource()
   * @generated
   */
  EReference getMappedResource_InputResources();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.resources.mapperResource.MappedResource#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see com.ms.qaTools.saturn.resources.mapperResource.MappedResource#getArguments()
   * @see #getMappedResource()
   * @generated
   */
  EReference getMappedResource_Arguments();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.mapperResource.MappedResource#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see com.ms.qaTools.saturn.resources.mapperResource.MappedResource#getMethod()
   * @see #getMappedResource()
   * @generated
   */
  EAttribute getMappedResource_Method();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.mapperResource.ValidatorResource <em>Validator Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Validator Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.mapperResource.ValidatorResource
   * @generated
   */
  EClass getValidatorResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.mapperResource.ValidatorResource#getLeftResource <em>Left Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.mapperResource.ValidatorResource#getLeftResource()
   * @see #getValidatorResource()
   * @generated
   */
  EReference getValidatorResource_LeftResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.mapperResource.ValidatorResource#getRightResource <em>Right Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.mapperResource.ValidatorResource#getRightResource()
   * @see #getValidatorResource()
   * @generated
   */
  EReference getValidatorResource_RightResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.mapperResource.ValidatorResource#getConfiguration <em>Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Configuration</em>'.
   * @see com.ms.qaTools.saturn.resources.mapperResource.ValidatorResource#getConfiguration()
   * @see #getValidatorResource()
   * @generated
   */
  EReference getValidatorResource_Configuration();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MapperResourceFactory getMapperResourceFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.mapperResource.impl.AbstractManipulatorOperationImpl <em>Abstract Manipulator Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.mapperResource.impl.AbstractManipulatorOperationImpl
     * @see com.ms.qaTools.saturn.resources.mapperResource.impl.MapperResourcePackageImpl#getAbstractManipulatorOperation()
     * @generated
     */
    EClass ABSTRACT_MANIPULATOR_OPERATION = eINSTANCE.getAbstractManipulatorOperation();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.mapperResource.impl.ConverterResourceImpl <em>Converter Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.mapperResource.impl.ConverterResourceImpl
     * @see com.ms.qaTools.saturn.resources.mapperResource.impl.MapperResourcePackageImpl#getConverterResource()
     * @generated
     */
    EClass CONVERTER_RESOURCE = eINSTANCE.getConverterResource();

    /**
     * The meta object literal for the '<em><b>Input Resource</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONVERTER_RESOURCE__INPUT_RESOURCE = eINSTANCE.getConverterResource_InputResource();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONVERTER_RESOURCE__METHOD = eINSTANCE.getConverterResource_Method();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.mapperResource.impl.CustomResourceImpl <em>Custom Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.mapperResource.impl.CustomResourceImpl
     * @see com.ms.qaTools.saturn.resources.mapperResource.impl.MapperResourcePackageImpl#getCustomResource()
     * @generated
     */
    EClass CUSTOM_RESOURCE = eINSTANCE.getCustomResource();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_RESOURCE__CODE = eINSTANCE.getCustomResource_Code();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.mapperResource.impl.ExtractorResourceImpl <em>Extractor Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.mapperResource.impl.ExtractorResourceImpl
     * @see com.ms.qaTools.saturn.resources.mapperResource.impl.MapperResourcePackageImpl#getExtractorResource()
     * @generated
     */
    EClass EXTRACTOR_RESOURCE = eINSTANCE.getExtractorResource();

    /**
     * The meta object literal for the '<em><b>Input Resource</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTRACTOR_RESOURCE__INPUT_RESOURCE = eINSTANCE.getExtractorResource_InputResource();

    /**
     * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTRACTOR_RESOURCE__CONFIGURATION = eINSTANCE.getExtractorResource_Configuration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.mapperResource.impl.GeneratorResourceImpl <em>Generator Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.mapperResource.impl.GeneratorResourceImpl
     * @see com.ms.qaTools.saturn.resources.mapperResource.impl.MapperResourcePackageImpl#getGeneratorResource()
     * @generated
     */
    EClass GENERATOR_RESOURCE = eINSTANCE.getGeneratorResource();

    /**
     * The meta object literal for the '<em><b>Input Resource</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERATOR_RESOURCE__INPUT_RESOURCE = eINSTANCE.getGeneratorResource_InputResource();

    /**
     * The meta object literal for the '<em><b>Template Resource</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERATOR_RESOURCE__TEMPLATE_RESOURCE = eINSTANCE.getGeneratorResource_TemplateResource();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.mapperResource.impl.ManipulatorResourceImpl <em>Manipulator Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.mapperResource.impl.ManipulatorResourceImpl
     * @see com.ms.qaTools.saturn.resources.mapperResource.impl.MapperResourcePackageImpl#getManipulatorResource()
     * @generated
     */
    EClass MANIPULATOR_RESOURCE = eINSTANCE.getManipulatorResource();

    /**
     * The meta object literal for the '<em><b>Input Resource</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MANIPULATOR_RESOURCE__INPUT_RESOURCE = eINSTANCE.getManipulatorResource_InputResource();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MANIPULATOR_RESOURCE__OPERATIONS = eINSTANCE.getManipulatorResource_Operations();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.mapperResource.impl.MappedResourceImpl <em>Mapped Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.mapperResource.impl.MappedResourceImpl
     * @see com.ms.qaTools.saturn.resources.mapperResource.impl.MapperResourcePackageImpl#getMappedResource()
     * @generated
     */
    EClass MAPPED_RESOURCE = eINSTANCE.getMappedResource();

    /**
     * The meta object literal for the '<em><b>Input Resources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPED_RESOURCE__INPUT_RESOURCES = eINSTANCE.getMappedResource_InputResources();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPED_RESOURCE__ARGUMENTS = eINSTANCE.getMappedResource_Arguments();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPED_RESOURCE__METHOD = eINSTANCE.getMappedResource_Method();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.mapperResource.impl.ValidatorResourceImpl <em>Validator Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.mapperResource.impl.ValidatorResourceImpl
     * @see com.ms.qaTools.saturn.resources.mapperResource.impl.MapperResourcePackageImpl#getValidatorResource()
     * @generated
     */
    EClass VALIDATOR_RESOURCE = eINSTANCE.getValidatorResource();

    /**
     * The meta object literal for the '<em><b>Left Resource</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALIDATOR_RESOURCE__LEFT_RESOURCE = eINSTANCE.getValidatorResource_LeftResource();

    /**
     * The meta object literal for the '<em><b>Right Resource</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALIDATOR_RESOURCE__RIGHT_RESOURCE = eINSTANCE.getValidatorResource_RightResource();

    /**
     * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALIDATOR_RESOURCE__CONFIGURATION = eINSTANCE.getValidatorResource_Configuration();

  }

} //MapperResourcePackage
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
