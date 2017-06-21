package com.ms.qaTools.io.rowSource

import java.io.File
import java.io.FileReader
import java.io.Reader
import java.io.StringReader

import scala.collection.JavaConverters._

import com.fasterxml.jackson.core.JsonFactory
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.ms.qaTools.IteratorProxy

class JsonRowSource(reader: Reader) extends IteratorProxy[JsonNode] {
  private val jp = (new JsonFactory()).createParser(reader)
  jp.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true)
  jp.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true)
  jp.configure(JsonParser.Feature.ALLOW_COMMENTS, true)
  jp.configure(JsonParser.Feature.AUTO_CLOSE_SOURCE, false)
  val self = (new ObjectMapper()).readValues(jp, classOf[JsonNode]).asScala
  override def close() = reader.close()
}

object JsonFileRowSource {
  def apply(fileName: String) = JsonRowSource(new FileReader(fileName))
}

object JsonRowSource {
  def apply(buffer: String): JsonRowSource = apply(new StringReader(buffer))
  def apply(file: File): JsonRowSource     = apply(new FileReader(file))
  def apply(reader: Reader): JsonRowSource = new JsonRowSource(reader)
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
