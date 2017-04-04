package com.ms.qaTools.saturn.codeGen

import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import scala.util.Failure
import scala.util.Success
import scala.util.Try

import com.ms.qaTools.saturn.codeGen.notifier.Notifier
import com.ms.qaTools.saturn.dsl.ScenarioReportListener
import com.ms.qaTools.saturn.kronus.runtime.ConstellationDecoration
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import com.ms.qaTools.saturn.runtime.TerminalResult
import com.ms.qaTools.saturn.types.{SaturnStatusEnum, SaturnStatusConditionEnum}
import com.ms.qaTools.toolkit.Failed
import com.ms.qaTools.toolkit.NotRun
import com.ms.qaTools.toolkit.Passed
import com.ms.qaTools.toolkit.Result
import com.ms.qaTools.toolkit.Status

case class RunGroupResult(override val status: Status, runGroups: Seq[(String, Try[IteratorResult[Any]])], scenarioReportListener: Option[ScenarioReportListener] = None) extends Result

trait HasMetaData {
  val metaData:Seq[Any]
}

case class PreIteratorResult[+R]()
case class IteratorResult[+R](override val status:Status, context:IteratorContext, metaData:Seq[Any], iterationResults: Seq[Try[IterationResult[R]]], depth:Int=0) extends Result with HasMetaData

case class PreIterationResult[+R](iterationNo: Int)
case class IterationResult[+R](override val status:Status, context:IterationContext, metaData:Seq[Any], moduleResult: R, iterationNo: Int = 0) extends Result with HasMetaData

case class IteratorFutureException(cause: Throwable) extends Exception(cause)
case class IterationFutureException(cause: Throwable) extends Exception(cause)

case class KronusResult(underlying: Result, metaData: Seq[Any]) extends Result with HasMetaData {
  override def status       = underlying.status
  override val exception    = underlying.exception
  override val errorMessage = underlying.errorMessage
}

object NotImplemented {
  def apply() = Failure(new Exception("Feature not implemented"))
}

object Utils {
  def runnableToIterationResult[A <: Result](runnable: Try[com.ms.qaTools.toolkit.Runnable[A]],
                                             context: IterationContext,
                                             iterationMetaData: Seq[Any],
                                             iterationNo: Int): Try[IterationResult[A]] =
    runnable.flatMap(_.run.map(r => IterationResult(r.status, context, iterationMetaData, r, iterationNo)))

  def runGroupResultsToIterationResult(childResults: Seq[(String, Future[Try[IteratorResult[Any]]], Boolean)],
                                       terminals: Seq[Future[Try[IteratorResult[TerminalResult]]]],
                                       defaultStatus: SaturnStatusEnum,
                                       statusCondition: SaturnStatusConditionEnum,
                                       scenarioReportListener: Option[ScenarioReportListener],
                                       context: IterationContext,
                                       iterationMetaData: Seq[Any],
                                       iterationNo: Int)
                                      (implicit ec: ExecutionContext): Future[Try[IterationResult[RunGroupResult]]] = {
    val (childNames, resultFutures, affectStatus) = childResults.unzip3
    for {
      results <- Future.sequence(resultFutures)
      terminals <- Future.sequence(terminals)
    } yield {
      val status = SortedTerminals(terminals: _*) match {
        case StatusFromTerminals(status) =>
          status
        case _ =>
          val rs = for ((r, p) <- results.zip(affectStatus) if p) yield r
          (defaultStatus, statusCondition) match {
            case (SaturnStatusEnum.PASS, SaturnStatusConditionEnum.ALLPASS) => passIfAllPass(rs)
            case (SaturnStatusEnum.PASS, SaturnStatusConditionEnum.ANYPASS) => passIfAnyPass(rs)
            case (SaturnStatusEnum.PASS, SaturnStatusConditionEnum.ALLFAIL) => passIfAllFail(rs)
            case (SaturnStatusEnum.PASS, SaturnStatusConditionEnum.ANYFAIL) => passIfAnyFail(rs)
            case (SaturnStatusEnum.FAIL, SaturnStatusConditionEnum.ALLPASS) => failIfAllPass(rs)
            case (SaturnStatusEnum.FAIL, SaturnStatusConditionEnum.ANYPASS) => failIfAnyPass(rs)
            case (SaturnStatusEnum.FAIL, SaturnStatusConditionEnum.ALLFAIL) => failIfAllFail(rs)
            case (SaturnStatusEnum.FAIL, SaturnStatusConditionEnum.ANYFAIL) => failIfAnyFail(rs)
          }
      }
      val runGroupResult = RunGroupResult(status, childNames.zip(results), scenarioReportListener)
      Success(IterationResult(runGroupResult.status, context, iterationMetaData, runGroupResult, iterationNo))
    }
  }

  def handleRunGroupIteratorAndAnnotations[X](context: IteratorContext,
                                              f:Future[Future[Try[IteratorResult[X]]]])
                                             (implicit ec: ExecutionContext,
                                                       sc: SaturnExecutionContext,
                                                       notifiers: Seq[Notifier[X]]): Future[Try[IteratorResult[X]]] = {
    val name: String = context.getFullContextName
    val iteratorFuture = ff2f(f)

    val iteratorWithAnnotationsFuture = Future {
      notifiers.foreach(_.notifyBeforeIterator(name, PreIteratorResult()))
    }.flatMap {
      ff => iteratorFuture
    }.recover {
      case t => Try{IteratorResult[X](NotRun(), context, Nil, Nil)}
    }

    iteratorWithAnnotationsFuture.andThen {
      case Success(Success(iteratorResult)) => notifiers.foreach(_.notifyAfterIterator(name, iteratorResult))                 //println(s"NOTIFY POST-ITERATOR ANNOTATIONS HERE!!! $name\n  attributes:${iteratorResult.context.attributes.mkString(",")}\n  resources:${iteratorResult.context.resources.mkString(",")}\n  metaData:${iteratorResult.metaData.mkString(",")}")
      case Success(Failure(exception))      => notifiers.foreach(_.notifyException(name, IteratorFutureException(exception))) //println(s"NOTIFY POST-ITERATOR ANNOTATIONS HERE!!! $name\n  module exception:${prettyException(exception)}")
      case Failure(exception)               => notifiers.foreach(_.notifyException(name, IteratorFutureException(exception))) //println(s"NOTIFY POST-ITERATOR ANNOTATIONS HERE!!! $name\n  future exception:${prettyException(exception)}")
    } andThen {
      case _ => context.closeAll
    }
  }
  
  def handleRunGroupIterationAndAnnotations[X](context: IterationContext,
                                               tft:Try[Future[Try[IterationResult[X]]]])
                                              (implicit ec: ExecutionContext,
                                                        sc: SaturnExecutionContext,
                                                        notifiers: Seq[Notifier[X]]): Future[Try[IterationResult[X]]] = {    
    val name = context.getFullContextName   
    val iterationFuture = tft2ft(tft)
    
    val iterationWithAnnotationsFuture = Future {
      notifiers.foreach(_.notifyBeforeIteration(name, PreIterationResult(context.iterationNo.getOrElse(0))))
    }.flatMap {
      case ff => iterationFuture
    }.recover{case t => throw new Exception(s"An exception occurred while running pre-iteration objects for runGroup: $name.", t)}

    iterationWithAnnotationsFuture.andThen {
      case Success(Success(iterationResult)) => notifiers.foreach(_.notifyAfterIteration(name, iterationResult))                //println(s"NOTIFY POST-ITERATION ANNOTATIONS HERE!!! $name\n  attributes:${iterationResult.context.attributes.mkString(",")}\n  resources:${iterationResult.context.resources.mkString(",")}\n  metaData:${iterationResult.metaData.mkString(",")}")
      case Success(Failure(exception))       => notifiers.foreach(_.notifyException(name, IterationFutureException(exception))) //println(s"NOTIFY POST-ITERATION ANNOTATIONS HERE!!! $name\n  module exception:${exception.prettyException}")
      case Failure(exception)                => notifiers.foreach(_.notifyException(name, IterationFutureException(exception))) //println(s"NOTIFY POST-ITERATION ANNOTATIONS HERE!!! $name\n  future exception:${exception.prettyException}")
    } andThen {
      case _ => context.closeAll
    }
  }

  def handleSingleRunGroupIterationAndAnnotations[X](context: IterationContext,
                                                     tft:Try[Future[Try[IterationResult[X]]]])
                                                    (implicit ec: ExecutionContext,
                                                              sc: SaturnExecutionContext,
                                                              notifiers: Seq[Notifier[X]]): Future[Seq[Try[IterationResult[X]]]] =
    handleRunGroupIterationAndAnnotations(context, tft).map(Seq(_))

  def attributeTry(c: Context, f: Try[String], name:String):Try[String] = c.attributeTry(f, name)
  def connectTry[X: ConstellationDecoration.From](c: Context, f: Try[X], name: String, isReference: Boolean):Try[X] = c.connectTry(f, name, isReference)

  def tf2ft[X](tf:Try[Future[X]])(implicit ec: ExecutionContext) = tf match {
                      	case Success(f) => f.map { v => Success(v) }
                      	case Failure(e) => Future{Failure(e)}
		              }
  
  def tft2ft[X](tft:Try[Future[Try[X]]])(implicit ec: ExecutionContext):Future[Try[X]] = {
    val qq = tft match {
                   case Success(f) => f
                   case Failure(e) => Future{Failure(e)}
		         }
    qq
  }
  
  def ff2f[X](f:Future[Future[X]])(implicit ec: ExecutionContext):Future[X] = for{i <- f
                                                                                  x <- i} yield x
                                                                                  
  def tt2t[X](t:Try[Try[X]]):Try[X] = for{i <- t
                                          x <- i} yield x                                                                                  
                                                   
  def ftf2ft[X](f:Future[Try[Future[X]]])(implicit ec: ExecutionContext):Future[Try[X]] = ff2f(for(t <- f) yield tf2ft(t))
  
  def futureMapN[IN,OUT](iter:Iterator[IN], fn:(IN, Int)=>Future[OUT], count:Int, breakFn:(OUT)=>Boolean = (out:OUT) => false)(implicit ec: ExecutionContext):Future[List[OUT]] = {
    val zippedIter = iter.zipWithIndex                                            
    def futureMapN_Inner(soFar:List[OUT]=Nil):Future[List[OUT]] = {
      val results:Future[List[OUT]] = if(!zippedIter.hasNext) Future{soFar.reverse}
                                      else {
                                        val iterationResultsFuture = Future.sequence(zippedIter.take(count).toList.map{case (item, index) => fn(item, index)})
                                        ff2f(for{iterationResults <- iterationResultsFuture} yield if(iterationResults.exists(breakFn)) Future{iterationResults:::soFar} else futureMapN_Inner(iterationResults:::soFar))
                                      }
      results
    }    
    futureMapN_Inner()
  }

  def childResult(result: IteratorResult[RunGroupResult], name: String, iteration: Int = 0): Try[IteratorResult[_]] =
    result.iterationResults(iteration).flatMap(_.moduleResult.runGroups.toMap.apply(name))

  def extractResult(result: IteratorResult[RunGroupResult], prefix: String, relativeName: String): Try[IteratorResult[_]] =
    extractResults(result, prefix, relativeName.split('.')).map(_.head._2)

  def expandResult[A](pathAndItr: (String, IteratorResult[A])): Seq[Try[(String, IterationResult[A])]] = {
    val (path, itr) = pathAndItr
    itr.iterationResults.map {
      _.map { itn =>
        val p = if (itr.iterationResults.size == 1) path else s"$path[${itn.iterationNo.toString}]"
        (p, itn)
      }
    }
  }

  def extractResults(result: IteratorResult[RunGroupResult], prefix: String, relativeName: Seq[String]): Try[Seq[(String, IteratorResult[_])]] = {
    val names = relativeName.inits.toList.init
    names.foldRight(Success(Seq(prefix -> result)): Try[Seq[(String, IteratorResult[Any])]]) {
      case (fn, itrs) => itrs.flatMap {
        _.flatMap {
          expandResult(_).map {
            _.flatMap {
              case (p, IterationResult(_, _, _, RunGroupResult(_, runGroups, _), _)) =>
                runGroups.toMap.apply(prefix +: fn mkString ".").map(s"$p.${fn.last}" -> _)
            }
          }
        }.toTrySeq
      }
    }
  }

  def passIfAllPass(results:Seq[Try[IteratorResult[Any]]]) = if(results.forall{runGroupPassed(_).value}) Passed() else Failed()
  def passIfAnyPass(results:Seq[Try[IteratorResult[Any]]]) = if(results.exists{runGroupPassed(_).value}) Passed() else Failed()
  def passIfAnyFail(results:Seq[Try[IteratorResult[Any]]]) = if(results.exists{r => runGroupFailed(r).value || r.runGroupException}) Passed() else Failed()
  def passIfAllFail(results:Seq[Try[IteratorResult[Any]]]) = if(results.forall{r => runGroupFailed(r).value || r.runGroupException}) Passed() else Failed()

  def failIfAllPass(results:Seq[Try[IteratorResult[Any]]]) = if(results.forall{runGroupPassed(_).value}) Failed() else Passed()
  def failIfAnyPass(results:Seq[Try[IteratorResult[Any]]]) = if(results.exists{runGroupPassed(_).value}) Failed() else Passed()
  def failIfAnyFail(results:Seq[Try[IteratorResult[Any]]]) = if(results.exists{r => runGroupFailed(r).value || r.runGroupException}) Failed() else Passed()
  def failIfAllFail(results:Seq[Try[IteratorResult[Any]]]) = if(results.forall{r => runGroupFailed(r).value || r.runGroupException}) Failed() else Passed()

  def passIfAllPassItn(results:Seq[Try[IterationResult[Any]]]) = if(results.forall{_.runGroupPassed}) Passed() else Failed()

  trait BoolDepth {
    def value:Boolean
    def depth:Int
    def &&(that:BoolDepth) = if(this.value && that.value) { if(this.depth < that.depth) this else that } else FalseDepth()
    def ||(that:BoolDepth) = if(this.value && that.value) { 
                               if(this.depth < that.depth) this 
                               else that 
                             }
                             else if(this.value) this
                             else that
  }
  
  object BoolDepth {
    def apply(value:Boolean, depth:Int) = if(value)TrueDepth(value, depth) else FalseDepth()
  }
  
  case class FalseDepth() extends BoolDepth {
    def value:Boolean = false
    def depth:Int = throw new Exception("")
  }
  
  case class TrueDepth(value:Boolean, depth:Int) extends BoolDepth
  
  implicit class IteratorResultTry(rg:Try[IteratorResult[_]]) {
    @deprecated
    def result = rg.get

    val runGroupException           = rg.isFailure
    val runGroupNotRun              = rg.map{_.status.notRun}.getOrElse(true)
  }

  def runGroupPassed(rg:Try[IteratorResult[Any]]):BoolDepth   = rg.map{r => BoolDepth(r.status.passed, r.depth)}.getOrElse(FalseDepth())
  def runGroupFailed(rg:Try[IteratorResult[Any]]):BoolDepth   = rg.map{r => BoolDepth(r.status.failed, r.depth)}.getOrElse(FalseDepth())
  def runGroupFinished(rg:Try[IteratorResult[Any]]):BoolDepth = rg.map{r => BoolDepth(!r.status.notRun, r.depth)}.getOrElse(FalseDepth())

  implicit class IterationResultTry(rg:Try[Result]) {
    val runGroupPassed    = rg.map{_.status.passed}.getOrElse(false)    
    val runGroupFailed    = rg.map{_.status.failed}.getOrElse(false)
    val runGroupException = rg.isFailure
    val runGroupNotRun    = rg.map{_.status.notRun}.getOrElse(true)
    val runGroupFinished  = rg.map{!_.status.notRun}.getOrElse(false)
  }
  
  implicit class IteratorResultUtil[R <: Result](rg:IteratorResult[R]) {
    @deprecated
    def result = rg

    def iterationResult(i: Int) = rg.iterationResults(i).getOrElse(throw new Exception(s"An exception occurred when unpacking IterationResult $i."))
  }
  
  object SortedTerminals {
    def apply(terminals:Try[IteratorResult[TerminalResult]]*):List[Try[IteratorResult[TerminalResult]]]=terminals.toList.filter{ runGroupFinished(_).value }.sortWith {
        (a, b) =>
          (a, b) match {
            case (Success(aa), Success(bb)) => bb.depth < aa.depth
            case _ => false
          }
      }
  }
  
  object StatusFromTerminals {
    def unapply(terminals:Seq[Try[IteratorResult[TerminalResult]]]):Option[Status] = terminals match {
      case Success(IteratorResult(_, _, _, Seq(Success(IterationResult(_, _, _, TerminalResult(Some(x),_), _))), _)) :: _ => Some(x)
      case _                                                                                                            => None
    } 
  }
  
  object RunGroupInstanceContainsActiveBreakTerminal extends Function1[Try[IterationResult[RunGroupResult]],Boolean]{
    def apply(runGroupIterationResult:Try[IterationResult[RunGroupResult]]):Boolean = runGroupIterationResult.map{
      _.moduleResult.runGroups.exists{
        _ match {
          case (_, Success(IteratorResult(Passed(),_,_,List(Success(IterationResult(_,_,_,TerminalResult(_,true),_)),_*),_))) => true
          case _                                                                                                              => false
        }
      }
    }.getOrElse(false)
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
