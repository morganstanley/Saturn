package com.ms.qaTools.toolkit.dsConvert

import java.util.{List => JList}
import org.kohsuke.args4j.Option
import com.ms.qaTools.toolkit.cmdLine.BasicCmdLine
import com.ms.qaTools.toolkit.cmdLine.InputDelimitedFile
import com.ms.qaTools.toolkit.cmdLine.OutputDelimitedFile
import com.ms.qaTools.toolkit.cmdLine.QuotedStringArrayOptionHandler

class DsConvertCmdLine extends BasicCmdLine with InputDelimitedFile with OutputDelimitedFile {
  @Option(name    = "--inFileNames",
          usage   = "merge multiple files into an Excel workbook, one file per sheet",
          handler = classOf[QuotedStringArrayOptionHandler])
  val inFileNames: JList[String] = null

  @Option(name    = "--outWsNames",
          usage   = "specify the output worksheet names, must be the same number and in the same order as --inFileNames",
          handler = classOf[QuotedStringArrayOptionHandler])
  val outWsNames: JList[String] = null

  @Option(name = "--listWsNames", usage = "List all workSheet names instead of converting the dataSet")
  val listWsNames: Boolean = false

  @Option(name = "--ignoreCols", usage = "Ignored column name" , handler = classOf[QuotedStringArrayOptionHandler])
  val ignoreCols: JList[String] = null
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
