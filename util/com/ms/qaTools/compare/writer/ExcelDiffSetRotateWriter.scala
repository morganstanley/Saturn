package com.ms.qaTools.compare.writer

import java.io.File
import java.io.FileOutputStream

import org.apache.poi.ss.SpreadsheetVersion

import com.ms.qaTools.compare.AbstractDiff
import com.ms.qaTools.compare.CompareColDef
import com.ms.qaTools.compare.DelimitedComparatorCounter
import com.ms.qaTools.compare.DiffCounter
import com.ms.qaTools.io.rowSource.file.ExcelWorkBook

class ExcelDiffSetRotateWriter protected (workbooks: Iterator[ExcelWorkBook],
                                          colDefs: Seq[CompareColDef],
                                          config: ExcelDiffSetRotateWriter.Config) extends DiffSetWriter {
  def writeDiff(diff: AbstractDiff) = synchronized {
    if (row >= config.size) {
      writerAndCounters = (newWriter, newCounter) :: writerAndCounters
      row = 0
    }
    val (w, c) :: xs = writerAndCounters
    w.writeDiff(diff)
    writerAndCounters = (w, c + diff) :: xs
    row += 1
  }

  def writeSummary(counter: DiffCounter) {
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

  def apply(dir: File, colDefs: Seq[CompareColDef], config: Config = Config()) = {
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
COPYRIGHT NOTICE AND DISCLAIMER
Copyright (c) 2009-2016, Contributor

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License, version 3 for more details.

You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
*/
