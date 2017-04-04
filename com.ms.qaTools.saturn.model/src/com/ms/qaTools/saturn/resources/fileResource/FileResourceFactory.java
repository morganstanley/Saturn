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
package com.ms.qaTools.saturn.resources.fileResource;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage
 * @generated
 */
public interface FileResourceFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  FileResourceFactory eINSTANCE = com.ms.qaTools.saturn.resources.fileResource.impl.FileResourceFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Binary File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binary File</em>'.
   * @generated
   */
  BinaryFile createBinaryFile();

  /**
   * Returns a new object of class '<em>CSV File</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>CSV File</em>'.
   * @generated
   */
  CSVFile createCSVFile();

  /**
   * Returns a new object of class '<em>Custom File</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Custom File</em>'.
   * @generated
   */
  CustomFile createCustomFile();

  /**
   * Returns a new object of class '<em>Data File</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Data File</em>'.
   * @generated
   */
  DataFile createDataFile();

  /**
   * Returns a new object of class '<em>Data Set File</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Data Set File</em>'.
   * @generated
   */
  DataSetFile createDataSetFile();

  /**
   * Returns a new object of class '<em>Device File</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Device File</em>'.
   * @generated
   */
  DeviceFile createDeviceFile();

  /**
   * Returns a new object of class '<em>Excel Work Book</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Excel Work Book</em>'.
   * @generated
   */
  ExcelWorkBook createExcelWorkBook();

  /**
   * Returns a new object of class '<em>Excel Work Sheet</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Excel Work Sheet</em>'.
   * @generated
   */
  ExcelWorkSheet createExcelWorkSheet();

  /**
   * Returns a new object of class '<em>Fixed Width File</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Fixed Width File</em>'.
   * @generated
   */
  FixedWidthFile createFixedWidthFile();

  /**
   * Returns a new object of class '<em>FIX File</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>FIX File</em>'.
   * @generated
   */
  FIXFile createFIXFile();

  /**
   * Returns a new object of class '<em>Google Proto Buf File</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Google Proto Buf File</em>'.
   * @generated
   */
  GoogleProtoBufFile createGoogleProtoBufFile();

  /**
   * Returns a new object of class '<em>Json File</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Json File</em>'.
   * @generated
   */
  JsonFile createJsonFile();

  /**
   * Returns a new object of class '<em>Line File</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Line File</em>'.
   * @generated
   */
  LineFile createLineFile();

  /**
   * Returns a new object of class '<em>OO Calc Work Book</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>OO Calc Work Book</em>'.
   * @generated
   */
  OOCalcWorkBook createOOCalcWorkBook();

  /**
   * Returns a new object of class '<em>OO Calc Work Sheet</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>OO Calc Work Sheet</em>'.
   * @generated
   */
  OOCalcWorkSheet createOOCalcWorkSheet();

  /**
   * Returns a new object of class '<em>Properties File</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Properties File</em>'.
   * @generated
   */
  PropertiesFile createPropertiesFile();

  /**
   * Returns a new object of class '<em>Slurp File</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Slurp File</em>'.
   * @generated
   */
  SlurpFile createSlurpFile();

  /**
   * Returns a new object of class '<em>Standard IO</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Standard IO</em>'.
   * @generated
   */
  StandardIO createStandardIO();

  /**
   * Returns a new object of class '<em>XML File</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>XML File</em>'.
   * @generated
   */
  XMLFile createXMLFile();

  /**
   * Returns a new object of class '<em>XML Namespace Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XML Namespace Definition</em>'.
   * @generated
   */
  XMLNamespaceDefinition createXMLNamespaceDefinition();

  /**
   * Returns a new object of class '<em>XML Namespace Definitions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XML Namespace Definitions</em>'.
   * @generated
   */
  XMLNamespaceDefinitions createXMLNamespaceDefinitions();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  FileResourcePackage getFileResourcePackage();

} // FileResourceFactory
