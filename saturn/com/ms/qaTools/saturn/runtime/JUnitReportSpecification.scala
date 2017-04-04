package com.ms.qaTools.saturn.runtime

import scala.util.Try

import org.specs2.execute.{Error => Specs2Error}
import org.specs2.matcher.Matcher
import org.specs2.mutable.Specification
import org.specs2.specification.Fragments

import com.ms.qaTools.saturn.codeGen.{IteratorResult, IterationResult}
import com.ms.qaTools.saturn.codeGen.Utils._
import com.ms.qaTools.saturn.dsl.annotation.{ScenarioAnnotation, OnFailResultStatus}

abstract class JUnitReportSpecification(root: Try[IteratorResult[com.ms.qaTools.saturn.codeGen.RunGroupResult]],
                                        rootName: String) extends Specification {
  protected def iterationsWithMessages(path: String, itr: IteratorResult[Any]): Seq[Try[(String, IterationResult[_], Option[String])]] = {
    expandResult(path -> itr).map {
      _.map {
        case (p, itn) =>
          val msg = Seq(itn, itr).map {
            _.metaData.collectFirst {
              case sa: ScenarioAnnotation if sa.onStatus == OnFailResultStatus => sa.title
            }.flatten
          }.reduceLeft(_ orElse _)
          (p, itn, msg)
      }
    }
  }

  def pass(msg: Option[String]): Matcher[IterationResult[Any]] = { itn: IterationResult[Any] =>
    (itn.passed, msg.getOrElse("Fail to pass"))
  }

  def iterationsPass(relativeName: Seq[String]): Fragments = {
    for {
      root <- root
      itrs <- extractResults(root, rootName, relativeName)
      itns <- itrs.flatMap((iterationsWithMessages _).tupled).toTrySeq
    } yield (Fragments() /: itns) {
      case (frag, (p, itn, msg)) => frag.append(s"$p should pass" ! (itn must pass(msg)))
    }
  }.recover {
    case t: Throwable =>
      val fn = rootName +: relativeName mkString "."
      (s"Fail to get iteration results of $fn" ! Specs2Error(t)): Fragments
  }.get
}
