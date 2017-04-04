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
package com.ms.qaTools.saturn.values.impl;

import com.ms.qaTools.saturn.SaturnPackage;

import com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportPackage;

import com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportPackageImpl;

import com.ms.qaTools.saturn.annotations.saturnVerbosity.SaturnVerbosityPackage;

import com.ms.qaTools.saturn.annotations.saturnVerbosity.impl.SaturnVerbosityPackageImpl;

import com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage;

import com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl;

import com.ms.qaTools.saturn.exception.ExceptionPackage;

import com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl;

import com.ms.qaTools.saturn.impl.SaturnPackageImpl;

import com.ms.qaTools.saturn.kronus.backport.BackportPackage;
import com.ms.qaTools.saturn.kronus.backport.impl.BackportPackageImpl;
import com.ms.qaTools.saturn.listeners.ListenersPackage;

import com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl;

import com.ms.qaTools.saturn.modules.XSplitModule.XSplitModulePackage;

import com.ms.qaTools.saturn.modules.XSplitModule.impl.XSplitModulePackageImpl;

import com.ms.qaTools.saturn.modules.cometModule.CometModulePackage;

import com.ms.qaTools.saturn.modules.cometModule.impl.CometModulePackageImpl;

import com.ms.qaTools.saturn.modules.cpsModule.CpsModulePackage;

import com.ms.qaTools.saturn.modules.cpsModule.impl.CpsModulePackageImpl;

import com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage;

import com.ms.qaTools.saturn.modules.datacompareModule.impl.DatacompareModulePackageImpl;

import com.ms.qaTools.saturn.modules.documentumModule.DocumentumModulePackage;

import com.ms.qaTools.saturn.modules.documentumModule.impl.DocumentumModulePackageImpl;

import com.ms.qaTools.saturn.modules.dsConvertModule.DsConvertModulePackage;

import com.ms.qaTools.saturn.modules.dsConvertModule.impl.DsConvertModulePackageImpl;

import com.ms.qaTools.saturn.modules.dsValidatorModule.DsValidatorModulePackage;

import com.ms.qaTools.saturn.modules.dsValidatorModule.impl.DsValidatorModulePackageImpl;

import com.ms.qaTools.saturn.modules.envValidatorModule.EnvValidatorModulePackage;

import com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvValidatorModulePackageImpl;

import com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage;

import com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl;

import com.ms.qaTools.saturn.modules.fixManipModule.FixManipModulePackage;

import com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipModulePackageImpl;

import com.ms.qaTools.saturn.modules.mailModule.MailModulePackage;

import com.ms.qaTools.saturn.modules.mailModule.impl.MailModulePackageImpl;

import com.ms.qaTools.saturn.modules.mqModule.MqModulePackage;

import com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl;

import com.ms.qaTools.saturn.modules.procedureCallModule.ProcedureCallModulePackage;

import com.ms.qaTools.saturn.modules.procedureCallModule.impl.ProcedureCallModulePackageImpl;

import com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModulePackage;

import com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerModulePackageImpl;

import com.ms.qaTools.saturn.modules.referenceModule.ReferenceModulePackage;

import com.ms.qaTools.saturn.modules.referenceModule.impl.ReferenceModulePackageImpl;

import com.ms.qaTools.saturn.modules.runcmdsModule.RuncmdsModulePackage;

import com.ms.qaTools.saturn.modules.runcmdsModule.impl.RuncmdsModulePackageImpl;

import com.ms.qaTools.saturn.modules.singularityModule.SingularityModulePackage;

import com.ms.qaTools.saturn.modules.singularityModule.impl.SingularityModulePackageImpl;

import com.ms.qaTools.saturn.modules.soapIOModule.SoapIOModulePackage;

import com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOModulePackageImpl;

import com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage;

import com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl;

import com.ms.qaTools.saturn.modules.xml2csvModule.Xml2csvModulePackage;

import com.ms.qaTools.saturn.modules.xml2csvModule.impl.Xml2csvModulePackageImpl;

import com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffModulePackage;

import com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffModulePackageImpl;

import com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenModulePackage;

import com.ms.qaTools.saturn.modules.xmlGenModule.impl.XmlGenModulePackageImpl;

import com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage;

import com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl;

import com.ms.qaTools.saturn.modules.xmlValidatorModule.XmlValidatorModulePackage;

import com.ms.qaTools.saturn.modules.xmlValidatorModule.impl.XmlValidatorModulePackageImpl;

import com.ms.qaTools.saturn.repetition.RepetitionPackage;

import com.ms.qaTools.saturn.repetition.impl.RepetitionPackageImpl;

import com.ms.qaTools.saturn.resources.dataSetResource.DataSetResourcePackage;

import com.ms.qaTools.saturn.resources.dataSetResource.impl.DataSetResourcePackageImpl;

import com.ms.qaTools.saturn.resources.db2Resource.Db2ResourcePackage;

import com.ms.qaTools.saturn.resources.db2Resource.impl.Db2ResourcePackageImpl;

import com.ms.qaTools.saturn.resources.directoryResource.DirectoryResourcePackage;

import com.ms.qaTools.saturn.resources.directoryResource.impl.DirectoryResourcePackageImpl;

import com.ms.qaTools.saturn.resources.documentumResource.DocumentumResourcePackage;

import com.ms.qaTools.saturn.resources.documentumResource.impl.DocumentumResourcePackageImpl;

import com.ms.qaTools.saturn.resources.dsSQLResource.DsSQLResourcePackage;

import com.ms.qaTools.saturn.resources.dsSQLResource.impl.DsSQLResourcePackageImpl;

import com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage;

import com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl;

import com.ms.qaTools.saturn.resources.h2Resource.H2ResourcePackage;

import com.ms.qaTools.saturn.resources.h2Resource.impl.H2ResourcePackageImpl;

import com.ms.qaTools.saturn.resources.icelinkResource.IcelinkResourcePackage;

import com.ms.qaTools.saturn.resources.icelinkResource.impl.IcelinkResourcePackageImpl;

import com.ms.qaTools.saturn.resources.informixResource.InformixResourcePackage;

import com.ms.qaTools.saturn.resources.informixResource.impl.InformixResourcePackageImpl;

import com.ms.qaTools.saturn.resources.ldapQueryResource.LdapQueryResourcePackage;

import com.ms.qaTools.saturn.resources.ldapQueryResource.impl.LdapQueryResourcePackageImpl;

import com.ms.qaTools.saturn.resources.ldapResource.LdapResourcePackage;

import com.ms.qaTools.saturn.resources.ldapResource.impl.LdapResourcePackageImpl;

import com.ms.qaTools.saturn.resources.mapperResource.MapperResourcePackage;

import com.ms.qaTools.saturn.resources.mapperResource.impl.MapperResourcePackageImpl;

import com.ms.qaTools.saturn.resources.markitwireResource.MarkitwireResourcePackage;

import com.ms.qaTools.saturn.resources.markitwireResource.impl.MarkitwireResourcePackageImpl;

import com.ms.qaTools.saturn.resources.mongoDbResource.MongoDbResourcePackage;

import com.ms.qaTools.saturn.resources.mongoDbResource.impl.MongoDbResourcePackageImpl;

import com.ms.qaTools.saturn.resources.mqResource.MqResourcePackage;

import com.ms.qaTools.saturn.resources.mqResource.impl.MqResourcePackageImpl;

import com.ms.qaTools.saturn.resources.mssqlResource.MssqlResourcePackage;

import com.ms.qaTools.saturn.resources.mssqlResource.impl.MssqlResourcePackageImpl;

import com.ms.qaTools.saturn.resources.nullResource.NullResourcePackage;

import com.ms.qaTools.saturn.resources.nullResource.impl.NullResourcePackageImpl;

import com.ms.qaTools.saturn.resources.oracleResource.OracleResourcePackage;

import com.ms.qaTools.saturn.resources.oracleResource.impl.OracleResourcePackageImpl;

import com.ms.qaTools.saturn.resources.queryResource.QueryResourcePackage;

import com.ms.qaTools.saturn.resources.queryResource.impl.QueryResourcePackageImpl;

import com.ms.qaTools.saturn.resources.referenceResource.ReferenceResourcePackage;

import com.ms.qaTools.saturn.resources.referenceResource.impl.ReferenceResourcePackageImpl;

import com.ms.qaTools.saturn.resources.rmiConnectionResource.RmiConnectionResourcePackage;

import com.ms.qaTools.saturn.resources.rmiConnectionResource.impl.RmiConnectionResourcePackageImpl;

import com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreResourcePackage;

import com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreResourcePackageImpl;

import com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResourcePackage;

import com.ms.qaTools.saturn.resources.shadowDirectResource.impl.ShadowDirectResourcePackageImpl;

import com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage;

import com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl;

import com.ms.qaTools.saturn.resources.sqliteResource.SqliteResourcePackage;

import com.ms.qaTools.saturn.resources.sqliteResource.impl.SqliteResourcePackageImpl;

import com.ms.qaTools.saturn.resources.sybaseResource.SybaseResourcePackage;

import com.ms.qaTools.saturn.resources.sybaseResource.impl.SybaseResourcePackageImpl;

import com.ms.qaTools.saturn.resources.teradataResource.TeradataResourcePackage;

import com.ms.qaTools.saturn.resources.teradataResource.impl.TeradataResourcePackageImpl;

import com.ms.qaTools.saturn.resources.transactionResource.TransactionResourcePackage;

import com.ms.qaTools.saturn.resources.transactionResource.impl.TransactionResourcePackageImpl;

import com.ms.qaTools.saturn.resources.udbResource.UdbResourcePackage;

import com.ms.qaTools.saturn.resources.udbResource.impl.UdbResourcePackageImpl;

import com.ms.qaTools.saturn.result.ResultPackage;

import com.ms.qaTools.saturn.result.impl.ResultPackageImpl;

import com.ms.qaTools.saturn.types.TypesPackage;

import com.ms.qaTools.saturn.types.impl.TypesPackageImpl;

import com.ms.qaTools.saturn.values.CellComplexValue;
import com.ms.qaTools.saturn.values.CodeComplexValue;
import com.ms.qaTools.saturn.values.ComplexValue;
import com.ms.qaTools.saturn.values.Describable;
import com.ms.qaTools.saturn.values.FIXComplexValue;
import com.ms.qaTools.saturn.values.FailBehaviorsEnum;
import com.ms.qaTools.saturn.values.Fallible;
import com.ms.qaTools.saturn.values.FallibleComplexValue;
import com.ms.qaTools.saturn.values.JSONComplexValue;
import com.ms.qaTools.saturn.values.PropertyComplexValue;
import com.ms.qaTools.saturn.values.ReferenceComplexValue;
import com.ms.qaTools.saturn.values.RunNumberComplexValue;
import com.ms.qaTools.saturn.values.TextComplexValue;
import com.ms.qaTools.saturn.values.ValuesFactory;
import com.ms.qaTools.saturn.values.ValuesPackage;
import com.ms.qaTools.saturn.values.XPathComplexValue;
import com.ms.qaTools.saturn.values.XPathReturnTypeEnum;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValuesPackageImpl extends EPackageImpl implements ValuesPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cellComplexValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass codeComplexValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass complexValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass describableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fallibleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fallibleComplexValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fixComplexValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsonComplexValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyComplexValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceComplexValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass runNumberComplexValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textComplexValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xPathComplexValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum failBehaviorsEnumEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum xPathReturnTypeEnumEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType failBehaviorsEnumObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType xPathReturnTypeEnumObjectEDataType = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.ms.qaTools.saturn.values.ValuesPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ValuesPackageImpl()
  {
    super(eNS_URI, ValuesFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ValuesPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ValuesPackage init()
  {
    if (isInited) return (ValuesPackage)EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);

    // Obtain or create and register package
    ValuesPackageImpl theValuesPackage = (ValuesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ValuesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ValuesPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XMLTypePackage.eINSTANCE.eClass();

    // Obtain or create and register interdependencies
    DatacompareModulePackageImpl theDatacompareModulePackage = (DatacompareModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatacompareModulePackage.eNS_URI) instanceof DatacompareModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatacompareModulePackage.eNS_URI) : DatacompareModulePackage.eINSTANCE);
    TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
    DocumentumModulePackageImpl theDocumentumModulePackage = (DocumentumModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DocumentumModulePackage.eNS_URI) instanceof DocumentumModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DocumentumModulePackage.eNS_URI) : DocumentumModulePackage.eINSTANCE);
    MailModulePackageImpl theMailModulePackage = (MailModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MailModulePackage.eNS_URI) instanceof MailModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MailModulePackage.eNS_URI) : MailModulePackage.eINSTANCE);
    MqModulePackageImpl theMqModulePackage = (MqModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MqModulePackage.eNS_URI) instanceof MqModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MqModulePackage.eNS_URI) : MqModulePackage.eINSTANCE);
    RuncmdsModulePackageImpl theRuncmdsModulePackage = (RuncmdsModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RuncmdsModulePackage.eNS_URI) instanceof RuncmdsModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RuncmdsModulePackage.eNS_URI) : RuncmdsModulePackage.eINSTANCE);
    SqlModulePackageImpl theSqlModulePackage = (SqlModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SqlModulePackage.eNS_URI) instanceof SqlModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SqlModulePackage.eNS_URI) : SqlModulePackage.eINSTANCE);
    Xml2csvModulePackageImpl theXml2csvModulePackage = (Xml2csvModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Xml2csvModulePackage.eNS_URI) instanceof Xml2csvModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Xml2csvModulePackage.eNS_URI) : Xml2csvModulePackage.eINSTANCE);
    XSplitModulePackageImpl theXSplitModulePackage = (XSplitModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XSplitModulePackage.eNS_URI) instanceof XSplitModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XSplitModulePackage.eNS_URI) : XSplitModulePackage.eINSTANCE);
    ReferenceModulePackageImpl theReferenceModulePackage = (ReferenceModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReferenceModulePackage.eNS_URI) instanceof ReferenceModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReferenceModulePackage.eNS_URI) : ReferenceModulePackage.eINSTANCE);
    SoapIOModulePackageImpl theSoapIOModulePackage = (SoapIOModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SoapIOModulePackage.eNS_URI) instanceof SoapIOModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SoapIOModulePackage.eNS_URI) : SoapIOModulePackage.eINSTANCE);
    XmlDiffModulePackageImpl theXmlDiffModulePackage = (XmlDiffModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XmlDiffModulePackage.eNS_URI) instanceof XmlDiffModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XmlDiffModulePackage.eNS_URI) : XmlDiffModulePackage.eINSTANCE);
    XmlGenModulePackageImpl theXmlGenModulePackage = (XmlGenModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XmlGenModulePackage.eNS_URI) instanceof XmlGenModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XmlGenModulePackage.eNS_URI) : XmlGenModulePackage.eINSTANCE);
    CpsModulePackageImpl theCpsModulePackage = (CpsModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CpsModulePackage.eNS_URI) instanceof CpsModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CpsModulePackage.eNS_URI) : CpsModulePackage.eINSTANCE);
    DsConvertModulePackageImpl theDsConvertModulePackage = (DsConvertModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DsConvertModulePackage.eNS_URI) instanceof DsConvertModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DsConvertModulePackage.eNS_URI) : DsConvertModulePackage.eINSTANCE);
    DsValidatorModulePackageImpl theDsValidatorModulePackage = (DsValidatorModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DsValidatorModulePackage.eNS_URI) instanceof DsValidatorModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DsValidatorModulePackage.eNS_URI) : DsValidatorModulePackage.eINSTANCE);
    EnvValidatorModulePackageImpl theEnvValidatorModulePackage = (EnvValidatorModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnvValidatorModulePackage.eNS_URI) instanceof EnvValidatorModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnvValidatorModulePackage.eNS_URI) : EnvValidatorModulePackage.eINSTANCE);
    ExtractDDLModulePackageImpl theExtractDDLModulePackage = (ExtractDDLModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExtractDDLModulePackage.eNS_URI) instanceof ExtractDDLModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExtractDDLModulePackage.eNS_URI) : ExtractDDLModulePackage.eINSTANCE);
    ProcedureCallModulePackageImpl theProcedureCallModulePackage = (ProcedureCallModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcedureCallModulePackage.eNS_URI) instanceof ProcedureCallModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcedureCallModulePackage.eNS_URI) : ProcedureCallModulePackage.eINSTANCE);
    ResultPackageImpl theResultPackage = (ResultPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResultPackage.eNS_URI) instanceof ResultPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResultPackage.eNS_URI) : ResultPackage.eINSTANCE);
    PsManagerModulePackageImpl thePsManagerModulePackage = (PsManagerModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PsManagerModulePackage.eNS_URI) instanceof PsManagerModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PsManagerModulePackage.eNS_URI) : PsManagerModulePackage.eINSTANCE);
    SingularityModulePackageImpl theSingularityModulePackage = (SingularityModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SingularityModulePackage.eNS_URI) instanceof SingularityModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SingularityModulePackage.eNS_URI) : SingularityModulePackage.eINSTANCE);
    XmlManipModulePackageImpl theXmlManipModulePackage = (XmlManipModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XmlManipModulePackage.eNS_URI) instanceof XmlManipModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XmlManipModulePackage.eNS_URI) : XmlManipModulePackage.eINSTANCE);
    XmlValidatorModulePackageImpl theXmlValidatorModulePackage = (XmlValidatorModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XmlValidatorModulePackage.eNS_URI) instanceof XmlValidatorModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XmlValidatorModulePackage.eNS_URI) : XmlValidatorModulePackage.eINSTANCE);
    CometModulePackageImpl theCometModulePackage = (CometModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CometModulePackage.eNS_URI) instanceof CometModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CometModulePackage.eNS_URI) : CometModulePackage.eINSTANCE);
    FixManipModulePackageImpl theFixManipModulePackage = (FixManipModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FixManipModulePackage.eNS_URI) instanceof FixManipModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FixManipModulePackage.eNS_URI) : FixManipModulePackage.eINSTANCE);
    ExceptionPackageImpl theExceptionPackage = (ExceptionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExceptionPackage.eNS_URI) instanceof ExceptionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExceptionPackage.eNS_URI) : ExceptionPackage.eINSTANCE);
    BackportPackageImpl theBackportPackage = (BackportPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BackportPackage.eNS_URI) instanceof BackportPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BackportPackage.eNS_URI) : BackportPackage.eINSTANCE);
    SaturnPackageImpl theSaturnPackage = (SaturnPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SaturnPackage.eNS_URI) instanceof SaturnPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SaturnPackage.eNS_URI) : SaturnPackage.eINSTANCE);
    ReferenceResourcePackageImpl theReferenceResourcePackage = (ReferenceResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReferenceResourcePackage.eNS_URI) instanceof ReferenceResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReferenceResourcePackage.eNS_URI) : ReferenceResourcePackage.eINSTANCE);
    DirectoryResourcePackageImpl theDirectoryResourcePackage = (DirectoryResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DirectoryResourcePackage.eNS_URI) instanceof DirectoryResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DirectoryResourcePackage.eNS_URI) : DirectoryResourcePackage.eINSTANCE);
    FileResourcePackageImpl theFileResourcePackage = (FileResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FileResourcePackage.eNS_URI) instanceof FileResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FileResourcePackage.eNS_URI) : FileResourcePackage.eINSTANCE);
    MqResourcePackageImpl theMqResourcePackage = (MqResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MqResourcePackage.eNS_URI) instanceof MqResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MqResourcePackage.eNS_URI) : MqResourcePackage.eINSTANCE);
    SybaseResourcePackageImpl theSybaseResourcePackage = (SybaseResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SybaseResourcePackage.eNS_URI) instanceof SybaseResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SybaseResourcePackage.eNS_URI) : SybaseResourcePackage.eINSTANCE);
    MssqlResourcePackageImpl theMssqlResourcePackage = (MssqlResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MssqlResourcePackage.eNS_URI) instanceof MssqlResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MssqlResourcePackage.eNS_URI) : MssqlResourcePackage.eINSTANCE);
    Db2ResourcePackageImpl theDb2ResourcePackage = (Db2ResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Db2ResourcePackage.eNS_URI) instanceof Db2ResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Db2ResourcePackage.eNS_URI) : Db2ResourcePackage.eINSTANCE);
    UdbResourcePackageImpl theUdbResourcePackage = (UdbResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UdbResourcePackage.eNS_URI) instanceof UdbResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UdbResourcePackage.eNS_URI) : UdbResourcePackage.eINSTANCE);
    DataSetResourcePackageImpl theDataSetResourcePackage = (DataSetResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataSetResourcePackage.eNS_URI) instanceof DataSetResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataSetResourcePackage.eNS_URI) : DataSetResourcePackage.eINSTANCE);
    SqliteResourcePackageImpl theSqliteResourcePackage = (SqliteResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SqliteResourcePackage.eNS_URI) instanceof SqliteResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SqliteResourcePackage.eNS_URI) : SqliteResourcePackage.eINSTANCE);
    SaturnWebPackageImpl theSaturnWebPackage = (SaturnWebPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SaturnWebPackage.eNS_URI) instanceof SaturnWebPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SaturnWebPackage.eNS_URI) : SaturnWebPackage.eINSTANCE);
    TransactionResourcePackageImpl theTransactionResourcePackage = (TransactionResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TransactionResourcePackage.eNS_URI) instanceof TransactionResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TransactionResourcePackage.eNS_URI) : TransactionResourcePackage.eINSTANCE);
    SoapIOResourcePackageImpl theSoapIOResourcePackage = (SoapIOResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SoapIOResourcePackage.eNS_URI) instanceof SoapIOResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SoapIOResourcePackage.eNS_URI) : SoapIOResourcePackage.eINSTANCE);
    TeradataResourcePackageImpl theTeradataResourcePackage = (TeradataResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TeradataResourcePackage.eNS_URI) instanceof TeradataResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TeradataResourcePackage.eNS_URI) : TeradataResourcePackage.eINSTANCE);
    ListenersPackageImpl theListenersPackage = (ListenersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ListenersPackage.eNS_URI) instanceof ListenersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ListenersPackage.eNS_URI) : ListenersPackage.eINSTANCE);
    DocumentumResourcePackageImpl theDocumentumResourcePackage = (DocumentumResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DocumentumResourcePackage.eNS_URI) instanceof DocumentumResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DocumentumResourcePackage.eNS_URI) : DocumentumResourcePackage.eINSTANCE);
    RepetitionPackageImpl theRepetitionPackage = (RepetitionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RepetitionPackage.eNS_URI) instanceof RepetitionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RepetitionPackage.eNS_URI) : RepetitionPackage.eINSTANCE);
    IcelinkResourcePackageImpl theIcelinkResourcePackage = (IcelinkResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IcelinkResourcePackage.eNS_URI) instanceof IcelinkResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IcelinkResourcePackage.eNS_URI) : IcelinkResourcePackage.eINSTANCE);
    InformixResourcePackageImpl theInformixResourcePackage = (InformixResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformixResourcePackage.eNS_URI) instanceof InformixResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformixResourcePackage.eNS_URI) : InformixResourcePackage.eINSTANCE);
    LdapQueryResourcePackageImpl theLdapQueryResourcePackage = (LdapQueryResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LdapQueryResourcePackage.eNS_URI) instanceof LdapQueryResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LdapQueryResourcePackage.eNS_URI) : LdapQueryResourcePackage.eINSTANCE);
    LdapResourcePackageImpl theLdapResourcePackage = (LdapResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LdapResourcePackage.eNS_URI) instanceof LdapResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LdapResourcePackage.eNS_URI) : LdapResourcePackage.eINSTANCE);
    MarkitwireResourcePackageImpl theMarkitwireResourcePackage = (MarkitwireResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MarkitwireResourcePackage.eNS_URI) instanceof MarkitwireResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MarkitwireResourcePackage.eNS_URI) : MarkitwireResourcePackage.eINSTANCE);
    OracleResourcePackageImpl theOracleResourcePackage = (OracleResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OracleResourcePackage.eNS_URI) instanceof OracleResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OracleResourcePackage.eNS_URI) : OracleResourcePackage.eINSTANCE);
    QueryResourcePackageImpl theQueryResourcePackage = (QueryResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QueryResourcePackage.eNS_URI) instanceof QueryResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QueryResourcePackage.eNS_URI) : QueryResourcePackage.eINSTANCE);
    SaturnReportPackageImpl theSaturnReportPackage = (SaturnReportPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SaturnReportPackage.eNS_URI) instanceof SaturnReportPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SaturnReportPackage.eNS_URI) : SaturnReportPackage.eINSTANCE);
    RmiConnectionResourcePackageImpl theRmiConnectionResourcePackage = (RmiConnectionResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RmiConnectionResourcePackage.eNS_URI) instanceof RmiConnectionResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RmiConnectionResourcePackage.eNS_URI) : RmiConnectionResourcePackage.eINSTANCE);
    SaturnVerbosityPackageImpl theSaturnVerbosityPackage = (SaturnVerbosityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SaturnVerbosityPackage.eNS_URI) instanceof SaturnVerbosityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SaturnVerbosityPackage.eNS_URI) : SaturnVerbosityPackage.eINSTANCE);
    ShadowDirectResourcePackageImpl theShadowDirectResourcePackage = (ShadowDirectResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ShadowDirectResourcePackage.eNS_URI) instanceof ShadowDirectResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ShadowDirectResourcePackage.eNS_URI) : ShadowDirectResourcePackage.eINSTANCE);
    NullResourcePackageImpl theNullResourcePackage = (NullResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NullResourcePackage.eNS_URI) instanceof NullResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NullResourcePackage.eNS_URI) : NullResourcePackage.eINSTANCE);
    DsSQLResourcePackageImpl theDsSQLResourcePackage = (DsSQLResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DsSQLResourcePackage.eNS_URI) instanceof DsSQLResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DsSQLResourcePackage.eNS_URI) : DsSQLResourcePackage.eINSTANCE);
    SemaphoreResourcePackageImpl theSemaphoreResourcePackage = (SemaphoreResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SemaphoreResourcePackage.eNS_URI) instanceof SemaphoreResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SemaphoreResourcePackage.eNS_URI) : SemaphoreResourcePackage.eINSTANCE);
    MongoDbResourcePackageImpl theMongoDbResourcePackage = (MongoDbResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MongoDbResourcePackage.eNS_URI) instanceof MongoDbResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MongoDbResourcePackage.eNS_URI) : MongoDbResourcePackage.eINSTANCE);
    H2ResourcePackageImpl theH2ResourcePackage = (H2ResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(H2ResourcePackage.eNS_URI) instanceof H2ResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(H2ResourcePackage.eNS_URI) : H2ResourcePackage.eINSTANCE);
    MapperResourcePackageImpl theMapperResourcePackage = (MapperResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MapperResourcePackage.eNS_URI) instanceof MapperResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MapperResourcePackage.eNS_URI) : MapperResourcePackage.eINSTANCE);

    // Create package meta-data objects
    theValuesPackage.createPackageContents();
    theDatacompareModulePackage.createPackageContents();
    theTypesPackage.createPackageContents();
    theDocumentumModulePackage.createPackageContents();
    theMailModulePackage.createPackageContents();
    theMqModulePackage.createPackageContents();
    theRuncmdsModulePackage.createPackageContents();
    theSqlModulePackage.createPackageContents();
    theXml2csvModulePackage.createPackageContents();
    theXSplitModulePackage.createPackageContents();
    theReferenceModulePackage.createPackageContents();
    theSoapIOModulePackage.createPackageContents();
    theXmlDiffModulePackage.createPackageContents();
    theXmlGenModulePackage.createPackageContents();
    theCpsModulePackage.createPackageContents();
    theDsConvertModulePackage.createPackageContents();
    theDsValidatorModulePackage.createPackageContents();
    theEnvValidatorModulePackage.createPackageContents();
    theExtractDDLModulePackage.createPackageContents();
    theProcedureCallModulePackage.createPackageContents();
    theResultPackage.createPackageContents();
    thePsManagerModulePackage.createPackageContents();
    theSingularityModulePackage.createPackageContents();
    theXmlManipModulePackage.createPackageContents();
    theXmlValidatorModulePackage.createPackageContents();
    theCometModulePackage.createPackageContents();
    theFixManipModulePackage.createPackageContents();
    theExceptionPackage.createPackageContents();
    theBackportPackage.createPackageContents();
    theSaturnPackage.createPackageContents();
    theReferenceResourcePackage.createPackageContents();
    theDirectoryResourcePackage.createPackageContents();
    theFileResourcePackage.createPackageContents();
    theMqResourcePackage.createPackageContents();
    theSybaseResourcePackage.createPackageContents();
    theMssqlResourcePackage.createPackageContents();
    theDb2ResourcePackage.createPackageContents();
    theUdbResourcePackage.createPackageContents();
    theDataSetResourcePackage.createPackageContents();
    theSqliteResourcePackage.createPackageContents();
    theSaturnWebPackage.createPackageContents();
    theTransactionResourcePackage.createPackageContents();
    theSoapIOResourcePackage.createPackageContents();
    theTeradataResourcePackage.createPackageContents();
    theListenersPackage.createPackageContents();
    theDocumentumResourcePackage.createPackageContents();
    theRepetitionPackage.createPackageContents();
    theIcelinkResourcePackage.createPackageContents();
    theInformixResourcePackage.createPackageContents();
    theLdapQueryResourcePackage.createPackageContents();
    theLdapResourcePackage.createPackageContents();
    theMarkitwireResourcePackage.createPackageContents();
    theOracleResourcePackage.createPackageContents();
    theQueryResourcePackage.createPackageContents();
    theSaturnReportPackage.createPackageContents();
    theRmiConnectionResourcePackage.createPackageContents();
    theSaturnVerbosityPackage.createPackageContents();
    theShadowDirectResourcePackage.createPackageContents();
    theNullResourcePackage.createPackageContents();
    theDsSQLResourcePackage.createPackageContents();
    theSemaphoreResourcePackage.createPackageContents();
    theMongoDbResourcePackage.createPackageContents();
    theH2ResourcePackage.createPackageContents();
    theMapperResourcePackage.createPackageContents();

    // Initialize created meta-data
    theValuesPackage.initializePackageContents();
    theDatacompareModulePackage.initializePackageContents();
    theTypesPackage.initializePackageContents();
    theDocumentumModulePackage.initializePackageContents();
    theMailModulePackage.initializePackageContents();
    theMqModulePackage.initializePackageContents();
    theRuncmdsModulePackage.initializePackageContents();
    theSqlModulePackage.initializePackageContents();
    theXml2csvModulePackage.initializePackageContents();
    theXSplitModulePackage.initializePackageContents();
    theReferenceModulePackage.initializePackageContents();
    theSoapIOModulePackage.initializePackageContents();
    theXmlDiffModulePackage.initializePackageContents();
    theXmlGenModulePackage.initializePackageContents();
    theCpsModulePackage.initializePackageContents();
    theDsConvertModulePackage.initializePackageContents();
    theDsValidatorModulePackage.initializePackageContents();
    theEnvValidatorModulePackage.initializePackageContents();
    theExtractDDLModulePackage.initializePackageContents();
    theProcedureCallModulePackage.initializePackageContents();
    theResultPackage.initializePackageContents();
    thePsManagerModulePackage.initializePackageContents();
    theSingularityModulePackage.initializePackageContents();
    theXmlManipModulePackage.initializePackageContents();
    theXmlValidatorModulePackage.initializePackageContents();
    theCometModulePackage.initializePackageContents();
    theFixManipModulePackage.initializePackageContents();
    theExceptionPackage.initializePackageContents();
    theBackportPackage.initializePackageContents();
    theSaturnPackage.initializePackageContents();
    theReferenceResourcePackage.initializePackageContents();
    theDirectoryResourcePackage.initializePackageContents();
    theFileResourcePackage.initializePackageContents();
    theMqResourcePackage.initializePackageContents();
    theSybaseResourcePackage.initializePackageContents();
    theMssqlResourcePackage.initializePackageContents();
    theDb2ResourcePackage.initializePackageContents();
    theUdbResourcePackage.initializePackageContents();
    theDataSetResourcePackage.initializePackageContents();
    theSqliteResourcePackage.initializePackageContents();
    theSaturnWebPackage.initializePackageContents();
    theTransactionResourcePackage.initializePackageContents();
    theSoapIOResourcePackage.initializePackageContents();
    theTeradataResourcePackage.initializePackageContents();
    theListenersPackage.initializePackageContents();
    theDocumentumResourcePackage.initializePackageContents();
    theRepetitionPackage.initializePackageContents();
    theIcelinkResourcePackage.initializePackageContents();
    theInformixResourcePackage.initializePackageContents();
    theLdapQueryResourcePackage.initializePackageContents();
    theLdapResourcePackage.initializePackageContents();
    theMarkitwireResourcePackage.initializePackageContents();
    theOracleResourcePackage.initializePackageContents();
    theQueryResourcePackage.initializePackageContents();
    theSaturnReportPackage.initializePackageContents();
    theRmiConnectionResourcePackage.initializePackageContents();
    theSaturnVerbosityPackage.initializePackageContents();
    theShadowDirectResourcePackage.initializePackageContents();
    theNullResourcePackage.initializePackageContents();
    theDsSQLResourcePackage.initializePackageContents();
    theSemaphoreResourcePackage.initializePackageContents();
    theMongoDbResourcePackage.initializePackageContents();
    theH2ResourcePackage.initializePackageContents();
    theMapperResourcePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theValuesPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ValuesPackage.eNS_URI, theValuesPackage);
    return theValuesPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCellComplexValue()
  {
    return cellComplexValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCellComplexValue_Resource()
  {
    return (EReference)cellComplexValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCellComplexValue_Row()
  {
    return (EReference)cellComplexValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCellComplexValue_Column()
  {
    return (EReference)cellComplexValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCellComplexValue_ColumnName()
  {
    return (EReference)cellComplexValueEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCellComplexValue_Memoize()
  {
    return (EAttribute)cellComplexValueEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCodeComplexValue()
  {
    return codeComplexValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeComplexValue_Interpreter()
  {
    return (EAttribute)codeComplexValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexValue()
  {
    return complexValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComplexValue_Mixed()
  {
    return (EAttribute)complexValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexValue_Null()
  {
    return (EReference)complexValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComplexValue_Group()
  {
    return (EAttribute)complexValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexValue_Text()
  {
    return (EReference)complexValueEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexValue_EnvVar()
  {
    return (EReference)complexValueEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexValue_File()
  {
    return (EReference)complexValueEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexValue_XPathValue()
  {
    return (EReference)complexValueEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexValue_JSONValue()
  {
    return (EReference)complexValueEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexValue_FIXValue()
  {
    return (EReference)complexValueEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexValue_CellValue()
  {
    return (EReference)complexValueEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexValue_PropertyValue()
  {
    return (EReference)complexValueEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexValue_Code()
  {
    return (EReference)complexValueEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexValue_RunNumber()
  {
    return (EReference)complexValueEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexValue_Reference()
  {
    return (EReference)complexValueEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComplexValue_Memoize()
  {
    return (EAttribute)complexValueEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDescribable()
  {
    return describableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDescribable_Description()
  {
    return (EAttribute)describableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFallible()
  {
    return fallibleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFallible_DefaultValue()
  {
    return (EReference)fallibleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFallible_FailBehavior()
  {
    return (EAttribute)fallibleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFallibleComplexValue()
  {
    return fallibleComplexValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFIXComplexValue()
  {
    return fixComplexValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFIXComplexValue_Resource()
  {
    return (EReference)fixComplexValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFIXComplexValue_FIXPath()
  {
    return (EReference)fixComplexValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFIXComplexValue_MessageType()
  {
    return (EReference)fixComplexValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFIXComplexValue_Row()
  {
    return (EReference)fixComplexValueEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFIXComplexValue_ReturnType()
  {
    return (EAttribute)fixComplexValueEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJSONComplexValue()
  {
    return jsonComplexValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJSONComplexValue_Resource()
  {
    return (EReference)jsonComplexValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJSONComplexValue_JSONPath()
  {
    return (EReference)jsonComplexValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJSONComplexValue_Row()
  {
    return (EReference)jsonComplexValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyComplexValue()
  {
    return propertyComplexValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyComplexValue_Resource()
  {
    return (EReference)propertyComplexValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyComplexValue_Property()
  {
    return (EReference)propertyComplexValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferenceComplexValue()
  {
    return referenceComplexValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferenceComplexValue_IncludeFile()
  {
    return (EAttribute)referenceComplexValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferenceComplexValue_Template()
  {
    return (EAttribute)referenceComplexValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferenceComplexValue_RunGroup()
  {
    return (EAttribute)referenceComplexValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferenceComplexValue_SaturnAttribute()
  {
    return (EAttribute)referenceComplexValueEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferenceComplexValue_UserAttribute()
  {
    return (EAttribute)referenceComplexValueEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferenceComplexValue_ModuleAttribute()
  {
    return (EAttribute)referenceComplexValueEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRunNumberComplexValue()
  {
    return runNumberComplexValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRunNumberComplexValue_Padding()
  {
    return (EAttribute)runNumberComplexValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRunNumberComplexValue_PadCharacter()
  {
    return (EAttribute)runNumberComplexValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextComplexValue()
  {
    return textComplexValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextComplexValue_Text()
  {
    return (EAttribute)textComplexValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXPathComplexValue()
  {
    return xPathComplexValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXPathComplexValue_Resource()
  {
    return (EReference)xPathComplexValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXPathComplexValue_XPath()
  {
    return (EReference)xPathComplexValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXPathComplexValue_Namespaces()
  {
    return (EReference)xPathComplexValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXPathComplexValue_Row()
  {
    return (EReference)xPathComplexValueEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXPathComplexValue_Fragment()
  {
    return (EAttribute)xPathComplexValueEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXPathComplexValue_ReturnType()
  {
    return (EAttribute)xPathComplexValueEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFailBehaviorsEnum()
  {
    return failBehaviorsEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getXPathReturnTypeEnum()
  {
    return xPathReturnTypeEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getFailBehaviorsEnumObject()
  {
    return failBehaviorsEnumObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getXPathReturnTypeEnumObject()
  {
    return xPathReturnTypeEnumObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValuesFactory getValuesFactory()
  {
    return (ValuesFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    cellComplexValueEClass = createEClass(CELL_COMPLEX_VALUE);
    createEReference(cellComplexValueEClass, CELL_COMPLEX_VALUE__RESOURCE);
    createEReference(cellComplexValueEClass, CELL_COMPLEX_VALUE__ROW);
    createEReference(cellComplexValueEClass, CELL_COMPLEX_VALUE__COLUMN);
    createEReference(cellComplexValueEClass, CELL_COMPLEX_VALUE__COLUMN_NAME);
    createEAttribute(cellComplexValueEClass, CELL_COMPLEX_VALUE__MEMOIZE);

    codeComplexValueEClass = createEClass(CODE_COMPLEX_VALUE);
    createEAttribute(codeComplexValueEClass, CODE_COMPLEX_VALUE__INTERPRETER);

    complexValueEClass = createEClass(COMPLEX_VALUE);
    createEAttribute(complexValueEClass, COMPLEX_VALUE__MIXED);
    createEReference(complexValueEClass, COMPLEX_VALUE__NULL);
    createEAttribute(complexValueEClass, COMPLEX_VALUE__GROUP);
    createEReference(complexValueEClass, COMPLEX_VALUE__TEXT);
    createEReference(complexValueEClass, COMPLEX_VALUE__ENV_VAR);
    createEReference(complexValueEClass, COMPLEX_VALUE__FILE);
    createEReference(complexValueEClass, COMPLEX_VALUE__XPATH_VALUE);
    createEReference(complexValueEClass, COMPLEX_VALUE__JSON_VALUE);
    createEReference(complexValueEClass, COMPLEX_VALUE__FIX_VALUE);
    createEReference(complexValueEClass, COMPLEX_VALUE__CELL_VALUE);
    createEReference(complexValueEClass, COMPLEX_VALUE__PROPERTY_VALUE);
    createEReference(complexValueEClass, COMPLEX_VALUE__CODE);
    createEReference(complexValueEClass, COMPLEX_VALUE__RUN_NUMBER);
    createEReference(complexValueEClass, COMPLEX_VALUE__REFERENCE);
    createEAttribute(complexValueEClass, COMPLEX_VALUE__MEMOIZE);

    describableEClass = createEClass(DESCRIBABLE);
    createEAttribute(describableEClass, DESCRIBABLE__DESCRIPTION);

    fallibleEClass = createEClass(FALLIBLE);
    createEReference(fallibleEClass, FALLIBLE__DEFAULT_VALUE);
    createEAttribute(fallibleEClass, FALLIBLE__FAIL_BEHAVIOR);

    fallibleComplexValueEClass = createEClass(FALLIBLE_COMPLEX_VALUE);

    fixComplexValueEClass = createEClass(FIX_COMPLEX_VALUE);
    createEReference(fixComplexValueEClass, FIX_COMPLEX_VALUE__RESOURCE);
    createEReference(fixComplexValueEClass, FIX_COMPLEX_VALUE__FIX_PATH);
    createEReference(fixComplexValueEClass, FIX_COMPLEX_VALUE__MESSAGE_TYPE);
    createEReference(fixComplexValueEClass, FIX_COMPLEX_VALUE__ROW);
    createEAttribute(fixComplexValueEClass, FIX_COMPLEX_VALUE__RETURN_TYPE);

    jsonComplexValueEClass = createEClass(JSON_COMPLEX_VALUE);
    createEReference(jsonComplexValueEClass, JSON_COMPLEX_VALUE__RESOURCE);
    createEReference(jsonComplexValueEClass, JSON_COMPLEX_VALUE__JSON_PATH);
    createEReference(jsonComplexValueEClass, JSON_COMPLEX_VALUE__ROW);

    propertyComplexValueEClass = createEClass(PROPERTY_COMPLEX_VALUE);
    createEReference(propertyComplexValueEClass, PROPERTY_COMPLEX_VALUE__RESOURCE);
    createEReference(propertyComplexValueEClass, PROPERTY_COMPLEX_VALUE__PROPERTY);

    referenceComplexValueEClass = createEClass(REFERENCE_COMPLEX_VALUE);
    createEAttribute(referenceComplexValueEClass, REFERENCE_COMPLEX_VALUE__INCLUDE_FILE);
    createEAttribute(referenceComplexValueEClass, REFERENCE_COMPLEX_VALUE__TEMPLATE);
    createEAttribute(referenceComplexValueEClass, REFERENCE_COMPLEX_VALUE__RUN_GROUP);
    createEAttribute(referenceComplexValueEClass, REFERENCE_COMPLEX_VALUE__SATURN_ATTRIBUTE);
    createEAttribute(referenceComplexValueEClass, REFERENCE_COMPLEX_VALUE__USER_ATTRIBUTE);
    createEAttribute(referenceComplexValueEClass, REFERENCE_COMPLEX_VALUE__MODULE_ATTRIBUTE);

    runNumberComplexValueEClass = createEClass(RUN_NUMBER_COMPLEX_VALUE);
    createEAttribute(runNumberComplexValueEClass, RUN_NUMBER_COMPLEX_VALUE__PADDING);
    createEAttribute(runNumberComplexValueEClass, RUN_NUMBER_COMPLEX_VALUE__PAD_CHARACTER);

    textComplexValueEClass = createEClass(TEXT_COMPLEX_VALUE);
    createEAttribute(textComplexValueEClass, TEXT_COMPLEX_VALUE__TEXT);

    xPathComplexValueEClass = createEClass(XPATH_COMPLEX_VALUE);
    createEReference(xPathComplexValueEClass, XPATH_COMPLEX_VALUE__RESOURCE);
    createEReference(xPathComplexValueEClass, XPATH_COMPLEX_VALUE__XPATH);
    createEReference(xPathComplexValueEClass, XPATH_COMPLEX_VALUE__NAMESPACES);
    createEReference(xPathComplexValueEClass, XPATH_COMPLEX_VALUE__ROW);
    createEAttribute(xPathComplexValueEClass, XPATH_COMPLEX_VALUE__FRAGMENT);
    createEAttribute(xPathComplexValueEClass, XPATH_COMPLEX_VALUE__RETURN_TYPE);

    // Create enums
    failBehaviorsEnumEEnum = createEEnum(FAIL_BEHAVIORS_ENUM);
    xPathReturnTypeEnumEEnum = createEEnum(XPATH_RETURN_TYPE_ENUM);

    // Create data types
    failBehaviorsEnumObjectEDataType = createEDataType(FAIL_BEHAVIORS_ENUM_OBJECT);
    xPathReturnTypeEnumObjectEDataType = createEDataType(XPATH_RETURN_TYPE_ENUM_OBJECT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    cellComplexValueEClass.getESuperTypes().add(this.getFallible());
    cellComplexValueEClass.getESuperTypes().add(this.getDescribable());
    codeComplexValueEClass.getESuperTypes().add(this.getFallibleComplexValue());
    codeComplexValueEClass.getESuperTypes().add(this.getDescribable());
    complexValueEClass.getESuperTypes().add(this.getDescribable());
    fallibleComplexValueEClass.getESuperTypes().add(this.getComplexValue());
    fallibleComplexValueEClass.getESuperTypes().add(this.getFallible());
    fixComplexValueEClass.getESuperTypes().add(this.getFallible());
    fixComplexValueEClass.getESuperTypes().add(this.getDescribable());
    jsonComplexValueEClass.getESuperTypes().add(this.getFallible());
    jsonComplexValueEClass.getESuperTypes().add(this.getDescribable());
    propertyComplexValueEClass.getESuperTypes().add(this.getFallible());
    propertyComplexValueEClass.getESuperTypes().add(this.getDescribable());
    xPathComplexValueEClass.getESuperTypes().add(this.getFallible());
    xPathComplexValueEClass.getESuperTypes().add(this.getDescribable());

    // Initialize classes and features; add operations and parameters
    initEClass(cellComplexValueEClass, CellComplexValue.class, "CellComplexValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCellComplexValue_Resource(), theTypesPackage.getResourceDefinition(), null, "resource", null, 1, 1, CellComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCellComplexValue_Row(), this.getComplexValue(), null, "row", null, 0, 1, CellComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCellComplexValue_Column(), this.getComplexValue(), null, "column", null, 1, 1, CellComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCellComplexValue_ColumnName(), this.getComplexValue(), null, "columnName", null, 0, 1, CellComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCellComplexValue_Memoize(), theXMLTypePackage.getBoolean(), "memoize", "true", 0, 1, CellComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(codeComplexValueEClass, CodeComplexValue.class, "CodeComplexValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCodeComplexValue_Interpreter(), theTypesPackage.getInterpretersEnum(), "interpreter", "SHELL", 0, 1, CodeComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(complexValueEClass, ComplexValue.class, "ComplexValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComplexValue_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComplexValue_Null(), theTypesPackage.getEmpty(), null, "null", null, 0, 1, ComplexValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getComplexValue_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ComplexValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getComplexValue_Text(), this.getTextComplexValue(), null, "text", null, 0, -1, ComplexValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getComplexValue_EnvVar(), this.getFallibleComplexValue(), null, "envVar", null, 0, -1, ComplexValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getComplexValue_File(), this.getFallibleComplexValue(), null, "file", null, 0, -1, ComplexValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getComplexValue_XPathValue(), this.getXPathComplexValue(), null, "xPathValue", null, 0, -1, ComplexValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getComplexValue_JSONValue(), this.getJSONComplexValue(), null, "jSONValue", null, 0, -1, ComplexValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getComplexValue_FIXValue(), this.getFIXComplexValue(), null, "fIXValue", null, 0, -1, ComplexValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getComplexValue_CellValue(), this.getCellComplexValue(), null, "cellValue", null, 0, -1, ComplexValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getComplexValue_PropertyValue(), this.getPropertyComplexValue(), null, "propertyValue", null, 0, -1, ComplexValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getComplexValue_Code(), this.getCodeComplexValue(), null, "code", null, 0, -1, ComplexValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getComplexValue_RunNumber(), this.getRunNumberComplexValue(), null, "runNumber", null, 0, -1, ComplexValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getComplexValue_Reference(), this.getReferenceComplexValue(), null, "reference", null, 0, -1, ComplexValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getComplexValue_Memoize(), theXMLTypePackage.getBoolean(), "memoize", "true", 0, 1, ComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(describableEClass, Describable.class, "Describable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDescribable_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, Describable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fallibleEClass, Fallible.class, "Fallible", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFallible_DefaultValue(), this.getComplexValue(), null, "defaultValue", null, 0, 1, Fallible.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFallible_FailBehavior(), this.getFailBehaviorsEnum(), "failBehavior", "IGNORE", 0, 1, Fallible.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fallibleComplexValueEClass, FallibleComplexValue.class, "FallibleComplexValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fixComplexValueEClass, FIXComplexValue.class, "FIXComplexValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFIXComplexValue_Resource(), theTypesPackage.getNamedResourceDefinition(), null, "resource", null, 1, 1, FIXComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFIXComplexValue_FIXPath(), this.getComplexValue(), null, "fIXPath", null, 1, 1, FIXComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFIXComplexValue_MessageType(), this.getComplexValue(), null, "messageType", null, 1, 1, FIXComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFIXComplexValue_Row(), this.getComplexValue(), null, "row", null, 1, 1, FIXComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFIXComplexValue_ReturnType(), this.getXPathReturnTypeEnum(), "returnType", "STRING", 0, 1, FIXComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonComplexValueEClass, JSONComplexValue.class, "JSONComplexValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJSONComplexValue_Resource(), theTypesPackage.getNamedResourceDefinition(), null, "resource", null, 1, 1, JSONComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJSONComplexValue_JSONPath(), this.getComplexValue(), null, "jSONPath", null, 1, 1, JSONComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJSONComplexValue_Row(), this.getComplexValue(), null, "row", null, 1, 1, JSONComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyComplexValueEClass, PropertyComplexValue.class, "PropertyComplexValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropertyComplexValue_Resource(), theTypesPackage.getResourceDefinition(), null, "resource", null, 1, 1, PropertyComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPropertyComplexValue_Property(), this.getComplexValue(), null, "property", null, 1, 1, PropertyComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceComplexValueEClass, ReferenceComplexValue.class, "ReferenceComplexValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReferenceComplexValue_IncludeFile(), theXMLTypePackage.getToken(), "includeFile", null, 0, 1, ReferenceComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReferenceComplexValue_Template(), theXMLTypePackage.getToken(), "template", null, 0, 1, ReferenceComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReferenceComplexValue_RunGroup(), theXMLTypePackage.getToken(), "runGroup", null, 0, 1, ReferenceComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReferenceComplexValue_SaturnAttribute(), theXMLTypePackage.getToken(), "saturnAttribute", null, 0, 1, ReferenceComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReferenceComplexValue_UserAttribute(), theXMLTypePackage.getToken(), "userAttribute", null, 0, 1, ReferenceComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReferenceComplexValue_ModuleAttribute(), theXMLTypePackage.getToken(), "moduleAttribute", null, 0, 1, ReferenceComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(runNumberComplexValueEClass, RunNumberComplexValue.class, "RunNumberComplexValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRunNumberComplexValue_Padding(), theXMLTypePackage.getInteger(), "padding", "3", 0, 1, RunNumberComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRunNumberComplexValue_PadCharacter(), theXMLTypePackage.getString(), "padCharacter", "0", 0, 1, RunNumberComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textComplexValueEClass, TextComplexValue.class, "TextComplexValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTextComplexValue_Text(), theXMLTypePackage.getString(), "text", null, 0, 1, TextComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xPathComplexValueEClass, XPathComplexValue.class, "XPathComplexValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXPathComplexValue_Resource(), theTypesPackage.getResourceDefinition(), null, "resource", null, 1, 1, XPathComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXPathComplexValue_XPath(), this.getComplexValue(), null, "xPath", null, 1, 1, XPathComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXPathComplexValue_Namespaces(), theTypesPackage.getResourceDefinition(), null, "namespaces", null, 0, 1, XPathComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXPathComplexValue_Row(), this.getComplexValue(), null, "row", null, 1, 1, XPathComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXPathComplexValue_Fragment(), theXMLTypePackage.getBoolean(), "fragment", "true", 0, 1, XPathComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXPathComplexValue_ReturnType(), this.getXPathReturnTypeEnum(), "returnType", "NODE", 0, 1, XPathComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(failBehaviorsEnumEEnum, FailBehaviorsEnum.class, "FailBehaviorsEnum");
    addEEnumLiteral(failBehaviorsEnumEEnum, FailBehaviorsEnum.IGNORE);
    addEEnumLiteral(failBehaviorsEnumEEnum, FailBehaviorsEnum.WARN);
    addEEnumLiteral(failBehaviorsEnumEEnum, FailBehaviorsEnum.ERROR);

    initEEnum(xPathReturnTypeEnumEEnum, XPathReturnTypeEnum.class, "XPathReturnTypeEnum");
    addEEnumLiteral(xPathReturnTypeEnumEEnum, XPathReturnTypeEnum.NODE);
    addEEnumLiteral(xPathReturnTypeEnumEEnum, XPathReturnTypeEnum.STRING);
    addEEnumLiteral(xPathReturnTypeEnumEEnum, XPathReturnTypeEnum.NUMBER);
    addEEnumLiteral(xPathReturnTypeEnumEEnum, XPathReturnTypeEnum.BOOLEAN);

    // Initialize data types
    initEDataType(failBehaviorsEnumObjectEDataType, FailBehaviorsEnum.class, "FailBehaviorsEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(xPathReturnTypeEnumObjectEDataType, XPathReturnTypeEnum.class, "XPathReturnTypeEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http://www.ms.com/2011/tdo-qa-tools/rcs
    createRcsAnnotations();
    // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
    createExtendedMetaDataAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.ms.com/2011/tdo-qa-tools/rcs</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createRcsAnnotations()
  {
    String source = "http://www.ms.com/2011/tdo-qa-tools/rcs";	
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "author", "$Author$",
       "change", "$Change$",
       "file", "$File$",
       "id", "$Id$",
       "revision", "$Revision$",
       "timestamp", "$DateTime$"
       });
  }

  /**
   * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createExtendedMetaDataAnnotations()
  {
    String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
    addAnnotation
      (cellComplexValueEClass, 
       source, 
       new String[] 
       {
       "name", "CellValue_._type",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getCellComplexValue_Resource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Resource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getCellComplexValue_Row(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Row",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getCellComplexValue_Column(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Column",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getCellComplexValue_ColumnName(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ColumnName",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getCellComplexValue_Memoize(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "memoize"
       });	
    addAnnotation
      (codeComplexValueEClass, 
       source, 
       new String[] 
       {
       "name", "Code_._type",
       "kind", "mixed"
       });	
    addAnnotation
      (getCodeComplexValue_Interpreter(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "interpreter"
       });	
    addAnnotation
      (complexValueEClass, 
       source, 
       new String[] 
       {
       "name", "complexValue",
       "kind", "mixed"
       });	
    addAnnotation
      (getComplexValue_Mixed(), 
       source, 
       new String[] 
       {
       "kind", "elementWildcard",
       "name", ":mixed"
       });	
    addAnnotation
      (getComplexValue_Null(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Null",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getComplexValue_Group(), 
       source, 
       new String[] 
       {
       "kind", "group",
       "name", "group:3"
       });	
    addAnnotation
      (getComplexValue_Text(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Text",
       "namespace", "##targetNamespace",
       "group", "#group:3"
       });	
    addAnnotation
      (getComplexValue_EnvVar(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "EnvVar",
       "namespace", "##targetNamespace",
       "group", "#group:3"
       });	
    addAnnotation
      (getComplexValue_File(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "File",
       "namespace", "##targetNamespace",
       "group", "#group:3"
       });	
    addAnnotation
      (getComplexValue_XPathValue(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "XPathValue",
       "namespace", "##targetNamespace",
       "group", "#group:3"
       });	
    addAnnotation
      (getComplexValue_JSONValue(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "JSONValue",
       "namespace", "##targetNamespace",
       "group", "#group:3"
       });	
    addAnnotation
      (getComplexValue_FIXValue(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "FIXValue",
       "namespace", "##targetNamespace",
       "group", "#group:3"
       });	
    addAnnotation
      (getComplexValue_CellValue(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "CellValue",
       "namespace", "##targetNamespace",
       "group", "#group:3"
       });	
    addAnnotation
      (getComplexValue_PropertyValue(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "PropertyValue",
       "namespace", "##targetNamespace",
       "group", "#group:3"
       });	
    addAnnotation
      (getComplexValue_Code(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Code",
       "namespace", "##targetNamespace",
       "group", "#group:3"
       });	
    addAnnotation
      (getComplexValue_RunNumber(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "RunNumber",
       "namespace", "##targetNamespace",
       "group", "#group:3"
       });	
    addAnnotation
      (getComplexValue_Reference(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Reference",
       "namespace", "##targetNamespace",
       "group", "#group:3"
       });	
    addAnnotation
      (getComplexValue_Memoize(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "memoize"
       });	
    addAnnotation
      (describableEClass, 
       source, 
       new String[] 
       {
       "name", "Describable",
       "kind", "empty"
       });	
    addAnnotation
      (getDescribable_Description(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "description"
       });	
    addAnnotation
      (failBehaviorsEnumEEnum, 
       source, 
       new String[] 
       {
       "name", "FailBehaviorsEnum"
       });	
    addAnnotation
      (failBehaviorsEnumObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "FailBehaviorsEnum:Object",
       "baseType", "FailBehaviorsEnum"
       });	
    addAnnotation
      (fallibleEClass, 
       source, 
       new String[] 
       {
       "name", "Fallible",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getFallible_DefaultValue(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "DefaultValue",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getFallible_FailBehavior(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "failBehavior"
       });	
    addAnnotation
      (fallibleComplexValueEClass, 
       source, 
       new String[] 
       {
       "name", "FallibleComplexValue",
       "kind", "mixed"
       });	
    addAnnotation
      (fixComplexValueEClass, 
       source, 
       new String[] 
       {
       "name", "FIXValue_._type",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getFIXComplexValue_Resource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Resource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getFIXComplexValue_FIXPath(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "FIXPath",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getFIXComplexValue_MessageType(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "MessageType",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getFIXComplexValue_Row(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Row",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getFIXComplexValue_ReturnType(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "returnType"
       });	
    addAnnotation
      (jsonComplexValueEClass, 
       source, 
       new String[] 
       {
       "name", "JSONValue_._type",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getJSONComplexValue_Resource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Resource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getJSONComplexValue_JSONPath(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "JSONPath",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getJSONComplexValue_Row(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Row",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (propertyComplexValueEClass, 
       source, 
       new String[] 
       {
       "name", "PropertyValue_._type",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getPropertyComplexValue_Resource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Resource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getPropertyComplexValue_Property(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Property",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (referenceComplexValueEClass, 
       source, 
       new String[] 
       {
       "name", "Reference_._type",
       "kind", "empty"
       });	
    addAnnotation
      (getReferenceComplexValue_IncludeFile(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "includeFile"
       });	
    addAnnotation
      (getReferenceComplexValue_Template(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "template"
       });	
    addAnnotation
      (getReferenceComplexValue_RunGroup(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "runGroup"
       });	
    addAnnotation
      (getReferenceComplexValue_SaturnAttribute(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "saturnAttribute"
       });	
    addAnnotation
      (getReferenceComplexValue_UserAttribute(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "userAttribute"
       });	
    addAnnotation
      (getReferenceComplexValue_ModuleAttribute(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "moduleAttribute"
       });	
    addAnnotation
      (runNumberComplexValueEClass, 
       source, 
       new String[] 
       {
       "name", "RunNumber_._type",
       "kind", "empty"
       });	
    addAnnotation
      (getRunNumberComplexValue_Padding(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "padding"
       });	
    addAnnotation
      (getRunNumberComplexValue_PadCharacter(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "padCharacter"
       });	
    addAnnotation
      (textComplexValueEClass, 
       source, 
       new String[] 
       {
       "name", "Text_._type",
       "kind", "empty"
       });	
    addAnnotation
      (getTextComplexValue_Text(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "text"
       });	
    addAnnotation
      (xPathComplexValueEClass, 
       source, 
       new String[] 
       {
       "name", "XPathValue_._type",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getXPathComplexValue_Resource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Resource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getXPathComplexValue_XPath(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "XPath",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getXPathComplexValue_Namespaces(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Namespaces",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getXPathComplexValue_Row(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Row",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getXPathComplexValue_Fragment(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "fragment"
       });	
    addAnnotation
      (getXPathComplexValue_ReturnType(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "returnType"
       });	
    addAnnotation
      (xPathReturnTypeEnumEEnum, 
       source, 
       new String[] 
       {
       "name", "XPathReturnTypeEnum"
       });	
    addAnnotation
      (xPathReturnTypeEnumObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "XPathReturnTypeEnum:Object",
       "baseType", "XPathReturnTypeEnum"
       });
  }

} //ValuesPackageImpl
