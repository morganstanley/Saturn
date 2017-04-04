package com.ms.qaTools.saturn.runtime.runner
import com.ms.qaTools.AnyUtil
import com.ms.qaTools.io.definition.ByteArrayIO
import com.ms.qaTools.io.definition.CsvIO
import com.ms.qaTools.io.definition.CustomIO
import com.ms.qaTools.io.definition.DataIO
import com.ms.qaTools.io.definition.ExcelWsIO
import com.ms.qaTools.io.definition.ExtractorIO
import com.ms.qaTools.io.definition.FixedWidthIO
import com.ms.qaTools.io.definition.FIXIO
import com.ms.qaTools.io.definition.GeneratorIO
import com.ms.qaTools.io.definition.GoogleProtoBufIO
import com.ms.qaTools.io.definition.JsonIO
import com.ms.qaTools.io.definition.LdapQueryIO
import com.ms.qaTools.io.definition.LineIO
import com.ms.qaTools.io.definition.PropertiesIO
import com.ms.qaTools.io.definition.QueryIO
import com.ms.qaTools.io.definition.SlurpIO
import com.ms.qaTools.io.definition.TableIO
import com.ms.qaTools.io.definition.XmlIO
import com.ms.qaTools.io.DeviceIO
import com.ms.qaTools.io.DirIO
import com.ms.qaTools.io.ExcelIO
import com.ms.qaTools.io.FileIO
import com.ms.qaTools.io.Input
import com.ms.qaTools.io.Output
import com.ms.qaTools.io.rowSource.AsTemplateOf
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.io.rowSource.DatabaseConnection
import com.ms.qaTools.io.rowSource.ExtractRows
import com.ms.qaTools.io.rowSource.file.FIXRowSource
import com.ms.qaTools.io.rowSource.Initializable
import com.ms.qaTools.io.rowSource.LdapQueryRowSource
import com.ms.qaTools.io.rowSource.mongodb.MongoDBConnection
import com.ms.qaTools.io.rowSource.mongodb.MongoDBKerberizedConnection
import com.ms.qaTools.io.rowSource.SQLiteConnection
import com.ms.qaTools.io.rowSource.Utils._
import com.ms.qaTools.io.rowSource.Utils.byteArrayAsString
import com.ms.qaTools.io.rowSource.Utils.ByteArrayUtil
import com.ms.qaTools.io.rowSource.Utils.StringSeqIteratorWithColumnDefinitionsUtil
import com.ms.qaTools.io.rowWriter.file.ByteArrayRowWriter
import com.ms.qaTools.io.StandardIO
import com.ms.qaTools.io.StringIO
import com.ms.qaTools.io.{ TCPHandshake, NONE }
import com.ms.qaTools.io.transports._
import com.ms.qaTools.ldap.Ldap
import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.saturn.codeGen.AbstractContext
import com.ms.qaTools.saturn.resources.mongoDbResource.{ AuthentificationEnums => MongoAuthentificationEnums }
import com.ms.qaTools.TryUtil
import java.io.File
import java.net.URI
import quickfix.DataDictionary
import scala.concurrent.ExecutionContext
import scala.util.Try
import scalaz._
import scalaz.Reader

trait AbstractDataIO[X] {
  def create: DeviceIO => X

  def apply(deviceResourceTry: Try[DeviceIO])(context: AbstractContext): Try[X] =
    for {
      deviceResource <- deviceResourceTry.rethrow(s"An exception occurred while connecting device resource.")
    } yield create(deviceResource)
}

abstract class FileDbResource[A <: DatabaseConnection with Initializable] {
  def resourceName: String
  def fromFile(file: File, persistent: Boolean): A
  def inMemory(persistent: Boolean): A

  def apply(deviceFileTry: Option[Try[FileIO]],
    ddlResourceTry: Option[Try[Input[Iterator[String]]]],
    persistent: Boolean)(context: AbstractContext): Try[A] =
    for {
      fileOption <- deviceFileTry.map { deviceTry =>
        deviceTry.flatMap(_.file.map(Option(_)))
      }.getOrElse(Try { None }).rethrow(s"An exception occurred while connecting file resource in $resourceName.")
      ddlOption <- ddlResourceTry.map { ddlResource =>
        ddlResource.flatMap(_.input.map(rs => Option(rs.toSeq)))
      }.getOrElse(Try { None }).rethrow(s"An exception occurred while connecting ddl resource in $resourceName.")
    } yield {
      val connection = fileOption.map { file =>
        fromFile(file, persistent).withSideEffect { conn =>
          if (persistent) conn.getConnection else conn.getConnection.close
        }
      }.getOrElse(inMemory(persistent))
      context.appendMetaDataContext("Persistent", connection.persistent)
      ddlOption.map { ddlSeq =>
        connection.withSideEffect(db => db.withInitDDL(ddlSeq))
      }.getOrElse(connection)
    }
}
 
object BinaryFileResource extends AbstractDataIO[ByteArrayIO] {
  def create = ByteArrayIO.apply
}

object CsvFileResource extends AbstractDataIO[CsvIO] {
  def create = CsvIO.apply
}

object CustomFileResource {
  def apply(deviceResourceTry: Try[DeviceIO],
    cellSeparatorTry: Try[String],
    rowSeparatorTry: Try[String],
    quoteCharTry: Try[String],
    escapeCharTry: Try[String],
    nullMarkerTry: Try[String])(context: AbstractContext): Try[CustomIO] =
    for {
      deviceResource <- deviceResourceTry.rethrow("An exception occurred while connecting device resource for CustomFile resource.")
      cellSeparator <- cellSeparatorTry.rethrow("An exception occurred while generating cell separator for CustomFile resource.")
      rowSeparator <- rowSeparatorTry.rethrow("An exception occurred while generating row separator for CustomFile resource.")
      quoteChar <- quoteCharTry.map { str =>
        if (str.length() == 0)
          None
        else
          Some(str.ensuring(_.length() == 1).toCharArray()(0))
      }.rethrow("An exception occurred while generating quote Character for CustomFile resource.")
      escapeChar <- escapeCharTry.map { str =>
        if (str.length() == 0)
          None
        else
          Some(str.ensuring(_.length() == 1).toCharArray()(0))
      }.rethrow("An exception occurred while generating escape Character for CustomFile resource.")
      nullMarker <- nullMarkerTry.rethrow("An exception occurred while generating null marker for CustomFile resource.")
    } yield {
      context.appendMetaDataContext("Cell Separator", cellSeparator)
      context.appendMetaDataContext("Row Separator", rowSeparator)
      CustomIO(deviceResource, cellSeparator, rowSeparator, quoteChar, escapeChar, nullMarker)
    }
}

object DataFileResource extends AbstractDataIO[DataIO] {
  def create = DataIO.apply
}

object DirectoryResource {
  def apply(dirnameTry: Try[String],
    filter: String)(context: AbstractContext): Try[DirIO] =
    for {
      dirname <- dirnameTry.rethrow("An exception occurred while generating directory name for Directory resource.")
    } yield {
      context.appendMetaDataContext("Directory", dirname)
      DirIO(dirname, filter)
    }
}

object ExcelWorkBookResource {
  def apply(filenameTry: Try[String],
    isXlsx: Boolean)(context: AbstractContext): Try[ExcelIO] =
    for {
      filename <- filenameTry.rethrow("An exception occurred while generating filename for ExcelWorkBook resource.")
    } yield {
      context.appendMetaDataContext("FileName", filename)
      ExcelIO(filename, isXlsx)
    }
}

object ExcelWorkSheetResource {
  def apply(excelWBResourceTry: Try[ExcelIO],
    wsNameTry: Try[String])(context: AbstractContext): Try[ExcelWsIO] =
    for {
      excelWB <- excelWBResourceTry.rethrow("An exception occurred while connecting ExcelWorkBook resource for ExcelWorkSheet resource.")
      wsName <- wsNameTry.rethrow("An exception occurred while generating worksheet name for ExcelWorkSheet resource.")
    } yield {
      context.appendMetaDataContext("Worksheet", wsName)
      ExcelWsIO(excelWB, wsName)
    }
}

object ExtractorResource {
  def apply[INPUT](inputResourceTry: Try[Input[Iterator[INPUT]]],
    configResourceTry: Try[Input[Iterator[Seq[String]] with ColumnDefinitions]])(context: AbstractContext)(implicit conversion: Iterator[INPUT] => ExtractRows): Try[ExtractorIO[ExtractRows, Iterator[Seq[String]] with ColumnDefinitions]] =
    for {
      inputIO <- inputResourceTry.rethrow("An exception occurred while connecting input IO resource for Extractor resource.")
      input <- inputIO.input.rethrow("An exception occurred while connecting input resource for Extractor resource.")
      configIO <- configResourceTry.rethrow("An exception occurred while connecting config IO resource for Extractor resource.")
      mappings <- configIO.input.rethrow("An exception occurred while connecting config resource for Extractor resource.")
    } yield ExtractorIO(input, mappings)
}

object FixedWidthFileResource {
  def apply[A: ToW3cDocument](deviceResourceTry: Try[DeviceIO],
    configResourceTry: Try[Input[Iterator[A]]])(context: AbstractContext): Try[FixedWidthIO] =
    for {
      deviceResource <- deviceResourceTry.rethrow("An exception occurred while connecting device resource for FixedWidthFile resource.")
      configIO <- configResourceTry.rethrow("An exception occurred while connecting config IO resource for FixedWidthFile resource.")
      configIterator <- configIO.input.rethrow("An exception occurred while connecting config resource for FixedWidthFile resource.")
      config <- Try { implicitly[ToW3cDocument[A]].convert(configIterator.next) }.rethrow("FixedWidth config file must be well formed xml.")
    } yield FixedWidthIO(deviceResource, config)
}

object GeneratorResource {
  def apply[TEMPLATE](templateResourceTry: Try[Input[Iterator[TEMPLATE]]],
    inputResourceTry: Try[Input[Iterator[Seq[String]] with ColumnDefinitions]])(context: AbstractContext)(implicit conversion: Iterator[TEMPLATE] => AsTemplateOf[Iterator[TEMPLATE]]): Try[GeneratorIO[TEMPLATE]] =
    for {
      templateIO <- templateResourceTry.rethrow("An exception occurred while connecting template IO resource for Generator resource.")
      template <- templateIO.input.rethrow("An exception occurred while connecting template resource for Generator resource.")
      inputIO <- inputResourceTry.rethrow("An exception occurred while connecting input IO resource for Generator resource.")
      input <- inputIO.input.rethrow("An exception occurred while connecting input resource for Generator resource.")
    } yield GeneratorIO[TEMPLATE](template, input)
}

object GoogleProtoBufFile {
  def apply(deviceResourceTry: Try[DeviceIO],
    classNameTry: Try[String],
    jarLocationTry: Try[String],
    readDelimited: Boolean,
    readEncoded: Boolean)(context: AbstractContext): Try[GoogleProtoBufIO] =
    for {
      deviceResource <- deviceResourceTry.rethrow("An exception occurred while connecting device resource for GoogleProtoBufFile resource.")
      className <- classNameTry.rethrow("An exception occurred while generating classname for GoogleProtoBufFile resource.")
      jarLocation <- jarLocationTry.rethrow("An exception occurred while generating jar location for GoogleProtoBufFile resource.")
    } yield GoogleProtoBufIO(deviceResource, className, jarLocation, readDelimited, readEncoded)
}

object JsonFileResource extends AbstractDataIO[JsonIO] {
  def create = JsonIO.apply
}

object LdapResource {
  def apply(hostM: Try[String], domainM: Try[String], passwordM: Try[String])(context: AbstractContext): Try[Ldap] =
    for {
      host <- hostM.rethrow("An exception occurred while generating host name for LDAP resource.")
      domain <- domainM.rethrow("An exception occurred while generating domain for LDAP resource.")
      password <- passwordM.rethrow("An exception occurred while generating password for LDAP resource.")
    } yield {
      context.appendMetaDataContext("Host", host)
      context.appendMetaDataContext("Domain", domain)
      Ldap("simple", host, domain, password)
    }
}

object LdapQueryResource {
  def filterStr(filter: (String, String)) = {
    val (k, v) = filter
    s"($k=$v)"
  }

  def apply(ldapM: Try[Ldap], typeM: Try[String], filterMs: Seq[(String, Try[String])], selectedFieldMs: Seq[Try[String]])(context: AbstractContext) = for {
    ldap <- ldapM.rethrow("An exception occurred while generating LDAP for LDAP query resource.")
    typ <- typeM.rethrow("An exception occurred while generating type for LDAP query resource.")
    (filterKs, filterVMs) = filterMs.unzip
    filterVs <- filterVMs.toTrySeq.rethrow("An exception occurred while generating filters for LDAP query resource.")
    filters = filterKs.zip(filterVs)
    selectedFields <- selectedFieldMs.toTrySeq.rethrow("An exception occurred while generating selected fields for LDAP query resource.")
  } yield {
    context.appendMetaDataContext("LDAP", ldap)
    context.appendMetaDataContext("Type", typ)
    context.appendMetaDataContext("filters", filters)
    context.appendMetaDataContext("selectedFields", selectedFields)
    val controls =
      LdapQueryRowSource.defaultSearchControls.withSideEffect(_.setReturningAttributes(selectedFields.toArray))
    LdapQueryIO(ldap, LdapQueryRowSource.Config(typ, filters.map(filterStr).mkString("(&", "", ")"), controls = controls))
  }
}

object LineFileResource extends AbstractDataIO[LineIO] {
  def create = LineIO.apply
}

object MongoDBResource {
  def apply(hostTry: Try[String],
    portTry: Try[String],
    databaseTry: Try[String],
    loginTry: Try[String],
    passwordTry: Try[String],
    dbType: MongoAuthentificationEnums)(context: AbstractContext): Try[MongoDBConnection] =
    for {
      host <- hostTry.rethrow("An exception occurred while generating host name for MongoDB resource.")
      port <- portTry.rethrow("An exception occurred while generating port for MongoDB resource.")
      database <- databaseTry.rethrow("An exception occurred while generating database name for MongoDB resource.")
      login <- loginTry.rethrow("An exception occurred while generating login for MongoDB resource.")
      password <- passwordTry.rethrow("An exception occurred while generating password for MongoDB resource.")
    } yield {
      context.appendMetaDataContext("Host", host)
      context.appendMetaDataContext("Port", port)
      context.appendMetaDataContext("Database", database)
      dbType match {
        case MongoAuthentificationEnums.PASSWORD => MongoDBConnection(host, port.toInt, database, login, password)
        case MongoAuthentificationEnums.KERBEROS => MongoDBKerberizedConnection(host, port.toInt, database)
        case MongoAuthentificationEnums.ANONYMOUS => MongoDBConnection(host, port.toInt, database)
        case _ => throw new Exception(s"Database type '$dbType' is not a valid MongoDB type.")
      }
    }
}

object PropertiesFileResource extends AbstractDataIO[PropertiesIO] {
  def create = PropertiesIO.apply
}

object QueryResource {
  def apply(databaseTry: Try[DatabaseConnection],
    sqlExprTry: Try[String])(context: AbstractContext): Try[QueryIO] =
    {
      for {
        database <- databaseTry.rethrow("An exception occurred while connecting database resource for Query resource.")
        sqlExpr <- sqlExprTry.rethrow("An exception occurred while generating sql expr name for Query resource.")
      } yield {
        context.appendMetaDataContext("Query", sqlExpr)
        QueryIO(database, sqlExpr)
      }
    }.rethrow("An exception occurred while generating query.")
}

object SlurpFileResource extends AbstractDataIO[SlurpIO] {
  def create = SlurpIO.apply
}

object SQLiteResource extends FileDbResource[SQLiteConnection] {
  val resourceName = "SQLite resource"
  def fromFile(file: File, persistent: Boolean) = SQLiteConnection(file, persistent)
  def inMemory(persistent: Boolean) = SQLiteConnection()
}

object StandardIOResource {
  def apply(stdErr: Boolean)(context: AbstractContext): Try[StandardIO] =
    Try {
      context.appendMetaDataContext("UseStdError", stdErr)
      StandardIO(stdErr)
    }
}

object TableResource {
  def apply(databaseTry: Try[DatabaseConnection],
    tableTry: Try[String])(context: AbstractContext): Try[TableIO] =
    for {
      database <- databaseTry.rethrow("An exception occurred while connecting database resource for Table resource.")
      table <- tableTry.rethrow("An exception occurred while generating table name for Table resource.")
    } yield {
      context.appendMetaDataContext("Table", table)
      TableIO(database, table)
    }
}

object XMLFileResource extends AbstractDataIO[XmlIO] {
  def create = XmlIO.apply(_)
}

object FIXFileResource {
  def apply(deviceTry: Try[DeviceIO], dataDictionaryDeviceTryOption: Option[Try[DeviceIO]], doValidation: Boolean, separatorTryOption: Option[Try[String]])(context: AbstractContext) = {
    for {
      device <- deviceTry.rethrow("An exception occurred while connecting device resource to FIX resource.")
      dataDictionary <- dataDictionaryDeviceTryOption.map{
        _.flatMap(_.inputStream.map(i => new DataDictionary(i)))
      }.getOrElse(
        Try { Class.forName("quickfix.iedt.core.MSDataDictionary").getMethod("instance").invoke(null).asInstanceOf[DataDictionary] }
      ).rethrow("An exception occurred while connecting file resource in FIX resource.")
      separator <- separatorTryOption.map(separatorTry =>
        separatorTry.map(s => s.charAt(0))).getOrElse(Try { '\u0001' })
    } yield {
      /*
       * This should really return a FIXIO, but the output doesn't need to reparse the FIX message object again
       * Also, passing the dictionary to the output is not easy with the saturn implementation of SOAPIO (we need mapper resource instead)
       */
      new Input[FIXRowSource] with Output[ByteArrayRowWriter] {
        override def input = device.reader.map(reader => FIXRowSource(reader, dataDictionary, doValidation, Option(separator)))
        override def output = Try {
          new ByteArrayRowWriter(device.outputStream.get) {
            override def write(source: Iterator[Array[Byte]]) = {
              super.write(source.map(ab => (ab.replaceAll("\u0001", separator.toString) + sys.props("line.separator")).getBytes))
            }
          }
        }
      }
    }
  }
}

object DeviceFileResource {
  def apply(filenameTry: Try[String],
    append: Boolean)(context: AbstractContext): Try[FileIO] =
    for {
      filename <- filenameTry.rethrow("An exception occurred while generating filename for DeviceFile resource.")
    } yield {
      context.appendMetaDataContext("FileName", filename)
      FileIO(filename, append)
    }
}

object InlineDeviceResource {
  def apply(contentsTry: Try[String])(context: AbstractContext): Try[StringIO] =
    for {
      contents <- contentsTry.rethrow("An exception occurred while generating contents for InlineDevice resource.")
    } yield {
      context.appendMetaDataContext("Contents", contents)
      StringIO(contents)
    }
}
