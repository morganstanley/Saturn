package com.ms.qaTools.tree.extraction

import scala.util.Try

import com.ms.qaTools.tree.TreeNode



class Extractor[T] {
  type IndexedTreeDataSet = Seq[Seq[(String, Index)]]
  def intersect(left: Seq[(String, Index)], right: Seq[(String, Index)]): Boolean =
    ! (left.map {_._2}.toSet & right.map {_._2}.toSet).isEmpty    
  def bucketize(results: IndexedTreeDataSet, unionPacks: Seq[IndexedTreeDataSet] = Nil): Seq[IndexedTreeDataSet] =
    results.foldLeft(unionPacks) {
      (s, p) =>
        val heads = s.zipWithIndex.map { u => (u._2, u._1.head) }
        heads.find { h => intersect(h._2, p) } match {
          case Some(pack) => s.updated(pack._1, s(pack._1) ++ Seq(p))
          case None       => s ++ Seq(Seq(p))
        }
    }    
  def extract(root: ColumnMapping[T], rootContext: TreeNode[T], detach: DetachStrategy[T]): IndexedTreeDataSet = {
    val value = root.mapping.map { m => (if (rootContext.hasValue) rootContext.valueAsString else null, m) }
    val detachVal = detach(root)
    root.children.foldLeft(Seq(value.toSeq)) {
      (ref, child) =>
        val nodes: Seq[TreeNode[T]] = synchronized {
          child.step resolve {
            if (detachVal) rootContext.detach else rootContext
          }
        }
        val results = nodes.par.map {t => extract(child, t, detach)}
        val right = results.foldLeft(Seq[IndexedTreeDataSet]()) {
          (refResult, childResult) =>  bucketize(childResult, refResult)
        }
        (ref +: right).reduceLeft { (r, n) => for (i <- r; j <- n) yield { i ++ j } } //cartesian product
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
