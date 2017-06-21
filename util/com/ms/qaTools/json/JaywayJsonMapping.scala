package com.ms.qaTools.json

import java.util.EnumSet

import scala.util.control.NonFatal

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.ArrayNode
import com.jayway.jsonpath.Configuration
import com.jayway.jsonpath.internal.Path
import com.jayway.jsonpath.internal.PathRef
import com.jayway.jsonpath.internal.path.ArrayPathToken
import com.jayway.jsonpath.internal.path.CompiledPath
import com.jayway.jsonpath.internal.path.EvaluationContextImpl
import com.jayway.jsonpath.internal.path.FunctionPathToken
import com.jayway.jsonpath.internal.path.PathCompiler
import com.jayway.jsonpath.internal.path.PathToken
import com.jayway.jsonpath.internal.path.PredicatePathToken
import com.jayway.jsonpath.internal.path.Utils
import com.jayway.jsonpath.spi.json.JacksonJsonNodeJsonProvider
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider
import com.ms.qaTools.tree.extraction.ColumnIndex
import com.ms.qaTools.tree.extraction.ColumnMapping
import com.ms.qaTools.tree.extraction.Step

object JaywayJsonMapping {
  Configuration.setDefaults(new Configuration.Defaults {
    def jsonProvider = new JacksonJsonNodeJsonProvider
    def mappingProvider = new JacksonMappingProvider
    def options = EnumSet.noneOf(classOf[com.jayway.jsonpath.Option])
  })
  val jacksonNodeConf = Configuration.defaultConfiguration

  protected class JsonNodeStep(path: Path, pathToken: PathToken, flatten: Boolean) extends Step[JsonNode] {
    def getText = Utils.getPathFragment(pathToken)
    def hasPredicates = !path.isDefinite
    def resolve(context: JsonNode) = try {
      val ctx = new EvaluationContextImpl(path, context, JaywayJsonMapping.jacksonNodeConf, false)
      pathToken.evaluate("", PathRef.NO_OP, context, ctx)
      ctx.getValue[JsonNode](false) match {
        case xs: ArrayNode if flatten => xs
        case x                        => x :: Nil
      }
    } catch {
      case NonFatal(t) =>
        throw new RuntimeException(s"context = $context, pathToken = $pathToken, flatten = $flatten", t)
    }
  }

  def apply(paths: Iterator[String]): ColumnMapping[JsonNode] = {
    paths.zipWithIndex.map { case (path, i) =>
      val compiled = PathCompiler.compile(path).asInstanceOf[CompiledPath]
      val steps = Utils.pathTokens(compiled).toBuffer[PathToken].toIterator.map { token =>
        val flatten = Utils.next(token) match {
          case Some(_: ArrayPathToken | _: PredicatePathToken | _: FunctionPathToken) => !compiled.isDefinite
          case _                                                                      => true
        }
        Utils.cut(token)
        new JsonNodeStep(compiled, token, flatten)
      }
      ColumnMapping.branch(steps, ColumnIndex(i))
    }.fold[ColumnMapping[JsonNode]](ColumnMapping.root(Nil))(_ + _)
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
