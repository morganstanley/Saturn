package com.ms.qaTools.saturn.runtime

import org.fusesource.jansi.AnsiString
import org.joda.time.format.DateTimeFormat
import org.slf4j.LoggerFactory
import com.ms.qaTools.Slf4jLogger
import com.ms.qaTools.saturn.codeGen.IterationResult
import ch.qos.logback.classic.Level
import ch.qos.logback.classic.Logger
import ch.qos.logback.classic.LoggerContext
import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.classic.filter.ThresholdFilter
import ch.qos.logback.classic.spi.ILoggingEvent
import ch.qos.logback.core.ConsoleAppender
import ch.qos.logback.core.FileAppender
import ch.qos.logback.core.LayoutBase
import ch.qos.logback.classic.filter.LevelFilter
import ch.qos.logback.core.spi.FilterReply

class LoggingFileLayout extends LayoutBase[ILoggingEvent] {
  override def doLayout(event: ILoggingEvent): String = {
    val dateTimeFormatter = DateTimeFormat.forPattern("HH:mm:ss.SSS")
    "%s [%s] %-5s %s - %s%n".format(dateTimeFormatter.print(event.getTimeStamp), event.getThreadName, event.getLevel, event.getLoggerName, (new AnsiString(event.getFormattedMessage)).getPlain.toString().trim())
  }
}

object SaturnLogger {
  def apply(clientClass: Class[_], verbosityLevel: VerbosityLevel, logFileName: String, appendToLogFile: Boolean = false) = new SaturnLogger(clientClass, verbosityLevel, logFileName, appendToLogFile)
}

class SaturnLogger(clientClass: Class[_], verbosityLevel: VerbosityLevel, logFileName: String, appendToLogFile: Boolean) extends Slf4jLogger(clientClass) {
  val loggerContext: LoggerContext = LoggerFactory.getILoggerFactory().asInstanceOf[LoggerContext]
  val saturnLogger: Logger = loggerContext.getLogger(clientClass)
  saturnLogger.setLevel(Level.TRACE)

  def doto[A](target: A)(calls: (A => Unit)*): A = { calls foreach { _(target) }; target }
  def setCustomFiltersToAppender(appender: ConsoleAppender[ILoggingEvent], verbosityFilterLevel: String): ConsoleAppender[ILoggingEvent] = {
    val verbosityFilter = doto(new ThresholdFilter())(_.setContext(loggerContext), _.setLevel(verbosityFilterLevel), _.start())
    val errorFilter = doto(new LevelFilter)(_.setContext(loggerContext), _.setLevel(Level.ERROR), _.setOnMatch(FilterReply.DENY), _.start())
    doto(appender)(_.stop(), _.clearAllFilters(), _.addFilter(verbosityFilter), _.addFilter(errorFilter), _.start())
    appender
  }

  def loggerFileEncoder: PatternLayoutEncoder = {
    val e: PatternLayoutEncoder = new PatternLayoutEncoder
    e.setContext(loggerContext)
    e.setPattern("%msg%n")
    e.start()
    e
  }

  val loggerFileAppender = {
    val root: Logger = LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME).asInstanceOf[Logger]
    val fileAppender = root.getAppender("FILE").asInstanceOf[FileAppender[ILoggingEvent]]
    fileAppender.stop()
    Option(logFileName) match {
      case Some(n) => fileAppender.setFile(logFileName)
      case None    => fileAppender.setFile(java.io.File.createTempFile("saturn_logger_", ".log").toString())
    }
    fileAppender.setAppend(appendToLogFile)
    fileAppender.start()
    fileAppender
  }

  val loggerConsoleAppender = {
    val root: Logger = LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME).asInstanceOf[Logger]
    val consoleAppender = root.getAppender("STDOUT").asInstanceOf[ConsoleAppender[ILoggingEvent]]
    setCustomFiltersToAppender(consoleAppender, LoggerLevel(verbosityLevel).toString())
  }

  def changeLogLevelDuringRuntime(result: IterationResult[Any])(action: => Unit) = {
    val oldVerbosity = verbosityLevel
    try {
      verbosityLevel match {
        case TRACE() | DEBUG() | NORMAL() | QUIET() =>
        case DEBUG_ON_STATUS() => verbosityLevel match {
          case DEBUG_ON_PASS() => if (result.passed) setCustomFiltersToAppender(loggerConsoleAppender, Level.DEBUG.toString())
          case DEBUG_ON_FAIL() => if (result.failed) setCustomFiltersToAppender(loggerConsoleAppender, Level.DEBUG.toString())
        }
        case _ =>
      }
      action
    }
    finally {
      setCustomFiltersToAppender(loggerConsoleAppender, LoggerLevel(oldVerbosity).toString())
    }
  }
}/*
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
