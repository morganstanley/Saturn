package com.ms.qaTools.toolkit.mq
import ch.qos.logback.classic.Level
import ch.qos.logback.classic.Logger
import com.ms.qaTools.io.QueueIO
import com.ms.qaTools.io.rowWriter.MQStreamRowWriter
import com.ms.qaTools.{toolkit => tk}
import org.slf4j.LoggerFactory

object MQGetApp extends tk.ToolkitApp[MQGetResult] {
  val APP_NAME = "MQGet"
  val cmdLine = new MQGetCommandLine

  def printSummary(results: Seq[MQGetActionResult]) = {
    val outWriter = new java.io.PrintWriter(Console.out, true)
    outWriter.write("\nMQGet Summary:\n")
    results.foreach {
      case MQGetActionResult(tk.Passed, _, q, c) =>
        outWriter.write(q + ": " + c + " message(s).\n")
      case MQGetActionResult(tk.Failed, Some(e), q, _) =>
        outWriter.write(e.getMessage)
        if (cmdLine.debug) outWriter.write(e.getStackTrace.mkString("", "\n", "\n"))
      case MQGetActionResult(tk.Failed, None, q, _) =>
        outWriter.write("Couldn't get message from queue: " + q)
    }
    outWriter.flush
  }

  exit(util.Try{
    parseArguments
    if (LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME).isInstanceOf[Logger])
      LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME).asInstanceOf[Logger].setLevel(if (cmdLine.debug) Level.DEBUG else Level.WARN)

    MQGet(Seq(MQGetAction(QueueIO.session(cmdLine.manager), cmdLine.queue, MQStreamRowWriter(cmdLine.outStream), cmdLine.timeout))).run.map{r =>
      if (cmdLine.showSummary) printSummary(r.details)
      r.exception.foreach(throw _)
      r}
  }.flatten)
}
/*
Copyright 2017 Morgan Stanley

Licensed under the GNU Lesser General Public License Version 3 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

https://www.gnu.org/licenses/lgpl-3.0.en.html

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

IN ADDITION, THE FOLLOWING DISCLAIMER APPLIES IN CONNECTION WITH THIS PROGRAM:

THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY
WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT
OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING
IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY
OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY
USING THIS OR ANOTHER EQUIVALENT DISCLAIMER IN ADDITION TO ANY OTHER REQUIRED
LICENSE TERMS.
*/
