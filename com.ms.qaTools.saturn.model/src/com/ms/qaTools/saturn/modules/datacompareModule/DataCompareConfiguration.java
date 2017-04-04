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
package com.ms.qaTools.saturn.modules.datacompareModule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Data Compare Configuration</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#getDataSources <em>Data Sources</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#getOutput <em>Output</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#getDiffSetExplainer <em>Diff Set Explainer</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#isIgnoreInLeftOnlyColumns <em>Ignore In Left Only Columns</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#isIgnoreInRightOnlyColumns <em>Ignore In Right Only Columns</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#isFailOnValidation <em>Fail On Validation</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getDataCompareConfiguration()
 * @model extendedMetaData="name='Configuration_._type' kind='elementOnly'"
 * @generated
 */
public interface DataCompareConfiguration extends EObject
{
  /**
   * Returns the value of the '<em><b>Data Sources</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Sources</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Sources</em>' containment reference.
   * @see #setDataSources(DataSourceDefinition)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getDataCompareConfiguration_DataSources()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='DataSources' namespace='##targetNamespace'"
   * @generated
   */
  DataSourceDefinition getDataSources();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#getDataSources <em>Data Sources</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Sources</em>' containment reference.
   * @see #getDataSources()
   * @generated
   */
  void setDataSources(DataSourceDefinition value);

  /**
   * Returns the value of the '<em><b>Output</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output</em>' containment reference.
   * @see #setOutput(Output)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getDataCompareConfiguration_Output()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Output' namespace='##targetNamespace'"
   * @generated
   */
  Output getOutput();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#getOutput <em>Output</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Output</em>' containment reference.
   * @see #getOutput()
   * @generated
   */
  void setOutput(Output value);

  /**
   * Returns the value of the '<em><b>Diff Set Explainer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Diff Set Explainer</em>' containment reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Diff Set Explainer</em>' containment reference.
   * @see #setDiffSetExplainer(AbstractDiffSetExplainer)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getDataCompareConfiguration_DiffSetExplainer()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='DiffSetExplainer' namespace='##targetNamespace'"
   * @generated
   */
  AbstractDiffSetExplainer getDiffSetExplainer();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#getDiffSetExplainer <em>Diff Set Explainer</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Diff Set Explainer</em>' containment reference.
   * @see #getDiffSetExplainer()
   * @generated
   */
  void setDiffSetExplainer(AbstractDiffSetExplainer value);

  /**
   * Returns the value of the '<em><b>Fail On Validation</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fail On Validation</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fail On Validation</em>' attribute.
   * @see #isSetFailOnValidation()
   * @see #unsetFailOnValidation()
   * @see #setFailOnValidation(boolean)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getDataCompareConfiguration_FailOnValidation()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='failOnValidation'"
   * @generated
   */
  boolean isFailOnValidation();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#isFailOnValidation <em>Fail On Validation</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Fail On Validation</em>' attribute.
   * @see #isSetFailOnValidation()
   * @see #unsetFailOnValidation()
   * @see #isFailOnValidation()
   * @generated
   */
  void setFailOnValidation(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#isFailOnValidation <em>Fail On Validation</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetFailOnValidation()
   * @see #isFailOnValidation()
   * @see #setFailOnValidation(boolean)
   * @generated
   */
  void unsetFailOnValidation();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#isFailOnValidation <em>Fail On Validation</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Fail On Validation</em>' attribute is set.
   * @see #unsetFailOnValidation()
   * @see #isFailOnValidation()
   * @see #setFailOnValidation(boolean)
   * @generated
   */
  boolean isSetFailOnValidation();

  /**
   * Returns the value of the '<em><b>Ignore In Left Only Columns</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ignore In Left Only Columns</em>' attribute isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ignore In Left Only Columns</em>' attribute.
   * @see #isSetIgnoreInLeftOnlyColumns()
   * @see #unsetIgnoreInLeftOnlyColumns()
   * @see #setIgnoreInLeftOnlyColumns(boolean)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getDataCompareConfiguration_IgnoreInLeftOnlyColumns()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='ignoreInLeftOnlyColumns'"
   * @generated
   */
  boolean isIgnoreInLeftOnlyColumns();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#isIgnoreInLeftOnlyColumns <em>Ignore In Left Only Columns</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Ignore In Left Only Columns</em>' attribute.
   * @see #isSetIgnoreInLeftOnlyColumns()
   * @see #unsetIgnoreInLeftOnlyColumns()
   * @see #isIgnoreInLeftOnlyColumns()
   * @generated
   */
  void setIgnoreInLeftOnlyColumns(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#isIgnoreInLeftOnlyColumns <em>Ignore In Left Only Columns</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetIgnoreInLeftOnlyColumns()
   * @see #isIgnoreInLeftOnlyColumns()
   * @see #setIgnoreInLeftOnlyColumns(boolean)
   * @generated
   */
  void unsetIgnoreInLeftOnlyColumns();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#isIgnoreInLeftOnlyColumns <em>Ignore In Left Only Columns</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Ignore In Left Only Columns</em>' attribute is set.
   * @see #unsetIgnoreInLeftOnlyColumns()
   * @see #isIgnoreInLeftOnlyColumns()
   * @see #setIgnoreInLeftOnlyColumns(boolean)
   * @generated
   */
  boolean isSetIgnoreInLeftOnlyColumns();

  /**
   * Returns the value of the '<em><b>Ignore In Right Only Columns</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ignore In Right Only Columns</em>' attribute isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ignore In Right Only Columns</em>' attribute.
   * @see #isSetIgnoreInRightOnlyColumns()
   * @see #unsetIgnoreInRightOnlyColumns()
   * @see #setIgnoreInRightOnlyColumns(boolean)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getDataCompareConfiguration_IgnoreInRightOnlyColumns()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='ignoreInRightOnlyColumns'"
   * @generated
   */
  boolean isIgnoreInRightOnlyColumns();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#isIgnoreInRightOnlyColumns <em>Ignore In Right Only Columns</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Ignore In Right Only Columns</em>' attribute.
   * @see #isSetIgnoreInRightOnlyColumns()
   * @see #unsetIgnoreInRightOnlyColumns()
   * @see #isIgnoreInRightOnlyColumns()
   * @generated
   */
  void setIgnoreInRightOnlyColumns(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#isIgnoreInRightOnlyColumns <em>Ignore In Right Only Columns</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetIgnoreInRightOnlyColumns()
   * @see #isIgnoreInRightOnlyColumns()
   * @see #setIgnoreInRightOnlyColumns(boolean)
   * @generated
   */
  void unsetIgnoreInRightOnlyColumns();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration#isIgnoreInRightOnlyColumns <em>Ignore In Right Only Columns</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Ignore In Right Only Columns</em>' attribute is set.
   * @see #unsetIgnoreInRightOnlyColumns()
   * @see #isIgnoreInRightOnlyColumns()
   * @see #setIgnoreInRightOnlyColumns(boolean)
   * @generated
   */
  boolean isSetIgnoreInRightOnlyColumns();

} // DataCompareConfiguration
