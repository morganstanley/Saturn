package com.ms.qaTools.saturn.runtime.runner.module

import scala.util.Try

import com.ms.qaTools.io.DeviceIO
import com.ms.qaTools.io.Output
import com.ms.qaTools.io.Writer
import com.ms.qaTools.io.definition.XmlIO
import com.ms.qaTools.saturn.codeGen.Context
import com.ms.qaTools.saturn.codeGen.Utils.connectTry
import com.ms.qaTools.toolkit.Xml2Csv

case object Xml2CsvRunner {
  def apply(context: Context,
            inputTry: Try[XmlIO],
            outputTry: Try[Output[Writer[Iterator[Seq[String]]]] with Xml2Csv.OutputWithOptions[Iterator[Seq[String]]]],
            configTry: Try[DeviceIO],
            namespaceTry: Option[Try[DeviceIO]] = None,
            isAddHeader: Boolean,
            detachNodes: Boolean,
            nullMarker: String): Try[Xml2Csv] =
    Xml2Csv(inputTry.flatMap(input => connectTry(context, input.input, "Input", false)),
            outputTry.flatMap(output => connectTry(context, output.output(isAddHeader, nullMarker), "Output", false)),
            configTry.flatMap(device => connectTry(context, device.reader, "Config", false)),
            namespaceTry.map(_.flatMap(device => device.reader)),
            detachNodes)
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
