package com.ms.qaTools.saturn.runtime.runner.module

import scala.util.Try

import com.ms.qaTools.interpreter.Interpreter
import com.ms.qaTools.interpreter.InterpreterResult
import com.ms.qaTools.interpreter.InterpreterResultValidator
import com.ms.qaTools.saturn.codeGen.Context
import com.ms.qaTools.toolkit.runCmds.RunCmds

object RunCmdsRunner {
  def apply[CommandType, InterpreterResultType <: InterpreterResult](context: Context,
                                                                     interpreter: Interpreter[CommandType, InterpreterResultType],
                                                                     commandsTry: Seq[Try[CommandType]],
                                                                     checkStrTry: Try[String],
                                                                     validatorFactory: String => InterpreterResultValidator[InterpreterResultType]): Try[RunCmds[CommandType, InterpreterResultType]] =
    RunCmds(interpreter, commandsTry, checkStrTry, validatorFactory).rethrow("An exception occurred while running runCmds.")
}