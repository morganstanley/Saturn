package com.ms.qaTools.saturn.resources.referenceResource;

import com.ms.qaTools.saturn.AbstractResourceLink;
import com.ms.qaTools.saturn.types.DeviceResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Reference Resource</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#getIncludeFileAdv <em>Include File Adv
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#getResourceAdv <em>Resource Adv</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#isAdvanced <em>Advanced</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#getIncludeFile <em>Include File</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.resources.referenceResource.ReferenceResourcePackage#getReferenceResource()
 * @model annotation="http://www.ms.com/2006/pdsttools/xsd2perl package='Saturn::Resource::Reference'" annotation=
 *        "http://www.ms.com/2011/pdsttools/xsd2scriptLib name='reference' referenceTo='Saturn::Script::Types::ResourceDefinition'"
 *        extendedMetaData="name='ReferenceResource' kind='elementOnly'"
 * @generated
 */
public interface ReferenceResource extends DeviceResourceDefinition
{
  /**
   * Returns the value of the '<em><b>Include File Adv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Include File Adv</em>' containment reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Include File Adv</em>' containment reference.
   * @see #setIncludeFileAdv(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.referenceResource.ReferenceResourcePackage#getReferenceResource_IncludeFileAdv()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='IncludeFile' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getIncludeFileAdv();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#getIncludeFileAdv <em>Include File Adv</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Include File Adv</em>' containment reference.
   * @see #getIncludeFileAdv()
   * @generated
   */
  void setIncludeFileAdv(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Resource Adv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource Adv</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource Adv</em>' containment reference.
   * @see #setResourceAdv(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.referenceResource.ReferenceResourcePackage#getReferenceResource_ResourceAdv()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Resource' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getResourceAdv();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#getResourceAdv <em>Resource Adv</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource Adv</em>' containment reference.
   * @see #getResourceAdv()
   * @generated
   */
  void setResourceAdv(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Advanced</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Advanced</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Advanced</em>' attribute.
   * @see #isSetAdvanced()
   * @see #unsetAdvanced()
   * @see #setAdvanced(boolean)
   * @see com.ms.qaTools.saturn.resources.referenceResource.ReferenceResourcePackage#getReferenceResource_Advanced()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='advanced'"
   * @generated
   */
  boolean isAdvanced();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#isAdvanced <em>Advanced</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Advanced</em>' attribute.
   * @see #isSetAdvanced()
   * @see #unsetAdvanced()
   * @see #isAdvanced()
   * @generated
   */
  void setAdvanced(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#isAdvanced <em>Advanced</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAdvanced()
   * @see #isAdvanced()
   * @see #setAdvanced(boolean)
   * @generated
   */
  void unsetAdvanced();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#isAdvanced <em>Advanced</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Advanced</em>' attribute is set.
   * @see #unsetAdvanced()
   * @see #isAdvanced()
   * @see #setAdvanced(boolean)
   * @generated
   */
  boolean isSetAdvanced();

  /**
   * Returns the value of the '<em><b>Clone</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clone</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Clone</em>' attribute.
   * @see #isSetClone()
   * @see #unsetClone()
   * @see #setClone(boolean)
   * @see com.ms.qaTools.saturn.resources.referenceResource.ReferenceResourcePackage#getReferenceResource_Clone()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='clone'"
   * @generated
   */
  boolean isClone();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#isClone <em>Clone</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Clone</em>' attribute.
   * @see #isSetClone()
   * @see #unsetClone()
   * @see #isClone()
   * @generated
   */
  void setClone(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#isClone <em>Clone</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetClone()
   * @see #isClone()
   * @see #setClone(boolean)
   * @generated
   */
  void unsetClone();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#isClone <em>Clone</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Clone</em>' attribute is set.
   * @see #unsetClone()
   * @see #isClone()
   * @see #setClone(boolean)
   * @generated
   */
  boolean isSetClone();

  /**
   * Returns the value of the '<em><b>Include File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Include File</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Include File</em>' attribute.
   * @see #setIncludeFile(String)
   * @see com.ms.qaTools.saturn.resources.referenceResource.ReferenceResourcePackage#getReferenceResource_IncludeFile()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
   *        extendedMetaData="kind='attribute' name='includeFile'"
   * @generated
   */
  String getIncludeFile();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#getIncludeFile <em>Include File</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Include File</em>' attribute.
   * @see #getIncludeFile()
   * @generated
   */
  void setIncludeFile(String value);

  /**
   * Returns the value of the '<em><b>Link</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Link</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link</em>' reference.
   * @see #setLink(AbstractResourceLink)
   * @see com.ms.qaTools.saturn.resources.referenceResource.ReferenceResourcePackage#getReferenceResource_Link()
   * @model transient="true"
   *        extendedMetaData="kind='attribute' name='Link'"
   * @generated
   */
  AbstractResourceLink getLink();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#getLink <em>Link</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Link</em>' reference.
   * @see #getLink()
   * @generated
   */
  void setLink(AbstractResourceLink value);

  /**
   * Returns the value of the '<em><b>Resource</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource</em>' attribute.
   * @see #setResource(String)
   * @see com.ms.qaTools.saturn.resources.referenceResource.ReferenceResourcePackage#getReferenceResource_Resource()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
   *        extendedMetaData="kind='attribute' name='resource'"
   * @generated
   */
  String getResource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#getResource <em>Resource</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource</em>' attribute.
   * @see #getResource()
   * @generated
   */
  void setResource(String value);

} // ReferenceResource
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
