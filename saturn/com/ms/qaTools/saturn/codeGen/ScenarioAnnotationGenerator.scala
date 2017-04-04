package com.ms.qaTools.saturn.codeGen
import scala.util.Try
import com.ms.qaTools.codeGen.scala.StringExpr
import com.ms.qaTools.codeGen.scala.TryExpr
import com.ms.qaTools.saturn.annotations.saturnReport.{ SaturnReportConfiguration => MSaturnReportConfiguration }
import com.ms.qaTools.codeGen.scala.ForTryExpr
import com.ms.qaTools.codeGen.scala.ForAssignment
import com.ms.qaTools.codeGen.scala.ScalaExpr
import com.ms.qaTools.saturn.annotations.saturnReport.ResultStatus

object ScenarioAnnotationGenerator {
  val statusGen: ResultStatus => String = {
    case ResultStatus.PASS => "OnPassResultStatus"
    case ResultStatus.FAIL => "OnFailResultStatus"
    case ResultStatus.ANY  => "OnAnyResultStatus"
    case _                 => "OnAnyResultStatus"
  }

  def apply(annotation: MSaturnReportConfiguration,
            isInIteration: Boolean) = {
    Option(annotation) match {
      case Some(a) => for {
        nameTryGen <- {
          Option(if (isInIteration) a.getRepetitionName else a.getName).map(ComplexValueStringGenerator(_))
        }.getOrElse(Try{TryExpr("null")})
        titleTryGen <- {
          Option(if (isInIteration) a.getRepetitionTitle else a.getTitle).map(ComplexValueStringGenerator(_))
        }.getOrElse(Try{TryExpr("null")})
      } yield
        ForTryExpr(Seq(ForAssignment("name", nameTryGen),
                       ForAssignment("title", titleTryGen)),
                   ScalaExpr(s"""ScenarioAnnotation(Option(name),
                                                    Option(title),
                                                    ${statusGen(a.getOnStatus)},
                                                    ${a.isIsScenario},
                                                    ${a.isExpandOnPass},
                                                    Option(${statusGen(a.getExpandOnStatus)}),
                                                    ${a.isHideHeader},
                                                    ${a.isHideRepeatingHeader},
                                                    ${a.isHideContent},
                                                    ${a.isHideRepeatingContent},
                                                    ${a.isShowIterationNo},
                                                    ${a.isIgnored})"""))
      case None => Try(TryExpr(StringExpr("")))
    }
  }
}/*
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
