package com.ms.qaTools.toolkit

import java.io.FileReader

import org.kohsuke.args4j.{ Option => JOption }
import org.w3c.dom.Document

import com.ms.qaTools.compare.writer.tree.ConsoleDiffSetWriter
import com.ms.qaTools.compare.writer.tree.TreeDiffSetWriter
import com.ms.qaTools.fix.FixValidator
import com.ms.qaTools.fix.IFixDictionary
import com.ms.qaTools.io.rowSource.file.FixXmlRowSource
import com.ms.qaTools.toolkit.cmdLine.ComparisonFiles
import com.ms.qaTools.toolkit.cmdLine.FixDictionary
import com.ms.qaTools.toolkit.cmdLine.ValidateCmdLine
import com.ms.qaTools.tree.validator.TreeResult
import com.ms.qaTools.xml.NamespaceContextImpl
import com.ms.qaTools.xml.xpath.FixPathAwareXPath

import quickfix.DataDictionary

class FixConsolePrinter(printDocs: Boolean = false, dictionary: DataDictionary) extends ConsoleDiffSetWriter[Document](printDocs) {
  implicit val nsContext = NamespaceContextImpl()
  implicit val dict = dictionary

  override protected def printResult(result: TreeResult[Document]) = {
    val s = result.statistics
    s.different.toSeq.sorted.foreach(d => {
      val e = FixPathAwareXPath(d.expected.path(true)) asFixPath (d.expected.node)
      val a = FixPathAwareXPath(d.actual.path(true)) asFixPath (d.actual.node)
      println("D(%s,%s): %s != %s".format(e, a, d.expected.value, d.actual.value))
    })
    s.inLeftOnly.toSeq.sorted.foreach(d => println("IL(%s)".format(FixPathAwareXPath(d.expected.path(true)) asFixPath (d.expected.node))))
    s.inRightOnly.toSeq.sorted.foreach(d => println("IR(%s)".format(FixPathAwareXPath(d.actual.path(true)) asFixPath (d.actual.node))))
  }
}

object FixValidate {
  def apply(expected: FixXmlRowSource, actual: FixXmlRowSource, dataDictionary: DataDictionary, writer: TreeDiffSetWriter[_]) =
    new Validate(FixValidator(expected, actual, dataDictionary), writer)
}

abstract class FixValidateCmdLine extends ValidateCmdLine with ComparisonFiles with IFixDictionary {
  @JOption(name = "-s", aliases = Array("--separator"), usage = "field separator character such as ';'")
  val separator: String = null

  override def consoleDiffWriter = new FixConsolePrinter(print, dataDictionary)

  def validate(w: TreeDiffSetWriter[_]) =
    FixValidate(
      FixXmlRowSource(new FileReader(expectedFileName), dataDictionary, separator = Option(separator).map(_.head)),
      FixXmlRowSource(new FileReader(actualFileName), dataDictionary, separator = Option(separator).map(_.head)),
      dataDictionary, w)
}

object FixValidateApp extends ValidateApp("FixValidate", new FixValidateCmdLine with FixDictionary)
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
