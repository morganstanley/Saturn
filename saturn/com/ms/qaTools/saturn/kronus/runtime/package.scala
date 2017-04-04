package com.ms.qaTools.saturn.kronus

import java.util.concurrent.ExecutorService

import scala.collection.JavaConverters._
import scala.concurrent.ExecutionContext
import scala.concurrent.duration.Duration
import scala.util.Try

package object runtime {
  import scala.language.implicitConversions

  def passIfAllPass[A](contexts: Seq[Context[A]])(implicit executionContext: ExecutionContext): Context[Seq[Try[A]]] =
    Context.removeNotRun(contexts).map(_.map(_._1)).flatMap(Context.noFailure)

  def kronusCodeBlock[A](body: Closeables => Context[A])
                        (implicit executor: ExecutionContext, counter: ReferenceCounter): Context[A] = {
    val closeables = new Closeables
    body(closeables).andThen(t => closeables.closeAll(t.toOption))
  }

  def shutdown(executor: ExecutorService, timeout: Duration, reportError: String => Unit): Unit = try {
    val Duration(n, unit) = timeout
    executor.shutdown()
    if (!executor.awaitTermination(n, unit)) {
      reportError(s"Force shutdown $executor")
      val tasks = executor.shutdownNow().asScala.toSeq
      reportError(s"Tasks not run: $tasks")
    }
  } catch {
    case _: InterruptedException =>
      executor.shutdownNow()
      Thread.currentThread.interrupt()
  }

  implicit def liftToContext[X](x: X): Context[X] = Context.successful(x)
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
