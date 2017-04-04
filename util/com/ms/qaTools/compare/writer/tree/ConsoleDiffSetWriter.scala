package com.ms.qaTools.compare.writer.tree
import com.ms.qaTools.compare.AbstractDiff
import com.ms.qaTools.compare.DiffCounter
import com.ms.qaTools.compare.HasLeft
import com.ms.qaTools.compare.HasResult
import com.ms.qaTools.compare.HasRight
import com.ms.qaTools.io.rowSource.IndexedRepresentation
import com.ms.qaTools.tree.validator._
import java.io.File
import java.lang.Boolean

class ConsoleDiffSetWriter[D](printDocs: Boolean = false, val serializer: D => String) extends TreeDiffSetWriter[D] {
  val separator = Array.fill(80)("-").mkString

  def close = ()

  def writeDiff(diff: AbstractDiff) = {
    val documentBuilder = new StringBuilder
    println(separator)
    val (expectedDesc, expectedDoc) = diff match {
      case hl: HasLeft[IndexedRepresentation[D]] => {
        val d = "Expected Doc: (keys: %s)".format(describe(hl.left))
        if (printDocs) (d, s"[Expected:\n${serializer(hl.left.representation)}]")
        else (d, "")
      }
      case _ => ("", "")
    }
    val (actualDesc, actualDoc) = diff match {
      case hr: HasRight[IndexedRepresentation[D]] => {
        val d = "Actual Doc: (keys: %s)".format(describe(hr.right))
        if (printDocs) (d, s"[Actual:\n${serializer(hr.right.representation)}]")
        else (d, "")
      }
      case _ => ("", "")
    }
    val status = getStatus(diff)
    Console.println("[%s, %s]: %s".format(expectedDesc, actualDesc, status))
    diff match {
      case h: HasResult[_] => printResult(h.result)
      case _               =>
    }
    if (printDocs) println(s"Representations: ${expectedDoc}\n${actualDoc}")
    println(separator)
  }

  def writeSummary(counter: DiffCounter) = ()
  def writeNotes(notes: Seq[String] = Nil) = ()

  protected def describe(rep: IndexedRepresentation[D]): String =
    rep.colDefs.zip(rep.indexed).map { p => p._1.name + ": " + p._2 }.mkString("[", ", ", "]")

  protected def printResult(result: TreeResult[_]) = {
    val stats = result.statistics
    val expectedDiffs = stats.expectedDiffs
    val actualDiffs = stats.actualDiffs
    val (d, il, ir, vp, vf) = buildLists((expectedDiffs ++ actualDiffs).toSeq.distinct)
    (d.sortWith(sort) ++ il.sortWith(sort) ++ ir.sortWith(sort) ++ vp.sortWith(sort) ++ vf.sortWith(sort)).foreach(d => println("|->" + d.mkString))
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
