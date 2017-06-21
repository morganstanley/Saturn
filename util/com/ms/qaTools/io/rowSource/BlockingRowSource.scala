package com.ms.qaTools.io.rowSource

import java.util.concurrent.{BlockingQueue, LinkedBlockingQueue}

import scala.collection.AbstractIterator
import scala.concurrent.duration.Duration

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

  override def toString = (if (waitHasNext(Duration.Zero)) "non-empty" else "empty") + " iterator"
}

object BufferedBlockingRowSource {
  sealed trait Action[+A]
  case class Put[A](x: A) extends Action[A]
  case class Fail(exception: Throwable) extends Action[Nothing]
  case object End extends Action[Nothing]
}

class BufferedBlockingRowSource[A] extends AbstractIterator[A] with BlockingRowSource[A] {
  import BufferedBlockingRowSource._

  protected val buffer: BlockingQueue[Action[A]] = new LinkedBlockingQueue[Action[A]]()
  protected var _next: Option[A] = None
  protected var _end: Boolean = false

  def waitHasNext(timeout: Duration) = synchronized {
    _next.nonEmpty || !_end && {
      val action = timeout match {
        case Duration(n, unit)            => buffer.poll(n, unit)
        case _ if timeout == Duration.Inf => buffer.take
      }
      action match {
        case Put(x)  => _next = Some(x)
        case null    => // _next is None
        case Fail(e) => throw e
        case End     => _end = true
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

  def action(a: Action[A]): Unit =
    if (_end && a != End) throw new IllegalStateException("row source already closed") else buffer.put(a)

  def put(x: A) = action(Put(x))
  def fail(t: Throwable) = action(Fail(t))
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
