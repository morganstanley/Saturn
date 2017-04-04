package com.ms.qaTools.toolkit

import java.io.Reader

import com.ms.qaTools.io.Writer
import com.google.protobuf.GeneratedMessage
import com.ms.qaTools.protobuf.PBExtractor
import com.ms.qaTools.io.rowSource.file.LineRowSource
import com.ms.qaTools.io.rowSource.protobuf.ProtoBufRowSource
import com.ms.qaTools._
import scala.util.Try

case class PB2CsvResult(override val status: Status,
  override val exception: Option[Throwable] = None) extends Result

class PB2Csv(pbExtractor: PBExtractor, rowWriter: Writer[Iterator[Seq[String]]]) extends Runnable[PB2CsvResult] {
  require(pbExtractor != null, "Null protobuf extractor in PB2Csv")
  require(rowWriter != null, "Null pb row writer in PB2Csv")

  override def run = Try {
      val count = rowWriter.write(pbExtractor)
      if (count > 0) PB2CsvResult(Passed())
      else throw new Exception("PB Extractor: Unable to extract data.")
  }
}

object PB2Csv {
  val pbPathSplitRegex = "(.*),[\\s]*(.*);".r

  def apply(pbRowSource: ProtoBufRowSource[GeneratedMessage], rowWriter: Writer[Iterator[Seq[String]]], pbMappings: Seq[(String, String)] = Seq()): PB2Csv = {
    val pbExtractor = PBExtractor(pbRowSource, pbMappings)
    new PB2Csv(pbExtractor, rowWriter)

  }

  def apply(pbRowSource: ProtoBufRowSource[GeneratedMessage], rowWriter: Writer[Iterator[Seq[String]]], pbPathMappingsReader: Reader): PB2Csv = {
    apply(pbRowSource, rowWriter, pbPathsFromConfig(pbPathMappingsReader))
  }

  def pbPathsFromConfig(reader: Reader): Seq[(String, String)] = {
    val lf = LineRowSource(reader)
    lf.map { l => val pbPathSplitRegex(xPath, col) = l; (xPath, col) }.toSeq
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
