package com.ms.qaTools.saturn.result

import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import scala.util.Try

import com.ms.qaTools.saturn.codeGen.IteratorResult
import com.ms.qaTools.saturn.codeGen.IterationContext
import com.ms.qaTools.saturn.codeGen.IterationResult
import com.ms.qaTools.{toolkit => tk}

case class ProcedureCallResult(status: tk.Status, referentName: String, iteratorResult: Try[IteratorResult[tk.Result]], exception: Option[Throwable] = None) extends tk.Result

object ProcedureCallResult {
  def apply(referentName: String, result: Try[IteratorResult[tk.Result]]): ProcedureCallResult =
    result.map{ iteratorResult =>
      if (iteratorResult.status == tk.Passed) ProcedureCallResult(tk.Passed, referentName, result)
      else ProcedureCallResult(tk.Failed, referentName, result, iteratorResult.exception)
    } match {
      case scala.util.Success(v) => v
      case scala.util.Failure(t) => ProcedureCallResult(tk.Failed, referentName, result, Option(t))
    }

  def fromIteratorResult
    [A <: tk.Result]
    (name: String,
     result: Future[Try[IteratorResult[A]]],
     context: IterationContext,
     metaData: Seq[Any],
     iterationNo: Int)
    (implicit executor: ExecutionContext): Future[IterationResult[ProcedureCallResult]] = result.map { result =>
    val r = ProcedureCallResult(name, result)
    IterationResult(r.status, context, metaData, r, iterationNo)
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
