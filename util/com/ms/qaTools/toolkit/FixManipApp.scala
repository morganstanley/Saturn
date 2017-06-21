package com.ms.qaTools.toolkit

import com.ms.qaTools.conversions.JavaIOConversions.writerFromFileName
import com.ms.qaTools.conversions.XmlToTreeNodeConversions.nodeToDocument
import com.ms.qaTools.fix.FixMessage
import com.ms.qaTools.io.rowSource.Utils
import com.ms.qaTools.io.rowWriter.XmlRowWriter
import com.ms.qaTools.toolkit.cmdLine.FixDictionary
import com.ms.qaTools.toolkit.cmdLine.FixManipAddCmdLine
import com.ms.qaTools.toolkit.cmdLine.FixManipCmdLine
import com.ms.qaTools.toolkit.cmdLine.FixManipDeleteCmdLine
import com.ms.qaTools.toolkit.cmdLine.FixManipOperationCmdLine
import com.ms.qaTools.toolkit.cmdLine.FixManipReplaceCmdLine
import com.ms.qaTools.toolkit.cmdLine.InputFixFile
import com.ms.qaTools.tree.mappers.XmlNodeTransformer
import com.ms.qaTools.xml.XmlManipulator
import org.w3c.dom.Document
import quickfix.DataDictionary
import scala.util.{Try, Failure}

abstract class AFixManipApp extends ToolkitApp[Result] {
  val APP_NAME = "FixManip"
  def cli: FixManipCmdLine with InputFixFile

  val cmdLine = cli
  def fixIterator(i: Iterator[Document], d: DataDictionary): Iterator[quickfix.Message]

  exit(Try{
    parseArguments
    val operations = (new FixManipOperationCmdLine(Map(
      "add"     -> (() => new FixManipAddCmdLine(cmdLine.dataDictionary)),
      "delete"  -> (() => new FixManipDeleteCmdLine(cmdLine.dataDictionary)),
      "replace" -> (() => new FixManipReplaceCmdLine(cmdLine.dataDictionary))))).parseOperations(args)
    val manipulator = XmlManipulator(cmdLine.inRowSource.toDocumentIterator, operations)
    cmdLine.outFmt match {
      case "FIX" => Try{
        cmdLine.fixRowWriter.write(fixIterator(manipulator.map(nodeToDocument), cmdLine.dataDictionary))
        Result(Passed)}
      case "XML" => (new XmlManip(manipulator, XmlRowWriter(cmdLine.outFileName))).run
      case _     => Failure(new Error("Wrong output format. FIX or XML only supported."))}}.flatten)
}

object FixManipApp extends AFixManipApp {
  def cli = new FixManipCmdLine with InputFixFile with FixDictionary
  def fixIterator(i: Iterator[Document], d: DataDictionary) = i.map(m => FixMessage(m, d))
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
