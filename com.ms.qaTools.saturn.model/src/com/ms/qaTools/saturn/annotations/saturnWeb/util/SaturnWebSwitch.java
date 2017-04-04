package com.ms.qaTools.saturn.annotations.saturnWeb.util;

import com.ms.qaTools.saturn.annotations.saturnWeb.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import com.ms.qaTools.saturn.annotations.saturnWeb.AbstractSourceDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.AbstractTargetDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.DropDownOption;
import com.ms.qaTools.saturn.annotations.saturnWeb.DropDownSourceDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.FileSelectorSourceDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebConfiguration;
import com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage;
import com.ms.qaTools.saturn.annotations.saturnWeb.SingleValueEnvVarTargetDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.SingleValueTargetDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.TextSourceDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.ValueDefinition;
import com.ms.qaTools.saturn.types.AbstractAnnotation;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage
 * @generated
 */
public class SaturnWebSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static SaturnWebPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SaturnWebSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SaturnWebPackage.eINSTANCE;
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
      case SaturnWebPackage.ABSTRACT_SOURCE_DEFINITION:
      {
        AbstractSourceDefinition abstractSourceDefinition = (AbstractSourceDefinition)theEObject;
        T result = caseAbstractSourceDefinition(abstractSourceDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnWebPackage.ABSTRACT_TARGET_DEFINITION:
      {
        AbstractTargetDefinition abstractTargetDefinition = (AbstractTargetDefinition)theEObject;
        T result = caseAbstractTargetDefinition(abstractTargetDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnWebPackage.DROP_DOWN_OPTION:
      {
        DropDownOption dropDownOption = (DropDownOption)theEObject;
        T result = caseDropDownOption(dropDownOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnWebPackage.DROP_DOWN_SOURCE_DEFINITION:
      {
        DropDownSourceDefinition dropDownSourceDefinition = (DropDownSourceDefinition)theEObject;
        T result = caseDropDownSourceDefinition(dropDownSourceDefinition);
        if (result == null) result = caseAbstractSourceDefinition(dropDownSourceDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnWebPackage.FILE_SELECTOR_SOURCE_DEFINITION:
      {
        FileSelectorSourceDefinition fileSelectorSourceDefinition = (FileSelectorSourceDefinition)theEObject;
        T result = caseFileSelectorSourceDefinition(fileSelectorSourceDefinition);
        if (result == null) result = caseAbstractSourceDefinition(fileSelectorSourceDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnWebPackage.SATURN_WEB_CONFIGURATION:
      {
        SaturnWebConfiguration saturnWebConfiguration = (SaturnWebConfiguration)theEObject;
        T result = caseSaturnWebConfiguration(saturnWebConfiguration);
        if (result == null) result = caseAbstractAnnotation(saturnWebConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnWebPackage.SINGLE_VALUE_ENV_VAR_TARGET_DEFINITION:
      {
        SingleValueEnvVarTargetDefinition singleValueEnvVarTargetDefinition = (SingleValueEnvVarTargetDefinition)theEObject;
        T result = caseSingleValueEnvVarTargetDefinition(singleValueEnvVarTargetDefinition);
        if (result == null) result = caseSingleValueTargetDefinition(singleValueEnvVarTargetDefinition);
        if (result == null) result = caseAbstractTargetDefinition(singleValueEnvVarTargetDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnWebPackage.SINGLE_VALUE_TARGET_DEFINITION:
      {
        SingleValueTargetDefinition singleValueTargetDefinition = (SingleValueTargetDefinition)theEObject;
        T result = caseSingleValueTargetDefinition(singleValueTargetDefinition);
        if (result == null) result = caseAbstractTargetDefinition(singleValueTargetDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnWebPackage.TEXT_SOURCE_DEFINITION:
      {
        TextSourceDefinition textSourceDefinition = (TextSourceDefinition)theEObject;
        T result = caseTextSourceDefinition(textSourceDefinition);
        if (result == null) result = caseAbstractSourceDefinition(textSourceDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnWebPackage.VALUE_DEFINITION:
      {
        ValueDefinition valueDefinition = (ValueDefinition)theEObject;
        T result = caseValueDefinition(valueDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Source Definition</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Source Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractSourceDefinition(AbstractSourceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Target Definition</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Target Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractTargetDefinition(AbstractTargetDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Drop Down Option</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Drop Down Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDropDownOption(DropDownOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Drop Down Source Definition</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Drop Down Source Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDropDownSourceDefinition(DropDownSourceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>File Selector Source Definition</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>File Selector Source Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFileSelectorSourceDefinition(FileSelectorSourceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSaturnWebConfiguration(SaturnWebConfiguration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Value Env Var Target Definition</em>'.
   * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Value Env Var Target Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleValueEnvVarTargetDefinition(SingleValueEnvVarTargetDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Value Target Definition</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Value Target Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleValueTargetDefinition(SingleValueTargetDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Source Definition</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Source Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextSourceDefinition(TextSourceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Definition</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueDefinition(ValueDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Annotation</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractAnnotation(AbstractAnnotation object)
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

} // SaturnWebSwitch
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
