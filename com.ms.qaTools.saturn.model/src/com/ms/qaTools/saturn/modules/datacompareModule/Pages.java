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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Pages</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.Pages#getSummary <em>Summary</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.Pages#getDifferent <em>Different</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.Pages#getExplained <em>Explained</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.Pages#getInLeftOnly <em>In Left Only</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.Pages#getInRightOnly <em>In Right Only</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.Pages#getIdentical <em>Identical</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.Pages#getLeft <em>Left</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.Pages#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getPages()
 * @model extendedMetaData="name='Pages_._type' kind='elementOnly'"
 * @generated
 */
public interface Pages extends EObject
{
  /**
   * Returns the value of the '<em><b>Summary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Summary</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Summary</em>' containment reference.
   * @see #setSummary(Page)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getPages_Summary()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Summary' namespace='##targetNamespace'"
   * @generated
   */
  Page getSummary();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.Pages#getSummary <em>Summary</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Summary</em>' containment reference.
   * @see #getSummary()
   * @generated
   */
  void setSummary(Page value);

  /**
   * Returns the value of the '<em><b>Different</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Different</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Different</em>' containment reference.
   * @see #setDifferent(Page)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getPages_Different()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Different' namespace='##targetNamespace'"
   * @generated
   */
  Page getDifferent();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.Pages#getDifferent <em>Different</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Different</em>' containment reference.
   * @see #getDifferent()
   * @generated
   */
  void setDifferent(Page value);

  /**
   * Returns the value of the '<em><b>Explained</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Explained</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Explained</em>' containment reference.
   * @see #setExplained(Page)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getPages_Explained()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Explained' namespace='##targetNamespace'"
   * @generated
   */
  Page getExplained();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.Pages#getExplained <em>Explained</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Explained</em>' containment reference.
   * @see #getExplained()
   * @generated
   */
  void setExplained(Page value);

  /**
   * Returns the value of the '<em><b>In Left Only</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In Left Only</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Left Only</em>' containment reference.
   * @see #setInLeftOnly(Page)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getPages_InLeftOnly()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='InLeftOnly' namespace='##targetNamespace'"
   * @generated
   */
  Page getInLeftOnly();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.Pages#getInLeftOnly <em>In Left Only</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>In Left Only</em>' containment reference.
   * @see #getInLeftOnly()
   * @generated
   */
  void setInLeftOnly(Page value);

  /**
   * Returns the value of the '<em><b>In Right Only</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In Right Only</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Right Only</em>' containment reference.
   * @see #setInRightOnly(Page)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getPages_InRightOnly()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='InRightOnly' namespace='##targetNamespace'"
   * @generated
   */
  Page getInRightOnly();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.Pages#getInRightOnly <em>In Right Only</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>In Right Only</em>' containment reference.
   * @see #getInRightOnly()
   * @generated
   */
  void setInRightOnly(Page value);

  /**
   * Returns the value of the '<em><b>Identical</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identical</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identical</em>' containment reference.
   * @see #setIdentical(Page)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getPages_Identical()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Identical' namespace='##targetNamespace'"
   * @generated
   */
  Page getIdentical();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.Pages#getIdentical <em>Identical</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Identical</em>' containment reference.
   * @see #getIdentical()
   * @generated
   */
  void setIdentical(Page value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Page)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getPages_Left()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Left' namespace='##targetNamespace'"
   * @generated
   */
  Page getLeft();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.Pages#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Page value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Page)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getPages_Right()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Right' namespace='##targetNamespace'"
   * @generated
   */
  Page getRight();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.Pages#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Page value);

} // Pages
