package com.ms.qaTools

import scala.collection.AbstractIterator

package object collections {
  /*
   * if condition returns < 0, pair current L1 element with None.
   * if condition returns 0, pair current L1 element with L2 element.
   * if condition returns > 0, pair None with current L2 element.
   */
  def zipWithCondition[J, K](l1: Iterable[J], l2: Iterable[K])(c: (J, K) => Int): Seq[(Option[J], Option[K])] =
    zipWithCondition(l1.iterator.buffered, l2.iterator.buffered)(c).toSeq

  def zipWithCondition[A, B](xs: BufferedIterator[A],
                             ys: BufferedIterator[B])(cmp: (A, B) => Int): Iterator[(Option[A], Option[B])] =
    new AbstractIterator[(Option[A], Option[B])] {
      def hasNext = xs.hasNext || ys.hasNext

      def next() = if (xs.hasNext) {
        if (ys.hasNext) cmp(xs.head, ys.head) match {
          case c if c < 0 => (Option(xs.next()), None)
          case c if c > 0 => (None, Option(ys.next()))
          case _          => (Option(xs.next()), Option(ys.next()))
        } else {
          (Option(xs.next()), None)
        }
      } else {
        if (ys.hasNext) (None, Option(ys.next()))
        else Iterator.empty.next()
      }
    }

  def zipAsOption[J, K](l1: Iterable[J], l2: Iterable[K]): Seq[(Option[J], Option[K])] = zipWithCondition(l1, l2) { (j, k) => 0 }

  def mergeMap[A, B](ms: Seq[Map[A, B]])(f: (B, B) => B): Map[A, B] =
    (Map[A, B]() /: (for (m <- ms; kv <- m) yield kv)) { (a, kv) =>
      a + (if (a.contains(kv._1)) kv._1 -> f(a(kv._1), kv._2) else kv)
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
