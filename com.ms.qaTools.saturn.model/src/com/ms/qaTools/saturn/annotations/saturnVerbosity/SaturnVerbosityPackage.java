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
package com.ms.qaTools.saturn.annotations.saturnVerbosity;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import com.ms.qaTools.saturn.types.TypesPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.annotations.saturnVerbosity.SaturnVerbosityFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface SaturnVerbosityPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                 eNAME                                        = "saturnVerbosity";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                 eNS_URI                                      = "http://www.ms.com/2014/Saturn/SaturnVerbosity";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                 eNS_PREFIX                                   = "saturnVerbosity";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  SaturnVerbosityPackage eINSTANCE                                    = com.ms.qaTools.saturn.annotations.saturnVerbosity.impl.SaturnVerbosityPackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.annotations.saturnVerbosity.impl.SaturnVerbosityConfigurationImpl <em>Configuration</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.annotations.saturnVerbosity.impl.SaturnVerbosityConfigurationImpl
   * @see com.ms.qaTools.saturn.annotations.saturnVerbosity.impl.SaturnVerbosityPackageImpl#getSaturnVerbosityConfiguration()
   * @generated
   */
  int                    SATURN_VERBOSITY_CONFIGURATION               = 0;

  /**
   * The feature id for the '<em><b>Verbosity</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    SATURN_VERBOSITY_CONFIGURATION__VERBOSITY    = TypesPackage.ABSTRACT_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    SATURN_VERBOSITY_CONFIGURATION__ENABLED      = TypesPackage.ABSTRACT_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Configuration</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                    SATURN_VERBOSITY_CONFIGURATION_FEATURE_COUNT = TypesPackage.ABSTRACT_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.annotations.saturnVerbosity.VerbosityEnum <em>Verbosity Enum</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.annotations.saturnVerbosity.VerbosityEnum
   * @see com.ms.qaTools.saturn.annotations.saturnVerbosity.impl.SaturnVerbosityPackageImpl#getVerbosityEnum()
   * @generated
   */
  int                    VERBOSITY_ENUM                               = 1;

  /**
   * The meta object id for the '<em>Verbosity Enum Object</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see com.ms.qaTools.saturn.annotations.saturnVerbosity.VerbosityEnum
   * @see com.ms.qaTools.saturn.annotations.saturnVerbosity.impl.SaturnVerbosityPackageImpl#getVerbosityEnumObject()
   * @generated
   */
  int                    VERBOSITY_ENUM_OBJECT                        = 2;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.annotations.saturnVerbosity.SaturnVerbosityConfiguration <em>Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Configuration</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnVerbosity.SaturnVerbosityConfiguration
   * @generated
   */
  EClass getSaturnVerbosityConfiguration();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.annotations.saturnVerbosity.SaturnVerbosityConfiguration#getVerbosity <em>Verbosity</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Verbosity</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnVerbosity.SaturnVerbosityConfiguration#getVerbosity()
   * @see #getSaturnVerbosityConfiguration()
   * @generated
   */
  EAttribute getSaturnVerbosityConfiguration_Verbosity();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.annotations.saturnVerbosity.SaturnVerbosityConfiguration#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnVerbosity.SaturnVerbosityConfiguration#isEnabled()
   * @see #getSaturnVerbosityConfiguration()
   * @generated
   */
  EAttribute getSaturnVerbosityConfiguration_Enabled();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.annotations.saturnVerbosity.VerbosityEnum <em>Verbosity Enum</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Verbosity Enum</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnVerbosity.VerbosityEnum
   * @generated
   */
  EEnum getVerbosityEnum();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.annotations.saturnVerbosity.VerbosityEnum <em>Verbosity Enum Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Verbosity Enum Object</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnVerbosity.VerbosityEnum
   * @model instanceClass="com.ms.qaTools.saturn.annotations.saturnVerbosity.VerbosityEnum"
   *        extendedMetaData="name='VerbosityEnum:Object' baseType='VerbosityEnum'"
   * @generated
   */
  EDataType getVerbosityEnumObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SaturnVerbosityFactory getSaturnVerbosityFactory();

  /**
   * <!-- begin-user-doc --> Defines literals for the meta objects that represent
   * <ul>
   * <li>each class,</li>
   * <li>each feature of each class,</li>
   * <li>each enum,</li>
   * <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.annotations.saturnVerbosity.impl.SaturnVerbosityConfigurationImpl <em>Configuration</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.annotations.saturnVerbosity.impl.SaturnVerbosityConfigurationImpl
     * @see com.ms.qaTools.saturn.annotations.saturnVerbosity.impl.SaturnVerbosityPackageImpl#getSaturnVerbosityConfiguration()
     * @generated
     */
    EClass     SATURN_VERBOSITY_CONFIGURATION            = eINSTANCE.getSaturnVerbosityConfiguration();

    /**
     * The meta object literal for the '<em><b>Verbosity</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SATURN_VERBOSITY_CONFIGURATION__VERBOSITY = eINSTANCE.getSaturnVerbosityConfiguration_Verbosity();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SATURN_VERBOSITY_CONFIGURATION__ENABLED   = eINSTANCE.getSaturnVerbosityConfiguration_Enabled();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.annotations.saturnVerbosity.VerbosityEnum <em>Verbosity Enum</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.annotations.saturnVerbosity.VerbosityEnum
     * @see com.ms.qaTools.saturn.annotations.saturnVerbosity.impl.SaturnVerbosityPackageImpl#getVerbosityEnum()
     * @generated
     */
    EEnum      VERBOSITY_ENUM                            = eINSTANCE.getVerbosityEnum();

    /**
     * The meta object literal for the '<em>Verbosity Enum Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.annotations.saturnVerbosity.VerbosityEnum
     * @see com.ms.qaTools.saturn.annotations.saturnVerbosity.impl.SaturnVerbosityPackageImpl#getVerbosityEnumObject()
     * @generated
     */
    EDataType  VERBOSITY_ENUM_OBJECT                     = eINSTANCE.getVerbosityEnumObject();

  }

} // SaturnVerbosityPackage
