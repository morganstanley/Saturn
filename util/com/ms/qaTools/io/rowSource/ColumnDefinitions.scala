package com.ms.qaTools.io.rowSource

import scala.annotation.tailrec
import com.ms.qaTools.io.DelimitedRow



trait ColumnDefinitions {
  def colDefs: Seq[ColumnDefinition]
  def keyColDefs: Seq[ColumnDefinition] = colDefs.filter(_.isKey).sortBy(_.keyOrder)
  def colNames: Seq[String] = colDefs map (_.name)
  lazy val colMap: Map[String, ColumnDefinition] = colDefs.map { c => (c.name, c) }.toMap
  def getColDefByName(colName: String): Option[ColumnDefinition] = colMap.get(colName)

  class ColumnDefinitionsException(val colDefs: List[ColumnDefinition], message: String = null)
    extends Throwable(message)

  def keyColOrdering: Ordering[Seq[String]] = keyColOrdering(keyColDefs)
  def keyColOrdering(keyColDefs: Seq[ColumnDefinition]): Ordering[Seq[String]] = ColumnOrdering(keyColDefs)
}

class ColumnOrdering(colIdxTyps: Seq[(Int, ColumnType)]) extends Ordering[Seq[String]] {
  require(colIdxTyps.nonEmpty, "No columns are defined as key to generate the key columns sort function.")
  def compare(xs: Seq[String], ys: Seq[String]) = colIdxTyps.foldLeft(0) {
    case (0, (idx, typ)) => typ.compare(xs(idx), ys(idx))
    case (res, _)        => res
  }
}

object ColumnOrdering {
  def apply(columns: Seq[ColumnDefinition]) = new ColumnOrdering(columns.map(c => (c.index, c.colType)))
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
