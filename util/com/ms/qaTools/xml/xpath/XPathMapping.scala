package com.ms.qaTools.xml.xpath

import java.lang.Boolean
import java.lang.Double
import java.util.{List => JList}

import scala.collection.JavaConversions._
import scalaz.State

import org.jaxen.Context
import org.jaxen.ContextSupport
import org.jaxen.SimpleVariableContext
import org.jaxen.XPathFunctionContext
import org.jaxen.dom.DOMXPath
import org.jaxen.dom.DocumentNavigator
import org.jaxen.expr.{Expr, FunctionCallExpr, LocationPath, Predicated, BinaryExpr}
import org.jaxen.expr.DefaultXPathFactory
import org.jaxen.expr.{Step => JaxStep}
import org.w3c.dom.Node
import org.w3c.dom.NodeList

import com.ms.qaTools._
import com.ms.qaTools.collections.zipWithCondition
import com.ms.qaTools.conversions.XPathConversions.xPathToNodes
import com.ms.qaTools.tree.TreeNode
import com.ms.qaTools.tree.XmlNode
import com.ms.qaTools.tree.extraction.ColumnIndex
import com.ms.qaTools.tree.extraction.ColumnMapping
import com.ms.qaTools.tree.extraction.Index
import com.ms.qaTools.tree.extraction.Step
import com.ms.qaTools.xml._
import com.ms.qaTools.xml.NamespaceContextImpl
import com.ms.qaTools.xml.namespaceContextToJaxenImpl
import com.ms.qaTools.xml.nodeList2List

import javax.xml.namespace.NamespaceContext


/**
 * XPathMappings for extraction
 */

case class XMLStep(private val step: JaxStep)(implicit nsContext: NamespaceContext) extends Step[Node] {
  def getText(): String = step.getText()
  def hasPredicates = !step.getPredicates.isEmpty
  def resolve(context: TreeNode[Node]): Seq[TreeNode[Node]] = 
    XPath(getText, context.node).map {x => XmlNode(x)}
}

case class XMLExprStep(private val expr: Expr)(implicit nsContext: NamespaceContext) extends Step[Node] {
  private val contextSupport = new ContextSupport(nsContext.asInstanceOf[NamespaceContextImpl], new XPathFunctionContext(true), new SimpleVariableContext(), new DocumentNavigator())

  private val dummyDocument = {
    import scala.language.reflectiveCalls
    DocumentBuilderTL().newDocument()
  }

  def hasPredicates = Option(expr) collect {case p: Predicated => !p.getPredicates.isEmpty} getOrElse false

  def getText(): String = expr.getText()
  def resolve(context: TreeNode[Node]): Seq[TreeNode[Node]] = {
    val execContext = new Context(contextSupport)
    execContext.setNodeSet(Seq(context.node))
    expr.evaluate(execContext) match {
      case s: String => Seq(XmlNode(dummyDocument.createTextNode(s)))
      case d: Double => Seq(XmlNode(dummyDocument.createTextNode(d.toString())))
      case b: Boolean => Seq(XmlNode(dummyDocument.createTextNode(b.toString())))      
      case l: NodeList => l.map {XmlNode(_)}
      case l: JList[_] => l.asInstanceOf[JList[Node]].map {XmlNode(_)}
    }
  }
}

case class SimpleXPathMappingNode(step: Step[Node], children: Seq[ColumnMapping[Node]] = Nil, mapping: Option[Index] = None) extends ColumnMapping[Node] {
  def +(that: ColumnMapping[Node]): ColumnMapping[Node] = {
    val thatstep = that.step
    if (step.getText == thatstep.getText) {
      val zipped = zipWithCondition(children.sortWith(sf), that.children.sortWith(sf))(cf)
      new SimpleXPathMappingNode(step, zipped.map(mf), mapping.orElse(that.mapping))
    }
    else throw new Error("Cannot add two different XPathMappings: '%s' and '%s'".format(step.getText, thatstep.getText))
  }
}

case class RootXPathMappingNode(children: Seq[ColumnMapping[Node]] = Nil) extends ColumnMapping[Node] {
  lazy val step = throw new Error("No step in an empty xpath mapping.") 
  val mapping: Option[Index] = None
  def +(that: ColumnMapping[Node]): ColumnMapping[Node] = {
    that match {
      case RootXPathMappingNode(c) => {
        val zipped = zipWithCondition(children.sortWith(sf), c.sortWith(sf))(cf)
        RootXPathMappingNode(zipped.map(mf))
      }
      case _ => throw new Error("Can't add a non-root mapping with a root mapping")
    }
  }
  override def toString = "/ -> None"  
}

object XPathMappingNode {
  def apply(domXPath: DOMXPath, index: Index)(implicit nsContext: NamespaceContext): ColumnMapping[Node] = {
    val rootExpr = domXPath.getRootExpr()
    val paths = locationPathsIn(rootExpr)
    val (commonSteps, branches) = findCommon(paths)
    val (Seq(), leafExpr) = paths2branch(rootExpr)(branches)

    val leave: List[SimpleXPathMappingNode] = leafExpr match {
      case e: LocationPath =>
        require(e.getSteps.isEmpty)
        Nil
      case e =>
        List(SimpleXPathMappingNode(XMLExprStep(e), mapping = Option(index)))
    }

    val children = commonSteps.foldRight(leave) { (x, xs) =>
      val m = if (xs.isEmpty) Option(index) else None
      List(SimpleXPathMappingNode(XMLStep(x), xs, m))
    }

    RootXPathMappingNode(children)
  }

  def locationPathsIn(expr: Expr): Seq[LocationPath] = expr match {
    case e: LocationPath =>
      Seq(e)
    case e: FunctionCallExpr if !aggregateFunctions(e.getFunctionName) =>
      e.getParameters.asInstanceOf[JList[Expr]].flatMap(locationPathsIn)
    case e: BinaryExpr =>
      Seq(e.getLHS, e.getRHS).flatMap(locationPathsIn)
    case _ =>
      Seq()
  }

  def findCommon(paths: Seq[LocationPath]): (Seq[JaxStep], Seq[LocationPath]) = {
    def findCommon0(xss: Seq[List[JaxStep]]): (List[JaxStep], Seq[List[JaxStep]]) = {
      val head = xss.map(_.headOption) reduce { (x, y) =>
        (x, y) match {
          case (Some(xx: JaxStep), Some(yy: JaxStep)) if xx.getText == yy.getText => x
          case _                                                                  => None
        }
      }
      head match {
        case Some(x) =>
          val (ys, yss) = findCommon0(xss.map(_.tail))
          (x :: ys, yss)
        case None =>
          (Nil, xss)
      }
    }
    paths match {
      case Seq() =>
        (Nil, Nil)
      case _ =>
        val (commonSteps, yss) = findCommon0(paths.map(_.getSteps.asInstanceOf[JList[JaxStep]].toList))
        val branches = yss map { ys =>
          val b = xPathFactory.createRelativeLocationPath
          ys.foreach(b.addStep)
          b
        }
        (commonSteps, branches)
    }
  }

  type BranchStack[A] = State[Seq[LocationPath], A]

  def paths2branch(expr: Expr): BranchStack[Expr] = expr match {
    case e: LocationPath => State {
      case Seq(x, xs@_*) => (xs, x)
    }
    case e: FunctionCallExpr if !aggregateFunctions(e.getFunctionName) =>
      val f = xPathFactory.createFunctionCallExpr(e.getPrefix, e.getFunctionName)
      val s0: BranchStack[FunctionCallExpr] = State.state(f)
      e.getParameters.foldLeft(s0) {
        case (s, p: Expr) => for (f <- s; b <- paths2branch(p)) yield f.withSideEffect(_.addParameter(b))
      }
    case e: BinaryExpr => for {
      l <- paths2branch(e.getLHS)
      r <- paths2branch(e.getRHS)
    } yield e.withSideEffect(updateBinaryExpr(_, l, r))
    case e =>
      State.state(e)
  }

  private def updateBinaryExpr(x: BinaryExpr, lhs: Expr, rhs: Expr) {
    def invoke(name: String, value: Expr) =
      x.getClass.getMethod(name, classOf[Expr]).withSideEffect(_.setAccessible(true)).invoke(x, value)
    invoke("setLHS", lhs)
    invoke("setRHS", rhs)
  }

  private val xPathFactory = new DefaultXPathFactory
  private val aggregateFunctions = Set("count", "avg", "max", "min", "sum")
}

object XPathMappingNodeTree {
  def apply(xPaths: Seq[(String,String)])(implicit nsContext: NamespaceContext): ColumnMapping[Node]= {
    val root: ColumnMapping[Node] = RootXPathMappingNode()
    xPaths.zipWithIndex.foldLeft(root) {
      case (ref, (xpath, i)) =>
        ref + XPathMappingNode(new DOMXPath(xpath._1), new ColumnIndex(i))
    }
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