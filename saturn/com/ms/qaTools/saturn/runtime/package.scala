package com.ms.qaTools.saturn

import com.ms.qaTools.interpreter.ShellInterpreter
import com.ms.qaTools.interpreter.ShellInterpreterResult
import com.ms.qaTools.interpreter.GroovyInterpreterResult
import com.ms.qaTools.saturn.codeGen.Context
import com.ms.qaTools.toolkit.runCmds.RunCmdsResult
import com.ms.qaTools.toolkit.Runnable
import com.ms.qaTools.toolkit.runCmds.RunCmds
import scala.util.Try

package object runtime {    
  type RunCmdsShellResult    = RunCmdsResult[ShellInterpreterResult]
  type RunCmdsShellRunnable  = Runnable[RunGroupIterationResult[RunCmdsShellResult]]
  type ScalarRunCmdsShell    = ScalarRunGroupIterator[RunCmdsShellResult]
  type RowSourceRunCmdsShell = RowSourceRunGroupIterator[RunCmdsShellResult]

  implicit class Fallible(strTry: Try[String]) {
    def warnWith(context: Context, name: String, default: => Try[String]): Try[String] =
      strTry.recoverWith {
        PartialFunction { t =>
          context.complexValues += Context.ComplexValue(name, Right(t))
          default
        }
      }
  }
}
