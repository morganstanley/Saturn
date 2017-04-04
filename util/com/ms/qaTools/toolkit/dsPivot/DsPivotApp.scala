package com.ms.qaTools.toolkit.dsPivot

import com.ms.qaTools.toolkit.ToolkitApp
import com.ms.qaTools.io.rowSource.file.CsvRowSource
import com.ms.qaTools.toolkit.cmdLine.BasicCmdLine
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.io.rowSource.ColumnOrdering
import com.ms.qaTools.io.DelimitedRow
import org.kohsuke.args4j.{Option => Args4JOption}
import scala.collection.JavaConversions._
import com.ms.qaTools.toolkit.cmdLine.InputDelimitedFile
import com.ms.qaTools.toolkit.cmdLine.OutputDelimitedFile
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import scala.annotation.tailrec
import com.ms.qaTools._
import scala.collection.mutable.{ Buffer => MBuffer }
import scala.collection.mutable.{ Map => MMap}
import com.ms.qaTools.io.rowSource.ExternalSort._

/*
 * DsPivot pivots a data set by selecting a pivot column and extracting the columns corresponding to the pivot
 * The data set is sorted by the key columns and the sorting columns prior of the pivotting
 */

object DsPivotApp extends ToolkitApp {
  override val APP_NAME = "DsPivot"
  override val cmdLine = new BasicCmdLine() with InputDelimitedFile with OutputDelimitedFile {
    @Args4JOption(name = "--keyCols", usage = "Key columns on which to sort the rows and to aggregate the pivoted values", required = true)
    val keyColsString: java.util.List[String] = new java.util.ArrayList[String]()

    @Args4JOption(name = "--pivotCol", usage = "The column to pivot", required = true)
    val pivotCol: String = null

    @Args4JOption(name = "--sortCols", usage = "Additionnal columns to the key cols to sort on")
    val sortColsString: java.util.List[String] = new java.util.ArrayList[String]()

    @Args4JOption(name = "--extractCols", usage = "Column values we want to extract to put underneath the pivoted column")
    val extractColsString: java.util.List[String] = new java.util.ArrayList[String]()

    @Args4JOption(name = "--noSort", usage = "Don't sort the dataset")
    val noSort: Boolean = false

    @Args4JOption(name = "--noGrouping", usage = "Don't produce pivot grouped values")
    val noGrouping: Boolean = false
  }

  parseArguments

  val source = cmdLine.inRowSource
  val colDefs = source.colDefs
  val noGrouping = cmdLine.noGrouping
  val sourceKeyCols = cmdLine.keyColsString.flatMap(ks => colDefs.find(_.name == ks)).zipWithIndex.map{
    case (c, i) => ColumnDefinition(c.name, Some(i + 1), c.index, c.colType)}
  val pivotColDef: ColumnDefinition = colDefs.find(_.name == cmdLine.pivotCol).get
  val sortColDefs = sourceKeyCols ++ cmdLine.sortColsString.flatMap(ps => colDefs.find(_.name == ps))
  val extractColDefs: Seq[ColumnDefinition] = cmdLine.extractColsString.flatMap(ps => colDefs.find(_.name == ps))

  val sortedSource = if (cmdLine.noSort)
    source
  else {
    implicit val ord = ColumnOrdering(sortColDefs)
    source.sortExternal
  }

  val outColDefs = sourceKeyCols // will add the pivot columns to this
  val start: (String, Map[String, Int], Seq[MBuffer[String]]) = (null, Map[String, Int](), if (noGrouping) Seq[MBuffer[String]](MBuffer[String]()) else Seq[MBuffer[String]]())

  val multipleExtract = extractColDefs.size > 1

  //Holds the pivot index name where to write the value for the indexed pivot
  val pivotIdxMap = MMap[String, String]() // Map(a -> a0, b -> b2, ...)

  val (_, pivotValuesMap, rows) = sortedSource.foldLeft(start)(
    (agg, currentRow) => {
      val key = agg._1
      val pivotValuesMap = agg._2
      val rows = agg._3

      val keyValues = sourceKeyCols.map(c => currentRow(c.index))
      val currentKey = keyValues.mkString("")

      val pivotValues: Seq[String] = if (multipleExtract) (1 to extractColDefs.size).toSeq.map(i => currentRow(pivotColDef.index) + i) // generate pivotColumns with index
      else Seq(currentRow(pivotColDef.index))

      val pivotValuesToAdd: Seq[String] = {
        if(noGrouping) {
          /*
           * Add a numeric identifier to the pivot name in case of repeating
           * Check if pivot column name already exists, if so increment it
           */
          def getPivotName(pivotName: String, id: Int = 0): String = {
            def _getPivotName(id: Int = 0): String = {
              if(pivotValuesMap.keys.exists(name => name == (pivotName + id.toString))) _getPivotName(id + 1)
              else {
                pivotIdxMap(pivotName) = pivotName + id.toString
                pivotIdxMap(pivotName)
              }
            }
            _getPivotName(0)
          }

          pivotValues.map(pivotName => getPivotName(pivotName))

        } else pivotValues.filterNot(pivotValuesMap.get(_).isDefined)
      }

      // we want to extract the keyCols values + extractCols values
      val addedPivotValuesMap = pivotValuesToAdd.zipWithIndex.map { case (p, i) => p -> (i + pivotValuesMap.size) }.toMap
      val newPivotValuesMap = pivotValuesMap ++ addedPivotValuesMap

      // The extracted value will be positioned underneath the pivot values in order they appear
      val extractValues: Seq[String] = extractColDefs.map(c => currentRow(c.index))

      val minimumSize = if (noGrouping) newPivotValuesMap.size else sourceKeyCols.size + newPivotValuesMap.size
      val lastRow: MBuffer[String] = if (noGrouping) {
        rows.last
      } else {
        if (key != currentKey) MBuffer.fill(minimumSize)(null)
        else rows.last
      }

      if (lastRow.size < minimumSize) {
        lastRow ++= MBuffer.fill(minimumSize - lastRow.size)(null)
      }

      if (!noGrouping) sourceKeyCols.zipWithIndex.foreach { case (c, i) => lastRow(i) = currentRow(c.index) }

      extractValues.foldLeft(pivotValues)((agg, extractedValue) => {
        if (!agg.isEmpty) {
          val pivot = agg.head

          if (noGrouping)
            lastRow(newPivotValuesMap(pivotIdxMap(pivot))) = extractedValue
          else lastRow(sourceKeyCols.size + newPivotValuesMap(pivot)) = extractedValue
          agg.tail
        } else {
          throw new Exception("No more pivot!" + extractedValue)
          agg
        }
      })

      if (key != currentKey && !noGrouping) (currentKey, newPivotValuesMap, rows :+ lastRow) else (key, newPivotValuesMap, rows)
    }
  )

  val regex = "(\\w+?)[0-9]+$".r
  val santizedPivotValuesMap = pivotValuesMap.map{
    case (key, value) => {
      regex findFirstIn key match {
        case Some(regex(matched)) => {
          if(pivotValuesMap.keys.exists(k => k.matches(matched + "[0-9]+$") && k != key)) key -> value
          else key.dropRight(1) -> value
        }
        case None => key -> value
      }
    }
  }

  val outputColDefs = if (noGrouping) santizedPivotValuesMap.toSeq.sortBy(c => c._2).map { case (pivotValue, index) => ColumnDefinition(pivotValue, None, index + sourceKeyCols.size) }
  else sourceKeyCols ++ santizedPivotValuesMap.toSeq.sortBy(c => c._2).map { case (pivotValue, index) => ColumnDefinition(pivotValue, None, index + sourceKeyCols.size) }

  val toWrite = new Iterator[DelimitedRow] with ColumnDefinitions {
    override def colDefs = outputColDefs
    val colCount = outputColDefs.size

    val iterator = rows.toIterator
    def next = {
      val row = iterator.next
      if (row.size < colCount) row ++ Seq.fill(colCount - row.size)(null) else row
    }
    def hasNext = iterator.hasNext
  }

  val rowWriter = cmdLine.delimitedRowWriter
  rowWriter.write(toWrite)
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
