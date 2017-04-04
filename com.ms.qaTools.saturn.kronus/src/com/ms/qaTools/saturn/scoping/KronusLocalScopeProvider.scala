package com.ms.qaTools.saturn.scoping

import java.util.Collections

import org.eclipse.emf.ecore.{EObject, EReference}
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider

import com.ms.qaTools.saturn.kronus.IncludeDef

class KronusLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
  @com.google.inject.Inject protected var qualifiedNameConverter: IQualifiedNameConverter = _

  def qualifiedNameDelimiter = qualifiedNameConverter.asInstanceOf[IQualifiedNameConverter.DefaultImpl].getDelimiter
  def importAllFrom(namespace: String) = namespace + qualifiedNameDelimiter + getWildCard

  override protected def getImportedNamespace(obj: EObject) = obj match {
    case inc: IncludeDef if inc.getName == null => importAllFrom(inc.getModule)
    case _                                      => null
  }

  def namedIncludeScope(res: Resource, namespace: String, reference: EReference): IScope = {
    val ignoreCase = isIgnoreCase(reference)
    val normalizer = createImportedNamespaceResolver(importAllFrom(namespace), ignoreCase)
    createImportScope(getGlobalScope(res, reference),
                      Collections.singletonList(normalizer),
                      null,
                      reference.getEReferenceType,
                      ignoreCase)
  }
}
