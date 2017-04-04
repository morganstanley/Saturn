package com.ms.qaTools.saturn.codeGen.notifier.console

import com.ms.qaTools.saturn.codeGen.IterationResult
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import com.ms.qaTools.toolkit.mail.MailResult

case object MailStepConsoleNotifier extends ConsoleNotifier[MailResult] {
  override val runGroupType = "Mail"

  override def notifyAfterIteration(name: String, result: IterationResult[MailResult])
                                   (implicit sc: SaturnExecutionContext) = sc.logger.synchronized {
    super.notifyAfterIteration(name, result)
    implicit val noColor = sc.noOutputColor
    result.moduleResult.exception.foreach(printThrowable(_, sc.outputVerbosity))
  }
}
