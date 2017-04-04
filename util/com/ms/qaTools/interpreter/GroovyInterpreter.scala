package com.ms.qaTools.interpreter

import scala.util.{Try, Success, Failure}

import com.ms.qaTools.toolkit.{Status, Passed, Failed}

import groovy.lang.Binding
import groovy.lang.GroovyShell

case class GroovyInterpreterResult(override val status: Status,
                                   command: String,
                                   resultObj: Option[Any] = None,
                                   override val exception: Option[Throwable] = None) extends InterpreterResult

object GroovyInterpreterResult {
  def fromResult(code: String)(result: => AnyRef): GroovyInterpreterResult = Try(result) match {
    case Success(r) => GroovyInterpreterResult(Passed(), code, Option(r))
    case Failure(t) => GroovyInterpreterResult(Failed(), code, exception = Option(t))
  }
}

case class GroovyInterpreter(val binding: Binding = new Binding) extends Interpreter[String, GroovyInterpreterResult] {
  val shell = new GroovyShell(getClass().getClassLoader(), binding)
  def run(command: String): GroovyInterpreterResult =
    GroovyInterpreterResult.fromResult(command)(shell.evaluate(command))
}

case class MemoizedGroovyInterpreter(val groovyCode: String) extends Interpreter[Binding, GroovyInterpreterResult] {
  val shell = new GroovyShell(getClass().getClassLoader(), new Binding())
  val script = shell.parse(groovyCode)
  def run(binding: Binding): GroovyInterpreterResult = GroovyInterpreterResult.fromResult(groovyCode) {
    script.setBinding(binding)
    script.run
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
