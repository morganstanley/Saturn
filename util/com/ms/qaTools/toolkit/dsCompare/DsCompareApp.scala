package com.ms.qaTools.toolkit.dsCompare

import java.io.File
import java.io.FileOutputStream
import java.util.{Locale => JLocale}
import java.util.concurrent.Executors

import scala.collection.JavaConversions._
import scala.concurrent.ExecutionContext
import scala.util.{ Try, Success }

import org.apache.commons.io.FileUtils
import org.apache.spark.rdd.RDD

import com.ms.qaTools.compare.CompareColDefs
import com.ms.qaTools.compare.Diff
import com.ms.qaTools.compare.Explainer
import com.ms.qaTools.compare.Identical
import com.ms.qaTools.compare.RddComparator
import com.ms.qaTools.compare.StringExplainer
import com.ms.qaTools.compare.writer.ExcelDiffSetRotateWriter
import com.ms.qaTools.compare.writer.ExcelDiffSetWriter
import com.ms.qaTools.compare.writer.GroupedKeysDiffSetWriter
import com.ms.qaTools.compare.writer.SQLiteDiffSetWriter
import com.ms.qaTools.interpreter.ScalaInterpreter
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.io.rowSource.ColumnType
import com.ms.qaTools.io.rowSource.SQLiteConnection
import com.ms.qaTools.io.rowSource.file.ExcelWorkBook
import com.ms.qaTools.{toolkit => tk}

class ADsCompareApp extends tk.SparkApp[DsCompareResult] with Serializable {
  val APP_NAME = "DsCompare"
  val cmdLine = new DsCompareCmdLine
  implicit val locale: JLocale = cmdLine.asLocale

  override def _exit(result: DsCompareResult) = {
     def printSummary(r: DsCompareResult) = {
      println(APP_NAME + " Summary:")
      print(r.counter.userFriendlyString)
    }

    result.status match {
      case tk.Passed => {
        if (!cmdLine.noSummary) printSummary(result)
        if (!cmdLine.noExitCode) System.exit(0)
      }
      case tk.Failed => {
        if (!cmdLine.noSummary) printSummary(result)
        if (!cmdLine.noExitCode) System.exit(-1)
      }
      case tk.NotRun =>
        if (!cmdLine.noExitCode) System.exit(-1)
    }
  }

  def excelWriter(cols: CompareColDefs, fmt: String, name: String, cmdLine: DsCompareCmdLine) =
    new ExcelDiffSetWriter(ExcelWorkBook(new FileOutputStream(name), fmt == "XLSX"),
                           cols,
                           cmdLine.pageNames,
                           cmdLine.omittedPages,
                           createExtraSheets = !cmdLine.noExtraSheets,
                           cmdLine.separateDiffs)

  def diffSetWriterCreator(cols: CompareColDefs) = {
    val w = cmdLine.outFmt.toUpperCase match {
      case "SQLITE" => {
        val sqLiteConnection = SQLiteConnection(file = new File(cmdLine.outFileName), unlink = cmdLine.sqLiteUnlink)
        new SQLiteDiffSetWriter(sqLiteConnection, cols, cmdLine.tablePrefix)
      }
      case fmt@("XLSX" | "XLS") => excelWriter(cols, fmt, cmdLine.outFileName, cmdLine)
      case "DIR" =>
        val conf = ExcelDiffSetRotateWriter.Config(pageNames = cmdLine.pageNames,
          omittedPages = cmdLine.omittedPages)
        ExcelDiffSetRotateWriter(new File(cmdLine.outFileName), cols,
          conf.copy(size = if (cmdLine.rotateSize > 0) cmdLine.rotateSize else conf.size,
            prefix = Option(cmdLine.outFileNamePrefix).getOrElse(conf.prefix)))
      case _ => ???
    }
    Option(cmdLine.matcher).map(_ => new GroupedKeysDiffSetWriter(cols.cols, w)).getOrElse(w)
  }

  def compareColDefs(leftCols: Seq[ColumnDefinition], rightCols: Seq[ColumnDefinition]): CompareColDefs = {
    val map = cmdLine.colMaps.toList.map(x => x.split("=>") match {
      case a: Array[String] if(a.size > 1) => (a.init.mkString("=>"), a.last)
      case _ => throw new Error("invalid column mapping: " + x)}).toMap
    val keys = cmdLine.keyCols.toList.map(x => x.split("=>") match {
      case Array(k) => (k, 1)
      case a: Array[String] if (a.size > 1) => (a.init.mkString("=>"), a.last.toInt)
      case _ => throw new Error("invalid key column: " + x)}).toMap
    val ignore = cmdLine.ignoreCols.toList
    val typ = cmdLine.colTypes.toList.map(x => x.split(":") match {
      case a: Array[String] if (a.size > 1) => (a.init.mkString(":"), ColumnType(a.last))
      case _ => throw new Error("invalid column type: " + x)}).toMap
    CompareColDefs(leftCols, rightCols, keys, ignore, map, typ, cmdLine.ignoreMissingCols, ! cmdLine.noIgnoreExtraCols)
  }

  def explainers: Option[Explainer[Diff[Seq[String]]] with Serializable] = Option(cmdLine.explainer).map { e =>
    StringExplainer[Diff[Seq[String]]](FileUtils.readFileToString(new File(e), java.nio.charset.Charset.defaultCharset))
  }

  exit(Try {
    parseArguments()
    sparkSession match {
      case Some(spark) =>
        def toRdd(path: String): (Seq[ColumnDefinition], RDD[Seq[String]]) = {
          import tk.SparkApp.SparkSessionOps
          val df = spark.readDF(path)
          (ColumnDefinition.fromColumnNames(df.columns), df.rdd.map(row => row.toSeq.map(_.asInstanceOf[String])))
        }
        val (leftCols, leftRdd) = toRdd(cmdLine.leftFileName)
        val (rightCols, rightRdd) = toRdd(cmdLine.rightFileName)
        val cmpCols = compareColDefs(leftCols, rightCols)
        val diffs = RddComparator.compareDelimited(cmpCols.allColumns, leftRdd, rightRdd)
        val explained = explainers match {
          case Some(e) => diffs.map {
            case d: Identical[_]       => d
            case d if e.isDefinedAt(d) => e(d)
            case d                     => d
          }
          case None => diffs
        }
        cmdLine.outFmt.toUpperCase match {
          case fmt@("XLSX" | "XLS") =>
            DsCompare(explained.toLocalIterator, excelWriter(cmpCols, fmt, cmdLine.outFileName, cmdLine)).run
          case "DIR" =>
            val dir = new File(cmdLine.outFileName)
            val cmdL = cmdLine // need to allocate it on stack otherwise spark will nullify it
            dir.mkdirs()
            def writer(i: Int) = {
              val file = new File(dir, if (i < 0) "summary.xlsx" else s"partition-$i.xlsx")
              excelWriter(cmpCols, "XLSX", file.getCanonicalPath, cmdL)
            }
            Success(DsCompareResult(DsCompare.writeRdd(explained, writer)))
          case other => throw new IllegalArgumentException("unsupported output format in Spark mode: " + other)
        }

      case None =>
        val leftDs = cmdLine.leftDs
        val rightDs = cmdLine.rightDs
        val colDefsTry = for(l <- leftDs.map{_.colDefs}; r <- rightDs.map{_.colDefs}) yield compareColDefs(l, r)

        val pool = Executors.newCachedThreadPool()
        implicit val ec = ExecutionContext.fromExecutorService(pool)

        val dsCompareResultTry = for {
          explainers <- Try(explainers.toSeq)
          matcher <- Try {
            Option(cmdLine.matcher).map{f =>
              val code =
                if(f == "minimizeDifferentColumns") "{case (_, l, r) => if(l == r) 0 else 1}"
                else FileUtils.readFileToString(new File(f), java.nio.charset.Charset.defaultCharset)
              ScalaInterpreter(false, Nil).eval[(String, String, String) => Double](s"{$code}: ((String, String, String) => Double)")
            }
          }
          c <- colDefsTry
          l <- leftDs
          r <- rightDs
          v <- DsCompare(c, l, r, diffSetWriterCreator _, explainers, matcher, cmdLine.noSortLeft, cmdLine.noSortRight).run
        } yield v

        ec.shutdown

        dsCompareResultTry
    }
  }.flatten)
}

object DsCompareApp extends ADsCompareApp
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
