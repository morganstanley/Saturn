package com.ms.qaTools.saturn.runtime

import scala.collection.immutable.ListMap
import com.ms.qaTools.saturn.dsl.annotation.ScenarioAnnotation

// TODO Rename to ResultBuilder

trait ResultContext {
  def appendAttribute(a:AttributeResult)
  def appendComplexValue(c:ComplexValueResult)
  def appendResourceContext(name:String, resourceType:String):ResourceResultContext
}

case object NullResultContext extends ResultContext {
  def appendAttribute(a:AttributeResult) = Unit
  def appendComplexValue(c:ComplexValueResult) = Unit
  def appendResourceContext(name:String, resourceType:String):ResourceResultContext = null
}

trait SaturnResultContext extends ResultContext {
  var attributes:List[AttributeResult] = Nil
  var resourceContexts:Map[String, ResourceResultContext] = ListMap()
  var complexValues:List[ComplexValueResult] = Nil
  var metaDataContexts: Map[String, MetaDataResultContext] = ListMap()
  var scenarioAnnotations: List[ScenarioAnnotation] = Nil
  
  def appendAttribute(a:AttributeResult)        = attributes = a :: attributes
  def appendComplexValue(c:ComplexValueResult)     = complexValues = c :: complexValues
  def appendMetaDataContext[T](name: String, metaData: Option[T]) = {
    val metaDataContext = new MetaDataResultContext(name,metaData)
    metaDataContexts = metaDataContexts + ((name, metaDataContext))
    metaDataContext
  }
  
  def appendResourceContext(name:String, resourceType:String):ResourceResultContext = {
    val resourceContext = new ResourceResultContext(name,resourceType)
    resourceContexts = resourceContexts + ((name, resourceContext)) 
    resourceContext
  }  
  
  def appendScenarioAnnotation(s: ScenarioAnnotation) = scenarioAnnotations = scenarioAnnotations :+ s
}

class IteratorResultContext() extends SaturnResultContext {
  var iterationContexts:List[IterationResultContext] = Nil
  def appendIterationContext() = {
    val iterationContext = new IterationResultContext()
    iterationContexts = iterationContext :: iterationContexts 
    iterationContext
  }
  
  override def toString = "IteratorResultContext(resources=[" + resourceContexts.map{_.toString}.mkString("\n") + "],\n" +
                          "                      complexValues=[" + complexValues.map{_.toString}.mkString("\n")+"],\n" +
                          "                      attributes=[" + attributes.map{_.toString}.mkString("\n")+"],\n" +
                          "                      iterationContexts=" +iterationContexts.map{_.toString}.mkString("\n") + ")"
}

class IterationResultContext() extends SaturnResultContext {
  var iteratorContexts:List[IteratorResultContext] = Nil
  def appendIteratorContext() = {
    val iteratorContext = new IteratorResultContext()
    iteratorContexts = iteratorContext :: iteratorContexts 
    iteratorContext
  }
  
  override def toString = "IterationResultContext(resources=[" + resourceContexts.map{_.toString}.mkString("\n") + "],\n" +
                          "                       complexValues=[" + complexValues.map{_.toString}.mkString("\n")+"],\n" +
                          "                       attributes=[" + attributes.map{_.toString}.mkString("\n")+"],\n" +
                          "                       iteratorContexts=" +iteratorContexts.map{_.toString}.mkString("\n") + ")"
}

class ResourceResultContext(val name:String, val resourceType:String) extends SaturnResultContext {
  override def toString = "ResourceResultContext(name=" + name + ",\n" +
                          "                      resourceType=" + resourceType + ",\n" +
                          "                      resources=[" + resourceContexts.map{_.toString}.mkString("\n") + "],\n" +
                          "                      metaDataContexts=[" + metaDataContexts.map{_.toString}.mkString("\n") + "],\n" +
                          "                      complexValues=[" + complexValues.map{_.toString}.mkString("\n")+"],\n" +
                          "                      attributes=[" + attributes.map{_.toString}.mkString("\n")+"])" 
}

class MetaDataResultContext(val name: String, val metaData: Option[Any] = None) extends SaturnResultContext {
  override def toString = "MetaDataResultContext(name=" + name + ",\n" +
                          "                      metaData=" + metaData + ",\n" +
                          "                      metaDataContexts=[" + metaDataContexts.map{_.toString}.mkString("\n") + "])"
}
object MetaDataResultContext {
  def apply(name: String, metaData: Option[Any] = None) = new MetaDataResultContext(name, metaData)
}

object IteratorResultContext {
  def apply() = new IteratorResultContext()
  def apply(parentContext:IterationResultContext) = parentContext.appendIteratorContext()
}

object IterationResultContext {
  def apply() = new IterationResultContext()
  def apply(parentContext:IteratorResultContext) = parentContext.appendIterationContext()
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
