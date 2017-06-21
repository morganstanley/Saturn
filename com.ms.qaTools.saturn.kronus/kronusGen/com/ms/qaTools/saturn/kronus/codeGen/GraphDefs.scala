package com.ms.qaTools.saturn.kronus.codeGen

import scala.collection.JavaConversions._

import org.eclipse.emf.ecore.util.EcoreUtil

import com.ms.qaTools.saturn.kronus._
import com.ms.qaTools.saturn.kronus.codeGen.Implicits._
import com.ms.qaTools.saturn.kronus.impl.ReferenceableDefsImpl
import com.ms.qaTools.saturn.kronus.impl.ValueImpl

object GraphDefs {
  def apply(edges:Seq[Assignment]):Set[GraphDef] = {
    edges.zipWithIndex.foldLeft[Set[GraphDef]](Set.empty) {
      case (graphs, (edge, i)) =>
        val (graphsConnected, graphsNotConnected) =
          graphs.partition(g => g.containsNode(edge.getLhs) || g.containsNode(edge.getRhs))
        val newGraph = graphsConnected.foldLeft(GraphDef("__GRAPH" + i, Set.empty, Set.empty))(_ ++ _).addEdge(edge)
        graphsNotConnected + newGraph
    }
  }
}

case class GraphRef(ref:GraphDef, sink:ValDef) extends ValueImpl

object CreateValDef {
  def apply(name:String, value:Expression = null):ValDef = {
    val vd = KronusFactory.eINSTANCE.createValDef()
    vd.setName(name)
    vd.setValue(value)
    vd
  }
}

case class GraphDef(name:String, nodes:Set[ValRef], edges:Set[Assignment]) extends ReferenceableDefsImpl with AbstractDef {
  lazy val resolvedNodes = nodes.map(_.getRef).collect { case vd: ValDef => vd }
  lazy val sinkDefs: Seq[ValDef] = resolvedNodes.filter(_.isSinkDef).toSeq

  def containsNode(n:ValDef):Boolean = resolvedNodes.contains(n)
  def ++(that:GraphDef):GraphDef = GraphDef(this.name, this.nodes ++ that.nodes, this.edges ++ that.edges)
  def addEdge(e:Assignment):GraphDef = GraphDef(this.name,
                                                nodes + KronusFactory.eINSTANCE.newValRef(e.getLhs)
                                                      + KronusFactory.eINSTANCE.newValRef(e.getRhs),
                                                edges + e)
  
  override def eAllContents() = {
    val i = nodes.iterator
    val eContents = new org.eclipse.emf.common.util.TreeIterator[org.eclipse.emf.ecore.EObject]() {  
      def next = i.next
      def hasNext = i.hasNext
      def prune = Unit
    }
    eContents
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
