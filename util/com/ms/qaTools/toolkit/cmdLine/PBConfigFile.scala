package com.ms.qaTools.toolkit.cmdLine

import org.kohsuke.args4j.{Option => JOption}
import com.ms.qaTools.protobuf.DescriptorBuilder
import com.ms.qaTools.protobuf.PBTemplateBuilder
import com.google.protobuf.Descriptors.Descriptor



trait OptionalPBConfigFile {

  @JOption(name = "--descriptorFile", usage = "Specify protocol buffer descriptor file name.", required = true)
  val descFileName: String = null

  @JOption(name = "--messageType", usage = "Specify protocol buffer message type name.", required = true)
  val pbMessageType: String = null

  @JOption(name = "-t", aliases = Array("--configFileName"), usage = "Specify protocol buffer config/template file name.")
  val configFileName: String = null

  def template = Option(configFileName) map {PBTemplateBuilder(_, descFileName, pbMessageType)}
 
  def descriptor: Descriptor = {
    descFileName match {
      case null => null
      case _ => DescriptorBuilder(descFileName, pbMessageType).filter(_.getName() == pbMessageType).head
    }
  }
}

trait RequiredPBConfigFile {

  @JOption(name = "--descriptorFile", usage = "Specify protocol buffer descriptor file name.", required = true)
  val descFileName: String = null

  @JOption(name = "--messageType", usage = "Specify protocol buffer message type name.", required = true)
  val pbMessageType: String = null

  @JOption(name = "-c", aliases = Array("--configFileName"), usage = "specify an input config fileName", required = true)
  val configFileName: String = null

  def template = PBTemplateBuilder(configFileName, descFileName, pbMessageType)

  def descriptor: Descriptor = {
    val descriptor = DescriptorBuilder(descFileName, pbMessageType).filter(_.getName() == pbMessageType).head
    descriptor
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
