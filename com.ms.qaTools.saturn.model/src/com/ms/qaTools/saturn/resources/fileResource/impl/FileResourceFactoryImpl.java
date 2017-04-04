package com.ms.qaTools.saturn.resources.fileResource.impl;

import com.ms.qaTools.saturn.resources.fileResource.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.ms.qaTools.saturn.resources.fileResource.CSVFile;
import com.ms.qaTools.saturn.resources.fileResource.CustomFile;
import com.ms.qaTools.saturn.resources.fileResource.DataFile;
import com.ms.qaTools.saturn.resources.fileResource.DataSetFile;
import com.ms.qaTools.saturn.resources.fileResource.DeviceFile;
import com.ms.qaTools.saturn.resources.fileResource.ExcelVersions;
import com.ms.qaTools.saturn.resources.fileResource.ExcelWorkBook;
import com.ms.qaTools.saturn.resources.fileResource.ExcelWorkSheet;
import com.ms.qaTools.saturn.resources.fileResource.FIXFile;
import com.ms.qaTools.saturn.resources.fileResource.FileResourceFactory;
import com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage;
import com.ms.qaTools.saturn.resources.fileResource.FixedWidthFile;
import com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile;
import com.ms.qaTools.saturn.resources.fileResource.JsonFile;
import com.ms.qaTools.saturn.resources.fileResource.LineFile;
import com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkBook;
import com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkSheet;
import com.ms.qaTools.saturn.resources.fileResource.PropertiesFile;
import com.ms.qaTools.saturn.resources.fileResource.SlurpFile;
import com.ms.qaTools.saturn.resources.fileResource.StandardIO;
import com.ms.qaTools.saturn.resources.fileResource.XMLFile;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class FileResourceFactoryImpl extends EFactoryImpl implements FileResourceFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static FileResourceFactory init()
  {
    try
    {
      FileResourceFactory theFileResourceFactory = (FileResourceFactory)EPackage.Registry.INSTANCE.getEFactory(FileResourcePackage.eNS_URI);
      if (theFileResourceFactory != null)
      {
        return theFileResourceFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FileResourceFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public FileResourceFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FileResourcePackage.BINARY_FILE: return createBinaryFile();
      case FileResourcePackage.CSV_FILE: return createCSVFile();
      case FileResourcePackage.CUSTOM_FILE: return createCustomFile();
      case FileResourcePackage.DATA_FILE: return createDataFile();
      case FileResourcePackage.DATA_SET_FILE: return createDataSetFile();
      case FileResourcePackage.DEVICE_FILE: return createDeviceFile();
      case FileResourcePackage.EXCEL_WORK_BOOK: return createExcelWorkBook();
      case FileResourcePackage.EXCEL_WORK_SHEET: return createExcelWorkSheet();
      case FileResourcePackage.FIXED_WIDTH_FILE: return createFixedWidthFile();
      case FileResourcePackage.FIX_FILE: return createFIXFile();
      case FileResourcePackage.GOOGLE_PROTO_BUF_FILE: return createGoogleProtoBufFile();
      case FileResourcePackage.JSON_FILE: return createJsonFile();
      case FileResourcePackage.LINE_FILE: return createLineFile();
      case FileResourcePackage.OO_CALC_WORK_BOOK: return createOOCalcWorkBook();
      case FileResourcePackage.OO_CALC_WORK_SHEET: return createOOCalcWorkSheet();
      case FileResourcePackage.PROPERTIES_FILE: return createPropertiesFile();
      case FileResourcePackage.SLURP_FILE: return createSlurpFile();
      case FileResourcePackage.STANDARD_IO: return createStandardIO();
      case FileResourcePackage.XML_FILE: return createXMLFile();
      case FileResourcePackage.XML_NAMESPACE_DEFINITION: return createXMLNamespaceDefinition();
      case FileResourcePackage.XML_NAMESPACE_DEFINITIONS: return createXMLNamespaceDefinitions();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case FileResourcePackage.EXCEL_VERSIONS:
        return createExcelVersionsFromString(eDataType, initialValue);
      case FileResourcePackage.EXCEL_VERSIONS_OBJECT:
        return createExcelVersionsObjectFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case FileResourcePackage.EXCEL_VERSIONS:
        return convertExcelVersionsToString(eDataType, instanceValue);
      case FileResourcePackage.EXCEL_VERSIONS_OBJECT:
        return convertExcelVersionsObjectToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryFile createBinaryFile()
  {
    BinaryFileImpl binaryFile = new BinaryFileImpl();
    return binaryFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CSVFile createCSVFile()
  {
    CSVFileImpl csvFile = new CSVFileImpl();
    return csvFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CustomFile createCustomFile()
  {
    CustomFileImpl customFile = new CustomFileImpl();
    return customFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DataFile createDataFile()
  {
    DataFileImpl dataFile = new DataFileImpl();
    return dataFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DataSetFile createDataSetFile()
  {
    DataSetFileImpl dataSetFile = new DataSetFileImpl();
    return dataSetFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DeviceFile createDeviceFile()
  {
    DeviceFileImpl deviceFile = new DeviceFileImpl();
    return deviceFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ExcelWorkBook createExcelWorkBook()
  {
    ExcelWorkBookImpl excelWorkBook = new ExcelWorkBookImpl();
    return excelWorkBook;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ExcelWorkSheet createExcelWorkSheet()
  {
    ExcelWorkSheetImpl excelWorkSheet = new ExcelWorkSheetImpl();
    return excelWorkSheet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public FixedWidthFile createFixedWidthFile()
  {
    FixedWidthFileImpl fixedWidthFile = new FixedWidthFileImpl();
    return fixedWidthFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public FIXFile createFIXFile()
  {
    FIXFileImpl fixFile = new FIXFileImpl();
    return fixFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public GoogleProtoBufFile createGoogleProtoBufFile()
  {
    GoogleProtoBufFileImpl googleProtoBufFile = new GoogleProtoBufFileImpl();
    return googleProtoBufFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public JsonFile createJsonFile()
  {
    JsonFileImpl jsonFile = new JsonFileImpl();
    return jsonFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public LineFile createLineFile()
  {
    LineFileImpl lineFile = new LineFileImpl();
    return lineFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OOCalcWorkBook createOOCalcWorkBook()
  {
    OOCalcWorkBookImpl ooCalcWorkBook = new OOCalcWorkBookImpl();
    return ooCalcWorkBook;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OOCalcWorkSheet createOOCalcWorkSheet()
  {
    OOCalcWorkSheetImpl ooCalcWorkSheet = new OOCalcWorkSheetImpl();
    return ooCalcWorkSheet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PropertiesFile createPropertiesFile()
  {
    PropertiesFileImpl propertiesFile = new PropertiesFileImpl();
    return propertiesFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SlurpFile createSlurpFile()
  {
    SlurpFileImpl slurpFile = new SlurpFileImpl();
    return slurpFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public StandardIO createStandardIO()
  {
    StandardIOImpl standardIO = new StandardIOImpl();
    return standardIO;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XMLFile createXMLFile()
  {
    XMLFileImpl xmlFile = new XMLFileImpl();
    return xmlFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLNamespaceDefinition createXMLNamespaceDefinition()
  {
    XMLNamespaceDefinitionImpl xmlNamespaceDefinition = new XMLNamespaceDefinitionImpl();
    return xmlNamespaceDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLNamespaceDefinitions createXMLNamespaceDefinitions()
  {
    XMLNamespaceDefinitionsImpl xmlNamespaceDefinitions = new XMLNamespaceDefinitionsImpl();
    return xmlNamespaceDefinitions;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ExcelVersions createExcelVersionsFromString(EDataType eDataType, String initialValue)
  {
    ExcelVersions result = ExcelVersions.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertExcelVersionsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ExcelVersions createExcelVersionsObjectFromString(EDataType eDataType, String initialValue)
  {
    return createExcelVersionsFromString(FileResourcePackage.Literals.EXCEL_VERSIONS, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertExcelVersionsObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertExcelVersionsToString(FileResourcePackage.Literals.EXCEL_VERSIONS, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public FileResourcePackage getFileResourcePackage()
  {
    return (FileResourcePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FileResourcePackage getPackage()
  {
    return FileResourcePackage.eINSTANCE;
  }

} // FileResourceFactoryImpl
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
