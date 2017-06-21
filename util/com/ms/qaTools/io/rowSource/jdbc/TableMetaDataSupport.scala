package com.ms.qaTools.io.rowSource.jdbc
import com.ms.qaTools.compare.CompareColDef
import com.ms.qaTools.compare.CompareColDefs
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.io.rowSource.DatabaseConnection
import com.ms.qaTools.io.rowSource.NumericColumnType
import com.ms.qaTools.io.rowSource.StringColumnType
import java.sql.Types
import java.util.Locale

trait TableMetaDataSupport {self: DatabaseConnection =>
  val primaryKeyColIndex = 4
  val primaryKeyColType  = 5

  def keysForATable(table: String): Seq[String] = withConnection { conn =>
    ResultSetRowSource(conn.getMetaData.getPrimaryKeys(null, null, table)).map(
      _.getString(primaryKeyColIndex)).toList
  }

  def allColumnsForATable(table: String): Seq[(String, Int)] = withConnection { conn =>
    ResultSetRowSource(conn.getMetaData.getColumns(null, null, table, null)).map(
      key => (key.getString(primaryKeyColIndex), key.getInt(primaryKeyColType))).toList
  }

  def asCompareColumnDefs(table: String)(implicit locale: Locale): CompareColDefs = {
    val keyList = keysForATable(table)

    CompareColDefs(allColumnsForATable(table).map{case (col, ctype) =>
      val colType =
        if (Set(Types.CHAR, Types.VARCHAR, Types.LONGNVARCHAR).contains(ctype)) StringColumnType
        else NumericColumnType()

      if (keyList.contains(col)) {
        val order = keyList.indexOf(col) + 1
        val c = ColumnDefinition(col, Some(order), order, colType)
        CompareColDef(c, c, true)
      } else {
        val c = ColumnDefinition(col, None, 0, colType)
        CompareColDef(c, c, false)
      }
    }, Nil, Nil)
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
