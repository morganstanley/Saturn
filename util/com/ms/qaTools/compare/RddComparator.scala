package com.ms.qaTools.compare

import scala.reflect.ClassTag

import org.apache.spark.rdd.RDD

import breeze.optimize.linear.KuhnMunkres

object RddComparator extends Serializable {
  trait Comparator[A] extends Serializable {
    def identicalThreshold: Double
    def distance(l: A, r: A): Double
  }

  class DefaultComparator[A] extends Comparator[A] {
    def identicalThreshold: Double = 1e-6
    def distance(l: A, r: A): Double = if (l == r) 0 else 1
  }

  def compare[K : ClassTag, V : ClassTag : Comparator]
             (left: RDD[(K, V)], right: RDD[(K, V)]): RDD[(K, Iterable[Diff[V]])] = left.cogroup(right).mapValues {
    case (ls, rs) => if (ls.isEmpty) rs.map(Diff.InRightOnly(_)) else if (rs.isEmpty) ls.map(Diff.InLeftOnly(_)) else {
      val lArr = ls.toArray
      val rArr = rs.toArray
      val dists = lArr.map(l => rArr.map(r => implicitly[Comparator[V]].distance(l, r)).toSeq)
      val (matching, _) = KuhnMunkres.extractMatching(dists)
      val matched = Array.ofDim[Boolean](rArr.length)
      val diffs = Array.newBuilder[Diff[V]]
      diffs.sizeHint(lArr.length max rArr.length)
      (0 until lArr.length.min(matching.length)).foreach { i =>
        val j = matching(i)
        diffs += {
          if (j < 0) Diff.InLeftOnly(lArr(i)) else {
            matched(j) = true
            if (dists(i)(j) < implicitly[Comparator[V]].identicalThreshold) Diff.Identical(lArr(i), rArr(j))
            else Diff.Different(lArr(i), rArr(j))
          }
        }
      }
      (matching.length until lArr.length).foreach(i => diffs += Diff.InLeftOnly(lArr(i)))
      matched.indices.foreach(i => if (!matched(i)) diffs += Diff.InRightOnly(rArr(i)))
      diffs.result()
    }
  }

  def compareDelimited(colDefs: Seq[CompareColDef], left: RDD[Seq[String]], right: RDD[Seq[String]]): RDD[Diff[Seq[String]]] = {
    val cols = new Comparator.Columns(colDefs)
    def diffCols(l: Seq[String], r: Seq[String]) = cols.nonKeyCols.iterator.filter(_.compare(l, r) != 0)
    implicit val cmp = new DefaultComparator[Seq[String]] {
      override def distance(l: Seq[String], r: Seq[String]) = diffCols(l, r).size
    }
    compare(left.map(row => (cols.keyCols.map(c => row(c.left.index)), row)),
            right.map(row => (cols.keyCols.map(c => row(c.right.index)), row))).persist().flatMap {
      case (_, diffs) => diffs.map {
        case diff: Identical[Seq[String]] => DelimitedIdentical(diff.left, diff.right)
        case diff: InLeftOnly[Seq[String]] => DelimitedInLeftOnly(diff.left, cols.leftCols)
        case diff: InRightOnly[Seq[String]] => DelimitedInRightOnly(diff.right, cols.rightCols)
        case diff: Different[Seq[String]] =>
          DelimitedDifferent(diff.left, diff.right, diffCols(diff.left, diff.right).toBuffer, cols.columnDefinitions)
        case diff => sys.error(s"unexpected: `$diff`") // TODO refactor so that problem is caught at compile time instead
      }
    }
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
