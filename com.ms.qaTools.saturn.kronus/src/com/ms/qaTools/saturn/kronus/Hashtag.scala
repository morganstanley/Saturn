package com.ms.qaTools.saturn.kronus

import scala.collection.JavaConversions._

sealed abstract class Hashtag

object Hashtag {
  def apply(call: HashtagCall): Hashtag = fromString(call)

  val fromString: PartialFunction[HashtagCall, Hashtag] = { call =>
    call.getMethod.getName match {
      case "Resource"   => ResourceDef
      case "Step"       => StepDef
      case "Implicit"   => Implicit(call.getParameterValues.find(_.getName == "paramType").get.getValue)
      case "Attributes" => Attributes(call.getParameterValues.find(_.getName == "varName").get.getValue)
      case "Closeable"  => Closeable(call.getParameterValues.collect {case pv if pv.getName == "dependsOn" => pv.getValue})
    }
  }
}

abstract class FunctionDefType extends Hashtag
case object ResourceDef extends FunctionDefType
case object StepDef     extends FunctionDefType

case class Implicit(paramType: String) extends Hashtag

case class Attributes(varName: String) extends Hashtag

case class Closeable(dependsOn: Seq[String]) extends Hashtag
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
