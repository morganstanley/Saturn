package com.ms.qaTools.saturn.codeGen.notifier.console

import com.ms.qaTools.toolkit.Result
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext

case object XmlValidatorStepConsoleNotifier extends ConsoleNotifier[Result] {
  override val runGroupType = "XmlValidator"
}
