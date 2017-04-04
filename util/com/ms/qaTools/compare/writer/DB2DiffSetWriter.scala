package com.ms.qaTools.compare.writer
import com.ms.qaTools.compare.CompareColDef
import com.ms.qaTools.io.rowSource.DatabaseConnection
import com.ms.qaTools.io.rowSource.jdbc.ExecuteSupport
import com.ms.qaTools.io.rowSource.jdbc.FetchSupport
import com.ms.qaTools.io.rowSource.jdbc.ResultSetRowSource
import com.ms.qaTools.io.rowSource.Utils._

case class DB2DiffSetWriter(dbConnection: DatabaseConnection with ExecuteSupport with FetchSupport, colDefs: Seq[CompareColDef], tblPrefix: String, dbQualifier: String)
extends DataBaseDiffSetWriter(dbConnection, colDefs, tblPrefix) {
  val prefix = dbQualifier + "." + tblPrefix
  setupDataBaseEnvironment

  /**
   * Method to create the tables used to insert the info from the DiffSet
   */
  private def createTables {
    create("table", "LEFTTABLE (rowId integer not null primary key, " + orderedColDefs(LEFT).map{_.leftColumnDefinition.name + " varchar(256) "}.mkString(",") + ")")
    create("table", "RIGHTTABLE (rowId integer not null primary key, " + orderedColDefs(RIGHT).map{_.rightColumnDefinition.name + " varchar(256) "}.mkString(",") + ")")
    create("table", "DIFFS (diffId integer not null primary key, " + "leftId integer, rightId integer, statusId integer, reason varchar(256))")
    create("index", s"diffs_leftId on ${tblPrefix}diffs (leftId)")
    create("index", s"diffs_rightId on ${tblPrefix}diffs (rightId)")
    create("table", "CELLDIFFS (cellDiffId integer not null primary key, diffId integer, leftIdx integer, rightIdx integer, statusId integer, reason varchar(256))")
    create("index", s"cellDiffs_diffId on ${tblPrefix}cellDiffs (diffId)")
    create("table", "XPATHDIFFS (xPathDiffId integer not null primary key, diffId integer, leftXPath varchar(256), rightXPath varchar(256), aliasXPath varchar(256), statusId integer)")
    create("index", s"xPathDiffs_diffId on ${tblPrefix}xPathDiffs (diffId)")
    create("table", "STATUS (statusId integer not null primary key, status varchar(256))")
  }

  private def create(typ: String, statement: String) =
    dbConnection.execute(s"create $typ " + prefix + statement)

  /**
   * Method used to drop all the tables associated with the dsCompare process
   */
  private def cleanTables {
    dbConnection.fetch("SELECT TABNAME from SYSCAT.TABLES WHERE TABNAME in( 'DIFFS', 'CELLDIFFS', 'XPATHDIFFS', 'STATUS', 'LEFTTABLE', 'RIGHTTABLE') and TABSCHEMA = '" + dbQualifier + "'").foreach(rs =>
      dbConnection.execute("DROP TABLE " + dbQualifier + "." + rs.toSeqString.mkString))
    dbConnection.fetch("SELECT VIEWNAME from SYSCAT.VIEWS WHERE VIEWNAME in( 'summary', 'different', 'inLeftOnly', 'inRightOnly', 'explained', 'identical') and VIEWSCHEMA = '" + dbQualifier + "'").foreach(rs =>
      dbConnection.execute("DROP VIEW " + dbQualifier + "." + rs.toSeqString.mkString))
  }

  /**
   * Method to create the views used in the data compare process
   */
  override def createViews {
    val genericColumns = (leftColNames.zipWithIndex.map{case (column, index) =>
      prefix + "leftTable." + column + " AS " + column + "_leftVal,${prefix}rightTable." + column + " AS " + column + "_rightVal," +
      s"CASE WHEN (${prefix}leftTable.$column IS NULL) THEN 3 WHEN (${prefix}rightTable.$column IS NULL) THEN 2" +
      s" ELSE COALESCE((SELECT statusId FROM ${prefix}cellDiffs WHERE diffId = diffs.diffId and leftIdx = " + (index + 1) + "), 0) END AS " + column + "_diffStatus"
    }).mkString(",")
    create("view", "summary AS SELECT " +
      s"(SELECT COUNT(0) AS leftDsNumRows FROM ${prefix}leftTable)," +
      s"(SELECT COUNT(0) AS rightDsNumRows FROM ${prefix}rightTable)," +
      s"(SELECT COUNT(statusId) AS different FROM ${prefix}diffs WHERE statusId = 1)," +
      s"(SELECT COUNT(statusId) AS inLeftOnly FROM ${prefix}diffs WHERE statusId = 2)," +
      s"(SELECT COUNT(statusId) AS inRightOnly FROM ${prefix}diffs WHERE statusId = 3)," +
      s"(SELECT COUNT(statusId) AS explained FROM ${prefix}diffs WHERE statusId = 4)," +
      s"(SELECT COUNT(statusId) AS identical FROM ${prefix}diffs WHERE statusId = 0)," +
      s"(SELECT COUNT(statusId) AS validatePass FROM ${prefix}diffs WHERE statusId = 5)," +
      s"(SELECT COUNT(statusId) AS validateFail FROM ${prefix}diffs WHERE statusId = 6)" +
      " from sysibm.sysdummy1")
    create("view", s"inLeftOnly AS SELECT ${prefix}leftTable.* from ${prefix}diffs AS diffs JOIN ${prefix}leftTable ON ${prefix}leftTable.rowId = diffs.leftId AND diffs.statusId = 2")
    create("view", s"inRightOnly AS SELECT ${prefix}leftTable.* from ${prefix}diffs AS diffs JOIN ${prefix}leftTable ON ${prefix}leftTable.rowId = diffs.leftId AND diffs.statusId = 3")
    create("view", s"identical AS SELECT ${prefix}leftTable.rowId AS leftRowId,${prefix}rightTable.rowId AS rightRowId,diffs.statusId AS statusId,"
      + genericColumns + s" FROM ${prefix}diffs AS diffs JOIN ${prefix}leftTable ON ${prefix}leftTable.rowId = diffs.leftId JOIN "
      + tblPrefix + s"rightTable ON ${prefix}rightTable.rowId = diffs.rightId AND diffs.statusId = 0")
    create("view", s"different AS SELECT ${prefix}leftTable.rowId AS leftRowId,${prefix}rightTable.rowId AS rightRowId,diffs.statusId AS statusId,"
      + genericColumns + s" FROM ${prefix}diffs AS diffs JOIN ${prefix}leftTable ON ${prefix}leftTable.rowId = diffs.leftId JOIN "
      + tblPrefix + s"rightTable ON ${prefix}rightTable.rowId = diffs.rightId AND diffs.statusId = 1")
    create("view", s"explained AS SELECT ${prefix}leftTable.rowId AS leftRowId,${prefix}rightTable.rowId AS rightRowId,diffs.statusId AS statusId,"
      + genericColumns + s" FROM ${prefix}diffs AS diffs JOIN ${prefix}leftTable ON ${prefix}leftTable.rowId = diffs.leftId JOIN "
      + tblPrefix + s"rightTable ON ${prefix}rightTable.rowId = diffs.rightId AND diffs.statusId = 4")
  }

  /**
   * Method to set up the environment
   */
  override def setupDataBaseEnvironment {
    cleanTables
    createTables
    createValidStatus
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
