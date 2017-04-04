package com.ms.qaTools.toolkit.sql

import com.ms.qaTools.toolkit.Result
import com.ms.qaTools.toolkit.Status
import com.ms.qaTools.toolkit.Failed
import com.ms.qaTools.exceptions.AggregateException



case class SQLFetchQueryResult(override val status: Status,
  query: String,
  override val exception: Option[Throwable] = None) extends Result {
  override def toString(): String = "SQLFetchQueryResult(status=" + status + ", query=\"" + query + "\", exception=" + exception + ")"
}

case class SQLFetchResult(override val status: Status,
  queries: Seq[SQLFetchQueryResult]) extends Result {
  override val exception = status match {
    case Failed() => Some(new AggregateException("Not all queries passed.", queries.filter(p => p.failed)
                                                                               .map(q => new Exception("Query failed: %s".format(q.query), q.exception.getOrElse(null)))))
    case _ => None
  }
}

case class SQLClearActionResult(override val status: Status,
  table: String,
  override val exception: Option[Throwable] = None) extends Result {
  override def toString(): String = "SQLClearTableResult(status=" + status + ", table=\"" + table + "\", exception=" + exception + ")"
}
case class SQLClearResult(override val status: Status,
  actions: Seq[SQLClearActionResult]) extends Result
case class SQLLoadActionResult(override val status: Status,
  table: String,
  override val exception: Option[Throwable] = None) extends Result {
  override def toString(): String = "SQLLoadTableResult(status=" + status + ", table=\"" + table + "\", exception=" + exception + ")"
}

case class SQLLoadResult(override val status: Status,
  actions: Seq[SQLLoadActionResult]) extends Result

case class SQLCallActionResult(override val status: Status,
  procedure: String,
  override val exception: Option[Throwable] = None) extends Result {
  override def toString(): String = "SQLCallActionResult(status=" + status + ", procedure=\"" + procedure + "\", exception=" + exception + ")"
}
case class SQLCallResult(override val status: Status,
  calls: Seq[SQLCallActionResult]) extends Result

case class SQLExecuteActionResult(override val status: Status,
  statement: String,
  override val exception: Option[Throwable] = None) extends Result {
  override def toString(): String = "SQLExecuteActionResult(status=" + status + ", statement=\"" + statement + "\", exception=" + exception + ")"
}

case class SQLExecuteResult(override val status: Status,
  statements: Seq[SQLExecuteActionResult]) extends Result                                      
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
