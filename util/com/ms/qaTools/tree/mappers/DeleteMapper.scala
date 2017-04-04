package com.ms.qaTools.tree.mappers

import com.ms.qaTools.tree.XmlNode
import com.ms.qaTools.tree.mappers._
import com.ms.qaTools.tree.validator.XPathNodeLookup
import org.w3c.dom.Attr
import org.slf4j.{ LoggerFactory }



case class XmlNodeDeleteMapper(xPaths: Seq[String])
  extends XmlNodeMapper  {
  val logger = LoggerFactory.getLogger(getClass)
  override def apply(optionNode: Option[XmlNode]): Option[XmlNode] = {
    optionNode match {
      case None => optionNode
      case Some(node) => {
        val ownerDocument = node.node.getOwnerDocument
        xPaths.foreach(xPath => {
          val xPathLookup = XPathNodeLookup(xPath)(node.nsContext)
          logger.debug("XmlNodeDeleteMapper: deleting nodes for XPath  " + xPath)
          val found = xPathLookup.getNodes(node)
          xPathLookup.getNodes(node).foreach(nodeFound => {
            nodeFound.node match {
              case attribute: Attr => {
                val ownerElement = attribute.getOwnerElement()
                if (ownerElement != null) {
                  logger.debug("XmlNodeDeleteMapper: deleting attribute " + nodeFound.toString)
                  ownerElement.removeAttributeNode(attribute)
                }
              }
              case _ => {
                val parentNode = nodeFound.node.getParentNode()
                if (parentNode != null) {
                  logger.debug("XmlNodeDeleteMapper: deleting node " + nodeFound.toString)
                  parentNode.removeChild(nodeFound.node)
                }
              }
            }
          })
        })

        Option(node)
      }
    }
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
