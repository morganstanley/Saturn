package com.ms.qaTools.compare
import com.ms.qaTools._
import com.ms.qaTools.io._
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.tree.TreeNode
import com.ms.qaTools.tree.validator.TreeResult
import com.ms.qaTools.io.rowSource.IndexedRepresentation

trait AbstractDiff extends Explainable {
  override def explain(explanation: String): AbstractDiff
}
sealed trait HasLeft[T] {val left: T}
sealed trait HasRight[T] {val right: T}
trait InLeftOnly[T] extends AbstractDiff with HasLeft[T]
trait InRightOnly[T] extends AbstractDiff with HasRight[T]
trait Identical[T] extends AbstractDiff with HasLeft[T] with HasRight[T]
trait Different[T] extends AbstractDiff with HasLeft[T] with HasRight[T]
trait ValidationFailed[T] extends AbstractDiff with HasLeft[T] with HasRight[T]
trait ValidationPassed[T] extends AbstractDiff with HasLeft[T] with HasRight[T]

case class DelimitedInLeftOnly(
  val left: Seq[String],
  val colDefs: Seq[CompareColDef],
  val explanation: Option[String] = None)
extends InLeftOnly[Seq[String]] {
  def explain(explanation: String) = DelimitedInLeftOnly(left, colDefs, Option(explanation))
}

case class DelimitedInRightOnly(right: Seq[String],
  colDefs: Seq[CompareColDef],
  explanation: Option[String] = None)
extends InRightOnly[Seq[String]] {
  def explain(explanation: String) = DelimitedInRightOnly(right, colDefs, Option(explanation))
}

case class DelimitedIdentical(left: Seq[String], right: Seq[String], explanation: Option[String] = None) extends Identical[Seq[String]] {
  def explain(explanation: String) = this
}

case class DelimitedDifferent(
  left: Seq[String],
  right: Seq[String],
  compareColDefs: Seq[CompareColDef],
  colDefs: Seq[ColumnDefinition],
  explainedColumns: Seq[(CompareColDef, String)] = Nil,
  explanation: Option[String] = None,
  columnCharacterization: Seq[(CompareColDef, DifferenceCharacterization)] = Nil,
  recordCharacterization: Seq[DifferenceCharacterization] = Nil)
extends Different[Seq[String]] {
  // FIXME if column name is not unique, only the first one will be explained
  def explainColumnsByName(columns: (String, String)*): DelimitedDifferent = {
    val newExplainedColumns = explainedColumns ++ columns.map {
      case (name, reason) =>
        (Option(name).flatMap(name =>
          compareColDefs.find(_.name == name)).getOrElse(throw new Error(s"Column $name: not found")), reason)}
    val newExplanation = if (compareColDefs.count(dc => newExplainedColumns.exists(_._1.index == dc.index)) == compareColDefs.size) Some("All column diffs have been explained.")
    else explanation
    copy(explainedColumns = newExplainedColumns, explanation = newExplanation)
  }

  def explainColumnsByIdx(columns: (Int, String)*): DelimitedDifferent = {
    val newExplainedColumns = explainedColumns ++ columns.map {
      case (index, reason) => {
        require(index > -1, "colIdx must be greater than -1 to explain a column")
        (compareColDefs.find(_.index == index).getOrElse(throw new Error(s"Column at index $index: not found")), reason)}}
    val newExplanation = if (compareColDefs.count(dc => newExplainedColumns.exists(_._1.index == dc.index)) == compareColDefs.size) Some("All column diffs have been explained.")
    else explanation
    copy(explainedColumns = newExplainedColumns, explanation = newExplanation)
  }

  def explain(explanation: String): DelimitedDifferent = copy(explanation = Option(explanation))
  def characterization(idx: Int): DifferenceCharacterization =
    columnCharacterization.find(p => p._1.index == idx) match {
      case Some(characterization) => characterization._2
      case None => DifferenceCharacterization.UNCHARACTERIZED
    }
}

trait HasResult[N] {val result: TreeResult[N]}

case class InLeftOnlyTree[R](
  left: IndexedRepresentation[R],
  explanation: Option[String] = None)
extends InLeftOnly[IndexedRepresentation[R]] with Explainable {
  def explain(explanation: String) = InLeftOnlyTree(left, Option(explanation))
}

case class InRightOnlyTree[R](
  right: IndexedRepresentation[R],
  explanation: Option[String] = None)
extends InRightOnly[IndexedRepresentation[R]] with Explainable {
  def explain(explanation: String) = InRightOnlyTree(right, Option(explanation))
}

case class DifferentTree[R,N](
  left: IndexedRepresentation[R],
  right: IndexedRepresentation[R],
  result: TreeResult[N],
  explanation: Option[String] = None)
extends Different[IndexedRepresentation[R]] with Explainable with HasResult[N] {
  def explain(explanation: String) = DifferentTree(left, right, result, Option(explanation))
}

case class IdenticalTree[R,N](
  left: IndexedRepresentation[R],
  right: IndexedRepresentation[R],
  result: TreeResult[N],
  explanation: Option[String] = None)
extends Identical[IndexedRepresentation[R]] with HasResult[N] {
  def explain(explanation: String) = this
}

case class ValidationPassedTree[R,N](
  left: IndexedRepresentation[R],
  right: IndexedRepresentation[R],
  result: TreeResult[N],
  explanation: Option[String] = None)
extends ValidationPassed[IndexedRepresentation[R]] with Explainable with HasResult[N] {
  def explain(explanation: String) = ValidationPassedTree(left, right, result, Option(explanation))
}

case class ValidationFailedTree[R,N](
  left: IndexedRepresentation[R],
  right: IndexedRepresentation[R],
  result: TreeResult[N],
  explanation: Option[String] = None)
extends ValidationFailed[IndexedRepresentation[R]] with Explainable with HasResult[N] {
  def explain(explanation: String) = ValidationFailedTree(left, right, result, Option(explanation))
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
