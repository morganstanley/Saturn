package com.ms.qaTools.saturn.listeners;

import org.eclipse.emf.ecore.EObject;

import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Xml File</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.listeners.XmlFile#getTitle <em>Title</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.listeners.XmlFile#getFileName <em>File Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.listeners.XmlFile#getXsltURI <em>Xslt URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.listeners.ListenersPackage#getXmlFile()
 * @model extendedMetaData="name='XmlFiles_._type' kind='elementOnly'"
 * @generated
 */
public interface XmlFile extends EObject
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' containment reference.
   * @see #setTitle(ComplexValue)
   * @see com.ms.qaTools.saturn.listeners.ListenersPackage#getXmlFile_Title()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Title' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getTitle();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.listeners.XmlFile#getTitle <em>Title</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' containment reference.
   * @see #getTitle()
   * @generated
   */
  void setTitle(ComplexValue value);

  /**
   * Returns the value of the '<em><b>File Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File Name</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File Name</em>' containment reference.
   * @see #setFileName(ComplexValue)
   * @see com.ms.qaTools.saturn.listeners.ListenersPackage#getXmlFile_FileName()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='FileName' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getFileName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.listeners.XmlFile#getFileName <em>File Name</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>File Name</em>' containment reference.
   * @see #getFileName()
   * @generated
   */
  void setFileName(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Xslt URI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Xslt URI</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xslt URI</em>' containment reference.
   * @see #setXsltURI(ComplexValue)
   * @see com.ms.qaTools.saturn.listeners.ListenersPackage#getXmlFile_XsltURI()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='XsltURI' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getXsltURI();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.listeners.XmlFile#getXsltURI <em>Xslt URI</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Xslt URI</em>' containment reference.
   * @see #getXsltURI()
   * @generated
   */
  void setXsltURI(ComplexValue value);

} // XmlFile
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
