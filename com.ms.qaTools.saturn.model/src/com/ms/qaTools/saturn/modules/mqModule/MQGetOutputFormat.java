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
package com.ms.qaTools.saturn.modules.mqModule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>MQ Get Output Format</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOutputFormat#isNoCps <em>No Cps</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOutputFormat#isNoCrLf <em>No Cr Lf</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOutputFormat#isOneLine <em>One Line</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQGetOutputFormat()
 * @model extendedMetaData="name='OutputFormat_._type' kind='empty'"
 * @generated
 */
public interface MQGetOutputFormat extends EObject
{
  /**
   * Returns the value of the '<em><b>No Cps</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>No Cps</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>No Cps</em>' attribute.
   * @see #isSetNoCps()
   * @see #unsetNoCps()
   * @see #setNoCps(boolean)
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQGetOutputFormat_NoCps()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='noCps'"
   * @generated
   */
  boolean isNoCps();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOutputFormat#isNoCps <em>No Cps</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>No Cps</em>' attribute.
   * @see #isSetNoCps()
   * @see #unsetNoCps()
   * @see #isNoCps()
   * @generated
   */
  void setNoCps(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOutputFormat#isNoCps <em>No Cps</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetNoCps()
   * @see #isNoCps()
   * @see #setNoCps(boolean)
   * @generated
   */
  void unsetNoCps();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOutputFormat#isNoCps <em>No Cps</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>No Cps</em>' attribute is set.
   * @see #unsetNoCps()
   * @see #isNoCps()
   * @see #setNoCps(boolean)
   * @generated
   */
  boolean isSetNoCps();

  /**
   * Returns the value of the '<em><b>No Cr Lf</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>No Cr Lf</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>No Cr Lf</em>' attribute.
   * @see #isSetNoCrLf()
   * @see #unsetNoCrLf()
   * @see #setNoCrLf(boolean)
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQGetOutputFormat_NoCrLf()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='noCrLf'"
   * @generated
   */
  boolean isNoCrLf();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOutputFormat#isNoCrLf <em>No Cr Lf</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>No Cr Lf</em>' attribute.
   * @see #isSetNoCrLf()
   * @see #unsetNoCrLf()
   * @see #isNoCrLf()
   * @generated
   */
  void setNoCrLf(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOutputFormat#isNoCrLf <em>No Cr Lf</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetNoCrLf()
   * @see #isNoCrLf()
   * @see #setNoCrLf(boolean)
   * @generated
   */
  void unsetNoCrLf();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOutputFormat#isNoCrLf <em>No Cr Lf</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>No Cr Lf</em>' attribute is set.
   * @see #unsetNoCrLf()
   * @see #isNoCrLf()
   * @see #setNoCrLf(boolean)
   * @generated
   */
  boolean isSetNoCrLf();

  /**
   * Returns the value of the '<em><b>One Line</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>One Line</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>One Line</em>' attribute.
   * @see #isSetOneLine()
   * @see #unsetOneLine()
   * @see #setOneLine(boolean)
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQGetOutputFormat_OneLine()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='oneLine'"
   * @generated
   */
  boolean isOneLine();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOutputFormat#isOneLine <em>One Line</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>One Line</em>' attribute.
   * @see #isSetOneLine()
   * @see #unsetOneLine()
   * @see #isOneLine()
   * @generated
   */
  void setOneLine(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOutputFormat#isOneLine <em>One Line</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetOneLine()
   * @see #isOneLine()
   * @see #setOneLine(boolean)
   * @generated
   */
  void unsetOneLine();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOutputFormat#isOneLine <em>One Line</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>One Line</em>' attribute is set.
   * @see #unsetOneLine()
   * @see #isOneLine()
   * @see #setOneLine(boolean)
   * @generated
   */
  boolean isSetOneLine();

} // MQGetOutputFormat
