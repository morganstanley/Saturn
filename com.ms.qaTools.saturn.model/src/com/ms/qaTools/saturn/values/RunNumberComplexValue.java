/**
 * COPYRIGHT NOTICE AND DISCLAIMER
 *  
 * Copyright © 2009, Contributor
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License, version 3 for more details.
 * You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
 * THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
 */
package com.ms.qaTools.saturn.values;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run Number Complex Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.values.RunNumberComplexValue#getPadding <em>Padding</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.RunNumberComplexValue#getPadCharacter <em>Pad Character</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.values.ValuesPackage#getRunNumberComplexValue()
 * @model extendedMetaData="name='RunNumber_._type' kind='empty'"
 * @generated
 */
public interface RunNumberComplexValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Padding</b></em>' attribute.
   * The default value is <code>"3"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Padding</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Padding</em>' attribute.
   * @see #isSetPadding()
   * @see #unsetPadding()
   * @see #setPadding(BigInteger)
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getRunNumberComplexValue_Padding()
   * @model default="3" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='padding'"
   * @generated
   */
  BigInteger getPadding();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.values.RunNumberComplexValue#getPadding <em>Padding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Padding</em>' attribute.
   * @see #isSetPadding()
   * @see #unsetPadding()
   * @see #getPadding()
   * @generated
   */
  void setPadding(BigInteger value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.values.RunNumberComplexValue#getPadding <em>Padding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetPadding()
   * @see #getPadding()
   * @see #setPadding(BigInteger)
   * @generated
   */
  void unsetPadding();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.values.RunNumberComplexValue#getPadding <em>Padding</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Padding</em>' attribute is set.
   * @see #unsetPadding()
   * @see #getPadding()
   * @see #setPadding(BigInteger)
   * @generated
   */
  boolean isSetPadding();

  /**
   * Returns the value of the '<em><b>Pad Character</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pad Character</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pad Character</em>' attribute.
   * @see #isSetPadCharacter()
   * @see #unsetPadCharacter()
   * @see #setPadCharacter(String)
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getRunNumberComplexValue_PadCharacter()
   * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='padCharacter'"
   * @generated
   */
  String getPadCharacter();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.values.RunNumberComplexValue#getPadCharacter <em>Pad Character</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pad Character</em>' attribute.
   * @see #isSetPadCharacter()
   * @see #unsetPadCharacter()
   * @see #getPadCharacter()
   * @generated
   */
  void setPadCharacter(String value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.values.RunNumberComplexValue#getPadCharacter <em>Pad Character</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetPadCharacter()
   * @see #getPadCharacter()
   * @see #setPadCharacter(String)
   * @generated
   */
  void unsetPadCharacter();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.values.RunNumberComplexValue#getPadCharacter <em>Pad Character</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Pad Character</em>' attribute is set.
   * @see #unsetPadCharacter()
   * @see #getPadCharacter()
   * @see #setPadCharacter(String)
   * @generated
   */
  boolean isSetPadCharacter();

} // RunNumberComplexValue
