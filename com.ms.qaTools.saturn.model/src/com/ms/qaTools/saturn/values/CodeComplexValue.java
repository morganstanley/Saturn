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

import com.ms.qaTools.saturn.types.InterpretersEnum;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Complex Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.values.CodeComplexValue#getInterpreter <em>Interpreter</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.values.ValuesPackage#getCodeComplexValue()
 * @model extendedMetaData="name='Code_._type' kind='mixed'"
 * @generated
 */
public interface CodeComplexValue extends FallibleComplexValue, Describable
{
  /**
   * Returns the value of the '<em><b>Interpreter</b></em>' attribute.
   * The default value is <code>"SHELL"</code>.
   * The literals are from the enumeration {@link com.ms.qaTools.saturn.types.InterpretersEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interpreter</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interpreter</em>' attribute.
   * @see com.ms.qaTools.saturn.types.InterpretersEnum
   * @see #isSetInterpreter()
   * @see #unsetInterpreter()
   * @see #setInterpreter(InterpretersEnum)
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getCodeComplexValue_Interpreter()
   * @model default="SHELL" unsettable="true"
   *        extendedMetaData="kind='attribute' name='interpreter'"
   * @generated
   */
  InterpretersEnum getInterpreter();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.values.CodeComplexValue#getInterpreter <em>Interpreter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interpreter</em>' attribute.
   * @see com.ms.qaTools.saturn.types.InterpretersEnum
   * @see #isSetInterpreter()
   * @see #unsetInterpreter()
   * @see #getInterpreter()
   * @generated
   */
  void setInterpreter(InterpretersEnum value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.values.CodeComplexValue#getInterpreter <em>Interpreter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetInterpreter()
   * @see #getInterpreter()
   * @see #setInterpreter(InterpretersEnum)
   * @generated
   */
  void unsetInterpreter();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.values.CodeComplexValue#getInterpreter <em>Interpreter</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Interpreter</em>' attribute is set.
   * @see #unsetInterpreter()
   * @see #getInterpreter()
   * @see #setInterpreter(InterpretersEnum)
   * @generated
   */
  boolean isSetInterpreter();

} // CodeComplexValue
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
