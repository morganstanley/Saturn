package com.ms.qaTools.io.rowSource.jdbc
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.io.rowSource.Named
import java.io.Closeable
import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.ResultSet
import scala.util.Try

class ResultSetRowSource (resultSets: BufferedIterator[ResultSet], connectionToClose: Option[Connection])
extends Iterator[ResultSet] with Named with ColumnDefinitions with Closeable {
  val metaData  = resultSets.head.getMetaData

  val colDefs = (1 to metaData.getColumnCount).map(i => ColumnDefinition(name = metaData.getColumnLabel(i), index = i - 1))

  val name = metaData.getColumnCount match {
    case 0 => "EMPTY"    
    case _ =>
      if((1 to metaData.getColumnCount).map{i => s"${metaData.getSchemaName(i)}.${metaData.getTableName(i)}"}.toSet.size == 1)
        metaData.getTableName(1)
      else "QUERY"
  }

  private val i: Iterator[ResultSet] =
    resultSets.map(rs => Iterator.continually(rs).takeWhile(_.next)).takeWhile(_.nonEmpty).flatten

  def hasNext = i.hasNext

  def next = i.next
  
  def close = {
    connectionToClose.foreach(_.close)
  }
}

object ResultSetRowSource {
  def apply(resultSet: ResultSet, connectionToClose: Option[Connection] = None) =
    new ResultSetRowSource(Iterator(resultSet).buffered, connectionToClose)

  def continually(statement: PreparedStatement, connectionToClose: Option[Connection]) =
    new ResultSetRowSource(Iterator.continually(statement.executeQuery).buffered, connectionToClose)
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
