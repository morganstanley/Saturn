package com.ms.qaTools.tree.generator

import scala.util.matching.Regex



trait ColQueryPart {
  def name: String
}

trait ResolvedColQueryPart extends ColQueryPart

case class ColQueryScalarPart(name: String) extends ResolvedColQueryPart {
  override def toString: String = name
}

case class ColQueryIterPart(name: String, iterator: String) extends ColQueryPart {
  override def toString: String = name + "[" + iterator + "]"
}

case class ColQueryIndexPart(name: String, index: Int) extends ResolvedColQueryPart {
  override def toString: String = name + "[" + index + "]"
}

trait ColQuery[PartType <: ColQueryPart] {
  type ColQueryType <: ColQuery[PartType]

  def buildColQuery(newParts: Seq[PartType]): ColQueryType
  def parts: Seq[PartType]
  def head: PartType = parts.head
  def tail: ColQueryType = buildColQuery(parts.tail)
  def pop: ColQueryType = buildColQuery(parts.reverse.tail.reverse)
  def isEmpty: Boolean = parts.isEmpty
  def trim: ColQueryType = buildColQuery(parts.reverse.dropWhile(!_.isInstanceOf[ColQueryIterPart]).reverse)
  def queryString: String = parts.mkString(".")

  override def equals(o: Any) = o match {
    case q: ColQueryType => this.queryString == q.queryString
    case _ => false
  }
  override def hashCode = queryString.hashCode
}

class UnresolvedColQuery(override val parts: Seq[ColQueryPart]) extends ColQuery[ColQueryPart] {
  type ColQueryType = UnresolvedColQuery
  def buildColQuery(newParts: Seq[ColQueryPart]): ColQueryType = new UnresolvedColQuery(newParts)

  def isIterator: Boolean = !parts.isEmpty && parts.reverse.head.isInstanceOf[ColQueryIterPart]

  def trimmedHierarchy: Set[ColQueryType] = {
    val trimmed: ColQueryType = trim
    if (trimmed.isEmpty) Set()
    else Set(trimmed) union trimmed.pop.trimmedHierarchy
  }

  def hierarchy: Set[ColQueryType] = {
    def g(q: ColQueryType, l: List[ColQueryType]): Seq[ColQueryType] = {
      if (q.isEmpty) l
      else g(q.pop.trim, q :: l)
    }
    g(this, Nil).toSet
  }

  override def toString: String = "UnresolvedColQuery(" + queryString + ")"
}

class ResolvedColQuery(override val parts: Seq[ResolvedColQueryPart]) extends ColQuery[ResolvedColQueryPart] {
  type ColQueryType = ResolvedColQuery
  def buildColQuery(newParts: Seq[ResolvedColQueryPart]): ColQueryType = new ResolvedColQuery(newParts)

  def isIndex: Boolean = !parts.isEmpty && parts.reverse.head.isInstanceOf[ColQueryIndexPart]
  def index: Int = parts.last.asInstanceOf[ColQueryIndexPart].index

  def dropLastIterPart: ColQueryType = parts.reverse.toList match {
    case Nil => throw new Exception()
    case head :: tail => buildColQuery(tail.reverse ::: List(ColQueryScalarPart(head.name)))
  }

  override def toString: String = "ResolvedColQuery(" + queryString + ")"
}

object ColQuery {
  val hasIter: Regex = """^(.*?)\[(.*?)\]$""".r
  val hasIndex: Regex = """^(.*?)\[(\d*?)\]$""".r
}

object UnresolvedColQuery {
  def apply(parts: ColQueryPart*): UnresolvedColQuery = new UnresolvedColQuery(parts.toList)
  def apply(s: String): UnresolvedColQuery =
    new UnresolvedColQuery(s.split('.').map { n =>
      n match {
        case ColQuery.hasIndex(p, i) => ColQueryIndexPart(p, i.toInt)
        case ColQuery.hasIter(p, i) => ColQueryIterPart(p, i)
        case _ => ColQueryScalarPart(n)
      }
    })

  def unapply(q: UnresolvedColQuery): Option[(String)] = Some((q.queryString))
}

object ResolvedColQuery {
  def apply(parts: ResolvedColQueryPart*): ResolvedColQuery = new ResolvedColQuery(parts.toList)
  def apply(s: String): ResolvedColQuery =
    new ResolvedColQuery(s.split('.').map { n =>
      n match {
        case ColQuery.hasIndex(p, i) => ColQueryIndexPart(p, i.toInt)
        case ColQuery.hasIter(p, i) => throw new Exception("Invalid expression: " + p + "[" + i + "], resolvedColQueries cannot have iterators.")
        case _ => ColQueryScalarPart(n)
      }
    })

  def unapply(q: ResolvedColQuery): Option[(String)] = Some(q.queryString)
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
