package com.ms.qaTools.tree.validator

import com.ms.qaTools.AnyUtil
import com.ms.qaTools.compare.AbstractDiff
import com.ms.qaTools.compare.DiffSet
import com.ms.qaTools.compare.DiffSetCounter
import com.ms.qaTools.compare.DifferentTree
import com.ms.qaTools.compare.HasDiffSetCounter
import com.ms.qaTools.compare.IdenticalTree
import com.ms.qaTools.compare.InLeftOnlyTree
import com.ms.qaTools.compare.InRightOnlyTree
import com.ms.qaTools.compare.ValidationFailedTree
import com.ms.qaTools.compare.ValidationPassedTree
import com.ms.qaTools.io.rowSource.IndexedRepresentation
import com.ms.qaTools.tree.TreeNode

import scalaz.syntax.std.boolean.ToBooleanOpsFromBoolean

trait IndexedDiffSet[R, N] extends DiffSet[IndexedRepresentation[R]] with HasDiffSetCounter {
  val toNode: R => TreeNode[N]
  val comparator: Comparator[N]

  private[this] var leftCurrent: Option[IndexedRepresentation[R]] = None
  private[this] var rightCurrent: Option[IndexedRepresentation[R]] = None

  val diffSetCounter: DiffSetCounter = new DiffSetCounter

  private def stringifyKeys(i: IndexedRepresentation[R]) = i.colDefs.map { _.name }.mkString("_")

  def resetLeft = leftCurrent = None
  def resetRight = rightCurrent = None
  def resetBoth = { resetLeft; resetRight }

  val compare: PartialFunction[(Option[IndexedRepresentation[R]], Option[IndexedRepresentation[R]]), Option[AbstractDiff]] = {
    case (Some(l), Some(r)) => {
      val (eDocStringifiedKeys, aDocStringifiedKeys) = (stringifyKeys(l), stringifyKeys(r))
      val comparison = eDocStringifiedKeys.compareTo(aDocStringifiedKeys)
      if (comparison < 0)
        Option(InLeftOnlyTree(l).withSideEffect { _ => resetLeft })
      else if (comparison == 0) {
        val result: TreeResult[N] = comparator.compare(Option(toNode(l.representation)), Option(toNode(r.representation)))
        val stats = result.statistics
        stats.isValidatedFail option ValidationFailedTree(l, r, result) orElse {
          stats.hasDifferences option DifferentTree(l, r, result) orElse {
            stats.isValidatedPass option ValidationPassedTree(l, r, result) orElse {
              stats.isIdentical option IdenticalTree(l, r, result)
            }
          }
        } withSideEffect { _ => resetBoth }
      }
      else
        Option(InRightOnlyTree(r).withSideEffect { _ => resetRight })
    }
    case (Some(l), None) => Option(InLeftOnlyTree(l).withSideEffect { _ => resetLeft })
    case (None, Some(r)) => Option(InRightOnlyTree(r).withSideEffect { _ => resetRight })
    case _               => None
  }

  def next: AbstractDiff = {
    leftCurrent = (leftCurrent.isEmpty && left.hasNext) option left.next
    rightCurrent = (rightCurrent.isEmpty && right.hasNext) option right.next
    compare(leftCurrent, rightCurrent).withSideEffect { d => d.foreach { diffSetCounter.addDiffCount(_) } }.getOrElse(throw new Exception("Could not get a diff."))
  }
}

trait HasIndexedDiffSet[T1, T2] {
  val diffSet: IndexedDiffSet[T1, T2]
  def isIdentical = (diffCounter.identical == diffCounter.right) && (diffCounter.identical == diffCounter.left)
  def passes = diffCounter.identical + diffCounter.validationPassed
  def failures = diffCounter.different + diffCounter.inLeftOnly + diffCounter.inRightOnly + diffCounter.validationFailed
  def diffCounter = diffSet.diffSetCounter
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
