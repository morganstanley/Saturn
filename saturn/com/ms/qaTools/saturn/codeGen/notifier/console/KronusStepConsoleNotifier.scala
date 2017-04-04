package com.ms.qaTools.saturn.codeGen.notifier.console

import com.ms.qaTools.saturn.codeGen.IterationResult
import com.ms.qaTools.saturn.codeGen.KronusResult
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext

object KronusStepConsoleNotifier extends ConsoleNotifier[KronusResult] {
  import com.ms.qaTools.saturn.runtime.notifier.console.spaces

  override val runGroupType = "KronusStep"

  override def notifyAfterIteration(name: String, result: IterationResult[KronusResult])
                                   (implicit sc: SaturnExecutionContext) = sc.logger.synchronized {
    implicit val noColor = sc.noOutputColor
    super.notifyAfterIteration(name, result)
    sc.logger.changeLogLevelDuringRuntime(result) {
      result.moduleResult.metaData.foreach(x => sc.logger.debug(spaces(1) + x))
      val metas = result.context.metaDataContexts
      logPrintMetaDatas(metas, metas.keys, 1)
      sc.logger.debug("")
    }
  }
}
