package com.ms.qaTools.dml
import org.joda.time.base.BaseDateTime
import org.joda.time.DateTime
import org.joda.time.DateTimeZone
import org.joda.time.format.DateTimeFormat
import org.joda.time.format.DateTimeFormatter
import org.joda.time.LocalDate
import org.joda.time.LocalTime
import org.joda.time.MutableDateTime
import scala.annotation.tailrec
import scala.collection.JavaConversions.seqAsJavaList
import scala.util.{Try,Success,Failure}

class Date(val baseDateTime: BaseDateTime, val calendars: Seq[String] = Seq("NYB"), val formatter: DateTimeFormatter = AnsiCDateFormatter()) {
  private val ld = new LocalDate(baseDateTime)
  private val lt = new LocalTime(baseDateTime, baseDateTime.getZone())

  private def isAMOETCode(moetCode: String): Boolean = moetCode.size == 4 && moetCode.endsWith("K")
  private def moetCalendarToSwaps(moetCode: String): String = {
    require(isAMOETCode(moetCode), "MOET code is a 4-letter code ending in K.")
    moetCode.dropRight(1)
  }

  def +(that: Duration) = that + this
  def -(that: Duration) = that - this

  def copy(newBaseDateTime: BaseDateTime = baseDateTime, calendars: Seq[String] = calendars, formatter: DateTimeFormatter = formatter): Date =
    new Date(newBaseDateTime, calendars, formatter)

  def toFirstDoW = copy(ld.dayOfWeek.withMinimumValue.minusDays(1).toDateTime(lt))
  def toFirstDoM = copy(ld.dayOfMonth.withMinimumValue.toDateTime(lt))
  def toFirstDoY = copy(ld.dayOfYear.withMinimumValue.toDateTime(lt))
  def toLastDoW  = copy(ld.dayOfWeek.withMaximumValue.minusDays(1).toDateTime(lt))
  def toLastDoM  = copy(ld.dayOfMonth.withMaximumValue.toDateTime(lt))
  def toLastDoY  = copy(ld.dayOfYear.withMaximumValue.toDateTime(lt))

  def formatISODate(formatStr: String) = formatDate(formatStr,true)
  def formatDate(formatStr: String, isISOFormatting: Boolean = false) = copy(formatter = (if (!isISOFormatting) AnsiCDateFormatter(formatStr) else DateTimeFormat.forPattern(formatStr)))
  def formatDate(formatter: DateTimeFormatter) = copy(formatter = formatter)

  def addBusCals(calIds: String*) = copy(calendars = calendars ++ (calIds.map {c => if (isAMOETCode(c)) moetCalendarToSwaps(c) else c}))
  def setBusCals(calIds: String*) = copy(calendars = calIds.map {c => if (isAMOETCode(c)) moetCalendarToSwaps(c) else c})
  def setBusCal(calId: String) = setBusCals(calId)

  def toTimeZone(tz: String) = copy(ld.toDateTime(lt).withZone( DateTimeZone.forID(tz) ))
  
  override def toString(): String = formatter.print(baseDateTime)

  override def equals(d: Any): Boolean = d match {
    case date: Date => baseDateTime.equals(date.baseDateTime)
    case _          => super.equals(d)
  }
}

object Now {
  def apply(): Date = Date(DateTime.now())
  def apply(tz: String): Date = Date(DateTime.now(DateTimeZone.forID(tz)))
}

object Date {
  def apply(date: java.util.Date): Date = apply(new DateTime(date))

  def apply(date: BaseDateTime): Date = new Date(date)

  def apply(date: BaseDateTime, tz: String): Date = apply(new DateTime(date, DateTimeZone.forID(tz)))

  def apply(dateStr: String): Date = apply(DateTime.parse(dateStr, GenericRegexDateParser(dateStr)))

  def apply(dateStr: String, tz: String): Date = apply(new DateTime(DateTime.parse(dateStr, GenericRegexDateParser(dateStr))), tz)
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
