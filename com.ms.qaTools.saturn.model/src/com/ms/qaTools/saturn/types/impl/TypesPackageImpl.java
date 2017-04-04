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
package com.ms.qaTools.saturn.types.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
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
import com.ms.qaTools.saturn.types.AbstractAnnotation;
import com.ms.qaTools.saturn.types.AbstractBatchListener;
import com.ms.qaTools.saturn.types.AbstractListener;
import com.ms.qaTools.saturn.types.AbstractRepetitionHandler;
import com.ms.qaTools.saturn.types.AbstractRunGroupModifier;
import com.ms.qaTools.saturn.types.Column;
import com.ms.qaTools.saturn.types.ColumnTrimEnum;
import com.ms.qaTools.saturn.types.ColumnTypeEnum;
import com.ms.qaTools.saturn.types.Comment;
import com.ms.qaTools.saturn.types.ComplexValueMap;
import com.ms.qaTools.saturn.types.ComplexValuePair;
import com.ms.qaTools.saturn.types.DataSet;
import com.ms.qaTools.saturn.types.DataSetInstance;
import com.ms.qaTools.saturn.types.DataSetResourceDefinition;
import com.ms.qaTools.saturn.types.DatabaseResourceDefinition;
import com.ms.qaTools.saturn.types.DeviceResourceDefinition;
import com.ms.qaTools.saturn.types.Empty;
import com.ms.qaTools.saturn.types.InlineDeviceResourceDefinition;
import com.ms.qaTools.saturn.types.InlineNamespaceUriDefinition;
import com.ms.qaTools.saturn.types.InterpretersEnum;
import com.ms.qaTools.saturn.types.KronusResource;
import com.ms.qaTools.saturn.types.ModulesEnum;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.types.RepetitionActionsEnum;
import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.types.ResourcesEnum;
import com.ms.qaTools.saturn.types.RowInstance;
import com.ms.qaTools.saturn.types.SaturnStatusConditionEnum;
import com.ms.qaTools.saturn.types.SaturnStatusEnum;
import com.ms.qaTools.saturn.types.TypesFactory;
import com.ms.qaTools.saturn.types.TypesPackage;
import com.ms.qaTools.saturn.types.XmlNamespaceDefinition;
import com.ms.qaTools.saturn.types.XmlUriDefinition;
import com.ms.qaTools.saturn.types.util.TypesValidator;
import com.ms.qaTools.saturn.values.ValuesPackage;
import com.ms.qaTools.saturn.values.impl.ValuesPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class TypesPackageImpl extends EPackageImpl implements TypesPackage
{
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    abstractAnnotationEClass                 = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    abstractBatchListenerEClass              = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    abstractListenerEClass                   = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    abstractRepetitionHandlerEClass          = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    abstractRunGroupModifierEClass           = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    columnEClass                             = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    commentEClass                            = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    complexValueMapEClass                    = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    complexValuePairEClass                   = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass databaseResourceDefinitionEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    dataSetEClass                            = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    dataSetInstanceEClass                    = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    dataSetResourceDefinitionEClass          = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    deviceResourceDefinitionEClass           = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    emptyEClass                              = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    inlineDeviceResourceDefinitionEClass     = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    inlineNamespaceUriDefinitionEClass       = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kronusResourceEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    namedResourceDefinitionEClass            = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    resourceDefinitionEClass                 = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    rowInstanceEClass                        = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    xmlNamespaceDefinitionEClass             = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    xmlUriDefinitionEClass                   = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EEnum     columnTrimEnumEEnum                      = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EEnum     columnTypeEnumEEnum                      = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EEnum     interpretersEnumEEnum                    = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EEnum     modulesEnumEEnum                         = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EEnum     repetitionActionsEnumEEnum               = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EEnum     resourcesEnumEEnum                       = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EEnum     saturnStatusConditionEnumEEnum           = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EEnum     saturnStatusEnumEEnum                    = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType columnTrimEnumObjectEDataType            = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType columnTypeEnumObjectEDataType            = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType interpretersEnumObjectEDataType          = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType modulesEnumObjectEDataType               = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType objectIdEDataType                        = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType objectNameEDataType                      = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType repetitionActionsEnumObjectEDataType     = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType resourcesEnumObjectEDataType             = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType saturnStatusConditionEnumObjectEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType saturnStatusEnumObjectEDataType          = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
   * EPackage.Registry} by the package package URI value.
   * <p>
   * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
   * performs initialization of the package, or returns the registered package, if one already exists. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.ms.qaTools.saturn.types.TypesPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TypesPackageImpl()
  {
    super(eNS_URI, TypesFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link TypesPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TypesPackage init()
  {
    if (isInited) return (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

    // Obtain or create and register package
    TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TypesPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XMLTypePackage.eINSTANCE.eClass();

    // Obtain or create and register interdependencies
    DatacompareModulePackageImpl theDatacompareModulePackage = (DatacompareModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatacompareModulePackage.eNS_URI) instanceof DatacompareModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatacompareModulePackage.eNS_URI) : DatacompareModulePackage.eINSTANCE);
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
    MapperResourcePackageImpl theMapperResourcePackage = (MapperResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MapperResourcePackage.eNS_URI) instanceof MapperResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MapperResourcePackage.eNS_URI) : MapperResourcePackage.eINSTANCE);

    // Create package meta-data objects
    theTypesPackage.createPackageContents();
    theDatacompareModulePackage.createPackageContents();
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
    theMapperResourcePackage.createPackageContents();

    // Initialize created meta-data
    theTypesPackage.initializePackageContents();
    theDatacompareModulePackage.initializePackageContents();
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
    theMapperResourcePackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theTypesPackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return TypesValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theTypesPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TypesPackage.eNS_URI, theTypesPackage);
    return theTypesPackage;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractAnnotation()
  {
    return abstractAnnotationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractBatchListener()
  {
    return abstractBatchListenerEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractListener()
  {
    return abstractListenerEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractListener_Enabled()
  {
    return (EAttribute)abstractListenerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractListener_Name()
  {
    return (EAttribute)abstractListenerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractRepetitionHandler()
  {
    return abstractRepetitionHandlerEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractRepetitionHandler_DefaultStatus()
  {
    return (EAttribute)abstractRepetitionHandlerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractRepetitionHandler_Enabled()
  {
    return (EAttribute)abstractRepetitionHandlerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractRepetitionHandler_StatusCondition()
  {
    return (EAttribute)abstractRepetitionHandlerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractRunGroupModifier()
  {
    return abstractRunGroupModifierEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractRunGroupModifier_Enabled()
  {
    return (EAttribute)abstractRunGroupModifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumn()
  {
    return columnEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumn_Ignored()
  {
    return (EAttribute)columnEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumn_KeyOrder()
  {
    return (EAttribute)columnEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumn_Name()
  {
    return (EAttribute)columnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumn_Trim()
  {
    return (EAttribute)columnEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumn_Type()
  {
    return (EAttribute)columnEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getComment()
  {
    return commentEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexValueMap()
  {
    return complexValueMapEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexValueMap_Source()
  {
    return (EReference)complexValueMapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexValueMap_Target()
  {
    return (EReference)complexValueMapEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComplexValueMap_Enabled()
  {
    return (EAttribute)complexValueMapEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexValuePair()
  {
    return complexValuePairEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexValuePair_First()
  {
    return (EReference)complexValuePairEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexValuePair_Second()
  {
    return (EReference)complexValuePairEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatabaseResourceDefinition()
  {
    return databaseResourceDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseResourceDefinition_Persistent()
  {
    return (EAttribute)databaseResourceDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataSet()
  {
    return dataSetEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataSet_Columns()
  {
    return (EReference)dataSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataSet_Name()
  {
    return (EAttribute)dataSetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataSet_TrimAll()
  {
    return (EAttribute)dataSetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataSet_TrimColNames()
  {
    return (EAttribute)dataSetEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataSetInstance()
  {
    return dataSetInstanceEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataSetInstance_Rows()
  {
    return (EReference)dataSetInstanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataSetResourceDefinition()
  {
    return dataSetResourceDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataSetResourceDefinition_DeviceResource()
  {
    return (EReference)dataSetResourceDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataSetResourceDefinition_DataSet()
  {
    return (EReference)dataSetResourceDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataSetResourceDefinition_HasColNames()
  {
    return (EAttribute)dataSetResourceDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeviceResourceDefinition()
  {
    return deviceResourceDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeviceResourceDefinition_Initialize()
  {
    return (EAttribute)deviceResourceDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeviceResourceDefinition_IsInline()
  {
    return (EAttribute)deviceResourceDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmpty()
  {
    return emptyEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getInlineDeviceResourceDefinition()
  {
    return inlineDeviceResourceDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getInlineDeviceResourceDefinition_Value()
  {
    return (EReference)inlineDeviceResourceDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getInlineNamespaceUriDefinition()
  {
    return inlineNamespaceUriDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getInlineNamespaceUriDefinition_UriDefinitions()
  {
    return (EReference)inlineNamespaceUriDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKronusResource()
  {
    return kronusResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKronusResource_KronusCallConfiguration()
  {
    return (EReference)kronusResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedResourceDefinition()
  {
    return namedResourceDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedResourceDefinition_Name()
  {
    return (EAttribute)namedResourceDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceDefinition()
  {
    return resourceDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceDefinition_ConnectorPreference()
  {
    return (EAttribute)resourceDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceDefinition_Enabled()
  {
    return (EAttribute)resourceDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceDefinition_State()
  {
    return (EAttribute)resourceDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getRowInstance()
  {
    return rowInstanceEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getRowInstance_Columns()
  {
    return (EReference)rowInstanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getXmlNamespaceDefinition()
  {
    return xmlNamespaceDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getXmlUriDefinition()
  {
    return xmlUriDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getXmlUriDefinition_Prefix()
  {
    return (EReference)xmlUriDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getXmlUriDefinition_Uri()
  {
    return (EReference)xmlUriDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXmlUriDefinition_Enabled()
  {
    return (EAttribute)xmlUriDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EEnum getColumnTrimEnum()
  {
    return columnTrimEnumEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EEnum getColumnTypeEnum()
  {
    return columnTypeEnumEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EEnum getInterpretersEnum()
  {
    return interpretersEnumEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EEnum getModulesEnum()
  {
    return modulesEnumEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EEnum getRepetitionActionsEnum()
  {
    return repetitionActionsEnumEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EEnum getResourcesEnum()
  {
    return resourcesEnumEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSaturnStatusConditionEnum()
  {
    return saturnStatusConditionEnumEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSaturnStatusEnum()
  {
    return saturnStatusEnumEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataType getColumnTrimEnumObject()
  {
    return columnTrimEnumObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataType getColumnTypeEnumObject()
  {
    return columnTypeEnumObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataType getInterpretersEnumObject()
  {
    return interpretersEnumObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataType getModulesEnumObject()
  {
    return modulesEnumObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataType getObjectId()
  {
    return objectIdEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataType getObjectName()
  {
    return objectNameEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataType getRepetitionActionsEnumObject()
  {
    return repetitionActionsEnumObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataType getResourcesEnumObject()
  {
    return resourcesEnumObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataType getSaturnStatusConditionEnumObject()
  {
    return saturnStatusConditionEnumObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataType getSaturnStatusEnumObject()
  {
    return saturnStatusEnumObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TypesFactory getTypesFactory()
  {
    return (TypesFactory)getEFactoryInstance();
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
    abstractAnnotationEClass = createEClass(ABSTRACT_ANNOTATION);

    abstractBatchListenerEClass = createEClass(ABSTRACT_BATCH_LISTENER);

    abstractListenerEClass = createEClass(ABSTRACT_LISTENER);
    createEAttribute(abstractListenerEClass, ABSTRACT_LISTENER__NAME);
    createEAttribute(abstractListenerEClass, ABSTRACT_LISTENER__ENABLED);

    abstractRepetitionHandlerEClass = createEClass(ABSTRACT_REPETITION_HANDLER);
    createEAttribute(abstractRepetitionHandlerEClass, ABSTRACT_REPETITION_HANDLER__DEFAULT_STATUS);
    createEAttribute(abstractRepetitionHandlerEClass, ABSTRACT_REPETITION_HANDLER__STATUS_CONDITION);
    createEAttribute(abstractRepetitionHandlerEClass, ABSTRACT_REPETITION_HANDLER__ENABLED);

    abstractRunGroupModifierEClass = createEClass(ABSTRACT_RUN_GROUP_MODIFIER);
    createEAttribute(abstractRunGroupModifierEClass, ABSTRACT_RUN_GROUP_MODIFIER__ENABLED);

    columnEClass = createEClass(COLUMN);
    createEAttribute(columnEClass, COLUMN__NAME);
    createEAttribute(columnEClass, COLUMN__TYPE);
    createEAttribute(columnEClass, COLUMN__KEY_ORDER);
    createEAttribute(columnEClass, COLUMN__IGNORED);
    createEAttribute(columnEClass, COLUMN__TRIM);

    commentEClass = createEClass(COMMENT);

    complexValueMapEClass = createEClass(COMPLEX_VALUE_MAP);
    createEReference(complexValueMapEClass, COMPLEX_VALUE_MAP__SOURCE);
    createEReference(complexValueMapEClass, COMPLEX_VALUE_MAP__TARGET);
    createEAttribute(complexValueMapEClass, COMPLEX_VALUE_MAP__ENABLED);

    complexValuePairEClass = createEClass(COMPLEX_VALUE_PAIR);
    createEReference(complexValuePairEClass, COMPLEX_VALUE_PAIR__FIRST);
    createEReference(complexValuePairEClass, COMPLEX_VALUE_PAIR__SECOND);

    databaseResourceDefinitionEClass = createEClass(DATABASE_RESOURCE_DEFINITION);
    createEAttribute(databaseResourceDefinitionEClass, DATABASE_RESOURCE_DEFINITION__PERSISTENT);

    dataSetEClass = createEClass(DATA_SET);
    createEReference(dataSetEClass, DATA_SET__COLUMNS);
    createEAttribute(dataSetEClass, DATA_SET__NAME);
    createEAttribute(dataSetEClass, DATA_SET__TRIM_ALL);
    createEAttribute(dataSetEClass, DATA_SET__TRIM_COL_NAMES);

    dataSetInstanceEClass = createEClass(DATA_SET_INSTANCE);
    createEReference(dataSetInstanceEClass, DATA_SET_INSTANCE__ROWS);

    dataSetResourceDefinitionEClass = createEClass(DATA_SET_RESOURCE_DEFINITION);
    createEReference(dataSetResourceDefinitionEClass, DATA_SET_RESOURCE_DEFINITION__DEVICE_RESOURCE);
    createEReference(dataSetResourceDefinitionEClass, DATA_SET_RESOURCE_DEFINITION__DATA_SET);
    createEAttribute(dataSetResourceDefinitionEClass, DATA_SET_RESOURCE_DEFINITION__HAS_COL_NAMES);

    deviceResourceDefinitionEClass = createEClass(DEVICE_RESOURCE_DEFINITION);
    createEAttribute(deviceResourceDefinitionEClass, DEVICE_RESOURCE_DEFINITION__INITIALIZE);
    createEAttribute(deviceResourceDefinitionEClass, DEVICE_RESOURCE_DEFINITION__IS_INLINE);

    emptyEClass = createEClass(EMPTY);

    inlineDeviceResourceDefinitionEClass = createEClass(INLINE_DEVICE_RESOURCE_DEFINITION);
    createEReference(inlineDeviceResourceDefinitionEClass, INLINE_DEVICE_RESOURCE_DEFINITION__VALUE);

    inlineNamespaceUriDefinitionEClass = createEClass(INLINE_NAMESPACE_URI_DEFINITION);
    createEReference(inlineNamespaceUriDefinitionEClass, INLINE_NAMESPACE_URI_DEFINITION__URI_DEFINITIONS);

    kronusResourceEClass = createEClass(KRONUS_RESOURCE);
    createEReference(kronusResourceEClass, KRONUS_RESOURCE__KRONUS_CALL_CONFIGURATION);

    namedResourceDefinitionEClass = createEClass(NAMED_RESOURCE_DEFINITION);
    createEAttribute(namedResourceDefinitionEClass, NAMED_RESOURCE_DEFINITION__NAME);

    resourceDefinitionEClass = createEClass(RESOURCE_DEFINITION);
    createEAttribute(resourceDefinitionEClass, RESOURCE_DEFINITION__ENABLED);
    createEAttribute(resourceDefinitionEClass, RESOURCE_DEFINITION__STATE);
    createEAttribute(resourceDefinitionEClass, RESOURCE_DEFINITION__CONNECTOR_PREFERENCE);

    rowInstanceEClass = createEClass(ROW_INSTANCE);
    createEReference(rowInstanceEClass, ROW_INSTANCE__COLUMNS);

    xmlNamespaceDefinitionEClass = createEClass(XML_NAMESPACE_DEFINITION);

    xmlUriDefinitionEClass = createEClass(XML_URI_DEFINITION);
    createEReference(xmlUriDefinitionEClass, XML_URI_DEFINITION__PREFIX);
    createEReference(xmlUriDefinitionEClass, XML_URI_DEFINITION__URI);
    createEAttribute(xmlUriDefinitionEClass, XML_URI_DEFINITION__ENABLED);

    // Create enums
    columnTrimEnumEEnum = createEEnum(COLUMN_TRIM_ENUM);
    columnTypeEnumEEnum = createEEnum(COLUMN_TYPE_ENUM);
    interpretersEnumEEnum = createEEnum(INTERPRETERS_ENUM);
    modulesEnumEEnum = createEEnum(MODULES_ENUM);
    repetitionActionsEnumEEnum = createEEnum(REPETITION_ACTIONS_ENUM);
    resourcesEnumEEnum = createEEnum(RESOURCES_ENUM);
    saturnStatusConditionEnumEEnum = createEEnum(SATURN_STATUS_CONDITION_ENUM);
    saturnStatusEnumEEnum = createEEnum(SATURN_STATUS_ENUM);

    // Create data types
    columnTrimEnumObjectEDataType = createEDataType(COLUMN_TRIM_ENUM_OBJECT);
    columnTypeEnumObjectEDataType = createEDataType(COLUMN_TYPE_ENUM_OBJECT);
    interpretersEnumObjectEDataType = createEDataType(INTERPRETERS_ENUM_OBJECT);
    modulesEnumObjectEDataType = createEDataType(MODULES_ENUM_OBJECT);
    objectIdEDataType = createEDataType(OBJECT_ID);
    objectNameEDataType = createEDataType(OBJECT_NAME);
    repetitionActionsEnumObjectEDataType = createEDataType(REPETITION_ACTIONS_ENUM_OBJECT);
    resourcesEnumObjectEDataType = createEDataType(RESOURCES_ENUM_OBJECT);
    saturnStatusConditionEnumObjectEDataType = createEDataType(SATURN_STATUS_CONDITION_ENUM_OBJECT);
    saturnStatusEnumObjectEDataType = createEDataType(SATURN_STATUS_ENUM_OBJECT);
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
    ValuesPackage theValuesPackage = (ValuesPackage)EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);
    BackportPackage theBackportPackage = (BackportPackage)EPackage.Registry.INSTANCE.getEPackage(BackportPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    abstractBatchListenerEClass.getESuperTypes().add(this.getAbstractListener());
    commentEClass.getESuperTypes().add(this.getAbstractAnnotation());
    databaseResourceDefinitionEClass.getESuperTypes().add(this.getNamedResourceDefinition());
    dataSetResourceDefinitionEClass.getESuperTypes().add(this.getNamedResourceDefinition());
    deviceResourceDefinitionEClass.getESuperTypes().add(this.getNamedResourceDefinition());
    inlineDeviceResourceDefinitionEClass.getESuperTypes().add(this.getDeviceResourceDefinition());
    inlineNamespaceUriDefinitionEClass.getESuperTypes().add(this.getDeviceResourceDefinition());
    kronusResourceEClass.getESuperTypes().add(this.getNamedResourceDefinition());
    namedResourceDefinitionEClass.getESuperTypes().add(this.getResourceDefinition());
    xmlNamespaceDefinitionEClass.getESuperTypes().add(this.getDataSetResourceDefinition());

    // Initialize classes and features; add operations and parameters
    initEClass(abstractAnnotationEClass, AbstractAnnotation.class, "AbstractAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(abstractBatchListenerEClass, AbstractBatchListener.class, "AbstractBatchListener", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(abstractListenerEClass, AbstractListener.class, "AbstractListener", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractListener_Name(), theXMLTypePackage.getToken(), "name", null, 0, 1, AbstractListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractListener_Enabled(), theXMLTypePackage.getBoolean(), "enabled", "true", 0, 1, AbstractListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractRepetitionHandlerEClass, AbstractRepetitionHandler.class, "AbstractRepetitionHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractRepetitionHandler_DefaultStatus(), this.getSaturnStatusEnum(), "defaultStatus", "FAIL", 0, 1, AbstractRepetitionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractRepetitionHandler_StatusCondition(), this.getSaturnStatusConditionEnum(), "statusCondition", "ANY FAIL", 0, 1, AbstractRepetitionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractRepetitionHandler_Enabled(), theXMLTypePackage.getBoolean(), "enabled", "true", 0, 1, AbstractRepetitionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractRunGroupModifierEClass, AbstractRunGroupModifier.class, "AbstractRunGroupModifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractRunGroupModifier_Enabled(), theXMLTypePackage.getBoolean(), "enabled", "true", 0, 1, AbstractRunGroupModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColumn_Name(), theXMLTypePackage.getToken(), "name", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColumn_Type(), this.getColumnTypeEnum(), "type", "STRING", 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColumn_KeyOrder(), theXMLTypePackage.getNonNegativeInteger(), "keyOrder", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColumn_Ignored(), theXMLTypePackage.getBoolean(), "ignored", "false", 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColumn_Trim(), this.getColumnTrimEnum(), "trim", "TRIM_NONE", 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(complexValueMapEClass, ComplexValueMap.class, "ComplexValueMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComplexValueMap_Source(), theValuesPackage.getComplexValue(), null, "source", null, 1, 1, ComplexValueMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComplexValueMap_Target(), theValuesPackage.getComplexValue(), null, "target", null, 1, 1, ComplexValueMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComplexValueMap_Enabled(), theXMLTypePackage.getBoolean(), "enabled", "true", 0, 1, ComplexValueMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(complexValuePairEClass, ComplexValuePair.class, "ComplexValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComplexValuePair_First(), theValuesPackage.getComplexValue(), null, "first", null, 1, 1, ComplexValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComplexValuePair_Second(), theValuesPackage.getComplexValue(), null, "second", null, 1, 1, ComplexValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(databaseResourceDefinitionEClass, DatabaseResourceDefinition.class, "DatabaseResourceDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDatabaseResourceDefinition_Persistent(), theXMLTypePackage.getBoolean(), "persistent", "false", 0, 1, DatabaseResourceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataSetEClass, DataSet.class, "DataSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataSet_Columns(), this.getColumn(), null, "columns", null, 0, -1, DataSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataSet_Name(), this.getObjectName(), "name", null, 0, 1, DataSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataSet_TrimAll(), this.getColumnTrimEnum(), "trimAll", "TRIM_NONE", 0, 1, DataSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataSet_TrimColNames(), theXMLTypePackage.getBoolean(), "trimColNames", "true", 0, 1, DataSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataSetInstanceEClass, DataSetInstance.class, "DataSetInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataSetInstance_Rows(), this.getRowInstance(), null, "rows", null, 0, -1, DataSetInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataSetResourceDefinitionEClass, DataSetResourceDefinition.class, "DataSetResourceDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataSetResourceDefinition_DeviceResource(), this.getResourceDefinition(), null, "deviceResource", null, 0, 1, DataSetResourceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataSetResourceDefinition_DataSet(), this.getDataSet(), null, "dataSet", null, 0, 1, DataSetResourceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataSetResourceDefinition_HasColNames(), theXMLTypePackage.getBoolean(), "hasColNames", "true", 0, 1, DataSetResourceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deviceResourceDefinitionEClass, DeviceResourceDefinition.class, "DeviceResourceDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeviceResourceDefinition_Initialize(), theXMLTypePackage.getBoolean(), "initialize", "true", 0, 1, DeviceResourceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeviceResourceDefinition_IsInline(), theXMLTypePackage.getBoolean(), "isInline", "false", 0, 1, DeviceResourceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(emptyEClass, Empty.class, "Empty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inlineDeviceResourceDefinitionEClass, InlineDeviceResourceDefinition.class, "InlineDeviceResourceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInlineDeviceResourceDefinition_Value(), theValuesPackage.getComplexValue(), null, "value", null, 1, 1, InlineDeviceResourceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inlineNamespaceUriDefinitionEClass, InlineNamespaceUriDefinition.class, "InlineNamespaceUriDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInlineNamespaceUriDefinition_UriDefinitions(), this.getXmlUriDefinition(), null, "uriDefinitions", null, 0, -1, InlineNamespaceUriDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kronusResourceEClass, KronusResource.class, "KronusResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getKronusResource_KronusCallConfiguration(), theBackportPackage.getKronusCallConfiguration(), null, "kronusCallConfiguration", null, 1, 1, KronusResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedResourceDefinitionEClass, NamedResourceDefinition.class, "NamedResourceDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamedResourceDefinition_Name(), this.getObjectName(), "name", "", 0, 1, NamedResourceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceDefinitionEClass, ResourceDefinition.class, "ResourceDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResourceDefinition_Enabled(), theXMLTypePackage.getBoolean(), "enabled", "true", 0, 1, ResourceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResourceDefinition_State(), theXMLTypePackage.getString(), "state", "", 0, 1, ResourceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResourceDefinition_ConnectorPreference(), theXMLTypePackage.getString(), "connectorPreference", null, 0, 1, ResourceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rowInstanceEClass, RowInstance.class, "RowInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRowInstance_Columns(), theValuesPackage.getComplexValue(), null, "columns", null, 0, -1, RowInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xmlNamespaceDefinitionEClass, XmlNamespaceDefinition.class, "XmlNamespaceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xmlUriDefinitionEClass, XmlUriDefinition.class, "XmlUriDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXmlUriDefinition_Prefix(), theValuesPackage.getComplexValue(), null, "prefix", null, 1, 1, XmlUriDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXmlUriDefinition_Uri(), theValuesPackage.getComplexValue(), null, "uri", null, 1, 1, XmlUriDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXmlUriDefinition_Enabled(), theXMLTypePackage.getBoolean(), "enabled", "true", 0, 1, XmlUriDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(columnTrimEnumEEnum, ColumnTrimEnum.class, "ColumnTrimEnum");
    addEEnumLiteral(columnTrimEnumEEnum, ColumnTrimEnum.TRIMNONE);
    addEEnumLiteral(columnTrimEnumEEnum, ColumnTrimEnum.TRIMLEFT);
    addEEnumLiteral(columnTrimEnumEEnum, ColumnTrimEnum.TRIMRIGHT);
    addEEnumLiteral(columnTrimEnumEEnum, ColumnTrimEnum.TRIMBOTH);

    initEEnum(columnTypeEnumEEnum, ColumnTypeEnum.class, "ColumnTypeEnum");
    addEEnumLiteral(columnTypeEnumEEnum, ColumnTypeEnum.STRING);
    addEEnumLiteral(columnTypeEnumEEnum, ColumnTypeEnum.NUMERIC);
    addEEnumLiteral(columnTypeEnumEEnum, ColumnTypeEnum.DATE);

    initEEnum(interpretersEnumEEnum, InterpretersEnum.class, "InterpretersEnum");
    addEEnumLiteral(interpretersEnumEEnum, InterpretersEnum.SHELL);
    addEEnumLiteral(interpretersEnumEEnum, InterpretersEnum.DML);
    addEEnumLiteral(interpretersEnumEEnum, InterpretersEnum.PERL);
    addEEnumLiteral(interpretersEnumEEnum, InterpretersEnum.GROOVY);
    addEEnumLiteral(interpretersEnumEEnum, InterpretersEnum.SCALA);

    initEEnum(modulesEnumEEnum, ModulesEnum.class, "ModulesEnum");
    addEEnumLiteral(modulesEnumEEnum, ModulesEnum.SQL);
    addEEnumLiteral(modulesEnumEEnum, ModulesEnum.DATA_COMPARE);
    addEEnumLiteral(modulesEnumEEnum, ModulesEnum.RUN_CMDS);

    initEEnum(repetitionActionsEnumEEnum, RepetitionActionsEnum.class, "RepetitionActionsEnum");
    addEEnumLiteral(repetitionActionsEnumEEnum, RepetitionActionsEnum.NONE);
    addEEnumLiteral(repetitionActionsEnumEEnum, RepetitionActionsEnum.BREAK);

    initEEnum(resourcesEnumEEnum, ResourcesEnum.class, "ResourcesEnum");
    addEEnumLiteral(resourcesEnumEEnum, ResourcesEnum.DBDB2);
    addEEnumLiteral(resourcesEnumEEnum, ResourcesEnum.DBUDB);
    addEEnumLiteral(resourcesEnumEEnum, ResourcesEnum.DBSYBASE);
    addEEnumLiteral(resourcesEnumEEnum, ResourcesEnum.DIR);
    addEEnumLiteral(resourcesEnumEEnum, ResourcesEnum.DIREXCEL);
    addEEnumLiteral(resourcesEnumEEnum, ResourcesEnum.DIRCSV);
    addEEnumLiteral(resourcesEnumEEnum, ResourcesEnum.DIRDATA);
    addEEnumLiteral(resourcesEnumEEnum, ResourcesEnum.DIRXML);
    addEEnumLiteral(resourcesEnumEEnum, ResourcesEnum.FILE);
    addEEnumLiteral(resourcesEnumEEnum, ResourcesEnum.FILEEXCEL);
    addEEnumLiteral(resourcesEnumEEnum, ResourcesEnum.FILECSV);
    addEEnumLiteral(resourcesEnumEEnum, ResourcesEnum.FILEDATA);
    addEEnumLiteral(resourcesEnumEEnum, ResourcesEnum.FILEXML);
    addEEnumLiteral(resourcesEnumEEnum, ResourcesEnum.MQMANAGER);
    addEEnumLiteral(resourcesEnumEEnum, ResourcesEnum.RESOURCEREFERENCE);

    initEEnum(saturnStatusConditionEnumEEnum, SaturnStatusConditionEnum.class, "SaturnStatusConditionEnum");
    addEEnumLiteral(saturnStatusConditionEnumEEnum, SaturnStatusConditionEnum.ANYFAIL);
    addEEnumLiteral(saturnStatusConditionEnumEEnum, SaturnStatusConditionEnum.ANYPASS);
    addEEnumLiteral(saturnStatusConditionEnumEEnum, SaturnStatusConditionEnum.ALLPASS);
    addEEnumLiteral(saturnStatusConditionEnumEEnum, SaturnStatusConditionEnum.ALLFAIL);

    initEEnum(saturnStatusEnumEEnum, SaturnStatusEnum.class, "SaturnStatusEnum");
    addEEnumLiteral(saturnStatusEnumEEnum, SaturnStatusEnum.PASS);
    addEEnumLiteral(saturnStatusEnumEEnum, SaturnStatusEnum.FAIL);

    // Initialize data types
    initEDataType(columnTrimEnumObjectEDataType, ColumnTrimEnum.class, "ColumnTrimEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(columnTypeEnumObjectEDataType, ColumnTypeEnum.class, "ColumnTypeEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(interpretersEnumObjectEDataType, InterpretersEnum.class, "InterpretersEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(modulesEnumObjectEDataType, ModulesEnum.class, "ModulesEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(objectIdEDataType, String.class, "ObjectId", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(objectNameEDataType, String.class, "ObjectName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(repetitionActionsEnumObjectEDataType, RepetitionActionsEnum.class, "RepetitionActionsEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(resourcesEnumObjectEDataType, ResourcesEnum.class, "ResourcesEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(saturnStatusConditionEnumObjectEDataType, SaturnStatusConditionEnum.class, "SaturnStatusConditionEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(saturnStatusEnumObjectEDataType, SaturnStatusEnum.class, "SaturnStatusEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http://www.ms.com/2006/pdsttools/xsd2perl
    createXsd2perlAnnotations();
    // http://www.ms.com/2011/tdo-qa-tools/rcs
    createRcsAnnotations();
    // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
    createExtendedMetaDataAnnotations();
    // http://www.ms.com/2011/pdsttools/xsd2report
    createXsd2reportAnnotations();
    // http://www.ms.com/2011/pdsttools/xsd2scriptLib
    createXsd2scriptLibAnnotations();
    // null
    createNullAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.ms.com/2006/pdsttools/xsd2perl</b>.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected void createXsd2perlAnnotations()
  {
    String source = "http://www.ms.com/2006/pdsttools/xsd2perl";	
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "nsPrefix", "types",
       "package", "Saturn::Script::Types"
       });	
    addAnnotation
      (abstractBatchListenerEClass, 
       source, 
       new String[] 
       {
       "package", "Saturn::Script::AbstractBatchListener"
       });	
    addAnnotation
      (abstractListenerEClass, 
       source, 
       new String[] 
       {
       "package", "Saturn::Script::AbstractListener"
       });	
    addAnnotation
      (abstractRepetitionHandlerEClass, 
       source, 
       new String[] 
       {
       "package", "Saturn::Script::AbstractRepetitionHandler"
       });	
    addAnnotation
      (abstractRunGroupModifierEClass, 
       source, 
       new String[] 
       {
       "package", "Saturn::Script::AbstractRunGroupModifier"
       });	
    addAnnotation
      (getDataSetResourceDefinition_DataSet(), 
       source, 
       new String[] 
       {
       "init", "true"
       });	
    addAnnotation
      (getResourceDefinition_ConnectorPreference(), 
       source, 
       new String[] 
       {
       "transient", "true"
       });
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
      (abstractAnnotationEClass, 
       source, 
       new String[] 
       {
       "name", "AbstractAnnotation",
       "kind", "empty"
       });	
    addAnnotation
      (abstractBatchListenerEClass, 
       source, 
       new String[] 
       {
       "name", "AbstractBatchListener",
       "kind", "empty"
       });	
    addAnnotation
      (abstractListenerEClass, 
       source, 
       new String[] 
       {
       "name", "AbstractListener",
       "kind", "empty"
       });	
    addAnnotation
      (getAbstractListener_Name(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "name"
       });	
    addAnnotation
      (getAbstractListener_Enabled(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "enabled"
       });	
    addAnnotation
      (abstractRepetitionHandlerEClass, 
       source, 
       new String[] 
       {
       "name", "AbstractRepetitionHandler",
       "kind", "empty"
       });	
    addAnnotation
      (getAbstractRepetitionHandler_DefaultStatus(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "defaultStatus"
       });	
    addAnnotation
      (getAbstractRepetitionHandler_StatusCondition(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "statusCondition"
       });	
    addAnnotation
      (getAbstractRepetitionHandler_Enabled(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "enabled"
       });	
    addAnnotation
      (abstractRunGroupModifierEClass, 
       source, 
       new String[] 
       {
       "name", "AbstractRunGroupModifier",
       "kind", "empty"
       });	
    addAnnotation
      (getAbstractRunGroupModifier_Enabled(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "enabled"
       });	
    addAnnotation
      (columnEClass, 
       source, 
       new String[] 
       {
       "name", "Column",
       "kind", "empty"
       });	
    addAnnotation
      (getColumn_Name(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "name"
       });	
    addAnnotation
      (getColumn_Type(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "type"
       });	
    addAnnotation
      (getColumn_KeyOrder(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "keyOrder"
       });	
    addAnnotation
      (getColumn_Ignored(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "ignored"
       });	
    addAnnotation
      (getColumn_Trim(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "trim"
       });	
    addAnnotation
      (columnTrimEnumEEnum, 
       source, 
       new String[] 
       {
       "name", "ColumnTrimEnum"
       });	
    addAnnotation
      (columnTrimEnumObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "ColumnTrimEnum:Object",
       "baseType", "ColumnTrimEnum"
       });	
    addAnnotation
      (columnTypeEnumEEnum, 
       source, 
       new String[] 
       {
       "name", "ColumnTypeEnum"
       });	
    addAnnotation
      (columnTypeEnumObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "ColumnTypeEnum:Object",
       "baseType", "ColumnTypeEnum"
       });	
    addAnnotation
      (commentEClass, 
       source, 
       new String[] 
       {
       "name", "Comment",
       "kind", "empty"
       });	
    addAnnotation
      (complexValueMapEClass, 
       source, 
       new String[] 
       {
       "name", "ComplexValueMap",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getComplexValueMap_Source(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Source",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getComplexValueMap_Target(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Target",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getComplexValueMap_Enabled(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "enabled"
       });	
    addAnnotation
      (complexValuePairEClass, 
       source, 
       new String[] 
       {
       "name", "ComplexValuePair",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getComplexValuePair_First(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "First",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getComplexValuePair_Second(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Second",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (databaseResourceDefinitionEClass, 
       source, 
       new String[] 
       {
       "name", "DatabaseResourceDefinition",
       "kind", "empty"
       });	
    addAnnotation
      (getDatabaseResourceDefinition_Persistent(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "persistent"
       });	
    addAnnotation
      (dataSetEClass, 
       source, 
       new String[] 
       {
       "name", "DataSet",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getDataSet_Columns(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Columns",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getDataSet_Name(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "name"
       });	
    addAnnotation
      (getDataSet_TrimAll(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "trimAll"
       });	
    addAnnotation
      (getDataSet_TrimColNames(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "trimColNames"
       });	
    addAnnotation
      (dataSetInstanceEClass, 
       source, 
       new String[] 
       {
       "name", "DataSetInstance",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getDataSetInstance_Rows(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Rows",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (dataSetResourceDefinitionEClass, 
       source, 
       new String[] 
       {
       "name", "DataSetResourceDefinition",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getDataSetResourceDefinition_DeviceResource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "DeviceResource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getDataSetResourceDefinition_DataSet(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "DataSet",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getDataSetResourceDefinition_HasColNames(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "hasColNames"
       });	
    addAnnotation
      (deviceResourceDefinitionEClass, 
       source, 
       new String[] 
       {
       "name", "DeviceResourceDefinition",
       "kind", "empty"
       });	
    addAnnotation
      (getDeviceResourceDefinition_Initialize(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "initialize"
       });	
    addAnnotation
      (getDeviceResourceDefinition_IsInline(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "isInline"
       });	
    addAnnotation
      (emptyEClass, 
       source, 
       new String[] 
       {
       "name", "Empty",
       "kind", "empty"
       });	
    addAnnotation
      (inlineDeviceResourceDefinitionEClass, 
       source, 
       new String[] 
       {
       "name", "InlineDeviceResourceDefinition",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getInlineDeviceResourceDefinition_Value(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Value",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (inlineNamespaceUriDefinitionEClass, 
       source, 
       new String[] 
       {
       "name", "InlineNamespaceUriDefinition",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getInlineNamespaceUriDefinition_UriDefinitions(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "UriDefinitions",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (interpretersEnumEEnum, 
       source, 
       new String[] 
       {
       "name", "InterpretersEnum"
       });	
    addAnnotation
      (interpretersEnumObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "InterpretersEnum:Object",
       "baseType", "InterpretersEnum"
       });	
    addAnnotation
      (kronusResourceEClass, 
       source, 
       new String[] 
       {
       "name", "KronusResource",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getKronusResource_KronusCallConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "KronusCallConfiguration",
       "namespace", "http://www.ms.com/2015/Saturn/Kronus"
       });	
    addAnnotation
      (modulesEnumEEnum, 
       source, 
       new String[] 
       {
       "name", "ModulesEnum"
       });	
    addAnnotation
      (modulesEnumObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "ModulesEnum:Object",
       "baseType", "ModulesEnum"
       });	
    addAnnotation
      (namedResourceDefinitionEClass, 
       source, 
       new String[] 
       {
       "name", "NamedResourceDefinition",
       "kind", "empty"
       });	
    addAnnotation
      (getNamedResourceDefinition_Name(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "name"
       });	
    addAnnotation
      (objectIdEDataType, 
       source, 
       new String[] 
       {
       "name", "ObjectId",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "pattern", "[A-Za-z0-9_]*"
       });	
    addAnnotation
      (objectNameEDataType, 
       source, 
       new String[] 
       {
       "name", "ObjectName",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "pattern", "[A-Za-z0-9_]*"
       });	
    addAnnotation
      (repetitionActionsEnumEEnum, 
       source, 
       new String[] 
       {
       "name", "RepetitionActionsEnum"
       });	
    addAnnotation
      (repetitionActionsEnumObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "RepetitionActionsEnum:Object",
       "baseType", "RepetitionActionsEnum"
       });	
    addAnnotation
      (resourceDefinitionEClass, 
       source, 
       new String[] 
       {
       "name", "ResourceDefinition",
       "kind", "empty"
       });	
    addAnnotation
      (getResourceDefinition_Enabled(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "enabled"
       });	
    addAnnotation
      (getResourceDefinition_State(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "state"
       });	
    addAnnotation
      (getResourceDefinition_ConnectorPreference(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "connectorPreference"
       });	
    addAnnotation
      (resourcesEnumEEnum, 
       source, 
       new String[] 
       {
       "name", "ResourcesEnum"
       });	
    addAnnotation
      (resourcesEnumObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "ResourcesEnum:Object",
       "baseType", "ResourcesEnum"
       });	
    addAnnotation
      (rowInstanceEClass, 
       source, 
       new String[] 
       {
       "name", "RowInstance",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getRowInstance_Columns(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Columns",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (saturnStatusConditionEnumEEnum, 
       source, 
       new String[] 
       {
       "name", "SaturnStatusConditionEnum"
       });	
    addAnnotation
      (saturnStatusConditionEnumObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "SaturnStatusConditionEnum:Object",
       "baseType", "SaturnStatusConditionEnum"
       });	
    addAnnotation
      (saturnStatusEnumEEnum, 
       source, 
       new String[] 
       {
       "name", "SaturnStatusEnum"
       });	
    addAnnotation
      (saturnStatusEnumObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "SaturnStatusEnum:Object",
       "baseType", "SaturnStatusEnum"
       });	
    addAnnotation
      (xmlNamespaceDefinitionEClass, 
       source, 
       new String[] 
       {
       "name", "XmlNamespaceDefinition",
       "kind", "elementOnly"
       });	
    addAnnotation
      (xmlUriDefinitionEClass, 
       source, 
       new String[] 
       {
       "name", "XmlUriDefinition",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getXmlUriDefinition_Prefix(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Prefix",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getXmlUriDefinition_Uri(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Uri",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getXmlUriDefinition_Enabled(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "enabled"
       });
  }

  /**
   * Initializes the annotations for <b>http://www.ms.com/2011/pdsttools/xsd2report</b>.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected void createXsd2reportAnnotations()
  {
    String source = "http://www.ms.com/2011/pdsttools/xsd2report";	
    addAnnotation
      (getColumn_Name(), 
       source, 
       new String[] 
       {
       "colNum", "1"
       });	
    addAnnotation
      (getColumn_Type(), 
       source, 
       new String[] 
       {
       "colNum", "3"
       });	
    addAnnotation
      (getColumn_KeyOrder(), 
       source, 
       new String[] 
       {
       "colNum", "2"
       });	
    addAnnotation
      (getColumn_Ignored(), 
       source, 
       new String[] 
       {
       "colNum", "10"
       });	
    addAnnotation
      (getComplexValueMap_Source(), 
       source, 
       new String[] 
       {
       "colNum", "1"
       });	
    addAnnotation
      (getComplexValueMap_Target(), 
       source, 
       new String[] 
       {
       "colNum", "2"
       });	
    addAnnotation
      (getNamedResourceDefinition_Name(), 
       source, 
       new String[] 
       {
       "displayType", "none"
       });	
    addAnnotation
      (getResourceDefinition_Enabled(), 
       source, 
       new String[] 
       {
       "displayType", "none"
       });	
    addAnnotation
      (getResourceDefinition_State(), 
       source, 
       new String[] 
       {
       "displayType", "none"
       });	
    addAnnotation
      (getResourceDefinition_ConnectorPreference(), 
       source, 
       new String[] 
       {
       "displayType", "none"
       });
  }

  /**
   * Initializes the annotations for <b>http://www.ms.com/2011/pdsttools/xsd2scriptLib</b>.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected void createXsd2scriptLibAnnotations()
  {
    String source = "http://www.ms.com/2011/pdsttools/xsd2scriptLib";	
    addAnnotation
      (getColumn_Name(), 
       source, 
       new String[] 
       {
       "order", "1"
       });	
    addAnnotation
      (dataSetEClass, 
       source, 
       new String[] 
       {
       "name", "dataSetConfig"
       });	
    addAnnotation
      (getDataSet_Name(), 
       source, 
       new String[] 
       {
       "order", "1"
       });	
    addAnnotation
      (dataSetResourceDefinitionEClass, 
       source, 
       new String[] 
       {
       "name", "dataSetResource"
       });	
    addAnnotation
      (getDataSetResourceDefinition_DeviceResource(), 
       source, 
       new String[] 
       {
       "dontSerialize", "true"
       });	
    addAnnotation
      (getDataSetResourceDefinition_DataSet(), 
       source, 
       new String[] 
       {
       "include", "true"
       });	
    addAnnotation
      (inlineDeviceResourceDefinitionEClass, 
       source, 
       new String[] 
       {
       "name", "inlineFile"
       });	
    addAnnotation
      (getInlineDeviceResourceDefinition_Value(), 
       source, 
       new String[] 
       {
       "order", "1"
       });	
    addAnnotation
      (namedResourceDefinitionEClass, 
       source, 
       new String[] 
       {
       "name", "namedResource"
       });
  }

  /**
   * Initializes the annotations for <b>null</b>.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void createNullAnnotations()
  {
    String source = null;	
    addAnnotation
      (dataSetResourceDefinitionEClass, 
       source, 
       new String[] 
       {
       "appinfo", "\r\n        <report:param accessor=\"sub {return eval {$_[0]-&gt;deviceResource-&gt;fileName;}}\" displayType=\"none\" name=\"FileName\" xmlns:report=\"http://www.ms.com/2011/pdsttools/xsd2report\"/>\r\n        <report:param accessor=\"sub {return eval {$_[0]-&gt;deviceResource-&gt;value};}\" displayTYpe=\"none\" name=\"inlineContent\" xmlns:report=\"http://www.ms.com/2011/pdsttools/xsd2report\"/>\r\n        <sl:postSerialize xmlns:sl=\"http://www.ms.com/2011/pdsttools/xsd2scriptLib\">  $fieldAccessor = sub { $_[0]-&gt;deviceResource };\r\n  $field = $object-&gt;$fieldAccessor;\r\n  if($parms{compact} &amp;&amp; $field &amp;&amp; ref($field) eq \'Saturn::Resource::DeviceFile\')\r\n  {\r\n    $self-&gt;intAppendOutput(\\$output, $space2 . \"fileName =&gt; \" . $self-&gt;serialize($field-&gt;fileName, %parms, indent =&gt; \"$indent  \") . \",$space1\", %parms);\r\n  }\r\n  elsif($parms{compact} &amp;&amp; $field &amp;&amp; ref($field) eq \'Saturn::Script::Types::InlineDeviceResourceDefinition\')\r\n  {\r\n    $self-&gt;intAppendOutput(\\$output, $space2 . \"value =&gt; \" . $self-&gt;serialize($field-&gt;value, %parms, indent =&gt; \"$indent  \") . \",$space1\", %parms);\r\n  }\r\n  else\r\n  {\r\n    $self-&gt;intAppendOutput(\\$output, $space2 . $self-&gt;mappedFieldName(\'deviceResource\', $parms{maps}) . $self-&gt;serialize($field, %parms, indent =&gt; \"$indent  \") . \",$space1\", %parms) if defined $field;\r\n  }\r\n</sl:postSerialize>\r\n      "
       });	
    addAnnotation
      (deviceResourceDefinitionEClass, 
       source, 
       new String[] 
       {
       "appinfo", "\r\n        <perl:field name=\"parentResource\" type=\"type:ResourceDefinition\" xmlns:perl=\"http://www.ms.com/2006/pdsttools/xsd2perl\"/>\r\n      "
       });	
    addAnnotation
      (inlineDeviceResourceDefinitionEClass, 
       source, 
       new String[] 
       {
       "appinfo", "\r\n           <report:param accessor=\"sub {return $_[0]-&gt;value;}\" name=\"inlineContent\" xmlns:report=\"http://www.ms.com/2011/pdsttools/xsd2report\"/>\r\n        "
       });	
    addAnnotation
      (resourceDefinitionEClass, 
       source, 
       new String[] 
       {
       "appinfo", "\r\n        <perl:method name=\"resourceLogic\" xmlns:perl=\"http://www.ms.com/2006/pdsttools/xsd2perl\">SAT::Assertion-&gt;throw(\'ResourceLogic should be stored in the context and not the resource.\'); </perl:method>\r\n        <report:param accessor=\"sub{my $result = firstval { $_-&gt;isa(\'Saturn::Result\') } @stack; $result-&gt;getResourceInstance($_[0]) if $result}\" displayType=\"none\" name=\"instanceInfo\" xmlns:report=\"http://www.ms.com/2011/pdsttools/xsd2report\"/>\r\n        <report:param accessor=\"sub { return \'resource_\'.refaddr($_[0]); }\" displayType=\"none\" name=\"index\" xmlns:report=\"http://www.ms.com/2011/pdsttools/xsd2report\"/> \r\n        <report:param accessor=\"sub { my $type = ref($_[0]); $type =~ s/Saturn::Resource:://; return $type}\" displayType=\"none\" name=\"resourceType\" xmlns:report=\"http://www.ms.com/2011/pdsttools/xsd2report\"/>    \r\n      "
       });
  }

} // TypesPackageImpl
