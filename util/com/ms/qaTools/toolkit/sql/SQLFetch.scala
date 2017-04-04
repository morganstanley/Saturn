package com.ms.qaTools.toolkit.sql

import scala.util.Failure
import scala.util.Success
import scala.util.Try

import org.apache.commons.io.FilenameUtils

import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.TryUtil
import com.ms.qaTools.io.DeviceIO
import com.ms.qaTools.io.FileIO
import com.ms.qaTools.io.NullWriter
import com.ms.qaTools.io.Writer
import com.ms.qaTools.io.definition.CsvIO
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.io.rowSource.Utils.ResultSetIteratorUtil
import com.ms.qaTools.io.rowSource.DatabaseConnection
import com.ms.qaTools.toolkit.Failed
import com.ms.qaTools.toolkit.Passed
import com.ms.qaTools.toolkit.Runnable
import com.ms.qaTools.withCloseable

case class SQLFetch(dbConnection: DatabaseConnection,
  sqlExprs: Seq[String],
  outputs: Seq[Writer[Iterator[Seq[String]]]],
  parameters: Seq[Option[(Iterator[Seq[String]] with ColumnDefinitions, String)]] = Nil)
  extends Runnable[SQLFetchResult] {

  def run = (sqlExprs, outputs, parameters.padTo(sqlExprs.size, None)).zipped.toSeq.zipWithIndex.map {
    case ((sqlExpr, output, parametersOption), i) =>
      Try {
        parametersOption.map {
          case (parameters, fileName) =>
            val rsIterator = dbConnection.fetchWithParameters(sqlExpr, parameters)
            for ((rs, i) <- rsIterator.zipWithIndex) {
              val baseName = FilenameUtils.getBaseName(fileName)
              val fullPath = FilenameUtils.getFullPath(fileName)
              val extension = FilenameUtils.getExtension(fileName)
              (new CsvIO(new FileIO(fullPath + baseName + "." + "%04d".format(i) + "." + extension)).output) match {
                case Success(writer) => Try(withCloseable(writer) { _.write(rs.toSeqStringIterator) })
                case Failure(t) => throw new Exception("An exception occurred while connecting rotating file.")
              }
            }
            rsIterator.close
        }.getOrElse(withCloseable(dbConnection.fetch(sqlExpr)) { rs =>
          output.write(rs.toSeqStringIterator)
        })
        SQLFetchQueryResult(Passed(), sqlExpr)
      }.recover { case t: Throwable => SQLFetchQueryResult(Failed(), sqlExpr, Some(t)) }
  }.toTrySeq.map(results => SQLFetchResult(if (results.forall { _.passed }) Passed() else Failed(), results))

}

object SQLFetch {
  //apply method for Saturn Runtime
  def apply(dbResourceTry: Try[DatabaseConnection],
    sqlExprsTry: Seq[Try[String]],
    outputsTry: Seq[Try[Writer[Iterator[Seq[String]]]]],
    parametersTry: Seq[Option[(Try[Iterator[Seq[String]] with ColumnDefinitions], Try[String])]]): Try[SQLFetch] =
    {
      for {
        dbConnection <- dbResourceTry.rethrow("An exception occurred while connection database resource.")
        sqlExprs <- sqlExprsTry.toTrySeq.rethrow("An exception occurred while generating sql expressions.")
        outputs <- outputsTry.zip(parametersTry).map {
          case (output, parameterTry) => parameterTry.map(_ => Try { new NullWriter }).getOrElse(output)
        }.toTrySeq.rethrow("An exception occurred while connecting output resources.")
        parameters <- parametersTry.map { option =>
          val t = for ((paramsT, fileT) <- option) yield for (p <- paramsT; f <- fileT) yield Some((p, f))
          t.getOrElse(Success(None))
        }.toTrySeq.rethrow("An exception occurred while connecting parameter IO resources.")
      } yield SQLFetch(dbConnection, sqlExprs, outputs, parameters)
    }.rethrow("An exception occurred while setting up SQLFetch.")
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
