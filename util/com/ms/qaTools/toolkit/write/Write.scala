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
