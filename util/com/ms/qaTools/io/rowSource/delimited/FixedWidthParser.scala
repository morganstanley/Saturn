package com.ms.qaTools.io.rowSource.delimited

import java.io.Reader

import scala.annotation.tailrec
import scala.collection.JavaConversions._
import scala.util.Failure
import scala.util.Success
import scala.util.Try

import com.ms.qaTools.io.rowSource.internal.StreamingReader

import groovy.lang.Binding
import groovy.lang.GroovyShell

class FixedWidthParser(
  reader: Reader,
  colDefs: Seq[FixedWidthColDef],
  bufSize: Int,
  skipLine: Int) extends Parser {

  val newline = '\n'
  val streamingReader = new StreamingReader(reader, bufSize)

  private def parseCell(buffer: StreamingReader, colDef: FixedWidthColDef, cellAccu: Seq[String]): Option[String] = {
    val validColDef = colDef.caseCondition match {
      case Some(c) => {
        val binding = new Binding
        binding.setVariable("row", cellAccu)
        val evalTry = Try {
          new GroovyShell(binding).evaluate(c) match {
            case b: java.lang.Boolean => Boolean2boolean(b)
            case _                    => throw new Exception(s"Error evaluating condition: '${c}'.")
          }
        }
        evalTry match {
          case Success(b) => b
          case Failure(t) => throw t
        }
      }
      case None => true
    }
    lazy val cell = buffer.first(colDef.width)
    if (!validColDef)
      None
    else if (cell.isEmpty || cell.contains(newline))
      throw new Exception(s"Parse Error: Row width less than the width of column definitions. At Column Definition '${colDef.name}'.")
    else {
      buffer.drop(colDef.width)
      Some(cell.trim)
    }
  }

  @tailrec
  private def parseLine(buffer: StreamingReader, colDefs: Seq[FixedWidthColDef], accu: Seq[Option[String]] = Seq()): Option[Seq[Option[String]]] = {
    def processEnd0(onEmpty: Option[Seq[Option[String]]]) =
      if (accu.isEmpty) onEmpty
      else if (accu.forall { _.isEmpty }) Some(None +: accu)
      else Some(Seq.fill[Option[String]](colDefs.size)(None) ++ accu)
    if (buffer.atEnd) processEnd0(None)
    else {
      buffer.first match {
        case `newline` => {
          buffer.drop
          processEnd0(Some(None +: accu))
        }
        case _ => {
          if (colDefs.isEmpty)
            throw new Exception(s"Parse Error: Row width is greater than the width of column definitions. Remaining characters '${buffer.dropUntil(newline, false)}'.")
          parseLine(buffer, colDefs.tail, parseCell(buffer, colDefs.head, accu.map(_.getOrElse("")).reverse) +: accu)
        }
      }
    }
  }

  def readNext(): Seq[Option[String]] =
    parseLine(streamingReader, colDefs) match {
      case Some(line: Seq[Option[String]]) => line.reverse
      case None                            => null
    }

}

object FixedWidthParser {
  def apply(reader: Reader,
            colDefs: Seq[FixedWidthColDef],
            bufSize: Int = 4 * 1024,
            skipLine: Int = 0): FixedWidthParser = new FixedWidthParser(reader, colDefs, bufSize, skipLine)
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
