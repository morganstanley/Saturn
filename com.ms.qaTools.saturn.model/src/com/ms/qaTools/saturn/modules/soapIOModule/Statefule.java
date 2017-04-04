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
package com.ms.qaTools.saturn.modules.soapIOModule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Statefule</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.soapIOModule.Statefule#getResult <em>Result</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.soapIOModule.Statefule#getState <em>State</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOModulePackage#getStatefule()
 * @model extendedMetaData="name='Statefule' kind='empty'"
 * @generated
 */
public interface Statefule extends EObject
{
  /**
   * Returns the value of the '<em><b>Result</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Result</em>' attribute.
   * @see #setResult(Object)
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOModulePackage#getStatefule_Result()
   * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" extendedMetaData="kind='attribute' name='Result'"
   * @generated
   */
  Object getResult();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.soapIOModule.Statefule#getResult <em>Result</em>}'
   * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Result</em>' attribute.
   * @see #getResult()
   * @generated
   */
  void setResult(Object value);

  /**
   * Returns the value of the '<em><b>State</b></em>' attribute. The default value is <code>"IDLE"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>State</em>' attribute.
   * @see #isSetState()
   * @see #unsetState()
   * @see #setState(String)
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOModulePackage#getStatefule_State()
   * @model default="IDLE" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='State'"
   * @generated
   */
  String getState();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.soapIOModule.Statefule#getState <em>State</em>}'
   * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>State</em>' attribute.
   * @see #isSetState()
   * @see #unsetState()
   * @see #getState()
   * @generated
   */
  void setState(String value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.soapIOModule.Statefule#getState <em>State</em>}'
   * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSetState()
   * @see #getState()
   * @see #setState(String)
   * @generated
   */
  void unsetState();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.soapIOModule.Statefule#getState
   * <em>State</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return whether the value of the '<em>State</em>' attribute is set.
   * @see #unsetState()
   * @see #getState()
   * @see #setState(String)
   * @generated
   */
  boolean isSetState();

} // Statefule
