package com.ms.qaTools.saturn.codeGen

import java.io.Closeable
import java.net.URL
import java.util.{List => JList}

import scala.collection.JavaConverters._
import scala.collection.mutable.LinkedHashMap
import scala.collection.mutable.ListBuffer
import scala.util.Failure
import scala.util.Success
import scala.util.Try

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil
import org.eclipse.gmf.runtime.emf.core.resources.GMFResourceFactory
import org.eclipse.gmf.runtime.notation.BasicCompartment
import org.eclipse.gmf.runtime.notation.Diagram
import org.eclipse.gmf.runtime.notation.NotationPackage
import org.eclipse.gmf.runtime.notation.View

import com.ms.qaTools.saturn.AbstractRunGroup
import com.ms.qaTools.saturn.DocumentRoot
import com.ms.qaTools.saturn.KronusStep
import com.ms.qaTools.saturn.RunGroup
import com.ms.qaTools.saturn.Saturn
import com.ms.qaTools.saturn.SaturnPackage
import com.ms.qaTools.saturn.codeGen.notifier.report.MetaData
import com.ms.qaTools.saturn.kronus.runtime.ConstellationDecoration
import com.ms.qaTools.saturn.kronus.runtime.ConstellationEntity
import com.ms.qaTools.saturn.kronus.runtime.Scope
import com.ms.qaTools.saturn.repetition.{ ForRepetition, ForEachRepetition, ForEachXPathRepetition }
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext
import com.ms.qaTools.saturn.runtime.WriteOnlyJsonFormat
import com.ms.qaTools.saturn.util.SaturnResourceFactoryImpl
import com.ms.qaTools.saturn.utils.SaturnEObjectJsonSupport
import com.ms.qaTools.saturn.utils.SaturnEObjectUtils._

import spray.json._, DefaultJsonProtocol._

case class Attribute(name: String, value: Either[String, Throwable])

trait AbstractContext {
  val metaDataContexts = LinkedHashMap[String, MetaDataContext]()
  val resourceContexts = LinkedHashMap[String, ResourceContext]()

  def appendMetaDataContext[T](name: String, metaData: T) = {
    val metaDataContext = MetaDataContext(name, Option(metaData))
    metaDataContexts += ((name, metaDataContext))
    metaDataContext
  }

  def appendResourceContext(name: String, resourceType: String) = {
    val resourceContext = ResourceContext(name, resourceType)
    resourceContexts += ((name, resourceContext))
    resourceContext
  }
}

abstract class Context(implicit sc: SaturnExecutionContext)
extends Scope with AbstractContext with ConstellationDecoration.HighPriorityFromImplicits {
  def parent: Option[Context]
  def getFullContextName: String
  def constellationEntityName: String
  def model: AbstractRunGroup

  val closeableResources = ListBuffer[Closeable]()
  val complexValues = ListBuffer[Context.ComplexValue]()
  val attributes = ListBuffer[Attribute]()

  val constellationEntity: ConstellationEntity = parent match {
    case None    => ConstellationEntity(constellationEntityName)(sc.toKronusRunParameters)
    case Some(p) => p.constellationEntity.newChild(constellationEntityName)
  }

  def sourceLocation = None
  def entity = Some(constellationEntity)
  def annotations = Nil

  def constellationDecorationFromAttributeOrResource[A: ConstellationDecoration.From](model: EObject): ConstellationDecoration.From[A] = {
    new ConstellationDecoration.From[A] {
      def from(x: A) = implicitly[ConstellationDecoration.From[A]].from(x).map { deco =>
        val json = JsObject("type" -> model.eClass.getName.toJson, "details" -> deco.decorationValue)
        ConstellationDecoration(ConstellationDecoration.ResultType, json)
      }
    }
  }

  protected def uploadAttributeOrResource[A: ConstellationDecoration.From]
                                         (name: String, model: EObject, result: Try[A]): Unit = {
    val entity = constellationEntity.newChild(name)
    entity.attachDecorations(Iterable(model.toConstellationDecoration))
    entity.complete(result, Nil)(constellationDecorationFromAttributeOrResource(model))
  }

  def attributeTry(valueTry: Try[String], name: String): Try[String] = {
    valueTry match {
      case Success(v) => attributes += Attribute(name, Left(v))
      case Failure(e) => attributes += Attribute(name, Right(e))
    }
    model.getAttributes.asScala.find(_.getName == name).orElse {
      model.getRepetitionHandler match {
        case rep: ForRepetition          => rep.getIterators.asScala.find(_.getAttribute == name)
        case rep: ForEachRepetition      => rep.getColumnMappings.asScala.find(_.getAttribute == name)
        case rep: ForEachXPathRepetition => rep.getXPathMappings.asScala.find(_.getAttribute == name)
        case null                        => None
      }
    }.orElse {
      model match {
        case model: KronusStep => model.getKronusCallConfiguration.getArguments.asScala.find(_.getName == name)
        case _                 => None
      }
    }.foreach(uploadAttributeOrResource(name, _, valueTry))
    valueTry
  }

  def connectTry[X: ConstellationDecoration.From](resourceTry: Try[X], name: String, isReference: Boolean): Try[X] = {
    resourceTry match {
      case Success(c: Closeable) if !isReference => closeableResources += c
      case _                                     =>
    }
    if (resourceContexts.contains(name)) {
      val resMod = model.getResources.asScala.find(_.getName == name).getOrElse {
        throw new NoSuchElementException(s"resource $name")
      }
      uploadAttributeOrResource(name, resMod, resourceTry)
    }
    resourceTry
  }

  def closeAll(): Unit = {
    closeableResources.foreach(sc.referenceCounter.removeOrClose)
    closeableResources.clear()
  }
}

case class IterationContext(p: IteratorContext, iterationNo: Option[Int])
                           (implicit sc: SaturnExecutionContext) extends Context {
  def parent = Some(p)
  def name = p.name

  // Skip the names of the IteratorContext - Get only the names of the Iteration context.
  def getFullContextName =
    p.parent.map(_.getFullContextName + ".").getOrElse("") + constellationEntityName

  def constellationEntityName = name + iterationNo.fold("")(i => s"[$i]")

  def model = p.model

  def uploadMeta(): Unit = constellationEntity.attachDecorations(MetaData.fromMetaDataContexts(model, metaDataContexts))

  def child(name: String, lexicalContext: Option[AIteratorContext])
           (implicit sc: SaturnExecutionContext): IteratorContext = {
    val parentC = lexicalContext.getOrElse(p)
    val parentM = parentC.model.asInstanceOf[RunGroup]
    val childM = parentM.getRunGroups.asScala.find(_.getName == name).getOrElse {
      throw new IllegalArgumentException(s"no step named $name can be found in ${parentM.eObjectToPath}")
    }
    val childV = parentC.view.flatMap { view =>
      view.getChildren.iterator.asScala.flatMap {
        case v: BasicCompartment => v.getChildren.asInstanceOf[JList[View]].asScala
        case v: View             => Some(v)
      }.find(ViewUtil.resolveSemanticElement(_) eq childM)
    }
    IteratorContext(childM, Some(this), childV)
  }
}

object AIteratorContext {
  ; { // Initialize global Resource.Factory.Registry and EPackage.Registry
    val ext2fact = org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap
    ext2fact.put("saturnDiagram", new GMFResourceFactory)
    ext2fact.put("saturn", new SaturnResourceFactoryImpl)
    val _ = Seq(SaturnPackage.eINSTANCE, NotationPackage.eINSTANCE)
  }

  object DiagramJsonSupport extends SaturnEObjectJsonSupport {
    override protected def writeWithPath(e: EObject, path: Seq[String]) = {
      val json = super.writeWithPath(e, path)
      ; {
        for {
          elementJson <- json.fields.get("element")
          semantic <- Option(e).collect { case e: View => ViewUtil.resolveSemanticElement(e) }
          nameAttr <- semantic.eClass.getEAllAttributes.asScala.find(_.getName == "name")
        } yield {
          val name = semantic.eGet(nameAttr).asInstanceOf[String]
          val fields = elementJson.asJsObject.fields ++ Option(name).map("name" -> _.toJson)
          JsObject(json.fields + ("element" -> JsObject(fields)))
        }
      }.getOrElse(json)
    }
  }

  protected[codeGen] def url2saturn(url: URL, viewURL: Option[URL]): (Saturn, Option[Diagram]) = {
    val resSet = new ResourceSetImpl
    val model = resSet.getResource(URI.createURI(url.toString), true).getContents.get(0).asInstanceOf[DocumentRoot].getSaturn
    val diagram = viewURL.map { url =>
      resSet.getResource(URI.createURI(url.toString), true).getContents.get(0).asInstanceOf[Diagram]
    }
    (model, diagram)
  }
}

abstract class AIteratorContext(implicit sc: SaturnExecutionContext) extends Context {
  def view: Option[View]

  constellationEntity.attachDecorations {
    view.map { view =>
      require(ViewUtil.resolveSemanticElement(view) eq model)
      val field = if (view.isInstanceOf[Diagram]) {
        import AIteratorContext.DiagramJsonSupport._
        "value" -> (view: EObject).toJson
      } else "path" -> EcoreUtil.getRelativeURIFragmentPath(null, view).toJson
      ConstellationDecoration(ConstellationDecoration.Type("Saturn3.Diagram"),
                              JsObject("type" -> view.eClass.getName.toJson, field))
    }
  }

  def getFullContextName: String = (parent.map(_.getFullContextName) ++ Seq(name)).mkString(".")
  def constellationEntityName = name

  def includeFile(name: String, url: URL, viewURL: Option[URL]) = {
    val (model, diag) = AIteratorContext.url2saturn(url, viewURL)
    IncludeFileContext(name, model, Some(this), diag)
  }
}

case class IncludeFileContext(name: String, model: Saturn, parent: Some[AIteratorContext], view: Option[Diagram])
                             (implicit sc: SaturnExecutionContext) extends AIteratorContext {
  override def closeAll() = {
    super.closeAll
    constellationEntity.complete(Success(()), Nil)
  }
}

object IteratorContext {
  def apply(modelUrl: URL, diagramUrl: Option[URL])(implicit sc: SaturnExecutionContext): IteratorContext = {
    val (model, diagram) = AIteratorContext.url2saturn(modelUrl, diagramUrl)
    apply(model, None, diagram)
  }
}

case class IteratorContext(model: AbstractRunGroup, parent: Option[IterationContext], view: Option[View])
                          (implicit sc: SaturnExecutionContext) extends AIteratorContext {
  def name = model.getName
  def uploadMeta(): Unit = constellationEntity.attachDecorations(Seq(model.toConstellationDecoration))
}

case class MetaDataContext(name: String, metaData: Option[Any]) extends AbstractContext

object MetaDataContext {
  implicit object JsonFormat extends WriteOnlyJsonFormat[MetaDataContext] {
    import DefaultJsonProtocol._

    def write(md: MetaDataContext) = {
      val key = md.metaData.map(_.toString)
      val value = if (md.metaDataContexts.isEmpty) key.toJson else {
        val value = toJson(md.metaDataContexts)
        key.fold(value)(k => JsObject(Map(k -> value)))
      }
      JsObject(Map(md.name -> value))
    }
  }

  def toJson(mds: collection.Map[String, MetaDataContext]): JsObject = {
    val builder = Map.newBuilder[String, JsValue]
    mds.mapValues(_.toJson).foreach {
      case (k, JsObject(fs)) if fs.keySet == Set(k) => builder += k -> fs(k)
      case kv                                       => builder += kv
    }
    JsObject(builder.result())
  }
}

case class ResourceContext(name: String, resourceType: String) extends AbstractContext

object Context {
  case class ComplexValue(name: String, value: Either[String, Throwable])
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
