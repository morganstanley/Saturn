package com.ms.qaTools.saturn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Reference</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.Reference#getIncludeFile <em>Include File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.Reference#getTemplate <em>Template</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.Reference#getRunGroup <em>Run Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.SaturnPackage#getReference()
 * @model extendedMetaData="name='Reference' kind='empty'"
 * @generated
 */
public interface Reference extends EObject
{
  /**
   * Returns the value of the '<em><b>Include File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Include File</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Include File</em>' attribute.
   * @see #setIncludeFile(String)
   * @see com.ms.qaTools.saturn.SaturnPackage#getReference_IncludeFile()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
   *        extendedMetaData="kind='attribute' name='includeFile'"
   * @generated
   */
  String getIncludeFile();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.Reference#getIncludeFile <em>Include File</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Include File</em>' attribute.
   * @see #getIncludeFile()
   * @generated
   */
  void setIncludeFile(String value);

  /**
   * Returns the value of the '<em><b>Run Group</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Run Group</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Run Group</em>' attribute.
   * @see #setRunGroup(String)
   * @see com.ms.qaTools.saturn.SaturnPackage#getReference_RunGroup()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
   *        extendedMetaData="kind='attribute' name='runGroup'"
   * @generated
   */
  String getRunGroup();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.Reference#getRunGroup <em>Run Group</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Run Group</em>' attribute.
   * @see #getRunGroup()
   * @generated
   */
  void setRunGroup(String value);

  /**
   * Returns the value of the '<em><b>Template</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template</em>' attribute.
   * @see #setTemplate(String)
   * @see com.ms.qaTools.saturn.SaturnPackage#getReference_Template()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
   *        extendedMetaData="kind='attribute' name='template'"
   * @generated
   */
  String getTemplate();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.Reference#getTemplate <em>Template</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Template</em>' attribute.
   * @see #getTemplate()
   * @generated
   */
  void setTemplate(String value);

} // Reference
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
