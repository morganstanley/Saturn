package com.ms.qaTools.saturn.kronus.codeGen

import scala.collection.JavaConversions._

import com.ms.qaTools.saturn.kronus._

object Implicits {
  implicit class CodeBlockUtil(protected val cb: CodeBlock) extends AnyVal {
    def fdOpt = Option(cb.eContainer).collect {case fd: FunctionDef => fd}

//    def isStreamDef:Boolean = cb match {
//      case scb: ScalaCodeBlock => scb.getType == "yield:stream" 
//      case e                   => false
//    }
    def getNonStreamParameters: Seq[ParameterDef] = fdOpt.fold(List.empty[ParameterDef])(_.getNonStreamParameters)
  }
  
  implicit class AbstractDefUtil(protected val a: AbstractDef) extends AnyVal {
    def getAnnotatedDef:Option[AnnotatedDef] = Option(a.eContainer).collect{case ad: AnnotatedDef => ad}
    def getHashtags = getAnnotatedDef.map{_.getHashtags}.getOrElse(Nil)
    def getAnnotations = getAnnotatedDef.map{_.getAnnotations}.getOrElse(Nil)
  }
  
  implicit class FunctionDefUtil(protected val fd: FunctionDef) extends AnyVal {
    def isStreamDef:Boolean = fd.getAnnotatedDef.fold(false)(_.isStreamDef)
    def isSinkDef:Boolean = fd.getAnnotatedDef.fold(false)(_.isSinkDef)
    def getStreamNodeDefinition = fd.getAnnotatedDef.flatMap{_.getStreamNodeDefinition}
    def getNonStreamParameters:List[ParameterDef] = fd.getParameterDefs.toList 
    
    def genShapeType = {
      for {
        streamNodeDefinition <- getStreamNodeDefinition
      } yield {
        val inlets = streamNodeDefinition.getInlets        
        val inletType = streamNodeDefinition.getInletType 
          
        val outlets = streamNodeDefinition.getOutlets        
        val outletType = streamNodeDefinition.getOutletType
        
        val shapeType = (inlets,outlets, inletType, outletType) match {
          case (Nil,      List(out), _,               Some(outletType)) => s"akka.stream.SourceShape[${outletType.getName}]"
          case (List(in), Nil,       Some(inletType), _               ) => s"akka.stream.SinkShape[${inletType.getName}]"
          case (List(in), List(out), Some(inletType), Some(outletType)) => s"akka.stream.FlowShape[${inletType.getName}, [${outletType.getName}]"
          case (Nil,      Nil,       _,               _               ) => throw new Exception()
          case (ins,      Nil,       Some(inletType), _               ) => s"FanInSink"
          case (ins,      List(out), Some(inletType), Some(outletType)) => s"FanInFlow"
          case (Nil,      outs,      _,               Some(outletType)) => s"FanOutSource"
          case (List(in), outs,      Some(inletType), Some(outletType)) => s"FanOutFlow"
          case (ins,      outs,      Some(inletType), Some(outletType)) => s"FanInFanOut"
        } 
        shapeType        
      }
    }
//    def genGraphType
//    def genGraphMetaType
  }

  implicit class ParameterDefUtil(protected val p: ParameterDef) extends AnyVal {
    def isInlet:Boolean = p.getHashtags.map{hc => hc.getMethod.getName}.contains("In")
    def isOutlet:Boolean = p.getHashtags.map{hc => hc.getMethod.getName}.contains("Out")
    def isSetup:Boolean = p.getHashtags
                           .filter{h => h.getMethod.getName == "In"}
                           .exists{i => !i.getParameterValues.exists{p => p.getName == "setup" && p.getValue == "true"} }
//    def defaultParameter:String
  }
  
  implicit class FunctionCallUtil(protected val fc: FunctionCall) extends AnyVal {
    def zipParameterValuesWithDefs:List[(ParameterValue, ParameterDef)] = {
      val fd = fc.getMethod
      val parameterDefs = fd.getParameterDefs
      val parameterDefsByName = parameterDefs.map{p => (p.getName, p)}.toMap
      val (zipped,_,_) = fc.getParameterValues.foldLeft[(List[(ParameterValue, ParameterDef)],Int,Boolean)]((Nil,0,false)) {        
        case ((soFar, index, encounteredNamed), np:KeywordParameterValue)  => ((np,parameterDefsByName(np.getName)) :: soFar, index+1, true)
        case ((soFar, index, false),            pp:PositionParameterValue) => ((pp,parameterDefs(index))            :: soFar, index+1, false)
        case ((    _,     _, true),             pp:PositionParameterValue) => throw new Exception(s"Positional parameters may not be ysed after named parameters in a function call.")
        case o                                                             => throw new Exception(s"$o not handeled in: FunctionCallUtil.zipParameterValuesWithDefs()")
      }
      zipped.reverse
    }
  }  
  
  implicit class ExpressionUtil(protected val e: Expression) extends AnyVal {
    def asFunctionCallDef: Option[FunctionDef] = e match {
      case f: FunctionCall => Option(f.getMethod)
      case _               => None
    }
  }
  
  implicit class ValDefUtil(protected val v: ValDef) extends AnyVal {
    def isStreamDef = v.getValue.asFunctionCallDef.fold(false)(_.isStreamDef)
    def isSinkDef = v.getValue.asFunctionCallDef.fold(false)(_.isSinkDef)
    def getStreamNodeDefinition:Option[StreamNodeDefinition] = v.getValue.asFunctionCallDef.flatMap{_.getStreamNodeDefinition}
    def getMaterializedType:Option[String] = getStreamNodeDefinition.flatMap{_.getMaterializedType}      
//    def getInletParameters = v.getValue.asFunctionCallDef.map{_.getInletParameters}.getOrElse(Nil)
//    def getOutletParameters = v.getValue.asFunctionCallDef.map{_.getOutletParameters}.getOrElse(Nil)    
//    
//    def generateImplicitAssignments:List[Assignment] = {
//      val parameterValuesWithDefs = v.getValue.asFunctionCall.map{fc => fc.zipParameterValuesWithDefs}.getOrElse(Nil)
////      println(parameterValuesWithDefs.mkString("\n"))
//      
//      val f = KronusFactory.eINSTANCE
//      val implicitAssignments = parameterValuesWithDefs.collect{
//        case(parmValue,parmDef) if(parmDef.isInlet)  => {
//          val assignment = f.createAssignment()
//          assignment.setRhs(parmValue.getValue.asValDef.getOrElse(throw new Exception("Stream connections must be direct references.")))
//          assignment.setLhs(v)
//          assignment
//        }
//        case(parmValue,parmDef) if(parmDef.isOutlet) => {
//          val assignment = f.createAssignment()
//          assignment.setRhs(v)
//          assignment.setLhs(parmValue.getValue.asValDef.getOrElse(throw new Exception("Stream connections must be direct references.")))                    
//          assignment
//        }        
//      }
//      implicitAssignments
//    }
  }
  
  implicit class KronusUtil(protected val kronus: Kronus) extends AnyVal {
    def findTypeByName(name:String):Option[TypeDef]   = kronus.collectDefs[TypeDef].find { t => t.getName == name }
    def lookupTypeByName(name:String):Option[TypeDef] = findTypeByName(name).orElse {
      kronus.parent[Kronus].flatMap(_.lookupTypeByName(name))
    }
  }
  
  case class StreamNodeDefinition(h:HashtagCall) {
    case class IOLetDef(name:String,ioType:String)

    def getInlets:List[String]             = h.getParameterValues.find{v => v.getName == "in"}.map{_.getValue.split(",").toList}.getOrElse(Nil)
    def getInletType:Option[TypeDef]       = for {
      value <- h.getParameterValues.find{v => v.getName == "inType"}.map{_.getValue}
      parent <- h.parent[Kronus]
      typeDef <- parent.lookupTypeByName(value)
    } yield typeDef
    
    def getOutlets:List[String]            = h.getParameterValues.find{v => v.getName == "out"}.map{_.getValue.split(",").toList}.getOrElse(Nil)
    def getOutletType:Option[TypeDef]      = for{
      value <- h.getParameterValues.find{v => v.getName == "outType"}.map{_.getValue}
      parent <- h.parent[Kronus]
      typeDef <- parent.lookupTypeByName(value)
    } yield typeDef
    def getMaterializedType:Option[String] = h.getParameterValues.find{v => v.getName == "materializedType"}.map{_.getValue}.orElse(if(isSinkDef) Some("Unit") else None)
    def getName:Option[String]             = h.getParameterValues.find{v => v.getName == "name"}.map{_.getValue}
    
    def isSinkDef:Boolean = getOutlets.isEmpty
    def isSourceDef:Boolean = getInlets.isEmpty
  }
  
  implicit class AnnotatedDefUtil(protected val a: AnnotatedDef) extends AnyVal {
    def isStreamDef:Boolean = getStreamNodeHashtagCall.isDefined
    def isSinkDef:Boolean = getStreamNodeDefinition.fold(false)(_.isSinkDef)

    def getStreamNodeHashtagCall:Option[HashtagCall] = a.getHashtags.collectFirst {
      case h if h.getMethod.getName == "StreamNode" => h
    }

    def getStreamNodeDefinition:Option[StreamNodeDefinition] = getStreamNodeHashtagCall.map{StreamNodeDefinition(_)}
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
