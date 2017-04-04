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
