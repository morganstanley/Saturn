package com.ms.qaTools.tree.validator

import scala.collection.immutable.HashMap

import com.ms.qaTools.collections.zipWithCondition
import com.ms.qaTools.compare.Explainer
import com.ms.qaTools.compare.StringExplainer
import com.ms.qaTools.tree.TreeNode

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
        m.matchAndCompare(e, a, r, matchers.filter { _.global }.toSet)) _
  def foldIgnores =
    foldRulesOnBoth[Lookup[NodeType]](
      (e: TreeNode[NodeType], a: TreeNode[NodeType], r: TreeResult[NodeType], ignores: Iterable[Lookup[NodeType]], i: Lookup[NodeType]) =>
        i.getNodes(a).foldLeft {
          i.getNodes(e).foldLeft(r) { (r, n) =>
            r #+ Result[NodeType](n, ignored = true)
          }
        } { (r, n) =>
          r +# Result[NodeType](n, ignored = true)
        }) _
  def foldValidators =
    foldRulesOnActual[Validator[NodeType]](
      (a: TreeNode[NodeType], r: TreeResult[NodeType], validators: Iterable[Validator[NodeType]], v: Validator[NodeType]) => v.validate(a, r)) _

  def explain(diff: ExplainableTreeNodeDiff[NodeType]): ExplainableTreeNodeDiff[NodeType] = explainer.fold(diff) { _.explain(diff) }

  def compare(e: Option[TreeNode[NodeType]], a: Option[TreeNode[NodeType]], result: TreeResult[NodeType] = TreeResult[NodeType](), globalMatchers: Iterable[Matcher[NodeType]] = Set.empty[Matcher[NodeType]]): TreeResult[NodeType] =
    processTuple((e, a), result, validators, ignores, matchers ++ globalMatchers)

  private def diff(e: TreeNode[NodeType], a: TreeNode[NodeType], actual: Map[String, Result[NodeType]]) = {
    val diff =
      if (e.hasValue || a.hasValue) Some {
        actual.get(e.path(true)) match {
          case Some(r) if (r.ignored) =>
            explain(ValidationPassedTreeNodeDiff(a, DiffMetaData("Ignore(" + r.node.path(true) + ")"), Option("Ignore Validation Present.")))
          case Some(r) if (r.isValidated) =>
            explain {
              if (r.validation.filter(!_.result).isEmpty)
                ValidationPassedTreeNodeDiff(a, DiffMetaData(r.validation.map { _.meta.name }.mkString(", ")))
              else
                ValidationFailedTreeNodeDiff(a, DiffMetaData(r.validation.map { _.meta.name }.mkString(", ")))
            }
          case _ => {
            (e.value, a.value) match {
              case (Some(ev), Some(av)) if (ev == av) => IdenticalTreeNodeDiff(e, a, DiffMetaData(name))
              case (Some(_), Some(_)) | (None, Some(_)) | (Some(_), None) => explain(DifferentTreeNodeDiff(e, a, DiffMetaData(name)))
              case (None, None) => IdenticalTreeNodeDiff(e, a, DiffMetaData(name))
            }
          }
        }
      } else None
    val previous = actual.getOrElse(a.path(true), Result[NodeType](a))
    TreeResult(HashMap(e.path(true) -> Result(e, diff, compared = true, ignored = previous.ignored)),
               HashMap(a.path(true) -> (Result(a, diff, compared = true) + previous)))
  }
    
  private def processTuple(tuple: Tuple2[Option[TreeNode[NodeType]], Option[TreeNode[NodeType]]],
                           result: TreeResult[NodeType],
                           validators: Iterable[Validator[NodeType]],
                           ignores: Iterable[Lookup[NodeType]],
                           matchers: Iterable[Matcher[NodeType]]): TreeResult[NodeType] =
    tuple match {
      case (None, None) =>
        throw new Error("Cannot compare, no expected and no actual.")
      case (None, Some(a)) if (!ignoreInRightOnly) =>
        foldValidators(a, result, validators) +# (Result(a, Option(explain(InRightTreeNodeDiff(a, DiffMetaData(name)))), compared = true))
      case (Some(e), None) if (!ignoreInLeftOnly) =>
        result #+ (Result(e, Option(explain(InLeftTreeNodeDiff(e, DiffMetaData(name)))), compared = true))
      case (Some(e), Some(a)) => {
        val subTreeResults = foldMatchers(e, a, foldValidators(a, foldIgnores(e, a, result, ignores), validators), matchers)
        
        def sortNodes(matchAgainst: Map[String, Result[NodeType]], nodes: Seq[TreeNode[NodeType]]) =
          nodes sortWith { (a, b) => a.path(false) < b.path(false) } filter { x =>
            val result = matchAgainst.getOrElse(x.path(true), Result[NodeType](x))
            !result.usedAsKey && !result.compared && !result.ignored
          }
        
        val (leafNodes,nonLeafNodes) = 
          zipWithCondition(sortNodes(subTreeResults.expected, e.children()), sortNodes(subTreeResults.actual, a.children())) { (e, a) => e.name.compare(a.name) }
            .partition {case (Some(e), Some(a)) if e.children().isEmpty && a.children().isEmpty => true; case _ => false }
            
        val leafNodesResult = (Iterator.single((Some(e), Some(a))) ++ leafNodes).foldLeft(subTreeResults) {
          case (t, (Some(e), Some(a))) => t ++ diff(e, a, subTreeResults.actual)
        }
        val globalMatchers = matchers.filter(_.global)
        nonLeafNodes.foldLeft(leafNodesResult)((res, tuple) => processTuple(tuple, res, Nil, Nil, globalMatchers))
      }
      case _ => result
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
