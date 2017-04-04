package com.ms.qaTools.toolkit.write

import scala.util.Try

import com.ms.qaTools.compare.{DiffCounter, DelimitedComparatorCounter}
import com.ms.qaTools.compare.Comparator
import com.ms.qaTools.compare.writer.DiffSetWriter
import com.ms.qaTools.io.Writer
import com.ms.qaTools.io.rowSource.Convert
import com.ms.qaTools.toolkit.{Status, Passed}
import com.ms.qaTools.toolkit.Result
import com.ms.qaTools.toolkit.Runnable

case class WriteResult(override val status: Status,
                       summary: WriteSummary,
                       override val exception: Option[Throwable] = None) extends Result

case class Write[A, B](source: A, writer: Writer[B])(implicit convert: Convert[A, B]) extends Runnable[WriteResult] {
  def run = Try {
    val s = (source, writer) match {
      case (c: Comparator, w: DiffSetWriter) => Write.writeDiff(c, w)
      case _                                 => WriteCount(writer.write(convert.convert(source)))
    }
    WriteResult(Passed(), s)
  }
}

object Write {
  def writeDiff(c: Comparator, w: DiffSetWriter): WriteDiffCount = try {
    val counter = (DelimitedComparatorCounter() /: c) { (counter, diff) =>
      w.writeDiff(diff)
      counter + diff
    }
    w.writeSummary(counter)
    WriteDiffCount(counter)
  } finally {
    // TODO didn't open, shouldn't close, should flush
    w.close()
  }
}

sealed abstract class WriteSummary
case class WriteCount(n: Int) extends WriteSummary
case class WriteDiffCount(count: DiffCounter) extends WriteSummary
/*
COPYRIGHT NOTICE AND DISCLAIMER
Copyright (c) 2009-2016, Contributor

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License, version 3 for more details.

You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
*/
