package com.ms.qaTools.toolkit

import java.io.File
import java.io.FileOutputStream
import java.io.FileReader

import scala.util.Try

import org.apache.commons.io.FileUtils
import org.apache.poi.ss.usermodel.WorkbookFactory
import org.kohsuke.args4j

import com.ms.qaTools._
import com.ms.qaTools.compare.CompareColDefs
import com.ms.qaTools.compare.DelimitedComparatorCounter
import com.ms.qaTools.compare.Diff
import com.ms.qaTools.compare.StringExplainer
import com.ms.qaTools.compare.XlsValidate
import com.ms.qaTools.compare.writer.ExcelDiffSetWriter
import com.ms.qaTools.io.rowSource.file.CsvRowSource
import com.ms.qaTools.io.rowSource.file.ExcelXmlWorkBook
import com.ms.qaTools.toolkit.cmdLine.BasicCmdLine
import com.ms.qaTools.toolkit.cmdLine.RequiredConfigFile
import com.ms.qaTools.toolkit.dsCompare.DsCompareResult

object XlsValidateApp extends ToolkitApp[DsCompareResult] {
  val APP_NAME = "XlsValidate"
  val cmdLine = new CmdLine

  exit {
    Try {
      parseArguments
      val validate = XlsValidate(WorkbookFactory.create(cmdLine.inFileName, null, true).getSheet(cmdLine.inWsName))
      val explainer = Option(cmdLine.explainer).map(f => StringExplainer[Diff[Seq[String]]](
        FileUtils.readFileToString(f, java.nio.charset.Charset.defaultCharset)))
      withCloseable(CsvRowSource(new FileReader(cmdLine.configFileName))) { input =>
        withCloseable(ExcelDiffSetWriter(ExcelXmlWorkBook(new FileOutputStream(cmdLine.outFileName)), CompareColDefs(XlsValidate.CompareColDefs, Nil, Nil))) { writer =>
          val diffs = validate.toDelimitedDiffs(input)
          val explained = explainer.fold(diffs)(e => diffs.map(e.applyOrElse(_, identity[Diff[Seq[String]]])))
          val c = writer.write(explained, DelimitedComparatorCounter())
          writer.writeSummary(c)
          val status = if (Seq(c.different, c.inLeftOnly, c.inRightOnly).forall(_ == 0)) Passed else Failed
          DsCompareResult(status, None, c)
        }
      }
    }
  }

  protected override def printMessages(r: DsCompareResult) = {
    println(APP_NAME + " Summary:")
    print(r.counter.userFriendlyString)
  }

  class CmdLine extends BasicCmdLine with RequiredConfigFile {
    @args4j.Option(name = "-i", aliases = Array("--inFileName"), usage = "specify an Excel input file name",
                   required = true)
    val inFileName: File = null

    @args4j.Option(name = "--inWsName", usage = "specify the input worksheet name", required = true)
    val inWsName: String = null

    @args4j.Option(name = "-o", aliases = Array("--outFileName"), usage = "output file name", required = true)
    val outFileName: File = null

    @args4j.Option(name = "--explainerFileName", aliases = Array("--explainer", "--explainerFile"),
                   usage = "Scala file explainer")
    val explainer: File = null
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
