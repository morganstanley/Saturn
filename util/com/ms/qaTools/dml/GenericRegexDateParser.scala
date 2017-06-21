package com.ms.qaTools.dml

import org.joda.time.format.DateTimeFormatter
import org.joda.time.format.DateTimeFormatterBuilder

object GenericRegexDateParser {

  val genericDatePattern = "^([0-9]{4})([-/]?)([0-9]{2})([-/]?)([0-9]{2})(.*)?$".r
  val genericTimePattern = "^([T ])?([0-9]{2}|[0-9])([: \\.]?)([0-9]{2})([: \\.]?)?([0-9]{2})?(?:([: \\.]?)([0-9]{4,6})?)?(\\s*)([AaPp][Mm])?(\\s*)([A-Za-z/]*)?$".r

  def apply(date: String): DateTimeFormatter = {
    val dtfb = new DateTimeFormatterBuilder()
    val genericDatePattern(year, s1, month, s2, day, time) = date
    dtfb.appendYear(year.length(), year.length())
    if (s1 != null) dtfb.appendLiteral(s1)
    dtfb.appendMonthOfYear(month.length())
    if (s2 != null) dtfb.appendLiteral(s2)
    dtfb.appendDayOfMonth(day.length())

    if (time == null || time.isEmpty()) dtfb
    else {
      val genericTimePattern(prefix, hour, s1, minutes, s2, seconds, s3, milliseconds, s4, halfday, s5, timezone) = time
      if (prefix != null) dtfb.appendLiteral(prefix)
      if (hour != null && halfday == null) dtfb.appendHourOfDay(1)
      if (hour != null && halfday != null) dtfb.appendHourOfHalfday(1)
      if (s1 != null) dtfb.appendLiteral(s1)
      if (minutes != null) dtfb.appendMinuteOfHour(minutes.length())
      if (s2 != null) dtfb.appendLiteral(s2)
      if (seconds != null) dtfb.appendSecondOfMinute(seconds.length())
      if (s3 != null) dtfb.appendLiteral(s3)
      if (milliseconds != null) dtfb.appendMillisOfSecond(milliseconds.length())
      if (s4 != null) dtfb.appendLiteral(s4)
      if (halfday != null && !halfday.isEmpty()) dtfb.appendHalfdayOfDayText()
      if (s5 != null) dtfb.appendLiteral(s5)
      if (timezone != null && !timezone.isEmpty()) dtfb.appendTimeZoneId()
    }
    if (dtfb.canBuildFormatter()) dtfb.toFormatter() else throw new Error("Can't build the parser.")
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
