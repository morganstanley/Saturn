package com.ms.qaTools.xml.xpath

import org.w3c.dom.Document
import org.w3c.dom.Node

import com.ms.qaTools.conversions.XPathConversions.xPathToNodes
import com.ms.qaTools.conversions.XPathConversions.xPathToString
import com.ms.qaTools.xml.NamespaceContextImpl

import javax.xml.namespace.NamespaceContext
import quickfix.DataDictionary

/**
 * FixPath -> XPath
 */

trait XPathAware {
  val dictionary: DataDictionary
  val fixPath: String

  def asXPath(messageType: String): XPath = {
    val fixPathParts = fixPath.split("/").filterNot(_.isEmpty()).toList
    require(fixPathParts.size > 0, "No FixPath to parse (empty).")
    val first =
      if (fixPathParts.head.indexOf("[") >= 0) fixPathParts.head.take(fixPathParts.head.indexOf("[")).toInt
      else fixPathParts.head.toInt
    val section = if (dictionary.isHeaderField(first)) "header" else if (dictionary.isTrailerField(first)) "trailer" else "body"
    val stack: List[String] = List(section, "message")
    val hasPosition = """(.*)(\[[0-9]+\])""".r
    def descendFixParts0(fixPathParts: List[String], stack: List[String]): List[String] = {
      if (fixPathParts.isEmpty) stack
      else {
        val f = fixPathParts.head
        val appendedStack = hasPosition findFirstIn f match {
          case Some(fieldWithPosition) => {
            val hasPosition(tag, pos) = fieldWithPosition
            if (dictionary.isGroup(messageType, tag.toInt))
              ("group" + pos) :: "groups[@tag = \"%s\"]".format(tag) :: stack
            else
              ("field[@tag = \"%s\"]".format(tag) + pos) :: stack
          }
          case None =>
            if (dictionary.isGroup(messageType, f.toInt))
              "groups[@tag = \"%s\"]".format(f) :: stack
            else
              "field[@tag = \"%s\"]".format(f) :: stack
        }
        descendFixParts0(fixPathParts.tail, appendedStack)
      }
    }
    XPath(descendFixParts0(fixPathParts, stack).reverse.mkString("/", "/", ""))(NamespaceContextImpl())
  }
}

trait FixPathAware {
  val xPathString: String
  implicit val nsContext: NamespaceContext = NamespaceContextImpl()

  def asFixPath(node: Node)(implicit dictionary: DataDictionary): FixPath = {
    // ideally you don't split on "/" but rather use the parser/compiler. We know the xPaths from FIX are well behaved though.
    val documentElement = node match { case d: Document => d.getDocumentElement() case _ => node.getOwnerDocument().getDocumentElement() }
    val parts: Seq[String] = xPathString.split("/").filterNot(_.isEmpty())
    def descendParts0(xPathParts: List[String], node: Node, stack: List[String]): List[String] = {
      if (xPathParts.isEmpty) stack
      else {
        val x = xPathParts.head
        val nodes: Seq[Node] = XPath(x, node)
        require(nodes.size == 1, "The xPath '%s' isn't unique.".format(xPathString))
        val n: Node = nodes(0)
        n.getNodeName() match {
          case "field" => XPath("@tag", n) :: stack
          case "groups" => descendParts0(xPathParts.tail, n, XPath("@tag", n) :: stack)
          case "group" => {
            val groupRegex = """^group(\[[0-9]+\])""".r
            groupRegex findFirstIn x match {
              case Some(groupRegex(p)) => descendParts0(xPathParts.tail, n, stack.head + p :: stack.tail)
              case None => descendParts0(xPathParts.tail, n, stack.head + "[1]" :: stack.tail)
            }
          }
          case _ => descendParts0(xPathParts.tail, n, stack) //header,body,trailer
        }
      }
    }
    val fixPath = descendParts0(parts.tail.toList, documentElement, Nil).reverse.mkString("", "/", "")
    new FixPath(fixPath) with XPathAware
  }
}

class FixPath(val fixPath: String)(implicit val dictionary: DataDictionary) {
  override def toString() = fixPath
}

object XPathAwareFixPath {
  def apply(path: String)(implicit dictionary: DataDictionary): FixPath with XPathAware =
    new FixPath(path) with XPathAware
}

object FixPathAwareXPath {
  def apply(path: String)(implicit nsContext: NamespaceContext): XPath with FixPathAware =
    new XPath(path) with FixPathAware
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
