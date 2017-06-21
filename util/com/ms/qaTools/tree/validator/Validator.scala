package com.ms.qaTools.tree.validator

import scala.collection.immutable.HashSet
import scala.util.{ Try, Failure, Success }
import scala.util.matching.Regex

import com.ms.qaTools.interpreter.GroovyInterpreter
import com.ms.qaTools.tree._

import groovy.lang.Closure

trait Validator[NodeType] {
  val name: String
  val lookups: Seq[Lookup[NodeType]]

  private case class NullNode(n: TreeNode[NodeType], at: Lookup[NodeType]) extends TreeNode[NodeType] {
    private def throwNoNode = throw new Exception("Node doesn't exist.")
    def node = throwNoNode
    def name = throwNoNode
    def value = throwNoNode
    def path(canonical: Boolean) = s"${n.path(canonical)}/${at.asPath}"
    def children(f: (NodeType) => Boolean) = Nil
  }

  def runValidationOn(n: TreeNode[NodeType]): ValidationResult[NodeType]
  def validate(actual: TreeNode[NodeType], init: TreeResult[NodeType]): TreeResult[NodeType] =
    if (lookups.isEmpty) {
      init +# Result[NodeType](actual, validation = HashSet(runValidationOn(actual)))
    }
    else {
      lookups.foldLeft(init) {
        (results, lookup) =>
          val nodes = lookup.getNodes(actual)
          if (nodes.isEmpty) {
            val nullNode = NullNode(actual, lookup)
            results +# Result[NodeType](nullNode, validation = HashSet(NoNodeValidationResult(nullNode, DiffMetaData(name))))
          }
          else
            nodes.foldLeft(results) {
              (r, n) => r +# Result[NodeType](n, validation = HashSet(runValidationOn(n)))
            }
      }
    }
}

case class PatternValidator[NodeType](regex: Regex, lookups: Seq[Lookup[NodeType]] = Nil) extends Validator[NodeType] {
  val name = s"Pattern($regex, ${lookups.map { l => l.asPath }.mkString(", ")})"
  def runValidationOn(n: TreeNode[NodeType]): ValidationResult[NodeType] =
    PatternValidationResult(n, regex, DiffMetaData(name), regex.findFirstIn(n.valueAsString).isDefined)
}

case class ExistsValidator[NodeType](lookups: Seq[Lookup[NodeType]] = Nil) extends Validator[NodeType] {
  val name = s"Exists(${lookups.map { l => l.asPath }.mkString(", ")})"
  def runValidationOn(n: TreeNode[NodeType]): ValidationResult[NodeType] =
    ExistenceValidationResult(n, DiffMetaData(name), true)
}

case class EnumValidator[NodeType](enums: Seq[String], lookups: Seq[Lookup[NodeType]] = Nil)
  extends Validator[NodeType] {
  val name = s"Enum(${enums.mkString(", ")}, ${lookups.map { l => l.asPath }.mkString(", ")})"
  def runValidationOn(n: TreeNode[NodeType]): ValidationResult[NodeType] =
    EnumValidationResult(n, DiffMetaData(name), enums.contains(n.valueAsString))
}

trait LambdaValidator[NodeType] extends Validator[NodeType] {
  val lambda: String
  val name = s"Lambda(${lambda.take(32)}..., ${lookups.map { l => l.asPath }.mkString(", ")})"
  def tryLambda(n: TreeNode[NodeType]): Try[Any]
  def runValidationOn(n: TreeNode[NodeType]): ValidationResult[NodeType] = LambdaValidationResult(n, DiffMetaData(name), runLambdaOn(n))
  def runLambdaOn(n: TreeNode[NodeType]) =
    tryLambda(n) match {
      case Success(b: Boolean) => b
      case Success(a: Any)     => throw new Exception(s"$lambda should be a Any => Boolean closure.  Got a ${a.getClass().getSimpleName}")
      case Failure(f)          => throw new Exception(s"Could not execute lambda $lambda as a Function1[Option[Any], Boolean].", f)
    }
}

case class ScalaLambdaValidator[NodeType](lambda: String, lookups: Seq[Lookup[NodeType]] = Nil) extends LambdaValidator[NodeType] {
  import scala.reflect.runtime.universe.{ Quasiquote, runtimeMirror }
  import scala.tools.reflect.ToolBox

  private val mirror = runtimeMirror(Thread.currentThread().getContextClassLoader)
  private val toolbox = ToolBox(mirror).mkToolBox()
  val f1 = Try(toolbox.eval(toolbox.parse(lambda))) match {
    case Success(f: Function1[Any, Boolean] @deprecated("", "qaTools/util/2.1.61")) => f // user-supplied, deprecated the warning - let's assume it's these types, if not let it fail later in tryLambda
    case Success(a: Any)                                 => throw new Exception(s"$lambda is not a Function1[Option[Any],Boolean], got: ${a.getClass().getCanonicalName}")
    case Failure(f)                                      => throw new Exception(s"$lambda is not a Function1[Option[Any],Boolean]", f)
  }
  def tryLambda(n: TreeNode[NodeType]) = Try(f1(n.value.orNull))
}

case class GroovyLambdaValidator[NodeType](lambda: String, lookups: Seq[Lookup[NodeType]] = Nil) extends LambdaValidator[NodeType] {
  private val closure =
    new GroovyInterpreter().run(lambda).resultObj match {
      case Some(c: Closure[_]) => c
      case None                => throw new Exception(s"$lambda is not a compilable closure.")
      case a: Any              => throw new Exception(s"$lambda is not a compilable closure.  Got ${a.getClass().getSimpleName}")
    }
  def tryLambda(n: TreeNode[NodeType]) = Try(closure.call(n.value.orNull))
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
