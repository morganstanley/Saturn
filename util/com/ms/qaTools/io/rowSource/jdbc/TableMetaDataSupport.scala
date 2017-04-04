package com.ms.qaTools.io.rowSource.jdbc
import com.ms.qaTools.compare.CompareColDef
import com.ms.qaTools.compare.CompareColDefs
import com.ms.qaTools.io.rowSource.DatabaseConnection
import com.ms.qaTools.io.rowSource.NumericColumnType
import com.ms.qaTools.io.rowSource.StringColumnType
import com.ms.qaTools.io.rowSource.Utils._
import java.sql.Types
import java.util.Locale

trait TableMetaDataSupport {self: DatabaseConnection =>
  val primaryKeyColIndex = 4
  val primaryKeyColType  = 5

  def keysForATable(table: String): Seq[String] =
    ResultSetRowSource(getConnection.getMetaData.getPrimaryKeys(null, null, table)).map(
      _.getString(primaryKeyColIndex)).toList

  def allColumnsForATable(table: String): Seq[(String, Int)] =
    ResultSetRowSource(getConnection.getMetaData.getColumns(null, null, table, null)).map(
      key => (key.getString(primaryKeyColIndex), key.getInt(primaryKeyColType))).toList

  def asCompareColumnDefs(table: String)(implicit locale: Locale): CompareColDefs = {
    val keyList = keysForATable(table)

    new CompareColDefs(for ((col, ctype) <- allColumnsForATable(table)) yield {
      val colType = 
        if (Set(Types.CHAR, Types.VARCHAR, Types.LONGNVARCHAR).contains(ctype)) StringColumnType()
        else NumericColumnType()
      val column = Some(col)

      if (keyList.contains(col)) {
        val order = Some(keyList.indexOf(col) + 1)
        new CompareColDef(column, order, None, colType = colType, true, column, order)
      } else
        CompareColDef(col, index = 0, colType = colType)
    }, List(""), List(""))
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
