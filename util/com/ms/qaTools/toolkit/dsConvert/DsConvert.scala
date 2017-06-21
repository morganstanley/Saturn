package com.ms.qaTools.toolkit.dsConvert

import java.io.File
import java.io.FileOutputStream

import scala.collection.JavaConverters._
import scala.util.Try

import org.apache.poi.ss.usermodel.WorkbookFactory
import org.apache.poi.xssf.streaming.SXSSFWorkbook

import com.ms.qaTools.IteratorProxy
import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.TryUtil
import com.ms.qaTools.exceptions.AggregateException
import com.ms.qaTools.io.ColDefAwareWriter
import com.ms.qaTools.io.Writer
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.io.rowSource.DatabaseConnection
import com.ms.qaTools.io.rowSource.Utils.IteratorRowSourceUtil
import com.ms.qaTools.io.rowSource.file.ExcelRowSource
import com.ms.qaTools.io.rowWriter.ExcelRowWriter
import com.ms.qaTools.io.rowWriter.JdbcRowWriter
import com.ms.qaTools.{toolkit => tk}
import com.ms.qaTools.withCloseable

case class DsConvertResult(status: tk.Status, exception: Option[Throwable] = None, subResults: Seq[DsConvertResult] = Nil) extends tk.Result

case class DsConvert[X <% Seq[String]](source: Iterator[X] with ColumnDefinitions,
                                       target: Writer[Iterator[Seq[String]]],
                                       ignoreCols: Seq[String] = Nil,
                                       writeColDefs: Boolean = true)
  extends tk.Runnable[DsConvertResult] {
  private def withoutIgnoredColumns(colDefs: Seq[ColumnDefinition]) = {
    val missingCols = ignoreCols.diff(colDefs.map(_.name))
    require(missingCols.isEmpty, s"ignore column(s): ${missingCols.mkString(", ")}: Not found in dataset")
    colDefs.filterNot(c => ignoreCols.contains(c.name))
  }

  def run = Try {
    val colDefs = withoutIgnoredColumns(source.colDefs)
    val colNames = colDefs.map(_.name)
    val colIndex = colDefs.map(_.index)
    val filteredSource = source.map(row => { for (colindex <- colIndex) yield row(colindex) })

    target match {
      case w: ExcelRowWriter       => w.write(filteredSource, Some(colDefs))
      case w: ColDefAwareWriter[_] => w.write(filteredSource, Option(colDefs).filter(_ => writeColDefs))
      case _                       => { if (writeColDefs) target.write(Iterator(colNames).withColumnNames(colNames: _*)); target.write(filteredSource.withColumnNames(colNames: _*)) }
    }
    DsConvertResult(tk.Passed) // TODO precise the return value
  }
}

case class DsConvertAggregate(runnables: Seq[DsConvert[_]]) extends tk.Runnable[DsConvertResult] {
  def run = runnables.map(_.run).toTrySeq.map(results => DsConvertResult(
    if (results.forall(_.status == tk.Passed)) tk.Passed else tk.Failed,
    Option(new AggregateException("Exception(s) occurred when running DsConvert.", results.flatMap(_.exception))).filter(_.exceptions.nonEmpty),
    results))
}

object DsConvert {
  def apply(sources: Traversable[(Iterator[Seq[String]] with ColumnDefinitions, String)], wbName: String) = Try {
    val wb = new SXSSFWorkbook()
    withCloseable(new FileOutputStream(wbName)) { os =>
      for ((src, wsName) <- sources)
        ExcelRowWriter(wb.createSheet(wsName)).write(src)
      wb.write(os)
    }
    wb.dispose()
    DsConvertResult(tk.Passed)
  }

  def apply(excel: File, conn: DatabaseConnection, append: Boolean): DsConvertResult = {
    val sheets = {
      val wb = WorkbookFactory.create(excel, null, true)
      try wb.asScala.map(_.getSheetName) finally wb.close()
    }
    sheets.foreach { sheet =>
      val tableExists = conn.hasTable(sheet)
      if (!append && tableExists) conn.clear(sheet)
      val rows = ExcelRowSource(excel, sheet)
      try {
        val writer = new JdbcRowWriter(conn, sheet, createTable = !tableExists)
        try writer.write(rows) finally writer.close()
      } finally rows.close()
    }
    DsConvertResult(tk.Passed)
  }

  //apply method for Saturn Runtime
  def apply[INPUT_TYPE](sourceInputTrys: Seq[Try[Iterator[INPUT_TYPE]]],
                        targetOutputTrys: Seq[Try[Writer[Iterator[Seq[String]]]]],
                        ignoreColsTry: Seq[Seq[Try[String]]])(implicit conversion: Iterator[INPUT_TYPE] => Iterator[Seq[String]]): Try[DsConvertAggregate] = {
    for {
      sources <- sourceInputTrys.toTrySeq.rethrow("An exception occurred while connecting source resources.")
      targets <- targetOutputTrys.toTrySeq.rethrow("An exception occurred while connecting target resources.")
      ignoreCols <- ignoreColsTry.map(_.toTrySeq).toTrySeq.rethrow("An exception occurred while generating ignoreCols.")
      dsConverts <- (sources, targets, ignoreCols).zipped.toSeq.map {
        case (source, target, ignoreCols) =>
          val sourceColDefs = source match {
            case c: ColumnDefinitions => c.colDefs
            case _                    => Seq()
          }
          val converted = new IteratorProxy[Seq[String]] with ColumnDefinitions {
            def self = source
            def colDefs = sourceColDefs
          }
          Try(DsConvert(converted, target, ignoreCols, !target.isInstanceOf[JdbcRowWriter]))
      }.toTrySeq.rethrow("An exception occurred while creating DsConverts.")
    } yield new DsConvertAggregate(dsConverts)
  }.rethrow("An exception occurred while setting up DsConvert.")
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
