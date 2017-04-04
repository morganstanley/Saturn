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
package com.ms.qaTools.saturn.resources.soapIOResource.impl;

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
import com.ms.qaTools.saturn.resources.soapIOResource.AbstractTransport;
import com.ms.qaTools.saturn.resources.soapIOResource.AuthenticationMethod;
import com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport;
import com.ms.qaTools.saturn.resources.soapIOResource.CpsMessageTypes;
import com.ms.qaTools.saturn.resources.soapIOResource.CpsResource;
import com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport;
import com.ms.qaTools.saturn.resources.soapIOResource.HandshakeEnums;
import com.ms.qaTools.saturn.resources.soapIOResource.MQTransport;
import com.ms.qaTools.saturn.resources.soapIOResource.PTCPTransport;
import com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResource;
import com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourceFactory;
import com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage;
import com.ms.qaTools.saturn.resources.soapIOResource.SubscribeEnums;
import com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport;
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
public class SoapIOResourcePackageImpl extends EPackageImpl implements SoapIOResourcePackage
{
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    abstractTransportEClass             = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    cpsResourceEClass                   = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    cpsTransportEClass                  = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    httpTransportEClass                 = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    mqTransportEClass                   = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ptcpTransportEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    soapIOResourceEClass                = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    tcpTransportEClass                  = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EEnum     authenticationMethodEEnum           = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EEnum     cpsMessageTypesEEnum                = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EEnum     handshakeEnumsEEnum                 = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EEnum     subscribeEnumsEEnum                 = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType authenticationMethodObjectEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType cpsMessageTypesObjectEDataType      = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType handshakeEnumsObjectEDataType       = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType subscribeEnumsObjectEDataType       = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
   * EPackage.Registry} by the package package URI value.
   * <p>
   * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
   * performs initialization of the package, or returns the registered package, if one already exists. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SoapIOResourcePackageImpl()
  {
    super(eNS_URI, SoapIOResourceFactory.eINSTANCE);
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
   * This method is used to initialize {@link SoapIOResourcePackage#eINSTANCE} when that field is accessed. Clients
   * should not invoke it directly. Instead, they should simply access that field to obtain the package. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SoapIOResourcePackage init()
  {
    if (isInited) return (SoapIOResourcePackage)EPackage.Registry.INSTANCE.getEPackage(SoapIOResourcePackage.eNS_URI);

    // Obtain or create and register package
    SoapIOResourcePackageImpl theSoapIOResourcePackage = (SoapIOResourcePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SoapIOResourcePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SoapIOResourcePackageImpl());

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
    theSoapIOResourcePackage.createPackageContents();
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
    theSoapIOResourcePackage.initializePackageContents();
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
    theSoapIOResourcePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SoapIOResourcePackage.eNS_URI, theSoapIOResourcePackage);
    return theSoapIOResourcePackage;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractTransport()
  {
    return abstractTransportEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractTransport_Asynchronous()
  {
    return (EAttribute)abstractTransportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getCpsResource()
  {
    return cpsResourceEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getCpsResource_TimeOut()
  {
    return (EReference)cpsResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getCpsResource_Transport()
  {
    return (EReference)cpsResourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getCPSTransport()
  {
    return cpsTransportEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getCPSTransport_Transport()
  {
    return (EReference)cpsTransportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getCPSTransport_Topic()
  {
    return (EReference)cpsTransportEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getCPSTransport_Filter()
  {
    return (EReference)cpsTransportEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getCPSTransport_NamespaceDefinition()
  {
    return (EReference)cpsTransportEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCPSTransport_CpsMessageType()
  {
    return (EAttribute)cpsTransportEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getCPSTransport_JarLocation()
  {
    return (EReference)cpsTransportEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getCPSTransport_ClassName()
  {
    return (EReference)cpsTransportEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCPSTransport_Subscribe()
  {
    return (EAttribute)cpsTransportEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getHTTPTransport()
  {
    return httpTransportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHTTPTransport_Url()
  {
    return (EReference)httpTransportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getHTTPTransport_ProxyUrl()
  {
    return (EReference)httpTransportEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getHTTPTransport_UserId()
  {
    return (EReference)httpTransportEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getHTTPTransport_Password()
  {
    return (EReference)httpTransportEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHTTPTransport_ForwardSMSession()
  {
    return (EAttribute)httpTransportEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHTTPTransport_DisableChunkedEncoding()
  {
    return (EAttribute)httpTransportEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHTTPTransport_AuthenticationMethod()
  {
    return (EAttribute)httpTransportEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getMQTransport()
  {
    return mqTransportEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getMQTransport_MQResource()
  {
    return (EReference)mqTransportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getMQTransport_RequestQueue()
  {
    return (EReference)mqTransportEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getMQTransport_ResponseQueue()
  {
    return (EReference)mqTransportEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getMQTransport_ModelQName()
  {
    return (EReference)mqTransportEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getMQTransport_DynamicQName()
  {
    return (EReference)mqTransportEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMQTransport_Persistent()
  {
    return (EAttribute)mqTransportEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMQTransport_UseCorrelId()
  {
    return (EAttribute)mqTransportEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPTCPTransport()
  {
    return ptcpTransportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPTCPTransport_Hostname()
  {
    return (EReference)ptcpTransportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPTCPTransport_Port()
  {
    return (EReference)ptcpTransportEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPTCPTransport_MaxRetries()
  {
    return (EAttribute)ptcpTransportEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getSoapIOResource()
  {
    return soapIOResourceEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSoapIOResource_TimeOut()
  {
    return (EReference)soapIOResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSoapIOResource_Transport()
  {
    return (EReference)soapIOResourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getTCPTransport()
  {
    return tcpTransportEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getTCPTransport_Hostname()
  {
    return (EReference)tcpTransportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getTCPTransport_Port()
  {
    return (EReference)tcpTransportEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTCPTransport_AuthenticationMethod()
  {
    return (EAttribute)tcpTransportEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTCPTransport_GzipSend()
  {
    return (EAttribute)tcpTransportEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTCPTransport_Handshake()
  {
    return (EAttribute)tcpTransportEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTCPTransport_MaxRetries()
  {
    return (EAttribute)tcpTransportEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTCPTransport_Nagle()
  {
    return (EAttribute)tcpTransportEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAuthenticationMethod()
  {
    return authenticationMethodEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCpsMessageTypes()
  {
    return cpsMessageTypesEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EEnum getHandshakeEnums()
  {
    return handshakeEnumsEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSubscribeEnums()
  {
    return subscribeEnumsEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataType getAuthenticationMethodObject()
  {
    return authenticationMethodObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataType getCpsMessageTypesObject()
  {
    return cpsMessageTypesObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataType getHandshakeEnumsObject()
  {
    return handshakeEnumsObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataType getSubscribeEnumsObject()
  {
    return subscribeEnumsObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SoapIOResourceFactory getSoapIOResourceFactory()
  {
    return (SoapIOResourceFactory)getEFactoryInstance();
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
    abstractTransportEClass = createEClass(ABSTRACT_TRANSPORT);
    createEAttribute(abstractTransportEClass, ABSTRACT_TRANSPORT__ASYNCHRONOUS);

    cpsResourceEClass = createEClass(CPS_RESOURCE);
    createEReference(cpsResourceEClass, CPS_RESOURCE__TIME_OUT);
    createEReference(cpsResourceEClass, CPS_RESOURCE__TRANSPORT);

    cpsTransportEClass = createEClass(CPS_TRANSPORT);
    createEReference(cpsTransportEClass, CPS_TRANSPORT__TRANSPORT);
    createEReference(cpsTransportEClass, CPS_TRANSPORT__TOPIC);
    createEReference(cpsTransportEClass, CPS_TRANSPORT__FILTER);
    createEReference(cpsTransportEClass, CPS_TRANSPORT__NAMESPACE_DEFINITION);
    createEAttribute(cpsTransportEClass, CPS_TRANSPORT__CPS_MESSAGE_TYPE);
    createEReference(cpsTransportEClass, CPS_TRANSPORT__JAR_LOCATION);
    createEReference(cpsTransportEClass, CPS_TRANSPORT__CLASS_NAME);
    createEAttribute(cpsTransportEClass, CPS_TRANSPORT__SUBSCRIBE);

    httpTransportEClass = createEClass(HTTP_TRANSPORT);
    createEReference(httpTransportEClass, HTTP_TRANSPORT__URL);
    createEReference(httpTransportEClass, HTTP_TRANSPORT__PROXY_URL);
    createEReference(httpTransportEClass, HTTP_TRANSPORT__USER_ID);
    createEReference(httpTransportEClass, HTTP_TRANSPORT__PASSWORD);
    createEAttribute(httpTransportEClass, HTTP_TRANSPORT__FORWARD_SM_SESSION);
    createEAttribute(httpTransportEClass, HTTP_TRANSPORT__DISABLE_CHUNKED_ENCODING);
    createEAttribute(httpTransportEClass, HTTP_TRANSPORT__AUTHENTICATION_METHOD);

    mqTransportEClass = createEClass(MQ_TRANSPORT);
    createEReference(mqTransportEClass, MQ_TRANSPORT__MQ_RESOURCE);
    createEReference(mqTransportEClass, MQ_TRANSPORT__REQUEST_QUEUE);
    createEReference(mqTransportEClass, MQ_TRANSPORT__RESPONSE_QUEUE);
    createEReference(mqTransportEClass, MQ_TRANSPORT__MODEL_QNAME);
    createEReference(mqTransportEClass, MQ_TRANSPORT__DYNAMIC_QNAME);
    createEAttribute(mqTransportEClass, MQ_TRANSPORT__PERSISTENT);
    createEAttribute(mqTransportEClass, MQ_TRANSPORT__USE_CORREL_ID);

    ptcpTransportEClass = createEClass(PTCP_TRANSPORT);
    createEReference(ptcpTransportEClass, PTCP_TRANSPORT__HOSTNAME);
    createEReference(ptcpTransportEClass, PTCP_TRANSPORT__PORT);
    createEAttribute(ptcpTransportEClass, PTCP_TRANSPORT__MAX_RETRIES);

    soapIOResourceEClass = createEClass(SOAP_IO_RESOURCE);
    createEReference(soapIOResourceEClass, SOAP_IO_RESOURCE__TIME_OUT);
    createEReference(soapIOResourceEClass, SOAP_IO_RESOURCE__TRANSPORT);

    tcpTransportEClass = createEClass(TCP_TRANSPORT);
    createEReference(tcpTransportEClass, TCP_TRANSPORT__HOSTNAME);
    createEReference(tcpTransportEClass, TCP_TRANSPORT__PORT);
    createEAttribute(tcpTransportEClass, TCP_TRANSPORT__HANDSHAKE);
    createEAttribute(tcpTransportEClass, TCP_TRANSPORT__MAX_RETRIES);
    createEAttribute(tcpTransportEClass, TCP_TRANSPORT__AUTHENTICATION_METHOD);
    createEAttribute(tcpTransportEClass, TCP_TRANSPORT__GZIP_SEND);
    createEAttribute(tcpTransportEClass, TCP_TRANSPORT__NAGLE);

    // Create enums
    authenticationMethodEEnum = createEEnum(AUTHENTICATION_METHOD);
    cpsMessageTypesEEnum = createEEnum(CPS_MESSAGE_TYPES);
    handshakeEnumsEEnum = createEEnum(HANDSHAKE_ENUMS);
    subscribeEnumsEEnum = createEEnum(SUBSCRIBE_ENUMS);

    // Create data types
    authenticationMethodObjectEDataType = createEDataType(AUTHENTICATION_METHOD_OBJECT);
    cpsMessageTypesObjectEDataType = createEDataType(CPS_MESSAGE_TYPES_OBJECT);
    handshakeEnumsObjectEDataType = createEDataType(HANDSHAKE_ENUMS_OBJECT);
    subscribeEnumsObjectEDataType = createEDataType(SUBSCRIBE_ENUMS_OBJECT);
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
    XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    ValuesPackage theValuesPackage = (ValuesPackage)EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    cpsResourceEClass.getESuperTypes().add(theTypesPackage.getDeviceResourceDefinition());
    cpsTransportEClass.getESuperTypes().add(this.getAbstractTransport());
    httpTransportEClass.getESuperTypes().add(this.getAbstractTransport());
    mqTransportEClass.getESuperTypes().add(this.getAbstractTransport());
    ptcpTransportEClass.getESuperTypes().add(this.getAbstractTransport());
    soapIOResourceEClass.getESuperTypes().add(theTypesPackage.getDeviceResourceDefinition());
    tcpTransportEClass.getESuperTypes().add(this.getAbstractTransport());

    // Initialize classes and features; add operations and parameters
    initEClass(abstractTransportEClass, AbstractTransport.class, "AbstractTransport", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractTransport_Asynchronous(), theXMLTypePackage.getBoolean(), "asynchronous", "false", 0, 1, AbstractTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cpsResourceEClass, CpsResource.class, "CpsResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCpsResource_TimeOut(), theValuesPackage.getComplexValue(), null, "timeOut", null, 0, 1, CpsResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCpsResource_Transport(), this.getCPSTransport(), null, "transport", null, 1, 1, CpsResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cpsTransportEClass, CPSTransport.class, "CPSTransport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCPSTransport_Transport(), this.getAbstractTransport(), null, "transport", null, 1, 1, CPSTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCPSTransport_Topic(), theValuesPackage.getComplexValue(), null, "topic", null, 0, 1, CPSTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCPSTransport_Filter(), theValuesPackage.getComplexValue(), null, "filter", null, 0, 1, CPSTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCPSTransport_NamespaceDefinition(), theTypesPackage.getResourceDefinition(), null, "namespaceDefinition", null, 0, 1, CPSTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCPSTransport_CpsMessageType(), this.getCpsMessageTypes(), "cpsMessageType", null, 0, 1, CPSTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCPSTransport_JarLocation(), theValuesPackage.getComplexValue(), null, "jarLocation", null, 0, 1, CPSTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCPSTransport_ClassName(), theValuesPackage.getComplexValue(), null, "className", null, 0, 1, CPSTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCPSTransport_Subscribe(), this.getSubscribeEnums(), "subscribe", "NONE", 0, 1, CPSTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(httpTransportEClass, HTTPTransport.class, "HTTPTransport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHTTPTransport_Url(), theValuesPackage.getComplexValue(), null, "url", null, 1, 1, HTTPTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHTTPTransport_ProxyUrl(), theValuesPackage.getComplexValue(), null, "proxyUrl", null, 0, 1, HTTPTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHTTPTransport_UserId(), theValuesPackage.getComplexValue(), null, "userId", null, 0, 1, HTTPTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHTTPTransport_Password(), theValuesPackage.getComplexValue(), null, "password", null, 0, 1, HTTPTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHTTPTransport_ForwardSMSession(), theXMLTypePackage.getBoolean(), "forwardSMSession", "false", 0, 1, HTTPTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHTTPTransport_DisableChunkedEncoding(), theXMLTypePackage.getBoolean(), "disableChunkedEncoding", "false", 0, 1, HTTPTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHTTPTransport_AuthenticationMethod(), this.getAuthenticationMethod(), "authenticationMethod", "NONE", 0, 1, HTTPTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mqTransportEClass, MQTransport.class, "MQTransport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMQTransport_MQResource(), theTypesPackage.getResourceDefinition(), null, "mQResource", null, 1, 1, MQTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMQTransport_RequestQueue(), theValuesPackage.getComplexValue(), null, "requestQueue", null, 1, 1, MQTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMQTransport_ResponseQueue(), theValuesPackage.getComplexValue(), null, "responseQueue", null, 1, 1, MQTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMQTransport_ModelQName(), theValuesPackage.getComplexValue(), null, "modelQName", null, 0, 1, MQTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMQTransport_DynamicQName(), theValuesPackage.getComplexValue(), null, "dynamicQName", null, 0, 1, MQTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMQTransport_Persistent(), theXMLTypePackage.getBoolean(), "persistent", "false", 0, 1, MQTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMQTransport_UseCorrelId(), theXMLTypePackage.getBoolean(), "useCorrelId", "true", 0, 1, MQTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ptcpTransportEClass, PTCPTransport.class, "PTCPTransport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPTCPTransport_Hostname(), theValuesPackage.getComplexValue(), null, "hostname", null, 1, 1, PTCPTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPTCPTransport_Port(), theValuesPackage.getComplexValue(), null, "port", null, 1, 1, PTCPTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPTCPTransport_MaxRetries(), theXMLTypePackage.getInteger(), "maxRetries", "0", 0, 1, PTCPTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(soapIOResourceEClass, SoapIOResource.class, "SoapIOResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSoapIOResource_TimeOut(), theValuesPackage.getComplexValue(), null, "timeOut", null, 0, 1, SoapIOResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSoapIOResource_Transport(), this.getAbstractTransport(), null, "transport", null, 1, 1, SoapIOResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tcpTransportEClass, TCPTransport.class, "TCPTransport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTCPTransport_Hostname(), theValuesPackage.getComplexValue(), null, "hostname", null, 1, 1, TCPTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTCPTransport_Port(), theValuesPackage.getComplexValue(), null, "port", null, 1, 1, TCPTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTCPTransport_Handshake(), this.getHandshakeEnums(), "handshake", "NONE", 0, 1, TCPTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTCPTransport_MaxRetries(), theXMLTypePackage.getInteger(), "maxRetries", "0", 0, 1, TCPTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTCPTransport_AuthenticationMethod(), this.getAuthenticationMethod(), "authenticationMethod", "NONE", 0, 1, TCPTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTCPTransport_GzipSend(), theXMLTypePackage.getBoolean(), "gzipSend", "false", 0, 1, TCPTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTCPTransport_Nagle(), theXMLTypePackage.getBoolean(), "nagle", "false", 0, 1, TCPTransport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(authenticationMethodEEnum, AuthenticationMethod.class, "AuthenticationMethod");
    addEEnumLiteral(authenticationMethodEEnum, AuthenticationMethod.NONE);
    addEEnumLiteral(authenticationMethodEEnum, AuthenticationMethod.NETEGRITY);
    addEEnumLiteral(authenticationMethodEEnum, AuthenticationMethod.NETEGRITYSM);

    initEEnum(cpsMessageTypesEEnum, CpsMessageTypes.class, "CpsMessageTypes");
    addEEnumLiteral(cpsMessageTypesEEnum, CpsMessageTypes.CPS0);
    addEEnumLiteral(cpsMessageTypesEEnum, CpsMessageTypes.SOAP);
    addEEnumLiteral(cpsMessageTypesEEnum, CpsMessageTypes.GPB);

    initEEnum(handshakeEnumsEEnum, HandshakeEnums.class, "HandshakeEnums");
    addEEnumLiteral(handshakeEnumsEEnum, HandshakeEnums.NONE);
    addEEnumLiteral(handshakeEnumsEEnum, HandshakeEnums.KERBEROS);
    addEEnumLiteral(handshakeEnumsEEnum, HandshakeEnums.ANONYMOUS);

    initEEnum(subscribeEnumsEEnum, SubscribeEnums.class, "SubscribeEnums");
    addEEnumLiteral(subscribeEnumsEEnum, SubscribeEnums.NONE);
    addEEnumLiteral(subscribeEnumsEEnum, SubscribeEnums.SUBSCRIBE);
    addEEnumLiteral(subscribeEnumsEEnum, SubscribeEnums.SUBSCRIBE_SOW);

    // Initialize data types
    initEDataType(authenticationMethodObjectEDataType, AuthenticationMethod.class, "AuthenticationMethodObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(cpsMessageTypesObjectEDataType, CpsMessageTypes.class, "CpsMessageTypesObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(handshakeEnumsObjectEDataType, HandshakeEnums.class, "HandshakeEnumsObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(subscribeEnumsObjectEDataType, SubscribeEnums.class, "SubscribeEnumsObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
      (abstractTransportEClass, 
       source, 
       new String[] 
       {
       "name", "AbstractTransport",
       "kind", "empty"
       });	
    addAnnotation
      (getAbstractTransport_Asynchronous(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "asynchronous"
       });	
    addAnnotation
      (authenticationMethodEEnum, 
       source, 
       new String[] 
       {
       "name", "AuthenticationMethod"
       });	
    addAnnotation
      (authenticationMethodObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "AuthenticationMethod:Object",
       "baseType", "AuthenticationMethod"
       });	
    addAnnotation
      (cpsMessageTypesEEnum, 
       source, 
       new String[] 
       {
       "name", "CpsMessageTypes"
       });	
    addAnnotation
      (cpsMessageTypesObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "CpsMessageTypes:Object",
       "baseType", "CpsMessageTypes"
       });	
    addAnnotation
      (cpsResourceEClass, 
       source, 
       new String[] 
       {
       "name", "CpsResource",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getCpsResource_TimeOut(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "TimeOut",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getCpsResource_Transport(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Transport",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (cpsTransportEClass, 
       source, 
       new String[] 
       {
       "name", "CPSTransport",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getCPSTransport_Transport(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Transport",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getCPSTransport_Topic(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Topic",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getCPSTransport_Filter(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Filter",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getCPSTransport_NamespaceDefinition(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "NamespaceDefinition",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getCPSTransport_CpsMessageType(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "CpsMessageType",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getCPSTransport_JarLocation(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "jarLocation",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getCPSTransport_ClassName(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "className",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getCPSTransport_Subscribe(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "subscribe"
       });	
    addAnnotation
      (handshakeEnumsEEnum, 
       source, 
       new String[] 
       {
       "name", "HandshakeEnums"
       });	
    addAnnotation
      (handshakeEnumsObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "HandshakeEnums:Object",
       "baseType", "HandshakeEnums"
       });	
    addAnnotation
      (httpTransportEClass, 
       source, 
       new String[] 
       {
       "name", "HTTPTransport",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getHTTPTransport_Url(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Url",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getHTTPTransport_ProxyUrl(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ProxyUrl",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getHTTPTransport_UserId(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "UserId",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getHTTPTransport_Password(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Password",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getHTTPTransport_ForwardSMSession(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "forwardSMSession"
       });	
    addAnnotation
      (getHTTPTransport_DisableChunkedEncoding(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "disableChunkedEncoding"
       });	
    addAnnotation
      (getHTTPTransport_AuthenticationMethod(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "authenticationMethod"
       });	
    addAnnotation
      (mqTransportEClass, 
       source, 
       new String[] 
       {
       "name", "MQTransport",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getMQTransport_MQResource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "MQResource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getMQTransport_RequestQueue(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "RequestQueue",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getMQTransport_ResponseQueue(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ResponseQueue",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getMQTransport_ModelQName(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ModelQName",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getMQTransport_DynamicQName(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "DynamicQName",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getMQTransport_Persistent(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "persistent"
       });	
    addAnnotation
      (getMQTransport_UseCorrelId(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "useCorrelId"
       });	
    addAnnotation
      (ptcpTransportEClass, 
       source, 
       new String[] 
       {
       "name", "PTCPTransport",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getPTCPTransport_Hostname(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Hostname",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getPTCPTransport_Port(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Port",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getPTCPTransport_MaxRetries(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "maxRetries"
       });	
    addAnnotation
      (soapIOResourceEClass, 
       source, 
       new String[] 
       {
       "name", "SoapIOResource",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getSoapIOResource_TimeOut(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "TimeOut",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getSoapIOResource_Transport(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Transport",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (subscribeEnumsEEnum, 
       source, 
       new String[] 
       {
       "name", "SubscribeEnums"
       });	
    addAnnotation
      (subscribeEnumsObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "SubscribeEnums:Object",
       "baseType", "SubscribeEnums"
       });	
    addAnnotation
      (tcpTransportEClass, 
       source, 
       new String[] 
       {
       "name", "TCPTransport",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getTCPTransport_Hostname(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Hostname",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getTCPTransport_Port(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Port",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getTCPTransport_Handshake(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "handshake"
       });	
    addAnnotation
      (getTCPTransport_MaxRetries(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "maxRetries"
       });	
    addAnnotation
      (getTCPTransport_AuthenticationMethod(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "authenticationMethod"
       });	
    addAnnotation
      (getTCPTransport_GzipSend(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "gzipSend"
       });	
    addAnnotation
      (getTCPTransport_Nagle(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "nagle"
       });
  }

} // SoapIOResourcePackageImpl
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
