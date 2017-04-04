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
package com.ms.qaTools.saturn.repetition;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>For Repetition Iterator</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.repetition.ForRepetitionIterator#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.repetition.ForRepetitionIterator#getStartIndex <em>Start Index</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.repetition.ForRepetitionIterator#getEndIndex <em>End Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.repetition.RepetitionPackage#getForRepetitionIterator()
 * @model annotation="http://www.ms.com/2006/pdsttools/xsd2perl package='Saturn::RepetitionHandler::ForRepetition::Iterator'"
 *        extendedMetaData="name='Iterators_._type' kind='empty'"
 * @generated
 */
public interface ForRepetitionIterator extends EObject
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' attribute.
   * @see #setAttribute(String)
   * @see com.ms.qaTools.saturn.repetition.RepetitionPackage#getForRepetitionIterator_Attribute()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2report colNum='1'"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib order='1'"
   *        extendedMetaData="kind='attribute' name='attribute'"
   * @generated
   */
  String getAttribute();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.repetition.ForRepetitionIterator#getAttribute <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' attribute.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(String value);

  /**
   * Returns the value of the '<em><b>End Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Index</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Index</em>' attribute.
   * @see #setEndIndex(BigInteger)
   * @see com.ms.qaTools.saturn.repetition.RepetitionPackage#getForRepetitionIterator_EndIndex()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2report colNum='3'"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib accessor='to' order='3'"
   *        extendedMetaData="kind='attribute' name='endIndex'"
   * @generated
   */
  BigInteger getEndIndex();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.repetition.ForRepetitionIterator#getEndIndex <em>End Index</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>End Index</em>' attribute.
   * @see #getEndIndex()
   * @generated
   */
  void setEndIndex(BigInteger value);

  /**
   * Returns the value of the '<em><b>Start Index</b></em>' attribute. The default value is <code>"0"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start Index</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Start Index</em>' attribute.
   * @see #isSetStartIndex()
   * @see #unsetStartIndex()
   * @see #setStartIndex(BigInteger)
   * @see com.ms.qaTools.saturn.repetition.RepetitionPackage#getForRepetitionIterator_StartIndex()
   * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2report colNum='2'"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib accessor='from' order='2'"
   *        extendedMetaData="kind='attribute' name='startIndex'"
   * @generated
   */
  BigInteger getStartIndex();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.repetition.ForRepetitionIterator#getStartIndex <em>Start Index</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Start Index</em>' attribute.
   * @see #isSetStartIndex()
   * @see #unsetStartIndex()
   * @see #getStartIndex()
   * @generated
   */
  void setStartIndex(BigInteger value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.repetition.ForRepetitionIterator#getStartIndex <em>Start Index</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetStartIndex()
   * @see #getStartIndex()
   * @see #setStartIndex(BigInteger)
   * @generated
   */
  void unsetStartIndex();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.repetition.ForRepetitionIterator#getStartIndex <em>Start Index</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Start Index</em>' attribute is set.
   * @see #unsetStartIndex()
   * @see #getStartIndex()
   * @see #setStartIndex(BigInteger)
   * @generated
   */
  boolean isSetStartIndex();

} // ForRepetitionIterator
