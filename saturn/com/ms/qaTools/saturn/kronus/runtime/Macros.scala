package com.ms.qaTools.saturn.kronus.runtime

import scala.reflect.macros.blackbox.{Context => MContext}

// Warning: macros do not play well with -Ydelambdafy:method, causing "symbol does not exist" error
object Macros {
  def contextUop[A](op: String)(c: MContext) = {
    import c.universe._
    val opTerm = TermName(s"unary_$op")
    q"${c.prefix.tree}.map(_.$opTerm)"
  }

  def contextBang[A](c: MContext) = contextUop[A]("$bang")(c)
  def contextMinusU[A](c: MContext) = contextUop[A]("$minus")(c)

  def contextBop[A](op: String)(c: MContext)(that: c.Expr[Context[_]]) = {
    import c.universe._
    val Seq(l, r) = Seq("left$", "right$").map(prefix => TermName(c.freshName(prefix)))
    q"for ($l <- ${c.prefix.tree}; $r <- ${that.tree}) yield $l ${TermName(op)} $r"
  }

  def contextPlus     [A](c: MContext)(that: c.Expr[Context[_]]) = contextBop[A]("$plus")(c)(that)
  def contextMinus    [A](c: MContext)(that: c.Expr[Context[_]]) = contextBop[A]("$minus")(c)(that)
  def contextTimes    [A](c: MContext)(that: c.Expr[Context[_]]) = contextBop[A]("$times")(c)(that)
  def contextDiv      [A](c: MContext)(that: c.Expr[Context[_]]) = contextBop[A]("$div")(c)(that)
  def contextLess     [A](c: MContext)(that: c.Expr[Context[_]]) = contextBop[A]("$less")(c)(that)
  def contextLessEq   [A](c: MContext)(that: c.Expr[Context[_]]) = contextBop[A]("$less$eq")(c)(that)
  def contextGreater  [A](c: MContext)(that: c.Expr[Context[_]]) = contextBop[A]("$greater")(c)(that)
  def contextGreaterEq[A](c: MContext)(that: c.Expr[Context[_]]) = contextBop[A]("$greater$eq")(c)(that)
  def contextEqEq     [A](c: MContext)(that: c.Expr[Context[_]]) = contextBop[A]("$eq$eq")(c)(that)
  def contextBangEq   [A](c: MContext)(that: c.Expr[Context[_]]) = contextBop[A]("$bang$eq")(c)(that)
  def contextAmpAmp   [A](c: MContext)(that: c.Expr[Context[_]]) = contextBop[A]("$amp$amp")(c)(that)
  def contextBarBar   [A](c: MContext)(that: c.Expr[Context[_]]) = contextBop[A]("$bar$bar")(c)(that)
}
