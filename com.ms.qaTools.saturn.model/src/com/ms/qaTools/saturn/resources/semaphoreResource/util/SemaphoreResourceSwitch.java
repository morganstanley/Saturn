package com.ms.qaTools.saturn.resources.semaphoreResource.util;

import com.ms.qaTools.saturn.resources.semaphoreResource.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import com.ms.qaTools.saturn.resources.semaphoreResource.LocalSemaphoreProvider;
import com.ms.qaTools.saturn.resources.semaphoreResource.ObtainSemaphoreResource;
import com.ms.qaTools.saturn.resources.semaphoreResource.ReleaseSemaphoreResource;
import com.ms.qaTools.saturn.resources.semaphoreResource.RemoteSemaphoreProvider;
import com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreDefinition;
import com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreProvider;
import com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreResource;
import com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreResourcePackage;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreResourcePackage
 * @generated
 */
public class SemaphoreResourceSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static SemaphoreResourcePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SemaphoreResourceSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SemaphoreResourcePackage.eINSTANCE;
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
      case SemaphoreResourcePackage.LOCAL_SEMAPHORE_PROVIDER:
      {
        LocalSemaphoreProvider localSemaphoreProvider = (LocalSemaphoreProvider)theEObject;
        T result = caseLocalSemaphoreProvider(localSemaphoreProvider);
        if (result == null) result = caseSemaphoreProvider(localSemaphoreProvider);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SemaphoreResourcePackage.OBTAIN_SEMAPHORE_RESOURCE:
      {
        ObtainSemaphoreResource obtainSemaphoreResource = (ObtainSemaphoreResource)theEObject;
        T result = caseObtainSemaphoreResource(obtainSemaphoreResource);
        if (result == null) result = caseNamedResourceDefinition(obtainSemaphoreResource);
        if (result == null) result = caseResourceDefinition(obtainSemaphoreResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SemaphoreResourcePackage.RELEASE_SEMAPHORE_RESOURCE:
      {
        ReleaseSemaphoreResource releaseSemaphoreResource = (ReleaseSemaphoreResource)theEObject;
        T result = caseReleaseSemaphoreResource(releaseSemaphoreResource);
        if (result == null) result = caseNamedResourceDefinition(releaseSemaphoreResource);
        if (result == null) result = caseResourceDefinition(releaseSemaphoreResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SemaphoreResourcePackage.REMOTE_SEMAPHORE_PROVIDER:
      {
        RemoteSemaphoreProvider remoteSemaphoreProvider = (RemoteSemaphoreProvider)theEObject;
        T result = caseRemoteSemaphoreProvider(remoteSemaphoreProvider);
        if (result == null) result = caseSemaphoreProvider(remoteSemaphoreProvider);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SemaphoreResourcePackage.SEMAPHORE_DEFINITION:
      {
        SemaphoreDefinition semaphoreDefinition = (SemaphoreDefinition)theEObject;
        T result = caseSemaphoreDefinition(semaphoreDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SemaphoreResourcePackage.SEMAPHORE_PROVIDER:
      {
        SemaphoreProvider semaphoreProvider = (SemaphoreProvider)theEObject;
        T result = caseSemaphoreProvider(semaphoreProvider);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SemaphoreResourcePackage.SEMAPHORE_RESOURCE:
      {
        SemaphoreResource semaphoreResource = (SemaphoreResource)theEObject;
        T result = caseSemaphoreResource(semaphoreResource);
        if (result == null) result = caseNamedResourceDefinition(semaphoreResource);
        if (result == null) result = caseResourceDefinition(semaphoreResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Semaphore Provider</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Semaphore Provider</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalSemaphoreProvider(LocalSemaphoreProvider object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Obtain Semaphore Resource</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Obtain Semaphore Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObtainSemaphoreResource(ObtainSemaphoreResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Release Semaphore Resource</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Release Semaphore Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReleaseSemaphoreResource(ReleaseSemaphoreResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Remote Semaphore Provider</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Remote Semaphore Provider</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRemoteSemaphoreProvider(RemoteSemaphoreProvider object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Semaphore Definition</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Semaphore Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSemaphoreDefinition(SemaphoreDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Semaphore Provider</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Semaphore Provider</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSemaphoreProvider(SemaphoreProvider object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Semaphore Resource</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Semaphore Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSemaphoreResource(SemaphoreResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Definition</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceDefinition(ResourceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Resource Definition</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Resource Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedResourceDefinition(NamedResourceDefinition object)
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

} // SemaphoreResourceSwitch
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
