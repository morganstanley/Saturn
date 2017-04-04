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
package com.ms.qaTools.saturn.annotations.saturnWeb;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage
 * @generated
 */
public interface SaturnWebFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  SaturnWebFactory eINSTANCE = com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Abstract Source Definition</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Source Definition</em>'.
   * @generated
   */
  AbstractSourceDefinition createAbstractSourceDefinition();

  /**
   * Returns a new object of class '<em>Abstract Target Definition</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Target Definition</em>'.
   * @generated
   */
  AbstractTargetDefinition createAbstractTargetDefinition();

  /**
   * Returns a new object of class '<em>Drop Down Option</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Drop Down Option</em>'.
   * @generated
   */
  DropDownOption createDropDownOption();

  /**
   * Returns a new object of class '<em>Drop Down Source Definition</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Drop Down Source Definition</em>'.
   * @generated
   */
  DropDownSourceDefinition createDropDownSourceDefinition();

  /**
   * Returns a new object of class '<em>File Selector Source Definition</em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return a new object of class '<em>File Selector Source Definition</em>'.
   * @generated
   */
  FileSelectorSourceDefinition createFileSelectorSourceDefinition();

  /**
   * Returns a new object of class '<em>Configuration</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Configuration</em>'.
   * @generated
   */
  SaturnWebConfiguration createSaturnWebConfiguration();

  /**
   * Returns a new object of class '<em>Single Value Env Var Target Definition</em>'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return a new object of class '<em>Single Value Env Var Target Definition</em>'.
   * @generated
   */
  SingleValueEnvVarTargetDefinition createSingleValueEnvVarTargetDefinition();

  /**
   * Returns a new object of class '<em>Single Value Target Definition</em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return a new object of class '<em>Single Value Target Definition</em>'.
   * @generated
   */
  SingleValueTargetDefinition createSingleValueTargetDefinition();

  /**
   * Returns a new object of class '<em>Text Source Definition</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Text Source Definition</em>'.
   * @generated
   */
  TextSourceDefinition createTextSourceDefinition();

  /**
   * Returns a new object of class '<em>Value Definition</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Value Definition</em>'.
   * @generated
   */
  ValueDefinition createValueDefinition();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SaturnWebPackage getSaturnWebPackage();

} // SaturnWebFactory
