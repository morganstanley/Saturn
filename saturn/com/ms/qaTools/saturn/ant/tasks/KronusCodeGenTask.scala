package com.ms.qaTools.saturn.ant.tasks

import java.net.URI
import java.nio.file.{Path, Paths, Files}
import java.nio.file.SimpleFileVisitor
import java.nio.file.StandardCopyOption
import java.nio.file.attribute.BasicFileAttributes
import scala.beans.BeanProperty
import org.apache.commons.io.FileUtils
import org.apache.tools.ant.BuildException
import org.apache.tools.ant.Project
import org.apache.tools.ant.Task
import com.ms.qaTools.kronus.repository.ExtractKronusSource
import com.ms.qaTools.saturn.kronus._
import com.ms.qaTools.saturn.kronus.codeGen.KronusGenerator
import com.ms.qaTools.saturn.ant.PropertyAccessor

// This is the new Ant task that compiles pure Kronus code.  Be careful not to drag in util dependencies.
@deprecated("Use build template v2", "")
class KronusCodeGenTask extends Task with PropertyAccessor {
  // Ant attribute
  @BeanProperty var projectName: String = "prototype"

  val extraKronusProp = "qaTools.saturn.kronus.extra"
  val backport = ExtractKronusSource(getClass.getClassLoader)

  def useIvy      = getProperty(s"msde.$projectName.saturn.kronus.ivy") exists {_.toBoolean}
  def ivyConfigs  = getProperty(s"msde.$projectName.saturn.kronus.ivy.configs") getOrElse {"kronus"}
  def ivySettings = getOrThrow(s"msde.$projectName.saturn.kronus.ivy.settings.file", "ivy.settings.file")
  def ivyFile     = getOrThrow(s"msde.$projectName.saturn.kronus.ivy.dep.file", "ivy.dep.file")

  def source: Seq[URI] = getOrThrow(s"msde.$projectName.saturn.script").split(',').map(Paths.get(_).toUri)

  def ensureOutputDirectory(): Path = {
    val prop = s"msde.$projectName.saturn.directory"
    val dir = getProperty(prop).map(Paths.get(_)).orElse {
      getProperty("msde.base.build.dir").map(Paths.get(_, "saturn-gen"))
    }.fold(Files.createTempDirectory("saturn-gen"))(Files.createDirectories(_))
    getProject.setProperty(prop, dir.toString)
    log(s"Output directory [$dir]")
    dir
  }

  def setSaturnCommon() {
    val currentJar = Paths.get(getClass.getProtectionDomain.getCodeSource.getLocation.getPath)
    val saturnCommon = currentJar.getParent.getParent.toAbsolutePath.toString
    getProject.setProperty("qaTools.saturn.install.dir", saturnCommon)
    log(s"Saturn installation directory: [$saturnCommon]")
  }

  def syncOutput[A](body: Path => A): A = {
    val oldDir = ensureOutputDirectory()
    val newDir = Files.createTempDirectory("saturn-gen-new")
    val result = body(newDir)
    Files.walkFileTree(newDir, new CopyVisitor(newDir, oldDir))
    Files.walkFileTree(oldDir, new DeleteVisitor(oldDir, newDir))
    result
  }

  override def init(): Unit = {
    setSaturnCommon()
    getProperty("ivy.home").foreach(sys.props("ivy.home") = _)
  }

  override def execute() {
    try {
      val srcUris = source
      val depUris = if (useIvy) {
        log(s"Ivy Kronus resolution [settings: $ivySettings, dep: $ivyFile, configs: $ivyConfigs]")
        new IvyResolver(Paths.get(ivySettings).toUri.toURL).artifacts(Paths.get(ivyFile).toUri.toURL,
                                                                      ivyConfigs.split(','))
      } else Nil
      val uris = srcUris ++ depUris ++ backport
      val generator = KronusGenerator()
      val app = syncOutput { outDir =>
        (uris, deserialize(uris)).zipped.collect {
          case NeedCompile((uri, topLevel)) =>
            log(s"Compiling: $uri")
            val r = generator.generateFile(topLevel, outDir)
            log(s"Writing: ${r.output}")
            r.appObject
        }.head
      }
      getProject.setProperty(s"msde.$projectName.saturn.entryPoint", app)
    } catch {
      case t: Throwable => throw new BuildException(t)
    }
  }

  object NeedCompile {
    def unapply(uriAndTopLevel: (URI, TopLevelKronus)): Option[(URI, TopLevelKronus)] = {
      val (pkg, cls) = uriAndTopLevel._2.packageAndClass
      val fqn = (pkg :+ cls).mkString(".")
      try {
        Thread.currentThread.getContextClassLoader.loadClass(fqn)
        log(s"Found $fqn on class path", Project.MSG_VERBOSE)
        None
      } catch {
        case _: ClassNotFoundException =>
          log(s"Cannot find $fqn on class path", Project.MSG_VERBOSE)
          Some(uriAndTopLevel)
      }
    }
  }

  class CopyVisitor(from: Path, to: Path) extends SimpleFileVisitor[Path] {
    override def preVisitDirectory(src: Path, attrs: BasicFileAttributes) = {
      val dst = to.resolve(from.relativize(src))
      if (!Files.isDirectory(dst)) Files.copy(src, dst, StandardCopyOption.REPLACE_EXISTING)
      super.preVisitDirectory(src, attrs)
    }

    override def visitFile(src: Path, attrs: BasicFileAttributes) = {
      val dst = to.resolve(from.relativize(src))
      if (!(Files.isRegularFile(dst) && FileUtils.contentEquals(src.toFile, dst.toFile))) {
        log(s"Copying $src to $dst", Project.MSG_VERBOSE)
        Files.copy(src, dst, StandardCopyOption.REPLACE_EXISTING)
      }
      super.visitFile(src, attrs)
    }
  }

  class DeleteVisitor(root: Path, baseline: Path) extends SimpleFileVisitor[Path] {
    override def visitFile(file: Path, attrs: BasicFileAttributes) = {
      val base = baseline.resolve(root.relativize(file))
      if (!(file.toString.endsWith(".class") || Files.isRegularFile(base))) {
        log(s"Deleting $file", Project.MSG_VERBOSE)
        Files.delete(file)
      }
      super.visitFile(file, attrs)
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
