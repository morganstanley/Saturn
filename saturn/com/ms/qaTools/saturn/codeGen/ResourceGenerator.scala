package com.ms.qaTools.saturn.codeGen

import scala.collection.JavaConversions._
import scala.util.Try
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.codeGen.scala._
import com.ms.qaTools.generated.utilTypes.NamedResourceDefinition
import com.ms.qaTools.generated.utilTypes.ResourceDefinition
import com.ms.qaTools.saturn.kronus.Backport
import com.ms.qaTools.saturn.resources.db2Resource.DB2Resource
import com.ms.qaTools.saturn.resources.db2Resource.Db2ResourcePackage
import com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource
import com.ms.qaTools.saturn.resources.directoryResource.DirectoryResourcePackage
import com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource
import com.ms.qaTools.saturn.resources.dsSQLResource.DsSQLResource
import com.ms.qaTools.saturn.resources.fileResource.BinaryFile
import com.ms.qaTools.saturn.resources.fileResource.{CSVFile => MCSVFile}
import com.ms.qaTools.saturn.resources.fileResource.CustomFile
import com.ms.qaTools.saturn.resources.fileResource.DataFile
import com.ms.qaTools.saturn.resources.fileResource.{DeviceFile => MDeviceFile}
import com.ms.qaTools.saturn.resources.fileResource.ExcelVersions.BIN2003
import com.ms.qaTools.saturn.resources.fileResource.ExcelVersions.XML2007
import com.ms.qaTools.saturn.resources.fileResource.ExcelWorkBook
import com.ms.qaTools.saturn.resources.fileResource.ExcelWorkSheet
import com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage
import com.ms.qaTools.saturn.resources.fileResource.FixedWidthFile
import com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile
import com.ms.qaTools.saturn.resources.fileResource.JsonFile
import com.ms.qaTools.saturn.resources.fileResource.LineFile
import com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkBook
import com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkSheet
import com.ms.qaTools.saturn.resources.fileResource.PropertiesFile
import com.ms.qaTools.saturn.resources.fileResource.SlurpFile
import com.ms.qaTools.saturn.resources.fileResource.StandardIO
import com.ms.qaTools.saturn.resources.fileResource.XMLFile
import com.ms.qaTools.saturn.resources.h2Resource.FileDatabase
import com.ms.qaTools.saturn.resources.h2Resource.H2Resource
import com.ms.qaTools.saturn.resources.h2Resource.H2ResourcePackage
import com.ms.qaTools.saturn.resources.h2Resource.{MemoryDatabase => H2MemoryDatabase}
import com.ms.qaTools.saturn.resources.icelinkResource.IceLinkResource
import com.ms.qaTools.saturn.resources.informixResource.InformixResource
import com.ms.qaTools.saturn.resources.ldapQueryResource._
import com.ms.qaTools.saturn.resources.ldapResource.LDAPResource
import com.ms.qaTools.saturn.resources.ldapResource.LdapResourcePackage
import com.ms.qaTools.saturn.resources.mapperResource.ExtractorResource
import com.ms.qaTools.saturn.resources.mapperResource.GeneratorResource
import com.ms.qaTools.saturn.resources.mapperResource.MapperResourcePackage
import com.ms.qaTools.saturn.resources.markitwireResource.MarkitWireResource
import com.ms.qaTools.saturn.resources.mongoDbResource.MongoDbResource
import com.ms.qaTools.saturn.resources.mongoDbResource.MongoDbResourcePackage
import com.ms.qaTools.saturn.resources.mqResource.MQResource
import com.ms.qaTools.saturn.resources.mqResource.MqResourcePackage
import com.ms.qaTools.saturn.resources.mqResource.Queue
import com.ms.qaTools.saturn.resources.mssqlResource.MSSQLResource
import com.ms.qaTools.saturn.resources.nullResource.NullDevice
import com.ms.qaTools.saturn.resources.oracleResource.OracleResource
import com.ms.qaTools.saturn.resources.queryResource.QueryResource
import com.ms.qaTools.saturn.resources.queryResource.QueryResourcePackage
import com.ms.qaTools.saturn.resources.queryResource.TableResource
import com.ms.qaTools.saturn.resources.referenceResource.{ReferenceResource => MReferenceResource}
import com.ms.qaTools.saturn.resources.rmiConnectionResource.rmiResource
import com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreResource
import com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResource
import com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResourcePackage
import com.ms.qaTools.saturn.resources.soapIOResource.AbstractTransport
import com.ms.qaTools.saturn.resources.soapIOResource.CpsMessageTypes
import com.ms.qaTools.saturn.resources.soapIOResource.CpsResource
import com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport
import com.ms.qaTools.saturn.resources.soapIOResource.MQTransport
import com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResource
import com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage
import com.ms.qaTools.saturn.resources.soapIOResource.SubscribeEnums
import com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport
import com.ms.qaTools.saturn.resources.sqliteResource.{MemoryDatabase => SQLiteMemoryDatabase}
import com.ms.qaTools.saturn.resources.sqliteResource.SQLiteDatabase
import com.ms.qaTools.saturn.resources.sqliteResource.SQLiteResource
import com.ms.qaTools.saturn.resources.sqliteResource.SqliteResourcePackage
import com.ms.qaTools.saturn.resources.sybaseResource.SybaseResource
import com.ms.qaTools.saturn.resources.sybaseResource.SybaseResourcePackage
import com.ms.qaTools.saturn.resources.teradataResource.TeradataResource
import com.ms.qaTools.saturn.resources.teradataResource.TeradataResourcePackage
import com.ms.qaTools.saturn.resources.transactionResource.TransactionResource
import com.ms.qaTools.saturn.resources.udbResource.UDBResource
import com.ms.qaTools.saturn.resources.udbResource.UdbResourcePackage
import com.ms.qaTools.saturn.types.{InlineDeviceResourceDefinition => MInlineDeviceResourceDefinition}
import com.ms.qaTools.saturn.types.{KronusResource => MKronusResource}
import com.ms.qaTools.saturn.types.{NamedResourceDefinition => MNamedResourceDefinition}
import com.ms.qaTools.saturn.types.{ResourceDefinition => MResourceDefinition}
import com.ms.qaTools.saturn.types.TypesPackage
import com.ms.qaTools.saturn.values.ComplexValue
import com.ms.qaTools.saturn.resources.soapIOResource.PTCPTransport
import com.ms.qaTools.saturn.resources.fileResource.FIXFile
import com.ms.qaTools.saturn.runtime.runner.FIXFileResource

trait ContextAppendOptions {
  val appendAsMetaData: Boolean = false
  def renameFunction: (String) => String = identity
}

object ContextAppendOptions {
  def apply() = new ContextAppendOptions() {}

  def apply(appendAsMeta: Boolean = false, f: (String) => String = identity) = {
    new ContextAppendOptions() {
      override val appendAsMetaData = appendAsMeta
      override def renameFunction = f
    }
  }
}

object ResourceGenerator {
  def genScalaGen(x: Any)(implicit depth: Int, appendOptions: ContextAppendOptions): Try[ScalaGen] =
    Option(x) match {
      case Some(filter: LDAPQueryFilter)            =>
        ComplexValueStringGenerator(filter).map(Tuple2Expr(StringExpr(filter.getName, noInterpolate = true), _))
      case Some(cv: ComplexValue)                   => ComplexValueStringGenerator(cv)
      case Some(res: MResourceDefinition)           => ResourceGenerator(res)(depth + 1, ContextAppendOptions(appendOptions.appendAsMetaData))
      case Some(bool) if bool.isInstanceOf[Boolean] => Try { ScalaExpr(bool.toString()) }
      case Some(string: String)                     => Try { StringExpr(string) }
      case Some(transport: AbstractTransport)       =>
        val pkg = SoapIOResourcePackage.eINSTANCE
        val (features, returnExpr) = transport match {
          case t: TCPTransport => (Seq(pkg.getTCPTransport_Hostname, pkg.getTCPTransport_Port),
                                   s"TransportResource.tcp(hostname, port, ${t.getHandshake}, ${t.isGzipSend})")
          case t: PTCPTransport => (Seq(pkg.getPTCPTransport_Hostname, pkg.getPTCPTransport_Port),
                                    s"TransportResource.ptcp(hostname, port)")
          case t: HTTPTransport => (Seq(pkg.getHTTPTransport_Url),
                                    s"TransportResource.http(url, ${t.isDisableChunkedEncoding})")
          case t: MQTransport => (Seq(pkg.getMQTransport_MQResource,
                                      pkg.getMQTransport_RequestQueue,
                                      pkg.getMQTransport_ResponseQueue),
                                  s"TransportResource.mq(mQResource, requestQueue, responseQueue)")
        }
        genResource(transport, features, returnExpr)(depth + 1, ContextAppendOptions(appendOptions.appendAsMetaData))
      case Some(h2FileDb: FileDatabase)       => genScalaGen(h2FileDb.getDBResource)(depth, ContextAppendOptions(appendOptions.appendAsMetaData))
      case Some(sqLiteFileDb: SQLiteDatabase) => genScalaGen(sqLiteFileDb.getDBResource)(depth, ContextAppendOptions(appendOptions.appendAsMetaData))
      case Some(xs: EList[_])                 => xs.map(genScalaGen).toTrySeq.map(new SeqExpr(_))
      case None                               => Try { TryExpr(StringExpr("")) }
      case Some(invalid)                      => Try { throw new Exception(s"Invalid objects type: >>${invalid.getClass().getName()}<<") }
    }

  def genFeature(eObject: EObject, feature: EStructuralFeature)(implicit depth: Int, appendOptions: ContextAppendOptions): Try[ScalaGen] =
    genScalaGen(eObject.eGet(feature)).map(gen => ConcatGen(Seq(gen), start = s"val `${feature.getName}` = "))

  def genResource(eObject: EObject, features: Seq[EStructuralFeature], returnExpr: String)(implicit depth: Int, appendOptions: ContextAppendOptions): Try[TryGen] =
    appendResourceToContext(eObject, features.map(genFeature(eObject, _)).toTrySeq.map(gens => ConcatGen(gens, "\n", "", s"${"\n"}Runtime$returnExpr(context_$depth)")))

  def getResourceName(res: EObject)(implicit appendOptions: ContextAppendOptions) = {
    appendOptions.renameFunction(
      if (appendOptions.appendAsMetaData)
        res.eContainingFeature().getName()
      else
        res match {
          case r: MNamedResourceDefinition if (!r.getName().isEmpty()) => r.getName()
          case _ => res.eContainingFeature().getName()
        }
    ).capitalize
  }
  
  def getResourceDescription(res: EObject) = '"' + res.eClass.getName + '"'
  
  def getParentResrouceContextName(depth: Int) = if (depth == 0) "context" else s"context_${depth - 1}"

  def appendResourceToContext(res: EObject, gen: Try[ScalaGen])(implicit depth: Int, appendOptions: ContextAppendOptions): Try[TryGen] = {
    val appendFunction = if (appendOptions.appendAsMetaData) "appendMetaDataContext" else "appendResourceContext"
    gen.map { t =>
      TryFnExpr(ConcatGen(
        Seq(ScalaExpr("{"),
            ScalaExpr(s"""val context_$depth = ${getParentResrouceContextName(depth)}.$appendFunction("${getResourceName(res)}",${getResourceDescription(res)});"""),
            t,
            ScalaExpr("}")), separator = "\n"))
    }
  }

  def apply(resource: MResourceDefinition, 
            withConnectTry: Boolean = true, 
            name: Option[String] = None)
           (implicit depth: Int = 0, appendOptions: ContextAppendOptions = ContextAppendOptions()): Try[TryGen] = {
    // Keep the case clauses in alphabetic order according to the names of resources they handle (except generic ones
    // such as ReferenceResource)
    val generator = Option(resource) match {
      case Some(binaryResource: BinaryFile) =>
        genResource(resource, Seq(TypesPackage.eINSTANCE.getDataSetResourceDefinition_DeviceResource()), "BinaryFileResource(deviceResource)")
      case Some(cpsResource: CpsResource) =>
        //TODO Move to Resource runtime generator after merging CPSIO refactor in util
        appendResourceToContext(cpsResource,
          for {
            cpsTransport       <- Try(cpsResource.getTransport)
            namespaceFors      <- Option(cpsTransport.getNamespaceDefinition) match {
                                    case Some(r) => Try(Seq(ForAssignment("namespaceInput",TryFnExpr("namespaceDefinition.input")),
                                                            ForAssignment("namespaces",TryExpr("namespaceInput.map( row => (row(0), row(1))).toMap"))))
                                    case None    => Try(Seq(ForAssignment("namespaces",TryExpr("Map[String,String]()"))))
                                  }
            cpsMessageType     <- Try(cpsTransport.getCpsMessageType)
            sowFor             <- Try(ForAssignment("sow", TryExpr(cpsTransport.getSubscribe match {
                                    case SubscribeEnums.SUBSCRIBE     => "false"
                                    case SubscribeEnums.SUBSCRIBE_SOW => "true"
                                    case SubscribeEnums.NONE          => "false"
                                  })))
            forAssignments     <- Seq(SoapIOResourcePackage.eINSTANCE.getCPSTransport_ClassName(),
                                      SoapIOResourcePackage.eINSTANCE.getCPSTransport_JarLocation(),
                                      SoapIOResourcePackage.eINSTANCE.getCPSTransport_NamespaceDefinition(),
                                      SoapIOResourcePackage.eINSTANCE.getCPSTransport_Topic()).map{feature =>
                                        genScalaGen(cpsTransport.eGet(feature)).map{gen =>
                                          ForAssignment(s"${feature.getName}", TryFnExpr(gen))}}.toTrySeq
            transportFor <- genScalaGen(cpsTransport.getTransport).map { gen =>
              ForAssignment(s"${SoapIOResourcePackage.eINSTANCE.getCPSTransport_Transport().getName}", TryFnExpr(gen))
            }
            filterFor          <- (Option(cpsTransport.getFilter).map(f => ComplexValueStringGenerator(f)).getOrElse(Try{TryExpr("null")})).map(g => ForAssignment("filter", g.withMap(OptionExpr(ScalaExpr("_")))))
          } yield {
            val pbMessageClass = cpsTransport.getCpsMessageType match {
              case CpsMessageTypes.GPB =>
                ", pbMessageClass = Some(Class.forName(className, true, new java.net.URLClassLoader(Array(new java.io.File(jarLocation).toURI.toURL))))"
              case _ =>
                ""
            }
            val conf = new StringBuilder(s"CPSIO.Config(Option(topic), filter, sow, protocol = CPSProtocol.$cpsMessageType$pbMessageClass, namespaces = namespaces)")
            cpsTransport.getTransport match {
              case _: MQTransport => conf ++= ".copy(subscriptionID = Some(java.util.UUID.randomUUID().toString))" // TODO Take this from GUI
              case _              =>
            }
            val typ = cpsTransport.getCpsMessageType match {
              case CpsMessageTypes.CPS0 => "appmw.cpsjava.core.message.CPSMessage"
              case CpsMessageTypes.SOAP => "msjava.hdom.Document"
              case CpsMessageTypes.GPB  => "com.google.protobuf.GeneratedMessage"
            }
            ForTryExpr(forAssignments ++ namespaceFors ++ Seq(transportFor, filterFor, sowFor),
                       ScalaExpr(s"""CPSIO[$typ](transport, $conf)"""))
          })
      case Some(csvResource: MCSVFile)    => genResource(resource, Seq(TypesPackage.eINSTANCE.getDataSetResourceDefinition_DeviceResource()), "CsvFileResource(deviceResource)")
      case Some(customFile: CustomFile)   => genResource(resource,
                                                         Seq(TypesPackage.eINSTANCE.getDataSetResourceDefinition_DeviceResource(),
                                                             FileResourcePackage.eINSTANCE.getCustomFile_CellSeparator(),
                                                             FileResourcePackage.eINSTANCE.getCustomFile_RowSeparator(),
                                                             FileResourcePackage.eINSTANCE.getCustomFile_QuoteCharacter(),
                                                             FileResourcePackage.eINSTANCE.getCustomFile_EscapeCharacter(),
                                                             FileResourcePackage.eINSTANCE.getCustomFile_NullMarker()),
                                                         """CustomFileResource(deviceResource, cellSeparator, rowSeparator, quoteCharacter, escapeCharacter, nullMarker)""")
      case Some(dataResource: DataFile)   => genResource(resource, Seq(TypesPackage.eINSTANCE.getDataSetResourceDefinition_DeviceResource()), "DataFileResource(deviceResource)")
      case Some(db2Resource: DB2Resource) => genResource(resource,
                                                         Seq(Db2ResourcePackage.eINSTANCE.getDB2Resource_Server(),
                                                            Db2ResourcePackage.eINSTANCE.getDB2Resource_Qualifier(),
                                                            Db2ResourcePackage.eINSTANCE.getDB2Resource_Login(),
                                                            Db2ResourcePackage.eINSTANCE.getDB2Resource_Password(),
                                                            TypesPackage.eINSTANCE.getDatabaseResourceDefinition_Persistent()),
                                                         "DB2Resource(server, qualifier, login, password, persistent)")
      case Some(directoryResource: DirectoryResource) => genResource(resource,
                                                                     Seq(DirectoryResourcePackage.eINSTANCE.getDirectoryResource_Directory(),
                                                                         DirectoryResourcePackage.eINSTANCE.getDirectoryResource_Filter()),
                                                                     "DirectoryResource(directory, filter)")
      case Some(documentumResource: DocumentumResource) => Try { TryExpr(ScalaExpr("""throw new Exception("Feature not implemented.")""")) }
      case Some(dsSqlResource: DsSQLResource)           => Try { TryExpr(ScalaExpr("""throw new Exception("Feature not implemented.")""")) }
      case Some(excelWBResource: ExcelWorkBook)         => {
        import com.ms.qaTools.saturn.resources.fileResource.ExcelVersions._
        val isXlsx = excelWBResource.getVersion match {
          case XML2007  => "true"
          case BIN2003  => "false"
          case _        => """fileName.endsWith(".xlsx")"""
        }
        genResource(resource,
                    Seq(FileResourcePackage.eINSTANCE.getDeviceFile_FileName()),
                    s"ExcelWorkBookResource(fileName, $isXlsx)")
      }
      case Some(excelWSResource: ExcelWorkSheet)      => genResource(resource,
												                                             Seq(TypesPackage.eINSTANCE.getDataSetResourceDefinition_DeviceResource(),
												                                             FileResourcePackage.eINSTANCE.getExcelWorkSheet_WorkSheet()),
												                                             "ExcelWorkSheetResource(deviceResource, workSheet)")
      case Some(extractorResource: ExtractorResource) => genResource(resource,
												                     Seq(MapperResourcePackage.eINSTANCE.getExtractorResource_InputResource(),
												                         MapperResourcePackage.eINSTANCE.getExtractorResource_Configuration()),
												                     "ExtractorResource(inputResource, configuration)")
      case Some(fixFileResource: FIXFile)   => {
        val dictionaryFeature = Option(fixFileResource.getDictionary).map(d => Seq(FileResourcePackage.eINSTANCE.getFIXFile_Dictionary())).getOrElse(Seq())
        val separatorFeature = Option(fixFileResource.getSeparator).map(d => Seq(FileResourcePackage.eINSTANCE.getFIXFile_Separator())).getOrElse(Seq())
        genResource(resource, Seq(TypesPackage.eINSTANCE.getDataSetResourceDefinition_DeviceResource(),
                                  FileResourcePackage.eINSTANCE.getFIXFile_DoValidation()) ++ dictionaryFeature ++ separatorFeature, 
                                  s"FIXFileResource(deviceResource, ${if(dictionaryFeature.isEmpty) "None" else "Option(dictionary)"}, doValidation, ${if(separatorFeature.isEmpty) "None" else "Option(separator)"})")
      }
      case Some(fixedWidthResource: FixedWidthFile)   =>
        genResource(resource, Seq(
          TypesPackage.eINSTANCE.getDataSetResourceDefinition_DeviceResource(),
          FileResourcePackage.eINSTANCE.getFixedWidthFile_ConfigFile()
        ), "FixedWidthFileResource(deviceResource, configFile)")
      case Some(generatorResource: GeneratorResource) => genResource(resource,
												                     Seq(MapperResourcePackage.eINSTANCE.getGeneratorResource_TemplateResource(),
												                         MapperResourcePackage.eINSTANCE.getGeneratorResource_InputResource()),
												                     "GeneratorResource(templateResource, inputResource)")
      case Some(pbResource: GoogleProtoBufFile)       => genResource(resource,
                                                                     Seq(TypesPackage.eINSTANCE.getDataSetResourceDefinition_DeviceResource(),
                                                                         FileResourcePackage.eINSTANCE.getGoogleProtoBufFile_Classname(),
                                                                         FileResourcePackage.eINSTANCE.getGoogleProtoBufFile_JarLocation(),
                                                                         FileResourcePackage.eINSTANCE.getGoogleProtoBufFile_ReadDelimited(),
                                                                         FileResourcePackage.eINSTANCE.getGoogleProtoBufFile_ReadEncoded()), 
                                                                     "GoogleProtoBufFile(deviceResource, classname, jarLocation, readDelimited, readEncoded)")
      case Some(h2Resource: H2Resource) => {
        val ddlFeature = Option(h2Resource.getDDLResource).map(ddlResource => Seq(H2ResourcePackage.eINSTANCE.getH2Resource_DDLResource())).getOrElse(Seq())
        Option(h2Resource.getDatabase()) match {
          case Some(mem: H2MemoryDatabase) => genResource(resource,
												          Seq(TypesPackage.eINSTANCE.getDatabaseResourceDefinition_Persistent()) ++ ddlFeature,
												          s"H2Resource(None, ${if(ddlFeature.isEmpty) "None" else "Option(dDLResource)"}, persistent)")
          case Some(file: FileDatabase)    => genResource(resource,
												          Seq(TypesPackage.eINSTANCE.getDatabaseResourceDefinition_Persistent(),
												              H2ResourcePackage.eINSTANCE.getH2Resource_Database()) ++ ddlFeature,
												          s"H2Resource(Option(database), ${if(ddlFeature.isEmpty) "None" else "Option(dDLResource)"}, persistent)")
          case Some(unsupported) => throw new Exception(s"H2 resource, unsupported database: $unsupported.")
          case None              => throw new Exception("No database provided for H2 resource.")
        }
      }
      case Some(iceLinkResource: IceLinkResource)       => Try { TryExpr(ScalaExpr("""throw new Exception("Feature not implemented.")""")) }
      case Some(informixResource: InformixResource)     => Try { TryExpr(ScalaExpr("""throw new Exception("Feature not implemented.")""")) }
      case Some(jsonResource: JsonFile)                 => genResource(resource, Seq(TypesPackage.eINSTANCE.getDataSetResourceDefinition_DeviceResource()), "JsonFileResource(deviceResource)")
      case Some(ldapQueryResource: LDAPQueryResource)   =>
        genResource(resource,
                    Seq(TypesPackage.eINSTANCE.getDataSetResourceDefinition_DeviceResource,
                        LdapQueryResourcePackage.eINSTANCE.getLDAPQueryResource_Type,
                        LdapQueryResourcePackage.eINSTANCE.getLDAPQueryResource_Filters,
                        LdapQueryResourcePackage.eINSTANCE.getLDAPQueryResource_SelectedFields),
                    "LdapQueryResource(deviceResource, `type`, filters, selectedFields)")
      case Some(ldapResource: LDAPResource)             =>
        genResource(resource,
                    Seq(LdapResourcePackage.eINSTANCE.getLDAPResource_Host,
                        LdapResourcePackage.eINSTANCE.getLDAPResource_Domain,
                        LdapResourcePackage.eINSTANCE.getLDAPResource_Password),
                    "LdapResource(host, domain, password)")
      case Some(lineResource: LineFile)                 => genResource(resource, Seq(TypesPackage.eINSTANCE.getDataSetResourceDefinition_DeviceResource()), "LineFileResource(deviceResource)")
      case Some(markitWireResource: MarkitWireResource) => Try { TryExpr(ScalaExpr("""throw new Exception("Feature not implemented.")""")) }
      case Some(mongoDbResource: MongoDbResource)       => genResource(resource,
                                                                       Seq(MongoDbResourcePackage.eINSTANCE.getMongoDbResource_Host(),
                                                                           MongoDbResourcePackage.eINSTANCE.getMongoDbResource_Port(),
                                                                           MongoDbResourcePackage.eINSTANCE.getMongoDbResource_Database(),
                                                                           MongoDbResourcePackage.eINSTANCE.getMongoDbResource_Login(),
                                                                           MongoDbResourcePackage.eINSTANCE.getMongoDbResource_Password()),
                                                                       s"""MongoDBResource(host,
                                                                                           port,
                                                                                           database,
                                                                                           login,
                                                                                           password,
                                                                                           com.ms.qaTools.saturn.resources.mongoDbResource.AuthentificationEnums.${mongoDbResource.getAuthentification})""")
      case Some(mqResource: MQResource)             => genResource(resource,
                                                                   Seq(MqResourcePackage.eINSTANCE.getMQResource_ManagerName()),
                                                                   "MQResource(managerName)")
      case Some(msSqlResource: MSSQLResource)       => Try { TryExpr(ScalaExpr("""throw new Exception("Feature not implemented.")""")) }
      case Some(nullResource: NullDevice)           => appendResourceToContext(nullResource, Try { TryExpr(ScalaExpr("NullIO")) })
      case Some(ooCalcWBResource: OOCalcWorkBook)   => Try { TryExpr(ScalaExpr("""throw new Exception("Feature not implemented.")""")) }
//        genResource(resource, Seq(FileResourcePackage.eINSTANCE.getDeviceFile_FileName()), "OOCalcWorkBookResource(fileName)")
      case Some(ooCalcWSResource: OOCalcWorkSheet)  => Try { TryExpr(ScalaExpr("""throw new Exception("Feature not implemented.")""")) }
//        genResource(resource, Seq(TypesPackage.eINSTANCE.getDataSetResourceDefinition_DeviceResource()), "OOCalcWorkSheetResource(deviceResource)")
      case Some(oracleResource: OracleResource)     => Try { TryExpr(ScalaExpr("""throw new Exception("Feature not implemented.")""")) }
      case Some(propertiesResource: PropertiesFile) => genResource(resource, Seq(TypesPackage.eINSTANCE.getDataSetResourceDefinition_DeviceResource()), "PropertiesFileResource(deviceResource)")
      case Some(queryResource: QueryResource)       => genResource(resource,
                                                                   Seq(TypesPackage.eINSTANCE.getDataSetResourceDefinition_DeviceResource(),
                                                                       QueryResourcePackage.eINSTANCE.getQueryResource_Query()),
                                                                   "QueryResource(deviceResource, query)")
      case Some(rmiConnectionResource: rmiResource)         => Try { TryExpr(ScalaExpr("""throw new Exception("Feature not implemented.")""")) }
      case Some(semaphoneResource: SemaphoreResource)       => Try { TryExpr(ScalaExpr("""throw new Exception("Feature not implemented.")""")) }
      case Some(shadowDirectResource: ShadowDirectResource) =>
        genResource(resource,
                    Seq(ShadowDirectResourcePackage.eINSTANCE.getShadowDirectResource_Server,
                        ShadowDirectResourcePackage.eINSTANCE.getShadowDirectResource_Login,
                        ShadowDirectResourcePackage.eINSTANCE.getShadowDirectResource_Password),
                    "ShadowDirectResource(server, login, password)")
      case Some(slurpResource: SlurpFile)                   => genResource(resource, Seq(TypesPackage.eINSTANCE.getDataSetResourceDefinition_DeviceResource()), "SlurpFileResource(deviceResource)")
      case Some(soapIOResource: SoapIOResource)             => genResource(resource,
                                                                           Seq(SoapIOResourcePackage.eINSTANCE.getSoapIOResource_Transport()),
                                                                           soapIOResource.getTransport match {
																             case t: TCPTransport  => "SoapIOResource.TCP(transport)"
																             case t: PTCPTransport  => "SoapIOResource.PTCP(transport)"
																             case t: HTTPTransport => "SoapIOResource.HTTP(transport)"
																             case t: MQTransport   => "SoapIOResource.MQ(transport)"})
      case Some(sqliteResource: SQLiteResource) => {
        val ddlFeature = Option(sqliteResource.getDDLResource).map(ddlResource => Seq(SqliteResourcePackage.eINSTANCE.getSQLiteResource_DDLResource())).getOrElse(Seq())
        Option(sqliteResource.getDatabase()) match {
          case Some(mem: SQLiteMemoryDatabase)  => genResource(resource,
												               Seq(TypesPackage.eINSTANCE.getDatabaseResourceDefinition_Persistent()) ++ ddlFeature,
												               s"SQLiteResource(None, ${if(ddlFeature.isEmpty) "None" else "Option(dDLResource)"}, persistent)")
          case Some(file: SQLiteDatabase)       => genResource(resource,
												               Seq(TypesPackage.eINSTANCE.getDatabaseResourceDefinition_Persistent(),
												                   SqliteResourcePackage.eINSTANCE.getSQLiteResource_Database()) ++ ddlFeature,
												               s"SQLiteResource(Option(database), ${if(ddlFeature.isEmpty) "None" else "Option(dDLResource)"}, persistent)")
          case Some(unsupported) => throw new Exception(s"SQLite resource, unsupported database: $unsupported.")
          case None              => throw new Exception("No database provided for SQLite resource.")
        }
      }
      case Some(standardIO: StandardIO)         => genResource(resource, Seq(), s"StandardIOResource(${standardIO.isUseStdErr()})")
      case Some(sybaseResource: SybaseResource) => genResource(resource,
                                                               Seq(SybaseResourcePackage.eINSTANCE.getSybaseResource_Server(),
                                                                   SybaseResourcePackage.eINSTANCE.getSybaseResource_Database(),
                                                                   SybaseResourcePackage.eINSTANCE.getSybaseResource_Login(),
                                                                   SybaseResourcePackage.eINSTANCE.getSybaseResource_Password(),
                                                                   TypesPackage.eINSTANCE.getDatabaseResourceDefinition_Persistent()),
                                                               s"""SybaseResource(server,
                                                                                  database,
                                                                                  login,
                                                                                  password,
                                                                                  com.ms.qaTools.saturn.resources.sybaseResource.AuthentificationEnums.${sybaseResource.getAuthentification},
                                                                                  persistent)""")
      case Some(table: TableResource)               => genResource(resource,
                                                                   Seq(TypesPackage.eINSTANCE.getDataSetResourceDefinition_DeviceResource(),
                                                                       QueryResourcePackage.eINSTANCE.getTableResource_Table()),
                                                                   s"TableResource(deviceResource, table)")
      case Some(teradataResource: TeradataResource) => genResource(resource,
                                                                   Seq(TeradataResourcePackage.eINSTANCE.getTeradataResource_Server(),
                                                                       TeradataResourcePackage.eINSTANCE.getTeradataResource_Database(),
                                                                       TeradataResourcePackage.eINSTANCE.getTeradataResource_Login(),
                                                                       TeradataResourcePackage.eINSTANCE.getTeradataResource_Password(),
                                                                       TypesPackage.eINSTANCE.getDatabaseResourceDefinition_Persistent()),
                                                                   s"""TeradataResource(server,
                                                                                        database,
                                                                                        login,
                                                                                        password,
                                                                                        com.ms.qaTools.saturn.resources.teradataResource.AuthentificationEnums.${teradataResource.getAuthentification},
                                                                                        persistent)""")
      case Some(transactionResource: TransactionResource) => Try { TryExpr(ScalaExpr("""throw new Exception("Feature not implemented.")""")) }
      case Some(udbResource: UDBResource)                 => genResource(resource,
                                                                         Seq(UdbResourcePackage.eINSTANCE.getUDBResource_Server(),
                                                                             UdbResourcePackage.eINSTANCE.getUDBResource_Qualifier(),
                                                                             TypesPackage.eINSTANCE.getDatabaseResourceDefinition_Persistent()),
                                                                         "UDBResource(server, qualifier, persistent)")
      case Some(xmlResource: XMLFile)                     => genResource(resource, Seq(TypesPackage.eINSTANCE.getDataSetResourceDefinition_DeviceResource()), "XMLFileResource(deviceResource)")
      case Some(referenceResource: MReferenceResource)    => appendResourceToContext(resource,
        Try {
          val resourceString = s"${if (referenceResource.getIncludeFile() != null && !referenceResource.getIncludeFile().isEmpty()) referenceResource.getIncludeFile() + "." else ""}${referenceResource.getResource()}"
          TryExpr(ScalaExpr(Seq(s"""context_$depth.appendMetaDataContext("Referenced Resource", "$resourceString")""",
                                s"$resourceString").mkString("\n")), guaranteedSuccess = true)
        })
      case Some(fileResource: MDeviceFile)                       => genResource(resource, Seq(FileResourcePackage.eINSTANCE.getDeviceFile_FileName()), s"DeviceFileResource(fileName, ${fileResource.isAppend})")
      case Some(inlineResource: MInlineDeviceResourceDefinition) => genResource(resource, Seq(TypesPackage.eINSTANCE.getInlineDeviceResourceDefinition_Value()), s"InlineDeviceResource(value)")
      case Some(kronusResource: MKronusResource)                 =>
        appendResourceToContext(kronusResource, KronusCodeGen(Backport()).genResource(kronusResource))
      case Some(invalid: NamedResourceDefinition) => Try { TryExpr(ScalaExpr("""throw new Exception("Feature not implemented.")""")) }
      case Some(invalid: ResourceDefinition)      => Try { TryExpr(ScalaExpr("""throw new Exception("Feature not implemented.")""")) }
      case unknown                                => Try { throw new Exception(s"ResourceGenerator received an unknown resource: $unknown") }
    }
    if (withConnectTry)
      generator.map(ConnectTry(_, name.getOrElse((resource.eContainer.eClass.getName + resource.eContainingFeature.getName).capitalize), resource.isInstanceOf[MReferenceResource]))
    else
      generator
  }

  case class ResourceMetaData(creationObject: String, abstractType: String,
                              inputType: Option[String], outputType: Option[String],
                              typeTree: Option[ParameterTypeInferencer.TypeTree]) {
    def getTypeTree = typeTree.getOrElse(ParameterTypeInferencer.TypeTree(abstractType))
  }

  object ResourceMetaData {
    import ParameterTypeInferencer.TypeTree

    def apply(creationObject: String, abstractType: String, dsType: Option[String] = None): ResourceMetaData =
      ResourceMetaData(creationObject, abstractType, dsType, dsType, None)

    def fromTypeTree(typeTree: TypeTree)(implicit codeGenUtil: SaturnCodeGenUtil) = {
      val Seq(in, out) = Seq("Input[Iterator[A]]", "Output[Writer[Iterator[A]]]").map { t =>
        Try(TypeTree(t, Set("A"), Some(null)).reifyTypeParam("A", typeTree).toString).toOption
      }
      val str = typeTree.toString
      apply(str, str, in, out, typeTree = Some(typeTree))
    }
  }

  val stringRowDsType   = "Seq[String]"
  val xlCellRowDsType   = "Seq[String]"
  val stringDsType      = "String"
  val byteArrayDsType   = "Array[Byte]"
  val w3cDocumentDsType = "W3cDocument"
  val jsonDsType        = "JsonNode"
  val fixDsType         = "FixMessage"
  val pbDsType          = "GeneratedMessage"
  val queryDsType       = "Seq[String]"

  val stringRowIterator   = s"Iterator[$stringRowDsType] with ColumnDefinitions"
  val xlCellRowIterator   = s"Iterator[$xlCellRowDsType]"
  val stringIterator      = s"Iterator[$stringDsType]"
  val byteArrayIterator   = s"Iterator[$byteArrayDsType]"
  val w3cDocumentIterator = s"Iterator[$w3cDocumentDsType]"
  val jsonIterator        = s"Iterator[$jsonDsType]"
  val fixIterator         = s"Iterator[$fixDsType]"
  val pbIterator          = s"Iterator[$pbDsType]"
  val queryIterator       = s"Iterator[$queryDsType]"

  val stringRowWriter   = s"Writer[Iterator[$stringRowDsType]]"
  val xlCellRowWriter   = s"Writer[Iterator[$xlCellRowDsType]]"
  val stringWriter      = s"Writer[Iterator[$stringDsType]]"
  val byteArrayWriter   = s"Writer[Iterator[$byteArrayDsType]]"
  val w3cDocumentWriter = s"Writer[Iterator[$w3cDocumentDsType]]"
  val jsonWriter        = s"Writer[Iterator[$jsonDsType]]"
  val fixWriter         = s"Writer[Iterator[$byteArrayDsType]]"
  val pbWriter          = s"Writer[Iterator[$pbDsType]]"

  val propIO        = s"Input[$stringRowIterator]"
  val stringRowIO   = s"Input[$stringRowIterator] with Output[$stringRowWriter]"
  val xlCellRowIO   = s"Input[$xlCellRowIterator] with Output[$xlCellRowWriter]"
  val stringIO      = s"Input[$stringIterator] with Output[$stringWriter]"
  val byteArrayIO   = s"Input[$byteArrayIterator] with Output[$byteArrayWriter]"
  val w3cDocumentIO = s"Input[$w3cDocumentIterator] with Output[$w3cDocumentWriter]"
  val fixIO         = s"Input[$fixIterator] with Output[$fixWriter]"
  val jsonIO        = s"Input[$jsonIterator] with Output[$jsonWriter]"
  val pbIO          = s"Input[$pbIterator] with Output[$pbWriter]"
  val queryIO       = s"Input[$queryIterator]"

  val queueType     = s"Message"
  val soapType      = s"Array[Byte]"

  val soapIO        = s"(Reader[SoapIOConfig, SoapIO], Function1[Array[Byte], Array[Byte]], Function1[Array[Byte], Array[Byte]])"
  val queueIO       = s"NetworkIO[$queueType]"

  case class ConversionMethod(name:String, toType:String, fromTypes:Seq[String])

  def getMetaData(resource:MResourceDefinition)(implicit codeGenUtil: SaturnCodeGenUtil):Option[ResourceMetaData] = {
    Option(resource) match {
      case Some(binaryFile: BinaryFile)                          => Some(ResourceMetaData("ByteArrayIO", byteArrayIO, Some(byteArrayDsType)))
      case Some(csvResource: MCSVFile)                           => Some(ResourceMetaData("CsvIO", stringRowIO, Some(stringRowDsType)))
      case Some(customFileResource: CustomFile)                  => Some(ResourceMetaData("CustomIO", stringRowIO, Some(stringRowDsType)))
      case Some(dataResource: DataFile)                          => Some(ResourceMetaData("DataIO", stringRowIO, Some(stringRowDsType)))
      case Some(db2Resource: DB2Resource)                        => Some(ResourceMetaData("DB2Connection", "DatabaseConnection"))
      case Some(directoryResource: DirectoryResource)            => Some(ResourceMetaData("DirIO", "DeviceIO"))
      case Some(documentumResource: DocumentumResource)          => None
      case Some(dsSqlResource: DsSQLResource)                    => None
      case Some(excelWBResource: ExcelWorkBook)                  => Some(ResourceMetaData("ExcelIO", "ExcelIO"))
      case Some(excelWSResource: ExcelWorkSheet)                 => Some(ResourceMetaData("ExcelWsIO", xlCellRowIO, Some(xlCellRowDsType)))
      case Some(fixResource: FIXFile)                            => Some(ResourceMetaData(fixIO, fixIO, Some(fixDsType), Some(byteArrayDsType), None))
      case Some(fixedWidthResource: FixedWidthFile)              => Some(ResourceMetaData("FixedWidthIO", stringRowIO, Some(stringRowDsType)))
      case Some(h2Resource: H2Resource)                          => Some(ResourceMetaData("H2Connection", "DatabaseConnection"))
      case Some(iceLinkResource: IceLinkResource)                => None
      case Some(informixResource: InformixResource)              => None
      case Some(jsonResource: JsonFile)                          => Some(ResourceMetaData("JsonIO", jsonIO, Some(jsonDsType)))
      case Some(kronusResource: MKronusResource)                 => Some(KronusCodeGen(Backport()).genResourceMeta(kronusResource))
      case Some(ldapQueryResource: LDAPQueryResource)            => None
      case Some(ldapResource: LDAPResource)                      => None
      case Some(lineResource: LineFile)                          => Some(ResourceMetaData("LineIO", stringIO, Some(stringDsType)))
      case Some(markitWireResource: MarkitWireResource)          => None
      case Some(mongoDbResource: MongoDbResource)                => Some(ResourceMetaData("MongoDBConnection", "MongoDBConnection"))
      case Some(mqResource: MQResource)                          => Some(ResourceMetaData("MQResource", "MQResource"))
      case Some(msSqlResource: MSSQLResource)                    => None
      case Some(nullResource: NullDevice)                        => Some(ResourceMetaData("NullIO", "DeviceIO with Input[ByteArrayRowSource] with Output[ByteArrayRowWriter] with DiffWriter"))
      case Some(ooCalcWBResource: OOCalcWorkBook)                => None //Some(ResourceMetaData("OOCalcIO", "OOCalcIO"))
      case Some(ooCalcWSResource: OOCalcWorkSheet)               => None //Some(ResourceMetaData("OOCalcWsIOIO", ""))
      case Some(oracleResource: OracleResource)                  => None
      case Some(propertiesResource: PropertiesFile)              => Some(ResourceMetaData("PropertiesIO", propIO, Some(stringRowDsType)))
      case Some(queryResource: QueryResource)                    => Some(ResourceMetaData("QueryIO", queryIO, Some(queryDsType)))
      case Some(queueResource: Queue)                            => None //Some(ResourceMetaData("QueueIO", queueIO))
      case Some(rmiConnectionResource: rmiResource)              => None
      case Some(semaphoneResource: SemaphoreResource)            => None
      case Some(shadowDirectResource: ShadowDirectResource)      => None
      case Some(slurpResource: SlurpFile)                        => Some(ResourceMetaData("SlurpIO", stringIO, Some(stringDsType)))
      case Some(soapIOResource: SoapIOResource)                  => Some(ResourceMetaData("SoapIO", soapIO, Some(soapType)))
      case Some(sqliteResource: SQLiteResource)                  => Some(ResourceMetaData("SQLiteConnection", "DatabaseConnection"))
      case Some(standardIO: StandardIO)                          => Some(ResourceMetaData("StandardIO", "DeviceIO"))
      case Some(sybaseResource: SybaseResource)                  => Some(ResourceMetaData("SybaseConnection", "DatabaseConnection"))
      case Some(teradataResource: TeradataResource)              => Some(ResourceMetaData("TeraDataConnection", "DatabaseConnection"))
      case Some(transactionResource: TransactionResource)        => None
      case Some(udbResource: UDBResource)                        => Some(ResourceMetaData("UDBConnection", "DatabaseConnection"))
      case Some(xmlResource: XMLFile)                            => Some(ResourceMetaData("XmlIO", w3cDocumentIO, Some(w3cDocumentDsType)))
      case Some(fileResource: MDeviceFile)                       => Some(ResourceMetaData("FileIO", "DeviceIO"))
      case Some(inlineResource: MInlineDeviceResourceDefinition) => Some(ResourceMetaData("StringIO", "DeviceIO"))
      case Some(pbResource: GoogleProtoBufFile)                  => Some(ResourceMetaData("GoogleProtoBufIO", pbIO, Some(pbDsType)))
      case Some(ref: MReferenceResource)                         => Some(ResourceMetaData.fromTypeTree(ParameterTypeInferencer.getResourceType(ref)))
      case Some(invalid: NamedResourceDefinition)                => None
      case Some(invalid: ResourceDefinition)                     => None
      case None                                                  => None
      case unknown                                               => throw new Exception(s"No metadata for resource: $unknown")
    }
  }
}
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
