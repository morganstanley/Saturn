package com.ms.qaTools.tree.generator

import scala.slick.util.CloseableIterator
import scala.collection.AbstractIterator
import scala.annotation.tailrec
import com.ms.qaTools.io.rowSource.SeqRowSource
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.collections.mergeMap
import scala.concurrent.ExecutionContext
import scala.collection.parallel.ExecutionContextTaskSupport
import com.ms.qaTools._

class LambdaGenerator[X](generator: Seq[String] => X, rowSource: Iterator[Seq[String]] with ColumnDefinitions)(implicit ec: ExecutionContext = scala.concurrent.ExecutionContext.Implicits.global) extends AbstractIterator[X] with CloseableIterator[X] {
  val taskSupport = new ExecutionContextTaskSupport(ec)
  private[this] var cached: Iterator[X] = Iterator.empty

  @tailrec
  final def next =
    if (cached.hasNext)
      cached.next
    else if (rowSource.hasNext) {
      cached = rowSource.take(Runtime.getRuntime().availableProcessors()).toList.par.withSideEffect { _.tasksupport = taskSupport }.map { generator }.iterator
      next
    }
    else
      Iterator.empty.next


  def hasNext = rowSource.hasNext || cached.hasNext

  def close() = com.ms.qaTools.closeAny(rowSource)
}

object LambdaGeneratorUtils { o =>

  implicit class MapLookupUtil(val key: String) extends AnyVal {
    def $(implicit m: Map[String, Either[String, Seq[String]]]) = o.$(key)(m)
    def *(implicit m: Map[String, Either[String, Seq[String]]]) = o.*(key)(m)
    def ?(implicit m: Map[String, Either[String, Seq[String]]]) = o.?(key)(m)
  }

  def $(k: String)(implicit m: Map[String, Either[String, Seq[String]]]) =
    m.get(k) match {
      case Some(Left(s))  => s
      case Some(Right(s)) => s.mkString("[", ", ", "]")
      case None           => ""
    }

  def *(k: String)(implicit m: Map[String, Either[String, Seq[String]]]) =
    m.get(k) match {
      case Some(Left(s))  => Seq(s).filter {null != _}
      case Some(Right(s)) => s
      case None           => Nil
    }

  def ?(k: String)(implicit m: Map[String, Either[String, Seq[String]]]) =
    m.get(k) match {
      case Some(Left(s))  => Option(s)
      case Some(Right(s)) => Option($(k))
      case None           => None
    }
}

class LambdaCreator[X, Y](colNames: Seq[String], lambda: (Map[String, Either[String, Seq[String]]]) => Y) extends InnerNodeCreator[X, Y] {
  def merge(a: Map[String, Either[Int, Seq[Int]]], b: Map[String, Either[Int, Seq[Int]]]) =
    mergeMap(Seq(a, b)) {
      case (Left(a), Left(b))   => Right(Seq(a, b))
      case (Left(a), Right(b))  => Right(a +: b)
      case (Right(a), Left(b))  => Right(b +: a)
      case (Right(a), Right(b)) => Right(a ++ b)
    }

  def extractMap(cm: Iterable[ColDef], parent: Seq[String] = Nil): Map[String, Either[Int, Seq[Int]]] =
    cm.foldLeft(Map[String, Either[Int, Seq[Int]]]()) {
      case (m, ColDef(name, -1, _, ColMap(cm))) => merge(m, extractMap(cm.values, parent :+ name))
      case (m, ColDef(name, -1, iterations, _)) => merge(m, extractMap(iterations.flatMap { case (_, ColDef(_, _, _, ColMap(cmap))) => cmap.values; case _ => Nil }, parent :+ name))
      case (m, ColDef(name, idx, _, EmptyMap))  => merge(m, Map((parent :+ name).mkString(".") -> Left(idx)))
    }

  val mappedIndexes: Map[String, Either[Int, Seq[Int]]] =
    ColMap(colNames) match {
      case ColMap(c) => extractMap(c.values).map { case (k, Right(seq)) => (k -> Right(seq.sorted)); case (k, v) => (k -> v) }.toMap
      case _         => Map()
    }

  def creators: Seq[com.ms.qaTools.tree.generator.NodeCreator[X, Y]] = Nil
  def isLocal = false

  def create(data: Seq[String])(implicit colMap: Lookupable, colContext: ColContext, entityContext: X): Y =
    lambda(mappedIndexes.map {
      case (k, Left(i))  => (k -> Left(data(i)))
      case (k, Right(s)) => (k -> Right(s.map { data(_) }.filter { null != _ }))
    })
}

object LambdaCreator {
  import scala.reflect.runtime.universe.{ Quasiquote, runtimeMirror }
  import scala.tools.reflect.ToolBox
  import scala.util.{ Try, Success, Failure }
  private val mirror = runtimeMirror(Thread.currentThread().getContextClassLoader)
  private val toolbox = ToolBox(mirror).mkToolBox()

  def before = """{ implicit data: Map[String, Either[String,Seq[String]]] =>
    import com.ms.qaTools.tree.generator.LambdaGeneratorUtils._
"""
  def after = """
}"""

  def apply(colNames: Seq[String], lambda: String) = {
    val block = before + lambda + after
    val f1 = Try(toolbox.eval(toolbox.parse(block))) match {
      case Success(f: Function1[_, _]) => f.asInstanceOf[Function1[Map[String, Either[String, Seq[String]]], Any]] // user-supplied, deprecated the warning - let's assume it's these types, if not let it fail later in tryLambda
      case Success(a: Any) => throw new Exception(s"$block is not a Function1[Map[String, Either[String,Seq[String]]], Any], got: ${a.getClass().getCanonicalName}")
      case Failure(f) => throw new Exception(s"$block is not a Function1[Map[String, Either[String,Seq[String]]], Any]:\n ${toolbox.frontEnd.infos}", f)
    }
    new LambdaCreator[Any, Any](colNames, f1)
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
