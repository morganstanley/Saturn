package com.ms.qaTools.protobuf

import java.io.InputStream
import java.io.FileInputStream
import java.io.ByteArrayOutputStream
import com.google.protobuf.CodedOutputStream
import com.google.protobuf.Descriptors
import com.google.protobuf.Descriptors.Descriptor
import com.google.protobuf.Descriptors.FileDescriptor
import com.google.protobuf.DescriptorProtos
import com.google.protobuf.DescriptorProtos.DescriptorProto
import com.google.protobuf.DescriptorProtos.FileDescriptorProto
import java.io.File
import com.google.protobuf.DynamicMessage
import scala.collection.JavaConverters._



object DescriptorBuilder {

  def apply(fileName: String, messageType: String): Seq[Descriptor] =
    apply(new FileInputStream(fileName), messageType, fileName)

  def apply(inputStream: InputStream, messageType: String, fileName: String): Seq[Descriptor] = {

    val fds = DescriptorProtos.FileDescriptorSet.parseFrom(inputStream)
    require(fds.getFileList().size() > 0, "Descriptor set did not return anything.")
    val fdp = fds.getFile(0) // fixed to 0?
    val parentFolder = (new File(fileName)).getParentFile()
    val fd = FileDescriptor.buildFrom(fdp, getDependencyFileDescriptor(fdp, inputStream, parentFolder))
    val descriptors = fd.getMessageTypes().asScala.toSeq
    descriptors
  }

  def apply(fileName: String): Seq[Descriptor] =
    apply(new FileInputStream(fileName), fileName)

  def apply(inputStream: InputStream, fileName: String): Seq[Descriptor] = {
    val fds = DescriptorProtos.FileDescriptorSet.parseFrom(new FileInputStream(fileName))
    require(fds.getFileList().size() > 0, "Descriptor set did not return anything.")
    val fdp = fds.getFile(0) // fixed to 0?
    val parentFolder = (new File(fileName)).getParentFile()
    val fileDescriptors = getDependencyFileDescriptor(fdp, inputStream, parentFolder)
    val subDescriptors = fileDescriptors.foldLeft(Array[Descriptor]())((descriptorArray, fileDescriptor) => {
      val descriptors = fileDescriptor.getMessageTypes().asScala.toSeq
      descriptorArray ++ descriptors
    })
    subDescriptors
  }

  def apply(protos: Seq[DescriptorProto], subDescriptorProtos: Seq[DescriptorProto], fileName: String, messageType: String): Descriptor = {
    val fileDescBuilder = FileDescriptorProto.newBuilder()
    for (subDescriptorProto <- protos) { fileDescBuilder.addMessageType(subDescriptorProto) }
    for (subDescriptorProto <- subDescriptorProtos) { fileDescBuilder.addMessageType(subDescriptorProto) }
    val fileDescProto = fileDescBuilder.build()
    val fdArray = getDependencyFileDescriptor(fileDescProto, new FileInputStream(fileName), (new File(fileName)).getParentFile())
    val fd = FileDescriptor.buildFrom(fileDescProto, fdArray)
    val proto = protos.filter(p => p.getName() == messageType).head
    fd.findMessageTypeByName(proto.getName())
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
