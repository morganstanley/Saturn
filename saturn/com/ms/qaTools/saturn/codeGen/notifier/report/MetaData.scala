package com.ms.qaTools.saturn.codeGen.notifier.report

import scala.reflect.runtime.universe._

import org.eclipse.emf.ecore.EObject

import com.ms.qaTools.saturn.codeGen.MetaDataContext
import com.ms.qaTools.saturn.kronus.runtime.ConstellationDecoration

import spray.json._, DefaultJsonProtocol._

case class MetaData(decorationType: ConstellationDecoration.Type,
                    decorationValue: JsValue) extends ConstellationDecoration

object MetaData {
  protected def keys(model: EObject): Option[String => Boolean] = {
    import com.ms.qaTools.saturn._
    model match {
      case _: CometStep         => Some(Set("Database"))
      case _: DataCompareStep   => Some(Set("Left", "Right", "Output"))
      case _: DSConvertStep     => Some("""(Source|Target)_\d+""".r.unapplySeq(_).isDefined)
      case _: MQStep            => Some("""(MQResource|Input_\d+|Output_\d+)""".r.unapplySeq(_).isDefined)
      case _: ProcedureCallStep => Some(Set("ProcName", "Arguments"))
      case _: SoapIOStep        => Some(Set("SoapIOResource", "Input", "Output"))
      case _: SQLStep           => Some("""(DatabaseResource|Input_\d+|Output_\d+)""".r.unapplySeq(_).isDefined)
      case _: Xml2CsvStep       => Some(Set("ConfigFile", "CSVFile", "XMLFile", "NamespaceFile"))
      case _: XmlGenStep        => Some(Set("File", "TemplateFile", "OutputResource", "IsLegacy"))
      case _                    => None
    }
  }

  def fromMetaDataContexts(model: EObject, contexts: collection.Map[String, MetaDataContext]): Option[MetaData] =
    keys(model).map { ks =>
      val json = JsObject("type" -> model.eClass.getName.toJson,
                          "value" -> MetaDataContext.toJson(contexts.filterKeys(ks)))
      apply(ConstellationDecoration.Type("Saturn3.Meta"), json)
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
