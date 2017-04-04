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
package com.ms.qaTools.saturn.types.util;

import com.ms.qaTools.saturn.types.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import com.ms.qaTools.saturn.types.AbstractAnnotation;
import com.ms.qaTools.saturn.types.AbstractBatchListener;
import com.ms.qaTools.saturn.types.AbstractListener;
import com.ms.qaTools.saturn.types.AbstractRepetitionHandler;
import com.ms.qaTools.saturn.types.AbstractRunGroupModifier;
import com.ms.qaTools.saturn.types.Column;
import com.ms.qaTools.saturn.types.Comment;
import com.ms.qaTools.saturn.types.ComplexValueMap;
import com.ms.qaTools.saturn.types.ComplexValuePair;
import com.ms.qaTools.saturn.types.DataSet;
import com.ms.qaTools.saturn.types.DataSetInstance;
import com.ms.qaTools.saturn.types.DataSetResourceDefinition;
import com.ms.qaTools.saturn.types.DeviceResourceDefinition;
import com.ms.qaTools.saturn.types.Empty;
import com.ms.qaTools.saturn.types.InlineDeviceResourceDefinition;
import com.ms.qaTools.saturn.types.InlineNamespaceUriDefinition;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.types.RowInstance;
import com.ms.qaTools.saturn.types.TypesPackage;
import com.ms.qaTools.saturn.types.XmlNamespaceDefinition;
import com.ms.qaTools.saturn.types.XmlUriDefinition;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.types.TypesPackage
 * @generated
 */
public class TypesSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static TypesPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TypesSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = TypesPackage.eINSTANCE;
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
      case TypesPackage.ABSTRACT_ANNOTATION:
      {
        AbstractAnnotation abstractAnnotation = (AbstractAnnotation)theEObject;
        T result = caseAbstractAnnotation(abstractAnnotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesPackage.ABSTRACT_BATCH_LISTENER:
      {
        AbstractBatchListener abstractBatchListener = (AbstractBatchListener)theEObject;
        T result = caseAbstractBatchListener(abstractBatchListener);
        if (result == null) result = caseAbstractListener(abstractBatchListener);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesPackage.ABSTRACT_LISTENER:
      {
        AbstractListener abstractListener = (AbstractListener)theEObject;
        T result = caseAbstractListener(abstractListener);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesPackage.ABSTRACT_REPETITION_HANDLER:
      {
        AbstractRepetitionHandler abstractRepetitionHandler = (AbstractRepetitionHandler)theEObject;
        T result = caseAbstractRepetitionHandler(abstractRepetitionHandler);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesPackage.ABSTRACT_RUN_GROUP_MODIFIER:
      {
        AbstractRunGroupModifier abstractRunGroupModifier = (AbstractRunGroupModifier)theEObject;
        T result = caseAbstractRunGroupModifier(abstractRunGroupModifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesPackage.COLUMN:
      {
        Column column = (Column)theEObject;
        T result = caseColumn(column);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesPackage.COMMENT:
      {
        Comment comment = (Comment)theEObject;
        T result = caseComment(comment);
        if (result == null) result = caseAbstractAnnotation(comment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesPackage.COMPLEX_VALUE_MAP:
      {
        ComplexValueMap complexValueMap = (ComplexValueMap)theEObject;
        T result = caseComplexValueMap(complexValueMap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesPackage.COMPLEX_VALUE_PAIR:
      {
        ComplexValuePair complexValuePair = (ComplexValuePair)theEObject;
        T result = caseComplexValuePair(complexValuePair);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesPackage.DATABASE_RESOURCE_DEFINITION:
      {
        DatabaseResourceDefinition databaseResourceDefinition = (DatabaseResourceDefinition)theEObject;
        T result = caseDatabaseResourceDefinition(databaseResourceDefinition);
        if (result == null) result = caseNamedResourceDefinition(databaseResourceDefinition);
        if (result == null) result = caseResourceDefinition(databaseResourceDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesPackage.DATA_SET:
      {
        DataSet dataSet = (DataSet)theEObject;
        T result = caseDataSet(dataSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesPackage.DATA_SET_INSTANCE:
      {
        DataSetInstance dataSetInstance = (DataSetInstance)theEObject;
        T result = caseDataSetInstance(dataSetInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesPackage.DATA_SET_RESOURCE_DEFINITION:
      {
        DataSetResourceDefinition dataSetResourceDefinition = (DataSetResourceDefinition)theEObject;
        T result = caseDataSetResourceDefinition(dataSetResourceDefinition);
        if (result == null) result = caseNamedResourceDefinition(dataSetResourceDefinition);
        if (result == null) result = caseResourceDefinition(dataSetResourceDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesPackage.DEVICE_RESOURCE_DEFINITION:
      {
        DeviceResourceDefinition deviceResourceDefinition = (DeviceResourceDefinition)theEObject;
        T result = caseDeviceResourceDefinition(deviceResourceDefinition);
        if (result == null) result = caseNamedResourceDefinition(deviceResourceDefinition);
        if (result == null) result = caseResourceDefinition(deviceResourceDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesPackage.EMPTY:
      {
        Empty empty = (Empty)theEObject;
        T result = caseEmpty(empty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesPackage.INLINE_DEVICE_RESOURCE_DEFINITION:
      {
        InlineDeviceResourceDefinition inlineDeviceResourceDefinition = (InlineDeviceResourceDefinition)theEObject;
        T result = caseInlineDeviceResourceDefinition(inlineDeviceResourceDefinition);
        if (result == null) result = caseDeviceResourceDefinition(inlineDeviceResourceDefinition);
        if (result == null) result = caseNamedResourceDefinition(inlineDeviceResourceDefinition);
        if (result == null) result = caseResourceDefinition(inlineDeviceResourceDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesPackage.INLINE_NAMESPACE_URI_DEFINITION:
      {
        InlineNamespaceUriDefinition inlineNamespaceUriDefinition = (InlineNamespaceUriDefinition)theEObject;
        T result = caseInlineNamespaceUriDefinition(inlineNamespaceUriDefinition);
        if (result == null) result = caseDeviceResourceDefinition(inlineNamespaceUriDefinition);
        if (result == null) result = caseNamedResourceDefinition(inlineNamespaceUriDefinition);
        if (result == null) result = caseResourceDefinition(inlineNamespaceUriDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesPackage.KRONUS_RESOURCE:
      {
        KronusResource kronusResource = (KronusResource)theEObject;
        T result = caseKronusResource(kronusResource);
        if (result == null) result = caseNamedResourceDefinition(kronusResource);
        if (result == null) result = caseResourceDefinition(kronusResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesPackage.NAMED_RESOURCE_DEFINITION:
      {
        NamedResourceDefinition namedResourceDefinition = (NamedResourceDefinition)theEObject;
        T result = caseNamedResourceDefinition(namedResourceDefinition);
        if (result == null) result = caseResourceDefinition(namedResourceDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesPackage.RESOURCE_DEFINITION:
      {
        ResourceDefinition resourceDefinition = (ResourceDefinition)theEObject;
        T result = caseResourceDefinition(resourceDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesPackage.ROW_INSTANCE:
      {
        RowInstance rowInstance = (RowInstance)theEObject;
        T result = caseRowInstance(rowInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesPackage.XML_NAMESPACE_DEFINITION:
      {
        XmlNamespaceDefinition xmlNamespaceDefinition = (XmlNamespaceDefinition)theEObject;
        T result = caseXmlNamespaceDefinition(xmlNamespaceDefinition);
        if (result == null) result = caseDataSetResourceDefinition(xmlNamespaceDefinition);
        if (result == null) result = caseNamedResourceDefinition(xmlNamespaceDefinition);
        if (result == null) result = caseResourceDefinition(xmlNamespaceDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TypesPackage.XML_URI_DEFINITION:
      {
        XmlUriDefinition xmlUriDefinition = (XmlUriDefinition)theEObject;
        T result = caseXmlUriDefinition(xmlUriDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
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
   * Returns the result of interpreting the object as an instance of '<em>Abstract Batch Listener</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Batch Listener</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractBatchListener(AbstractBatchListener object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Listener</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Listener</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractListener(AbstractListener object)
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
   * Returns the result of interpreting the object as an instance of '<em>Abstract Run Group Modifier</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Run Group Modifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractRunGroupModifier(AbstractRunGroupModifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Column</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColumn(Column object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComment(Comment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Value Map</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Value Map</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexValueMap(ComplexValueMap object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Value Pair</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Value Pair</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexValuePair(ComplexValuePair object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Database Resource Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Database Resource Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatabaseResourceDefinition(DatabaseResourceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Set</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataSet(DataSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Set Instance</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Set Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataSetInstance(DataSetInstance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Set Resource Definition</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Set Resource Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataSetResourceDefinition(DataSetResourceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Device Resource Definition</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Device Resource Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeviceResourceDefinition(DeviceResourceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Empty</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Empty</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmpty(Empty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inline Device Resource Definition</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inline Device Resource Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInlineDeviceResourceDefinition(InlineDeviceResourceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inline Namespace Uri Definition</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inline Namespace Uri Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInlineNamespaceUriDefinition(InlineNamespaceUriDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Kronus Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Kronus Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKronusResource(KronusResource object)
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
   * Returns the result of interpreting the object as an instance of '<em>Row Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Row Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRowInstance(RowInstance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Xml Namespace Definition</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Xml Namespace Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXmlNamespaceDefinition(XmlNamespaceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Xml Uri Definition</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Xml Uri Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXmlUriDefinition(XmlUriDefinition object)
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

} // TypesSwitch
