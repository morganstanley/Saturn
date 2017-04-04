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
