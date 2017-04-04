package com.ms.qaTools.saturn.runtime

import com.ms.qaTools.toolkit.Fail
import com.ms.qaTools.toolkit.Result
import com.ms.qaTools.toolkit.Passed
import com.ms.qaTools.toolkit.Failed
import com.ms.qaTools.Logger
import com.ms.qaTools._
import com.ms.qaTools.interpreter.ValidationResult
import com.ms.qaTools.interpreter.InterpreterResult
import com.ms.qaTools.saturn.codeGen.SaturnResultContextWrapper
import scala.concurrent.Future
import scala.concurrent.duration.Duration
import scala.concurrent.ExecutionContext
import scala.concurrent.Await
import scala.util.Try

object RuntimeUtils {
  def waitForEver[THING_TYPE](thingRunner: => Future[THING_TYPE]):THING_TYPE = Await.result(thingRunner, Duration.Inf)

  def tryOrThrow[ThingType](thingMaker: => ThingType, description: => String)(implicit logger:Logger, rc:ResultContext = NullResultContext):ThingType = {
    val thing =
      try {
        thingMaker
      }
      catch {
        case e:Throwable => throw new Exception("An exception occurred while '" + description + "'.", e)
      }
    thing
  }

  def tryOrFail(thingMaker: => Result, description: => String):Result = {
    val thing:Result = try { thingMaker }
      catch {
        case e: Throwable => Fail(Some(e))
      }
    thing
  }

  def attribute(name:String, value: => String)(implicit rc:ResultContext):String = {
    try {
      val valueStr:String = value
      rc.appendAttribute(AttributeResult(name, Option(valueStr)))
      valueStr
    }
    catch {
      case t:Throwable => {
        rc.appendAttribute(AttributeResult(name = name, exception = Option(t)))
        throw new Exception("An exception occurred resolving attribute: " + name, t)
      }
    }
  }

  def complexValue(name:String, value: => String)(implicit rc:ResultContext):String = {
    Try {
      val valueStr:String = value
      rc.appendComplexValue(ComplexValueResult(name, Option(valueStr)))
      valueStr
    }.recoverWith {
      case t:Throwable => {
        rc.appendComplexValue(ComplexValueResult(name = name, exception = Option(t)))
        throw new Exception("An exception occurred resolving complexValue: " + name, t)
      }
    }.get
  }

  def disconnect[ThingType]   (thingMaker: => ThingType, description: => String)(implicit logger:Logger, rc:ResultContext = NullResultContext):ThingType = tryOrThrow(thingMaker,"Disonnecting:" + description)
  def includeFile[ThingType]  (thingMaker: => ThingType, description: => String)(implicit logger:Logger, rc:ResultContext = NullResultContext):ThingType = tryOrThrow(thingMaker,"Including:"    + description)
  def unincludeFile[ThingType](thingMaker: => ThingType, description: => String)(implicit logger:Logger, rc:ResultContext = NullResultContext):ThingType = tryOrThrow(thingMaker,"UnIncluding:"  + description)

  def initRunGroup[ResultType <: Result](thingMaker: => RunGroupIterator[ResultType],
                                         failMaker: (Throwable) => RunGroupIterator[ResultType],
                                         description: => String)(implicit ec:ExecutionContext, logger:Logger):RunGroupIterator[ResultType] = {
    val runGroupIterator:RunGroupIterator[ResultType] = try { thingMaker }
                                                        catch {
                                                          case e:Throwable => failMaker(e)
                                                        }
    runGroupIterator
  }

  def startIteration[ThingType](thingMaker: => ThingType, description: => String)(implicit logger:Logger):ThingType = tryOrThrow(thingMaker,"Starting Iteration:" + description)

  implicit def implicitScalarResult[ResultType <: Result]                            (s:ScalarRunGroupIterator[ResultType]):ScalarRunGroupIteratorResult[ResultType]       = s.result
  implicit def implicitScalarModuleResult[ResultType <: Result]                      (s:ScalarRunGroupIterator[ResultType]):ResultType = implicitScalarResult(s).iterationResult match {
    case Some(r:RunGroupIterationResult[ResultType]) => r.result match {
      case Some(i:ResultType) => i
      case None               => throw new Exception("Iteration has no result")
    }
    case None                                        => throw new Exception("No result available for ScalarRunGroupIterator: " + s)
  }
  implicit def implicitRowSourceResult[ResultType <: Result]                         (s:RowSourceRunGroupIterator[ResultType]):RowSourceRunGroupIteratorResult[ResultType] = s.result
  implicit def implicitRowSourceResults[ResultType <: Result]                        (s:RowSourceRunGroupIterator[ResultType]):(Integer) => ResultType                     = (i:Integer) => {
    val iterationResult:RunGroupIterationResult[ResultType] = s.iterationResults(i)
    val stepResult:Option[ResultType] = iterationResult.result
    stepResult match {
      case Some(r) => r
      case None    => throw new Exception("No result available at index: " + i)
    }
  }
  implicit def implicitInterpreterResult[InterpreterResultType <: InterpreterResult] (v:ValidationResult[InterpreterResultType]):InterpreterResultType                     = v.interpreterResult

  implicit def resultSeqToAllPass(results:Seq[Result]) = new {
    def allPassed = if(results.forall{_.passed}) Passed() else Failed()
  }

  def createResultContextWrapper[T](codeToRun: => SaturnResultContextWrapper => T, rcWrapper: SaturnResultContext): T = {
    codeToRun(SaturnResultContextWrapper(rcWrapper))
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
