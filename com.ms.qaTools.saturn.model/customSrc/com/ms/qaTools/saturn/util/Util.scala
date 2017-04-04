package com.ms.qaTools.saturn.util

import java.util.Collection

import scala.collection.JavaConversions._

import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IMarker
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EValidator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.util.FeatureMapUtil

import com.ms.qaTools.saturn.SaturnPackage
import com.ms.qaTools.saturn.values.ComplexValue
import com.ms.qaTools.saturn.values.ValuesFactory
import com.ms.qaTools.saturn.values.ValuesPackage

object Util {
  /** "splitCamelCase" -> "Split Camel Case" */
  def splitCamelCase(s: String): String =
    s.replaceAll(String.format("%s|%s|%s",
                               "(?<=[A-Z])(?=[A-Z][a-z])", "(?<=[^A-Z])(?=[A-Z])", "(?<=[A-Za-z])(?=[^A-Za-z])"),
                 " ").capitalize

  def stringToComplexValue(s: String): ComplexValue = {
    val v = ValuesFactory.eINSTANCE.createComplexValue
    val t = ValuesFactory.eINSTANCE.createTextComplexValue
    t.setText(s)
    v.getMixed.add(FeatureMapUtil.createEntry(ValuesPackage.eINSTANCE.getComplexValue_Text, t))
    v
  }

  def descriptionOf(x: ENamedElement): String = Option(x.getEAnnotation(SaturnPackage.eNS_URI)).map {
    _.getDetails.get("description")
  }.getOrElse(splitCamelCase(x.getName))

  def subClasses(cls: EClass): Collection[EClass] = EPackage.Registry.INSTANCE.values flatMap {
    case pkg: EPackage => pkg.getEClassifiers collect {
      case c: EClass if c.getESuperTypes.contains(cls) => c
    }
    case _ => Nil
  }

  def toIFile(resource: Resource): Option[IFile] = {
    val uri = resource.getResourceSet.getURIConverter.normalize(resource.getURI)
    if (uri.scheme == "platform" && uri.segments.headOption == Some("resource"))
      Option(ResourcesPlugin.getWorkspace.getRoot.getFile(new Path(uri.segments.tail.mkString("/", "/", ""))))
    else
      None
  }

  def createMarkers(file: IFile, diagnostic: Diagnostic) {
    def createMarker(diag: Diagnostic, parentMsg: String = "") {
      val s = diag.getSeverity match {
        case s if s < Diagnostic.WARNING => IMarker.SEVERITY_INFO
        case s if s < Diagnostic.ERROR   => IMarker.SEVERITY_WARNING
        case _                           => IMarker.SEVERITY_ERROR
      }
      if (s >= IMarker.SEVERITY_WARNING) {
        val m = file.createMarker(EValidator.MARKER)
        m.setAttribute(IMarker.SEVERITY, s)
        m.setAttribute(IMarker.MESSAGE, parentMsg + diag.getMessage)
        diagnostic.getData.headOption match {
          case Some(e: EObject) => m.setAttribute(EValidator.URI_ATTRIBUTE, EcoreUtil.getURI(e).toString)
          case _                =>
        }
      }
    }
    diagnostic.getChildren match {
      case ds if ds.nonEmpty => ds.foreach(createMarker(_, diagnostic.getMessage + ". "))
      case _                 => createMarker(diagnostic)
    }
  }

  def updateMarkers(file: IFile, diagnostics: Collection[Diagnostic]) {
    file.deleteMarkers(EValidator.MARKER, true, IResource.DEPTH_ZERO)
    diagnostics.foreach(createMarkers(file, _))
  }

  protected val RunGroupIDRegex = """(\w*)/(\w*):(\w*)\s?.*""".r
  def parseRunGroupID(runGroupID: String): Option[(String, String, String)] = runGroupID match {
    case RunGroupIDRegex(domain, project, id) => Some((domain, project, id))
    case _                                    => None
  }
}

class Util protected
