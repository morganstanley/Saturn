package com.ms.qaTools.io.rowSource.jdbc
import com.ms.qaTools.io.rowSource.DatabaseConnection
import com.ms.qaTools.withCloseable
import java.io.Closeable
import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.ResultSet
import scala.util.Try

trait FetchSupport { self: DatabaseConnection =>
  import FetchSupport._

  def fetch(query: String, parameters: Seq[String] = Seq.empty, config: Config = Config()): ResultSetRowSource =
    fetchWithParameters(query, Iterator(parameters), config).next

  def fetchWithParameters(query: String, parameters: Iterator[Seq[String]], config: Config = Config()): ResultSetRowSources = {
    val dbConnection = getConnection
    Try {
      // TODO: There should be an option in saturn if only a table name is supplied instead of trying to find the table
      // from the metadata.
      val sql = if (!hasTable(query)) query else "SELECT * FROM " + query
      val statement = dbConnection.prepareStatement(sql, config.resultSetType, config.resultSetConcurrency)
      statement.setFetchSize(config.fetchSize)
      new ResultSetRowSources(
        statement,
        parameters,
        if (!self.persistent) Option(dbConnection) else None,
        config.repeat)
    }.recover{case t => {if (!self.persistent) dbConnection.close; throw t}}.get
  }

  def hasTable(fullName: String): Boolean = {
    def hasTable0(schema: String, name: String) = {
      val dbConnection = getConnection
      val result = Try { withCloseable(dbConnection.getMetaData.getTables(null, schema, name, null))(_.next) }.getOrElse(false)
      if (!self.persistent) dbConnection.close
      result
    }
    fullName.split('.') match {
      case Array(n)    => hasTable0(null, n)
      case Array(s, n) => hasTable0(s, n)
      case _ => false
    }
  }
}

object FetchSupport {
  case class Config(
    fetchSize: Int = 100,
    resultSetType: Int = ResultSet.TYPE_FORWARD_ONLY,
    resultSetConcurrency: Int = ResultSet.CONCUR_READ_ONLY,
    repeat: Boolean = false)

  protected class ResultSetRowSources(
    statement: PreparedStatement,
    parameters: Iterator[Seq[String]],
    val connectionToClose: Option[Connection],
    repeat: Boolean
  ) extends Iterator[ResultSetRowSource] with Closeable {
    def hasNext = parameters.hasNext

    def next = {
      parameters.next.zipWithIndex.foreach {
        case (cell, index) => statement.setString(index + 1, cell)}
      Try {
        if (repeat) ResultSetRowSource.continually(statement, connectionToClose)
        else ResultSetRowSource(statement.executeQuery, connectionToClose)
      }.recover{case t => {close; throw t}}.get
    }

    def close = {
      statement.close
      connectionToClose.foreach(_.close)
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
