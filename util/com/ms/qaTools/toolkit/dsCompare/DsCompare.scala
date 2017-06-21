package com.ms.qaTools.toolkit.dsCompare

import scala.concurrent.{ Await, ExecutionContext, Future }
import scala.concurrent.duration.Duration
import scala.reflect.ClassTag
import scala.util.Try

import org.apache.spark.rdd.RDD

import com.ms.qaTools.TryUtil
import com.ms.qaTools.compare.AbstractDiff
import com.ms.qaTools.compare.Comparator
import com.ms.qaTools.compare.CompareColDef
import com.ms.qaTools.compare.CompareColDefs
import com.ms.qaTools.compare.Counter
import com.ms.qaTools.compare.DelimitedComparatorCounter
import com.ms.qaTools.compare.Diff
import com.ms.qaTools.compare.Explainer
import com.ms.qaTools.compare.writer.DelimitedDiffSetWriter
import com.ms.qaTools.compare.writer.DiffSetWriter
import com.ms.qaTools.compare.writer.DiffSetWriters
import com.ms.qaTools.compare.writer.Page
import com.ms.qaTools.compare.writer.PageNames
import com.ms.qaTools.io.DiffWriter
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.io.rowSource.ColumnType
import com.ms.qaTools.io.rowSource.ExternalSort._
import com.ms.qaTools.toolkit.{ Status, Passed, Failed }
import com.ms.qaTools.toolkit.Result
import com.ms.qaTools.toolkit.Runnable
import com.ms.qaTools.withCloseable

object DsCompareResult {
  def apply(c: DelimitedComparatorCounter): DsCompareResult =
    DsCompareResult(if (Seq(c.different, c.inLeftOnly, c.inRightOnly).forall(_ == 0)) Passed else Failed, None, c)
}

case class DsCompareResult(status: Status, exception: Option[Throwable] = None, counter: DelimitedComparatorCounter) extends Result

case class DsCompare(comparator: Iterator[Diff[Seq[String]]],
                     diffSetWriter: DiffSetWriter[Diff[Seq[String]], DelimitedComparatorCounter],
                     debug: Boolean)
extends Runnable[DsCompareResult] {
  def run = Try {
    withCloseable(diffSetWriter){w =>
      val c = w.write(comparator, DelimitedComparatorCounter())
      w.writeSummary(c)
      DsCompareResult(c)
    }
  }.rethrow("An exception occurred while running DsCompare.")
}

object DsCompare {
  def apply(comparator: Comparator, diffSetWriters: Seq[DelimitedDiffSetWriter]): DsCompare = apply(comparator, new DiffSetWriters(diffSetWriters), true)
  def apply(comparator: Iterator[Diff[Seq[String]]], diffSetWriter: DiffSetWriter[Diff[Seq[String]], DelimitedComparatorCounter]): DsCompare = apply(comparator, diffSetWriter, true)
  
  def multipleDiffSet(colDefs: CompareColDefs,
                      leftDs: Iterator[Seq[String]] with ColumnDefinitions,
                      rightDs: Iterator[Seq[String]] with ColumnDefinitions,
                      diffSetWriterCreators: Seq[Seq[CompareColDef] => DelimitedDiffSetWriter],
                      explainers: Seq[Explainer[Diff[Seq[String]]]] = Nil,
                      matcher: Option[Function3[String, String, String, Double]] = None,
                      noSortLeft: Boolean = false,
                      noSortRight: Boolean = false)
                      (implicit ec: ExecutionContext): DsCompare = {
    
    val comparator = comparatorCreator(colDefs, leftDs, rightDs, explainers, matcher, noSortLeft, noSortRight)
    apply(comparator, diffSetWriterCreators.map(_.apply(colDefs.allColumns)))
  }
  
  def comparatorCreator(colDefs: CompareColDefs,
                        leftDs: Iterator[Seq[String]] with ColumnDefinitions, 
                        rightDs: Iterator[Seq[String]] with ColumnDefinitions,  
                        explainers: Seq[Explainer[Diff[Seq[String]]]] = Nil,
                        matcher: Option[Function3[String, String, String, Double]] = None, 
                        noSortLeft: Boolean = false,
                        noSortRight: Boolean = false)(implicit ec: ExecutionContext): Comparator = {
    val keyColDefs = colDefs.cols.filter(_.left.isKey).sortBy(_.left.keyOrder)
    val sortLeftFuture = Future {
      if (noSortLeft || keyColDefs.isEmpty) leftDs
      else {
        implicit val ord = CompareColDefs.getLeftDsOrdering(keyColDefs)
        leftDs.sortExternal
      }
    }
    val sortRightFuture = Future {
      if (noSortRight || keyColDefs.isEmpty) rightDs
      else {
        implicit val ord = CompareColDefs.getRightDsOrdering(keyColDefs)
        rightDs.sortExternal
      }
    }
  
    val comparatorFuture = for { sortedLeftDs <- sortLeftFuture; sortedRightDs <- sortRightFuture }
      yield Comparator(sortedLeftDs, sortedRightDs, colDefs.allColumns, explainers, matcher)
    Await.result(comparatorFuture, Duration.Inf)
  }
  
  def apply(colDefs: CompareColDefs,
            leftDs: Iterator[Seq[String]] with ColumnDefinitions,
            rightDs: Iterator[Seq[String]] with ColumnDefinitions,
            diffSetWriterCreators: (CompareColDefs => DelimitedDiffSetWriter),
            explainers: Seq[Explainer[Diff[Seq[String]]]] = Nil,
            matcher: Option[Function3[String, String, String, Double]] = None,
            noSortLeft: Boolean = false,
            noSortRight: Boolean = false)(implicit ec: ExecutionContext): DsCompare = {
    val comparator = comparatorCreator(colDefs,leftDs,rightDs,explainers,matcher,noSortLeft,noSortRight)
    val diffSetWriters = diffSetWriterCreators(colDefs)
    apply(comparator, diffSetWriters)
  }

  //apply method for Saturn Runtime
  def apply(leftDsTry: Try[Iterator[Seq[String]] with ColumnDefinitions],
            rightDsTry: Try[Iterator[Seq[String]] with ColumnDefinitions],
            keys: Map[String, Int],
            ignore: Seq[String],
            map: Map[String, String],
            typ: Map[String, ColumnType],
            ignoreExtra: Boolean,
            ignoreMissing: Boolean,
            outputIOTry: Try[DiffWriter[DelimitedDiffSetWriter]],
            sort: String,
            explainers: Seq[Explainer[Diff[Seq[String]]]],
            matcher: Option[Function3[String, String, String, Double]],
            pageNames: Map[Page, String],
            omitted: Seq[Page]): Try[DsCompare] = {
    def sortExternalIfNecessary(left: Iterator[Seq[String]] with ColumnDefinitions,
                                right: Iterator[Seq[String]] with ColumnDefinitions,
                                colDefs: CompareColDefs) = sort match {
      case "BOTH"  => (left.sortExternal(CompareColDefs.getLeftDsOrdering(colDefs.cols)), right.sortExternal(CompareColDefs.getRightDsOrdering(colDefs.cols)))
      case "LEFT"  => (left.sortExternal(CompareColDefs.getLeftDsOrdering(colDefs.cols)), right)
      case "RIGHT" => (left, right.sortExternal(CompareColDefs.getRightDsOrdering(colDefs.cols)))
      case "NONE"  => (left, right)
      case _       => throw new IllegalArgumentException(s"Invalid sort stype '$sort'.")
    }

    for {
      leftDs <- leftDsTry.rethrow("An exception occurred while connecting left resource.")
      rightDs <- rightDsTry.rethrow("An exception occurred while connecting right resource.")
      colDefs <- Try { CompareColDefs(leftDs.colDefs, rightDs.colDefs, keys, ignore, map, typ, ignoreMissing, ignoreExtra) }.rethrow("An exception occurred while creating CompareColDefs.")
      outputIO <- outputIOTry.rethrow("An exception occurred while connecting outputIO resource.")
      diffWriterFactory <- outputIO.diffWriter.rethrow("An exception occurred while creating diff writer factory.")
      diffWriter <- Try { diffWriterFactory(colDefs, PageNames() ++ pageNames, omitted) }.rethrow("An exception occurred while creating diff writer.")
      (sortedLeftDs, sortedRightDs) <- Try { sortExternalIfNecessary(leftDs, rightDs, colDefs) }.rethrow("An exception occurred while sorting left and right dataSets.")
      comparator <- Try { Comparator(sortedLeftDs, sortedRightDs, colDefs.cols, explainers, matcher) }.rethrow("An exception occurred while creating comparator.")
    } yield DsCompare(comparator, diffWriter)
  }.rethrow("An exception occurred while setting up DsCompare.")

  /**
   *  @param writer  A function to create writer based on partition index.  Index -1 means the overall summary writer.
   */
  def writeRdd[A <: AbstractDiff, B <: Counter[A, B] : ClassTag : scalaz.Monoid]
              (diffs: RDD[A], writer: Int => DiffSetWriter[A, B]): B = {
    import scalaz.Monoid
    val overall = diffs.mapPartitionsWithIndex { (i, ds) =>
      withCloseable(writer(i)) { w =>
        val c = w.write(ds, implicitly[Monoid[B]].zero)
        w.writeSummary(c)
        Iterator.single(c)
      }
    }.fold(implicitly[Monoid[B]].zero)(implicitly[Monoid[B]].append(_, _))
    withCloseable(writer(-1))(_.writeSummary(overall))
    overall
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
