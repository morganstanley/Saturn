package com.ms.qaTools.saturn.runtime

import java.io.Closeable
import java.io.OutputStream
import java.net.InetAddress
import java.net.URL
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

import scala.collection.JavaConversions._
import scala.concurrent.ExecutionContext

import com.ms.qaTools.saturn.cmdLine.SaturnCmdLine
import com.ms.qaTools.saturn.kronus.runtime.{IConstellationClient, ConstellationClient, NopConstellationClient}
import com.ms.qaTools.saturn.kronus.runtime.KronusCmdLine
import com.ms.qaTools.saturn.kronus.runtime.KronusModuleInjector
import com.ms.qaTools.saturn.kronus.runtime.KronusRunParameters
import com.ms.qaTools.saturn.kronus.runtime.ReferenceCounter
import com.typesafe.config.ConfigFactory

import akka.actor.ActorSystem
import ch.qos.logback.classic.Level

trait VerbosityLevel {
  val level: Int
  def >=(that: VerbosityLevel) = this.level >= that.level
  def ==(that: VerbosityLevel) = this.level == that.level
  def <=(that: VerbosityLevel) = this.level <= that.level
  def <(that: VerbosityLevel) = this.level < that.level
  def >(that: VerbosityLevel) = this.level > that.level
}

case class QUIET() extends VerbosityLevel {
  override val level = 0
  def unapply(s: VerbosityLevel) = s.level == level
}

case class NORMAL() extends VerbosityLevel {
  override val level = 1
  def unapply(s: VerbosityLevel) = s.level >= level
}

object DEBUG_ON_STATUS {
  val level = 2
  def unapply(s: VerbosityLevel) = s.level >= level
}

case class DEBUG_ON_PASS() extends VerbosityLevel {
  override val level = DEBUG_ON_STATUS.level
}

case class DEBUG_ON_FAIL() extends VerbosityLevel {
  override val level = DEBUG_ON_STATUS.level
}

case class DEBUG() extends VerbosityLevel {
  override val level = 3
  def unapply(s: VerbosityLevel) = s.level >= level
}

case class TRACE() extends VerbosityLevel {
  override val level = 4
  def unapply(s: VerbosityLevel) = s.level >= level
}

object VerbosityLevel {
  def apply(verbosity: String) = {
    verbosity.toUpperCase() match {
      case "QUIET"         => QUIET()
      case "NORMAL"        => NORMAL()
      case "DEBUG"         => DEBUG()
      case "DEBUG_ON_PASS" => DEBUG_ON_PASS()
      case "DEBUG_ON_FAIL" => DEBUG_ON_FAIL()
      case "TRACE"         => TRACE()
      case _               => NORMAL()
    }
  }

  def max(a: VerbosityLevel, b: VerbosityLevel) = if(a.level > b.level) a else b
}
object LoggerLevel {
  def apply(verbosityLevel: VerbosityLevel): Level = verbosityLevel match {
    case QUIET() => Level.OFF
    case NORMAL() | DEBUG_ON_PASS() | DEBUG_ON_FAIL() => Level.INFO
    case DEBUG() => Level.DEBUG
    case TRACE() => Level.TRACE
    case _ => Level.INFO
  }
}

case class SaturnRunInfo(
    startTime: Long,
    endTime:Long,
    command: String,
    saturnVersion: String,
    utilVersion: String,
    path: String,
    user: String,
    workingDirectory: String,
    host: String)

case class SaturnExecutionContext( executionContext: ExecutionContext with ExecutorService
                                 , cmdLine: SaturnCmdLine
                                 , runInfo: SaturnRunInfo
                                 , noLogging: Boolean
                                 , logFileName: String
                                 , appendToLogFile: Boolean
                                 , noOutput: Boolean
                                 , noOutputColor: Boolean
                                 , outputVerbosity: VerbosityLevel
                                 , outputStream: OutputStream
                                 , actorSystem: ActorSystem
                                 , logger: SaturnLogger
                                 , constellationClient: IConstellationClient
                                 , kronusModules: KronusModuleInjector
                                 , referenceCounter: ReferenceCounter
                                 ) extends Closeable {
  lazy val envVars = System.getenv().toMap ++ cmdLine.resolveEnvVars.filter{_._2 != null} ++ Option(cmdLine.scenarioReport).map("SATURNWEB_REPORT_PATH" -> _)

  def close() = {
    constellationClient.close()
    executionContext.shutdown()
    concurrent.Await.result(actorSystem.terminate, concurrent.duration.Duration.Inf)
    logger.close()
  }

  def toKronusRunParameters = KronusRunParameters(executionContext, java.util.Locale.US, referenceCounter,
                                                  constellationClient, new KronusCmdLine(Nil),
                                                  akka.stream.ActorMaterializer()(actorSystem),
                                                  kronusModules, Nil)
}

object SaturnExecutionContext {
  val SATURN_VERSION = "2017.6.21"
  val UTIL_VERSION = "2.1.0"
  def apply(command:String,
            cmdLine:SaturnCmdLine,
            outputStream: OutputStream = System.out) = {
    val logger = new SaturnLogger(VerbosityLevel(if (cmdLine.noOutput) "QUIET" else cmdLine.verbosity), cmdLine.logFileName, cmdLine.appendToLogFile)
    val pool = Executors.newCachedThreadPool()
    val ec = ExecutionContext.fromExecutorService(pool)
    val constellationClient = {
      val conf = ConfigFactory.load().getConfig("qaTools.saturn.constellation")
      if (conf.hasPath("url"))
        ConstellationClient(new URL(conf.getString("url")), logger.debug("Uploading Constellation result failed", _))
      else
        new NopConstellationClient
    }
//    val constellationClient = new com.ms.qaTools.saturn.kronus.runtime.PrintStreamConstellationClient(Console.out)
    val sc = new SaturnExecutionContext(ec,
                                        cmdLine,
                                        SaturnRunInfo(System.currentTimeMillis(),
                                                      System.currentTimeMillis(),
                                                      command,
                                                      SATURN_VERSION,
                                                      UTIL_VERSION,
                                                      "PATH",
                                                      System.getProperty("user.name"),
                                                      System.getProperty("user.dir"),
                                                      InetAddress.getLocalHost().getHostName()),
                                        cmdLine.noLogging,
                                        cmdLine.logFileName,
                                        cmdLine.appendToLogFile,
                                        cmdLine.noOutput,
                                        cmdLine.noOutputColor,
                                        VerbosityLevel(if (cmdLine.noOutput) "QUIET" else cmdLine.verbosity),
                                        outputStream,
                                        ActorSystem(),
                                        logger,
                                        constellationClient,
                                        new KronusModuleInjector,
                                        new ReferenceCounter)
    sc
  }
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
