package com.ms.qaTools.io.rowSource.jdbc
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.io.rowSource.Named
import java.io.Closeable
import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.ResultSet
import scala.util.Try

class ResultSetRowSource (resultSets: BufferedIterator[ResultSet], connectionToClose: Option[Connection], onRepeat: Boolean = false)
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
    if (onRepeat)
      resultSets.map {rs => Iterator.continually(rs).takeWhile { _.next }}.takeWhile {_.nonEmpty}.flatten
    else
      resultSets.flatMap {rs => Iterator.continually(rs).takeWhile { _.next }}

  def hasNext = i.hasNext
  def next = i.next
  def close = connectionToClose.foreach(_.close)
}

object ResultSetRowSource {
  def apply(resultSet: ResultSet, connectionToClose: Option[Connection] = None) =
    new ResultSetRowSource(Iterator(resultSet).buffered, connectionToClose)

  def continually(statement: PreparedStatement, connectionToClose: Option[Connection]) =
    new ResultSetRowSource(Iterator.continually(statement.exclusivelyExecuteQuery()).buffered, connectionToClose, true)
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
