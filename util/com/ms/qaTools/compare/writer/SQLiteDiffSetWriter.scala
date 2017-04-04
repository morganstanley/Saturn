package com.ms.qaTools.compare.writer
import com.ms.qaTools.compare.CompareColDef
import com.ms.qaTools.io.rowSource.DatabaseConnection
import com.ms.qaTools.io.rowSource.jdbc.ExecuteSupport

case class SQLiteDiffSetWriter(dbConnection: DatabaseConnection with ExecuteSupport, colDefs: Seq[CompareColDef], tblPrefix: String)
extends DataBaseDiffSetWriter(dbConnection, colDefs, tblPrefix) {
  setupDataBaseEnvironment

  /**
   * Method to create the tables used to insert the info from the DiffSet
   */
  private def createTables {
    create("table", "leftTable (rowId integer primary key, " + orderedColDefs(LEFT).map{_.leftColumnDefinition.name + " text " }.toList.mkString(",") + ")")
    create("table", "rightTable (rowId integer primary key, " + orderedColDefs(RIGHT).map{_.rightColumnDefinition.name + " text "}.toList.mkString(",") + ")")
    create("table", "diffs (diffId integer primary key, leftId integer, rightId integer, statusId integer, reason text)")
    create("index", "diffs_leftId on " + tblPrefix + "diffs (leftId)")
    create("index", "diffs_rightId on " + tblPrefix + "diffs (rightId)")
    create("table", "cellDiffs (cellDiffId integer primary key, diffId integer, leftIdx integer, rightIdx integer, statusId integer, reason text)")
    create("index", "cellDiffs_diffId on " + tblPrefix + "cellDiffs (diffId)")
    create("table", "xPathDiffs (xPathDiffId integer primary key, diffId integer, leftXPath text, rightXPath text, aliasXPath text, statusId integer)")
    create("index", "xPathDiffs_diffId on " + tblPrefix + "xPathDiffs (diffId)")
    create("table", "status (statusId integer primary key, status text)")
  }

  private def create(typ: String, statement: String) =
    dbConnection.execute(s"create $typ if not exists " + tblPrefix + statement)

  /**
   * Method to set up the environment
   */
  override def setupDataBaseEnvironment {
    createTables
    createValidStatus
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
