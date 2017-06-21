package com.ms.qaTools.xml

import scala.collection.mutable

import org.w3c.dom.Attr
import org.w3c.dom.CDATASection
import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.Node
import org.w3c.dom.Text

import javax.xml.namespace.NamespaceContext
import net.sf.saxon.dom.NodeOverNodeInfo
import net.sf.saxon.om.TreeInfo

object PathCache {
  def apply(node: Node, canonical: Boolean)(implicit nsContext: NamespaceContext): String = node match {
    case e: Element => get(e, canonical)
    case a: Attr => get(a.getOwnerElement, canonical) + "/@" + withPrefix(a)
    case other =>
      val parent = get(other.getParentNode.asInstanceOf[Element], canonical)
      other match {
        case c: CDATASection => parent + "/#cdata:" + c.getNodeValue
        case t: Text         => parent + "/#text:" + t.getWholeText
      }
  }

  private def get(node: Element, canonical: Boolean)(implicit nsContext: NamespaceContext): String = {
    node match {
      case node: NodeOverNodeInfo =>
        val paths = getPaths(node, node.getUnderlyingNodeInfo.getTreeInfo)
        if (canonical) paths._2 else paths._1
      case node => getPath(node, canonical)
    }
  }

  private def userDataKey = getClass.getName

  private def getPaths(node: Element, tree: TreeInfo)(implicit nsContext: NamespaceContext): (String, String) = {
    tree.synchronized {
      tree.getUserData(userDataKey) match {
        case null =>
          val cache = mutable.Map.empty[Node, (String, String)]
          computePaths(node.getOwnerDocument, ("", ""), cache)
          tree.setUserData(userDataKey, cache)
          cache
        case cache => cache.asInstanceOf[scala.collection.Map[Node, (String, String)]]
      }
    }.apply(node)
  }

  private def computePaths(node: Node, path: (String, String), cache: mutable.Map[Node, (String, String)])
                          (implicit nsContext: NamespaceContext): Unit = {
    val elementsByName = mutable.Map.empty[String, mutable.ArrayBuffer[Element]]
    val children = node.getChildNodes
    var i = 0
    while (i < children.getLength) {
      children.item(i) match {
        case e: Element => elementsByName.getOrElseUpdate(e.getNodeName, mutable.ArrayBuffer.empty) += e
        case _ =>
      }
      i += 1
    }
    for ((name, es) <- elementsByName) {
      val single = es.lengthCompare(1) == 0
      i = 0
      while (i < es.length) {
        val e = es(i)
        val p1 = "/" + withPrefix(e)
        val p2 = if (single) p1 else p1 + s"[${i + 1}]"
        val newPath = (path._1 + p1, path._2 + p2)
        cache(e) = newPath
        computePaths(e, newPath, cache)
        i += 1
      }
    }
  }

  private def count(n: Node)(f: Node => Node): Int =
    Iterator.iterate(n)(f).takeWhile(_ != null).filter(_.getNodeName == n.getNodeName).size - 1

  private def getPath(node: Element, canonical: Boolean)(implicit nsContext: NamespaceContext): String = {
    val path = new StringBuilder
    val nodes = Iterator.iterate[Node](node)(_.getParentNode).takeWhile(n => n != null && !n.isInstanceOf[Document]).toBuffer
    nodes.reverseIterator.foreach { n =>
      path += '/' ++= withPrefix(n)
      if (canonical) {
        val prev = count(n)(_.getPreviousSibling)
        if (prev > 0 || count(n)(_.getNextSibling) > 0) path += '[' ++= (prev + 1).toString += ']'
      }
    }
    path.result()
  }

  private def withPrefix(node: Node)(implicit nsContext: NamespaceContext): String = node.getNamespaceURI match {
    case null => getLocalName(node)
    case uri  => nsContext.getPrefix(uri) + ":" + getLocalName(node)
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
