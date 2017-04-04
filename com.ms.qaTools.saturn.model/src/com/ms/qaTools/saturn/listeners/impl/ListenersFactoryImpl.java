package com.ms.qaTools.saturn.listeners.impl;

import com.ms.qaTools.saturn.listeners.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.ms.qaTools.saturn.listeners.ConsoleReportListener;
import com.ms.qaTools.saturn.listeners.DataSetReportListener;
import com.ms.qaTools.saturn.listeners.EMailPostExecutionListener;
import com.ms.qaTools.saturn.listeners.ID;
import com.ms.qaTools.saturn.listeners.ListenersFactory;
import com.ms.qaTools.saturn.listeners.ListenersPackage;
import com.ms.qaTools.saturn.listeners.MailConfiguration;
import com.ms.qaTools.saturn.listeners.MailRecipient;
import com.ms.qaTools.saturn.listeners.RecipientTypeEnum;
import com.ms.qaTools.saturn.listeners.ScenarioReportListener;
import com.ms.qaTools.saturn.listeners.TAPOutputTypeEnum;
import com.ms.qaTools.saturn.listeners.TAPReportListener;
import com.ms.qaTools.saturn.listeners.XmlDirectory;
import com.ms.qaTools.saturn.listeners.XmlFile;
import com.ms.qaTools.saturn.listeners.XmlHierarchicalReportListener;
import com.ms.qaTools.saturn.listeners.XmlReportListener;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class ListenersFactoryImpl extends EFactoryImpl implements ListenersFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static ListenersFactory init()
  {
    try
    {
      ListenersFactory theListenersFactory = (ListenersFactory)EPackage.Registry.INSTANCE.getEFactory(ListenersPackage.eNS_URI);
      if (theListenersFactory != null)
      {
        return theListenersFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ListenersFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ListenersFactoryImpl()
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
      case ListenersPackage.CONSOLE_REPORT_LISTENER: return createConsoleReportListener();
      case ListenersPackage.DATA_SET_REPORT_LISTENER: return createDataSetReportListener();
      case ListenersPackage.EMAIL_POST_EXECUTION_LISTENER: return createEMailPostExecutionListener();
      case ListenersPackage.ID: return createID();
      case ListenersPackage.MAIL_CONFIGURATION: return createMailConfiguration();
      case ListenersPackage.MAIL_RECIPIENT: return createMailRecipient();
      case ListenersPackage.SCENARIO_REPORT_LISTENER: return createScenarioReportListener();
      case ListenersPackage.TAP_REPORT_LISTENER: return createTAPReportListener();
      case ListenersPackage.XML_DIRECTORY: return createXmlDirectory();
      case ListenersPackage.XML_FILE: return createXmlFile();
      case ListenersPackage.XML_HIERARCHICAL_REPORT_LISTENER: return createXmlHierarchicalReportListener();
      case ListenersPackage.XML_REPORT_LISTENER: return createXmlReportListener();
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
      case ListenersPackage.RECIPIENT_TYPE_ENUM:
        return createRecipientTypeEnumFromString(eDataType, initialValue);
      case ListenersPackage.TAP_OUTPUT_TYPE_ENUM:
        return createTAPOutputTypeEnumFromString(eDataType, initialValue);
      case ListenersPackage.RECIPIENT_TYPE_ENUM_OBJECT:
        return createRecipientTypeEnumObjectFromString(eDataType, initialValue);
      case ListenersPackage.TAP_OUTPUT_TYPE_ENUM_OBJECT:
        return createTAPOutputTypeEnumObjectFromString(eDataType, initialValue);
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
      case ListenersPackage.RECIPIENT_TYPE_ENUM:
        return convertRecipientTypeEnumToString(eDataType, instanceValue);
      case ListenersPackage.TAP_OUTPUT_TYPE_ENUM:
        return convertTAPOutputTypeEnumToString(eDataType, instanceValue);
      case ListenersPackage.RECIPIENT_TYPE_ENUM_OBJECT:
        return convertRecipientTypeEnumObjectToString(eDataType, instanceValue);
      case ListenersPackage.TAP_OUTPUT_TYPE_ENUM_OBJECT:
        return convertTAPOutputTypeEnumObjectToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ConsoleReportListener createConsoleReportListener()
  {
    ConsoleReportListenerImpl consoleReportListener = new ConsoleReportListenerImpl();
    return consoleReportListener;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DataSetReportListener createDataSetReportListener()
  {
    DataSetReportListenerImpl dataSetReportListener = new DataSetReportListenerImpl();
    return dataSetReportListener;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EMailPostExecutionListener createEMailPostExecutionListener()
  {
    EMailPostExecutionListenerImpl eMailPostExecutionListener = new EMailPostExecutionListenerImpl();
    return eMailPostExecutionListener;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ID createID()
  {
    IDImpl id = new IDImpl();
    return id;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MailConfiguration createMailConfiguration()
  {
    MailConfigurationImpl mailConfiguration = new MailConfigurationImpl();
    return mailConfiguration;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MailRecipient createMailRecipient()
  {
    MailRecipientImpl mailRecipient = new MailRecipientImpl();
    return mailRecipient;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ScenarioReportListener createScenarioReportListener()
  {
    ScenarioReportListenerImpl scenarioReportListener = new ScenarioReportListenerImpl();
    return scenarioReportListener;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TAPReportListener createTAPReportListener()
  {
    TAPReportListenerImpl tapReportListener = new TAPReportListenerImpl();
    return tapReportListener;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlDirectory createXmlDirectory()
  {
    XmlDirectoryImpl xmlDirectory = new XmlDirectoryImpl();
    return xmlDirectory;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlFile createXmlFile()
  {
    XmlFileImpl xmlFile = new XmlFileImpl();
    return xmlFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlHierarchicalReportListener createXmlHierarchicalReportListener()
  {
    XmlHierarchicalReportListenerImpl xmlHierarchicalReportListener = new XmlHierarchicalReportListenerImpl();
    return xmlHierarchicalReportListener;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlReportListener createXmlReportListener()
  {
    XmlReportListenerImpl xmlReportListener = new XmlReportListenerImpl();
    return xmlReportListener;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public RecipientTypeEnum createRecipientTypeEnumFromString(EDataType eDataType, String initialValue)
  {
    RecipientTypeEnum result = RecipientTypeEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertRecipientTypeEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TAPOutputTypeEnum createTAPOutputTypeEnumFromString(EDataType eDataType, String initialValue)
  {
    TAPOutputTypeEnum result = TAPOutputTypeEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertTAPOutputTypeEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public RecipientTypeEnum createRecipientTypeEnumObjectFromString(EDataType eDataType, String initialValue)
  {
    return createRecipientTypeEnumFromString(ListenersPackage.Literals.RECIPIENT_TYPE_ENUM, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertRecipientTypeEnumObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertRecipientTypeEnumToString(ListenersPackage.Literals.RECIPIENT_TYPE_ENUM, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TAPOutputTypeEnum createTAPOutputTypeEnumObjectFromString(EDataType eDataType, String initialValue)
  {
    return createTAPOutputTypeEnumFromString(ListenersPackage.Literals.TAP_OUTPUT_TYPE_ENUM, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertTAPOutputTypeEnumObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertTAPOutputTypeEnumToString(ListenersPackage.Literals.TAP_OUTPUT_TYPE_ENUM, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ListenersPackage getListenersPackage()
  {
    return (ListenersPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ListenersPackage getPackage()
  {
    return ListenersPackage.eINSTANCE;
  }

} // ListenersFactoryImpl
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
