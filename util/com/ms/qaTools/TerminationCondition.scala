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
