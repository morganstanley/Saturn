package com.ms.qaTools.toolkit.sql

import scala.util.Try

import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.TryUtil
import com.ms.qaTools.io.rowSource.DatabaseConnection
import com.ms.qaTools.toolkit.Failed
import com.ms.qaTools.toolkit.Passed
import com.ms.qaTools.toolkit.Runnable

case class SQLExecute(dbConnection: DatabaseConnection,
  sqlExprs: Seq[String],
  parameters: Seq[Option[Iterator[Seq[String]]]]) extends Runnable[SQLExecuteResult] {
  def run = sqlExprs.zip(parameters).map {
    case (sqlExpr, parameters) =>
      Try {
        dbConnection.execute(sqlExpr, parameters.getOrElse(Iterator.single(Seq())))
        SQLExecuteActionResult(Passed(), sqlExpr)
      }.recover { case t: Throwable => SQLExecuteActionResult(Failed(), sqlExpr, Some(t)) }
  }.toTrySeq.map(results => SQLExecuteResult(if (results.forall { _.passed }) Passed() else Failed(), results))
}

object SQLExecute {
  def apply(dbResourceTry: Try[DatabaseConnection],
    sqlExprsTry: Seq[Try[String]],
    parameterIOsTry: Seq[Option[Try[Iterator[Seq[String]]]]]): Try[SQLExecute] =
    {
      for {
        dbConnection <- dbResourceTry.rethrow("An exception occurred while connecting database resource.")
        sqlExprs <- sqlExprsTry.toTrySeq.rethrow("An exception occurred while generating sql expressions.")
        parameters <- parameterIOsTry.map { option =>
          option.map { t => t.map(Option(_)) }.getOrElse(Try(None))
        }.toTrySeq.rethrow("An exception occurred while connecting parameter IO resources.")
      } yield SQLExecute(dbConnection, sqlExprs, parameters)
    }.rethrow("An exception occurred while setting up SQLExecute.")
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
