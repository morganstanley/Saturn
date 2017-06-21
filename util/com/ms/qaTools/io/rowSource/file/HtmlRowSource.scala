package com.ms.qaTools.io.rowSource.file

import com.ms.qaTools.io.rowSource.Utils._
import java.io.InputStream
import java.io.InputStreamReader
import java.io.File
import java.io.FileReader
import java.io.{Reader => JReader}
import java.io.StringReader
import org.ccil.cowan.tagsoup.Parser
import org.jdom.input.SAXHandler
import org.jdom.output.DOMOutputter
import org.xml.sax.InputSource


trait HtmlRowSourceCreator {
  def createParser = {
    val p = new Parser()
    p.setFeature("http://xml.org/sax/features/namespaces", true);
    p.setFeature("http://xml.org/sax/features/namespace-prefixes", false);
    p
  }

  def parseHtml(is: InputSource): String = {
    val p = createParser
    val handler = new SAXHandler()
    p.setContentHandler(handler)
    val hndl = p.getContentHandler()
    p.parse(is)
    val doc = handler.getDocument()
    (new DOMOutputter).output(doc).toXmlString
  }

  def apply(reader: JReader, bufSize: Int = 4 * 1024) = {
    val output = parseHtml(new InputSource(reader))
    new XmlRowSource(new StringReader(output), bufSize = bufSize)
  }
}

object HtmlFileRowSource extends HtmlRowSourceCreator {
  def apply(file: File): XmlRowSource = apply(new FileReader(file))
  def apply(fileName: String): XmlRowSource = apply(new FileReader(new File(fileName)))
  def apply(inStream: InputStream): XmlRowSource = XmlRowSource(new InputStreamReader(inStream))
}

object HtmlBufferRowSource extends HtmlRowSourceCreator {
  def apply(buffer: String): XmlRowSource = apply(new StringReader(buffer))
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
