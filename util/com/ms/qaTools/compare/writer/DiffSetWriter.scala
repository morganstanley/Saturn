package com.ms.qaTools.compare.writer

import com.ms.qaTools.compare.AbstractDiff
import com.ms.qaTools.compare.DiffCounter
import com.ms.qaTools.compare.Different
import com.ms.qaTools.compare.Identical
import com.ms.qaTools.compare.InLeftOnly
import com.ms.qaTools.compare.InRightOnly
import com.ms.qaTools.compare.ValidationFailed
import com.ms.qaTools.compare.ValidationPassed
import com.ms.qaTools.io.Writer

sealed trait DataSet
case object LEFT extends DataSet
case object RIGHT extends DataSet
case object BOTH extends DataSet

trait DiffSetWriter extends Writer[Iterator[AbstractDiff]] {
  def writeDiff(diff: AbstractDiff): Unit
  def writeSummary(counter: DiffCounter): Unit
  def writeNotes(notes: Seq[String] = Seq()): Unit

  def getStatus(d: AbstractDiff) =
    d match {
      case i: InLeftOnly[_]        => "IL"
      case r: InRightOnly[_]       => "IR"
      case d: Different[_]         => "D"
      case i: Identical[_]         => "I"
      case vp: ValidationPassed[_] => "VP"
      case vf: ValidationFailed[_] => "VF"
    }

  override def write(source: Iterator[AbstractDiff]): Int =
    source.foldLeft(0)((count, diff) => {writeDiff(diff); count + 1})
}

class DiffSetWriters(writers: Seq[DiffSetWriter]) extends DiffSetWriter {
  def writeDiff(diff: AbstractDiff)      = writers.foreach(_.writeDiff(diff))
  def writeSummary(counter: DiffCounter) = writers.foreach(_.writeSummary(counter))
  def writeNotes(notes: Seq[String])     = writers.foreach(_.writeNotes(notes))
  override def close()                   = writers.foreach(_.close())
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
