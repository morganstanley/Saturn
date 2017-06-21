package com.ms.qaTools.saturn.lint

import org.eclipse.emf.ecore.EObject
import com.ms.qaTools.saturn.utils.SaturnEObjectUtils._
import com.ms.qaTools.{toolkit => tk}

case class SaturnLintResult(status: tk.Status, validationResults:Seq[SaturnLintRuleResult], exception: Option[Throwable] = None) extends tk.Result

sealed trait SaturnLintRuleResult {
  def rule: String
  def description: String
  def status: String
  def isOk: Boolean = status == "OK"
  def isWarning: Boolean = status == "WARNING"
  def isError: Boolean = status == "ERROR"
  def level: Int
  def eObjects: Seq[EObject]
  def fullDescription: Seq[String] = Seq(rule, description, eObjects.map(_.eObjectToPath).mkString(","))
}

object SaturnLintRuleResult extends Ordering.ExtraImplicits {
  implicit val saturnLintRuleResultOrdering: Ordering[SaturnLintRuleResult] = Ordering.by(_.level)

  def parse(level: String) = level match {
    case "WARNING" => ResultWarning("DUMMY", "DUMMY", Nil)
    case "ERROR"   => ResultError("DUMMY", "DUMMY", Nil)
    case other     =>
      sys.error(s"Unsupported Saturn Lint fail level: $other, valid options are: WARNING, ERROR")
  }
}

case class ResultOK(rule: String, description: String) extends SaturnLintRuleResult {
  val status = "OK"
  def level = 0
  def eObjects = Nil
}

case class ResultWarning(rule: String, description: String, eObjects: Seq[EObject]) extends SaturnLintRuleResult {
  val status = "WARNING"
  def level = 1
}

case class ResultError(rule: String, description: String, eObjects: Seq[EObject]) extends SaturnLintRuleResult {
  val status = "ERROR"
  def level = 2
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
