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
package com.ms.qaTools.saturn;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.SaturnPackage
 * @generated
 */
public interface SaturnFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  SaturnFactory eINSTANCE = com.ms.qaTools.saturn.impl.SaturnFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Attribute Parameter</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Parameter</em>'.
   * @generated
   */
  AttributeParameter createAttributeParameter();

  /**
   * Returns a new object of class '<em>Comet Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Comet Step</em>'.
   * @generated
   */
  CometStep createCometStep();

  /**
   * Returns a new object of class '<em>Config</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Config</em>'.
   * @generated
   */
  Config createConfig();

  /**
   * Returns a new object of class '<em>Cps Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Cps Step</em>'.
   * @generated
   */
  CpsStep createCpsStep();

  /**
   * Returns a new object of class '<em>Custom Link</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Custom Link</em>'.
   * @generated
   */
  CustomLink createCustomLink();

  /**
   * Returns a new object of class '<em>Data Compare Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Data Compare Step</em>'.
   * @generated
   */
  DataCompareStep createDataCompareStep();

  /**
   * Returns a new object of class '<em>Data Compare Summary Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Data Compare Summary Step</em>'.
   * @generated
   */
  DataCompareSummaryStep createDataCompareSummaryStep();

  /**
   * Returns a new object of class '<em>Document Root</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Document Root</em>'.
   * @generated
   */
  DocumentRoot createDocumentRoot();

  /**
   * Returns a new object of class '<em>Documentum Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Documentum Step</em>'.
   * @generated
   */
  DocumentumStep createDocumentumStep();

  /**
   * Returns a new object of class '<em>DS Convert Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>DS Convert Step</em>'.
   * @generated
   */
  DSConvertStep createDSConvertStep();

  /**
   * Returns a new object of class '<em>DS Validator Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>DS Validator Step</em>'.
   * @generated
   */
  DSValidatorStep createDSValidatorStep();

  /**
   * Returns a new object of class '<em>Env Validator Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Env Validator Step</em>'.
   * @generated
   */
  EnvValidatorStep createEnvValidatorStep();

  /**
   * Returns a new object of class '<em>Extract DDL Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Extract DDL Step</em>'.
   * @generated
   */
  ExtractDDLStep createExtractDDLStep();

  /**
   * Returns a new object of class '<em>Fail Terminal</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Fail Terminal</em>'.
   * @generated
   */
  FailTerminal createFailTerminal();

  /**
   * Returns a new object of class '<em>Fix Manip Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Fix Manip Step</em>'.
   * @generated
   */
  FixManipStep createFixManipStep();

  /**
   * Returns a new object of class '<em>Include File</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Include File</em>'.
   * @generated
   */
  IncludeFile createIncludeFile();

  /**
   * Returns a new object of class '<em>Jira Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Jira Step</em>'.
   * @generated
   */
  JiraStep createJiraStep();

  /**
   * Returns a new object of class '<em>Kronus Step</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Kronus Step</em>'.
   * @generated
   */
  KronusStep createKronusStep();

  /**
   * Returns a new object of class '<em>Mail Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Mail Step</em>'.
   * @generated
   */
  MailStep createMailStep();

  /**
   * Returns a new object of class '<em>MQ Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>MQ Step</em>'.
   * @generated
   */
  MQStep createMQStep();

  /**
   * Returns a new object of class '<em>Noop Terminal</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Noop Terminal</em>'.
   * @generated
   */
  NoopTerminal createNoopTerminal();

  /**
   * Returns a new object of class '<em>On Fail Link</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>On Fail Link</em>'.
   * @generated
   */
  OnFailLink createOnFailLink();

  /**
   * Returns a new object of class '<em>On Finish Link</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>On Finish Link</em>'.
   * @generated
   */
  OnFinishLink createOnFinishLink();

  /**
   * Returns a new object of class '<em>On Pass Link</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>On Pass Link</em>'.
   * @generated
   */
  OnPassLink createOnPassLink();

  /**
   * Returns a new object of class '<em>P4 Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>P4 Step</em>'.
   * @generated
   */
  P4Step createP4Step();

  /**
   * Returns a new object of class '<em>Pass Terminal</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Pass Terminal</em>'.
   * @generated
   */
  PassTerminal createPassTerminal();

  /**
   * Returns a new object of class '<em>Perl Run Group Modifier</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Perl Run Group Modifier</em>'.
   * @generated
   */
  PerlRunGroupModifier createPerlRunGroupModifier();

  /**
   * Returns a new object of class '<em>Procedure Call Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Procedure Call Step</em>'.
   * @generated
   */
  ProcedureCallStep createProcedureCallStep();

  /**
   * Returns a new object of class '<em>Ps Manager Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Ps Manager Step</em>'.
   * @generated
   */
  PsManagerStep createPsManagerStep();

  /**
   * Returns a new object of class '<em>Reference</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Reference</em>'.
   * @generated
   */
  Reference createReference();

  /**
   * Returns a new object of class '<em>Reference Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Reference Step</em>'.
   * @generated
   */
  ReferenceStep createReferenceStep();

  /**
   * Returns a new object of class '<em>Resource Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Link</em>'.
   * @generated
   */
  ResourceLink createResourceLink();

  /**
   * Returns a new object of class '<em>Resource Nested Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Nested Link</em>'.
   * @generated
   */
  ResourceNestedLink createResourceNestedLink();

  /**
   * Returns a new object of class '<em>Resource Parameter</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Parameter</em>'.
   * @generated
   */
  ResourceParameter createResourceParameter();

  /**
   * Returns a new object of class '<em>Resource Step Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Step Link</em>'.
   * @generated
   */
  ResourceStepLink createResourceStepLink();

  /**
   * Returns a new object of class '<em>Run Cmds Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Run Cmds Step</em>'.
   * @generated
   */
  RunCmdsStep createRunCmdsStep();

  /**
   * Returns a new object of class '<em>Run Group</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Run Group</em>'.
   * @generated
   */
  RunGroup createRunGroup();

  /**
   * Returns a new object of class '<em>Run Group Import</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Run Group Import</em>'.
   * @generated
   */
  RunGroupImport createRunGroupImport();

  /**
   * Returns a new object of class '<em>Saturn</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Saturn</em>'.
   * @generated
   */
  Saturn createSaturn();

  /**
   * Returns a new object of class '<em>Singularity Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Singularity Step</em>'.
   * @generated
   */
  SingularityStep createSingularityStep();

  /**
   * Returns a new object of class '<em>Soap IO Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Soap IO Step</em>'.
   * @generated
   */
  SoapIOStep createSoapIOStep();

  /**
   * Returns a new object of class '<em>SQL Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>SQL Step</em>'.
   * @generated
   */
  SQLStep createSQLStep();

  /**
   * Returns a new object of class '<em>Vms Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Vms Step</em>'.
   * @generated
   */
  VmsStep createVmsStep();

  /**
   * Returns a new object of class '<em>Xml2 Csv Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Xml2 Csv Step</em>'.
   * @generated
   */
  Xml2CsvStep createXml2CsvStep();

  /**
   * Returns a new object of class '<em>Xml Diff Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Xml Diff Step</em>'.
   * @generated
   */
  XmlDiffStep createXmlDiffStep();

  /**
   * Returns a new object of class '<em>Xml Gen Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Xml Gen Step</em>'.
   * @generated
   */
  XmlGenStep createXmlGenStep();

  /**
   * Returns a new object of class '<em>Xml Manip Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Xml Manip Step</em>'.
   * @generated
   */
  XmlManipStep createXmlManipStep();

  /**
   * Returns a new object of class '<em>Xml Validator Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Xml Validator Step</em>'.
   * @generated
   */
  XmlValidatorStep createXmlValidatorStep();

  /**
   * Returns a new object of class '<em>XSplit Step</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>XSplit Step</em>'.
   * @generated
   */
  XSplitStep createXSplitStep();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SaturnPackage getSaturnPackage();

} // SaturnFactory
