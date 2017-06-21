package com.ms.qaTools.toolkit.dsCompare

import java.io.StringReader

import scala.util.Try

import org.kohsuke.args4j.{Option => Args4JOption}

import com.ms.qaTools.compare.writer._
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.io.rowSource.DsRowSourceCreator
import com.ms.qaTools.io.rowSource.delimited.DelimitedParser
import com.ms.qaTools.io.rowSource.file.DelimitedIterator
import com.ms.qaTools.toolkit.SparkApp
import com.ms.qaTools.toolkit.cmdLine.BasicCmdLine
import com.ms.qaTools.toolkit.cmdLine.Locale
import com.ms.qaTools.toolkit.cmdLine.QuotedStringArrayOptionHandler

class DsCompareCmdLine
extends BasicCmdLine with Locale with SparkApp.CmdLine with Serializable {
  @Args4JOption(name = "--leftFileName", aliases = Array("--expectedFileName"), usage = "Left filename", required = true)
  val leftFileName: String = null

  @Args4JOption(name = "--rightFileName", aliases = Array("--actualFileName"), usage = "Right filename", required = true)
  val rightFileName: String = null

  @Args4JOption(name = "--outFileName", usage = "Output file name", required = true)
  val outFileName: String = null

  @Args4JOption(name = "--outFmt", usage = "Output format. Default: XLSX - Other options: SQLITE, SYBASE, UDB, DB2, DIR")
  val outFmt: String = "XLSX"

  @Args4JOption(name = "--ignoreCols", usage = "Ignored column name", handler = classOf[QuotedStringArrayOptionHandler])
  val ignoreCols: java.util.List[String] = new java.util.ArrayList[String]()

  @Args4JOption(name = "--keyCols", usage = "Key column name followed by its key order e.g. C0=>2 (key order = 1 by default)", handler = classOf[QuotedStringArrayOptionHandler])
  val keyCols: java.util.List[String] = new java.util.ArrayList[String]()

  @Args4JOption(name = "--noSortLeft", usage = "Disable sorting on left data set")
  val noSortLeft: Boolean = false

  @Args4JOption(name = "--noSortRight", usage = "Disable sorting on right data set")
  val noSortRight: Boolean = false

  @Args4JOption(name = "--ignoreMissingCols", usage = "Ignore missing columns that are in left data set but not in right data set")
  val ignoreMissingCols: Boolean = false

  @Args4JOption(name = "--noIgnoreExtraCols", usage = "Flag any extra columns in the right data set but not in left data set")
  val noIgnoreExtraCols: Boolean = false

  @Args4JOption(name = "--leftFmt", usage = "Left data set format: {CSV (default)|TSV|PSV|DATA|EXCEL}")
  val leftFmt: String = "CSV"

  @Args4JOption(name = "--rightFmt", usage = "Right data set format: {CSV (default)|TSV|PSV|DATA|EXCEL}")
  val rightFmt: String = "CSV"

  @Args4JOption(name = "--leftHeaderless", usage = "Left dataset is headerless")
  val leftHeaderless: Boolean = false

  @Args4JOption(name = "--rightHeaderless", usage = "Right dataset is headerless")
  val rightHeaderless: Boolean = false

  @Args4JOption(name = "--leftMultiPartColNameSep", usage = "Left dataset multi-colname separator")
  val leftMultiColNameSeparator: String = "."

  @Args4JOption(name = "--rightMultiPartColNameSep", usage = "Right dataset multi-colname separator")
  val rightMultiColNameSeparator: String = "."

  @Args4JOption(name = "--leftWsName", usage = "Excel left data set sheet")
  val leftWsName: String = "Sheet1"

  @Args4JOption(name = "--rightWsName", usage = "Excel right data set sheet")
  val rightWsName: String = "Sheet1"

  @Args4JOption(name = "--leftColNameRows", usage = "Left file row number up to where to build the header. If leftColNameRows=3 then the colum name for the column at index 0 will be C0R0_value.C0R1_value.C0R2_value.")
  val leftColNameRows: Int = 1

  @Args4JOption(name = "--rightColNameRows", usage = "Right file row number up to where to build the header If rightColNameRows=3 then the colum name for the column at index 0 will be C0R0_value.C0R1_value.C0R2_value.")
  val rightColNameRows: Int = 1

  @Args4JOption(name = "--leftColNames", usage = "Define column names for left data set. First row read after the ignored ones will be considered as data.")
  val leftColNames: String = null

  @Args4JOption(name = "--rightColNames", usage = "Define column names for right data set. First row read after the ignored ones will be considered as data.")
  val rightColNames: String = null

  @Args4JOption(name = "--ignoreLeftRows", usage = "Skip lines in left file after the header row")
  val ignoreLeftRows: Int = 0

  @Args4JOption(name = "--ignoreRightRows", usage = "Skip lines in right file after the header row")
  val ignoreRightRows: Int = 0

  @Args4JOption(name = "--colMaps", usage = "Column names mappings from left data set to right data set. Example: C0=>C00", handler = classOf[QuotedStringArrayOptionHandler])
  val colMaps: java.util.List[String] = new java.util.ArrayList[String]()

  @Args4JOption(name = "--noSummary", usage = "Disable summary output")
  val noSummary: Boolean = false

  @Args4JOption(name = "--colTypes", usage = "Specify column type for specified column name. Default to STR. Example: C0:NUM.")
  val colTypes: java.util.List[String] = new java.util.ArrayList[String]()

  @Args4JOption(name = "--explainerFileName", aliases = Array("--explainer", "--explainerFile"), usage = "Scala file explainer")
  val explainer: String = null

  @Args4JOption(name = "--matcher", usage = "'Smart' matcher for rows with identical keys, specify 'minimizeDifferentColumns' to minimize on number of different columns")
  val matcher: String = null

  // Excel result worksheet name override
  @Args4JOption(name = "--summaryPage", usage = "Excel result summary page overrided name")
  val summaryPage: String = "summary"

  @Args4JOption(name = "--differencePage", usage = "Excel result difference page overrided name")
  val differencePage: String = "differences"

  @Args4JOption(name = "--explainedPage", usage = "Excel result explained page overrided name")
  val explainedPage: String = "explained"

  @Args4JOption(name = "--inLeftOnlyPage", usage = "Excel result in left only page overrided name")
  val inLeftOnlyPage: String = "inLeftOnly"

  @Args4JOption(name = "--inRightOnlyPage", usage = "Excel result in right only page overrided name")
  val inRightOnlyPage: String = "inRightOnly"

  @Args4JOption(name = "--leftPage", usage = "Excel result left page overrided name")
  val leftPage: String = "left"

  @Args4JOption(name = "--rightPage", usage = "Excel result right page overrided name")
  val rightPage: String = "right"

  @Args4JOption(name = "--identicalPage", usage = "Excel result identical page overrided name")
  val identicalPage: String = "identical"

  @Args4JOption(name = "--omitSummaryPage", usage = "Omit summary page")
  val omitSummaryPage: Boolean = false

  @Args4JOption(name = "--omitDifferencePage", usage = "Omit difference page")
  val omitDifferencePage: Boolean = false

  @Args4JOption(name = "--omitExplainedPage", usage = "Omit explained page")
  val omitExplainedPage: Boolean = false

  @Args4JOption(name = "--omitInLeftOnlyPage", usage = "Omit in left only page")
  val omitInLeftOnlyPage: Boolean = false

  @Args4JOption(name = "--omitInRightOnlyPage", usage = "Omit in right only page")
  val omitInRightOnlyPage: Boolean = false

  @Args4JOption(name = "--omitLeftPage", usage = "Omit left page")
  val omitLeftPage: Boolean = false

  @Args4JOption(name = "--omitRightPage", usage = "Omit right page")
  val omitRightPage: Boolean = false

  @Args4JOption(name = "--omitIdenticalPage", usage = "Omit identical page")
  val omitIdenticalPage: Boolean = false

  @Args4JOption(name = "--noExtraSheets", usage = "Don't create extra sheets if limit is reached")
  val noExtraSheets: Boolean = false

  /*
  @Args4JOption(name = "--multiplePages", usage = "Create multiple page if number of records for the page exceeds 65k")
  val multiplePages: Boolean = false
  */

  // New parameters to manage the output to a database definition
  @Args4JOption(name = "--tablePrefix", usage = "Table prefix to be used in the table creation")
  val tablePrefix: String = ""
  // - SQLite parameter
  @Args4JOption(name = "--sqLiteUnlink", usage = "Manage the creation of the output database file")
  val sqLiteUnlink: Boolean = false
  // - Sybase parameters
  @Args4JOption(name = "--dbAuthentication", usage = "Needs authentication for the data base connection")
  val dbAuthentication: Boolean = false
  @Args4JOption(name = "--dbServer", usage = "Database server")
  val dbServer: String = ""
  @Args4JOption(name = "--dbQualifier", usage = "Database server")
  val dbQualifier: String = ""
  @Args4JOption(name = "--dbUserName", usage = "Database user name")
  val dbUserName: String = null
  @Args4JOption(name = "--dbPassword", usage = "Database password")
  val dbPassword: String = null


  @Args4JOption(name = "--leftSeparatorChar", usage = "For CUSTOM left file: separator character")
  val leftSeparatorChar: Char = DelimitedParser.DEFAULT_SEPARATOR

  @Args4JOption(name = "--rightSeparatorChar", usage = "For CUSTOM right file: separator character")
  val rightSeparatorChar: Char = DelimitedParser.DEFAULT_SEPARATOR

  @Args4JOption(name = "--leftQuoteChar", usage = "For CUSTOM left file: quote character")
  val leftQuoteChar: Char = DelimitedParser.DEFAULT_QUOTE_CHARACTER

  @Args4JOption(name = "--rightQuoteChar", usage = "For CUSTOM right file: quote character")
  val rightQuoteChar: Char = DelimitedParser.DEFAULT_QUOTE_CHARACTER

  @Args4JOption(name = "--leftEscapeChar", usage = "For CUSTOM left file: escape character")
  val leftEscapeChar: Char = DelimitedParser.DEFAULT_ESCAPE_CHARACTER

  @Args4JOption(name = "--rightEscapeChar", usage = "For CUSTOM right file: escape character")
  val rightEscapeChar: Char = DelimitedParser.DEFAULT_QUOTE_CHARACTER

  @Args4JOption(name = "--rotateSize", usage = "when --outFmt=DIR, specify the number of diffs written to each file")
  val rotateSize: Int = -1

  @Args4JOption(name = "--outFileNamePrefix", usage = "when --outFmt=DIR, specify the prefix of output diff files")
  val outFileNamePrefix: String = null

  @Args4JOption(name = "--separateDiffs", usage = "Separate diffs with empty row in Difference Page")
  val separateDiffs: Boolean = false

  def inColDefsFromColNames(colNames: String, sep: Char, quote: Char, escape: Char): Seq[ColumnDefinition] =
    Option(colNames).map {c => ColumnDefinition.fromColumnNames(DelimitedIterator(new StringReader(c), sep, Some(quote), Some(escape)).next)}.getOrElse(Nil)

  def leftDs: Try[Iterator[Seq[String]] with ColumnDefinitions] = Try {
    val dsRowSourceCreator =
      DsRowSourceCreator(
          leftFileName,
          Option(leftWsName),
          ignoreLeftRows,
          leftSeparatorChar,
          leftQuoteChar,
          leftEscapeChar,
          leftMultiColNameSeparator,
          leftColNameRows,
          leftHeaderless,
          inColDefsFromColNames(leftColNames, leftSeparatorChar, leftQuoteChar, leftEscapeChar),
          identity[Seq[ColumnDefinition]])
    dsRowSourceCreator.createRowSource(leftFmt)
  }.recover{case t:Throwable => throw new Exception("Couldn't create left dataset for format: " + leftFmt, t)}

  def rightDs: Try[Iterator[Seq[String]] with ColumnDefinitions] = Try {
    val dsRowSourceCreator =
      DsRowSourceCreator(
          rightFileName,
          Option(rightWsName),
          ignoreRightRows,
          rightSeparatorChar,
          rightQuoteChar,
          rightEscapeChar,
          rightMultiColNameSeparator,
          rightColNameRows,
          rightHeaderless,
          inColDefsFromColNames(rightColNames, rightSeparatorChar, rightQuoteChar, rightEscapeChar),
          identity[Seq[ColumnDefinition]])
    dsRowSourceCreator.createRowSource(rightFmt)
  }.recover{case t:Throwable => throw new Exception("Couldn't create right dataset for format: " + rightFmt, t)}

  def omittedPages = Seq((SummaryPage,     omitSummaryPage),
                         (DifferencesPage, omitDifferencePage),
                         (ExplainedPage,   omitExplainedPage),
                         (InLeftOnlyPage,  omitInLeftOnlyPage),
                         (InRightOnlyPage, omitInRightOnlyPage),
                         (LeftPage,        omitLeftPage),
                         (RightPage,       omitRightPage),
                         (IdenticalPage,   omitIdenticalPage)) collect {case (p, true) => p}

  def overriddenPages = Map[Page, String](SummaryPage     -> summaryPage,
                                          DifferencesPage -> differencePage,
                                          InLeftOnlyPage  -> inLeftOnlyPage,
                                          InRightOnlyPage -> inRightOnlyPage,
                                          LeftPage        -> leftPage,
                                          RightPage       -> rightPage,
                                          ExplainedPage   -> explainedPage,
                                          IdenticalPage   -> identicalPage)

  def pageNames = PageNames() ++ overriddenPages
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
