package com.ms.qaTools.compare
import breeze.optimize.linear.KuhnMunkres
import com.ms.qaTools.AnyUtil
import scala.collection.mutable.Queue

trait Comparator extends Iterator[AbstractDiff] { self =>
  val colDefs: Seq[CompareColDef]

  def explainedBy(explainer: PartialFunction[AbstractDiff, AbstractDiff]): Comparator = new Comparator {
    val completeExplainer = explainer orElse PartialFunction(identity[AbstractDiff])
    val explained         = self.map(completeExplainer)
    def hasNext           = explained.hasNext
    def next              = explained.next
    val colDefs           = self.colDefs
  }
}

trait DiffCounter {
  val left: Int
  val right: Int
  val identical: Int
  val different: Int
  val inLeftOnly: Int
  val inRightOnly: Int
  val explained: Int
  def total = left + right
  def +(t: AbstractDiff): DiffCounter
}

case class DelimitedComparatorCounter(
  left: Int = 0, right: Int = 0, identical: Int = 0, different: Int = 0, inLeftOnly: Int = 0,
  inRightOnly: Int = 0, explained: Int = 0, diffColDefMapCount: Map[CompareColDef, Int] = Map())
extends DiffCounter {
  def +(t: AbstractDiff): DelimitedComparatorCounter = {
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
}

class DefaultRowComparator(left: Iterator[Seq[String]], right: Iterator[Seq[String]], val colDefs: Seq[CompareColDef])
extends Comparator {
  def nextLeftRow = if (left.hasNext) Option(left.next) else None
  def nextRightRow = if (right.hasNext) Option(right.next) else None

  var leftRow:  Option[Seq[String]] = None
  var rightRow: Option[Seq[String]] = None

  def init = {leftRow = nextLeftRow; rightRow = nextRightRow}

  def hasNext = leftRow != None || rightRow != None

  def next =
    if (rightRow == None)
      DelimitedInLeftOnly(leftRow.get, colDefs).withSideEffect(_ => leftRow = nextLeftRow)
    else if (leftRow == None)
      DelimitedInRightOnly(rightRow.get, colDefs).withSideEffect(_ => rightRow = nextRightRow)
    else compareKeys(leftRow.get, rightRow.get) match {
      case c if c < 0 =>
        DelimitedInLeftOnly(leftRow.get, colDefs).withSideEffect(_ => leftRow = nextLeftRow)
      case c if c > 0 =>
        DelimitedInRightOnly(rightRow.get, colDefs).withSideEffect(_ => rightRow = nextRightRow)
      case 0 => {
        val diffColDefs = colDefs.filter(c => !c.isKey && !c.isIgnored && c.compare(leftRow.get, rightRow.get) != 0)
        if (!diffColDefs.isEmpty)
          DelimitedDifferent(leftRow.get, rightRow.get, diffColDefs, colDefs)
        else
          DelimitedIdentical(leftRow.get, rightRow.get)
      }.withSideEffect(_ => {leftRow = nextLeftRow; rightRow = nextRightRow})
    }

  def compareKeys(leftRow: Seq[String], rightRow: Seq[String]): Int = {
    for (colDef <- colDefs.filter(c => c.isKey && !c.isIgnored).sortBy(_.keyOrder)) {
      val compare = colDef.compare(leftRow, rightRow)
      if (compare != 0) return compare
    }
    0
  }
}

class SmartMatchComparator(left: Iterator[Seq[String]], right: Iterator[Seq[String]], colDefs: Seq[CompareColDef], matcher: (String, String, String) => Double)
extends DefaultRowComparator(left, right, colDefs) {
  class Side(val i: Iterator[Seq[String]], val key: Seq[String] => Seq[String]) {
    var currentKey: Option[Seq[String]] = None
    val buffer = Queue[Seq[String]]()
    def nextRow: Option[Seq[String]] =
      if (buffer.nonEmpty)
        Option(buffer.dequeue)
      else if (i.hasNext) {
        currentKey = None
        getChunk(this)
        nextRow
      } else None
  }

  val keyColumns = colDefs.filter(_.isKey).sortBy(_.keyOrder)
  object Left extends Side(left, r => keyColumns.map(c => r(c.indexOpt.get)))
  object Right extends Side(right, r => keyColumns.map(c => r(c.mappedIndex.getOrElse(c.indexOpt.get))))
  override def nextLeftRow = Left.nextRow
  override def nextRightRow = Right.nextRow
  override def init = {
    getChunk(Left); getChunk(Right); super.init}

  val w = (l: Seq[String], r: Seq[String]) =>
    colDefs.flatMap(c => (for(n <- c.nameOpt; i <- c.indexOpt; j <- c.mappedIndex.orElse(c.indexOpt)) yield matcher(n, l(i), r(j)))).sum

  def getChunk(s: Side) = {
    assert(s.buffer.isEmpty)
    s.buffer ++= s.i.takeWhile(row => s.currentKey match {
      case Some(k) => s.key(row) == k
      case None => {s.currentKey = Some(s.key(row)); true}})
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
    explainers: Seq[PartialFunction[AbstractDiff, AbstractDiff]] = Nil,
    matcher: Option[(String, String, String) => Double] = None
  ): Comparator = {
    val c = matcher.map(m => new SmartMatchComparator(left, right, colDefs, m)).getOrElse(new DefaultRowComparator(left, right, colDefs))
    c.init
    val e = explainers.foldLeft(IdentityExplainer: PartialFunction[AbstractDiff, AbstractDiff])(_ andThen _)
    c explainedBy {
      case d: Different[_]   => e(d)
      case d: InLeftOnly[_]  => e(d)
      case d: InRightOnly[_] => e(d)
      case d                 => d
    }
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
