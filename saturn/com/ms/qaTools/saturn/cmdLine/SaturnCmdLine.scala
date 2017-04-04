package com.ms.qaTools.saturn.cmdLine

import java.io.File

import org.kohsuke.args4j.Option

import com.ms.qaTools.toolkit.cmdLine.BasicCmdLine

abstract class SaturnCmdLine extends BasicCmdLine {
  @Option(name = "--logFileName", usage = "specify an log file name")
  val logFileName: String = null

  @Option(name = "--noLogging", usage = "disable logging")
  val noLogging: Boolean = false

  @Option(name = "--appendToLogFile", usage = "append to log file")
  val appendToLogFile: Boolean = false

  @Option(name = "--quiet", usage = "disable console output")
  val noOutput: Boolean = false

  @Option(name = "--noOutputColor", usage = "disable console colored output")
  val noOutputColor: Boolean = false

  @Option(name = "--sourceFile", usage = "display saturn file")
  val showSourceFile: Boolean = false

  @Option(name = "--scenarioReport", usage = "scenario report file path")
  val scenarioReport: String = null

  @Option(name = "--verbosity", usage = "control verbosity level: QUIET, NORMAL, DEBUG, DEBUG_ON_FAIL (default), DEBUG_ON_PASS, TRACE")
  val verbosity: String = "DEBUG_ON_FAIL"

  @Option(name = "--junitOutputDir", usage = "Output directory for JUnit generated files")
  val junitOutputDir: String = null

  def resolveEnvVars: Seq[(String, String)] = Nil
  override def parseArguments(args: Array[String]) {
    super.parseArguments(args)
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
