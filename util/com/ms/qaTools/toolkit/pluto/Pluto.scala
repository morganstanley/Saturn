package com.ms.qaTools.toolkit.pluto

import scala.util.Try
import org.apache.commons.io.FilenameUtils
import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.Node
import org.w3c.dom.Text
import com.ms.qaTools.io.FileIO
import com.ms.qaTools.io.definition.SlurpIO
import com.ms.qaTools.io.rowSource.file.XmlBufferRowSource
import com.ms.qaTools.toolkit.Status
import com.ms.qaTools.toolkit.Result
import scala.sys.process._
import scala.collection.JavaConversions._

case class PlutoResult(override val status: Status, override val exception: Option[Throwable] = None) extends Result

object PlutoDoc {
  object TextNode {
    def unapply(n: Node): Option[String] = n match {
      case t: Text => Some(t.getWholeText())
      case _ => None
    }
  }

  def ElemText(parent: Element, nodeName: String): Option[String] = {
    val children = parent.getElementsByTagName(nodeName)
    if (children.getLength() > 0) {
      Some(children.item(0).getTextContent())
    } else None
  }

  object FileNode {
    def unapply(n: Node): Option[(String, Boolean)] = n match {
      case e: Element if e.getNodeName() == "File" => {
        val fileName = Option(e.getAttribute("name")).getOrElse(sys.error("Missing mandatory name in File node"))
        val display = Option(e.getAttribute("display")).filter(_ != "").getOrElse("true").toBoolean
        Some((fileName, display))
      }
      case _ => None
    }
  }

  object CommandNode {
    def unapply(n: Node): Option[(String, String, String, Boolean)] = n match {
      case e: Element if e.getNodeName() == "Command" => {
        val command = e.getTextContent()
        val interpreter = Option(e.getAttribute("interpreter")).filter(_ != "").getOrElse("/ms/dist/fsf/PROJ/ksh/93uplus/bin/ksh -e")
        val fileName = Option(e.getAttribute("filename")).filter(_ != "").getOrElse(sys.error("Command node requires filename attribute"))
        val display = Option(e.getAttribute("display")).filter(_ != "").getOrElse("true").toBoolean
        Some(command, interpreter, fileName, display)
      }
      case _ => None
    }
  }
}

object Pluto {
  import PlutoDoc._
  import com.ms.qaTools.MonadSeqUtil
  import com.ms.qaTools.TryUtil

  def extractAllNodes(doc: Document): Seq[Node] = {
    def extractAllNodes(nodes: List[Node], soFar: List[Node]): Seq[Node] = {
      if (nodes.isEmpty) soFar
      else {
        val head = nodes.head
        val headChildNodes = head.getChildNodes()
        val headChildNodeList = (0 to headChildNodes.getLength() - 1).map { i => headChildNodes.item(i) }.toList
        val newNodes = headChildNodeList ::: nodes.tail
        extractAllNodes(newNodes, head :: soFar)
      }
    }
    extractAllNodes(List(doc), Nil)
  }

  def extractAllTextNodes(doc: Document) = extractAllNodes(doc).collect { case t: Text => t }

  def extractAllVariables(doc: Document) = {
    val variableR = """[^\\]\$\{(.*?)\}""".r
    val allText = extractAllTextNodes(doc).map { _.getWholeText() }
    allText.flatMap { t => variableR.findAllMatchIn(t).toList.map { _.group(1) } }
  }

  def replaceVariable(doc: Document, variable: String, value: String) = {
    val variableR = ("\\$\\{" + variable + "\\}").r
    for {textNode <- extractAllTextNodes(doc)} {
      val text = textNode.getWholeText()
      variableR replaceAllIn (text, value)
      textNode.setTextContent(variableR replaceAllIn (text, value))
    }
  }

  def openXmlDoc(fileName: String, properties: Map[String, String]): Try[Document] = {
    for {
      contents <- SlurpIO(FileIO(fileName)).input.map { _.mkString }
      xmlDoc <- Try{XmlBufferRowSource(s"<Pluto>$contents</Pluto>").take(1).toList.head}
    } yield {
      for {variable <- Pluto.extractAllVariables(xmlDoc)} {
        val value = properties.getOrElse(variable, throw new Exception(s"Variable: $variable does not exist."))
        Pluto.replaceVariable(xmlDoc, variable, value)
      }
      xmlDoc
    }
  }

  def getXmlDoc(fileName: String): Try[Document] = {
    val fileIO = FileIO(fileName)
    for {
      contents <- SlurpIO(fileIO).input.map { _.mkString }
      xmlDocStr = s"<Pluto>$contents</Pluto>"
      xmlDoc <- Try { XmlBufferRowSource(xmlDocStr).take(1).toList.head }
    } yield xmlDoc
  }

  def FileWithoutExtension(fileName: String) = FilenameUtils.removeExtension(new java.io.File(fileName).getName)
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
