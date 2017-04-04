package com.ms.qaTools.saturn.modules.psManagerModule.util;

import com.ms.qaTools.saturn.modules.psManagerModule.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import com.ms.qaTools.saturn.modules.psManagerModule.AbstractOperation;
import com.ms.qaTools.saturn.modules.psManagerModule.CheckSessionDownOperation;
import com.ms.qaTools.saturn.modules.psManagerModule.CheckSessionUpOperation;
import com.ms.qaTools.saturn.modules.psManagerModule.DocumentRoot;
import com.ms.qaTools.saturn.modules.psManagerModule.LaunchProcessOperation;
import com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation;
import com.ms.qaTools.saturn.modules.psManagerModule.PsManagerConfiguration;
import com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModulePackage;
import com.ms.qaTools.saturn.modules.psManagerModule.RemoveSessionOperation;
import com.ms.qaTools.saturn.modules.psManagerModule.TerminateProcessOperation;
import com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModulePackage
 * @generated
 */
public class PsManagerModuleSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static PsManagerModulePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PsManagerModuleSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PsManagerModulePackage.eINSTANCE;
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
      case PsManagerModulePackage.ABSTRACT_OPERATION:
      {
        AbstractOperation abstractOperation = (AbstractOperation)theEObject;
        T result = caseAbstractOperation(abstractOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsManagerModulePackage.CHECK_SESSION_DOWN_OPERATION:
      {
        CheckSessionDownOperation checkSessionDownOperation = (CheckSessionDownOperation)theEObject;
        T result = caseCheckSessionDownOperation(checkSessionDownOperation);
        if (result == null) result = caseAbstractOperation(checkSessionDownOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsManagerModulePackage.CHECK_SESSION_UP_OPERATION:
      {
        CheckSessionUpOperation checkSessionUpOperation = (CheckSessionUpOperation)theEObject;
        T result = caseCheckSessionUpOperation(checkSessionUpOperation);
        if (result == null) result = caseAbstractOperation(checkSessionUpOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsManagerModulePackage.DOCUMENT_ROOT:
      {
        DocumentRoot documentRoot = (DocumentRoot)theEObject;
        T result = caseDocumentRoot(documentRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsManagerModulePackage.LAUNCH_PROCESS_OPERATION:
      {
        LaunchProcessOperation launchProcessOperation = (LaunchProcessOperation)theEObject;
        T result = caseLaunchProcessOperation(launchProcessOperation);
        if (result == null) result = caseAbstractOperation(launchProcessOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsManagerModulePackage.LAUNCH_SESSION_OPERATION:
      {
        LaunchSessionOperation launchSessionOperation = (LaunchSessionOperation)theEObject;
        T result = caseLaunchSessionOperation(launchSessionOperation);
        if (result == null) result = caseAbstractOperation(launchSessionOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsManagerModulePackage.PS_MANAGER_CONFIGURATION:
      {
        PsManagerConfiguration psManagerConfiguration = (PsManagerConfiguration)theEObject;
        T result = casePsManagerConfiguration(psManagerConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsManagerModulePackage.REMOVE_SESSION_OPERATION:
      {
        RemoveSessionOperation removeSessionOperation = (RemoveSessionOperation)theEObject;
        T result = caseRemoveSessionOperation(removeSessionOperation);
        if (result == null) result = caseAbstractOperation(removeSessionOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsManagerModulePackage.TERMINATE_PROCESS_OPERATION:
      {
        TerminateProcessOperation terminateProcessOperation = (TerminateProcessOperation)theEObject;
        T result = caseTerminateProcessOperation(terminateProcessOperation);
        if (result == null) result = caseAbstractOperation(terminateProcessOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsManagerModulePackage.TERMINATE_SESSION_OPERATION:
      {
        TerminateSessionOperation terminateSessionOperation = (TerminateSessionOperation)theEObject;
        T result = caseTerminateSessionOperation(terminateSessionOperation);
        if (result == null) result = caseAbstractOperation(terminateSessionOperation);
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
   * Returns the result of interpreting the object as an instance of '<em>Check Session Down Operation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check Session Down Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckSessionDownOperation(CheckSessionDownOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Check Session Up Operation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check Session Up Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckSessionUpOperation(CheckSessionUpOperation object)
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
   * Returns the result of interpreting the object as an instance of '<em>Launch Process Operation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Launch Process Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLaunchProcessOperation(LaunchProcessOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Launch Session Operation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Launch Session Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLaunchSessionOperation(LaunchSessionOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ps Manager Configuration</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ps Manager Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePsManagerConfiguration(PsManagerConfiguration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Remove Session Operation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Remove Session Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRemoveSessionOperation(RemoveSessionOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Terminate Process Operation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Terminate Process Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerminateProcessOperation(TerminateProcessOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Terminate Session Operation</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Terminate Session Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerminateSessionOperation(TerminateSessionOperation object)
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

} // PsManagerModuleSwitch
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
