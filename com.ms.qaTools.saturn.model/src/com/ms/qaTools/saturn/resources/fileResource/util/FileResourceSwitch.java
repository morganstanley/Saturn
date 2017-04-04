package com.ms.qaTools.saturn.resources.fileResource.util;

import com.ms.qaTools.saturn.resources.fileResource.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import com.ms.qaTools.saturn.resources.fileResource.CSVFile;
import com.ms.qaTools.saturn.resources.fileResource.CustomFile;
import com.ms.qaTools.saturn.resources.fileResource.DataFile;
import com.ms.qaTools.saturn.resources.fileResource.DataSetFile;
import com.ms.qaTools.saturn.resources.fileResource.DeviceFile;
import com.ms.qaTools.saturn.resources.fileResource.ExcelWorkBook;
import com.ms.qaTools.saturn.resources.fileResource.ExcelWorkSheet;
import com.ms.qaTools.saturn.resources.fileResource.FIXFile;
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
import com.ms.qaTools.saturn.types.DataSetResourceDefinition;
import com.ms.qaTools.saturn.types.DeviceResourceDefinition;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage
 * @generated
 */
public class FileResourceSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static FileResourcePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public FileResourceSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = FileResourcePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case FileResourcePackage.BINARY_FILE:
      {
        BinaryFile binaryFile = (BinaryFile)theEObject;
        T result = caseBinaryFile(binaryFile);
        if (result == null) result = caseDataSetFile(binaryFile);
        if (result == null) result = caseDataSetResourceDefinition(binaryFile);
        if (result == null) result = caseNamedResourceDefinition(binaryFile);
        if (result == null) result = caseResourceDefinition(binaryFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FileResourcePackage.CSV_FILE:
      {
        CSVFile csvFile = (CSVFile)theEObject;
        T result = caseCSVFile(csvFile);
        if (result == null) result = caseDataSetFile(csvFile);
        if (result == null) result = caseDataSetResourceDefinition(csvFile);
        if (result == null) result = caseNamedResourceDefinition(csvFile);
        if (result == null) result = caseResourceDefinition(csvFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FileResourcePackage.CUSTOM_FILE:
      {
        CustomFile customFile = (CustomFile)theEObject;
        T result = caseCustomFile(customFile);
        if (result == null) result = caseDataSetFile(customFile);
        if (result == null) result = caseDataSetResourceDefinition(customFile);
        if (result == null) result = caseNamedResourceDefinition(customFile);
        if (result == null) result = caseResourceDefinition(customFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FileResourcePackage.DATA_FILE:
      {
        DataFile dataFile = (DataFile)theEObject;
        T result = caseDataFile(dataFile);
        if (result == null) result = caseDataSetFile(dataFile);
        if (result == null) result = caseDataSetResourceDefinition(dataFile);
        if (result == null) result = caseNamedResourceDefinition(dataFile);
        if (result == null) result = caseResourceDefinition(dataFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FileResourcePackage.DATA_SET_FILE:
      {
        DataSetFile dataSetFile = (DataSetFile)theEObject;
        T result = caseDataSetFile(dataSetFile);
        if (result == null) result = caseDataSetResourceDefinition(dataSetFile);
        if (result == null) result = caseNamedResourceDefinition(dataSetFile);
        if (result == null) result = caseResourceDefinition(dataSetFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FileResourcePackage.DEVICE_FILE:
      {
        DeviceFile deviceFile = (DeviceFile)theEObject;
        T result = caseDeviceFile(deviceFile);
        if (result == null) result = caseDeviceResourceDefinition(deviceFile);
        if (result == null) result = caseNamedResourceDefinition(deviceFile);
        if (result == null) result = caseResourceDefinition(deviceFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FileResourcePackage.EXCEL_WORK_BOOK:
      {
        ExcelWorkBook excelWorkBook = (ExcelWorkBook)theEObject;
        T result = caseExcelWorkBook(excelWorkBook);
        if (result == null) result = caseDeviceFile(excelWorkBook);
        if (result == null) result = caseDeviceResourceDefinition(excelWorkBook);
        if (result == null) result = caseNamedResourceDefinition(excelWorkBook);
        if (result == null) result = caseResourceDefinition(excelWorkBook);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FileResourcePackage.EXCEL_WORK_SHEET:
      {
        ExcelWorkSheet excelWorkSheet = (ExcelWorkSheet)theEObject;
        T result = caseExcelWorkSheet(excelWorkSheet);
        if (result == null) result = caseDataSetFile(excelWorkSheet);
        if (result == null) result = caseDataSetResourceDefinition(excelWorkSheet);
        if (result == null) result = caseNamedResourceDefinition(excelWorkSheet);
        if (result == null) result = caseResourceDefinition(excelWorkSheet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FileResourcePackage.FIXED_WIDTH_FILE:
      {
        FixedWidthFile fixedWidthFile = (FixedWidthFile)theEObject;
        T result = caseFixedWidthFile(fixedWidthFile);
        if (result == null) result = caseDataSetFile(fixedWidthFile);
        if (result == null) result = caseDataSetResourceDefinition(fixedWidthFile);
        if (result == null) result = caseNamedResourceDefinition(fixedWidthFile);
        if (result == null) result = caseResourceDefinition(fixedWidthFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FileResourcePackage.FIX_FILE:
      {
        FIXFile fixFile = (FIXFile)theEObject;
        T result = caseFIXFile(fixFile);
        if (result == null) result = caseDataSetFile(fixFile);
        if (result == null) result = caseDataSetResourceDefinition(fixFile);
        if (result == null) result = caseNamedResourceDefinition(fixFile);
        if (result == null) result = caseResourceDefinition(fixFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FileResourcePackage.GOOGLE_PROTO_BUF_FILE:
      {
        GoogleProtoBufFile googleProtoBufFile = (GoogleProtoBufFile)theEObject;
        T result = caseGoogleProtoBufFile(googleProtoBufFile);
        if (result == null) result = caseDataSetFile(googleProtoBufFile);
        if (result == null) result = caseDataSetResourceDefinition(googleProtoBufFile);
        if (result == null) result = caseNamedResourceDefinition(googleProtoBufFile);
        if (result == null) result = caseResourceDefinition(googleProtoBufFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FileResourcePackage.JSON_FILE:
      {
        JsonFile jsonFile = (JsonFile)theEObject;
        T result = caseJsonFile(jsonFile);
        if (result == null) result = caseDataSetFile(jsonFile);
        if (result == null) result = caseDataSetResourceDefinition(jsonFile);
        if (result == null) result = caseNamedResourceDefinition(jsonFile);
        if (result == null) result = caseResourceDefinition(jsonFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FileResourcePackage.LINE_FILE:
      {
        LineFile lineFile = (LineFile)theEObject;
        T result = caseLineFile(lineFile);
        if (result == null) result = caseDataSetFile(lineFile);
        if (result == null) result = caseDataSetResourceDefinition(lineFile);
        if (result == null) result = caseNamedResourceDefinition(lineFile);
        if (result == null) result = caseResourceDefinition(lineFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FileResourcePackage.OO_CALC_WORK_BOOK:
      {
        OOCalcWorkBook ooCalcWorkBook = (OOCalcWorkBook)theEObject;
        T result = caseOOCalcWorkBook(ooCalcWorkBook);
        if (result == null) result = caseDeviceFile(ooCalcWorkBook);
        if (result == null) result = caseDeviceResourceDefinition(ooCalcWorkBook);
        if (result == null) result = caseNamedResourceDefinition(ooCalcWorkBook);
        if (result == null) result = caseResourceDefinition(ooCalcWorkBook);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FileResourcePackage.OO_CALC_WORK_SHEET:
      {
        OOCalcWorkSheet ooCalcWorkSheet = (OOCalcWorkSheet)theEObject;
        T result = caseOOCalcWorkSheet(ooCalcWorkSheet);
        if (result == null) result = caseDataSetFile(ooCalcWorkSheet);
        if (result == null) result = caseDataSetResourceDefinition(ooCalcWorkSheet);
        if (result == null) result = caseNamedResourceDefinition(ooCalcWorkSheet);
        if (result == null) result = caseResourceDefinition(ooCalcWorkSheet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FileResourcePackage.PROPERTIES_FILE:
      {
        PropertiesFile propertiesFile = (PropertiesFile)theEObject;
        T result = casePropertiesFile(propertiesFile);
        if (result == null) result = caseDataSetFile(propertiesFile);
        if (result == null) result = caseDataSetResourceDefinition(propertiesFile);
        if (result == null) result = caseNamedResourceDefinition(propertiesFile);
        if (result == null) result = caseResourceDefinition(propertiesFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FileResourcePackage.SLURP_FILE:
      {
        SlurpFile slurpFile = (SlurpFile)theEObject;
        T result = caseSlurpFile(slurpFile);
        if (result == null) result = caseDataSetFile(slurpFile);
        if (result == null) result = caseDataSetResourceDefinition(slurpFile);
        if (result == null) result = caseNamedResourceDefinition(slurpFile);
        if (result == null) result = caseResourceDefinition(slurpFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FileResourcePackage.STANDARD_IO:
      {
        StandardIO standardIO = (StandardIO)theEObject;
        T result = caseStandardIO(standardIO);
        if (result == null) result = caseDeviceResourceDefinition(standardIO);
        if (result == null) result = caseNamedResourceDefinition(standardIO);
        if (result == null) result = caseResourceDefinition(standardIO);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FileResourcePackage.XML_FILE:
      {
        XMLFile xmlFile = (XMLFile)theEObject;
        T result = caseXMLFile(xmlFile);
        if (result == null) result = caseDataSetFile(xmlFile);
        if (result == null) result = caseDataSetResourceDefinition(xmlFile);
        if (result == null) result = caseNamedResourceDefinition(xmlFile);
        if (result == null) result = caseResourceDefinition(xmlFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FileResourcePackage.XML_NAMESPACE_DEFINITION:
      {
        XMLNamespaceDefinition xmlNamespaceDefinition = (XMLNamespaceDefinition)theEObject;
        T result = caseXMLNamespaceDefinition(xmlNamespaceDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FileResourcePackage.XML_NAMESPACE_DEFINITIONS:
      {
        XMLNamespaceDefinitions xmlNamespaceDefinitions = (XMLNamespaceDefinitions)theEObject;
        T result = caseXMLNamespaceDefinitions(xmlNamespaceDefinitions);
        if (result == null) result = caseNamedResourceDefinition(xmlNamespaceDefinitions);
        if (result == null) result = caseResourceDefinition(xmlNamespaceDefinitions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinaryFile(BinaryFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSV File</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSV File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSVFile(CSVFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Custom File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Custom File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCustomFile(CustomFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data File</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataFile(DataFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Set File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Set File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataSetFile(DataSetFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Device File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Device File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeviceFile(DeviceFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Excel Work Book</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Excel Work Book</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExcelWorkBook(ExcelWorkBook object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Excel Work Sheet</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Excel Work Sheet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExcelWorkSheet(ExcelWorkSheet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fixed Width File</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fixed Width File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFixedWidthFile(FixedWidthFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FIX File</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FIX File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFIXFile(FIXFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Google Proto Buf File</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Google Proto Buf File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoogleProtoBufFile(GoogleProtoBufFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json File</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonFile(JsonFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Line File</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLineFile(LineFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>OO Calc Work Book</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OO Calc Work Book</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOOCalcWorkBook(OOCalcWorkBook object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>OO Calc Work Sheet</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OO Calc Work Sheet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOOCalcWorkSheet(OOCalcWorkSheet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Properties File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Properties File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertiesFile(PropertiesFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slurp File</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slurp File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlurpFile(SlurpFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Standard IO</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Standard IO</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStandardIO(StandardIO object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XML File</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XML File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXMLFile(XMLFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XML Namespace Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XML Namespace Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXMLNamespaceDefinition(XMLNamespaceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XML Namespace Definitions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XML Namespace Definitions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXMLNamespaceDefinitions(XMLNamespaceDefinitions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Definition</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceDefinition(ResourceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Resource Definition</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Resource Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedResourceDefinition(NamedResourceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Set Resource Definition</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Set Resource Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataSetResourceDefinition(DataSetResourceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Device Resource Definition</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Device Resource Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeviceResourceDefinition(DeviceResourceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch, but this is the last case
   * anyway. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} // FileResourceSwitch
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
