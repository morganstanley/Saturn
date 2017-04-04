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
package com.ms.qaTools.saturn.modules.xml2csvModule;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Xml2 Csv Configuration</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#getXMLFile <em>XML File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#getCSVFile <em>CSV File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#getConfigFile <em>Config File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#getNamespaceFile <em>Namespace File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#getXPathMappings <em>XPath Mappings</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#isRemoveNulls <em>Remove Nulls</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#isAddHeader <em>Add Header</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#isDetachNodes <em>Detach Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.xml2csvModule.Xml2csvModulePackage#getXml2CsvConfiguration()
 * @model extendedMetaData="name='Configuration_._type' kind='elementOnly'"
 * @generated
 */
public interface Xml2CsvConfiguration extends EObject
{
  /**
   * Returns the value of the '<em><b>XML File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>XML File</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>XML File</em>' containment reference.
   * @see #setXMLFile(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.Xml2csvModulePackage#getXml2CsvConfiguration_XMLFile()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='XMLFile' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getXMLFile();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#getXMLFile <em>XML File</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>XML File</em>' containment reference.
   * @see #getXMLFile()
   * @generated
   */
  void setXMLFile(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>CSV File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>CSV File</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>CSV File</em>' containment reference.
   * @see #setCSVFile(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.Xml2csvModulePackage#getXml2CsvConfiguration_CSVFile()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='CSVFile' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getCSVFile();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#getCSVFile <em>CSV File</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>CSV File</em>' containment reference.
   * @see #getCSVFile()
   * @generated
   */
  void setCSVFile(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Config File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Config File</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Config File</em>' containment reference.
   * @see #setConfigFile(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.Xml2csvModulePackage#getXml2CsvConfiguration_ConfigFile()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='ConfigFile' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getConfigFile();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#getConfigFile <em>Config File</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Config File</em>' containment reference.
   * @see #getConfigFile()
   * @generated
   */
  void setConfigFile(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Namespace File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namespace File</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespace File</em>' containment reference.
   * @see #setNamespaceFile(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.Xml2csvModulePackage#getXml2CsvConfiguration_NamespaceFile()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='NamespaceFile' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getNamespaceFile();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#getNamespaceFile <em>Namespace File</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Namespace File</em>' containment reference.
   * @see #getNamespaceFile()
   * @generated
   */
  void setNamespaceFile(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>XPath Mappings</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.modules.xml2csvModule.XPathMapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>XPath Mappings</em>' containment reference list isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>XPath Mappings</em>' containment reference list.
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.Xml2csvModulePackage#getXml2CsvConfiguration_XPathMappings()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='XPathMappings' namespace='##targetNamespace'"
   * @generated
   */
  EList<XPathMapping> getXPathMappings();

  /**
   * Returns the value of the '<em><b>Add Header</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Add Header</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Add Header</em>' attribute.
   * @see #isSetAddHeader()
   * @see #unsetAddHeader()
   * @see #setAddHeader(boolean)
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.Xml2csvModulePackage#getXml2CsvConfiguration_AddHeader()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='addHeader'"
   * @generated
   */
  boolean isAddHeader();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#isAddHeader <em>Add Header</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Add Header</em>' attribute.
   * @see #isSetAddHeader()
   * @see #unsetAddHeader()
   * @see #isAddHeader()
   * @generated
   */
  void setAddHeader(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#isAddHeader <em>Add Header</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAddHeader()
   * @see #isAddHeader()
   * @see #setAddHeader(boolean)
   * @generated
   */
  void unsetAddHeader();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#isAddHeader <em>Add Header</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Add Header</em>' attribute is set.
   * @see #unsetAddHeader()
   * @see #isAddHeader()
   * @see #setAddHeader(boolean)
   * @generated
   */
  boolean isSetAddHeader();

  /**
   * Returns the value of the '<em><b>Detach Nodes</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Detach Nodes</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Detach Nodes</em>' attribute.
   * @see #isSetDetachNodes()
   * @see #unsetDetachNodes()
   * @see #setDetachNodes(boolean)
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.Xml2csvModulePackage#getXml2CsvConfiguration_DetachNodes()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='detachNodes'"
   * @generated
   */
  boolean isDetachNodes();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#isDetachNodes <em>Detach Nodes</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Detach Nodes</em>' attribute.
   * @see #isSetDetachNodes()
   * @see #unsetDetachNodes()
   * @see #isDetachNodes()
   * @generated
   */
  void setDetachNodes(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#isDetachNodes <em>Detach Nodes</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetDetachNodes()
   * @see #isDetachNodes()
   * @see #setDetachNodes(boolean)
   * @generated
   */
  void unsetDetachNodes();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#isDetachNodes <em>Detach Nodes</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Detach Nodes</em>' attribute is set.
   * @see #unsetDetachNodes()
   * @see #isDetachNodes()
   * @see #setDetachNodes(boolean)
   * @generated
   */
  boolean isSetDetachNodes();

  /**
   * Returns the value of the '<em><b>Remove Nulls</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Remove Nulls</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Remove Nulls</em>' attribute.
   * @see #isSetRemoveNulls()
   * @see #unsetRemoveNulls()
   * @see #setRemoveNulls(boolean)
   * @see com.ms.qaTools.saturn.modules.xml2csvModule.Xml2csvModulePackage#getXml2CsvConfiguration_RemoveNulls()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='removeNulls'"
   * @generated
   */
  boolean isRemoveNulls();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#isRemoveNulls <em>Remove Nulls</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Remove Nulls</em>' attribute.
   * @see #isSetRemoveNulls()
   * @see #unsetRemoveNulls()
   * @see #isRemoveNulls()
   * @generated
   */
  void setRemoveNulls(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#isRemoveNulls <em>Remove Nulls</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetRemoveNulls()
   * @see #isRemoveNulls()
   * @see #setRemoveNulls(boolean)
   * @generated
   */
  void unsetRemoveNulls();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration#isRemoveNulls <em>Remove Nulls</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Remove Nulls</em>' attribute is set.
   * @see #unsetRemoveNulls()
   * @see #isRemoveNulls()
   * @see #setRemoveNulls(boolean)
   * @generated
   */
  boolean isSetRemoveNulls();

} // Xml2CsvConfiguration
