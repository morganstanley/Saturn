package com.ms.qaTools.saturn.codeGen.notifier

import java.io.ByteArrayOutputStream
import java.io.OutputStream
import java.io.PrintStream

import scala.collection.mutable.ListBuffer
import scala.collection.mutable.Map
import scala.util.Failure
import scala.util.Success

import org.apache.commons.lang.exception.ExceptionUtils

import com.ms.qaTools.ThrowableUtil
import com.ms.qaTools.saturn.codeGen.Attribute
import com.ms.qaTools.saturn.codeGen.Context
import com.ms.qaTools.saturn.codeGen.IterationResult
import com.ms.qaTools.saturn.codeGen.IteratorResult
import com.ms.qaTools.saturn.codeGen.MetaDataContext
import com.ms.qaTools.saturn.codeGen.ResourceContext
import com.ms.qaTools.saturn.metaData.RepetitionHandler
import com.ms.qaTools.saturn.runtime.DEBUG
import com.ms.qaTools.saturn.runtime.NORMAL
import com.ms.qaTools.saturn.runtime.QUIET
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import com.ms.qaTools.saturn.runtime.TRACE
import com.ms.qaTools.saturn.runtime.VerbosityLevel
import com.ms.qaTools.saturn.runtime.notifier.console.spaces
import com.ms.qaTools.saturn.runtime.notifier.console.statusToString
import com.ms.qaTools.saturn.runtime.notifier.console.stringToAnsiColorString

package object console {
  implicit class IteratorResultOutputStreamWriter[ResultType](result: IteratorResult[ResultType]) {
    def writeToStdout(runGroupName: String, configType: String, verbosityLevel: VerbosityLevel = NORMAL())(implicit noColorOutput: Boolean = false, sc: SaturnExecutionContext) = write(runGroupName, configType, System.out)
    def writeToStderr(runGroupName: String, configType: String)(implicit noColorOutput: Boolean = false, sc: SaturnExecutionContext) = write(runGroupName, configType, System.err)
    def write(runGroupName: String, configType: String, os: OutputStream)(implicit noColorOutput: Boolean = false, sc: SaturnExecutionContext) = {
      val metaData = result.metaData
      val hasRepetitionHandler = metaData.collect { case b: RepetitionHandler => b }.headOption.isDefined
      val verbosityAnnotationLevel = metaData.collect { case v: VerbosityLevel => v }.headOption.getOrElse(NORMAL())
      val verbosityLevel = VerbosityLevel.max(verbosityAnnotationLevel, sc.outputVerbosity)
      // Shown only when we have a repetition handler, otherwise the Iteration notifier will display the details.

      if (hasRepetitionHandler) {
        sc.logger.info("%s(%s) - %s".format(runGroupName.blue.bold.reset, configType.blue, statusToString(result.status)))

        for (e <- result.exception) printThrowable(e, verbosityLevel)
        printComplexValueWarnings(result.context.complexValues, verbosityLevel)

        sc.logger.debug(spaces(2) + "Iterations:".blue)
        result.iterationResults.zipWithIndex.foreach {
          case (ir, index) => ir match {
            case Success(s) => sc.logger.debug(s"${spaces(4)}${runGroupName.blue.bold.reset}[$index] - " + statusToString(s.status))
            case Failure(e) => sc.logger.debug(s"${spaces(4)}${runGroupName.blue.bold.reset}[$index] - FAIL" + "FAIL".red)
          }
        }
      }

      printAttributes(result.context.attributes)
      printResources(result.context.resourceContexts)
    }
  }

  implicit class IterationResultOutputStreamWriter[ResultType](result: IterationResult[ResultType]) {
    def writeToStdout(runGroupName: String, configType: String)(implicit noColorOutput: Boolean = false, sc: SaturnExecutionContext) = sc.logger.synchronized(write(runGroupName, configType, System.out))
    def writeToStderr(runGroupName: String, configType: String)(implicit noColorOutput: Boolean = false, sc: SaturnExecutionContext) = sc.logger.synchronized(write(runGroupName, configType, System.err))
    def write(runGroupName: String, configType: String, os: OutputStream)(implicit noColorOutput: Boolean = false, sc: SaturnExecutionContext) = {
      val metaData = result.metaData

      sc.logger.info("%s(%s) - %s".format(runGroupName.blue.bold.reset, configType.blue, statusToString(result.status)))
      val verbosityAnnotationLevel = metaData.collect { case v: VerbosityLevel => v }.headOption.getOrElse(NORMAL())

      val verbosityLevel = VerbosityLevel.max(verbosityAnnotationLevel, sc.outputVerbosity)

      for (e <- result.exception) printThrowable(e, verbosityLevel)
      printComplexValueWarnings(result.context.complexValues, verbosityLevel)

      printAttributes(result.context.attributes)
      printResources(result.context.resourceContexts)
    }
  }

  def printAttributes(attributes: ListBuffer[Attribute])(implicit noColor: Boolean = false, sc: SaturnExecutionContext) = {
    if (!attributes.isEmpty) {
      sc.logger.debug(spaces(1) + "Attributes:".blue)
      attributes.distinct sortBy(_.name) foreach { a =>
        val value = a.value match {
          case Left(v)  => v
          case Right(e) => e.getMessage.red
        }
        sc.logger.debug("%s%s %s".format(spaces(2), (s"${a.name} :".blue), value))
      }
      sc.logger.debug("")
    }
  }

  def printResources(resourceContexts: Map[String, ResourceContext])(implicit noColor: Boolean = false, sc: SaturnExecutionContext) = {
    if (resourceContexts.size > 0) {
      sc.logger.debug(spaces(1) + "Resources:".blue)
      resourceContexts.toSeq.sortBy(r => r._1).foreach(r => {
        printResourceContext(r._2, 2)
      })
      sc.logger.debug("")
    }
  }

  def printResourceContext(rc: ResourceContext, indent: Int = 0)(implicit noColor: Boolean = false, sc: SaturnExecutionContext): Unit = {
    val colon = if(rc.resourceContexts.isEmpty && rc.metaDataContexts.isEmpty) "" else ":"
    sc.logger.debug("%s%s(%s)".format(spaces(indent), rc.name.blue, rc.resourceType.blue) + colon.blue)
    rc.resourceContexts.toSeq.foreach(rcc => printResourceContext(rcc._2, indent + 1))
    rc.metaDataContexts.toSeq.foreach {
      case (name, mdc) => {
        for (md <- mdc.metaData) {
          md match {
            case mdc: MetaDataContext => {
              sc.logger.debug("%s%s".format(spaces(indent + 1), (name + ":").blue))
              val outputStream = new ByteArrayOutputStream
              printMetaDataContext(mdc, indent + 2, new PrintStream(outputStream))
              sc.logger.debug(new String(outputStream.toByteArray()))
              outputStream.close()
            }
            case _ => sc.logger.debug("%s%s %s".format(spaces(indent + 1), (name + ":").blue, mdc.metaData.getOrElse("")))
          }
        }
      }
    }
  }

  def printMetaDatas(metaDataContexts: Map[String, MetaDataContext], metaDataNames: TraversableOnce[String], indent: Int = 0, outputStream: PrintStream = Console.out)(implicit noColor: Boolean = false) = {
    metaDataNames.foreach(m => {
      metaDataContexts.get(m) match {
        case Some(r) => printMetaDataContext(r, indent, outputStream)
        case None    => outputStream.println(spaces(indent) + (m + ":").blue + " N/A!")
      }
    })
  }

  def printMetaDataContext(md: MetaDataContext, indent: Int = 0, outputStream: PrintStream = System.out)(implicit noColor: Boolean = false): Unit = {
    val metaDataContexts = md.metaDataContexts.toSeq
    if (metaDataContexts.isEmpty) outputStream.println("%s%s %s".format(spaces(indent), (md.name + ":").blue, md.metaData.getOrElse("")))
    else {
      outputStream.println("%s%s\n%s%s".format(spaces(indent), (md.name + ":").blue, spaces(indent + 1), (md.metaData.getOrElse("").toString + ":").blue))
      metaDataContexts.foreach(mdc => printMetaDataContext(mdc._2, indent + 2, outputStream))
    }
  }

  def logPrintMetaDatas(metaDataContexts: Map[String, MetaDataContext], metaDataNames: TraversableOnce[String], indent: Int = 0)(implicit noColor: Boolean = false, sc: SaturnExecutionContext) = {
    val outputStream = new ByteArrayOutputStream
    printMetaDatas(metaDataContexts, metaDataNames, indent, new PrintStream(outputStream))
    val outputByteArray = outputStream.toByteArray()
    sc.logger.debug(new String(outputStream.toByteArray(), 0, if (outputByteArray.endsWith("\n".getBytes)) outputByteArray.length - 1 else outputByteArray.length))
    outputStream.close
  }

  def printThrowable(t: Throwable, verbosity: VerbosityLevel)(implicit noColor: Boolean = false, sc: SaturnExecutionContext) {
    sc.logger.trace("Stack Trace:".red.bold)
    sc.logger.trace(spaces(1) + ExceptionUtils.getStackTrace(t).replaceAll("\n", "\n" + spaces(1)).red)
    if (verbosity < TRACE())
      sc.logger.info(t.getCauseStackString.red)
  }

  def printComplexValueWarnings(complexValues: Seq[Context.ComplexValue], verbosity: VerbosityLevel)
                               (implicit noColor: Boolean = false, sc: SaturnExecutionContext) {
    complexValues foreach {
      case Context.ComplexValue(name, Right(t)) =>
        sc.logger.debug(s"Warning: $name".yellow.bold)
        printThrowable(t, verbosity)
      case _ =>
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
