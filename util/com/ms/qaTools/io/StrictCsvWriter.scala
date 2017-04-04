package com.ms.qaTools.io

import java.io.{ Writer => JWriter }
import java.io.PrintWriter
import java.util.regex.Pattern
import scala.collection.mutable.StringBuilder



class StrictCsvWriter(protected val writer: JWriter,
  protected val separator: String,
  protected val quoteChar: Char,
  protected val escapeChar: Char,
  protected val lineEnd: String,
  protected val nullMarker: String) {
  
  protected val pw = new PrintWriter(writer)

  def writeAll(lines: List[Array[String]]): Unit =
    for (line <- lines)
      writeNext(line)

  def writeAll(lines: List[Array[String]], quoteAllElements: Boolean): Unit = {
    for (line <- lines)
      writeNext(line, quoteAllElements)
  }

  def writeNext(line: Array[String]): Unit =
    writeNext(line, true)

  def writeNext(line: Array[String], quoteAllElements: Boolean): Unit = {

    if (line == null)
      return

    def quoteIfNecessary(s: String): String = s match {
      case null => Option(nullMarker) map quoteIfNecessary getOrElse ""
      case "" => quoteElement("")
      case str if stringContainsSpecialCharacters(str) => quoteElement(processLine(str))
      case str if quoteAllElements => quoteElement(str)
      case str => str
    }
    pw.write(line.map(quoteIfNecessary).mkString("", separator.toString, lineEnd))
  }

  protected def processLine(element: String): String =
    {
      if (escapeChar == StrictCsvWriter.NO_ESCAPE_CHARACTER)
        element
      else
        element.foldLeft(new StringBuilder(element.size)) {
          case (s, character @ (`quoteChar` | `escapeChar`)) => s.append(escapeChar).append(character)
          case (s, character) => s.append(character)
        }.toString
    }

  protected val specialCharactersRegex =
    ("""\A\s+""" :: """\s+\Z""" :: List(separator, quoteChar.toString, escapeChar.toString, "\n", "\r").map(Pattern.quote)).mkString("(", "|", ")").r

  protected def stringContainsSpecialCharacters(s: String): Boolean = specialCharactersRegex.findFirstIn(s).nonEmpty

  protected def quoteElement(element: String): String = {
    if (quoteChar == StrictCsvWriter.NO_QUOTE_CHARACTER)
      element
    else
      quoteChar + element + quoteChar
  }

  def flush() =
    pw.flush

  def close() = {
    flush
    pw.close
    writer.close
  }
}

object StrictCsvWriter {

  final val DEFAULT_SEPARATOR = ','
  final val DEFAULT_QUOTE_CHARACTER = '"'
  final val NO_QUOTE_CHARACTER = '\u0000'
  final val DEFAULT_ESCAPE_CHARACTER = '"'
  final val NO_ESCAPE_CHARACTER = '\u0000'
  final val DEFAULT_LINE_END = "\n"

  final val INITIAL_STRING_SIZE = 128

  def apply(writer: JWriter,
    separator: Char = StrictCsvWriter.DEFAULT_SEPARATOR,
    quoteChar: Char = StrictCsvWriter.DEFAULT_QUOTE_CHARACTER,
    escapeChar: Char = StrictCsvWriter.DEFAULT_ESCAPE_CHARACTER,
    lineEnd: String = StrictCsvWriter.DEFAULT_LINE_END,
    nullMarker: String = null): StrictCsvWriter =
    new StrictCsvWriter(writer, separator.toString, quoteChar, escapeChar, lineEnd, nullMarker)
  def apply(writer: JWriter,
    separator: Char,
    quoteChar: Char,
    lineEnd: String,
    nullMarker: String): StrictCsvWriter =
    new StrictCsvWriter(writer, separator.toString, quoteChar, StrictCsvWriter.DEFAULT_ESCAPE_CHARACTER, lineEnd, nullMarker)
  def apply(writer: JWriter,
    separator: String,
    quoteChar: Char,
    escapeChar: Char,
    lineEnd: String,
    nullMarker: String): StrictCsvWriter =
    new StrictCsvWriter(writer, separator, quoteChar, escapeChar, lineEnd, nullMarker)
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
