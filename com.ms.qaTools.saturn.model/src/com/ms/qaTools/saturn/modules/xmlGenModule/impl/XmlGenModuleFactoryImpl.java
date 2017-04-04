package com.ms.qaTools.saturn.modules.xmlGenModule.impl;

import com.ms.qaTools.saturn.modules.xmlGenModule.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.ms.qaTools.saturn.modules.xmlGenModule.DataSet;
import com.ms.qaTools.saturn.modules.xmlGenModule.DocumentRoot;
import com.ms.qaTools.saturn.modules.xmlGenModule.OutputDirectory;
import com.ms.qaTools.saturn.modules.xmlGenModule.XmlFormatEnums;
import com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration;
import com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenModuleFactory;
import com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenModulePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class XmlGenModuleFactoryImpl extends EFactoryImpl implements XmlGenModuleFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static XmlGenModuleFactory init()
  {
    try
    {
      XmlGenModuleFactory theXmlGenModuleFactory = (XmlGenModuleFactory)EPackage.Registry.INSTANCE.getEFactory(XmlGenModulePackage.eNS_URI);
      if (theXmlGenModuleFactory != null)
      {
        return theXmlGenModuleFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new XmlGenModuleFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlGenModuleFactoryImpl()
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
      case XmlGenModulePackage.DATA_SET: return createDataSet();
      case XmlGenModulePackage.DOCUMENT_ROOT: return createDocumentRoot();
      case XmlGenModulePackage.OUTPUT_DIRECTORY: return createOutputDirectory();
      case XmlGenModulePackage.XML_GEN_CONFIGURATION: return createXmlGenConfiguration();
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
      case XmlGenModulePackage.XML_FORMAT_ENUMS:
        return createXmlFormatEnumsFromString(eDataType, initialValue);
      case XmlGenModulePackage.XML_FORMAT_ENUMS_OBJECT:
        return createXmlFormatEnumsObjectFromString(eDataType, initialValue);
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
      case XmlGenModulePackage.XML_FORMAT_ENUMS:
        return convertXmlFormatEnumsToString(eDataType, instanceValue);
      case XmlGenModulePackage.XML_FORMAT_ENUMS_OBJECT:
        return convertXmlFormatEnumsObjectToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DataSet createDataSet()
  {
    DataSetImpl dataSet = new DataSetImpl();
    return dataSet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DocumentRoot createDocumentRoot()
  {
    DocumentRootImpl documentRoot = new DocumentRootImpl();
    return documentRoot;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OutputDirectory createOutputDirectory()
  {
    OutputDirectoryImpl outputDirectory = new OutputDirectoryImpl();
    return outputDirectory;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlGenConfiguration createXmlGenConfiguration()
  {
    XmlGenConfigurationImpl xmlGenConfiguration = new XmlGenConfigurationImpl();
    return xmlGenConfiguration;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlFormatEnums createXmlFormatEnumsFromString(EDataType eDataType, String initialValue)
  {
    XmlFormatEnums result = XmlFormatEnums.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertXmlFormatEnumsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlFormatEnums createXmlFormatEnumsObjectFromString(EDataType eDataType, String initialValue)
  {
    return createXmlFormatEnumsFromString(XmlGenModulePackage.Literals.XML_FORMAT_ENUMS, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertXmlFormatEnumsObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertXmlFormatEnumsToString(XmlGenModulePackage.Literals.XML_FORMAT_ENUMS, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlGenModulePackage getXmlGenModulePackage()
  {
    return (XmlGenModulePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static XmlGenModulePackage getPackage()
  {
    return XmlGenModulePackage.eINSTANCE;
  }

} // XmlGenModuleFactoryImpl
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
