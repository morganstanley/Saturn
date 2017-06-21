package com.ms.qaTools.interpreter

import scala.tools.nsc.interpreter
import scala.util.control.NonFatal

import com.ms.qaTools.toolkit

case class ScalaInterpreterResult(
  status: toolkit.Status,
  command: String,
  resultObj: Option[Any] = None,
  exception: Option[Throwable] = None,
  override val errorMessage: Option[String] = None
) extends InterpreterResult

class ScalaInterpreter(debug: Boolean, imports: Iterable[String], bindings: Map[String, Any])
extends Interpreter[String, ScalaInterpreterResult] {
  private lazy val settings = {
    val set = new scala.tools.nsc.Settings
    Option(System.getProperty("sbt-classpath")) match {
      case Some(cp) => set.classpath.value = cp
      case None     => set.classpath.value += java.io.File.pathSeparator + System.getProperty("java.class.path")
    }
    set.deprecation.value = true
    set
  }

  class QAToolsIMain extends interpreter.IMain(settings = settings) {
    override def lastRequest = prevRequestList.last}

  private lazy val imain = new QAToolsIMain()

  def run(code: String): ScalaInterpreterResult = {
    imain.clearExecutionWrapper()
    imain.setContextClassLoader
    val codeSb = new StringBuilder()
    imports.map {i => codeSb append s"import ${i};\n"}
    val results = if (debug) {
      bindings.foreach {
        b => imain.bind(interpreter.NamedParam(b._1, b._2))
      }
      imain.interpret(codeSb.append(code).toString)
    }
    else {
      //imports.foreach { i => imain.beQuietDuring(imain.addImports(i)) }
      bindings.foreach {
        b => imain.beSilentDuring(imain.bind(interpreter.NamedParam(b._1, b._2)))
      }
      imain.quietRun(codeSb.append(code).toString)
    }

    if (results == interpreter.Results.Error || results == interpreter.Results.Incomplete)
      ScalaInterpreterResult(toolkit.Failed, code, errorMessage = Some("Error interpreting the code: " + results.toString))
    else {
      val func = imain.lastRequest.lineRep.call("$result")
      imain.close
      Option(func) match {
        case Some(f) => ScalaInterpreterResult(toolkit.Passed, code, resultObj = Option(f))
        case None => ScalaInterpreterResult(toolkit.Failed, code, errorMessage = Option("Scala code could not compile."))
      }
    }
  }

  def eval[A](code: String): A = try run(code) match {
    case r: toolkit.Result if r.status == toolkit.Passed => r.resultObj match {
      case Some(x) => x.asInstanceOf[A]
      case None    => throw new NoSuchElementException("Scala interpreter didn't return a result object.")
    }
    case r => throw new RuntimeException(r.errorMessage.orNull, r.exception.orNull)
  } catch {
    case NonFatal(t) => throw new IllegalArgumentException(s"error while eval `$code'", t)
  }
}

object ScalaInterpreter {
  def apply(debug: Boolean = false, imports: Iterable[String] = Nil, bindings: Map[String, Any] = Map.empty) =
    new ScalaInterpreter(debug, imports, bindings)
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
