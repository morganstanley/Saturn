package com.ms.qaTools.toolkit.validate
import com.fasterxml.jackson.databind.JsonNode
import com.google.protobuf.Message
import com.ms.qaTools.compare.writer.DiffSetWriter
import com.ms.qaTools.compare.writer.tree.ConsoleDiffSetWriter
import com.ms.qaTools.compare.writer.tree.ECoreDiffSetWriter
import com.ms.qaTools.io.rowSource.Utils.W3CDocumentUtil
import com.ms.qaTools.toolkit.ToolkitApp
import com.ms.qaTools.withCloseable
import java.io.File
import org.w3c.dom.Document

class ValidateApp[T, C <: ValidateCmdLine](val APP_NAME: String, val cmdLine: C, val serializerBuilder: C => (T => String), val builder: (C, DiffSetWriter) => Validate[_])
extends ToolkitApp[ValidateResult] {
  try {
    parseArguments
    val serializer = serializerBuilder(cmdLine)
    val writer = Option(cmdLine.outFileName).map(f => new ECoreDiffSetWriter(new File(f), serializer)).getOrElse(new ConsoleDiffSetWriter(cmdLine.print, serializer))
    exit(withCloseable(writer){w =>
      builder(cmdLine, w).run})
  } catch {
    case t: Throwable => exitException(t)
  }
}

object XmlValidateApp extends ValidateApp("XmlValidate", new XmlValidateCmdLine, (c:XmlValidateCmdLine) => (d: Document) => d.toXmlString,
  (cli: XmlValidateCmdLine, w: DiffSetWriter) => XmlValidate(Option(cli.configFileName), cli.expectedFileName, cli.actualFileName, w))

object JsonValidateApp extends ValidateApp("JsonValidate", new JsonValidateCmdLine, (c: JsonValidateCmdLine) => (j: JsonNode) => j.toString,
  (cli: JsonValidateCmdLine, w: DiffSetWriter) => JsonValidate(cli.expectedRowSource, cli.actualRowSource, w))

object PbValidateApp extends ValidateApp("PbValidate", new PbValidateCmdLine, (c: PbValidateCmdLine) => (msg: Message) => msg.toString,
  (cli: PbValidateCmdLine, w: DiffSetWriter) => PbValidate(cli.template, cli.expectedRowSource, cli.actualRowSource, cli.descriptor, w))

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
