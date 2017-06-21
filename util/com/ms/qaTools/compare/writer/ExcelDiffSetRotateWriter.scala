package com.ms.qaTools.compare.writer

import java.io.File
import java.io.FileOutputStream

import org.apache.poi.ss.SpreadsheetVersion

import com.ms.qaTools.compare.CompareColDefs
import com.ms.qaTools.compare.DelimitedComparatorCounter
import com.ms.qaTools.compare.DelimitedDifferent
import com.ms.qaTools.compare.DelimitedIdentical
import com.ms.qaTools.compare.DelimitedInLeftOnly
import com.ms.qaTools.compare.DelimitedInRightOnly
import com.ms.qaTools.compare.Diff
import com.ms.qaTools.io.rowSource.file.ExcelWorkBook

class ExcelDiffSetRotateWriter protected (
  workbooks: Iterator[ExcelWorkBook],
  colDefs: CompareColDefs,
  config: ExcelDiffSetRotateWriter.Config)
extends DelimitedDiffSetWriter {
  def writeDifferent(diff: DelimitedDifferent): Unit = writeDiff(diff)
  def writeIdentical(diff: DelimitedIdentical): Unit = writeDiff(diff)
  def writeInLeftOnly(diff: DelimitedInLeftOnly): Unit = writeDiff(diff)
  def writeInRightOnly(diff: DelimitedInRightOnly): Unit = writeDiff(diff)

  override def writeDiff(diff: Diff[Seq[String]]) = synchronized {
    if (row >= config.size) {
      writerAndCounters = (newWriter, newCounter) :: writerAndCounters
      row = 0
    }
    val (w, c) :: xs = writerAndCounters
    w.writeDiff(diff)
    writerAndCounters = (w, c + diff) :: xs
    row += 1
  }

  def writeSummary(counter: DelimitedComparatorCounter) {
    for ((w, c) <- writerAndCounters) w.writeSummary(if (config.separateSummaries) c else counter)
  }

  def writeSummary() {
    require(config.separateSummaries)
    writeSummary(newCounter)
  }

  def writeNotes(notes: Seq[String]) = for ((w, _) <- writerAndCounters) w.writeNotes(notes)

  def close() = for ((w, _) <- writerAndCounters) w.close()

  protected def newWriter  = ExcelDiffSetWriter(workbooks.next, colDefs, config.pageNames, config.omittedPages)
  protected def newCounter = DelimitedComparatorCounter()

  protected var row = 0
  protected var writerAndCounters = List((newWriter, newCounter))
}

object ExcelDiffSetRotateWriter {
  case class Config(prefix: String                = "diff",
                    names: () => Iterator[String] = () => Iterator.from(1).map(_.toString),
                    version: SpreadsheetVersion   = SpreadsheetVersion.EXCEL2007,
                    size: Int                     = 100000,
                    separateSummaries: Boolean    = true,
                    pageNames: Map[Page, String]  = PageNames(),
                    omittedPages: Seq[Page]       = Nil) {
    require(size > 0)
  }

  def apply(dir: File, colDefs: CompareColDefs, config: Config = Config()) = {
    require(dir.isDirectory || dir.mkdirs, s"Unable to create directory ${dir.getCanonicalPath}")
    val workbooks = config.names() map { i =>
      val suf = config.version match {
        case SpreadsheetVersion.EXCEL2007 => ".xlsx"
        case SpreadsheetVersion.EXCEL97   => ".xls"
        case unknown                      => throw new IllegalArgumentException(s"Unknown Excel version $unknown")
      }
      val file = new File(dir, config.prefix + i + suf).ensuring(!_.exists)
      ExcelWorkBook(new FileOutputStream(file), config.version == SpreadsheetVersion.EXCEL2007)
    }
    new ExcelDiffSetRotateWriter(workbooks, colDefs, config)
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
