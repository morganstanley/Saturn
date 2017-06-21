package com.ms.qaTools.io.rowSource.delimited

import java.io.Reader

import scala.annotation.tailrec
import scala.collection.mutable.Builder
import scala.util.parsing.input.{ Position, NoPosition }

import com.ms.qaTools.io.rowSource.internal.StreamingReader

/**
 * Simple CSV parser as per http://tools.ietf.org/html/rfc4180
 *
 */

class DelimitedParser(
  reader: Reader,
  separator: String,
  newline: String,
  bufSize: Int,
  quoteCharOpt: Option[Char],
  escapeCharOpt: Option[Char],
  isEmptyStringNotNull: Boolean) extends Parser {
  require((quoteCharOpt.isDefined && escapeCharOpt.isDefined) || (!quoteCharOpt.isDefined && !escapeCharOpt.isDefined), "Quote and escape character must be both set or unset.")

  def this(
    reader: Reader,
    separator: Char = ',',
    newline: Char = '\n',
    bufSize: Int = 4 * 1024,
    quoteChar: Option[Char] = Some('"'),
    escapeChar: Option[Char] = Some('"'),
    isEmptyStringNotNull: Boolean = true) = {
    this(reader, separator.toString, newline.toString, bufSize, quoteChar, escapeChar, isEmptyStringNotNull)
  }

  val streamingReader = new StreamingReader(reader, bufSize)
  val quotable  = quoteCharOpt.isDefined && escapeCharOpt.isDefined
  lazy val quoteChar = quoteCharOpt.getOrElse(throw new Error("Quote character not defined."))
  lazy val escapeChar = escapeCharOpt.getOrElse(throw new Error("Escape character not defined."))

  private def headIs(buffer: StreamingReader, char: Option[Char]) = char.map(c => buffer.headIs(c)).getOrElse(false)

  @tailrec
  private def parseCell(buffer: StreamingReader, atHead: Boolean): Option[String] = {
    def isWhitespace = buffer.first.isWhitespace      &&
                       !headIs(buffer, quoteCharOpt)  &&
                       !headIs(buffer, escapeCharOpt) &&
                       !buffer.headIs(separator)      &&
                       !buffer.headIs(newline)

    @tailrec
    def readUntil0(inQuotes: Boolean = false, accu: StringBuilder = new StringBuilder(bufSize)): StringBuilder = {
      def head2is(chars: Seq[Char]) = buffer.first(2) == chars.mkString
      def isNextCharEscapable = inQuotes && !buffer.atEnd && { head2is(Seq(escapeChar, quoteChar)) || head2is(Seq(escapeChar, escapeChar)) }
      def isNextCharEscapedQuote = inQuotes && !buffer.atEnd && (head2is(Seq(quoteChar, quoteChar)))
      def isSeparator = !inQuotes && buffer.headIs(separator)
      def isNewLine = !inQuotes && buffer.headIs(newline)
      val c = buffer.first
      if (quotable && ((c == escapeChar && isNextCharEscapable) || (c == quoteChar && isNextCharEscapedQuote))) {
        buffer.drop
        readUntil0(inQuotes, accu.append(buffer.drop))
      }
      else if (quotable && c == quoteChar && !buffer.atEnd) {
        if (inQuotes) {
          buffer.drop
          while (isWhitespace) buffer.drop
          if (!(buffer.atEnd || buffer.headIs(separator) || buffer.headIs(newline)))
            throw new ParsingError("Separator or newline expected but '\\u%04X' found".format(buffer.first.toInt),
              buffer.pos)
          accu
        }
        else
          throw new ParsingError("Quoted parts behind another quoted or non-quoted parts in a single field", buffer.pos)
      }
      else if (isSeparator || isNewLine || buffer.atEnd) {
        if (inQuotes) throw new ParsingError("Odd number of quoting character(s)", NoPosition)
        accu
      }
      else
        readUntil0(inQuotes, accu.append(buffer.drop))
    }

    if (buffer.headIs(separator)) {
      if (atHead) None
      else {
        buffer.drop(separator.length)
        if (buffer.atEnd || buffer.headIs(separator)) None
        else parseCell(buffer, false)
      }
    }
    else if (isWhitespace) {
      buffer.drop
      if (buffer.headIs(separator)) None 
      else parseCell(buffer, false)
    }
    else if (headIs(buffer, quoteCharOpt)) {
      buffer.drop
      readUntil0(inQuotes = true).toString match {
        case "" if !isEmptyStringNotNull => None
        case s                           => Some(s)
      }
    }
    else {
      readUntil0().toString.trim match {
        case "" => None
        case s  => Some(s)
      }
    }
  }

  def readNext: Seq[Option[String]] = parseLine(streamingReader, true).orNull

  @tailrec
  private final def parseLine(buffer: StreamingReader, atHead: Boolean,
                              accu: Builder[Option[String], IndexedSeq[Option[String]]] = IndexedSeq.newBuilder): Option[IndexedSeq[Option[String]]] = {
    def processEnd0(onEmpty: Option[IndexedSeq[Option[String]]]) = accu.result() match {
      case Seq() => onEmpty
      case xs    => Some(xs)
    }
    if (buffer.atEnd) processEnd0(None)
    else {
      buffer.first(newline.length) match {
        case `newline` => {
          buffer.drop(newline.length)
          processEnd0(Some(IndexedSeq(None)))
        }
        case _ => {
          parseLine(buffer, false, accu += parseCell(buffer, atHead))
        }
      }
    }
  }

  def close() = reader.close()
}

object DelimitedParser {
  val DEFAULT_SEPARATOR = ','
  val DEFAULT_QUOTE_CHARACTER = '"'
  val DEFAULT_ESCAPE_CHARACTER = '"'
  val DEFAULT_SKIP_LINES = 0

  def apply(reader: Reader,
            separator: String = DEFAULT_SEPARATOR.toString,
            newline: String = "\n",
            bufSize: Int = 4 * 1024,
            quoteChar: Option[Char] = Some(DEFAULT_QUOTE_CHARACTER),
            escapeChar: Option[Char] = Some(DEFAULT_ESCAPE_CHARACTER),
            isEmptyStringNotNull: Boolean = true) =
    new DelimitedParser(reader, separator, newline, bufSize, quoteChar, escapeChar, isEmptyStringNotNull)
}

case class ParsingError(msg: String, pos: Position) extends Exception(msg) {
  override def getMessage = s"$msg at [$pos]"
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
