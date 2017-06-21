package com.ms.qaTools.tree.generator

trait NodeCreator[CreateContextType, +NodeType] {
  def extractColQueries: Set[UnresolvedColQuery]
  def isLocal: Boolean
  def create(data: Seq[String])(implicit colMap: Lookupable, context: ColContext, createContext: CreateContextType): NodeType
}

trait LeafNodeCreator[CreateContextType, NodeType] extends NodeCreator[CreateContextType, NodeType]

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
