package com.ms.qaTools.toolkit.cmdLine
import org.kohsuke.args4j.Option

trait InputFile {
  @Option(name = "-i", aliases = Array("--inFileName"), usage = "specify an input file [default: standard input]")
  val inFileName: String = null

  def reader = scala.Option(inFileName).map(new java.io.FileReader(_)).getOrElse(Console.in)

  def inputStream = scala.Option(inFileName).map(new java.io.FileInputStream(_)).getOrElse(System.in)
}

trait InputProtoBufFile extends InputFile {
  @Option(name = "-j", aliases = Array("--inJarName"), usage = "Specify jar file name.", required = true)
  val inJarName: String = null

  @Option(name = "-m", aliases = Array("--inClass"), usage = "Specify the message class name.", required = true)
  val inClass: String = null

  @Option(name = "-r", aliases = Array("--readDelimited"), usage = "Is Protocol buffer data in delimited format.")
  val readDelimited: Boolean = false

  @Option(name = "-e", aliases = Array("--readEncoded"), usage = "Is Protocol buffer data in Encoded format.")
  val readEncoded: Boolean = false

  @Option(name = "-p", aliases = Array("--printMessage"), usage = "Prints the manipulated protocol buffer Message.")
  val print: Boolean = false

  def inRowSource = {
    import com.google.protobuf.GeneratedMessage

    com.ms.qaTools.io.rowSource.ProtoBufRowSource(
      if (readEncoded) new org.apache.commons.codec.binary.Base64InputStream(inputStream) else new java.io.BufferedInputStream(inputStream),
      Class.forName(inClass, true, new java.net.URLClassLoader(Array(new java.io.File(inJarName).toURI.toURL))).asInstanceOf[Class[GeneratedMessage]],
      readDelimited)}
}

trait InputFixFile extends com.ms.qaTools.fix.IFixDictionary with InputFile {
  @Option(name = "--inFIXSeparator", usage = "specify FIX message separator (default: '\\u0001')")
  val inFixSeparator: Char = '\u0001'

  @Option(name = "--doValidation", usage = "Perform a validation on the FIX message")
  val doValidation = false

  def inRowSource = com.ms.qaTools.io.rowSource.file.FixRowSource(
    reader, dataDictionary, doValidation, scala.Option(inFixSeparator))
}

trait InputXmlFile extends InputFile {
  import com.ms.qaTools.io.rowSource.file

  @Option(name = "--fromHtml", usage = "input file in HTML format")
  val htmlInput: Boolean = false

  def inRowSource =
    if (htmlInput) file.HtmlFileRowSource(reader) else file.XmlRowSource(reader)
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
