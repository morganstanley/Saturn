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
COPYRIGHT NOTICE AND DISCLAIMER
Copyright (c) 2009-2016, Contributor

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License, version 3 for more details.

You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
*/
