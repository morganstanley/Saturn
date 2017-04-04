/**
 * COPYRIGHT NOTICE AND DISCLAIMER
 *  
 * Copyright © 2009, Contributor
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License, version 3 for more details.
 * You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
 * THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
 */
package com.ms.qaTools.saturn.values.util;

import com.ms.qaTools.saturn.values.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.values.ValuesPackage
 * @generated
 */
public class ValuesSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ValuesPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValuesSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ValuesPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ValuesPackage.CELL_COMPLEX_VALUE:
      {
        CellComplexValue cellComplexValue = (CellComplexValue)theEObject;
        T result = caseCellComplexValue(cellComplexValue);
        if (result == null) result = caseFallible(cellComplexValue);
        if (result == null) result = caseDescribable(cellComplexValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ValuesPackage.CODE_COMPLEX_VALUE:
      {
        CodeComplexValue codeComplexValue = (CodeComplexValue)theEObject;
        T result = caseCodeComplexValue(codeComplexValue);
        if (result == null) result = caseFallibleComplexValue(codeComplexValue);
        if (result == null) result = caseComplexValue(codeComplexValue);
        if (result == null) result = caseFallible(codeComplexValue);
        if (result == null) result = caseDescribable(codeComplexValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ValuesPackage.COMPLEX_VALUE:
      {
        ComplexValue complexValue = (ComplexValue)theEObject;
        T result = caseComplexValue(complexValue);
        if (result == null) result = caseDescribable(complexValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ValuesPackage.DESCRIBABLE:
      {
        Describable describable = (Describable)theEObject;
        T result = caseDescribable(describable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ValuesPackage.FALLIBLE:
      {
        Fallible fallible = (Fallible)theEObject;
        T result = caseFallible(fallible);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ValuesPackage.FALLIBLE_COMPLEX_VALUE:
      {
        FallibleComplexValue fallibleComplexValue = (FallibleComplexValue)theEObject;
        T result = caseFallibleComplexValue(fallibleComplexValue);
        if (result == null) result = caseComplexValue(fallibleComplexValue);
        if (result == null) result = caseFallible(fallibleComplexValue);
        if (result == null) result = caseDescribable(fallibleComplexValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ValuesPackage.FIX_COMPLEX_VALUE:
      {
        FIXComplexValue fixComplexValue = (FIXComplexValue)theEObject;
        T result = caseFIXComplexValue(fixComplexValue);
        if (result == null) result = caseFallible(fixComplexValue);
        if (result == null) result = caseDescribable(fixComplexValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ValuesPackage.JSON_COMPLEX_VALUE:
      {
        JSONComplexValue jsonComplexValue = (JSONComplexValue)theEObject;
        T result = caseJSONComplexValue(jsonComplexValue);
        if (result == null) result = caseFallible(jsonComplexValue);
        if (result == null) result = caseDescribable(jsonComplexValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ValuesPackage.PROPERTY_COMPLEX_VALUE:
      {
        PropertyComplexValue propertyComplexValue = (PropertyComplexValue)theEObject;
        T result = casePropertyComplexValue(propertyComplexValue);
        if (result == null) result = caseFallible(propertyComplexValue);
        if (result == null) result = caseDescribable(propertyComplexValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ValuesPackage.REFERENCE_COMPLEX_VALUE:
      {
        ReferenceComplexValue referenceComplexValue = (ReferenceComplexValue)theEObject;
        T result = caseReferenceComplexValue(referenceComplexValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ValuesPackage.RUN_NUMBER_COMPLEX_VALUE:
      {
        RunNumberComplexValue runNumberComplexValue = (RunNumberComplexValue)theEObject;
        T result = caseRunNumberComplexValue(runNumberComplexValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ValuesPackage.TEXT_COMPLEX_VALUE:
      {
        TextComplexValue textComplexValue = (TextComplexValue)theEObject;
        T result = caseTextComplexValue(textComplexValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ValuesPackage.XPATH_COMPLEX_VALUE:
      {
        XPathComplexValue xPathComplexValue = (XPathComplexValue)theEObject;
        T result = caseXPathComplexValue(xPathComplexValue);
        if (result == null) result = caseFallible(xPathComplexValue);
        if (result == null) result = caseDescribable(xPathComplexValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cell Complex Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cell Complex Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCellComplexValue(CellComplexValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Code Complex Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Code Complex Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCodeComplexValue(CodeComplexValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
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
   * Returns the result of interpreting the object as an instance of '<em>Fallible</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fallible</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFallible(Fallible object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fallible Complex Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fallible Complex Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFallibleComplexValue(FallibleComplexValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FIX Complex Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FIX Complex Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFIXComplexValue(FIXComplexValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>JSON Complex Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>JSON Complex Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJSONComplexValue(JSONComplexValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Complex Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Complex Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyComplexValue(PropertyComplexValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference Complex Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference Complex Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferenceComplexValue(ReferenceComplexValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Run Number Complex Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Run Number Complex Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRunNumberComplexValue(RunNumberComplexValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Complex Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Complex Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextComplexValue(TextComplexValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XPath Complex Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XPath Complex Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXPathComplexValue(XPathComplexValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
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

} //ValuesSwitch
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
