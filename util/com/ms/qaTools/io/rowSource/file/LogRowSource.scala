package com.ms.qaTools.io.rowSource.file

import java.io.PushbackReader
import java.io.Reader
import scala.annotation.tailrec
import scala.util.matching.Regex
import scala.collection.mutable.StringBuilder



class LogRowSource(
  reader: Reader,
  val begin: Regex,
  val end: Option[Regex],
  val bufferSize: Int,
  val processIncompleteEntries: Boolean = true)
  extends Iterator[String] {

  private[this] var cached: StringBuilder = new StringBuilder()
  private var currentBlock: Option[String] = None

  def hasNext = currentBlock.orElse{currentBlock = readNextBuffer(); currentBlock}.isDefined

  def readIntoStringBuilder: StringBuilder = {
    val buffer: Array[Char] = new Array(bufferSize)
    val (fromCache, newCache) = cached.splitAt(bufferSize)
    cached = newCache
    val fromReader =
      if (fromCache.size < bufferSize) {
        val charsRead = reader.read(buffer, 0, bufferSize - fromCache.size)
        if (charsRead > -1) new String(buffer.take(charsRead)) else ""
      }
      else ""
    fromCache.append(fromReader)
  }

  @tailrec private def readNextBuffer(history: StringBuilder = new StringBuilder(), beginString: Option[String] = None, accu: StringBuilder = new StringBuilder()): Option[String] = {
    beginString match {
      case None => {
        val read = readIntoStringBuilder
        if (read.size <= 0) None
        else {
          val context = history.append(read)
          begin.findFirstMatchIn(context) match {
            case Some(m) => readNextBuffer(context.drop(m.end), Option(m.matched), accu)
            case _       => readNextBuffer(context, beginString, accu)
          }
        }
      }
      case Some(b) => {
        val context = accu.append(history)
        end.getOrElse(begin).findFirstMatchIn(context.mkString) match {
          case Some(m) => {
            val fromWhere = if (end.isDefined) m.end else m.start
            cached = context.drop(fromWhere)
            Option(b + context.take(fromWhere))
          }
          case None => {
            val nextBuffer = readIntoStringBuilder
            if (nextBuffer.size <= 0)
              if (processIncompleteEntries) Option(b + context) else None
            else
              readNextBuffer(nextBuffer, beginString, context)
          }
        }
      }
    }
  }

  def next = {
    val block = currentBlock
    currentBlock = None
    block.getOrElse(throw new Error("Internal error: the current log block was empty."))
  }
}

object LogRowSource {
  val defaultBufferSize: Int = 4 * 1024
  val multiLinePattern = "(?s)"

  def apply(
    reader: Reader,
    beginString: String,
    endString: Option[String] = None,
    bufferSize: Int = defaultBufferSize,
    processIncomplete: Boolean = true,
    isMultiLine: Boolean = true): LogRowSource = {

    val begin: String = if (isMultiLine && !beginString.startsWith(multiLinePattern)) multiLinePattern + beginString else beginString
    val end: Option[String] = endString.map { e => if (isMultiLine && !e.startsWith(multiLinePattern)) s"${multiLinePattern}${e}" else e }
    new LogRowSource(
      reader,
      begin.r,
      end.map { _.r },
      bufferSize = bufferSize,
      processIncompleteEntries = processIncomplete)
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
