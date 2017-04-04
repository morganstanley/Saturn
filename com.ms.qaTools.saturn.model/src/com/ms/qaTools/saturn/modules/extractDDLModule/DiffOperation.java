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
package com.ms.qaTools.saturn.modules.extractDDLModule;

import org.eclipse.emf.common.util.EList;

import com.ms.qaTools.saturn.exception.exception;
import com.ms.qaTools.saturn.types.ComplexValueMap;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Diff Operation</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#getException <em>Exception</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#getOutputResource <em>Output Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#getDataBaseQualifier <em>Data Base Qualifier</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#getColumnLength <em>Column Length</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#getObjectMaps <em>Object Maps</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isIgnoreMissing <em>Ignore Missing</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isShowIdenticals <em>Show Identicals</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitNewlyAdded <em>Omit Newly Added</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitTables <em>Omit Tables</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitViews <em>Omit Views</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitSequences <em>Omit Sequences</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitProcedures <em>Omit Procedures</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitPermissions <em>Omit Permissions</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitIndexes <em>Omit Indexes</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitTableSpaces <em>Omit Table Spaces</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitStorage <em>Omit Storage</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isPreserveColumnSequence <em>Preserve Column Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getDiffOperation()
 * @model extendedMetaData="name='DiffOperation' kind='elementOnly'"
 * @generated
 */
public interface DiffOperation extends AbstractOperation
{
  /**
   * Returns the value of the '<em><b>Exception</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exception</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception</em>' containment reference.
   * @see #setException(exception)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getDiffOperation_Exception()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Exception' namespace='http://www.ms.com/2009/Saturn/Exception'"
   * @generated
   */
  exception getException();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#getException <em>Exception</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Exception</em>' containment reference.
   * @see #getException()
   * @generated
   */
  void setException(exception value);

  /**
   * Returns the value of the '<em><b>Output Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Resource</em>' containment reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Resource</em>' containment reference.
   * @see #setOutputResource(NamedResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getDiffOperation_OutputResource()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='OutputResource' namespace='##targetNamespace'"
   * @generated
   */
  NamedResourceDefinition getOutputResource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#getOutputResource <em>Output Resource</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Output Resource</em>' containment reference.
   * @see #getOutputResource()
   * @generated
   */
  void setOutputResource(NamedResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Data Base Qualifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Base Qualifier</em>' containment reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Base Qualifier</em>' containment reference.
   * @see #setDataBaseQualifier(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getDiffOperation_DataBaseQualifier()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='DataBaseQualifier' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getDataBaseQualifier();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#getDataBaseQualifier <em>Data Base Qualifier</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Base Qualifier</em>' containment reference.
   * @see #getDataBaseQualifier()
   * @generated
   */
  void setDataBaseQualifier(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Column Length</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Length</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Length</em>' containment reference.
   * @see #setColumnLength(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getDiffOperation_ColumnLength()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='ColumnLength' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getColumnLength();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#getColumnLength <em>Column Length</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Column Length</em>' containment reference.
   * @see #getColumnLength()
   * @generated
   */
  void setColumnLength(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Object Maps</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.types.ComplexValueMap}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Maps</em>' containment reference list isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Maps</em>' containment reference list.
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getDiffOperation_ObjectMaps()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='ObjectMaps' namespace='##targetNamespace'"
   * @generated
   */
  EList<ComplexValueMap> getObjectMaps();

  /**
   * Returns the value of the '<em><b>Ignore Missing</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ignore Missing</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ignore Missing</em>' attribute.
   * @see #isSetIgnoreMissing()
   * @see #unsetIgnoreMissing()
   * @see #setIgnoreMissing(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getDiffOperation_IgnoreMissing()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='ignoreMissing'"
   * @generated
   */
  boolean isIgnoreMissing();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isIgnoreMissing <em>Ignore Missing</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Ignore Missing</em>' attribute.
   * @see #isSetIgnoreMissing()
   * @see #unsetIgnoreMissing()
   * @see #isIgnoreMissing()
   * @generated
   */
  void setIgnoreMissing(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isIgnoreMissing <em>Ignore Missing</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetIgnoreMissing()
   * @see #isIgnoreMissing()
   * @see #setIgnoreMissing(boolean)
   * @generated
   */
  void unsetIgnoreMissing();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isIgnoreMissing <em>Ignore Missing</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Ignore Missing</em>' attribute is set.
   * @see #unsetIgnoreMissing()
   * @see #isIgnoreMissing()
   * @see #setIgnoreMissing(boolean)
   * @generated
   */
  boolean isSetIgnoreMissing();

  /**
   * Returns the value of the '<em><b>Omit Indexes</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Omit Indexes</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Omit Indexes</em>' attribute.
   * @see #isSetOmitIndexes()
   * @see #unsetOmitIndexes()
   * @see #setOmitIndexes(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getDiffOperation_OmitIndexes()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='omitIndexes'"
   * @generated
   */
  boolean isOmitIndexes();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitIndexes <em>Omit Indexes</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Omit Indexes</em>' attribute.
   * @see #isSetOmitIndexes()
   * @see #unsetOmitIndexes()
   * @see #isOmitIndexes()
   * @generated
   */
  void setOmitIndexes(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitIndexes <em>Omit Indexes</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetOmitIndexes()
   * @see #isOmitIndexes()
   * @see #setOmitIndexes(boolean)
   * @generated
   */
  void unsetOmitIndexes();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitIndexes <em>Omit Indexes</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Omit Indexes</em>' attribute is set.
   * @see #unsetOmitIndexes()
   * @see #isOmitIndexes()
   * @see #setOmitIndexes(boolean)
   * @generated
   */
  boolean isSetOmitIndexes();

  /**
   * Returns the value of the '<em><b>Omit Newly Added</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Omit Newly Added</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Omit Newly Added</em>' attribute.
   * @see #isSetOmitNewlyAdded()
   * @see #unsetOmitNewlyAdded()
   * @see #setOmitNewlyAdded(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getDiffOperation_OmitNewlyAdded()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='omitNewlyAdded'"
   * @generated
   */
  boolean isOmitNewlyAdded();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitNewlyAdded <em>Omit Newly Added</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Omit Newly Added</em>' attribute.
   * @see #isSetOmitNewlyAdded()
   * @see #unsetOmitNewlyAdded()
   * @see #isOmitNewlyAdded()
   * @generated
   */
  void setOmitNewlyAdded(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitNewlyAdded <em>Omit Newly Added</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetOmitNewlyAdded()
   * @see #isOmitNewlyAdded()
   * @see #setOmitNewlyAdded(boolean)
   * @generated
   */
  void unsetOmitNewlyAdded();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitNewlyAdded <em>Omit Newly Added</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Omit Newly Added</em>' attribute is set.
   * @see #unsetOmitNewlyAdded()
   * @see #isOmitNewlyAdded()
   * @see #setOmitNewlyAdded(boolean)
   * @generated
   */
  boolean isSetOmitNewlyAdded();

  /**
   * Returns the value of the '<em><b>Omit Permissions</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Omit Permissions</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Omit Permissions</em>' attribute.
   * @see #isSetOmitPermissions()
   * @see #unsetOmitPermissions()
   * @see #setOmitPermissions(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getDiffOperation_OmitPermissions()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='omitPermissions'"
   * @generated
   */
  boolean isOmitPermissions();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitPermissions <em>Omit Permissions</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Omit Permissions</em>' attribute.
   * @see #isSetOmitPermissions()
   * @see #unsetOmitPermissions()
   * @see #isOmitPermissions()
   * @generated
   */
  void setOmitPermissions(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitPermissions <em>Omit Permissions</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetOmitPermissions()
   * @see #isOmitPermissions()
   * @see #setOmitPermissions(boolean)
   * @generated
   */
  void unsetOmitPermissions();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitPermissions <em>Omit Permissions</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Omit Permissions</em>' attribute is set.
   * @see #unsetOmitPermissions()
   * @see #isOmitPermissions()
   * @see #setOmitPermissions(boolean)
   * @generated
   */
  boolean isSetOmitPermissions();

  /**
   * Returns the value of the '<em><b>Omit Procedures</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Omit Procedures</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Omit Procedures</em>' attribute.
   * @see #isSetOmitProcedures()
   * @see #unsetOmitProcedures()
   * @see #setOmitProcedures(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getDiffOperation_OmitProcedures()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='omitProcedures'"
   * @generated
   */
  boolean isOmitProcedures();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitProcedures <em>Omit Procedures</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Omit Procedures</em>' attribute.
   * @see #isSetOmitProcedures()
   * @see #unsetOmitProcedures()
   * @see #isOmitProcedures()
   * @generated
   */
  void setOmitProcedures(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitProcedures <em>Omit Procedures</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetOmitProcedures()
   * @see #isOmitProcedures()
   * @see #setOmitProcedures(boolean)
   * @generated
   */
  void unsetOmitProcedures();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitProcedures <em>Omit Procedures</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Omit Procedures</em>' attribute is set.
   * @see #unsetOmitProcedures()
   * @see #isOmitProcedures()
   * @see #setOmitProcedures(boolean)
   * @generated
   */
  boolean isSetOmitProcedures();

  /**
   * Returns the value of the '<em><b>Omit Sequences</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Omit Sequences</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Omit Sequences</em>' attribute.
   * @see #isSetOmitSequences()
   * @see #unsetOmitSequences()
   * @see #setOmitSequences(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getDiffOperation_OmitSequences()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='omitSequences'"
   * @generated
   */
  boolean isOmitSequences();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitSequences <em>Omit Sequences</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Omit Sequences</em>' attribute.
   * @see #isSetOmitSequences()
   * @see #unsetOmitSequences()
   * @see #isOmitSequences()
   * @generated
   */
  void setOmitSequences(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitSequences <em>Omit Sequences</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetOmitSequences()
   * @see #isOmitSequences()
   * @see #setOmitSequences(boolean)
   * @generated
   */
  void unsetOmitSequences();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitSequences <em>Omit Sequences</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Omit Sequences</em>' attribute is set.
   * @see #unsetOmitSequences()
   * @see #isOmitSequences()
   * @see #setOmitSequences(boolean)
   * @generated
   */
  boolean isSetOmitSequences();

  /**
   * Returns the value of the '<em><b>Omit Storage</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Omit Storage</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Omit Storage</em>' attribute.
   * @see #isSetOmitStorage()
   * @see #unsetOmitStorage()
   * @see #setOmitStorage(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getDiffOperation_OmitStorage()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='omitStorage'"
   * @generated
   */
  boolean isOmitStorage();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitStorage <em>Omit Storage</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Omit Storage</em>' attribute.
   * @see #isSetOmitStorage()
   * @see #unsetOmitStorage()
   * @see #isOmitStorage()
   * @generated
   */
  void setOmitStorage(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitStorage <em>Omit Storage</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetOmitStorage()
   * @see #isOmitStorage()
   * @see #setOmitStorage(boolean)
   * @generated
   */
  void unsetOmitStorage();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitStorage <em>Omit Storage</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Omit Storage</em>' attribute is set.
   * @see #unsetOmitStorage()
   * @see #isOmitStorage()
   * @see #setOmitStorage(boolean)
   * @generated
   */
  boolean isSetOmitStorage();

  /**
   * Returns the value of the '<em><b>Omit Tables</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Omit Tables</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Omit Tables</em>' attribute.
   * @see #isSetOmitTables()
   * @see #unsetOmitTables()
   * @see #setOmitTables(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getDiffOperation_OmitTables()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='omitTables'"
   * @generated
   */
  boolean isOmitTables();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitTables <em>Omit Tables</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Omit Tables</em>' attribute.
   * @see #isSetOmitTables()
   * @see #unsetOmitTables()
   * @see #isOmitTables()
   * @generated
   */
  void setOmitTables(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitTables <em>Omit Tables</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetOmitTables()
   * @see #isOmitTables()
   * @see #setOmitTables(boolean)
   * @generated
   */
  void unsetOmitTables();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitTables <em>Omit Tables</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Omit Tables</em>' attribute is set.
   * @see #unsetOmitTables()
   * @see #isOmitTables()
   * @see #setOmitTables(boolean)
   * @generated
   */
  boolean isSetOmitTables();

  /**
   * Returns the value of the '<em><b>Omit Table Spaces</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Omit Table Spaces</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Omit Table Spaces</em>' attribute.
   * @see #isSetOmitTableSpaces()
   * @see #unsetOmitTableSpaces()
   * @see #setOmitTableSpaces(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getDiffOperation_OmitTableSpaces()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='omitTableSpaces'"
   * @generated
   */
  boolean isOmitTableSpaces();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitTableSpaces <em>Omit Table Spaces</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Omit Table Spaces</em>' attribute.
   * @see #isSetOmitTableSpaces()
   * @see #unsetOmitTableSpaces()
   * @see #isOmitTableSpaces()
   * @generated
   */
  void setOmitTableSpaces(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitTableSpaces <em>Omit Table Spaces</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetOmitTableSpaces()
   * @see #isOmitTableSpaces()
   * @see #setOmitTableSpaces(boolean)
   * @generated
   */
  void unsetOmitTableSpaces();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitTableSpaces <em>Omit Table Spaces</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Omit Table Spaces</em>' attribute is set.
   * @see #unsetOmitTableSpaces()
   * @see #isOmitTableSpaces()
   * @see #setOmitTableSpaces(boolean)
   * @generated
   */
  boolean isSetOmitTableSpaces();

  /**
   * Returns the value of the '<em><b>Omit Views</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Omit Views</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Omit Views</em>' attribute.
   * @see #isSetOmitViews()
   * @see #unsetOmitViews()
   * @see #setOmitViews(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getDiffOperation_OmitViews()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='omitViews'"
   * @generated
   */
  boolean isOmitViews();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitViews <em>Omit Views</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Omit Views</em>' attribute.
   * @see #isSetOmitViews()
   * @see #unsetOmitViews()
   * @see #isOmitViews()
   * @generated
   */
  void setOmitViews(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitViews <em>Omit Views</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetOmitViews()
   * @see #isOmitViews()
   * @see #setOmitViews(boolean)
   * @generated
   */
  void unsetOmitViews();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isOmitViews <em>Omit Views</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Omit Views</em>' attribute is set.
   * @see #unsetOmitViews()
   * @see #isOmitViews()
   * @see #setOmitViews(boolean)
   * @generated
   */
  boolean isSetOmitViews();

  /**
   * Returns the value of the '<em><b>Preserve Column Sequence</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preserve Column Sequence</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preserve Column Sequence</em>' attribute.
   * @see #isSetPreserveColumnSequence()
   * @see #unsetPreserveColumnSequence()
   * @see #setPreserveColumnSequence(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getDiffOperation_PreserveColumnSequence()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='preserveColumnSequence'"
   * @generated
   */
  boolean isPreserveColumnSequence();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isPreserveColumnSequence <em>Preserve Column Sequence</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Preserve Column Sequence</em>' attribute.
   * @see #isSetPreserveColumnSequence()
   * @see #unsetPreserveColumnSequence()
   * @see #isPreserveColumnSequence()
   * @generated
   */
  void setPreserveColumnSequence(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isPreserveColumnSequence <em>Preserve Column Sequence</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetPreserveColumnSequence()
   * @see #isPreserveColumnSequence()
   * @see #setPreserveColumnSequence(boolean)
   * @generated
   */
  void unsetPreserveColumnSequence();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isPreserveColumnSequence <em>Preserve Column Sequence</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Preserve Column Sequence</em>' attribute is set.
   * @see #unsetPreserveColumnSequence()
   * @see #isPreserveColumnSequence()
   * @see #setPreserveColumnSequence(boolean)
   * @generated
   */
  boolean isSetPreserveColumnSequence();

  /**
   * Returns the value of the '<em><b>Show Identicals</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Show Identicals</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Show Identicals</em>' attribute.
   * @see #isSetShowIdenticals()
   * @see #unsetShowIdenticals()
   * @see #setShowIdenticals(boolean)
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getDiffOperation_ShowIdenticals()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='showIdenticals'"
   * @generated
   */
  boolean isShowIdenticals();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isShowIdenticals <em>Show Identicals</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Show Identicals</em>' attribute.
   * @see #isSetShowIdenticals()
   * @see #unsetShowIdenticals()
   * @see #isShowIdenticals()
   * @generated
   */
  void setShowIdenticals(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isShowIdenticals <em>Show Identicals</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetShowIdenticals()
   * @see #isShowIdenticals()
   * @see #setShowIdenticals(boolean)
   * @generated
   */
  void unsetShowIdenticals();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation#isShowIdenticals <em>Show Identicals</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Show Identicals</em>' attribute is set.
   * @see #unsetShowIdenticals()
   * @see #isShowIdenticals()
   * @see #setShowIdenticals(boolean)
   * @generated
   */
  boolean isSetShowIdenticals();

} // DiffOperation
