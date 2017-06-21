package com.ms.qaTools.xml.xpath

import org.w3c.dom.Node
import org.w3c.dom.NodeList

import com.ms.qaTools.xml._
import com.ms.qaTools._

import javax.xml.namespace.NamespaceContext
import javax.xml.namespace.QName
import javax.xml.xpath.XPathConstants
import javax.xml.xpath.XPathExpression
import javax.xml.xpath.XPathFactory
import net.sf.saxon.xpath.{XPathFactoryImpl => SaxonXPathFactoryImpl}
import net.sf.saxon.pull.NamespaceContextImpl
import net.sf.saxon.om.NamespaceResolver
import scala.collection.JavaConversions._


trait XPathEvaluator {
  def xPathString: String
  def context: Node
  def nsCtx: NamespaceContext
  
  lazy val factory =
    XPathFactory.newInstance().withSideEffect {xf =>
      xf match {
        case f: SaxonXPathFactoryImpl => f.setConfiguration(globals.saxon.configuration)
        case _                        =>
      }
    }

  def saxonNamespaceContext = 
    new NamespaceContextImpl(new NamespaceResolver {
      def getURIForPrefix(prefix: String, useDefault: Boolean) = nsCtx.getNamespaceURI(prefix)
      def iteratePrefixes = 
        nsCtx match {
          case com.ms.qaTools.xml.NamespaceContextImpl(namespaces) => namespaces.keys.toIterator
          case _ => throw new Exception(s"Could not get all prefixes with implementation: ${nsCtx.getClass.getCanonicalName}")
        }
      })    
  
  def newXPath =
    factory.newXPath().withSideEffect { xp =>
      if (factory.isInstanceOf[SaxonXPathFactoryImpl])
        xp.setNamespaceContext(saxonNamespaceContext)
      else
        xp.setNamespaceContext(nsCtx)
    }
  
  private lazy val acquireXPath: XPathExpression = newXPath.compile(xPathString)

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
