package com.ms.qaTools.saturn.runtime

import java.io.Closeable

import scala.util.Properties

import org.fusesource.jansi.AnsiString
import org.joda.time.format.DateTimeFormat
import org.slf4j.LoggerFactory

import com.ms.qaTools.Slf4jLogger
import com.ms.qaTools.{toolkit => tk}
import com.ms.qaTools.saturn.codeGen.IterationResult

import ch.qos.logback.classic.Level
import ch.qos.logback.classic.Logger
import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.classic.filter.ThresholdFilter
import ch.qos.logback.classic.spi.ILoggingEvent
import ch.qos.logback.core.ConsoleAppender
import ch.qos.logback.core.FileAppender
import ch.qos.logback.core.LayoutBase
import ch.qos.logback.core.encoder.LayoutWrappingEncoder
import ch.qos.logback.core.spi.ContextAware
import ch.qos.logback.core.spi.LifeCycle

class SaturnLogger(verbosityLevel: VerbosityLevel, logFileName: String, appendToLogFile: Boolean)
extends Slf4jLogger(null) with Closeable {
  override protected lazy val logger = LoggerFactory.getLogger(getClass).asInstanceOf[Logger]

  protected def start(x: LifeCycle with ContextAware): Unit = {
    x.setContext(logger.getLoggerContext)
    x.start()
  }

  protected val consoleAppender = {
    val encoder = new PatternLayoutEncoder
    encoder.setPattern("%msg%n")
    start(encoder)
    val appender = new ConsoleAppender[ILoggingEvent]
    appender.setEncoder(encoder)
    appender.setTarget("System.out")
    start(appender)
    logger.addAppender(appender)
    appender
  }
  setCustomFilters(LoggerLevel(verbosityLevel))

  val fileAppender = {
    val encoder = new LayoutWrappingEncoder[ILoggingEvent]
    encoder.setLayout {
      new LayoutBase[ILoggingEvent] {
        private[this] val dateTimeFormatter = DateTimeFormat.forPattern("HH:mm:ss.SSS")
        override def doLayout(event: ILoggingEvent): String =
          "%s [%s] %-5s %s - %s%n".format(dateTimeFormatter.print(event.getTimeStamp),
                                          event.getThreadName,
                                          event.getLevel,
                                          event.getLoggerName,
                                          new AnsiString(event.getFormattedMessage).getPlain)
      }
    }
    start(encoder)
    val file = Option(logFileName).getOrElse(java.io.File.createTempFile("saturn-", ".log").toString)
    debug("Saturn log file: " + file + Properties.lineSeparator)
    val appender = new FileAppender[ILoggingEvent]
    appender.setFile(file)
    appender.setAppend(appendToLogFile)
    appender.setEncoder(encoder)
    start(appender)
    val root = LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME).asInstanceOf[Logger]
    root.addAppender(appender)
    root.setLevel(Level.TRACE)
    appender
  }

  protected def setCustomFilters(level: Level): Unit = {
    val filter = new ThresholdFilter
    filter.setLevel(level.toString)
    start(filter)
    consoleAppender.stop()
    consoleAppender.clearAllFilters()
    consoleAppender.addFilter(filter)
    consoleAppender.start()
  }

  def changeLogLevelDuringRuntime(result: IterationResult[Any])(action: => Unit): Unit = try {
    verbosityLevel match {
      case TRACE() | DEBUG() | NORMAL() | QUIET() =>
      case DEBUG_ON_STATUS() => verbosityLevel match {
        case DEBUG_ON_PASS() => if (result.status == tk.Passed) setCustomFilters(Level.DEBUG)
        case DEBUG_ON_FAIL() => if (result.status == tk.Failed) setCustomFilters(Level.DEBUG)
      }
      case _ =>
    }
    action
  } finally setCustomFilters(LoggerLevel(verbosityLevel))

  def close() = {
    consoleAppender.stop()
    fileAppender.stop()
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
