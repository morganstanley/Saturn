package com.ms.qaTools.saturn.resources.fileResource.util;

import com.ms.qaTools.saturn.resources.fileResource.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

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
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage
 * @generated
 */
public class FileResourceAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static FileResourcePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public FileResourceAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = FileResourcePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc --> This implementation
   * returns <code>true</code> if the object is either the model's package or is an instance object of the model. <!--
   * end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected FileResourceSwitch<Adapter> modelSwitch = new FileResourceSwitch<Adapter>()
    {
      @Override
      public Adapter caseBinaryFile(BinaryFile object)
      {
        return createBinaryFileAdapter();
      }
      @Override
      public Adapter caseCSVFile(CSVFile object)
      {
        return createCSVFileAdapter();
      }
      @Override
      public Adapter caseCustomFile(CustomFile object)
      {
        return createCustomFileAdapter();
      }
      @Override
      public Adapter caseDataFile(DataFile object)
      {
        return createDataFileAdapter();
      }
      @Override
      public Adapter caseDataSetFile(DataSetFile object)
      {
        return createDataSetFileAdapter();
      }
      @Override
      public Adapter caseDeviceFile(DeviceFile object)
      {
        return createDeviceFileAdapter();
      }
      @Override
      public Adapter caseExcelWorkBook(ExcelWorkBook object)
      {
        return createExcelWorkBookAdapter();
      }
      @Override
      public Adapter caseExcelWorkSheet(ExcelWorkSheet object)
      {
        return createExcelWorkSheetAdapter();
      }
      @Override
      public Adapter caseFixedWidthFile(FixedWidthFile object)
      {
        return createFixedWidthFileAdapter();
      }
      @Override
      public Adapter caseFIXFile(FIXFile object)
      {
        return createFIXFileAdapter();
      }
      @Override
      public Adapter caseGoogleProtoBufFile(GoogleProtoBufFile object)
      {
        return createGoogleProtoBufFileAdapter();
      }
      @Override
      public Adapter caseJsonFile(JsonFile object)
      {
        return createJsonFileAdapter();
      }
      @Override
      public Adapter caseLineFile(LineFile object)
      {
        return createLineFileAdapter();
      }
      @Override
      public Adapter caseOOCalcWorkBook(OOCalcWorkBook object)
      {
        return createOOCalcWorkBookAdapter();
      }
      @Override
      public Adapter caseOOCalcWorkSheet(OOCalcWorkSheet object)
      {
        return createOOCalcWorkSheetAdapter();
      }
      @Override
      public Adapter casePropertiesFile(PropertiesFile object)
      {
        return createPropertiesFileAdapter();
      }
      @Override
      public Adapter caseSlurpFile(SlurpFile object)
      {
        return createSlurpFileAdapter();
      }
      @Override
      public Adapter caseStandardIO(StandardIO object)
      {
        return createStandardIOAdapter();
      }
      @Override
      public Adapter caseXMLFile(XMLFile object)
      {
        return createXMLFileAdapter();
      }
      @Override
      public Adapter caseXMLNamespaceDefinition(XMLNamespaceDefinition object)
      {
        return createXMLNamespaceDefinitionAdapter();
      }
      @Override
      public Adapter caseXMLNamespaceDefinitions(XMLNamespaceDefinitions object)
      {
        return createXMLNamespaceDefinitionsAdapter();
      }
      @Override
      public Adapter caseResourceDefinition(ResourceDefinition object)
      {
        return createResourceDefinitionAdapter();
      }
      @Override
      public Adapter caseNamedResourceDefinition(NamedResourceDefinition object)
      {
        return createNamedResourceDefinitionAdapter();
      }
      @Override
      public Adapter caseDataSetResourceDefinition(DataSetResourceDefinition object)
      {
        return createDataSetResourceDefinitionAdapter();
      }
      @Override
      public Adapter caseDeviceResourceDefinition(DeviceResourceDefinition object)
      {
        return createDeviceResourceDefinitionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.resources.fileResource.BinaryFile <em>Binary File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.resources.fileResource.BinaryFile
   * @generated
   */
  public Adapter createBinaryFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.resources.fileResource.CSVFile <em>CSV File</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
   * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.resources.fileResource.CSVFile
   * @generated
   */
  public Adapter createCSVFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.resources.fileResource.CustomFile <em>Custom File</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.resources.fileResource.CustomFile
   * @generated
   */
  public Adapter createCustomFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.resources.fileResource.DataFile <em>Data File</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
   * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.resources.fileResource.DataFile
   * @generated
   */
  public Adapter createDataFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.resources.fileResource.DataSetFile <em>Data Set File</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.resources.fileResource.DataSetFile
   * @generated
   */
  public Adapter createDataSetFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.resources.fileResource.DeviceFile <em>Device File</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.resources.fileResource.DeviceFile
   * @generated
   */
  public Adapter createDeviceFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.resources.fileResource.ExcelWorkBook <em>Excel Work Book</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.resources.fileResource.ExcelWorkBook
   * @generated
   */
  public Adapter createExcelWorkBookAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.resources.fileResource.ExcelWorkSheet <em>Excel Work Sheet</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.resources.fileResource.ExcelWorkSheet
   * @generated
   */
  public Adapter createExcelWorkSheetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.resources.fileResource.FixedWidthFile <em>Fixed Width File</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.resources.fileResource.FixedWidthFile
   * @generated
   */
  public Adapter createFixedWidthFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.resources.fileResource.FIXFile <em>FIX File</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
   * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.resources.fileResource.FIXFile
   * @generated
   */
  public Adapter createFIXFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '
   * {@link com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile <em>Google Proto Buf File</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile
   * @generated
   */
  public Adapter createGoogleProtoBufFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.resources.fileResource.JsonFile <em>Json File</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
   * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.resources.fileResource.JsonFile
   * @generated
   */
  public Adapter createJsonFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.resources.fileResource.LineFile <em>Line File</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
   * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.resources.fileResource.LineFile
   * @generated
   */
  public Adapter createLineFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkBook <em>OO Calc Work Book</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkBook
   * @generated
   */
  public Adapter createOOCalcWorkBookAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkSheet <em>OO Calc Work Sheet</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkSheet
   * @generated
   */
  public Adapter createOOCalcWorkSheetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.resources.fileResource.PropertiesFile <em>Properties File</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.resources.fileResource.PropertiesFile
   * @generated
   */
  public Adapter createPropertiesFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.resources.fileResource.SlurpFile <em>Slurp File</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.resources.fileResource.SlurpFile
   * @generated
   */
  public Adapter createSlurpFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.resources.fileResource.StandardIO <em>Standard IO</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.resources.fileResource.StandardIO
   * @generated
   */
  public Adapter createStandardIOAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.resources.fileResource.XMLFile <em>XML File</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
   * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.resources.fileResource.XMLFile
   * @generated
   */
  public Adapter createXMLFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.resources.fileResource.XMLNamespaceDefinition <em>XML Namespace Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.resources.fileResource.XMLNamespaceDefinition
   * @generated
   */
  public Adapter createXMLNamespaceDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.resources.fileResource.XMLNamespaceDefinitions <em>XML Namespace Definitions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.resources.fileResource.XMLNamespaceDefinitions
   * @generated
   */
  public Adapter createXMLNamespaceDefinitionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.types.ResourceDefinition <em>Resource Definition</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.types.ResourceDefinition
   * @generated
   */
  public Adapter createResourceDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.types.NamedResourceDefinition <em>Named Resource Definition</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we
   * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.types.NamedResourceDefinition
   * @generated
   */
  public Adapter createNamedResourceDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.types.DataSetResourceDefinition <em>Data Set Resource Definition</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that
   * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.types.DataSetResourceDefinition
   * @generated
   */
  public Adapter createDataSetResourceDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.types.DeviceResourceDefinition <em>Device Resource Definition</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we
   * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.types.DeviceResourceDefinition
   * @generated
   */
  public Adapter createDeviceResourceDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc --> This default implementation returns null. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} // FileResourceAdapterFactory
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
