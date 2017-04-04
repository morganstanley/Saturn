package com.ms.qaTools.toolkit.validate
import com.google.protobuf.Descriptors.Descriptor
import com.google.protobuf.DynamicMessage
import com.google.protobuf.GeneratedMessage
import com.google.protobuf.Message
import com.ms.qaTools.compare.AbstractDiff
import com.ms.qaTools.compare.writer.DiffSetWriter
import com.ms.qaTools.io.rowSource.file.XmlFileRowSource
import com.ms.qaTools.io.rowSource.file.XmlRowSource
import com.ms.qaTools.io.rowSource.json.JSONRowSource
import com.ms.qaTools.io.rowSource.protobuf.ProtoBufRowSource
import com.ms.qaTools.json.JsonValidator
import com.ms.qaTools.protobuf.PbValidator
import com.ms.qaTools.toolkit.Failed
import com.ms.qaTools.toolkit.Passed
import com.ms.qaTools.toolkit.Result
import com.ms.qaTools.toolkit.Runnable
import com.ms.qaTools.toolkit.Status
import com.ms.qaTools.xml.XmlValidator
import com.ms.qaTools.tree.validator.HasIndexedDiffSet

case class ValidateResult(override val status: Status, override val exception: Option[Throwable] = None,
  different: Int, identical: Int, inLeftOnly: Int, inRightOnly: Int, validatePass: Int, validateFail: Int, left: Int, right: Int) extends Result

class Validate[V <: Iterator[AbstractDiff] with HasIndexedDiffSet[_,_]](validator: V, writer: DiffSetWriter, success: V => Boolean = (v: V) => v.failures == 0)
extends Runnable[ValidateResult] {
  def run = util.Try {
    val statuses = List("D", "I", "IL", "IR", "VP", "VF").map(_ -> 0).toMap
    val result = validator.foldLeft(statuses) {(s, d) =>
      writer.writeDiff(d)
      val status = writer.getStatus(d)
      s.updated(status, s(status) + 1)
    }
    val l = result.values.sum - result("IR")
    val r = result.values.sum - result("IL")
    ValidateResult(if(success(validator)) Passed() else Failed(), None, result("D"), result("I"), result("IL"), result("IR"), result("VP"), result("VF"), l, r)
  }
}

object XmlValidate {
  def apply(configFileName: Option[String], expected: XmlRowSource, actual: XmlRowSource, writer: DiffSetWriter) =
    new Validate(XmlValidator(configFileName, expected, actual), writer)
  def apply(configFileName: Option[String], expectedFileName: String, actualFileName: String, writer: DiffSetWriter): Validate[XmlValidator] =
    apply(configFileName, XmlFileRowSource(expectedFileName), XmlFileRowSource(actualFileName), writer)
  def apply(expectedFileName: String, actualFileName: String, writer: DiffSetWriter): Validate[XmlValidator]  =
    apply(None, XmlFileRowSource(expectedFileName), XmlFileRowSource(actualFileName), writer)
}

object JsonValidate {
  def apply(expected: JSONRowSource, actual: JSONRowSource, writer: DiffSetWriter) =
    new Validate(JsonValidator(expected, actual), writer)
}

object PbValidate {
  def apply(configTemplate: Option[DynamicMessage], expected: ProtoBufRowSource[GeneratedMessage], actual: ProtoBufRowSource[GeneratedMessage], descriptor: Descriptor, writer: DiffSetWriter) =
    new Validate(PbValidator(configTemplate, expected, actual, descriptor), writer)
  def apply(expected: ProtoBufRowSource[GeneratedMessage], actual: ProtoBufRowSource[GeneratedMessage], descriptor: Descriptor, writer: DiffSetWriter) =
    new Validate(PbValidator(None, expected, actual, descriptor), writer)
}
/*
COPYRIGHT NOTICE AND DISCLAIMER
Copyright (c) 2009-2016, Contributor

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License, version 3 for more details.

You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
*/
