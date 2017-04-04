package com.ms.qaTools.saturn.modules.xmlGenModule;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Xml Gen Configuration</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration#getTemplateFile <em>Template File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration#getOutputResource <em>Output Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration#getDataSets <em>Data Sets</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration#getXmlFormat <em>Xml Format</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration#isLegacyMode <em>Legacy Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenModulePackage#getXmlGenConfiguration()
 * @model annotation="http://www.ms.com/2006/pdsttools/xsd2perl basePackage='true' executable='Saturn::Module::XMLGen::Executable' isa='Saturn::Script::AbstractStep'"
 *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib name='xmlGen'"
 *        extendedMetaData="name='Configuration_._type' kind='elementOnly'"
 * @generated
 */
public interface XmlGenConfiguration extends EObject
{
  /**
   * Returns the value of the '<em><b>Template File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template File</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template File</em>' containment reference.
   * @see #setTemplateFile(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenModulePackage#getXmlGenConfiguration_TemplateFile()
   * @model containment="true"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib accessor='template' map='xmlFile'"
   *        extendedMetaData="kind='element' name='TemplateFile' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getTemplateFile();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration#getTemplateFile <em>Template File</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Template File</em>' containment reference.
   * @see #getTemplateFile()
   * @generated
   */
  void setTemplateFile(ResourceDefinition value);

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
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenModulePackage#getXmlGenConfiguration_OutputResource()
   * @model containment="true"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib accessor='output' map='xmlFile'"
   *        extendedMetaData="kind='element' name='OutputResource' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getOutputResource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration#getOutputResource <em>Output Resource</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Output Resource</em>' containment reference.
   * @see #getOutputResource()
   * @generated
   */
  void setOutputResource(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Data Sets</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.modules.xmlGenModule.DataSet}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Sets</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Sets</em>' containment reference list.
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenModulePackage#getXmlGenConfiguration_DataSets()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='DataSets' namespace='##targetNamespace'"
   * @generated
   */
  EList<DataSet> getDataSets();

  /**
   * Returns the value of the '<em><b>Legacy Mode</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Legacy Mode</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Legacy Mode</em>' attribute.
   * @see #isSetLegacyMode()
   * @see #unsetLegacyMode()
   * @see #setLegacyMode(boolean)
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenModulePackage#getXmlGenConfiguration_LegacyMode()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        annotation="http://www.ms.com/2006/pdsttools/xsd2perl accessor='legacyMode'"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2report colNum='1'"
   *        extendedMetaData="kind='attribute' name='legacyMode'"
   * @generated
   */
  boolean isLegacyMode();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration#isLegacyMode <em>Legacy Mode</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Legacy Mode</em>' attribute.
   * @see #isSetLegacyMode()
   * @see #unsetLegacyMode()
   * @see #isLegacyMode()
   * @generated
   */
  void setLegacyMode(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration#isLegacyMode <em>Legacy Mode</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetLegacyMode()
   * @see #isLegacyMode()
   * @see #setLegacyMode(boolean)
   * @generated
   */
  void unsetLegacyMode();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration#isLegacyMode <em>Legacy Mode</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Legacy Mode</em>' attribute is set.
   * @see #unsetLegacyMode()
   * @see #isLegacyMode()
   * @see #setLegacyMode(boolean)
   * @generated
   */
  boolean isSetLegacyMode();

  /**
   * Returns the value of the '<em><b>Xml Format</b></em>' attribute. The default value is <code>"ORIGINAL"</code>. The
   * literals are from the enumeration {@link com.ms.qaTools.saturn.modules.xmlGenModule.XmlFormatEnums}. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Xml Format</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Xml Format</em>' attribute.
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.XmlFormatEnums
   * @see #isSetXmlFormat()
   * @see #unsetXmlFormat()
   * @see #setXmlFormat(XmlFormatEnums)
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenModulePackage#getXmlGenConfiguration_XmlFormat()
   * @model default="ORIGINAL" unsettable="true" extendedMetaData="kind='attribute' name='xmlFormat'"
   * @generated
   */
  XmlFormatEnums getXmlFormat();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration#getXmlFormat <em>Xml Format</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Xml Format</em>' attribute.
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.XmlFormatEnums
   * @see #isSetXmlFormat()
   * @see #unsetXmlFormat()
   * @see #getXmlFormat()
   * @generated
   */
  void setXmlFormat(XmlFormatEnums value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration#getXmlFormat <em>Xml Format</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetXmlFormat()
   * @see #getXmlFormat()
   * @see #setXmlFormat(XmlFormatEnums)
   * @generated
   */
  void unsetXmlFormat();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration#getXmlFormat <em>Xml Format</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Xml Format</em>' attribute is set.
   * @see #unsetXmlFormat()
   * @see #getXmlFormat()
   * @see #setXmlFormat(XmlFormatEnums)
   * @generated
   */
  boolean isSetXmlFormat();

} // XmlGenConfiguration
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
