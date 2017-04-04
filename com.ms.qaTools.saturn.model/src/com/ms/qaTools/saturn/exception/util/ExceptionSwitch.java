package com.ms.qaTools.saturn.exception.util;

import com.ms.qaTools.saturn.exception.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import com.ms.qaTools.saturn.exception.CompareException;
import com.ms.qaTools.saturn.exception.CompareInitException;
import com.ms.qaTools.saturn.exception.DocumentRoot;
import com.ms.qaTools.saturn.exception.ExceptionPackage;
import com.ms.qaTools.saturn.exception.FileNotFoundException;
import com.ms.qaTools.saturn.exception.FileSystemException;
import com.ms.qaTools.saturn.exception.PermissionDeniedException;
import com.ms.qaTools.saturn.exception.QATUnknownCode;
import com.ms.qaTools.saturn.exception.RawException;
import com.ms.qaTools.saturn.exception.SATException;
import com.ms.qaTools.saturn.exception.StackTraceException;
import com.ms.qaTools.saturn.exception.TraceableException;
import com.ms.qaTools.saturn.exception.exception;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.exception.ExceptionPackage
 * @generated
 */
public class ExceptionSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static ExceptionPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ExceptionSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ExceptionPackage.eINSTANCE;
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
      case ExceptionPackage.COMPARE_EXCEPTION:
      {
        CompareException compareException = (CompareException)theEObject;
        T result = caseCompareException(compareException);
        if (result == null) result = caseTraceableException(compareException);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExceptionPackage.COMPARE_INIT_EXCEPTION:
      {
        CompareInitException compareInitException = (CompareInitException)theEObject;
        T result = caseCompareInitException(compareInitException);
        if (result == null) result = caseCompareException(compareInitException);
        if (result == null) result = caseTraceableException(compareInitException);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExceptionPackage.DOCUMENT_ROOT:
      {
        DocumentRoot documentRoot = (DocumentRoot)theEObject;
        T result = caseDocumentRoot(documentRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExceptionPackage.EXCEPTION:
      {
        exception exception = (exception)theEObject;
        T result = caseexception(exception);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExceptionPackage.FILE_NOT_FOUND_EXCEPTION:
      {
        FileNotFoundException fileNotFoundException = (FileNotFoundException)theEObject;
        T result = caseFileNotFoundException(fileNotFoundException);
        if (result == null) result = caseFileSystemException(fileNotFoundException);
        if (result == null) result = caseTraceableException(fileNotFoundException);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExceptionPackage.FILE_SYSTEM_EXCEPTION:
      {
        FileSystemException fileSystemException = (FileSystemException)theEObject;
        T result = caseFileSystemException(fileSystemException);
        if (result == null) result = caseTraceableException(fileSystemException);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExceptionPackage.PERMISSION_DENIED_EXCEPTION:
      {
        PermissionDeniedException permissionDeniedException = (PermissionDeniedException)theEObject;
        T result = casePermissionDeniedException(permissionDeniedException);
        if (result == null) result = caseFileSystemException(permissionDeniedException);
        if (result == null) result = caseTraceableException(permissionDeniedException);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExceptionPackage.QAT_UNKNOWN_CODE:
      {
        QATUnknownCode qatUnknownCode = (QATUnknownCode)theEObject;
        T result = caseQATUnknownCode(qatUnknownCode);
        if (result == null) result = caseTraceableException(qatUnknownCode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExceptionPackage.RAW_EXCEPTION:
      {
        RawException rawException = (RawException)theEObject;
        T result = caseRawException(rawException);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExceptionPackage.SAT_EXCEPTION:
      {
        SATException satException = (SATException)theEObject;
        T result = caseSATException(satException);
        if (result == null) result = caseTraceableException(satException);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExceptionPackage.STACK_TRACE_EXCEPTION:
      {
        StackTraceException stackTraceException = (StackTraceException)theEObject;
        T result = caseStackTraceException(stackTraceException);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExceptionPackage.TRACEABLE_EXCEPTION:
      {
        TraceableException traceableException = (TraceableException)theEObject;
        T result = caseTraceableException(traceableException);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compare Exception</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compare Exception</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompareException(CompareException object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compare Init Exception</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compare Init Exception</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompareInitException(CompareInitException object)
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
   * Returns the result of interpreting the object as an instance of '<em>exception</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>exception</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexception(exception object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>File Not Found Exception</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>File Not Found Exception</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFileNotFoundException(FileNotFoundException object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>File System Exception</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>File System Exception</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFileSystemException(FileSystemException object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Permission Denied Exception</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Permission Denied Exception</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePermissionDeniedException(PermissionDeniedException object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QAT Unknown Code</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QAT Unknown Code</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQATUnknownCode(QATUnknownCode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Raw Exception</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Raw Exception</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRawException(RawException object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SAT Exception</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SAT Exception</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSATException(SATException object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stack Trace Exception</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stack Trace Exception</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStackTraceException(StackTraceException object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Traceable Exception</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Traceable Exception</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTraceableException(TraceableException object)
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

} // ExceptionSwitch
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
