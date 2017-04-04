package com.ms.qaTools.io.rowSource

import scala.annotation.tailrec
import com.ms.qaTools.io.DelimitedRow
import com.ms.qaTools.tree.TreeNode
import com.ms.qaTools.tree.extraction.ColumnIndex
import com.ms.qaTools.tree.extraction.ColumnMapping
import com.ms.qaTools.tree.extraction.DetachStrategy
import com.ms.qaTools.tree.extraction.Extractor
import com.ms.qaTools.tree.extraction.Index

trait PathRowSource[N,R] extends Iterator[Seq[(String, Index)]] with ColumnDefinitions {
  val mappingNode: ColumnMapping[N]
  val extractor: Extractor[N] = new Extractor()
  val pathMappings: Seq[(String, String)]
  val rowSource: Iterator[R]
  val nodeCreator: R => TreeNode[N]
  val detachNodes: DetachStrategy[N]
  
  def getBaseLine: Seq[(String, Index)] = pathMappings.zipWithIndex.map {p => (null,ColumnIndex(p._2))}
  
  @tailrec 
  final def update(row: Seq[(String, Index)], base: Seq[(String, Index)]): Seq[(String, Index)] =
    if (row.isEmpty) 
      base 
    else 
      update(row.tail,base.updated(row.head._2.index, row.head))
  
  def createIterator(results: Seq[Seq[(String, Index)]]) = 
    new Iterator[Seq[(String, Index)]] {
      val base = getBaseLine
      val i = results.iterator     
      def hasNext = i.hasNext
      def next = update(i.next,base)
    }
  
  def colDefs: Seq[ColumnDefinition] = ColumnDefinition.fromColumnNames(pathMappings map { _._2 })
  
  private[this] var s: Iterator[Seq[(String, Index)]] = null

  protected def createFromNext(a: R): Iterator[Seq[(String, Index)]] =
    createIterator(extractor.extract(mappingNode, nodeCreator(a), detachNodes))

  def next(): Seq[(String, Index)] = {
    while ((s == null || !s.hasNext) && rowSource.hasNext) s = createFromNext(rowSource.next)
    if (s.hasNext) s.next else null
  }

  def hasNext() = if (s == null || !s.hasNext) rowSource.hasNext else s.hasNext

  def asDelimitedRowIterator: Iterator[DelimitedRow] with ColumnDefinitions = {
    val parent = this
    new Iterator[DelimitedRow] with ColumnDefinitions {
      def colDefs = parent.colDefs
      def hasNext = parent.hasNext
      def next = parent.next.map { _._1 }
    }
  }

  def asIndexedRepresentationIterator: Iterator[IndexedRepresentation[R]] = {
    val parent = this
    new Iterator[IndexedRepresentation[R]] {
      def hasNext = parent.hasNext()
      def next = {
        if (rowSource.hasNext) {
          val m = rowSource.next
          while (s == null || !s.hasNext) { s = createFromNext(m) }
          if (s.hasNext)
            new IndexedRepresentation[R] {
              val representation = m
              val indexed = s.next.map { _._1 }
              def colDefs = parent.colDefs
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
