package com.ms.qaTools.xml.generator

import org.w3c.dom.Attr
import org.w3c.dom.CDATASection
import org.w3c.dom.Comment
import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.Node
import org.w3c.dom.ProcessingInstruction
import org.w3c.dom.Text

import com.ms.qaTools.tree.generator.InnerNodeCreator
import com.ms.qaTools.tree.generator.LeafNodeCreator
import com.ms.qaTools.tree.generator.NodeCreator
import com.ms.qaTools.xml._



trait XmlNodeCreator extends NodeCreator[Document, Node]
trait XmlLeafNodeCreator extends LeafNodeCreator[Document, Node]
trait XmlInnerNodeCreator extends InnerNodeCreator[Document, Node] 

object XmlNodeCreator {
  val xmlGenNsUri = "http://www.ms.com/qaTools/xmlGenerator/2007"
  val codeNodes = Seq("Groovy", "DML", "XmlGen")

  def apply(node: Node)(implicit isLegacyMode: Boolean): NodeCreator[Document, Node] = node match {
    case e: Element               => XmlNodeCreator(e)
    case a: Attr                  => XmlNodeCreator(a)
    case s: CDATASection          => XmlNodeCreator(s)
    case t: Text                  => XmlNodeCreator(t)
    case c: Comment               => XmlNodeCreator(c)
    case p: ProcessingInstruction => XmlNodeCreator(p)
    case _                        => { println(node); null }
  }

  private def isXmlGenNamespace(n: Node) = n.getNamespaceURI() == xmlGenNsUri
  private def isShadowElement(n: Node) = isXmlGenNamespace(n) && n.getLocalName() == "Shadow"
  private def isCodeNode(n: Node) = isXmlGenNamespace(n) && codeNodes.contains(n.getLocalName())  
  
  def apply(elem: Element)(implicit isLegacyMode: Boolean): XmlElementCreator = {
    if (! isCodeNode(elem)) {
      val childCreators = elem.getChildNodes().map { n => XmlNodeCreator(n) }.toList
      val attrCreators = elem.getAttributes().map {a => XmlNodeCreator(a.asInstanceOf[Attr])}.toList
      if (isShadowElement(elem)) new XmlShadowElementCreator(elem, childCreators, attrCreators) 
      else new XmlElementCreator(elem, childCreators, attrCreators)
    }
    else {
      new XmlElementModifierCreator(
        elem,       
        elem.getChildNodes().par.map { n => XmlNodeCreator(n) }.toList, 
        elem.getAttributes().par.map {a => XmlNodeCreator(a.asInstanceOf[Attr])}.toList)
    }
  }  

  def apply(attr: Attr)(implicit isLegacyMode: Boolean): XmlAttributeCreator = new XmlAttributeCreator(attr, isLegacyMode)
  def apply(text: Text)(implicit isLegacyMode: Boolean): XmlTextCreator = new XmlTextCreator(text, isLegacyMode)
  def apply(cdata: CDATASection)(implicit isLegacyMode: Boolean): XmlCDATACreator = new XmlCDATACreator(cdata, isLegacyMode)
  def apply(comment: Comment)(implicit isLegacyMode: Boolean): XmlCommentCreator = new XmlCommentCreator(comment, isLegacyMode)
  def apply(procInst: ProcessingInstruction)(implicit isLegacyMode: Boolean): XmlProcessingInstructionCreator = new XmlProcessingInstructionCreator(procInst, isLegacyMode)
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
