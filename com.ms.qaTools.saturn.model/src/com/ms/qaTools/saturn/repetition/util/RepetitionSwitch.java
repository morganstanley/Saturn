package com.ms.qaTools.saturn.repetition.util;

import com.ms.qaTools.saturn.repetition.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import com.ms.qaTools.saturn.repetition.ColumnMapping;
import com.ms.qaTools.saturn.repetition.ForEachRepetition;
import com.ms.qaTools.saturn.repetition.ForEachXPathRepetition;
import com.ms.qaTools.saturn.repetition.ForRepetition;
import com.ms.qaTools.saturn.repetition.ForRepetitionIterator;
import com.ms.qaTools.saturn.repetition.RepetitionPackage;
import com.ms.qaTools.saturn.repetition.XPathMapping;
import com.ms.qaTools.saturn.types.AbstractRepetitionHandler;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.repetition.RepetitionPackage
 * @generated
 */
public class RepetitionSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static RepetitionPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public RepetitionSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RepetitionPackage.eINSTANCE;
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
      case RepetitionPackage.COLUMN_MAPPING:
      {
        ColumnMapping columnMapping = (ColumnMapping)theEObject;
        T result = caseColumnMapping(columnMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepetitionPackage.FOR_EACH_REPETITION:
      {
        ForEachRepetition forEachRepetition = (ForEachRepetition)theEObject;
        T result = caseForEachRepetition(forEachRepetition);
        if (result == null) result = caseAbstractRepetitionHandler(forEachRepetition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepetitionPackage.FOR_EACH_XPATH_REPETITION:
      {
        ForEachXPathRepetition forEachXPathRepetition = (ForEachXPathRepetition)theEObject;
        T result = caseForEachXPathRepetition(forEachXPathRepetition);
        if (result == null) result = caseAbstractRepetitionHandler(forEachXPathRepetition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepetitionPackage.FOR_REPETITION:
      {
        ForRepetition forRepetition = (ForRepetition)theEObject;
        T result = caseForRepetition(forRepetition);
        if (result == null) result = caseAbstractRepetitionHandler(forRepetition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepetitionPackage.FOR_REPETITION_ITERATOR:
      {
        ForRepetitionIterator forRepetitionIterator = (ForRepetitionIterator)theEObject;
        T result = caseForRepetitionIterator(forRepetitionIterator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RepetitionPackage.XPATH_MAPPING:
      {
        XPathMapping xPathMapping = (XPathMapping)theEObject;
        T result = caseXPathMapping(xPathMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Column Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Column Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColumnMapping(ColumnMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Each Repetition</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Each Repetition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForEachRepetition(ForEachRepetition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Each XPath Repetition</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Each XPath Repetition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForEachXPathRepetition(ForEachXPathRepetition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Repetition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Repetition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForRepetition(ForRepetition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Repetition Iterator</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Repetition Iterator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForRepetitionIterator(ForRepetitionIterator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XPath Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XPath Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXPathMapping(XPathMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Repetition Handler</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Repetition Handler</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractRepetitionHandler(AbstractRepetitionHandler object)
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

} // RepetitionSwitch
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
