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
package com.ms.qaTools.saturn.modules.xmlManipModule;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage
 * @generated
 */
public interface XmlManipModuleFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  XmlManipModuleFactory eINSTANCE = com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModuleFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Add Operation</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Add Operation</em>'.
   * @generated
   */
  AddOperation createAddOperation();

  /**
   * Returns a new object of class '<em>Clean Namespaces Operation</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Clean Namespaces Operation</em>'.
   * @generated
   */
  CleanNamespacesOperation createCleanNamespacesOperation();

  /**
   * Returns a new object of class '<em>Delete Operation</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Delete Operation</em>'.
   * @generated
   */
  DeleteOperation createDeleteOperation();

  /**
   * Returns a new object of class '<em>Document Root</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Document Root</em>'.
   * @generated
   */
  DocumentRoot createDocumentRoot();

  /**
   * Returns a new object of class '<em>Extract Operation</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Extract Operation</em>'.
   * @generated
   */
  ExtractOperation createExtractOperation();

  /**
   * Returns a new object of class '<em>Intersect Operation</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Intersect Operation</em>'.
   * @generated
   */
  IntersectOperation createIntersectOperation();

  /**
   * Returns a new object of class '<em>Register Function Operation</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Register Function Operation</em>'.
   * @generated
   */
  RegisterFunctionOperation createRegisterFunctionOperation();

  /**
   * Returns a new object of class '<em>Replace Operation</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Replace Operation</em>'.
   * @generated
   */
  ReplaceOperation createReplaceOperation();

  /**
   * Returns a new object of class '<em>Shift Operation</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Shift Operation</em>'.
   * @generated
   */
  ShiftOperation createShiftOperation();

  /**
   * Returns a new object of class '<em>Sort Operation</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Sort Operation</em>'.
   * @generated
   */
  SortOperation createSortOperation();

  /**
   * Returns a new object of class '<em>Split Operation</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Split Operation</em>'.
   * @generated
   */
  SplitOperation createSplitOperation();

  /**
   * Returns a new object of class '<em>Strip Namespaces Operation</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Strip Namespaces Operation</em>'.
   * @generated
   */
  StripNamespacesOperation createStripNamespacesOperation();

  /**
   * Returns a new object of class '<em>Value Replace Operation</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Value Replace Operation</em>'.
   * @generated
   */
  ValueReplaceOperation createValueReplaceOperation();

  /**
   * Returns a new object of class '<em>Where Operation</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Where Operation</em>'.
   * @generated
   */
  WhereOperation createWhereOperation();

  /**
   * Returns a new object of class '<em>Xml Manip Configuration</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Xml Manip Configuration</em>'.
   * @generated
   */
  XmlManipConfiguration createXmlManipConfiguration();

  /**
   * Returns a new object of class '<em>Xml Manip Namespace</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Xml Manip Namespace</em>'.
   * @generated
   */
  XmlManipNamespace createXmlManipNamespace();

  /**
   * Returns a new object of class '<em>XPath</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>XPath</em>'.
   * @generated
   */
  XPath createXPath();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  XmlManipModulePackage getXmlManipModulePackage();

} // XmlManipModuleFactory
