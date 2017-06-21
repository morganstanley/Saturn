package com.ms.qaTools.saturn.runbook

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.{List => JList}

import scala.collection.JavaConverters._
import scala.sys.process.Process
import scala.util.Try

import org.kohsuke.args4j.Argument
import org.kohsuke.args4j.{Option => Args4jOption}
import org.kohsuke.args4j.spi._
import org.yaml.snakeyaml.Yaml

import com.ms.qaTools.io.ExcelIO
import com.ms.qaTools.kronus.repository.{Config => KRConfig}
import com.ms.qaTools.{toolkit => tk}

object SaturnRBApp extends tk.ToolkitApp[tk.Result] {
  val APP_NAME = "saturn-runbook"
  val cmdLine = new SaturnRBCmdLine

  exit(Try {
    parseArguments
    cmdLine.operation match {
      case gen: SaturnRBCmdLine.Generate =>
        val rb = SaturnRB.fromExcel(gen.excelIO, 
                                    cmdLine.storesExcel.map(cmdLine.excelIO(_)), 
                                    cmdLine.complexExcel.map(cmdLine.excelIO(_)))
        rb.genData(cmdLine.testCasesFile, cmdLine.scenariosFile, cmdLine.storesFile)
        val scenarioLogicFile = Paths.get("saturn/")
        val dispatcherFile = Paths.get("saturn/scenarios.saturn")
        val kronusRepoYamlFile = cmdLine.srcDir.resolve(KRConfig.filePath(None, Some(cmdLine.srcDir)))
        val extraKronusFiles = Option(gen.kronusFiles).map(_.asScala)
        if (gen.genLogic || gen.genProj) {
          val extraKronusPaths = extraKronusFiles.orElse {
            if (!gen.genProj && Files.exists(kronusRepoYamlFile)) {
              val in = Files.newInputStream(kronusRepoYamlFile)
              val conf = try KRConfig.fromYAML(in) finally in.close()
              conf.components.collectFirst {
                case c if c.sources.contains(scenarioLogicFile) && c.sources.contains(dispatcherFile) =>
                  (c.sources - scenarioLogicFile - dispatcherFile).toSeq
              }
            } else None
          }.getOrElse(Nil)
          rb.genLogic(cmdLine.srcDir.resolve(scenarioLogicFile), 
                      cmdLine.srcDir.resolve(dispatcherFile),
                      SaturnRB.GenLogicConfig(extraKronusPaths = extraKronusPaths,
                                              kronusRepoFile = kronusRepoYamlFile,
                                              sequentialExecution = !gen.stepParallel, 
                                              parallel = gen.scenarioParallel).setExtraKronusUris(extraKronusPaths.map(_.toUri)))
        }
        if (gen.genProj) {
          scaffold()
        }
    }

    new tk.Result {val status = tk.Passed; val exception = None}
  })

  def scaffold(): Unit = {
    val jarPath = Paths.get(getClass.getProtectionDomain.getCodeSource.getLocation.toURI)
    val executable = jarPath.getParent.getParent.resolve("bin").resolve("saturn-scaffold")
    println(Process(executable.toString, Seq(s"--directory=${cmdLine.baseDir}", "--use-user-ivy", "--legacy")).!!)
  }
}

object SaturnRBCmdLine {
  sealed trait Operation

  class Generate extends Operation {
    @Args4jOption(name = "--gen-proj", usage = "generate the project structure")
    val genProj: Boolean = false

    @Args4jOption(name = "--gen-logic", usage = "generate the Kronus and Saturn code")
    val genLogic: Boolean = false

    @Args4jOption(name = "--kronus-files", usage = "add additional Kronus files to use in the run book",
                  handler = classOf[MultiPathOptionHandler])
    val kronusFiles: JList[Path] = null

    @Args4jOption(name = "--scenario-parallel", usage = "specify the maximum simultaneous iterations")
    val scenarioParallel = 1

    @Args4jOption(name = "--step-parallel", usage = "run steps in the same scenario in parallel")
    val stepParallel: Boolean = false

    @Argument(metaVar = "EXCEL-FILE", required = true)
    val excelFile: Path = null

    def excelIO: ExcelIO = {
      val file = excelFile.toString
      ExcelIO(file, isXlsx = !file.toLowerCase.endsWith(".xls"))
    }
  }
}

class SaturnRBCmdLine extends tk.cmdLine.BasicCmdLine {
  import SaturnRBCmdLine._

  @Args4jOption(name = "--base-dir", usage = "base directory for the generated project")
  val baseDir: Path = {
    val d = Paths.get(".").toAbsolutePath.normalize
    if (d.endsWith("src")) d.getParent else d
  }
  def srcDir = baseDir.resolve("src")

  @Args4jOption(name = "--test-cases-file", usage = "specify the generated test cases JSON file path")
  protected val testCasesFile0: Path = null
  def testCasesFile = Option(testCasesFile0).getOrElse(baseDir.resolve("src/etc/scenarios.json"))

  @Args4jOption(name = "--scenarios-file", usage = "specify the generated scenarios CSV file path")
  protected val scenariosFile0: Path = null
  def scenariosFile = Option(scenariosFile0).getOrElse(baseDir.resolve("src/etc/scenarios.csv"))

  @Args4jOption(name = "--stores-file", usage = "specify the generated stores file path")
  protected val storesFile0: Path = null
  def storesFile = Option(storesFile0).getOrElse(baseDir.resolve("src/etc/stores.json"))

  @Args4jOption(name = "--stores-excel", usage = "specify the store Excel file")
  protected val storesExcel0: Path = null
  def storesExcel = Option(storesExcel0)

  @Args4jOption(name = "--complex-excel", usage = "specify the complex-steps Excel path")
  protected val complexExcel0: Path = null
  def complexExcel = Option(complexExcel0)

  @Argument(usage = "generate [--gen-proj] [--gen-logic] [--kronus-files FILES] [--scenario-parallel] [--step-parallel] EXCEL-FILE",
            metaVar = "OPERATION", required = true, handler = classOf[SubCommandHandler])
  @SubCommands(Array(new SubCommand(name = "generate", impl = classOf[Generate])))
  val operation: Operation = null

  def excelIO(excel: Path): ExcelIO = {
    val file = excel.toString
    ExcelIO(file, isXlsx = !file.toLowerCase.endsWith(".xls"))
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
