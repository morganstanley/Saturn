package com.ms.qaTools.toolkit

import com.ms.qaTools.protobuf.PBExtractor
import com.ms.qaTools.io.rowSource.file.LineRowSource

class PB2CsvCmdLine extends cmdLine.BasicCmdLine with cmdLine.InputProtoBufFile with cmdLine.RequiredConfigFile with cmdLine.OutputDelimitedFile

object PB2CsvApp extends ToolkitApp[Result] {
  val APP_NAME = "PB2Csv"
  val cmdLine = new PB2CsvCmdLine

  val pbPathSplitRegex = "(.*),[\\s]*(.*);".r

  def pbPathsFromConfig(reader: java.io.Reader): Seq[(String, String)] =
    LineRowSource(reader).map { l => val pbPathSplitRegex(xPath, col) = l; (xPath, col) }.toSeq

  exit(util.Try {
    parseArguments
    val extractor = PBExtractor(cmdLine.inRowSource, pbPathsFromConfig(new java.io.FileReader(cmdLine.configFileName)))

    if (cmdLine.delimitedRowWriter.write(extractor) > 0) Result(Passed)
    else throw new Exception("PB Extractor: Unable to extract data.")
  })
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
