package com.ms.qaTools.io.rowSource.jdbc
import com.ms.qaTools.io.rowSource.DatabaseConnection
import com.ms.qaTools.io.rowSource.MaximumRetryIterator
import com.ms.qaTools.Logger
import java.sql.ResultSet
import java.util.TimeZone
import org.joda.time.format.DateTimeFormat
import scala.collection.immutable.Stream.consWrapper
import scala.concurrent.ExecutionContext

case class IntervalTimestampQuery(intervalQueryStr: String, timestampField: String, timezone: String, timeBound: Long)
/*
 * Helper to create a SQL query string based on a timestamp field, a timezone and a timeboud
 */

object IntervalTimeStampQueryUtil {
  // Convert local time to time zone time
  def getTimeZoneTime(time: Long, timezone: String): Long = getTimeZoneTime(time, TimeZone.getTimeZone(timezone))

  def getTimeZoneTime(time: Long, timezone: TimeZone): Long = {
    val localTz = TimeZone.getDefault()
    val offset = timezone.getOffset(time) - localTz.getOffset(time)
    time + offset
  }

  // Convert time from time zone to the local time zone
  def getLocalTime(time: Long, timezone: String): Long = getLocalTime(time, TimeZone.getTimeZone(timezone))

  def getLocalTime(time: Long, timezone: TimeZone): Long = {
    val localTz = TimeZone.getDefault()
    val offset = timezone.getOffset(time) - localTz.getOffset(time)
    time - offset
  }

  def apply(query: String, timestampField: String, timezone: String, timeBound: Long, epochToTimestampStringFunc: Long => String) = {
    val localDbTime = getTimeZoneTime(timeBound, timezone)
    val textBound = epochToTimestampStringFunc(localDbTime)

    val intervalQuery = if (query.toUpperCase().matches("^SELECT\\s.+\\sWHERE\\s.+$")) {
      query + " AND %s >= %s".format(timestampField, textBound)
    }
    else if (query.toUpperCase().matches("^SELECT\\s.+$")) query + " WHERE %s >= %s".format(timestampField, textBound)
    else query
    intervalQuery
  }
}

trait IntervalTimestampQueryCreator {
  val epochToTimestampStringFunc: Long => String

  def createIntervalQuery(
    intervalQuery: String,
    timestampField: String,
    timezone: String,
    timeBound: Long) = IntervalTimestampQuery(intervalQuery, timestampField, timezone, timeBound)

  def createInitialQuery(query: String, timestampField: String, timezone: String, timeBound: Long, keepPreviousTime: Boolean = false): IntervalTimestampQuery = {
    val intervalQueryStr = IntervalTimeStampQueryUtil(query, timestampField, timezone, timeBound, epochToTimestampStringFunc)
    createIntervalQuery(intervalQueryStr, timestampField, timezone, if (keepPreviousTime) timeBound else System.currentTimeMillis)
  }

  def createFollowingQueries(query: String, previousIntervalQuery: IntervalTimestampQuery, keepPreviousTime: Boolean = false): Stream[IntervalTimestampQuery] = {
    val timestampField = previousIntervalQuery.timestampField
    val timezone = previousIntervalQuery.timezone
    val timeBound = previousIntervalQuery.timeBound

    val intervalQueryStr = IntervalTimeStampQueryUtil(query, timestampField, timezone, timeBound, epochToTimestampStringFunc)
    val time = if (keepPreviousTime) timeBound else System.currentTimeMillis
    val followingQuery = IntervalTimestampQuery(intervalQueryStr, timestampField, timezone, time)
    followingQuery #:: createFollowingQueries(query, followingQuery, keepPreviousTime)
  }
}

case class SybaseIntervalTimestampQueryCreator() extends IntervalTimestampQueryCreator {

  override val epochToTimestampStringFunc = (epoch: Long) => {
    val dateFormatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")
    "CAST('%s' AS DATETIME)".format(dateFormatter.print(epoch))
  }
}

case class DB2IntervalTimestampQueryCreator() extends IntervalTimestampQueryCreator {

  override val epochToTimestampStringFunc = (epoch: Long) => {
    val dateFormatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")
    "TIMESTAMP('%s')".format(dateFormatter.print(epoch))
  }
}

case class H2IntervalTimestampQueryCreator() extends IntervalTimestampQueryCreator {
  override val epochToTimestampStringFunc = (epoch: Long) =>DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").print(epoch)
}

/*
 * Creates a RetryIterator SQLSelectRowSource that will
 * keep retrying until there is data available.
 * If KeepPreviousTime is true than the time stamp filter value
 * will be always the same.
 */
object IntervalSQLSelectRetryRowSource {
  val logger = Logger(this.getClass)

  def apply(
    connection: DatabaseConnection with FetchSupport,
    queryStr: String,
    intervalQueryCreator: IntervalTimestampQueryCreator,
    timestampField: String,
    maxRetry: Int = 10,
    infiniteRetry: Boolean = false,
    timezone: String = "UTC",
    retryPeriod: Long = 1000,
    startTime: Option[Long] = None,
    keepPreviousTime: Boolean = false,
    resultSetType: Int = ResultSet.TYPE_FORWARD_ONLY,
    resultSetConcurrency: Int = ResultSet.CONCUR_READ_ONLY)(implicit ec: ExecutionContext) = {
    val firstQuery = intervalQueryCreator.createInitialQuery(queryStr, timestampField, timezone, startTime.getOrElse(System.currentTimeMillis), keepPreviousTime)
    val queries = Stream.cons(firstQuery, intervalQueryCreator.createFollowingQueries(queryStr, firstQuery, keepPreviousTime)).toIterator
    val config = FetchSupport.Config(resultSetType = resultSetType, resultSetConcurrency = resultSetConcurrency)

    val sqlSelectCreator: () => ResultSetRowSource = () => {
      val queryStr = queries.next.intervalQueryStr
      connection.fetch(queryStr, config = config)
    }
    MaximumRetryIterator(sqlSelectCreator, maxRetry, infiniteRetry, retryPeriod) asFuture
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
