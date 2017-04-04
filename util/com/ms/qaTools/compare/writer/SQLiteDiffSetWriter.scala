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
