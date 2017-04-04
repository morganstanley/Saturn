package com.ms.qaTools.toolkit.pbGen

import com.ms.qaTools.toolkit.Runnable
import com.ms.qaTools.toolkit.Failed
import com.ms.qaTools.toolkit.Passed
import com.ms.qaTools.toolkit.Result
import com.ms.qaTools.toolkit.Status
import com.ms.qaTools.io.Writer
import com.ms.qaTools.io.DelimitedIterator
import com.ms.qaTools.io.rowWriter.protobuf.ProtoBufRowWriter
import com.google.protobuf.Message
import com.ms.qaTools.protobuf.generator.PBGenerator
import com.google.protobuf.DynamicMessage
import com.google.protobuf.ExtensionRegistry
import com.google.protobuf.Descriptors.Descriptor
import com.ms.qaTools._
import com.ms.qaTools.protobuf.PBMsgPrinter
import scala.util.Try

case class PBGenResult(override val status: Status,
  override val exception: Option[Throwable] = None) extends Result

class PBGen(pbGenerator: PBGenerator, pbRowWriter: Writer[Iterator[Message]], printMessage: Boolean)
    extends Runnable[PBGenResult] {
  require(pbRowWriter != null, "Null ProtoBuffer Row writer in PBGen")

  override def run = Try {
      val (pbGen, pbMsg) = pbGenerator.duplicate
      val count = pbRowWriter.write(pbGen)
      if (printMessage) {
        val msgPrint = PBMsgPrinter(pbMsg)
        msgPrint.print()
      }
      pbRowWriter.close
      if (count > 0)
        PBGenResult(Passed())
      else throw new Exception("PBGen failed to create protobuf message.")
  }
}

object PBGen {
  def apply(descriptor: Descriptor, template: DynamicMessage, rowSource: DelimitedIterator, pbRowWriter: ProtoBufRowWriter, printMessage: Boolean) = {
    implicit val extensionRegistry: ExtensionRegistry = null
    val pbGenerator = PBGenerator(descriptor, template, rowSource)
    new PBGen(pbGenerator, pbRowWriter, printMessage)
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
