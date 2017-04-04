package com.ms.qaTools.xml.xpath

import org.w3c.dom.Node
import org.w3c.dom.NodeList

import com.ms.qaTools.xml.nodeList2List

import javax.xml.namespace.NamespaceContext
import javax.xml.namespace.QName
import javax.xml.xpath.XPathConstants
import javax.xml.xpath.XPathExpression
import javax.xml.xpath.XPathFactory



trait XPathEvaluator {
  val xPathString: String
  val nsCtx: NamespaceContext
  val context: Node
  val factory = XPathFactory.newInstance()

  private def acquireXPath: XPathExpression = {
    val xPath = factory.newXPath()
    xPath.setNamespaceContext(nsCtx)
    xPath.compile(xPathString)
  }

  def asString(node: Node = context): String = {
    require(node != null, "XPath evaluation requires a context node.")
    acquireXPath.evaluate(node)
  }

  def asInt(node: Node = context): Int = {
    require(node != null, "XPath evaluation requires a context node.")
    val v = acquireXPath.evaluate(node, XPathConstants.NUMBER)
    v match {
      case d: java.lang.Double  => d.intValue()
      case i: java.lang.Integer => i
    }
  }

  def asDouble(node: Node = context): Double = {
    require(node != null, "XPath evaluation requires a context node.")
    val v = acquireXPath.evaluate(node, XPathConstants.NUMBER)
    v match {
      case d: java.lang.Double  => d
      case i: java.lang.Integer => i.toDouble
    }
  }

  def asBool(node: Node = context): Boolean = {
    require(node != null, "XPath evaluation requires a context node.")
    acquireXPath.evaluate(node, XPathConstants.BOOLEAN).asInstanceOf[Boolean]
  }

  def asNodes(node: Node = context): Seq[Node] = {
    require(node != null, "XPath evaluation requires a context node.")
    acquireXPath.evaluate(node, XPathConstants.NODESET).asInstanceOf[NodeList] // implicit
  }

  def asNode(node: Node = context): Node = {
    require(node != null, "XPath evaluation requires a context node.")
    acquireXPath.evaluate(node, XPathConstants.NODE).asInstanceOf[Node] // implicit
  }

  def asNodeOption(node: Node = context): Option[Node] = Option(asNode(node))

  def as(returnType: QName, node: Node = context): AnyRef = {
    require(node != null, "XPath evaluation requires a context node.")
    acquireXPath.evaluate(node, returnType)
  }
}

class XPath(val xPathString: String, val context: Node = null)(implicit val nsCtx: NamespaceContext) extends XPathEvaluator {
  override def toString = xPathString
}

object XPath {
  def apply(xPathString: String)(implicit nsCtx: NamespaceContext): XPath = new XPath(xPathString)
  def apply(xPathString: String, context: Node)(implicit nsCtx: NamespaceContext): XPath = new XPath(xPathString, context)
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
