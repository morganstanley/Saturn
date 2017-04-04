package com.ms.qaTools.compare

import com.ms.qaTools._
import com.ms.qaTools.SeqUtil
import com.ms.qaTools.io._
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.io.rowSource.ColumnOrdering
import com.ms.qaTools.io.rowSource.ColumnType
import com.ms.qaTools.io.rowSource.StringColumnType
import com.ms.qaTools.io.rowSource.NumericColumnDefinition
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.io.rowSource.NumericColumnType
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.io.rowSource.Utils._
import scala.collection.mutable.Buffer
import scala.util.Try

class CompareColDef(val nameOpt: Option[String], keyOrder: Option[Int], val indexOpt: Option[Int], colType: ColumnType,
  val isIgnored: Boolean, val mappedName: Option[String], val mappedIndex: Option[Int])
extends ColumnDefinition(nameOpt.orElse(mappedName).getOrElse(throw new Error("Supply at least a name or a mapped-name.")), keyOrder, indexOpt.orElse(mappedIndex).getOrElse(throw new Error("Supply at least an index or a mapped-index.")), colType) {
  val isMapped = mappedIndex != None
  val leftName = nameOpt orElse(mappedName) getOrElse(throw new Error("No left-name defined"))
  val rightName = mappedName orElse(nameOpt) getOrElse(throw new Error("No right-name defined"))
  val leftIndex = indexOpt orElse(mappedIndex) getOrElse(throw new Error("No left-index defined."))
  val rightIndex = mappedIndex orElse(indexOpt) getOrElse(throw new Error("No right-index defined."))

  def copy(nameOpt: Option[String] = this.nameOpt,
           keyOrder: Option[Int] = this.keyOrder,
           indexOpt: Option[Int] = this.indexOpt,
           colType: ColumnType = this.colType,
           isIgnored: Boolean = this.isIgnored,
           mappedName: Option[String] = this.mappedName,
           mappedIndex: Option[Int] = this.mappedIndex): CompareColDef =
    new CompareColDef(nameOpt, keyOrder, indexOpt, colType, isIgnored, mappedName, mappedIndex)

  lazy val leftColumnDefinition: ColumnDefinition = ColumnDefinition(leftName, keyOrder, leftIndex, colType)
  lazy val rightColumnDefinition: ColumnDefinition = ColumnDefinition(rightName, keyOrder, rightIndex, colType)

  override def compare(leftRow: Seq[String], rightRow: Seq[String]): Int = {
    Try {
      colType.compare(leftRow(leftIndex), rightRow(rightIndex))
    }.recover{
      case t: ArrayIndexOutOfBoundsException => {
        if (!leftRow.isDefinedAt(leftIndex)) throw new Error("Can't compare left row. Undefined value at index " + leftIndex + " in left row: " + leftRow.mkString(","), t)
        else if (!rightRow.isDefinedAt(rightIndex)) throw new Error("Can't compare right row. Undefined value at index " + rightIndex + " in right row: " + rightRow.mkString(","), t)
        else throw new Error("Can't compare rows: Left(" + leftRow.mkString(",") + "), Right(" + rightRow.mkString(",") + ")", t)
      }
      case t: Throwable =>
        throw new Error("Can't compare rows: Left(" + leftRow.mkString(",") + "), Right(" + rightRow.mkString(",") + ")", t)
    }.get
  }

  override def toString = {
    val format = "CompareColDef(name = %s, keyOrder = %s, index = %s, colType = %s, isIgnored = %s, mappedName = %s, mappedIndex = %s)"
    format.format(name, keyOrder, index, colType.getClass.getName, isIgnored, mappedName, mappedIndex)
  }
}

class CompareColDefs(val cols: Seq[CompareColDef], val missing: Seq[String], val extra: Seq[String])
extends ColumnDefinitions {
  def compareColDefs = cols
  def colDefs = cols
}

object CompareColDef {
  def apply(name: String = null, keyOrder: Option[Int] = None, index: Int = -1, colType: ColumnType = StringColumnType(),
            isIgnored: Boolean = false, mappedName: Option[String] = None, mappedIndex: Option[Int] = None): CompareColDef =
    new CompareColDef(Option(name), keyOrder, Option(index).filter(_ != -1), colType, isIgnored, mappedName, mappedIndex)

  def apply(l: ColumnDefinition): CompareColDef = CompareColDef(l.name, l.keyOrder, l.index, l.colType)

  def apply(leftColDef: ColumnDefinition, rightColDef: Option[ColumnDefinition], compareColDef: Option[CompareColDef]): CompareColDef =
    (leftColDef, rightColDef, compareColDef) match {
      case (l, None, None) => CompareColDef(l.name, l.keyOrder, l.index, l.colType)
      case (l, Some(r), None) => CompareColDef(l.name, l.keyOrder, l.index, l.colType, mappedIndex = Option(r.index), mappedName = Option(r.name))
      case (l, None, Some(c)) => CompareColDef(l.name, c.keyOrder, l.index, c.colType, isIgnored = c.isIgnored)
      case (l, Some(r), Some(c)) => CompareColDef(l.name, c.keyOrder, l.index, c.colType, isIgnored = c.isIgnored, mappedName = Option(r.name), mappedIndex = Option(r.index))
      case dunno => throw new Exception("Cannot create Compare Column Definition from: " + dunno)
    }

  def missing(c: ColumnDefinition) = apply(c.name, None, c.index, c.colType, true, None, None)
  def extra(c: ColumnDefinition) = apply(null, None, -1, c.colType, true, Option(c.name), Option(c.index))

  def colNameExists(colName: String, colDefs: Seq[CompareColDef]) =
    colDefs.exists(_.rightName == colName)
}

object CompareColDefs {
  def apply(l: Seq[ColumnDefinition], r: Seq[ColumnDefinition], keys: Map[String, Int] = Map(),
            ignore: Seq[String] = Nil, map: Map[String, String] = Map(), typ: Map[String, ColumnType] = Map()) = {
    val lMap = l.toMapBy(_.name)
    val rMap = r.toMapBy(_.name)

    def requireEmpty(l: Seq[String], message: String) =
      require(l.isEmpty, message + l.mkString("[", ", ", "]"))

    requireEmpty(map.keys.toList.diff(lMap.keys.toList), "Mapped source column(s) not found in left dataset: ")
    requireEmpty(map.values.toList.diff(rMap.keys.toList), "Mapped target column(s) not found in right dataset: ")
    requireEmpty(ignore.diff(lMap.keys.toList), "Ignored column(s) not found in left dataset: ")
    requireEmpty(keys.keys.toList.diff(lMap.keys.toList), "Key column(s) not found in left dataset: ")
    requireEmpty(keys.keys.toList.map(k => map.getOrElse(k, k)).diff(rMap.keys.toList), "Key column(s) not found in right dataset: ")
    requireEmpty(typ.keys.toList.diff(lMap.keys.toList), "Typed column(s) not found in left dataset: ")

    val keyCols = keys.keys.toList.map(k => CompareColDef(k, keys.get(k), lMap(k).index, typ.getOrElse(k, lMap(k).colType), ignore.contains(k), map.get(k), rMap.get(map.getOrElse(k, k)).map(_.index)))
    val matchedCols = for {
      lCol <- l
        if (! keys.contains(lCol.name) && ! ignore.contains(lCol.name))
      rCol <- rMap.get(map.getOrElse(lCol.name, lCol.name)).toList
    } yield CompareColDef(CompareColDef(lCol).copy(colType = typ.getOrElse(lCol.name, lCol.colType)), Option(rCol), None)
    val keyOrMatchedCols = keys.keys ++: matchedCols.map(_.name)
    val missingCols = lMap.filterKeys(! keyOrMatchedCols.contains(_)).values.toList.map(CompareColDef.missing)
    val extraCols = rMap.filterKeys(! keyOrMatchedCols.map(k => map.getOrElse(k, k)).contains(_)).values.toList.map(CompareColDef.extra)
    new CompareColDefs(keyCols ++ matchedCols ++ missingCols ++ extraCols, missingCols.map(_.name).diff(ignore), extraCols.map(_.name))
  }

  def fromData(compareColDefs: Iterator[Seq[String]] with ColumnDefinitions,
               left: Seq[ColumnDefinition],
               right: Seq[ColumnDefinition]): CompareColDefs = {
    import scala.collection.mutable.Map
    val lmap     = Map() ++= left.map(c => c.name -> c)
    val rmap     = Map() ++= right.map(c => c.name -> c)
    val cols     = Buffer[CompareColDef]()
    val missing  = Buffer[String]()
    val extra    = Buffer[String]()
    compareColDefs.toRowMaps foreach { m =>
      val name       = m("COLUMN").get
      val mappedName = m.get("MAPPING").flatten
      val rname      = mappedName.getOrElse(name)
      val isIgnored  = m.get("IGNORED").flatten.map(_.toBoolean).getOrElse(false)
      val l          = lmap.remove(name).getOrElse(throw new CompareColDefException(s"No column `$name' in left"))
      val r          = rmap.remove(rname)
      if (isIgnored) {
        cols += CompareColDef.missing(l)
        r.foreach(cols += CompareColDef.extra(_))
      } else {
        if (r.isEmpty) throw new CompareColDefException(s"No column `$rname' in right")
        cols += CompareColDef(name = name,
                              index = l.index,
                              mappedName = mappedName,
                              mappedIndex = r.map(_.index),
                              isIgnored = isIgnored)
      }
    }
    for ((name, l) <- lmap) rmap.get(name) match {
      case Some(r) =>
        cols += CompareColDef(l).copy(mappedIndex = Option(r.index), mappedName = Option(r.name))
        rmap -= name
      case None =>
        cols += CompareColDef.missing(l)
        missing += name
    }
    for ((name, r) <- rmap) {
      cols += CompareColDef.extra(r)
      extra += name
    }
    new CompareColDefs(cols, missing, extra)
  }

  def getLeftDsOrdering(c: Seq[CompareColDef])  = genericOrdering(c, false)
  def getRightDsOrdering(c: Seq[CompareColDef]) = genericOrdering(c, true)

  // This Ordering is to sort the rows of the *SAME* source by either the colDef index or right index
  def genericOrdering(cs: Seq[CompareColDef], useRightIdx: Boolean) = {
    val colIdxTyps = cs.filter(_.isKey).sortBy(_.keyOrder) map { c =>
      val i = if (useRightIdx) c.mappedIndex.getOrElse(c.index) else c.index
      val t = c.colType
      (i, t)
    }
    new ColumnOrdering(colIdxTyps)
  }
}

class CompareColDefException(val message: String) extends Throwable(message)
class CompareColDefMissingColException(message: String, val colDef: ColumnDefinition) extends CompareColDefException(message)
class CompareColDefExtraColException(message: String, val colDef: ColumnDefinition) extends CompareColDefException(message)
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
