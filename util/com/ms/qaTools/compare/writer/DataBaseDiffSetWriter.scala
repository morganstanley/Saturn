package com.ms.qaTools.compare.writer
import com.ms.qaTools.compare.Diff
import com.ms.qaTools.compare.CompareColDefs
import com.ms.qaTools.compare.DelimitedComparatorCounter
import com.ms.qaTools.compare.DelimitedDifferent
import com.ms.qaTools.compare.DelimitedIdentical
import com.ms.qaTools.compare.DelimitedInLeftOnly
import com.ms.qaTools.compare.DelimitedInRightOnly
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.io.rowSource.SeqRowSource
import com.ms.qaTools.io.rowSource.DatabaseConnection
import com.ms.qaTools.io.rowSource.jdbc.ExecuteSupport
import com.ms.qaTools.io.rowWriter.JdbcRowWriter

abstract class DataBaseDiffSetWriter(dbConnection: DatabaseConnection with ExecuteSupport, val colDefs: CompareColDefs, tblPrefix: String)
extends DelimitedDiffSetWriter with SortedColumns {
  val STATUS_IDENTICAL: Int = 0
  val STATUS_DIFFERENT: Int = 1
  val STATUS_INLEFT: Int = 2
  val STATUS_INRIGHT: Int = 3
  val STATUS_EXPLAINED: Int = 4

  // Definition of valid index for columns
  var leftIndex: Int = 0
  var rightIndex: Int = 0
  var diffIndex: Int = 0
  var cellDiffsIndex: Int = 0

  def leftIndexNextGenId = {
    leftIndex += 1
    leftIndex
  }

  def rightIndexNextGenId = {
    rightIndex += 1
    rightIndex
  }

  def diffIndexNextGenId = {
    diffIndex += 1
    diffIndex
  }

  def cellDiffsIntexNextGenId = {
    cellDiffsIndex += 1
    cellDiffsIndex
  }

  override def write(source: Iterator[Diff[Seq[String]]]): Int = ???
  def writeNotes(notes: Seq[String] = Nil) = ()
  def writeSummary(counter: DelimitedComparatorCounter) = createViews
  def close() = ()

  private def writer(s: String): JdbcRowWriter =
    JdbcRowWriter(dbConnection, tblPrefix + s)

  /**
   * Method to insert the identical data into the different tables using the STATUS_IDENTICAL status
   */
  def writeIdentical(d: DelimitedIdentical) = {
    val l = List(leftIndexNextGenId.toString :: sortedLeftColumns.map(c => d.left(c._1.index)))
    val r = List(rightIndexNextGenId.toString :: sortedRightColumns.map(c => d.right(c._1.index)))
    val di = List(List(diffIndexNextGenId.toString, leftIndex.toString, rightIndex.toString, STATUS_IDENTICAL.toString, d.explanation.map(_.toString).getOrElse("")))
    val c = List(List(cellDiffsIntexNextGenId, diffIndex, leftIndex, rightIndex, STATUS_IDENTICAL).map(_.toString) :+ d.explanation.map(_.toString).getOrElse(""))
    writer("leftTable").write(SeqRowSource(l, ColumnDefinition.fromColumnNames("rowId" :: sortedLeftColumns.map(_._1.name))))
    writer("rightTable").write(SeqRowSource(r, ColumnDefinition.fromColumnNames("rowId" :: sortedRightColumns.map(_._1.name))))
    writer("diffs").write(SeqRowSource(di, ColumnDefinition.fromColumnNames(List("diffId", "leftId", "rightId", "statusId", "reason"))))
    writer("cellDiffs").write(SeqRowSource(c, ColumnDefinition.fromColumnNames(List("cellDiffId", "diffId", "leftIdx", "rightIdx", "statusId", "reason"))))
  }

  /**
   * Method to insert the different data into the different tables using the STATUS_DIFFERENT status
   */
  def writeDifferent(d: DelimitedDifferent) = {
    val explainedDetails = sortedCompareColumns.map{case (l, _, _) =>
      d.explainedColumns.find {case (ec, _) => Some(ec.left.name) == l.map(_.name)} match {
        case None    => (STATUS_DIFFERENT, d.explanation.getOrElse(""))
        case Some(c) => (STATUS_EXPLAINED, c._2)
      }
    }.distinct
    val columnsProcessed =
      if (explainedDetails.exists(_._1 == STATUS_EXPLAINED))
        List(STATUS_EXPLAINED.toString, explainedDetails.collect{case (STATUS_EXPLAINED, e) => e}.mkString("-"))
      else
        List(STATUS_DIFFERENT.toString, explainedDetails.collect{case (STATUS_DIFFERENT, e) => e}.mkString("-"))

    val l = List(leftIndexNextGenId.toString :: sortedLeftColumns.map(c => d.left(c._1.index)))
    val r = List(rightIndexNextGenId.toString :: sortedRightColumns.map(c => d.right(c._1.index)))
    val di = List(List(diffIndexNextGenId.toString, leftIndex.toString, rightIndex.toString) ::: columnsProcessed)
    val c = List(List(cellDiffsIntexNextGenId.toString, diffIndex.toString, leftIndex.toString, rightIndex.toString) ::: columnsProcessed)
    writer("leftTable").write(SeqRowSource(l, ColumnDefinition.fromColumnNames("rowId" :: sortedLeftColumns.map(_._1.name))))
    writer("rightTable").write(SeqRowSource(r, ColumnDefinition.fromColumnNames("rowId" :: sortedRightColumns.map(_._1.name))))
    writer("diffs").write(SeqRowSource(di, ColumnDefinition.fromColumnNames(List("diffId", "leftId", "rightId", "statusId", "reason"))))
    writer("cellDiffs").write(SeqRowSource(c, ColumnDefinition.fromColumnNames(List("cellDiffId", "diffId", "leftIdx", "rightIdx", "statusId", "reason"))))
  }

  /**
   * Method to insert the in left only data into the different tables using the STATUS_INLEFT status
   */
  def writeInLeftOnly(d: DelimitedInLeftOnly) = {
    val l = List(leftIndexNextGenId.toString :: sortedLeftColumns.map(c => d.left(c._1.index)))
    val di = List(List(diffIndexNextGenId.toString, leftIndex.toString, STATUS_INLEFT.toString, d.explanation.map(_.toString).getOrElse("")))
    val c = List(List(cellDiffsIntexNextGenId.toString, diffIndex.toString, leftIndex.toString, STATUS_INLEFT.toString, d.explanation.map(_.toString).getOrElse("")))
    writer("leftTable").write(SeqRowSource(l, ColumnDefinition.fromColumnNames("rowId" :: sortedLeftColumns.map(_._1.name))))
    writer("diffs").write(SeqRowSource(di, ColumnDefinition.fromColumnNames(List("diffId", "leftId", "statusId", "reason"))))
    writer("cellDiffs").write(SeqRowSource(c, ColumnDefinition.fromColumnNames(List("cellDiffId", "diffId", "leftIdx", "statusId", "reason"))))
  }

  /**
   * Method to insert the in left only data into the different tables using the STATUS_INRIGHT status
   */
  def writeInRightOnly(d: DelimitedInRightOnly) = {
    val r = List(rightIndexNextGenId.toString :: sortedRightColumns.map(c => d.right(c._1.index)))
    val di = List(List(diffIndexNextGenId.toString, rightIndex.toString, STATUS_INRIGHT.toString, d.explanation.map(_.toString).getOrElse("")))
    val c = List(List(cellDiffsIntexNextGenId.toString, diffIndex.toString, rightIndex.toString, STATUS_INRIGHT.toString, d.explanation.map(_.toString).getOrElse("")))
    writer("rightTable").write(SeqRowSource(r, ColumnDefinition.fromColumnNames("rowId" :: sortedRightColumns.map(_._1.name))))
    writer("diffs").write(SeqRowSource(di, ColumnDefinition.fromColumnNames(List("diffId", "rightId", "statusId", "reason"))))
    writer("cellDiffs").write(SeqRowSource(c, ColumnDefinition.fromColumnNames(List("cellDiffId", "diffId", "rightIdx", "statusId", "reason"))))
  }

  /**
   * Method to create the views used in the data compare process
   */
  def createViews(): Unit = {
    val genericColumns = (sortedLeftColumns.map(_._1.name).zipWithIndex.map{case (column, index) =>
      tblPrefix + "leftTable." + column + " AS " + column + "_leftVal," +
      tblPrefix + "rightTable." + column + " AS " + column + "_rightVal," +
      "CASE WHEN (" + tblPrefix + "leftTable." + column + " IS NULL) THEN 3 WHEN (" + tblPrefix + "rightTable." + column + " IS NULL) THEN 2" +
      " ELSE COALESCE((SELECT statusId FROM " + tblPrefix + "cellDiffs WHERE diffId = diffs.diffId and leftIdx = " + (index + 1) + "), 0) END AS " + column + "_diffStatus"
    }).mkString(",")
    dbConnection.execute("CREATE VIEW summary AS SELECT * FROM (" +
      "(SELECT COUNT(0) AS leftDsNumRows FROM " + tblPrefix + "leftTable)," +
      "(SELECT COUNT(0) AS rightDsNumRows FROM " + tblPrefix + "rightTable)," +
      "(SELECT COUNT(statusId) AS different FROM " + tblPrefix + "diffs WHERE statusId = 1)," +
      "(SELECT COUNT(statusId) AS inLeftOnly FROM " + tblPrefix + "diffs WHERE statusId = 2)," +
      "(SELECT COUNT(statusId) AS inRightOnly FROM " + tblPrefix + "diffs WHERE statusId = 3)," +
      "(SELECT COUNT(statusId) AS explained FROM " + tblPrefix + "diffs WHERE statusId = 4)," +
      "(SELECT COUNT(statusId) AS identical FROM " + tblPrefix + "diffs WHERE statusId = 0)," +
      "(SELECT COUNT(statusId) AS validatePass FROM " + tblPrefix + "diffs WHERE statusId = 5)," +
      "(SELECT COUNT(statusId) AS validateFail FROM " + tblPrefix + "diffs WHERE statusId = 6)" +
      ")")
    dbConnection.execute("CREATE VIEW inLeftOnly AS SELECT " + tblPrefix + "leftTable.* from " + tblPrefix + "diffs AS diffs JOIN " + tblPrefix + "leftTable ON leftTable.rowId = diffs.leftId AND diffs.statusId = 2")
    dbConnection.execute("CREATE VIEW inRightOnly AS SELECT " + tblPrefix + "rightTable.* from " + tblPrefix + "diffs AS diffs JOIN " + tblPrefix + "rightTable ON rightTable.rowId = diffs.rightId AND diffs.statusId = 3")
    dbConnection.execute("CREATE VIEW identical AS SELECT " + tblPrefix + "leftTable.rowId AS leftRowId," +
      tblPrefix + "rightTable.rowId AS rightRowId," + tblPrefix + "diffs.statusId AS statusId," +
      genericColumns + " FROM " + tblPrefix + "diffs AS diffs JOIN " + tblPrefix + "leftTable ON leftTable.rowId = diffs.leftId " +
      " JOIN " + tblPrefix + "rightTable ON rightTable.rowId = diffs.rightId AND diffs.statusId = 0")
    dbConnection.execute("CREATE VIEW different AS SELECT " + tblPrefix + "leftTable.rowId AS leftRowId," +
      tblPrefix + "rightTable.rowId AS rightRowId," +  tblPrefix + "diffs.statusId AS statusId," +
      genericColumns + " FROM " + tblPrefix + "diffs AS diffs JOIN " + tblPrefix + "leftTable ON leftTable.rowId = diffs.leftId " +
      " JOIN " + tblPrefix + "rightTable ON rightTable.rowId = diffs.rightId AND diffs.statusId = 1")
    dbConnection.execute("CREATE VIEW explained AS SELECT " + tblPrefix + "leftTable.rowId AS leftRowId," + tblPrefix + "rightTable.rowId AS rightRowId," +
      tblPrefix + "diffs.statusId AS statusId," +
      genericColumns + " FROM " + tblPrefix + "diffs AS diffs JOIN " + tblPrefix + "leftTable ON leftTable.rowId = diffs.leftId " +
      " JOIN " + tblPrefix + "rightTable ON rightTable.rowId = diffs.rightId AND diffs.statusId = 4")
  }

  /**
   * Method to populate the valid compare status
   */
  def createValidStatus() = {
    val s = List(Seq("0", "I"), Seq("1", "D"), Seq("2", "IL"), Seq("3", "IR"), Seq("4", "E"), Seq("5", "VP"), Seq("6", "VF"))
    writer("status").write(SeqRowSource(s, ColumnDefinition.fromColumnNames(List("statusId", "status"))))
  }

  /**
   * Abstract method used by the different classes to set up the environment that is going to be
   * used to insert the data
   */
  def setupDataBaseEnvironment(): Unit
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
