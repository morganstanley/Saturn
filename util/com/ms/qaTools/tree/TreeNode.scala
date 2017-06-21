package com.ms.qaTools.tree

case class PathNode(name: String, idx: Option[Int] = None) {
  def toString(canonical: Boolean) = if (canonical) s"$name${idx.map {i => s"[$i]"}.getOrElse("")}" else name
}

trait AsTreeNode[A] {
  def value(x: A): Option[Any]
  def detach(x: A): A = x
}

object TreeNode {
  implicit def asTreeNode[A] = new AsTreeNode[TreeNode[A]] {
    def value(x: TreeNode[A]) = x.value
    override def detach(x: TreeNode[A]) = x.detach
  }
}

trait TreeNode[+NodeType] {
  def node: NodeType
  def path(canonical: Boolean): String
  def name: String
  def value: Option[Any]

  def valueAsString: String = value.map(_.toString).getOrElse("")
  def hasValue: Boolean = value.isDefined
  def children(filterOut: (NodeType) => Boolean = Function.const(false)): Seq[TreeNode[NodeType]]
  def detach: TreeNode[NodeType] = this
  def parent: Option[TreeNode[NodeType]] = None
}

case class TreeNodeProxy[+NodeType](treeNode: TreeNode[NodeType]) extends Proxy with TreeNode[NodeType] {
  def self = treeNode
  def node = treeNode.node
  def path(canonical: Boolean): String = treeNode.path(canonical)
  def name: String = treeNode.name
  def value: Option[Any] = treeNode.value
  override def hasValue: Boolean = treeNode.hasValue
  def children(filterOut: (NodeType) => Boolean = Function.const(false)) = treeNode.children(filterOut)
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
