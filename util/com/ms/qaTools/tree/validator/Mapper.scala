package com.ms.qaTools.tree.validator

import com.ms.qaTools.tree._

trait Mapper[NodeType] {
  def mapNodes(expectedLookup: TreeNode[NodeType], actualLookup: TreeNode[NodeType]): MappedNodes[NodeType]
}

case class ImplicitMapper[NodeType](lookup: Lookup[NodeType]) extends Mapper[NodeType] {
  def mapNodes(expected: TreeNode[NodeType], actual: TreeNode[NodeType]): MappedNodes[NodeType] = {
    val expectedNodes = lookup.getNodes(expected)
    val actualNodes = lookup.getNodes(actual)
    MappedNodes(expectedNodes, actualNodes)
  }
}

case class NameMapper[NodeType](expectedLookup: Lookup[NodeType], actualLookup: Lookup[NodeType]) extends Mapper[NodeType] {
  def mapNodes(expected: TreeNode[NodeType], actual: TreeNode[NodeType]): MappedNodes[NodeType] = {
    val expectedNodes = expectedLookup.getNodes(expected)
    val actualNodes = actualLookup.getNodes(actual)
    MappedNodes(expectedNodes, actualNodes)
  }
}

case class MappedNodes[NodeType](
  val expected: Seq[TreeNode[NodeType]] = Nil,
  val actual: Seq[TreeNode[NodeType]] = Nil,
  val skippedExpected: Seq[TreeNode[NodeType]] = Nil,
  val skippedActual: Seq[TreeNode[NodeType]] = Nil)
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
