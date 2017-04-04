package com.ms.qaTools.saturn

import java.net.URI

import scala.annotation.tailrec
import scala.collection.JavaConversions._

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.{XtextResource, XtextResourceSet}
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.validation.{IResourceValidator, CheckMode}

package object kronus {
  import scala.language.implicitConversions

  def deserialize(uris: Seq[URI]): Seq[TopLevelKronus] = {
    val injector = new KronusStandaloneSetup().createInjectorAndDoEMFRegistration
    val resourceSet = injector.getInstance(classOf[XtextResourceSet])
    val validator = injector.getInstance(classOf[IResourceValidator])
    resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, true)
    val pairs = uris.map(uri => (uri, resourceSet.getResource(uri, true)))
    if (!pairs.hasDefiniteSize) pairs.length
    for ((uri, resource) <- pairs) yield {
      val result = resource.asInstanceOf[XtextResource].getParseResult
      val issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl)
      if (!issues.isEmpty) throw new ParseErrors(issues.map(ParseError(_, uri, result.getRootNode.getText)))
      result.getRootASTElement.asInstanceOf[TopLevelKronus]
    }
  }

  implicit def javaUriAsEclipseUri(uri: URI): org.eclipse.emf.common.util.URI =
    org.eclipse.emf.common.util.URI.createURI(uri.toString)

  def topSort[A](nodes: Seq[(A, Set[A])]): (Seq[(A, Set[A])], Seq[A]) = {
    @tailrec def sort[A](nodes: Seq[(A, Set[A])], soFar: List[A]): (Seq[(A, Set[A])], List[A]) = {
      val (leave, nonLeave) = nodes.partition(_._2.isEmpty)
      if (leave.isEmpty) {
        (nonLeave, soFar.reverse)
      } else {
        val rs = leave.map(_._1)
        val newNodes = nonLeave.map {case (n, ms) => n -> (ms -- rs)}
        sort(newNodes, rs.foldLeft(soFar)((xs, x) => x :: xs))
      }
    }
    sort(nodes, Nil)
  }

  def locationInErrorMessage(loc: Option[Location]): String = loc.fold("")("\n\tin " + _)

  implicit class FunctionDefOps(self: FunctionDef) {
    def hashtags: Seq[Hashtag] = self.getHashtags.map(Hashtag.apply)
  }

  implicit class EObjectOps(self: EObject) {
    def eContainers: Iterator[EObject] = Iterator.iterate(self.eContainer)(_.eContainer).takeWhile(_ != null)
  }

  implicit def wrapTopLevelKronus(self: TopLevelKronus): WrappedTopLevelKronus = new WrappedTopLevelKronus(self)

  class WrappedTopLevelKronus(val self: TopLevelKronus) extends Proxy {
    val (pkg: Seq[String], clazz: String) = {
      val pkg :+ cls = self.getPackage.getModule.split('.').toSeq
      (pkg, cls)
    }

    def packageAndClass: (Seq[String], String) = (pkg, clazz)
    def app: String = clazz + "App"
    def appFQN: String = (pkg :+ app).mkString(".")
  }

  implicit class KronusFactoryOps(self: KronusFactory) {
    def newParameterValue(name: String, value: Expression): ParameterValue = {
      val pv = self.createKeywordParameterValue
      pv.setName(name)
      pv.setValue(value)
      pv
    }

    def newFunctionCall(method: FunctionDef, arguments: ParameterValue*): FunctionCall = {
      val fc = self.createFunctionCall
      fc.setMethod(method)
      fc.getParameterValues.addAll(arguments)
      fc
    }

    def newLiteral(value: String): StringLiteral = {
      val sl = self.createStringLiteral
      sl.setValue(value)
      sl
    }

    def newLiteral(value: Int): IntegerLiteral = {
      val il = self.createIntegerLiteral
      il.setValue(value)
      il
    }

    def newLiteral(value: Boolean): IntegerLiteral = newLiteral(if (value) 1 else 0)

    def newTypeInstance(name: TypeDef, arguments: TypeInstance*): TypeInstance = {
      val ti = self.createTypeInstance
      ti.setName(name)
      ti.getTypeParameters.addAll(arguments)
      ti
    }

    def newValRef(d: ReferenceableDefs): ValRef = {
      val vr = self.createValRef
      vr.setRef(d)
      vr
    }

    def newSequence(xs: Seq[Expression]): Sequence = {
      val seq = self.createSequence
      seq.getValues.addAll(xs)
      seq
    }

    def newParameterDef(name: String, typ: TypeInstance, defaultValue: Option[Expression]): ParameterDef = {
      val pd = self.createParameterDef
      pd.setName(name)
      defaultValue.foreach(pd.setDefaultValue)
      pd.setType(typ)
      pd
    }

    def newIncludeDef(module: String, name: Option[String]): IncludeDef = {
      val inc = self.createIncludeDef
      inc.setModule(module)
      inc.setName(name.orNull)
      inc
    }

    def newIncludeRef(inc: IncludeDef, v: Value): IncludeRef = {
      val iref = self.createIncludeRef
      iref.setInclude(inc)
      iref.setRef(v)
      iref
    }

    def newKronusCodeBlock(code: Kronus): KronusCodeBlock = {
      val blk = self.createKronusCodeBlock
      blk.setCode(code)
      blk
    }
  }
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
