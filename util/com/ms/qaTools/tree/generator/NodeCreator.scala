package com.ms.qaTools.tree.generator

import com.ms.qaTools.io.DelimitedRow



trait NodeCreator[CreateContextType, +NodeType] {
  def extractColQueries: Set[UnresolvedColQuery]
  def isLocal: Boolean
  def create(data: DelimitedRow)(implicit colMap: Lookupable, context: ColContext, createContext: CreateContextType): NodeType
}

trait LeafNodeCreator[CreateContextType, NodeType] extends NodeCreator[CreateContextType, NodeType] {
}

trait InnerNodeCreator[CreateContextType, NodeType] extends NodeCreator[CreateContextType, NodeType] {
  type UnresolvedColQueries = Set[UnresolvedColQuery]
  def creators: Seq[NodeCreator[CreateContextType, NodeType]]
  def localCreators: Seq[NodeCreator[CreateContextType, NodeType]] = creators.filter(_.isLocal)
  def externalCreators: Seq[NodeCreator[CreateContextType, NodeType]] = creators.filter(!_.isLocal)

  val extractColQueries: UnresolvedColQueries = creators.foldLeft(Set[UnresolvedColQuery]())((s, c) => s union c.extractColQueries)
  def extractColQueries(creators: Seq[NodeCreator[CreateContextType, NodeType]]): UnresolvedColQueries = creators.foldLeft(Set[UnresolvedColQuery]())((s, c) => s union c.extractColQueries)

  def localColQueries: UnresolvedColQueries = extractColQueries(localCreators)
  def allLocalColQueries: UnresolvedColQueries = localColQueries.flatMap(_.hierarchy)
  def localIterators: UnresolvedColQueries = allLocalColQueries.filter(_.isIterator)

  def externalColQueries: UnresolvedColQueries = extractColQueries(externalCreators)

  def adjustedIterators(implicit colMap: Lookupable, context: ColContext): UnresolvedColQueries = {
    val allIterators =
      if (externalCreators.length <= 1) localIterators
      else {
        //Here we want to return the iterators that appears more than once.
        //If an iterator appears only once, it will iterate over the element itself
        val allColQueries = extractColQueries
        val externalColQuerySets: Seq[UnresolvedColQueries] = externalCreators.map { _.extractColQueries.flatMap(_.hierarchy).filter { _.isIterator } }
        val u: UnresolvedColQueries = externalColQuerySets.flatMap(x => x.toSeq).groupBy(x => x).filter(x => x._2.length > 1).map(x => x._2(0)).toSet
        val r = u union localIterators
        r
      }
    allIterators.filter { !context.iteratorIsIterating(_) }
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
