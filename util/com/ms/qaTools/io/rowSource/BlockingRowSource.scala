package com.ms.qaTools.io.rowSource

import java.util.concurrent.{BlockingQueue, LinkedBlockingQueue}

import scala.collection.AbstractIterator
import scala.concurrent.duration.Duration
import scala.util.{Try, Success, Failure}

trait BlockingRowSource[+A] extends Iterator[A] { self =>
  /**
   * After waiting up to the specified `timeout`, if the next element is still unavailable, return `false`; otherwise
   * return `true`.
   */
  def waitHasNext(timeout: Duration): Boolean

  def hasNext = waitHasNext(Duration.Inf)

  def nonBlocking: Iterator[A] = new AbstractIterator[A] {
    def hasNext = self.waitHasNext(Duration.Zero)
    def next = if (hasNext) self.next() else Iterator.empty.next()
  }
}

class BufferedBlockingRowSource[A] extends AbstractIterator[A] with BlockingRowSource[A] {
  protected val buffer: BlockingQueue[Try[A]] = new LinkedBlockingQueue[Try[A]]()
  protected var _next: Option[A] = None

  def waitHasNext(timeout: Duration) = synchronized {
    _next.nonEmpty || {
      _next = timeout match {
        case Duration(n, unit)            => Option(buffer.poll(n, unit)).map(_.get)
        case _ if timeout == Duration.Inf => Some(buffer.take().get)
      }
      _next.nonEmpty
    }
  }

  def next() = synchronized {
    hasNext
    val x = _next.getOrElse(Iterator.empty.next())
    _next = None
    x
  }

  def put(x: A) = buffer.put(Success(x))
  def fail(t: Throwable) = buffer.put(Failure(t))
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
