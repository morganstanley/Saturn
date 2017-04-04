package com.ms.qaTools.saturn.modules.xmlManipModule.util;

import com.ms.qaTools.saturn.modules.xmlManipModule.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import com.ms.qaTools.saturn.modules.xmlManipModule.AbstractOperation;
import com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation;
import com.ms.qaTools.saturn.modules.xmlManipModule.CleanNamespacesOperation;
import com.ms.qaTools.saturn.modules.xmlManipModule.DeleteOperation;
import com.ms.qaTools.saturn.modules.xmlManipModule.DocumentRoot;
import com.ms.qaTools.saturn.modules.xmlManipModule.ExtractOperation;
import com.ms.qaTools.saturn.modules.xmlManipModule.IntersectOperation;
import com.ms.qaTools.saturn.modules.xmlManipModule.RegisterFunctionOperation;
import com.ms.qaTools.saturn.modules.xmlManipModule.ReplaceOperation;
import com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation;
import com.ms.qaTools.saturn.modules.xmlManipModule.SortOperation;
import com.ms.qaTools.saturn.modules.xmlManipModule.SplitOperation;
import com.ms.qaTools.saturn.modules.xmlManipModule.StripNamespacesOperation;
import com.ms.qaTools.saturn.modules.xmlManipModule.ValueReplaceOperation;
import com.ms.qaTools.saturn.modules.xmlManipModule.WhereOperation;
import com.ms.qaTools.saturn.modules.xmlManipModule.XPath;
import com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipConfiguration;
import com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage;
import com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipNamespace;
import com.ms.qaTools.saturn.values.ComplexValue;
import com.ms.qaTools.saturn.values.Describable;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage
 * @generated
 */
public class XmlManipModuleSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static XmlManipModulePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlManipModuleSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = XmlManipModulePackage.eINSTANCE;
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
      case XmlManipModulePackage.ABSTRACT_OPERATION:
      {
        AbstractOperation abstractOperation = (AbstractOperation)theEObject;
        T result = caseAbstractOperation(abstractOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XmlManipModulePackage.ADD_OPERATION:
      {
        AddOperation addOperation = (AddOperation)theEObject;
        T result = caseAddOperation(addOperation);
        if (result == null) result = caseAbstractOperation(addOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XmlManipModulePackage.CLEAN_NAMESPACES_OPERATION:
      {
        CleanNamespacesOperation cleanNamespacesOperation = (CleanNamespacesOperation)theEObject;
        T result = caseCleanNamespacesOperation(cleanNamespacesOperation);
        if (result == null) result = caseAbstractOperation(cleanNamespacesOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XmlManipModulePackage.DELETE_OPERATION:
      {
        DeleteOperation deleteOperation = (DeleteOperation)theEObject;
        T result = caseDeleteOperation(deleteOperation);
        if (result == null) result = caseAbstractOperation(deleteOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XmlManipModulePackage.DOCUMENT_ROOT:
      {
        DocumentRoot documentRoot = (DocumentRoot)theEObject;
        T result = caseDocumentRoot(documentRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XmlManipModulePackage.EXTRACT_OPERATION:
      {
        ExtractOperation extractOperation = (ExtractOperation)theEObject;
        T result = caseExtractOperation(extractOperation);
        if (result == null) result = caseAbstractOperation(extractOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XmlManipModulePackage.INTERSECT_OPERATION:
      {
        IntersectOperation intersectOperation = (IntersectOperation)theEObject;
        T result = caseIntersectOperation(intersectOperation);
        if (result == null) result = caseAbstractOperation(intersectOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XmlManipModulePackage.REGISTER_FUNCTION_OPERATION:
      {
        RegisterFunctionOperation registerFunctionOperation = (RegisterFunctionOperation)theEObject;
        T result = caseRegisterFunctionOperation(registerFunctionOperation);
        if (result == null) result = caseAbstractOperation(registerFunctionOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XmlManipModulePackage.REPLACE_OPERATION:
      {
        ReplaceOperation replaceOperation = (ReplaceOperation)theEObject;
        T result = caseReplaceOperation(replaceOperation);
        if (result == null) result = caseAbstractOperation(replaceOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XmlManipModulePackage.SHIFT_OPERATION:
      {
        ShiftOperation shiftOperation = (ShiftOperation)theEObject;
        T result = caseShiftOperation(shiftOperation);
        if (result == null) result = caseAbstractOperation(shiftOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XmlManipModulePackage.SORT_OPERATION:
      {
        SortOperation sortOperation = (SortOperation)theEObject;
        T result = caseSortOperation(sortOperation);
        if (result == null) result = caseAbstractOperation(sortOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XmlManipModulePackage.SPLIT_OPERATION:
      {
        SplitOperation splitOperation = (SplitOperation)theEObject;
        T result = caseSplitOperation(splitOperation);
        if (result == null) result = caseAbstractOperation(splitOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XmlManipModulePackage.STRIP_NAMESPACES_OPERATION:
      {
        StripNamespacesOperation stripNamespacesOperation = (StripNamespacesOperation)theEObject;
        T result = caseStripNamespacesOperation(stripNamespacesOperation);
        if (result == null) result = caseAbstractOperation(stripNamespacesOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XmlManipModulePackage.VALUE_REPLACE_OPERATION:
      {
        ValueReplaceOperation valueReplaceOperation = (ValueReplaceOperation)theEObject;
        T result = caseValueReplaceOperation(valueReplaceOperation);
        if (result == null) result = caseAbstractOperation(valueReplaceOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XmlManipModulePackage.WHERE_OPERATION:
      {
        WhereOperation whereOperation = (WhereOperation)theEObject;
        T result = caseWhereOperation(whereOperation);
        if (result == null) result = caseAbstractOperation(whereOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XmlManipModulePackage.XML_MANIP_CONFIGURATION:
      {
        XmlManipConfiguration xmlManipConfiguration = (XmlManipConfiguration)theEObject;
        T result = caseXmlManipConfiguration(xmlManipConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XmlManipModulePackage.XML_MANIP_NAMESPACE:
      {
        XmlManipNamespace xmlManipNamespace = (XmlManipNamespace)theEObject;
        T result = caseXmlManipNamespace(xmlManipNamespace);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XmlManipModulePackage.XPATH:
      {
        XPath xPath = (XPath)theEObject;
        T result = caseXPath(xPath);
        if (result == null) result = caseComplexValue(xPath);
        if (result == null) result = caseDescribable(xPath);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Operation</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractOperation(AbstractOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddOperation(AddOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Clean Namespaces Operation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clean Namespaces Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCleanNamespacesOperation(CleanNamespacesOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delete Operation</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delete Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeleteOperation(DeleteOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocumentRoot(DocumentRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extract Operation</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extract Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtractOperation(ExtractOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Intersect Operation</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Intersect Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntersectOperation(IntersectOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Register Function Operation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Register Function Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegisterFunctionOperation(RegisterFunctionOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Replace Operation</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Replace Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReplaceOperation(ReplaceOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shift Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shift Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShiftOperation(ShiftOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sort Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sort Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSortOperation(SortOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Split Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Split Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSplitOperation(SplitOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Strip Namespaces Operation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Strip Namespaces Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStripNamespacesOperation(StripNamespacesOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Replace Operation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Replace Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueReplaceOperation(ValueReplaceOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Where Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Where Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhereOperation(WhereOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Xml Manip Configuration</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Xml Manip Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXmlManipConfiguration(XmlManipConfiguration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Xml Manip Namespace</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Xml Manip Namespace</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXmlManipNamespace(XmlManipNamespace object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XPath</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XPath</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXPath(XPath object)
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

} // XmlManipModuleSwitch
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
