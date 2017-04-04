package com.ms.qaTools.tree.generator


import org.apache.commons.lang.NotImplementedException
import scala.collection.immutable.Set
import scala.collection.mutable.Map
import com.ms.qaTools.io.DelimitedRow


trait ColContext {
  def lookupValue(q: UnresolvedColQuery)(implicit colMap: Lookupable, data: Seq[String]): String = data(lookupColDef(q).index)
  def lookupValue(n: String)(implicit colMap: Lookupable, data: Seq[String]): String = data(lookupColDef(UnresolvedColQuery(n)).index)
  def lookupColDef(q: ResolvedColQuery)(implicit colMap: Lookupable): ColDef = colMap.lookup(q)

  def lookupIndex(q: UnresolvedColQuery)(implicit colMap: Lookupable): Int = lookupColDef(q).index
  def lookupIndex(n: String)(implicit colMap: Lookupable): Int = lookupColDef(UnresolvedColQuery(n)).index
  def nextIndex(q: UnresolvedColQuery)(implicit colMap: Lookupable): Int

  def lookupIndices(q: UnresolvedColQuery)(implicit colMap: Lookupable): Set[Int] = {
    val r = resolveQuery(q)
    val c: ColDef = lookupColDef(r)
    c.lookupIndices
  }

  def iteratorHasNext(q: UnresolvedColQuery)(implicit colMap: Lookupable): Boolean = {
    val r = resolveQuery(q)
    if (!r.isIndex) false
    else {
      val current = r.index
      val colDef = lookupColDef(q.dropLastIterPart)
      current + 1 < colDef.iterationCount
    }
  }

  def iteratorIsFinished(q: UnresolvedColQuery, row: DelimitedRow)(implicit colMap: Lookupable): Boolean = {    
    val r = resolveQuery(q)
    val ret = if (!r.isIndex) {      
      false
    }
    else {
      val current = r.index
      val colDef = lookupColDef(q.dropLastIterPart)
      if (current == 0 && colDef.iterationCount == 0) lookupIndices(q).forall(row(_) == null)
      else current >= colDef.iterationCount || lookupIndices(q).forall(row(_) == null)
    }
    ret
  }

  def iteratorIsIterating(q: UnresolvedColQuery)(implicit colMap: Lookupable): Boolean = {
    val r = resolveQuery(q)
    if (!r.isIndex) false
    else {
      val current = r.index
      current >= 0
    }
  }

  def resetAllIters: ColContext
  def resolveQueryParts(parts: Seq[ColQueryPart]): List[ResolvedColQueryPart]
  implicit def resolveQuery(q: UnresolvedColQuery): ResolvedColQuery = {
    val resolvedQuery = new ResolvedColQuery(resolveQueryParts(q.parts))
    resolvedQuery
  }

  def lookupName(name: String): ColContext
  def lookupIterator(name: String): (Int, ColContext)
  def lookupIterator: (Int, ColContext)
}

case object EmptyColContext extends ColContext {
  override def resolveQueryParts(parts: Seq[ColQueryPart]): List[ResolvedColQueryPart] = Nil
  override def nextIndex(q: UnresolvedColQuery)(implicit colMap: Lookupable): Int = throw new Exception("CCC")
  override def resetAllIters: ColContext = this
  override def lookupName(name: String): ColContext = throw new Exception("Cannot lookup name: '" + name + "' in an empty col context.")
  override def lookupIterator(iterator: String): (Int, ColContext) = throw new Exception("Cannot lookup iterator: '" + iterator + "' in an empty col context.")
  override def lookupIterator: (Int, ColContext) = throw new Exception("Cannot lookup iterator in an empty col context.")
}

case class ColContextDef(name: String,
  iterators: Map[String, (Int, ColContext)] = Map(),
  children: ColContext = EmptyColContext)
  extends ColContext {
  override def resolveQueryParts(parts: Seq[ColQueryPart]): List[ResolvedColQueryPart] = {
    if (parts.isEmpty) Nil
    else {
      if (name != parts.head.name) throw new Exception("Can't resolve ColQueryPart: name %s != parts.head.name %s.".format(name, parts.head.name))
      val resolved = parts.head match {
        case p: ColQueryScalarPart => p :: children.resolveQueryParts(parts.tail)
        case ColQueryIterPart(name, iterator) => {
          val (index, colContext) = iterators.getOrElse(iterator, throw new Exception("Cannot resolve iterator: " + iterator + " in :" + this))
          ColQueryIndexPart(name, index) :: colContext.resolveQueryParts(parts.tail)
        }
        case p: ColQueryIndexPart => List(p)
      }
      resolved
    }
  }

  override def resetAllIters: ColContext = {
    for (iterator <- iterators.keys) {
      val (index, colContext) = iterators.getOrElse(iterator, throw new Exception("Cannot resolve iterator: " + iterator + " in :" + this))
      iterators.update(iterator, (-1, colContext.resetAllIters))
    }
    this
  }

  override def lookupName(name: String): ColContext = children.lookupName(name)
  override def lookupIterator(iterator: String): (Int, ColContext) = iterators.getOrElse(iterator, throw new Exception("Cannot resolve iterator: " + iterator + " in :" + this))
  override def lookupIterator: (Int, ColContext) = lookupIterator(iterators.keys.head)

  override def nextIndex(q: UnresolvedColQuery)(implicit colMap: Lookupable): Int = {
    if (q.isEmpty) throw new Exception("Can't get next index: col query is empty(%s)".format(q.queryString))
    else {
      if (name != q.head.name) throw new Exception("Can't get next index: name %s != query.head.name %s.".format(name, q.head.name))
      val resolved: Int = q.head match {
        case p: ColQueryScalarPart => children.nextIndex(q.tail)
        case ColQueryIterPart(name, iterator) => {

          val (index, colContext) = iterators.getOrElse(iterator, throw new Exception("Cannot resolve iterator: " + iterator + " in :" + this))
          val i: Int = if (q.parts.length == 1) {
            iterators.remove(iterator)
            iterators.update(iterator, (index + 1, colContext.resetAllIters))
            index + 1
          } else colContext.nextIndex(q.tail)
          i
        }
        case p: ColQueryIndexPart => throw new Exception("Can't get next index: col query part should not be a ColQueryIndexPart.")
      }
      resolved
    }
  }
}

case class ColContextMap(var map: Map[String, ColContext]) extends ColContext {
  override def resolveQueryParts(parts: Seq[ColQueryPart]): List[ResolvedColQueryPart] = {
    if (parts.isEmpty) Nil
    else {
      val name = parts.head.name
      val colContextDef = map.getOrElse(name, throw new Exception("Could not find: " + name + " in (" + this + ")"))
      colContextDef.resolveQueryParts(parts)
    }
  }

  def nextIndex(q: UnresolvedColQuery)(implicit colMap: Lookupable): Int = {
    if (q.isEmpty)
      throw new Exception("Cannot call nextIndex on empty colQuery")
    else {
      val name = q.head.name
      val colContextDef = map.getOrElse(name, throw new Exception("Can't get next index: mapping doesn't exists for %s".format(name)))
      colContextDef.nextIndex(q)
    }
  }

  override def resetAllIters: ColContext = {
    map = map.map { q => val (k, v) = q; (k, v.resetAllIters) }
    this
  }

  override def lookupName(name: String): ColContext = map.getOrElse(name, throw new Exception("Can't lookup name: mapping doesn't exists for %s.".format(name)))
  override def lookupIterator(name: String): (Int, ColContext) = throw new Exception("Lookup iterator not supported for ColContextMap.")
  override def lookupIterator: (Int, ColContext) = throw new Exception("Lookup iterator not supported for ColContextMap.")
}

object ColContext {
  def apply(colQueries: String*): ColContext = ColContext(colQueries.map { UnresolvedColQuery(_) }.toSet)
  def apply(colQueries: Set[UnresolvedColQuery]): ColContext = buildContext(colQueries)

  def buildContext(colQueries: Set[UnresolvedColQuery]): ColContext = {
    val grouppedColQueries = colQueries.toSeq.groupBy(q => q.head.name)
    val colMap = grouppedColQueries.map { q => (q._1, buildColContextDef(q._1, q._2)) }
    ColContextMap(Map(colMap.toSeq: _*))
  }

  def buildColContextDef(name: String, colQueries: Seq[UnresolvedColQuery]): ColContextDef = {
    val iteratingQueries = colQueries.filter(_.head.isInstanceOf[ColQueryIterPart])
    val nonIteratingQueries = colQueries.filter(!_.head.isInstanceOf[ColQueryIterPart])

    val immutableIterators = iteratingQueries.groupBy(q => q.head.asInstanceOf[ColQueryIterPart].iterator).map {
      q =>
        val (k, v) = q
        (k, (-1, buildContext(v.map { _.tail }.filter { !_.isEmpty }.toSet)))
    }

    val iterators: Map[String, (Int, ColContext)] = Map(immutableIterators.toSeq: _*)
    val children = buildContext(nonIteratingQueries.map { _.tail }.filter { !_.isEmpty }.toSet)
    ColContextDef(name, iterators, children)
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
