package com.ms.qaTools

import scala.annotation.tailrec



package object collections {
  /*
   * if condition returns < 0, pair current L1 element with None.
   * if condition returns 0, pair current L1 element with L2 element.
   * if condition returns > 0, pair None with current L2 element.
   */
  def zipWithCondition[J, K](l1: Iterable[J], l2: Iterable[K])(c: (J, K) => Int): Seq[(Option[J], Option[K])] = {
    @tailrec
    def zipWithCondition0(_l1: Iterable[J], _l2: Iterable[K], _accu: Seq[(Option[J], Option[K])]): Seq[(Option[J], Option[K])] = {
      (_l1.toList, _l2.toList) match {
        case (Nil, Nil) => _accu
        case (Nil, x :: xs) => _accu ++ _l2.map { k => (None, Option(k)) }
        case (x :: xs, Nil) => _accu ++ _l1.map { j => (Option(j), None) }
        case (y :: ys, x :: xs) => {
          c(y, x) match {
            case z if (z < 0) => zipWithCondition0(ys, _l2, _accu ++ List((Option(y), None)))
            case 0 => zipWithCondition0(ys, xs, _accu ++ List((Option(y), Option(x))))
            case z if (z > 0) => zipWithCondition0(_l1, xs, _accu ++ List((None, Option(x))))
          }
        }
      }
    }
    zipWithCondition0(l1, l2, Nil)
  }

  def zipAsOption[J, K](l1: Iterable[J], l2: Iterable[K]): Seq[(Option[J], Option[K])] = zipWithCondition(l1, l2) { (j, k) => 0 }

  def mergeMap[A, B](ms: Seq[Map[A, B]])(f: (B, B) => B): Map[A, B] =
    (Map[A, B]() /: (for (m <- ms; kv <- m) yield kv)) { (a, kv) =>
      a + (if (a.contains(kv._1)) kv._1 -> f(a(kv._1), kv._2) else kv)
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
