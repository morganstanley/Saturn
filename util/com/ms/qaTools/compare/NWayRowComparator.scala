package com.ms.qaTools.compare

import java.util.{TreeMap => JTreeMap}

import scala.collection.JavaConverters._
import scala.collection.Map
import scala.collection.mutable.ArraySeq
import scala.collection.mutable.{ Map => MutMap }

object NWayRowComparator {
  trait ICounter {
    def sources: Seq[Int]
    def identical: Int
    def different: Int
    def explained: Int
    def explainedRecords: Map[String, Int]
    def explainedFields: Map[NWayCompareColDefMatching, Map[String, Int]]
    def differentFields: Map[NWayCompareColDefMatching, Int]
    def count(diff: DelimitedNWayDiff): Unit
  }

  object ICounter {
    def apply(sourceCount: Int): ICounter = new Counter(sourceCount)
  }

  protected class Counter(sourceCount: Int) extends ICounter {
    val _sources: Array[Int] = Array.fill(sourceCount)(0)
    def sources = _sources
    var identical = 0
    var different = 0
    var explained = 0
    val explainedRecords = MutMap.empty[String, Int].withDefaultValue(0)
    val explainedFields = MutMap.empty[NWayCompareColDefMatching, MutMap[String, Int]]
    val differentFields = MutMap.empty[NWayCompareColDefMatching, Int].withDefaultValue(0)

    def count(diff: DelimitedNWayDiff): Unit = {
      diff.colDefs.collectFirst {
        case c: NWayCompareColDefMatching if c.keyOrder.isDefined => c
      }.orElse {
        diff.colDefs.collectFirst {case c: NWayCompareColDefMatching => c}
      }.foreach { c =>
        for (i <- 0 until c.nameAndIndices.length)
          if (diff.data(i).exists(_ != AtomicMissing)) _sources(i) += 1
      }
      diff.explanation match {
        case Some(e) =>
          explainedRecords(e) += 1
        case None => diff.diffCols.foreach { c =>
          diff.explainedColumns.get(c) match {
            case Some(e) => explainedFields.getOrElseUpdate(c, MutMap.empty.withDefaultValue(0))(e) += 1
            case None    => differentFields(c) += 1
          }
        }
      }
      if (diff.diffCols.isEmpty) identical += 1
      else if (diff.isExplained) explained += 1
      else                       different += 1
    }
  }
}

class NWayRowComparator(sources: Seq[BufferedIterator[Seq[String]]], colDefs: Seq[NWayCompareColDef])
extends Iterator[DelimitedNWayDiff] {
  val sourceCount = sources.length
  require(sources.nonEmpty)
  require(colDefs.forall(_.count == sourceCount), colDefs)

  val keyColumns = colDefs.collect {case c: NWayCompareColDefMatching if !c.keyOrder.isEmpty => c}.sortBy(_.keyOrder)

  val keyOrderings: Map[(BufferedIterator[Seq[String]], BufferedIterator[Seq[String]]), Ordering[Seq[String]]] = {
    val rowssWithIndex = sources.zipWithIndex
    for ((rsx, ix) <- rowssWithIndex; (rsy, iy) <- rowssWithIndex) yield (rsx, rsy) -> {
      new Ordering[Seq[String]] {
        val iit = keyColumns.map(c => (c.nameAndIndices(ix)._2, c.nameAndIndices(iy)._2, c.colType))
        def compare(xs: Seq[String], ys: Seq[String]): Int = {
          for ((ix, iy, t) <- iit) {
            t.compare(xs(ix), ys(iy)) match {
              case 0 =>
              case n => return n
            }
          }
          0
        }
      }
    }
  }.toMap

  def nextRows(): IndexedSeq[Option[Seq[String]]] = {
    val builder = IndexedSeq.newBuilder[Option[Seq[String]]]
    if (keyColumns.isEmpty)
      sources.foreach(rs => builder += (if (rs.hasNext) Some(rs.next()) else None))
    else {
      val mins = (List.empty[BufferedIterator[Seq[String]]] /: sources) {
        case (Nil, rs) if rs.hasNext =>
          rs :: Nil
        case (mins@(min :: _), rs) if rs.hasNext =>
          val n = keyOrderings((rs, min)).compare(rs.head, min.head)
          if (n > 0) mins else if (n < 0) rs :: Nil else rs :: mins
        case (mins, _) =>
          mins
      }.toSet
      sources.foreach(rs => builder += (if (mins(rs)) Some(rs.next()) else None))
    }
    builder.result()
  }

  def foreachCell(c: NWayCompareColDef, rows: IndexedSeq[Option[Seq[String]]])(f: (Int, Int, String) => Unit) =
    for ((i, j) <- c.cellIndices; row <- rows(i)) f(i, j, row(j))

  def hasNext = sources.exists(_.hasNext)

  def next() = {
    val data = ArraySeq.fill(sourceCount, colDefs.length)(AtomicMissing: AtomicDiff[String])
    val rows = nextRows()
    colDefs.foreach {
      case c: NWayCompareColDefMatching =>
        if (c.keyOrder.isEmpty) {
          val maxCounts = {
            val freq = new JTreeMap[String, Int](c.colType).asScala.withDefaultValue(0)
            foreachCell(c, rows)((_, _, s) => freq(s) += 1)
            val kns = freq.iterator
            (List(kns.next()) /: kns) {
              case (kn0@(_, n0) :: _, kn@(_, n)) => if (n > n0) kn :: Nil else if (n < n0) kn0 else kn :: kn0
              case (Nil,              _)         => throw new AssertionError("unreachable code")
            }
          }
          maxCounts match {
            case (identical, _) :: Nil => foreachCell(c, rows) { (i, j, s) =>
              data(i)(j) = if (c.colType.equiv(s, identical)) AtomicIdentical(s) else AtomicDifferent(s)
            }
            case _ =>
              foreachCell(c, rows)((i, j, s) => data(i)(j) = AtomicDifferent(s))
          }
        } else foreachCell(c, rows)((i, j, s) => data(i)(j) = AtomicIdentical(s))
      case c: NWayCompareColDefIgnored =>
        foreachCell(c, rows)((i, j, s) => data(i)(j) = AtomicIgnored(s))
    }
    DelimitedNWayDiff(data, colDefs)
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
