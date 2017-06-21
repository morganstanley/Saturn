package com.ms.qaTools.toolkit.pulsar
import com.ms.qaTools.generated.pulsar.Direction
import com.ms.qaTools.io.rowSource.Utils.StringUtil
import com.ms.qaTools.io.rowSource.Utils.W3CDocumentUtil
import com.ms.qaTools.io.rowSource.Utils.W3CNodeUtil
import com.ms.qaTools.tree.XmlNode
import com.ms.qaTools.tree.mappers.XmlNodeDeleteMapper
import com.ms.qaTools.tree.validator.XPathNodeLookup
import com.ms.qaTools.xml.NamespaceContextImpl
import com.ms.qaTools.xml.XmlManipulator
import scala.Iterator

sealed trait Operation {
  def apply(m: Message): Option[Message]
  def apply(source: Message, target: Message): Option[Message]
}

object DropOperation extends Operation {
  def apply(m: Message) = None
  def apply(request: Message, response: Message) = None
}

class XmlReplaceOperation (sourceDir: Direction, targetDir: Direction, from: String, to: String) extends Operation { // TODO add namespace back?
  def apply(m: Message) = None
  def apply(request: Message, response: Message) = {
    def r(request: Message, response: Message): Option[Message] = {
      implicit val NamespaceContext = NamespaceContextImpl(request.m.toDocument)
      val fromNodes = XmlNode(request.m.toDocument)
      val toNodes = XmlNode(response.m.toDocument)
      
      val replaceText = XPathNodeLookup(from)(fromNodes.nsContext).getNodes(fromNodes).head.node.getTextContent
      XPathNodeLookup(to)(toNodes.nsContext).getNodes(toNodes).foreach { n =>
        n.node.setTextContent(replaceText)
      }
      
      Option(TextMessage(toNodes.node.toDocument.toXmlString))
    }
    
    sourceDir match {
      case Direction.REQUEST =>
         targetDir match { 
          case Direction.REQUEST =>
            r(request, request)
          case Direction.RESPONSE =>
            r(request, response)
          case default => 
            r(request, response)
        }
      case Direction.RESPONSE =>
        targetDir match { 
          case Direction.REQUEST =>
            r(response, request)
          case Direction.RESPONSE =>
            r(response, response)
          case default => 
            r(response, request)
        }
      case default => 
        r(response, response)
    }
  }
}

class XmlDeleteOperation(xpaths: Seq[String]) extends Operation { // TODO add namespace back
  def apply(m: Message) =
    Some(TextMessage(XmlManipulator(Iterator(m.m.toDocument), Seq(XmlNodeDeleteMapper(xpaths))).next.toDocument.toXmlString))
  def apply(request: Message, response: Message) = None
}

class Action (event: Event, operation: Operation) {
  def apply(m: Message, e: Event) =
    if (e == event) operation(m) else Some(m)
  def apply(request: Message, response: Message, e: Event) =
    if (e == event) operation(request, response) else Some(response)
}

object Action {
  def apply(event: Event, operation: Operation) =
    new Action(event, operation)
}/*
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
