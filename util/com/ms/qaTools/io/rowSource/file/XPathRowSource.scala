package com.ms.qaTools.io.rowSource.file

import org.w3c.dom.Document
import org.w3c.dom.Node

import com.ms.qaTools.io.rowSource.PathRowSource
import com.ms.qaTools.tree.TreeNode
import com.ms.qaTools.tree.XmlNode
import com.ms.qaTools.tree.extraction.ColumnMapping
import com.ms.qaTools.tree.extraction.DetachStrategy
import com.ms.qaTools.xml.xpath.XPathMappingNodeTree

import javax.xml.namespace.NamespaceContext

class XPathRowSource(
  val mappingNode: ColumnMapping[TreeNode[Node]],
  val rowSource: Iterator[Document], 
  val pathMappings: Seq[(String, String)],
  val detachNodes: DetachStrategy[TreeNode[Node]])
  (implicit val nsContext: NamespaceContext) extends PathRowSource[TreeNode[Node], Document] {
  val nodeCreator: Node => XmlNode = {case n: Node => XmlNode(n)}
}

object XPathRowSource {
  def apply(xPathMappings: Seq[(String, String)],
            xmlRowSource: Iterator[Document],
            detachNodes: DetachStrategy[TreeNode[Node]] = DetachStrategy.default)
           (implicit nsContext: NamespaceContext): XPathRowSource =
    new XPathRowSource(XPathMappingNodeTree(xPathMappings), xmlRowSource, xPathMappings, detachNodes)

  @deprecated("Use `apply(Seq[(String, String)], Iterator[Document], DetachStrategy[Node])` instead", "")
  def apply(xPathMappings: Seq[(String, String)],
            xmlRowSource: Iterator[Document],
            detachNodes: Boolean)
           (implicit nsContext: NamespaceContext): XPathRowSource =
    apply(xPathMappings, xmlRowSource, DetachStrategy.fromBool[TreeNode[Node]](detachNodes))
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
