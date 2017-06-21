package com.ms.qaTools.compare
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.tree.TreeNode
import com.ms.qaTools.tree.validator.TreeResult
import com.ms.qaTools.io.rowSource.IndexedRepresentation

object Utils {
  def diffToDelimitedDifferent(d: Diff[Seq[String]]) = d match {
    case (d: DelimitedInLeftOnly) =>
      DelimitedDifferent(d.left, Nil, d.colDefs, Nil, explanation = d.explanation)
    case (d: DelimitedInRightOnly) =>
      DelimitedDifferent(Nil, d.right, d.colDefs, Nil, explanation = d.explanation)
    case (d: DelimitedIdentical) =>
      DelimitedDifferent(d.left, d.right, Nil, Nil, explanation = d.explanation)
    case (d: DelimitedDifferent) => d
    case d => throw new java.lang.ClassCastException(d.getClass.getName + " cannot be cast to com.ms.qaTools.compare.DelimitedDifferent")
  }
}

trait AbstractDiff extends Explainable[AbstractDiff]

sealed trait Diff[T] extends AbstractDiff with Explainable[Diff[T]]

object Diff {
  def apply[A](left: A, right: A,
               equal: (A, A) => Boolean = (_: A) == (_: A),
               missing: A => Boolean = (_: A) == null): Diff[A] =
    if (equal(left, right))  Identical(left, right)
    else if (missing(right)) InLeftOnly(left)
    else if (missing(left))  InRightOnly(right)
    else                     Different(left, right)

  case class Identical[A](left: A, right: A) extends com.ms.qaTools.compare.Identical[A] {
    val explanation = None
    def explain(explanation: String) = this
  }

  case class Different[A](left: A, right: A, explanation: Option[String] = None)
  extends com.ms.qaTools.compare.Different[A] {
    def explain(explanation: String) = copy(explanation = Option(explanation))
  }

  case class InLeftOnly[A](left: A, explanation: Option[String] = None)
  extends com.ms.qaTools.compare.InLeftOnly[A] {
    def explain(explanation: String) = copy(explanation = Option(explanation))
  }

  case class InRightOnly[A](right: A, explanation: Option[String] = None)
  extends com.ms.qaTools.compare.InRightOnly[A] {
    def explain(explanation: String) = copy(explanation = Option(explanation))
  }
}

sealed trait HasLeft[T]   extends Diff[T] {val left: T}
sealed trait HasRight[T]  extends Diff[T] {val right: T}
trait InLeftOnly[T]       extends HasLeft[T]
trait InRightOnly[T]      extends HasRight[T]
trait Identical[T]        extends HasLeft[T] with HasRight[T]
trait Different[T]        extends HasLeft[T] with HasRight[T]
trait ValidationFailed[T] extends HasLeft[T] with HasRight[T]
trait ValidationPassed[T] extends HasLeft[T] with HasRight[T]

sealed trait AtomicDiff[+A] {
  def contentOption: Option[A]
  def isDiff: Boolean
}

case class AtomicIdentical[A](content: A) extends AtomicDiff[A] {
  def contentOption = Option(content)
  def isDiff = false
}

case class AtomicDifferent[A](content: A) extends AtomicDiff[A] {
  def contentOption = Option(content)
  def isDiff = true
}

case class AtomicIgnored[A](content: A) extends AtomicDiff[A] {
  def contentOption = Option(content)
  def isDiff = false
}

case object AtomicMissing extends AtomicDiff[Nothing] {
  def contentOption = None
  def isDiff = true
}

case class DelimitedNWayDiff(data: IndexedSeq[IndexedSeq[AtomicDiff[String]]],
                             colDefs: Seq[NWayCompareColDef],
                             explainedColumns: Map[NWayCompareColDefMatching, String] = Map.empty,
                             explanation: Option[String] = None) extends AbstractDiff {
  def explain(explanation: String) = copy(explanation = Option(explanation))

  def relation: Map[(Int, String), IndexedSeq[AtomicDiff[String]]] = {
    for (c <- colDefs; (opt, j) <- (c.nameAndIndexOptions, Stream.from(0)).zipped; (colName, i) <- opt)
    yield (j, colName) -> data.map(_(i))
  }.toMap

  def explainColumnByName(sourceIndex: Int, column: String, explanation: String): DelimitedNWayDiff = {
    val c = colDefs.collectFirst {
      case c: NWayCompareColDefMatching if c.nameAndIndexOptions(sourceIndex).exists(_._1 == column) => c
    }.getOrElse {
      throw new NoSuchElementException(s"Cannot find matching column name $column in data source $sourceIndex")
    }
    copy(explainedColumns = explainedColumns.updated(c, explanation))
  }

  lazy val diffCols: Seq[NWayCompareColDefMatching] = colDefs.collect {
    case c: NWayCompareColDefMatching if c.cellIndices.exists {case (i, j) => data(i)(j).isDiff} => c
  }

  override lazy val isExplained = super.isExplained || diffCols.forall(explainedColumns.contains)
}

case class DelimitedInLeftOnly(left: Seq[String], colDefs: Seq[CompareColDef], explanation: Option[String] = None)
extends InLeftOnly[Seq[String]] {
  def explain(explanation: String) = DelimitedInLeftOnly(left, colDefs, Option(explanation))
}

case class DelimitedInRightOnly(right: Seq[String], colDefs: Seq[CompareColDef], explanation: Option[String] = None)
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
          compareColDefs.find(_.left.name == name)).getOrElse(throw new Error(s"Column $name: not found")), reason)}
    val newExplanation = if (compareColDefs.count(dc => newExplainedColumns.exists(_._1.left.index == dc.left.index)) == compareColDefs.size) Some("All column diffs have been explained.")
    else explanation
    copy(explainedColumns = newExplainedColumns, explanation = newExplanation)
  }

  def explainColumnsByIdx(columns: (Int, String)*): DelimitedDifferent = {
    val newExplainedColumns = explainedColumns ++ columns.map {
      case (index, reason) => {
        require(index > -1, "colIdx must be greater than -1 to explain a column")
        (compareColDefs.find(_.left.index == index).getOrElse(throw new Error(s"Column at index $index: not found")), reason)}}
    val newExplanation = if (compareColDefs.count(dc => newExplainedColumns.exists(_._1.left.index == dc.left.index)) == compareColDefs.size) Some("All column diffs have been explained.")
    else explanation
    copy(explainedColumns = newExplainedColumns, explanation = newExplanation)
  }

  def explain(explanation: String): DelimitedDifferent = copy(explanation = Option(explanation))
  def characterization(idx: Int): DifferenceCharacterization =
    columnCharacterization.find(_._1.left.index == idx) match {
      case Some(characterization) => characterization._2
      case None => DifferenceCharacterization.UNCHARACTERIZED
    }
}

trait HasResult[N] {val result: TreeResult[N]}

case class InLeftOnlyTree[R](
  left: IndexedRepresentation[R],
  explanation: Option[String] = None)
extends InLeftOnly[IndexedRepresentation[R]] with Explainable[InLeftOnlyTree[R]] {
  def explain(explanation: String) = InLeftOnlyTree(left, Option(explanation))
}

case class InRightOnlyTree[R](
  right: IndexedRepresentation[R],
  explanation: Option[String] = None)
extends InRightOnly[IndexedRepresentation[R]] with Explainable[InRightOnlyTree[R]] {
  def explain(explanation: String) = InRightOnlyTree(right, Option(explanation))
}

case class DifferentTree[R,N](
  left: IndexedRepresentation[R],
  right: IndexedRepresentation[R],
  result: TreeResult[N],
  explanation: Option[String] = None)
extends Different[IndexedRepresentation[R]] with Explainable[DifferentTree[R, N]] with HasResult[N] {
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
extends ValidationPassed[IndexedRepresentation[R]] with Explainable[ValidationPassedTree[R,N]] with HasResult[N] {
  def explain(explanation: String) = ValidationPassedTree(left, right, result, Option(explanation))
}

case class ValidationFailedTree[R,N](
  left: IndexedRepresentation[R],
  right: IndexedRepresentation[R],
  result: TreeResult[N],
  explanation: Option[String] = None)
extends ValidationFailed[IndexedRepresentation[R]] with Explainable[ValidationFailedTree[R,N]] with HasResult[N] {
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
