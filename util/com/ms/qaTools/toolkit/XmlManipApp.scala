package com.ms.qaTools.toolkit

import com.ms.qaTools.conversions.XmlToTreeNodeConversions._
import com.ms.qaTools.conversions.XmlToTreeNodeConversions.nodeToDocument
import com.ms.qaTools.io.rowSource.file.XmlRowSource
import com.ms.qaTools.io.rowWriter.XmlRowWriter
import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.toolkit.cmdLine._
import com.ms.qaTools.tree.mappers.XmlNodeTransformer
import com.ms.qaTools.TryUtil
import com.ms.qaTools.xml.NamespaceContextImpl
import com.ms.qaTools.xml.XmlManipulator
import org.kohsuke.args4j.CmdLineException
import org.kohsuke.args4j.CmdLineParser
import org.kohsuke.args4j.Option
import org.w3c.dom.Document
import scala.collection.JavaConversions._
import scala.util.Try

case class XmlManipResult(status: Status, exception: scala.Option[Throwable] = None) extends Result

object XmlManipApp extends ToolkitApp[XmlManipResult] {
  val APP_NAME = "XmlManip"
  val cmdLine = new XmlManipCmdLine(Map(
    "add"       -> (() => new XmlManipAddCmdLine),
    "delete"    -> (() => new XmlManipDeleteCmdLine),
    "intersect" -> (() => new XmlManipIntersectCmdLine),
    "replace"   -> (() => new XmlManipReplaceCmdLine),
    "select"    -> (() => new XmlManipSelectCmdLine),
    "shift"     -> (() => new XmlManipShiftCmdLine),
    "sort"      -> (() => new XmlManipSortCmdLine),
    "split"     -> (() => new XmlManipSplitCmdLine),
    "where"     -> (() => new XmlManipWhereCmdLine)))


  exit(Try{parseArguments; XmlManip(cmdLine.inRowSource, cmdLine.parseOperations(args), cmdLine.xmlRowWriter, cmdLine.namespaces.map{n =>
    if (!n.contains("=")) throw new Error("Namespace wrong format: " + n)
    val tokens = n.split("=")
    tokens(0) -> tokens(1)
  }.toMap)}.flatMap(_.run))
}

case class XmlManip(xmlManipulator: XmlManipulator, xmlRowWriter: XmlRowWriter) extends Runnable[XmlManipResult] {
  def run =
    Try{xmlRowWriter.write(xmlManipulator.map(nodeToDocument)); XmlManipResult(Passed)}.rethrow("An exception occurred while running XmlManip.")
}

object XmlManip {
  def apply(xmlRowSource: XmlRowSource, transformers: Seq[XmlNodeTransformer[_, _]], xmlRowWriter: XmlRowWriter, namespaces: Map[String, String] = Map.empty) =
    new XmlManip(XmlManipulator(xmlRowSource, transformers, xmlRowSource.namespaceContext + namespaces), xmlRowWriter)

  def apply(inputTry: Try[XmlRowSource], outputTry: Try[XmlRowWriter], namespaceTry: Seq[(Try[String], Try[String])],
    transformersTry: Seq[Try[XmlNodeTransformer[_, _]]]): Try[XmlManip] = {
    for {
      input <- inputTry.rethrow("An exception occurred while connecting input resource.")
      output <- outputTry.rethrow("An exception occurred while connecting output resource.")
      namespaces <- namespaceTry.map {
        case (prefixTry, urlTry) => prefixTry flatMap (prefix => urlTry map (url => (prefix, url)))
      }.toTrySeq.rethrow("An exception occurred while generating namespace map.")
      transformers <- transformersTry.toTrySeq.rethrow("An exception occurred while creating xml transformers.")
    } yield XmlManip(input, transformers, output, namespaces.toMap)
  }.rethrow("An exception occurred while setting up XmlManip.")
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
