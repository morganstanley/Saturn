package com.ms.qaTools.toolkit

import com.ms.qaTools.exceptions.AggregateException
import com.ms.qaTools.io
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.io.rowSource.DatabaseConnection
import com.ms.qaTools.io.rowSource.jdbc.ProcedureCallSupport
import com.ms.qaTools.io.rowSource.Utils.ResultSetIteratorUtil
import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.OptionTryUtil
import com.ms.qaTools.TryUtil
import com.ms.qaTools.withCloseable
import org.apache.commons.io.FilenameUtils
import scala.util.Try

case class SQLFetchQueryResult(status: Status, query: String, exception: Option[Throwable] = None) extends Result
case class SQLFetchResult(status: Status, queries: Seq[SQLFetchQueryResult], exception: Option[Throwable]) extends Result
case class SQLClearActionResult(status: Status, table: String, exception: Option[Throwable] = None) extends Result
case class SQLClearResult(status: Status, actions: Seq[SQLClearActionResult], exception: Option[Throwable] = None) extends Result
case class SQLLoadActionResult(status: Status, table: String, exception: Option[Throwable] = None) extends Result
case class SQLLoadResult(status: Status, actions: Seq[SQLLoadActionResult], exception: Option[Throwable] = None) extends Result
case class SQLCallActionResult(status: Status, procedure: String, exception: Option[Throwable] = None) extends Result
case class SQLCallResult(status: Status, calls: Seq[SQLCallActionResult], exception: Option[Throwable] = None) extends Result
case class SQLExecuteActionResult(status: Status, statement: String, exception: Option[Throwable] = None) extends Result
case class SQLExecuteResult(status: Status, statements: Seq[SQLExecuteActionResult], exception: Option[Throwable] = None) extends Result

case class SQLCall(dbConnection: ProcedureCallSupport, sqlExprs: Seq[String], parametersList: Seq[Option[Iterator[Seq[String]]]], outputs: Seq[String => Try[io.Writer[Iterator[Seq[String]]]]])
extends Runnable[SQLCallResult] {
  require(sqlExprs.length == parametersList.length && parametersList.length == outputs.length,
    "Number of SQL expressions, parameters and outputs were not all equal for SQL Call")

  def write(w: Try[io.Writer[Iterator[Seq[String]]]], i: Iterator[Seq[String]]) =
    w.map(w => withCloseable(w){_.write(i)}).rethrow("An exception occurred while connecting rotating file.")

  def run = Try {
    val results = for ((sqlExpr, parameters, output) <- (sqlExprs, parametersList, outputs).zipped.toSeq) yield {
      val result = withCloseable(dbConnection.call(sqlExpr, parameters.getOrElse(Iterator.single(Nil)))) {
        _.zipWithIndex.flatMap {
          case (iterRs, outerIndex) => iterRs.zipWithIndex.map {
            case (rs, innerIndex) => withCloseable(rs){
              rs => write(output("%04d.%04d".format(outerIndex, innerIndex)), rs.toSeqStringIterator)}
          } ++ Iterator(write(output("%04d.parameters".format(outerIndex)), iterRs.outputParametersAsDelimitedRowIterator))
        }.toSeq
      }.toTrySeq
      SQLCallActionResult(if (result.isSuccess) Passed else Failed, sqlExpr, result.failed.toOption)
    }
    SQLCallResult(if (results.forall(_.status == Passed)) Passed else Failed, results)
  }
}

case class SQLClear(dbConnection: DatabaseConnection, tables: Seq[String]) extends Runnable[SQLClearResult] {
  def run = tables.map { table =>
    Try {
      dbConnection.clear(table)
      SQLClearActionResult(Passed, table)
    }.recover{case t: Throwable => SQLClearActionResult(Failed, table, Some(t))}
  }.toTrySeq.map(results => SQLClearResult(if (results.forall { _.status == Passed }) Passed else Failed, results))
}

case class SQLExecute(dbConnection: DatabaseConnection, sqlExprs: Seq[String], parameters: Seq[Option[Iterator[Seq[String]]]]) extends Runnable[SQLExecuteResult] {
  require(sqlExprs.length == parameters.length, "Number of SQL expressions was not equal to number of parameters for SQL Execute")
  def run = sqlExprs.zip(parameters).map {
    case (sqlExpr, parameters) =>
      Try {
        dbConnection.execute(sqlExpr, parameters.getOrElse(Iterator.single(Seq())))
        SQLExecuteActionResult(Passed, sqlExpr)
      }.recover { case t: Throwable => SQLExecuteActionResult(Failed, sqlExpr, Some(t)) }
  }.toTrySeq.map(results => SQLExecuteResult(if (results.forall { _.status == Passed }) Passed else Failed, results))
}

case class SQLFetch(dbConnection: DatabaseConnection, sqlExprs: Seq[String], outputs: Seq[io.Writer[Iterator[Seq[String]]]], parameters: Seq[Option[(Iterator[Seq[String]] with ColumnDefinitions, String)]] = Nil)
extends Runnable[SQLFetchResult] {
  require(sqlExprs.length == outputs.length, "Number of SQL expressions was not equal to number of outputs for SQL Fetch")

  def run = (sqlExprs, outputs, parameters.padTo(sqlExprs.size, None)).zipped.toSeq.zipWithIndex.map {
    case ((sqlExpr, output, parametersOption), i) =>
      Try {
        parametersOption.map {
          case (parameters, fileName) =>
            val rsIterator = dbConnection.fetchWithParameters(sqlExpr, parameters)
            for ((rs, i) <- rsIterator.zipWithIndex) {
              val baseName = FilenameUtils.getBaseName(fileName)
              val fullPath = FilenameUtils.getFullPath(fileName)
              val extension = FilenameUtils.getExtension(fileName)
              (new io.definition.CsvIO(new io.FileIO(fullPath + baseName + "." + "%04d".format(i) + "." + extension)).output) match {
                case util.Success(writer) => Try(withCloseable(writer) { _.write(rs.toSeqStringIterator) })
                case util.Failure(t) => throw new Exception("An exception occurred while connecting rotating file.")
              }
            }
            rsIterator.close
        }.getOrElse(withCloseable(dbConnection.fetch(sqlExpr)) { rs =>
          output.write(rs.toSeqStringIterator)
        })
        SQLFetchQueryResult(Passed, sqlExpr)
      }.recover{case t: Throwable => SQLFetchQueryResult(Failed, sqlExpr, Some(t))}
  }.toTrySeq.map{results =>
    val status = if (results.forall(_.status == Passed)) Passed else Failed
    val exception = status match {
      case Failed => Some(new AggregateException("Not all queries passed.",
        results.collect{case SQLFetchQueryResult(Failed, q, e) => new Exception(s"Query failed: $q", e.orNull)}))
      case _ => None
    }
    SQLFetchResult(status, results, exception)
  }
}

case class SQLLoad(dbConnection: DatabaseConnection, inputs: Seq[SQLLoad.Input]) extends Runnable[SQLLoadResult] {
  def run = inputs.map { i =>
    Try {
      if (i.cleanLoad) dbConnection.clear(i.table)
      withCloseable(io.rowWriter.JdbcRowWriter(dbConnection, i.table))(_.write(i.source))
      SQLLoadActionResult(Passed, i.table)
    }.recover{case t: Throwable => SQLLoadActionResult(Failed, i.table, Some(t))}
  }.toTrySeq.map(results => SQLLoadResult(if (results.forall { _.status == Passed }) Passed else Failed, results))
}

// Saturn Runtime dependencies
object SQLCall {
  def apply(dbResourceTry: Try[DatabaseConnection with ProcedureCallSupport], sqlExprs: Seq[Try[String]], outputs: Seq[Try[String => Try[io.Writer[Iterator[Seq[String]]]]]], parameters: Seq[Option[Try[Iterator[Seq[String]]]]]): Try[SQLCall] = {
    for {
      d <- dbResourceTry.rethrow("An exception occurred while connecting database resource.")
      s <- sqlExprs.toTrySeq.rethrow("An exception occurred while generating sql expressions.")
      p <- parameters.map(_.toTryOption).toTrySeq.rethrow("An exception occurred while connecting parameter resources.")
      o <- outputs.toTrySeq.rethrow("An exception occurred while connecting output resources.")
    } yield SQLCall(d, s, p, o)
  }.rethrow("An exception occurred while setting up SQLCall.")
}

object SQLClear {
  def apply(dbResourceTry: Try[DatabaseConnection], tablesTry: Seq[Try[String]]): Try[SQLClear] = {
    for {
      dbConnection <- dbResourceTry.rethrow("An exception occurred while connection database resource.")
      tables <- tablesTry.toTrySeq.rethrow("An exception occurred while generating table strings.")
    } yield SQLClear(dbConnection, tables)
  }.rethrow("An exception occurred while setting up SQLClear.")
}

object SQLExecute {
  def apply(dbResourceTry: Try[DatabaseConnection], sqlExprsTry: Seq[Try[String]], parameterIOsTry: Seq[Option[Try[Iterator[Seq[String]]]]]): Try[SQLExecute] = {
    for {
      dbConnection <- dbResourceTry.rethrow("An exception occurred while connecting database resource.")
      sqlExprs <- sqlExprsTry.toTrySeq.rethrow("An exception occurred while generating sql expressions.")
      parameters <- parameterIOsTry.map { _.map { _.map(Option(_)) }.getOrElse(Try(None))
      }.toTrySeq.rethrow("An exception occurred while connecting parameter IO resources.")
    } yield SQLExecute(dbConnection, sqlExprs, parameters)
  }.rethrow("An exception occurred while setting up SQLExecute.")
}

object SQLFetch {
  def apply(dbResourceTry: Try[DatabaseConnection], sqlExprsTry: Seq[Try[String]],  outputsTry: Seq[Try[io.Writer[Iterator[Seq[String]]]]], parametersTry: Seq[Option[(Try[Iterator[Seq[String]] with ColumnDefinitions], Try[String])]]): Try[SQLFetch] = {
    for {
      dbConnection <- dbResourceTry.rethrow("An exception occurred while connection database resource.")
      sqlExprs <- sqlExprsTry.toTrySeq.rethrow("An exception occurred while generating sql expressions.")
      outputs <- outputsTry.zip(parametersTry).map {
        case (output, parameterTry) => parameterTry.map(_ => Try { new io.NullWriter }).getOrElse(output)
      }.toTrySeq.rethrow("An exception occurred while connecting output resources.")
      parameters <- parametersTry.map { option =>
        val t = for ((paramsT, fileT) <- option) yield for (p <- paramsT; f <- fileT) yield Some((p, f))
        t.getOrElse(util.Success(None))
      }.toTrySeq.rethrow("An exception occurred while connecting parameter IO resources.")
    } yield SQLFetch(dbConnection, sqlExprs, outputs, parameters)
  }.rethrow("An exception occurred while setting up SQLFetch.")
}

object SQLLoad {
  case class Input(table: String, source: Iterator[Seq[String]] with ColumnDefinitions, cleanLoad: Boolean = false)
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
