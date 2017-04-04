package com.ms.qaTools.tree.validator

import com.ms.qaTools.collections._
import com.ms.qaTools._
import com.ms.qaTools.tree._
import org.slf4j.{ LoggerFactory }

trait Matcher[NodeType] {
  val global: Boolean
  val mapper: Mapper[NodeType]
  val comparator: Comparator[NodeType]

  def collapseMatchedNodes(matched: Seq[(Option[TreeNode[NodeType]], Option[TreeNode[NodeType]])], result: TreeResult[NodeType] = TreeResult()): TreeResult[NodeType] =
    matched.foldLeft(result) {
      (tr, pair) =>
        pair match {
          case (Some(e), Some(a)) => tr #+ Result(e, matched = true) +# Result(a, matched = true)
          case (Some(e), None)    => tr #+ Result(e, matched = true)
          case (None, Some(a))    => tr +# Result(a, matched = true)
          case (None, None)       => throw new Error("Unhandled exception.")
        }
    }

  def matchAndCompare(expected: TreeNode[NodeType], actual: TreeNode[NodeType], result: TreeResult[NodeType], globalMatchers: Set[Matcher[NodeType]]): TreeResult[NodeType] =
    matchNodes(expected, actual).foldLeft(result) { case (r, (e, a)) => r ++ comparator.compare(e, a, r, globalMatchers) }

  def matchNodes(pair: (TreeNode[NodeType], TreeNode[NodeType])): Seq[(Option[TreeNode[NodeType]], Option[TreeNode[NodeType]])] = matchNodes(pair._1, pair._2)

  def matchNodes(expected: TreeNode[NodeType], actual: TreeNode[NodeType]): Seq[(Option[TreeNode[NodeType]], Option[TreeNode[NodeType]])]
}

class LinearMatcher[NodeType](
  val mapper: Mapper[NodeType],
  val comparator: Comparator[NodeType],
  val global: Boolean = false)
  extends Matcher[NodeType] {
  require(mapper != null, "A matcher needs a mapper")

  def matchNodes(expected: TreeNode[NodeType], actual: TreeNode[NodeType]): Seq[(Option[TreeNode[NodeType]], Option[TreeNode[NodeType]])] = {
    val mappedNodes = mapper.mapNodes(expected, actual)
    zipAsOption(mappedNodes.expected, mappedNodes.actual)
  }
}

object LinearMatcher {
  def apply[NodeType](mapper: Mapper[NodeType], comparator: Option[Comparator[NodeType]], global: Boolean): LinearMatcher[NodeType] =
    new LinearMatcher(mapper, comparator.getOrElse(new Comparator[NodeType]()), global = global)

  def apply[NodeType](mapper: Mapper[NodeType], comparator: Option[Comparator[NodeType]]): LinearMatcher[NodeType] =
    new LinearMatcher(mapper, comparator.getOrElse(new Comparator[NodeType]()), global = false)

  def apply[NodeType](mapper: Mapper[NodeType]): LinearMatcher[NodeType] =
    new LinearMatcher(mapper, comparator = new Comparator[NodeType](), global = false)
}

class KeyedMatcher[NodeType](
  val mapper: Mapper[NodeType],
  val comparator: Comparator[NodeType],
  val expectedLookups: Seq[Lookup[NodeType]],
  val actualLookups: Seq[Lookup[NodeType]],
  val global: Boolean = false) extends Matcher[NodeType] {
  require(mapper != null, "A matcher needs a mapper")

  trait Indexed {
    val keys: String
    val keyNodes: Iterable[TreeNode[NodeType]]
  }

  override def matchAndCompare(expected: TreeNode[NodeType], actual: TreeNode[NodeType], result: TreeResult[NodeType], globalMatchers: Set[Matcher[NodeType]]): TreeResult[NodeType] = {
    def foldKeyNodes0(f: (TreeResult[NodeType], Result[NodeType]) => TreeResult[NodeType])(keyNodes: Iterable[TreeNode[NodeType]], result: TreeResult[NodeType]) = 
        keyNodes.foldLeft(result) { (r, k) => f(r,Result(k, usedAsKey = true)) }
    def foldExpected0 = foldKeyNodes0((r: TreeResult[NodeType], keyResult: Result[NodeType]) => r #+ keyResult) _ 
    def foldActual0 = foldKeyNodes0((r: TreeResult[NodeType], keyResult: Result[NodeType]) => r +# keyResult) _

    val matched = matchNodes(expected, actual)
    val matchedAndKeyedResult = matched.foldLeft(result) {
      (r, pair) =>
        pair match {
          case (Some(e), Some(a)) => foldExpected0(e.keyNodes, r) ++ foldActual0(a.keyNodes, r)
          case (Some(e), None)    => foldExpected0(e.keyNodes, r)
          case (None, Some(a))    => foldActual0(a.keyNodes, r)
          case (None, None)       => throw new Error("Unhandled exception.")
        }
    }
    matched.foldLeft(matchedAndKeyedResult) { case (r, (e, a)) => r ++ comparator.compare(e, a, r, globalMatchers) }
  }

  def matchNodes(expected: TreeNode[NodeType], actual: TreeNode[NodeType]): Seq[(Option[TreeNode[NodeType] with Indexed], Option[TreeNode[NodeType] with Indexed])] = {
    def createIndexedNode(n: TreeNode[NodeType], keyLookups: Seq[Lookup[NodeType]]): TreeNode[NodeType] with Indexed = {
      new TreeNodeProxy(n) with Indexed {
        val keyNodes = keyLookups.flatMap(_.getNodes(n))
        val keys = keyNodes.map { _.value }.mkString("_")
      }
    }
    val mappedNodes = mapper.mapNodes(expected, actual)
    val expectedSortedByKeys = mappedNodes.expected.map { createIndexedNode(_, expectedLookups) } sortWith { (a, b) => a.keys < b.keys }
    val actualSortedByKeys = mappedNodes.actual.map { createIndexedNode(_, actualLookups) } sortWith { (a, b) => a.keys < b.keys }
    (zipWithCondition(expectedSortedByKeys, actualSortedByKeys) {
      (j, k) => j.keys.compareTo(k.keys)
    })
  }
}

object KeyedMatcherWithMapper {
  def apply[NodeType](
    expectedNodeName: String,
    actualNodeName: String,
    keyLookups: Seq[Lookup[NodeType]],
    comparator: Option[Comparator[NodeType]],
    global: Boolean)(implicit lookupCreator: String => Lookup[NodeType]): KeyedMatcher[NodeType] =
    new KeyedMatcher(
      NameMapper(expectedNodeName, actualNodeName),
      comparator.getOrElse(new Comparator[NodeType](name = "Comparator(" + expectedNodeName + ", " + actualNodeName + ")")),
      keyLookups,
      keyLookups,
      global)

  def apply[NodeType](
    expectedNodeName: String,
    actualNodeName: String,
    expectedKeyLookups: Seq[Lookup[NodeType]],
    actualKeyLookups: Seq[Lookup[NodeType]],
    comparator: Option[Comparator[NodeType]],
    global: Boolean)(implicit lookupCreator: String => Lookup[NodeType]): KeyedMatcher[NodeType] =
    new KeyedMatcher(
      NameMapper(expectedNodeName, actualNodeName),
      comparator.getOrElse(new Comparator[NodeType](name = "Comparator(" + expectedNodeName + ", " + actualNodeName + ")")),
      expectedKeyLookups,
      actualKeyLookups,
      global)
}

object KeyedMatcher {
  def apply[NodeType](
    mapper: Mapper[NodeType],
    keyLookups: Seq[Lookup[NodeType]],
    comparator: Option[Comparator[NodeType]],
    global: Boolean): KeyedMatcher[NodeType] =
    new KeyedMatcher(
      mapper,
      comparator.getOrElse(new Comparator[NodeType]()),
      keyLookups,
      keyLookups,
      global)

  def apply[NodeType](
    mapper: Mapper[NodeType],
    expectedKeyLookups: Seq[Lookup[NodeType]],
    actualKeyLookups: Seq[Lookup[NodeType]],
    comparator: Option[Comparator[NodeType]],
    global: Boolean): KeyedMatcher[NodeType] =
    new KeyedMatcher(
      mapper,
      comparator.getOrElse(new Comparator[NodeType]()),
      expectedKeyLookups,
      actualKeyLookups,
      global)
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
