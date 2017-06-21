package com.ms.qaTools.compare.writer.tree

import java.sql.Connection
import java.sql.SQLException
import java.sql.Types

import com.ms.qaTools.compare.AbstractDiff
import com.ms.qaTools.compare.HasResult
import com.ms.qaTools.compare.Identical
import com.ms.qaTools.io.SqlConnectionOps
import com.ms.qaTools.io.rowSource.DatabaseConnection
import com.ms.qaTools.io.rowSource.IndexedRepresentation
import com.ms.qaTools.tree.validator.HasActual
import com.ms.qaTools.tree.validator.HasExpected
import com.ms.qaTools.tree.validator.TreeNodeCounter
import com.ms.qaTools.tree.validator.TreeResult

import scala.language.existentials

class DatabaseDiffSetWriter(dbConnection: DatabaseConnection, omitIdentical: Boolean) extends TreeDiffSetWriter[Any] {
  protected def createTable(name: String, columns: Seq[String]): Unit =
    dbConnection.execute("create table if not exists " + name + " " + columns.mkString("(", ", ", ")"))

  object Table {
    val summary = "summary"
    val diffs = "diffs"
    val details = "details"
    val keys = "keys"
  }

  createTable(Table.summary, Array("left integer",
                                   "right integer",
                                   "indentical integer",
                                   "different integer",
                                   "in_left_only integer",
                                   "in_right_only integer",
                                   "validation_failed integer",
                                   "validation_passed integer",
                                   "explained integer"))

  createTable(Table.diffs, Array("id integer primary key " + dbConnection.autoIncrement,
                                 "status varchar(8)",
                                 "explained boolean",
                                 "left " + dbConnection.indefiniteSizedTextType,
                                 "right " + dbConnection.indefiniteSizedTextType))

  createTable(Table.details, Array(s"diff_id integer references ${Table.diffs} (id)",
                                    "name " + dbConnection.indefiniteSizedTextType,
                                    "status varchar(8)",
                                    "left_path " + dbConnection.indefiniteSizedTextType,
                                    "right_path " + dbConnection.indefiniteSizedTextType,
                                    "expected " + dbConnection.indefiniteSizedTextType,
                                    "actual " + dbConnection.indefiniteSizedTextType))

  createTable(Table.keys, Array(s"diff_id integer references ${Table.diffs} (id)",
                                "left_0_right_1 smallint not null",
                                "column_name " + dbConnection.indefiniteSizedTextType,
                                "value " + dbConnection.indefiniteSizedTextType))

  def writeNotes(notes: Seq[String]) = ()
  def close() = dbConnection.close()

  def writeSummary(counter: TreeNodeCounter) = {
    dbConnection.execute(s"insert into ${Table.summary} values (?, ?, ?, ?, ?, ?, ?, ?, ?)",
                         Iterator.single(Array(counter.left, counter.right, counter.identical, counter.different,
                                               counter.inLeftOnly, counter.inRightOnly,
                                               counter.validatedFail, counter.validatedPass,
                                               counter.explained).map(_.toString)))
  }

  def writeDiff(diff: AbstractDiff) = if (!(omitIdentical && diff.isInstanceOf[Identical[_]])) dbConnection.withConnection { conn =>
    conn.withTransaction {
      val diffId = insertDiff(conn, diff)
      leftIndexedRepresentation(diff).foreach(insertKeys(conn, diffId, 0, _))
      rightIndexedRepresentation(diff).foreach(insertKeys(conn, diffId, 1, _))
      diff match {
        case h: HasResult[_] => insertDetails(conn, h.result.statistics, diffId)
        case _               =>
      }
    }
  }

  protected def insertDiff(conn: Connection, diff: AbstractDiff): Int = {
    val stmt = conn.prepareStatement(s"insert into ${Table.diffs} (status, explained, left, right) values (?, ?, ?, ?)", Array("id"))
    try {
      stmt.setString(1, getStatus(diff))
      stmt.setBoolean(2, diff.isExplained)
      leftIndexedRepresentation(diff) match {
        case Some(l) => stmt.setString(3, l.prettyPrint)
        case None    => stmt.setNull(3, Types.CLOB)
      }
      rightIndexedRepresentation(diff) match {
        case Some(r) => stmt.setString(4, r.prettyPrint)
        case None    => stmt.setNull(4, Types.CLOB)
      }
      val affectedRows = stmt.executeUpdate()
      assert(affectedRows > 0)
      val ids = stmt.getGeneratedKeys
      if (ids.next()) ids.getInt(1)
      else throw new SQLException("fail to get ID while inserting " + diff)
    } finally stmt.close()
  }

  protected def insertKeys(conn: Connection, diffId: Int, side: Int, rep: IndexedRepresentation[_]): Unit = {
    val stmt = conn.prepareStatement(s"insert into ${Table.keys} values (?, ?, ?, ?)")
    try {
      stmt.setInt(1, diffId)
      stmt.setInt(2, side)
      for ((c, v) <- (rep.colDefs.sortBy(_.index), rep.indexed).zipped) {
        stmt.setString(3, c.name)
        stmt.setString(4, v)
        stmt.addBatch()
      }
      stmt.executeBatch()
    } finally stmt.close()
  }

  protected def insertDetails(conn: Connection, stats: TreeResult.Statistics[_], diffId: Int): Unit = {
    val stmt = conn.prepareStatement(s"insert into ${Table.details} values (?, ?, ?, ?, ?, ?, ?)")
    try {
      stmt.setLong(1, diffId)
      val nodeDiffs = stats.different.iterator ++ stats.inLeftOnly ++ stats.inRightOnly ++ stats.validationPassed ++ stats.validationFailed
      (if (omitIdentical) nodeDiffs else nodeDiffs ++ stats.identical).foreach { d =>
        stmt.setString(2, d.meta.name)
        stmt.setString(3, d.status)
        d match {
          case d: HasExpected[_] =>
            stmt.setString(4, d.expected.path(true))
            stmt.setString(6, d.expected.valueAsString)
          case _ =>
            stmt.setNull(4, Types.CLOB)
            stmt.setNull(6, Types.CLOB)
        }
        d match {
          case d: HasActual[_] =>
            stmt.setString(5, d.actual.path(true))
            stmt.setString(7, d.actual.valueAsString)
          case _ =>
            stmt.setNull(5, Types.CLOB)
            stmt.setNull(7, Types.CLOB)
        }
        stmt.addBatch()
      }
      stats.validations.foreach { v =>
        stmt.setString(2, v.meta.name)
        stmt.setString(3, if (v.result) "VP" else "VF")
        stmt.setString(4, v.node.path(true))
        stmt.setString(5, v.node.path(true))
        stmt.setString(6, v.node.valueAsString)
        stmt.setString(7, v.node.valueAsString)
        stmt.addBatch()
      }
      stmt.executeBatch()
    } finally {
      stmt.close()
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
