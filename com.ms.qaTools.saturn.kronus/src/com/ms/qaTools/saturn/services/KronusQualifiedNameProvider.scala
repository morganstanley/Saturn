package com.ms.qaTools.saturn.services

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.util.Strings

import com.ms.qaTools.saturn.kronus._

class KronusQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
  override def getFullyQualifiedName(obj: EObject): QualifiedName = {
    val segments = (Iterator(obj) ++ obj.eContainers).map {
      case toplvl: TopLevelKronus => toplvl.getPackage.getModule
      case x                      => getResolver.apply(x)
    }.buffered
    if (Strings.isEmpty(segments.head)) return null
    segments.filter(_ != null).map(getConverter.toQualifiedName).reduceRight((x, xs) => xs append x)
  }
}
