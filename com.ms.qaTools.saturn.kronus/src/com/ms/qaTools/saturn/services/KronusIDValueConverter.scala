package com.ms.qaTools.saturn.services

import org.antlr.runtime.Token
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.conversion.impl.IDValueConverter

class KronusIDValueConverter extends IDValueConverter {
  override protected def getRuleName(token: Token) = {
    import scala.collection.JavaConversions._
    val name = super.getRuleName(token)
    val isID = getRule.getAlternatives.eContents.exists(_.asInstanceOf[RuleCall].getRule.getName == name)
    if (isID) getRuleName else name
  }
}
