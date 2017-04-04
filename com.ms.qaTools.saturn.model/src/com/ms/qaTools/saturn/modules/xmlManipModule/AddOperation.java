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
package com.ms.qaTools.saturn.modules.xmlManipModule;

import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Add Operation</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#getParentNodeName <em>Parent Node Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#getUri <em>Uri</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#getValue <em>Value</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#isIsAttribute <em>Is Attribute</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#isIsXml <em>Is Xml</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#isIsCData <em>Is CData</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage#getAddOperation()
 * @model extendedMetaData="name='AddOperation' kind='elementOnly'"
 * @generated
 */
public interface AddOperation extends AbstractOperation
{
  /**
   * Returns the value of the '<em><b>Parent Node Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent Node Name</em>' containment reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent Node Name</em>' containment reference.
   * @see #setParentNodeName(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage#getAddOperation_ParentNodeName()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='ParentNodeName' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getParentNodeName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#getParentNodeName <em>Parent Node Name</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent Node Name</em>' containment reference.
   * @see #getParentNodeName()
   * @generated
   */
  void setParentNodeName(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Node Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node Name</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Name</em>' containment reference.
   * @see #setNodeName(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage#getAddOperation_NodeName()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='NodeName' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getNodeName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#getNodeName <em>Node Name</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Node Name</em>' containment reference.
   * @see #getNodeName()
   * @generated
   */
  void setNodeName(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Uri</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uri</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uri</em>' containment reference.
   * @see #setUri(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage#getAddOperation_Uri()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Uri' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getUri();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#getUri <em>Uri</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Uri</em>' containment reference.
   * @see #getUri()
   * @generated
   */
  void setUri(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage#getAddOperation_Value()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getValue();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Is Attribute</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Attribute</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Is Attribute</em>' attribute.
   * @see #isSetIsAttribute()
   * @see #unsetIsAttribute()
   * @see #setIsAttribute(boolean)
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage#getAddOperation_IsAttribute()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='isAttribute'"
   * @generated
   */
  boolean isIsAttribute();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#isIsAttribute <em>Is Attribute</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Attribute</em>' attribute.
   * @see #isSetIsAttribute()
   * @see #unsetIsAttribute()
   * @see #isIsAttribute()
   * @generated
   */
  void setIsAttribute(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#isIsAttribute <em>Is Attribute</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetIsAttribute()
   * @see #isIsAttribute()
   * @see #setIsAttribute(boolean)
   * @generated
   */
  void unsetIsAttribute();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#isIsAttribute <em>Is Attribute</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Is Attribute</em>' attribute is set.
   * @see #unsetIsAttribute()
   * @see #isIsAttribute()
   * @see #setIsAttribute(boolean)
   * @generated
   */
  boolean isSetIsAttribute();

  /**
   * Returns the value of the '<em><b>Is CData</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is CData</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Is CData</em>' attribute.
   * @see #isSetIsCData()
   * @see #unsetIsCData()
   * @see #setIsCData(boolean)
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage#getAddOperation_IsCData()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='isCData'"
   * @generated
   */
  boolean isIsCData();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#isIsCData <em>Is CData</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Is CData</em>' attribute.
   * @see #isSetIsCData()
   * @see #unsetIsCData()
   * @see #isIsCData()
   * @generated
   */
  void setIsCData(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#isIsCData <em>Is CData</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetIsCData()
   * @see #isIsCData()
   * @see #setIsCData(boolean)
   * @generated
   */
  void unsetIsCData();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#isIsCData <em>Is CData</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Is CData</em>' attribute is set.
   * @see #unsetIsCData()
   * @see #isIsCData()
   * @see #setIsCData(boolean)
   * @generated
   */
  boolean isSetIsCData();

  /**
   * Returns the value of the '<em><b>Is Xml</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Xml</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Is Xml</em>' attribute.
   * @see #isSetIsXml()
   * @see #unsetIsXml()
   * @see #setIsXml(boolean)
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage#getAddOperation_IsXml()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='isXml'"
   * @generated
   */
  boolean isIsXml();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#isIsXml <em>Is Xml</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Xml</em>' attribute.
   * @see #isSetIsXml()
   * @see #unsetIsXml()
   * @see #isIsXml()
   * @generated
   */
  void setIsXml(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#isIsXml <em>Is Xml</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetIsXml()
   * @see #isIsXml()
   * @see #setIsXml(boolean)
   * @generated
   */
  void unsetIsXml();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#isIsXml <em>Is Xml</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Is Xml</em>' attribute is set.
   * @see #unsetIsXml()
   * @see #isIsXml()
   * @see #setIsXml(boolean)
   * @generated
   */
  boolean isSetIsXml();

} // AddOperation
