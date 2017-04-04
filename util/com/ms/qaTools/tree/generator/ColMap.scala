package com.ms.qaTools.tree.generator
import org.apache.commons.lang.NotImplementedException
import scala.annotation.tailrec
import scala.collection.immutable.Map
import com.ms.qaTools.tree.generator._
import scala.beans.BeanProperty

trait Lookupable {
  def lookup(q: ResolvedColQuery): ColDef
  def lookup(n: String): ColDef = lookup(ResolvedColQuery(n))
  def lookupIndices: Set[Int]
}

class UnresolvedQueryException(val query: ColQuery[_]) extends Throwable("Can't resolve column for: " + query.queryString + ".")

case class ColMap(colMap: Map[String, ColDef] = Map())
  extends Lookupable {
  def lookup(q: ResolvedColQuery): ColDef = {
    if (q.isEmpty) throw new Exception("Lookup empty column query.")
    else {
      val h = q.head

      if (!colMap.isDefinedAt(h.name)) throw new Exception("Can't lookup column \"%s\" because the mapping doesn't exist.".format(h.name))

      colMap(h.name) match {
        case cDef: ColDef => cDef.lookup(q)
      }
    }
  }
  override def lookupIndices: Set[Int] = colMap.values.flatMap { _.lookupIndices }.toSet
}

case class EmptyMap() extends Lookupable {
  def lookup(q: ResolvedColQuery): ColDef = throw new UnresolvedQueryException(q)

  override def lookupIndices: Set[Int] = Set.empty
}

case class ColDef(@BeanProperty name: String,
  @BeanProperty index: Int = -1,
  iterations: Seq[(String, ColDef)] = Nil,
  children: Lookupable = EmptyMap())
  extends Lookupable {
  val iterationCount = iterations.length
  val noIterations = iterationCount == 0
  def lookup(q: ResolvedColQuery): ColDef = {
    val head = q.head
    val cDef: ColDef = head match {
      case ColQueryIndexPart(name, index) =>
        if (index == 0 && noIterations) this
        else {
          if (index < 0 || index >= iterationCount) throw new Exception("Can't lookup column \"%s\" for iteration \"%s\". Iteration index out of bound.".format(name, index))
          iterations(index) match {
            case (_, cDef) => cDef
          }
        }
      case ColQueryScalarPart(name) => this
    }
    if (q.tail.isEmpty) cDef
    else {
      try {
        cDef.children.lookup(q.tail)
      } catch {
        // catch lower exceptions and add information recursively
        case e: UnresolvedQueryException => {

          // c0.id is missing for example
          throw new UnresolvedQueryException(q)
        }
      }
    }
  }

  override def lookupIndices: Set[Int] = {
    val thisIndex: Set[Int] = if (index != -1) Set(index) else Set.empty
    val iterationIndices: Set[Int] = iterations.flatMap { _._2.lookupIndices }.toSet
    val childrenIndices: Set[Int] = children.lookupIndices

    thisIndex union iterationIndices union childrenIndices
  }
}

object ColMap {
  type PartsListWithIndex = Seq[PartListWithIndex]
  case class PartListWithIndex(parts: ColNameParts, index: Int) {
    def tail: PartListWithIndex = PartListWithIndex(parts.tail, index)
    def isTrimmable: Boolean = parts.length > 1
    def isIterating: Boolean = parts.head match {
      case (_, Some(_)) => true
      case _ => false
    }
    def removeIteration = {
      val newParts: ColNameParts = (parts.head._1, None) :: parts.tail.toList
      PartListWithIndex(newParts, index)
    }
  }

  object PartListWithIndex {
    def apply(pair: (ColNameParts, Int)): PartListWithIndex = PartListWithIndex(pair._1, pair._2)
  }

  def extractAllPartsLists(colNamePartStrs: List[String], colNameParts: List[(String, Option[String])] = Nil): List[List[(String, Option[String])]] = {
    if (colNamePartStrs.isEmpty) List(colNameParts)
    else {
      colNamePartStrs.head match {
        case hasIter(name, index) => extractAllPartsLists(colNamePartStrs.tail, colNameParts ::: List((name + index, None))) ::: extractAllPartsLists(colNamePartStrs.tail, colNameParts ::: List((name, Some(index)))) //(name,Some(index))
        case name => extractAllPartsLists(colNamePartStrs.tail, colNameParts ::: List((name, None)))
      }
    }
  }

  def apply(colNames: Seq[String]): Lookupable = {
    val partsList: Seq[(ColNameParts, Int)] = colNames.zipWithIndex.flatMap { p =>
      val (colName, colIndex) = p
      extractAllPartsLists(colName.split('.').toList).map { (_, colIndex) }
    }
    val partsListsWithIndex = partsList.map(PartListWithIndex(_))
    buildMap(partsListsWithIndex)
  }

  def buildMap(partsListWithIndex: PartsListWithIndex): Lookupable = {
    if (partsListWithIndex.isEmpty) EmptyMap()
    else {
      val mapped = partsListWithIndex.groupBy { p => p.parts.head._1 }
      ColMap(mapped.map { p => (p._1, buildDef(p._1, p._2)) })
    }
  }

  def buildDef(name: String, partsListWithIndex: PartsListWithIndex): ColDef = {
    val iteratingPartsLists = partsListWithIndex.filter { _.isIterating }
    val nonIteratingPartsLists = partsListWithIndex.filter { !_.isIterating }
    val trimmedNonIteratingPartsLists = nonIteratingPartsLists.flatMap { p => if (p.isTrimmable) Seq(p.tail) else Nil }

    def emptyPartsListindex(p: Seq[PartListWithIndex]): Int =
      p.toList match {
        case Nil => -1
        case head :: tail => if (!head.isTrimmable) head.index else emptyPartsListindex(tail)
      }

    val index = emptyPartsListindex(nonIteratingPartsLists)
    ColDef(name, index, buildIterationDef(iteratingPartsLists), buildMap(trimmedNonIteratingPartsLists))
  }

  def buildIterationDef(partsListsWithIndex: PartsListWithIndex): Seq[(String, ColDef)] = {
    val orderedKeys = partsListsWithIndex.map(_.parts.head).toSet
    val grouppedPartsListsWithIndex = partsListsWithIndex.groupBy(p => p.parts.head)
    orderedKeys.map { k =>
      k
      val v = grouppedPartsListsWithIndex.getOrElse(k, throw new Exception("not possible!"))
      (k._2.get, buildDef(k._1, v.map { _.removeIteration }))
    }.toSeq

  }

  protected val hasIter = new scala.util.matching.Regex("""^(.*?)(\d+)$""", "p", "i")
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
