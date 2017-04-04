package com.ms.qaTools.interpreter

import scala.annotation.implicitNotFound
import scala.math.abs
import scala.tools.nsc.interpreter.IMain
import scala.tools.nsc.interpreter.NamedParam
import scala.tools.nsc.interpreter.Results
import scala.tools.nsc.Settings
import java.io.File
import com.ms.qaTools.toolkit.Result
import com.ms.qaTools.toolkit.Pass
import com.ms.qaTools.toolkit.Fail
import com.ms.qaTools._
import com.ms.qaTools.toolkit.Status
import com.ms.qaTools.toolkit.Failed
import com.ms.qaTools.toolkit.Passed



case class ScalaInterpreterResult(override val status: Status,
  command: String,
  resultObj: Option[Any] = None,
  override val exception: Option[Throwable] = None,
  override val errorMessage: Option[String] = None) extends InterpreterResult

class ScalaInterpreter(debug: Boolean,
  imports: Iterable[String],
  bindings: Map[String, Any]) extends Interpreter[String, ScalaInterpreterResult] {

  private lazy val settings = {
    val set = new Settings
    set.classpath.value += File.pathSeparator + System.getProperty("java.class.path")
    set
  }

  class QAToolsIMain extends IMain(settings = settings) { override def lastRequest = prevRequestList.last }

  private lazy val imain = new QAToolsIMain()

  def run(code: String): ScalaInterpreterResult = {
    imain.clearExecutionWrapper()
    imain.setContextClassLoader
    val codeSb = new StringBuilder()
    imports.map {i => codeSb append s"import ${i};\n"}
    val results = if (debug) {
      bindings.foreach {
        b => imain.bind(NamedParam(b._1, b._2))
      }
      //if (imain.isParseable(code)) imain.interpret(code)      
      imain.interpret(codeSb.append(code).toString)
    } else {
      //imports.foreach { i => imain.beQuietDuring(imain.addImports(i)) }
      bindings.foreach {
        b => imain.beQuietDuring(imain.bind(NamedParam(b._1, b._2)))
      }
      //if (imain.isParseable(code)) imain.quietRun(code)
      imain.quietRun(codeSb.append(code).toString)
    }

    if (results == Results.Error || results == Results.Incomplete)
      ScalaInterpreterResult(Failed(), code, errorMessage = Some("Error interpreting the code: " + results.toString))
    else {
      val func = imain.lastRequest.lineRep.call("$result")
      imain.close
      Option(func) match {
        case Some(f) => ScalaInterpreterResult(Passed(), code, resultObj = Option(f))
        case None => ScalaInterpreterResult(Failed(), code, errorMessage = Option("Scala code could not compile."))
      }
    }
  }
}

object ScalaInterpreter {
  def apply(
    debug: Boolean = false,
    imports: Iterable[String] = Nil,
    bindings: Map[String, Any] = Map.empty) = new ScalaInterpreter(debug, imports, bindings)
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
