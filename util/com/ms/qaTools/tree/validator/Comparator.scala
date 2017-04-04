package com.ms.qaTools.tree.validator

import scala.annotation.tailrec
import com.ms.qaTools.collections.zipWithCondition
import com.ms.qaTools.compare.Explainer
import com.ms.qaTools.compare.StringExplainer
import com.ms.qaTools.tree.TreeNode
import scalaz.syntax.std.boolean.ToBooleanOpsFromBoolean

case class TreeDiffExplainer[NodeType](explain: ExplainableTreeNodeDiff[NodeType] => ExplainableTreeNodeDiff[NodeType]) extends Explainer[ExplainableTreeNodeDiff[NodeType]]

object TreeDiffExplainer {
  def apply[NodeType](code: String, debug: Boolean = false): TreeDiffExplainer[NodeType] =
    TreeDiffExplainer[NodeType](StringExplainer[ExplainableTreeNodeDiff[NodeType]](code, debug).explain)
}

trait ComparatorWithKeys[T] {
  val comparator: Comparator[T]
  val keys: Seq[String]
}

class Comparator[NodeType](
  val matchers: Iterable[Matcher[NodeType]] = Nil,
  val validators: Iterable[Validator[NodeType]] = Nil,
  val explainer: Option[TreeDiffExplainer[NodeType]] = None,
  val name: String = "Comparator(/)",
  val ignores: Iterable[Lookup[NodeType]] = Nil,
  val ignoreInLeftOnly: Boolean = false,
  val ignoreInRightOnly: Boolean = false) {

  type RuleApplyOnBoth[X] = Function5[TreeNode[NodeType], TreeNode[NodeType], TreeResult[NodeType], Iterable[X], X, TreeResult[NodeType]]
  type RuleApplyOnActual[X] = Function4[TreeNode[NodeType], TreeResult[NodeType], Iterable[X], X, TreeResult[NodeType]]

  def foldRulesOnBoth[X](f: RuleApplyOnBoth[X])(e: TreeNode[NodeType], a: TreeNode[NodeType], r: TreeResult[NodeType], rules: Iterable[X]) =
    rules.foldLeft(r) { (result, rule) => f(e, a, result, rules, rule) }
  def foldRulesOnActual[X](f: RuleApplyOnActual[X])(a: TreeNode[NodeType], r: TreeResult[NodeType], rules: Iterable[X]) =
    rules.foldLeft(r) { (result, rule) => f(a, result, rules, rule) }

  def foldMatchers =
    foldRulesOnBoth[Matcher[NodeType]](
      (e: TreeNode[NodeType], a: TreeNode[NodeType], r: TreeResult[NodeType], matchers: Iterable[Matcher[NodeType]], m: Matcher[NodeType]) =>
        r ++ m.matchAndCompare(e, a, r, matchers.filter { _.global }.toSet)) _
  def foldIgnores =
    foldRulesOnBoth[Lookup[NodeType]](
      (e: TreeNode[NodeType], a: TreeNode[NodeType], r: TreeResult[NodeType], ignores: Iterable[Lookup[NodeType]], i: Lookup[NodeType]) =>
        r ++ i.getNodes(e).foldLeft(r) { (r, n) => r #+ Result[NodeType](n, ignored = true) } ++ i.getNodes(a).foldLeft(r) { (r, n) => r +# Result[NodeType](n, ignored = true) }) _
  def foldValidators =
    foldRulesOnActual[Validator[NodeType]](
      (a: TreeNode[NodeType], r: TreeResult[NodeType], validators: Iterable[Validator[NodeType]], v: Validator[NodeType]) => r ++ v.validate(a)) _

  def explain(diff: ExplainableTreeNodeDiff[NodeType]): ExplainableTreeNodeDiff[NodeType] = explainer.fold(diff) { _.explain(diff) }

  def compare(e: Option[TreeNode[NodeType]], a: Option[TreeNode[NodeType]], result: TreeResult[NodeType] = TreeResult[NodeType](), globalMatchers: Iterable[Matcher[NodeType]] = Set.empty[Matcher[NodeType]]): TreeResult[NodeType] =
    compare(List((e, a)), result, validators, ignores, matchers ++ globalMatchers)
    
  @tailrec private def compare(
    tuples: List[(Option[TreeNode[NodeType]], Option[TreeNode[NodeType]])], 
    result: TreeResult[NodeType],
    validators: Iterable[Validator[NodeType]],
    ignores: Iterable[Lookup[NodeType]],
    matchers: Iterable[Matcher[NodeType]]): TreeResult[NodeType] =
    tuples match {
      case Nil => result
      case (None, None) :: xs =>
        throw new Error("Cannot compare, no expected and no actual.")
      case (None, Some(a)) :: xs if (!ignoreInRightOnly) =>
        compare(xs, result ++ foldValidators(a, result, validators) +# (Result(a, Option(explain(InRightTreeNodeDiff(a, DiffMetaData(name)))), compared = true)), Nil, Nil, matchers.filter {_.global})
      case (Some(e), None) :: xs if (!ignoreInLeftOnly) =>
        compare(xs, result #+ (Result(e, Option(explain(InLeftTreeNodeDiff(e, DiffMetaData(name)))), compared = true)), Nil, Nil, matchers.filter {_.global})
      case (Some(e), Some(a)) :: xs => {
        val subTreeResults = foldMatchers(e, a, foldValidators(a, foldIgnores(e, a, result, ignores), validators), matchers)
        val (expected, actual) = (subTreeResults.expected, subTreeResults.actual)

        def sortedNodesThatShouldBeCompared(matchAgainst: Map[String, Result[NodeType]])(nodes: Seq[TreeNode[NodeType]]) =
          nodes sortWith { (a, b) => a.path < b.path } filter { x =>
            val result = matchAgainst.getOrElse(x.path, Result[NodeType](x))
            !result.usedAsKey && !result.compared && !result.ignored
          }
        def eSortedNodes = sortedNodesThatShouldBeCompared(expected) _
        def aSortedNodes = sortedNodesThatShouldBeCompared(actual) _

        val pairedChildren = zipWithCondition(eSortedNodes(e.children()), aSortedNodes(a.children())) { (e, a) => e.name.compare(a.name) }

        def compareNodes0(eNode: TreeNode[NodeType], aNode: TreeNode[NodeType]): TreeResult[NodeType] = {
          val diff =
            (eNode.hasValue || aNode.hasValue) option {
              actual.get(eNode.path) match {
                case Some(r) if (r.ignored) =>
                  explain(ValidationPassedTreeNodeDiff(aNode, DiffMetaData("Ignore(" + r.node.path + ")"), Option("Ignore Validation Present.")))
                case Some(r) if (r.isValidated) =>
                  explain {
                    if (r.validation.filter(!_.result).isEmpty)
                      ValidationPassedTreeNodeDiff(aNode, DiffMetaData(r.validation.map { _.meta.name }.mkString(", ")))
                    else
                      ValidationFailedTreeNodeDiff(aNode, DiffMetaData(r.validation.map { _.meta.name }.mkString(", ")))
                  }
                case _ => {
                  (eNode.value, aNode.value) match {
                    case (Some(ev: Comparable[Any]), Some(av: Comparable[Any])) =>
                      ev.compareTo(av) match {
                        case 0 => IdenticalTreeNodeDiff(eNode, aNode, DiffMetaData(name))
                        case _ => explain(DifferentTreeNodeDiff(eNode, aNode, DiffMetaData(name)))
                      }
                    case (None, Some(_)) | (Some(_), None) => explain(DifferentTreeNodeDiff(eNode, aNode, DiffMetaData(name)))
                    case (None, None)                      => IdenticalTreeNodeDiff(eNode, aNode, DiffMetaData(name))
                    case _                                 => throw new Error("Cannot compare uncomparables.")
                  }
                }
              }
            }
          val previous = actual.getOrElse(aNode.path, Result[NodeType](aNode))
          TreeResult(
            Map(eNode.path -> Result(eNode, diff, compared = true, ignored = previous.ignored)),
            Map(aNode.path -> (Result(aNode, diff, compared = true) + previous)))
        }
        compare(xs ++ pairedChildren, subTreeResults ++ compareNodes0(e, a), Nil, Nil, matchers.filter {_.global})
      }
      case _ :: xs => compare(xs, result, Nil, Nil, matchers.filter {_.global})
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
