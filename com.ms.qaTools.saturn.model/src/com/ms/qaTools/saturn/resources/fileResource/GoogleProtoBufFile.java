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
package com.ms.qaTools.saturn.resources.fileResource;

import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Google Proto Buf File</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile#getClassname <em>Classname</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile#getJarLocation <em>Jar Location</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile#isReadEncoded <em>Read Encoded</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile#isReadDelimited <em>Read Delimited</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage#getGoogleProtoBufFile()
 * @model extendedMetaData="name='GoogleProtoBufFile' kind='elementOnly'"
 * @generated
 */
public interface GoogleProtoBufFile extends DataSetFile
{
  /**
   * Returns the value of the '<em><b>Classname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classname</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classname</em>' containment reference.
   * @see #setClassname(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage#getGoogleProtoBufFile_Classname()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Classname' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getClassname();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile#getClassname <em>Classname</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Classname</em>' containment reference.
   * @see #getClassname()
   * @generated
   */
  void setClassname(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Jar Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Jar Location</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Jar Location</em>' containment reference.
   * @see #setJarLocation(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage#getGoogleProtoBufFile_JarLocation()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='JarLocation' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getJarLocation();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile#getJarLocation <em>Jar Location</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Jar Location</em>' containment reference.
   * @see #getJarLocation()
   * @generated
   */
  void setJarLocation(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Read Delimited</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Read Delimited</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Read Delimited</em>' attribute.
   * @see #isSetReadDelimited()
   * @see #unsetReadDelimited()
   * @see #setReadDelimited(boolean)
   * @see com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage#getGoogleProtoBufFile_ReadDelimited()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='readDelimited'"
   * @generated
   */
  boolean isReadDelimited();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile#isReadDelimited <em>Read Delimited</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Read Delimited</em>' attribute.
   * @see #isSetReadDelimited()
   * @see #unsetReadDelimited()
   * @see #isReadDelimited()
   * @generated
   */
  void setReadDelimited(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile#isReadDelimited <em>Read Delimited</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetReadDelimited()
   * @see #isReadDelimited()
   * @see #setReadDelimited(boolean)
   * @generated
   */
  void unsetReadDelimited();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile#isReadDelimited <em>Read Delimited</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Read Delimited</em>' attribute is set.
   * @see #unsetReadDelimited()
   * @see #isReadDelimited()
   * @see #setReadDelimited(boolean)
   * @generated
   */
  boolean isSetReadDelimited();

  /**
   * Returns the value of the '<em><b>Read Encoded</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Read Encoded</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Read Encoded</em>' attribute.
   * @see #isSetReadEncoded()
   * @see #unsetReadEncoded()
   * @see #setReadEncoded(boolean)
   * @see com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage#getGoogleProtoBufFile_ReadEncoded()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='readEncoded'"
   * @generated
   */
  boolean isReadEncoded();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile#isReadEncoded <em>Read Encoded</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Read Encoded</em>' attribute.
   * @see #isSetReadEncoded()
   * @see #unsetReadEncoded()
   * @see #isReadEncoded()
   * @generated
   */
  void setReadEncoded(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile#isReadEncoded <em>Read Encoded</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetReadEncoded()
   * @see #isReadEncoded()
   * @see #setReadEncoded(boolean)
   * @generated
   */
  void unsetReadEncoded();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile#isReadEncoded <em>Read Encoded</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Read Encoded</em>' attribute is set.
   * @see #unsetReadEncoded()
   * @see #isReadEncoded()
   * @see #setReadEncoded(boolean)
   * @generated
   */
  boolean isSetReadEncoded();

} // GoogleProtoBufFile
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
