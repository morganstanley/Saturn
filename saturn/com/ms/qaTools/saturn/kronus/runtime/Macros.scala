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
