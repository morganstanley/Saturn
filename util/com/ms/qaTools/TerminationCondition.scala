package com.ms.qaTools

import java.util.concurrent.TimeoutException

import scala.collection.mutable
import scala.concurrent.Await
import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import scala.concurrent.duration._

import com.ms.qaTools.io.rowSource.BlockingRowSource

import javax.jms.Message

object TerminationCondition {
  def count[A](maxCount: Int): Iterator[A] => Iterator[A] = _.take(maxCount)

  def timeOut[A](timeOutMillis: Long)(implicit executor: ExecutionContext): Iterator[A] => Iterator[A] = { xs =>
    require(timeOutMillis > 0, "Negative timeout value: " + timeOutMillis)
    new IteratorProxy[A] with BlockingRowSource[A] {
      val self = xs
      val start = System.currentTimeMillis

      def waitHasNext(t: Duration) = xs match {
        case xs: BlockingRowSource[A] => xs.waitHasNext(t)
        case _ => try Await.result(Future(xs.hasNext), t) catch {case _: TimeoutException => false}
      }

      override def hasNext = {
        val timeLeft = start + timeOutMillis - System.currentTimeMillis
        timeLeft > 0 && waitHasNext(timeLeft.milliseconds)
      }
    }
  }

  def untilElement[A](pred: A => Boolean): Iterator[A] => Iterator[A] = _.terminateWith(pred)

  def correlId(useCorrelId: Boolean, correlIdQueue: mutable.Seq[Message]): Iterator[Message] => Iterator[Message] = { xs =>
    new IteratorProxy[Message] {
      val self = xs
      override def hasNext = !(useCorrelId && correlIdQueue.isEmpty) && self.hasNext
    }
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
