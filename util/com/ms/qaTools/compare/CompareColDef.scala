package com.ms.qaTools.compare

import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.io.rowSource.ColumnOrdering
import com.ms.qaTools.io.rowSource.ColumnType
import com.ms.qaTools.io.rowSource.NumericColumnType
import com.ms.qaTools.io.rowSource.StringColumnType
import com.ms.qaTools.io.rowSource.Utils.StringSeqIteratorWithColumnDefinitionsUtil
import com.ms.qaTools.SeqUtil
import java.util.Locale
import scala.util.control.NonFatal

object NWayCompareColDef {
  case class Config(matching: Boolean, names: Seq[Option[String]], colType: Option[ColumnType], keyOrder: Option[Int]) {
    if (matching) require(names.forall(_.nonEmpty), s"Matching column must exist in all sources")
  }

  object Config {
    implicit def jsonFormat(implicit locale: Locale) = {
      import spray.json.DefaultJsonProtocol._
      jsonFormat4(apply)
    }
  }

  def fromConfigs(configs: Seq[Config], columnss: Seq[Seq[ColumnDefinition]]): Seq[NWayCompareColDef] = {
    val colss = columnss.map(_.toMapBy(_.name))
    configs.map { c =>
      if (c.matching) {
        require(c.names.flatten.length == colss.length, "number of names in column config does not match number of sources")
        val cols = for ((m, name) <- (colss, c.names.flatten).zipped.toIndexedSeq) yield m(name)
        NWayCompareColDefMatching(
          cols.map(c => c.name -> c.index),
          c.colType.getOrElse(StringColumnType),
          c.keyOrder.filter(_ > 0))
      } else {
        require(c.names.length == colss.length, "number of names in column config does not match number of sources")
        val cols = for ((m, name) <- (colss, c.names).zipped.toIndexedSeq) yield name.map(m)
        NWayCompareColDefIgnored(cols.map(_.map(c => c.name -> c.index)))
      }
    }
  }
}

sealed trait NWayCompareColDef {
  def nameAndIndexOptions: IndexedSeq[Option[(String, Int)]]

  /** Number of the sources get compared */
  def count: Int = nameAndIndexOptions.length

  def cellIndices: Iterator[(Int, Int)] =
    for (i <- Iterator.range(0, count); (_, j) <- nameAndIndexOptions(i)) yield (i, j)
}

case class NWayCompareColDefMatching(nameAndIndices: IndexedSeq[(String, Int)],
                                     colType: ColumnType,
                                     keyOrder: Option[Int]) extends NWayCompareColDef {
  require(keyOrder.forall(_ > 0), s"key order must be positive: $this")
  val nameAndIndexOptions = nameAndIndices.map(Some(_))
}

case class NWayCompareColDefIgnored(nameAndIndexOptions: IndexedSeq[Option[(String, Int)]]) extends NWayCompareColDef {
  require(nameAndIndexOptions.exists(_.nonEmpty))
}

trait LegacyCompareColDef { _: CompareColDef =>
  @deprecated("Use `.left.name` instead",          "qaTools/util/2.1.53") def nameOpt: Option[String]
  @deprecated("Use `.left.index` instead",         "qaTools/util/2.1.53") def indexOpt: Option[Int]
  @deprecated("Use `.right.name` instead",         "qaTools/util/2.1.53") def mappedName: Option[String]
  @deprecated("Use `.right.index` instead",        "qaTools/util/2.1.53") def mappedIndex: Option[Int]

  @deprecated("Use `.{left,right}.name` instead",  "qaTools/util/2.1.53") def name: String
  @deprecated("Use `.{left,right}.index` instead", "qaTools/util/2.1.53") def index: Int

  @deprecated("Use `.{left,right}.name` instead",  "qaTools/util/2.1.53") def leftName: String = nameOpt orElse(mappedName) getOrElse(throw new Error("No left-name defined"))
  @deprecated("Use `.{left,right}.name` instead",  "qaTools/util/2.1.53") def rightName: String = mappedName orElse(nameOpt) getOrElse(throw new Error("No right-name defined"))
  @deprecated("Use `.{left,right}.index` instead", "qaTools/util/2.1.53") def leftIndex: Int = indexOpt orElse(mappedIndex) getOrElse(throw new Error("No left-index defined."))
  @deprecated("Use `.{left,right}.index` instead", "qaTools/util/2.1.53") def rightIndex: Int = mappedIndex orElse(indexOpt) getOrElse(throw new Error("No right-index defined."))
}

sealed abstract class CompareColDef extends LegacyCompareColDef {
  def left: ColumnDefinition
  def right: ColumnDefinition
  def ignored: Boolean
  def keyOrder: Option[Int]
  def colType: ColumnType
  def isMapped: Boolean

  def isKey: Boolean = keyOrder.isDefined
  def isIgnored: Boolean = ignored

  def compare(leftRow: Seq[String], rightRow: Seq[String]): Int = try {
    left.colType.compare(leftRow(left.index), rightRow(right.index))
  } catch {
    case t: ArrayIndexOutOfBoundsException =>
      if (!leftRow.isDefinedAt(left.index)) throw new Error("Can't compare left row. Undefined value at index " + left.index + " in left row: " + leftRow.mkString(","), t)
      else if (!rightRow.isDefinedAt(right.index)) throw new Error("Can't compare right row. Undefined value at index " + right.index + " in right row: " + rightRow.mkString(","), t)
      else throw new Error("Can't compare rows: Left(" + leftRow.mkString(",") + "), Right(" + rightRow.mkString(",") + ")", t)
    case NonFatal(t) =>
      throw new Error("Can't compare rows: Left(" + leftRow.mkString(",") + "), Right(" + rightRow.mkString(",") + ")", t)
  }
}

object CompareColDef {
  def apply(left: ColumnDefinition, right: ColumnDefinition, ignored: Boolean): MatchedCompareColDef =
    MatchedCompareColDef(left, right, ignored)

  def unapply(x: CompareColDef): Option[(ColumnDefinition, ColumnDefinition, Boolean)] = x match {
    case x: MatchedCompareColDef => MatchedCompareColDef.unapply(x)
    case _                       => None
  }
}

case class MatchedCompareColDef(left: ColumnDefinition, right: ColumnDefinition, ignored: Boolean) extends CompareColDef {
  require(left.keyOrder == right.keyOrder, s"Incompatible key order: Left.${left.name}: Key(${left.keyOrder}) != Right.${right.name}: Key(${right.keyOrder})")
  require(left.colType == right.colType, s"Incompatible column type: Left.${left.name}: ${left.colType} != Right.${right.name}: ${right.colType}")

  def keyOrder = left.keyOrder
  def colType = left.colType
  def isMapped = true

  def nameOpt = Some(left.name)
  def indexOpt = Some(left.index)
  def mappedName = Some(right.name)
  def mappedIndex = Some(right.index)
  def name = left.name
  def index = left.index
}

sealed abstract class UnmatchedCompareColDef extends CompareColDef {
  def column: ColumnDefinition

  def ignored = true
  def keyOrder = column.keyOrder
  def colType = column.colType

  def name = column.name
  def index = column.index
}

case class MissingCompareColDef(left: ColumnDefinition) extends UnmatchedCompareColDef {
  def column = left
  def right = throw new NoSuchElementException("this column exists in left data only: " + left)
  def isMapped = false

  def nameOpt = Some(left.name)
  def indexOpt = Some(left.index)
  def mappedName = None
  def mappedIndex = None
}

case class ExtraCompareColDef(right: ColumnDefinition) extends UnmatchedCompareColDef {
  def column = right
  def left = throw new NoSuchElementException("this column exists in right data only: " + right)
  def isMapped = true

  def nameOpt = None
  def indexOpt = None
  def mappedName = Some(right.name)
  def mappedIndex = Some(right.index)
}

case class CompareColDefs(cols: Seq[MatchedCompareColDef], missing: Seq[ColumnDefinition], extra: Seq[ColumnDefinition]) {
  def allColumns: Seq[CompareColDef] = cols ++ missing.map(MissingCompareColDef(_)) ++ extra.map(ExtraCompareColDef(_))
}

object CompareColDefs {
  def apply(
    l: Seq[ColumnDefinition], r: Seq[ColumnDefinition], keys: Map[String, Int] = Map(),
    ignore: Seq[String] = Nil, map: Map[String, String] = Map(), typ: Map[String, ColumnType] = Map(),
    ignoreMissing: Boolean = false, ignoreExtra: Boolean = true
  ): CompareColDefs = {
    val lMap = l.toMapBy(_.name)
    val rMap = r.toMapBy(_.name)

    def requireEmpty(l: Seq[String], message: String) =
      require(l.isEmpty, message + l.mkString("[", ", ", "]"))

    requireEmpty(map.keys.toList.distinct.diff(lMap.keys.toList), "Mapped source column(s) not found in left dataset: ")
    requireEmpty(map.values.toList.distinct.diff(rMap.keys.toList), "Mapped target column(s) not found in right dataset: ")
    requireEmpty(ignore.diff(lMap.keys.toList), "Ignored column(s) not found in left dataset: ")
    requireEmpty(keys.keys.toList.diff(lMap.keys.toList), "Key column(s) not found in left dataset: ")
    requireEmpty(keys.keys.toList.map(k => map.getOrElse(k, k)).diff(rMap.keys.toList), "Key column(s) not found in right dataset: ")
    requireEmpty(typ.keys.toList.diff(lMap.keys.toList), "Typed column(s) not found in left dataset: ")

    val keyCols = keys.keys.toList.map{k =>
      val l = lMap(k).copy(keyOrder = keys.get(k), colType = typ.getOrElse(k, lMap(k).colType))
      val rk = map.getOrElse(k, k)
      val r = rMap(rk).copy(keyOrder = keys.get(k), colType = typ.getOrElse(k, rMap(rk).colType))
      CompareColDef(l, r, ignore.contains(k))}

    val matchedCols = for {
      lCol <- l
      if (! keys.contains(lCol.name) && ! ignore.contains(lCol.name))
      rCol <- rMap.get(map.getOrElse(lCol.name, lCol.name)).toList
    } yield CompareColDef(
      lCol.copy(colType = typ.getOrElse(lCol.name, lCol.colType), keyOrder = None),
      rCol.copy(colType = typ.getOrElse(lCol.name, rCol.colType), keyOrder = None),
      ignore.contains(lCol.name))
    val skip = (keys.keys ++ matchedCols.map(_.left.name)).toList
    val missing = lMap.filterKeys(! skip.contains(_)).values.toList.sortBy(_.index)
    val extra = rMap.filterKeys(! skip.map(k => map.getOrElse(k, k)).contains(_)).values.toList.sortBy(_.index)

    if (! ignoreExtra)
      requireEmpty(extra.map(_.name).filterNot(ignore.contains), "The following columns were extra and/or could not be mapped: ")
    if (! ignoreMissing)
      requireEmpty(missing.map(_.name).filterNot(ignore.contains), "The following columns were missing and/or could not be mapped: ")

    CompareColDefs(keyCols ++ matchedCols, missing, extra)
  }

  def fromData(compareColDefs: Iterator[Seq[String]] with ColumnDefinitions, left: Seq[ColumnDefinition], right: Seq[ColumnDefinition]): CompareColDefs = {
    val (ignored, mapped) = compareColDefs.toRowMaps.foldLeft(Seq[String](), Map[String, String]()){
      case ((i, m), row) =>
        val lName = row("COLUMN").getOrElse(sys.error(s"Could not get column name out of `$row`"))
        val newM = row.get("MAPPING").flatten match {
          case Some(rName) if rName != lName => m.updated(lName, rName)
          case _ => m}
        val newI = if(row.get("IGNORED").flatten.map(_.toBoolean) == Some(true)) lName +: i else i
        (newI, newM)
    }
    apply(left, right, ignore = ignored, map = mapped)
  }

  def getLeftDsOrdering(c: Seq[CompareColDef])  = genericOrdering(c, false)
  def getRightDsOrdering(c: Seq[CompareColDef]) = genericOrdering(c, true)

  // This Ordering is to sort the rows of the *SAME* source by either the colDef index or right index
  def genericOrdering(cs: Seq[CompareColDef], useRightIdx: Boolean) =
    new ColumnOrdering(cs.filter(_.isKey).sortBy(_.keyOrder).map { c =>
      (if (useRightIdx) c.right.index else c.left.index, c.left.colType)})
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
