package com.ms.qaTools.saturn.modules.xmlManipModule.impl;

import com.ms.qaTools.saturn.modules.xmlManipModule.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModuleFactory;
import com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage;
import com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipNamespace;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class XmlManipModuleFactoryImpl extends EFactoryImpl implements XmlManipModuleFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static XmlManipModuleFactory init()
  {
    try
    {
      XmlManipModuleFactory theXmlManipModuleFactory = (XmlManipModuleFactory)EPackage.Registry.INSTANCE.getEFactory(XmlManipModulePackage.eNS_URI);
      if (theXmlManipModuleFactory != null)
      {
        return theXmlManipModuleFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new XmlManipModuleFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlManipModuleFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case XmlManipModulePackage.ADD_OPERATION: return createAddOperation();
      case XmlManipModulePackage.CLEAN_NAMESPACES_OPERATION: return createCleanNamespacesOperation();
      case XmlManipModulePackage.DELETE_OPERATION: return createDeleteOperation();
      case XmlManipModulePackage.DOCUMENT_ROOT: return createDocumentRoot();
      case XmlManipModulePackage.EXTRACT_OPERATION: return createExtractOperation();
      case XmlManipModulePackage.INTERSECT_OPERATION: return createIntersectOperation();
      case XmlManipModulePackage.REGISTER_FUNCTION_OPERATION: return createRegisterFunctionOperation();
      case XmlManipModulePackage.REPLACE_OPERATION: return createReplaceOperation();
      case XmlManipModulePackage.SHIFT_OPERATION: return createShiftOperation();
      case XmlManipModulePackage.SORT_OPERATION: return createSortOperation();
      case XmlManipModulePackage.SPLIT_OPERATION: return createSplitOperation();
      case XmlManipModulePackage.STRIP_NAMESPACES_OPERATION: return createStripNamespacesOperation();
      case XmlManipModulePackage.VALUE_REPLACE_OPERATION: return createValueReplaceOperation();
      case XmlManipModulePackage.WHERE_OPERATION: return createWhereOperation();
      case XmlManipModulePackage.XML_MANIP_CONFIGURATION: return createXmlManipConfiguration();
      case XmlManipModulePackage.XML_MANIP_NAMESPACE: return createXmlManipNamespace();
      case XmlManipModulePackage.XPATH: return createXPath();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AddOperation createAddOperation()
  {
    AddOperationImpl addOperation = new AddOperationImpl();
    return addOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CleanNamespacesOperation createCleanNamespacesOperation()
  {
    CleanNamespacesOperationImpl cleanNamespacesOperation = new CleanNamespacesOperationImpl();
    return cleanNamespacesOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DeleteOperation createDeleteOperation()
  {
    DeleteOperationImpl deleteOperation = new DeleteOperationImpl();
    return deleteOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DocumentRoot createDocumentRoot()
  {
    DocumentRootImpl documentRoot = new DocumentRootImpl();
    return documentRoot;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ExtractOperation createExtractOperation()
  {
    ExtractOperationImpl extractOperation = new ExtractOperationImpl();
    return extractOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public IntersectOperation createIntersectOperation()
  {
    IntersectOperationImpl intersectOperation = new IntersectOperationImpl();
    return intersectOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public RegisterFunctionOperation createRegisterFunctionOperation()
  {
    RegisterFunctionOperationImpl registerFunctionOperation = new RegisterFunctionOperationImpl();
    return registerFunctionOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ReplaceOperation createReplaceOperation()
  {
    ReplaceOperationImpl replaceOperation = new ReplaceOperationImpl();
    return replaceOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ShiftOperation createShiftOperation()
  {
    ShiftOperationImpl shiftOperation = new ShiftOperationImpl();
    return shiftOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SortOperation createSortOperation()
  {
    SortOperationImpl sortOperation = new SortOperationImpl();
    return sortOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SplitOperation createSplitOperation()
  {
    SplitOperationImpl splitOperation = new SplitOperationImpl();
    return splitOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public StripNamespacesOperation createStripNamespacesOperation()
  {
    StripNamespacesOperationImpl stripNamespacesOperation = new StripNamespacesOperationImpl();
    return stripNamespacesOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ValueReplaceOperation createValueReplaceOperation()
  {
    ValueReplaceOperationImpl valueReplaceOperation = new ValueReplaceOperationImpl();
    return valueReplaceOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public WhereOperation createWhereOperation()
  {
    WhereOperationImpl whereOperation = new WhereOperationImpl();
    return whereOperation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlManipConfiguration createXmlManipConfiguration()
  {
    XmlManipConfigurationImpl xmlManipConfiguration = new XmlManipConfigurationImpl();
    return xmlManipConfiguration;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlManipNamespace createXmlManipNamespace()
  {
    XmlManipNamespaceImpl xmlManipNamespace = new XmlManipNamespaceImpl();
    return xmlManipNamespace;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XPath createXPath()
  {
    XPathImpl xPath = new XPathImpl();
    return xPath;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlManipModulePackage getXmlManipModulePackage()
  {
    return (XmlManipModulePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static XmlManipModulePackage getPackage()
  {
    return XmlManipModulePackage.eINSTANCE;
  }

} // XmlManipModuleFactoryImpl
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
