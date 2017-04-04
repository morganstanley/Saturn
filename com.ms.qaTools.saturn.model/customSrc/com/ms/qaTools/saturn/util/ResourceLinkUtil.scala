package com.ms.qaTools.saturn.util

import java.util.Collection

import scala.annotation.tailrec
import scala.collection.JavaConversions._

import org.eclipse.emf.ecore.EObject

import com.ms.qaTools.saturn.AbstractResourceLink
import com.ms.qaTools.saturn.AbstractRunGroup
import com.ms.qaTools.saturn.AbstractStep
import com.ms.qaTools.saturn.ResourceLink
import com.ms.qaTools.saturn.ResourceNestedLink
import com.ms.qaTools.saturn.ResourceStepLink
import com.ms.qaTools.saturn.RunGroup
import com.ms.qaTools.saturn.Saturn
import com.ms.qaTools.saturn.SaturnFactory
import com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource
import com.ms.qaTools.saturn.types.NamedResourceDefinition

object ResourceLinkUtil {
  type NamedEObject = EObject {
    def getName(): String
  }

  def populateResourceLinks(saturn: Saturn): Unit = saturn.getResourceLinks.addAll(allAbstractResourceLinks(saturn))

  def allAbstractResourceLinks(saturn: Saturn): Iterable[AbstractResourceLink] = saturn.eAllContents.flatMap {
    case ref: ReferenceResource => for {
      res <- findReferencedResource(ref)
      l   <- createAbstractResourceLink(res, ref)
    } yield {
      ref.setLink(l)
      l
    }
    case _ => None
  }.toIterable

  def findReferencedResource(ref: ReferenceResource): Option[NamedResourceDefinition] =
    if (ref.isAdvanced) None
    else if (ref.getIncludeFile != null && ref.getIncludeFile.nonEmpty) None
    else findNamedResource(ref.getResource, ref.eContainer)

  @tailrec def findNamedResource(name: String, container: EObject): Option[NamedResourceDefinition] = container match {
    case null => None
    case arg: AbstractRunGroup => arg.getResources.find(_.getName == name) match {
      case x@Some(_) => x
      case None      => findNamedResource(name, arg.eContainer)
    }
    case _ => findNamedResource(name, container.eContainer)
  }

  def createAbstractResourceLink(source: NamedResourceDefinition,
                                 target: ReferenceResource): Option[AbstractResourceLink] =
    linkableTarget(source, target) match {
      case t: ReferenceResource       => Some(createResourceLink(source, target))
      case t: AbstractStep            => Some(createResourceStepLink(source, target, t))
      case t: NamedResourceDefinition => Some(createResourceNestedLink(source, target, t))
      case t                          => None
    }

  @tailrec def linkableTarget(source: EObject, target: EObject): EObject = target.eContainer match {
    case _: RunGroup => target
    case t           => linkableTarget(source, t)
  }

  def createResourceLink(source: NamedResourceDefinition, target: ReferenceResource): ResourceLink =
    setupAbstractResourceLink(SaturnFactory.eINSTANCE.createResourceLink, source, target)

  def createResourceStepLink(source:     NamedResourceDefinition,
                             target:     ReferenceResource,
                             targetStep: AbstractStep): ResourceStepLink = {
    val l = setupAbstractResourceLink(SaturnFactory.eINSTANCE.createResourceStepLink, source, target)
    l.setTargetStep(targetStep)
    l.setDescription(Util.descriptionOf(target.eContainingFeature))
    l
  }

  def createResourceNestedLink(source:                  NamedResourceDefinition,
                               target:                  ReferenceResource,
                               targetEnclosingResource: NamedResourceDefinition): ResourceNestedLink = {
    val l = setupAbstractResourceLink(SaturnFactory.eINSTANCE.createResourceNestedLink, source, target)
    l.setTargetEnclosingResource(targetEnclosingResource)
    l
  }

  def setupAbstractResourceLink[A <: AbstractResourceLink](link:   A,
                                                           source: NamedResourceDefinition,
                                                           target: ReferenceResource): A = {
    link.setSource(source)
    link.setTarget(target)
    link
  }

  def allReferenceResources(container: EObject): Collection[ReferenceResource] = {
    val children = container.eAllContents.collect {
      case ref: ReferenceResource => ref
    }.toList
    container match {
      case ref: ReferenceResource => ref :: children
      case _                      => children
    }
  }

  def fullPath(x: NamedEObject): String = {
    def path(x: EObject): List[String] = x match {
      case null                => Nil
      case x: AbstractRunGroup => x.getName :: path(x.eContainer)
      case _                   => path(x.eContainer)
    }
    (x.getName :: path(x.eContainer)).reverse.mkString(".")
  }

  def included(resource: NamedResourceDefinition): Boolean = resource match {
    case ref: ReferenceResource => ref.getIncludeFile != null
    case _                      => false
  }

  def validateResourceLink(source: NamedResourceDefinition, target: NamedEObject): Option[String] = {
    val s = fullPath(source)
    val t = fullPath(target)
    @tailrec def referenceableFrom(x: EObject): Boolean = if (x == source.eContainer) true
                                                          else if (x == null) false
                                                          else referenceableFrom(x.eContainer)
    if (source == target)                Some(s"Self pointing link in $s")
    else if (!referenceableFrom(target)) Some(s"Cannot reach $s from $t")
    else                                 None
  }

  def validateResourceLink(link: AbstractResourceLink): Option[String] = link match {
    case l: ResourceLink       => validateResourceLink(l.getSource, l.getTarget)
    case l: ResourceStepLink   => validateResourceLink(l.getSource, l.getTargetStep)
    case l: ResourceNestedLink => validateResourceLink(l.getSource, l.getTargetEnclosingResource)
    case l                     => Some(s"Unknown link type: $l")
  }

  def canExistResourceLink(source: NamedResourceDefinition, target: NamedEObject): Boolean =
    target == null || validateResourceLink(source, target).isEmpty && !included(source)
}

class ResourceLinkUtil // Workaround the `Unable to install breakpoint' bug in Eclipse
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
