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
COPYRIGHT NOTICE AND DISCLAIMER
Copyright (c) 2009-2016, Contributor

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License, version 3 for more details.

You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
*/
