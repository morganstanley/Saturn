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
COPYRIGHT NOTICE AND DISCLAIMER
Copyright (c) 2009-2016, Contributor

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License, version 3 for more details.

You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
*/
