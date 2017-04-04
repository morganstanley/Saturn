/**
 * COPYRIGHT NOTICE AND DISCLAIMER
 *  
 * Copyright © 2009, Contributor
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License, version 3 for more details.
 * You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
 * THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
 *
 * $Id$
 */
package com.ms.qaTools.saturn.modules.xmlManipModule.util;

import com.ms.qaTools.saturn.modules.xmlManipModule.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

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
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage
 * @generated
 */
public class XmlManipModuleAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static XmlManipModulePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlManipModuleAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = XmlManipModulePackage.eINSTANCE;
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
  protected XmlManipModuleSwitch<Adapter> modelSwitch = new XmlManipModuleSwitch<Adapter>()
    {
      @Override
      public Adapter caseAbstractOperation(AbstractOperation object)
      {
        return createAbstractOperationAdapter();
      }
      @Override
      public Adapter caseAddOperation(AddOperation object)
      {
        return createAddOperationAdapter();
      }
      @Override
      public Adapter caseCleanNamespacesOperation(CleanNamespacesOperation object)
      {
        return createCleanNamespacesOperationAdapter();
      }
      @Override
      public Adapter caseDeleteOperation(DeleteOperation object)
      {
        return createDeleteOperationAdapter();
      }
      @Override
      public Adapter caseDocumentRoot(DocumentRoot object)
      {
        return createDocumentRootAdapter();
      }
      @Override
      public Adapter caseExtractOperation(ExtractOperation object)
      {
        return createExtractOperationAdapter();
      }
      @Override
      public Adapter caseIntersectOperation(IntersectOperation object)
      {
        return createIntersectOperationAdapter();
      }
      @Override
      public Adapter caseRegisterFunctionOperation(RegisterFunctionOperation object)
      {
        return createRegisterFunctionOperationAdapter();
      }
      @Override
      public Adapter caseReplaceOperation(ReplaceOperation object)
      {
        return createReplaceOperationAdapter();
      }
      @Override
      public Adapter caseShiftOperation(ShiftOperation object)
      {
        return createShiftOperationAdapter();
      }
      @Override
      public Adapter caseSortOperation(SortOperation object)
      {
        return createSortOperationAdapter();
      }
      @Override
      public Adapter caseSplitOperation(SplitOperation object)
      {
        return createSplitOperationAdapter();
      }
      @Override
      public Adapter caseStripNamespacesOperation(StripNamespacesOperation object)
      {
        return createStripNamespacesOperationAdapter();
      }
      @Override
      public Adapter caseValueReplaceOperation(ValueReplaceOperation object)
      {
        return createValueReplaceOperationAdapter();
      }
      @Override
      public Adapter caseWhereOperation(WhereOperation object)
      {
        return createWhereOperationAdapter();
      }
      @Override
      public Adapter caseXmlManipConfiguration(XmlManipConfiguration object)
      {
        return createXmlManipConfigurationAdapter();
      }
      @Override
      public Adapter caseXmlManipNamespace(XmlManipNamespace object)
      {
        return createXmlManipNamespaceAdapter();
      }
      @Override
      public Adapter caseXPath(XPath object)
      {
        return createXPathAdapter();
      }
      @Override
      public Adapter caseDescribable(Describable object)
      {
        return createDescribableAdapter();
      }
      @Override
      public Adapter caseComplexValue(ComplexValue object)
      {
        return createComplexValueAdapter();
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
   * Creates a new adapter for an object of class '
   * {@link com.ms.qaTools.saturn.modules.xmlManipModule.AbstractOperation <em>Abstract Operation</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.AbstractOperation
   * @generated
   */
  public Adapter createAbstractOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation <em>Add Operation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation
   * @generated
   */
  public Adapter createAddOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.CleanNamespacesOperation <em>Clean Namespaces Operation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.CleanNamespacesOperation
   * @generated
   */
  public Adapter createCleanNamespacesOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.DeleteOperation <em>Delete Operation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.DeleteOperation
   * @generated
   */
  public Adapter createDeleteOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.DocumentRoot
   * @generated
   */
  public Adapter createDocumentRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.ExtractOperation <em>Extract Operation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.ExtractOperation
   * @generated
   */
  public Adapter createExtractOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '
   * {@link com.ms.qaTools.saturn.modules.xmlManipModule.IntersectOperation <em>Intersect Operation</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.IntersectOperation
   * @generated
   */
  public Adapter createIntersectOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.RegisterFunctionOperation <em>Register Function Operation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
   * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.RegisterFunctionOperation
   * @generated
   */
  public Adapter createRegisterFunctionOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.ReplaceOperation <em>Replace Operation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.ReplaceOperation
   * @generated
   */
  public Adapter createReplaceOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation <em>Shift Operation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation
   * @generated
   */
  public Adapter createShiftOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.SortOperation <em>Sort Operation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.SortOperation
   * @generated
   */
  public Adapter createSortOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.SplitOperation <em>Split Operation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.SplitOperation
   * @generated
   */
  public Adapter createSplitOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.StripNamespacesOperation <em>Strip Namespaces Operation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.StripNamespacesOperation
   * @generated
   */
  public Adapter createStripNamespacesOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '
   * {@link com.ms.qaTools.saturn.modules.xmlManipModule.ValueReplaceOperation <em>Value Replace Operation</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.ValueReplaceOperation
   * @generated
   */
  public Adapter createValueReplaceOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.WhereOperation <em>Where Operation</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.WhereOperation
   * @generated
   */
  public Adapter createWhereOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '
   * {@link com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipConfiguration <em>Xml Manip Configuration</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipConfiguration
   * @generated
   */
  public Adapter createXmlManipConfigurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '
   * {@link com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipNamespace <em>Xml Manip Namespace</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipNamespace
   * @generated
   */
  public Adapter createXmlManipNamespaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.XPath <em>XPath</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
   * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XPath
   * @generated
   */
  public Adapter createXPathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.values.Describable <em>Describable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.values.Describable
   * @generated
   */
  public Adapter createDescribableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.values.ComplexValue <em>Complex Value</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.values.ComplexValue
   * @generated
   */
  public Adapter createComplexValueAdapter()
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

} // XmlManipModuleAdapterFactory
