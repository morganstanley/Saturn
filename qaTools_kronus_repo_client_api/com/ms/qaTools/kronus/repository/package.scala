package com.ms.qaTools.kronus

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Proxy

import scala.reflect.{ ClassTag, classTag }

import com.ms.qaTools.kronus.repository.IvySupport.IvyResolver

import spray.json._

package object repository {
  /**
   * `A` must not have implementation for the methods you want to overwrite; otherwise the overwrite will be ignored
   */
  def newProxyInstance[A: ClassTag](h: InvocationHandler): A = {
    val interface = classTag[A].runtimeClass
    Proxy.newProxyInstance(interface.getClassLoader, Array(interface), h).asInstanceOf[A]
  }

  trait BaseResolver {
    val resolver2JsValue: PartialFunction[DependencyResolver, JsValue]
    val jsValue2Resolver: PartialFunction[JsValue, DependencyResolver]
  }

  case object IvyJsonProtocolSupport extends DefaultJsonProtocol with BaseResolver {
    import IvySupport._

    implicit val ivyConfigJsonProtocolFormat = jsonFormat1(IvySimpleConfig)
    implicit val kronusIvyConfigJsonProtocolFormat = jsonFormat2(IvyKronusConfig)
    implicit val ivyResolverJsonProtocolFormat = jsonFormat1(IvyResolver)
    val resolver2JsValue: PartialFunction[DependencyResolver, JsValue] = { case i: IvyResolver => ivyResolverJsonProtocolFormat.write(i) }
    val jsValue2Resolver: PartialFunction[JsValue, DependencyResolver] = { case v: JsObject if (v.fields.contains("configs")) => ivyResolverJsonProtocolFormat.read(v) }
  }

  trait EntitiesJsonProtocol extends DefaultJsonProtocol {
    import scala.language.implicitConversions

    val resolvers: Seq[BaseResolver] = Seq(IvyJsonProtocolSupport)
    val resolver2JsValue = resolvers.map { _.resolver2JsValue }.reduce((f1, f2) => f1.orElse(f2))
    val jsValue2Resolver = resolvers.map { _.jsValue2Resolver }.reduce((f1, f2) => f1.orElse(f2))

    implicit val depResolverJsonProtocolFormat = new RootJsonFormat[DependencyResolver] {
      def write(d: DependencyResolver) = resolver2JsValue(d)
      def read(value: JsValue): DependencyResolver = jsValue2Resolver(value)
    }

    implicit def readSeqDepResolverJsonProtocolFormat(resolvers: JsValue) = resolvers match { case a: JsArray => a.elements.map { depResolverJsonProtocolFormat.read _ } }
    implicit def writeseqDepResolverJsonProtocolFormat(resolvers: Seq[DependencyResolver]) = JsArray(resolvers.map {depResolverJsonProtocolFormat.write _}.toVector)
  }

}/*
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
