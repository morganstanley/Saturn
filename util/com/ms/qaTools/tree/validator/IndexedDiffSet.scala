package com.ms.qaTools.tree.validator

import java.lang.Thread.UncaughtExceptionHandler
import java.util.concurrent.ArrayBlockingQueue

import scala.concurrent.Await
import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import scala.concurrent.duration.Duration
import scala.util.Try

import com.ms.qaTools.IteratorProxy
import com.ms.qaTools.collections.zipWithCondition
import com.ms.qaTools.compare.AbstractDiff
import com.ms.qaTools.compare.DifferentTree
import com.ms.qaTools.compare.IdenticalTree
import com.ms.qaTools.compare.InLeftOnlyTree
import com.ms.qaTools.compare.InRightOnlyTree
import com.ms.qaTools.compare.ValidationFailedTree
import com.ms.qaTools.compare.ValidationPassedTree
import com.ms.qaTools.io.rowSource.BufferedBlockingRowSource
import com.ms.qaTools.io.rowSource.IndexedRepresentation
import com.ms.qaTools.tree.TreeNode

abstract class IndexedDiffSet[R, N] extends IteratorProxy[AbstractDiff] {
  val left: Iterator[IndexedRepresentation[R]]
  val right: Iterator[IndexedRepresentation[R]]

  def comparator: Comparator[N]

  def inflateLeft(r: R): Option[TreeNode[N]]
  def inflateRight(r: R): Option[TreeNode[N]]

  def stringifyKeys(i: IndexedRepresentation[R]) = i.colDefs.map { c => i.indexed(c.index) }.mkString("_")

  implicit def executor: ExecutionContext = ExecutionContext.global

  protected lazy val self = {
    val futures = new BufferedBlockingRowSource[Future[AbstractDiff]] {
      override val buffer = new ArrayBlockingQueue[BufferedBlockingRowSource.Action[Future[AbstractDiff]]](Runtime.getRuntime.availableProcessors, true)
    }
    val th = new Thread(new Runnable {
      def run() = {
        zipWithCondition(left.buffered, right.buffered) { (l, r) =>
          stringifyKeys(l).compareTo(stringifyKeys(r))
        }.foreach {
          case (l, r) => futures.put(Future(compare(l, r)))
        }
        futures.action(BufferedBlockingRowSource.End)
      }
    })
    th.setUncaughtExceptionHandler(new UncaughtExceptionHandler {
      def uncaughtException(t: Thread, e: Throwable) = futures.fail(e)
    })
    th.start()
    futures.map(Await.result(_, Duration.Inf))
  }

  def compare(leftIndexRep: Option[IndexedRepresentation[R]], rightIndexRep: Option[IndexedRepresentation[R]]): AbstractDiff = {
    (leftIndexRep, rightIndexRep) match {
      case (Some(l), Some(r)) =>
        val result: TreeResult[N] = comparator.compare(inflateLeft(l.representation), inflateRight(r.representation))
        val stats = result.statistics
        if (stats.isValidatedFail)
          ValidationFailedTree(l, r, result)
        else if (stats.hasDifferences)
          DifferentTree(l, r, result)
        else if (stats.isValidatedPass)
          ValidationPassedTree(l, r, result)
        else
          IdenticalTree(l, r, result)
      case (Some(l), None) => InLeftOnlyTree(l)
      case (None, Some(r)) => InRightOnlyTree(r)
      case _               => throw new Exception("No left representation and no right representation provided.")
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
