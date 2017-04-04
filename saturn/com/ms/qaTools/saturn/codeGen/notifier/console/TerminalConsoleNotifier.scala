package com.ms.qaTools.saturn.codeGen.notifier.console

import com.ms.qaTools.toolkit.Result
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import com.ms.qaTools.toolkit.Status
import com.ms.qaTools.saturn.runtime.TerminalResult

case object PassTerminalConsoleNotifier extends ConsoleNotifier[TerminalResult] {
    override val runGroupType = "PassTerminal"
}

case object FailTerminalConsoleNotifier extends ConsoleNotifier[TerminalResult] {
  override val runGroupType = "FailTerminal"
}

case object NoopTerminalConsoleNotifier extends ConsoleNotifier[TerminalResult] {
  override val runGroupType = "NoopTerminal"
}
