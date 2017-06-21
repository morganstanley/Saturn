package com.ms.qaTools.tree.generator
import scala.beans.BeanProperty

trait Lookupable {
  def lookup(q: ResolvedColQuery): ColDef
  def lookup(n: String): ColDef = lookup(ResolvedColQuery(n))
  def lookupIndices: Set[Int]
}

class UnresolvedQueryException(val query: ColQuery[_]) extends Throwable("Can't resolve column for: " + query.queryString + ".")

case class ColMap(colMap: Map[String, ColDef] = Map()) extends Lookupable {
  def lookup(q: ResolvedColQuery) =
    if (q.isEmpty) throw new Exception("Lookup empty column query.")
    else {
      val h = q.head
      if (!colMap.isDefinedAt(h.name)) throw new Exception("Can't lookup column \"%s\" because the mapping doesn't exist.".format(h.name))
      colMap(h.name).lookup(q)
    }
  def lookupIndices = colMap.values.flatMap { _.lookupIndices }.toSet
}

case object EmptyMap extends Lookupable {
  def lookup(q: ResolvedColQuery) = throw new UnresolvedQueryException(q)
  def lookupIndices = Set.empty
}

case class ColDef(@BeanProperty name: String, @BeanProperty index: Int = -1, iterations: Seq[(String, ColDef)] = Nil, children: Lookupable = EmptyMap)
extends Lookupable {
  val iterationCount = iterations.length
  def lookup(q: ResolvedColQuery) = {
    val cDef = q.head match {
      case ColQueryIndexPart(name, index) =>
        if (index == 0 && iterationCount == 0) this
        else {
          if (index < 0 || index >= iterationCount) throw new Exception("Can't lookup column \"%s\" for iteration \"%s\". Iteration index out of bound.".format(name, index))
          iterations(index)._2
        }
      case ColQueryScalarPart(name) => this
    }
    if (q.tail.isEmpty) cDef
    else
      try {
        cDef.children.lookup(q.tail)
      } catch {
        // catch lower exceptions and add information recursively
        case e: UnresolvedQueryException => throw new UnresolvedQueryException(q)
      }
  }

  def lookupIndices =
    (if (index != -1) Set(index) else Set[Int]()).union(iterations.flatMap{_._2.lookupIndices}.toSet).union(children.lookupIndices)
}

object ColMap {
  protected val hasIter = new scala.util.matching.Regex("""^(.*?)(\d+)$""", "p", "i")

  case class PartListWithIndex(parts: Seq[(String, Option[String])], index: Int) {
    def tail = PartListWithIndex(parts.tail, index)
    def isTrimmable = parts.length > 1
    def isIterating = parts.head._2.isDefined
    def removeIteration = PartListWithIndex((parts.head._1, None) :: parts.tail.toList, index)
  }

  def extractAllPartsLists(colNamePartStrs: List[String], colNameParts: List[(String, Option[String])] = Nil): List[List[(String, Option[String])]] =
    if (colNamePartStrs.isEmpty) List(colNameParts)
    else colNamePartStrs.head match {
      case hasIter(name, index) => extractAllPartsLists(colNamePartStrs.tail, colNameParts ::: List((name + index, None))) ::: extractAllPartsLists(colNamePartStrs.tail, colNameParts ::: List((name, Some(index))))
      case name => extractAllPartsLists(colNamePartStrs.tail, colNameParts ::: List((name, None)))
    }

  def apply(colNames: Seq[String]): Lookupable =
    buildMap(colNames.zipWithIndex.flatMap{
      case (n, i) => extractAllPartsLists(n.split('.').toList).map((_, i))
    }.map{case (p1, p2) => PartListWithIndex(p1, p2)})

  def buildMap(l: Seq[PartListWithIndex]): Lookupable =
    if (l.isEmpty) EmptyMap else ColMap(l.groupBy{_.parts.head._1}.map{case (p1, p2) => (p1, buildDef(p1, p2))})

  def buildDef(name: String, partsListWithIndex: Seq[PartListWithIndex]): ColDef = {
    val (i, ni) = partsListWithIndex.partition(_.isIterating)

    ColDef(
      name,
      ni.find(x => ! x.isTrimmable).map(_.index).getOrElse(-1),
      buildIterationDef(i),
      buildMap(ni.flatMap { p => if (p.isTrimmable) Seq(p.tail) else Nil}))
  }

  def buildIterationDef(l: Seq[PartListWithIndex]) =
    l.groupBy(_.parts.head).iterator.map{
      case ((k1, Some(k2)), v) =>
        (k2, buildDef(k1, v.map(_.removeIteration)))
      case v => sys.error(s"Not an iteration: $v") // Shouldn't happen given line 81
    }.toSeq.sortBy(_._1)
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
