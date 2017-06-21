package com.ms.qaTools.tree.extraction

import scala.collection.mutable
import scala.collection.parallel.ExecutionContextTaskSupport
import scala.concurrent.ExecutionContext

import com.ms.qaTools.tree.AsTreeNode

class Extractor[T: AsTreeNode](implicit ec: ExecutionContext = scala.concurrent.ExecutionContext.Implicits.global) {
  val taskSupport = new ExecutionContextTaskSupport(ec)

  type IndexedTreeDataSet = Seq[Vector[(String, Index)]]

  protected def bucketize(dataSets: Seq[IndexedTreeDataSet]): Seq[IndexedTreeDataSet] = {
    def intersect: Boolean = {
      val dataSetByIndex = mutable.Map.empty[Index, IndexedTreeDataSet]
      for (d <- dataSets; rows <- d; (_, i) <- rows)
        dataSetByIndex.get(i) match {
          case Some(old) => if (old != d) return true
          case None      => dataSetByIndex(i) = d
        }
      false
    }
    if (intersect) dataSets.iterator.flatten.filter(_.nonEmpty).toBuffer :: Nil else dataSets
  }

  def extract(root: ColumnMapping[T], rootContext: T, detach: DetachStrategy[T]): IndexedTreeDataSet = {
    val value = root.mapping.map { m => (implicitly[AsTreeNode[T]].value(rootContext).map(_.toString).orNull, m) }
    val detachVal = detach(root)
    root.children.foldLeft(Seq(value.toVector)) {
      (ref, child) =>
        val nodes = synchronized {
          child.step resolve {
            if (detachVal) implicitly[AsTreeNode[T]].detach(rootContext) else rootContext
          }
        }
        val results = {
          val par = nodes.par
          par.tasksupport = taskSupport
          par.map(extract(child, _, detach))
        }
        val right = bucketize(results.seq)
        right.foldLeft(ref) { (r, n) => for (i <- r; j <- n) yield i ++ j } //cartesian product
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
