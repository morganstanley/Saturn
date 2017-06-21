package com.ms.qaTools.saturn.dsl.annotation

import com.ms.qaTools.saturn.kronus.runtime.ConstellationDecoration
import com.ms.qaTools.saturn.kronus.runtime.DynamicAnnotation
import com.ms.qaTools.saturn.runtime.WriteOnlyJsonFormat
import com.ms.qaTools.saturn.util.Util
import com.ms.qaTools.{toolkit => tk}

import spray.json._, DefaultJsonProtocol._

sealed trait OnResultStatus
case object OnPassResultStatus extends OnResultStatus
case object OnFailResultStatus extends OnResultStatus
case object OnAnyResultStatus extends OnResultStatus

object OnResultStatus {
  implicit object JsonFormat extends WriteOnlyJsonFormat[OnResultStatus] {
    def write(obj: OnResultStatus) = obj.toString.toJson
  }
}

object ScenarioAnnotation extends DefaultJsonProtocol {
  object ScenarioType extends ConstellationDecoration.Type("Meta.Scenario")
  implicit val jsonFormat = jsonFormat12(apply)
}

case class ScenarioAnnotation(
  name: Option[String]            = None,
  title: Option[String] = None,
  onStatus: OnResultStatus        = OnAnyResultStatus,
  isScenario: Boolean             = false,
  expandOnPass: Boolean           = false,
  expandOnStatus: Option[OnResultStatus]  = Some(OnFailResultStatus),
  hideHeader: Boolean             = false,
  hideRepeatingHeader: Boolean    = false,
  hideContent: Boolean            = false,
  hideRepeatingContent: Boolean   = false,
  showIterationNo: Boolean        = true,
  ignored: Boolean                = false) extends Annotation with DynamicAnnotation {

  //  rc.appendScenarioAnnotation(this)
  def expandElement(s: tk.Status) =
    //to not break the model...
    if(expandOnPass && s == tk.Passed) true
    else
      expandOnStatus.map{
        case OnPassResultStatus => s == tk.Passed
        case OnFailResultStatus => s == tk.Failed
        case OnAnyResultStatus  => true
      }.getOrElse(false)

  def decorationValue = this.toJson
  override def decorationType = if (isScenario) ScenarioAnnotation.ScenarioType else super.decorationType
}

object ALMMapping {
  implicit val jsonFormat = {
    import DefaultJsonProtocol._
    jsonFormat3(apply)
  }
}

case class ALMMapping(domain: String, project: String, id: String) extends Annotation with DynamicAnnotation {
  override def decorationType = ConstellationDecoration.Type("ALM.Mapping")
  def decorationValue = this.toJson
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
