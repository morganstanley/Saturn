package com.ms.qaTools.saturn.codeGen

import scala.Option.option2Iterable
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.JavaConversions.asScalaIterator
import scala.collection.JavaConversions.setAsJavaSet
import com.ms.qaTools.saturn.{AbstractLink => MAbstractLink}
import com.ms.qaTools.saturn.{AbstractRunGroup => MAbstractRunGroup}
import com.ms.qaTools.saturn.CustomLink
import com.ms.qaTools.saturn.OnFailLink
import com.ms.qaTools.saturn.OnFinishLink
import com.ms.qaTools.saturn.OnPassLink
import com.ms.qaTools.saturn.{Saturn => MSaturn}
import com.ms.qaTools.saturn.dsl.OnCustom
import com.ms.qaTools.saturn.dsl.OnFail
import com.ms.qaTools.saturn.dsl.OnFinish
import com.ms.qaTools.saturn.dsl.OnPass
import scala.annotation.tailrec

case class WrappedEdge(link:MAbstractLink) {
  val source = link.getSource
  val target = link.getTarget

  def contradicts(that:WrappedEdge) = this.source.getName == that.source.getName && (
    (this.link,that.link) match {
      case(l:OnFinishLink,_)          => false
      case(_,r:OnFinishLink)          => false
      case(l:OnPassLink,r:OnPassLink) => false
      case(l:OnFailLink,r:OnFailLink) => false
      case(_,_)                       => true
    }
  )

  def asExpression = CanRunExpressionGenerator.getLinkStatusMethodName(link)

  def asTuple(that:WrappedEdge) = if(source.getName < that.source.getName) (this,that) else (that,this)

  override def toString = link match {
    case onPass:OnPassLink     => link.getSource().getName()
    case onFail:OnFailLink     => "!" + link.getSource().getName()
    case onFinish:OnFinishLink => "*" + link.getSource().getName()
    case onCustom:CustomLink   => "@" + link.getSource().getName()
  }
}

case class NodePath(edges:List[WrappedEdge]) {
  def firstNode:Option[MAbstractRunGroup] = edges.headOption.map{_.link.getSource()}
  def lastNode:Option[MAbstractRunGroup] = edges.lastOption.map{_.link.getTarget()}
  def firstEdge = edges.headOption
  def lastEdge = edges.lastOption

  def allSubPaths:List[NodePath] = this :: (if(edges.length <= 1) Nil else NodePath(edges.tail).allSubPaths)

  def asExpression = lastEdge.map{ _.asExpression }.getOrElse("true")
  def contradicts(that:NodePath) = this.edges.exists{a => that.edges.exists{b => a.contradicts(b)} }

  override def toString = "(" + edges.mkString(" -> ") + lastEdge.map{" -> " + _.link.getTarget.getName}.getOrElse("") + ")"
}

class CanRunExpressionGenerator(nodeExpressions:Map[MAbstractRunGroup,String]) {
  def getCanRunExpression(node:MAbstractRunGroup):String = nodeExpressions.getOrElse(node, "true")
}

object CanRunExpressionGenerator {
  def apply(saturn:MSaturn) = {
    val allEdges:List[MAbstractLink] = saturn.getLinks().toList
    val nodes = saturn :: saturn.eAllContents().collect{ case r:MAbstractRunGroup => r }.toList
    val nodeInEdges = for(node <- nodes) yield (node, allEdges.filter{ _.getTarget() == node }.map{ WrappedEdge(_) } )
    val edgesByNode = nodeInEdges.toList.toMap

    def calcNodeInPaths(node:MAbstractRunGroup, pathSoFar:List[WrappedEdge]=Nil):List[NodePath] = {
      if(pathSoFar.toSet.size < pathSoFar.size) throw new Exception(s"Circular dependency found in runGroups: $pathSoFar")
      edgesByNode.get(node) match {
        case Some(inEdges) if !inEdges.isEmpty => inEdges.flatMap{ e => calcNodeInPaths(e.source, e::pathSoFar) }
        case _                                 => if(pathSoFar.isEmpty) Nil else List(NodePath(pathSoFar))
      }
    }
    val allPaths = nodes.flatMap{node => calcNodeInPaths(node).flatMap{_.allSubPaths}}

    val depPairs = allPaths.flatMap{path => for {
        f <- path.firstNode
        l <- path.lastNode
        fe <- path.firstEdge
        le <- path.lastEdge
      } yield ((f,l),getLinkStatusMethodNameOnly(fe.link),getLinkStatusMethodName(le.link))
    }
    val grouped0 = depPairs.groupBy(dp => dp._1)
    val groupedPaths = grouped0.map{kv => val (k,v)=kv; (k, v.groupBy(_._2).map{kv => val (k,v)=kv; (k, v.map{_._3}.toSet)})}
    val groupedPathsByTarget = groupedPaths.toList.map{kv => val ((s,t),v)=kv; (t,v)}.groupBy{_._1}.map{kv => val (k,v)=kv; (k, v.map{_._2})}

    @volatile var i=0
    trait CanRunExpr {
      def toString:String
      def isAmbiguous:Boolean
      def resolveWith(that:CanRunExpr):Option[CanRunExpr]
      def nodeExprs:List[NodeExpr]
      def toAndExpr:CanRunExpr = this
      def reduce = this

      // So, about this...
      // This algo works on individual expressions regardless of if they are identical or not.
      // As such, I need a unique identified for each one
      // hash code is no good as: 3.hashCode == (1+1+1).hashCode
      val id=i
      i+=1
    }

    case class NodeExpr(nodeStr:String) extends CanRunExpr {
      override def toString:String = nodeStr
      def isAmbiguous:Boolean=false
      def resolveWith(that:CanRunExpr):Option[CanRunExpr] = None
      def nodeExprs:List[NodeExpr] = List(this)
    }

    case class OrExpr(exprs:Seq[CanRunExpr]) extends CanRunExpr {
      override def reduce = {
        val mergedExprs = uniqExprs.flatMap{
                            case e:OrExpr => e.exprs
                            case e => Seq(e)
                          }.sortWith((a,b)=> a.toString() < b.toString())
        if(mergedExprs.isEmpty) NodeExpr("true")
        else if(mergedExprs.length == 1) mergedExprs(0)
        else OrExpr(mergedExprs.map{me => (me.toString,me)}.groupBy(_._1).values.map{_(0)._2}.toSeq)
      }

      def isAmbiguous:Boolean = exprs.exists{_.isAmbiguous}
      def resolveWith(that:CanRunExpr):Option[CanRunExpr] = that match {
        case thatOrExpr:OrExpr => {
          val newExprs = exprs.map{expr => expr.resolveWith(that).getOrElse(expr)}
          val ret = if(exprs != newExprs) Some(OrExpr(newExprs).reduce)
                    else if((thatOrExpr.exprs.toSet - exprs.toSet).isEmpty) Some(this)
                    else None
          ret
        }
        case anythingElse      => None
      }
      def nodeExprs:List[NodeExpr] = exprs.toList.flatMap{_.nodeExprs}
      override def toAndExpr = OrExpr(exprs.map{_.toAndExpr})
      def uniqExprs:Seq[CanRunExpr] = exprs.toSet.toSeq
      override def toString:String = "(" + uniqExprs.sortBy{_.toString}.map{_.toString}.mkString(" || ") + ")"
    }

    case class AndExpr(exprs:Seq[CanRunExpr]) extends CanRunExpr {
      override def reduce = {
        val mergedExprs = uniqExprs.flatMap{
                            case e:AndExpr => e.exprs
                            case e => Seq(e)
                          }.sortBy{_.toString}
        if(mergedExprs.isEmpty) NodeExpr("true")
        else if(mergedExprs.length == 1) mergedExprs(0)
        else AndExpr(mergedExprs.map{me => (me.toString,me)}.groupBy(_._1).values.map{_(0)._2}.toSeq)
      }
      def isAmbiguous:Boolean = exprs.exists{_.isAmbiguous}
      def resolveWith(that:CanRunExpr):Option[CanRunExpr] = None
      def nodeExprs:List[NodeExpr] = exprs.toList.flatMap{_.nodeExprs}

      def uniqExprs:Seq[CanRunExpr] = exprs.toSet.toSeq
      override def toString:String = "(" + uniqExprs.sortBy{_.toString}.map{_.toString}.mkString(" && ") + ")"
    }

    class AmbiguousExpr(exprs:Seq[CanRunExpr]) extends CanRunExpr {
      def isAmbiguous:Boolean = true
      def resolveWith(that:CanRunExpr):Option[CanRunExpr] = that match {
        case thatOrExpr:OrExpr => {
          val thisExprsSet = exprs.toSet
          val thatOrExprsSet = thatOrExpr.exprs.toSet
          if(thisExprsSet == thatOrExprsSet) Some(OrExpr(exprs).reduce) else None
        }
        case anythingElse      => None
      }
      def nodeExprs:List[NodeExpr] = exprs.toList.flatMap{_.nodeExprs}
      override def toAndExpr = if(exprs.length == 1) exprs(0) else AndExpr(exprs).reduce
      override def toString:String = "(" + exprs.sortBy{_.toString}.map{_.toString}.mkString(" ?? ") + ")"
    }

    object AmbiguousExpr {
      def apply(exprs:Set[String]) =
        if(exprs.isEmpty) NodeExpr("true")
        else if(exprs.size == 1) NodeExpr(exprs.toSeq(0))
        else new AmbiguousExpr(exprs.toList.map{es => NodeExpr(es)})
    }

    object CanRunExpr {
      def apply(exprSets:List[Set[String]]):CanRunExpr = if(exprSets.isEmpty) {
        NodeExpr("true")
      }
      else if(exprSets.size == 1) {
        AmbiguousExpr(exprSets(0))
      }
      else {
        OrExpr(exprSets.map{ps => AmbiguousExpr(ps)}).reduce
      }
    }

    def mergeCanRunExpressions(exprs:List[CanRunExpr]):CanRunExpr = {
      val reducedExprs = exprs.map{_.reduce}
      val(ambiguouExprs,notAmbiguousExprs) = reducedExprs.partition{_.isAmbiguous}
      val(simpleNodes,boolExprs) = notAmbiguousExprs.partition{_.isInstanceOf[NodeExpr]}
      @tailrec
      def resolveAmbiguousExprs(ambiguousExprs:List[CanRunExpr], boolExprs:List[CanRunExpr],seenExprs:List[CanRunExpr],didSome:Boolean=false, uncertain:List[CanRunExpr]=Nil):List[CanRunExpr] = {
        if(ambiguousExprs.isEmpty) {
          if(!didSome) {
            val allBoolExprs = uncertain.map{_.toAndExpr} ::: boolExprs
            val boolExprMap = allBoolExprs.map{b=>(b.id,b)}.toMap
            val retHash = (allBoolExprs.map{_.id}.toSet -- seenExprs.map{_.id}.toSet).toList
            retHash.map{boolExprMap(_)}
          }
          else resolveAmbiguousExprs(uncertain, boolExprs, seenExprs)
        }
        else {
          val ambiguousExpr = ambiguousExprs.head
          val resolvedExprs = boolExprs.foldRight((ambiguousExpr, List[CanRunExpr]())) { case (boolExpr, (ambiguous, seen)) =>
            ambiguous.resolveWith(boolExpr) map ((_, boolExpr :: seen)) getOrElse ((ambiguous, seen))
          }
          if(resolvedExprs._2.isEmpty) resolveAmbiguousExprs(ambiguousExprs.tail, boolExprs, seenExprs, didSome, ambiguousExpr::uncertain)
          else resolveAmbiguousExprs(ambiguousExprs.tail, resolvedExprs._1 :: boolExprs, resolvedExprs._2 ::: seenExprs, true, uncertain)
        }
      }

      val resolved = resolveAmbiguousExprs(ambiguouExprs,boolExprs,Nil)
      val remainingSimpleNodes:Set[CanRunExpr] = simpleNodes.toSet -- resolved.flatMap{_.nodeExprs}
      val allResolved = resolved ::: remainingSimpleNodes.toList
      if(allResolved.length == 1) allResolved.head else AndExpr(allResolved)
    }

    val dependencyExpressionsByTarget = for {
      (target, dependenciesByType) <- groupedPathsByTarget
    } yield (target, dependenciesByType.map{depMaps => CanRunExpr(depMaps.values.toList)})

    val dependencyStrByTarget = dependencyExpressionsByTarget.map{kv => val(target,dependencyExpressions)=kv; (target,mergeCanRunExpressions(dependencyExpressions).reduce.toString())}
    new CanRunExpressionGenerator(dependencyStrByTarget)
  }

  def getLinkStatusMethodNameOnly(l:MAbstractLink) = l match {
    case OnPass(_,_)     => "runGroupPassed"
    case OnFail(_,_)     => "runGroupFailed"
    case OnFinish(_,_)   => "runGroupFinished"
    case OnCustom(s,t,c) => getLinkSatisfied(l)
  }

  def getLinkStatusMethodName(l:MAbstractLink) = l match {
    case OnCustom(s,t,c) => getLinkSatisfied(l)
    case _               => s"${getLinkStatusMethodNameOnly(l)}(${getLinkResultName(l)})"
  }

  def getLinkName(r: MAbstractRunGroup): String = "_" + r.getName
  def getLinkName(l:MAbstractLink): String = getLinkName(l.getSource)
  def getLinkResultName(l:MAbstractLink) = getLinkName(l)
  def getRunGroupName(r:MAbstractRunGroup):String = r.getName()
  def getRunGroupResultName(r:MAbstractRunGroup):String = getRunGroupName(r) + "Result"
  def getLinkSatisfied(l:MAbstractLink) = s"__${getRunGroupName(l.getSource)}2${getRunGroupName(l.getTarget)}Satisfied"
}

/*
 * The following function is an n log(n) implementation of the boolean expression generator for Saturn nodes
 * The expression generator will follow the following rules:
 *
 * Assume the following diagrams:
 * * * * * * * * * * * * * * * * * * * * *
 * No dependencies
 * A
 * B
 *
 * A.canRun = true
 * B.canRun = true
 *
 * * * * * * * * * * * * * * * * * * * * *
 * Simple dependencies
 *
 * A onPass -> B
 * A onFail -> C
 * A onFinish -> D
 * A onCustom -> E
 * B onPass -> F
 *
 * A.canRun = true
 * B.canRun = A.runGroupPassed
 * C.canRun = A.runGroupFailed
 * D.canRun = A.runGroupFinished
 * E.canRun = AtoESatisfied_XXXXXX(A)
 * F.canRun = B.runGroupPassed
 *
 * * * * * * * * * * * * * * * * * * * * *
 * AND conditions
 * A onPass -> C
 * B onFail -> C
 *
 * A.canRun = true
 * B.canRun = true
 * C.canRun = A.runGroupPassed && B.runGroupFailed
 *
 * * * * * * * * * * * * * * * * * * * * *
 * OR conditions
 *
 * A onPass -> B
 * A onFail -> C
 * B onFinish -> D
 * C onFinish -> D
 *
 * A.canRun = true
 * B.canRun = A.runGroupPassed
 * C.canRun = A.runGroupFailed
 * D.canRun = B.runGroupFinished || C.runGroupFinished
 *
 * OR conditions are triggered when mutually exclusive edges fork out from a common node.
 * Mutual exclusion is as follows:
 *
 * edge1,  edge2,  isMutuallyExclusive?
 * onPass,   onPass,   NO
 * onPass,   onFail,   YES
 * onPass,   onFinish, NO
 * onPass,   onCustom, YES
 * onFail,   onPass,   YES
 * onFail,   onFail,   NO
 * onFail,   onFinish, NO
 * onFail,   onCustom, YES
 * onFinish, onPass,   NO
 * onFinish, onFail,   NO
 * onFinish, onFinish, NO
 * onFinish, onCustom, NO
 * onCustom, onPass,   YES
 * onCustom, onFail,   YES
 * onCustom, onFinish, NO
 * onCustom, onCustom, YES
 *
 * * * * * * * * * * * * * * * * * * * * *
 * Algorithm:
 * To find the canRunExpression for a given node X:
 *   1. find all distinct paths leading into the node
 *   2. categorize all paths in a table where columns are distinct mutually exclusive leading edges and rows are paths with distinct start and end points
 *   3. for each row in the table, build a possibly ambiguous condition
 *   4. merge all rows until the conditions are no longer ambiguous
 *   5. join all remaining expressions with && operators and remove single expressions that are parter of larger ones
 *
 *
 * Example 1:
 * A onPass -> B
 * A onFail -> C
 * B onFinish -> D
 * C onFinish -> D
 *
 * find canRun expression for D
 * 1. find all distinct paths leading into the node
 * p0: A onPass B onFinish D
 * p1: A onFail C onFinish D
 * p2: B onFinish D
 * p3: C onFinish D
 *
 * 2. categorize all paths in a table where columns are distinct mutually exclusive leading edges and rows are paths with distinct start and end points
 *
 * Path, onPass, onFail, onFinish
 * A-D,  p0    , p1    ,
 * B-D,        ,       , p2
 * C-D,        ,       , p3
 *
 * 3. for each row in the table, build a possibly ambiguous condition
 * A-D,  B | C
 * B-D,  B
 * C-D,  C
 *
 * 4. merge all rows until the conditions are no longer ambiguous
 * (B|C) + B => (B|C), B is redundant
 * (B|C) + C => (B|C), C is redundant
 *
 * canRun == B|C
 *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Example 2:
 * A onPass -> Z
 * A onFail -> B
 * B onPass -> Z
 * B onFail -> C
 * C onPass -> Z
 * C onFail -> D
 * D onPass -> Z
 *
 * M onPass -> Z
 * N onPass -> Z
 *
 * In this case, Z will execute on (A|B|C|D) && M && N
 *
 * find canRun expression for D
 * 1. find all distinct paths leading into the node
 * p0:  A onPass Z
 * p1:  A onFail B onPass Z
 * p2:  A onFail B onFail C onPass Z
 * p3:  A onFail B onFail C onFail D onPass Z
 * p4:  B onPass Z
 * p5:  B onFail C onPass Z
 * p6:  B onFail C onFail D onPass Z
 * p7:  C onPass Z
 * p8:  C onFail D onPass Z
 * p9:  D onPass Z
 * p10: M onPass Z
 * p11: N onPass Z
 *
 * 2. categorize all paths in a table where columns are distinct mutually exclusive leading edges and rows are paths with distinct start and end points
 *
 * Path, onPass, onFail
 * A-Z,  p0    , p1 ? p2 ?p3
 * B-Z,  p4    , p5 ? p6
 * C-Z,  p7    , p8
 * D-Z,  p9    ,
 * M-Z,  p10   ,
 * N-Z,  p11   ,
 *
 * 3. for each row in the table, build a possibly ambiguous condition
 * A-Z,  A|(B?C?D)
 * B-Z,  B|(C?D)
 * C-Z,  C|D
 * D-Z,  D
 * M-Z,  M
 * N-Z,  N
 *
 * 4. merge all rows until the conditions are no longer ambiguous
 * (C|D) + B|(C?D) = B|C|D, C|D is redundant
 * (A|(B?C?D)) + (B|C|D) = (A|B|C|D), (B|C|D) is redundant
 *
 * nothing else can be merged, join all with &&
 * Z.canRun == (A|B|C|D) && M && N
 *
 */
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
