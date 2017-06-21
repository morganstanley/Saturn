package com.ms.qaTools.compare

import com.ms.qaTools.IIteratorProxy
import com.ms.qaTools.io.rowSource.DatabaseConnection
import com.ms.qaTools.io.rowSource.Utils.ResultSetUtil

object JdbcComparator {
  sealed trait JoinType {
    def joinPrefix: String
  }

  case object InnerJoin extends JoinType {
    def joinPrefix = ""
  }

  case object LeftJoin extends JoinType {
    def joinPrefix = "left outer"
  }

  case object RightJoin extends JoinType {
    def joinPrefix = "right outer"
  }

  case object FullJoin extends JoinType {
    def joinPrefix = "full outer"
  }
}

class JdbcComparator(connection: DatabaseConnection, left: String, right: String, val colDefs: Seq[CompareColDef],
                     joinType: JdbcComparator.JoinType) extends Comparator with IIteratorProxy[Diff[Seq[String]]] {
  protected val query = {
    def quote(ident: String) = connection.quoteIdent(ident)
    val joinCond = keyCols.map { c =>
      s"l.${quote(c.left.name)} = r.${quote(c.right.name)}"
    }.mkString(if (keyCols.nonEmpty) "on " else "", " and ", "")
    val cmps = nonKeyCols.map { c =>
      val cl = quote(c.left.name)
      val cr = quote(c.right.name)
      s", l.$cl = r.$cr or l.$cl is null and r.$cr is null as ${quote("IDENTICAL_" + c.left.name)}"
    }.mkString
    s"select l.*, r.* $cmps from $left l ${joinType.joinPrefix} join $right r $joinCond"
  }

  protected lazy val result = connection.fetch(query)

  protected lazy val self = {
    val offsetL = 1
    val offsetR = offsetL + leftCols.size
    val offsetCmp = offsetR + rightCols.size
    val cmpCols = (nonKeyCols, Stream.from(offsetCmp)).zipped.toBuffer
    result.map { rs =>
      def leftRow = rs.toSeqString(offsetL, offsetR)
      def rightRow = rs.toSeqString(offsetR, offsetCmp)
      if (rs.getObject(offsetL) == null) DelimitedInRightOnly(rightRow, rightCols)
      else if (rs.getObject(offsetR) == null) DelimitedInLeftOnly(leftRow, leftCols)
      else {
        val diffCols = for ((c, i) <- cmpCols if !rs.getBoolean(i)) yield c
        if (diffCols.isEmpty) DelimitedIdentical(leftRow, rightRow)
        else DelimitedDifferent(leftRow, rightRow, diffCols, columnDefinitions)
      }
    }
  }

  override def close() = result.close()
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
