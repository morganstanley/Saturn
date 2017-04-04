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
package com.ms.qaTools.saturn.repetition.impl;

import com.ms.qaTools.saturn.repetition.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.ms.qaTools.saturn.repetition.ColumnMapping;
import com.ms.qaTools.saturn.repetition.ForEachRepetition;
import com.ms.qaTools.saturn.repetition.ForEachXPathRepetition;
import com.ms.qaTools.saturn.repetition.ForRepetition;
import com.ms.qaTools.saturn.repetition.ForRepetitionIterator;
import com.ms.qaTools.saturn.repetition.RepetitionFactory;
import com.ms.qaTools.saturn.repetition.RepetitionPackage;
import com.ms.qaTools.saturn.repetition.XPathMapping;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class RepetitionFactoryImpl extends EFactoryImpl implements RepetitionFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static RepetitionFactory init()
  {
    try
    {
      RepetitionFactory theRepetitionFactory = (RepetitionFactory)EPackage.Registry.INSTANCE.getEFactory(RepetitionPackage.eNS_URI);
      if (theRepetitionFactory != null)
      {
        return theRepetitionFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RepetitionFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public RepetitionFactoryImpl()
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
      case RepetitionPackage.COLUMN_MAPPING: return createColumnMapping();
      case RepetitionPackage.FOR_EACH_REPETITION: return createForEachRepetition();
      case RepetitionPackage.FOR_EACH_XPATH_REPETITION: return createForEachXPathRepetition();
      case RepetitionPackage.FOR_REPETITION: return createForRepetition();
      case RepetitionPackage.FOR_REPETITION_ITERATOR: return createForRepetitionIterator();
      case RepetitionPackage.XPATH_MAPPING: return createXPathMapping();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ColumnMapping createColumnMapping()
  {
    ColumnMappingImpl columnMapping = new ColumnMappingImpl();
    return columnMapping;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ForEachRepetition createForEachRepetition()
  {
    ForEachRepetitionImpl forEachRepetition = new ForEachRepetitionImpl();
    return forEachRepetition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ForEachXPathRepetition createForEachXPathRepetition()
  {
    ForEachXPathRepetitionImpl forEachXPathRepetition = new ForEachXPathRepetitionImpl();
    return forEachXPathRepetition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ForRepetition createForRepetition()
  {
    ForRepetitionImpl forRepetition = new ForRepetitionImpl();
    return forRepetition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ForRepetitionIterator createForRepetitionIterator()
  {
    ForRepetitionIteratorImpl forRepetitionIterator = new ForRepetitionIteratorImpl();
    return forRepetitionIterator;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XPathMapping createXPathMapping()
  {
    XPathMappingImpl xPathMapping = new XPathMappingImpl();
    return xPathMapping;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public RepetitionPackage getRepetitionPackage()
  {
    return (RepetitionPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RepetitionPackage getPackage()
  {
    return RepetitionPackage.eINSTANCE;
  }

} // RepetitionFactoryImpl
