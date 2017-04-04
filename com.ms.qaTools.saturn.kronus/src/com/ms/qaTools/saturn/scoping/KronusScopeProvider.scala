package com.ms.qaTools.saturn.scoping

import org.eclipse.emf.ecore.{EObject, EReference}
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

import com.ms.qaTools.saturn.kronus.FunctionCall
import com.ms.qaTools.saturn.kronus.IncludeRef
import com.ms.qaTools.saturn.kronus.ValRef

class KronusScopeProvider extends AbstractDeclarativeScopeProvider {
  override def getDelegate: KronusLocalScopeProvider = super.getDelegate.asInstanceOf[KronusLocalScopeProvider]

  protected def getIncludeScope(context: EObject, ref: EReference): IScope = context.eContainer match {
    case incRef: IncludeRef => getDelegate.namedIncludeScope(incRef.eResource, incRef.getInclude.getModule, ref)
    case _                  => delegateGetScope(context, ref)
  }

  def scope_ValRef_ref(vr: ValRef, ref: EReference): IScope = getIncludeScope(vr, ref)
  def scope_FunctionCall_method(fc: FunctionCall, ref: EReference): IScope = getIncludeScope(fc, ref)
}
