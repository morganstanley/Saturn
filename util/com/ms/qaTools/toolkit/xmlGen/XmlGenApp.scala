package com.ms.qaTools.toolkit.xmlGen

import org.kohsuke.args4j.Option
import org.kohsuke.args4j.CmdLineParser
import org.kohsuke.args4j.CmdLineException
import com.ms.qaTools.toolkit.cmdLine.BasicCmdLine
import com.ms.qaTools.toolkit.cmdLine.InputDelimitedFile
import com.ms.qaTools.toolkit.cmdLine.InputXmlTemplateFile
import com.ms.qaTools.toolkit.cmdLine.OutputXmlFile
import com.ms.qaTools.toolkit.ToolkitApp
import com.ms.qaTools.toolkit.cmdLine.LegacyMode



object XmlGenApp extends ToolkitApp[XmlGenResult] {

  override val APP_NAME = "XmlGen"
  override val cmdLine = new BasicCmdLine() with InputDelimitedFile with InputXmlTemplateFile with OutputXmlFile with LegacyMode

  parseArguments

  val inFileName = cmdLine.inFileName
  val templateFileName = cmdLine.xmlTemplateFileName
  val outFileName = cmdLine.outFileName

  val inRowSource = cmdLine.inRowSource
  val template = cmdLine.xmlTemplate
  val xmlRowWriter = cmdLine.xmlRowWriter
  val legacyMode = cmdLine.legacyMode
  try {

    // 1. Handle input file exception
    val inRowSource = try {
      cmdLine.inRowSource
    } catch {
      case generalException: Throwable => {
        throw new Exception("can't read input file " + inFileName, generalException)
      }
    }

    // 2. Handle template file exception
    val template = try {
      cmdLine.xmlTemplate
    } catch {
      case generalException: Throwable => {
        throw new Exception("can't read template File " + templateFileName, generalException)
      }
    }

    // 3. Handle output file exception
    val xmlRowWriter = try {
      cmdLine.xmlRowWriter
    } catch {
      case generalException: Throwable => {
        throw new Exception("can't write to output File: " + outFileName, generalException)
      }
    }

    // 4. Handle runtime exceptions when mapping template file to input file
    try {
      val xmlGenerator = XmlGen(template, inRowSource, xmlRowWriter, legacyMode)
      val result = xmlGenerator.run
      exit(result)
    } catch {
      case generalException: Throwable => {
        exitException(new Exception("exceptions happen during runtime", generalException))
      }
    }
  } catch {
    // All the exceptions are caught and displayed by this statement
    case t: Throwable => exitException(t)

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
