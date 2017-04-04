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
package com.ms.qaTools.saturn.result;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.result.ResultFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface ResultPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String        eNAME                              = "result";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String        eNS_URI                            = "http://www.ms.com/2009/Saturn/Result";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String        eNS_PREFIX                         = "saturnResult";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  ResultPackage eINSTANCE                          = com.ms.qaTools.saturn.result.impl.ResultPackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.result.impl.SaturnResultImpl <em>Saturn Result</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.result.impl.SaturnResultImpl
   * @see com.ms.qaTools.saturn.result.impl.ResultPackageImpl#getSaturnResult()
   * @generated
   */
  int           SATURN_RESULT                      = 3;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN_RESULT__STATUS              = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN_RESULT__NAME                = 1;

  /**
   * The feature id for the '<em><b>Iteration No</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN_RESULT__ITERATION_NO        = 2;

  /**
   * The feature id for the '<em><b>Start Time</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN_RESULT__START_TIME          = 3;

  /**
   * The feature id for the '<em><b>Stop Time</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN_RESULT__STOP_TIME           = 4;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN_RESULT__MESSAGE             = 5;

  /**
   * The number of structural features of the '<em>Saturn Result</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           SATURN_RESULT_FEATURE_COUNT        = 6;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.result.impl.ResultIterationImpl <em>Iteration</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.result.impl.ResultIterationImpl
   * @see com.ms.qaTools.saturn.result.impl.ResultPackageImpl#getResultIteration()
   * @generated
   */
  int           RESULT_ITERATION                   = 0;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RESULT_ITERATION__STATUS           = SATURN_RESULT__STATUS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RESULT_ITERATION__NAME             = SATURN_RESULT__NAME;

  /**
   * The feature id for the '<em><b>Iteration No</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RESULT_ITERATION__ITERATION_NO     = SATURN_RESULT__ITERATION_NO;

  /**
   * The feature id for the '<em><b>Start Time</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RESULT_ITERATION__START_TIME       = SATURN_RESULT__START_TIME;

  /**
   * The feature id for the '<em><b>Stop Time</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RESULT_ITERATION__STOP_TIME        = SATURN_RESULT__STOP_TIME;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RESULT_ITERATION__MESSAGE          = SATURN_RESULT__MESSAGE;

  /**
   * The feature id for the '<em><b>Iteration Result</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           RESULT_ITERATION__ITERATION_RESULT = SATURN_RESULT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Iteration</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RESULT_ITERATION_FEATURE_COUNT     = SATURN_RESULT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.result.impl.ResultRunGroupImpl <em>Run Group</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.result.impl.ResultRunGroupImpl
   * @see com.ms.qaTools.saturn.result.impl.ResultPackageImpl#getResultRunGroup()
   * @generated
   */
  int           RESULT_RUN_GROUP                   = 1;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RESULT_RUN_GROUP__STATUS           = SATURN_RESULT__STATUS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RESULT_RUN_GROUP__NAME             = SATURN_RESULT__NAME;

  /**
   * The feature id for the '<em><b>Iteration No</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RESULT_RUN_GROUP__ITERATION_NO     = SATURN_RESULT__ITERATION_NO;

  /**
   * The feature id for the '<em><b>Start Time</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RESULT_RUN_GROUP__START_TIME       = SATURN_RESULT__START_TIME;

  /**
   * The feature id for the '<em><b>Stop Time</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RESULT_RUN_GROUP__STOP_TIME        = SATURN_RESULT__STOP_TIME;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RESULT_RUN_GROUP__MESSAGE          = SATURN_RESULT__MESSAGE;

  /**
   * The feature id for the '<em><b>Run Group Result</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           RESULT_RUN_GROUP__RUN_GROUP_RESULT = SATURN_RESULT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Config</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           RESULT_RUN_GROUP__CONFIG           = SATURN_RESULT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Run Group</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RESULT_RUN_GROUP_FEATURE_COUNT     = SATURN_RESULT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.result.impl.ResultStepImpl <em>Step</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.result.impl.ResultStepImpl
   * @see com.ms.qaTools.saturn.result.impl.ResultPackageImpl#getResultStep()
   * @generated
   */
  int           RESULT_STEP                        = 2;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RESULT_STEP__STATUS                = SATURN_RESULT__STATUS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RESULT_STEP__NAME                  = SATURN_RESULT__NAME;

  /**
   * The feature id for the '<em><b>Iteration No</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RESULT_STEP__ITERATION_NO          = SATURN_RESULT__ITERATION_NO;

  /**
   * The feature id for the '<em><b>Start Time</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RESULT_STEP__START_TIME            = SATURN_RESULT__START_TIME;

  /**
   * The feature id for the '<em><b>Stop Time</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RESULT_STEP__STOP_TIME             = SATURN_RESULT__STOP_TIME;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RESULT_STEP__MESSAGE               = SATURN_RESULT__MESSAGE;

  /**
   * The feature id for the '<em><b>Config</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           RESULT_STEP__CONFIG                = SATURN_RESULT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Step</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RESULT_STEP_FEATURE_COUNT          = SATURN_RESULT_FEATURE_COUNT + 1;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.result.ResultIteration <em>Iteration</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Iteration</em>'.
   * @see com.ms.qaTools.saturn.result.ResultIteration
   * @generated
   */
  EClass getResultIteration();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.result.ResultIteration#getIterationResult <em>Iteration Result</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Iteration Result</em>'.
   * @see com.ms.qaTools.saturn.result.ResultIteration#getIterationResult()
   * @see #getResultIteration()
   * @generated
   */
  EReference getResultIteration_IterationResult();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.result.ResultRunGroup <em>Run Group</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Run Group</em>'.
   * @see com.ms.qaTools.saturn.result.ResultRunGroup
   * @generated
   */
  EClass getResultRunGroup();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.result.ResultRunGroup#getRunGroupResult <em>Run Group Result</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Run Group Result</em>'.
   * @see com.ms.qaTools.saturn.result.ResultRunGroup#getRunGroupResult()
   * @see #getResultRunGroup()
   * @generated
   */
  EReference getResultRunGroup_RunGroupResult();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.result.ResultRunGroup#getConfig <em>Config</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>Config</em>'.
   * @see com.ms.qaTools.saturn.result.ResultRunGroup#getConfig()
   * @see #getResultRunGroup()
   * @generated
   */
  EReference getResultRunGroup_Config();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.result.ResultStep <em>Step</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Step</em>'.
   * @see com.ms.qaTools.saturn.result.ResultStep
   * @generated
   */
  EClass getResultStep();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.result.ResultStep#getConfig <em>Config</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Config</em>'.
   * @see com.ms.qaTools.saturn.result.ResultStep#getConfig()
   * @see #getResultStep()
   * @generated
   */
  EReference getResultStep_Config();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.result.SaturnResult <em>Saturn Result</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Saturn Result</em>'.
   * @see com.ms.qaTools.saturn.result.SaturnResult
   * @generated
   */
  EClass getSaturnResult();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.result.SaturnResult#getIterationNo <em>Iteration No</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Iteration No</em>'.
   * @see com.ms.qaTools.saturn.result.SaturnResult#getIterationNo()
   * @see #getSaturnResult()
   * @generated
   */
  EAttribute getSaturnResult_IterationNo();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.result.SaturnResult#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see com.ms.qaTools.saturn.result.SaturnResult#getMessage()
   * @see #getSaturnResult()
   * @generated
   */
  EAttribute getSaturnResult_Message();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.result.SaturnResult#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ms.qaTools.saturn.result.SaturnResult#getName()
   * @see #getSaturnResult()
   * @generated
   */
  EAttribute getSaturnResult_Name();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.result.SaturnResult#getStartTime <em>Start Time</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start Time</em>'.
   * @see com.ms.qaTools.saturn.result.SaturnResult#getStartTime()
   * @see #getSaturnResult()
   * @generated
   */
  EAttribute getSaturnResult_StartTime();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.result.SaturnResult#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status</em>'.
   * @see com.ms.qaTools.saturn.result.SaturnResult#getStatus()
   * @see #getSaturnResult()
   * @generated
   */
  EAttribute getSaturnResult_Status();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.result.SaturnResult#getStopTime <em>Stop Time</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stop Time</em>'.
   * @see com.ms.qaTools.saturn.result.SaturnResult#getStopTime()
   * @see #getSaturnResult()
   * @generated
   */
  EAttribute getSaturnResult_StopTime();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ResultFactory getResultFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.result.impl.ResultIterationImpl <em>Iteration</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.result.impl.ResultIterationImpl
     * @see com.ms.qaTools.saturn.result.impl.ResultPackageImpl#getResultIteration()
     * @generated
     */
    EClass     RESULT_ITERATION                   = eINSTANCE.getResultIteration();

    /**
     * The meta object literal for the '<em><b>Iteration Result</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference RESULT_ITERATION__ITERATION_RESULT = eINSTANCE.getResultIteration_IterationResult();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.result.impl.ResultRunGroupImpl <em>Run Group</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.result.impl.ResultRunGroupImpl
     * @see com.ms.qaTools.saturn.result.impl.ResultPackageImpl#getResultRunGroup()
     * @generated
     */
    EClass     RESULT_RUN_GROUP                   = eINSTANCE.getResultRunGroup();

    /**
     * The meta object literal for the '<em><b>Run Group Result</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference RESULT_RUN_GROUP__RUN_GROUP_RESULT = eINSTANCE.getResultRunGroup_RunGroupResult();

    /**
     * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESULT_RUN_GROUP__CONFIG           = eINSTANCE.getResultRunGroup_Config();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.result.impl.ResultStepImpl <em>Step</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.result.impl.ResultStepImpl
     * @see com.ms.qaTools.saturn.result.impl.ResultPackageImpl#getResultStep()
     * @generated
     */
    EClass     RESULT_STEP                        = eINSTANCE.getResultStep();

    /**
     * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESULT_STEP__CONFIG                = eINSTANCE.getResultStep_Config();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.result.impl.SaturnResultImpl <em>Saturn Result</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.result.impl.SaturnResultImpl
     * @see com.ms.qaTools.saturn.result.impl.ResultPackageImpl#getSaturnResult()
     * @generated
     */
    EClass     SATURN_RESULT                      = eINSTANCE.getSaturnResult();

    /**
     * The meta object literal for the '<em><b>Iteration No</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SATURN_RESULT__ITERATION_NO        = eINSTANCE.getSaturnResult_IterationNo();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SATURN_RESULT__MESSAGE             = eINSTANCE.getSaturnResult_Message();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SATURN_RESULT__NAME                = eINSTANCE.getSaturnResult_Name();

    /**
     * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SATURN_RESULT__START_TIME          = eINSTANCE.getSaturnResult_StartTime();

    /**
     * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SATURN_RESULT__STATUS              = eINSTANCE.getSaturnResult_Status();

    /**
     * The meta object literal for the '<em><b>Stop Time</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SATURN_RESULT__STOP_TIME           = eINSTANCE.getSaturnResult_StopTime();

  }

} // ResultPackage
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
