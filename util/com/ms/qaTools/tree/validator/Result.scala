package com.ms.qaTools.tree.validator

import scala.collection.immutable.HashMap
import scala.collection.immutable.HashSet
import scala.util.matching.Regex

import com.ms.qaTools.compare.AbstractDiff
import com.ms.qaTools.compare.Explainable
import com.ms.qaTools.tree._

object TreeResult {
  case class Statistics[A](different:        Set[DifferentTreeNodeDiff[A]],
                           identical:        Set[IdenticalTreeNodeDiff[A]],
                           inLeftOnly:       Set[InLeftTreeNodeDiff[A]],
                           inRightOnly:      Set[InRightTreeNodeDiff[A]],
                           validationPassed: Set[ValidationPassedTreeNodeDiff[A]],
                           validationFailed: Set[ValidationFailedTreeNodeDiff[A]],
                           validations:      Iterable[ValidationResult[A]]) {
    def hasComparisons: Boolean = hasDifferences || identical.nonEmpty
    def hasValidation: Boolean = validations.nonEmpty
    def hasDifferences: Boolean = different.nonEmpty || inLeftOnly.nonEmpty || inRightOnly.nonEmpty
    def isIdentical: Boolean = !hasValidation && !hasDifferences
    def isValidatedPass: Boolean = hasValidation && validations.forall(_.result)
    def isValidatedFail: Boolean = hasValidation && !isValidatedPass
  }
}

case class TreeResult[NodeType](
  expected: HashMap[String, Result[NodeType]] = HashMap.empty[String, Result[NodeType]],
  actual: HashMap[String, Result[NodeType]] = HashMap.empty[String, Result[NodeType]]) {
  protected def mergeResult0(a: HashMap[String, Result[NodeType]],
                             b: HashMap[String, Result[NodeType]]): HashMap[String, Result[NodeType]] =
    a.merged(b)((kva, kvb) => (kva._1, kva._2 + kvb._2))

  def ++(that: TreeResult[NodeType]): TreeResult[NodeType] = TreeResult(mergeResult0(expected, that.expected), mergeResult0(actual, that.actual))
  def #+(that: HashMap[String, Result[NodeType]]): TreeResult[NodeType] = TreeResult(mergeResult0(expected, that), actual)
  def #+(that: (String, Result[NodeType])): TreeResult[NodeType] = #+(HashMap(that))
  def #+(that: Result[NodeType]): TreeResult[NodeType] = #+((that.node.path(true) -> that))
  def +#(that: HashMap[String, Result[NodeType]]): TreeResult[NodeType] = TreeResult(expected, mergeResult0(actual, that))
  def +#(that: (String, Result[NodeType])): TreeResult[NodeType] = +#(HashMap(that))
  def +#(that: Result[NodeType]): TreeResult[NodeType] = +#((that.node.path(true) -> that))

  lazy val statistics: TreeResult.Statistics[NodeType] = {
    val d  = Set.newBuilder[DifferentTreeNodeDiff[NodeType]]
    val i  = Set.newBuilder[IdenticalTreeNodeDiff[NodeType]]
    val il = Set.newBuilder[InLeftTreeNodeDiff[NodeType]]
    val ir = Set.newBuilder[InRightTreeNodeDiff[NodeType]]
    val vp = Set.newBuilder[ValidationPassedTreeNodeDiff[NodeType]]
    val vf = Set.newBuilder[ValidationFailedTreeNodeDiff[NodeType]]
    (expected.valuesIterator ++ actual.valuesIterator).flatMap(_.diff).foreach {
      case diff: DifferentTreeNodeDiff[NodeType]        => d  += diff
      case diff: IdenticalTreeNodeDiff[NodeType]        => i  += diff
      case diff: InLeftTreeNodeDiff[NodeType]           => il += diff
      case diff: InRightTreeNodeDiff[NodeType]          => ir += diff
      case diff: ValidationPassedTreeNodeDiff[NodeType] => vp += diff
      case diff: ValidationFailedTreeNodeDiff[NodeType] => vf += diff
    }
    TreeResult.Statistics(d.result(), i.result(), il.result(), ir.result(), vp.result(), vf.result(),
                          actual.values.flatMap(_.validation))
  }
}

case class DiffMetaData(name: String)

trait AbstractTreeNodeDiffLowPriorityImplicits { _: AbstractTreeNodeDiff.type =>
  implicit def actualOrdering[A <: AbstractTreeNodeDiff with HasActual[_]]: Ordering[A] = Ordering.by(_.actual.path(true))
}

object AbstractTreeNodeDiff extends AbstractTreeNodeDiffLowPriorityImplicits {
  implicit def expectedOrdering[A <: AbstractTreeNodeDiff with HasExpected[_]]: Ordering[A] = Ordering.by(_.expected.path(true))
}

// this is like the old cell diff.
trait AbstractTreeNodeDiff extends AbstractDiff {
  val meta: DiffMetaData
  def mkString: String
  def status: String
}
trait HasExpected[NodeType] {val expected: TreeNode[NodeType]}
trait HasActual[NodeType] {val actual: TreeNode[NodeType]}

trait ExplainableTreeNodeDiff[NodeType] extends AbstractTreeNodeDiff with Explainable[ExplainableTreeNodeDiff[NodeType]]

trait UnexplainableTreeNodeDiff[NodeType] extends AbstractTreeNodeDiff with Explainable[UnexplainableTreeNodeDiff[NodeType]] {
  val explanation: Option[String] = None
  def explain(explanation: String) = throw new Error("Cannot explain an unexplainable diff.")
}

case class DifferentTreeNodeDiff[NodeType](
  expected: TreeNode[NodeType],
  actual: TreeNode[NodeType],
  meta: DiffMetaData,
  explanation: Option[String] = None) extends ExplainableTreeNodeDiff[NodeType] with HasExpected[NodeType] with HasActual[NodeType] {
  def status = "D"
  def mkString = status + "(" + expected.path(true) + ", " + actual.path(true) + "): " + expected.value + " != " + actual.value + "  Explanation(" + explanation + ")"
  def explain(explanation: String) = DifferentTreeNodeDiff[NodeType](expected, actual, meta, Option(explanation))
}

case class IdenticalTreeNodeDiff[NodeType](
  expected: TreeNode[NodeType],
  actual: TreeNode[NodeType],
  meta: DiffMetaData) extends UnexplainableTreeNodeDiff[NodeType] with HasExpected[NodeType] with HasActual[NodeType] {
  def status = "I"
  def mkString = status + "(" + expected.path(true) + ", " + actual.path(true) + ")"
}
case class InLeftTreeNodeDiff[NodeType](
  expected: TreeNode[NodeType],
  meta: DiffMetaData,
  explanation: Option[String] = None) extends ExplainableTreeNodeDiff[NodeType] with HasExpected[NodeType] {
  def status = "IL"
  def mkString = status + "(" + expected.path(true) + ")"
  def explain(explanation: String) = InLeftTreeNodeDiff[NodeType](expected, meta, Option(explanation))
}
case class InRightTreeNodeDiff[NodeType](
  actual: TreeNode[NodeType],
  meta: DiffMetaData,
  explanation: Option[String] = None) extends ExplainableTreeNodeDiff[NodeType] with HasActual[NodeType] {
  def status = "IR"
  def mkString = status + "(" + actual.path(true) + ")"
  def explain(explanation: String) = InRightTreeNodeDiff[NodeType](actual, meta, Option(explanation))
}

trait ValidationTreeNodeDiff[NodeType] extends ExplainableTreeNodeDiff[NodeType] with HasActual[NodeType]

case class ValidationPassedTreeNodeDiff[NodeType](
  actual: TreeNode[NodeType],
  meta: DiffMetaData,
  explanation: Option[String] = None) extends ValidationTreeNodeDiff[NodeType] {
  def status = "VP"
  def mkString = status + "(" + meta.name + ", " + actual.path(true) + ")"
  def explain(explanation: String) = ValidationPassedTreeNodeDiff[NodeType](actual, meta, Option(explanation))
}

case class ValidationFailedTreeNodeDiff[NodeType](
  actual: TreeNode[NodeType],
  meta: DiffMetaData,
  explanation: Option[String] = None) extends ValidationTreeNodeDiff[NodeType] {
  def status = "VF"
  def mkString = status + "(" + meta.name + ", " + actual.path(true) + ")"
  def explain(explanation: String) = ValidationFailedTreeNodeDiff[NodeType](actual, meta, Option(explanation))
}

trait ValidationResult[NodeType] {
  val meta: DiffMetaData
  val node: TreeNode[NodeType]
  val result: Boolean
}
case class PatternValidationResult[NodeType](node: TreeNode[NodeType], pattern: Regex, meta: DiffMetaData, result: Boolean) extends ValidationResult[NodeType]
case class ExistenceValidationResult[NodeType](node: TreeNode[NodeType], meta: DiffMetaData, result: Boolean) extends ValidationResult[NodeType]
case class EnumValidationResult[NodeType](node: TreeNode[NodeType], meta: DiffMetaData, result: Boolean) extends ValidationResult[NodeType]
case class LambdaValidationResult[NodeType](node: TreeNode[NodeType], meta: DiffMetaData, result: Boolean) extends ValidationResult[NodeType]
case class NoNodeValidationResult[NodeType](node: TreeNode[NodeType], meta: DiffMetaData) extends ValidationResult[NodeType] {
  val result = false
}

case class Result[NodeType](
  node: TreeNode[NodeType],
  diff: Option[AbstractTreeNodeDiff] = None,
  validation: HashSet[ValidationResult[NodeType]] = HashSet[ValidationResult[NodeType]](),
  compared: Boolean = false,
  matched: Boolean = false,
  ignored: Boolean = false,
  usedAsKey: Boolean = false) {
  def isValidatedPass = isValidated && validation.forall {_.result}
  def isValidatedFail = isValidated && validation.forall {! _.result}
  def isValidated = !validation.isEmpty
  def +(that: Result[NodeType]): Result[NodeType] = {
    Result(node,
      diff.orElse(that.diff),
      validation union that.validation,
      compared = compared || that.compared,
      matched = matched || that.matched,
      ignored = ignored || that.ignored,
      usedAsKey = usedAsKey || that.usedAsKey)
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
