package com.ms.qaTools.toolkit.mq
import com.ms.qaTools.io.QueueIO
import com.ms.qaTools.io.rowSource.file.XmlFileRowSource
import com.ms.qaTools.io.rowSource.Utils.{JmsDelimitedRowUtil, W3CDocumentUtil}
import com.ms.qaTools.toolkit.cmdLine.BasicCmdLine
import com.ms.qaTools.toolkit.cmdLine.InputDelimitedFile
import com.ms.qaTools.toolkit.cmdLine.OutputFile
import org.kohsuke.args4j.{Option => Args4JOption}

class MQBasicCommandLine extends BasicCmdLine {
  @Args4JOption(name = "-m", aliases = Array("--manager"), usage = "MQ manager", required = true)
  val manager: String = null

  @Args4JOption(name = "-q", aliases = Array("--queue"), usage = "Queue name", required = true)
  val queue: String = null

  @Args4JOption(name = "-s", aliases = Array("--showSummary"), usage = "Show mqGet operation summary")
  val showSummary: Boolean = false
}

class MQGetCommandLine extends MQBasicCommandLine with OutputFile {
  @Args4JOption(name = "--timeout", usage = "Timeout while waiting for next message (milliseconds)")
  val timeout: Long = QueueIO.Config().timeout
}

class MQPutCommandLine extends MQBasicCommandLine with InputDelimitedFile {
  def inMessageRowSource(session: javax.jms.Session): Iterator[javax.jms.Message] =
    inFmt match {
      case "XML" => XmlFileRowSource(inFileName).map(_.toBytesMessage(session))
      case _ => inRowSource.map(_.toBytesMessage(session))
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
