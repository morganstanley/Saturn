package com.ms.qaTools.toolkit

import com.ms.qaTools.toolkit.cmdLine.BasicCmdLine
import scala.annotation.tailrec
import scala.util.{Try, Success, Failure}
import org.kohsuke.args4j.CmdLineParser
import org.kohsuke.args4j.CmdLineException



abstract class ToolkitApp[ResultType <: Result] extends App {
  val APP_NAME: String
  val APP_VERSION: String = "2.1.0"
  val BUILD_TIME: String = "20160909.134701"
  val cmdLine: BasicCmdLine
  
  def parseArguments = {
    try {
        cmdLine.parseArguments(args)
    } catch {
      case (e: CmdLineException) => handleCmdLineException(e)
      case (e: Exception)        => handleCmdLineException(e)
    }
    if (cmdLine.version) {
      displayVersion
      if (!cmdLine.noExitCode) System.exit(0)
    }
  }
  
  def handleCmdLineException(e: CmdLineException) = {
    if(cmdLine.version){
      displayVersion
      if (!cmdLine.noExitCode) System.exit(0)
    } else if(cmdLine.help) {
      println("Usage information")
      cmdLine.cmdLineParser.printUsage(System.out)
      if (!cmdLine.noExitCode) System.exit(0)
    } else {
      System.err.println(e.getMessage())
      cmdLine.cmdLineParser.printUsage(System.err)
      System.exit(-1)
    }
  }

  def handleCmdLineException(e: Exception) = {
    System.err.println(e.getMessage())
    cmdLine.cmdLineParser.printUsage(System.err);
    System.exit(-1)
  }
  
  def displayVersion = {
    System.out.println(APP_NAME + " " + APP_VERSION + " " + BUILD_TIME)
    val binPath = getClass().getProtectionDomain().getCodeSource().getLocation().getPath()
    System.out.println("Bin path: " + binPath)
  }

  protected def printMessages(result: ResultType) = println(result)

  def exit(result: ResultType) {
    result match {
      case Pass() => if (!cmdLine.noExitCode) System.exit(0)
      case Fail() => {
        System.err.println(APP_NAME + " failed.")
        printMessages(result)
        if (!cmdLine.noExitCode) System.exit(-1)
      }
    }
  }

  def exit(result: Try[ResultType]) {
    result match {
      case Success(r) => exit(r)
      case Failure(e) => exitException(e)
    }
  }

  def exitException(t: Throwable) = {
    printException(t)
    if (cmdLine.debug) t.printStackTrace()
    if (!cmdLine.noExitCode) System.exit(-1)
    else throw t
  }
  
  def printException(t: Throwable) = {
    @tailrec
    def _printException(t: Throwable, exceptionStr: String, count: Int): String = {
        if(t == null) exceptionStr
        else {
          val indents = Seq.fill(count)(" ").mkString("")
          _printException(t.getCause(), "%s%sCaused by %s: %s\n".format(exceptionStr, indents, t.getClass.toString, t.getMessage()), count + 1)
        }
    }
    System.err.println(_printException(t, "", 0))
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
