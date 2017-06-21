package com.ms.qaTools.toolkit

import java.io.FileReader
import java.io.Reader

import scala.util.Try

import org.w3c.dom.Node

import com.ms.qaTools.{OptionTryUtil, TryUtil}
import com.ms.qaTools.io.Writer
import com.ms.qaTools.io.rowSource.file.LineRowSource
import com.ms.qaTools.io.rowSource.file.XmlRowSource
import com.ms.qaTools.toolkit.cmdLine.Xml2CsvCmdLine
import com.ms.qaTools.tree.TreeNode
import com.ms.qaTools.tree.extraction.DetachStrategy
import com.ms.qaTools.xml.XmlExtractor

case class Xml2CsvResult(status: Status, exception: Option[Throwable] = None) extends Result

object Xml2CsvApp extends ToolkitApp[Xml2CsvResult] {
  val APP_NAME = "Xml2Csv"
  val cmdLine = new Xml2CsvCmdLine

  exit(Try(parseArguments).flatMap(_ => Xml2Csv(
    cmdLine.inRowSource,
    cmdLine.delimitedRowWriter,
    Xml2Csv.parse(new FileReader(cmdLine.configFileName), Xml2Csv.xPathSplitRegex).toSeq,
    cmdLine.namespaces,
    cmdLine.detachStrategy[TreeNode[Node]]).run))
}

case class Xml2Csv(xmlExtractor: XmlExtractor, rowWriter: Writer[Iterator[Seq[String]]]) extends Runnable[Xml2CsvResult] {
  def run = Try{rowWriter.write(xmlExtractor); Xml2CsvResult(Passed)}
}

object Xml2Csv {
  type OutputWithOptions[T] = { // Saturn dependency
    def output(writerHeader: Boolean, nullMarker: String): Try[Writer[T]]
  }

  val xPathSplitRegex = "(.*),[\\s]*(.*);".r

  def apply(i: XmlRowSource, o: Writer[Iterator[Seq[String]]], xPaths: Seq[(String, String)], namespaces: Map[String, String], detachNodes: DetachStrategy[TreeNode[Node]]): Xml2Csv =
    Xml2Csv(XmlExtractor(i, xPaths, namespaces, detachNodes), o)

  def apply(input: Try[XmlRowSource], output: Try[Writer[Iterator[Seq[String]]]], config: Try[Reader], namespace: Option[Try[Reader]] = None, detachNodes: Boolean): Try[Xml2Csv] = {
    for {
      i      <- input.rethrow("An exception occurred while connecting input resource.")
      o      <- output.rethrow("An exception occurred while connecting output resource.")
      ns     <- namespace.toTryOption.map(_.map(r => parse(r, "(.*)[,=;](.*);".r).toMap).getOrElse(Map[String, String]())).rethrow(
        "An exception occurred while retrieving namespaces from config file.")
      xPaths <- config.map(r => parse(r, xPathSplitRegex).toSeq).rethrow("An exception occurred while retrieving xPath from config file.")
    } yield apply(i, o, xPaths, ns, DetachStrategy.fromBool[TreeNode[Node]](detachNodes))}.rethrow("An exception occurred while setting up Xml2Csv.")

  def parse(reader: Reader, pattern: util.matching.Regex) =
    LineRowSource(reader).map{case pattern(k, v) => (k, v)}
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
