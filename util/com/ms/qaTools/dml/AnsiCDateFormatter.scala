package com.ms.qaTools.dml

import java.io.Writer
import java.util.Locale
import scala.annotation.tailrec
import org.joda.time.Chronology
import org.joda.time.DateTime
import org.joda.time.DateTimeZone
import org.joda.time.ReadablePartial
import org.joda.time.format.DateTimeFormat
import org.joda.time.format.DateTimeFormatterBuilder
import org.joda.time.format.DateTimePrinter
import org.joda.time.format.DateTimeFormatter

object AnsiCDateFormatter {
  def apply(): DateTimeFormatter = apply("%Y%m%d%H:%M:%S")
  def apply(text: String): DateTimeFormatter = {
    val builder = new DateTimeFormatterBuilder()
    val ansiCSequences = Map[String,DateTimeFormatterBuilder => DateTimeFormatterBuilder](
        "%a" -> {case builder: DateTimeFormatterBuilder => builder.appendDayOfWeekShortText()},
        "%A" -> {case builder: DateTimeFormatterBuilder => builder.appendDayOfWeekText()},
        "%b" -> {case builder: DateTimeFormatterBuilder => builder.appendMonthOfYearShortText()},
        "%B" -> {case builder: DateTimeFormatterBuilder => builder.appendMonthOfYearText()},
//  %c   locale's date and time (e.g., Thu Mar  3 23:05:25 2005)
        "%C" -> {case builder: DateTimeFormatterBuilder => builder.appendCenturyOfEra(2, 2)},
        "%d" -> {case builder: DateTimeFormatterBuilder => builder.appendDayOfMonth(2)},
        "%D" -> {case builder: DateTimeFormatterBuilder => builder.append(DateTimeFormat.forPattern("MM/dd/YY"))},
        //  %e   day of month, space padded; same as %_d
        "%F" -> {case builder: DateTimeFormatterBuilder => builder.append(DateTimeFormat.forPattern("YYYY-MM-dd"))},
//  %g   last two digits of year of ISO week number (see %G)
//  %G   year of ISO week number (see %V); normally useful only with %V
        "%h" -> {case builder: DateTimeFormatterBuilder => builder.appendMonthOfYearShortText()},
        "%H" -> {case builder: DateTimeFormatterBuilder => builder.appendHourOfDay(2)},
        "%I" -> {case builder: DateTimeFormatterBuilder => builder.appendHourOfHalfday(2)},
        "%j" -> {case builder: DateTimeFormatterBuilder => builder.appendDayOfYear(3)},
        "%k" -> {case builder: DateTimeFormatterBuilder => builder.appendHourOfDay(1)},
        "%l" -> {case builder: DateTimeFormatterBuilder => builder.appendHourOfHalfday(1)},
        "%m" -> {case builder: DateTimeFormatterBuilder => builder.appendMonthOfYear(2)},
        "%M" -> {case builder: DateTimeFormatterBuilder => builder.appendMinuteOfHour(2)},
        "%n" -> {case builder: DateTimeFormatterBuilder => builder.appendLiteral('\n')},
        "%N" -> {case builder: DateTimeFormatterBuilder => throw new Exception("Nanoseconds not available in joda time.")},
        "%p" -> {case builder: DateTimeFormatterBuilder => builder.appendHalfdayOfDayText()},
//  %P   like %p, but lower case
        "%r" -> {case builder: DateTimeFormatterBuilder => builder.append(DateTimeFormat.forPattern("h:mm:ss a"))},
        "%R" -> {case builder: DateTimeFormatterBuilder => builder.append(DateTimeFormat.forPattern("HH:mm a"))},
        "%s" -> {case builder: DateTimeFormatterBuilder => builder.append(new EpochPrinter)},
        "%S" -> {case builder: DateTimeFormatterBuilder => builder.appendSecondOfMinute(2)},
        "%t" -> {case builder: DateTimeFormatterBuilder => builder.appendLiteral('\t')},
        "%T" -> {case builder: DateTimeFormatterBuilder => builder.append(DateTimeFormat.forPattern("HH:mm:ss"))},
        "%u" -> {case builder: DateTimeFormatterBuilder => builder.appendDayOfWeek(1)},
        "%U" -> {case builder: DateTimeFormatterBuilder => builder.appendWeekOfWeekyear(2)},
//  %V   ISO week number, with Monday as first day of week (01..53)
//  %w   day of week (0..6); 0 is Sunday        
//  %W   week number of year, with Monday as first day of week (00..53)
//  %x   locale's date representation (e.g., 12/31/99)
//  %X   locale's time representation (e.g., 23:13:48)
        "%y" -> {case builder: DateTimeFormatterBuilder => builder.appendYearOfCentury(2, 2)},
        "%Y" -> {case builder: DateTimeFormatterBuilder => builder.appendYear(4, 4)},
        "%Z" -> {case builder: DateTimeFormatterBuilder => builder.appendTimeZoneId()},
//  %:::z  numeric time zone with : to necessary precision (e.g., -04, +05:30)        
        "%z" -> {case builder: DateTimeFormatterBuilder => builder.appendTimeZoneOffset(null, false, 2, 2)},
        "%:z" -> {case builder: DateTimeFormatterBuilder => builder.appendTimeZoneOffset(null, true, 2, 2)},
        "%::z" -> {case builder: DateTimeFormatterBuilder => builder.appendTimeZoneOffset(null, true, 3, 3)})
                
      val notation = "%[:]*[A-Za-z]".r
      @tailrec def processText0(text: String, builder: DateTimeFormatterBuilder = new DateTimeFormatterBuilder()): DateTimeFormatterBuilder = {
        if (text.isEmpty) builder
        else {
          notation.findFirstMatchIn(text) match {
            case Some(n) => { 
              val pre = text.substring(0,n.start)
              val y = n.matched
              val post = text.substring(n.end)
              if (pre.endsWith("%")) processText0(post,builder.appendLiteral(pre.dropRight(1) + n.matched))
              else processText0(post,ansiCSequences.getOrElse(y, throw new Error("Unsupported operation '%s'".format(n)))(builder.appendLiteral(pre)))
            }
            case None => builder.appendLiteral(text)
          }
        }        
      }
      processText0(text).toFormatter()
  }
  
  sealed class EpochPrinter extends DateTimePrinter {
    def printTo(buf: StringBuffer, instant: Long, chrono: Chronology,
      displayOffset: Int, displayZone: DateTimeZone, locale: Locale) = buf.append(getText((new DateTime(instant, chrono.withZone(displayZone))).toLocalDateTime(), locale))
    def printTo(out: Writer, instant: Long, chrono: Chronology, displayOffset: Int, displayZone: DateTimeZone, locale: Locale) =
      out.write(getText((new DateTime(instant, chrono.withZone(displayZone))).toLocalDateTime(), locale))
    def printTo(buf: StringBuffer, partial: ReadablePartial, locale: Locale) = 
      buf.append(getText(partial, locale));
    def printTo(out: Writer, partial: ReadablePartial, locale: Locale) = 
      out.write(getText(partial, locale))
      
    def getText(partial: ReadablePartial, locale: Locale) = {
        val d = new DateTime(partial)      
        (d.getMillis() / 1000).toString
    }      
    def estimatePrintedLength: Int = 10
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
