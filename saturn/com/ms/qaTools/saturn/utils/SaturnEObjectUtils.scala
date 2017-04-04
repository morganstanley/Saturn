package com.ms.qaTools.saturn.utils
import com.ms.qaTools.saturn.{AbstractParameter => MAbstractParameter}
import com.ms.qaTools.saturn.{AbstractRunGroup => MAbstractRunGroup}
import com.ms.qaTools.saturn.{Attribute => MAttribute}
import com.ms.qaTools.saturn.{AttributeParameter => MAttributeParameter}
import com.ms.qaTools.saturn.{CustomLink => MCustomLink}
import com.ms.qaTools.saturn.{DocumentRoot => MDocumentRoot}
import com.ms.qaTools.saturn.{IncludeFile => MIncludeFile}
import com.ms.qaTools.saturn.{Saturn => MSaturn}
import com.ms.qaTools.saturn.codeGen.SaturnCodeGenUtil
import com.ms.qaTools.saturn.modules.procedureCallModule.{AbstractArgument => MAbstractArgument}
import com.ms.qaTools.saturn.repetition.{ColumnMapping => MColumnMapping}
import com.ms.qaTools.saturn.repetition.{ForEachRepetition => MForEachRepetition}
import com.ms.qaTools.saturn.repetition.{ForEachXPathRepetition => MForEachXPathRepetition}
import com.ms.qaTools.saturn.repetition.{ForRepetitionIterator => MForRepetitionIterator}
import com.ms.qaTools.saturn.repetition.{ForRepetition => MForRepetition}
import com.ms.qaTools.saturn.repetition.{XPathMapping => MXPathMapping}
import com.ms.qaTools.saturn.{ResourceParameter => MResourceParameter}
import com.ms.qaTools.saturn.resources.referenceResource.{ReferenceResource => MReferenceResource}
import com.ms.qaTools.saturn.SaturnPackage
import com.ms.qaTools.saturn.types.{NamedResourceDefinition => MNamedResourceDefinition}
import com.ms.qaTools.saturn.values.{ReferenceComplexValue => MReferenceComplexValue}
import org.eclipse.emf.ecore.EObject
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.JavaConversions.asScalaIterator

object SaturnEObjectUtils {
  implicit class SaturnEObjectHelper(eObject: EObject) {
    def eAllContentsWithThis() = Iterator(eObject) ++ eObject.eAllContents
      
    def eAllContentsByType[T:Manifest]() = eObject.eAllContentsWithThis().collect{ case r:T => r }
    def containingRunGroup():Option[MAbstractRunGroup] = Option(eObject) match {
      case Some(runGroup:MAbstractRunGroup) => Option(runGroup)
      case Some(somethingElse)              => somethingElse.eContainer().containingRunGroup
      case None                             => None
    }

    def containingRunGroups: Iterator[MAbstractRunGroup] =
      Iterator.iterate(eObject)(_.eContainer).takeWhile(_ != null) collect {case rg: MAbstractRunGroup => rg}
    
    def eAllNamedObjects(excludeInlineResources:Boolean=false): Iterator[(EObject,String)] = {
      val attributes = eObject.eAllContentsByType[MAttribute]().map{r => (r,r.getName)}
      val resources = {
        val r = eObject.eAllContentsByType[MNamedResourceDefinition]().map{r => (r,r.getName)}
        if(excludeInlineResources) r.filter{r => r._1.eContainingFeature() == SaturnPackage.eINSTANCE.getAbstractRunGroup_Resources()}
        else r
      }
      val runGroups = eObject.eAllContentsByType[MAbstractRunGroup]().map{r => (r,r.getName)}
      val columnMappings = eObject.eAllContentsByType[MColumnMapping]().map{r => (r,r.getAttribute)}
      val xPathMappings = eObject.eAllContentsByType[MXPathMapping]().map{r => (r,r.getAttribute)}
      val forIterators = eObject.eAllContentsByType[MForRepetitionIterator]().map{r => (r,r.getAttribute)}
      val parameters = eObject.eAllContentsByType[MAbstractParameter]().map{r => (r,r.getName())}
      val arguments = eObject.eAllContentsByType[MAbstractArgument]().map{r => (r,r.getName())}
      Seq(columnMappings, xPathMappings, forIterators, attributes, resources, runGroups, parameters, arguments).flatten.toIterator
    }
    
    def eObjectToPath():String = {
      def getParts(eObject:EObject, soFar:List[EObject] = Nil):List[EObject] = {
        if(eObject == null || eObject.isInstanceOf[MDocumentRoot]) soFar
        else getParts(eObject.eContainer(), eObject::soFar)
      }
      val parts = getParts(eObject)
      parts.map{part => part match {
        case r:MAttribute               => s"${r.eContainingFeature().getName()}=${r.eClass().getName()}(${r.getName})"
        case r:MReferenceResource       => s"""${r.eContainingFeature().getName()}=${r.eClass().getName()}(${r.getName} => ${if(r.getIncludeFile() == null || r.getIncludeFile().isEmpty()) "" else s"${r.getIncludeFile()}:"}${r.getResource()})"""
        case r:MNamedResourceDefinition => s"${r.eContainingFeature().getName()}=${r.eClass().getName()}(${r.getName})"
        case r:MColumnMapping           => s"${r.eContainingFeature().getName()}=${r.eClass().getName()}(${r.getAttribute})"
        case r:MForRepetitionIterator   => s"${r.eContainingFeature().getName()}=${r.eClass().getName()}(${r.getAttribute})"
        case r:MAbstractRunGroup        => s"${r.eContainingFeature().getName()}=${r.eClass().getName()}(${r.getName})"
        case r:MAbstractArgument        => s"${r.eContainingFeature().getName()}=${r.eClass().getName()}(${r.getName})"
        case r:MAbstractParameter       => s"${r.eContainingFeature().getName()}=${r.eClass().getName()}(${r.getName})"        
        case r:MReferenceComplexValue   => s"""${r.eContainingFeature().getName()}=${r.eClass().getName()}( => ${if(r.getIncludeFile() == null || r.getIncludeFile().isEmpty()) "" else s"${r.getIncludeFile()}:"}${r.getUserAttribute()})"""
        case r:EObject                  => s"${r.eContainingFeature().getName()}=${r.eClass().getName()}"
      }}.mkString(".")
    }
    
    def getDepth =
      Iterator.iterate(eObject)(_.eContainer).takeWhile(_ != null).size - 2

    def getEObjectRunGroup: Option[MAbstractRunGroup] =
      Option(eObject.eContainer).flatMap{
        case rg: MAbstractRunGroup => Option(rg)
        case o: EObject            => o.getEObjectRunGroup
      }

    def getResultContextName: String = eObject match {
      case r:MNamedResourceDefinition => r.eContainingFeature().getName() + "__" + r.eClass().getName() + "_" + r.getDepth
      case r:MAbstractRunGroup        => r.getName() + "_iteration"
      case _                          => ""
    }

    def resolveInclude(includeName: String): Option[MIncludeFile] = eObject match {
      case s:MSaturn           => s.getIncludeFiles().find{_.getName() == includeName}
      case r:MAbstractRunGroup => r.getIncludeFiles().find{_.getName() == includeName} match {
        case Some(i) => Some(i)
        case None    => r.eContainer.resolveInclude(includeName)
      }
      case _ => eObject.eContainer.resolveInclude(includeName)
    }
  }
  
  implicit class AbstractRunGroupHelper(runGroup:MAbstractRunGroup) {
    def containsResourceNamed(name:String):Boolean = {
      (runGroup.getResources().exists(_.getName.equals(name))) ||
      (runGroup.isProcedure() && runGroup.getParameters().collect{case resParm:MResourceParameter => resParm}.exists(r => r.getName.equals(name))) ||
      (runGroup.eContainer().containingRunGroup match {
        case Some(parent) => parent.containsResourceNamed(name)
        case None         => false
      })}

    def containsAttributeNamed(name:String):Boolean = {
      (runGroup.getAttributes().exists(_.getName.equals(name))) ||    
      (runGroup.isProcedure() && runGroup.getParameters().collect{case attrParm:MAttributeParameter => attrParm}.exists(r => r.getName.equals(name))) ||
      (runGroup.getRepetitionHandler() != null && (runGroup.getRepetitionHandler() match {
        case forR: MForRepetition               => forR.getIterators().exists(_.getAttribute() equals name)
        case forEachR: MForEachRepetition       => forEachR.getColumnMappings().exists(_.getAttribute() equals name)
        case forXPathR: MForEachXPathRepetition => forXPathR.getXPathMappings().exists(_.getAttribute() equals name)
      })) ||
      (runGroup.eContainer().containingRunGroup match {
        case Some(parent) => parent.containsAttributeNamed(name)
        case None         => false
      })}

    def isEnabledDeep(): Boolean = {
      val parent = runGroup.eContainer().containingRunGroup
      runGroup.isEnabled && parent.map(_.isEnabledDeep).getOrElse(true)
    }
  }
  
  implicit class ReferenceResourceHelper(ref:MReferenceResource) {
    def isValidReference:Boolean = {
      if(ref.getIncludeFile() != null && !ref.getIncludeFile().isEmpty()) false
      else ref.containingRunGroup match {
        case Some(parent:MAbstractRunGroup) => parent.containsResourceNamed(ref.getResource())
        case None                           => false
      }
    }

    def isEnabledDeep = ref.isEnabled && ref.containingRunGroup.map(_.isEnabledDeep).getOrElse(true)

    def referencedContainers(implicit codeGenUtil: SaturnCodeGenUtil): Iterator[MAbstractRunGroup] =
      ref.getIncludeFile match {
        case null =>
          ref.containingRunGroups
        case inc if inc.nonEmpty =>
          val (s, _) = codeGenUtil.includeFileMap(ref.resolveInclude(inc).get)
          Iterator(s)
      }

    def deref(implicit codeGenUtil: SaturnCodeGenUtil): Option[MNamedResourceDefinition] =
      referencedContainers.flatMap(_.getResources.find(_.getName == ref.getResource)).toStream.headOption
  }

  implicit class ReferenceComplexValueResourceHelper(ref: MReferenceComplexValue) {
    def containingCustomLink = Iterator.iterate[EObject](ref)(_.eContainer()).takeWhile(_ != null).collectFirst{case x: MCustomLink => x}

    def isValidReference: Boolean =
      if (ref.getIncludeFile() != null && !ref.getIncludeFile().isEmpty()) false
      else {
        val containingRunGroup = containingCustomLink.map(_.getSource.containingRunGroup).getOrElse(ref.containingRunGroup)
        containingRunGroup.fold(false) { rg =>
          rg.containsAttributeNamed(ref.getUserAttribute) || rg.containsResourceNamed(ref.getUserAttribute)
        }
      }

    def isEnabledDeep = ref.containingRunGroup.map(rg => rg.isEnabledDeep).getOrElse(true)
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
