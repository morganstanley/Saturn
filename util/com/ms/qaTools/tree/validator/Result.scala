package com.ms.qaTools.tree.validator

import scala.util.matching.Regex
import com.ms.qaTools._
import com.ms.qaTools.compare.Explainable
import com.ms.qaTools.tree._
import com.ms.qaTools.collections._
import com.ms.qaTools.compare.ValidationPassedTree
import com.ms.qaTools.compare.AbstractDiff

case class TreeResult[NodeType](
  expected: Map[String, Result[NodeType]] = Map[String, Result[NodeType]](),
  actual: Map[String, Result[NodeType]] = Map[String, Result[NodeType]]()) {
  protected def mergeResult0(a: Map[String, Result[NodeType]], b: Map[String, Result[NodeType]]): Map[String, Result[NodeType]] = 
    mergeMap(Seq(a, b))((v1, v2) => v1 + v2)

  def ++(that: TreeResult[NodeType]): TreeResult[NodeType] = TreeResult(mergeResult0(expected, that.expected), mergeResult0(actual, that.actual))
  def #+(that: Map[String, Result[NodeType]]): TreeResult[NodeType] = TreeResult(mergeResult0(expected, that), actual)
  def #+(that: (String, Result[NodeType])): TreeResult[NodeType] = #+(Map(that))
  def #+(that: Result[NodeType]): TreeResult[NodeType] = #+((that.node.path -> that))
  def +#(that: Map[String, Result[NodeType]]): TreeResult[NodeType] = TreeResult(expected, mergeResult0(actual, that))
  def +#(that: (String, Result[NodeType])): TreeResult[NodeType] = +#(Map(that))
  def +#(that: Result[NodeType]): TreeResult[NodeType] = +#((that.node.path -> that))
  
  private def compared(m: Map[String, Result[NodeType]]) = m.values.flatMap {_.diff}.filterNot {_.isInstanceOf[ValidationTreeNodeDiff[_]]}
  def actualCompared = compared(actual)
  def expectedCompared = compared(expected)

  sealed trait TreeResultStatistics[NodeType] {
    def hasComparisons: Boolean
    def validation: Iterable[ValidationResult[NodeType]]
    def hasValidation: Boolean
    def isIdentical: Boolean
    def differences: (Iterable[AbstractTreeNodeDiff], Iterable[AbstractTreeNodeDiff])
    def hasDifferences: Boolean
    def isValidatedPass: Boolean
    def isValidatedFail: Boolean    
  }  
  
  def statistics = new TreeResultStatistics[NodeType] {
    val (expectedDiffs, actualDiffs) = (expectedCompared, actualCompared)
    val hasComparisons = ! expectedDiffs.isEmpty || ! actualDiffs.isEmpty
    val validation = actual.values.filter(v => v.isValidated).flatMap(_.validation)
    val hasValidation = ! validation.isEmpty
    val isIdentical = !hasValidation && expectedDiffs.forall {_.isInstanceOf[IdenticalTreeNodeDiff[NodeType]]} && actualDiffs.forall {_.isInstanceOf[IdenticalTreeNodeDiff[NodeType]]}
    val differences = (expectedDiffs.filterNot { _.isInstanceOf[IdenticalTreeNodeDiff[NodeType]] }, actualDiffs.filterNot {_.isInstanceOf[IdenticalTreeNodeDiff[NodeType]]})
    val hasDifferences = !(differences._1.isEmpty && differences._2.isEmpty)
    val isValidatedPass = hasValidation && actual.values.flatMap {_.validation}.forall {_.result}
    val isValidatedFail = hasValidation && actual.values.flatMap {_.validation}.exists {! _.result}    
  }
}

case class DiffMetaData(name: String)

// this is like the old cell diff.
trait AbstractTreeNodeDiff extends AbstractDiff {
  val meta: DiffMetaData
  def mkString: String
  
}
trait HasExpected[NodeType] {val expected: TreeNode[NodeType]}
trait HasActual[NodeType] {val actual: TreeNode[NodeType]}

trait ExplainableTreeNodeDiff[NodeType] extends AbstractTreeNodeDiff with Explainable {
  var explained: Iterable[(TreeNode[NodeType], TreeNode[NodeType], String)] = Nil
}

trait UnexplainableTreeNodeDiff[NodeType] extends AbstractTreeNodeDiff with Explainable {
  val explanation: Option[String] = None
  def explain(explanation: String) = throw new Error("Cannot explain an unexplainable diff.")
}

case class DifferentTreeNodeDiff[NodeType](  
  expected: TreeNode[NodeType],
  actual: TreeNode[NodeType],
  meta: DiffMetaData,
  explanation: Option[String] = None) extends ExplainableTreeNodeDiff[NodeType] with HasExpected[NodeType] with HasActual[NodeType] {
  def mkString = "D(" + expected.path + ", " + actual.path + "): " + expected.value + " != " + actual.value + "  Explanation(" + explanation + ")"
  def explain(explanation: String) = DifferentTreeNodeDiff[NodeType](expected, actual, meta, Option(explanation))
}

case class IdenticalTreeNodeDiff[NodeType](
  expected: TreeNode[NodeType],
  actual: TreeNode[NodeType],
  meta: DiffMetaData) extends UnexplainableTreeNodeDiff[NodeType] with HasExpected[NodeType] with HasActual[NodeType] {
  def mkString = "I(" + expected.path + ", " + actual.path + ")"
}
case class InLeftTreeNodeDiff[NodeType](
  expected: TreeNode[NodeType],
  meta: DiffMetaData,
  explanation: Option[String] = None) extends ExplainableTreeNodeDiff[NodeType] with HasExpected[NodeType] {
  def mkString = "IL(" + expected.path + ")"
  def explain(explanation: String) = InLeftTreeNodeDiff[NodeType](expected, meta, Option(explanation))
}
case class InRightTreeNodeDiff[NodeType](
  actual: TreeNode[NodeType],
  meta: DiffMetaData,
  explanation: Option[String] = None) extends ExplainableTreeNodeDiff[NodeType] with HasActual[NodeType] {
  def mkString = "IR(" + actual.path + ")"
  def explain(explanation: String) = InRightTreeNodeDiff[NodeType](actual, meta, Option(explanation))
}

trait ValidationTreeNodeDiff[NodeType] extends ExplainableTreeNodeDiff[NodeType] with HasActual[NodeType]

case class ValidationPassedTreeNodeDiff[NodeType](
  actual: TreeNode[NodeType],
  meta: DiffMetaData,
  explanation: Option[String] = None) extends ValidationTreeNodeDiff[NodeType] {
  def mkString = "VP(" + meta.name + ", " + actual.path + ")"
  def explain(explanation: String) = ValidationPassedTreeNodeDiff[NodeType](actual, meta, Option(explanation))
}

case class ValidationFailedTreeNodeDiff[NodeType](
  actual: TreeNode[NodeType],
  meta: DiffMetaData,
  explanation: Option[String] = None) extends ValidationTreeNodeDiff[NodeType] {
  def mkString = "VF(" + meta.name + ", " + actual.path + ")"
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

case class Result[NodeType](
  node: TreeNode[NodeType],
  diff: Option[AbstractTreeNodeDiff] = None,
  validation: Set[ValidationResult[NodeType]] = Set[ValidationResult[NodeType]](),
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
      validation ++ that.validation,
      compared = compared || that.compared,
      matched = matched || that.matched,
      ignored = ignored || that.ignored,
      usedAsKey = usedAsKey || that.usedAsKey)
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
