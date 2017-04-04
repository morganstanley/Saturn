package com.ms.qaTools.saturn.codeGen.notifier.console

import org.apache.commons.lang.exception.ExceptionUtils

import com.ms.qaTools.ThrowableUtil
import com.ms.qaTools.saturn.result.ProcedureCallResult
import com.ms.qaTools.saturn.codeGen.IterationResult
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import com.ms.qaTools.saturn.runtime.TRACE
import com.ms.qaTools.saturn.runtime.notifier.console.spaces
import com.ms.qaTools.saturn.runtime.notifier.console.stringToAnsiColorString

case object ProcedureCallStepConsoleNotifier extends ConsoleNotifier[ProcedureCallResult] {
  override val runGroupType = "ProcedureCall"

  override def notifyAfterIteration(name: String, result: IterationResult[ProcedureCallResult])(implicit sc: SaturnExecutionContext) = sc.logger.synchronized {
    super.notifyAfterIteration(name, result)
    implicit val noColor = sc.noOutputColor

    sc.logger.changeLogLevelDuringRuntime(result) {
      val metaDatas = result.context.metaDataContexts
      for (mdc <- metaDatas.get("ProcName")) sc.logger.debug(spaces(1) + "Referent: ".blue + mdc.metaData.getOrElse(""))
      for (argsMetaData <- metaDatas.get("Arguments")) {
        val argsMetaDataContext = argsMetaData.metaDataContexts
        if (!argsMetaDataContext.isEmpty) {
          sc.logger.debug(spaces(1) + "Arguments: ".blue)
          argsMetaData.metaDataContexts.foreach {
            case (s, md) => {
              //
                            import java.io.ByteArrayOutputStream
              import java.io.PrintStream
              val outputStream = new ByteArrayOutputStream
              printMetaDataContext(md, 2, new PrintStream(outputStream))
              sc.logger.debug(new String(outputStream.toByteArray()))
              outputStream.close()
            }
          }
        } else sc.logger.debug(spaces(1) + "Arguments: ".blue + "None")
      }
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
