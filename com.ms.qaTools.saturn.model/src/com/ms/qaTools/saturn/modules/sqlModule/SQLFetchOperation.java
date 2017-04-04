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
package com.ms.qaTools.saturn.modules.sqlModule;

import org.eclipse.emf.common.util.EList;

import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>SQL Fetch Operation</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation#getOutputResource <em>Output Resource</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation#getParameterResource <em>Parameter Resource
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation#getQueries <em>Queries</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation#getTableGroupDefinition <em>Table Group
 * Definition</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation#getDefaultOutputResourceType <em>Default Output
 * Resource Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage#getSQLFetchOperation()
 * @model annotation="http://www.ms.com/2006/pdsttools/xsd2perl executable='Saturn::Module::SQL::Fetch::Executable'"
 *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib createUpdater='true' name='sqlFetch'"
 *        extendedMetaData="name='Fetch' kind='elementOnly'"
 * @generated
 */
public interface SQLFetchOperation extends AbstractSQLOperation
{
  /**
   * Returns the value of the '<em><b>Output Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Resource</em>' containment reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Resource</em>' containment reference.
   * @see #setOutputResource(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage#getSQLFetchOperation_OutputResource()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='OutputResource' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getOutputResource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation#getOutputResource <em>Output Resource</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Output Resource</em>' containment reference.
   * @see #getOutputResource()
   * @generated
   */
  void setOutputResource(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Parameter Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Resource</em>' containment reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Resource</em>' containment reference.
   * @see #setParameterResource(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage#getSQLFetchOperation_ParameterResource()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='ParameterResource' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getParameterResource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation#getParameterResource <em>Parameter Resource</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter Resource</em>' containment reference.
   * @see #getParameterResource()
   * @generated
   */
  void setParameterResource(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Queries</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.modules.sqlModule.FetchQuery}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Queries</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Queries</em>' containment reference list.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage#getSQLFetchOperation_Queries()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Queries' namespace='##targetNamespace'"
   * @generated
   */
  EList<FetchQuery> getQueries();

  /**
   * Returns the value of the '<em><b>Table Group Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table Group Definition</em>' containment reference isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table Group Definition</em>' containment reference.
   * @see #setTableGroupDefinition(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage#getSQLFetchOperation_TableGroupDefinition()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='TableGroupDefinition' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getTableGroupDefinition();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation#getTableGroupDefinition <em>Table Group Definition</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Table Group Definition</em>' containment reference.
   * @see #getTableGroupDefinition()
   * @generated
   */
  void setTableGroupDefinition(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Default Output Resource Type</b></em>' attribute.
   * The default value is <code>"CSV"</code>.
   * The literals are from the enumeration {@link com.ms.qaTools.saturn.modules.sqlModule.IOFileTypesEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Output Resource Type</em>' attribute isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Output Resource Type</em>' attribute.
   * @see com.ms.qaTools.saturn.modules.sqlModule.IOFileTypesEnum
   * @see #isSetDefaultOutputResourceType()
   * @see #unsetDefaultOutputResourceType()
   * @see #setDefaultOutputResourceType(IOFileTypesEnum)
   * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage#getSQLFetchOperation_DefaultOutputResourceType()
   * @model default="CSV" unsettable="true"
   *        extendedMetaData="kind='attribute' name='defaultOutputResourceType'"
   * @generated
   */
  IOFileTypesEnum getDefaultOutputResourceType();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation#getDefaultOutputResourceType <em>Default Output Resource Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Output Resource Type</em>' attribute.
   * @see com.ms.qaTools.saturn.modules.sqlModule.IOFileTypesEnum
   * @see #isSetDefaultOutputResourceType()
   * @see #unsetDefaultOutputResourceType()
   * @see #getDefaultOutputResourceType()
   * @generated
   */
  void setDefaultOutputResourceType(IOFileTypesEnum value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation#getDefaultOutputResourceType <em>Default Output Resource Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetDefaultOutputResourceType()
   * @see #getDefaultOutputResourceType()
   * @see #setDefaultOutputResourceType(IOFileTypesEnum)
   * @generated
   */
  void unsetDefaultOutputResourceType();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation#getDefaultOutputResourceType <em>Default Output Resource Type</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Default Output Resource Type</em>' attribute is set.
   * @see #unsetDefaultOutputResourceType()
   * @see #getDefaultOutputResourceType()
   * @see #setDefaultOutputResourceType(IOFileTypesEnum)
   * @generated
   */
  boolean isSetDefaultOutputResourceType();

} // SQLFetchOperation
