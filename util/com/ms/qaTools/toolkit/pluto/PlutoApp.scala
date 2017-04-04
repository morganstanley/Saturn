package com.ms.qaTools.toolkit.pluto

import com.ms.qaTools.Logger
import com.ms.qaTools.toolkit.Passed
import com.ms.qaTools.toolkit.ToolkitApp
import org.apache.commons.io.FileUtils
import scala.collection.JavaConversions._
import scala.util.Try

object PlutoApp extends ToolkitApp[PlutoResult] {
  override val APP_NAME = "pluto"
  override val cmdLine = new PlutoCmdLine
  val logger = Logger(getClass)

  try {
    parseArguments

    val properties: Map[String, String] = Option(cmdLine.PropertiesFile).map{f =>
      val p = new java.util.Properties()
      p.load(new java.io.FileReader(f))
      p.stringPropertyNames().map { n => (n, p.getProperty(n))}.toMap
    }.getOrElse(Map.empty)

    def path(mpr: String): java.io.File =
      FileUtils.getFile(properties("pluto.path.format").format(mpr.split("/"): _*))

    exit(cmdLine.function match {
      case "generate_examples" => (new ExampleGen(cmdLine.target, cmdLine.directory, properties)).run
      case "generate_twiki"    => (new TwikiGen(cmdLine.target, cmdLine.directory, properties)).run
      case "validate"          => (new Validation(cmdLine.target, cmdLine.directory, Option(cmdLine.path), properties)).run
      case "list"              => Try {
        path(cmdLine.target).ensuring(_.isDirectory, "TODO").list.foreach(f => logger.info(f))
        PlutoResult(Passed())
      }
      case "copy"              => Try {
        FileUtils.copyDirectory(path(cmdLine.target), FileUtils.getFile(cmdLine.directory))
        PlutoResult(Passed())
      }
      case o => sys.error(s"$APP_NAME: Unknown operation: $o")
    })
  } catch {
    case t: Throwable => {
      cmdLine.cmdLineParser.printUsage(System.err)
      exitException(t)
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
