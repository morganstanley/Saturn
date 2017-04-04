/**
 * COPYRIGHT NOTICE AND DISCLAIMER
 *  
 * Copyright © 2009, Contributor
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License, version 3 for more details.
 * You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
 * THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
 */
package com.ms.qaTools.saturn.modules.datacompareModule.impl;

import com.ms.qaTools.saturn.modules.datacompareModule.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.ms.qaTools.saturn.modules.datacompareModule.AbstractDiffSetExplainer;
import com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration;
import com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition;
import com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModuleFactory;
import com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage;
import com.ms.qaTools.saturn.modules.datacompareModule.DocumentRoot;
import com.ms.qaTools.saturn.modules.datacompareModule.MappedColumn;
import com.ms.qaTools.saturn.modules.datacompareModule.Output;
import com.ms.qaTools.saturn.modules.datacompareModule.Page;
import com.ms.qaTools.saturn.modules.datacompareModule.Pages;
import com.ms.qaTools.saturn.modules.datacompareModule.PerlDiffSetExplainer;
import com.ms.qaTools.saturn.modules.datacompareModule.SortType;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class DatacompareModuleFactoryImpl extends EFactoryImpl implements DatacompareModuleFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static DatacompareModuleFactory init()
  {
    try
    {
      DatacompareModuleFactory theDatacompareModuleFactory = (DatacompareModuleFactory)EPackage.Registry.INSTANCE.getEFactory(DatacompareModulePackage.eNS_URI);
      if (theDatacompareModuleFactory != null)
      {
        return theDatacompareModuleFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DatacompareModuleFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DatacompareModuleFactoryImpl()
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
      case DatacompareModulePackage.ABSTRACT_DIFF_SET_EXPLAINER: return createAbstractDiffSetExplainer();
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION: return createDataCompareConfiguration();
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION: return createDataSourceDefinition();
      case DatacompareModulePackage.DOCUMENT_ROOT: return createDocumentRoot();
      case DatacompareModulePackage.MAPPED_COLUMN: return createMappedColumn();
      case DatacompareModulePackage.OUTPUT: return createOutput();
      case DatacompareModulePackage.PAGE: return createPage();
      case DatacompareModulePackage.PAGES: return createPages();
      case DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER: return createPerlDiffSetExplainer();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DatacompareModulePackage.SORT_TYPE:
        return createSortTypeFromString(eDataType, initialValue);
      case DatacompareModulePackage.SORT_TYPE_OBJECT:
        return createSortTypeObjectFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DatacompareModulePackage.SORT_TYPE:
        return convertSortTypeToString(eDataType, instanceValue);
      case DatacompareModulePackage.SORT_TYPE_OBJECT:
        return convertSortTypeObjectToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AbstractDiffSetExplainer createAbstractDiffSetExplainer()
  {
    AbstractDiffSetExplainerImpl abstractDiffSetExplainer = new AbstractDiffSetExplainerImpl();
    return abstractDiffSetExplainer;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DataCompareConfiguration createDataCompareConfiguration()
  {
    DataCompareConfigurationImpl dataCompareConfiguration = new DataCompareConfigurationImpl();
    return dataCompareConfiguration;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DataSourceDefinition createDataSourceDefinition()
  {
    DataSourceDefinitionImpl dataSourceDefinition = new DataSourceDefinitionImpl();
    return dataSourceDefinition;
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
  public MappedColumn createMappedColumn()
  {
    MappedColumnImpl mappedColumn = new MappedColumnImpl();
    return mappedColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Output createOutput()
  {
    OutputImpl output = new OutputImpl();
    return output;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Page createPage()
  {
    PageImpl page = new PageImpl();
    return page;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Pages createPages()
  {
    PagesImpl pages = new PagesImpl();
    return pages;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PerlDiffSetExplainer createPerlDiffSetExplainer()
  {
    PerlDiffSetExplainerImpl perlDiffSetExplainer = new PerlDiffSetExplainerImpl();
    return perlDiffSetExplainer;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SortType createSortTypeFromString(EDataType eDataType, String initialValue)
  {
    SortType result = SortType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertSortTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SortType createSortTypeObjectFromString(EDataType eDataType, String initialValue)
  {
    return createSortTypeFromString(DatacompareModulePackage.Literals.SORT_TYPE, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertSortTypeObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertSortTypeToString(DatacompareModulePackage.Literals.SORT_TYPE, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DatacompareModulePackage getDatacompareModulePackage()
  {
    return (DatacompareModulePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DatacompareModulePackage getPackage()
  {
    return DatacompareModulePackage.eINSTANCE;
  }

} // DatacompareModuleFactoryImpl
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
