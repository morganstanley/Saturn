package com.ms.qaTools.saturn.kronus.runtime

import scala.annotation.tailrec
import scala.concurrent.ExecutionContext

import com.ms.qaTools.saturn.kronus.Location

abstract class Scope extends MetaData {
  def name: String
  def parent: Option[Scope]
  def sourceLocation: Option[Location]
  def entity: Option[ConstellationEntity]
  def annotations: Seq[DynamicAnnotation]

  def parents: Iterator[Scope] = Iterator.iterate(parent.orNull)(_.parent.orNull).takeWhile(_ != null)
  def parentEntity: Option[ConstellationEntity] = parents.map(_.entity).collectFirst {case Some(e) => e}
  protected def fullNameSegment: String = name
  def fullName: String = (fullNameSegment +: parents.map(_.fullNameSegment).toSeq).reverse.mkString(".")
  override def toString = s"${getClass.getSimpleName}($fullName)"

  /** Lowest common ancestor */
  def lca(that: Scope): Scope = {
    @tailrec def common[A](xs: Seq[A], ys: Seq[A], soFar: Seq[A]): Seq[A] = (xs, ys) match {
      case (x +: xs, y +: ys) if x == y => common(xs, ys, x +: soFar)
      case _                            => soFar
    }
    val Seq(xs, ys) = Seq(this, that).map(_.parents.toSeq.reverse)
    common(xs, ys, Nil).head
  }
}

class ValDefScope(val name: String,
                  val parent: Option[Scope],
                  val sourceLocation: Option[Location],
                  val annotations: Seq[DynamicAnnotation])
                 (implicit constellationClient: IConstellationClient, executor: ExecutionContext) extends Scope {
  val entity = Some(parentEntity.fold(new ConstellationEntity(name))(_.newChild(name)))
}

class ParameterValueScope(val name: String, val parent: Some[FunctionCallScope]) extends Scope {
  def sourceLocation = parent.get.sourceLocation

  val entity = Some {
    parentEntity.getOrElse(sys.error(s"Fail to find parent entity of $this")).newChild(s"${parent.get.name}.$name")
  }

  def annotations = Nil
}

class FunctionCallScope(val name: String,
                        val parent: Some[Scope],
                        val sourceLocation: Option[Location]) extends Scope {
  override protected def fullNameSegment = s"($name)"
  def entity = None
  def annotations = Nil
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
