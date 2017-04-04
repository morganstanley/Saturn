package com.ms.qaTools.io.rowSource.mongodb

import com.ms.qaTools.Logger
import scala.concurrent.ExecutionContext
import com.mongodb.DBObject
import com.ms.qaTools.io.rowSource._
import com.ms.qaTools.io.rowSource.jdbc.IntervalTimeStampQueryUtil
import org.joda.time.format.ISODateTimeFormat
import com.mongodb.BasicDBObject
import java.util.Date
import com.mongodb.QueryBuilder

object MongoDBIntervalRetryRowSource {
  def createQuery(query: DBObject, timeBound: Long, timestampField: String, timezone: String = "UTC") = {
    val localDbTime = IntervalTimeStampQueryUtil.getTimeZoneTime(timeBound, timezone)
    val date = new Date(localDbTime)
    val timestampQuery = QueryBuilder.start().put(timestampField).greaterThanEquals(date).get()
    val newQuery = new BasicDBObject(query.toMap)
    newQuery.put(timestampField, timestampQuery.get(timestampField))
    newQuery
  }

  def createFollowingQueries(query: DBObject, timeBound: Long, timestampField: String, timezone: String = "UTC", keepPreviousTime: Boolean = false): Stream[DBObject] = {
    val nextTime = if (keepPreviousTime) timeBound else System.currentTimeMillis
    val nextQuery = createQuery(query, timeBound, timestampField, timezone)
    nextQuery #:: createFollowingQueries(query, nextTime, timestampField, timezone, keepPreviousTime)
  }

  def apply(
    connection: MongoDBConnection,
    collection: String,
    query: DBObject,
    timestampField: String,
    timezone: String = "UTC",
    maxRetry: Int = 10,
    infiniteRetry: Boolean = false,
    retryPeriod: Long = 1000,
    startTime: Option[Long] = None,
    keepPreviousTime: Boolean = false)(implicit ec: ExecutionContext) = {

    val time = startTime.getOrElse(System.currentTimeMillis)
    val firstQuery = createQuery(query, time, timestampField, timezone)
    val queries = Stream.cons(firstQuery, createFollowingQueries(query, if (keepPreviousTime) time else System.currentTimeMillis, timestampField, timezone, keepPreviousTime)).toIterator

    val mongoRowSourceCreator: () => MongoDBRowSource = () => {
      MongoDBRowSource(connection, collection, Option(queries.next))
    }

    MaximumRetryIterator(mongoRowSourceCreator, maxRetry, infiniteRetry, retryPeriod) asFuture
  }
}
/*
COPYRIGHT NOTICE AND DISCLAIMER
Copyright (c) 2009-2016, Contributor

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License, version 3 for more details.

You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
*/
