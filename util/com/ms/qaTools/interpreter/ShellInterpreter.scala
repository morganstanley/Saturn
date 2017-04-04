package com.ms.qaTools.interpreter

import java.io.File
import java.io.FileWriter

import scala.io.Source
import scala.sys.process._
import scala.util.{Try, Success, Failure}

import com.ms.qaTools.toolkit.{Status, Passed, Failed}

/**
 * TODO: Run process concurrently
 *       Batch read from process stdout/stdin
 *       ResultValidator for !errorMessage.toString.isEmpty
 */

case class ShellInterpreterResult(override val status: Status,
  command: String,
  exitCode: Option[Int] = None,
  stdout: Option[String] = None,
  stderr: Option[String] = None,
  override val exception: Option[Throwable] = None) extends InterpreterResult {
  lazy val stdoutStr = stdout.getOrElse("")
  lazy val stderrStr = stderr.getOrElse("")
  lazy val exitCodeStr = exitCode.getOrElse("N/A")
}

abstract class AbstractShellInterpreter extends Interpreter[String, ShellInterpreterResult] {
  def extraEnv: Seq[(String, String)]
  val tee = false
  val shell = "/bin/sh"

  protected def createTempScript(command: String): File = {
    val cmdFileTemp = File.createTempFile("runCmds", ".tmp")
    cmdFileTemp.deleteOnExit()
    val writer = new FileWriter(cmdFileTemp)
    writer.write(command.replaceAll("\r\n", "\n"))
    writer.close()
    cmdFileTemp
  }

  override def run(command: String): ShellInterpreterResult = {
    val message: StringBuilder = new StringBuilder
    val errorMessage: StringBuilder = new StringBuilder

    val pIO = new ProcessIO(
      _.close(),
      stdout => {
        Source.fromInputStream(stdout).addString(message)
        if (tee) {
          System.out.print(message.toString)
          System.out.flush
        }
        stdout.close()
      },
      stderr => {
        Source.fromInputStream(stderr).addString(errorMessage)
        if (tee) {
          System.err.print(errorMessage.toString)
          System.err.flush
        }
        stderr.close()
      })

    Try {
      Process(List(shell, createTempScript(command).getAbsolutePath), None, extraEnv: _*).run(pIO).exitValue
    } match {
      case Success(exitCode) =>
        val status = if (exitCode == 0 && errorMessage.toString.isEmpty) Passed() else Failed()
        ShellInterpreterResult(status, command,
                               Option(exitCode), Option(message.toString), Option(errorMessage.toString))
      case Failure(t) =>
        ShellInterpreterResult(Failed(), command, exception = Option(t))
    }
  }
}

case class ShellInterpreter(override val tee: Boolean = false,
                            override val extraEnv: Seq[(String, String)] = Seq.empty) extends AbstractShellInterpreter

case class WindowsShellInterpreter(override val tee: Boolean = false,
                                   override val extraEnv: Seq[(String, String)] = Seq.empty) extends AbstractShellInterpreter {
  override def run(command: String) = {
    super.run(System.getenv("WINDIR") + "\\system32\\cmd.exe /c " + command)
  }
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
