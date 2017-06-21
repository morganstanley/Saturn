package com.ms.qaTools.io.rowSource

import scala.collection.AbstractIterator

import com.ms.qaTools.tree.AsTreeNode
import com.ms.qaTools.tree.extraction.ColumnIndex
import com.ms.qaTools.tree.extraction.ColumnMapping
import com.ms.qaTools.tree.extraction.DetachStrategy
import com.ms.qaTools.tree.extraction.Extractor
import com.ms.qaTools.tree.extraction.Index

abstract class PathRowSource[N: AsTreeNode, R] extends AbstractIterator[Seq[(String, Index)]] with ColumnDefinitions {
  val mappingNode: ColumnMapping[N]
  val extractor: Extractor[N] = new Extractor()
  val pathMappings: Seq[(String, String)]
  val rowSource: Iterator[R]
  val nodeCreator: R => N
  val detachNodes: DetachStrategy[N]

  private[this] val base: Seq[(String, Index)] = (0 until pathMappings.length).map(i => (null, ColumnIndex(i)))

  def createIterator(results: Seq[Seq[(String, Index)]]) =
    new AbstractIterator[Seq[(String, Index)]] {
      private[this] val i = results.iterator
      def hasNext = i.hasNext
      def next = {
        val row = base.toArray
        i.next.foreach(change => row(change._2.index) = change)
        row
      }
    }

  def colDefs: Seq[ColumnDefinition] = ColumnDefinition.fromColumnNames(pathMappings map { _._2 })

  private[this] var s: Iterator[Seq[(String, Index)]] = null

  protected def createFromNext(a: R): Iterator[Seq[(String, Index)]] =
    createIterator(extractor.extract(mappingNode, nodeCreator(a), detachNodes))

  def next = {
    while ((s == null || !s.hasNext) && rowSource.hasNext) s = createFromNext(rowSource.next)
    if (s.hasNext) s.next else null
  }

  def hasNext = if (s == null || !s.hasNext) rowSource.hasNext else s.hasNext

  def asDelimitedRowIterator: Iterator[Seq[String]] with ColumnDefinitions = {
    val parent = this
    new AbstractIterator[Seq[String]] with ColumnDefinitions {
      def colDefs = parent.colDefs
      def hasNext = parent.hasNext
      def next = parent.next.map { _._1 }
    }
  }

  def asIndexedRepresentationIterator(print: R => String = (r: R) => r.toString): Iterator[IndexedRepresentation[R]] = {
    val parent = this
    new AbstractIterator[IndexedRepresentation[R]] {
      def hasNext = parent.hasNext
      def next = {
        if (rowSource.hasNext) {
          val m = rowSource.next
          while (s == null || !s.hasNext) { s = createFromNext(m) }
          if (s.hasNext)
            new IndexedRepresentation[R] {
              val representation = m
              val indexed = s.next.map { _._1 }
              def colDefs = parent.colDefs
              def prettyPrint = print(representation)
            }
          else null
        } else null
      }
    }
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
