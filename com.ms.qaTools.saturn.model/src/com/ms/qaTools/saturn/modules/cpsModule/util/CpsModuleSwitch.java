package com.ms.qaTools.saturn.modules.cpsModule.util;

import com.ms.qaTools.saturn.modules.cpsModule.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import com.ms.qaTools.saturn.modules.cpsModule.AbstractCpsOperation;
import com.ms.qaTools.saturn.modules.cpsModule.AbstractTerminationCondition;
import com.ms.qaTools.saturn.modules.cpsModule.CpsConfiguration;
import com.ms.qaTools.saturn.modules.cpsModule.CpsGetOperation;
import com.ms.qaTools.saturn.modules.cpsModule.CpsModulePackage;
import com.ms.qaTools.saturn.modules.cpsModule.CpsPutOperation;
import com.ms.qaTools.saturn.modules.cpsModule.CpsSowDeleteOperation;
import com.ms.qaTools.saturn.modules.cpsModule.CpsSubscribeOperation;
import com.ms.qaTools.saturn.modules.cpsModule.CpsUnsubscribeOperation;
import com.ms.qaTools.saturn.modules.cpsModule.DocumentRoot;
import com.ms.qaTools.saturn.modules.cpsModule.GroovyTerminationCondition;
import com.ms.qaTools.saturn.modules.cpsModule.PerlTerminationCondition;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.modules.cpsModule.CpsModulePackage
 * @generated
 */
public class CpsModuleSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static CpsModulePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CpsModuleSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = CpsModulePackage.eINSTANCE;
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
      case CpsModulePackage.ABSTRACT_CPS_OPERATION:
      {
        AbstractCpsOperation abstractCpsOperation = (AbstractCpsOperation)theEObject;
        T result = caseAbstractCpsOperation(abstractCpsOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CpsModulePackage.ABSTRACT_TERMINATION_CONDITION:
      {
        AbstractTerminationCondition abstractTerminationCondition = (AbstractTerminationCondition)theEObject;
        T result = caseAbstractTerminationCondition(abstractTerminationCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CpsModulePackage.CPS_CONFIGURATION:
      {
        CpsConfiguration cpsConfiguration = (CpsConfiguration)theEObject;
        T result = caseCpsConfiguration(cpsConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CpsModulePackage.CPS_GET_OPERATION:
      {
        CpsGetOperation cpsGetOperation = (CpsGetOperation)theEObject;
        T result = caseCpsGetOperation(cpsGetOperation);
        if (result == null) result = caseAbstractCpsOperation(cpsGetOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CpsModulePackage.CPS_PUT_OPERATION:
      {
        CpsPutOperation cpsPutOperation = (CpsPutOperation)theEObject;
        T result = caseCpsPutOperation(cpsPutOperation);
        if (result == null) result = caseAbstractCpsOperation(cpsPutOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CpsModulePackage.CPS_SOW_DELETE_OPERATION:
      {
        CpsSowDeleteOperation cpsSowDeleteOperation = (CpsSowDeleteOperation)theEObject;
        T result = caseCpsSowDeleteOperation(cpsSowDeleteOperation);
        if (result == null) result = caseAbstractCpsOperation(cpsSowDeleteOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CpsModulePackage.CPS_SUBSCRIBE_OPERATION:
      {
        CpsSubscribeOperation cpsSubscribeOperation = (CpsSubscribeOperation)theEObject;
        T result = caseCpsSubscribeOperation(cpsSubscribeOperation);
        if (result == null) result = caseAbstractCpsOperation(cpsSubscribeOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CpsModulePackage.CPS_UNSUBSCRIBE_OPERATION:
      {
        CpsUnsubscribeOperation cpsUnsubscribeOperation = (CpsUnsubscribeOperation)theEObject;
        T result = caseCpsUnsubscribeOperation(cpsUnsubscribeOperation);
        if (result == null) result = caseAbstractCpsOperation(cpsUnsubscribeOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CpsModulePackage.DOCUMENT_ROOT:
      {
        DocumentRoot documentRoot = (DocumentRoot)theEObject;
        T result = caseDocumentRoot(documentRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CpsModulePackage.GROOVY_TERMINATION_CONDITION:
      {
        GroovyTerminationCondition groovyTerminationCondition = (GroovyTerminationCondition)theEObject;
        T result = caseGroovyTerminationCondition(groovyTerminationCondition);
        if (result == null) result = caseAbstractTerminationCondition(groovyTerminationCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CpsModulePackage.PERL_TERMINATION_CONDITION:
      {
        PerlTerminationCondition perlTerminationCondition = (PerlTerminationCondition)theEObject;
        T result = casePerlTerminationCondition(perlTerminationCondition);
        if (result == null) result = caseAbstractTerminationCondition(perlTerminationCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Cps Operation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Cps Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractCpsOperation(AbstractCpsOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Termination Condition</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Termination Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractTerminationCondition(AbstractTerminationCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cps Configuration</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cps Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCpsConfiguration(CpsConfiguration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cps Get Operation</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cps Get Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCpsGetOperation(CpsGetOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cps Put Operation</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cps Put Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCpsPutOperation(CpsPutOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cps Sow Delete Operation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cps Sow Delete Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCpsSowDeleteOperation(CpsSowDeleteOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cps Subscribe Operation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cps Subscribe Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCpsSubscribeOperation(CpsSubscribeOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cps Unsubscribe Operation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cps Unsubscribe Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCpsUnsubscribeOperation(CpsUnsubscribeOperation object)
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
   * Returns the result of interpreting the object as an instance of '<em>Groovy Termination Condition</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Groovy Termination Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroovyTerminationCondition(GroovyTerminationCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Perl Termination Condition</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Perl Termination Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePerlTerminationCondition(PerlTerminationCondition object)
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

} // CpsModuleSwitch
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
