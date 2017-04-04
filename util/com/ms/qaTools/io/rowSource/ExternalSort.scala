package com.ms.qaTools.io.rowSource

import java.io.{File, FileReader, FileWriter}
import java.io.Closeable

import scala.collection.mutable.PriorityQueue

import com.ms.qaTools.io.rowSource.file.CsvRowSource
import com.ms.qaTools.io.rowWriter.file.CsvRowWriter

abstract class ExternalSort[A: Ordering](unsorted: Iterator[A], config: ExternalSort.Config) extends Iterator[A] {
  import ExternalSort.Chunk

  protected def moveToExternal(xs: Iterator[A]): Chunk[A]

  def hasNext = chunks.nonEmpty
  def next = {
    val xs = chunks.dequeue
    val x = xs.next
    if (xs.hasNext) chunks.enqueue(xs)
    x
  }

  protected val chunks: PriorityQueue[Chunk[A]] = {
    implicit val chunkOrdering = new Ordering[Chunk[A]] {
      val ord = implicitly[Ordering[A]]
      def compare(xs: Chunk[A], ys: Chunk[A]) = -ord.compare(xs.head, ys.head)
    }
    val cs = PriorityQueue[Chunk[A]]()
    unsorted.grouped(config.chunkSize).foreach(xs => cs.enqueue(moveToExternal(xs.sorted.iterator)))
    cs
  }
}

object ExternalSort {
  import scala.language.implicitConversions

  case class Config(chunkSize: Int = 10000)

  abstract class Chunk[A](iterator: Iterator[A]) extends BufferedIterator[A] with Closeable {
    val bufferedIterator = iterator.buffered
    def hasNext          = bufferedIterator.hasNext
    def head             = bufferedIterator.head

    def next = {
      val x = bufferedIterator.next
      if (!hasNext) close()
      x
    }
  }

  implicit def SeqStringRowSourceToExternalSortable(unsorted: Iterator[Seq[String]] with ColumnDefinitions) =
    new ExternalSortableViaCsv[Seq[String]] {
      def next    = unsorted.next
      def hasNext = unsorted.hasNext
      def colDefs = unsorted.colDefs

      def toSeqStringIterator(xss: Iterator[Seq[String]]) = xss
      def fromSeqStringIterator(yss: Iterator[Seq[String]]) = yss
    }
}

trait ExternalSortable[A] extends Iterator[A] with ColumnDefinitions {
  def sortExternal(implicit ord: Ordering[A]): Iterator[A] with ColumnDefinitions
}

trait ExternalSortableViaCsv[A] extends ExternalSortable[A] { unsorted =>
  def toSeqStringIterator(xs: Iterator[A]): Iterator[Seq[String]]
  def fromSeqStringIterator(yss: Iterator[Seq[String]]): Iterator[A]

  def sortExternal(implicit ord: Ordering[A]) =
    new ExternalSort[A](unsorted, ExternalSort.Config()) with ColumnDefinitions {
      def colDefs = unsorted.colDefs

      protected def moveToExternal(xs: Iterator[A]) = {
        val f = File.createTempFile("externalSort", ".csv")
        f.deleteOnExit()
        val w = CsvRowWriter(new FileWriter(f))
        w.write(toSeqStringIterator(xs))
        w.close()
        val r = new FileReader(f)
        new ExternalSort.Chunk[A](fromSeqStringIterator(CsvRowSource(r, headerless = true))) {
          def close() = r.close()
        }
      }
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
