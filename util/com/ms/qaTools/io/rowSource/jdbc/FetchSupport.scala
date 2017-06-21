package com.ms.qaTools.io.rowSource.jdbc

import java.io.Closeable
import java.sql.Connection
import java.sql.ParameterMetaData
import java.sql.PreparedStatement
import java.sql.ResultSet

import scala.util.Try
import scala.util.control.NonFatal

import com.ms.qaTools._
import com.ms.qaTools.io.rowSource.DatabaseConnection
import com.ms.qaTools.jdbc.SQLTypeParameter

import FetchSupport._

trait FetchSupport { self: DatabaseConnection =>

  def fetch(query: String, parameters: Seq[String] = Seq.empty, config: Config = Config()): ResultSetRowSource =
    fetchWithParameters(query, Iterator(parameters), config).next

  def fetchWithParameters(query: String, parameters: Iterator[Seq[String]], config: Config = Config()): ResultSetRowSources = {
    withPreparedStatement(query, config) { (statement, connToClose) =>
      new ResultSetRowSources(
        statement,
        parameters,
        connToClose,
        config.repeat, paramMetaData(statement, config.parameterMetaDataSupport))
    }
  }

  def fetchResultSetWithParameters(query: String, parameters: Iterator[Seq[String]], config: Config = Config()): ResultSetRowSource = {
    withPreparedStatement(query, config) { (statement, connToClose) =>
      val metaData = paramMetaData(statement, config.parameterMetaDataSupport)
      val it = parameters.map { p => statementFromParameters(statement, metaData, p).exclusivelyExecuteQuery() }
      new ResultSetRowSource(it.buffered, connToClose)
    }
  }

  protected def withPreparedStatement[A](query: String, config: Config)
                                        (body: (PreparedStatement, Option[Connection]) => A): A = {
    val isTableName = hasTable(query)
    val conn = getConnection
    try {
      val stmt = conn.prepareStatement(if (!isTableName) query else s"SELECT * FROM $query",
                                       config.resultSetType, config.resultSetConcurrency)
      body(stmt, if (!self.persistent) Option(conn) else None)
    } catch {
      case NonFatal(t) =>
        if (!self.persistent) conn.close()
        throw t
    }
  }

  def hasTable(fullName: String): Boolean = {
    def hasTable0(schema: String, name: String) = Try {
      // Need a new connection here, in case that an error happens, the connection will be closed and not available for
      // the main query
      withConnection(_.getMetaData.getTables(null, schema, name, null).next())
    }.getOrElse(false)
    fullName.split('.') match {
      case Array(n)    => hasTable0(null, n)
      case Array(s, n) => hasTable0(s, n)
      case _           => false
    }
  }

  def paramMetaData(statement: PreparedStatement, cfg: Config): Option[ParameterMetaData] = paramMetaData(statement, cfg.parameterMetaDataSupport)
  def paramMetaData(statement: PreparedStatement, parameterMetaDataSupport: Boolean): Option[ParameterMetaData] =
    if (parameterMetaDataSupport) Try(statement.getParameterMetaData.ensuring(p => p != null)).toOption else None

  def statementFromParameters(statement: PreparedStatement, paramMetaData: Option[ParameterMetaData], parameters: Seq[String]) =
    statement.withSideEffect { s =>
      paramMetaData match {
        case Some(meta) =>
          for (i <- 1 to meta.getParameterCount) {
            Try(parameters(i - 1)).foreach { p => SQLTypeParameter(meta.getParameterType(i)).set(i, p, s) }
          }
        case None =>
          parameters.zipWithIndex.foreach {
            case (cell, index) => s.setString(index + 1, cell)
          }
      }
    }

  protected class ResultSetRowSources(
    val statement: PreparedStatement,
    parameters: Iterator[Seq[String]],
    val connectionToClose: Option[Connection],
    repeat: Boolean,
    parameterMetaData: Option[ParameterMetaData]) extends Iterator[ResultSetRowSource] with Closeable {
    def hasNext = parameters.hasNext
    def next =
      try {
        if (repeat)
          ResultSetRowSource.continually(statementFromParameters(statement, parameterMetaData, parameters.next), connectionToClose)
        else
          ResultSetRowSource(statementFromParameters(statement, parameterMetaData, parameters.next).exclusivelyExecuteQuery(), connectionToClose)
      }
      catch {
        case t: Throwable => close; throw t
      }

    def close = {
      statement.close
      connectionToClose.foreach(_.close)
    }
  }

}

trait FetchSupportWithParameterMetaData extends FetchSupport { self: DatabaseConnection =>
  override def fetch(query: String, parameters: Seq[String] = Seq.empty, config: Config = Config()): ResultSetRowSource =
    fetchWithParameters(query, Iterator(parameters), config.copy(parameterMetaDataSupport = true)).next
  override def fetchWithParameters(query: String, parameters: Iterator[Seq[String]], config: Config = Config()): ResultSetRowSources =
    super.fetchWithParameters(query, parameters, config.copy(parameterMetaDataSupport = true))
}

object FetchSupport {
  case class Config(
    parameterMetaDataSupport: Boolean = false,
    fetchSize: Int = 100,
    resultSetType: Int = ResultSet.TYPE_FORWARD_ONLY,
    resultSetConcurrency: Int = ResultSet.CONCUR_READ_ONLY,
    repeat: Boolean = false)
}/*
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
