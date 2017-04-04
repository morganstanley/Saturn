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
package com.ms.qaTools.saturn.resources.mapperResource.impl;

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

import com.ms.qaTools.saturn.resources.mapperResource.AbstractManipulatorOperation;
import com.ms.qaTools.saturn.resources.mapperResource.ConverterResource;
import com.ms.qaTools.saturn.resources.mapperResource.CustomResource;
import com.ms.qaTools.saturn.resources.mapperResource.ExtractorResource;
import com.ms.qaTools.saturn.resources.mapperResource.GeneratorResource;
import com.ms.qaTools.saturn.resources.mapperResource.ManipulatorResource;
import com.ms.qaTools.saturn.resources.mapperResource.MappedResource;
import com.ms.qaTools.saturn.resources.mapperResource.MapperResourceFactory;
import com.ms.qaTools.saturn.resources.mapperResource.MapperResourcePackage;
import com.ms.qaTools.saturn.resources.mapperResource.ValidatorResource;

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

import com.ms.qaTools.saturn.values.ValuesPackage;

import com.ms.qaTools.saturn.values.impl.ValuesPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class MapperResourcePackageImpl extends EPackageImpl implements MapperResourcePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractManipulatorOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass converterResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extractorResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass generatorResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass manipulatorResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappedResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass validatorResourceEClass = null;

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
   * @see com.ms.qaTools.saturn.resources.mapperResource.MapperResourcePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MapperResourcePackageImpl()
  {
    super(eNS_URI, MapperResourceFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link MapperResourcePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MapperResourcePackage init()
  {
    if (isInited) return (MapperResourcePackage)EPackage.Registry.INSTANCE.getEPackage(MapperResourcePackage.eNS_URI);

    // Obtain or create and register package
    MapperResourcePackageImpl theMapperResourcePackage = (MapperResourcePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MapperResourcePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MapperResourcePackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XMLTypePackage.eINSTANCE.eClass();

    // Obtain or create and register interdependencies
    DatacompareModulePackageImpl theDatacompareModulePackage = (DatacompareModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatacompareModulePackage.eNS_URI) instanceof DatacompareModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatacompareModulePackage.eNS_URI) : DatacompareModulePackage.eINSTANCE);
    TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
    DocumentumModulePackageImpl theDocumentumModulePackage = (DocumentumModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DocumentumModulePackage.eNS_URI) instanceof DocumentumModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DocumentumModulePackage.eNS_URI) : DocumentumModulePackage.eINSTANCE);
    ValuesPackageImpl theValuesPackage = (ValuesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) instanceof ValuesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) : ValuesPackage.eINSTANCE);
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

    // Create package meta-data objects
    theMapperResourcePackage.createPackageContents();
    theDatacompareModulePackage.createPackageContents();
    theTypesPackage.createPackageContents();
    theDocumentumModulePackage.createPackageContents();
    theValuesPackage.createPackageContents();
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

    // Initialize created meta-data
    theMapperResourcePackage.initializePackageContents();
    theDatacompareModulePackage.initializePackageContents();
    theTypesPackage.initializePackageContents();
    theDocumentumModulePackage.initializePackageContents();
    theValuesPackage.initializePackageContents();
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

    // Mark meta-data to indicate it can't be changed
    theMapperResourcePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MapperResourcePackage.eNS_URI, theMapperResourcePackage);
    return theMapperResourcePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractManipulatorOperation()
  {
    return abstractManipulatorOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConverterResource()
  {
    return converterResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConverterResource_InputResource()
  {
    return (EReference)converterResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConverterResource_Method()
  {
    return (EAttribute)converterResourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCustomResource()
  {
    return customResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCustomResource_Code()
  {
    return (EReference)customResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtractorResource()
  {
    return extractorResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtractorResource_InputResource()
  {
    return (EReference)extractorResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtractorResource_Configuration()
  {
    return (EReference)extractorResourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeneratorResource()
  {
    return generatorResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeneratorResource_InputResource()
  {
    return (EReference)generatorResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeneratorResource_TemplateResource()
  {
    return (EReference)generatorResourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getManipulatorResource()
  {
    return manipulatorResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getManipulatorResource_InputResource()
  {
    return (EReference)manipulatorResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getManipulatorResource_Operations()
  {
    return (EReference)manipulatorResourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMappedResource()
  {
    return mappedResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappedResource_InputResources()
  {
    return (EReference)mappedResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappedResource_Arguments()
  {
    return (EReference)mappedResourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappedResource_Method()
  {
    return (EAttribute)mappedResourceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValidatorResource()
  {
    return validatorResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValidatorResource_LeftResource()
  {
    return (EReference)validatorResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValidatorResource_RightResource()
  {
    return (EReference)validatorResourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValidatorResource_Configuration()
  {
    return (EReference)validatorResourceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapperResourceFactory getMapperResourceFactory()
  {
    return (MapperResourceFactory)getEFactoryInstance();
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
    abstractManipulatorOperationEClass = createEClass(ABSTRACT_MANIPULATOR_OPERATION);

    converterResourceEClass = createEClass(CONVERTER_RESOURCE);
    createEReference(converterResourceEClass, CONVERTER_RESOURCE__INPUT_RESOURCE);
    createEAttribute(converterResourceEClass, CONVERTER_RESOURCE__METHOD);

    customResourceEClass = createEClass(CUSTOM_RESOURCE);
    createEReference(customResourceEClass, CUSTOM_RESOURCE__CODE);

    extractorResourceEClass = createEClass(EXTRACTOR_RESOURCE);
    createEReference(extractorResourceEClass, EXTRACTOR_RESOURCE__INPUT_RESOURCE);
    createEReference(extractorResourceEClass, EXTRACTOR_RESOURCE__CONFIGURATION);

    generatorResourceEClass = createEClass(GENERATOR_RESOURCE);
    createEReference(generatorResourceEClass, GENERATOR_RESOURCE__INPUT_RESOURCE);
    createEReference(generatorResourceEClass, GENERATOR_RESOURCE__TEMPLATE_RESOURCE);

    manipulatorResourceEClass = createEClass(MANIPULATOR_RESOURCE);
    createEReference(manipulatorResourceEClass, MANIPULATOR_RESOURCE__INPUT_RESOURCE);
    createEReference(manipulatorResourceEClass, MANIPULATOR_RESOURCE__OPERATIONS);

    mappedResourceEClass = createEClass(MAPPED_RESOURCE);
    createEReference(mappedResourceEClass, MAPPED_RESOURCE__INPUT_RESOURCES);
    createEReference(mappedResourceEClass, MAPPED_RESOURCE__ARGUMENTS);
    createEAttribute(mappedResourceEClass, MAPPED_RESOURCE__METHOD);

    validatorResourceEClass = createEClass(VALIDATOR_RESOURCE);
    createEReference(validatorResourceEClass, VALIDATOR_RESOURCE__LEFT_RESOURCE);
    createEReference(validatorResourceEClass, VALIDATOR_RESOURCE__RIGHT_RESOURCE);
    createEReference(validatorResourceEClass, VALIDATOR_RESOURCE__CONFIGURATION);
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
    ValuesPackage theValuesPackage = (ValuesPackage)EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);
    ProcedureCallModulePackage theProcedureCallModulePackage = (ProcedureCallModulePackage)EPackage.Registry.INSTANCE.getEPackage(ProcedureCallModulePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    converterResourceEClass.getESuperTypes().add(theTypesPackage.getNamedResourceDefinition());
    customResourceEClass.getESuperTypes().add(theTypesPackage.getNamedResourceDefinition());
    extractorResourceEClass.getESuperTypes().add(theTypesPackage.getNamedResourceDefinition());
    generatorResourceEClass.getESuperTypes().add(theTypesPackage.getNamedResourceDefinition());
    manipulatorResourceEClass.getESuperTypes().add(theTypesPackage.getNamedResourceDefinition());
    mappedResourceEClass.getESuperTypes().add(theTypesPackage.getNamedResourceDefinition());
    validatorResourceEClass.getESuperTypes().add(theTypesPackage.getNamedResourceDefinition());

    // Initialize classes and features; add operations and parameters
    initEClass(abstractManipulatorOperationEClass, AbstractManipulatorOperation.class, "AbstractManipulatorOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(converterResourceEClass, ConverterResource.class, "ConverterResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConverterResource_InputResource(), theTypesPackage.getNamedResourceDefinition(), null, "inputResource", null, 1, 1, ConverterResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConverterResource_Method(), theXMLTypePackage.getToken(), "method", null, 0, 1, ConverterResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customResourceEClass, CustomResource.class, "CustomResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCustomResource_Code(), theValuesPackage.getComplexValue(), null, "code", null, 1, 1, CustomResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extractorResourceEClass, ExtractorResource.class, "ExtractorResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExtractorResource_InputResource(), theTypesPackage.getNamedResourceDefinition(), null, "inputResource", null, 1, 1, ExtractorResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExtractorResource_Configuration(), theTypesPackage.getNamedResourceDefinition(), null, "configuration", null, 1, 1, ExtractorResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(generatorResourceEClass, GeneratorResource.class, "GeneratorResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGeneratorResource_InputResource(), theTypesPackage.getNamedResourceDefinition(), null, "inputResource", null, 1, 1, GeneratorResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGeneratorResource_TemplateResource(), theTypesPackage.getNamedResourceDefinition(), null, "templateResource", null, 1, 1, GeneratorResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(manipulatorResourceEClass, ManipulatorResource.class, "ManipulatorResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getManipulatorResource_InputResource(), theTypesPackage.getNamedResourceDefinition(), null, "inputResource", null, 1, 1, ManipulatorResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getManipulatorResource_Operations(), this.getAbstractManipulatorOperation(), null, "operations", null, 0, -1, ManipulatorResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappedResourceEClass, MappedResource.class, "MappedResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMappedResource_InputResources(), theTypesPackage.getNamedResourceDefinition(), null, "inputResources", null, 0, -1, MappedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappedResource_Arguments(), theProcedureCallModulePackage.getAbstractArgument(), null, "arguments", null, 0, -1, MappedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMappedResource_Method(), theXMLTypePackage.getToken(), "method", null, 0, 1, MappedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(validatorResourceEClass, ValidatorResource.class, "ValidatorResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getValidatorResource_LeftResource(), theTypesPackage.getNamedResourceDefinition(), null, "leftResource", null, 1, 1, ValidatorResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getValidatorResource_RightResource(), theTypesPackage.getNamedResourceDefinition(), null, "rightResource", null, 1, 1, ValidatorResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getValidatorResource_Configuration(), theTypesPackage.getNamedResourceDefinition(), null, "configuration", null, 1, 1, ValidatorResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
      (abstractManipulatorOperationEClass, 
       source, 
       new String[] 
       {
       "name", "AbstractManipulatorOperation",
       "kind", "empty"
       });	
    addAnnotation
      (converterResourceEClass, 
       source, 
       new String[] 
       {
       "name", "ConverterResource",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getConverterResource_InputResource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "InputResource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getConverterResource_Method(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "method"
       });	
    addAnnotation
      (customResourceEClass, 
       source, 
       new String[] 
       {
       "name", "CustomResource",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getCustomResource_Code(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Code",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (extractorResourceEClass, 
       source, 
       new String[] 
       {
       "name", "ExtractorResource",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getExtractorResource_InputResource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "InputResource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getExtractorResource_Configuration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (generatorResourceEClass, 
       source, 
       new String[] 
       {
       "name", "GeneratorResource",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getGeneratorResource_InputResource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "InputResource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getGeneratorResource_TemplateResource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "TemplateResource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (manipulatorResourceEClass, 
       source, 
       new String[] 
       {
       "name", "ManipulatorResource",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getManipulatorResource_InputResource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "InputResource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getManipulatorResource_Operations(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Operations",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (mappedResourceEClass, 
       source, 
       new String[] 
       {
       "name", "MappedResource",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getMappedResource_InputResources(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "InputResources",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getMappedResource_Arguments(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Arguments",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getMappedResource_Method(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "method"
       });	
    addAnnotation
      (validatorResourceEClass, 
       source, 
       new String[] 
       {
       "name", "ValidatorResource",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getValidatorResource_LeftResource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "LeftResource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getValidatorResource_RightResource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "RightResource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getValidatorResource_Configuration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "##targetNamespace"
       });
  }

} //MapperResourcePackageImpl
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
