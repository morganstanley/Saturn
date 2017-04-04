package com.ms.qaTools.saturn.ant.tasks

import scala.collection.JavaConversions._
import scala.util.Properties
import scala.util.{Try, Success, Failure}

import org.apache.tools.ant.Project

import com.ms.qaTools.io.DirIO
import com.ms.qaTools.kronus.repository.ExtractKronusSource
import com.ms.qaTools.saturn.ant.ClassPath
import com.ms.qaTools.saturn.codeGen.SaturnCodeGenUtil
import com.ms.qaTools.saturn.codeGen.SaturnMonolithicFileGenerator
import com.ms.qaTools.saturn.codeGen.SaturnMultiFileGenerator
import com.ms.qaTools.saturn.lint.SaturnLintResult
import com.ms.qaTools.saturn.lint.{SaturnLintRuleResult, ResultOK, ResultWarning, ResultError}
import com.ms.qaTools.saturn.lint.SaturnLintRunner
import com.ms.qaTools.toolkit.NotRun

/**
 * Ant task for saturn scala code generation.
 */
@deprecated("Use build template v2", "")
class AntSaturnCodeGen( /* default constructor */ ) extends KronusCodeGenTask with ClassPath {
  def saturn3codegen() {
    val saturnFileName = getOrThrow(s"msde.${projectName}.saturn.script")
    val monolithic = getProperty(s"msde.${projectName}.saturn.monolithic") map {_.toBoolean} getOrElse(false)
    val noSaturnLint = getProperty(s"msde.${projectName}.saturn.nosaturnlint") map {_.toBoolean} getOrElse(false)
    val lintFailLevel = getProperty(s"msde.$projectName.saturn.lint.faillevel").filter(_.nonEmpty)
    val genPackage = getProperty(s"msde.${projectName}.saturn.genpackage") getOrElse("com.ms.qaTools.saturn.prototype")
    println("Saturn file [%s], monolithic [%s]".format(saturnFileName, monolithic))

    val extraKronuss = getProperty(s"msde.$projectName.saturn.kronus").orElse(getProperty(extraKronusProp)).map { k =>
      println(s"User-specified Kronus files [$k]")
      sys.props(extraKronusProp) = k
      k.split(',').toSeq.map(_.trim).map(getProject.resolveFile(_).toURI)
    }.getOrElse(Nil) ++ backport

    withCurrentThreadContextClassLoader {
      ExtractKronusSource.ExtraKronusClassLoader(Thread.currentThread.getContextClassLoader, extraKronuss)
    } {
      syncOutput { outDir =>
        val outputDirectory = outDir.toString
        val scriptFiles = for {
          codeGenUtil <- SaturnCodeGenUtil.createFromFileName(saturnFileName)
          entryPoint <- Try{ s"${genPackage}.${codeGenUtil.saturn.getName()}App" }
          saturnLintResult <- if (noSaturnLint) { Try { SaturnLintResult(NotRun(), Nil) } } else { SaturnLintRunner(codeGenUtil).run }
        } yield {
          saturnLintResult.validationResults.foreach(logLint)
          lintFailLevel.foreach { failLevel =>
            val level = failLevel match {
              case "WARNING" => ResultWarning("DUMMY", "DUMMY", Nil)
              case "ERROR"   => ResultError("DUMMY", "DUMMY", Nil)
              case other     =>
                sys.error(s"Unsupported Saturn Lint fail level: $other, valid options are: WARNING, ERROR")
            }
            if (saturnLintResult.validationResults.exists(_ >= level))
              sys.error(s"There is Saturn Lint result above or equal to level $failLevel")
          }
          val saturnFileGenerator =
            if (monolithic) SaturnMonolithicFileGenerator(codeGenUtil, DirIO(outputDirectory), genPackage, None)
            else SaturnMultiFileGenerator(codeGenUtil, DirIO(outputDirectory), genPackage)
          super.getProject().setProperty("msde." + projectName + ".saturn.entryPoint", entryPoint)
          saturnFileGenerator.generate()
        }

        scriptFiles match {
          case Success(fileMaps) => {
            for (fileMap <- fileMaps) yield {
              fileMap match {
                case (fileIO, Success(f)) => {
                  println(s"Writing: ${fileIO.file.get.getPath()}")
                  fileIO.mkParentDirs
                  val writer = fileIO.writer
                  writer.map { w => w.write(f); w.close; true }
                }
                case (fileIO, Failure(e)) => throw e
              }
            }
          }
          case Failure(e) => throw e
        }
      }
    }
  }

  override def execute() {
    if (source.exists(_.toString.endsWith(".kronus"))) super.execute() else saturn3codegen()
  }

  protected def logLint(r: SaturnLintRuleResult): Unit = {
    val level = r match {
      case _: ResultOK      => None
      case _: ResultWarning => Some(Project.MSG_WARN)
      case _: ResultError   => Some(Project.MSG_ERR)
    }
    level.foreach { level =>
      val msg = s"Saturn Lint ${r.status.toLowerCase.capitalize}:"
      log((msg +: r.fullDescription).mkString(Properties.lineSeparator + "  "), level)
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
