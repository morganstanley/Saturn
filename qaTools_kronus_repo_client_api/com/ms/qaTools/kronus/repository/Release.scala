package com.ms.qaTools.kronus.repository

import spray.json.RootJsonFormat

trait DependencyResolver

trait Release extends Product4[String, String, String, Seq[DependencyResolver]] {
  def group: String
  def artifact: String
  def version: String
  def resolvers: Seq[DependencyResolver]

  def _1 = group
  def _2 = artifact
  def _3 = version
  def _4 = resolvers
  def canEqual(that: Any) = that.isInstanceOf[Release]
}

object Release extends EntitiesJsonProtocol {
  protected case class Impl(group: String, artifact: String, version: String, resolvers: Seq[DependencyResolver]) extends Release {
    override def toString = s"Release [$group/$artifact/$version]"
  }

  def apply(group: String, artifact: String, version: String, resolvers: Seq[DependencyResolver] = Nil): Release =
    Impl(group, artifact, version, resolvers)

  protected class WrappedVersion(val version: String)

  implicit object VersionOrdering extends Ordering[WrappedVersion] {
    def compare(x: WrappedVersion, y: WrappedVersion) = try {
      import Ordering.Implicits._
      val Seq(xns, yns) = Seq(x, y).map(_.version.split(Array('.', '-')).map(_.toInt))
      implicitly[Ordering[Seq[Int]]].compare(xns, yns)
    } catch {
      case _: NumberFormatException => implicitly[Ordering[String]].compare(x.version, y.version)
    }
  }

  implicit val ReleaseOrdering: Ordering[Release] = Ordering.by { r =>
    (r.group, r.artifact, new WrappedVersion(r.version))
  }

  implicit def _jsonFormat: RootJsonFormat[Release] = jsonFormat(Impl.apply, "group", "artifact", "version", "resolvers")
}

object IvySupport {
  
  /*
   * Example of KronusConfigs
   * 
   * config: {
   *   name: "kronus_ice"
   *   runtime: ["runtime", "runtime-ice"]
   * }
   * 
   * config: {
   *   name: "kronus_triclear"
   *   runtime: ["runtime", "runtime-triclear"]
   * }
   * 
   */  
  
  trait IvyConfig {
    val name: String
  }
  
  case class IvySimpleConfig(name: String) extends IvyConfig
  case class IvyKronusConfig(name: String, runtime: Seq[IvySimpleConfig]) extends IvyConfig
  case class IvyResolver(configs: Seq[IvyKronusConfig]) extends DependencyResolver
  
  implicit def name2IvySimpleConfig(name: String) = IvySimpleConfig(name)
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
