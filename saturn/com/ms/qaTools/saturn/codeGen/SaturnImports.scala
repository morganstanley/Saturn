package com.ms.qaTools.saturn.codeGen

import scala.util.Try

import com.ms.qaTools.saturn.kronus.Backport

object SaturnImports {
  def msSaturnImports = try {
    val c = Class.forName("com.ms.qaTools.saturn.codeGen.MsSaturnImports")
    c.getMethod("imports").invoke(c.getConstructor().newInstance()).asInstanceOf[String]
  } catch {
    case _: ClassNotFoundException => ""
  }

  def apply() = Try {
    s"""
import akka.actor.ActorSystem

import java.util.concurrent.Executors

import org.apache.commons.io.FilenameUtils
import org.junit.runner.RunWith
import org.kohsuke.args4j.{Option => Args4jOption}
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
import org.w3c.dom.{Document => W3cDocument}

import scala.collection.JavaConversions._
import scala.concurrent.Await
import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import scala.concurrent.duration._
import scala.concurrent.Promise
import scala.util.Failure
import scala.util.Success
import scala.util.Try

import scalaz.Reader

import com.google.protobuf.GeneratedMessage
import com.google.protobuf.Parser

import com.ms.qaTools.compare.writer.ExcelDiffSetWriter
import com.ms.qaTools.Logger
import com.ms.qaTools._
    
import com.ms.qaTools.toolkit.NotRun
import com.ms.qaTools.toolkit.Failed
import com.ms.qaTools.toolkit.Passed
import com.ms.qaTools.toolkit.Status
import com.ms.qaTools.compare.AbstractDiff
import com.ms.qaTools.compare.CodedExplainer
import com.ms.qaTools.compare.CompareColDef
import com.ms.qaTools.compare.CompareColDefs
import com.ms.qaTools.compare.Comparator
import com.ms.qaTools.compare.DelimitedDifferent
import com.ms.qaTools.compare.NameNumericThresholdExplainer
import com.ms.qaTools.compare.writer._

import com.ms.qaTools.complexValues._

import com.ms.qaTools.exceptions.AggregateException
import com.ms.qaTools.interpreter.Command
import com.ms.qaTools.interpreter.CommandExecutor
import com.ms.qaTools.interpreter.CommandExecutorResult
import com.ms.qaTools.interpreter.GroovyInterpreter
import com.ms.qaTools.interpreter.GroovyInterpreterResult
import com.ms.qaTools.interpreter.NullInterpreterResult
import com.ms.qaTools.interpreter.NullInterpreterResultValidator
import com.ms.qaTools.interpreter.ScalaInterpreter
import com.ms.qaTools.interpreter.ScalaInterpreterResult    
import com.ms.qaTools.interpreter.ShellInterpreter
import com.ms.qaTools.interpreter.ShellInterpreterResult
import com.ms.qaTools.interpreter.SqlInterpreter
import com.ms.qaTools.interpreter.SqlInterpreterResult
import com.ms.qaTools.interpreter.{ShellPassValidator, ShellFailValidator}

import com.ms.qaTools.io.DelimitedRow
import com.ms.qaTools.io.Writer

import com.ms.qaTools.TerminationCondition

import com.ms.qaTools.io.definition.ByteArrayIO
import com.ms.qaTools.io.definition.CsvIO
import com.ms.qaTools.io.definition.CustomIO
import com.ms.qaTools.io.definition.DataIO
import com.ms.qaTools.io.definition.ExcelWsIO
import com.ms.qaTools.io.definition.ExtractorIO
import com.ms.qaTools.io.definition.FIXIO
import com.ms.qaTools.io.definition.FixedWidthIO
import com.ms.qaTools.io.definition.GeneratorIO
import com.ms.qaTools.io.definition.GoogleProtoBufIO
import com.ms.qaTools.io.definition.JsonIO
import com.ms.qaTools.io.definition.LineIO
import com.ms.qaTools.io.definition.PropertiesIO
import com.ms.qaTools.io.definition.QueryIO
import com.ms.qaTools.io.definition.SlurpIO
import com.ms.qaTools.io.definition.TableIO
import com.ms.qaTools.io.definition.XmlIO

import com.ms.qaTools.io.Input
import com.ms.qaTools.io.Output
import com.ms.qaTools.io.BaseFileIO
import com.ms.qaTools.io.DeviceIO
import com.ms.qaTools.io.DirIO
import com.ms.qaTools.io.ExcelIO
import com.ms.qaTools.io.FileIO
import com.ms.qaTools.io.NetworkIO
import com.ms.qaTools.io.NullIO
import com.ms.qaTools.io.StandardIO
import com.ms.qaTools.io.StringIO

    
import com.ms.qaTools.io.rowSource._    

import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.io.rowSource.Convert
import com.ms.qaTools.io.rowSource.ExternalSort._
import com.ms.qaTools.io.rowSource.ColumnType
import com.ms.qaTools.io.rowSource.NumericColumnType
import com.ms.qaTools.io.rowSource.StringColumnType

import com.ms.qaTools.io.rowSource.file.XPathRowSource


import com.ms.qaTools.io.rowSource.jdbc._

import com.ms.qaTools.io.rowSource.DatabaseConnection
import com.ms.qaTools.io.rowSource.jdbc.ClearSupport
import com.ms.qaTools.io.rowSource.jdbc.ExecuteSupport
import com.ms.qaTools.io.rowSource.jdbc.FetchSupport
import com.ms.qaTools.io.rowSource.jdbc.ProcedureCallSupport

import com.ms.qaTools.io.rowWriter.jdbc.JdbcRowWriter

import com.ms.qaTools.io.rowSource.json.JSONPathRowSource

import com.ms.qaTools.io.rowSource.mongodb.MongoDBConnection
import com.ms.qaTools.io.rowSource.mongodb.MongoDBKerberizedConnection

import com.ms.qaTools.io.rowSource.rest.RestRowSource
import com.ms.qaTools.io.rowSource.rest.RestRowSource._

import javax.jms.{BytesMessage, MapMessage, ObjectMessage, TextMessage}

import com.ms.qaTools.io.rowSource.Utils._

import com.ms.qaTools.io.TCPHandshake
import com.ms.qaTools.io.ANONYMOUS
import com.ms.qaTools.io.KERBEROS
import com.ms.qaTools.io.NONE
import com.ms.qaTools.io.transports._

import com.ms.qaTools.toolkit.Pass
import com.ms.qaTools.toolkit.Result
import com.ms.qaTools.toolkit.mail.Mail
import com.ms.qaTools.toolkit.mail.MailResult
import com.ms.qaTools.toolkit.runCmds.RunCmds
import com.ms.qaTools.toolkit.runCmds.RunCmdsResult
import com.ms.qaTools.toolkit.sql.SQLFetch
import com.ms.qaTools.toolkit.sql.SQLFetchResult
import com.ms.qaTools.toolkit.sql.SQLFetchQueryResult
import com.ms.qaTools.toolkit.sql.SQLCall
import com.ms.qaTools.toolkit.sql.SQLCallResult
import com.ms.qaTools.toolkit.sql.SQLCallActionResult
import com.ms.qaTools.toolkit.sql.SQLLoad
import com.ms.qaTools.toolkit.sql.SQLLoadResult
import com.ms.qaTools.toolkit.sql.SQLLoadActionResult
import com.ms.qaTools.toolkit.sql.SQLClear
import com.ms.qaTools.toolkit.sql.SQLClearResult
import com.ms.qaTools.toolkit.sql.SQLClearActionResult
import com.ms.qaTools.toolkit.sql.SQLExecute
import com.ms.qaTools.toolkit.sql.SQLExecuteResult
import com.ms.qaTools.toolkit.sql.SQLExecuteActionResult
import com.ms.qaTools.toolkit.write.Write
import com.ms.qaTools.toolkit.write.WriteResult
import com.ms.qaTools.toolkit.xmlGen.XmlGen
import com.ms.qaTools.toolkit.xmlGen.XmlGenResult

import com.ms.qaTools.tree.mappers.XmlNodeAddMapper
import com.ms.qaTools.tree.mappers.XmlNodeDeleteMapper
import com.ms.qaTools.tree.mappers.XmlNodeReplaceMapper
import com.ms.qaTools.tree.mappers.XmlNodeSelectMapper
import com.ms.qaTools.tree.mappers.XmlNodeSplitMapper
import com.ms.qaTools.tree.mappers.XmlNodeTransformer
import com.ms.qaTools.tree.mappers.XmlNodeXPathFilter

import com.ms.qaTools.saturn.dsl.ScenarioReportListener
import com.ms.qaTools.saturn.dsl.annotation.ScenarioAnnotation

import com.ms.qaTools.saturn.metaData.ReportIteratorMetaData
import com.ms.qaTools.saturn.metaData.ReportIterationMetaData    

import com.ms.qaTools.saturn.result.ProcedureCallResult

import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import com.ms.qaTools.saturn.runtime.Shell
import com.ms.qaTools.saturn.runtime.Groovy
import com.ms.qaTools.saturn.runtime.{VerbosityLevel, QUIET, NORMAL, DEBUG, DEBUG_ON_PASS, DEBUG_ON_FAIL}
import com.ms.qaTools.saturn.runtime.EnvVar
import com.ms.qaTools.saturn.runtime.Fallible
import com.ms.qaTools.saturn.runtime.File
import com.ms.qaTools.saturn.runtime.ImplicitOptimization._
import com.ms.qaTools.saturn.runtime.RuntimeUtils
import com.ms.qaTools.saturn.runtime.RuntimeUtils._
import com.ms.qaTools.saturn.runtime.TerminalResult

import com.ms.qaTools.saturn.runtime.runner.CellValueTry
import com.ms.qaTools.saturn.runtime.runner.CodeValueTry
import com.ms.qaTools.saturn.runtime.runner.CodeScalaValueTry
import com.ms.qaTools.saturn.runtime.runner.ComplexValueMap
import com.ms.qaTools.saturn.runtime.runner.EnvVarTry
import com.ms.qaTools.saturn.runtime.runner.FileValueTry
import com.ms.qaTools.saturn.runtime.runner.JSONValueTry
import com.ms.qaTools.saturn.runtime.runner.PropertyValueTry
import com.ms.qaTools.saturn.runtime.runner.XPathValueTry

import com.ms.qaTools.saturn.runtime.runner.{BinaryFileResource => RuntimeBinaryFileResource}
import com.ms.qaTools.saturn.runtime.runner.{CsvFileResource => RuntimeCsvFileResource}
import com.ms.qaTools.saturn.runtime.runner.{CustomFileResource => RuntimeCustomFileResource}
import com.ms.qaTools.saturn.runtime.runner.{DataFileResource => RuntimeDataFileResource}
import com.ms.qaTools.saturn.runtime.runner.{DeviceFileResource => RuntimeDeviceFileResource}
import com.ms.qaTools.saturn.runtime.runner.{DirectoryResource => RuntimeDirectoryResource}
import com.ms.qaTools.saturn.runtime.runner.{ExcelWorkBookResource => RuntimeExcelWorkBookResource}
import com.ms.qaTools.saturn.runtime.runner.{ExcelWorkSheetResource => RuntimeExcelWorkSheetResource}
import com.ms.qaTools.saturn.runtime.runner.{ExtractorResource => RuntimeExtractorResource}
import com.ms.qaTools.saturn.runtime.runner.{FixedWidthFileResource => RuntimeFixedWidthFileResource}
import com.ms.qaTools.saturn.runtime.runner.{FIXFileResource => RuntimeFIXFileResource}
import com.ms.qaTools.saturn.runtime.runner.{GeneratorResource => RuntimeGeneratorResource}
import com.ms.qaTools.saturn.runtime.runner.{GoogleProtoBufFile => RuntimeGoogleProtoBufFile}
import com.ms.qaTools.saturn.runtime.runner.{InlineDeviceResource => RuntimeInlineDeviceResource}
import com.ms.qaTools.saturn.runtime.runner.{JsonFileResource => RuntimeJsonFileResource}
import com.ms.qaTools.saturn.runtime.runner.{LdapResource => RuntimeLdapResource}
import com.ms.qaTools.saturn.runtime.runner.{LdapQueryResource => RuntimeLdapQueryResource}
import com.ms.qaTools.saturn.runtime.runner.{LineFileResource => RuntimeLineFileResource}
import com.ms.qaTools.saturn.runtime.runner.{MongoDBResource => RuntimeMongoDBResource}
import com.ms.qaTools.saturn.runtime.runner.{PropertiesFileResource => RuntimePropertiesFileResource}
import com.ms.qaTools.saturn.runtime.runner.{QueryResource => RuntimeQueryResource}
import com.ms.qaTools.saturn.runtime.runner.{SlurpFileResource => RuntimeSlurpFileResource}
import com.ms.qaTools.saturn.runtime.runner.{SQLiteResource => RuntimeSQLiteResource}
import com.ms.qaTools.saturn.runtime.runner.{StandardIOResource => RuntimeStandardIOResource}
import com.ms.qaTools.saturn.runtime.runner.{TableResource => RuntimeTableResource}
import com.ms.qaTools.saturn.runtime.runner.{XMLFileResource => RuntimeXMLFileResource}

import com.ms.qaTools.saturn.runtime.runner.module.RunCmdsRunner
import com.ms.qaTools.saturn.runtime.runner.module.SQLCallRunner
import com.ms.qaTools.saturn.runtime.runner.module.SQLClearRunner
import com.ms.qaTools.saturn.runtime.runner.module.SQLExecuteRunner
import com.ms.qaTools.saturn.runtime.runner.module.SQLFetchRunner
import com.ms.qaTools.saturn.runtime.runner.module.SQLLoadRunner
import com.ms.qaTools.saturn.runtime.runner.module.XmlGenRunner

import com.ms.qaTools.saturn.cmdLine.SaturnCmdLine
import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.TryUtil

import com.ms.qaTools.saturn.codeGen.Utils._
import com.ms.qaTools.saturn.codeGen.notifier.Notifier
import com.ms.qaTools.saturn.codeGen.notifier.console._
import com.ms.qaTools.saturn.codeGen.notifier.report.ScenarioReportNotifier
import com.ms.qaTools.saturn.codeGen.notifier.report.ScenarioReportListenerNotifier
import com.ms.qaTools.saturn.codeGen.notifier.report.generators._
import com.ms.qaTools.saturn.codeGen.KronusResult
import com.ms.qaTools.saturn.codeGen.RunGroupResult
import com.ms.qaTools.saturn.codeGen.IteratorResult
import com.ms.qaTools.saturn.codeGen.IterationResult
import com.ms.qaTools.saturn.codeGen.Context
import com.ms.qaTools.saturn.codeGen.IterationContext
import com.ms.qaTools.saturn.codeGen.IteratorContext

import com.ms.qaTools.saturn.metaData.{RepetitionHandler, ForRepetitionHandler, ForEachRepetitionHandler, ForEachXPathRepetitionHandler}

import com.ms.qaTools.saturn.dsl.annotation._
    
import com.ms.qaTools.xml.NamespaceContextImpl

import javax.xml.xpath.XPathConstants
    
import quickfix.{Message => FixMessage}

${msSaturnImports}

${Backport().imports.map(imp => "import " + imp.getModule).mkString("\n")}
"""
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
