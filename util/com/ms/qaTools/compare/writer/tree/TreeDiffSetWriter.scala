package com.ms.qaTools.compare.writer.tree
import java.lang.Boolean
import scala.annotation.tailrec
import com.ms.qaTools.compare.writer.DiffSetWriter
import com.ms.qaTools.tree.validator._

trait TreeDiffSetWriter[D] extends DiffSetWriter {
  val serializer: D => String

  type AllDiffsTuple5 = (Seq[DifferentTreeNodeDiff[D]], Seq[InLeftTreeNodeDiff[D]], Seq[InRightTreeNodeDiff[D]], Seq[ValidationPassedTreeNodeDiff[D]], Seq[ValidationFailedTreeNodeDiff[D]])

  def sort(a: AbstractTreeNodeDiff, b: AbstractTreeNodeDiff): Boolean =
    (a, b) match {
      case (j: HasExpected[_], k: HasExpected[_]) => j.expected.path < k.expected.path
      case (j: HasActual[_], k: HasActual[_]) => j.actual.path < k.actual.path
    }

  def emptyAllDiffsTuple5 = (Seq(), Seq(), Seq(), Seq(), Seq())

  @tailrec
  final def buildLists(diffs: Seq[AbstractTreeNodeDiff], lists: AllDiffsTuple5 = emptyAllDiffsTuple5): AllDiffsTuple5 = {
    if (diffs.isEmpty) lists
    else {
      diffs.head match {
        case d: DifferentTreeNodeDiff[D] =>
          buildLists(diffs.tail, (lists._1 :+ d, lists._2, lists._3, lists._4, lists._5))
        case d: InLeftTreeNodeDiff[D] =>
          buildLists(diffs.tail, (lists._1, lists._2 :+ d, lists._3, lists._4, lists._5))
        case d: InRightTreeNodeDiff[D] =>
          buildLists(diffs.tail, (lists._1, lists._2, lists._3 :+ d, lists._4, lists._5))
        case d: ValidationPassedTreeNodeDiff[D] =>
          buildLists(diffs.tail, (lists._1, lists._2, lists._3, lists._4 :+ d, lists._5))
        case d: ValidationFailedTreeNodeDiff[D] =>
          buildLists(diffs.tail, (lists._1, lists._2, lists._3, lists._4, lists._5 :+ d))
        case d: IdenticalTreeNodeDiff[D] =>
          buildLists(diffs.tail, (lists._1, lists._2, lists._3, lists._4, lists._5))
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
