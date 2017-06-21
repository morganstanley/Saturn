package com.ms.qaTools.toolkit
import com.ms.qaTools.fix.IFixDictionary
import com.ms.qaTools.io.rowSource.file.FixXmlRowSource
import com.ms.qaTools.io.rowSource.Utils.W3CDocumentIteratorUtil
import com.ms.qaTools.io.rowWriter.FixRowWriter
import com.ms.qaTools.IteratorProxy
import com.ms.qaTools.toolkit.cmdLine.BasicCmdLine
import com.ms.qaTools.toolkit.cmdLine.FixDictionary
import com.ms.qaTools.toolkit.cmdLine.InputDelimitedFile
import com.ms.qaTools.toolkit.cmdLine.InputFixTemplateFile
import com.ms.qaTools.toolkit.cmdLine.OutputFixFile
import com.ms.qaTools.xml.generator.XmlGenerator
import quickfix.DataDictionary
import quickfix.Message
import scala.util.Try

abstract class AFixGenApp extends ToolkitApp[Result] {
  val APP_NAME = "FixGen"
  override def cmdLine: BasicCmdLine with InputDelimitedFile with InputFixTemplateFile with OutputFixFile
  def generator: Iterator[Message] with IFixDictionary

  exit(Try {
    parseArguments
    cmdLine.fixRowWriter.write(new IteratorProxy[Message] {val self = generator})
    Result(Passed)})
}

object FixGenApp extends AFixGenApp {
  lazy val cmdLine = new BasicCmdLine with InputDelimitedFile with InputFixTemplateFile with OutputFixFile with FixDictionary
  lazy val generator = XmlGenerator(FixXmlRowSource(Iterator(cmdLine.fixTemplate.ensuring(_.hasNext).next)).next, cmdLine.inRowSource).toFixIterator(cmdLine.dataDictionary) // FIXME fix FixRowSource and remove .ensuring
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
