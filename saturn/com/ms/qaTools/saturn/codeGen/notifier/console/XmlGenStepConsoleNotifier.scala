package com.ms.qaTools.saturn.codeGen.notifier.console

import org.apache.commons.lang.exception.ExceptionUtils

import com.ms.qaTools.ThrowableUtil
import com.ms.qaTools.saturn.codeGen.IterationResult
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import com.ms.qaTools.saturn.runtime.TRACE
import com.ms.qaTools.saturn.runtime.notifier.console.spaces
import com.ms.qaTools.saturn.runtime.notifier.console.stringToAnsiColorString
import com.ms.qaTools.toolkit.xmlGen.XmlGenResult

case object XmlGenStepConsoleNotifier extends ConsoleNotifier[XmlGenResult] {
  override val runGroupType = "XmlGen"

  override def notifyAfterIteration(name: String, result: IterationResult[XmlGenResult])(implicit sc: SaturnExecutionContext) = sc.logger.synchronized {
    super.notifyAfterIteration(name, result)
    implicit val noColor = sc.noOutputColor

    sc.logger.changeLogLevelDuringRuntime(result) {
      logPrintMetaDatas(result.context.metaDataContexts, Seq("File", "TemplateFile", "OutputResource"), 1)

      for (e <- result.moduleResult.exception) {
        sc.logger.trace("Stack Trace:".red.bold)
        sc.logger.trace(spaces(1) + ExceptionUtils.getStackTrace(e).red)
        sc.outputVerbosity match {
          case TRACE() =>
          case _       => sc.logger.debug(e.getCauseStackString.red)
        }
      }
      sc.logger.debug("")
    }
  }
}
