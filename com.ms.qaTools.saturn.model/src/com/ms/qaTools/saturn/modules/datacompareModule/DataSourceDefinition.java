package com.ms.qaTools.saturn.modules.datacompareModule;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Data Source Definition</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#getLeft <em>Left</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#getRight <em>Right</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#getSortDatasets <em>Sort Datasets</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#isPartialCompare <em>Partial Compare</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#getMaxRows <em>Max Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getDataSourceDefinition()
 * @model extendedMetaData="name='DataSources_._type' kind='elementOnly'"
 * @generated
 */
public interface DataSourceDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getDataSourceDefinition_Left()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Left' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getLeft();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getDataSourceDefinition_Right()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Right' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getRight();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.modules.datacompareModule.MappedColumn}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' containment reference list.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getDataSourceDefinition_Columns()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Columns' namespace='##targetNamespace'"
   * @generated
   */
  EList<MappedColumn> getColumns();

  /**
   * Returns the value of the '<em><b>Max Rows</b></em>' attribute. The default value is <code>"0"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Rows</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Max Rows</em>' attribute.
   * @see #isSetMaxRows()
   * @see #unsetMaxRows()
   * @see #setMaxRows(BigInteger)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getDataSourceDefinition_MaxRows()
   * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='maxRows'"
   * @generated
   */
  BigInteger getMaxRows();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#getMaxRows <em>Max Rows</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Rows</em>' attribute.
   * @see #isSetMaxRows()
   * @see #unsetMaxRows()
   * @see #getMaxRows()
   * @generated
   */
  void setMaxRows(BigInteger value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#getMaxRows <em>Max Rows</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetMaxRows()
   * @see #getMaxRows()
   * @see #setMaxRows(BigInteger)
   * @generated
   */
  void unsetMaxRows();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#getMaxRows <em>Max Rows</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Max Rows</em>' attribute is set.
   * @see #unsetMaxRows()
   * @see #getMaxRows()
   * @see #setMaxRows(BigInteger)
   * @generated
   */
  boolean isSetMaxRows();

  /**
   * Returns the value of the '<em><b>Partial Compare</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Partial Compare</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Partial Compare</em>' attribute.
   * @see #isSetPartialCompare()
   * @see #unsetPartialCompare()
   * @see #setPartialCompare(boolean)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getDataSourceDefinition_PartialCompare()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='partialCompare'"
   * @generated
   */
  boolean isPartialCompare();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#isPartialCompare <em>Partial Compare</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Partial Compare</em>' attribute.
   * @see #isSetPartialCompare()
   * @see #unsetPartialCompare()
   * @see #isPartialCompare()
   * @generated
   */
  void setPartialCompare(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#isPartialCompare <em>Partial Compare</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetPartialCompare()
   * @see #isPartialCompare()
   * @see #setPartialCompare(boolean)
   * @generated
   */
  void unsetPartialCompare();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#isPartialCompare <em>Partial Compare</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Partial Compare</em>' attribute is set.
   * @see #unsetPartialCompare()
   * @see #isPartialCompare()
   * @see #setPartialCompare(boolean)
   * @generated
   */
  boolean isSetPartialCompare();

  /**
   * Returns the value of the '<em><b>Sort Datasets</b></em>' attribute. The default value is <code>"BOTH"</code>. The
   * literals are from the enumeration {@link com.ms.qaTools.saturn.modules.datacompareModule.SortType}. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sort Datasets</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Sort Datasets</em>' attribute.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.SortType
   * @see #isSetSortDatasets()
   * @see #unsetSortDatasets()
   * @see #setSortDatasets(SortType)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getDataSourceDefinition_SortDatasets()
   * @model default="BOTH" unsettable="true"
   *        annotation="http://www.ms.com/2006/pdsttools/xsd2perl accessor='sortDataSets'"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib accessor='sortDs'"
   *        extendedMetaData="kind='attribute' name='sortDatasets'"
   * @generated
   */
  SortType getSortDatasets();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#getSortDatasets <em>Sort Datasets</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Sort Datasets</em>' attribute.
   * @see com.ms.qaTools.saturn.modules.datacompareModule.SortType
   * @see #isSetSortDatasets()
   * @see #unsetSortDatasets()
   * @see #getSortDatasets()
   * @generated
   */
  void setSortDatasets(SortType value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#getSortDatasets <em>Sort Datasets</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetSortDatasets()
   * @see #getSortDatasets()
   * @see #setSortDatasets(SortType)
   * @generated
   */
  void unsetSortDatasets();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition#getSortDatasets <em>Sort Datasets</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Sort Datasets</em>' attribute is set.
   * @see #unsetSortDatasets()
   * @see #getSortDatasets()
   * @see #setSortDatasets(SortType)
   * @generated
   */
  boolean isSetSortDatasets();

} // DataSourceDefinition
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
