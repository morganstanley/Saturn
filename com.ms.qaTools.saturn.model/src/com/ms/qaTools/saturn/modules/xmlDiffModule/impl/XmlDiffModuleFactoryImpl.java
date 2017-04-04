package com.ms.qaTools.saturn.modules.xmlDiffModule.impl;

import com.ms.qaTools.saturn.modules.xmlDiffModule.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.ms.qaTools.saturn.modules.xmlDiffModule.DocumentRoot;
import com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffColumn;
import com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration;
import com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffModuleFactory;
import com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffModulePackage;
import com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffNamespace;
import com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffObject;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class XmlDiffModuleFactoryImpl extends EFactoryImpl implements XmlDiffModuleFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static XmlDiffModuleFactory init()
  {
    try
    {
      XmlDiffModuleFactory theXmlDiffModuleFactory = (XmlDiffModuleFactory)EPackage.Registry.INSTANCE.getEFactory(XmlDiffModulePackage.eNS_URI);
      if (theXmlDiffModuleFactory != null)
      {
        return theXmlDiffModuleFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new XmlDiffModuleFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlDiffModuleFactoryImpl()
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
      case XmlDiffModulePackage.DOCUMENT_ROOT: return createDocumentRoot();
      case XmlDiffModulePackage.XML_DIFF_COLUMN: return createXmlDiffColumn();
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION: return createXmlDiffConfiguration();
      case XmlDiffModulePackage.XML_DIFF_NAMESPACE: return createXmlDiffNamespace();
      case XmlDiffModulePackage.XML_DIFF_OBJECT: return createXmlDiffObject();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
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
  public XmlDiffColumn createXmlDiffColumn()
  {
    XmlDiffColumnImpl xmlDiffColumn = new XmlDiffColumnImpl();
    return xmlDiffColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlDiffConfiguration createXmlDiffConfiguration()
  {
    XmlDiffConfigurationImpl xmlDiffConfiguration = new XmlDiffConfigurationImpl();
    return xmlDiffConfiguration;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlDiffNamespace createXmlDiffNamespace()
  {
    XmlDiffNamespaceImpl xmlDiffNamespace = new XmlDiffNamespaceImpl();
    return xmlDiffNamespace;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlDiffObject createXmlDiffObject()
  {
    XmlDiffObjectImpl xmlDiffObject = new XmlDiffObjectImpl();
    return xmlDiffObject;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlDiffModulePackage getXmlDiffModulePackage()
  {
    return (XmlDiffModulePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static XmlDiffModulePackage getPackage()
  {
    return XmlDiffModulePackage.eINSTANCE;
  }

} // XmlDiffModuleFactoryImpl
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
