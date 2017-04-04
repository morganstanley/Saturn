package com.ms.qaTools.saturn.exception.util;

import com.ms.qaTools.saturn.exception.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

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
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.exception.ExceptionPackage
 * @generated
 */
public class ExceptionAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static ExceptionPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ExceptionAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ExceptionPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc --> This implementation
   * returns <code>true</code> if the object is either the model's package or is an instance object of the model. <!--
   * end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected ExceptionSwitch<Adapter> modelSwitch = new ExceptionSwitch<Adapter>()
    {
      @Override
      public Adapter caseCompareException(CompareException object)
      {
        return createCompareExceptionAdapter();
      }
      @Override
      public Adapter caseCompareInitException(CompareInitException object)
      {
        return createCompareInitExceptionAdapter();
      }
      @Override
      public Adapter caseDocumentRoot(DocumentRoot object)
      {
        return createDocumentRootAdapter();
      }
      @Override
      public Adapter caseexception(exception object)
      {
        return createexceptionAdapter();
      }
      @Override
      public Adapter caseFileNotFoundException(FileNotFoundException object)
      {
        return createFileNotFoundExceptionAdapter();
      }
      @Override
      public Adapter caseFileSystemException(FileSystemException object)
      {
        return createFileSystemExceptionAdapter();
      }
      @Override
      public Adapter casePermissionDeniedException(PermissionDeniedException object)
      {
        return createPermissionDeniedExceptionAdapter();
      }
      @Override
      public Adapter caseQATUnknownCode(QATUnknownCode object)
      {
        return createQATUnknownCodeAdapter();
      }
      @Override
      public Adapter caseRawException(RawException object)
      {
        return createRawExceptionAdapter();
      }
      @Override
      public Adapter caseSATException(SATException object)
      {
        return createSATExceptionAdapter();
      }
      @Override
      public Adapter caseStackTraceException(StackTraceException object)
      {
        return createStackTraceExceptionAdapter();
      }
      @Override
      public Adapter caseTraceableException(TraceableException object)
      {
        return createTraceableExceptionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.exception.CompareException <em>Compare Exception</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.exception.CompareException
   * @generated
   */
  public Adapter createCompareExceptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.exception.CompareInitException <em>Compare Init Exception</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.exception.CompareInitException
   * @generated
   */
  public Adapter createCompareInitExceptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.exception.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.exception.DocumentRoot
   * @generated
   */
  public Adapter createDocumentRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.exception.exception <em>exception</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
   * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.exception.exception
   * @generated
   */
  public Adapter createexceptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.exception.FileNotFoundException <em>File Not Found Exception</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we
   * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.exception.FileNotFoundException
   * @generated
   */
  public Adapter createFileNotFoundExceptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.exception.FileSystemException <em>File System Exception</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.exception.FileSystemException
   * @generated
   */
  public Adapter createFileSystemExceptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.exception.PermissionDeniedException <em>Permission Denied Exception</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we
   * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.exception.PermissionDeniedException
   * @generated
   */
  public Adapter createPermissionDeniedExceptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.exception.QATUnknownCode <em>QAT Unknown Code</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.exception.QATUnknownCode
   * @generated
   */
  public Adapter createQATUnknownCodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.exception.RawException <em>Raw Exception</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.exception.RawException
   * @generated
   */
  public Adapter createRawExceptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.exception.SATException <em>SAT Exception</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.exception.SATException
   * @generated
   */
  public Adapter createSATExceptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.exception.StackTraceException <em>Stack Trace Exception</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.exception.StackTraceException
   * @generated
   */
  public Adapter createStackTraceExceptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.exception.TraceableException <em>Traceable Exception</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.exception.TraceableException
   * @generated
   */
  public Adapter createTraceableExceptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc --> This default implementation returns null. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} // ExceptionAdapterFactory
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
