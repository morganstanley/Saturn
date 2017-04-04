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
package com.ms.qaTools.saturn.modules.extractDDLModule.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

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
import com.ms.qaTools.saturn.modules.extractDDLModule.AbstractOperation;
import com.ms.qaTools.saturn.modules.extractDDLModule.AlterOperation;
import com.ms.qaTools.saturn.modules.extractDDLModule.DataBaseDriverTypeEnum;
import com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation;
import com.ms.qaTools.saturn.modules.extractDDLModule.DocumentRoot;
import com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLConfiguration;
import com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModuleFactory;
import com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage;
import com.ms.qaTools.saturn.modules.extractDDLModule.ExtractOperation;
import com.ms.qaTools.saturn.modules.extractDDLModule.ImpactOperation;
import com.ms.qaTools.saturn.modules.extractDDLModule.ReadOperation;
import com.ms.qaTools.saturn.modules.extractDDLModule.RenderOperation;
import com.ms.qaTools.saturn.modules.extractDDLModule.TableLockOverrideTypeEnum;
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
import com.ms.qaTools.saturn.values.ValuesPackage;
import com.ms.qaTools.saturn.values.impl.ValuesPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class ExtractDDLModulePackageImpl extends EPackageImpl implements ExtractDDLModulePackage
{
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    abstractOperationEClass                  = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    alterOperationEClass                     = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    diffOperationEClass                      = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    documentRootEClass                       = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    extractDDLConfigurationEClass            = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    extractOperationEClass                   = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    impactOperationEClass                    = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    readOperationEClass                      = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    renderOperationEClass                    = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EEnum     dataBaseDriverTypeEnumEEnum              = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EEnum     tableLockOverrideTypeEnumEEnum           = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType dataBaseDriverTypeEnumObjectEDataType    = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType tableLockOverrideTypeEnumObjectEDataType = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
   * EPackage.Registry} by the package package URI value.
   * <p>
   * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
   * performs initialization of the package, or returns the registered package, if one already exists. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ExtractDDLModulePackageImpl()
  {
    super(eNS_URI, ExtractDDLModuleFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>
   * This method is used to initialize {@link ExtractDDLModulePackage#eINSTANCE} when that field is accessed. Clients
   * should not invoke it directly. Instead, they should simply access that field to obtain the package. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ExtractDDLModulePackage init()
  {
    if (isInited) return (ExtractDDLModulePackage)EPackage.Registry.INSTANCE.getEPackage(ExtractDDLModulePackage.eNS_URI);

    // Obtain or create and register package
    ExtractDDLModulePackageImpl theExtractDDLModulePackage = (ExtractDDLModulePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExtractDDLModulePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExtractDDLModulePackageImpl());

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
    theExtractDDLModulePackage.createPackageContents();
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
    theExtractDDLModulePackage.initializePackageContents();
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
    theExtractDDLModulePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ExtractDDLModulePackage.eNS_URI, theExtractDDLModulePackage);
    return theExtractDDLModulePackage;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractOperation()
  {
    return abstractOperationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractOperation_Objects()
  {
    return (EReference)abstractOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractOperation_Enabled()
  {
    return (EAttribute)abstractOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlterOperation()
  {
    return alterOperationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlterOperation_Exception()
  {
    return (EReference)alterOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlterOperation_OutputResource()
  {
    return (EReference)alterOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlterOperation_DataBaseQualifier()
  {
    return (EReference)alterOperationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlterOperation_DataBaseOverride()
  {
    return (EReference)alterOperationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlterOperation_TableSpaceOverride()
  {
    return (EReference)alterOperationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlterOperation_TableSpaceSuffix()
  {
    return (EReference)alterOperationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlterOperation_StorageGroupOverride()
  {
    return (EReference)alterOperationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlterOperation_QualifierMaps()
  {
    return (EReference)alterOperationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlterOperation_DataBaseMaps()
  {
    return (EReference)alterOperationEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlterOperation_StorageGroupMaps()
  {
    return (EReference)alterOperationEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlterOperation_AddDataBaseName()
  {
    return (EAttribute)alterOperationEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlterOperation_AddOwner()
  {
    return (EAttribute)alterOperationEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlterOperation_AddQualifier()
  {
    return (EAttribute)alterOperationEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlterOperation_CreateTableSpaces()
  {
    return (EAttribute)alterOperationEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlterOperation_ForceAlter()
  {
    return (EAttribute)alterOperationEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlterOperation_GenIDByDefault()
  {
    return (EAttribute)alterOperationEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlterOperation_IgnoreMissing()
  {
    return (EAttribute)alterOperationEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlterOperation_NoComments()
  {
    return (EAttribute)alterOperationEClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlterOperation_NoRestrictOnDrop()
  {
    return (EAttribute)alterOperationEClass.getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlterOperation_RemoveRestrictOnDrop()
  {
    return (EAttribute)alterOperationEClass.getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlterOperation_SeparateForeignKeys()
  {
    return (EAttribute)alterOperationEClass.getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlterOperation_TableLockOverride()
  {
    return (EAttribute)alterOperationEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlterOperation_TranslateProcedureDefs()
  {
    return (EAttribute)alterOperationEClass.getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlterOperation_TranslateViewDefs()
  {
    return (EAttribute)alterOperationEClass.getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getDiffOperation()
  {
    return diffOperationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiffOperation_Exception()
  {
    return (EReference)diffOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiffOperation_OutputResource()
  {
    return (EReference)diffOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiffOperation_DataBaseQualifier()
  {
    return (EReference)diffOperationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiffOperation_ColumnLength()
  {
    return (EReference)diffOperationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiffOperation_ObjectMaps()
  {
    return (EReference)diffOperationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiffOperation_IgnoreMissing()
  {
    return (EAttribute)diffOperationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiffOperation_OmitIndexes()
  {
    return (EAttribute)diffOperationEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiffOperation_OmitNewlyAdded()
  {
    return (EAttribute)diffOperationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiffOperation_OmitPermissions()
  {
    return (EAttribute)diffOperationEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiffOperation_OmitProcedures()
  {
    return (EAttribute)diffOperationEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiffOperation_OmitSequences()
  {
    return (EAttribute)diffOperationEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiffOperation_OmitStorage()
  {
    return (EAttribute)diffOperationEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiffOperation_OmitTables()
  {
    return (EAttribute)diffOperationEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiffOperation_OmitTableSpaces()
  {
    return (EAttribute)diffOperationEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiffOperation_OmitViews()
  {
    return (EAttribute)diffOperationEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiffOperation_PreserveColumnSequence()
  {
    return (EAttribute)diffOperationEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiffOperation_ShowIdenticals()
  {
    return (EAttribute)diffOperationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocumentRoot()
  {
    return documentRootEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentRoot_Mixed()
  {
    return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_XMLNSPrefixMap()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_XSISchemaLocation()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_ExtractDDLConfiguration()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtractDDLConfiguration()
  {
    return extractDDLConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtractDDLConfiguration_EnvFile()
  {
    return (EReference)extractDDLConfigurationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtractDDLConfiguration_Operations()
  {
    return (EReference)extractDDLConfigurationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtractOperation()
  {
    return extractOperationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtractOperation_Exception()
  {
    return (EReference)extractOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtractOperation_DatabaseResource()
  {
    return (EReference)extractOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtractOperation_DataBaseQualifier()
  {
    return (EReference)extractOperationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExtractOperation_IgnoreMissing()
  {
    return (EAttribute)extractOperationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getImpactOperation()
  {
    return impactOperationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getImpactOperation_Exception()
  {
    return (EReference)impactOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getImpactOperation_OutputResource()
  {
    return (EReference)impactOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getReadOperation()
  {
    return readOperationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getReadOperation_Exception()
  {
    return (EReference)readOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getReadOperation_Input()
  {
    return (EReference)readOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getReadOperation_DataBaseQualifier()
  {
    return (EReference)readOperationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReadOperation_IgnoreMissing()
  {
    return (EAttribute)readOperationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getRenderOperation()
  {
    return renderOperationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getRenderOperation_Exception()
  {
    return (EReference)renderOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getRenderOperation_OutputResource()
  {
    return (EReference)renderOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getRenderOperation_DataBaseQualifier()
  {
    return (EReference)renderOperationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getRenderOperation_DataBaseOverride()
  {
    return (EReference)renderOperationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getRenderOperation_TableSpaceOverride()
  {
    return (EReference)renderOperationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getRenderOperation_TableSpaceSuffix()
  {
    return (EReference)renderOperationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getRenderOperation_StorageGroupOverride()
  {
    return (EReference)renderOperationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getRenderOperation_QualifierMaps()
  {
    return (EReference)renderOperationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getRenderOperation_DataBaseMaps()
  {
    return (EReference)renderOperationEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getRenderOperation_StorageGroupMaps()
  {
    return (EReference)renderOperationEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRenderOperation_AddDataBaseName()
  {
    return (EAttribute)renderOperationEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRenderOperation_AddOwner()
  {
    return (EAttribute)renderOperationEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRenderOperation_AddQualifier()
  {
    return (EAttribute)renderOperationEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRenderOperation_CreateForeignKeys()
  {
    return (EAttribute)renderOperationEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRenderOperation_CreateIndexes()
  {
    return (EAttribute)renderOperationEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRenderOperation_CreatePermissions()
  {
    return (EAttribute)renderOperationEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRenderOperation_CreatePrimaryKeys()
  {
    return (EAttribute)renderOperationEClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRenderOperation_CreateTableSpaces()
  {
    return (EAttribute)renderOperationEClass.getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRenderOperation_DataBaseDriver()
  {
    return (EAttribute)renderOperationEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRenderOperation_DdlXml()
  {
    return (EAttribute)renderOperationEClass.getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRenderOperation_DeferViews()
  {
    return (EAttribute)renderOperationEClass.getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRenderOperation_DropProcedures()
  {
    return (EAttribute)renderOperationEClass.getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRenderOperation_DropSequences()
  {
    return (EAttribute)renderOperationEClass.getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRenderOperation_DropTables()
  {
    return (EAttribute)renderOperationEClass.getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRenderOperation_DropTableSpaces()
  {
    return (EAttribute)renderOperationEClass.getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRenderOperation_GenIDByDefault()
  {
    return (EAttribute)renderOperationEClass.getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRenderOperation_NoComments()
  {
    return (EAttribute)renderOperationEClass.getEStructuralFeatures().get(27);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRenderOperation_NoDDLInfo()
  {
    return (EAttribute)renderOperationEClass.getEStructuralFeatures().get(28);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRenderOperation_NoRestrictOnDrop()
  {
    return (EAttribute)renderOperationEClass.getEStructuralFeatures().get(29);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRenderOperation_PublicPermissions()
  {
    return (EAttribute)renderOperationEClass.getEStructuralFeatures().get(30);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRenderOperation_RemoveRestrictOnDrop()
  {
    return (EAttribute)renderOperationEClass.getEStructuralFeatures().get(31);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRenderOperation_SeparateForeignKeys()
  {
    return (EAttribute)renderOperationEClass.getEStructuralFeatures().get(32);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRenderOperation_ShortFileNames()
  {
    return (EAttribute)renderOperationEClass.getEStructuralFeatures().get(33);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRenderOperation_TableLockOverride()
  {
    return (EAttribute)renderOperationEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRenderOperation_TranslateProcedureDefs()
  {
    return (EAttribute)renderOperationEClass.getEStructuralFeatures().get(34);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRenderOperation_TranslateViewDefs()
  {
    return (EAttribute)renderOperationEClass.getEStructuralFeatures().get(35);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDataBaseDriverTypeEnum()
  {
    return dataBaseDriverTypeEnumEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTableLockOverrideTypeEnum()
  {
    return tableLockOverrideTypeEnumEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataType getDataBaseDriverTypeEnumObject()
  {
    return dataBaseDriverTypeEnumObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataType getTableLockOverrideTypeEnumObject()
  {
    return tableLockOverrideTypeEnumObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ExtractDDLModuleFactory getExtractDDLModuleFactory()
  {
    return (ExtractDDLModuleFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    abstractOperationEClass = createEClass(ABSTRACT_OPERATION);
    createEReference(abstractOperationEClass, ABSTRACT_OPERATION__OBJECTS);
    createEAttribute(abstractOperationEClass, ABSTRACT_OPERATION__ENABLED);

    alterOperationEClass = createEClass(ALTER_OPERATION);
    createEReference(alterOperationEClass, ALTER_OPERATION__EXCEPTION);
    createEReference(alterOperationEClass, ALTER_OPERATION__OUTPUT_RESOURCE);
    createEReference(alterOperationEClass, ALTER_OPERATION__DATA_BASE_QUALIFIER);
    createEReference(alterOperationEClass, ALTER_OPERATION__DATA_BASE_OVERRIDE);
    createEReference(alterOperationEClass, ALTER_OPERATION__TABLE_SPACE_OVERRIDE);
    createEReference(alterOperationEClass, ALTER_OPERATION__TABLE_SPACE_SUFFIX);
    createEReference(alterOperationEClass, ALTER_OPERATION__STORAGE_GROUP_OVERRIDE);
    createEReference(alterOperationEClass, ALTER_OPERATION__QUALIFIER_MAPS);
    createEReference(alterOperationEClass, ALTER_OPERATION__DATA_BASE_MAPS);
    createEReference(alterOperationEClass, ALTER_OPERATION__STORAGE_GROUP_MAPS);
    createEAttribute(alterOperationEClass, ALTER_OPERATION__TABLE_LOCK_OVERRIDE);
    createEAttribute(alterOperationEClass, ALTER_OPERATION__ADD_DATA_BASE_NAME);
    createEAttribute(alterOperationEClass, ALTER_OPERATION__ADD_OWNER);
    createEAttribute(alterOperationEClass, ALTER_OPERATION__ADD_QUALIFIER);
    createEAttribute(alterOperationEClass, ALTER_OPERATION__CREATE_TABLE_SPACES);
    createEAttribute(alterOperationEClass, ALTER_OPERATION__FORCE_ALTER);
    createEAttribute(alterOperationEClass, ALTER_OPERATION__GEN_ID_BY_DEFAULT);
    createEAttribute(alterOperationEClass, ALTER_OPERATION__IGNORE_MISSING);
    createEAttribute(alterOperationEClass, ALTER_OPERATION__NO_COMMENTS);
    createEAttribute(alterOperationEClass, ALTER_OPERATION__NO_RESTRICT_ON_DROP);
    createEAttribute(alterOperationEClass, ALTER_OPERATION__REMOVE_RESTRICT_ON_DROP);
    createEAttribute(alterOperationEClass, ALTER_OPERATION__SEPARATE_FOREIGN_KEYS);
    createEAttribute(alterOperationEClass, ALTER_OPERATION__TRANSLATE_PROCEDURE_DEFS);
    createEAttribute(alterOperationEClass, ALTER_OPERATION__TRANSLATE_VIEW_DEFS);

    diffOperationEClass = createEClass(DIFF_OPERATION);
    createEReference(diffOperationEClass, DIFF_OPERATION__EXCEPTION);
    createEReference(diffOperationEClass, DIFF_OPERATION__OUTPUT_RESOURCE);
    createEReference(diffOperationEClass, DIFF_OPERATION__DATA_BASE_QUALIFIER);
    createEReference(diffOperationEClass, DIFF_OPERATION__COLUMN_LENGTH);
    createEReference(diffOperationEClass, DIFF_OPERATION__OBJECT_MAPS);
    createEAttribute(diffOperationEClass, DIFF_OPERATION__IGNORE_MISSING);
    createEAttribute(diffOperationEClass, DIFF_OPERATION__SHOW_IDENTICALS);
    createEAttribute(diffOperationEClass, DIFF_OPERATION__OMIT_NEWLY_ADDED);
    createEAttribute(diffOperationEClass, DIFF_OPERATION__OMIT_TABLES);
    createEAttribute(diffOperationEClass, DIFF_OPERATION__OMIT_VIEWS);
    createEAttribute(diffOperationEClass, DIFF_OPERATION__OMIT_SEQUENCES);
    createEAttribute(diffOperationEClass, DIFF_OPERATION__OMIT_PROCEDURES);
    createEAttribute(diffOperationEClass, DIFF_OPERATION__OMIT_PERMISSIONS);
    createEAttribute(diffOperationEClass, DIFF_OPERATION__OMIT_INDEXES);
    createEAttribute(diffOperationEClass, DIFF_OPERATION__OMIT_TABLE_SPACES);
    createEAttribute(diffOperationEClass, DIFF_OPERATION__OMIT_STORAGE);
    createEAttribute(diffOperationEClass, DIFF_OPERATION__PRESERVE_COLUMN_SEQUENCE);

    documentRootEClass = createEClass(DOCUMENT_ROOT);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    createEReference(documentRootEClass, DOCUMENT_ROOT__EXTRACT_DDL_CONFIGURATION);

    extractDDLConfigurationEClass = createEClass(EXTRACT_DDL_CONFIGURATION);
    createEReference(extractDDLConfigurationEClass, EXTRACT_DDL_CONFIGURATION__ENV_FILE);
    createEReference(extractDDLConfigurationEClass, EXTRACT_DDL_CONFIGURATION__OPERATIONS);

    extractOperationEClass = createEClass(EXTRACT_OPERATION);
    createEReference(extractOperationEClass, EXTRACT_OPERATION__EXCEPTION);
    createEReference(extractOperationEClass, EXTRACT_OPERATION__DATABASE_RESOURCE);
    createEReference(extractOperationEClass, EXTRACT_OPERATION__DATA_BASE_QUALIFIER);
    createEAttribute(extractOperationEClass, EXTRACT_OPERATION__IGNORE_MISSING);

    impactOperationEClass = createEClass(IMPACT_OPERATION);
    createEReference(impactOperationEClass, IMPACT_OPERATION__EXCEPTION);
    createEReference(impactOperationEClass, IMPACT_OPERATION__OUTPUT_RESOURCE);

    readOperationEClass = createEClass(READ_OPERATION);
    createEReference(readOperationEClass, READ_OPERATION__EXCEPTION);
    createEReference(readOperationEClass, READ_OPERATION__INPUT);
    createEReference(readOperationEClass, READ_OPERATION__DATA_BASE_QUALIFIER);
    createEAttribute(readOperationEClass, READ_OPERATION__IGNORE_MISSING);

    renderOperationEClass = createEClass(RENDER_OPERATION);
    createEReference(renderOperationEClass, RENDER_OPERATION__EXCEPTION);
    createEReference(renderOperationEClass, RENDER_OPERATION__OUTPUT_RESOURCE);
    createEReference(renderOperationEClass, RENDER_OPERATION__DATA_BASE_QUALIFIER);
    createEReference(renderOperationEClass, RENDER_OPERATION__DATA_BASE_OVERRIDE);
    createEReference(renderOperationEClass, RENDER_OPERATION__TABLE_SPACE_OVERRIDE);
    createEReference(renderOperationEClass, RENDER_OPERATION__TABLE_SPACE_SUFFIX);
    createEReference(renderOperationEClass, RENDER_OPERATION__STORAGE_GROUP_OVERRIDE);
    createEReference(renderOperationEClass, RENDER_OPERATION__QUALIFIER_MAPS);
    createEReference(renderOperationEClass, RENDER_OPERATION__DATA_BASE_MAPS);
    createEReference(renderOperationEClass, RENDER_OPERATION__STORAGE_GROUP_MAPS);
    createEAttribute(renderOperationEClass, RENDER_OPERATION__TABLE_LOCK_OVERRIDE);
    createEAttribute(renderOperationEClass, RENDER_OPERATION__DATA_BASE_DRIVER);
    createEAttribute(renderOperationEClass, RENDER_OPERATION__ADD_DATA_BASE_NAME);
    createEAttribute(renderOperationEClass, RENDER_OPERATION__ADD_OWNER);
    createEAttribute(renderOperationEClass, RENDER_OPERATION__ADD_QUALIFIER);
    createEAttribute(renderOperationEClass, RENDER_OPERATION__CREATE_FOREIGN_KEYS);
    createEAttribute(renderOperationEClass, RENDER_OPERATION__CREATE_INDEXES);
    createEAttribute(renderOperationEClass, RENDER_OPERATION__CREATE_PERMISSIONS);
    createEAttribute(renderOperationEClass, RENDER_OPERATION__CREATE_PRIMARY_KEYS);
    createEAttribute(renderOperationEClass, RENDER_OPERATION__CREATE_TABLE_SPACES);
    createEAttribute(renderOperationEClass, RENDER_OPERATION__DDL_XML);
    createEAttribute(renderOperationEClass, RENDER_OPERATION__DEFER_VIEWS);
    createEAttribute(renderOperationEClass, RENDER_OPERATION__DROP_PROCEDURES);
    createEAttribute(renderOperationEClass, RENDER_OPERATION__DROP_SEQUENCES);
    createEAttribute(renderOperationEClass, RENDER_OPERATION__DROP_TABLES);
    createEAttribute(renderOperationEClass, RENDER_OPERATION__DROP_TABLE_SPACES);
    createEAttribute(renderOperationEClass, RENDER_OPERATION__GEN_ID_BY_DEFAULT);
    createEAttribute(renderOperationEClass, RENDER_OPERATION__NO_COMMENTS);
    createEAttribute(renderOperationEClass, RENDER_OPERATION__NO_DDL_INFO);
    createEAttribute(renderOperationEClass, RENDER_OPERATION__NO_RESTRICT_ON_DROP);
    createEAttribute(renderOperationEClass, RENDER_OPERATION__PUBLIC_PERMISSIONS);
    createEAttribute(renderOperationEClass, RENDER_OPERATION__REMOVE_RESTRICT_ON_DROP);
    createEAttribute(renderOperationEClass, RENDER_OPERATION__SEPARATE_FOREIGN_KEYS);
    createEAttribute(renderOperationEClass, RENDER_OPERATION__SHORT_FILE_NAMES);
    createEAttribute(renderOperationEClass, RENDER_OPERATION__TRANSLATE_PROCEDURE_DEFS);
    createEAttribute(renderOperationEClass, RENDER_OPERATION__TRANSLATE_VIEW_DEFS);

    // Create enums
    dataBaseDriverTypeEnumEEnum = createEEnum(DATA_BASE_DRIVER_TYPE_ENUM);
    tableLockOverrideTypeEnumEEnum = createEEnum(TABLE_LOCK_OVERRIDE_TYPE_ENUM);

    // Create data types
    dataBaseDriverTypeEnumObjectEDataType = createEDataType(DATA_BASE_DRIVER_TYPE_ENUM_OBJECT);
    tableLockOverrideTypeEnumObjectEDataType = createEDataType(TABLE_LOCK_OVERRIDE_TYPE_ENUM_OBJECT);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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
    ValuesPackage theValuesPackage = (ValuesPackage)EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);
    XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
    ExceptionPackage theExceptionPackage = (ExceptionPackage)EPackage.Registry.INSTANCE.getEPackage(ExceptionPackage.eNS_URI);
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    alterOperationEClass.getESuperTypes().add(this.getAbstractOperation());
    diffOperationEClass.getESuperTypes().add(this.getAbstractOperation());
    extractOperationEClass.getESuperTypes().add(this.getAbstractOperation());
    impactOperationEClass.getESuperTypes().add(this.getAbstractOperation());
    readOperationEClass.getESuperTypes().add(this.getAbstractOperation());
    renderOperationEClass.getESuperTypes().add(this.getAbstractOperation());

    // Initialize classes and features; add operations and parameters
    initEClass(abstractOperationEClass, AbstractOperation.class, "AbstractOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractOperation_Objects(), theValuesPackage.getComplexValue(), null, "objects", null, 0, -1, AbstractOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractOperation_Enabled(), theXMLTypePackage.getBoolean(), "enabled", "true", 0, 1, AbstractOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alterOperationEClass, AlterOperation.class, "AlterOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAlterOperation_Exception(), theExceptionPackage.getexception(), null, "exception", null, 0, 1, AlterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlterOperation_OutputResource(), theTypesPackage.getNamedResourceDefinition(), null, "outputResource", null, 1, 1, AlterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlterOperation_DataBaseQualifier(), theValuesPackage.getComplexValue(), null, "dataBaseQualifier", null, 0, 1, AlterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlterOperation_DataBaseOverride(), theValuesPackage.getComplexValue(), null, "dataBaseOverride", null, 0, 1, AlterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlterOperation_TableSpaceOverride(), theValuesPackage.getComplexValue(), null, "tableSpaceOverride", null, 0, 1, AlterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlterOperation_TableSpaceSuffix(), theValuesPackage.getComplexValue(), null, "tableSpaceSuffix", null, 0, 1, AlterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlterOperation_StorageGroupOverride(), theValuesPackage.getComplexValue(), null, "storageGroupOverride", null, 0, 1, AlterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlterOperation_QualifierMaps(), theTypesPackage.getComplexValueMap(), null, "qualifierMaps", null, 0, -1, AlterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlterOperation_DataBaseMaps(), theTypesPackage.getComplexValueMap(), null, "dataBaseMaps", null, 0, -1, AlterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlterOperation_StorageGroupMaps(), theTypesPackage.getComplexValueMap(), null, "storageGroupMaps", null, 0, -1, AlterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAlterOperation_TableLockOverride(), this.getTableLockOverrideTypeEnum(), "tableLockOverride", "ANY", 0, 1, AlterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAlterOperation_AddDataBaseName(), theXMLTypePackage.getBoolean(), "addDataBaseName", "false", 0, 1, AlterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAlterOperation_AddOwner(), theXMLTypePackage.getBoolean(), "addOwner", "false", 0, 1, AlterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAlterOperation_AddQualifier(), theXMLTypePackage.getBoolean(), "addQualifier", "false", 0, 1, AlterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAlterOperation_CreateTableSpaces(), theXMLTypePackage.getBoolean(), "createTableSpaces", "false", 0, 1, AlterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAlterOperation_ForceAlter(), theXMLTypePackage.getBoolean(), "forceAlter", "false", 0, 1, AlterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAlterOperation_GenIDByDefault(), theXMLTypePackage.getBoolean(), "genIDByDefault", "false", 0, 1, AlterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAlterOperation_IgnoreMissing(), theXMLTypePackage.getBoolean(), "ignoreMissing", "false", 0, 1, AlterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAlterOperation_NoComments(), theXMLTypePackage.getBoolean(), "noComments", "false", 0, 1, AlterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAlterOperation_NoRestrictOnDrop(), theXMLTypePackage.getBoolean(), "noRestrictOnDrop", "false", 0, 1, AlterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAlterOperation_RemoveRestrictOnDrop(), theXMLTypePackage.getBoolean(), "removeRestrictOnDrop", "false", 0, 1, AlterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAlterOperation_SeparateForeignKeys(), theXMLTypePackage.getBoolean(), "separateForeignKeys", "false", 0, 1, AlterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAlterOperation_TranslateProcedureDefs(), theXMLTypePackage.getBoolean(), "translateProcedureDefs", "false", 0, 1, AlterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAlterOperation_TranslateViewDefs(), theXMLTypePackage.getBoolean(), "translateViewDefs", "false", 0, 1, AlterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(diffOperationEClass, DiffOperation.class, "DiffOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDiffOperation_Exception(), theExceptionPackage.getexception(), null, "exception", null, 0, 1, DiffOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDiffOperation_OutputResource(), theTypesPackage.getNamedResourceDefinition(), null, "outputResource", null, 1, 1, DiffOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDiffOperation_DataBaseQualifier(), theValuesPackage.getComplexValue(), null, "dataBaseQualifier", null, 1, 1, DiffOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDiffOperation_ColumnLength(), theValuesPackage.getComplexValue(), null, "columnLength", null, 1, 1, DiffOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDiffOperation_ObjectMaps(), theTypesPackage.getComplexValueMap(), null, "objectMaps", null, 0, -1, DiffOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiffOperation_IgnoreMissing(), theXMLTypePackage.getBoolean(), "ignoreMissing", "false", 0, 1, DiffOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiffOperation_ShowIdenticals(), theXMLTypePackage.getBoolean(), "showIdenticals", "false", 0, 1, DiffOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiffOperation_OmitNewlyAdded(), theXMLTypePackage.getBoolean(), "omitNewlyAdded", "false", 0, 1, DiffOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiffOperation_OmitTables(), theXMLTypePackage.getBoolean(), "omitTables", "false", 0, 1, DiffOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiffOperation_OmitViews(), theXMLTypePackage.getBoolean(), "omitViews", "false", 0, 1, DiffOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiffOperation_OmitSequences(), theXMLTypePackage.getBoolean(), "omitSequences", "false", 0, 1, DiffOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiffOperation_OmitProcedures(), theXMLTypePackage.getBoolean(), "omitProcedures", "false", 0, 1, DiffOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiffOperation_OmitPermissions(), theXMLTypePackage.getBoolean(), "omitPermissions", "false", 0, 1, DiffOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiffOperation_OmitIndexes(), theXMLTypePackage.getBoolean(), "omitIndexes", "false", 0, 1, DiffOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiffOperation_OmitTableSpaces(), theXMLTypePackage.getBoolean(), "omitTableSpaces", "false", 0, 1, DiffOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiffOperation_OmitStorage(), theXMLTypePackage.getBoolean(), "omitStorage", "false", 0, 1, DiffOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiffOperation_PreserveColumnSequence(), theXMLTypePackage.getBoolean(), "preserveColumnSequence", "false", 0, 1, DiffOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_ExtractDDLConfiguration(), this.getExtractDDLConfiguration(), null, "extractDDLConfiguration", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(extractDDLConfigurationEClass, ExtractDDLConfiguration.class, "ExtractDDLConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExtractDDLConfiguration_EnvFile(), theTypesPackage.getNamedResourceDefinition(), null, "envFile", null, 0, 1, ExtractDDLConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExtractDDLConfiguration_Operations(), this.getAbstractOperation(), null, "operations", null, 0, -1, ExtractDDLConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extractOperationEClass, ExtractOperation.class, "ExtractOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExtractOperation_Exception(), theExceptionPackage.getexception(), null, "exception", null, 0, 1, ExtractOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExtractOperation_DatabaseResource(), theTypesPackage.getNamedResourceDefinition(), null, "databaseResource", null, 1, 1, ExtractOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExtractOperation_DataBaseQualifier(), theValuesPackage.getComplexValue(), null, "dataBaseQualifier", null, 0, 1, ExtractOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExtractOperation_IgnoreMissing(), theXMLTypePackage.getBoolean(), "ignoreMissing", "false", 0, 1, ExtractOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(impactOperationEClass, ImpactOperation.class, "ImpactOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImpactOperation_Exception(), theExceptionPackage.getexception(), null, "exception", null, 0, 1, ImpactOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImpactOperation_OutputResource(), theTypesPackage.getNamedResourceDefinition(), null, "outputResource", null, 1, 1, ImpactOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(readOperationEClass, ReadOperation.class, "ReadOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReadOperation_Exception(), theExceptionPackage.getexception(), null, "exception", null, 0, 1, ReadOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReadOperation_Input(), theTypesPackage.getNamedResourceDefinition(), null, "input", null, 1, 1, ReadOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReadOperation_DataBaseQualifier(), theValuesPackage.getComplexValue(), null, "dataBaseQualifier", null, 0, 1, ReadOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReadOperation_IgnoreMissing(), theXMLTypePackage.getBoolean(), "ignoreMissing", "false", 0, 1, ReadOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(renderOperationEClass, RenderOperation.class, "RenderOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRenderOperation_Exception(), theExceptionPackage.getexception(), null, "exception", null, 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRenderOperation_OutputResource(), theTypesPackage.getNamedResourceDefinition(), null, "outputResource", null, 1, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRenderOperation_DataBaseQualifier(), theValuesPackage.getComplexValue(), null, "dataBaseQualifier", null, 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRenderOperation_DataBaseOverride(), theValuesPackage.getComplexValue(), null, "dataBaseOverride", null, 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRenderOperation_TableSpaceOverride(), theValuesPackage.getComplexValue(), null, "tableSpaceOverride", null, 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRenderOperation_TableSpaceSuffix(), theValuesPackage.getComplexValue(), null, "tableSpaceSuffix", null, 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRenderOperation_StorageGroupOverride(), theValuesPackage.getComplexValue(), null, "storageGroupOverride", null, 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRenderOperation_QualifierMaps(), theTypesPackage.getComplexValueMap(), null, "qualifierMaps", null, 0, -1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRenderOperation_DataBaseMaps(), theTypesPackage.getComplexValueMap(), null, "dataBaseMaps", null, 0, -1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRenderOperation_StorageGroupMaps(), theTypesPackage.getComplexValueMap(), null, "storageGroupMaps", null, 0, -1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRenderOperation_TableLockOverride(), this.getTableLockOverrideTypeEnum(), "tableLockOverride", "ANY", 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRenderOperation_DataBaseDriver(), this.getDataBaseDriverTypeEnum(), "dataBaseDriver", null, 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRenderOperation_AddDataBaseName(), theXMLTypePackage.getBoolean(), "addDataBaseName", "false", 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRenderOperation_AddOwner(), theXMLTypePackage.getBoolean(), "addOwner", "false", 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRenderOperation_AddQualifier(), theXMLTypePackage.getBoolean(), "addQualifier", "false", 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRenderOperation_CreateForeignKeys(), theXMLTypePackage.getBoolean(), "createForeignKeys", "false", 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRenderOperation_CreateIndexes(), theXMLTypePackage.getBoolean(), "createIndexes", "false", 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRenderOperation_CreatePermissions(), theXMLTypePackage.getBoolean(), "createPermissions", "false", 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRenderOperation_CreatePrimaryKeys(), theXMLTypePackage.getBoolean(), "createPrimaryKeys", "false", 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRenderOperation_CreateTableSpaces(), theXMLTypePackage.getBoolean(), "createTableSpaces", "false", 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRenderOperation_DdlXml(), theXMLTypePackage.getBoolean(), "ddlXml", "false", 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRenderOperation_DeferViews(), theXMLTypePackage.getBoolean(), "deferViews", "false", 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRenderOperation_DropProcedures(), theXMLTypePackage.getBoolean(), "dropProcedures", "false", 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRenderOperation_DropSequences(), theXMLTypePackage.getBoolean(), "dropSequences", "false", 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRenderOperation_DropTables(), theXMLTypePackage.getBoolean(), "dropTables", "false", 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRenderOperation_DropTableSpaces(), theXMLTypePackage.getBoolean(), "dropTableSpaces", "false", 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRenderOperation_GenIDByDefault(), theXMLTypePackage.getBoolean(), "genIDByDefault", "false", 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRenderOperation_NoComments(), theXMLTypePackage.getBoolean(), "noComments", "false", 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRenderOperation_NoDDLInfo(), theXMLTypePackage.getBoolean(), "noDDLInfo", "false", 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRenderOperation_NoRestrictOnDrop(), theXMLTypePackage.getBoolean(), "noRestrictOnDrop", "false", 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRenderOperation_PublicPermissions(), theXMLTypePackage.getBoolean(), "publicPermissions", "false", 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRenderOperation_RemoveRestrictOnDrop(), theXMLTypePackage.getBoolean(), "removeRestrictOnDrop", "false", 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRenderOperation_SeparateForeignKeys(), theXMLTypePackage.getBoolean(), "separateForeignKeys", "false", 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRenderOperation_ShortFileNames(), theXMLTypePackage.getBoolean(), "shortFileNames", "false", 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRenderOperation_TranslateProcedureDefs(), theXMLTypePackage.getBoolean(), "translateProcedureDefs", "false", 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRenderOperation_TranslateViewDefs(), theXMLTypePackage.getBoolean(), "translateViewDefs", "false", 0, 1, RenderOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(dataBaseDriverTypeEnumEEnum, DataBaseDriverTypeEnum.class, "DataBaseDriverTypeEnum");
    addEEnumLiteral(dataBaseDriverTypeEnumEEnum, DataBaseDriverTypeEnum.SYBASE);
    addEEnumLiteral(dataBaseDriverTypeEnumEEnum, DataBaseDriverTypeEnum.DB2);
    addEEnumLiteral(dataBaseDriverTypeEnumEEnum, DataBaseDriverTypeEnum.UDB);
    addEEnumLiteral(dataBaseDriverTypeEnumEEnum, DataBaseDriverTypeEnum.MSSQL);

    initEEnum(tableLockOverrideTypeEnumEEnum, TableLockOverrideTypeEnum.class, "TableLockOverrideTypeEnum");
    addEEnumLiteral(tableLockOverrideTypeEnumEEnum, TableLockOverrideTypeEnum.ANY);
    addEEnumLiteral(tableLockOverrideTypeEnumEEnum, TableLockOverrideTypeEnum.LOB);
    addEEnumLiteral(tableLockOverrideTypeEnumEEnum, TableLockOverrideTypeEnum.PAGE);
    addEEnumLiteral(tableLockOverrideTypeEnumEEnum, TableLockOverrideTypeEnum.ROW);
    addEEnumLiteral(tableLockOverrideTypeEnumEEnum, TableLockOverrideTypeEnum.TABLESPACE);
    addEEnumLiteral(tableLockOverrideTypeEnumEEnum, TableLockOverrideTypeEnum.TABLE);

    // Initialize data types
    initEDataType(dataBaseDriverTypeEnumObjectEDataType, DataBaseDriverTypeEnum.class, "DataBaseDriverTypeEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(tableLockOverrideTypeEnumObjectEDataType, TableLockOverrideTypeEnum.class, "TableLockOverrideTypeEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
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
      (abstractOperationEClass, 
       source, 
       new String[] 
       {
       "name", "AbstractOperation",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getAbstractOperation_Objects(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Objects",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getAbstractOperation_Enabled(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "enabled"
       });	
    addAnnotation
      (alterOperationEClass, 
       source, 
       new String[] 
       {
       "name", "AlterOperation",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getAlterOperation_Exception(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Exception",
       "namespace", "http://www.ms.com/2009/Saturn/Exception"
       });	
    addAnnotation
      (getAlterOperation_OutputResource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "OutputResource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getAlterOperation_DataBaseQualifier(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "DataBaseQualifier",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getAlterOperation_DataBaseOverride(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "DataBaseOverride",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getAlterOperation_TableSpaceOverride(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "TableSpaceOverride",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getAlterOperation_TableSpaceSuffix(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "TableSpaceSuffix",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getAlterOperation_StorageGroupOverride(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "StorageGroupOverride",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getAlterOperation_QualifierMaps(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "QualifierMaps",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getAlterOperation_DataBaseMaps(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "DataBaseMaps",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getAlterOperation_StorageGroupMaps(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "StorageGroupMaps",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getAlterOperation_TableLockOverride(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "tableLockOverride"
       });	
    addAnnotation
      (getAlterOperation_AddDataBaseName(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "addDataBaseName"
       });	
    addAnnotation
      (getAlterOperation_AddOwner(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "addOwner"
       });	
    addAnnotation
      (getAlterOperation_AddQualifier(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "addQualifier"
       });	
    addAnnotation
      (getAlterOperation_CreateTableSpaces(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "createTableSpaces"
       });	
    addAnnotation
      (getAlterOperation_ForceAlter(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "forceAlter"
       });	
    addAnnotation
      (getAlterOperation_GenIDByDefault(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "genIDByDefault"
       });	
    addAnnotation
      (getAlterOperation_IgnoreMissing(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "ignoreMissing"
       });	
    addAnnotation
      (getAlterOperation_NoComments(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "noComments"
       });	
    addAnnotation
      (getAlterOperation_NoRestrictOnDrop(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "noRestrictOnDrop"
       });	
    addAnnotation
      (getAlterOperation_RemoveRestrictOnDrop(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "removeRestrictOnDrop"
       });	
    addAnnotation
      (getAlterOperation_SeparateForeignKeys(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "separateForeignKeys"
       });	
    addAnnotation
      (getAlterOperation_TranslateProcedureDefs(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "translateProcedureDefs"
       });	
    addAnnotation
      (getAlterOperation_TranslateViewDefs(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "translateViewDefs"
       });	
    addAnnotation
      (dataBaseDriverTypeEnumEEnum, 
       source, 
       new String[] 
       {
       "name", "DataBaseDriverTypeEnum"
       });	
    addAnnotation
      (dataBaseDriverTypeEnumObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "DataBaseDriverTypeEnum:Object",
       "baseType", "DataBaseDriverTypeEnum"
       });	
    addAnnotation
      (diffOperationEClass, 
       source, 
       new String[] 
       {
       "name", "DiffOperation",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getDiffOperation_Exception(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Exception",
       "namespace", "http://www.ms.com/2009/Saturn/Exception"
       });	
    addAnnotation
      (getDiffOperation_OutputResource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "OutputResource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getDiffOperation_DataBaseQualifier(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "DataBaseQualifier",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getDiffOperation_ColumnLength(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ColumnLength",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getDiffOperation_ObjectMaps(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ObjectMaps",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getDiffOperation_IgnoreMissing(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "ignoreMissing"
       });	
    addAnnotation
      (getDiffOperation_ShowIdenticals(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "showIdenticals"
       });	
    addAnnotation
      (getDiffOperation_OmitNewlyAdded(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "omitNewlyAdded"
       });	
    addAnnotation
      (getDiffOperation_OmitTables(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "omitTables"
       });	
    addAnnotation
      (getDiffOperation_OmitViews(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "omitViews"
       });	
    addAnnotation
      (getDiffOperation_OmitSequences(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "omitSequences"
       });	
    addAnnotation
      (getDiffOperation_OmitProcedures(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "omitProcedures"
       });	
    addAnnotation
      (getDiffOperation_OmitPermissions(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "omitPermissions"
       });	
    addAnnotation
      (getDiffOperation_OmitIndexes(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "omitIndexes"
       });	
    addAnnotation
      (getDiffOperation_OmitTableSpaces(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "omitTableSpaces"
       });	
    addAnnotation
      (getDiffOperation_OmitStorage(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "omitStorage"
       });	
    addAnnotation
      (getDiffOperation_PreserveColumnSequence(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "preserveColumnSequence"
       });	
    addAnnotation
      (documentRootEClass, 
       source, 
       new String[] 
       {
       "name", "",
       "kind", "mixed"
       });	
    addAnnotation
      (getDocumentRoot_Mixed(), 
       source, 
       new String[] 
       {
       "kind", "elementWildcard",
       "name", ":mixed"
       });	
    addAnnotation
      (getDocumentRoot_XMLNSPrefixMap(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "xmlns:prefix"
       });	
    addAnnotation
      (getDocumentRoot_XSISchemaLocation(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "xsi:schemaLocation"
       });	
    addAnnotation
      (getDocumentRoot_ExtractDDLConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (extractDDLConfigurationEClass, 
       source, 
       new String[] 
       {
       "name", "Configuration_._type",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getExtractDDLConfiguration_EnvFile(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "EnvFile",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getExtractDDLConfiguration_Operations(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Operations",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (extractOperationEClass, 
       source, 
       new String[] 
       {
       "name", "ExtractOperation",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getExtractOperation_Exception(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Exception",
       "namespace", "http://www.ms.com/2009/Saturn/Exception"
       });	
    addAnnotation
      (getExtractOperation_DatabaseResource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "DatabaseResource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getExtractOperation_DataBaseQualifier(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "DataBaseQualifier",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getExtractOperation_IgnoreMissing(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "ignoreMissing"
       });	
    addAnnotation
      (impactOperationEClass, 
       source, 
       new String[] 
       {
       "name", "ImpactOperation",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getImpactOperation_Exception(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Exception",
       "namespace", "http://www.ms.com/2009/Saturn/Exception"
       });	
    addAnnotation
      (getImpactOperation_OutputResource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "OutputResource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (readOperationEClass, 
       source, 
       new String[] 
       {
       "name", "ReadOperation",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getReadOperation_Exception(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Exception",
       "namespace", "http://www.ms.com/2009/Saturn/Exception"
       });	
    addAnnotation
      (getReadOperation_Input(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Input",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getReadOperation_DataBaseQualifier(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "DataBaseQualifier",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getReadOperation_IgnoreMissing(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "ignoreMissing"
       });	
    addAnnotation
      (renderOperationEClass, 
       source, 
       new String[] 
       {
       "name", "RenderOperation",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getRenderOperation_Exception(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Exception",
       "namespace", "http://www.ms.com/2009/Saturn/Exception"
       });	
    addAnnotation
      (getRenderOperation_OutputResource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "OutputResource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getRenderOperation_DataBaseQualifier(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "DataBaseQualifier",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getRenderOperation_DataBaseOverride(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "DataBaseOverride",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getRenderOperation_TableSpaceOverride(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "TableSpaceOverride",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getRenderOperation_TableSpaceSuffix(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "TableSpaceSuffix",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getRenderOperation_StorageGroupOverride(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "StorageGroupOverride",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getRenderOperation_QualifierMaps(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "QualifierMaps",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getRenderOperation_DataBaseMaps(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "DataBaseMaps",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getRenderOperation_StorageGroupMaps(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "StorageGroupMaps",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getRenderOperation_TableLockOverride(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "tableLockOverride"
       });	
    addAnnotation
      (getRenderOperation_DataBaseDriver(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "dataBaseDriver"
       });	
    addAnnotation
      (getRenderOperation_AddDataBaseName(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "addDataBaseName"
       });	
    addAnnotation
      (getRenderOperation_AddOwner(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "addOwner"
       });	
    addAnnotation
      (getRenderOperation_AddQualifier(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "addQualifier"
       });	
    addAnnotation
      (getRenderOperation_CreateForeignKeys(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "createForeignKeys"
       });	
    addAnnotation
      (getRenderOperation_CreateIndexes(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "createIndexes"
       });	
    addAnnotation
      (getRenderOperation_CreatePermissions(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "createPermissions"
       });	
    addAnnotation
      (getRenderOperation_CreatePrimaryKeys(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "createPrimaryKeys"
       });	
    addAnnotation
      (getRenderOperation_CreateTableSpaces(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "createTableSpaces"
       });	
    addAnnotation
      (getRenderOperation_DdlXml(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "ddlXml"
       });	
    addAnnotation
      (getRenderOperation_DeferViews(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "deferViews"
       });	
    addAnnotation
      (getRenderOperation_DropProcedures(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "dropProcedures"
       });	
    addAnnotation
      (getRenderOperation_DropSequences(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "dropSequences"
       });	
    addAnnotation
      (getRenderOperation_DropTables(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "dropTables"
       });	
    addAnnotation
      (getRenderOperation_DropTableSpaces(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "dropTableSpaces"
       });	
    addAnnotation
      (getRenderOperation_GenIDByDefault(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "genIDByDefault"
       });	
    addAnnotation
      (getRenderOperation_NoComments(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "noComments"
       });	
    addAnnotation
      (getRenderOperation_NoDDLInfo(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "noDDLInfo"
       });	
    addAnnotation
      (getRenderOperation_NoRestrictOnDrop(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "noRestrictOnDrop"
       });	
    addAnnotation
      (getRenderOperation_PublicPermissions(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "publicPermissions"
       });	
    addAnnotation
      (getRenderOperation_RemoveRestrictOnDrop(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "removeRestrictOnDrop"
       });	
    addAnnotation
      (getRenderOperation_SeparateForeignKeys(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "separateForeignKeys"
       });	
    addAnnotation
      (getRenderOperation_ShortFileNames(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "shortFileNames"
       });	
    addAnnotation
      (getRenderOperation_TranslateProcedureDefs(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "translateProcedureDefs"
       });	
    addAnnotation
      (getRenderOperation_TranslateViewDefs(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "translateViewDefs"
       });	
    addAnnotation
      (tableLockOverrideTypeEnumEEnum, 
       source, 
       new String[] 
       {
       "name", "TableLockOverrideTypeEnum"
       });	
    addAnnotation
      (tableLockOverrideTypeEnumObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "TableLockOverrideTypeEnum:Object",
       "baseType", "TableLockOverrideTypeEnum"
       });
  }

} // ExtractDDLModulePackageImpl
