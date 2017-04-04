package com.ms.qaTools.saturn.kronus.runtime

import scala.concurrent.{Future, ExecutionContext, Promise}
import scala.util.{Try, Success, Failure}

sealed abstract class Terminal
case object NoopTerminal extends Terminal
case class PassTerminal(name: String) extends Terminal
case class FailTerminal(name: String) extends Terminal

case class TerminalMeta(depth: Int = 0) extends MetaData {
  def increaseDepth: TerminalMeta = copy(depth + 1)
}

object TerminalMeta {
  implicit object DepthOrdering extends Ordering[MetaStore] {
    def compare(x: MetaStore, y: MetaStore) = {
      val Seq(dx, dy) = Seq(x, y).map(_.apply[TerminalMeta].depth)
      dx compareTo dy
    }
  }

  implicit class ContextBooleanOps(self: Context[Boolean]) {
    def ||(that: Context[Boolean])(implicit executionContext: ExecutionContext): Context[Boolean] = {
      val p = Promise[(Try[Boolean], MetaStore)]()
      self.future.onComplete {
        case Success(x) => that.future.onComplete {
          case Success(y)                         => p.complete(Try(combine(false, x, y)))
          case Failure(_: NoSuchElementException) => p.completeWith(self.future)
          case f                                  => p.complete(f)
        }
        case Failure(_: NoSuchElementException) =>
          p.completeWith(that.future)
        case f =>
          p.complete(f)
      }
      Context(future = p.future)
    }

    def &&(that: Context[Boolean])(implicit executionContext: ExecutionContext): Context[Boolean] = {
      val f = for (x <- self.future; y <- that.future) yield combine(true, x, y)
      Context(future = f)
    }

    protected def combine(pickFalse: Boolean,
                          x: (Try[Boolean], MetaStore),
                          y: (Try[Boolean], MetaStore)): (Try[Boolean], MetaStore) = (x, y) match {
      case ((Success(true),  m), (Success(true),  n)) => if (DepthOrdering.lt(m, n)) x else y
      case ((Success(false), _), (Success(_),     _)) => if (pickFalse) x else y
      case ((Success(_),     _), (Success(false), _)) => if (pickFalse) y else x
      case ((t1,             _), (t2,             _)) => throw t1.failed.orElse(t2.failed).get
    }
  }
}

object Terminal {
  def result(results: Seq[Context[Any]])(implicit executor: ExecutionContext): Context[Seq[Try[Any]]] = {
    import TerminalMeta.DepthOrdering
    Context.removeNotRun(results).flatMap { xs =>
      xs.collect {case (Success(t@(_: PassTerminal | _: FailTerminal)), ms) => (t, ms)} match {
        case Seq() => Context.noFailure(xs.map(_._1))
        case ts    => ts.maxBy(_._2) match {
          case (t: PassTerminal, _) => Context.successful(Seq(Success(t)))
          case (t: FailTerminal, _) => Context.fromTry(Failure(KronusFailure(Seq(Success(t)), Some(t.toString), None)))
        }
      }
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
