package com.ms.qaTools.toolkit
import com.ms.qaTools.AnyUtil
import com.ms.qaTools.withCloseable
import com.ms.qaTools.interpreter.ShellInterpreter
import com.ms.qaTools.interpreter.ShellInterpreterResult
import com.ms.qaTools.io.rowSource.Utils.StringUtil
import com.ms.qaTools.io.rowSource.Utils.W3CDocumentUtil
import com.ms.qaTools.io.rowSource.Utils.W3CNodeUtil
import com.ms.qaTools.Logger
import com.ms.qaTools.toolkit.cmdLine.BasicCmdLine
import com.ms.qaTools.xml.nodeList2List
import java.io.File
import java.io.FileWriter
import org.apache.commons.io.filefilter.FileFilterUtils
import org.apache.commons.io.FilenameUtils
import org.apache.commons.io.FileUtils
import org.kohsuke.args4j
import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.Node
import org.w3c.dom.Text
import scala.collection.JavaConversions._
import scala.io.Source.fromFile
import scala.sys.process._

object PlutoDocApp extends ToolkitApp[Result] {
  val APP_NAME = "plutoDoc"
  val cmdLine = new PlutoDocCmdLine

  exit(util.Try {
    parseArguments

    val properties = Option(cmdLine.PropertiesFile).map{f =>
      val p = new java.util.Properties
      p.load(new java.io.FileReader(f))
      p.stringPropertyNames.map{n => (n, p.getProperty(n))}.toMap
    }.getOrElse(Map.empty)

    val target = Option(cmdLine.target)

    lazy val doc   = openXmlDoc(target, properties)
    lazy val topic = fileWithoutExtension(target)
    lazy val dir   = FileUtils.getFile(cmdLine.directory + "/" + topic + "/")

    def validateTarget: String = {target.getOrElse(sys.error("Requirement Failed: generate/validate/update operations require file argument"))}

    cmdLine.function match {
      case "generate" => generate(validateTarget, cmdLine.directory, doc, topic, dir, Option(cmdLine.path), properties, cmdLine.quiet)
      case "validate" => validate(cmdLine.directory, doc, topic, dir, Option(cmdLine.path), properties, cmdLine.quiet)
      case "update"   => generate(validateTarget, cmdLine.directory, doc, topic, dir, Option(cmdLine.path), properties, cmdLine.quiet, upload = true)
      case "list"     => find(target)
      case "copy"     => ???
      case o          => sys.error(s"$APP_NAME: Unknown operation: $o")}
    Result(Passed)})

  def printMessage(x:String, quiet:Boolean){
    if(!quiet){
      println(x)
    }
  }

  def find(mpr: Option[String]) ={
    val listSeperator = Option(sys.props("plutoDoc.list.seperator")).getOrElse("")
    val targetPath = mpr.getOrElse("")
    //regex expression finds the first part of the sent in string
    val elements = mpr.getOrElse("").split("/")
    val filter = (if(elements.size > 2) {val (a, b) = elements.splitAt(1); a ++ (listSeperator +: b)} else elements).mkString("/")

    Option(sys.env("PLUTODOCPATH")).getOrElse("").split(":").filter(x => x.nonEmpty && x.contains(filter)).foreach{f =>
      println(f)
      FileUtils.getFile(f).listFiles.map(_.getAbsoluteFile).filterNot(_.getName.matches(".*\\.html")).foreach{x => println("   " + x.getName)}
    }
  }

  def commandNodeInit(doc:Document, dir:File, quiet: Boolean, path: Option[String], fn:String){
    doc.getDocumentElement.getChildNodes.collect {
      case e: Element if e.getNodeName == "Command" =>
        val interpreter = Option(e.getAttribute("interpreter")).filter(_ != "").getOrElse("/ms/dist/fsf/PROJ/ksh/93uplus/bin/ksh -e")
        val file = new File(dir, Option(e.getAttribute("filename")).filter(_ != "").getOrElse(sys.error("Command node requires filename attribute")))
        fn match{
          case "generate" => copyCommandScripts(e,interpreter,file,quiet)
          case "validate" => setCommandScripts(file,dir,path,quiet)
        }
    }
  }

  def copyCommandScripts(e:Element,interpreter:String, file: File,quiet:Boolean){
    printMessage(file + Console.GREEN + " OK" + Console.RESET,quiet)
    withCloseable(new FileWriter(file))(
      _.write(s"#!$interpreter\n" + e.getTextContent.split("\n").map(_.replaceAll("""^\s+""", "")).mkString("\n")))
  }

  def setCommandScripts(file: File,dir:File,path: Option[String],quiet:Boolean){
    file.setExecutable(true)
    val exit = Process(Seq(s"$file"), dir, ("PATH", path.map(_ + ":").getOrElse("") + sys.env("PATH"))).!
      assert(exit == 0, s"${Console.GREEN} $file returned $exit ${Console.RESET}") // TODO logger.debug(stdout/stderr)
      printMessage(file + Console.GREEN + " OK" + Console.RESET,quiet)
  }

  def generate(target: String, location: String, doc: Document, topic: String, dir: File, path: Option[String], properties: Map[String, String], quiet: Boolean, upload: Boolean = false): Unit = {
    printMessage("Generating...",quiet)
    printMessage("Creating Example Directory:",quiet)
    FileUtils.forceMkdir(dir)
    printMessage(dir + Console.GREEN + " OK"+ Console.RESET,quiet)
    printMessage("Copying Files:",quiet)

    for (f <- FileUtils.getFile(target).getCanonicalFile.getParentFile.listFiles.filterNot(_.toString matches s"$topic\\.plutoDoc")){
      printMessage(f + Console.GREEN + " OK"+ Console.RESET,quiet)
      FileUtils.copyFileToDirectory(f, dir)
    }
    withCloseable(new FileWriter(s"$dir/$topic.twiki"))(
      _.write(s"<!-- Automatically generated from $target. Do not edit. --> %CUSTOM_NAV%\n" + generateTwiki(doc, dir.getPath)))
    printMessage("generating scripts...",quiet)

    commandNodeInit(doc,dir,quiet,path,"generate")

    if(upload){
      printMessage("Uploading to twiki...",quiet)
      val attachments = FileUtils.getFile(target).getCanonicalFile.getParentFile.listFiles.map(_.toString).filterNot(_ matches s"$topic\\.(plutoDoc|twiki)")
      val twiki       = Option(sys.props("pluto.twiki.bin")).getOrElse(sys.error("Property plutoDoc.twiki.bin is not defined"))
      val web         = Option(sys.props("pluto.twiki.web")).getOrElse(sys.error("Property plutoDoc.twiki.web is not defined"))

      uploadCommand(s"$twiki put -force $web.$topic $location/$topic/$topic.twiki")
      if(attachments.nonEmpty){
        uploadCommand(s"$twiki attach -hidefile $web.$topic " + attachments.mkString(" "))
      }
      printMessage("Upload complete",quiet)
    }
  }

 def validate(location: String, doc: Document, topic: String, dir: File, path: Option[String], properties: Map[String, String], quiet: Boolean): Unit = {
    printMessage("Validating " + topic + "...",quiet)
    commandNodeInit(doc,dir,quiet,path,"validate")
    printMessage("Validation complete!",quiet)
  }

  def uploadCommand(command: String): Unit = {
    Logger(getClass).info(command)
    ShellInterpreter().run(command) match {
      case ShellInterpreterResult(Passed, _, Some(0), _, _, None) => ()
      case ShellInterpreterResult(_, _, _, _, _, Some(t)) => throw t
      case result =>
        sys.error(Seq(result.stdoutStr, result.stderrStr, "Exit: " + result.exitCode.map(_.toString).getOrElse("N/A")).mkString("\n"))
    }
  }

  def extractAllNodes(n: Node): Iterator[Node] =
    Iterator(n) ++ n.getChildNodes.iterator.flatMap(extractAllNodes)

  def fileWithoutExtension(fileName: Option[String]) = FilenameUtils.removeExtension(new File(fileName.getOrElse(sys.error("Requirement Failed: generate/validate/update operations require file argument"))).getName)

  def openXmlDoc(file: Option[String], properties: Map[String, String]): Document =
    fromFile(file.getOrElse(sys.error("Invalid File"))).mkString("<plutoDoc>", "", "</plutoDoc>").toDocument.withSideEffect{doc =>
      for (n <- extractAllNodes(doc).collect{case t: Text => t})
        for((v: String) <- """[^\\]\$\{(.*?)\}""".r.findAllMatchIn(n.getWholeText).map(_.group(1)).toSet)
          n.setTextContent(("\\$\\{" + v + "\\}").r.replaceAllIn(
            n.getWholeText,
            properties.getOrElse(v, sys.error(s"Variable: $v does not exist."))))
    }


  def generateTwiki(doc: Document, dir: String) =
    doc.getDocumentElement.getChildNodes.map {
      case t: Text => t.getWholeText
      case e: Element if e.getNodeName == "File" => {
        val fileName = Option(e.getAttribute("name")).filter(_ != "").getOrElse(sys.error("`File` tag is missing mandatory attribute `name`"))
        if(Option(e.getAttribute("display")).filter(_ != "").getOrElse("true").toBoolean)
          fromFile(dir + "/" + fileName).mkString("<verbatim>\n", "", "</verbatim>\n")
        else ""
      }
      case e: Element if e.getNodeName == "Command" =>
        if(Option(e.getAttribute("display")).filter(_ != "").getOrElse("true").toBoolean) s"<verbatim>${e.getTextContent}</verbatim>" else ""
      case n => n.cloneNode(true).toDocument.toXmlString
    }.mkString
}

class PlutoDocCmdLine extends BasicCmdLine {
  @args4j.Option(name = "--propertiesFile", aliases = Array("propertiesFile"), usage = "Properties file with variables to replace in plutoDoc source", required = false)
  val PropertiesFile: String = null

  @args4j.Option(name = "--quiet", aliases = Array("-q"), usage = "prevent output of text to the console from PlutoDoc", required = false)
  val quiet: Boolean = false

  @args4j.Argument(usage = "{ generate | upload | list | copy }", index = 0, required = true)
  val function: String = null

  @args4j.Argument(usage = "plutoDoc file (generate/validate) OR m/p/r (list/copy)", index = 1)
  val target: String = null

  @args4j.Option(name = "--output", aliases = Array("-o"), usage = "Output directory (default: /tmp)", required = false)
  val directory: String = sys.props("java.io.tmpdir")

  @args4j.Option(name = "--path", usage = "Directories to prepend to path", required = false)
  val path: String = null
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
