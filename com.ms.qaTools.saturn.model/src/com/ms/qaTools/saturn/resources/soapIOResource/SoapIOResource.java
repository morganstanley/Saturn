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
package com.ms.qaTools.saturn.resources.soapIOResource;

import com.ms.qaTools.saturn.types.DeviceResourceDefinition;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Soap IO Resource</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResource#getTimeOut <em>Time Out</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResource#getTransport <em>Transport</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getSoapIOResource()
 * @model annotation="http://www.ms.com/2006/pdsttools/xsd2perl package='Saturn::Resource::Soap'"
 *        extendedMetaData="name='SoapIOResource' kind='elementOnly'"
 * @generated
 */
public interface SoapIOResource extends DeviceResourceDefinition
{
  /**
   * Returns the value of the '<em><b>Time Out</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time Out</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time Out</em>' containment reference.
   * @see #setTimeOut(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getSoapIOResource_TimeOut()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='TimeOut' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getTimeOut();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResource#getTimeOut <em>Time Out</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Time Out</em>' containment reference.
   * @see #getTimeOut()
   * @generated
   */
  void setTimeOut(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Transport</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transport</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transport</em>' containment reference.
   * @see #setTransport(AbstractTransport)
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#getSoapIOResource_Transport()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Transport' namespace='##targetNamespace'"
   * @generated
   */
  AbstractTransport getTransport();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResource#getTransport <em>Transport</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Transport</em>' containment reference.
   * @see #getTransport()
   * @generated
   */
  void setTransport(AbstractTransport value);

} // SoapIOResource
