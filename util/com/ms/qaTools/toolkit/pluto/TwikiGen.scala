package com.ms.qaTools.toolkit.pluto

import scala.util.Success
import scala.util.Try
import org.apache.commons.io.FileUtils
import org.w3c.dom.Document
import com.ms.qaTools.Logger
import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.io.DirIO
import com.ms.qaTools.io.FileIO
import com.ms.qaTools.io.definition.SlurpIO
import com.ms.qaTools.io.rowSource.Utils.W3CDocumentUtil
import com.ms.qaTools.io.rowSource.Utils.W3CNodeUtil
import com.ms.qaTools.toolkit.Passed
import com.ms.qaTools.toolkit.Runnable
import java.io.File
import java.io.FileWriter
import com.ms.qaTools.toolkit.Failed
import com.ms.qaTools.xml.`package`.nodeList2List
import com.ms.qaTools.interpreter.ShellInterpreter

class TwikiGen(plutoFile: String, location: String, properties: Map[String, String]) extends Runnable[PlutoResult] {
  val logger = Logger(this.getClass)

  override def run = Try {
    val topic         = Pluto.FileWithoutExtension(plutoFile)
    val dir           = FileUtils.getFile(plutoFile).getAbsoluteFile.getParent
    val twikiFileName = s"$location/$topic/$topic.twiki"
    val attachments   = FileUtils.getFile(plutoFile).getCanonicalFile.getParentFile.listFiles.filterNot(_.toString matches s"$topic\\.pluto").map(_.toString)

    for (doc <- Pluto.openXmlDoc(plutoFile, properties); twikiString <- generateTwiki(doc, dir)) {
      FileUtils.forceMkdir(FileUtils.getFile(twikiFileName).getParentFile)
      val fw = new FileWriter(twikiFileName, false)
      fw.write(s"<!-- Automatically generated from $plutoFile. Do not edit. -->\n" + twikiString)
      fw.close()
    } // TODO check result

    if(attachments.nonEmpty)
      uploadCommand(properties("pluto.twiki.bin") + " attach -hidefile " + properties("pluto.twiki.web") + "." + topic + " " + attachments.mkString(" ")) // FIXME check result
    val result = uploadCommand(properties("pluto.twiki.bin") + " put -force " + properties("pluto.twiki.web") + "." + topic + " " + twikiFileName)
    PlutoResult(if(result) Passed() else Failed())
  }

  def uploadCommand(command: String): Boolean = {
    val shell = new ShellInterpreter
    val result = shell.run(command)
    val exitCode = result.exitCode.getOrElse(-1)
    if (exitCode == 0)
      logger.info("TWIKI updated successfully :" + command)
    else {
      logger.info("Validation Command has failed :" + command)
      logger.info("Exit Code:" + result.exitCode)
      logger.info(result.stderrStr)
      logger.info(result.stdoutStr)
    }
    exitCode == 0
  }

  def generateTwiki(doc: Document, documentDirName: String) = {
    doc.getDocumentElement.getChildNodes.map {
      case PlutoDoc.TextNode(text) =>
        Success(text)
      case PlutoDoc.FileNode(fileName, display) =>
        if(display)
          SlurpIO(DirIO(documentDirName) + FileIO(fileName)).input.map{rows => s"<verbatim>\n${rows.mkString}</verbatim>\n"}
        else Success("")
      case PlutoDoc.CommandNode(command, _, _, display) =>
        Success(if(display) s"<verbatim>$command</verbatim>" else "")
      case n => Success(n.cloneNode(true).toDocument.toXmlString)
    }.toTrySeq.map { _.mkString }
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
