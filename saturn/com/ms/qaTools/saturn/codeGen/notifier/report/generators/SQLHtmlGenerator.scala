package com.ms.qaTools.saturn.codeGen.notifier.report.generators

import java.io.ByteArrayOutputStream
import java.io.PrintStream

import org.jsoup.nodes.Element

import com.ms.qaTools.saturn.codeGen.IterationResult
import com.ms.qaTools.saturn.codeGen.notifier.console.printMetaDatas
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import com.ms.qaTools.saturn.runtime.notifier.html.appendException
import com.ms.qaTools.saturn.runtime.notifier.html.htmlSpaces
import com.ms.qaTools.saturn.runtime.notifier.html.string2Html
import com.ms.qaTools.toolkit.sql.SQLCallResult
import com.ms.qaTools.toolkit.sql.SQLClearResult
import com.ms.qaTools.toolkit.sql.SQLExecuteResult
import com.ms.qaTools.toolkit.sql.SQLFetchResult
import com.ms.qaTools.toolkit.sql.SQLLoadResult

sealed trait SQLHtmlGenerator extends BasicHtmlGenerator {
  override def runGroupIconClassName: String = "sqlIcon"
  override def runGroupType: String = "SQL"

  override def generateIterationResult(name: String, fullName: String, result: IterationResult[Any], parentElement: Element, asScenario: Boolean = false, displayIterationNo: Boolean = true): Unit = {
    val outputStream = new ByteArrayOutputStream
    val metaDataContexts = result.context.metaDataContexts

    printMetaDatas(metaDataContexts, Seq("DatabaseResource"), 0, new PrintStream(outputStream))(true)
    parentElement.append(string2Html(new String(outputStream.toByteArray)) + "<br/>")
    outputStream.close()
  }
}

case class SQLFetchHtmlGenerator(implicit sc: SaturnExecutionContext) extends SQLHtmlGenerator {
  override def runGroupType: String = "SQLFetch"

  override def generateIterationResult(name: String, fullName: String, result: IterationResult[Any], parentElement: Element, asScenario: Boolean = false, displayIterationNo: Boolean = true): Unit = {
    super.generateIterationResult(name, fullName, result, parentElement, asScenario, displayIterationNo)
    result.moduleResult match {
      case SQLFetchResult(status, queries) =>
        parentElement.append("<b><u>SQL Fetch Operation</u></b><br/>")
        for (e <- result.exception) appendException(parentElement, e, 0)(sc.outputVerbosity)

        val outputStream = new ByteArrayOutputStream
        val metaDataContexts = result.context.metaDataContexts

        parentElement.append("Queries:<br/>")
        queries.zipWithIndex.foreach {
          case (q, i) => {
            parentElement.append(htmlSpaces(1) + "Query #%s: <br/>".format(i))
            parentElement.append(htmlSpaces(2) + "Sql: " + q.query + "<br/>")
            printMetaDatas(metaDataContexts, Seq(s"Output_$i"), 2, new PrintStream(outputStream))(true)
            parentElement.append(string2Html(new String(outputStream.toByteArray)))
            outputStream.reset
            for (e <- q.exception) appendException(parentElement, e, 1)(sc.outputVerbosity)
          }
        }
      case r => throw new Exception(s"SQLFetchHtmlGenerator cannot handle this type of result: ${r.getClass.getName}")
    }
  }
}

case class SQLExecuteHtmlGenerator(implicit sc: SaturnExecutionContext) extends SQLHtmlGenerator {
  override def runGroupType: String = "SQLExecute"

  override def generateIterationResult(name: String, fullName: String, result: IterationResult[Any], parentElement: Element, asScenario: Boolean = false, displayIterationNo: Boolean = true): Unit = {
    super.generateIterationResult(name, fullName, result, parentElement, asScenario, displayIterationNo)
    result.moduleResult match {
      case SQLExecuteResult(status, statements) =>
        parentElement.append("<b><u>SQL Execute Operation</u></b><br/>")
        for (e <- result.exception) appendException(parentElement, e, 0)(sc.outputVerbosity)

        parentElement.append("Queries:<br/>")
        statements.zipWithIndex.foreach {
          case (q, i) => {
            parentElement.append(htmlSpaces(1) + "Sql command #%s: %s".format(i, q.statement) + "<br/>")
            for (e <- q.exception) appendException(parentElement, e, 1)(sc.outputVerbosity)
          }
        }
      case r => throw new Exception(s"SQLExecuteHtmlGenerator cannot handle this type of result: ${r.getClass.getName}")
    }
  }
}

case class SQLClearHtmlGenerator(implicit sc: SaturnExecutionContext) extends SQLHtmlGenerator {
  override def runGroupType: String = "SQLClear"

  override def generateIterationResult(name: String, fullName: String, result: IterationResult[Any], parentElement: Element, asScenario: Boolean = false, displayIterationNo: Boolean = true): Unit = {
    super.generateIterationResult(name, fullName, result, parentElement, asScenario, displayIterationNo)
    result.moduleResult match {
      case SQLClearResult(status, actions) =>
        parentElement.append("<b><u>SQL Clear Operation</u></b><br/>")
        for (e <- result.exception) appendException(parentElement, e, 0)(sc.outputVerbosity)

        parentElement.append("Tables:<br/>")
        actions.zipWithIndex.foreach {
          case (q, i) => {
            parentElement.append(htmlSpaces(1) + "Table #%s: %s".format(i, q.table) + "<br/>")
            for (e <- q.exception) appendException(parentElement, e, 1)(sc.outputVerbosity)
          }
        }
      case r => throw new Exception(s"SQLClearHtmlGenerator cannot handle this type of result: ${r.getClass.getName}")
    }
  }
}

case class SQLCallHtmlGenerator(implicit sc: SaturnExecutionContext) extends SQLHtmlGenerator {
  override def runGroupType: String = "SQLCall"

  override def generateIterationResult(name: String, fullName: String, result: IterationResult[Any], parentElement: Element, asScenario: Boolean = false, displayIterationNo: Boolean = true): Unit = {
    super.generateIterationResult(name, fullName, result, parentElement, asScenario, displayIterationNo)
    result.moduleResult match {
      case SQLCallResult(status, calls) =>
        parentElement.append("<b><u>SQL Call Operation</u></b><br/>")
        for (e <- result.exception) appendException(parentElement, e, 0)(sc.outputVerbosity)

        val outputStream = new ByteArrayOutputStream
        val metaDataContexts = result.context.metaDataContexts

        parentElement.append("Procedures:<br/>")
        calls.zipWithIndex.foreach {
          case (q, i) => {
            parentElement.append(htmlSpaces(1) + "Procedure #%s: %s".format(i, q.procedure) + "<br/>")
            printMetaDatas(metaDataContexts, Seq(s"Output_$i"), 2, new PrintStream(outputStream))(true)
            parentElement.append(string2Html(new String(outputStream.toByteArray)))
            outputStream.reset
            for (e <- q.exception) appendException(parentElement, e, 1)(sc.outputVerbosity)
          }
        }
      case r => throw new Exception(s"SQLCallHtmlGenerator cannot handle this type of result: ${r.getClass.getName}")
    }
  }
}

case class SQLLoadHtmlGenerator(implicit sc: SaturnExecutionContext) extends SQLHtmlGenerator {
  override def runGroupType: String = "SQLLoad"

  override def generateIterationResult(name: String, fullName: String, result: IterationResult[Any], parentElement: Element, asScenario: Boolean = false, displayIterationNo: Boolean = true): Unit = {
    super.generateIterationResult(name, fullName, result, parentElement, asScenario, displayIterationNo)
    result.moduleResult match {
      case SQLLoadResult(status, actions) =>
        parentElement.append("<b><u>SQL Load Operation</u></b><br/>")
        for (e <- result.exception) appendException(parentElement, e, 0)(sc.outputVerbosity)

        val outputStream = new ByteArrayOutputStream
        val metaDataContexts = result.context.metaDataContexts

        parentElement.append("Tables:<br/>")
        actions.zipWithIndex.foreach {
          case (q, i) => {
            parentElement.append(htmlSpaces(1) + "Table %s: %s<br/>".format(i, q.table))
            printMetaDatas(metaDataContexts, Seq(s"Input_$i"), 2, new PrintStream(outputStream))(true)
            parentElement.append(string2Html(new String(outputStream.toByteArray)))
            outputStream.reset
            for (e <- q.exception) appendException(parentElement, e, 1)(sc.outputVerbosity)
          }
        }
      case r => throw new Exception(s"SQLLoadHtmlGenerator cannot handle this type of result: ${r.getClass.getName}")
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
