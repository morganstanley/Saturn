package com.ms.qaTools.compare.writer

import com.ms.qaTools.compare.AbstractDiff
import com.ms.qaTools.compare.CompareColDef
import com.ms.qaTools.compare.CompareColDefs
import com.ms.qaTools.compare.Counter
import com.ms.qaTools.compare.DelimitedComparatorCounter
import com.ms.qaTools.compare.DelimitedDifferent
import com.ms.qaTools.compare.DelimitedIdentical
import com.ms.qaTools.compare.DelimitedInLeftOnly
import com.ms.qaTools.compare.DelimitedInRightOnly
import com.ms.qaTools.compare.Diff
import com.ms.qaTools.compare.Different
import com.ms.qaTools.compare.HasLeft
import com.ms.qaTools.compare.HasRight
import com.ms.qaTools.compare.Identical
import com.ms.qaTools.compare.InLeftOnly
import com.ms.qaTools.compare.InRightOnly
import com.ms.qaTools.compare.ValidationFailed
import com.ms.qaTools.compare.ValidationPassed
import com.ms.qaTools.io.rowSource.ColumnOrdering
import com.ms.qaTools.io.CountingWriter
import com.ms.qaTools.io.Writer

trait SortedColumns {
  val colDefs: CompareColDefs
  lazy val (sortedLeftColumns, sortedRightColumns, sortedCompareColumns) = {
    val (unorderedKeys, rest) = colDefs.cols.partition(col => col.left.isKey && !col.ignored)
    val keys = unorderedKeys.sortBy(_.left.keyOrder)
    val (ignoredCols, matchedCols) = rest.partition(_.ignored)
    val ordered = (keys ++ matchedCols.sortBy(_.left.index) ++ ignoredCols).toList
    val colPairs = ordered.map{case CompareColDef(l, r, i) => (Some(l), Some(r), i)} ++ colDefs.missing.map(l => (Some(l), None, true)) ++ colDefs.extra.map(r => (None, Some(r), true))
    (ordered.map(c => (c.left, true)) ++ colDefs.missing.map(c => (c, false)), ordered.map(c => (c.right, true)) ++ colDefs.extra.map(c => (c, false)), colPairs)
  }
}

trait DiffSetWriter[A <: AbstractDiff, B <: Counter[A, B]] extends CountingWriter[A, B] {
  def writeDiff(diff: A): Unit

  def writeSummary(counter: B): Unit
  def writeNotes(notes: Seq[String] = Seq()): Unit

  def getStatus(d: A) =
    d match {
      case i: InLeftOnly[A]        => "IL"
      case r: InRightOnly[A]       => "IR"
      case d: Different[A]         => "D"
      case i: Identical[A]         => "I"
      case vp: ValidationPassed[A] => "VP"
      case vf: ValidationFailed[A] => "VF"
    }

  def write(source: Iterator[A]): Int =
    source.foldLeft(0)((count, diff) => {writeDiff(diff); count + 1})

  def write(source: Iterator[A], c: B): B =
    source.foldLeft(c)((counter, diff) => {writeDiff(diff); counter + diff})
}

trait DelimitedDiffSetWriter extends DiffSetWriter[Diff[Seq[String]], DelimitedComparatorCounter] {
  def writeIdentical(diff: DelimitedIdentical): Unit
  def writeDifferent(diff: DelimitedDifferent): Unit
  def writeInLeftOnly(diff: DelimitedInLeftOnly): Unit
  def writeInRightOnly(diff: DelimitedInRightOnly): Unit

  def writeDiff(diff: Diff[Seq[String]]) = diff match {
    case d: DelimitedIdentical   => writeIdentical(d)
    case d: DelimitedDifferent   => writeDifferent(d)
    case d: DelimitedInLeftOnly  => writeInLeftOnly(d)
    case d: DelimitedInRightOnly => writeInRightOnly(d)
    case d => sys.error("DelimitedDiffSetWriter doesn't support " + d.getClass.getName)
  }
}

class DiffSetWriters(writers: Seq[DelimitedDiffSetWriter]) extends DelimitedDiffSetWriter {
  def writeIdentical(diff: DelimitedIdentical)          = writers.foreach(_.writeIdentical(diff))
  def writeDifferent(diff: DelimitedDifferent)          = writers.foreach(_.writeDifferent(diff))
  def writeInLeftOnly(diff: DelimitedInLeftOnly)        = writers.foreach(_.writeInLeftOnly(diff))
  def writeInRightOnly(diff: DelimitedInRightOnly)      = writers.foreach(_.writeInRightOnly(diff))
  def writeSummary(counter: DelimitedComparatorCounter) = writers.foreach(_.writeSummary(counter))
  def writeNotes(notes: Seq[String])                    = writers.foreach(_.writeNotes(notes))
  def close()                                           = writers.foreach(_.close())
}

class GroupedKeysDiffSetWriter(cols: Seq[CompareColDef], inner: DelimitedDiffSetWriter) extends DelimitedDiffSetWriter {
  val ord = ColumnOrdering(cols.collect{case c if c.left.isKey => c.left}.sortBy(_.keyOrder))

  protected def eitherSide(d: Diff[Seq[String]]) = d match {
    case d: HasLeft[_]  => d.left
    case d: HasRight[_] => d.right
  }

  override def write(source: Iterator[Diff[Seq[String]]]) =
    _write(source, 0, (c: Int, _: Diff[Seq[String]]) => c + 1)

  override def write(source: Iterator[Diff[Seq[String]]], c: DelimitedComparatorCounter): DelimitedComparatorCounter =
    _write(source, c, (c: DelimitedComparatorCounter, d: Diff[Seq[String]]) => c + d)

  def _write[A](source: Iterator[Diff[Seq[String]]], c: A, f: (A, Diff[Seq[String]]) => A): A =
    if(! source.hasNext)
      c
    else {
      import com.ms.qaTools.compare.Utils.diffToDelimitedDifferent

      val head = source.next
      val (sameKey, differentKey) = source.span(d => ord.compare(eitherSide(d), eitherSide(head)) == 0)
      val l = head :: sameKey.toList
      val new_c = l.foldLeft(c){(c, d) =>
        if(l.map(_.getClass).distinct.size == 1) inner.writeDiff(d) else inner.writeDifferent(diffToDelimitedDifferent(d))
        f(c, d)
      }
      _write(differentKey, new_c, f)
    }

  def writeIdentical(diff: DelimitedIdentical) = ???
  def writeDifferent(diff: DelimitedDifferent) = ???
  def writeInLeftOnly(diff: DelimitedInLeftOnly) = ???
  def writeInRightOnly(diff: DelimitedInRightOnly) = ???

  def writeSummary(counter: DelimitedComparatorCounter) = inner.writeSummary(counter)
  def writeNotes(notes: Seq[String] = Nil) = inner.writeNotes(notes)
  override def writeDiff(diff: Diff[Seq[String]]) = ???
  def close() = inner.close
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
