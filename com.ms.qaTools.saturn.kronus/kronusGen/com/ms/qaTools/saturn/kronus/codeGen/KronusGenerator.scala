package com.ms.qaTools.saturn.kronus.codeGen

import java.nio.file.Path

import scala.util.Try
import scala.util.control.NonFatal

import org.eclipse.emf.ecore.EObject

import com.ms.qaTools.saturn.kronus._

trait KronusGenerator {
  def generateFile(topLevel: TopLevelKronus, outputDir: Path): Try[KronusGenerator.Result]
}

object KronusGenerator {
  def apply(): KronusGenerator = KronusTreeGenerator()
  case class Result(output: Path, appObject: String)

  object CompileException {
    def rethrow[A](eobj: EObject)(body: => A): A = try body catch {
      case NonFatal(t) => throw new CompileException(eobj, null, t)
    }
  }

  class CompileException(eobj: EObject, message: String, cause: Throwable) extends Exception(message, cause) {
    def location = Location.fromEObject(eobj)

    def path = (Iterator(eobj) ++ eobj.eContainers).collect {
      case x: AbstractDef => x.getName
    }.toSeq.reverse.mkString(".")

    override def getMessage = {
      val loc = locationInErrorMessage(location)
      val msg = Option(super.getMessage).fold("")(": " + _)
      s"Error generate code for $path$loc$msg"
    }
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
