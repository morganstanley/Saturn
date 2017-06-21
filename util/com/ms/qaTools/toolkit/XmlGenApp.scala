package com.ms.qaTools.toolkit

import scala.util.Try

import org.w3c.dom.Document

import com.ms.qaTools.TryUtil
import com.ms.qaTools.io.Writer
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.xml.generator.XmlGenerator
import com.ms.qaTools.toolkit.{cmdLine => cli}

trait LegacyMode {
  @org.kohsuke.args4j.Option(name = "--legacyMode", usage = "This app shoudl run in legacy mode (i.e. old toolkit parameters)", required = false)
  val legacyMode: Boolean = false
}

object XmlGenApp extends ToolkitApp[XmlGenResult] {
  val APP_NAME = "XmlGen"
  val cmdLine = new cli.BasicCmdLine with cli.InputDelimitedFile with cli.InputXmlTemplateFile with cli.OutputXmlFile with LegacyMode

  exit(util.Try {
    parseArguments
    XmlGen(cmdLine.xmlTemplate, cmdLine.inRowSource, cmdLine.xmlRowWriter, cmdLine.legacyMode).run
  }.flatten)
}

case class XmlGenResult(status: Status, exception: Option[Throwable] = None) extends Result

case class XmlGen(xmlGenerator: XmlGenerator, xmlRowWriter: Writer[Iterator[Document]]) extends Runnable[XmlGenResult] {
  def run = Try(xmlRowWriter.write(xmlGenerator)).rethrow("An exception occurred while running XmlGen.").map(_ => XmlGenResult(Passed))
}

object XmlGen {
  def apply(template: Document, rowSource: Iterator[Seq[String]] with ColumnDefinitions, xmlRowWriter: Writer[Iterator[Document]], isLegacyMode: Boolean = false) =
    new XmlGen(XmlGenerator(template, rowSource, isLegacyMode), xmlRowWriter)

  //apply method for Saturn Runtime
  def apply[T](templateTry: Try[Iterator[T]],
    outputTry: Try[Writer[Iterator[Document]]],
    inputTry: Try[Iterator[Seq[String]] with ColumnDefinitions],
    isLegacy: Boolean)(implicit templateTypeToSeqString: Iterator[T] => Iterator[Document]): Try[XmlGen] =
    {
      for {
        templateRs <- templateTry.rethrow("An exception occurred while connecting template resource.")
        template <- Try { if (templateRs.hasNext) templateTypeToSeqString(templateRs).next else throw new Exception("XmlGen template cannot be empty.") }.rethrow("An exception occurred while reading the xml template resource.")
        output <- outputTry.rethrow("An exception occurred while connecting output resource.")
        input <- inputTry.rethrow("An exception occurred while connecting input resource.")
      } yield XmlGen(template, input, output, isLegacy)
    }.rethrow("An exception occurred while setting up XmlGen.")
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
