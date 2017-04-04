package com.ms.qaTools.toolkit.runCmds

import scala.util.Try

import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.TryUtil
import com.ms.qaTools.exceptions.AggregateException
import com.ms.qaTools.interpreter.Interpreter
import com.ms.qaTools.interpreter.InterpreterResult
import com.ms.qaTools.interpreter.InterpreterResultValidator
import com.ms.qaTools.interpreter.NullInterpreterResultValidator
import com.ms.qaTools.interpreter.ValidationResult
import com.ms.qaTools.toolkit.Failed
import com.ms.qaTools.toolkit.Passed
import com.ms.qaTools.toolkit.Result
import com.ms.qaTools.toolkit.Runnable
import com.ms.qaTools.toolkit.Status

case class RunCmdsResult[InterpreterResultType <: InterpreterResult](override val status: Status,
                                                                     commands: Seq[ValidationResult[InterpreterResultType]],
                                                                     override val exception: Option[Throwable] = None) extends Result

case class RunCmds[CommandType, InterpreterResultType <: InterpreterResult](commands: Seq[CommandType],
                                                                            interpreter: Interpreter[CommandType, InterpreterResultType],
                                                                            resultValidator: InterpreterResultValidator[InterpreterResultType] = NullInterpreterResultValidator[InterpreterResultType]())
  extends Runnable[RunCmdsResult[InterpreterResultType]] {
  override def run = Try[RunCmdsResult[InterpreterResultType]] {
    val interpreterResults = commands.map(c => interpreter.run(c))
    val validatedResults = interpreterResults.map(r => resultValidator.validate(r))

    if (validatedResults.exists(r => r.failed)) {
      val exceptions = validatedResults.filter(_.failed).foldLeft(Seq[Throwable]())((agg, r) => r.exception match {
        case Some(e) => agg :+ e
        case None    => agg
      })
      RunCmdsResult(Failed(), validatedResults, Option(new AggregateException("Not all runCmds commands passed.", exceptions)))
    }
    else RunCmdsResult(Passed(), validatedResults)
  }
}

object RunCmds {
  def apply[CommandType, InterpreterResultType <: InterpreterResult](interpreter: Interpreter[CommandType, InterpreterResultType],
                                                                     commandsTry: Seq[Try[CommandType]],
                                                                     checkStrTry: Try[String],
                                                                     validatorFactory: String => InterpreterResultValidator[InterpreterResultType]): Try[RunCmds[CommandType, InterpreterResultType]] =
    {
      for {
        commands <- commandsTry.toTrySeq.rethrow("An exception occurred while creating commands.")
        checkStr <- checkStrTry.rethrow("An exception occurred while generating checkStr.")
        validator <- Try { validatorFactory(checkStr) }.rethrow("An exception occurred while creating validator.")
      } yield RunCmds(commands, interpreter, validator)
    }.rethrow("An exception occurred while setting up runCmds.")
}
/*
COPYRIGHT NOTICE AND DISCLAIMER
Copyright (c) 2009-2016, Contributor

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License, version 3 for more details.

You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
*/
