package com.ms.qaTools.interpreter

import com.ms.qaTools.{toolkit => tk}

import groovy.lang.Binding
import groovy.lang.GroovyShell

case class GroovyInterpreterResult(status: tk.Status, command: String, resultObj: Option[Any], exception: Option[Throwable])
extends InterpreterResult

object GroovyInterpreterResult {
  def fromResult(code: String)(result: => AnyRef): GroovyInterpreterResult = {
    val r = util.Try(result)
    // XXX filter to convert Some(null) into None for backward compatibility
    GroovyInterpreterResult(if (r.isSuccess) tk.Passed else tk.Failed, code, r.toOption.filter(_ != null), r.failed.toOption)}
}

case class GroovyInterpreter(binding: Binding = new Binding) extends Interpreter[String, GroovyInterpreterResult] {
  val shell = new GroovyShell(getClass().getClassLoader(), binding)
  def run(command: String): GroovyInterpreterResult =
    GroovyInterpreterResult.fromResult(command)(shell.evaluate(command))
}

case class MemoizedGroovyInterpreter(groovyCode: String) extends Interpreter[Binding, GroovyInterpreterResult] {
  val shell = new GroovyShell(getClass().getClassLoader(), new Binding())
  val script = shell.parse(groovyCode)
  def run(binding: Binding): GroovyInterpreterResult = GroovyInterpreterResult.fromResult(groovyCode) {
    script.setBinding(binding)
    script.run
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
