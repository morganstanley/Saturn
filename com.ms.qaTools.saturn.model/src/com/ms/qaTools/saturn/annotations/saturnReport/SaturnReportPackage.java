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
package com.ms.qaTools.saturn.annotations.saturnReport;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2006/pdsttools/xsd2perl nsPrefix='saturnReport' package='SaturnReport'"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface SaturnReportPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String              eNAME                                               = "saturnReport";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String              eNS_URI                                             = "http://www.ms.com/2009/Saturn/SaturnReport";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String              eNS_PREFIX                                          = "saturnReport";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  SaturnReportPackage eINSTANCE                                           = com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportPackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportConfigurationImpl <em>Configuration</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportConfigurationImpl
   * @see com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportPackageImpl#getSaturnReportConfiguration()
   * @generated
   */
  int                 SATURN_REPORT_CONFIGURATION                         = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SATURN_REPORT_CONFIGURATION__NAME                   = TypesPackage.ABSTRACT_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Repetition Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SATURN_REPORT_CONFIGURATION__REPETITION_NAME = TypesPackage.ABSTRACT_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SATURN_REPORT_CONFIGURATION__TITLE                  = TypesPackage.ABSTRACT_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Repetition Title</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SATURN_REPORT_CONFIGURATION__REPETITION_TITLE       = TypesPackage.ABSTRACT_ANNOTATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SATURN_REPORT_CONFIGURATION__DESCRIPTION            = TypesPackage.ABSTRACT_ANNOTATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SATURN_REPORT_CONFIGURATION__ENABLED                = TypesPackage.ABSTRACT_ANNOTATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Is Scenario</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SATURN_REPORT_CONFIGURATION__IS_SCENARIO            = TypesPackage.ABSTRACT_ANNOTATION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Show Iteration No</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SATURN_REPORT_CONFIGURATION__SHOW_ITERATION_NO      = TypesPackage.ABSTRACT_ANNOTATION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>On Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SATURN_REPORT_CONFIGURATION__ON_STATUS              = TypesPackage.ABSTRACT_ANNOTATION_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Ignored</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SATURN_REPORT_CONFIGURATION__IGNORED                = TypesPackage.ABSTRACT_ANNOTATION_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Hide Header</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SATURN_REPORT_CONFIGURATION__HIDE_HEADER            = TypesPackage.ABSTRACT_ANNOTATION_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Hide Content</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SATURN_REPORT_CONFIGURATION__HIDE_CONTENT           = TypesPackage.ABSTRACT_ANNOTATION_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Hide Repeating Header</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 SATURN_REPORT_CONFIGURATION__HIDE_REPEATING_HEADER  = TypesPackage.ABSTRACT_ANNOTATION_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Hide Repeating Content</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SATURN_REPORT_CONFIGURATION__HIDE_REPEATING_CONTENT = TypesPackage.ABSTRACT_ANNOTATION_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Expand On Pass</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SATURN_REPORT_CONFIGURATION__EXPAND_ON_PASS         = TypesPackage.ABSTRACT_ANNOTATION_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Expand On Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 SATURN_REPORT_CONFIGURATION__EXPAND_ON_STATUS       = TypesPackage.ABSTRACT_ANNOTATION_FEATURE_COUNT + 15;

  /**
   * The number of structural features of the '<em>Configuration</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 SATURN_REPORT_CONFIGURATION_FEATURE_COUNT           = TypesPackage.ABSTRACT_ANNOTATION_FEATURE_COUNT + 16;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.annotations.saturnReport.ResultStatus <em>Result Status</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.annotations.saturnReport.ResultStatus
   * @see com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportPackageImpl#getResultStatus()
   * @generated
   */
  int                 RESULT_STATUS                                       = 1;

  /**
   * The meta object id for the '<em>Result Status Object</em>' data type.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.annotations.saturnReport.ResultStatus
   * @see com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportPackageImpl#getResultStatusObject()
   * @generated
   */
  int                 RESULT_STATUS_OBJECT                                = 2;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration <em>Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Configuration</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration
   * @generated
   */
  EClass getSaturnReportConfiguration();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getName <em>Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getName()
   * @see #getSaturnReportConfiguration()
   * @generated
   */
  EReference getSaturnReportConfiguration_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getRepetitionName <em>Repetition Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Repetition Name</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getRepetitionName()
   * @see #getSaturnReportConfiguration()
   * @generated
   */
  EReference getSaturnReportConfiguration_RepetitionName();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getTitle <em>Title</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getTitle()
   * @see #getSaturnReportConfiguration()
   * @generated
   */
  EReference getSaturnReportConfiguration_Title();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getRepetitionTitle <em>Repetition Title</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Repetition Title</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getRepetitionTitle()
   * @see #getSaturnReportConfiguration()
   * @generated
   */
  EReference getSaturnReportConfiguration_RepetitionTitle();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getDescription()
   * @see #getSaturnReportConfiguration()
   * @generated
   */
  EReference getSaturnReportConfiguration_Description();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isEnabled <em>Enabled</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isEnabled()
   * @see #getSaturnReportConfiguration()
   * @generated
   */
  EAttribute getSaturnReportConfiguration_Enabled();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isExpandOnPass <em>Expand On Pass</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expand On Pass</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isExpandOnPass()
   * @see #getSaturnReportConfiguration()
   * @generated
   */
  EAttribute getSaturnReportConfiguration_ExpandOnPass();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getExpandOnStatus <em>Expand On Status</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expand On Status</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getExpandOnStatus()
   * @see #getSaturnReportConfiguration()
   * @generated
   */
  EAttribute getSaturnReportConfiguration_ExpandOnStatus();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isHideContent <em>Hide Content</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hide Content</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isHideContent()
   * @see #getSaturnReportConfiguration()
   * @generated
   */
  EAttribute getSaturnReportConfiguration_HideContent();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isHideHeader <em>Hide Header</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hide Header</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isHideHeader()
   * @see #getSaturnReportConfiguration()
   * @generated
   */
  EAttribute getSaturnReportConfiguration_HideHeader();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isHideRepeatingContent <em>Hide Repeating Content</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hide Repeating Content</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isHideRepeatingContent()
   * @see #getSaturnReportConfiguration()
   * @generated
   */
  EAttribute getSaturnReportConfiguration_HideRepeatingContent();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isHideRepeatingHeader <em>Hide Repeating Header</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hide Repeating Header</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isHideRepeatingHeader()
   * @see #getSaturnReportConfiguration()
   * @generated
   */
  EAttribute getSaturnReportConfiguration_HideRepeatingHeader();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isIgnored <em>Ignored</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Ignored</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isIgnored()
   * @see #getSaturnReportConfiguration()
   * @generated
   */
  EAttribute getSaturnReportConfiguration_Ignored();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isIsScenario <em>Is Scenario</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Scenario</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isIsScenario()
   * @see #getSaturnReportConfiguration()
   * @generated
   */
  EAttribute getSaturnReportConfiguration_IsScenario();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getOnStatus <em>On Status</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>On Status</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getOnStatus()
   * @see #getSaturnReportConfiguration()
   * @generated
   */
  EAttribute getSaturnReportConfiguration_OnStatus();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isShowIterationNo <em>Show Iteration No</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Show Iteration No</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isShowIterationNo()
   * @see #getSaturnReportConfiguration()
   * @generated
   */
  EAttribute getSaturnReportConfiguration_ShowIterationNo();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.annotations.saturnReport.ResultStatus <em>Result Status</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Result Status</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnReport.ResultStatus
   * @generated
   */
  EEnum getResultStatus();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.annotations.saturnReport.ResultStatus <em>Result Status Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Result Status Object</em>'.
   * @see com.ms.qaTools.saturn.annotations.saturnReport.ResultStatus
   * @model instanceClass="com.ms.qaTools.saturn.annotations.saturnReport.ResultStatus"
   *        extendedMetaData="name='ResultStatus:Object' baseType='ResultStatus'"
   * @generated
   */
  EDataType getResultStatusObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SaturnReportFactory getSaturnReportFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportConfigurationImpl <em>Configuration</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportConfigurationImpl
     * @see com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportPackageImpl#getSaturnReportConfiguration()
     * @generated
     */
    EClass     SATURN_REPORT_CONFIGURATION                         = eINSTANCE.getSaturnReportConfiguration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SATURN_REPORT_CONFIGURATION__NAME                   = eINSTANCE.getSaturnReportConfiguration_Name();

    /**
     * The meta object literal for the '<em><b>Repetition Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SATURN_REPORT_CONFIGURATION__REPETITION_NAME = eINSTANCE.getSaturnReportConfiguration_RepetitionName();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SATURN_REPORT_CONFIGURATION__TITLE                  = eINSTANCE.getSaturnReportConfiguration_Title();

    /**
     * The meta object literal for the '<em><b>Repetition Title</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference SATURN_REPORT_CONFIGURATION__REPETITION_TITLE       = eINSTANCE.getSaturnReportConfiguration_RepetitionTitle();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference SATURN_REPORT_CONFIGURATION__DESCRIPTION            = eINSTANCE.getSaturnReportConfiguration_Description();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SATURN_REPORT_CONFIGURATION__ENABLED                = eINSTANCE.getSaturnReportConfiguration_Enabled();

    /**
     * The meta object literal for the '<em><b>Expand On Pass</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SATURN_REPORT_CONFIGURATION__EXPAND_ON_PASS         = eINSTANCE.getSaturnReportConfiguration_ExpandOnPass();

    /**
     * The meta object literal for the '<em><b>Expand On Status</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SATURN_REPORT_CONFIGURATION__EXPAND_ON_STATUS       = eINSTANCE.getSaturnReportConfiguration_ExpandOnStatus();

    /**
     * The meta object literal for the '<em><b>Hide Content</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SATURN_REPORT_CONFIGURATION__HIDE_CONTENT           = eINSTANCE.getSaturnReportConfiguration_HideContent();

    /**
     * The meta object literal for the '<em><b>Hide Header</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SATURN_REPORT_CONFIGURATION__HIDE_HEADER            = eINSTANCE.getSaturnReportConfiguration_HideHeader();

    /**
     * The meta object literal for the '<em><b>Hide Repeating Content</b></em>' attribute feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EAttribute SATURN_REPORT_CONFIGURATION__HIDE_REPEATING_CONTENT = eINSTANCE.getSaturnReportConfiguration_HideRepeatingContent();

    /**
     * The meta object literal for the '<em><b>Hide Repeating Header</b></em>' attribute feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EAttribute SATURN_REPORT_CONFIGURATION__HIDE_REPEATING_HEADER  = eINSTANCE.getSaturnReportConfiguration_HideRepeatingHeader();

    /**
     * The meta object literal for the '<em><b>Ignored</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SATURN_REPORT_CONFIGURATION__IGNORED                = eINSTANCE.getSaturnReportConfiguration_Ignored();

    /**
     * The meta object literal for the '<em><b>Is Scenario</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SATURN_REPORT_CONFIGURATION__IS_SCENARIO            = eINSTANCE.getSaturnReportConfiguration_IsScenario();

    /**
     * The meta object literal for the '<em><b>On Status</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SATURN_REPORT_CONFIGURATION__ON_STATUS              = eINSTANCE.getSaturnReportConfiguration_OnStatus();

    /**
     * The meta object literal for the '<em><b>Show Iteration No</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SATURN_REPORT_CONFIGURATION__SHOW_ITERATION_NO      = eINSTANCE.getSaturnReportConfiguration_ShowIterationNo();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.annotations.saturnReport.ResultStatus <em>Result Status</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.annotations.saturnReport.ResultStatus
     * @see com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportPackageImpl#getResultStatus()
     * @generated
     */
    EEnum      RESULT_STATUS                                       = eINSTANCE.getResultStatus();

    /**
     * The meta object literal for the '<em>Result Status Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.annotations.saturnReport.ResultStatus
     * @see com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportPackageImpl#getResultStatusObject()
     * @generated
     */
    EDataType  RESULT_STATUS_OBJECT                                = eINSTANCE.getResultStatusObject();

  }

} // SaturnReportPackage
