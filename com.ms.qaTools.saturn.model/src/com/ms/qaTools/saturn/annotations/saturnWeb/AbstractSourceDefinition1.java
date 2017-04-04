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
package com.ms.qaTools.saturn.annotations.saturnWeb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Abstract Source Definition1</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.annotations.saturnWeb.AbstractSourceDefinition1#getCaption <em>Caption</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.annotations.saturnWeb.AbstractSourceDefinition1#getDescription <em>Description</em>}
 * </li>
 * <li>{@link com.ms.qaTools.saturn.annotations.saturnWeb.AbstractSourceDefinition1#getBoundControl <em>Bound Control
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage#getAbstractSourceDefinition1()
 * @model extendedMetaData="name='AbstractSourceDefinition' kind='elementOnly'"
 * @generated
 */
public interface AbstractSourceDefinition1 extends EObject
{
  /**
   * Returns the value of the '<em><b>Caption</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Caption</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Caption</em>' attribute.
   * @see #setCaption(String)
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage#getAbstractSourceDefinition1_Caption()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='Caption' namespace='##targetNamespace'"
   * @generated
   */
  String getCaption();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.AbstractSourceDefinition1#getCaption
   * <em>Caption</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Caption</em>' attribute.
   * @see #getCaption()
   * @generated
   */
  void setCaption(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage#getAbstractSourceDefinition1_Description()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.AbstractSourceDefinition1#getDescription
   * <em>Description</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Bound Control</b></em>' containment reference. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bound Control</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Bound Control</em>' containment reference.
   * @see #setBoundControl(AbstractSourceDefinition)
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage#getAbstractSourceDefinition1_BoundControl()
   * @model containment="true" extendedMetaData="kind='element' name='BoundControl' namespace='##targetNamespace'"
   * @generated
   */
  AbstractSourceDefinition getBoundControl();

  /**
   * Sets the value of the '
   * {@link com.ms.qaTools.saturn.annotations.saturnWeb.AbstractSourceDefinition1#getBoundControl
   * <em>Bound Control</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Bound Control</em>' containment reference.
   * @see #getBoundControl()
   * @generated
   */
  void setBoundControl(AbstractSourceDefinition value);

} // AbstractSourceDefinition1
