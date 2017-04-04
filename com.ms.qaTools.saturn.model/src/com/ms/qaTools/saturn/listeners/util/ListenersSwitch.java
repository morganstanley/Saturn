package com.ms.qaTools.saturn.listeners.util;

import com.ms.qaTools.saturn.listeners.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import com.ms.qaTools.saturn.listeners.ConsoleReportListener;
import com.ms.qaTools.saturn.listeners.DataSetReportListener;
import com.ms.qaTools.saturn.listeners.EMailPostExecutionListener;
import com.ms.qaTools.saturn.listeners.ID;
import com.ms.qaTools.saturn.listeners.ListenersPackage;
import com.ms.qaTools.saturn.listeners.MailConfiguration;
import com.ms.qaTools.saturn.listeners.MailRecipient;
import com.ms.qaTools.saturn.listeners.ScenarioReportListener;
import com.ms.qaTools.saturn.listeners.TAPReportListener;
import com.ms.qaTools.saturn.listeners.XmlDirectory;
import com.ms.qaTools.saturn.listeners.XmlFile;
import com.ms.qaTools.saturn.listeners.XmlHierarchicalReportListener;
import com.ms.qaTools.saturn.listeners.XmlReportListener;
import com.ms.qaTools.saturn.types.AbstractListener;
import com.ms.qaTools.saturn.values.ComplexValue;
import com.ms.qaTools.saturn.values.Describable;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.listeners.ListenersPackage
 * @generated
 */
public class ListenersSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static ListenersPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ListenersSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ListenersPackage.eINSTANCE;
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
      case ListenersPackage.CONSOLE_REPORT_LISTENER:
      {
        ConsoleReportListener consoleReportListener = (ConsoleReportListener)theEObject;
        T result = caseConsoleReportListener(consoleReportListener);
        if (result == null) result = caseAbstractListener(consoleReportListener);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ListenersPackage.DATA_SET_REPORT_LISTENER:
      {
        DataSetReportListener dataSetReportListener = (DataSetReportListener)theEObject;
        T result = caseDataSetReportListener(dataSetReportListener);
        if (result == null) result = caseAbstractListener(dataSetReportListener);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ListenersPackage.EMAIL_POST_EXECUTION_LISTENER:
      {
        EMailPostExecutionListener eMailPostExecutionListener = (EMailPostExecutionListener)theEObject;
        T result = caseEMailPostExecutionListener(eMailPostExecutionListener);
        if (result == null) result = caseAbstractListener(eMailPostExecutionListener);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ListenersPackage.ID:
      {
        ID id = (ID)theEObject;
        T result = caseID(id);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ListenersPackage.MAIL_CONFIGURATION:
      {
        MailConfiguration mailConfiguration = (MailConfiguration)theEObject;
        T result = caseMailConfiguration(mailConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ListenersPackage.MAIL_RECIPIENT:
      {
        MailRecipient mailRecipient = (MailRecipient)theEObject;
        T result = caseMailRecipient(mailRecipient);
        if (result == null) result = caseComplexValue(mailRecipient);
        if (result == null) result = caseDescribable(mailRecipient);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ListenersPackage.SCENARIO_REPORT_LISTENER:
      {
        ScenarioReportListener scenarioReportListener = (ScenarioReportListener)theEObject;
        T result = caseScenarioReportListener(scenarioReportListener);
        if (result == null) result = caseAbstractListener(scenarioReportListener);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ListenersPackage.TAP_REPORT_LISTENER:
      {
        TAPReportListener tapReportListener = (TAPReportListener)theEObject;
        T result = caseTAPReportListener(tapReportListener);
        if (result == null) result = caseAbstractListener(tapReportListener);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ListenersPackage.XML_DIRECTORY:
      {
        XmlDirectory xmlDirectory = (XmlDirectory)theEObject;
        T result = caseXmlDirectory(xmlDirectory);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ListenersPackage.XML_FILE:
      {
        XmlFile xmlFile = (XmlFile)theEObject;
        T result = caseXmlFile(xmlFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ListenersPackage.XML_HIERARCHICAL_REPORT_LISTENER:
      {
        XmlHierarchicalReportListener xmlHierarchicalReportListener = (XmlHierarchicalReportListener)theEObject;
        T result = caseXmlHierarchicalReportListener(xmlHierarchicalReportListener);
        if (result == null) result = caseAbstractListener(xmlHierarchicalReportListener);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ListenersPackage.XML_REPORT_LISTENER:
      {
        XmlReportListener xmlReportListener = (XmlReportListener)theEObject;
        T result = caseXmlReportListener(xmlReportListener);
        if (result == null) result = caseAbstractListener(xmlReportListener);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Console Report Listener</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Console Report Listener</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConsoleReportListener(ConsoleReportListener object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Set Report Listener</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Set Report Listener</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataSetReportListener(DataSetReportListener object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EMail Post Execution Listener</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EMail Post Execution Listener</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEMailPostExecutionListener(EMailPostExecutionListener object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ID</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ID</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseID(ID object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mail Configuration</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mail Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMailConfiguration(MailConfiguration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mail Recipient</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mail Recipient</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMailRecipient(MailRecipient object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scenario Report Listener</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scenario Report Listener</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScenarioReportListener(ScenarioReportListener object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TAP Report Listener</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TAP Report Listener</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTAPReportListener(TAPReportListener object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Xml Directory</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Xml Directory</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXmlDirectory(XmlDirectory object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Xml File</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Xml File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXmlFile(XmlFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Xml Hierarchical Report Listener</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Xml Hierarchical Report Listener</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXmlHierarchicalReportListener(XmlHierarchicalReportListener object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Xml Report Listener</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Xml Report Listener</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXmlReportListener(XmlReportListener object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Listener</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Listener</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractListener(AbstractListener object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Describable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Describable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDescribable(Describable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexValue(ComplexValue object)
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

} // ListenersSwitch
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
