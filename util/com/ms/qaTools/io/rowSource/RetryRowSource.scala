package com.ms.qaTools.io.rowSource

import java.io.Closeable

import scala.annotation.tailrec
import scala.collection.immutable.Stream.consWrapper
import scala.concurrent.ExecutionContext
import scala.concurrent.Future



trait RetryIterator[X <: Iterator[_]] {
  val iteratorCreator: () => X
  val retryPeriod: Long
  val giveUpConditionStream: Iterator[() => Boolean]
  
  def getNextGiveUpCondition = if (giveUpConditionStream.hasNext) {val r = giveUpConditionStream.next; r} else {() => true}    
  def asFuture(implicit executionContext: ExecutionContext): Future[X] = Future {retry(getNextGiveUpCondition)}
  
  @tailrec
  final def retry(giveUpCondition: () => Boolean): X = {
    val iter = iteratorCreator()
    if (iter.hasNext)
      iter
    else { 
      if (giveUpCondition()) {
        iter
      }
      else {
        iter match {case c: Closeable => c.close()}
        Thread.sleep(retryPeriod)
        retry(getNextGiveUpCondition)
      }     
    }
  }  
}

case class MaximumRetryIterator[X <: Iterator[_]](iteratorCreator: () => X, maxRetry: Int = 60, infiniteRetry: Boolean = false, retryPeriod: Long = 1000)(implicit executionContext: ExecutionContext) extends RetryIterator[X] { 
  private def retriesFrom(max: Int): Stream[() => Boolean] = (() => {max < 0 && !infiniteRetry}) #:: retriesFrom(max - 1)
  val giveUpConditionStream: Iterator[() => Boolean] = retriesFrom(maxRetry).toIterator
}

case class TimeoutRetryIterator[X <: Iterator[_]](iteratorCreator: () => X, timeout: Long = 60000, retryPeriod: Long = 1000)(implicit executionContext: ExecutionContext) extends RetryIterator[X] {
  private def retriesFrom(lastTimeout: Long, lastTime: Long): Stream[() => Boolean] = (() => {lastTimeout < 0}) #:: {val c = System.currentTimeMillis; retriesFrom(lastTimeout - (c - lastTime), c)}  
  val giveUpConditionStream: Iterator[() => Boolean] = retriesFrom(timeout, System.currentTimeMillis).toIterator
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
