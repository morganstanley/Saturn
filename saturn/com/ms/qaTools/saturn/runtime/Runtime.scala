package com.ms.qaTools.saturn.runtime

import com.ms.qaTools.toolkit.Runnable
import com.ms.qaTools.toolkit.Failed
import com.ms.qaTools.toolkit.NotRun
import com.ms.qaTools.toolkit.Passed
import com.ms.qaTools.toolkit.Result
import com.ms.qaTools.toolkit.Status
import com.ms.qaTools.toolkit.Timings
import com.ms.qaTools.Logger
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext._
import com.ms.qaTools.saturn.dsl.annotation.Annotation
import com.ms.qaTools.saturn.runtime.notifier.html.HTMLGenerator
import com.ms.qaTools.saturn.dsl.annotation.ScenarioAnnotation
import scala.concurrent.{future, promise}
import scala.concurrent.Future
import scala.util.Try

//********************************************************************************************
//*** Saturn Runnable classes ***
 
 trait AbstractRunGroup[+ResultType <: Result] extends Runnable[ResultType] {
  implicit val sc: SaturnExecutionContext  
}

abstract class Terminal extends AbstractRunGroup[Result] {
  override def run:Try[Result] = Try{ new Result() { override val status = Passed() } } 
}

case class NoopTerminal(implicit override val sc: SaturnExecutionContext) extends Terminal
case class PassTerminal(implicit override val sc: SaturnExecutionContext) extends Terminal 
case class FailTerminal(implicit override val sc: SaturnExecutionContext) extends Terminal {
  override def run:Try[Result] = Try { new Result() { override val status = Failed() } } 
}

trait RunGroupStatusAggregator {
  def apply(results:Seq[RunGroupIteratorResult]):Status
}

case object PassIfAllPass extends RunGroupStatusAggregator {
  def apply(results:Seq[RunGroupIteratorResult]):Status = if(results.forall {r => !r.failed}) Passed() else Failed()  
}

case object FailIfAllPass extends RunGroupStatusAggregator {
  def apply(results:Seq[RunGroupIteratorResult]):Status = if(results.forall {r => !r.failed}) Failed() else Passed() 
}

case object PassIfAllFail extends RunGroupStatusAggregator {
  def apply(results:Seq[RunGroupIteratorResult]):Status = if(results.forall {r => !r.passed}) Passed() else Failed() 
}

case object FailIfAllFail extends RunGroupStatusAggregator {
  def apply(results:Seq[RunGroupIteratorResult]):Status = if(results.forall {r => !r.passed}) Failed() else Passed() 
}

case object PassIfPassTerminal extends RunGroupStatusAggregator {
  def apply(results:Seq[RunGroupIteratorResult]):Status = if(results.forall {r => !r.passed}) Failed() else Passed() 
} 

abstract class RunGroup(implicit val sc: SaturnExecutionContext) extends AbstractRunGroup[RunGroupResult] {
  implicit val ec = sc.executionContext
  
  val runGroups: Seq[RunGroupIterator[RunGroupIteratorResult]]
  val aggregateResults:RunGroupStatusAggregator
  
  override def run:Try[RunGroupResult] = Try{
    val t0 = Timings().start
    val runGroupFuture = Future.sequence(runGroups.map { _.run })
    val results: Seq[RunGroupIteratorResult] = RuntimeUtils.waitForEver(runGroupFuture)
    val t1 = t0.stop
    new RunGroupResult(aggregateResults(results), results)
  }
}

abstract class Saturn(implicit override val sc: SaturnExecutionContext) extends RunGroup {  
  override def run:Try[SaturnResult] = Try{
    val t0 = Timings().start
    val runGroupFuture = Future.sequence(runGroups.map { _.run })
    val results: Seq[RunGroupIteratorResult] = RuntimeUtils.waitForEver(runGroupFuture)
    val t1 = t0.stop
    new SaturnResult(aggregateResults(results), results)
  }
}

//*********************************************************************************************************************
//*********************************************************************************************************************
//*********************************************************************************************************************

abstract class RunGroupIterator[+ResultType <: Result](implicit sc: SaturnExecutionContext) {
  val name:String
  val parentName:Option[String] = None  
  lazy val fullName = parentName match {
    case Some(p) => p + "." + name
    case None => name
  }
  implicit val logger:Logger = Logger(this.getClass())
  implicit val ec = sc.executionContext
  val annotations: Seq[Annotation] = Seq()
  def htmlGenerator: IteratorResultContext => HTMLGenerator[_, _] = null
  
  lazy val canRun:Future[Boolean] = future{true}   
  
  val run:Future[ResultType]

  lazy val result = RuntimeUtils.waitForEver(run)  
  def cleanUp = Unit  
  val configType: String = "UNKNOWN"
  
  def checkAll(resultFutures:Seq[RunGroupIterator[Result]], fn:Seq[Result] => Boolean):Future[Boolean] = {
    if(resultFutures.isEmpty) 
      future(true)
    else {
      val resultsFuture:Future[Seq[Result]] = Future.sequence(resultFutures.toSeq.map{_.run})
      val result = for { r <- resultsFuture } yield fn(r)    
      result
    } 
  }    
  def allPass(resultFutures:RunGroupIterator[Result]*):Future[Boolean]     = checkAll(resultFutures,(r:Seq[Result]) => r.forall(res => res.passed))
  def allFail(resultFutures:RunGroupIterator[Result]*):Future[Boolean]     = checkAll(resultFutures,(r:Seq[Result]) => r.forall(res => res.failed))
  def allFinish(resultFutures:RunGroupIterator[Result]*):Future[Boolean]   = checkAll(resultFutures,(r:Seq[Result]) => r.forall(res => !res.notRun))
  def anyPass(resultFutures:Seq[RunGroupIterator[Result]]):Future[Boolean] = checkAll(resultFutures,(r:Seq[Result]) => !r.forall(res => res.failed))
}

abstract class ScalarRunGroupIterator[ResultType <: Result](implicit sc:SaturnExecutionContext) extends RunGroupIterator[ScalarRunGroupIteratorResult[ResultType]] {
  implicit val rc:IteratorResultContext
  
  val notifiers:Seq[Option[Notifier[ResultType, ScalarRunGroupIteratorResult[ResultType], ScalarRunGroupIterator[ResultType]]]] = Nil
  override def htmlGenerator: IteratorResultContext => HTMLGenerator[ScalarRunGroupIteratorResult[ResultType], ResultType] = null
  
  val step:Runnable[RunGroupIterationResult[ResultType]]  
  lazy val run:Future[ScalarRunGroupIteratorResult[ResultType]] = Future {    
    val canRunResult = RuntimeUtils.waitForEver(canRun)    
    val stepResult:ScalarRunGroupIteratorResult[ResultType] = 
      if(canRunResult) {     
          val startTime = Option(System.currentTimeMillis)
          try { 
            try { notifiers.flatten.foreach(_.notifyBeforeIterator(this)) } catch { case t:Throwable => logger.error("An exception occurred while calling method: 'notifyBeforeIterator'.", t)}
            try { notifiers.flatten.foreach(_.notifyBeforeIteration(this, 0)) } catch { case t:Throwable => logger.error("An exception occurred while calling method: 'notifyBeforeIterator'.", t)}
            
            
            val stepResult = step.run.get       
            val endTime = Option(System.currentTimeMillis)
            
            try { notifiers.flatten.foreach(_.notifyAfterIteration(this, stepResult, 0)) } catch { case t:Throwable => logger.error("An exception occurred while calling method: 'notifyAfterIteration'.", t)}
            val iterationResult:ScalarRunGroupIteratorResult[ResultType] = ScalarRunGroupIteratorResult(name, stepResult.status, stepResult, this, startTime, endTime)
            iterationResult
          }
          catch {
            case e: Throwable => {
              val r = FailedScalarRunGroupIteratorResult[ResultType](name, e, this, startTime, Option(System.currentTimeMillis))
              try { notifiers.flatten.foreach(_.notifyAfterIteration(this, FailedRunGroupIterationResult(name,e, startTime, Option(System.currentTimeMillis)), 0)) } catch { case t:Throwable => logger.error("An exception occurred while calling method: 'notifyAfterIteration'.", t)}
              r
            }
          }
          finally {
            try { cleanUp }
          }
      }
      else NotRunScalarRunGroupIteratorResult[ResultType](name, this)
      try { notifiers.flatten.foreach(_.notifyAfterIterator(this,stepResult)) } catch { case t:Throwable => logger.error("An exception occurred while calling method: 'notifyAfterIterator'.", t)}
      stepResult
  }  
}

case class DisabledRunGroupIterator(override val name:String,status:Status)(implicit sc: SaturnExecutionContext, rc: SaturnResultContext)extends RunGroupIterator[DisabledRunGroupIteratorResult] {
  NotRunRunGroupIterator =>
  lazy val run:Future[DisabledRunGroupIteratorResult] = Future {    
    val canRunResult = RuntimeUtils.waitForEver(canRun)
    new DisabledRunGroupIteratorResult() {
      override val name = NotRunRunGroupIterator.name
      override val status = if(canRunResult) NotRunRunGroupIterator.status else NotRun() 
      override val resultContext = rc
    }
  }  
}

case class FailScalarRunGroupIterator[ResultType <: Result](override val name:String, exception:Throwable)(implicit sc: SaturnExecutionContext) extends ScalarRunGroupIterator[ResultType] {
  override implicit val rc:IteratorResultContext = null
  val step = null
  override lazy val run:Future[ScalarRunGroupIteratorResult[ResultType]] = future(FailedScalarRunGroupIteratorResult[ResultType](name, exception, this))
}

case class PassScalarRunGroupIterator[ResultType <: Result](override val name:String)(implicit sc: SaturnExecutionContext) extends ScalarRunGroupIterator[ResultType] {
  override implicit val rc:IteratorResultContext = null
  override val step = new Runnable[RunGroupIterationResult[ResultType]]() {
    override def run = Try { RunGroupIterationResult(name, None) }
  }
}

abstract class RowSourceRunGroupIterator[ResultType <: Result](implicit sc: SaturnExecutionContext) extends RunGroupIterator[RowSourceRunGroupIteratorResult[ResultType]] {
  implicit val rc:IteratorResultContext=null
  val notifiers:Seq[Option[Notifier[ResultType,RowSourceRunGroupIteratorResult[ResultType], RowSourceRunGroupIterator[ResultType]]]] = Nil
  override def htmlGenerator: IteratorResultContext => HTMLGenerator[RowSourceRunGroupIteratorResult[ResultType], ResultType] = null
  
  val iterations: Iterator[Runnable[RunGroupIterationResult[ResultType]]]
  val canMultiplex:Boolean = false
  
  lazy val run: Future[RowSourceRunGroupIteratorResult[ResultType]] = Future {    
    try { notifiers.flatten.foreach(_.notifyBeforeIterator(this)) } catch { case t:Throwable => logger.error(t.getMessage, t)}
    
    val canRunResult = RuntimeUtils.waitForEver(canRun)
    val startTime = Option(System.currentTimeMillis)
    
    val iterationResults: Seq[RunGroupIterationResult[ResultType]] =
      {
        if (!canRunResult) Nil
        else if (canMultiplex) {
          val iterationResultIterator =
            for ((runner, index) <- iterations.zipWithIndex.toList) yield Future {
              try { notifiers.flatten.foreach(_.notifyBeforeIteration(this, index)) } catch { case t: Throwable => logger.error("An exception occurred while calling method: 'notifyBeforeIteration'.", t) }
              
              val iterationResult: RunGroupIterationResult[ResultType] = runner.run.get
              
              try { notifiers.flatten.foreach(_.notifyAfterIteration(this, iterationResult, index)) } catch { case t: Throwable => logger.error("An exception occurred while calling method: 'notifyAfterIteration'.", t) }
              iterationResult
            }
          val iterationResultFutures = iterationResultIterator.toList
          val iterationResultsFuture = Future.sequence(iterationResultFutures)
          val iterationResults = RuntimeUtils.waitForEver(iterationResultsFuture)
          iterationResults
        } else {
          val iterationResultIterator =
            for ((runner, index) <- iterations.zipWithIndex) yield {
              try { notifiers.flatten.foreach(_.notifyBeforeIteration(this, index)) } catch { case t: Throwable => logger.error("An exception occurred while calling method: 'notifyBeforeIteration'.", t) }
              val iterationResult: RunGroupIterationResult[ResultType] = runner.run.get
              try { notifiers.flatten.foreach(_.notifyAfterIteration(this, iterationResult, index)) } catch { case t: Throwable => logger.error("An exception occurred while calling method: 'notifyAfterIteration'.", t) }
              iterationResult
            }
          val iterationResults = iterationResultIterator.toList
          iterationResults
        }
      }
    val endTime = Option(System.currentTimeMillis)
    val allPassed = iterationResults.forall(_.passed)
    val status = if(canRunResult) { if(allPassed) Passed() else Failed() } else NotRun()

    val iteratorResult = RowSourceRunGroupIteratorResult[ResultType](name, status, iterationResults, this, startTime, endTime)
    try { notifiers.flatten.foreach(_.notifyAfterIterator(this, iteratorResult)) } catch { case t:Throwable => logger.error("An exception occurred while calling method: 'notifyAfterIterator'.", t)}
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
