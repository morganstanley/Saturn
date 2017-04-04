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
package com.ms.qaTools.saturn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Run Group Import</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.RunGroupImport#isAttributes <em>Attributes</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.RunGroupImport#isEnabled <em>Enabled</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.RunGroupImport#getIncludeFile <em>Include File</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.RunGroupImport#isResources <em>Resources</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.RunGroupImport#getRunGroup <em>Run Group</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.SaturnPackage#getRunGroupImport()
 * @model annotation="http://www.ms.com/2006/pdsttools/xsd2perl package='Saturn::Script::RunGroupImport'"
 *        extendedMetaData="name='Imports_._type' kind='empty'"
 * @generated
 */
public interface RunGroupImport extends EObject
{
  /**
   * Returns the value of the '<em><b>Attributes</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Attributes</em>' attribute.
   * @see #isSetAttributes()
   * @see #unsetAttributes()
   * @see #setAttributes(boolean)
   * @see com.ms.qaTools.saturn.SaturnPackage#getRunGroupImport_Attributes()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='attributes'"
   * @generated
   */
  boolean isAttributes();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.RunGroupImport#isAttributes <em>Attributes</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Attributes</em>' attribute.
   * @see #isSetAttributes()
   * @see #unsetAttributes()
   * @see #isAttributes()
   * @generated
   */
  void setAttributes(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.RunGroupImport#isAttributes <em>Attributes</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAttributes()
   * @see #isAttributes()
   * @see #setAttributes(boolean)
   * @generated
   */
  void unsetAttributes();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.RunGroupImport#isAttributes <em>Attributes</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Attributes</em>' attribute is set.
   * @see #unsetAttributes()
   * @see #isAttributes()
   * @see #setAttributes(boolean)
   * @generated
   */
  boolean isSetAttributes();

  /**
   * Returns the value of the '<em><b>Enabled</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enabled</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Enabled</em>' attribute.
   * @see #isSetEnabled()
   * @see #unsetEnabled()
   * @see #setEnabled(boolean)
   * @see com.ms.qaTools.saturn.SaturnPackage#getRunGroupImport_Enabled()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='enabled'"
   * @generated
   */
  boolean isEnabled();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.RunGroupImport#isEnabled <em>Enabled</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Enabled</em>' attribute.
   * @see #isSetEnabled()
   * @see #unsetEnabled()
   * @see #isEnabled()
   * @generated
   */
  void setEnabled(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.RunGroupImport#isEnabled <em>Enabled</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSetEnabled()
   * @see #isEnabled()
   * @see #setEnabled(boolean)
   * @generated
   */
  void unsetEnabled();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.RunGroupImport#isEnabled <em>Enabled</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Enabled</em>' attribute is set.
   * @see #unsetEnabled()
   * @see #isEnabled()
   * @see #setEnabled(boolean)
   * @generated
   */
  boolean isSetEnabled();

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
   * @see com.ms.qaTools.saturn.SaturnPackage#getRunGroupImport_IncludeFile()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
   *        extendedMetaData="kind='attribute' name='includeFile'"
   * @generated
   */
  String getIncludeFile();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.RunGroupImport#getIncludeFile <em>Include File</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Include File</em>' attribute.
   * @see #getIncludeFile()
   * @generated
   */
  void setIncludeFile(String value);

  /**
   * Returns the value of the '<em><b>Resources</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resources</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Resources</em>' attribute.
   * @see #isSetResources()
   * @see #unsetResources()
   * @see #setResources(boolean)
   * @see com.ms.qaTools.saturn.SaturnPackage#getRunGroupImport_Resources()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='resources'"
   * @generated
   */
  boolean isResources();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.RunGroupImport#isResources <em>Resources</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Resources</em>' attribute.
   * @see #isSetResources()
   * @see #unsetResources()
   * @see #isResources()
   * @generated
   */
  void setResources(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.RunGroupImport#isResources <em>Resources</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetResources()
   * @see #isResources()
   * @see #setResources(boolean)
   * @generated
   */
  void unsetResources();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.RunGroupImport#isResources <em>Resources</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Resources</em>' attribute is set.
   * @see #unsetResources()
   * @see #isResources()
   * @see #setResources(boolean)
   * @generated
   */
  boolean isSetResources();

  /**
   * Returns the value of the '<em><b>Run Group</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Run Group</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Run Group</em>' attribute.
   * @see #setRunGroup(String)
   * @see com.ms.qaTools.saturn.SaturnPackage#getRunGroupImport_RunGroup()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
   *        extendedMetaData="kind='attribute' name='runGroup'"
   * @generated
   */
  String getRunGroup();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.RunGroupImport#getRunGroup <em>Run Group</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Run Group</em>' attribute.
   * @see #getRunGroup()
   * @generated
   */
  void setRunGroup(String value);

} // RunGroupImport
