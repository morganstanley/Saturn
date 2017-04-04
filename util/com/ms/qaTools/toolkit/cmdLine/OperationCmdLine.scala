package com.ms.qaTools.toolkit.cmdLine
import org.kohsuke.args4j.Option
import org.kohsuke.args4j.CmdLineParser
import org.kohsuke.args4j.CmdLineException
/**
 * Command line parser for applications that support operation-like arguments.
 * e.g: appName --option1 --option2 -- operationA --arg1 --arg2
 *                                  -- operationB --arg3 --arg4
 *                                  -- operationC
 */

/*
 * Classes that extend this trait have their own options and return an object
 * that represent the operation after parseOperation method is called.
 */
trait OperationCmdLine {
  def createOperation: Any
  val operationName = ""

  def parseOperation(args: Seq[String]) = {
    val cmdLineParser = new CmdLineParser(this)
    try {
      cmdLineParser.parseArgument(args: _*)
    } catch {
      case (e: CmdLineException) => {
        System.err.println("Can't parse arguments for " + operationName + " operation: " + e.getMessage())
        System.err.println("Usage:")
        cmdLineParser.printUsage(System.err)
        System.exit(-1)
      }
      case (e: Exception) => {
        System.err.println("Can't parse arguments for " + operationName + " operation: " + e.getMessage())
        System.exit(-1)
      }
    }
  }
}

class ExtendedCmdLine(operationsMap: Map[String, Function1[BasicCmdLine, OperationCmdLine]]) extends BasicCmdLine {

  def buildOperations(args: Iterator[String], operations: Seq[Any] = Seq()): Seq[Any] = {
    if (!args.hasNext) operations
    else {
      val operationArgs = args.takeWhile(arg => !arg.equals("--"))
      val operationName = operationArgs.next
      val cmdLine = operationsMap.get(operationName)
      cmdLine match {
        case None => throw new Error("Unrecognized operation: " + operationName)
        case Some(o) => {
          val operationCmdLine = o.apply(this)
          operationCmdLine.parseOperation(operationArgs.toSeq)
          buildOperations(args, operations :+ operationCmdLine.createOperation)
        }
      }
    }
  }

  def parseOperations(args: Array[String]): Seq[Any] = {
    val cmdLineParser = new CmdLineParser(this)
    val argsIterator = args.toIterator
    // remove first part which are default cmd line options
    argsIterator.takeWhile(arg => !arg.equals("--")).toArray
    buildOperations(argsIterator)
  }

  override def parseArguments(args: Array[String]) {
    val argsIterator = args.toIterator
    val cmdLineOptions = argsIterator.takeWhile(arg => !arg.equals("--"))
    cmdLineParser.parseArgument(cmdLineOptions.toSeq: _*)

    if (help) {
      println("Usage information")
      cmdLineParser.printUsage(System.out)
      System.exit(0)
    }
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
