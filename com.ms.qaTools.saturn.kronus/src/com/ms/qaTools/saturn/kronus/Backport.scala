package com.ms.qaTools.saturn.kronus

import java.io.File
import java.net.URI

import scala.collection.JavaConversions._
import scala.collection.concurrent.TrieMap
import scala.ref.SoftReference
import scala.util.Try

import org.eclipse.emf.ecore.resource.ResourceSet

import com.ms.qaTools.kronus.repository.ExtractKronusSource
import com.ms.qaTools.saturn.kronus.codeGen.KronusGenerator

// This trait is meant to be used for backward compatibility with Saturn 3.  Any new pure Kronus functionalities should
// not be put here.
trait Backport {
  def typeDefs: Map[String, TypeDef]
  def hashtags: Map[String, HashtagDef]
  def resourceDefs: Map[String, FunctionDef]
  def stepDefs: Map[String, FunctionDef]
  def helperDefs: Map[String, FunctionDef]
  def imports: Seq[ImportDef]
  def resourceSet: ResourceSet
  def functionCall(name: String, args: Seq[(String, Expression)],
                   symbolTable: Map[String, FunctionDef] = helperDefs): FunctionCall
  def generateFiles(outputDir: File): Seq[Try[File]]
  def packages: Seq[String]
}

object Backport {
  def apply(): Backport = cacheGet(ExtractKronusSource())
  def withExtra(extra: Seq[URI]): Backport = cacheGet(ExtractKronusSource.withExtra(extra))

  def clearCache(extra: Seq[URI]) {
    val needClear = extra.toSet
    cache --= cache.keys.filter(_.exists(needClear))
  }

  protected val cache: scala.collection.mutable.Map[Seq[URI], SoftReference[Backport]] = TrieMap()

  protected def cacheGet(uris: Seq[URI]): Backport = cache.get(uris).flatMap(_.get) getOrElse {
    val x = new BackportImpl(deserialize(uris))
    cache(uris) = new SoftReference(x)
    x
  }
}

class BackportImpl(kronuss: Seq[TopLevelKronus]) extends Backport {
  import scala.collection.JavaConversions._
  import KronusFactory.{ eINSTANCE => Factory }

  val resourceSet = kronuss.head.eResource.getResourceSet
  require(kronuss.forall(_.eResource.getResourceSet == resourceSet))

  val hashtags = getDefs.collect { case x: HashtagDef => (x.getName, x) }.toMap

  val typeDefs = getDefs.collect { case x: TypeDef => (x.getName, x) }.toMap

  val (resourceDefs, stepDefs, helperDefs) = {
    val funDefs = getDefs.collect { case x: FunctionDef => x }.groupBy { fd =>
      val ts = fd.getHashtags.map(_.getMethod)
      (ts.exists{case x: HashtagDef => x.getName == "Resource"}, ts.exists{case x: HashtagDef => x.getName == "Step"}) match {
        case (false, false) => None
        case (true, false)  => Some(ResourceDef)
        case (false, true)  => Some(StepDef)
        case (true, true)   => throw new Error(s"FunctionDef cannot be both Resource and Step: ${fd.getName}")
      }
    }.withDefaultValue(Nil)
    (defs2map(funDefs(Some(ResourceDef))), defs2map(funDefs(Some(StepDef))), defs2map(funDefs(None)))
  }

  def functionCall(name: String, args: Seq[(String, Expression)], symbolTable: Map[String, FunctionDef]) =
    Factory.newFunctionCall(symbolTable(name), args.map { case (k, v) => Factory.newParameterValue(k, v) }: _*)

  def generateFiles(outputDir: File) = {
    val generator = KronusGenerator()
    kronuss.map { k =>
      val imports = kronuss.filter(_ != k).map(_.getPackage.getModule)
      generator.generateFile(k, outputDir.toPath).map(_.output.toFile)
    }
  }

  def packages = kronuss.map(_.getPackage.getModule)

  def defs2map(xs: Seq[FunctionDef]) = xs.view.map(x => (x.getName, x)).toMap

  val imports = kronuss.view.flatMap(_.getKronus.getImports)

  def getDefs = kronuss.view.flatMap(_.getKronus.getDefs)
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
