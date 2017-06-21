package com.ms.qaTools.toolkit

import com.ms.qaTools.compare.Counter
import com.ms.qaTools.compare.writer.DiffSetWriter
import com.ms.qaTools.io.CountingWriter
import com.ms.qaTools.io.Writer
import com.ms.qaTools.io.rowSource.Convert

case class WriteResult(status: Status, count: Either[Int, Counter[_, _]], exception: Option[Throwable] = None) extends Result

case class Write[A, B, C <: Counter[B, C]](source: Iterator[A], writer: Writer[Iterator[B]], counter: Either[Int, C] = Left(0))(implicit convert: Convert[Iterator[A], Iterator[B]]) extends Runnable[WriteResult] {
  def run = util.Try{
    WriteResult(Passed, (writer, counter) match {
      case (w: CountingWriter[B, C], Right(c)) => Right(w.write(convert.convert(source), c).withSideEffect(c => postProcess(w, c)))
      case (w, Left(n)) => Left(n + writer.write(convert.convert(source)))
      case _ => sys.error("Write(source, writer, counter): counter provided but writer is not a CountingWriter")
    })}

  def postProcess(w: CountingWriter[B, C], c: C) = w match {
    case w: DiffSetWriter[B, C] => {w.writeSummary(c); w.close} // TODO didn't open, shouldn't close, should flush
    case _ => ()
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
