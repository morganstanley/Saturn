package com.ms.qaTools.io.rowWriter.jdbc

import java.sql.Connection

import com.ms.qaTools._
import com.ms.qaTools.exceptions.JdbcException
import com.ms.qaTools.io.Writer
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.io.rowSource.{DatabaseConnection, SQLiteConnection}
import com.ms.qaTools.io.rowSource.jdbc.ExecuteSupport
import com.ms.qaTools.jdbc.SQLTypeParameter
import com.ms.qaTools.jdbc.SQLTypeParameter.{SQLParameterGetSet, SQLStringParameterGetSet}

class JdbcRowWriter(connection: DatabaseConnection with ExecuteSupport, tableName: String, batchSz: Int = 10000) extends Writer[Iterator[Seq[String]]] {
  require(tableName != null, "Must specify a table name")
  def write(source: Iterator[Seq[String]]) = connection.withConnection { dbConnection =>
    source match {
      case c: ColumnDefinitions => {
        val idQuoteStr = connection.getIdentifierQuoteString
        val colsStr = c.colNames.map(x => s"$idQuoteStr$x$idQuoteStr").mkString(",")
        val statementStr = "insert into " + tableName + "(" +
          colsStr +
          ") values (" +
          c.colDefs.map { A => "?" }.toList.mkString(",") +
          ")"

        if (dbConnection.getAutoCommit()) dbConnection.setAutoCommit(false)

        val statement = dbConnection.prepareStatement(statementStr)
        val setters = columnAccessors(dbConnection, colsStr)
        val count = source.foldLeft(0)((count, row) => {
          for ((str, setter, i) <- (row, setters, Stream.from(1)).zipped) setter.set(i, str, statement)
          statement.addBatch()
          if ((count + 1) % batchSz == 0) statement.executeBatch()
          count + 1
        })
        statement.executeBatch()
        statement.close()
        dbConnection.commit()
        count
      }
      case _ => throw new JdbcException("Unhandled type of input")
    }
  }
  override def close = {}

  protected def columnAccessors(conn: Connection, cols: String): Seq[SQLParameterGetSet[_]] =
    if (cols.isEmpty)
      Nil
    else withCloseable(conn.createStatement) { st =>
      val meta = st.executeQuery(s"select $cols from $tableName where 1 = 0").getMetaData
      for (i <- 1 to meta.getColumnCount) yield connection match {
        case _: SQLiteConnection => SQLStringParameterGetSet // Otherwise you get NULL type
        case _                   => SQLTypeParameter(meta.getColumnType(i))
      }
    }
}

object JdbcRowWriter {
  def apply(connection: DatabaseConnection with ExecuteSupport, tableName: String) = new JdbcRowWriter(connection, tableName)
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
