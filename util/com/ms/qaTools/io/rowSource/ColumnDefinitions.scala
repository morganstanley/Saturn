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
