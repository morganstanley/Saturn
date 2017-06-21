package com.ms.qaTools.protobuf.mappers

import com.google.protobuf.Message
import com.ms.qaTools.protobuf.getField
import com.google.protobuf.Descriptors.EnumValueDescriptor
import com.google.protobuf.Descriptors.FieldDescriptor
import com.google.protobuf.Descriptors.FieldDescriptor.JavaType

case class PBComparatorMapper(field: Seq[String]) extends PBMessageComparatorMapper {
  def apply(options: (Message, Message)) = {
    val (m1, m2) = options

    def compare(fd: FieldDescriptor, u: Any, v: Any) = (fd.getJavaType, u, v) match {
      case (JavaType.DOUBLE, u: Double,              v: Double)              => u.compareTo(v)
      case (JavaType.ENUM,   u: EnumValueDescriptor, v: EnumValueDescriptor) => u.getIndex.compareTo(v.getIndex)
      case (JavaType.FLOAT,  u: Float,               v: Float)               => u.compareTo(v)
      case (JavaType.INT,    u: Int,                 v: Int)                 => u.compareTo(v)
      case (JavaType.LONG,   u: Long,                v: Long)                => u.compareTo(v)
      case _                                                                 => ???
    }

    field.map{f =>
      val (_, fd1, v1) = getField(f, m1.toBuilder)
      val (_, fd2, v2) = getField(f, m2.toBuilder)
      compare(fd1, v1, v2).ensuring(fd1.getJavaType == fd2.getJavaType)
    }.find(_ != 0).filter(_ > 0).nonEmpty
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
