package com.ms.qaTools.io.rowSource.internal

import java.io.Closeable
import java.io.{Reader => JReader}
import scala.annotation.{switch, tailrec}
import scala.util.matching.Regex
import scala.util.parsing.input.Position

/**
 * A small stream-like wrapper class, providing basic functionality like head and drop.
 * Largely inspired from scala / src / library / scala / util / parsing / input / PagedSeqReader.scala
 */

class StreamingReader(reader: JReader, bufSize: Int = 4 * 1024) extends Closeable {
  private[this] val iterator = Iterator.continually(readNext).takeWhile(! _.isEmpty)
  private[this] var sbBuffer: StringBuilder = 
    new StringBuilder(bufSize).appendAll(if (iterator.hasNext) iterator.next else Array())
  private def readNext(): Array[Char] = {
    val a: Array[Char] = Array.fill(bufSize)(null.asInstanceOf[Char])
    val read = reader.read(a)
    a.slice(0, read)
  }
  
  def atEnd: Boolean = !ensure(1)

  def removeWhitespace = while (!atEnd && first.toInt != 0 && first.isWhitespace) { drop }

  def first: Char = if (ensure(1)) sbBuffer(offset) else StreamingReader.NUL

  def first(i: Int): String = {
    if (i <= 0) ""
    else if (ensure(i)) sbBuffer.substring(offset, offset + i)
    else ""
  }
  
  def drop: Char = {
    val c = first
    if (sbBuffer.length > offset) count(c)
    c
  }

  def drop(i: Int): String = {
    val s = first(i)
    s foreach count
    s
  }
  
  def dropUntil(c: Char, include: Boolean): String = dropUntil(c.toString, include)  
  @tailrec final def dropUntil(s: String, include: Boolean): String = {
    val i = sbBuffer.indexOf(s, offset) - offset
    if (i < 0) {
      if (iterator.hasNext) {
        sbBuffer.appendAll(iterator.next)
        dropUntil(s, include)
      }
      else ""
    }
    else drop(if (include) i + 1 else i)
  }

  // use this one sparsely, slows down a lot
  @tailrec final def dropUntilRegex(r: Regex, include: Boolean = false): String = {
    r.findFirstMatchIn(sbBuffer.substring(offset)) match {
      case Some(m) => {
        val until = if (!include) m.start else m.end
        drop(until)
      }
      case None => {
        if (iterator.hasNext) {
          sbBuffer.appendAll(iterator.next)
          dropUntilRegex(r)
        } 
        else ""        
      }
    }
  }

  def headIs(s: String): Boolean = {
    if (!ensure(s.length)) return false
    var i = 0
    while (i < s.length) {
      if (s(i) != sbBuffer(offset + i)) return false
      i += 1
    }
    true
  }
  
  def headIs(c: Char) = first == c

  def pushback(c: Char) = sbBuffer.insert(0, c)
  
  def close = reader.close

  def pos: Position = new Position {
    val line   = lineNum
    val column = columnNum

    protected val lineContents = {
      val lineStart0 = offset - column + 1
      val lineStart  = if (lineStart0 >= 0) lineStart0 else 0
      val padding    = " " * (lineStart - lineStart0)
      val line       = sbBuffer.substring(lineStart).takeWhile(_ != '\n')
      padding + line
    }
  }

  // WARNING: do not change these values directly!  Instead call `count' and `ensure' below
  protected var lineNum   = 1
  protected var columnNum = 1
  protected var offset    = 0

  @inline protected def count(c: Char): Unit = {
    offset += 1
    (c: @switch) match {
      case '\n' => lineNum += 1; columnNum = 1
      case _    => columnNum += 1
    }
  }

  @tailrec private def ensure(i: Int): Boolean =
    if (sbBuffer.length >= offset + i) true
    else if (!iterator.hasNext) false
    else {
      if (offset + i > bufSize) {
        // This is very expensive (copying all the rest to a new array), so we do not want to do this very often
        sbBuffer.delete(0, offset)
        offset = 0
      }
      sbBuffer.appendAll(iterator.next)
      ensure(i)
    }
}

object StreamingReader {val NUL = 0.toChar}
/*
COPYRIGHT NOTICE AND DISCLAIMER
Copyright (c) 2009-2016, Contributor

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License, version 3 for more details.

You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
*/
