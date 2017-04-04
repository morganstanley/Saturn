package com.ms.qaTools.saturn.codeGen.notifier.report.generators

import scala.util.Failure
import scala.util.Success

import org.jsoup.nodes.Element

import com.ms.qaTools.saturn.codeGen.IterationResult
import com.ms.qaTools.saturn.codeGen.RunGroupResult
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext

class RunGroupHtmlGenerator(implicit sc: SaturnExecutionContext) extends BasicHtmlGenerator {
  override def generateIterationResult(name: String, fullName: String, result: IterationResult[Any], parentElement: Element, asScenario: Boolean = false, displayIterationNo: Boolean = true): Unit = {
    val childResults = result.moduleResult match {
      case r: RunGroupResult => r.runGroups
      case r => throw new Exception("Not a RunGroupResult: $r")
    }
    for ((fullName, childResultTry) <- childResults) childResultTry match {
      case Success(r) => {
        val htmlGeneratorOption = r.metaData.collect { case h: HtmlGenerator => h }.headOption
        htmlGeneratorOption.map(_.generateIteratorResult(fullName.split("\\.").lastOption.getOrElse(fullName), fullName, r, parentElement, false))
      }
      case Failure(e) => {
        //TODO
        throw new Exception("To implement: Failure output of child results in a RunGroupResult in RunGroupHtmlGenerator!")
      }
    }
  }

  override def runGroupIconClassName: String = "runGroupIcon"
  override def runGroupType: String = "RunGroup"

}

object RunGroupHtmlGenerator {
  def apply()(implicit sc: SaturnExecutionContext) = new RunGroupHtmlGenerator()
}

class SaturnHtmlGenerator(implicit sc: SaturnExecutionContext) extends RunGroupHtmlGenerator {
  override def runGroupType: String = "Saturn"
}

object SaturnHtmlGenerator {
  def apply()(implicit sc: SaturnExecutionContext) = new SaturnHtmlGenerator
}