package com.ms.qaTools.compare.writer.tree
import com.ms.qaTools.compare.AbstractDiff
import com.ms.qaTools.compare.HasResult
import com.ms.qaTools.io.rowSource.IndexedRepresentation
import com.ms.qaTools.tree.validator._

class ConsoleDiffSetWriter[D](printDocs: Boolean = false) extends TreeDiffSetWriter[D] {
  val separator = Array.fill(80)("-").mkString

  def close = ()

  def writeDiff(diff: AbstractDiff) = {
    println(separator)
    val (expectedDesc, expectedDoc) = leftIndexedRepresentation(diff).fold(("", "")) { l =>
      (s"Expected Doc: (keys: ${describe(l)})", s"[Expected:\n${l.prettyPrint}]")
    }
    val (actualDesc, actualDoc) = rightIndexedRepresentation(diff).fold(("", "")) { r =>
      (s"Actual Doc: (keys: ${describe(r)})", s"[Actual:\n${r.prettyPrint}]")
    }
    Console.println(s"[$expectedDesc, $actualDesc]: ${getStatus(diff)}")
    diff match {
      case h: HasResult[_] => printResult(h.result.asInstanceOf[TreeResult[D]])
      case _               =>
    }
    if (printDocs) println(s"Representations: ${expectedDoc}\n${actualDoc}")
    println(separator)
  }

  def writeSummary(counter: TreeNodeCounter) = {
    println(separator)
    println("Datasets Summary:")
    println(s"Left: ${counter.left}")
    println(s"Right: ${counter.right}")
    println("Comparison Summary:")
    println(s"Different: ${counter.different}")
    println(s"In Left Only: ${counter.inLeftOnly}")
    println(s"In Right Only: ${counter.inRightOnly}")
    println(s"Validated Fail: ${counter.validatedFail}")
    println(s"Validated Pass: ${counter.validatedPass}")
    println(s"Explained: ${counter.explained}")
    println(s"Identical: ${counter.identical}")
  }

  def writeNotes(notes: Seq[String] = Nil) = ()

  protected def describe(rep: IndexedRepresentation[D]): String =
    rep.colDefs.zip(rep.indexed).map { p => p._1.name + ": " + p._2 }.mkString("[", ", ", "]")

  protected def printResult(result: TreeResult[D]) = {
    val stats = result.statistics
    for {
      ds <- Array(stats.different.toSeq.sorted,
                  stats.inLeftOnly.toSeq.sorted,
                  stats.inRightOnly.toSeq.sorted,
                  stats.validationPassed.toSeq.sorted,
                  stats.validationFailed.toSeq.sorted)
      d <- ds
    } println("|->" + d.mkString)
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
