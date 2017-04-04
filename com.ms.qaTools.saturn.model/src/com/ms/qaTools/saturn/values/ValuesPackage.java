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
package com.ms.qaTools.saturn.values;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see com.ms.qaTools.saturn.values.ValuesFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface ValuesPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "values";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ms.com/2006/Saturn/Values";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "values";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ValuesPackage eINSTANCE = com.ms.qaTools.saturn.values.impl.ValuesPackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.values.Fallible <em>Fallible</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.values.Fallible
   * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getFallible()
   * @generated
   */
  int FALLIBLE = 4;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALLIBLE__DEFAULT_VALUE = 0;

  /**
   * The feature id for the '<em><b>Fail Behavior</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALLIBLE__FAIL_BEHAVIOR = 1;

  /**
   * The number of structural features of the '<em>Fallible</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALLIBLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.values.impl.CellComplexValueImpl <em>Cell Complex Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.values.impl.CellComplexValueImpl
   * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getCellComplexValue()
   * @generated
   */
  int CELL_COMPLEX_VALUE = 0;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_COMPLEX_VALUE__DEFAULT_VALUE = FALLIBLE__DEFAULT_VALUE;

  /**
   * The feature id for the '<em><b>Fail Behavior</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_COMPLEX_VALUE__FAIL_BEHAVIOR = FALLIBLE__FAIL_BEHAVIOR;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_COMPLEX_VALUE__DESCRIPTION = FALLIBLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_COMPLEX_VALUE__RESOURCE = FALLIBLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Row</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_COMPLEX_VALUE__ROW = FALLIBLE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Column</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_COMPLEX_VALUE__COLUMN = FALLIBLE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Column Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_COMPLEX_VALUE__COLUMN_NAME = FALLIBLE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Memoize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_COMPLEX_VALUE__MEMOIZE = FALLIBLE_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Cell Complex Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_COMPLEX_VALUE_FEATURE_COUNT = FALLIBLE_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.values.Describable <em>Describable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.values.Describable
   * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getDescribable()
   * @generated
   */
  int DESCRIBABLE = 3;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIBABLE__DESCRIPTION = 0;

  /**
   * The number of structural features of the '<em>Describable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIBABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.values.impl.ComplexValueImpl <em>Complex Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.values.impl.ComplexValueImpl
   * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getComplexValue()
   * @generated
   */
  int COMPLEX_VALUE = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_VALUE__DESCRIPTION = DESCRIBABLE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_VALUE__MIXED = DESCRIBABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Null</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_VALUE__NULL = DESCRIBABLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_VALUE__GROUP = DESCRIBABLE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_VALUE__TEXT = DESCRIBABLE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Env Var</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_VALUE__ENV_VAR = DESCRIBABLE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>File</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_VALUE__FILE = DESCRIBABLE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>XPath Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_VALUE__XPATH_VALUE = DESCRIBABLE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>JSON Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_VALUE__JSON_VALUE = DESCRIBABLE_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>FIX Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_VALUE__FIX_VALUE = DESCRIBABLE_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Cell Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_VALUE__CELL_VALUE = DESCRIBABLE_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Property Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_VALUE__PROPERTY_VALUE = DESCRIBABLE_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_VALUE__CODE = DESCRIBABLE_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Run Number</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_VALUE__RUN_NUMBER = DESCRIBABLE_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_VALUE__REFERENCE = DESCRIBABLE_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Memoize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_VALUE__MEMOIZE = DESCRIBABLE_FEATURE_COUNT + 14;

  /**
   * The number of structural features of the '<em>Complex Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_VALUE_FEATURE_COUNT = DESCRIBABLE_FEATURE_COUNT + 15;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.values.impl.FallibleComplexValueImpl <em>Fallible Complex Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.values.impl.FallibleComplexValueImpl
   * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getFallibleComplexValue()
   * @generated
   */
  int FALLIBLE_COMPLEX_VALUE = 5;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALLIBLE_COMPLEX_VALUE__DESCRIPTION = COMPLEX_VALUE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALLIBLE_COMPLEX_VALUE__MIXED = COMPLEX_VALUE__MIXED;

  /**
   * The feature id for the '<em><b>Null</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALLIBLE_COMPLEX_VALUE__NULL = COMPLEX_VALUE__NULL;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALLIBLE_COMPLEX_VALUE__GROUP = COMPLEX_VALUE__GROUP;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALLIBLE_COMPLEX_VALUE__TEXT = COMPLEX_VALUE__TEXT;

  /**
   * The feature id for the '<em><b>Env Var</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALLIBLE_COMPLEX_VALUE__ENV_VAR = COMPLEX_VALUE__ENV_VAR;

  /**
   * The feature id for the '<em><b>File</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALLIBLE_COMPLEX_VALUE__FILE = COMPLEX_VALUE__FILE;

  /**
   * The feature id for the '<em><b>XPath Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALLIBLE_COMPLEX_VALUE__XPATH_VALUE = COMPLEX_VALUE__XPATH_VALUE;

  /**
   * The feature id for the '<em><b>JSON Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALLIBLE_COMPLEX_VALUE__JSON_VALUE = COMPLEX_VALUE__JSON_VALUE;

  /**
   * The feature id for the '<em><b>FIX Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALLIBLE_COMPLEX_VALUE__FIX_VALUE = COMPLEX_VALUE__FIX_VALUE;

  /**
   * The feature id for the '<em><b>Cell Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALLIBLE_COMPLEX_VALUE__CELL_VALUE = COMPLEX_VALUE__CELL_VALUE;

  /**
   * The feature id for the '<em><b>Property Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALLIBLE_COMPLEX_VALUE__PROPERTY_VALUE = COMPLEX_VALUE__PROPERTY_VALUE;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALLIBLE_COMPLEX_VALUE__CODE = COMPLEX_VALUE__CODE;

  /**
   * The feature id for the '<em><b>Run Number</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALLIBLE_COMPLEX_VALUE__RUN_NUMBER = COMPLEX_VALUE__RUN_NUMBER;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALLIBLE_COMPLEX_VALUE__REFERENCE = COMPLEX_VALUE__REFERENCE;

  /**
   * The feature id for the '<em><b>Memoize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALLIBLE_COMPLEX_VALUE__MEMOIZE = COMPLEX_VALUE__MEMOIZE;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALLIBLE_COMPLEX_VALUE__DEFAULT_VALUE = COMPLEX_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fail Behavior</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALLIBLE_COMPLEX_VALUE__FAIL_BEHAVIOR = COMPLEX_VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Fallible Complex Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALLIBLE_COMPLEX_VALUE_FEATURE_COUNT = COMPLEX_VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.values.impl.CodeComplexValueImpl <em>Code Complex Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.values.impl.CodeComplexValueImpl
   * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getCodeComplexValue()
   * @generated
   */
  int CODE_COMPLEX_VALUE = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_COMPLEX_VALUE__DESCRIPTION = FALLIBLE_COMPLEX_VALUE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_COMPLEX_VALUE__MIXED = FALLIBLE_COMPLEX_VALUE__MIXED;

  /**
   * The feature id for the '<em><b>Null</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_COMPLEX_VALUE__NULL = FALLIBLE_COMPLEX_VALUE__NULL;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_COMPLEX_VALUE__GROUP = FALLIBLE_COMPLEX_VALUE__GROUP;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_COMPLEX_VALUE__TEXT = FALLIBLE_COMPLEX_VALUE__TEXT;

  /**
   * The feature id for the '<em><b>Env Var</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_COMPLEX_VALUE__ENV_VAR = FALLIBLE_COMPLEX_VALUE__ENV_VAR;

  /**
   * The feature id for the '<em><b>File</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_COMPLEX_VALUE__FILE = FALLIBLE_COMPLEX_VALUE__FILE;

  /**
   * The feature id for the '<em><b>XPath Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_COMPLEX_VALUE__XPATH_VALUE = FALLIBLE_COMPLEX_VALUE__XPATH_VALUE;

  /**
   * The feature id for the '<em><b>JSON Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_COMPLEX_VALUE__JSON_VALUE = FALLIBLE_COMPLEX_VALUE__JSON_VALUE;

  /**
   * The feature id for the '<em><b>FIX Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_COMPLEX_VALUE__FIX_VALUE = FALLIBLE_COMPLEX_VALUE__FIX_VALUE;

  /**
   * The feature id for the '<em><b>Cell Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_COMPLEX_VALUE__CELL_VALUE = FALLIBLE_COMPLEX_VALUE__CELL_VALUE;

  /**
   * The feature id for the '<em><b>Property Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_COMPLEX_VALUE__PROPERTY_VALUE = FALLIBLE_COMPLEX_VALUE__PROPERTY_VALUE;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_COMPLEX_VALUE__CODE = FALLIBLE_COMPLEX_VALUE__CODE;

  /**
   * The feature id for the '<em><b>Run Number</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_COMPLEX_VALUE__RUN_NUMBER = FALLIBLE_COMPLEX_VALUE__RUN_NUMBER;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_COMPLEX_VALUE__REFERENCE = FALLIBLE_COMPLEX_VALUE__REFERENCE;

  /**
   * The feature id for the '<em><b>Memoize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_COMPLEX_VALUE__MEMOIZE = FALLIBLE_COMPLEX_VALUE__MEMOIZE;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_COMPLEX_VALUE__DEFAULT_VALUE = FALLIBLE_COMPLEX_VALUE__DEFAULT_VALUE;

  /**
   * The feature id for the '<em><b>Fail Behavior</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_COMPLEX_VALUE__FAIL_BEHAVIOR = FALLIBLE_COMPLEX_VALUE__FAIL_BEHAVIOR;

  /**
   * The feature id for the '<em><b>Interpreter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_COMPLEX_VALUE__INTERPRETER = FALLIBLE_COMPLEX_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Code Complex Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_COMPLEX_VALUE_FEATURE_COUNT = FALLIBLE_COMPLEX_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.values.impl.FIXComplexValueImpl <em>FIX Complex Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.values.impl.FIXComplexValueImpl
   * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getFIXComplexValue()
   * @generated
   */
  int FIX_COMPLEX_VALUE = 6;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIX_COMPLEX_VALUE__DEFAULT_VALUE = FALLIBLE__DEFAULT_VALUE;

  /**
   * The feature id for the '<em><b>Fail Behavior</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIX_COMPLEX_VALUE__FAIL_BEHAVIOR = FALLIBLE__FAIL_BEHAVIOR;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIX_COMPLEX_VALUE__DESCRIPTION = FALLIBLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIX_COMPLEX_VALUE__RESOURCE = FALLIBLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>FIX Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIX_COMPLEX_VALUE__FIX_PATH = FALLIBLE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Message Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIX_COMPLEX_VALUE__MESSAGE_TYPE = FALLIBLE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Row</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIX_COMPLEX_VALUE__ROW = FALLIBLE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIX_COMPLEX_VALUE__RETURN_TYPE = FALLIBLE_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>FIX Complex Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIX_COMPLEX_VALUE_FEATURE_COUNT = FALLIBLE_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.values.impl.JSONComplexValueImpl <em>JSON Complex Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.values.impl.JSONComplexValueImpl
   * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getJSONComplexValue()
   * @generated
   */
  int JSON_COMPLEX_VALUE = 7;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_COMPLEX_VALUE__DEFAULT_VALUE = FALLIBLE__DEFAULT_VALUE;

  /**
   * The feature id for the '<em><b>Fail Behavior</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_COMPLEX_VALUE__FAIL_BEHAVIOR = FALLIBLE__FAIL_BEHAVIOR;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_COMPLEX_VALUE__DESCRIPTION = FALLIBLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_COMPLEX_VALUE__RESOURCE = FALLIBLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>JSON Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_COMPLEX_VALUE__JSON_PATH = FALLIBLE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Row</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_COMPLEX_VALUE__ROW = FALLIBLE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>JSON Complex Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_COMPLEX_VALUE_FEATURE_COUNT = FALLIBLE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.values.impl.PropertyComplexValueImpl <em>Property Complex Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.values.impl.PropertyComplexValueImpl
   * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getPropertyComplexValue()
   * @generated
   */
  int PROPERTY_COMPLEX_VALUE = 8;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_COMPLEX_VALUE__DEFAULT_VALUE = FALLIBLE__DEFAULT_VALUE;

  /**
   * The feature id for the '<em><b>Fail Behavior</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_COMPLEX_VALUE__FAIL_BEHAVIOR = FALLIBLE__FAIL_BEHAVIOR;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_COMPLEX_VALUE__DESCRIPTION = FALLIBLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_COMPLEX_VALUE__RESOURCE = FALLIBLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_COMPLEX_VALUE__PROPERTY = FALLIBLE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Property Complex Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_COMPLEX_VALUE_FEATURE_COUNT = FALLIBLE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.values.impl.ReferenceComplexValueImpl <em>Reference Complex Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.values.impl.ReferenceComplexValueImpl
   * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getReferenceComplexValue()
   * @generated
   */
  int REFERENCE_COMPLEX_VALUE = 9;

  /**
   * The feature id for the '<em><b>Include File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_COMPLEX_VALUE__INCLUDE_FILE = 0;

  /**
   * The feature id for the '<em><b>Template</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_COMPLEX_VALUE__TEMPLATE = 1;

  /**
   * The feature id for the '<em><b>Run Group</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_COMPLEX_VALUE__RUN_GROUP = 2;

  /**
   * The feature id for the '<em><b>Saturn Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_COMPLEX_VALUE__SATURN_ATTRIBUTE = 3;

  /**
   * The feature id for the '<em><b>User Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_COMPLEX_VALUE__USER_ATTRIBUTE = 4;

  /**
   * The feature id for the '<em><b>Module Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_COMPLEX_VALUE__MODULE_ATTRIBUTE = 5;

  /**
   * The number of structural features of the '<em>Reference Complex Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_COMPLEX_VALUE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.values.impl.RunNumberComplexValueImpl <em>Run Number Complex Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.values.impl.RunNumberComplexValueImpl
   * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getRunNumberComplexValue()
   * @generated
   */
  int RUN_NUMBER_COMPLEX_VALUE = 10;

  /**
   * The feature id for the '<em><b>Padding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN_NUMBER_COMPLEX_VALUE__PADDING = 0;

  /**
   * The feature id for the '<em><b>Pad Character</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN_NUMBER_COMPLEX_VALUE__PAD_CHARACTER = 1;

  /**
   * The number of structural features of the '<em>Run Number Complex Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN_NUMBER_COMPLEX_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.values.impl.TextComplexValueImpl <em>Text Complex Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.values.impl.TextComplexValueImpl
   * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getTextComplexValue()
   * @generated
   */
  int TEXT_COMPLEX_VALUE = 11;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_COMPLEX_VALUE__TEXT = 0;

  /**
   * The number of structural features of the '<em>Text Complex Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_COMPLEX_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.values.impl.XPathComplexValueImpl <em>XPath Complex Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.values.impl.XPathComplexValueImpl
   * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getXPathComplexValue()
   * @generated
   */
  int XPATH_COMPLEX_VALUE = 12;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPATH_COMPLEX_VALUE__DEFAULT_VALUE = FALLIBLE__DEFAULT_VALUE;

  /**
   * The feature id for the '<em><b>Fail Behavior</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPATH_COMPLEX_VALUE__FAIL_BEHAVIOR = FALLIBLE__FAIL_BEHAVIOR;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPATH_COMPLEX_VALUE__DESCRIPTION = FALLIBLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPATH_COMPLEX_VALUE__RESOURCE = FALLIBLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>XPath</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPATH_COMPLEX_VALUE__XPATH = FALLIBLE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Namespaces</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPATH_COMPLEX_VALUE__NAMESPACES = FALLIBLE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Row</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPATH_COMPLEX_VALUE__ROW = FALLIBLE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Fragment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPATH_COMPLEX_VALUE__FRAGMENT = FALLIBLE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPATH_COMPLEX_VALUE__RETURN_TYPE = FALLIBLE_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>XPath Complex Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPATH_COMPLEX_VALUE_FEATURE_COUNT = FALLIBLE_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.values.FailBehaviorsEnum <em>Fail Behaviors Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.values.FailBehaviorsEnum
   * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getFailBehaviorsEnum()
   * @generated
   */
  int FAIL_BEHAVIORS_ENUM = 13;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.values.XPathReturnTypeEnum <em>XPath Return Type Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.values.XPathReturnTypeEnum
   * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getXPathReturnTypeEnum()
   * @generated
   */
  int XPATH_RETURN_TYPE_ENUM = 14;

  /**
   * The meta object id for the '<em>Fail Behaviors Enum Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.values.FailBehaviorsEnum
   * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getFailBehaviorsEnumObject()
   * @generated
   */
  int FAIL_BEHAVIORS_ENUM_OBJECT = 15;

  /**
   * The meta object id for the '<em>XPath Return Type Enum Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.values.XPathReturnTypeEnum
   * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getXPathReturnTypeEnumObject()
   * @generated
   */
  int XPATH_RETURN_TYPE_ENUM_OBJECT = 16;


  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.values.CellComplexValue <em>Cell Complex Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cell Complex Value</em>'.
   * @see com.ms.qaTools.saturn.values.CellComplexValue
   * @generated
   */
  EClass getCellComplexValue();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.values.CellComplexValue#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Resource</em>'.
   * @see com.ms.qaTools.saturn.values.CellComplexValue#getResource()
   * @see #getCellComplexValue()
   * @generated
   */
  EReference getCellComplexValue_Resource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.values.CellComplexValue#getRow <em>Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Row</em>'.
   * @see com.ms.qaTools.saturn.values.CellComplexValue#getRow()
   * @see #getCellComplexValue()
   * @generated
   */
  EReference getCellComplexValue_Row();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.values.CellComplexValue#getColumn <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Column</em>'.
   * @see com.ms.qaTools.saturn.values.CellComplexValue#getColumn()
   * @see #getCellComplexValue()
   * @generated
   */
  EReference getCellComplexValue_Column();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.values.CellComplexValue#getColumnName <em>Column Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Column Name</em>'.
   * @see com.ms.qaTools.saturn.values.CellComplexValue#getColumnName()
   * @see #getCellComplexValue()
   * @generated
   */
  EReference getCellComplexValue_ColumnName();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.values.CellComplexValue#isMemoize <em>Memoize</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Memoize</em>'.
   * @see com.ms.qaTools.saturn.values.CellComplexValue#isMemoize()
   * @see #getCellComplexValue()
   * @generated
   */
  EAttribute getCellComplexValue_Memoize();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.values.CodeComplexValue <em>Code Complex Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Code Complex Value</em>'.
   * @see com.ms.qaTools.saturn.values.CodeComplexValue
   * @generated
   */
  EClass getCodeComplexValue();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.values.CodeComplexValue#getInterpreter <em>Interpreter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interpreter</em>'.
   * @see com.ms.qaTools.saturn.values.CodeComplexValue#getInterpreter()
   * @see #getCodeComplexValue()
   * @generated
   */
  EAttribute getCodeComplexValue_Interpreter();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.values.ComplexValue <em>Complex Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Value</em>'.
   * @see com.ms.qaTools.saturn.values.ComplexValue
   * @generated
   */
  EClass getComplexValue();

  /**
   * Returns the meta object for the attribute list '{@link com.ms.qaTools.saturn.values.ComplexValue#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.ms.qaTools.saturn.values.ComplexValue#getMixed()
   * @see #getComplexValue()
   * @generated
   */
  EAttribute getComplexValue_Mixed();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.values.ComplexValue#getNull <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Null</em>'.
   * @see com.ms.qaTools.saturn.values.ComplexValue#getNull()
   * @see #getComplexValue()
   * @generated
   */
  EReference getComplexValue_Null();

  /**
   * Returns the meta object for the attribute list '{@link com.ms.qaTools.saturn.values.ComplexValue#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group</em>'.
   * @see com.ms.qaTools.saturn.values.ComplexValue#getGroup()
   * @see #getComplexValue()
   * @generated
   */
  EAttribute getComplexValue_Group();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.values.ComplexValue#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Text</em>'.
   * @see com.ms.qaTools.saturn.values.ComplexValue#getText()
   * @see #getComplexValue()
   * @generated
   */
  EReference getComplexValue_Text();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.values.ComplexValue#getEnvVar <em>Env Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Env Var</em>'.
   * @see com.ms.qaTools.saturn.values.ComplexValue#getEnvVar()
   * @see #getComplexValue()
   * @generated
   */
  EReference getComplexValue_EnvVar();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.values.ComplexValue#getFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>File</em>'.
   * @see com.ms.qaTools.saturn.values.ComplexValue#getFile()
   * @see #getComplexValue()
   * @generated
   */
  EReference getComplexValue_File();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.values.ComplexValue#getXPathValue <em>XPath Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>XPath Value</em>'.
   * @see com.ms.qaTools.saturn.values.ComplexValue#getXPathValue()
   * @see #getComplexValue()
   * @generated
   */
  EReference getComplexValue_XPathValue();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.values.ComplexValue#getJSONValue <em>JSON Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>JSON Value</em>'.
   * @see com.ms.qaTools.saturn.values.ComplexValue#getJSONValue()
   * @see #getComplexValue()
   * @generated
   */
  EReference getComplexValue_JSONValue();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.values.ComplexValue#getFIXValue <em>FIX Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>FIX Value</em>'.
   * @see com.ms.qaTools.saturn.values.ComplexValue#getFIXValue()
   * @see #getComplexValue()
   * @generated
   */
  EReference getComplexValue_FIXValue();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.values.ComplexValue#getCellValue <em>Cell Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cell Value</em>'.
   * @see com.ms.qaTools.saturn.values.ComplexValue#getCellValue()
   * @see #getComplexValue()
   * @generated
   */
  EReference getComplexValue_CellValue();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.values.ComplexValue#getPropertyValue <em>Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Property Value</em>'.
   * @see com.ms.qaTools.saturn.values.ComplexValue#getPropertyValue()
   * @see #getComplexValue()
   * @generated
   */
  EReference getComplexValue_PropertyValue();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.values.ComplexValue#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Code</em>'.
   * @see com.ms.qaTools.saturn.values.ComplexValue#getCode()
   * @see #getComplexValue()
   * @generated
   */
  EReference getComplexValue_Code();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.values.ComplexValue#getRunNumber <em>Run Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Run Number</em>'.
   * @see com.ms.qaTools.saturn.values.ComplexValue#getRunNumber()
   * @see #getComplexValue()
   * @generated
   */
  EReference getComplexValue_RunNumber();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.values.ComplexValue#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reference</em>'.
   * @see com.ms.qaTools.saturn.values.ComplexValue#getReference()
   * @see #getComplexValue()
   * @generated
   */
  EReference getComplexValue_Reference();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.values.ComplexValue#isMemoize <em>Memoize</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Memoize</em>'.
   * @see com.ms.qaTools.saturn.values.ComplexValue#isMemoize()
   * @see #getComplexValue()
   * @generated
   */
  EAttribute getComplexValue_Memoize();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.values.Describable <em>Describable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Describable</em>'.
   * @see com.ms.qaTools.saturn.values.Describable
   * @generated
   */
  EClass getDescribable();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.values.Describable#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.ms.qaTools.saturn.values.Describable#getDescription()
   * @see #getDescribable()
   * @generated
   */
  EAttribute getDescribable_Description();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.values.Fallible <em>Fallible</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fallible</em>'.
   * @see com.ms.qaTools.saturn.values.Fallible
   * @generated
   */
  EClass getFallible();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.values.Fallible#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Value</em>'.
   * @see com.ms.qaTools.saturn.values.Fallible#getDefaultValue()
   * @see #getFallible()
   * @generated
   */
  EReference getFallible_DefaultValue();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.values.Fallible#getFailBehavior <em>Fail Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fail Behavior</em>'.
   * @see com.ms.qaTools.saturn.values.Fallible#getFailBehavior()
   * @see #getFallible()
   * @generated
   */
  EAttribute getFallible_FailBehavior();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.values.FallibleComplexValue <em>Fallible Complex Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fallible Complex Value</em>'.
   * @see com.ms.qaTools.saturn.values.FallibleComplexValue
   * @generated
   */
  EClass getFallibleComplexValue();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.values.FIXComplexValue <em>FIX Complex Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FIX Complex Value</em>'.
   * @see com.ms.qaTools.saturn.values.FIXComplexValue
   * @generated
   */
  EClass getFIXComplexValue();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.values.FIXComplexValue#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Resource</em>'.
   * @see com.ms.qaTools.saturn.values.FIXComplexValue#getResource()
   * @see #getFIXComplexValue()
   * @generated
   */
  EReference getFIXComplexValue_Resource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.values.FIXComplexValue#getFIXPath <em>FIX Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>FIX Path</em>'.
   * @see com.ms.qaTools.saturn.values.FIXComplexValue#getFIXPath()
   * @see #getFIXComplexValue()
   * @generated
   */
  EReference getFIXComplexValue_FIXPath();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.values.FIXComplexValue#getMessageType <em>Message Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Message Type</em>'.
   * @see com.ms.qaTools.saturn.values.FIXComplexValue#getMessageType()
   * @see #getFIXComplexValue()
   * @generated
   */
  EReference getFIXComplexValue_MessageType();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.values.FIXComplexValue#getRow <em>Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Row</em>'.
   * @see com.ms.qaTools.saturn.values.FIXComplexValue#getRow()
   * @see #getFIXComplexValue()
   * @generated
   */
  EReference getFIXComplexValue_Row();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.values.FIXComplexValue#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Return Type</em>'.
   * @see com.ms.qaTools.saturn.values.FIXComplexValue#getReturnType()
   * @see #getFIXComplexValue()
   * @generated
   */
  EAttribute getFIXComplexValue_ReturnType();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.values.JSONComplexValue <em>JSON Complex Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JSON Complex Value</em>'.
   * @see com.ms.qaTools.saturn.values.JSONComplexValue
   * @generated
   */
  EClass getJSONComplexValue();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.values.JSONComplexValue#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Resource</em>'.
   * @see com.ms.qaTools.saturn.values.JSONComplexValue#getResource()
   * @see #getJSONComplexValue()
   * @generated
   */
  EReference getJSONComplexValue_Resource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.values.JSONComplexValue#getJSONPath <em>JSON Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>JSON Path</em>'.
   * @see com.ms.qaTools.saturn.values.JSONComplexValue#getJSONPath()
   * @see #getJSONComplexValue()
   * @generated
   */
  EReference getJSONComplexValue_JSONPath();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.values.JSONComplexValue#getRow <em>Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Row</em>'.
   * @see com.ms.qaTools.saturn.values.JSONComplexValue#getRow()
   * @see #getJSONComplexValue()
   * @generated
   */
  EReference getJSONComplexValue_Row();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.values.PropertyComplexValue <em>Property Complex Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Complex Value</em>'.
   * @see com.ms.qaTools.saturn.values.PropertyComplexValue
   * @generated
   */
  EClass getPropertyComplexValue();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.values.PropertyComplexValue#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Resource</em>'.
   * @see com.ms.qaTools.saturn.values.PropertyComplexValue#getResource()
   * @see #getPropertyComplexValue()
   * @generated
   */
  EReference getPropertyComplexValue_Resource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.values.PropertyComplexValue#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Property</em>'.
   * @see com.ms.qaTools.saturn.values.PropertyComplexValue#getProperty()
   * @see #getPropertyComplexValue()
   * @generated
   */
  EReference getPropertyComplexValue_Property();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.values.ReferenceComplexValue <em>Reference Complex Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Complex Value</em>'.
   * @see com.ms.qaTools.saturn.values.ReferenceComplexValue
   * @generated
   */
  EClass getReferenceComplexValue();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.values.ReferenceComplexValue#getIncludeFile <em>Include File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Include File</em>'.
   * @see com.ms.qaTools.saturn.values.ReferenceComplexValue#getIncludeFile()
   * @see #getReferenceComplexValue()
   * @generated
   */
  EAttribute getReferenceComplexValue_IncludeFile();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.values.ReferenceComplexValue#getTemplate <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Template</em>'.
   * @see com.ms.qaTools.saturn.values.ReferenceComplexValue#getTemplate()
   * @see #getReferenceComplexValue()
   * @generated
   */
  EAttribute getReferenceComplexValue_Template();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.values.ReferenceComplexValue#getRunGroup <em>Run Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Run Group</em>'.
   * @see com.ms.qaTools.saturn.values.ReferenceComplexValue#getRunGroup()
   * @see #getReferenceComplexValue()
   * @generated
   */
  EAttribute getReferenceComplexValue_RunGroup();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.values.ReferenceComplexValue#getSaturnAttribute <em>Saturn Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Saturn Attribute</em>'.
   * @see com.ms.qaTools.saturn.values.ReferenceComplexValue#getSaturnAttribute()
   * @see #getReferenceComplexValue()
   * @generated
   */
  EAttribute getReferenceComplexValue_SaturnAttribute();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.values.ReferenceComplexValue#getUserAttribute <em>User Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>User Attribute</em>'.
   * @see com.ms.qaTools.saturn.values.ReferenceComplexValue#getUserAttribute()
   * @see #getReferenceComplexValue()
   * @generated
   */
  EAttribute getReferenceComplexValue_UserAttribute();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.values.ReferenceComplexValue#getModuleAttribute <em>Module Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Module Attribute</em>'.
   * @see com.ms.qaTools.saturn.values.ReferenceComplexValue#getModuleAttribute()
   * @see #getReferenceComplexValue()
   * @generated
   */
  EAttribute getReferenceComplexValue_ModuleAttribute();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.values.RunNumberComplexValue <em>Run Number Complex Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Run Number Complex Value</em>'.
   * @see com.ms.qaTools.saturn.values.RunNumberComplexValue
   * @generated
   */
  EClass getRunNumberComplexValue();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.values.RunNumberComplexValue#getPadding <em>Padding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Padding</em>'.
   * @see com.ms.qaTools.saturn.values.RunNumberComplexValue#getPadding()
   * @see #getRunNumberComplexValue()
   * @generated
   */
  EAttribute getRunNumberComplexValue_Padding();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.values.RunNumberComplexValue#getPadCharacter <em>Pad Character</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pad Character</em>'.
   * @see com.ms.qaTools.saturn.values.RunNumberComplexValue#getPadCharacter()
   * @see #getRunNumberComplexValue()
   * @generated
   */
  EAttribute getRunNumberComplexValue_PadCharacter();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.values.TextComplexValue <em>Text Complex Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Complex Value</em>'.
   * @see com.ms.qaTools.saturn.values.TextComplexValue
   * @generated
   */
  EClass getTextComplexValue();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.values.TextComplexValue#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see com.ms.qaTools.saturn.values.TextComplexValue#getText()
   * @see #getTextComplexValue()
   * @generated
   */
  EAttribute getTextComplexValue_Text();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.values.XPathComplexValue <em>XPath Complex Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XPath Complex Value</em>'.
   * @see com.ms.qaTools.saturn.values.XPathComplexValue
   * @generated
   */
  EClass getXPathComplexValue();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.values.XPathComplexValue#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Resource</em>'.
   * @see com.ms.qaTools.saturn.values.XPathComplexValue#getResource()
   * @see #getXPathComplexValue()
   * @generated
   */
  EReference getXPathComplexValue_Resource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.values.XPathComplexValue#getXPath <em>XPath</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>XPath</em>'.
   * @see com.ms.qaTools.saturn.values.XPathComplexValue#getXPath()
   * @see #getXPathComplexValue()
   * @generated
   */
  EReference getXPathComplexValue_XPath();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.values.XPathComplexValue#getNamespaces <em>Namespaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Namespaces</em>'.
   * @see com.ms.qaTools.saturn.values.XPathComplexValue#getNamespaces()
   * @see #getXPathComplexValue()
   * @generated
   */
  EReference getXPathComplexValue_Namespaces();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.values.XPathComplexValue#getRow <em>Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Row</em>'.
   * @see com.ms.qaTools.saturn.values.XPathComplexValue#getRow()
   * @see #getXPathComplexValue()
   * @generated
   */
  EReference getXPathComplexValue_Row();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.values.XPathComplexValue#isFragment <em>Fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fragment</em>'.
   * @see com.ms.qaTools.saturn.values.XPathComplexValue#isFragment()
   * @see #getXPathComplexValue()
   * @generated
   */
  EAttribute getXPathComplexValue_Fragment();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.values.XPathComplexValue#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Return Type</em>'.
   * @see com.ms.qaTools.saturn.values.XPathComplexValue#getReturnType()
   * @see #getXPathComplexValue()
   * @generated
   */
  EAttribute getXPathComplexValue_ReturnType();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.values.FailBehaviorsEnum <em>Fail Behaviors Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Fail Behaviors Enum</em>'.
   * @see com.ms.qaTools.saturn.values.FailBehaviorsEnum
   * @generated
   */
  EEnum getFailBehaviorsEnum();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.values.XPathReturnTypeEnum <em>XPath Return Type Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>XPath Return Type Enum</em>'.
   * @see com.ms.qaTools.saturn.values.XPathReturnTypeEnum
   * @generated
   */
  EEnum getXPathReturnTypeEnum();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.values.FailBehaviorsEnum <em>Fail Behaviors Enum Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Fail Behaviors Enum Object</em>'.
   * @see com.ms.qaTools.saturn.values.FailBehaviorsEnum
   * @model instanceClass="com.ms.qaTools.saturn.values.FailBehaviorsEnum"
   *        extendedMetaData="name='FailBehaviorsEnum:Object' baseType='FailBehaviorsEnum'"
   * @generated
   */
  EDataType getFailBehaviorsEnumObject();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.values.XPathReturnTypeEnum <em>XPath Return Type Enum Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>XPath Return Type Enum Object</em>'.
   * @see com.ms.qaTools.saturn.values.XPathReturnTypeEnum
   * @model instanceClass="com.ms.qaTools.saturn.values.XPathReturnTypeEnum"
   *        extendedMetaData="name='XPathReturnTypeEnum:Object' baseType='XPathReturnTypeEnum'"
   * @generated
   */
  EDataType getXPathReturnTypeEnumObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ValuesFactory getValuesFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.values.impl.CellComplexValueImpl <em>Cell Complex Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.values.impl.CellComplexValueImpl
     * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getCellComplexValue()
     * @generated
     */
    EClass CELL_COMPLEX_VALUE = eINSTANCE.getCellComplexValue();

    /**
     * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CELL_COMPLEX_VALUE__RESOURCE = eINSTANCE.getCellComplexValue_Resource();

    /**
     * The meta object literal for the '<em><b>Row</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CELL_COMPLEX_VALUE__ROW = eINSTANCE.getCellComplexValue_Row();

    /**
     * The meta object literal for the '<em><b>Column</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CELL_COMPLEX_VALUE__COLUMN = eINSTANCE.getCellComplexValue_Column();

    /**
     * The meta object literal for the '<em><b>Column Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CELL_COMPLEX_VALUE__COLUMN_NAME = eINSTANCE.getCellComplexValue_ColumnName();

    /**
     * The meta object literal for the '<em><b>Memoize</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CELL_COMPLEX_VALUE__MEMOIZE = eINSTANCE.getCellComplexValue_Memoize();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.values.impl.CodeComplexValueImpl <em>Code Complex Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.values.impl.CodeComplexValueImpl
     * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getCodeComplexValue()
     * @generated
     */
    EClass CODE_COMPLEX_VALUE = eINSTANCE.getCodeComplexValue();

    /**
     * The meta object literal for the '<em><b>Interpreter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CODE_COMPLEX_VALUE__INTERPRETER = eINSTANCE.getCodeComplexValue_Interpreter();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.values.impl.ComplexValueImpl <em>Complex Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.values.impl.ComplexValueImpl
     * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getComplexValue()
     * @generated
     */
    EClass COMPLEX_VALUE = eINSTANCE.getComplexValue();

    /**
     * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPLEX_VALUE__MIXED = eINSTANCE.getComplexValue_Mixed();

    /**
     * The meta object literal for the '<em><b>Null</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_VALUE__NULL = eINSTANCE.getComplexValue_Null();

    /**
     * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPLEX_VALUE__GROUP = eINSTANCE.getComplexValue_Group();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_VALUE__TEXT = eINSTANCE.getComplexValue_Text();

    /**
     * The meta object literal for the '<em><b>Env Var</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_VALUE__ENV_VAR = eINSTANCE.getComplexValue_EnvVar();

    /**
     * The meta object literal for the '<em><b>File</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_VALUE__FILE = eINSTANCE.getComplexValue_File();

    /**
     * The meta object literal for the '<em><b>XPath Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_VALUE__XPATH_VALUE = eINSTANCE.getComplexValue_XPathValue();

    /**
     * The meta object literal for the '<em><b>JSON Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_VALUE__JSON_VALUE = eINSTANCE.getComplexValue_JSONValue();

    /**
     * The meta object literal for the '<em><b>FIX Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_VALUE__FIX_VALUE = eINSTANCE.getComplexValue_FIXValue();

    /**
     * The meta object literal for the '<em><b>Cell Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_VALUE__CELL_VALUE = eINSTANCE.getComplexValue_CellValue();

    /**
     * The meta object literal for the '<em><b>Property Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_VALUE__PROPERTY_VALUE = eINSTANCE.getComplexValue_PropertyValue();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_VALUE__CODE = eINSTANCE.getComplexValue_Code();

    /**
     * The meta object literal for the '<em><b>Run Number</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_VALUE__RUN_NUMBER = eINSTANCE.getComplexValue_RunNumber();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_VALUE__REFERENCE = eINSTANCE.getComplexValue_Reference();

    /**
     * The meta object literal for the '<em><b>Memoize</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPLEX_VALUE__MEMOIZE = eINSTANCE.getComplexValue_Memoize();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.values.Describable <em>Describable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.values.Describable
     * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getDescribable()
     * @generated
     */
    EClass DESCRIBABLE = eINSTANCE.getDescribable();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIBABLE__DESCRIPTION = eINSTANCE.getDescribable_Description();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.values.Fallible <em>Fallible</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.values.Fallible
     * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getFallible()
     * @generated
     */
    EClass FALLIBLE = eINSTANCE.getFallible();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FALLIBLE__DEFAULT_VALUE = eINSTANCE.getFallible_DefaultValue();

    /**
     * The meta object literal for the '<em><b>Fail Behavior</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FALLIBLE__FAIL_BEHAVIOR = eINSTANCE.getFallible_FailBehavior();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.values.impl.FallibleComplexValueImpl <em>Fallible Complex Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.values.impl.FallibleComplexValueImpl
     * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getFallibleComplexValue()
     * @generated
     */
    EClass FALLIBLE_COMPLEX_VALUE = eINSTANCE.getFallibleComplexValue();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.values.impl.FIXComplexValueImpl <em>FIX Complex Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.values.impl.FIXComplexValueImpl
     * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getFIXComplexValue()
     * @generated
     */
    EClass FIX_COMPLEX_VALUE = eINSTANCE.getFIXComplexValue();

    /**
     * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIX_COMPLEX_VALUE__RESOURCE = eINSTANCE.getFIXComplexValue_Resource();

    /**
     * The meta object literal for the '<em><b>FIX Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIX_COMPLEX_VALUE__FIX_PATH = eINSTANCE.getFIXComplexValue_FIXPath();

    /**
     * The meta object literal for the '<em><b>Message Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIX_COMPLEX_VALUE__MESSAGE_TYPE = eINSTANCE.getFIXComplexValue_MessageType();

    /**
     * The meta object literal for the '<em><b>Row</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIX_COMPLEX_VALUE__ROW = eINSTANCE.getFIXComplexValue_Row();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIX_COMPLEX_VALUE__RETURN_TYPE = eINSTANCE.getFIXComplexValue_ReturnType();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.values.impl.JSONComplexValueImpl <em>JSON Complex Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.values.impl.JSONComplexValueImpl
     * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getJSONComplexValue()
     * @generated
     */
    EClass JSON_COMPLEX_VALUE = eINSTANCE.getJSONComplexValue();

    /**
     * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_COMPLEX_VALUE__RESOURCE = eINSTANCE.getJSONComplexValue_Resource();

    /**
     * The meta object literal for the '<em><b>JSON Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_COMPLEX_VALUE__JSON_PATH = eINSTANCE.getJSONComplexValue_JSONPath();

    /**
     * The meta object literal for the '<em><b>Row</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_COMPLEX_VALUE__ROW = eINSTANCE.getJSONComplexValue_Row();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.values.impl.PropertyComplexValueImpl <em>Property Complex Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.values.impl.PropertyComplexValueImpl
     * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getPropertyComplexValue()
     * @generated
     */
    EClass PROPERTY_COMPLEX_VALUE = eINSTANCE.getPropertyComplexValue();

    /**
     * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_COMPLEX_VALUE__RESOURCE = eINSTANCE.getPropertyComplexValue_Resource();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_COMPLEX_VALUE__PROPERTY = eINSTANCE.getPropertyComplexValue_Property();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.values.impl.ReferenceComplexValueImpl <em>Reference Complex Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.values.impl.ReferenceComplexValueImpl
     * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getReferenceComplexValue()
     * @generated
     */
    EClass REFERENCE_COMPLEX_VALUE = eINSTANCE.getReferenceComplexValue();

    /**
     * The meta object literal for the '<em><b>Include File</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_COMPLEX_VALUE__INCLUDE_FILE = eINSTANCE.getReferenceComplexValue_IncludeFile();

    /**
     * The meta object literal for the '<em><b>Template</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_COMPLEX_VALUE__TEMPLATE = eINSTANCE.getReferenceComplexValue_Template();

    /**
     * The meta object literal for the '<em><b>Run Group</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_COMPLEX_VALUE__RUN_GROUP = eINSTANCE.getReferenceComplexValue_RunGroup();

    /**
     * The meta object literal for the '<em><b>Saturn Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_COMPLEX_VALUE__SATURN_ATTRIBUTE = eINSTANCE.getReferenceComplexValue_SaturnAttribute();

    /**
     * The meta object literal for the '<em><b>User Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_COMPLEX_VALUE__USER_ATTRIBUTE = eINSTANCE.getReferenceComplexValue_UserAttribute();

    /**
     * The meta object literal for the '<em><b>Module Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_COMPLEX_VALUE__MODULE_ATTRIBUTE = eINSTANCE.getReferenceComplexValue_ModuleAttribute();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.values.impl.RunNumberComplexValueImpl <em>Run Number Complex Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.values.impl.RunNumberComplexValueImpl
     * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getRunNumberComplexValue()
     * @generated
     */
    EClass RUN_NUMBER_COMPLEX_VALUE = eINSTANCE.getRunNumberComplexValue();

    /**
     * The meta object literal for the '<em><b>Padding</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RUN_NUMBER_COMPLEX_VALUE__PADDING = eINSTANCE.getRunNumberComplexValue_Padding();

    /**
     * The meta object literal for the '<em><b>Pad Character</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RUN_NUMBER_COMPLEX_VALUE__PAD_CHARACTER = eINSTANCE.getRunNumberComplexValue_PadCharacter();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.values.impl.TextComplexValueImpl <em>Text Complex Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.values.impl.TextComplexValueImpl
     * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getTextComplexValue()
     * @generated
     */
    EClass TEXT_COMPLEX_VALUE = eINSTANCE.getTextComplexValue();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_COMPLEX_VALUE__TEXT = eINSTANCE.getTextComplexValue_Text();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.values.impl.XPathComplexValueImpl <em>XPath Complex Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.values.impl.XPathComplexValueImpl
     * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getXPathComplexValue()
     * @generated
     */
    EClass XPATH_COMPLEX_VALUE = eINSTANCE.getXPathComplexValue();

    /**
     * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPATH_COMPLEX_VALUE__RESOURCE = eINSTANCE.getXPathComplexValue_Resource();

    /**
     * The meta object literal for the '<em><b>XPath</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPATH_COMPLEX_VALUE__XPATH = eINSTANCE.getXPathComplexValue_XPath();

    /**
     * The meta object literal for the '<em><b>Namespaces</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPATH_COMPLEX_VALUE__NAMESPACES = eINSTANCE.getXPathComplexValue_Namespaces();

    /**
     * The meta object literal for the '<em><b>Row</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPATH_COMPLEX_VALUE__ROW = eINSTANCE.getXPathComplexValue_Row();

    /**
     * The meta object literal for the '<em><b>Fragment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XPATH_COMPLEX_VALUE__FRAGMENT = eINSTANCE.getXPathComplexValue_Fragment();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XPATH_COMPLEX_VALUE__RETURN_TYPE = eINSTANCE.getXPathComplexValue_ReturnType();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.values.FailBehaviorsEnum <em>Fail Behaviors Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.values.FailBehaviorsEnum
     * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getFailBehaviorsEnum()
     * @generated
     */
    EEnum FAIL_BEHAVIORS_ENUM = eINSTANCE.getFailBehaviorsEnum();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.values.XPathReturnTypeEnum <em>XPath Return Type Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.values.XPathReturnTypeEnum
     * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getXPathReturnTypeEnum()
     * @generated
     */
    EEnum XPATH_RETURN_TYPE_ENUM = eINSTANCE.getXPathReturnTypeEnum();

    /**
     * The meta object literal for the '<em>Fail Behaviors Enum Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.values.FailBehaviorsEnum
     * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getFailBehaviorsEnumObject()
     * @generated
     */
    EDataType FAIL_BEHAVIORS_ENUM_OBJECT = eINSTANCE.getFailBehaviorsEnumObject();

    /**
     * The meta object literal for the '<em>XPath Return Type Enum Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.values.XPathReturnTypeEnum
     * @see com.ms.qaTools.saturn.values.impl.ValuesPackageImpl#getXPathReturnTypeEnumObject()
     * @generated
     */
    EDataType XPATH_RETURN_TYPE_ENUM_OBJECT = eINSTANCE.getXPathReturnTypeEnumObject();

  }

} //ValuesPackage
