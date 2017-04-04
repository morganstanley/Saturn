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
package com.ms.qaTools.saturn.exception;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>QAT Unknown Code</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.exception.QATUnknownCode#getEnv <em>Env</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.exception.QATUnknownCode#getRaw <em>Raw</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.exception.ExceptionPackage#getQATUnknownCode()
 * @model annotation="http://www.ms.com/2006/pdsttools/xsd2perl package='QAT::Exception::UnknownCode'"
 *        extendedMetaData="name='QAT_UnknownCode' kind='elementOnly'"
 * @generated
 */
public interface QATUnknownCode extends TraceableException
{
  /**
   * Returns the value of the '<em><b>Env</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Env</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Env</em>' attribute.
   * @see #setEnv(String)
   * @see com.ms.qaTools.saturn.exception.ExceptionPackage#getQATUnknownCode_Env()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='Env' namespace='##targetNamespace'"
   * @generated
   */
  String getEnv();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.exception.QATUnknownCode#getEnv <em>Env</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Env</em>' attribute.
   * @see #getEnv()
   * @generated
   */
  void setEnv(String value);

  /**
   * Returns the value of the '<em><b>Raw</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Raw</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Raw</em>' attribute.
   * @see #setRaw(String)
   * @see com.ms.qaTools.saturn.exception.ExceptionPackage#getQATUnknownCode_Raw()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='Raw' namespace='##targetNamespace'"
   * @generated
   */
  String getRaw();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.exception.QATUnknownCode#getRaw <em>Raw</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Raw</em>' attribute.
   * @see #getRaw()
   * @generated
   */
  void setRaw(String value);

} // QATUnknownCode
