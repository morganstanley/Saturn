package com.ms.qaTools.saturn.runtime

import com.ms.qaTools.toolkit.Runnable
import com.ms.qaTools.toolkit.Failed
import com.ms.qaTools.toolkit.NotRun
import com.ms.qaTools.toolkit.Passed
import com.ms.qaTools.toolkit.Result
import com.ms.qaTools.Logger
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext._
import com.ms.qaTools.saturn.dsl.annotation.Annotation
import com.ms.qaTools.saturn.runtime.notifier.html.HTMLGenerator
import scala.concurrent.Future
import scala.util.{Failure, Success, Try}

abstract class RunGroupIterator[+ResultType <: Result](implicit sc: SaturnExecutionContext) {
  val name: String
  val parentName: Option[String] = None
  lazy val fullName = parentName match {
    case Some(p) => p + "." + name
    case None => name
  }
  implicit val logger = Logger(getClass)
  implicit val ec = sc.executionContext
  val annotations: Seq[Annotation] = Seq()
  def htmlGenerator: IteratorResultContext => HTMLGenerator[_, _] = null

  lazy val canRun: Future[Boolean] = Future{true}
  val run: Future[ResultType]
  lazy val result = RuntimeUtils.waitForEver(run)
  def cleanUp = Unit
  val configType = "UNKNOWN"

  def checkAll(resultFutures:Seq[RunGroupIterator[Result]], fn: Seq[Result] => Boolean): Future[Boolean] =
    if(resultFutures.isEmpty)
      Future{true}
    else
      Future.sequence(resultFutures.toSeq.map{_.run}).map(fn)

  def evalAndLogOnError(t: => Unit, method: String) =
    Try(t).recover{case e =>
      logger.error(s"An exception occurred while calling method: '$method'.", e)}

  def allPass(resultFutures:RunGroupIterator[Result]*):Future[Boolean]     = checkAll(resultFutures,(r:Seq[Result]) => r.forall(_.status == Passed))
  def allFail(resultFutures:RunGroupIterator[Result]*):Future[Boolean]     = checkAll(resultFutures,(r:Seq[Result]) => r.forall(_.status == Failed))
  def allFinish(resultFutures:RunGroupIterator[Result]*):Future[Boolean]   = checkAll(resultFutures,(r:Seq[Result]) => r.forall(_.status != NotRun))
  def anyPass(resultFutures:Seq[RunGroupIterator[Result]]):Future[Boolean] = checkAll(resultFutures,(r:Seq[Result]) => !r.forall(_.status == Failed))
}

abstract class ScalarRunGroupIterator[ResultType <: Result](implicit sc:SaturnExecutionContext) extends RunGroupIterator[ScalarRunGroupIteratorResult[ResultType]] {
  implicit val rc: IteratorResultContext

  val notifiers: Seq[Option[Notifier[ResultType, ScalarRunGroupIteratorResult[ResultType], ScalarRunGroupIterator[ResultType]]]] = Nil
  override def htmlGenerator: IteratorResultContext => HTMLGenerator[ScalarRunGroupIteratorResult[ResultType], ResultType] = null

  val step: Runnable[RunGroupIterationResult[ResultType]]
  lazy val run = Future {
    val stepResult = if(RuntimeUtils.waitForEver(canRun)) {
      val startTime = Option(System.currentTimeMillis)
      evalAndLogOnError(notifiers.flatten.foreach(_.notifyBeforeIterator(this)), "notifyBeforeIterator")
      evalAndLogOnError(notifiers.flatten.foreach(_.notifyBeforeIteration(this, 0)), "notifyBeforeIterator")

      val r = step.run match {
        case Success(stepResult) => {
          val endTime = Option(System.currentTimeMillis)
          evalAndLogOnError(notifiers.flatten.foreach(_.notifyAfterIteration(this, stepResult, 0)), "notifyAfterIteration")
          ScalarRunGroupIteratorResult(name, stepResult.status, stepResult, this, startTime, endTime)
        }
        case Failure(e) => {
          val r = FailedScalarRunGroupIteratorResult[ResultType](name, e, this, startTime, Option(System.currentTimeMillis))
          evalAndLogOnError(notifiers.flatten.foreach(_.notifyAfterIteration(this, FailedRunGroupIterationResult(name, e, startTime, Option(System.currentTimeMillis)), 0)), "notifyAfterIteration")
          r
        }
      }
      cleanUp
      r
    } else NotRunScalarRunGroupIteratorResult[ResultType](name, this)
    evalAndLogOnError(notifiers.flatten.foreach(_.notifyAfterIterator(this, stepResult)), "notifyAfterIterator")
    stepResult
  }
}

abstract class RowSourceRunGroupIterator[ResultType <: Result](implicit sc: SaturnExecutionContext) extends RunGroupIterator[RowSourceRunGroupIteratorResult[ResultType]] {
  implicit val rc: IteratorResultContext = null
  val notifiers: Seq[Option[Notifier[ResultType,RowSourceRunGroupIteratorResult[ResultType], RowSourceRunGroupIterator[ResultType]]]] = Nil
  override def htmlGenerator: IteratorResultContext => HTMLGenerator[RowSourceRunGroupIteratorResult[ResultType], ResultType] = null

  val iterations: Iterator[Runnable[RunGroupIterationResult[ResultType]]]
  val canMultiplex: Boolean = false

  lazy val run: Future[RowSourceRunGroupIteratorResult[ResultType]] = Future {
    evalAndLogOnError(notifiers.flatten.foreach(_.notifyBeforeIterator(this)), "notifyBeforeIterator")

    val canRunResult = RuntimeUtils.waitForEver(canRun)
    val startTime = Option(System.currentTimeMillis)

    val iterationResults: Seq[RunGroupIterationResult[ResultType]] = {
      if (!canRunResult) Nil
      else if (canMultiplex) {
        val iterationResultIterator =
          for ((runner, index) <- iterations.zipWithIndex.toList) yield Future {
            evalAndLogOnError(notifiers.flatten.foreach(_.notifyBeforeIteration(this, index)), "notifyBeforeIteration")

            runner.run match {
              case Success(iterationResult) => {
                evalAndLogOnError(notifiers.flatten.foreach(_.notifyAfterIteration(this, iterationResult, index)), "notifyAfterIteration")
                iterationResult
              }
              case Failure(e) => throw e
            }
          }
        RuntimeUtils.waitForEver(Future.sequence(iterationResultIterator.toList))
      } else
        iterations.zipWithIndex.map{case (runner, index) =>
          evalAndLogOnError(notifiers.flatten.foreach(_.notifyBeforeIteration(this, index)), "notifyBeforeIteration")
          runner.run match {
            case Success(iterationResult) =>
              evalAndLogOnError(notifiers.flatten.foreach(_.notifyAfterIteration(this, iterationResult, index)), "notifyAfterIteration")
              iterationResult
            case Failure(e) => throw e
          }
        }.toList
    }
    val endTime = Option(System.currentTimeMillis)
    val status = if(canRunResult) { if(iterationResults.forall(_.status == Passed)) Passed else Failed } else NotRun
    val iteratorResult = RowSourceRunGroupIteratorResult[ResultType](name, status, iterationResults, this, startTime, endTime)
    evalAndLogOnError(notifiers.flatten.foreach(_.notifyAfterIterator(this, iteratorResult)), "notifyAfterIterator")
    iteratorResult
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
