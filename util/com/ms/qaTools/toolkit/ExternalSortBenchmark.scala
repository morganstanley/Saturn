package com.ms.qaTools.toolkit

import org.kohsuke.args4j.Option

import com.ms.qaTools.io.rowSource.ExternalSort._
import com.ms.qaTools.io.rowSource.file.CsvRowSource
import com.ms.qaTools.io.rowWriter.CsvRowWriter
import cmdLine.BasicCmdLine
import cmdLine.OutputFile
import scala.language.reflectiveCalls

object ExternalSortBenchmark extends ToolkitApp[Result] {
  val APP_NAME = "ExternalSortBenchmark"
  val cmdLine = new BasicCmdLine with OutputFile {
    @Option(name = "-f", aliases = Array("--inFileName"), usage = "File to sort", required = true)
    val fileName: String = null
  }

  exit(util.Try{
    parseArguments

    println("=== Benchmark for " + cmdLine.fileName + " ===")
    val rowSource = CsvRowSource(new java.io.FileReader(cmdLine.fileName))
    val t0 = System.currentTimeMillis

    val sortedRowSource = rowSource.sortExternal(Ordering.Implicits.seqDerivedOrdering)
    val t1 = System.currentTimeMillis
    println("Getting sorted row source: " + (t1 - t0) + "ms")

    CsvRowWriter(cmdLine.writer).write(sortedRowSource)
    val t2 = System.currentTimeMillis
    println("Output sorted rows: " + (t2 - t1) + "ms")

    println("Total sort + output: " + (t2 - t0) + "ms\n")
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
