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
package com.ms.qaTools.saturn.repetition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see com.ms.qaTools.saturn.repetition.RepetitionFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2006/pdsttools/xsd2perl nsPrefix='repetition' package='Saturn::RepetitionHandler'"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface RepetitionPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String            eNAME                                           = "repetition";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String            eNS_URI                                         = "http://www.ms.com/2007/Saturn/repetition";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String            eNS_PREFIX                                      = "repetition";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  RepetitionPackage eINSTANCE                                       = com.ms.qaTools.saturn.repetition.impl.RepetitionPackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.repetition.impl.ColumnMappingImpl <em>Column Mapping</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.repetition.impl.ColumnMappingImpl
   * @see com.ms.qaTools.saturn.repetition.impl.RepetitionPackageImpl#getColumnMapping()
   * @generated
   */
  int               COLUMN_MAPPING                                  = 0;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               COLUMN_MAPPING__ATTRIBUTE                       = 0;

  /**
   * The feature id for the '<em><b>Column</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               COLUMN_MAPPING__COLUMN                          = 1;

  /**
   * The number of structural features of the '<em>Column Mapping</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int               COLUMN_MAPPING_FEATURE_COUNT                    = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.repetition.impl.ForEachRepetitionImpl <em>For Each Repetition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.repetition.impl.ForEachRepetitionImpl
   * @see com.ms.qaTools.saturn.repetition.impl.RepetitionPackageImpl#getForEachRepetition()
   * @generated
   */
  int               FOR_EACH_REPETITION                             = 1;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               FOR_EACH_REPETITION__DEFAULT_STATUS             = TypesPackage.ABSTRACT_REPETITION_HANDLER__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               FOR_EACH_REPETITION__STATUS_CONDITION           = TypesPackage.ABSTRACT_REPETITION_HANDLER__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               FOR_EACH_REPETITION__ENABLED                    = TypesPackage.ABSTRACT_REPETITION_HANDLER__ENABLED;

  /**
   * The feature id for the '<em><b>Data Set Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int               FOR_EACH_REPETITION__DATA_SET_RESOURCE          = TypesPackage.ABSTRACT_REPETITION_HANDLER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Column Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int               FOR_EACH_REPETITION__COLUMN_MAPPINGS            = TypesPackage.ABSTRACT_REPETITION_HANDLER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>For Each Repetition</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int               FOR_EACH_REPETITION_FEATURE_COUNT               = TypesPackage.ABSTRACT_REPETITION_HANDLER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.repetition.impl.ForEachXPathRepetitionImpl <em>For Each XPath Repetition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.repetition.impl.ForEachXPathRepetitionImpl
   * @see com.ms.qaTools.saturn.repetition.impl.RepetitionPackageImpl#getForEachXPathRepetition()
   * @generated
   */
  int               FOR_EACH_XPATH_REPETITION                       = 2;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               FOR_EACH_XPATH_REPETITION__DEFAULT_STATUS       = TypesPackage.ABSTRACT_REPETITION_HANDLER__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               FOR_EACH_XPATH_REPETITION__STATUS_CONDITION     = TypesPackage.ABSTRACT_REPETITION_HANDLER__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               FOR_EACH_XPATH_REPETITION__ENABLED              = TypesPackage.ABSTRACT_REPETITION_HANDLER__ENABLED;

  /**
   * The feature id for the '<em><b>XML Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int               FOR_EACH_XPATH_REPETITION__XML_RESOURCE         = TypesPackage.ABSTRACT_REPETITION_HANDLER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Namespace Definition</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int               FOR_EACH_XPATH_REPETITION__NAMESPACE_DEFINITION = TypesPackage.ABSTRACT_REPETITION_HANDLER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>XPath Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int               FOR_EACH_XPATH_REPETITION__XPATH_MAPPINGS       = TypesPackage.ABSTRACT_REPETITION_HANDLER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>For Each XPath Repetition</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int               FOR_EACH_XPATH_REPETITION_FEATURE_COUNT         = TypesPackage.ABSTRACT_REPETITION_HANDLER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.repetition.impl.ForRepetitionImpl <em>For Repetition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.repetition.impl.ForRepetitionImpl
   * @see com.ms.qaTools.saturn.repetition.impl.RepetitionPackageImpl#getForRepetition()
   * @generated
   */
  int               FOR_REPETITION                                  = 3;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               FOR_REPETITION__DEFAULT_STATUS                  = TypesPackage.ABSTRACT_REPETITION_HANDLER__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               FOR_REPETITION__STATUS_CONDITION                = TypesPackage.ABSTRACT_REPETITION_HANDLER__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               FOR_REPETITION__ENABLED                         = TypesPackage.ABSTRACT_REPETITION_HANDLER__ENABLED;

  /**
   * The feature id for the '<em><b>Iterators</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int               FOR_REPETITION__ITERATORS                       = TypesPackage.ABSTRACT_REPETITION_HANDLER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>For Repetition</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int               FOR_REPETITION_FEATURE_COUNT                    = TypesPackage.ABSTRACT_REPETITION_HANDLER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.repetition.impl.ForRepetitionIteratorImpl <em>For Repetition Iterator</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.repetition.impl.ForRepetitionIteratorImpl
   * @see com.ms.qaTools.saturn.repetition.impl.RepetitionPackageImpl#getForRepetitionIterator()
   * @generated
   */
  int               FOR_REPETITION_ITERATOR                         = 4;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               FOR_REPETITION_ITERATOR__ATTRIBUTE              = 0;

  /**
   * The feature id for the '<em><b>Start Index</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               FOR_REPETITION_ITERATOR__START_INDEX            = 1;

  /**
   * The feature id for the '<em><b>End Index</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               FOR_REPETITION_ITERATOR__END_INDEX              = 2;

  /**
   * The number of structural features of the '<em>For Repetition Iterator</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int               FOR_REPETITION_ITERATOR_FEATURE_COUNT           = 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.repetition.impl.XPathMappingImpl <em>XPath Mapping</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.repetition.impl.XPathMappingImpl
   * @see com.ms.qaTools.saturn.repetition.impl.RepetitionPackageImpl#getXPathMapping()
   * @generated
   */
  int               XPATH_MAPPING                                   = 5;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               XPATH_MAPPING__ATTRIBUTE                        = 0;

  /**
   * The feature id for the '<em><b>XPath</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int               XPATH_MAPPING__XPATH                            = 1;

  /**
   * The number of structural features of the '<em>XPath Mapping</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int               XPATH_MAPPING_FEATURE_COUNT                     = 2;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.repetition.ColumnMapping <em>Column Mapping</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Mapping</em>'.
   * @see com.ms.qaTools.saturn.repetition.ColumnMapping
   * @generated
   */
  EClass getColumnMapping();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.repetition.ColumnMapping#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute</em>'.
   * @see com.ms.qaTools.saturn.repetition.ColumnMapping#getAttribute()
   * @see #getColumnMapping()
   * @generated
   */
  EAttribute getColumnMapping_Attribute();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.repetition.ColumnMapping#getColumn <em>Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Column</em>'.
   * @see com.ms.qaTools.saturn.repetition.ColumnMapping#getColumn()
   * @see #getColumnMapping()
   * @generated
   */
  EAttribute getColumnMapping_Column();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.repetition.ForEachRepetition <em>For Each Repetition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>For Each Repetition</em>'.
   * @see com.ms.qaTools.saturn.repetition.ForEachRepetition
   * @generated
   */
  EClass getForEachRepetition();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.repetition.ForEachRepetition#getDataSetResource <em>Data Set Resource</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Data Set Resource</em>'.
   * @see com.ms.qaTools.saturn.repetition.ForEachRepetition#getDataSetResource()
   * @see #getForEachRepetition()
   * @generated
   */
  EReference getForEachRepetition_DataSetResource();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.repetition.ForEachRepetition#getColumnMappings <em>Column Mappings</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Column Mappings</em>'.
   * @see com.ms.qaTools.saturn.repetition.ForEachRepetition#getColumnMappings()
   * @see #getForEachRepetition()
   * @generated
   */
  EReference getForEachRepetition_ColumnMappings();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.repetition.ForEachXPathRepetition <em>For Each XPath Repetition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>For Each XPath Repetition</em>'.
   * @see com.ms.qaTools.saturn.repetition.ForEachXPathRepetition
   * @generated
   */
  EClass getForEachXPathRepetition();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.repetition.ForEachXPathRepetition#getXMLResource <em>XML Resource</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>XML Resource</em>'.
   * @see com.ms.qaTools.saturn.repetition.ForEachXPathRepetition#getXMLResource()
   * @see #getForEachXPathRepetition()
   * @generated
   */
  EReference getForEachXPathRepetition_XMLResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.repetition.ForEachXPathRepetition#getNamespaceDefinition <em>Namespace Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Namespace Definition</em>'.
   * @see com.ms.qaTools.saturn.repetition.ForEachXPathRepetition#getNamespaceDefinition()
   * @see #getForEachXPathRepetition()
   * @generated
   */
  EReference getForEachXPathRepetition_NamespaceDefinition();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.repetition.ForEachXPathRepetition#getXPathMappings <em>XPath Mappings</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>XPath Mappings</em>'.
   * @see com.ms.qaTools.saturn.repetition.ForEachXPathRepetition#getXPathMappings()
   * @see #getForEachXPathRepetition()
   * @generated
   */
  EReference getForEachXPathRepetition_XPathMappings();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.repetition.ForRepetition <em>For Repetition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>For Repetition</em>'.
   * @see com.ms.qaTools.saturn.repetition.ForRepetition
   * @generated
   */
  EClass getForRepetition();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.repetition.ForRepetition#getIterators <em>Iterators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Iterators</em>'.
   * @see com.ms.qaTools.saturn.repetition.ForRepetition#getIterators()
   * @see #getForRepetition()
   * @generated
   */
  EReference getForRepetition_Iterators();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.repetition.ForRepetitionIterator <em>For Repetition Iterator</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>For Repetition Iterator</em>'.
   * @see com.ms.qaTools.saturn.repetition.ForRepetitionIterator
   * @generated
   */
  EClass getForRepetitionIterator();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.repetition.ForRepetitionIterator#getAttribute <em>Attribute</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Attribute</em>'.
   * @see com.ms.qaTools.saturn.repetition.ForRepetitionIterator#getAttribute()
   * @see #getForRepetitionIterator()
   * @generated
   */
  EAttribute getForRepetitionIterator_Attribute();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.repetition.ForRepetitionIterator#getEndIndex <em>End Index</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Index</em>'.
   * @see com.ms.qaTools.saturn.repetition.ForRepetitionIterator#getEndIndex()
   * @see #getForRepetitionIterator()
   * @generated
   */
  EAttribute getForRepetitionIterator_EndIndex();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.repetition.ForRepetitionIterator#getStartIndex <em>Start Index</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Start Index</em>'.
   * @see com.ms.qaTools.saturn.repetition.ForRepetitionIterator#getStartIndex()
   * @see #getForRepetitionIterator()
   * @generated
   */
  EAttribute getForRepetitionIterator_StartIndex();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.repetition.XPathMapping <em>XPath Mapping</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>XPath Mapping</em>'.
   * @see com.ms.qaTools.saturn.repetition.XPathMapping
   * @generated
   */
  EClass getXPathMapping();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.repetition.XPathMapping#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute</em>'.
   * @see com.ms.qaTools.saturn.repetition.XPathMapping#getAttribute()
   * @see #getXPathMapping()
   * @generated
   */
  EAttribute getXPathMapping_Attribute();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.repetition.XPathMapping#getXPath <em>XPath</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>XPath</em>'.
   * @see com.ms.qaTools.saturn.repetition.XPathMapping#getXPath()
   * @see #getXPathMapping()
   * @generated
   */
  EAttribute getXPathMapping_XPath();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RepetitionFactory getRepetitionFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.repetition.impl.ColumnMappingImpl <em>Column Mapping</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.repetition.impl.ColumnMappingImpl
     * @see com.ms.qaTools.saturn.repetition.impl.RepetitionPackageImpl#getColumnMapping()
     * @generated
     */
    EClass     COLUMN_MAPPING                                  = eINSTANCE.getColumnMapping();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_MAPPING__ATTRIBUTE                       = eINSTANCE.getColumnMapping_Attribute();

    /**
     * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_MAPPING__COLUMN                          = eINSTANCE.getColumnMapping_Column();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.repetition.impl.ForEachRepetitionImpl <em>For Each Repetition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.repetition.impl.ForEachRepetitionImpl
     * @see com.ms.qaTools.saturn.repetition.impl.RepetitionPackageImpl#getForEachRepetition()
     * @generated
     */
    EClass     FOR_EACH_REPETITION                             = eINSTANCE.getForEachRepetition();

    /**
     * The meta object literal for the '<em><b>Data Set Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference FOR_EACH_REPETITION__DATA_SET_RESOURCE          = eINSTANCE.getForEachRepetition_DataSetResource();

    /**
     * The meta object literal for the '<em><b>Column Mappings</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference FOR_EACH_REPETITION__COLUMN_MAPPINGS            = eINSTANCE.getForEachRepetition_ColumnMappings();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.repetition.impl.ForEachXPathRepetitionImpl <em>For Each XPath Repetition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.repetition.impl.ForEachXPathRepetitionImpl
     * @see com.ms.qaTools.saturn.repetition.impl.RepetitionPackageImpl#getForEachXPathRepetition()
     * @generated
     */
    EClass     FOR_EACH_XPATH_REPETITION                       = eINSTANCE.getForEachXPathRepetition();

    /**
     * The meta object literal for the '<em><b>XML Resource</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_EACH_XPATH_REPETITION__XML_RESOURCE         = eINSTANCE.getForEachXPathRepetition_XMLResource();

    /**
     * The meta object literal for the '<em><b>Namespace Definition</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference FOR_EACH_XPATH_REPETITION__NAMESPACE_DEFINITION = eINSTANCE.getForEachXPathRepetition_NamespaceDefinition();

    /**
     * The meta object literal for the '<em><b>XPath Mappings</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference FOR_EACH_XPATH_REPETITION__XPATH_MAPPINGS       = eINSTANCE.getForEachXPathRepetition_XPathMappings();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.repetition.impl.ForRepetitionImpl <em>For Repetition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.repetition.impl.ForRepetitionImpl
     * @see com.ms.qaTools.saturn.repetition.impl.RepetitionPackageImpl#getForRepetition()
     * @generated
     */
    EClass     FOR_REPETITION                                  = eINSTANCE.getForRepetition();

    /**
     * The meta object literal for the '<em><b>Iterators</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference FOR_REPETITION__ITERATORS                       = eINSTANCE.getForRepetition_Iterators();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.repetition.impl.ForRepetitionIteratorImpl <em>For Repetition Iterator</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.repetition.impl.ForRepetitionIteratorImpl
     * @see com.ms.qaTools.saturn.repetition.impl.RepetitionPackageImpl#getForRepetitionIterator()
     * @generated
     */
    EClass     FOR_REPETITION_ITERATOR                         = eINSTANCE.getForRepetitionIterator();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute FOR_REPETITION_ITERATOR__ATTRIBUTE              = eINSTANCE.getForRepetitionIterator_Attribute();

    /**
     * The meta object literal for the '<em><b>End Index</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute FOR_REPETITION_ITERATOR__END_INDEX              = eINSTANCE.getForRepetitionIterator_EndIndex();

    /**
     * The meta object literal for the '<em><b>Start Index</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute FOR_REPETITION_ITERATOR__START_INDEX            = eINSTANCE.getForRepetitionIterator_StartIndex();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.repetition.impl.XPathMappingImpl <em>XPath Mapping</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.repetition.impl.XPathMappingImpl
     * @see com.ms.qaTools.saturn.repetition.impl.RepetitionPackageImpl#getXPathMapping()
     * @generated
     */
    EClass     XPATH_MAPPING                                   = eINSTANCE.getXPathMapping();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute XPATH_MAPPING__ATTRIBUTE                        = eINSTANCE.getXPathMapping_Attribute();

    /**
     * The meta object literal for the '<em><b>XPath</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute XPATH_MAPPING__XPATH                            = eINSTANCE.getXPathMapping_XPath();

  }

} // RepetitionPackage
