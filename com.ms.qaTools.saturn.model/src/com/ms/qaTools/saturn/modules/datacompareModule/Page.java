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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Page</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.Page#getName <em>Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.Page#isOmit <em>Omit</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.Page#isSparse <em>Sparse</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getPage()
 * @model extendedMetaData="name='Page' kind='empty'"
 * @generated
 */
public interface Page extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getPage_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.Page#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Omit</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Omit</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Omit</em>' attribute.
   * @see #isSetOmit()
   * @see #unsetOmit()
   * @see #setOmit(boolean)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getPage_Omit()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='omit'"
   * @generated
   */
  boolean isOmit();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.Page#isOmit <em>Omit</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Omit</em>' attribute.
   * @see #isSetOmit()
   * @see #unsetOmit()
   * @see #isOmit()
   * @generated
   */
  void setOmit(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.Page#isOmit <em>Omit</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetOmit()
   * @see #isOmit()
   * @see #setOmit(boolean)
   * @generated
   */
  void unsetOmit();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.Page#isOmit <em>Omit</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Omit</em>' attribute is set.
   * @see #unsetOmit()
   * @see #isOmit()
   * @see #setOmit(boolean)
   * @generated
   */
  boolean isSetOmit();

  /**
   * Returns the value of the '<em><b>Sparse</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sparse</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Sparse</em>' attribute.
   * @see #isSetSparse()
   * @see #unsetSparse()
   * @see #setSparse(boolean)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getPage_Sparse()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='sparse'"
   * @generated
   */
  boolean isSparse();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.Page#isSparse <em>Sparse</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Sparse</em>' attribute.
   * @see #isSetSparse()
   * @see #unsetSparse()
   * @see #isSparse()
   * @generated
   */
  void setSparse(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.Page#isSparse <em>Sparse</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetSparse()
   * @see #isSparse()
   * @see #setSparse(boolean)
   * @generated
   */
  void unsetSparse();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.Page#isSparse <em>Sparse</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Sparse</em>' attribute is set.
   * @see #unsetSparse()
   * @see #isSparse()
   * @see #setSparse(boolean)
   * @generated
   */
  boolean isSetSparse();

} // Page
