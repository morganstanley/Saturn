package com.ms.qaTools.compare

import java.io.Externalizable
import java.io.ObjectInput
import java.io.ObjectOutput
import java.io.StringWriter

import scala.collection.AbstractIterator
import scala.collection.mutable.Queue

import com.ms.qaTools.AnyUtil
import com.ms.qaTools.io.rowSource.ColumnDefinition

import breeze.optimize.linear.KuhnMunkres

abstract class Comparator extends AbstractIterator[Diff[Seq[String]]] { self =>
  val colDefs: Seq[CompareColDef]

  protected lazy val columns = new Comparator.Columns(colDefs)
  protected def columnDefinitions = columns.columnDefinitions
  protected def keyCols = columns.keyCols
  protected def nonKeyCols = columns.nonKeyCols
  protected def leftCols = columns.leftCols
  protected def rightCols = columns.rightCols

  lazy val columnOrdering = new Ordering[Seq[String]] {
    private[this] val sorted = keyCols.sortBy(_.keyOrder)
    def compare(l: Seq[String], r: Seq[String]) = sorted.iterator.map(_.compare(l, r)).find(_ != 0).getOrElse(0)
  }

  def explainedBy(explainer: PartialFunction[Diff[Seq[String]], Diff[Seq[String]]]): Comparator = new Comparator {
    val completeExplainer = explainer orElse PartialFunction(identity[Diff[Seq[String]]])
    val explained         = self.map(completeExplainer)
    def hasNext           = explained.hasNext
    def next              = explained.next
    val colDefs           = self.colDefs
  }

  def compareKeys(l: Seq[String], r: Seq[String]): Int = columnOrdering.compare(l, r)
}

trait Counter[U, T <: Counter[U, T]] {
  val left: Int
  val right: Int
  val identical: Int
  val different: Int
  val inLeftOnly: Int
  val inRightOnly: Int
  val explained: Int
  def total = left + right
  def +(t: U): T
}

trait DiffCounter extends Counter[AbstractDiff, DiffCounter]

object DelimitedComparatorCounter {
  implicit val isMonoid = new scalaz.Monoid[DelimitedComparatorCounter] with Externalizable {
    def zero = DelimitedComparatorCounter()
    def append(x: DelimitedComparatorCounter, y: => DelimitedComparatorCounter) = {
      import scalaz.Scalaz._
      DelimitedComparatorCounter(x.left + y.left, x.right + y.right,
                                 x.identical + y.identical, x.different + y.different,
                                 x.inLeftOnly + y.inLeftOnly, x.inRightOnly + y.inRightOnly,
                                 x.explained + y.explained, x.diffColDefMapCount |+| y.diffColDefMapCount)
    }

    def writeExternal(out: ObjectOutput) = ()
    def readExternal(in: ObjectInput) = ()
  }
}

case class DelimitedComparatorCounter(
  left: Int = 0, right: Int = 0, identical: Int = 0, different: Int = 0, inLeftOnly: Int = 0,
  inRightOnly: Int = 0, explained: Int = 0, diffColDefMapCount: Map[CompareColDef, Int] = Map())
extends Counter[Diff[Seq[String]], DelimitedComparatorCounter] {
  def +(t: Diff[Seq[String]]) = {
    val self = this
    t match {
      case d: Identical[_]       => self.copy(left = left + 1, right = right + 1, identical = identical + 1)
      case d: DelimitedDifferent => {
        val newDiffColDefMapCount = d.compareColDefs.foldLeft(diffColDefMapCount)((map, colDef) => map + (colDef -> (map.getOrElse(colDef, 0) + 1)))
        if (d.isExplained) self.copy(left = left + 1, right = right + 1, explained = explained + 1, diffColDefMapCount = newDiffColDefMapCount)
        else self.copy(left = left + 1, right = right + 1, different = different + 1, diffColDefMapCount = newDiffColDefMapCount)
      }
      case d: InLeftOnly[_]      => if (d.isExplained) self.copy(left = left + 1, explained = explained + 1)
                                    else self.copy(left = left + 1, inLeftOnly = inLeftOnly + 1)
      case d: InRightOnly[_]     => if(d.isExplained) self.copy(right = right + 1, explained = explained + 1)
                                    else self.copy(right = right + 1, inRightOnly = inRightOnly + 1)
      case _                     => this
    }
  }

  def userFriendlyString: String = {
    val outWriter = new StringWriter
    outWriter.write("Left Row Count:         " + left + "\n")
    outWriter.write("Right Row Count:        " + right + "\n")
    outWriter.write("Different Row Count:    " + different + "\n")
    outWriter.write("In Left Only Row Count: " + inLeftOnly + "\n")
    outWriter.write("In Right Only Row Count:" + inRightOnly + "\n")
    outWriter.write("Explained Row Count:    " + explained + "\n")
    outWriter.write("Identical Row Count:    " + identical + "\n")
    outWriter.toString
  }
}

class DefaultRowComparator(left: Iterator[Seq[String]], right: Iterator[Seq[String]], val colDefs: Seq[CompareColDef])
extends Comparator {
  def nextLeftRow(): Unit  = if(l.nonEmpty) l.dequeue
  def nextRightRow(): Unit = if(r.nonEmpty) r.dequeue
  val l = Queue[Seq[String]]()
  val r = Queue[Seq[String]]()

  def leftRow()  = l.headOption
  def rightRow() = r.headOption

  def refill() = {
    if(l.isEmpty && left.hasNext)  l.enqueue(left.next)
    if(r.isEmpty && right.hasNext) r.enqueue(right.next)}

  def hasNext = {refill; leftRow != None || rightRow != None}

  def next = (leftRow, rightRow) match {
    case (Some(l), None) =>
      DelimitedInLeftOnly(l, leftCols).withSideEffect(_ => nextLeftRow)
    case (None, Some(r)) =>
      DelimitedInRightOnly(r, rightCols).withSideEffect(_ => nextRightRow)
    case (Some(l), Some(r)) => compareKeys(l, r) match {
      case c if c < 0 =>
        DelimitedInLeftOnly(l, leftCols).withSideEffect(_ => nextLeftRow)
      case c if c > 0 =>
        DelimitedInRightOnly(r, rightCols).withSideEffect(_ => nextRightRow)
      case 0 => {
        val diffColDefs = nonKeyCols.filter(_.compare(l, r) != 0)
        if (!diffColDefs.isEmpty)
          DelimitedDifferent(l, r, diffColDefs, columnDefinitions)
        else
          DelimitedIdentical(l, r)
      }.withSideEffect(_ => {nextLeftRow; nextRightRow})
    }
    case (None, None) => Iterator.empty.next
  }
}

class SmartMatchComparator(left: Iterator[Seq[String]], right: Iterator[Seq[String]], colDefs: Seq[CompareColDef], matcher: (String, String, String) => Double)
extends DefaultRowComparator(left, right, colDefs) {
  class Side(var i: Iterator[Seq[String]], val key: Seq[String] => Seq[String]) {
    def currentKey = buffer.headOption.map(row => key(row))
    val buffer = Queue[Seq[String]]()
    def refill = if(buffer.isEmpty && i.hasNext) getChunk(this) else ()
  }

  override def nextLeftRow  = if (Left.buffer.nonEmpty)  Left.buffer.dequeue  else ()
  override def nextRightRow = if (Right.buffer.nonEmpty) Right.buffer.dequeue else ()
  override def leftRow  = Left.buffer.headOption
  override def rightRow = Right.buffer.headOption

  override def hasNext = {Left.refill; Right.refill; Left.buffer.nonEmpty || Right.buffer.nonEmpty}

  val keyColumns = colDefs.filter(_.left.isKey).sortBy(_.left.keyOrder)
  object Left extends Side(left, r => keyColumns.map(c => r(c.left.index)))
  object Right extends Side(right, r => keyColumns.map(c => r(c.right.index)))

  val w = (l: Seq[String], r: Seq[String]) =>
    colDefs.filterNot(_.ignored).map(c => matcher(c.left.name, l(c.left.index), r(c.right.index))).sum

  def enqueueWhile(i: Iterator[Seq[String]], p: Seq[String] => Boolean, q: Queue[Seq[String]]): Iterator[Seq[String]] =
    if(i.hasNext) {
      val j = i.next
      if(p(j)) enqueueWhile(i, p, q.withSideEffect(_.enqueue(j))) else Iterator(j) ++ i
    } else i

  def getChunk(s: Side) = {
    assert(s.buffer.isEmpty)
    s.i = enqueueWhile(s.i, (row: Seq[String]) => s.currentKey.map(_ == s.key(row)).getOrElse(true), s.buffer)
    (Left.currentKey, Right.currentKey) match {
      case (Some(lk), Some(rk)) if lk == rk => {
        val (l, r) = sortSubsets(Left.buffer, Right.buffer, w)
        Left.buffer.clear
        Left.buffer ++= l
        Right.buffer.clear
        Right.buffer ++= r
      }
      case _ => ()}
  }

  // minimum weighted bipartite matching
  def sortSubsets(l: Queue[Seq[String]], r: Queue[Seq[String]], w: (Seq[String], Seq[String]) => Double): (Seq[Seq[String]], Seq[Seq[String]]) = {
    val costs = for(x <- l) yield for (y <- r) yield w(x, y)
    val (matching, _) = KuhnMunkres.extractMatching(costs)
    val rMap = collection.mutable.Map(r.zipWithIndex.map(_.swap): _*)
    val (matched, unmatched) = matching.zipWithIndex.partition{case (v, i) => v != -1}
    val (newL, newR) = (for ((i, j) <- matched ++ unmatched) yield
      (util.Try(l(j)), rMap.remove(i))).unzip
    (newL.flatMap(_.toOption), newR.flatten ++ rMap.values.toSeq)
  }
}

object Comparator {
  def apply(
    left: Iterator[Seq[String]],
    right: Iterator[Seq[String]],
    colDefs: Seq[CompareColDef],
    explainers: Seq[PartialFunction[Diff[Seq[String]], Diff[Seq[String]]]] = Nil,
    matcher: Option[(String, String, String) => Double] = None
  ): Comparator = {
    val c = matcher.map(m => new SmartMatchComparator(left, right, colDefs, m)).getOrElse(new DefaultRowComparator(left, right, colDefs))
    val e = explainers.foldLeft(IdentityExplainer[Diff[Seq[String]]]: PartialFunction[Diff[Seq[String]], Diff[Seq[String]]])(_ andThen _)
    c explainedBy {
      case d: Different[_]   => e(d)
      case d: InLeftOnly[_]  => e(d)
      case d: InRightOnly[_] => e(d)
      case d                 => d
    }
  }

  class Columns(colDefs: Seq[CompareColDef]) extends Serializable {
    val columnDefinitions: Seq[ColumnDefinition] = colDefs.map {
      case ExtraCompareColDef(right) => right
      case hasLeft                   => hasLeft.left
    }
    val (keyCols, nonKeyCols) = colDefs.filter(!_.ignored).partition(_.isKey)
    val leftCols = colDefs.filter(!_.isInstanceOf[ExtraCompareColDef])
    val rightCols = colDefs.filter(!_.isInstanceOf[MissingCompareColDef])
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
