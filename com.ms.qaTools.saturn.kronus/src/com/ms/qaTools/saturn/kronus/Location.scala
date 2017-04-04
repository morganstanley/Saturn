package com.ms.qaTools.saturn.kronus

import java.net.URI

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.nodemodel.util.NodeModelUtils

object Location {
  def fromEObject(x: EObject): Option[Location] = Option(NodeModelUtils.getNode(x)).map { node =>
    val topLevel = x.eContainers.toSeq.last.asInstanceOf[TopLevelKronus]
    new Location(topLevel.getPackage.getModule, getURI(x), node.getStartLine, node.getEndLine)
  }

  def getURI(x: EObject): Option[URI] = Option(x.eResource).map(r => new URI(r.getURI.toString))
}

class Location(val pkg: String, val uri: Option[URI], val startLine: Int, val endLine: Int) {
  override def toString = s"${uri.getOrElse(pkg)} from line $startLine to $endLine"
}
