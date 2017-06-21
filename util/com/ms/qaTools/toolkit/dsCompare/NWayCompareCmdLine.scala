package com.ms.qaTools.toolkit.dsCompare

import java.io.File
import java.io.FileOutputStream
import java.util.{List => JList, ArrayList}

import scala.collection.JavaConverters._

import org.apache.commons.io.FileUtils
import org.kohsuke.args4j

import com.ms.qaTools.compare.DelimitedNWayDiff
import com.ms.qaTools.compare.NWayCompareColDef
import com.ms.qaTools.compare.StringExplainer
import com.ms.qaTools.compare.writer.NWayExcelDiffSetWriter
import com.ms.qaTools.compare.writer.PageNames
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.io.rowSource.DsRowSourceCreator
import com.ms.qaTools.io.rowSource.file.ExcelXmlWorkBook
import com.ms.qaTools.toolkit.cmdLine.BasicCmdLine
import com.ms.qaTools.toolkit.cmdLine.Locale
import com.ms.qaTools.toolkit.cmdLine.QuotedStringArrayOptionHandler

import spray.json._

class NWayCompareCmdLine extends BasicCmdLine with Locale {
  @args4j.Option(name = "--inFileNames", usage = "input file names", handler = classOf[QuotedStringArrayOptionHandler])
  val inFileNames: JList[String] = new ArrayList

  @args4j.Option(name = "--outFileName", usage = "output file name", required = true)
  val outFileName: String = null

  @args4j.Option(name = "--columnConfigFileName", usage = "column configuration file name", required = true)
  val columnConfigFileName: String = null

  @args4j.Option(name = "--explainerFileName", usage = "Scala file explainer")
  val explainerFileName: String = null

  lazy val colDefs: Seq[NWayCompareColDef] = {
    import DefaultJsonProtocol._
    val json = FileUtils.readFileToString(new File(columnConfigFileName), java.nio.charset.Charset.defaultCharset)
    implicit val locale = asLocale
    val confs = json.parseJson.convertTo[Seq[NWayCompareColDef.Config]]
    NWayCompareColDef.fromConfigs(confs, inRowSources.map(_.colDefs))
  }

  lazy val inRowSources: Seq[Iterator[Seq[String]] with ColumnDefinitions] = inFileNames.asScala.map { fileName =>
    val fmt = fileName.split('.').toSeq match {
      case _ :+ _ :+ ext => ext.toUpperCase
      case _             => "CSV"
    }
    DsRowSourceCreator(fileName).createRowSource(fmt)
  }

  def explainer: PartialFunction[DelimitedNWayDiff, DelimitedNWayDiff] =
    Option(explainerFileName).fold(PartialFunction(identity[DelimitedNWayDiff])) { fileName =>
      StringExplainer(FileUtils.readFileToString(new File(fileName), java.nio.charset.Charset.defaultCharset))
    }

  def writer = new NWayExcelDiffSetWriter(ExcelXmlWorkBook(new FileOutputStream(outFileName)), colDefs, PageNames.nWay, inFileNames.asScala)
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
