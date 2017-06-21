package com.ms.qaTools.protobuf.generator

import com.google.protobuf.Descriptors.Descriptor
import com.google.protobuf.DynamicMessage
import com.google.protobuf.ExtensionRegistry
import com.google.protobuf.Message
import com.google.protobuf.Message.Builder
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.protobuf.DescriptorBuilder
import com.ms.qaTools.tree.generator.ColContext
import com.ms.qaTools.tree.generator.ColMap
import com.ms.qaTools.tree.generator.Lookupable
import com.ms.qaTools.tree.generator.NodeCreator
import com.ms.qaTools.tree.generator.UnresolvedColQuery

case class PBCreator(descriptor: Descriptor, creator: PBMessageCreator) extends NodeCreator[Builder, Message] {
  val isLocal = true
  protected val builder: Builder = DynamicMessage.getDefaultInstance(descriptor).toBuilder()

  def create(data: Seq[String])(implicit colMap: Lookupable, context: ColContext, builder: Builder = builder): Message =
    creator.create(data).build()

  def extractColQueries: Set[UnresolvedColQuery] = creator.extractColQueries.flatMap { _.hierarchy }

  override def toString: String = "PBCreator(" + creator + ")"
}

object PBCreator {
  def apply(descriptor: Descriptor, template: DynamicMessage)(implicit extensionRegistry: ExtensionRegistry): PBCreator =
    new PBCreator(descriptor, PBNodeCreator(template, descriptor))
}

object ProtoBufCreator {
  def apply(descriptor: Descriptor, template: DynamicMessage, rowSource: Iterator[Seq[String]] with ColumnDefinitions)(implicit extensionRegistry: ExtensionRegistry): Message = {
    val creator = PBCreator(descriptor, template)
    implicit val colContext = ColContext(creator.extractColQueries)
    implicit val colMap = ColMap(rowSource.colDefs.map(_.name))
    creator.create(rowSource.next)
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
