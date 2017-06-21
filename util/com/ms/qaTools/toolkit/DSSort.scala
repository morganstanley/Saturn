package com.ms.qaTools.toolkit
import com.ms.qaTools.io.rowSource.ColumnOrdering
import com.ms.qaTools.io.rowSource.ExternalSort._
import com.ms.qaTools.io.rowSource.file.CsvRowSource
import com.ms.qaTools.io.rowWriter.CsvRowWriter
import cmdLine.BasicCmdLine
import org.kohsuke.args4j
import scala.language.reflectiveCalls

object DSSort extends ToolkitApp[Result] {
  val APP_NAME = "DsSort"
  val cmdLine = new BasicCmdLine {
    @args4j.Option(name = "--inFileName", usage = "input file name", required = true)
    val inFileName: String = null

    @args4j.Option(name = "--outFileName", usage = "output file name, stdout by default")
    val outFileName: String = null
  }

  exit(util.Try{
    parseArguments
    val inDs = CsvRowSource(new java.io.FileReader(cmdLine.inFileName))
    CsvRowWriter(Option(cmdLine.outFileName).map(f => new java.io.FileWriter(f)).getOrElse(new java.io.PrintWriter(System.out, true))).write(
      inDs.sortExternal(ColumnOrdering(inDs.colDefs.filter(_.isKey).sortBy(_.keyOrder))))
    Result(Passed)})
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
