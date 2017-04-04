package com.ms.qaTools.xml.generator
import org.w3c.dom.Element
import org.w3c.dom.Document
import org.w3c.dom.Node
import com.ms.qaTools.io._
import com.ms.qaTools.Logger
import com.ms.qaTools.xml.xpath.XPath
import com.ms.qaTools.xml.NamespaceContextImpl
import com.ms.qaTools.tree.generator.Lookupable
import com.ms.qaTools.tree.generator.ColContext
import com.ms.qaTools.tree.generator.NodeCreator
import com.ms.qaTools.tree.generator.NodeCreator
import scala.annotation.tailrec
import com.ms.qaTools.tree.generator.ParameterizedText



class XmlElementModifierCreator(override val elem: Element, override val childCreators: List[NodeCreator[Document, Node]], override val attrCreators: List[XmlAttributeCreator]) extends XmlElementCreator(elem, childCreators, attrCreators) {
  override def toString: String = "XmlElementModifierCreator(<" + elem.getTagName() + "/>, (" +
    childCreators.mkString(",") + "))"

  override def create(data: DelimitedRow)(implicit colMap: Lookupable, colContext: ColContext, doc: Document): Node = {
    val newElem = super.create(data)
    if (elem.getAttribute("expandableRefs") == null || elem.getAttribute("expandableRefs").isEmpty() || ! elem.getAttribute("expandableRefs").toBoolean) 
      newElem.setTextContent(elem.getTextContent())
    newElem
  }
}
/*
COPYRIGHT NOTICE AND DISCLAIMER
Copyright (c) 2009-2016, Contributor

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License, version 3 for more details.

You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
*/
