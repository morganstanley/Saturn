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
package com.ms.qaTools.saturn.modules.XSplitModule;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>XSplit Configuration</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration#getXMLFile <em>XML File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration#getOutputDirectory <em>Output Directory</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration#getXPaths <em>XPaths</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration#getConfigFile <em>Config File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration#isClearOutputDirectory <em>Clear Output Directory</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration#isGzip <em>Gzip</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.XSplitModule.XSplitModulePackage#getXSplitConfiguration()
 * @model extendedMetaData="name='Configuration_._type' kind='elementOnly'"
 * @generated
 */
public interface XSplitConfiguration extends EObject
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
   * @see com.ms.qaTools.saturn.modules.XSplitModule.XSplitModulePackage#getXSplitConfiguration_XMLFile()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='XMLFile' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getXMLFile();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration#getXMLFile <em>XML File</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>XML File</em>' containment reference.
   * @see #getXMLFile()
   * @generated
   */
  void setXMLFile(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Output Directory</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Directory</em>' containment reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Directory</em>' containment reference.
   * @see #setOutputDirectory(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.XSplitModule.XSplitModulePackage#getXSplitConfiguration_OutputDirectory()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='OutputDirectory' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getOutputDirectory();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration#getOutputDirectory <em>Output Directory</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Output Directory</em>' containment reference.
   * @see #getOutputDirectory()
   * @generated
   */
  void setOutputDirectory(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>XPaths</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.modules.XSplitModule.XPath}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>XPaths</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>XPaths</em>' containment reference list.
   * @see com.ms.qaTools.saturn.modules.XSplitModule.XSplitModulePackage#getXSplitConfiguration_XPaths()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='XPaths' namespace='##targetNamespace'"
   * @generated
   */
  EList<XPath> getXPaths();

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
   * @see com.ms.qaTools.saturn.modules.XSplitModule.XSplitModulePackage#getXSplitConfiguration_ConfigFile()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='ConfigFile' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getConfigFile();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration#getConfigFile <em>Config File</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Config File</em>' containment reference.
   * @see #getConfigFile()
   * @generated
   */
  void setConfigFile(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Clear Output Directory</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clear Output Directory</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clear Output Directory</em>' attribute.
   * @see #isSetClearOutputDirectory()
   * @see #unsetClearOutputDirectory()
   * @see #setClearOutputDirectory(boolean)
   * @see com.ms.qaTools.saturn.modules.XSplitModule.XSplitModulePackage#getXSplitConfiguration_ClearOutputDirectory()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='clearOutputDirectory'"
   * @generated
   */
  boolean isClearOutputDirectory();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration#isClearOutputDirectory <em>Clear Output Directory</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Clear Output Directory</em>' attribute.
   * @see #isSetClearOutputDirectory()
   * @see #unsetClearOutputDirectory()
   * @see #isClearOutputDirectory()
   * @generated
   */
  void setClearOutputDirectory(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration#isClearOutputDirectory <em>Clear Output Directory</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetClearOutputDirectory()
   * @see #isClearOutputDirectory()
   * @see #setClearOutputDirectory(boolean)
   * @generated
   */
  void unsetClearOutputDirectory();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration#isClearOutputDirectory <em>Clear Output Directory</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Clear Output Directory</em>' attribute is set.
   * @see #unsetClearOutputDirectory()
   * @see #isClearOutputDirectory()
   * @see #setClearOutputDirectory(boolean)
   * @generated
   */
  boolean isSetClearOutputDirectory();

  /**
   * Returns the value of the '<em><b>Gzip</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gzip</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Gzip</em>' attribute.
   * @see #isSetGzip()
   * @see #unsetGzip()
   * @see #setGzip(boolean)
   * @see com.ms.qaTools.saturn.modules.XSplitModule.XSplitModulePackage#getXSplitConfiguration_Gzip()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='gzip'"
   * @generated
   */
  boolean isGzip();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration#isGzip <em>Gzip</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Gzip</em>' attribute.
   * @see #isSetGzip()
   * @see #unsetGzip()
   * @see #isGzip()
   * @generated
   */
  void setGzip(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration#isGzip <em>Gzip</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetGzip()
   * @see #isGzip()
   * @see #setGzip(boolean)
   * @generated
   */
  void unsetGzip();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration#isGzip <em>Gzip</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Gzip</em>' attribute is set.
   * @see #unsetGzip()
   * @see #isGzip()
   * @see #setGzip(boolean)
   * @generated
   */
  boolean isSetGzip();

} // XSplitConfiguration
