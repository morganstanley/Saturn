package com.ms.qaTools.kronus.repository

import java.io.InputStream
import java.net.URL
import java.nio.file.Path
import java.nio.file.Paths
import java.util.{ List => JList, Map => JMap }

import scala.collection.JavaConverters._
import scala.collection.Map

import org.yaml.snakeyaml.Yaml
import org.yaml.snakeyaml.constructor.SafeConstructor

case class Config(repository: URL, publishInfo: Release, components: Seq[Config.Component]) {
  def publicComponents = components.filterNot { _.`private` }
}

object Config {
  val fileProperty = "qaTools.saturn.kronusRepo.config"

  def fromYAML(in: InputStream): Config =
    new FromMap(new Yaml(new SafeConstructor).load(in).asInstanceOf[JMap[String, Any]].asScala).toConfig

  object Default {
    val fileName = "kronusRepo.yml"
    val repository = IClient.defaultURL
    val publishInfo = Release("qaTools", "default-saturn-project", "1.0.0")
    val componentName = "kronus"
  }

  case class Component(name: String, sources: Set[Path], dependencies: Set[Dependency], main: Option[Path], `private`: Boolean = false)

  object Component {
    protected[Config] class FromMapEntry(name: String, component: Map[String, Any]) {
      def toComponent: Component = {
        Component(name, sources.toSet, dependencies, main, `private`)
      }

      lazy val sources: Seq[Path] = component.get("sources").map {
        case xs: JList[_]   => xs.asScala
        case xs: JMap[_, _] => xs.asScala.keys.toSeq
        case xs             => throw new IllegalArgumentException(s"$xs is not a List or Map")
      }.map(_.map(x => Paths.get(x.asInstanceOf[String]))).getOrElse(Nil)
      
      def `private`: Boolean = component.get("private").map {case b: Boolean => b; case s: String => s.toBoolean case i: Int => i > 0}.getOrElse(false)

      def dependencies = component.get("dependencies").map {
        case xs: JMap[_, _] => xs.asScala.map {
          case (m, d) =>
            val dd = Option(d).fold(Map.empty: Map[String, Any])(_.asInstanceOf[JMap[String, Any]].asScala)
            Dependency.fromMapEntry(m.asInstanceOf[String], dd).toDependency
        }.toSeq
        case xs: JList[_] => xs.asScala.map { x =>
          new Dependency.FromMap(x.asInstanceOf[JMap[String, Any]].asScala).toDependency
        }
        case xs =>
          throw new IllegalArgumentException(s"$xs is not a List or Map")
      }.getOrElse(Nil).toSet

      def main = component.get("main").map(p => Paths.get(p.asInstanceOf[String])).orElse(sources.headOption)
    }
  }

  case class Dependency(release: Release, components: Seq[String]) {
    def filterComponents(xs: Seq[String]): Seq[String] = if (components.nonEmpty) components.intersect(xs) else xs
  }

  object Dependency {
    protected[Config] def fromMapEntry(module: String, dependency: Map[String, Any]) = {
      val Array(group, artifact) = module.split('/')
      new FromMap(dependency ++ Seq("groupId" -> group, "id" -> artifact))
    }

    protected[Config] class FromMap(dependency: Map[String, Any]) {
      def toDependency =
        Dependency(Release(dependency("groupId").asInstanceOf[String],
                           dependency("id").asInstanceOf[String],
                           dependency.getOrElse("version", "*").asInstanceOf[String]),
                   dependency.get("components").map(_.asInstanceOf[JList[String]].asScala).getOrElse(Nil))
    }
  }

  protected class FromMap(config: Map[String, Any]) {
    def toConfig = Config(repository, publishInfo, components)

    def repository =
      config.get("repository").fold(Default.repository)(url => new URL(url.asInstanceOf[String]))

    def publishInfo = {
      val module: Option[(String, String)] = if (config.contains("module")) {
        val Array(group, artifact) = config("module").asInstanceOf[String].split('/')
        Some((group, artifact))
      } else if (config.contains("id"))
        Some((config("groupId").asInstanceOf[String], config("id").asInstanceOf[String]))
        else
        None
      module.fold(Default.publishInfo) {
        case (group, artifact) => Release(group, artifact, config("version").asInstanceOf[String])
      }
    }

    def components = if (config.contains("components"))
      config("components").asInstanceOf[JMap[String, Any]].asScala.map {
        case (name, v) => new Component.FromMapEntry(name, v.asInstanceOf[JMap[String, Any]].asScala).toComponent
      }.toSeq
    else if (config.contains("dependencies") || config.contains("sources"))
      Seq(new Component.FromMapEntry(Default.componentName, config).toComponent)
    else Nil    
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
