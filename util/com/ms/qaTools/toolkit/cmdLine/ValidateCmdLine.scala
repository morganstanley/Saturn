package com.ms.qaTools.toolkit.cmdLine

import java.io.File

import org.kohsuke.args4j.{Option => AOption}

import com.ms.qaTools.Injector
import com.ms.qaTools.compare.writer.tree.{TreeDiffSetWriter, ConsoleDiffSetWriter, DatabaseDiffSetWriter, ECoreDiffSetWriter}
import com.ms.qaTools.toolkit.{Validate, XmlValidate, PbValidate, JsonValidate}
import com.ms.qaTools.toolkit.DbConnectionFactory

abstract class ValidateCmdLine extends BasicCmdLine with OutputFile {
  @AOption(name = "-p", aliases = Array("--printMessage"), usage = "Prints the Comparison/validation results.")
  val print: Boolean = false

  @AOption(name = "--outType", usage = "output type, one of XML, SQLITE, H2; default to XML")
  val outType: String = "XML"

  @AOption(name = "--omitIdentical", usage = "omit identical document diffs and details")
  val omitIdentical: Boolean = false

  def consoleDiffWriter: ConsoleDiffSetWriter[_] = new ConsoleDiffSetWriter(print)

  def diffWriter: TreeDiffSetWriter[_] = outType.toUpperCase match {
    case "XML" =>
      if (outFileName == null) consoleDiffWriter
      else new ECoreDiffSetWriter(new File(outFileName), omitIdentical)
    case "SQLITE" | "H2" =>
      val db = Injector.getInstance[DbConnectionFactory].create(outType, "", outFileName, "", "")
      new DatabaseDiffSetWriter(db, omitIdentical)
    case other =>
      throw new IllegalArgumentException("unknown output type: " + other)
  }

  def validate(w: TreeDiffSetWriter[_]): Validate[_]
}

class XmlValidateCmdLine extends ValidateCmdLine with OptionalConfigFile with ComparisonFiles {
  def validate(w: TreeDiffSetWriter[_]) = XmlValidate(Option(configFileName), expectedFileName, actualFileName, w)
}

class JsonValidateCmdLine extends ValidateCmdLine with ComparisonFiles {
  def validate(w: TreeDiffSetWriter[_]) = JsonValidate(expectedFileName, actualFileName, w)
}

class PbValidateCmdLine extends ValidateCmdLine with OptionalPBConfigFile with PBComparisonFiles {
  def validate(w: TreeDiffSetWriter[_]) = PbValidate(template, expectedRowSource, actualRowSource, descriptor, w)
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
