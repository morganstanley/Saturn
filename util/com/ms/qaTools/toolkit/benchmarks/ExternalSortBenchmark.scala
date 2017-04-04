package com.ms.qaTools.toolkit.benchmarks

import java.io.FileReader
import java.io.OutputStreamWriter

import org.kohsuke.args4j.Option

import com.ms.qaTools.lexicalOrdering
import com.ms.qaTools.conversions.JavaIOConversions._
import com.ms.qaTools.io.rowSource._
import com.ms.qaTools.io.rowSource.ExternalSort._
import com.ms.qaTools.io.rowSource.file.CsvRowSource
import com.ms.qaTools.io.rowWriter.file.CsvRowWriter
import com.ms.qaTools.toolkit.ToolkitApp
import com.ms.qaTools.toolkit.cmdLine.BasicCmdLine



object ExternalSortBenchmark extends ToolkitApp {
  override val APP_NAME = "ExternalSortBenchmark"
  override val cmdLine = new BasicCmdLine() {
    @Option(name = "-f", aliases = Array("--inFileName"), usage = "File to sort", required = true)
    val fileName: String = null

    @Option(name = "-o", aliases = Array("--outFileName"), usage = "Output fileName")
    val outFileName: String = null
  }

  parseArguments

  val rowSource = CsvRowSource(new FileReader(cmdLine.fileName))
  println("=== Benchmark for " + cmdLine.fileName + " ===")
  val startTime = System.currentTimeMillis()

  val sortedRowSource = rowSource.sortExternal(lexicalOrdering)
  val sortingEndTime = System.currentTimeMillis()
  val totalSorting = sortingEndTime - startTime
  println("Getting sorted row source: " + totalSorting + "ms")

  val startTimeOutput = System.currentTimeMillis()
  if (cmdLine.outFileName != null) CsvRowWriter(cmdLine.outFileName).write(sortedRowSource)
  else CsvRowWriter(new OutputStreamWriter(System.out)).write(sortedRowSource)
  val outputEndTime = System.currentTimeMillis()
  val totalOutput = outputEndTime - startTimeOutput

  println("Output sorted rows: " + totalOutput + "ms")
  val total = outputEndTime - startTime
  println("Total sort + output: " + total + "ms\n")
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
