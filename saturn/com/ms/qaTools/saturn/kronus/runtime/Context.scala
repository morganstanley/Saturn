package com.ms.qaTools.saturn.kronus.runtime

import scala.concurrent.{Future, ExecutionContext}
import scala.reflect.ClassTag
import scala.util.{Try, Success, Failure}

import com.ms.qaTools.saturn.kronus._

case class Context[+A](val future: Future[(Try[A], MetaStore)]) {
  def flatMap[B](f: A => Context[B])(implicit executor: ExecutionContext): Context[B] = flatMapTry {
    case Success(x) => f(x)
    case Failure(t) => Context.fromTry(Failure(t))
  }

  def foreach(f: A => Unit)(implicit executor: ExecutionContext): Unit = future.foreach {case (t, _) => t.foreach(f)}

  def map[B](f: A => B)(implicit executor: ExecutionContext): Context[B] = mapTry(_.map(f))

  def mapTry[B](f: Try[A] => Try[B])(implicit executor: ExecutionContext): Context[B] =
    copy(future = future.map {case (t, ms) => (f(t), ms)})

  def flatMapTry[B](f: Try[A] => Context[B])(implicit executor: ExecutionContext): Context[B] =
    copy(future = for ((t, ms) <- future; (t, ns) <- f(t).future) yield (t, ms ++ ns))

  def andThen[B](f: Try[A] => B)(implicit executor: ExecutionContext): Context[A] =
    copy(future.andThen {case t => f(t.flatMap(_._1))})

  def rethrow(msg: String)(implicit executor: ExecutionContext): Context[A] =
    mapTry(_.recover {case t: Throwable => throw Rethrow(msg, t)})

  def putMeta(metas: MetaData*)(implicit executor: ExecutionContext): Context[A] =
    copy(future = future.map {case (t, ms) => (t, (ms /: metas)(_.put(_)))})

  def getMeta[B <: MetaData : ClassTag](implicit executor: ExecutionContext): Context[B] =
    copy(future = future.map {case (_, ms) => (Try(ms.apply), ms)})

  override def toString = s"${getClass.getSimpleName}(${future.value})"
}

object Context {
  def execute[A](body: => A)(implicit executor: ExecutionContext): Context[A] =
    apply(future = Future((Try(body), MetaStore.default)))

  def successful[A](x: A): Context[A] = fromTry(Success(x))

  def fromTry[A](t: Try[A]): Context[A] = apply(future = Future.successful((t, MetaStore.default)))

  def fromFuture[A](f: Future[A])(implicit executor: ExecutionContext): Context[A] =
    apply(future = f.map(x => (Success(x), MetaStore.default)))

  def withScope[A: ConstellationDecoration.From, B <: Scope]
               (scope: B)(body: B => Context[A])(implicit executor: ExecutionContext): Context[A] = {
    val result = body(scope)
    scope.entity.fold(result)(e => result.andThen(e.complete(_, scope.annotations))).rethrow {
      s"Error while evaluating ${scope.fullName}${locationInErrorMessage(scope.sourceLocation)}"
    }.putMeta(scope)
  }

  def removeNotRun[A](contexts: Seq[Context[A]])(implicit executor: ExecutionContext): Context[Seq[(Try[A], MetaStore)]] = {
    val f = Future.traverse(contexts) {
      _.future.map(Some(_)).recover {case _: NoSuchElementException => None}
    }.map(_.flatten)
    fromFuture(f)
  }

  def noFailure[A](ts: Seq[Try[A]]): Context[Seq[Try[A]]] = ts.collect {case Failure(t) => t} match {
    case Seq()      => Context.successful(ts)
    case Seq(t, _*) => Context.fromTry(Failure(KronusFailure(ts, None, Some(t))))
  }
}

class MetaStore protected (protected val underlying: Map[Class[_], MetaData]) extends Proxy {
  def self = underlying

  def get[A <: MetaData : ClassTag]: Option[A] = underlying.get(implicitly[ClassTag[A]].runtimeClass).map(_.asInstanceOf[A])
  def put(x: MetaData): MetaStore = new MetaStore(underlying.updated(x.getClass, x))

  def apply[A <: MetaData : ClassTag]: A =
    get.getOrElse(throw new IllegalArgumentException(s"No meta data of class ${implicitly[ClassTag[A]]}"))

  def ++(that: MetaStore): MetaStore = new MetaStore(underlying ++ that.underlying)
}

object MetaStore {
  def default = new MetaStore(Map.empty).put(TerminalMeta())
}

trait MetaData
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
