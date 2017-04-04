package com.ms.qaTools.io.rowSource
import com.ms.qaTools.io.rowSource.jdbc._
import com.ms.qaTools.io.rowWriter.jdbc.JdbcRowWriter
import com.ms.qaTools.Logger
import java.io.Closeable
import java.io.File
import java.sql.Connection
import javax.sql.DataSource
import org.sqlite.SQLiteDataSource

trait DatabaseConnection extends FetchSupport with ExecuteSupport with ClearSupport with ProcedureCallSupport with TableMetaDataSupport with Closeable {
  val dataSource: DataSource
  val persistent: Boolean
  protected lazy val dbConnection = dataSource.getConnection()

  def getConnection = if (persistent) dbConnection else dataSource.getConnection()

  def withConnection[A](f: Connection => A): A = {
    val conn = getConnection
    try f(conn) finally if (!persistent) conn.close()
  }

  def close() = if (persistent) dbConnection.close

  def getIdentifierQuoteString(): String = {
    val dbConnection = getConnection
    val idQuoteStr = dbConnection.getMetaData().getIdentifierQuoteString()
    if (!persistent) dbConnection.close
    if (idQuoteStr == " ") "" else idQuoteStr
  }
}

trait Initializable {
  self: DatabaseConnection with ExecuteSupport =>
  def initialized: Boolean = {
    val dbConnection = getConnection
    try {
      val tables = dbConnection.getMetaData.getTables(null, null, null, Array("TABLE", "VIEW"))
      val isInitialized = tables.next
      tables.close
      isInitialized
    } finally {
      if (!self.persistent) dbConnection.close
    }
  }

  def withInitDDL(ddl: Seq[String]) = {
    if (!initialized) ddl.foreach(x => execute(x))
    this
  }

  def withInitTables(tables: Traversable[Iterator[Seq[String]] with Named with ColumnDefinitions])(implicit logger: Logger) = {
    if (!initialized) {
      val idQuoteStr = getIdentifierQuoteString
      for (t <- tables) {
        val colNames = t.colNames map (c => s"$idQuoteStr$c$idQuoteStr varchar") mkString ","
        val create = s"create table ${t.name} ($colNames)"
        logger debug s"Creating table: $create"
        execute(create)
        val inserted = JdbcRowWriter(this, t.name) write t
        logger debug s"Inserted: $inserted row(s)"
      }
    }
    this
  }
}

case class SQLiteConnection(dataSource: SQLiteDataSource, persistent: Boolean) 
extends DatabaseConnection with Initializable with NoProcedureCallSupport

object SQLiteConnection {
  def apply(): SQLiteConnection = {
    val source = new SQLiteDataSource
    source.setUrl("jdbc:sqlite::memory:")
    new SQLiteConnection(source, true)
  }

  def apply(file: File, unlink: Boolean = false, persistent: Boolean = false): SQLiteConnection = {
    if (unlink && file.exists) file.delete
    val source = new SQLiteDataSource
    source.setUrl("jdbc:sqlite:" + file.getAbsolutePath)
    new SQLiteConnection(source, persistent)
  }
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
