package com.ms.qaTools.toolkit.pluto
import com.ms.qaTools.toolkit.cmdLine.BasicCmdLine
import java.util.ArrayList
import org.kohsuke.args4j.Argument
import org.kohsuke.args4j.{Option => AOption}
import scala.collection.JavaConversions._

class PlutoCmdLine extends BasicCmdLine {
  @AOption(name = "--propertiesFile", aliases = Array("propertiesFile"), usage = "Specify a properties file", required = false)
  val PropertiesFile: String = null

  @Argument(usage = "{ generate_twiki | generate_examples | validate | list | copy }", index = 0, required = true)
  val function: String = null 

  @Argument(usage = "pluto file (generate/validate) OR m/p/r (list/copy)", index = 1, required = true)
  val target: String = null

  @AOption(name = "--output", aliases = Array("-o"), usage = "Output directory (default: /tmp)", required = false)
  val directory: String = "/tmp"

  @AOption(name = "--path", usage = "Directories to append to path", required = false)
  val path: String = null
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
