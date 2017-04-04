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
package com.ms.qaTools.saturn.modules.xmlDiffModule;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Xml Diff Configuration</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getObjects <em>Objects</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getDocumentKeys <em>Document Keys</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getLeftFile <em>Left File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getRightFile <em>Right File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getOutResource <em>Out Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getDescription <em>Description</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#isFailOnValidation <em>Fail On Validation</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#isIgnoreInLeftOnly <em>Ignore In Left Only</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#isIgnoreInRightOnly <em>Ignore In Right Only</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffModulePackage#getXmlDiffConfiguration()
 * @model extendedMetaData="name='Configuration_._type' kind='elementOnly'"
 * @generated
 */
public interface XmlDiffConfiguration extends EObject
{
  /**
   * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objects</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objects</em>' containment reference list.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffModulePackage#getXmlDiffConfiguration_Objects()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Objects' namespace='##targetNamespace'"
   * @generated
   */
  EList<XmlDiffObject> getObjects();

  /**
   * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffColumn}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' containment reference list.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffModulePackage#getXmlDiffConfiguration_Columns()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Columns' namespace='##targetNamespace'"
   * @generated
   */
  EList<XmlDiffColumn> getColumns();

  /**
   * Returns the value of the '<em><b>Document Keys</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffColumn}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Document Keys</em>' containment reference list isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Document Keys</em>' containment reference list.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffModulePackage#getXmlDiffConfiguration_DocumentKeys()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='DocumentKeys' namespace='##targetNamespace'"
   * @generated
   */
  EList<XmlDiffColumn> getDocumentKeys();

  /**
   * Returns the value of the '<em><b>Namespaces</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffNamespace}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namespaces</em>' containment reference list isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespaces</em>' containment reference list.
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffModulePackage#getXmlDiffConfiguration_Namespaces()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Namespaces' namespace='##targetNamespace'"
   * @generated
   */
  EList<XmlDiffNamespace> getNamespaces();

  /**
   * Returns the value of the '<em><b>Left File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left File</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left File</em>' containment reference.
   * @see #setLeftFile(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffModulePackage#getXmlDiffConfiguration_LeftFile()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='LeftFile' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getLeftFile();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getLeftFile <em>Left File</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Left File</em>' containment reference.
   * @see #getLeftFile()
   * @generated
   */
  void setLeftFile(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Right File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right File</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right File</em>' containment reference.
   * @see #setRightFile(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffModulePackage#getXmlDiffConfiguration_RightFile()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='RightFile' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getRightFile();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getRightFile <em>Right File</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Right File</em>' containment reference.
   * @see #getRightFile()
   * @generated
   */
  void setRightFile(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Out Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out Resource</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out Resource</em>' containment reference.
   * @see #setOutResource(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffModulePackage#getXmlDiffConfiguration_OutResource()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='OutResource' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getOutResource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getOutResource <em>Out Resource</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Out Resource</em>' containment reference.
   * @see #getOutResource()
   * @generated
   */
  void setOutResource(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' containment reference.
   * @see #setDescription(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffModulePackage#getXmlDiffConfiguration_Description()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getDescription();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#getDescription <em>Description</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' containment reference.
   * @see #getDescription()
   * @generated
   */
  void setDescription(ComplexValue value);

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
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffModulePackage#getXmlDiffConfiguration_FailOnValidation()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='failOnValidation'"
   * @generated
   */
  boolean isFailOnValidation();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#isFailOnValidation <em>Fail On Validation</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Fail On Validation</em>' attribute.
   * @see #isSetFailOnValidation()
   * @see #unsetFailOnValidation()
   * @see #isFailOnValidation()
   * @generated
   */
  void setFailOnValidation(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#isFailOnValidation <em>Fail On Validation</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetFailOnValidation()
   * @see #isFailOnValidation()
   * @see #setFailOnValidation(boolean)
   * @generated
   */
  void unsetFailOnValidation();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#isFailOnValidation <em>Fail On Validation</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Fail On Validation</em>' attribute is set.
   * @see #unsetFailOnValidation()
   * @see #isFailOnValidation()
   * @see #setFailOnValidation(boolean)
   * @generated
   */
  boolean isSetFailOnValidation();

  /**
   * Returns the value of the '<em><b>Ignore In Left Only</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ignore In Left Only</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ignore In Left Only</em>' attribute.
   * @see #isSetIgnoreInLeftOnly()
   * @see #unsetIgnoreInLeftOnly()
   * @see #setIgnoreInLeftOnly(boolean)
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffModulePackage#getXmlDiffConfiguration_IgnoreInLeftOnly()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='ignoreInLeftOnly'"
   * @generated
   */
  boolean isIgnoreInLeftOnly();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#isIgnoreInLeftOnly <em>Ignore In Left Only</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Ignore In Left Only</em>' attribute.
   * @see #isSetIgnoreInLeftOnly()
   * @see #unsetIgnoreInLeftOnly()
   * @see #isIgnoreInLeftOnly()
   * @generated
   */
  void setIgnoreInLeftOnly(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#isIgnoreInLeftOnly <em>Ignore In Left Only</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetIgnoreInLeftOnly()
   * @see #isIgnoreInLeftOnly()
   * @see #setIgnoreInLeftOnly(boolean)
   * @generated
   */
  void unsetIgnoreInLeftOnly();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#isIgnoreInLeftOnly <em>Ignore In Left Only</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Ignore In Left Only</em>' attribute is set.
   * @see #unsetIgnoreInLeftOnly()
   * @see #isIgnoreInLeftOnly()
   * @see #setIgnoreInLeftOnly(boolean)
   * @generated
   */
  boolean isSetIgnoreInLeftOnly();

  /**
   * Returns the value of the '<em><b>Ignore In Right Only</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ignore In Right Only</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ignore In Right Only</em>' attribute.
   * @see #isSetIgnoreInRightOnly()
   * @see #unsetIgnoreInRightOnly()
   * @see #setIgnoreInRightOnly(boolean)
   * @see com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffModulePackage#getXmlDiffConfiguration_IgnoreInRightOnly()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='ignoreInRightOnly'"
   * @generated
   */
  boolean isIgnoreInRightOnly();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#isIgnoreInRightOnly <em>Ignore In Right Only</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Ignore In Right Only</em>' attribute.
   * @see #isSetIgnoreInRightOnly()
   * @see #unsetIgnoreInRightOnly()
   * @see #isIgnoreInRightOnly()
   * @generated
   */
  void setIgnoreInRightOnly(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#isIgnoreInRightOnly <em>Ignore In Right Only</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetIgnoreInRightOnly()
   * @see #isIgnoreInRightOnly()
   * @see #setIgnoreInRightOnly(boolean)
   * @generated
   */
  void unsetIgnoreInRightOnly();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration#isIgnoreInRightOnly <em>Ignore In Right Only</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Ignore In Right Only</em>' attribute is set.
   * @see #unsetIgnoreInRightOnly()
   * @see #isIgnoreInRightOnly()
   * @see #setIgnoreInRightOnly(boolean)
   * @generated
   */
  boolean isSetIgnoreInRightOnly();

} // XmlDiffConfiguration
